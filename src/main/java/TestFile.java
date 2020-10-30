import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class TestFile extends PsiFileBase {
    protected TestFile(FileViewProvider viewProvider) {
        super(viewProvider, TesboLanuguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return null;
    }

    public String toString() {
        return "Tesbo File";
    }
}
