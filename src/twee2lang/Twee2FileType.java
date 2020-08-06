package twee2lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class Twee2FileType extends LanguageFileType {
    public static final Twee2FileType INSTANCE = new Twee2FileType();

    private Twee2FileType() {
        super(Twee2Language.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Twee2 File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Twee2 language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "twee2";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return Twee2Icons.FILE;
    }
}
