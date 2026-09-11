package androidx.datastore.preferences.protobuf;

import android.database.SQLException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.t2;
import androidx.compose.ui.platform.m2;
import androidx.datastore.preferences.protobuf.h1;
import com.app.mlounge.R;
import com.app.mlounge.emulator.LibretroCore;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {
    public static androidx.compose.ui.graphics.vector.f b;
    public static androidx.compose.ui.graphics.vector.f c;
    public static androidx.compose.ui.graphics.vector.f d;
    public static androidx.compose.ui.graphics.vector.f e;
    public static androidx.compose.ui.graphics.vector.f f;
    public static androidx.compose.ui.graphics.vector.f g;
    public static androidx.compose.ui.graphics.vector.f h;
    public static androidx.compose.ui.graphics.vector.f i;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;
    public final /* synthetic */ int a;

    public /* synthetic */ h1(int i2) {
        this.a = i2;
    }

    public static final String A(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f3 = f2 * fPow;
        int i2 = (int) f3;
        if (f3 - i2 >= 0.5f) {
            i2++;
        }
        float f4 = i2 / fPow;
        return iMax > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    public static final androidx.lifecycle.q0 B(kotlin.jvm.internal.e eVar, androidx.lifecycle.w0 w0Var, androidx.lifecycle.s0 s0Var, androidx.lifecycle.viewmodel.c cVar, androidx.compose.runtime.r rVar) {
        androidx.lifecycle.u0 u0VarF;
        if (s0Var != null) {
            androidx.lifecycle.v0 viewModelStore = w0Var.getViewModelStore();
            viewModelStore.getClass();
            cVar.getClass();
            u0VarF = new androidx.lifecycle.u0(viewModelStore, s0Var, cVar);
        } else if (w0Var instanceof androidx.lifecycle.j) {
            androidx.lifecycle.v0 viewModelStore2 = w0Var.getViewModelStore();
            androidx.lifecycle.s0 defaultViewModelProviderFactory = ((androidx.lifecycle.j) w0Var).getDefaultViewModelProviderFactory();
            viewModelStore2.getClass();
            defaultViewModelProviderFactory.getClass();
            cVar.getClass();
            u0VarF = new androidx.lifecycle.u0(viewModelStore2, defaultViewModelProviderFactory, cVar);
        } else {
            u0VarF = com.google.firebase.heartbeatinfo.e.f(w0Var, null, 6);
        }
        return u0VarF.a(eVar);
    }

    public static int C(int i2) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i3 = 0; i3 < 6; i3++) {
            int i4 = iArr[i3];
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i5 == i2) {
                return i4;
            }
        }
        return 1;
    }

    public static final void a(int i2) {
        if (i2 > 0) {
            return;
        }
        net.luminis.tls.engine.impl.c.o("px must be > 0.");
    }

    /* JADX WARN: Code duplicated, block: B:109:0x013b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0143  */
    /* JADX WARN: Code duplicated, block: B:113:0x0148  */
    /* JADX WARN: Code duplicated, block: B:120:0x015f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0169  */
    /* JADX WARN: Code duplicated, block: B:130:0x0189  */
    /* JADX WARN: Code duplicated, block: B:132:0x018d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0191  */
    /* JADX WARN: Code duplicated, block: B:136:0x0195  */
    /* JADX WARN: Code duplicated, block: B:137:0x0198  */
    /* JADX WARN: Code duplicated, block: B:139:0x019c  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:151:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:155:0x022c  */
    /* JADX WARN: Code duplicated, block: B:157:0x0232  */
    /* JADX WARN: Code duplicated, block: B:163:0x0244  */
    /* JADX WARN: Code duplicated, block: B:165:0x024a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0259 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x025b  */
    /* JADX WARN: Code duplicated, block: B:175:0x026c  */
    /* JADX WARN: Code duplicated, block: B:178:0x028d  */
    /* JADX WARN: Code duplicated, block: B:181:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:183:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:189:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:191:0x02da  */
    /* JADX WARN: Code duplicated, block: B:197:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:199:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:205:0x030b  */
    /* JADX WARN: Code duplicated, block: B:207:0x0311  */
    /* JADX WARN: Code duplicated, block: B:213:0x032c  */
    /* JADX WARN: Code duplicated, block: B:215:0x0332  */
    /* JADX WARN: Code duplicated, block: B:221:0x0346  */
    /* JADX WARN: Code duplicated, block: B:223:0x034c  */
    /* JADX WARN: Code duplicated, block: B:229:0x0360  */
    /* JADX WARN: Code duplicated, block: B:231:0x0366  */
    /* JADX WARN: Code duplicated, block: B:237:0x037a  */
    /* JADX WARN: Code duplicated, block: B:239:0x0380  */
    /* JADX WARN: Code duplicated, block: B:245:0x039a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:246:0x039c  */
    /* JADX WARN: Code duplicated, block: B:251:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:253:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:255:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:257:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:259:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:266:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:268:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:270:0x040b  */
    /* JADX WARN: Code duplicated, block: B:272:0x044d  */
    /* JADX WARN: Code duplicated, block: B:275:0x045b  */
    /* JADX WARN: Code duplicated, block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x0169, please report this as an issue */
    public static final void b(final androidx.compose.ui.r rVar, androidx.compose.foundation.lazy.z zVar, final androidx.compose.foundation.layout.m0 m0Var, final boolean z, final androidx.compose.foundation.gestures.l lVar, final boolean z2, final androidx.compose.foundation.n nVar, androidx.compose.ui.d dVar, androidx.compose.foundation.layout.g gVar, androidx.compose.ui.i iVar, androidx.compose.foundation.layout.e eVar, final kotlin.jvm.functions.l lVar2, androidx.compose.runtime.r rVar2, final int i2, final int i3, final int i4) {
        int i5;
        androidx.compose.ui.d dVar2;
        final androidx.compose.foundation.layout.g gVar2;
        int i6;
        boolean z3;
        androidx.compose.foundation.lazy.z zVar2;
        final androidx.compose.ui.i iVar2;
        q1 q1VarT;
        int i7;
        androidx.compose.ui.i iVar3;
        androidx.compose.ui.i iVar4;
        androidx.compose.ui.d dVar3;
        int i8;
        androidx.compose.runtime.y0 y0VarV;
        boolean z4;
        Object objQ;
        Object obj;
        kotlin.reflect.h hVar;
        boolean z5;
        Object objQ2;
        Object objQ3;
        CoroutineScope coroutineScope;
        androidx.compose.ui.graphics.y yVar;
        androidx.compose.foundation.lazy.layout.f0 f0Var;
        boolean zD;
        Object objQ4;
        Object obj2;
        int i9;
        kotlin.reflect.h hVar2;
        androidx.compose.foundation.gestures.k1 k1Var;
        androidx.compose.foundation.gestures.k1 k1Var2;
        androidx.compose.ui.r rVarM;
        boolean zD2;
        Object objQ5;
        rVar2.c0(924924659);
        if ((i2 & 6) == 0) {
            i5 = (rVar2.f(rVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= rVar2.f(zVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= rVar2.f(m0Var) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        int i10 = i2 & 3072;
        int i11 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i10 == 0) {
            i5 |= rVar2.g(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= rVar2.g(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= rVar2.f(lVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= rVar2.g(z2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= rVar2.f(nVar) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= 33554432;
        }
        int i12 = i4 & 512;
        if (i12 != 0) {
            i5 |= 805306368;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            if ((i2 & 805306368) == 0) {
                i5 |= rVar2.f(dVar2) ? 536870912 : 268435456;
            }
        }
        int i13 = i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i13 != 0) {
            i6 = i3 | 6;
            gVar2 = gVar;
        } else {
            gVar2 = gVar;
            if ((i3 & 6) == 0) {
                i6 = i3 | (rVar2.f(gVar2) ? 4 : 2);
            } else {
                i6 = i3;
            }
        }
        int i14 = i5;
        int i15 = i4 & 2048;
        if (i15 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= rVar2.f(iVar) ? 32 : 16;
        }
        int i16 = i6;
        int i17 = i4 & 4096;
        if (i17 == 0) {
            if ((i3 & 384) == 0) {
                i16 |= rVar2.f(eVar) ? LibretroCore.SCREEN_WIDTH : 128;
            }
            if ((i3 & 3072) != 0) {
                if (rVar2.h(lVar2)) {
                    i11 = 2048;
                }
                i16 |= i11;
            }
            if ((i14 & 306783379) == 306783378 || (i16 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (rVar2.T(i14 & 1, z3)) {
                rVar2.Y();
                if ((i2 & 1) != 0 || rVar2.C()) {
                    i7 = i14 & (-234881025);
                    if (i12 != 0) {
                        dVar2 = null;
                    }
                    if (i13 != 0) {
                        gVar2 = null;
                    }
                    if (i15 != 0) {
                        iVar3 = null;
                    } else {
                        iVar3 = iVar;
                    }
                    if (i17 != 0) {
                        iVar4 = iVar3;
                        gVar2 = gVar2;
                        dVar3 = dVar2;
                        eVar = null;
                    } else {
                        iVar4 = iVar3;
                    }
                    rVar2.q();
                    i8 = i7 >> 3;
                    int i18 = i8 & 14;
                    int i19 = ((i16 >> 6) & Token.ASSIGN_MOD) | i18;
                    int i20 = i7;
                    y0VarV = androidx.compose.runtime.s.v(lVar2, rVar2);
                    int i21 = i16;
                    z4 = (((i19 & 14) ^ 6) <= 4 && rVar2.f(zVar)) || (i19 & 6) == 4;
                    objQ = rVar2.Q();
                    obj = androidx.compose.runtime.m.a;
                    if (z4 || objQ == obj) {
                        androidx.compose.foundation.lazy.d dVar4 = new androidx.compose.foundation.lazy.d();
                        dVar4.a = new androidx.compose.runtime.e1(Integer.MAX_VALUE);
                        dVar4.b = new androidx.compose.runtime.e1(Integer.MAX_VALUE);
                        androidx.compose.runtime.f fVar = androidx.compose.runtime.f.B;
                        objQ = new androidx.compose.foundation.lazy.o(0, 0, t2.class, androidx.compose.runtime.s.j(fVar, new androidx.compose.foundation.gestures.g(1, androidx.compose.runtime.s.j(fVar, new androidx.compose.foundation.lazy.n(y0VarV, 0)), zVar, dVar4)), ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;");
                        rVar2.l0(objQ);
                    }
                    hVar = (kotlin.reflect.h) objQ;
                    int i22 = i20 >> 9;
                    int i23 = i18 | (i22 & Token.ASSIGN_MOD);
                    z5 = ((((i23 & Token.ASSIGN_MOD) ^ 48) <= 32 && rVar2.g(z)) || (i23 & 48) == 32) | ((((i23 & 14) ^ 6) <= 4 && rVar2.f(zVar)) || (i23 & 6) == 4);
                    objQ2 = rVar2.Q();
                    if (z5 || objQ2 == obj) {
                        objQ2 = new androidx.compose.foundation.lazy.f(zVar, z);
                        rVar2.l0(objQ2);
                    }
                    androidx.compose.foundation.lazy.layout.q0 q0Var = (androidx.compose.foundation.lazy.layout.q0) objQ2;
                    objQ3 = rVar2.Q();
                    if (objQ3 == obj) {
                        objQ3 = androidx.compose.runtime.j0.f(rVar2);
                        rVar2.l0(objQ3);
                    }
                    coroutineScope = (CoroutineScope) objQ3;
                    yVar = (androidx.compose.ui.graphics.y) rVar2.j(androidx.compose.ui.platform.l1.g);
                    f0Var = ((Boolean) rVar2.j(androidx.compose.ui.platform.l1.v)).booleanValue() ? null : androidx.compose.foundation.lazy.layout.g1.a;
                    int i24 = i21 << 18;
                    int i25 = (i20 & 65520) | (i22 & 3670016) | (i24 & 29360128) | (i24 & 234881024) | ((i21 << 27) & 1879048192);
                    zD = ((((i25 & Token.ASSIGN_MOD) ^ 48) <= 32 && rVar2.f(zVar)) || (i25 & 48) == 32) | ((((i25 & 896) ^ 384) <= 256 && rVar2.f(m0Var)) || (i25 & 384) == 256) | ((((i25 & 7168) ^ 3072) <= 2048 && rVar2.g(false)) || (i25 & 3072) == 2048) | ((((57344 & i25) ^ 24576) <= 16384 && rVar2.g(z)) || (i25 & 24576) == 16384) | rVar2.d(0) | ((((i25 & 3670016) ^ 1572864) <= 1048576 && rVar2.f(dVar3)) || (i25 & 1572864) == 1048576) | ((((i25 & 29360128) ^ 12582912) <= 8388608 && rVar2.f(iVar4)) || (i25 & 12582912) == 8388608) | ((((i25 & 234881024) ^ 100663296) <= 67108864 && rVar2.f(eVar)) || (i25 & 100663296) == 67108864) | ((((i25 & 1879048192) ^ 805306368) <= 536870912 && rVar2.f(gVar2)) || (i25 & 805306368) == 536870912) | rVar2.f(yVar) | rVar2.f(f0Var);
                    objQ4 = rVar2.Q();
                    if (!zD || objQ4 == obj) {
                        obj2 = obj;
                        i9 = 4;
                        Object rVar3 = new androidx.compose.foundation.lazy.r(zVar, z, m0Var, hVar, gVar2, eVar, coroutineScope, yVar, f0Var, dVar3, iVar4);
                        hVar2 = hVar;
                        rVar2.l0(rVar3);
                        objQ4 = rVar3;
                    } else {
                        hVar2 = hVar;
                        obj2 = obj;
                        i9 = 4;
                    }
                    androidx.compose.foundation.lazy.layout.c0 c0Var = (androidx.compose.foundation.lazy.layout.c0) objQ4;
                    if (z) {
                        k1Var = androidx.compose.foundation.gestures.k1.e;
                    } else {
                        k1Var = androidx.compose.foundation.gestures.k1.y;
                    }
                    k1Var2 = k1Var;
                    if (z2) {
                        rVar2.b0(-2077147368);
                        zD2 = ((((i8 & 14) ^ 6) <= i9 && rVar2.f(zVar)) || (i8 & 6) == i9) | rVar2.d(0);
                        objQ5 = rVar2.Q();
                        if (zD2 || objQ5 == obj2) {
                            objQ5 = new androidx.compose.foundation.lazy.g(zVar);
                            rVar2.l0(objQ5);
                        }
                        rVarM = androidx.compose.foundation.lazy.layout.m.m((androidx.compose.foundation.lazy.g) objQ5, zVar.o, k1Var2);
                        rVar2.p(false);
                    } else {
                        rVar2.b0(-2076718545);
                        rVar2.p(false);
                        rVarM = androidx.compose.ui.o.b;
                    }
                    zVar2 = zVar;
                    androidx.compose.foundation.lazy.layout.m.a(hVar2, androidx.compose.foundation.s.q(androidx.compose.foundation.lazy.layout.m.n(rVar.d(zVar.l).d(zVar.m), hVar2, q0Var, k1Var2, z2).d(rVarM).d(zVar.n.i), zVar, k1Var2, nVar, z2, lVar, zVar.g), zVar2.p, c0Var, rVar2, 0);
                    dVar2 = dVar3;
                    iVar2 = iVar4;
                } else {
                    rVar2.W();
                    i7 = i14 & (-234881025);
                    iVar4 = iVar;
                }
                gVar2 = gVar2;
                dVar3 = dVar2;
                rVar2.q();
                i8 = i7 >> 3;
                int i110 = i8 & 14;
                int i111 = ((i16 >> 6) & Token.ASSIGN_MOD) | i110;
                int i26 = i7;
                y0VarV = androidx.compose.runtime.s.v(lVar2, rVar2);
                int i27 = i16;
                if (((i111 & 14) ^ 6) <= 4) {
                }
                objQ = rVar2.Q();
                obj = androidx.compose.runtime.m.a;
                if (z4) {
                    androidx.compose.foundation.lazy.d dVar5 = new androidx.compose.foundation.lazy.d();
                    dVar5.a = new androidx.compose.runtime.e1(Integer.MAX_VALUE);
                    dVar5.b = new androidx.compose.runtime.e1(Integer.MAX_VALUE);
                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.f.B;
                    objQ = new androidx.compose.foundation.lazy.o(0, 0, t2.class, androidx.compose.runtime.s.j(fVar2, new androidx.compose.foundation.gestures.g(1, androidx.compose.runtime.s.j(fVar2, new androidx.compose.foundation.lazy.n(y0VarV, 0)), zVar, dVar5)), ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;");
                    rVar2.l0(objQ);
                } else {
                    androidx.compose.foundation.lazy.d dVar6 = new androidx.compose.foundation.lazy.d();
                    dVar6.a = new androidx.compose.runtime.e1(Integer.MAX_VALUE);
                    dVar6.b = new androidx.compose.runtime.e1(Integer.MAX_VALUE);
                    androidx.compose.runtime.f fVar3 = androidx.compose.runtime.f.B;
                    objQ = new androidx.compose.foundation.lazy.o(0, 0, t2.class, androidx.compose.runtime.s.j(fVar3, new androidx.compose.foundation.gestures.g(1, androidx.compose.runtime.s.j(fVar3, new androidx.compose.foundation.lazy.n(y0VarV, 0)), zVar, dVar6)), ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;");
                    rVar2.l0(objQ);
                }
                hVar = (kotlin.reflect.h) objQ;
                int i28 = i26 >> 9;
                int i29 = i110 | (i28 & Token.ASSIGN_MOD);
                z5 = ((((i29 & Token.ASSIGN_MOD) ^ 48) <= 32 && rVar2.g(z)) || (i29 & 48) == 32) | ((((i29 & 14) ^ 6) <= 4 && rVar2.f(zVar)) || (i29 & 6) == 4);
                objQ2 = rVar2.Q();
                if (z5) {
                    objQ2 = new androidx.compose.foundation.lazy.f(zVar, z);
                    rVar2.l0(objQ2);
                } else {
                    objQ2 = new androidx.compose.foundation.lazy.f(zVar, z);
                    rVar2.l0(objQ2);
                }
                androidx.compose.foundation.lazy.layout.q0 q0Var2 = (androidx.compose.foundation.lazy.layout.q0) objQ2;
                objQ3 = rVar2.Q();
                if (objQ3 == obj) {
                    objQ3 = androidx.compose.runtime.j0.f(rVar2);
                    rVar2.l0(objQ3);
                }
                coroutineScope = (CoroutineScope) objQ3;
                yVar = (androidx.compose.ui.graphics.y) rVar2.j(androidx.compose.ui.platform.l1.g);
                f0Var = ((Boolean) rVar2.j(androidx.compose.ui.platform.l1.v)).booleanValue() ? null : androidx.compose.foundation.lazy.layout.g1.a;
                int i210 = i27 << 18;
                int i211 = (i26 & 65520) | (i28 & 3670016) | (i210 & 29360128) | (i210 & 234881024) | ((i27 << 27) & 1879048192);
                zD = ((((i211 & Token.ASSIGN_MOD) ^ 48) <= 32 && rVar2.f(zVar)) || (i211 & 48) == 32) | ((((i211 & 896) ^ 384) <= 256 && rVar2.f(m0Var)) || (i211 & 384) == 256) | ((((i211 & 7168) ^ 3072) <= 2048 && rVar2.g(false)) || (i211 & 3072) == 2048) | ((((57344 & i211) ^ 24576) <= 16384 && rVar2.g(z)) || (i211 & 24576) == 16384) | rVar2.d(0) | ((((i211 & 3670016) ^ 1572864) <= 1048576 && rVar2.f(dVar3)) || (i211 & 1572864) == 1048576) | ((((i211 & 29360128) ^ 12582912) <= 8388608 && rVar2.f(iVar4)) || (i211 & 12582912) == 8388608) | ((((i211 & 234881024) ^ 100663296) <= 67108864 && rVar2.f(eVar)) || (i211 & 100663296) == 67108864) | ((((i211 & 1879048192) ^ 805306368) <= 536870912 && rVar2.f(gVar2)) || (i211 & 805306368) == 536870912) | rVar2.f(yVar) | rVar2.f(f0Var);
                objQ4 = rVar2.Q();
                if (zD) {
                    obj2 = obj;
                    i9 = 4;
                    Object rVar4 = new androidx.compose.foundation.lazy.r(zVar, z, m0Var, hVar, gVar2, eVar, coroutineScope, yVar, f0Var, dVar3, iVar4);
                    hVar2 = hVar;
                    rVar2.l0(rVar4);
                    objQ4 = rVar4;
                } else {
                    obj2 = obj;
                    i9 = 4;
                    Object rVar5 = new androidx.compose.foundation.lazy.r(zVar, z, m0Var, hVar, gVar2, eVar, coroutineScope, yVar, f0Var, dVar3, iVar4);
                    hVar2 = hVar;
                    rVar2.l0(rVar5);
                    objQ4 = rVar5;
                }
                androidx.compose.foundation.lazy.layout.c0 c0Var2 = (androidx.compose.foundation.lazy.layout.c0) objQ4;
                if (z) {
                    k1Var = androidx.compose.foundation.gestures.k1.e;
                } else {
                    k1Var = androidx.compose.foundation.gestures.k1.y;
                }
                k1Var2 = k1Var;
                if (z2) {
                    rVar2.b0(-2077147368);
                    zD2 = ((((i8 & 14) ^ 6) <= i9 && rVar2.f(zVar)) || (i8 & 6) == i9) | rVar2.d(0);
                    objQ5 = rVar2.Q();
                    if (zD2) {
                        objQ5 = new androidx.compose.foundation.lazy.g(zVar);
                        rVar2.l0(objQ5);
                    } else {
                        objQ5 = new androidx.compose.foundation.lazy.g(zVar);
                        rVar2.l0(objQ5);
                    }
                    rVarM = androidx.compose.foundation.lazy.layout.m.m((androidx.compose.foundation.lazy.g) objQ5, zVar.o, k1Var2);
                    rVar2.p(false);
                } else {
                    rVar2.b0(-2076718545);
                    rVar2.p(false);
                    rVarM = androidx.compose.ui.o.b;
                }
                zVar2 = zVar;
                androidx.compose.foundation.lazy.layout.m.a(hVar2, androidx.compose.foundation.s.q(androidx.compose.foundation.lazy.layout.m.n(rVar.d(zVar.l).d(zVar.m), hVar2, q0Var2, k1Var2, z2).d(rVarM).d(zVar.n.i), zVar, k1Var2, nVar, z2, lVar, zVar.g), zVar2.p, c0Var2, rVar2, 0);
                dVar2 = dVar3;
                iVar2 = iVar4;
            } else {
                zVar2 = zVar;
                rVar2.W();
                iVar2 = iVar;
                eVar = eVar;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                final androidx.compose.foundation.lazy.z zVar3 = zVar2;
                final androidx.compose.ui.d dVar7 = dVar2;
                final androidx.compose.foundation.layout.e eVar2 = eVar;
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.lazy.p
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int iA = androidx.compose.runtime.s.A(i2 | 1);
                        int iA2 = androidx.compose.runtime.s.A(i3);
                        h1.b(rVar, zVar3, m0Var, z, lVar, z2, nVar, dVar7, gVar2, iVar2, eVar2, lVar2, (androidx.compose.runtime.r) obj3, iA, iA2, i4);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i16 |= 384;
        if ((i3 & 3072) != 0) {
            if (rVar2.h(lVar2)) {
                i11 = 2048;
            }
            i16 |= i11;
        }
        if ((i14 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (rVar2.T(i14 & 1, z3)) {
            rVar2.Y();
            if ((i2 & 1) != 0) {
                i7 = i14 & (-234881025);
                if (i12 != 0) {
                    dVar2 = null;
                }
                if (i13 != 0) {
                    gVar2 = null;
                }
                if (i15 != 0) {
                    iVar3 = null;
                } else {
                    iVar3 = iVar;
                }
                if (i17 != 0) {
                    iVar4 = iVar3;
                    gVar2 = gVar2;
                    dVar3 = dVar2;
                    eVar = null;
                } else {
                    iVar4 = iVar3;
                    gVar2 = gVar2;
                    dVar3 = dVar2;
                }
            } else {
                i7 = i14 & (-234881025);
                if (i12 != 0) {
                    dVar2 = null;
                }
                if (i13 != 0) {
                    gVar2 = null;
                }
                if (i15 != 0) {
                    iVar3 = null;
                } else {
                    iVar3 = iVar;
                }
                if (i17 != 0) {
                    iVar4 = iVar3;
                    gVar2 = gVar2;
                    dVar3 = dVar2;
                    eVar = null;
                } else {
                    iVar4 = iVar3;
                    gVar2 = gVar2;
                    dVar3 = dVar2;
                }
            }
            rVar2.q();
            i8 = i7 >> 3;
            int i112 = i8 & 14;
            int i113 = ((i16 >> 6) & Token.ASSIGN_MOD) | i112;
            int i212 = i7;
            y0VarV = androidx.compose.runtime.s.v(lVar2, rVar2);
            int i213 = i16;
            if (((i113 & 14) ^ 6) <= 4) {
            }
            objQ = rVar2.Q();
            obj = androidx.compose.runtime.m.a;
            if (z4) {
                androidx.compose.foundation.lazy.d dVar8 = new androidx.compose.foundation.lazy.d();
                dVar8.a = new androidx.compose.runtime.e1(Integer.MAX_VALUE);
                dVar8.b = new androidx.compose.runtime.e1(Integer.MAX_VALUE);
                androidx.compose.runtime.f fVar4 = androidx.compose.runtime.f.B;
                objQ = new androidx.compose.foundation.lazy.o(0, 0, t2.class, androidx.compose.runtime.s.j(fVar4, new androidx.compose.foundation.gestures.g(1, androidx.compose.runtime.s.j(fVar4, new androidx.compose.foundation.lazy.n(y0VarV, 0)), zVar, dVar8)), ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;");
                rVar2.l0(objQ);
            } else {
                androidx.compose.foundation.lazy.d dVar9 = new androidx.compose.foundation.lazy.d();
                dVar9.a = new androidx.compose.runtime.e1(Integer.MAX_VALUE);
                dVar9.b = new androidx.compose.runtime.e1(Integer.MAX_VALUE);
                androidx.compose.runtime.f fVar5 = androidx.compose.runtime.f.B;
                objQ = new androidx.compose.foundation.lazy.o(0, 0, t2.class, androidx.compose.runtime.s.j(fVar5, new androidx.compose.foundation.gestures.g(1, androidx.compose.runtime.s.j(fVar5, new androidx.compose.foundation.lazy.n(y0VarV, 0)), zVar, dVar9)), ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;");
                rVar2.l0(objQ);
            }
            hVar = (kotlin.reflect.h) objQ;
            int i214 = i212 >> 9;
            int i215 = i112 | (i214 & Token.ASSIGN_MOD);
            z5 = ((((i215 & Token.ASSIGN_MOD) ^ 48) <= 32 && rVar2.g(z)) || (i215 & 48) == 32) | ((((i215 & 14) ^ 6) <= 4 && rVar2.f(zVar)) || (i215 & 6) == 4);
            objQ2 = rVar2.Q();
            if (z5) {
                objQ2 = new androidx.compose.foundation.lazy.f(zVar, z);
                rVar2.l0(objQ2);
            } else {
                objQ2 = new androidx.compose.foundation.lazy.f(zVar, z);
                rVar2.l0(objQ2);
            }
            androidx.compose.foundation.lazy.layout.q0 q0Var3 = (androidx.compose.foundation.lazy.layout.q0) objQ2;
            objQ3 = rVar2.Q();
            if (objQ3 == obj) {
                objQ3 = androidx.compose.runtime.j0.f(rVar2);
                rVar2.l0(objQ3);
            }
            coroutineScope = (CoroutineScope) objQ3;
            yVar = (androidx.compose.ui.graphics.y) rVar2.j(androidx.compose.ui.platform.l1.g);
            f0Var = ((Boolean) rVar2.j(androidx.compose.ui.platform.l1.v)).booleanValue() ? null : androidx.compose.foundation.lazy.layout.g1.a;
            int i216 = i213 << 18;
            int i217 = (i212 & 65520) | (i214 & 3670016) | (i216 & 29360128) | (i216 & 234881024) | ((i213 << 27) & 1879048192);
            zD = ((((i217 & Token.ASSIGN_MOD) ^ 48) <= 32 && rVar2.f(zVar)) || (i217 & 48) == 32) | ((((i217 & 896) ^ 384) <= 256 && rVar2.f(m0Var)) || (i217 & 384) == 256) | ((((i217 & 7168) ^ 3072) <= 2048 && rVar2.g(false)) || (i217 & 3072) == 2048) | ((((57344 & i217) ^ 24576) <= 16384 && rVar2.g(z)) || (i217 & 24576) == 16384) | rVar2.d(0) | ((((i217 & 3670016) ^ 1572864) <= 1048576 && rVar2.f(dVar3)) || (i217 & 1572864) == 1048576) | ((((i217 & 29360128) ^ 12582912) <= 8388608 && rVar2.f(iVar4)) || (i217 & 12582912) == 8388608) | ((((i217 & 234881024) ^ 100663296) <= 67108864 && rVar2.f(eVar)) || (i217 & 100663296) == 67108864) | ((((i217 & 1879048192) ^ 805306368) <= 536870912 && rVar2.f(gVar2)) || (i217 & 805306368) == 536870912) | rVar2.f(yVar) | rVar2.f(f0Var);
            objQ4 = rVar2.Q();
            if (zD) {
                obj2 = obj;
                i9 = 4;
                Object rVar6 = new androidx.compose.foundation.lazy.r(zVar, z, m0Var, hVar, gVar2, eVar, coroutineScope, yVar, f0Var, dVar3, iVar4);
                hVar2 = hVar;
                rVar2.l0(rVar6);
                objQ4 = rVar6;
            } else {
                obj2 = obj;
                i9 = 4;
                Object rVar7 = new androidx.compose.foundation.lazy.r(zVar, z, m0Var, hVar, gVar2, eVar, coroutineScope, yVar, f0Var, dVar3, iVar4);
                hVar2 = hVar;
                rVar2.l0(rVar7);
                objQ4 = rVar7;
            }
            androidx.compose.foundation.lazy.layout.c0 c0Var3 = (androidx.compose.foundation.lazy.layout.c0) objQ4;
            if (z) {
                k1Var = androidx.compose.foundation.gestures.k1.e;
            } else {
                k1Var = androidx.compose.foundation.gestures.k1.y;
            }
            k1Var2 = k1Var;
            if (z2) {
                rVar2.b0(-2077147368);
                zD2 = ((((i8 & 14) ^ 6) <= i9 && rVar2.f(zVar)) || (i8 & 6) == i9) | rVar2.d(0);
                objQ5 = rVar2.Q();
                if (zD2) {
                    objQ5 = new androidx.compose.foundation.lazy.g(zVar);
                    rVar2.l0(objQ5);
                } else {
                    objQ5 = new androidx.compose.foundation.lazy.g(zVar);
                    rVar2.l0(objQ5);
                }
                rVarM = androidx.compose.foundation.lazy.layout.m.m((androidx.compose.foundation.lazy.g) objQ5, zVar.o, k1Var2);
                rVar2.p(false);
            } else {
                rVar2.b0(-2076718545);
                rVar2.p(false);
                rVarM = androidx.compose.ui.o.b;
            }
            zVar2 = zVar;
            androidx.compose.foundation.lazy.layout.m.a(hVar2, androidx.compose.foundation.s.q(androidx.compose.foundation.lazy.layout.m.n(rVar.d(zVar.l).d(zVar.m), hVar2, q0Var3, k1Var2, z2).d(rVarM).d(zVar.n.i), zVar, k1Var2, nVar, z2, lVar, zVar.g), zVar2.p, c0Var3, rVar2, 0);
            dVar2 = dVar3;
            iVar2 = iVar4;
        } else {
            zVar2 = zVar;
            rVar2.W();
            iVar2 = iVar;
            eVar = eVar;
        }
        q1VarT = rVar2.t();
        if (q1VarT != null) {
            final androidx.compose.foundation.lazy.z zVar4 = zVar2;
            final androidx.compose.ui.d dVar10 = dVar2;
            final androidx.compose.foundation.layout.e eVar3 = eVar;
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.lazy.p
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iA = androidx.compose.runtime.s.A(i2 | 1);
                    int iA2 = androidx.compose.runtime.s.A(i3);
                    h1.b(rVar, zVar4, m0Var, z, lVar, z2, nVar, dVar10, gVar2, iVar2, eVar3, lVar2, (androidx.compose.runtime.r) obj3, iA, iA2, i4);
                    return kotlin.y.a;
                }
            };
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r0v53 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v53 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v53 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v53 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v58 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v58 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v17 ??, new type: androidx.compose.runtime.r
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v17 ??, new type: androidx.compose.runtime.r
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v18 ??, new type: androidx.compose.runtime.r
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v18 ??, new type: androidx.compose.runtime.r
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v19 ??, new type: androidx.compose.runtime.r
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v39 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v39 ??, new type: androidx.compose.runtime.r
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v40 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v40 ??, new type: androidx.compose.runtime.r
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v13 ??, new type: androidx.compose.runtime.r
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v14 ??, new type: androidx.compose.runtime.r
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v15 ??, new type: androidx.compose.runtime.r
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v18 ??, new type: androidx.compose.runtime.r
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v53 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void c(androidx.navigation.y r43, androidx.navigation.v r44, androidx.compose.ui.r r45, androidx.compose.ui.e r46, kotlin.jvm.functions.l r47, kotlin.jvm.functions.l r48, kotlin.jvm.functions.l r49, kotlin.jvm.functions.l r50, androidx.compose.runtime.r r51, int r52) {
        /*
            Method dump skipped, instruction units count: 2893
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h1.c(androidx.navigation.y, androidx.navigation.v, androidx.compose.ui.r, androidx.compose.ui.e, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.l, androidx.compose.runtime.r, int):void");
    }

    public static final void d(androidx.navigation.y yVar, String str, androidx.compose.ui.r rVar, androidx.compose.ui.e eVar, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.l lVar3, kotlin.jvm.functions.l lVar4, kotlin.jvm.functions.l lVar5, androidx.compose.runtime.r rVar2, int i2) {
        kotlin.jvm.functions.l lVar6;
        int i3;
        androidx.compose.ui.e eVar2;
        androidx.compose.ui.r rVar3;
        kotlin.jvm.functions.l lVar7;
        kotlin.jvm.functions.l lVar8;
        kotlin.jvm.functions.l lVar9;
        kotlin.jvm.functions.l lVar10;
        kotlin.jvm.functions.l lVar11;
        kotlin.jvm.functions.l lVar12;
        kotlin.jvm.functions.l lVar13;
        androidx.compose.ui.e eVar3;
        androidx.compose.ui.r rVar4;
        rVar2.c0(1840250294);
        int i4 = i2 | (rVar2.h(yVar) ? 4 : 2) | (rVar2.f(str) ? 32 : 16) | 844852608;
        char c2 = rVar2.h(lVar5) ? (char) 4 : (char) 2;
        if ((306783379 & i4) == 306783378 && (c2 & 3) == 2 && rVar2.F()) {
            rVar2.W();
            rVar4 = rVar;
            eVar3 = eVar;
            lVar13 = lVar;
            lVar12 = lVar2;
            lVar11 = lVar3;
            lVar10 = lVar4;
        } else {
            rVar2.Y();
            int i5 = i2 & 1;
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (i5 == 0 || rVar2.C()) {
                androidx.compose.ui.j jVar = androidx.compose.ui.c.e;
                Object objQ = rVar2.Q();
                if (objQ == fVar) {
                    objQ = new androidx.compose.ui.text.y(21);
                    rVar2.l0(objQ);
                }
                kotlin.jvm.functions.l lVar14 = (kotlin.jvm.functions.l) objQ;
                Object objQ2 = rVar2.Q();
                if (objQ2 == fVar) {
                    objQ2 = new androidx.compose.ui.text.y(22);
                    rVar2.l0(objQ2);
                }
                lVar6 = (kotlin.jvm.functions.l) objQ2;
                i3 = i4 & (-264241153);
                eVar2 = jVar;
                rVar3 = androidx.compose.ui.o.b;
                lVar7 = lVar14;
                lVar8 = lVar7;
                lVar9 = lVar6;
            } else {
                rVar2.W();
                rVar3 = rVar;
                lVar6 = lVar2;
                lVar8 = lVar3;
                lVar9 = lVar4;
                i3 = i4 & (-264241153);
                eVar2 = eVar;
                lVar7 = lVar;
            }
            rVar2.q();
            boolean z = ((i3 & Token.ASSIGN_MOD) == 32) | ((c2 & 14) == 4);
            Object objQ3 = rVar2.Q();
            if (z || objQ3 == fVar) {
                androidx.navigation.w wVar = new androidx.navigation.w(yVar.b.t, str);
                lVar5.invoke(wVar);
                objQ3 = wVar.c();
                rVar2.l0(objQ3);
            }
            kotlin.jvm.functions.l lVar15 = lVar9;
            androidx.compose.ui.e eVar4 = eVar2;
            kotlin.jvm.functions.l lVar16 = lVar6;
            c(yVar, (androidx.navigation.v) objQ3, rVar3, eVar4, lVar7, lVar16, lVar8, lVar15, rVar2, (i3 & 8078) | 100884480);
            lVar10 = lVar15;
            lVar11 = lVar8;
            lVar12 = lVar16;
            lVar13 = lVar7;
            eVar3 = eVar4;
            rVar4 = rVar3;
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new com.app.mlounge.ui.screens.search.e(yVar, str, rVar4, eVar3, lVar13, lVar12, lVar11, lVar10, lVar5, i2);
        }
    }

    public static final void e(androidx.collection.o0 o0Var, Object obj, Object obj2) {
        int iF = o0Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : o0Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof androidx.collection.p0) {
                ((androidx.collection.p0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                androidx.collection.p0 p0Var = new androidx.collection.p0();
                p0Var.a(obj3);
                p0Var.a(obj2);
                obj2 = p0Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            o0Var.c[iF] = obj2;
            return;
        }
        int i2 = ~iF;
        o0Var.b[i2] = obj;
        o0Var.c[i2] = obj2;
    }

    public static final void f(View view) {
        view.getClass();
        kotlin.sequences.i iVarG = com.google.android.material.resources.g.g(new androidx.compose.foundation.l(view, null, 1));
        while (iVarG.hasNext()) {
            ArrayList arrayList = p((View) iVarG.next()).a;
            for (int iK = com.google.common.base.c.k(arrayList); -1 < iK; iK--) {
                ((m2) arrayList.get(iK)).a.c();
            }
        }
    }

    public static androidx.collection.o0 g() {
        long[] jArr = androidx.collection.w0.a;
        return new androidx.collection.o0();
    }

    public static Handler h(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return androidx.compose.foundation.text.selection.s0.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            net.luminis.tls.engine.impl.c.k(cause);
            return null;
        }
    }

    public static final androidx.room.coroutines.l i(androidx.room.q qVar, String[] strArr, kotlin.jvm.functions.l lVar) {
        kotlin.k kVar;
        qVar.getClass();
        androidx.room.f fVarD = qVar.d();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        androidx.room.i0 i0Var = fVarD.b;
        i0Var.getClass();
        kotlin.collections.builders.g gVar = new kotlin.collections.builders.g();
        for (String str : strArr2) {
            LinkedHashMap linkedHashMap = i0Var.c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                gVar.addAll(set);
            } else {
                gVar.add(str);
            }
        }
        String[] strArr3 = (String[]) com.google.common.base.i.b(gVar).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = strArr3[i2];
            LinkedHashMap linkedHashMap2 = i0Var.f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                net.luminis.tls.engine.impl.c.o("There is no table with name ".concat(str2));
                kVar = null;
                String[] strArr4 = (String[]) kVar.e;
                int[] iArr2 = (int[]) kVar.y;
                strArr4.getClass();
                iArr2.getClass();
                return new androidx.room.coroutines.l(FlowKt.conflate(FlowKt.flow(new androidx.compose.animation.core.f(i0Var, iArr2, strArr4, (kotlin.coroutines.d) null, 7))), qVar, lVar);
            }
            iArr[i2] = num.intValue();
        }
        kVar = new kotlin.k(strArr3, iArr);
        String[] strArr5 = (String[]) kVar.e;
        int[] iArr3 = (int[]) kVar.y;
        strArr5.getClass();
        iArr3.getClass();
        return new androidx.room.coroutines.l(FlowKt.conflate(FlowKt.flow(new androidx.compose.animation.core.f(i0Var, iArr3, strArr5, (kotlin.coroutines.d) null, 7))), qVar, lVar);
    }

    public static final void l(androidx.sqlite.a aVar, String str) {
        aVar.getClass();
        androidx.sqlite.c cVarU = aVar.U(str);
        try {
            cVarU.Q();
            com.google.common.base.i.c(cVarU, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.google.common.base.i.c(cVarU, th);
                throw th2;
            }
        }
    }

    public static final androidx.compose.ui.graphics.vector.f m() {
        androidx.compose.ui.graphics.vector.f fVar = b;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.ArrowUpward", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
        gVar.o(4.0f, 12.0f);
        gVar.n(1.41f, 1.41f);
        gVar.m(11.0f, 7.83f);
        gVar.r(20.0f);
        gVar.l(2.0f);
        gVar.r(7.83f);
        gVar.n(5.58f, 5.59f);
        gVar.m(20.0f, 12.0f);
        gVar.n(-8.0f, -8.0f);
        gVar.n(-8.0f, 8.0f);
        gVar.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        b = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f n() {
        androidx.compose.ui.graphics.vector.f fVar = d;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.FavoriteBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVarH = androidx.privacysandbox.ads.adservices.java.internal.a.h(16.5f, 3.0f);
        gVarH.h(-1.74f, 0.0f, -3.41f, 0.81f, -4.5f, 2.09f);
        gVarH.g(10.91f, 3.81f, 9.24f, 3.0f, 7.5f, 3.0f);
        gVarH.g(4.42f, 3.0f, 2.0f, 5.42f, 2.0f, 8.5f);
        gVarH.h(0.0f, 3.78f, 3.4f, 6.86f, 8.55f, 11.54f);
        gVarH.m(12.0f, 21.35f);
        gVarH.n(1.45f, -1.32f);
        gVarH.g(18.6f, 15.36f, 22.0f, 12.28f, 22.0f, 8.5f);
        gVarH.g(22.0f, 5.42f, 19.58f, 3.0f, 16.5f, 3.0f);
        gVarH.f();
        gVarH.o(12.1f, 18.55f);
        gVarH.n(-0.1f, 0.1f);
        gVarH.n(-0.1f, -0.1f);
        gVarH.g(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f);
        gVarH.g(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f);
        gVarH.h(1.54f, 0.0f, 3.04f, 0.99f, 3.57f, 2.36f);
        gVarH.l(1.87f);
        gVarH.g(13.46f, 5.99f, 14.96f, 5.0f, 16.5f, 5.0f);
        gVarH.h(2.0f, 0.0f, 3.5f, 1.5f, 3.5f, 3.5f);
        gVarH.h(0.0f, 2.89f, -3.14f, 5.74f, -7.9f, 10.05f);
        gVarH.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarH.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        d = fVarB;
        return fVarB;
    }

    public static final int o(Layout layout, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i2 || lineEnd == i2) {
            if (lineStart == i2) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final androidx.customview.poolingcontainer.a p(View view) {
        androidx.customview.poolingcontainer.a aVar = (androidx.customview.poolingcontainer.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar != null) {
            return aVar;
        }
        androidx.customview.poolingcontainer.a aVar2 = new androidx.customview.poolingcontainer.a();
        view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
        return aVar2;
    }

    public static final long q(double d2) {
        return u((float) d2, 4294967296L);
    }

    public static final long r(int i2) {
        return u(i2, 4294967296L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean s(androidx.compose.ui.input.pointer.m mVar) {
        MotionEvent motionEventA;
        ?? r0 = mVar.a;
        int size = r0.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((androidx.compose.ui.input.pointer.v) r0.get(i2)).i != 2) {
                MotionEvent motionEventA2 = mVar.a();
                if ((motionEventA2 == null || !motionEventA2.isFromSource(8194)) && ((motionEventA = mVar.a()) == null || !motionEventA.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void t(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final long u(float f2, long j2) {
        long jFloatToRawIntBits = j2 | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        androidx.compose.ui.unit.p[] pVarArr = androidx.compose.ui.unit.o.b;
        return jFloatToRawIntBits;
    }

    public static final boolean v(androidx.collection.o0 o0Var, Object obj, Object obj2) {
        Object objG = o0Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof androidx.collection.p0)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            o0Var.k(obj);
            return true;
        }
        androidx.collection.p0 p0Var = (androidx.collection.p0) objG;
        boolean zL = p0Var.l(obj2);
        if (zL && p0Var.g()) {
            o0Var.k(obj);
        }
        return zL;
    }

    public static final void w(androidx.collection.o0 o0Var, Object obj) {
        boolean zG;
        long[] jArr = o0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj2 = o0Var.b[i5];
                        Object obj3 = o0Var.c[i5];
                        if (obj3 instanceof androidx.collection.p0) {
                            androidx.collection.p0 p0Var = (androidx.collection.p0) obj3;
                            p0Var.l(obj);
                            zG = p0Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            o0Var.l(i5);
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public static boolean x(androidx.media3.extractor.k kVar, boolean z) {
        int i2;
        androidx.media3.common.util.w wVar = new androidx.media3.common.util.w(16);
        boolean z2 = true;
        while (true) {
            wVar.J(8);
            if (!kVar.e(wVar.a, 0, 8, true)) {
                break;
            }
            long jB = wVar.B();
            int iM = wVar.m();
            if (jB != 1) {
                i2 = 8;
            } else {
                if (!kVar.e(wVar.a, 8, 8, true)) {
                    break;
                }
                jB = wVar.F();
                i2 = 16;
            }
            long j2 = i2;
            if (jB < j2) {
                break;
            }
            int i3 = (int) (jB - j2);
            if (z2) {
                if (iM != 1718909296 || i3 < 8) {
                    break;
                }
                wVar.J(4);
                kVar.e(wVar.a, 0, 4, false);
                if (wVar.m() != 1751476579) {
                    break;
                }
                if (!z) {
                    return true;
                }
                kVar.a(i3 - 4, false);
                z2 = false;
            } else {
                if (iM == 1836086884) {
                    return true;
                }
                if (i3 != 0) {
                    kVar.a(i3, false);
                }
            }
        }
        return false;
    }

    public static final void y(int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i2);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }

    public static final ExtractedText z(androidx.compose.ui.text.input.x xVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = xVar.a.y;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = xVar.b;
        extractedText.selectionStart = androidx.compose.ui.text.l0.f(j2);
        extractedText.selectionEnd = androidx.compose.ui.text.l0.e(j2);
        extractedText.flags = !kotlin.text.k.U(xVar.a.y, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:2: B:23:0x0055->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012d A[SYNTHETIC] */
    public final String j(byte[] bArr, int i2, int i3) throws x {
        int i4;
        byte b2;
        int i5;
        byte b3;
        byte b4;
        byte b5;
        switch (this.a) {
            case 0:
                if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
                }
                int i6 = i2 + i3;
                char[] cArr = new char[i3];
                int i7 = 0;
                while (i2 < i6) {
                    byte b6 = bArr[i2];
                    if (b6 < 0) {
                        while (i2 < i6) {
                            i4 = i2 + 1;
                            b2 = bArr[i2];
                            if (b2 < 0) {
                                i5 = i7 + 1;
                                cArr[i7] = (char) b2;
                                while (i4 < i6) {
                                    b3 = bArr[i4];
                                    if (b3 >= 0) {
                                        i4++;
                                        cArr[i5] = (char) b3;
                                        i5++;
                                    } else {
                                        i7 = i5;
                                        i2 = i4;
                                    }
                                }
                                i7 = i5;
                                i2 = i4;
                            } else if (b2 < -32) {
                                if (i4 < i6) {
                                    throw x.a();
                                }
                                i2 += 2;
                                byte b7 = bArr[i4];
                                int i8 = i7 + 1;
                                if (b2 >= -62 || coil3.network.g.r(b7)) {
                                    throw x.a();
                                }
                                cArr[i7] = (char) ((b7 & 63) | ((b2 & 31) << 6));
                                i7 = i8;
                            } else {
                                if (b2 >= -16) {
                                    if (i4 < i6 - 2) {
                                        throw x.a();
                                    }
                                    b5 = bArr[i4];
                                    int i9 = i2 + 3;
                                    byte b8 = bArr[i2 + 2];
                                    i2 += 4;
                                    byte b9 = bArr[i9];
                                    int i10 = i7 + 1;
                                    if (!coil3.network.g.r(b5)) {
                                        if ((((b5 + 112) + (b2 << 28)) >> 30) != 0 && !coil3.network.g.r(b8) && !coil3.network.g.r(b9)) {
                                            int i11 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b8 & 63) << 6) | (b9 & 63);
                                            cArr[i7] = (char) ((i11 >>> 10) + 55232);
                                            cArr[i10] = (char) ((i11 & 1023) + 56320);
                                            i7 += 2;
                                        }
                                    }
                                    throw x.a();
                                }
                                if (i4 < i6 - 1) {
                                    throw x.a();
                                }
                                int i12 = i2 + 2;
                                b4 = bArr[i4];
                                i2 += 3;
                                byte b10 = bArr[i12];
                                int i13 = i7 + 1;
                                if (!coil3.network.g.r(b4) || ((b2 == -32 && b4 < -96) || ((b2 == -19 && b4 >= -96) || coil3.network.g.r(b10)))) {
                                    throw x.a();
                                }
                                cArr[i7] = (char) (((b4 & 63) << 6) | ((b2 & 15) << 12) | (b10 & 63));
                                i7 = i13;
                            }
                        }
                        return new String(cArr, 0, i7);
                    }
                    i2++;
                    cArr[i7] = (char) b6;
                    i7++;
                }
                while (i2 < i6) {
                    i4 = i2 + 1;
                    b2 = bArr[i2];
                    if (b2 < 0) {
                        if (b2 < -32) {
                            if (i4 < i6) {
                                throw x.a();
                            }
                            i2 += 2;
                            byte b11 = bArr[i4];
                            int i14 = i7 + 1;
                            if (b2 >= -62) {
                            }
                            throw x.a();
                        }
                        if (b2 >= -16) {
                            if (i4 < i6 - 1) {
                                throw x.a();
                            }
                            int i15 = i2 + 2;
                            b4 = bArr[i4];
                            i2 += 3;
                            byte b12 = bArr[i15];
                            int i16 = i7 + 1;
                            if (coil3.network.g.r(b4)) {
                            }
                            throw x.a();
                        }
                        if (i4 < i6 - 2) {
                            throw x.a();
                        }
                        b5 = bArr[i4];
                        int i17 = i2 + 3;
                        byte b13 = bArr[i2 + 2];
                        i2 += 4;
                        byte b14 = bArr[i17];
                        int i18 = i7 + 1;
                        if (!coil3.network.g.r(b5)) {
                            if ((((b5 + 112) + (b2 << 28)) >> 30) != 0) {
                            }
                        }
                        throw x.a();
                    }
                    i5 = i7 + 1;
                    cArr[i7] = (char) b2;
                    while (i4 < i6) {
                        b3 = bArr[i4];
                        if (b3 >= 0) {
                            i4++;
                            cArr[i5] = (char) b3;
                            i5++;
                        } else {
                            i7 = i5;
                            i2 = i4;
                        }
                    }
                    i7 = i5;
                    i2 = i4;
                }
                return new String(cArr, 0, i7);
            default:
                Charset charset = v.a;
                String str = new String(bArr, i2, i3, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i2, i3 + i2))) {
                    throw x.a();
                }
                return str;
        }
    }

    public final int k(String str, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        char cCharAt;
        long j2;
        char c2;
        long j3;
        long j4;
        char c3;
        int i6;
        char cCharAt2;
        switch (this.a) {
            case 0:
                int length = str.length();
                int i7 = i3 + i2;
                int i8 = 0;
                while (i8 < length && (i5 = i8 + i2) < i7 && (cCharAt = str.charAt(i8)) < 128) {
                    bArr[i5] = (byte) cCharAt;
                    i8++;
                }
                if (i8 == length) {
                    return i2 + length;
                }
                int i9 = i2 + i8;
                while (i8 < length) {
                    char cCharAt3 = str.charAt(i8);
                    if (cCharAt3 < 128 && i9 < i7) {
                        bArr[i9] = (byte) cCharAt3;
                        i9++;
                    } else if (cCharAt3 < 2048 && i9 <= i7 - 2) {
                        int i10 = i9 + 1;
                        bArr[i9] = (byte) ((cCharAt3 >>> 6) | 960);
                        i9 += 2;
                        bArr[i10] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i9 > i7 - 3) {
                            if (i9 > i7 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i4 = i8 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i4)))) {
                                    throw new i1(i8, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i9);
                            }
                            int i11 = i8 + 1;
                            if (i11 != str.length()) {
                                char cCharAt4 = str.charAt(i11);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i9 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i12 = i9 + 3;
                                    bArr[i9 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i9 += 4;
                                    bArr[i12] = (byte) ((codePoint & 63) | 128);
                                    i8 = i11;
                                } else {
                                    i8 = i11;
                                }
                            }
                            throw new i1(i8 - 1, length);
                        }
                        bArr[i9] = (byte) ((cCharAt3 >>> '\f') | LibretroCore.PSP_SCREEN_WIDTH);
                        int i13 = i9 + 2;
                        bArr[i9 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i9 += 3;
                        bArr[i13] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i8++;
                }
                return i9;
            default:
                long j5 = i2;
                long j6 = ((long) i3) + j5;
                int length2 = str.length();
                if (length2 > i3 || bArr.length - i3 < i2) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i2 + i3));
                }
                int i14 = 0;
                while (true) {
                    j2 = 1;
                    c2 = 128;
                    if (i14 < length2 && (cCharAt2 = str.charAt(i14)) < 128) {
                        g1.j(bArr, j5, (byte) cCharAt2);
                        i14++;
                        j5 = 1 + j5;
                    }
                }
                if (i14 == length2) {
                    return (int) j5;
                }
                while (i14 < length2) {
                    char cCharAt5 = str.charAt(i14);
                    if (cCharAt5 < c2 && j5 < j6) {
                        g1.j(bArr, j5, (byte) cCharAt5);
                        c3 = c2;
                        j3 = j2;
                        j4 = j5 + j2;
                    } else if (cCharAt5 >= 2048 || j5 > j6 - 2) {
                        j3 = j2;
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j5 > j6 - 3) {
                            long j7 = j5;
                            if (j7 > j6 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i6 = i14 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i6)))) {
                                    throw new i1(i14, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j7);
                            }
                            int i15 = i14 + 1;
                            if (i15 != length2) {
                                char cCharAt6 = str.charAt(i15);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    g1.j(bArr, j7, (byte) ((codePoint2 >>> 18) | 240));
                                    c3 = 128;
                                    g1.j(bArr, j7 + j3, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    g1.j(bArr, j7 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    g1.j(bArr, j7 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j4 = j7 + 4;
                                    i14 = i15;
                                } else {
                                    i14 = i15;
                                }
                            }
                            throw new i1(i14 - 1, length2);
                        }
                        g1.j(bArr, j5, (byte) ((cCharAt5 >>> '\f') | LibretroCore.PSP_SCREEN_WIDTH));
                        long j8 = j5;
                        g1.j(bArr, j5 + j3, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                        j4 = j8 + 3;
                        g1.j(bArr, j8 + 2, (byte) ((cCharAt5 & '?') | 128));
                        c3 = 128;
                    } else {
                        j3 = j2;
                        g1.j(bArr, j5, (byte) ((cCharAt5 >>> 6) | 960));
                        g1.j(bArr, j5 + j3, (byte) ((cCharAt5 & '?') | c2));
                        j4 = j5 + 2;
                        c3 = c2;
                    }
                    i14++;
                    c2 = c3;
                    j5 = j4;
                    j2 = j3;
                }
                return (int) j5;
        }
    }
}
