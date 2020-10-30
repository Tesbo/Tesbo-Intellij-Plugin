import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TestTokenType extends IElementType {
    public TestTokenType(@NotNull String debugName) {
        super(debugName, TesboLanuguage.INSTANCE);
    }

    public String toString() {
        return "TestTokenType." + super.toString();
    }


}
