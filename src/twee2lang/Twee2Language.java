package twee2lang;

import com.intellij.lang.Language;

public class Twee2Language extends Language {
    public static final Twee2Language INSTANCE = new Twee2Language();
    private Twee2Language() {
        super("Twee2");
    }
}
