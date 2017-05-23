package foo.bar;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.CharsetToolkit;
import com.intellij.testFramework.LexerTestCase;
import foo.bar.tcl.lexer.TclLexer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.File;
import java.io.IOException;

@RunWith(JUnit4.class)
public class LexerTest extends LexerTestCase {
    private static final String PATH = "src/test/resources/lexer";

    @Test
    public void comment() {
        doTestInt("comment");
    }

    @Test
    public void full() {
        doTestInt("full");
    }

    @Test
    public void apply() {
        doTestInt("apply");
    }


    private void doTestInt(String testName) {
        try {
            String text = FileUtil.loadFile(new File(PATH + "/" + testName + ".tcl"), CharsetToolkit.UTF8);
            String actual = printTokens(StringUtil.convertLineSeparators(text.trim()), 0);
            assertSameLinesWithFile(new File(PATH + "/" + testName + ".txt").getAbsolutePath(), actual);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected Lexer createLexer() {
        return new TclLexer();
    }

    @Override
    protected String getDirPath() {
        return  PATH;
    }
}
