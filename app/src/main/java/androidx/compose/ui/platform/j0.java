package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.Choreographer;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public static final j0 A;
    public static final j0 B;
    public static final j0 C;
    public static final j0 D;
    public static final j0 E;
    public static final j0 F;
    public static final j0 G;
    public static final j0 H;
    public static final j0 I;
    public static final j0 J;
    public static final j0 K;
    public static final j0 L;
    public static final j0 M;
    public static final j0 N;
    public static final j0 O;
    public static final j0 P;
    public static final j0 Q;
    public static final j0 R;
    public static final j0 S;
    public static final j0 T;
    public static final j0 U;
    public static final j0 V;
    public static final j0 W;
    public static final j0 X;
    public static final j0 Y;
    public static final j0 Z;
    public static final j0 a0;
    public static final j0 b0;
    public static final j0 z;
    public final /* synthetic */ int y;

    static {
        int i = 0;
        z = new j0(i, 0);
        A = new j0(i, 1);
        B = new j0(i, 2);
        C = new j0(i, 3);
        D = new j0(i, 4);
        E = new j0(i, 5);
        F = new j0(i, 6);
        G = new j0(i, 7);
        H = new j0(i, 8);
        I = new j0(i, 9);
        J = new j0(i, 10);
        K = new j0(i, 11);
        L = new j0(i, 12);
        M = new j0(i, 13);
        N = new j0(i, 14);
        O = new j0(i, 15);
        P = new j0(i, 16);
        Q = new j0(i, 17);
        R = new j0(i, 18);
        S = new j0(i, 19);
        T = new j0(i, 20);
        U = new j0(i, 21);
        V = new j0(i, 22);
        W = new j0(i, 23);
        X = new j0(i, 24);
        Y = new j0(i, 25);
        Z = new j0(i, 26);
        a0 = new j0(i, 27);
        b0 = new j0(i, 28);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.y) {
            case 0:
                m0.b("LocalConfiguration");
                throw null;
            case 1:
                m0.b("LocalContext");
                throw null;
            case 2:
                m0.b("LocalImageVectorCache");
                throw null;
            case 3:
                m0.b("LocalResourceIdCache");
                throw null;
            case 4:
                m0.b("LocalView");
                throw null;
            case 5:
                s0 s0Var = new s0(Looper.myLooper() == Looper.getMainLooper() ? Choreographer.getInstance() : (Choreographer) BuildersKt.runBlocking(Dispatchers.getMain(), new androidx.activity.compose.n(2, 1, null)), androidx.datastore.preferences.protobuf.h1.h(Looper.getMainLooper()));
                return s0Var.plus(s0Var.G);
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                l1.b("LocalAutofillManager");
                throw null;
            case 9:
                l1.b("LocalAutofillTree");
                throw null;
            case 10:
                l1.b("LocalClipboard");
                throw null;
            case 11:
                l1.b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                l1.b("LocalDensity");
                throw null;
            case 14:
                l1.b("LocalFocusManager");
                throw null;
            case 15:
                l1.b("LocalFontFamilyResolver");
                throw null;
            case 16:
                l1.b("LocalFontLoader");
                throw null;
            case 17:
                l1.b("LocalGraphicsContext");
                throw null;
            case 18:
                l1.b("LocalHapticFeedback");
                throw null;
            case 19:
                l1.b("LocalInputManager");
                throw null;
            case 20:
                l1.b("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case 22:
                return Boolean.FALSE;
            case 23:
                return null;
            case 24:
                return null;
            case 25:
                l1.b("LocalTextToolbar");
                throw null;
            case 26:
                l1.b("LocalUriHandler");
                throw null;
            case 27:
                l1.b("LocalViewConfiguration");
                throw null;
            default:
                l1.b("LocalWindowInfo");
                throw null;
        }
    }
}
