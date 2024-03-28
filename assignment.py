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
    Represents a logical formula composed of two elements (symbols or sub-formulas)
    connected by a logical operator (AND represented by ^ when branch is False, OR 
    represented by ∨ when branch is True).
    """
    def __init__(self, first, second, branch=False):
        self.branch = branch  # set to true for OR operator
        self.first = first
        self.second = second

    def __str__(self):
        # Choose the connector based on the branch attribute
        connector = " ∨ " if self.branch else " ^ "
        return f"({self.first}{connector}{self.second})"

    def __eq__(self, other):
        # Implementing equality check can be complex and is not covered here as it wasn't part of the question
        pass
    
class Node:
    def __init__(self, _type=1):
        # 1 -> terminal (variable / symbol)
        # 2 -> non-terminal (formula)
        self._type = _type
        self.value = None
    
    def __str__(self) -> str:
        return self.value
    

# KB -> root, expand
class Tree:
    def __init__(self):
        self.root = None
        self.open_nodes = [] # to expand tree for tableu
    
    def expand(self, rule: Formula):
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
    Constructs a Formula object from an XML element, recursively.
    
    Args:
    - elem: The current XML element to start construction from.
    
    Returns:
    A Formula or Symbol object representing the XML structure.
    """
    # Base case: if the current element is a variable, return a Symbol object
    if elem.tagName == "variable":
        return Symbol(elem.firstChild.data)
    
    # Recursively construct the formula from child elements
    # Assuming each element that's not a block will always have exactly 2 element nodes
    child_elements = [child for child in elem.childNodes if child.nodeType == child.ELEMENT_NODE]
    
    # Check if we have the correct structure (2 child elements)
    if len(child_elements) != 2:
        raise ValueError("Expected exactly two child elements for a formula")
    
    # Construct formulas/symbols from the child elements
    first = construct_formula(child_elements[0])
    second = construct_formula(child_elements[1])
    
    # Determine if the current element represents a branching operation (logical OR)
    is_branch = elem.tagName == "or"
    
    # Create and return the Formula object
    return Formula(first, second, branch=is_branch)

def main():
    dom = minidom.parse("KRR-2024/work/output/PL-01.xml")
    elements = dom.getElementsByTagName('block')
    # print_element(elements[0])
    
    for elem in elements:
        for clause in elem.childNodes:
            if clause.nodeType == clause.ELEMENT_NODE:
                print(construct_formula(clause))
    
    return 
    for elem in elements:
        print_element(elem)
        
if __name__ == "__main__":
    main()