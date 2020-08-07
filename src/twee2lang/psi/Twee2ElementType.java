package twee2lang.psi;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import twee2lang.Twee2Language;

public class Twee2ElementType extends IElementType {
    public Twee2ElementType(@NotNull @NonNls String debugName) {
    super(debugName, Twee2Language.INSTANCE);
    }
}
