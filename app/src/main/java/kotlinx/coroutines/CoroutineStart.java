package kotlinx.coroutines;

import coil3.g;
import com.google.android.material.shape.e;
import com.google.android.material.shape.k;
import kotlin.coroutines.d;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = k.I(values());

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoroutineStart.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static kotlin.enums.a getEntries() {
        return $ENTRIES;
    }

    @InternalCoroutinesApi
    public final <R, T> void invoke(p pVar, R r, d<? super T> dVar) {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            CancellableKt.startCoroutineCancellable(pVar, r, dVar);
            return;
        }
        if (i == 2) {
            pVar.getClass();
            dVar.getClass();
            e.g(e.b(pVar, r, dVar)).resumeWith(y.a);
        } else if (i == 3) {
            UndispatchedKt.startCoroutineUndispatched(pVar, r, dVar);
        } else {
            if (i == 4) {
                return;
            }
            g.a();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    @InternalCoroutinesApi
    public static /* synthetic */ void isLazy$annotations() {
    }
}
