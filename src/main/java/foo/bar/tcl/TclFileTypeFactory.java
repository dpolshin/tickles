package foo.bar.tcl;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * File type registration.
 */
public class TclFileTypeFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull final FileTypeConsumer consumer) {
        consumer.consume(TclFileType.INSTANCE);
    }
}
