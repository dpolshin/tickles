package foo.bar.tcl.highlight;

import com.intellij.openapi.editor.colors.TextAttributesKey;

import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.*;
import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * Define color scheme.
 */
public class TclHighlightingColors {
    public static final TextAttributesKey TCL_LINE_COMMENT = createTextAttributesKey("TCL_LINE_COMMENT", LINE_COMMENT);
    public static final TextAttributesKey TCL_BLOCK_COMMENT = createTextAttributesKey("TCL_BLOCK_COMMENT", BLOCK_COMMENT);
    public static final TextAttributesKey TCL_KEYWORD = createTextAttributesKey("TCL_KEYWORD", KEYWORD);
    public static final TextAttributesKey TCL_NUMBER = createTextAttributesKey("TCL_NUMBER", NUMBER);
    public static final TextAttributesKey TCL_STRING = createTextAttributesKey("TCL_STRING", STRING);
    public static final TextAttributesKey TCL_BRACES = createTextAttributesKey("TCL_BRACES", BRACES);
    public static final TextAttributesKey TCL_SEMI = createTextAttributesKey("TCL_SEMI", SEMICOLON);
    public static final TextAttributesKey TCL_VAR = createTextAttributesKey("TCL_VAR", LOCAL_VARIABLE);
    public static final TextAttributesKey TCL_ID = createTextAttributesKey("TCL_ID", IDENTIFIER);
    public static final TextAttributesKey TCL_ESQ_SEQ = createTextAttributesKey("TCL_ESQ_SEQ", VALID_STRING_ESCAPE);
    public static final TextAttributesKey TCL_NAMESPACE = createTextAttributesKey("TCL_NAMESPACE", LABEL);
    public static final TextAttributesKey TCL_OPERATOR = createTextAttributesKey("TCL_OPERATOR", KEYWORD);
    public static final TextAttributesKey TCL_EXPONENT = createTextAttributesKey("TCL_EXPONENT", NUMBER);

    //todo: add other colors
}
