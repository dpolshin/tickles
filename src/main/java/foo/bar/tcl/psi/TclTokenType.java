package foo.bar.tcl.psi;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;

public interface TclTokenType extends TokenType {
    IElementType TCL_LINE_COMMENT = new ITclElementType("TCL_LINE_COMMENT");
    IElementType COMMENT = new ITclElementType("COMMENT");
    IElementType VARIABLE = new ITclElementType("VARIABLE");
    IElementType ID = new ITclElementType("ID");
    IElementType WS = new ITclElementType("WS");
    IElementType STRING = new ITclElementType("STRING");
    IElementType ESC_SEQ = new ITclElementType("ESC_SEQ");
    IElementType NAMESPACE = new ITclElementType("NAMESPACE");
    IElementType OPERATOR = new ITclElementType("OPERATOR");
    IElementType EXPONENT = new ITclElementType("EXPONENT");
    IElementType FLOAT = new ITclElementType("FLOAT");
    IElementType HEX_NUMBER = new ITclElementType("HEX_NUMBER");
    IElementType INT = new ITclElementType("INT");
    IElementType TCL_COMMAND = new ITclElementType("TCL_COMMAND");
    IElementType TK_COMMAND = new ITclElementType("TK_COMMAND");
    IElementType ITCL_COMMAND = new ITclElementType("ITCL_COMMAND");
    IElementType LBRACE = new ITclElementType("{");
    IElementType RBRACE = new ITclElementType("}");
    IElementType BRACES = new ITclElementType("BRACE");
    IElementType SEMICOLON = new ITclElementType(";");
    IElementType NEW_LINE = new ITclElementType("NEW_LINE");
}
