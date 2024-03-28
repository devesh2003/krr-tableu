/*
 * A program to convert PL formulas to XML format.
 * published by:
 *    Department of Computer Science and Engineering,
 *    Indian Institute of Technology Madras,
 *    Chennai-36, India.
 *
 * Copyright 2024 Indian Institute of Technology Madras.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is part of the course assignment;
 * you can redistribute it and/or modify it as long as this header is retained.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.
 */
/* Revision History:
 * Date        Author                Description/Change
 * 2024-02-22  S.Baskaran            First release
 */

package krr.main;

import in.ac.iitm.cse.parser.pl.PLLexer;
import in.ac.iitm.cse.parser.pl.PLParser;
import in.ac.iitm.cse.tree.AST;
import in.ac.iitm.cse.tree.ASTAdaptor;
import in.ac.iitm.cse.tree.ASTPrinter;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;

/**
 *
 * @author baskaran
 */
public class ProcessPL extends Process {

    private ProcessPL() { super(); }

    static private ProcessPL instance=null;
    static public ProcessPL getInstance() {
        if (instance == null) {
            instance = new ProcessPL();
        }
        return instance;
    }
    static boolean debug=false;
    public void debug() { debug=true; }

    public void run(String infile) {
        try {
            CharStream input = new ANTLRFileStream(infile);
            PLLexer lex = new PLLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lex);
            PLParser parser = new PLParser(tokens);

            ASTAdaptor adaptor = new ASTAdaptor();
            parser.setTreeAdaptor(adaptor);

            AST t = (AST) parser.cunit().getTree();

            //if (debug) {
            //    System.out.print("AST:\n");
            //    System.out.println(t.toStringTree());
            //}

            ASTPrinter.print(t,parser.getTokenNames(),lex.simpleTokens(),lex.textAttribute(), debug);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
