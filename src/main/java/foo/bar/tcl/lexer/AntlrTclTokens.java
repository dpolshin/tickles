package foo.bar.tcl.lexer;

import com.intellij.psi.tree.IElementType;
import org.antlr.runtime.Token;

import java.util.HashMap;
import java.util.Map;

import static foo.bar.tcl.psi.TclTokenType.*;

//todo: generate;
public class AntlrTclTokens {

    private static Map<Integer, IElementType> tokens = new HashMap<>();

/*
        BRACE=4
        COMMENT=5
        ESC_SEQ=6
        EXPONENT=7
        FLOAT=8
        HEX_DIGIT=9
        HEX_ESC=10
        HEX_NUMBER=11
        ID=12
        INT=13
        ITCL_COMMAND=14
        NAMESPACE=15
        NEWLINE=16
        OCTAL_ESC=17
        OPERATOR=18
        SEMICOLON=19
        SQUOTE=20
        STRING=21
        TCL_COMMAND=22
        TK_COMMAND=23
        UNICODE_ESC=24
        VARIABLE=25
        WS=26
*/

    static {
        tokens.put(4, BRACES);
        tokens.put(5, COMMENT);
        tokens.put(6, ESC_SEQ);
        tokens.put(7, EXPONENT);
        tokens.put(8, FLOAT);
        //tokens.put(9, HEX_DIGIT);
        //tokens.put(10, HEX_ESC);
        tokens.put(11, HEX_NUMBER);
        tokens.put(12, ID);
        tokens.put(13, INT);
        tokens.put(14, ITCL_COMMAND);
        tokens.put(15, NAMESPACE);
        tokens.put(16, NEW_LINE);
        //tokens.put(17, OCTAL_ESC);
        tokens.put(18, OPERATOR);
        tokens.put(19, SEMICOLON);
        //tokens.put(20, SQUOTE);
        tokens.put(21, STRING);
        tokens.put(22, TCL_COMMAND);
        tokens.put(23, TK_COMMAND);
        //tokens.put(24, UNICODE_ESC);
        tokens.put(25, VARIABLE);
        tokens.put(26, WHITE_SPACE);
    }


    public static IElementType map(Token token) {
        IElementType type = tokens.get(token.getType());
        return type == null ? STRING : type;
    }
}
