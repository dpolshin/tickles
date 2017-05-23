package foo.bar.tcl.lexer;

import com.intellij.lexer.LexerBase;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.progress.ProcessCanceledException;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import foo.bar.tcl.util.BufferCharStream;
import org.antlr.runtime.Token;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Atlr Lexer wrapper.
 */
public class TclLexer extends LexerBase {
    private static final Logger LOG = Logger.getInstance(TclLexer.class);

    private Tcl tcl;

    private IElementType myTokenType;
    private CharSequence myText;

    private int myTokenStart;
    private int myTokenEnd;
    private int myBufferEnd;

    private boolean myFailed;


    public TclLexer() {
    }

    @Override
    public void start(@NotNull CharSequence buffer, int startOffset, int endOffset, int initialState) {
        myText = buffer;
        myTokenStart = myTokenEnd = startOffset;
        myBufferEnd = endOffset;
        myTokenType = null;

        tcl = new Tcl(new BufferCharStream(buffer.subSequence(startOffset, endOffset)));
        tcl.reset();
    }

    @Override
    public int getState() {
        return 0;
    }

    @Nullable
    @Override
    public IElementType getTokenType() {
        locateToken();
        return myTokenType;
    }

    @Override
    public int getTokenStart() {
        return myTokenStart;
    }

    @Override
    public int getTokenEnd() {
        locateToken();
        return myTokenEnd;
    }

    @Override
    public void advance() {
        locateToken();
        myTokenType = null;
    }

    @NotNull
    @Override
    public CharSequence getBufferSequence() {
        return myText;
    }

    @Override
    public int getBufferEnd() {
        return myBufferEnd;
    }


    private void locateToken() {
        if (myTokenType != null) return;

        myTokenStart = myTokenEnd;
        if (myFailed) return;

        try {
            Token token = tcl.nextToken();
            //System.out.println(token.getText());
            //System.out.println("type:" + token.getType());

            if (token.getType() == -1) {
                return;
            }

            myTokenType = mapToken(token);
            myTokenEnd = tcl.getCharIndex();
        } catch (ProcessCanceledException e) {
            throw e;
        } catch (Throwable e) {
            myFailed = true;
            myTokenType = TokenType.BAD_CHARACTER;
            myTokenEnd = myBufferEnd;
            LOG.warn(tcl.getClass().getName(), e);
        }
    }


    private IElementType mapToken(Token token) {
        return AntlrTclTokens.map(token);
    }
}
