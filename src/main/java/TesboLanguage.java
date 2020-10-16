import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

public class TesboLanguage extends Language {
    public static final TesboLanguage INSTANCE = new TesboLanguage();

    private TesboLanguage() {
        super("Tesbo");
    }
}
