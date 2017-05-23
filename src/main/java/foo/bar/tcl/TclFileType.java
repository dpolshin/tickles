package foo.bar.tcl;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Main file type associated with Tcl source code.
 */
public class TclFileType extends LanguageFileType {

    @SuppressWarnings("WeakerAccess")
    @NonNls
    public static final String DEFAULT_EXTENSION = "tcl";
    @NonNls
    public static final String DOT_DEFAULT_EXTENSION = ".tcl";
    @SuppressWarnings("WeakerAccess")
    public static final TclFileType INSTANCE = new TclFileType();

    private TclFileType() {
        super(TclLanguage.INSTANCE);
    }

    @Override
    @NotNull
    public String getName() {
        return "Tcl";
    }

    @Override
    @NotNull
    public String getDescription() {
        return "Tcl Source Code";
    }

    @Override
    @NotNull
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override
    public Icon getIcon() {
        return IconLoader.getIcon("/icons/tcl.png");
    }


}
