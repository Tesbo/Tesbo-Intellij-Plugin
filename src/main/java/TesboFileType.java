import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class TesboFileType extends LanguageFileType {

    private TesboFileType() {
        super(TesboLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Simple File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Simple language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "simple";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return TesboICON.FILE;
    }



}
