import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

public class TesboLanuguage extends Language {

    public static final TesboLanuguage INSTANCE = new TesboLanuguage();

    protected TesboLanuguage() {
        super("Tesbo");
    }
}
