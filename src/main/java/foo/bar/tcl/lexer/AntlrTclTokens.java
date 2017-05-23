package foo.bar.tcl.lexer;

import com.intellij.psi.tree.IElementType;
import org.antlr.runtime.Token;

import java.util.HashMap;
import java.util.Map;

import static foo.bar.tcl.psi.TclTokenType.*;

public class AntlrTclTokens {

    private static Map<Integer, IElementType> tokens = new HashMap<>();

    static {
        tokens.put(Tcl.BRACE, BRACES);
        tokens.put(Tcl.COMMENT, COMMENT);
        tokens.put(Tcl.ESC_SEQ, ESC_SEQ);
        tokens.put(Tcl.EXPONENT, EXPONENT);
        tokens.put(Tcl.FLOAT, FLOAT);
        //tokens.put(Tcl.HEX_DIGIT, HEX_DIGIT);
        //tokens.put(Tcl.HEX_ESC, HEX_ESC);
        tokens.put(Tcl.HEX_NUMBER, HEX_NUMBER);
        tokens.put(Tcl.ID, ID);
        tokens.put(Tcl.INT, INT);
        tokens.put(Tcl.ITCL_COMMAND, ITCL_COMMAND);
        tokens.put(Tcl.NAMESPACE, NAMESPACE);
        tokens.put(Tcl.NEWLINE, NEW_LINE);
        //tokens.put(Tcl.OCTAL_ESC, OCTAL_ESC);
        tokens.put(Tcl.OPERATOR, OPERATOR);
        tokens.put(Tcl.SEMICOLON, SEMICOLON);
        //tokens.put(Tcl.SQUOTE, SQUOTE);
        tokens.put(Tcl.STRING, STRING);
        tokens.put(Tcl.TCL_COMMAND, TCL_COMMAND);
        tokens.put(Tcl.TK_COMMAND, TK_COMMAND);
        //tokens.put(Tcl.UNICODE_ESC, UNICODE_ESC);
        tokens.put(Tcl.VARIABLE, VARIABLE);
        tokens.put(Tcl.WS, WHITE_SPACE);
    }

    public static IElementType map(Token token) {
        IElementType type = tokens.get(token.getType());
        return type == null ? STRING : type;
    }
}
