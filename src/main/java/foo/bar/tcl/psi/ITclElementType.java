package foo.bar.tcl.psi;

import com.intellij.psi.tree.IElementType;
import foo.bar.tcl.TclLanguage;
import org.jetbrains.annotations.NotNull;

public class ITclElementType extends IElementType {

    protected ITclElementType(@NotNull String debugName) {
        super(debugName, TclLanguage.INSTANCE);
    }
}
