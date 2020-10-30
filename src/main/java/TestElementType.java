import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TestElementType extends IElementType {


    public TestElementType(@NotNull String debugName) {
        super(debugName, TesboLanuguage.INSTANCE);
    }
}
