package twee2lang.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import twee2lang.Twee2Language;

public class Twee2TokenType extends IElementType {
    public Twee2TokenType(@NotNull @NonNls String debugName) {
        super(debugName, Twee2Language.INSTANCE);
    }

    @Override
    public String toString() {
        return "Twee2TokenType." + super.toString();
    }
}
