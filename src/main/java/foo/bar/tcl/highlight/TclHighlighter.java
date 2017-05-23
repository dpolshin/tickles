package foo.bar.tcl.highlight;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import foo.bar.tcl.lexer.TclLexer;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static foo.bar.tcl.psi.TclTokenType.*;

/**
 * Syntax highlight.
 * Map IElementType to TextAttributesKey.
 */
public class TclHighlighter extends SyntaxHighlighterBase {
    private static final Map<IElementType, TextAttributesKey> TOKENS;

    static {
        TOKENS = new HashMap<>();
        TOKENS.put(TCL_LINE_COMMENT, TclHighlightingColors.TCL_LINE_COMMENT);
        TOKENS.put(SEMICOLON, TclHighlightingColors.TCL_SEMI);
        TOKENS.put(VARIABLE, TclHighlightingColors.TCL_VAR);
        TOKENS.put(ID, TclHighlightingColors.TCL_ID);
        TOKENS.put(STRING, TclHighlightingColors.TCL_STRING);
        TOKENS.put(ESC_SEQ, TclHighlightingColors.TCL_ESQ_SEQ);
        TOKENS.put(NAMESPACE, TclHighlightingColors.TCL_NAMESPACE);
        TOKENS.put(OPERATOR, TclHighlightingColors.TCL_OPERATOR);
        TOKENS.put(EXPONENT, TclHighlightingColors.TCL_NUMBER);
        TOKENS.put(FLOAT, TclHighlightingColors.TCL_NUMBER);
        TOKENS.put(INT, TclHighlightingColors.TCL_NUMBER);
        TOKENS.put(HEX_NUMBER, TclHighlightingColors.TCL_NUMBER);
        TOKENS.put(TCL_COMMAND, TclHighlightingColors.TCL_KEYWORD);
        TOKENS.put(TK_COMMAND, TclHighlightingColors.TCL_KEYWORD);
        TOKENS.put(ITCL_COMMAND, TclHighlightingColors.TCL_KEYWORD);
        TOKENS.put(BRACES, TclHighlightingColors.TCL_BRACES);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new TclLexer();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return pack(TOKENS.get(tokenType));
    }
}
