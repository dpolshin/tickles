package foo.bar.tcl.util;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;

/**
 * Highjack ANTLRStringStream to use CharSequence as storage.
 */
public class BufferCharStream extends ANTLRStringStream {

    private CharSequence sequence;

    public BufferCharStream(CharSequence sequence) {
        this.sequence = sequence;
        this.n = sequence.length();
    }


    @Override
    public void consume() {
        if (p < n) {
            charPositionInLine++;
            if (sequence.charAt(p) == '\n') {
                line++;
                charPositionInLine = 0;
            }
            p++;
        }
    }

    @Override
    public int LA(int i) {
        if (i == 0) {
            return 0;
        }
        if (i < 0) {
            i++;
            if ((p + i - 1) < 0) {
                return CharStream.EOF;
            }
        }

        if ((p + i - 1) >= n) {
            return CharStream.EOF;
        }
        return sequence.charAt(p + i - 1);
    }

    @Override
    public String substring(int start, int stop) {
        return String.valueOf(sequence.subSequence(start, stop));
    }

    @Override
    public String toString() {
        return String.valueOf(sequence);
    }
}
