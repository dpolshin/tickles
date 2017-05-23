package foo.bar.tcl;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

/**
 * Language registration.
 */
public class TclLanguage extends Language {

    @NotNull
    public static final TclLanguage INSTANCE = new TclLanguage();

    private TclLanguage() {
        super("TCL", "text/x-tcl-source", "text/tcl", "application/x-tcl", "text/x-tcl");
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Tcl";
    }

    @Override
    public boolean isCaseSensitive() {
        return false;
    }
}