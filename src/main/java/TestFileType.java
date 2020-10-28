import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class TestFileType extends LanguageFileType {

    public static final TestFileType INSTANCE = new TestFileType();
    protected TestFileType() {
        super(TesboLanuguage.INSTANCE);
    }

    @Override
    public @NotNull String getName() {
        return "test file";
    }

    @Override
    public @NotNull String getDescription() {
        return "test File Type";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "tests";
    }

    @Override
    public @Nullable Icon getIcon() {
        return TestFileICON.testFile;
    }
}
