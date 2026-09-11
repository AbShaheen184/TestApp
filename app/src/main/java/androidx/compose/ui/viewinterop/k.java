package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.f0;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public static final k A;
    public static final k B;
    public static final k C;
    public static final k D;
    public static final k E;
    public static final k F;
    public static final k z;
    public final /* synthetic */ int y;

    static {
        int i = 2;
        z = new k(i, 0);
        A = new k(i, 1);
        B = new k(i, 2);
        C = new k(i, 3);
        D = new k(i, 4);
        E = new k(i, 5);
        F = new k(i, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i;
        switch (this.y) {
            case 0:
                i.e((f0) obj).setUpdateBlock((kotlin.jvm.functions.l) obj2);
                return y.a;
            case 1:
                i.e((f0) obj).setReleaseBlock((kotlin.jvm.functions.l) obj2);
                return y.a;
            case 2:
                i.e((f0) obj).setModifier((androidx.compose.ui.r) obj2);
                return y.a;
            case 3:
                i.e((f0) obj).setDensity((androidx.compose.ui.unit.c) obj2);
                return y.a;
            case 4:
                i.e((f0) obj).setLifecycleOwner((androidx.lifecycle.v) obj2);
                return y.a;
            case 5:
                i.e((f0) obj).setSavedStateRegistryOwner((androidx.savedstate.g) obj2);
                return y.a;
            default:
                v vVarE = i.e((f0) obj);
                int iOrdinal = ((androidx.compose.ui.unit.m) obj2).ordinal();
                if (iOrdinal != 0) {
                    i = 1;
                    if (iOrdinal != 1) {
                        coil3.g.a();
                        return null;
                    }
                } else {
                    i = 0;
                }
                vVarE.setLayoutDirection(i);
                return y.a;
        }
    }
}
