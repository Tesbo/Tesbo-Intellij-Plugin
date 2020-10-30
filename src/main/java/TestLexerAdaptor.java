import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import org.jetbrains.annotations.NotNull;

public class TestLexerAdaptor extends FlexAdapter {
    public TestLexerAdaptor() {
        super(new TestLexer(null));
    }
}
