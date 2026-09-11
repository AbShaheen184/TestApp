package coil3.network;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Size;
import android.util.SizeF;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.t1;
import androidx.collection.b1;
import androidx.collection.o0;
import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.lazy.c0;
import androidx.compose.foundation.lazy.z;
import androidx.compose.foundation.text.selection.s0;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.q1;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.semantics.t;
import androidx.compose.ui.text.d0;
import androidx.compose.ui.text.l0;
import androidx.datastore.preferences.protobuf.h1;
import androidx.lifecycle.v;
import androidx.media3.common.util.w;
import androidx.navigation.y;
import com.app.mlounge.R;
import com.app.mlounge.emulator.LibretroCore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.Inflater;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okhttp3.b0;
import okhttp3.e0;
import okhttp3.g0;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static androidx.compose.ui.graphics.vector.f a;
    public static androidx.compose.ui.graphics.vector.f b;
    public static androidx.compose.ui.graphics.vector.f c;
    public static androidx.compose.ui.graphics.vector.f d;
    public static androidx.compose.ui.graphics.vector.f e;
    public static androidx.compose.ui.graphics.vector.f f;
    public static androidx.compose.ui.graphics.vector.f g;
    public static androidx.compose.ui.graphics.vector.f h;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;

    public static ActionMode.Callback A(ActionMode.Callback callback) {
        return (!(callback instanceof androidx.core.widget.g) || Build.VERSION.SDK_INT < 26) ? callback : ((androidx.core.widget.g) callback).a;
    }

    public static final long B(long j2, long j3) {
        int iD;
        int iF = l0.f(j2);
        int iE = l0.e(j2);
        if ((l0.f(j3) < l0.e(j2)) && (l0.f(j2) < l0.e(j3))) {
            if ((l0.f(j3) <= l0.f(j2)) && (l0.e(j2) <= l0.e(j3))) {
                iF = l0.f(j3);
                iE = iF;
            } else {
                if ((l0.f(j2) <= l0.f(j3)) && (l0.e(j3) <= l0.e(j2))) {
                    iD = l0.d(j3);
                } else {
                    int iF2 = l0.f(j3);
                    if (iF >= l0.e(j3) || iF2 > iF) {
                        iE = l0.f(j3);
                    } else {
                        iF = l0.f(j3);
                        iD = l0.d(j3);
                    }
                }
                iE -= iD;
            }
        } else if (iE > l0.f(j3)) {
            iF -= l0.d(j3);
            iD = l0.d(j3);
            iE -= iD;
        }
        return d0.b(iF, iE);
    }

    public static final void C(androidx.compose.ui.semantics.p pVar, int i2, androidx.compose.ui.scrollcapture.h hVar) {
        androidx.compose.runtime.collection.b bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.semantics.p[16]);
        List listI = pVar.i(false, false);
        while (true) {
            bVar.d(bVar.z, listI);
            while (true) {
                int i3 = bVar.z;
                if (i3 == 0) {
                    return;
                }
                androidx.compose.ui.semantics.p pVar2 = (androidx.compose.ui.semantics.p) bVar.k(i3 - 1);
                boolean zE = androidx.compose.ui.semantics.s.e(pVar2);
                androidx.compose.ui.semantics.l lVar = pVar2.d;
                o0 o0Var = lVar.e;
                if (!zE && !o0Var.c(t.i)) {
                    d1 d1VarD = pVar2.d();
                    if (d1VarD == null) {
                        throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("Expected semantics node to have a coordinator.");
                    }
                    androidx.compose.ui.unit.k kVarU = androidx.room.r.u(a0.e(d1VarD, true));
                    if (kVarU.a < kVarU.c && kVarU.b < kVarU.d) {
                        Object objG = lVar.e.g(androidx.compose.ui.semantics.k.e);
                        if (objG == null) {
                            objG = null;
                        }
                        kotlin.jvm.functions.p pVar3 = (kotlin.jvm.functions.p) objG;
                        Object objG2 = o0Var.g(t.v);
                        androidx.compose.ui.semantics.i iVar = (androidx.compose.ui.semantics.i) (objG2 != null ? objG2 : null);
                        if (pVar3 == null || iVar == null || ((Number) iVar.b.invoke()).floatValue() <= 0.0f) {
                            listI = pVar2.i(false, false);
                        } else {
                            int i4 = 1 + i2;
                            hVar.invoke(new androidx.compose.ui.scrollcapture.j(pVar2, i4, kVarU, d1VarD));
                            C(pVar2, i4, hVar);
                        }
                    }
                }
            }
        }
    }

    public static ActionMode.Callback D(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof androidx.core.widget.g) || callback == null) ? callback : new androidx.core.widget.g(callback, textView);
    }

    public static int E(int i2) {
        int[] iArr = {1, 2, 3};
        for (int i3 = 0; i3 < 3; i3++) {
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

    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:78:0x0135  */
    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public static final void a(androidx.compose.ui.r rVar, z zVar, m0 m0Var, androidx.compose.foundation.layout.g gVar, androidx.compose.ui.d dVar, androidx.compose.foundation.gestures.l lVar, boolean z, androidx.compose.foundation.n nVar, final kotlin.jvm.functions.l lVar2, androidx.compose.runtime.r rVar2, final int i2, final int i3) {
        androidx.compose.ui.r rVar3;
        int i4;
        z zVarA;
        int i5;
        int i6;
        m0 m0Var2;
        int i7;
        int i8;
        androidx.compose.foundation.layout.g gVar2;
        int i9;
        int i10;
        boolean z2;
        final androidx.compose.ui.d dVar2;
        final androidx.compose.foundation.n nVar2;
        final androidx.compose.ui.r rVar4;
        final z zVar2;
        final m0 m0Var3;
        final androidx.compose.foundation.layout.g gVar3;
        final androidx.compose.foundation.gestures.l lVar3;
        final boolean z3;
        q1 q1VarT;
        androidx.compose.ui.r rVar5;
        m0 m0Var4;
        androidx.compose.foundation.gestures.l lVarS;
        int i11;
        androidx.compose.foundation.n nVarA;
        androidx.compose.foundation.layout.g gVar4;
        androidx.compose.ui.d dVar3;
        m0 m0Var5;
        boolean z4;
        rVar2.c0(53695811);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i4 = i2 | 6;
            rVar3 = rVar;
        } else if ((i2 & 6) == 0) {
            rVar3 = rVar;
            i4 = (rVar2.f(rVar3) ? 4 : 2) | i2;
        } else {
            rVar3 = rVar;
            i4 = i2;
        }
        if ((i3 & 2) == 0) {
            zVarA = zVar;
            int i13 = rVar2.f(zVarA) ? 32 : 16;
            i5 = i4 | i13;
            i6 = i3 & 4;
            if (i6 != 0) {
                if ((i2 & 384) == 0) {
                    m0Var2 = m0Var;
                    if (rVar2.f(m0Var2)) {
                        i7 = LibretroCore.SCREEN_WIDTH;
                    } else {
                        i7 = 128;
                    }
                    i5 |= i7;
                }
                i8 = i5 | 3072;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        gVar2 = gVar;
                        int i14 = rVar2.f(gVar2) ? 16384 : 8192;
                        i8 |= i14;
                    } else {
                        gVar2 = gVar;
                    }
                    i8 |= i14;
                } else {
                    gVar2 = gVar;
                }
                int i15 = i8 | 46858240;
                if (rVar2.h(lVar2)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i10 = i15 | i9;
                if ((306783379 & i10) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rVar2.T(i10 & 1, z2)) {
                    rVar2.Y();
                    if ((i2 & 1) != 0 || rVar2.C()) {
                        if (i12 != 0) {
                            rVar5 = androidx.compose.ui.o.b;
                        } else {
                            rVar5 = rVar3;
                        }
                        if ((i3 & 2) != 0) {
                            i10 &= -113;
                            zVarA = c0.a(0, 0, rVar2, 3);
                        }
                        if (i6 != 0) {
                            float f2 = 0;
                            m0Var4 = new m0(f2, f2, f2, f2);
                        } else {
                            m0Var4 = m0Var2;
                        }
                        if ((i3 & 16) != 0) {
                            i10 &= -57345;
                            gVar2 = androidx.compose.foundation.layout.h.c;
                        }
                        androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
                        lVarS = _COROUTINE.a.s(rVar2);
                        i11 = i10 & (-238551041);
                        nVarA = androidx.compose.foundation.q1.a(rVar2);
                        gVar4 = gVar2;
                        dVar3 = hVar;
                        m0Var5 = m0Var4;
                        z4 = true;
                    } else {
                        rVar2.W();
                        if ((i3 & 2) != 0) {
                            i10 &= -113;
                        }
                        if ((i3 & 16) != 0) {
                            i10 &= -57345;
                        }
                        int i16 = i10 & (-238551041);
                        z4 = z;
                        nVarA = nVar;
                        i11 = i16;
                        rVar5 = rVar3;
                        m0Var5 = m0Var2;
                        gVar4 = gVar2;
                        dVar3 = dVar;
                        lVarS = lVar;
                    }
                    rVar2.q();
                    androidx.compose.ui.r rVar6 = rVar5;
                    z zVar3 = zVarA;
                    androidx.compose.foundation.gestures.l lVar4 = lVarS;
                    androidx.compose.foundation.n nVar3 = nVarA;
                    h1.b(rVar6, zVar3, m0Var5, true, lVar4, z4, nVar3, dVar3, gVar4, null, null, lVar2, rVar2, 806882304 | (i11 & 14) | 24576 | (i11 & Token.ASSIGN_MOD) | (i11 & 896), ((i11 >> 12) & 14) | ((i11 >> 18) & 7168), 6400);
                    lVar3 = lVar4;
                    gVar3 = gVar4;
                    nVar2 = nVar3;
                    androidx.compose.ui.d dVar4 = dVar3;
                    z3 = z4;
                    dVar2 = dVar4;
                    m0Var3 = m0Var5;
                    zVar2 = zVar3;
                    rVar4 = rVar6;
                } else {
                    rVar2.W();
                    dVar2 = dVar;
                    nVar2 = nVar;
                    rVar4 = rVar3;
                    zVar2 = zVarA;
                    m0Var3 = m0Var2;
                    gVar3 = gVar2;
                    lVar3 = lVar;
                    z3 = z;
                }
                q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.lazy.b
                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            coil3.network.g.a(rVar4, zVar2, m0Var3, gVar3, dVar2, lVar3, z3, nVar2, lVar2, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i2 | 1), i3);
                            return kotlin.y.a;
                        }
                    };
                }
            }
            i5 |= 384;
            m0Var2 = m0Var;
            i8 = i5 | 3072;
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    gVar2 = gVar;
                    if (rVar2.f(gVar2)) {
                    }
                    i8 |= i14;
                } else {
                    gVar2 = gVar;
                }
                i8 |= i14;
            } else {
                gVar2 = gVar;
            }
            int i17 = i8 | 46858240;
            if (rVar2.h(lVar2)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i10 = i17 | i9;
            if ((306783379 & i10) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (rVar2.T(i10 & 1, z2)) {
                rVar2.Y();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        rVar5 = androidx.compose.ui.o.b;
                    } else {
                        rVar5 = rVar3;
                    }
                    if ((i3 & 2) != 0) {
                        i10 &= -113;
                        zVarA = c0.a(0, 0, rVar2, 3);
                    }
                    if (i6 != 0) {
                        float f3 = 0;
                        m0Var4 = new m0(f3, f3, f3, f3);
                    } else {
                        m0Var4 = m0Var2;
                    }
                    if ((i3 & 16) != 0) {
                        i10 &= -57345;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    androidx.compose.ui.h hVar2 = androidx.compose.ui.c.J;
                    lVarS = _COROUTINE.a.s(rVar2);
                    i11 = i10 & (-238551041);
                    nVarA = androidx.compose.foundation.q1.a(rVar2);
                    gVar4 = gVar2;
                    dVar3 = hVar2;
                    m0Var5 = m0Var4;
                    z4 = true;
                } else {
                    if (i12 != 0) {
                        rVar5 = androidx.compose.ui.o.b;
                    } else {
                        rVar5 = rVar3;
                    }
                    if ((i3 & 2) != 0) {
                        i10 &= -113;
                        zVarA = c0.a(0, 0, rVar2, 3);
                    }
                    if (i6 != 0) {
                        float f4 = 0;
                        m0Var4 = new m0(f4, f4, f4, f4);
                    } else {
                        m0Var4 = m0Var2;
                    }
                    if ((i3 & 16) != 0) {
                        i10 &= -57345;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    androidx.compose.ui.h hVar3 = androidx.compose.ui.c.J;
                    lVarS = _COROUTINE.a.s(rVar2);
                    i11 = i10 & (-238551041);
                    nVarA = androidx.compose.foundation.q1.a(rVar2);
                    gVar4 = gVar2;
                    dVar3 = hVar3;
                    m0Var5 = m0Var4;
                    z4 = true;
                }
                rVar2.q();
                androidx.compose.ui.r rVar7 = rVar5;
                z zVar4 = zVarA;
                androidx.compose.foundation.gestures.l lVar5 = lVarS;
                androidx.compose.foundation.n nVar4 = nVarA;
                h1.b(rVar7, zVar4, m0Var5, true, lVar5, z4, nVar4, dVar3, gVar4, null, null, lVar2, rVar2, 806882304 | (i11 & 14) | 24576 | (i11 & Token.ASSIGN_MOD) | (i11 & 896), ((i11 >> 12) & 14) | ((i11 >> 18) & 7168), 6400);
                lVar3 = lVar5;
                gVar3 = gVar4;
                nVar2 = nVar4;
                androidx.compose.ui.d dVar5 = dVar3;
                z3 = z4;
                dVar2 = dVar5;
                m0Var3 = m0Var5;
                zVar2 = zVar4;
                rVar4 = rVar7;
            } else {
                rVar2.W();
                dVar2 = dVar;
                nVar2 = nVar;
                rVar4 = rVar3;
                zVar2 = zVarA;
                m0Var3 = m0Var2;
                gVar3 = gVar2;
                lVar3 = lVar;
                z3 = z;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.lazy.b
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        coil3.network.g.a(rVar4, zVar2, m0Var3, gVar3, dVar2, lVar3, z3, nVar2, lVar2, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i2 | 1), i3);
                        return kotlin.y.a;
                    }
                };
            }
        }
        zVarA = zVar;
        i5 = i4 | i13;
        i6 = i3 & 4;
        if (i6 != 0) {
            if ((i2 & 384) == 0) {
                m0Var2 = m0Var;
                if (rVar2.f(m0Var2)) {
                    i7 = LibretroCore.SCREEN_WIDTH;
                } else {
                    i7 = 128;
                }
                i5 |= i7;
            }
            i8 = i5 | 3072;
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    gVar2 = gVar;
                    if (rVar2.f(gVar2)) {
                    }
                    i8 |= i14;
                } else {
                    gVar2 = gVar;
                }
                i8 |= i14;
            } else {
                gVar2 = gVar;
            }
            int i18 = i8 | 46858240;
            if (rVar2.h(lVar2)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i10 = i18 | i9;
            if ((306783379 & i10) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (rVar2.T(i10 & 1, z2)) {
                rVar2.Y();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        rVar5 = androidx.compose.ui.o.b;
                    } else {
                        rVar5 = rVar3;
                    }
                    if ((i3 & 2) != 0) {
                        i10 &= -113;
                        zVarA = c0.a(0, 0, rVar2, 3);
                    }
                    if (i6 != 0) {
                        float f5 = 0;
                        m0Var4 = new m0(f5, f5, f5, f5);
                    } else {
                        m0Var4 = m0Var2;
                    }
                    if ((i3 & 16) != 0) {
                        i10 &= -57345;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    androidx.compose.ui.h hVar4 = androidx.compose.ui.c.J;
                    lVarS = _COROUTINE.a.s(rVar2);
                    i11 = i10 & (-238551041);
                    nVarA = androidx.compose.foundation.q1.a(rVar2);
                    gVar4 = gVar2;
                    dVar3 = hVar4;
                    m0Var5 = m0Var4;
                    z4 = true;
                } else {
                    if (i12 != 0) {
                        rVar5 = androidx.compose.ui.o.b;
                    } else {
                        rVar5 = rVar3;
                    }
                    if ((i3 & 2) != 0) {
                        i10 &= -113;
                        zVarA = c0.a(0, 0, rVar2, 3);
                    }
                    if (i6 != 0) {
                        float f6 = 0;
                        m0Var4 = new m0(f6, f6, f6, f6);
                    } else {
                        m0Var4 = m0Var2;
                    }
                    if ((i3 & 16) != 0) {
                        i10 &= -57345;
                        gVar2 = androidx.compose.foundation.layout.h.c;
                    }
                    androidx.compose.ui.h hVar5 = androidx.compose.ui.c.J;
                    lVarS = _COROUTINE.a.s(rVar2);
                    i11 = i10 & (-238551041);
                    nVarA = androidx.compose.foundation.q1.a(rVar2);
                    gVar4 = gVar2;
                    dVar3 = hVar5;
                    m0Var5 = m0Var4;
                    z4 = true;
                }
                rVar2.q();
                androidx.compose.ui.r rVar8 = rVar5;
                z zVar5 = zVarA;
                androidx.compose.foundation.gestures.l lVar6 = lVarS;
                androidx.compose.foundation.n nVar5 = nVarA;
                h1.b(rVar8, zVar5, m0Var5, true, lVar6, z4, nVar5, dVar3, gVar4, null, null, lVar2, rVar2, 806882304 | (i11 & 14) | 24576 | (i11 & Token.ASSIGN_MOD) | (i11 & 896), ((i11 >> 12) & 14) | ((i11 >> 18) & 7168), 6400);
                lVar3 = lVar6;
                gVar3 = gVar4;
                nVar2 = nVar5;
                androidx.compose.ui.d dVar6 = dVar3;
                z3 = z4;
                dVar2 = dVar6;
                m0Var3 = m0Var5;
                zVar2 = zVar5;
                rVar4 = rVar8;
            } else {
                rVar2.W();
                dVar2 = dVar;
                nVar2 = nVar;
                rVar4 = rVar3;
                zVar2 = zVarA;
                m0Var3 = m0Var2;
                gVar3 = gVar2;
                lVar3 = lVar;
                z3 = z;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.lazy.b
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        coil3.network.g.a(rVar4, zVar2, m0Var3, gVar3, dVar2, lVar3, z3, nVar2, lVar2, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i2 | 1), i3);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i5 |= 384;
        m0Var2 = m0Var;
        i8 = i5 | 3072;
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                gVar2 = gVar;
                if (rVar2.f(gVar2)) {
                }
                i8 |= i14;
            } else {
                gVar2 = gVar;
            }
            i8 |= i14;
        } else {
            gVar2 = gVar;
        }
        int i19 = i8 | 46858240;
        if (rVar2.h(lVar2)) {
            i9 = 536870912;
        } else {
            i9 = 268435456;
        }
        i10 = i19 | i9;
        if ((306783379 & i10) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rVar2.T(i10 & 1, z2)) {
            rVar2.Y();
            if ((i2 & 1) != 0) {
                if (i12 != 0) {
                    rVar5 = androidx.compose.ui.o.b;
                } else {
                    rVar5 = rVar3;
                }
                if ((i3 & 2) != 0) {
                    i10 &= -113;
                    zVarA = c0.a(0, 0, rVar2, 3);
                }
                if (i6 != 0) {
                    float f7 = 0;
                    m0Var4 = new m0(f7, f7, f7, f7);
                } else {
                    m0Var4 = m0Var2;
                }
                if ((i3 & 16) != 0) {
                    i10 &= -57345;
                    gVar2 = androidx.compose.foundation.layout.h.c;
                }
                androidx.compose.ui.h hVar6 = androidx.compose.ui.c.J;
                lVarS = _COROUTINE.a.s(rVar2);
                i11 = i10 & (-238551041);
                nVarA = androidx.compose.foundation.q1.a(rVar2);
                gVar4 = gVar2;
                dVar3 = hVar6;
                m0Var5 = m0Var4;
                z4 = true;
            } else {
                if (i12 != 0) {
                    rVar5 = androidx.compose.ui.o.b;
                } else {
                    rVar5 = rVar3;
                }
                if ((i3 & 2) != 0) {
                    i10 &= -113;
                    zVarA = c0.a(0, 0, rVar2, 3);
                }
                if (i6 != 0) {
                    float f8 = 0;
                    m0Var4 = new m0(f8, f8, f8, f8);
                } else {
                    m0Var4 = m0Var2;
                }
                if ((i3 & 16) != 0) {
                    i10 &= -57345;
                    gVar2 = androidx.compose.foundation.layout.h.c;
                }
                androidx.compose.ui.h hVar7 = androidx.compose.ui.c.J;
                lVarS = _COROUTINE.a.s(rVar2);
                i11 = i10 & (-238551041);
                nVarA = androidx.compose.foundation.q1.a(rVar2);
                gVar4 = gVar2;
                dVar3 = hVar7;
                m0Var5 = m0Var4;
                z4 = true;
            }
            rVar2.q();
            androidx.compose.ui.r rVar9 = rVar5;
            z zVar6 = zVarA;
            androidx.compose.foundation.gestures.l lVar7 = lVarS;
            androidx.compose.foundation.n nVar6 = nVarA;
            h1.b(rVar9, zVar6, m0Var5, true, lVar7, z4, nVar6, dVar3, gVar4, null, null, lVar2, rVar2, 806882304 | (i11 & 14) | 24576 | (i11 & Token.ASSIGN_MOD) | (i11 & 896), ((i11 >> 12) & 14) | ((i11 >> 18) & 7168), 6400);
            lVar3 = lVar7;
            gVar3 = gVar4;
            nVar2 = nVar6;
            androidx.compose.ui.d dVar7 = dVar3;
            z3 = z4;
            dVar2 = dVar7;
            m0Var3 = m0Var5;
            zVar2 = zVar6;
            rVar4 = rVar9;
        } else {
            rVar2.W();
            dVar2 = dVar;
            nVar2 = nVar;
            rVar4 = rVar3;
            zVar2 = zVarA;
            m0Var3 = m0Var2;
            gVar3 = gVar2;
            lVar3 = lVar;
            z3 = z;
        }
        q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.lazy.b
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    coil3.network.g.a(rVar4, zVar2, m0Var3, gVar3, dVar2, lVar3, z3, nVar2, lVar2, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i2 | 1), i3);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(androidx.compose.ui.r rVar, z zVar, final m0 m0Var, final androidx.compose.foundation.layout.e eVar, androidx.compose.ui.i iVar, androidx.compose.foundation.gestures.l lVar, boolean z, androidx.compose.foundation.n nVar, final kotlin.jvm.functions.l lVar2, androidx.compose.runtime.r rVar2, final int i2) {
        final androidx.compose.ui.r rVar3;
        final z zVar2;
        final androidx.compose.ui.i iVar2;
        final androidx.compose.foundation.gestures.l lVar3;
        final boolean z2;
        final androidx.compose.foundation.n nVar2;
        z zVarA;
        androidx.compose.foundation.n nVarA;
        int i3;
        androidx.compose.ui.r rVar4;
        boolean z3;
        androidx.compose.foundation.gestures.l lVar4;
        androidx.compose.ui.i iVar3;
        rVar2.c0(-1884325601);
        int i4 = i2 | 46861334 | (rVar2.h(lVar2) ? 536870912 : 268435456);
        if (rVar2.T(i4 & 1, (306783379 & i4) != 306783378)) {
            rVar2.Y();
            if ((i2 & 1) == 0 || rVar2.C()) {
                zVarA = c0.a(0, 0, rVar2, 3);
                androidx.compose.ui.i iVar4 = androidx.compose.ui.c.G;
                androidx.compose.foundation.gestures.l lVarS = _COROUTINE.a.s(rVar2);
                nVarA = androidx.compose.foundation.q1.a(rVar2);
                i3 = i4 & (-238551153);
                rVar4 = androidx.compose.ui.o.b;
                z3 = true;
                lVar4 = lVarS;
                iVar3 = iVar4;
            } else {
                rVar2.W();
                zVarA = zVar;
                iVar3 = iVar;
                lVar4 = lVar;
                z3 = z;
                nVarA = nVar;
                i3 = i4 & (-238551153);
                rVar4 = rVar;
            }
            rVar2.q();
            h1.b(rVar4, zVarA, m0Var, false, lVar4, z3, nVarA, null, null, iVar3, eVar, lVar2, rVar2, 1600902, 432 | ((i3 >> 18) & 7168), 1792);
            androidx.compose.ui.i iVar5 = iVar3;
            nVar2 = nVarA;
            iVar2 = iVar5;
            rVar3 = rVar4;
            zVar2 = zVarA;
            lVar3 = lVar4;
            z2 = z3;
        } else {
            rVar2.W();
            rVar3 = rVar;
            zVar2 = zVar;
            iVar2 = iVar;
            lVar3 = lVar;
            z2 = z;
            nVar2 = nVar;
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p(zVar2, m0Var, eVar, iVar2, lVar3, z2, nVar2, lVar2, i2) { // from class: androidx.compose.foundation.lazy.c
                public final /* synthetic */ androidx.compose.foundation.layout.e A;
                public final /* synthetic */ androidx.compose.ui.i B;
                public final /* synthetic */ androidx.compose.foundation.gestures.l C;
                public final /* synthetic */ boolean D;
                public final /* synthetic */ androidx.compose.foundation.n E;
                public final /* synthetic */ kotlin.jvm.functions.l F;
                public final /* synthetic */ z y;
                public final /* synthetic */ m0 z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.s.A(24961);
                    coil3.network.g.b(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, (androidx.compose.runtime.r) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void c(Boolean bool, Object obj, v vVar, kotlin.jvm.functions.l lVar, androidx.compose.runtime.r rVar, int i2) {
        int i3;
        rVar.c0(696924721);
        if ((i2 & 6) == 0) {
            i3 = (rVar.h(bool) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= rVar.h(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= rVar.h(lVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (rVar.T(i3 & 1, (i3 & 1171) != 1170)) {
            rVar.Y();
            if ((i2 & 1) == 0 || rVar.C()) {
                vVar = (v) rVar.j(androidx.lifecycle.compose.c.a);
            } else {
                rVar.W();
            }
            int i4 = i3 & (-897);
            rVar.q();
            boolean zF = rVar.f(bool) | rVar.f(obj) | rVar.f(vVar);
            Object objQ = rVar.Q();
            if (zF || objQ == androidx.compose.runtime.m.a) {
                objQ = new androidx.lifecycle.compose.b(vVar.getLifecycle());
                rVar.l0(objQ);
            }
            d(vVar, (androidx.lifecycle.compose.b) objQ, lVar, rVar, (i4 >> 3) & 896);
        } else {
            rVar.W();
        }
        v vVar2 = vVar;
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.material3.d(bool, obj, vVar2, lVar, i2, 2);
        }
    }

    public static final void d(v vVar, androidx.lifecycle.compose.b bVar, kotlin.jvm.functions.l lVar, androidx.compose.runtime.r rVar, int i2) {
        int i3;
        rVar.c0(228371534);
        if ((i2 & 6) == 0) {
            i3 = (rVar.h(vVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= rVar.h(bVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= rVar.h(lVar) ? 256 : 128;
        }
        if (rVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            boolean zH = rVar.h(bVar) | ((i3 & 896) == 256) | rVar.h(vVar);
            Object objQ = rVar.Q();
            if (zH || objQ == androidx.compose.runtime.m.a) {
                objQ = new androidx.compose.animation.core.a(12, vVar, bVar, lVar);
                rVar.l0(objQ);
            }
            j0.a(vVar, bVar, (kotlin.jvm.functions.l) objQ, rVar);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.j(vVar, bVar, lVar, i2, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[LOOP:0: B:19:0x0049->B:23:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(androidx.compose.ui.input.pointer.k0 r6, kotlin.coroutines.jvm.internal.a r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.text.selection.d0
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.text.selection.d0 r0 = (androidx.compose.foundation.text.selection.d0) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.d0 r0 = new androidx.compose.foundation.text.selection.d0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.y
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            androidx.compose.ui.input.pointer.k0 r6 = r0.e
            kotlin.a.e(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L2e:
            kotlin.a.e(r7)
        L31:
            r0.e = r6
            r0.z = r2
            androidx.compose.ui.input.pointer.n r7 = androidx.compose.ui.input.pointer.n.y
            java.lang.Object r7 = r6.b(r7, r0)
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.e
            if (r7 != r1) goto L40
            return r1
        L40:
            androidx.compose.ui.input.pointer.m r7 = (androidx.compose.ui.input.pointer.m) r7
            java.lang.Object r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            androidx.compose.ui.input.pointer.v r5 = (androidx.compose.ui.input.pointer.v) r5
            boolean r5 = androidx.compose.ui.input.pointer.u.a(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.g.e(androidx.compose.ui.input.pointer.k0, kotlin.coroutines.jvm.internal.a):java.lang.Object");
    }

    public static final q f(g0 g0Var) {
        okio.h hVarP;
        int i2 = g0Var.A;
        long j2 = g0Var.I;
        long j3 = g0Var.J;
        okhttp3.r rVar = g0Var.C;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = rVar.iterator();
        while (true) {
            b1 b1Var = (b1) it;
            if (!b1Var.hasNext()) {
                break;
            }
            kotlin.k kVar = (kotlin.k) b1Var.next();
            String str = (String) kVar.e;
            String str2 = (String) kVar.y;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
        }
        o oVar = new o(kotlin.collections.a0.H(linkedHashMap));
        okhttp3.j0 j0Var = g0Var.D;
        return new q(i2, j2, j3, oVar, (j0Var == null || (hVarP = j0Var.P()) == null) ? null : new r(hVarP), g0Var);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a A[LOOP:1: B:23:0x0084->B:25:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final b0 g(p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        coil3.network.okhttp.internal.c cVar2;
        okhttp3.a0 a0Var;
        String str;
        okhttp3.a0 a0Var2;
        p pVar2;
        okhttp3.c0 c0Var;
        com.caverock.androidsvg.m mVar;
        String str2;
        Iterator it;
        if (cVar instanceof coil3.network.okhttp.internal.c) {
            cVar2 = (coil3.network.okhttp.internal.c) cVar;
            int i2 = cVar2.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.y = i2 - Integer.MIN_VALUE;
            } else {
                cVar2 = new coil3.network.okhttp.internal.c(cVar);
            }
        } else {
            cVar2 = new coil3.network.okhttp.internal.c(cVar);
        }
        Object obj = cVar2.e;
        int i3 = cVar2.y;
        okhttp3.a0 a0Var3 = null;
        if (i3 != 0) {
            if (i3 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
            okio.i iVar = (okio.i) obj;
            if (iVar != null) {
                int i4 = e0.a;
                c0Var = new okhttp3.c0(null, iVar);
                pVar2 = null;
                a0Var2 = null;
                str = null;
            } else {
                pVar = null;
                a0Var = null;
                a0Var2 = null;
                str = null;
            }
            a0Var3.c(str, c0Var);
            o oVar = pVar2.c;
            mVar = new com.caverock.androidsvg.m(1);
            for (Map.Entry entry : oVar.a.entrySet()) {
                str2 = (String) entry.getKey();
                it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    mVar.e(str2, (String) it.next());
                }
            }
            okhttp3.r rVarF = mVar.f();
            a0Var2.getClass();
            a0Var2.c = rVarF.d();
            return new b0(a0Var2);
        }
        kotlin.a.e(obj);
        a0Var = new okhttp3.a0();
        a0Var.d(pVar.a);
        str = pVar.b;
        a0Var2 = a0Var;
        okhttp3.a0 a0Var4 = a0Var;
        pVar2 = pVar;
        c0Var = null;
        a0Var3 = a0Var4;
        a0Var3.c(str, c0Var);
        o oVar2 = pVar2.c;
        mVar = new com.caverock.androidsvg.m(1);
        while (r5.hasNext()) {
            str2 = (String) entry.getKey();
            it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                mVar.e(str2, (String) it.next());
            }
        }
        okhttp3.r rVarF2 = mVar.f();
        a0Var2.getClass();
        a0Var2.c = rVarF2.d();
        return new b0(a0Var2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
    
        if (r15 == r6) goto L48;
     */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(androidx.compose.ui.input.pointer.k0 r11, androidx.compose.foundation.text.x0 r12, androidx.compose.ui.input.pointer.m r13, int r14, kotlin.coroutines.jvm.internal.a r15) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.g.h(androidx.compose.ui.input.pointer.k0, androidx.compose.foundation.text.x0, androidx.compose.ui.input.pointer.m, int, kotlin.coroutines.jvm.internal.a):java.lang.Object");
    }

    public static final Bundle i(kotlin.k... kVarArr) {
        Bundle bundle = new Bundle(kVarArr.length);
        for (kotlin.k kVar : kVarArr) {
            String str = (String) kVar.e;
            Object obj = kVar.y;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        androidx.core.graphics.b.c("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, 34);
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    androidx.core.graphics.b.c("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, 34);
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final y j(Context context) {
        context.getClass();
        y yVar = new y(context);
        androidx.navigation.internal.f fVar = yVar.b;
        androidx.navigation.l0 l0Var = fVar.t;
        l0Var.a(new androidx.navigation.compose.g(l0Var));
        androidx.navigation.l0 l0Var2 = fVar.t;
        l0Var2.a(new androidx.navigation.compose.i());
        l0Var2.a(new androidx.navigation.compose.o());
        return yVar;
    }

    public static final long k() {
        return Thread.currentThread().getId();
    }

    public static final boolean l(long j2, long j3) {
        return j2 == j3;
    }

    public static final androidx.savedstate.g m(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            androidx.savedstate.g gVar = tag instanceof androidx.savedstate.g ? (androidx.savedstate.g) tag : null;
            if (gVar != null) {
                return gVar;
            }
            Object objW = android.support.v4.media.session.b.w(view);
            view = objW instanceof View ? (View) objW : null;
        }
        return null;
    }

    public static final androidx.compose.ui.graphics.vector.f n() {
        androidx.compose.ui.graphics.vector.f fVar = a;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new androidx.compose.ui.graphics.vector.o(7.0f, 10.0f));
        arrayList.add(new androidx.compose.ui.graphics.vector.v(5.0f, 5.0f));
        arrayList.add(new androidx.compose.ui.graphics.vector.v(5.0f, -5.0f));
        arrayList.add(androidx.compose.ui.graphics.vector.k.c);
        androidx.compose.ui.graphics.vector.e.a(eVar, arrayList, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        a = fVarB;
        return fVarB;
    }

    public static final androidx.compose.ui.graphics.vector.f o() {
        androidx.compose.ui.graphics.vector.f fVar = b;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Cloud", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        androidx.compose.ui.graphics.vector.g gVarH = androidx.privacysandbox.ads.adservices.java.internal.a.h(19.35f, 10.04f);
        gVarH.g(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        gVarH.g(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f);
        gVarH.g(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f);
        gVarH.h(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        gVarH.l(13.0f);
        gVarH.h(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        gVarH.h(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        gVarH.f();
        androidx.compose.ui.graphics.vector.e.a(eVar, gVarH.a, 0, p0Var);
        androidx.compose.ui.graphics.vector.f fVarB = eVar.b();
        b = fVarB;
        return fVarB;
    }

    public static Drawable p(Context context, int i2) {
        return t1.b().c(context, i2);
    }

    public static androidx.core.text.c q(androidx.appcompat.widget.l0 l0Var) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new androidx.core.text.c(s0.m(l0Var));
        }
        TextPaint textPaint = new TextPaint(l0Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = l0Var.getBreakStrategy();
        int hyphenationFrequency = l0Var.getHyphenationFrequency();
        if (l0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i2 < 28 || (l0Var.getInputType() & 15) != 3) {
            boolean z = l0Var.getLayoutDirection() == 1;
            switch (l0Var.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(s0.e(DecimalFormatSymbols.getInstance(l0Var.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new androidx.core.text.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static boolean r(byte b2) {
        return b2 > -65;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b4, B:46:0x00bc, B:48:0x00c8, B:50:0x00d4, B:41:0x009a), top: B:98:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8 A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b4, B:46:0x00bc, B:48:0x00c8, B:50:0x00d4, B:41:0x009a), top: B:98:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b4, B:46:0x00bc, B:48:0x00c8, B:50:0x00d4, B:41:0x009a), top: B:98:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0164, code lost:
    
        if (r3 == r13) goto L82;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object s(androidx.compose.ui.input.pointer.k0 r17, androidx.compose.foundation.text.selection.q0 r18, androidx.appcompat.widget.x r19, androidx.compose.ui.input.pointer.m r20, kotlin.coroutines.jvm.internal.a r21) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.g.s(androidx.compose.ui.input.pointer.k0, androidx.compose.foundation.text.selection.q0, androidx.appcompat.widget.x, androidx.compose.ui.input.pointer.m, kotlin.coroutines.jvm.internal.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    public static ArrayList t(w wVar) {
        char c2;
        ArrayList arrayList;
        boolean z;
        int i2;
        Object eVar;
        w wVar2 = wVar;
        ArrayList arrayList2 = null;
        arrayList2 = null;
        arrayList2 = null;
        if (wVar2.z() == 0) {
            char c3 = 7;
            wVar2.N(7);
            int iM = wVar2.m();
            boolean z2 = true;
            if (iM == 1684433976) {
                w wVar3 = new w();
                Inflater inflater = new Inflater(true);
                try {
                    if (!androidx.media3.common.util.j0.J(wVar2, wVar3, inflater)) {
                        inflater.end();
                        return null;
                    }
                    inflater.end();
                    wVar2 = wVar3;
                } catch (Throwable th) {
                    inflater.end();
                    throw th;
                }
            } else if (iM == 1918990112) {
            }
            ArrayList arrayList3 = new ArrayList();
            int i3 = wVar2.b;
            int i4 = wVar2.c;
            while (i3 < i4) {
                int iM2 = wVar2.m() + i3;
                if (iM2 > i3 && iM2 <= i4) {
                    if (wVar2.m() == 1835365224) {
                        int iM3 = wVar2.m();
                        if (iM3 > 10000) {
                            c2 = c3;
                            ArrayList arrayList4 = arrayList2;
                            arrayList = arrayList4;
                            z = z2;
                            i2 = i4;
                            eVar = arrayList4;
                        } else {
                            float[] fArr = new float[iM3];
                            for (int i5 = 0; i5 < iM3; i5++) {
                                fArr[i5] = Float.intBitsToFloat(wVar2.m());
                            }
                            int iM4 = wVar2.m();
                            if (iM4 > 32000) {
                                c2 = c3;
                                ArrayList arrayList5 = arrayList2;
                                arrayList = arrayList5;
                                z = z2;
                                i2 = i4;
                                eVar = arrayList5;
                            } else {
                                double dLog = Math.log(2.0d);
                                c2 = c3;
                                ArrayList arrayList6 = arrayList2;
                                int iCeil = (int) Math.ceil(Math.log(((double) iM3) * 2.0d) / dLog);
                                z = z2;
                                byte[] bArr = wVar2.a;
                                androidx.media3.common.util.v vVar = new androidx.media3.common.util.v(bArr, bArr.length);
                                vVar.m(wVar2.b * 8);
                                float[] fArr2 = new float[iM4 * 5];
                                int i6 = 5;
                                int[] iArr = new int[5];
                                ArrayList arrayList7 = arrayList6;
                                int i7 = 0;
                                int i8 = 0;
                                while (true) {
                                    if (i7 < iM4) {
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 < i6) {
                                                int i10 = iArr[i9];
                                                int iG = vVar.g(iCeil);
                                                int i11 = ((iG >> 1) ^ (-(iG & 1))) + i10;
                                                if (i11 < iM3 && i11 >= 0) {
                                                    fArr2[i8] = fArr[i11];
                                                    iArr[i9] = i11;
                                                    i9++;
                                                    i8++;
                                                    i6 = 5;
                                                }
                                            } else {
                                                i7++;
                                                i6 = 5;
                                            }
                                        }
                                    } else {
                                        vVar.m((vVar.e() + 7) & (-8));
                                        int i12 = 32;
                                        int iG2 = vVar.g(32);
                                        androidx.compose.ui.text.android.selection.e[] eVarArr = new androidx.compose.ui.text.android.selection.e[iG2];
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < iG2) {
                                                int iG3 = vVar.g(8);
                                                int iG4 = vVar.g(8);
                                                int iG5 = vVar.g(i12);
                                                if (iG5 <= 128000) {
                                                    int i14 = iG2;
                                                    float[] fArr3 = fArr2;
                                                    int iCeil2 = (int) Math.ceil(Math.log(((double) iM4) * 2.0d) / dLog);
                                                    float[] fArr4 = new float[iG5 * 3];
                                                    float[] fArr5 = new float[iG5 * 2];
                                                    i2 = i4;
                                                    int i15 = 0;
                                                    int i16 = 0;
                                                    while (true) {
                                                        if (i15 < iG5) {
                                                            int iG6 = vVar.g(iCeil2);
                                                            androidx.media3.common.util.v vVar2 = vVar;
                                                            int i17 = ((iG6 >> 1) ^ (-(iG6 & 1))) + i16;
                                                            if (i17 >= 0 && i17 < iM4) {
                                                                int i18 = i15 * 3;
                                                                int i19 = i17 * 5;
                                                                fArr4[i18] = fArr3[i19];
                                                                fArr4[i18 + 1] = fArr3[i19 + 1];
                                                                fArr4[i18 + 2] = fArr3[i19 + 2];
                                                                int i20 = i15 * 2;
                                                                fArr5[i20] = fArr3[i19 + 3];
                                                                fArr5[i20 + 1] = fArr3[i19 + 4];
                                                                i15++;
                                                                i16 = i17;
                                                                vVar = vVar2;
                                                            }
                                                        } else {
                                                            eVarArr[i13] = new androidx.compose.ui.text.android.selection.e(iG3, iG4, fArr4, fArr5);
                                                            i13++;
                                                            iG2 = i14;
                                                            fArr2 = fArr3;
                                                            i4 = i2;
                                                            vVar = vVar;
                                                            i12 = 32;
                                                        }
                                                    }
                                                }
                                                eVar = arrayList7;
                                                arrayList = arrayList7;
                                            } else {
                                                i2 = i4;
                                                eVar = new androidx.media3.exoplayer.video.spherical.e(eVarArr);
                                                arrayList = arrayList7;
                                            }
                                        }
                                    }
                                    i2 = i4;
                                    eVar = arrayList7;
                                    arrayList = arrayList7;
                                }
                            }
                        }
                        if (eVar == null) {
                            return arrayList;
                        }
                        arrayList3.add(eVar);
                    } else {
                        c2 = c3;
                        arrayList = arrayList2;
                        z = z2;
                        i2 = i4;
                    }
                    wVar2.M(iM2);
                    i3 = iM2;
                    c3 = c2;
                    z2 = z;
                    arrayList2 = arrayList;
                    i4 = i2;
                }
            }
            return arrayList3;
        }
        return arrayList2;
    }

    public static void u(TextView textView, int i2) {
        com.google.firebase.b.g(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            s0.q(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void v(TextView textView, int i2) {
        com.google.firebase.b.g(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void w(TextView textView, int i2) {
        com.google.firebase.b.g(i2);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i2 != fontMetricsInt) {
            textView.setLineSpacing(i2 - fontMetricsInt, 1.0f);
        }
    }

    public static final long x(long j2) {
        return (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
    }

    public static String y(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3)) {
            return "CornerRadius.circular(" + h1.A(Float.intBitsToFloat(i2)) + ')';
        }
        return "CornerRadius.elliptical(" + h1.A(Float.intBitsToFloat(i2)) + ", " + h1.A(Float.intBitsToFloat(i3)) + ')';
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r14 == r5) goto L35;
     */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object z(androidx.compose.ui.input.pointer.k0 r11, androidx.compose.foundation.text.x0 r12, androidx.compose.ui.input.pointer.m r13, kotlin.coroutines.jvm.internal.a r14) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.g.z(androidx.compose.ui.input.pointer.k0, androidx.compose.foundation.text.x0, androidx.compose.ui.input.pointer.m, kotlin.coroutines.jvm.internal.a):java.lang.Object");
    }
}
