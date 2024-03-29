from xml.dom import minidom

# Parser to convert to symbols and formulas

# P,Q,R
class Symbol:
    def __init__(self, value: str):
        self.value = value
    
    def __str__(self):
        return self.value

# P => Q, A => B
class Formula:
    """
    Represents a logical formula, which can be a combination of two formulas
    by a single connective (e.g., A ^ B, A ∨ B, ¬A).
    For unary operations like NOT, the second argument can be None.
    """
    def __init__(self, first, second=None, branch=None):
        # For unary operations, `branch` can indicate the operation type (e.g., NOT)
        self.branch = branch  # True for OR, False for AND, None for unary operations like NOT
        self.first = first
        self.second = second

    def __str__(self):
        if self.second is None:
            if self.branch is None:  # Unary operation NOT
                return f"¬{self.first}"
            else:
                raise ValueError("Invalid configuration for unary operation.")
        else:
            connector = "∨" if self.branch else "^"
            return f"({self.first} {connector} {self.second})"
    
class Node:
    def __init__(self, _type=1):
        # 1 -> terminal (variable / symbol)
        # 2 -> non-terminal (formula)
        self._type = _type
        self.value = None
        self.expanded = False
        self.children = []
    
    def __str__(self) -> str:
        return self.value
    

# KB -> root, expand
class Tree:
    def __init__(self):
        self.root = None
        self.open_nodes = [] # to expand tree for tableu
    
    def expand(self, node: Node ,rule: Formula):
        pass

def print_element(elem, indent=0):
    """
    Recursively prints the name and attributes of an XML element and its children,
    indented according to their depth in the hierarchy.
    
    Args:
    - elem: The current XML element to print.
    - indent: The current indentation level (depth in the tree).
    """
    # Print the current element's tag name and attributes
    
    if elem.attributes:
        for attrName, attrValue in elem.attributes.items():
            print(f" {attrName}='{attrValue}'", end='')
    print()
    
    if elem.firstChild and elem.firstChild.nodeType == elem.TEXT_NODE and elem.tagName == "variable":
        print('  ' * (indent+1) + f"{elem.firstChild.data}", end='')
        return
    else:
        print('  ' * indent + elem.tagName, end='')
        if elem.tagName != "block":
            pass

    
    # Recursively print each child element
    for child in elem.childNodes:
        if child.nodeType == child.ELEMENT_NODE:
            print_element(child, indent + 1)

def construct_formula(elem):
    """
    Constructs a Formula or Symbol object from an XML element, recursively.
    
    Args:
    - elem: The current XML element to start construction from.
    
    Returns:
    A Formula or Symbol object representing the XML structure.
    """
    # Base case: variable
    if elem.tagName == "variable":
        return Symbol(elem.firstChild.data)
    
    # Unary operation: NOT
    if elem.tagName == "not":
        child = next(child for child in elem.childNodes if child.nodeType == child.ELEMENT_NODE)
        return Formula(construct_formula(child), branch=None)
    
    # Binary operations: AND, OR, and others
    child_elements = [child for child in elem.childNodes if child.nodeType == child.ELEMENT_NODE]
    if len(child_elements) == 1:  # Handling unary operation NOT
        return Formula(construct_formula(child_elements[0]), branch=None)
    elif len(child_elements) == 2:
        first = construct_formula(child_elements[0])
        second = construct_formula(child_elements[1])
        if elem.tagName == "implies":
            is_branch = True # treat as AND
            return Formula(Formula(first, branch=None), second, branch=is_branch)
        else:
            is_branch = elem.tagName == "or"
            return Formula(first, second, branch=is_branch)
    else:
        raise ValueError("Unexpected number of child elements in formula construction")

def main():
    dom = minidom.parse("KRR-2024/work/output/PL-01.xml")
    elements = dom.getElementsByTagName('block')
    # print_element(elements[0])
    
    kb = []
    for elem in elements:
        for clause in elem.childNodes:
            if clause.nodeType == clause.ELEMENT_NODE:
                # print(construct_formula(clause))
                kb.append(construct_formula(clause))
                
    for clause in kb:
        print(clause)
    
    return 
    for elem in elements:
        print_element(elem)
        
if __name__ == "__main__":
    main()