package com.app.mlounge.ui.components;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.animation.core.k1;
import androidx.compose.animation.core.r1;
import androidx.compose.foundation.b2;
import androidx.compose.foundation.gestures.h2;
import androidx.compose.foundation.gestures.w1;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.c2;
import androidx.compose.material3.f1;
import androidx.compose.material3.f3;
import androidx.compose.material3.j2;
import androidx.compose.material3.k3;
import androidx.compose.material3.o2;
import androidx.compose.material3.p3;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.d1;
import androidx.compose.runtime.p1;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.y0;
import androidx.compose.ui.platform.k2;
import androidx.compose.ui.platform.l1;
import androidx.core.content.FileProvider;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.MusicGenre;
import com.app.mlounge.data.remote.model.TmdbGenre;
import com.app.mlounge.emulator.LibretroCore;
import com.google.firebase.crashlytics.internal.model.t1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public static final androidx.compose.runtime.internal.f a = new androidx.compose.runtime.internal.f(1420747848, false, new androidx.compose.foundation.contextmenu.b(5));
    public static final androidx.compose.runtime.internal.f b = new androidx.compose.runtime.internal.f(97568902, false, new androidx.compose.foundation.contextmenu.b(6));
    public static final androidx.compose.runtime.internal.f c = new androidx.compose.runtime.internal.f(-114378379, false, new androidx.compose.ui.text.x(24));
    public static final androidx.compose.runtime.internal.f d = new androidx.compose.runtime.internal.f(-257344572, false, new androidx.compose.foundation.contextmenu.b(7));
    public static final androidx.compose.runtime.internal.f e = new androidx.compose.runtime.internal.f(2100120916, false, new androidx.compose.ui.text.x(25));
    public static final androidx.compose.runtime.internal.f f = new androidx.compose.runtime.internal.f(1166339773, false, new androidx.compose.ui.text.x(26));

    public static final void a(List list, String str, kotlin.jvm.functions.l lVar, androidx.compose.ui.r rVar, androidx.compose.runtime.r rVar2, int i) {
        androidx.compose.ui.r rVar3;
        androidx.compose.runtime.r rVar4 = rVar2;
        list.getClass();
        lVar.getClass();
        rVar4.c0(2081442240);
        int i2 = 2;
        int i3 = i | (rVar4.h(list) ? 4 : 2) | (rVar4.f(str) ? 32 : 16);
        boolean zH = rVar4.h(lVar);
        int i4 = LibretroCore.SCREEN_WIDTH;
        int i5 = i3 | (zH ? 256 : 128) | 3072;
        if (rVar4.T(i5 & 1, (i5 & 1171) != 1170)) {
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            float f2 = 8;
            androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.p(w0.d(oVar, 1.0f), androidx.compose.foundation.s.o(rVar4), false), 12, f2);
            t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.g(f2), androidx.compose.ui.c.H, rVar4, 54);
            int iHashCode = Long.hashCode(rVar4.T);
            androidx.compose.runtime.internal.j jVarL = rVar4.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar4, rVarP);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar4.e0();
            if (rVar4.S) {
                rVar4.k(yVar);
            } else {
                rVar4.o0();
            }
            androidx.compose.runtime.s.x(rVar4, t0VarA, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar4, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(rVar4, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(rVar4, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar4, rVarC, androidx.compose.ui.node.f.c);
            androidx.compose.runtime.r rVar5 = rVar4;
            androidx.compose.ui.o oVar2 = oVar;
            f1.b(t1.o(), "Filters", w0.l(oVar, 20), com.app.mlounge.ui.theme.b.m, rVar5, 3504, 0);
            rVar5.b0(-1049252540);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                Object objQ = rVar5.Q();
                androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                if (objQ == fVar) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar5);
                }
                androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar2, androidx.compose.foundation.shape.e.a(f2)), i2, ((Boolean) android.support.v4.media.session.b.g(kVar, rVar5, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f2));
                boolean zF = ((i5 & 896) == i4) | rVar5.f(str2);
                Object objQ2 = rVar5.Q();
                if (zF || objQ2 == fVar) {
                    objQ2 = new l0(lVar, str2, 0);
                    rVar5.l0(objQ2);
                }
                f3.a(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f2), kotlin.jvm.internal.l.a(str, str2) ? androidx.compose.ui.graphics.t.b(0.3f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-18119321, new m0(str, str2, 0, (byte) 0), rVar5), rVar2, 12582912, 120);
                rVar5 = rVar2;
                oVar2 = oVar2;
                i4 = i4;
                i2 = 2;
                i5 = i5;
            }
            rVar4 = rVar5;
            rVar4.p(false);
            rVar4.p(true);
            rVar3 = oVar2;
        } else {
            rVar4.W();
            rVar3 = rVar;
        }
        q1 q1VarT = rVar4.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.text.contextmenu.provider.d(list, str, lVar, rVar3, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x0113  */
    /* JADX WARN: Code duplicated, block: B:70:0x011d  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0128  */
    /* JADX WARN: Code duplicated, block: B:77:0x015d  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x0203  */
    /* JADX WARN: Code duplicated, block: B:96:0x020d  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    public static final void b(boolean z, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, int i, int i2) {
        boolean z2;
        int i3;
        kotlin.jvm.functions.a aVar2;
        int i4;
        boolean z3;
        boolean z4;
        q1 q1VarT;
        kotlin.jvm.functions.a aVar3;
        Object objQ;
        androidx.compose.runtime.f fVar;
        y0 y0Var;
        Object objQ2;
        y0 y0Var2;
        Object objQ3;
        y0 y0Var3;
        Object objQ4;
        y0 y0Var4;
        Object objQ5;
        Object objQ6;
        boolean z5;
        Object objQ7;
        y0 y0Var5;
        androidx.compose.runtime.f fVar2;
        boolean z6;
        kotlin.jvm.functions.a aVar4;
        boolean z7;
        Object objQ8;
        rVar.c0(1889076387);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (rVar.g(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                aVar2 = aVar;
                i3 |= rVar.h(aVar2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) != 18) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (rVar.T(i4 & 1, z3)) {
                if (i5 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (i6 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                objQ = rVar.Q();
                fVar = androidx.compose.runtime.m.a;
                if (objQ == fVar) {
                    objQ = androidx.compose.runtime.s.r(null);
                    rVar.l0(objQ);
                }
                y0Var = (y0) objQ;
                objQ2 = rVar.Q();
                if (objQ2 == fVar) {
                    objQ2 = androidx.compose.runtime.s.r(Boolean.FALSE);
                    rVar.l0(objQ2);
                }
                y0Var2 = (y0) objQ2;
                objQ3 = rVar.Q();
                if (objQ3 == fVar) {
                    objQ3 = androidx.compose.runtime.s.r(Boolean.FALSE);
                    rVar.l0(objQ3);
                }
                y0Var3 = (y0) objQ3;
                objQ4 = rVar.Q();
                if (objQ4 == fVar) {
                    objQ4 = androidx.compose.runtime.s.r(Boolean.FALSE);
                    rVar.l0(objQ4);
                }
                y0Var4 = (y0) objQ4;
                objQ5 = rVar.Q();
                if (objQ5 == fVar) {
                    objQ5 = new d1(0.0f);
                    rVar.l0(objQ5);
                }
                d1 d1Var = (d1) objQ5;
                objQ6 = rVar.Q();
                if (objQ6 == fVar) {
                    objQ6 = androidx.compose.runtime.s.r(null);
                    rVar.l0(objQ6);
                }
                y0 y0Var6 = (y0) objQ6;
                Context context = (Context) rVar.j(androidx.compose.ui.platform.m0.b);
                Boolean boolValueOf = Boolean.valueOf(z4);
                if ((i4 & 14) == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objQ7 = rVar.Q();
                if (z5 || objQ7 == fVar) {
                    androidx.compose.foundation.g gVar = new androidx.compose.foundation.g(z4, y0Var, y0Var2, y0Var3, (kotlin.coroutines.d) null);
                    rVar.l0(gVar);
                    objQ7 = gVar;
                }
                androidx.compose.runtime.j0.c(rVar, boolValueOf, (kotlin.jvm.functions.p) objQ7);
                if (((Boolean) y0Var3.getValue()).booleanValue()) {
                    rVar.b0(519031306);
                    if ((i4 & Token.ASSIGN_MOD) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objQ8 = rVar.Q();
                    if (z7 || objQ8 == fVar) {
                        objQ8 = new a(aVar3, y0Var3, 0);
                        rVar.l0(objQ8);
                    }
                    fVar2 = fVar;
                    y0Var5 = y0Var4;
                    z6 = true;
                    t1.a((kotlin.jvm.functions.a) objQ8, new androidx.compose.ui.window.w(7, false, false), androidx.compose.runtime.internal.k.c(936483249, new f(aVar3, y0Var3, 0), rVar), rVar, 432, 0);
                    rVar.p(false);
                } else {
                    y0Var5 = y0Var4;
                    fVar2 = fVar;
                    z6 = true;
                    rVar.b0(520281567);
                    rVar.p(false);
                }
                if (((Boolean) y0Var2.getValue()).booleanValue() || ((q0) y0Var.getValue()) == null) {
                    aVar4 = aVar3;
                    rVar.b0(526612511);
                    rVar.p(false);
                } else {
                    rVar.b0(520521693);
                    q0 q0Var = (q0) y0Var.getValue();
                    q0Var.getClass();
                    boolean z8 = (i4 & Token.ASSIGN_MOD) == 32 ? z6 : false;
                    Object objQ9 = rVar.Q();
                    if (z8 || objQ9 == fVar2) {
                        objQ9 = new androidx.compose.foundation.gestures.g(7, aVar3, y0Var5, y0Var2);
                        rVar.l0(objQ9);
                    }
                    aVar4 = aVar3;
                    t1.a((kotlin.jvm.functions.a) objQ9, new androidx.compose.ui.window.w(4, !((Boolean) y0Var5.getValue()).booleanValue(), !((Boolean) y0Var5.getValue()).booleanValue()), androidx.compose.runtime.internal.k.c(-1083105574, new j(q0Var, y0Var5, d1Var, y0Var6, context, aVar4, y0Var2, 0), rVar), rVar, 384, 0);
                    rVar.p(false);
                }
                aVar2 = aVar4;
            } else {
                rVar.W();
                z4 = z2;
            }
            q1VarT = rVar.t();
            if (q1VarT != null) {
                q1VarT.d = new k(z4, aVar2, i, i2);
            }
        }
        i3 |= 48;
        aVar2 = aVar;
        i4 = i3;
        if ((i4 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.T(i4 & 1, z3)) {
            if (i5 != 0) {
                z4 = false;
            } else {
                z4 = z2;
            }
            if (i6 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar2;
            }
            objQ = rVar.Q();
            fVar = androidx.compose.runtime.m.a;
            if (objQ == fVar) {
                objQ = androidx.compose.runtime.s.r(null);
                rVar.l0(objQ);
            }
            y0Var = (y0) objQ;
            objQ2 = rVar.Q();
            if (objQ2 == fVar) {
                objQ2 = androidx.compose.runtime.s.r(Boolean.FALSE);
                rVar.l0(objQ2);
            }
            y0Var2 = (y0) objQ2;
            objQ3 = rVar.Q();
            if (objQ3 == fVar) {
                objQ3 = androidx.compose.runtime.s.r(Boolean.FALSE);
                rVar.l0(objQ3);
            }
            y0Var3 = (y0) objQ3;
            objQ4 = rVar.Q();
            if (objQ4 == fVar) {
                objQ4 = androidx.compose.runtime.s.r(Boolean.FALSE);
                rVar.l0(objQ4);
            }
            y0Var4 = (y0) objQ4;
            objQ5 = rVar.Q();
            if (objQ5 == fVar) {
                objQ5 = new d1(0.0f);
                rVar.l0(objQ5);
            }
            d1 d1Var2 = (d1) objQ5;
            objQ6 = rVar.Q();
            if (objQ6 == fVar) {
                objQ6 = androidx.compose.runtime.s.r(null);
                rVar.l0(objQ6);
            }
            y0 y0Var7 = (y0) objQ6;
            Context context2 = (Context) rVar.j(androidx.compose.ui.platform.m0.b);
            Boolean boolValueOf2 = Boolean.valueOf(z4);
            if ((i4 & 14) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            objQ7 = rVar.Q();
            if (z5) {
                androidx.compose.foundation.g gVar2 = new androidx.compose.foundation.g(z4, y0Var, y0Var2, y0Var3, (kotlin.coroutines.d) null);
                rVar.l0(gVar2);
                objQ7 = gVar2;
            } else {
                androidx.compose.foundation.g gVar3 = new androidx.compose.foundation.g(z4, y0Var, y0Var2, y0Var3, (kotlin.coroutines.d) null);
                rVar.l0(gVar3);
                objQ7 = gVar3;
            }
            androidx.compose.runtime.j0.c(rVar, boolValueOf2, (kotlin.jvm.functions.p) objQ7);
            if (((Boolean) y0Var3.getValue()).booleanValue()) {
                rVar.b0(519031306);
                if ((i4 & Token.ASSIGN_MOD) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objQ8 = rVar.Q();
                if (z7) {
                    objQ8 = new a(aVar3, y0Var3, 0);
                    rVar.l0(objQ8);
                } else {
                    objQ8 = new a(aVar3, y0Var3, 0);
                    rVar.l0(objQ8);
                }
                fVar2 = fVar;
                y0Var5 = y0Var4;
                z6 = true;
                t1.a((kotlin.jvm.functions.a) objQ8, new androidx.compose.ui.window.w(7, false, false), androidx.compose.runtime.internal.k.c(936483249, new f(aVar3, y0Var3, 0), rVar), rVar, 432, 0);
                rVar.p(false);
            } else {
                y0Var5 = y0Var4;
                fVar2 = fVar;
                z6 = true;
                rVar.b0(520281567);
                rVar.p(false);
            }
            if (((Boolean) y0Var2.getValue()).booleanValue()) {
                aVar4 = aVar3;
                rVar.b0(526612511);
                rVar.p(false);
            } else {
                aVar4 = aVar3;
                rVar.b0(526612511);
                rVar.p(false);
            }
            aVar2 = aVar4;
        } else {
            rVar.W();
            z4 = z2;
        }
        q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new k(z4, aVar2, i, i2);
        }
    }

    public static final void c(kotlin.jvm.functions.l lVar, androidx.compose.runtime.r rVar, int i) {
        androidx.compose.runtime.r rVar2;
        lVar.getClass();
        rVar.c0(1662977352);
        int i2 = (rVar.h(lVar) ? 4 : 2) | i;
        if (rVar.T(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) rVar.j(androidx.compose.ui.platform.m0.b);
            Object objQ = rVar.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                objQ = new androidx.activity.compose.b(1);
                rVar.l0(objQ);
            }
            rVar2 = rVar;
            t1.a((kotlin.jvm.functions.a) objQ, new androidx.compose.ui.window.w(false, false, false), androidx.compose.runtime.internal.k.c(-1560458095, new l(context, lVar, 0), rVar), rVar2, 438, 0);
        } else {
            rVar2 = rVar;
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.lazy.grid.g(i, lVar);
        }
    }

    public static final void d(int i, androidx.compose.ui.r rVar, int i2, boolean z, androidx.compose.runtime.r rVar2, int i3) {
        androidx.compose.ui.r rVar3;
        int i4;
        int i5;
        androidx.compose.runtime.r rVar4;
        q1 q1VarT;
        kotlin.jvm.functions.p kVar;
        Object obj;
        androidx.compose.runtime.r rVar5 = rVar2;
        rVar5.c0(-1251020004);
        int i6 = i3 | (rVar5.d(i) ? 4 : 2) | 384 | (rVar5.g(z) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (rVar5.T(i6 & 1, (i6 & 1171) != 1170)) {
            if (i <= 0) {
                q1VarT = rVar5.t();
                if (q1VarT == null) {
                    return;
                } else {
                    kVar = new m(i, i3, 0, rVar, z);
                }
            } else {
                Context context = (Context) rVar5.j(androidx.compose.ui.platform.m0.b);
                Object objQ = rVar5.Q();
                androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                if (objQ == fVar) {
                    objQ = Boolean.valueOf(org.jsoup.helper.n.e(context, "android.permission.RECORD_AUDIO") == 0);
                    rVar5.l0(objQ);
                }
                if (((Boolean) objQ).booleanValue()) {
                    i4 = i;
                    rVar3 = rVar;
                    rVar5.b0(-1704963802);
                    rVar5.p(false);
                    Object objQ2 = rVar5.Q();
                    if (objQ2 == fVar) {
                        androidx.compose.runtime.snapshots.q qVar = new androidx.compose.runtime.snapshots.q();
                        for (int i7 = 0; i7 < 48; i7++) {
                            obj = objQ2;
                            qVar.add(Float.valueOf(0.0f));
                        }
                        obj = objQ2;
                        rVar5.l0(qVar);
                        obj = qVar;
                    }
                    obj = objQ2;
                    androidx.compose.runtime.snapshots.q qVar2 = (androidx.compose.runtime.snapshots.q) obj;
                    Integer numValueOf = Integer.valueOf(i4);
                    boolean z2 = (i6 & 14) == 4;
                    Object objQ3 = rVar5.Q();
                    if (z2 || objQ3 == fVar) {
                        objQ3 = new androidx.compose.foundation.lazy.grid.v(i4, qVar2, 2);
                        rVar5.l0(objQ3);
                    }
                    androidx.compose.runtime.j0.b(numValueOf, (kotlin.jvm.functions.l) objQ3, rVar5);
                    rVar5.b0(360738454);
                    ArrayList arrayList = new ArrayList(kotlin.collections.p.y(qVar2, 10));
                    ListIterator listIterator = qVar2.listIterator();
                    androidx.compose.runtime.r rVar6 = rVar5;
                    while (true) {
                        androidx.compose.runtime.snapshots.u uVar = (androidx.compose.runtime.snapshots.u) listIterator;
                        if (!uVar.hasNext()) {
                            break;
                        }
                        float fFloatValue = ((Number) uVar.next()).floatValue();
                        if (!z) {
                            fFloatValue = 0.0f;
                        }
                        k1 k1VarM = androidx.compose.animation.core.e.m(0.75f, 200.0f, null, 4);
                        if (k1VarM == androidx.compose.animation.core.h.a) {
                            rVar6.b0(1144089983);
                            boolean zC = rVar6.c(0.01f);
                            Object objQ4 = rVar6.Q();
                            if (zC || objQ4 == fVar) {
                                objQ4 = androidx.compose.animation.core.e.m(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                                rVar6.l0(objQ4);
                            }
                            k1VarM = (k1) objQ4;
                            rVar6.p(false);
                        } else {
                            rVar6.b0(1144199909);
                            rVar6.p(false);
                        }
                        arrayList.add(androidx.compose.animation.core.h.b(Float.valueOf(fFloatValue), androidx.compose.animation.core.e.j, k1VarM, Float.valueOf(0.01f), "magnitude", rVar2, 24576, 0));
                        rVar6 = rVar2;
                    }
                    androidx.compose.runtime.r rVar7 = rVar6;
                    rVar7.p(false);
                    androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(rVar3.d(w0.c), 24, 48);
                    boolean zH = rVar7.h(arrayList);
                    Object objQ5 = rVar7.Q();
                    if (zH || objQ5 == fVar) {
                        objQ5 = new androidx.compose.foundation.text.selection.o0(1, arrayList);
                        rVar7.l0(objQ5);
                    }
                    androidx.compose.foundation.s.b(rVarP, (kotlin.jvm.functions.l) objQ5, rVar7, 0);
                    i5 = 48;
                    rVar4 = rVar7;
                } else {
                    rVar5.b0(-1705301113);
                    androidx.compose.ui.r rVarD = rVar.d(w0.c);
                    androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                    int iHashCode = Long.hashCode(rVar5.T);
                    androidx.compose.runtime.internal.j jVarL = rVar5.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar5, rVarD);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                    rVar5.e0();
                    if (rVar5.S) {
                        rVar5.k(yVar);
                    } else {
                        rVar5.o0();
                    }
                    androidx.compose.runtime.s.x(rVar5, q0VarD, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar5, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar5, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar5, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar5, rVarC, androidx.compose.ui.node.f.c);
                    p3.b("Audio Visualizer ready (Grant permission to see it)", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar5.j(u3.a)).l, rVar2, 390, 0, 131066);
                    rVar2.p(true);
                    rVar2.p(false);
                    q1VarT = rVar2.t();
                    if (q1VarT == null) {
                        return;
                    } else {
                        kVar = new m(i, i3, 1, rVar, z);
                    }
                }
            }
            q1VarT.d = kVar;
        }
        rVar3 = rVar;
        androidx.compose.runtime.r rVar8 = rVar5;
        i4 = i;
        rVar8.W();
        i5 = i2;
        rVar4 = rVar8;
        q1VarT = rVar4.t();
        if (q1VarT != null) {
            kVar = new k(i4, i5, i3, rVar3, z);
            q1VarT.d = kVar;
        }
    }

    public static final void e(kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, int i) {
        kotlin.jvm.functions.a aVar2;
        androidx.compose.runtime.r rVar2;
        aVar.getClass();
        rVar.c0(1148872412);
        if (rVar.T(i & 1, (i & 3) != 2)) {
            Object objQ = rVar.Q();
            kotlin.coroutines.d dVar = null;
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (objQ == fVar) {
                objQ = androidx.compose.runtime.s.r(null);
                rVar.l0(objQ);
            }
            y0 y0Var = (y0) objQ;
            Object objQ2 = rVar.Q();
            if (objQ2 == fVar) {
                objQ2 = androidx.compose.runtime.s.r(Boolean.TRUE);
                rVar.l0(objQ2);
            }
            y0 y0Var2 = (y0) objQ2;
            Object objQ3 = rVar.Q();
            if (objQ3 == fVar) {
                objQ3 = new androidx.room.coroutines.f(y0Var, y0Var2, dVar, 6);
                rVar.l0(objQ3);
            }
            androidx.compose.runtime.j0.c(rVar, kotlin.y.a, (kotlin.jvm.functions.p) objQ3);
            aVar2 = aVar;
            rVar2 = rVar;
            t1.a(aVar2, new androidx.compose.ui.window.w(7, false, false), androidx.compose.runtime.internal.k.c(-956950157, new g(aVar, y0Var2, y0Var, 0), rVar), rVar2, 438, 0);
        } else {
            aVar2 = aVar;
            rVar2 = rVar;
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new h(aVar2, i, 0);
        }
    }

    public static final void f(String str, String str2, kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, String str3, String str4, kotlin.jvm.functions.a aVar2, androidx.compose.runtime.r rVar2, int i, int i2) {
        kotlin.jvm.functions.a aVar3;
        int i3;
        androidx.compose.ui.r rVar3;
        kotlin.jvm.functions.a aVar4;
        kotlin.jvm.functions.a aVar5;
        boolean z;
        androidx.compose.ui.r rVarE;
        kotlin.jvm.functions.a aVar6;
        boolean z2;
        Object g0Var;
        str.getClass();
        aVar.getClass();
        rVar2.c0(-921782718);
        int i4 = i | (rVar2.f(str) ? 4 : 2) | (rVar2.f(str2) ? 32 : 16) | (rVar2.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128) | 3072 | (rVar2.f(str3) ? 16384 : 8192);
        int i5 = i2 & 64;
        if (i5 != 0) {
            i3 = i4 | 1572864;
            aVar3 = aVar2;
        } else {
            aVar3 = aVar2;
            i3 = i4 | (rVar2.h(aVar3) ? 1048576 : 524288);
        }
        int i6 = i3;
        if (rVar2.T(i6 & 1, (533651 & i6) != 533650)) {
            if (i5 != 0) {
                aVar3 = null;
            }
            Object objQ = rVar2.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            long j = ((Boolean) android.support.v4.media.session.b.g(kVar, rVar2, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h;
            Object objQ2 = rVar2.Q();
            if (objQ2 == fVar) {
                objQ2 = androidx.compose.runtime.s.r(Boolean.FALSE);
                rVar2.l0(objQ2);
            }
            y0 y0Var = (y0) objQ2;
            Object objQ3 = rVar2.Q();
            if (objQ3 == fVar) {
                objQ3 = androidx.compose.runtime.s.r(Boolean.FALSE);
                rVar2.l0(objQ3);
            }
            y0 y0Var2 = (y0) objQ3;
            Object objQ4 = rVar2.Q();
            if (objQ4 == fVar) {
                objQ4 = androidx.compose.runtime.j0.f(rVar2);
                rVar2.l0(objQ4);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objQ4;
            Object objQ5 = rVar2.Q();
            if (objQ5 == fVar) {
                objQ5 = androidx.compose.runtime.s.r(null);
                rVar2.l0(objQ5);
            }
            y0 y0Var3 = (y0) objQ5;
            float f2 = 8;
            androidx.compose.foundation.shape.d dVarA = androidx.compose.foundation.shape.e.a(f2);
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            androidx.compose.foundation.interaction.k kVar2 = kVar;
            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar, dVarA), 2, j, androidx.compose.foundation.shape.e.a(f2));
            if (aVar3 != null) {
                rVar2.b0(1192861558);
                boolean zH = rVar2.h(coroutineScope) | ((3670016 & i6) == 1048576) | ((i6 & 896) == 256);
                Object objQ6 = rVar2.Q();
                if (zH || objQ6 == fVar) {
                    g0Var = new g0(coroutineScope, aVar, y0Var2, y0Var3, aVar3, y0Var);
                    aVar5 = aVar;
                    rVar2.l0(g0Var);
                } else {
                    g0Var = objQ6;
                    aVar5 = aVar;
                }
                rVarE = androidx.compose.ui.input.key.c.e(oVar, (kotlin.jvm.functions.l) g0Var);
                z = false;
                rVar2.p(false);
            } else {
                aVar5 = aVar;
                fVar = fVar;
                aVar3 = aVar3;
                kVar2 = kVar2;
                z = false;
                rVar2.b0(-1069832278);
                rVar2.p(false);
                rVarE = oVar;
            }
            androidx.compose.ui.r rVarD = rVarG.d(rVarE);
            if (aVar3 == null) {
                rVar2.b0(1195346672);
                rVar2.p(z);
                z2 = z;
                aVar6 = null;
            } else {
                rVar2.b0(1195346673);
                boolean zF = rVar2.f(aVar3);
                Object objQ7 = rVar2.Q();
                if (zF || objQ7 == fVar) {
                    objQ7 = new a(aVar3, y0Var, 4);
                    rVar2.l0(objQ7);
                }
                aVar6 = (kotlin.jvm.functions.a) objQ7;
                z2 = false;
                rVar2.p(false);
            }
            if ((i6 & 896) == 256) {
                z2 = true;
            }
            Object objQ8 = rVar2.Q();
            if (z2 || objQ8 == fVar) {
                objQ8 = new a(aVar5, y0Var, 5);
                rVar2.l0(objQ8);
            }
            t2.c(androidx.compose.foundation.s.m(androidx.compose.foundation.s.k(rVarD, kVar2, aVar6, (kotlin.jvm.functions.a) objQ8), kVar2, 1), androidx.compose.foundation.shape.e.a(f2), t2.i(com.app.mlounge.ui.theme.b.d, rVar2, 6), null, androidx.compose.runtime.internal.k.c(319724340, new d0(0, str2, str, str3), rVar2), rVar2, 196608, 24);
            aVar4 = aVar3;
            rVar3 = oVar;
        } else {
            rVar2.W();
            rVar3 = rVar;
            aVar4 = aVar3;
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new com.app.mlounge.ui.screens.tvshows.h(str, str2, aVar, rVar3, str3, str4, aVar4, i, i2);
        }
    }

    public static final void g(kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, int i) {
        rVar.c0(184817345);
        int i2 = (rVar.h(aVar) ? 256 : 128) | i;
        if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            Object objQ = rVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            float f2 = 12;
            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(w0.d(androidx.compose.ui.o.b, 1.0f), androidx.compose.foundation.shape.e.a(f2)), 2, ((Boolean) android.support.v4.media.session.b.g(kVar, rVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f2));
            boolean z = (i2 & 896) == 256;
            Object objQ2 = rVar.Q();
            if (z || objQ2 == fVar) {
                objQ2 = new j2(3, aVar);
                rVar.l0(objQ2);
            }
            f3.a(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f2), com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(602840198, new androidx.compose.ui.text.x(23), rVar), rVar, 12582912, 120);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new h(aVar, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014a  */
    /* JADX WARN: Code duplicated, block: B:102:0x0150  */
    /* JADX WARN: Code duplicated, block: B:104:0x0158  */
    /* JADX WARN: Code duplicated, block: B:105:0x015b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0162  */
    /* JADX WARN: Code duplicated, block: B:111:0x016b  */
    /* JADX WARN: Code duplicated, block: B:112:0x016e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0174  */
    /* JADX WARN: Code duplicated, block: B:116:0x017c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0183  */
    /* JADX WARN: Code duplicated, block: B:125:0x019c  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:134:0x01af  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:156:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:164:0x0204  */
    /* JADX WARN: Code duplicated, block: B:166:0x020b  */
    /* JADX WARN: Code duplicated, block: B:169:0x021e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0222  */
    /* JADX WARN: Code duplicated, block: B:173:0x022d  */
    /* JADX WARN: Code duplicated, block: B:176:0x0240  */
    /* JADX WARN: Code duplicated, block: B:179:0x0253  */
    /* JADX WARN: Code duplicated, block: B:182:0x0262  */
    /* JADX WARN: Code duplicated, block: B:185:0x028a  */
    /* JADX WARN: Code duplicated, block: B:187:0x0296  */
    /* JADX WARN: Code duplicated, block: B:188:0x0298  */
    /* JADX WARN: Code duplicated, block: B:191:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:192:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:195:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:196:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:202:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:204:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:207:0x030e  */
    /* JADX WARN: Code duplicated, block: B:208:0x031a  */
    /* JADX WARN: Code duplicated, block: B:210:0x0326  */
    /* JADX WARN: Code duplicated, block: B:211:0x0328  */
    /* JADX WARN: Code duplicated, block: B:215:0x0336  */
    /* JADX WARN: Code duplicated, block: B:219:0x034c  */
    /* JADX WARN: Code duplicated, block: B:220:0x034e  */
    /* JADX WARN: Code duplicated, block: B:223:0x0357  */
    /* JADX WARN: Code duplicated, block: B:224:0x0359  */
    /* JADX WARN: Code duplicated, block: B:228:0x0364  */
    /* JADX WARN: Code duplicated, block: B:231:0x0375  */
    /* JADX WARN: Code duplicated, block: B:233:0x037f  */
    /* JADX WARN: Code duplicated, block: B:234:0x0381  */
    /* JADX WARN: Code duplicated, block: B:238:0x038a  */
    /* JADX WARN: Code duplicated, block: B:241:0x039d  */
    /* JADX WARN: Code duplicated, block: B:243:0x0412  */
    /* JADX WARN: Code duplicated, block: B:246:0x042d  */
    /* JADX WARN: Code duplicated, block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0085  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00de  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:77:0x0101  */
    /* JADX WARN: Code duplicated, block: B:78:0x0104  */
    /* JADX WARN: Code duplicated, block: B:82:0x010c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0113  */
    /* JADX WARN: Code duplicated, block: B:85:0x011d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0120  */
    /* JADX WARN: Code duplicated, block: B:90:0x0128  */
    /* JADX WARN: Code duplicated, block: B:92:0x012f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0139  */
    /* JADX WARN: Code duplicated, block: B:95:0x013c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0147  */
    public static final void h(final String str, final String str2, final kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, Double d2, String str3, kotlin.jvm.functions.a aVar2, androidx.compose.ui.layout.j jVar, androidx.compose.ui.graphics.painter.b bVar, float f2, boolean z, boolean z2, float f3, String str4, androidx.compose.runtime.r rVar2, final int i, final int i2, final int i3) {
        androidx.compose.ui.r rVar3;
        int i4;
        Double d3;
        int i5;
        int i6;
        int i7;
        String str5;
        int i8;
        int i9;
        final kotlin.jvm.functions.a aVar3;
        int i10;
        int i11;
        int i12;
        final androidx.compose.ui.layout.j jVar2;
        int i13;
        int i14;
        boolean zH;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z3;
        final androidx.compose.ui.graphics.painter.b bVar2;
        final float f4;
        final androidx.compose.ui.r rVar4;
        final Double d4;
        final String str6;
        final kotlin.jvm.functions.a aVar4;
        final boolean z4;
        final boolean z5;
        final float f5;
        final String str7;
        q1 q1VarT;
        androidx.compose.ui.r rVarT;
        androidx.compose.ui.layout.j jVar3;
        androidx.compose.ui.graphics.painter.b bVar3;
        float f6;
        boolean z6;
        boolean z7;
        float f7;
        String str8;
        Object objQ;
        Object obj;
        y0 y0VarG;
        long j;
        int i34;
        float f8;
        Object objQ2;
        final y0 y0Var;
        Object objQ3;
        y0 y0Var2;
        Object objQ4;
        CoroutineScope coroutineScope;
        Object objQ5;
        y0 y0Var3;
        final kotlin.jvm.functions.a aVar5;
        Double d5;
        final String str9;
        int i35;
        boolean z8;
        androidx.compose.ui.r rVar5;
        boolean z9;
        boolean zF;
        Object objQ6;
        kotlin.jvm.functions.a aVar6;
        int i36;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objQ7;
        boolean z13;
        boolean z14;
        Object objQ8;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objQ9;
        str.getClass();
        aVar.getClass();
        rVar2.c0(-1559002577);
        int i37 = (rVar2.f(str) ? 4 : 2) | i | (rVar2.f(str2) ? 32 : 16) | (rVar2.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        int i38 = i3 & 8;
        int i39 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i38 == 0) {
            if ((i & 3072) == 0) {
                rVar3 = rVar;
                i37 |= rVar2.f(rVar3) ? 2048 : 1024;
            }
            i4 = i3 & 16;
            if (i4 != 0) {
                i6 = i37 | 24576;
                d3 = d2;
            } else {
                d3 = d2;
                if (rVar2.f(d3)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i6 = i37 | i5;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i6 |= 196608;
                str5 = str3;
            } else {
                str5 = str3;
                if ((i & 196608) == 0) {
                    if (rVar2.f(str5)) {
                        i8 = 131072;
                    } else {
                        i8 = Parser.ARGC_LIMIT;
                    }
                    i6 |= i8;
                }
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i11 = i6 | 1572864;
                aVar3 = aVar2;
            } else {
                aVar3 = aVar2;
                if (rVar2.h(aVar3)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i11 = i6 | i10;
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i11 |= 12582912;
                jVar2 = jVar;
            } else {
                jVar2 = jVar;
                if ((i & 12582912) == 0) {
                    if (rVar2.f(jVar2)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i11 |= i13;
                }
            }
            i14 = i3 & LibretroCore.SCREEN_WIDTH;
            if (i14 != 0) {
                i15 = 100663296;
            } else {
                if ((i & 134217728) == 0) {
                    zH = rVar2.f(bVar);
                } else {
                    zH = rVar2.h(bVar);
                }
                if (zH) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
            }
            i16 = i11 | i15;
            i17 = i3 & 512;
            if (i17 != 0) {
                i19 = i16 | 805306368;
            } else {
                if (rVar2.c(f2)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i19 = i16 | i18;
            }
            i20 = i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            if (i20 != 0) {
                i22 = i2 | 6;
            } else {
                if (rVar2.g(z)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i22 = i2 | i21;
            }
            i23 = i3 & 2048;
            if (i23 != 0) {
                i25 = i22 | 48;
            } else {
                if (rVar2.g(z2)) {
                    i24 = 32;
                } else {
                    i24 = 16;
                }
                i25 = i22 | i24;
            }
            i26 = i25;
            i27 = i3 & 4096;
            if (i27 != 0) {
                i29 = i26 | 384;
            } else {
                i28 = i26;
                if ((i2 & 384) != 0) {
                    if (rVar2.c(f3)) {
                        i30 = LibretroCore.SCREEN_WIDTH;
                    } else {
                        i30 = 128;
                    }
                    i28 |= i30;
                }
                i29 = i28;
            }
            i31 = i3 & 8192;
            if (i31 != 0) {
                i33 = i29 | 3072;
            } else {
                i32 = i29;
                if ((i2 & 3072) == 0) {
                    if (rVar2.f(str4)) {
                        i39 = 2048;
                    }
                    i33 = i32 | i39;
                } else {
                    i33 = i32;
                }
            }
            if ((i19 & 306783379) == 306783378 || (i33 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (rVar2.T(i19 & 1, z3)) {
                rVarT = androidx.compose.ui.o.b;
                if (i38 != 0) {
                    rVar3 = rVarT;
                }
                if (i4 != 0) {
                    d3 = null;
                }
                if (i7 != 0) {
                    str5 = null;
                }
                if (i9 != 0) {
                    aVar3 = null;
                }
                if (i12 != 0) {
                    jVar3 = androidx.compose.ui.layout.i.a;
                } else {
                    jVar3 = jVar2;
                }
                if (i14 != 0) {
                    bVar3 = null;
                } else {
                    bVar3 = bVar;
                }
                if (i17 != 0) {
                    f6 = 0.0f;
                } else {
                    f6 = f2;
                }
                if (i20 != 0) {
                    z6 = false;
                } else {
                    z6 = z;
                }
                if (i23 != 0) {
                    z7 = false;
                } else {
                    z7 = z2;
                }
                if (i27 != 0) {
                    f7 = 0.6666667f;
                } else {
                    f7 = f3;
                }
                if (i31 != 0) {
                    str8 = null;
                } else {
                    str8 = str4;
                }
                objQ = rVar2.Q();
                obj = androidx.compose.runtime.m.a;
                if (objQ == obj) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                }
                androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                y0VarG = android.support.v4.media.session.b.g(kVar, rVar2, 6);
                if (((Boolean) y0VarG.getValue()).booleanValue()) {
                    j = com.app.mlounge.ui.theme.b.q;
                } else {
                    j = androidx.compose.ui.graphics.t.h;
                }
                i34 = i19;
                long j2 = j;
                final androidx.compose.ui.layout.j jVar4 = jVar3;
                if (((Boolean) y0VarG.getValue()).booleanValue()) {
                    f8 = 8;
                } else {
                    f8 = 2;
                }
                objQ2 = rVar2.Q();
                if (objQ2 == obj) {
                    objQ2 = androidx.compose.runtime.s.r(Boolean.FALSE);
                    rVar2.l0(objQ2);
                }
                y0Var = (y0) objQ2;
                objQ3 = rVar2.Q();
                if (objQ3 == obj) {
                    objQ3 = androidx.compose.runtime.s.r(Boolean.FALSE);
                    rVar2.l0(objQ3);
                }
                y0Var2 = (y0) objQ3;
                objQ4 = rVar2.Q();
                if (objQ4 == obj) {
                    objQ4 = androidx.compose.runtime.j0.f(rVar2);
                    rVar2.l0(objQ4);
                }
                coroutineScope = (CoroutineScope) objQ4;
                objQ5 = rVar2.Q();
                if (objQ5 == obj) {
                    objQ5 = androidx.compose.runtime.s.r(null);
                    rVar2.l0(objQ5);
                }
                y0Var3 = (y0) objQ5;
                float f9 = 8;
                final float f10 = f6;
                androidx.compose.ui.r rVar6 = rVar3;
                androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(rVar3, androidx.compose.foundation.shape.e.a(f9)), 2, j2, androidx.compose.foundation.shape.e.a(f9));
                if (aVar3 != null) {
                    rVar2.b0(1532165806);
                    if ((i33 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean zH2 = z15 | rVar2.h(coroutineScope);
                    if ((i34 & 3670016) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z19 = zH2 | z16;
                    i35 = i34;
                    if ((i35 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z19 | z17;
                    objQ9 = rVar2.Q();
                    if (!z18 || objQ9 == obj) {
                        String str10 = str8;
                        objQ9 = new h0(str10, coroutineScope, aVar, y0Var2, y0Var, y0Var3, aVar3);
                        str9 = str10;
                        aVar5 = aVar;
                        rVar2.l0(objQ9);
                    } else {
                        aVar5 = aVar;
                        str9 = str8;
                    }
                    androidx.compose.ui.r rVarE = androidx.compose.ui.input.key.c.e(rVarT, (kotlin.jvm.functions.l) objQ9);
                    z8 = false;
                    rVar2.p(false);
                    Double d6 = d3;
                    rVar5 = rVarE;
                    d5 = d6;
                } else {
                    aVar5 = aVar;
                    y0Var = y0Var;
                    d5 = d3;
                    str9 = str8;
                    i35 = i34;
                    z8 = false;
                    rVar2.b0(742252983);
                    rVar2.p(false);
                    rVar5 = rVarT;
                }
                androidx.compose.ui.r rVarD = rVarG.d(rVar5);
                if (aVar3 == null) {
                    rVar2.b0(1535612819);
                    rVar2.p(z8);
                    aVar6 = null;
                } else {
                    rVar2.b0(1535612820);
                    if ((i33 & 7168) == 2048) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    zF = z9 | rVar2.f(aVar3);
                    objQ6 = rVar2.Q();
                    if (zF || objQ6 == obj) {
                        final int i40 = 0;
                        objQ6 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.components.e0
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                int i41 = i40;
                                kotlin.y yVar = kotlin.y.a;
                                y0 y0Var4 = y0Var;
                                kotlin.jvm.functions.a aVar7 = aVar3;
                                String str11 = str9;
                                switch (i41) {
                                    case 0:
                                        if (str11 != null) {
                                            kotlin.o oVar = com.app.mlounge.util.a.a;
                                        }
                                        y0Var4.setValue(Boolean.TRUE);
                                        aVar7.invoke();
                                        break;
                                    default:
                                        if (!((Boolean) y0Var4.getValue()).booleanValue()) {
                                            if (str11 != null) {
                                                kotlin.o oVar2 = com.app.mlounge.util.a.a;
                                            }
                                            aVar7.invoke();
                                        } else {
                                            if (str11 != null) {
                                                kotlin.o oVar3 = com.app.mlounge.util.a.a;
                                            }
                                            y0Var4.setValue(Boolean.FALSE);
                                        }
                                        break;
                                }
                                return yVar;
                            }
                        };
                        rVar2.l0(objQ6);
                    }
                    aVar6 = (kotlin.jvm.functions.a) objQ6;
                    rVar2.p(false);
                }
                i36 = i33 & 7168;
                if (i36 == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z20 = z10;
                if ((i35 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z20 | z11;
                objQ7 = rVar2.Q();
                if (z12 || objQ7 == obj) {
                    final int i41 = 1;
                    objQ7 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.components.e0
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            int i42 = i41;
                            kotlin.y yVar = kotlin.y.a;
                            y0 y0Var4 = y0Var;
                            kotlin.jvm.functions.a aVar7 = aVar5;
                            String str11 = str9;
                            switch (i42) {
                                case 0:
                                    if (str11 != null) {
                                        kotlin.o oVar = com.app.mlounge.util.a.a;
                                    }
                                    y0Var4.setValue(Boolean.TRUE);
                                    aVar7.invoke();
                                    break;
                                default:
                                    if (!((Boolean) y0Var4.getValue()).booleanValue()) {
                                        if (str11 != null) {
                                            kotlin.o oVar2 = com.app.mlounge.util.a.a;
                                        }
                                        aVar7.invoke();
                                    } else {
                                        if (str11 != null) {
                                            kotlin.o oVar3 = com.app.mlounge.util.a.a;
                                        }
                                        y0Var4.setValue(Boolean.FALSE);
                                    }
                                    break;
                            }
                            return yVar;
                        }
                    };
                    rVar2.l0(objQ7);
                }
                androidx.compose.ui.r rVarK = androidx.compose.foundation.s.k(rVarD, kVar, aVar6, (kotlin.jvm.functions.a) objQ7);
                if (str9 != null) {
                    rVar2.b0(742281133);
                    if (i36 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objQ8 = rVar2.Q();
                    if (z14 || objQ8 == obj) {
                        objQ8 = new com.app.mlounge.ui.q(str9);
                        rVar2.l0(objQ8);
                    }
                    rVarT = androidx.compose.ui.focus.d.t(rVarT, (kotlin.jvm.functions.l) objQ8);
                    z13 = false;
                } else {
                    z13 = false;
                    rVar2.b0(742283255);
                }
                rVar2.p(z13);
                final Double d7 = d5;
                final String str11 = str5;
                final boolean z21 = z6;
                final float f11 = f7;
                final boolean z22 = z7;
                final androidx.compose.ui.graphics.painter.b bVar4 = bVar3;
                t2.c(androidx.compose.foundation.s.m(rVarK.d(rVarT), kVar, 1), androidx.compose.foundation.shape.e.a(f9), t2.i(com.app.mlounge.ui.theme.b.d, rVar2, 6), t2.j(62, f8), androidx.compose.runtime.internal.k.c(1107814689, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.components.f0
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v17 */
                    /* JADX WARN: Type inference failed for: r1v18, types: [boolean, int] */
                    /* JADX WARN: Type inference failed for: r1v27 */
                    @Override // kotlin.jvm.functions.q
                    public final Object invoke(Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
                        ?? r1;
                        long j3;
                        androidx.compose.runtime.r rVar7;
                        androidx.compose.runtime.r rVar8 = (androidx.compose.runtime.r) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        androidx.compose.ui.j jVar5 = androidx.compose.ui.c.e;
                        ((androidx.compose.foundation.layout.w) obj2).getClass();
                        if (rVar8.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(jVar5, false);
                            int iHashCode = Long.hashCode(rVar8.T);
                            androidx.compose.runtime.internal.j jVarL = rVar8.l();
                            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar8, oVar);
                            androidx.compose.ui.node.g.b.getClass();
                            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                            rVar8.e0();
                            if (rVar8.S) {
                                rVar8.k(yVar);
                            } else {
                                rVar8.o0();
                            }
                            androidx.compose.runtime.s.x(rVar8, q0VarD, androidx.compose.ui.node.f.e);
                            androidx.compose.runtime.s.x(rVar8, jVarL, androidx.compose.ui.node.f.d);
                            androidx.compose.runtime.s.p(rVar8, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                            androidx.compose.runtime.s.t(rVar8, androidx.compose.ui.node.f.g);
                            androidx.compose.runtime.s.x(rVar8, rVarC, androidx.compose.ui.node.f.c);
                            androidx.compose.ui.graphics.painter.b bVarQ = bVar4;
                            if (bVarQ == null) {
                                rVar8.b0(-1992286185);
                                bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar8);
                            } else {
                                rVar8.b0(-1992286650);
                            }
                            rVar8.p(false);
                            androidx.compose.ui.graphics.painter.b bVar5 = bVarQ;
                            String str12 = str2;
                            if (str12 == null) {
                                str12 = "";
                            }
                            androidx.compose.ui.r rVarD2 = w0.d(oVar, 1.0f);
                            float f12 = f11;
                            androidx.compose.ui.r rVarG2 = androidx.compose.foundation.layout.b.g(rVarD2, f12);
                            String str13 = str;
                            coil3.compose.k.c(str12, str13, rVarG2, bVar5, bVar5, null, jVar4, rVar8, 36864, 0, 31712);
                            androidx.compose.ui.r rVarG3 = androidx.compose.foundation.layout.b.g(w0.d(oVar, 1.0f), f12);
                            kotlin.k kVar2 = new kotlin.k(Float.valueOf(0.35f), new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.h));
                            Float fValueOf = Float.valueOf(0.65f);
                            long j4 = androidx.compose.ui.graphics.t.b;
                            kotlin.k[] kVarArr = (kotlin.k[]) Arrays.copyOf(new kotlin.k[]{kVar2, new kotlin.k(fValueOf, new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.75f, j4))), new kotlin.k(Float.valueOf(1.0f), new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.97f, j4)))}, 3);
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L);
                            ArrayList arrayList = new ArrayList(kVarArr.length);
                            for (kotlin.k kVar3 : kVarArr) {
                                arrayList.add(new androidx.compose.ui.graphics.t(((androidx.compose.ui.graphics.t) kVar3.y).a));
                            }
                            ArrayList arrayList2 = new ArrayList(kVarArr.length);
                            for (kotlin.k kVar4 : kVarArr) {
                                arrayList2.add(Float.valueOf(((Number) kVar4.e).floatValue()));
                            }
                            androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.e(rVarG3, new androidx.compose.ui.graphics.e0(arrayList, arrayList2, jFloatToRawIntBits, jFloatToRawIntBits2)), rVar8, 0);
                            Double d8 = d7;
                            if (d8 == null || d8.doubleValue() <= 0.0d) {
                                r1 = 0;
                                rVar8.b0(-1629421477);
                                rVar8.p(false);
                            } else {
                                rVar8.b0(-1630185906);
                                r1 = 0;
                                f3.a(androidx.compose.foundation.layout.b.e(androidx.compose.foundation.layout.b.o(oVar, 6), androidx.compose.ui.c.z), androidx.compose.foundation.shape.e.a(4), d8.doubleValue() >= 7.0d ? androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.p) : d8.doubleValue() >= 5.0d ? androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.i) : androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.o), 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1350699997, new androidx.compose.animation.core.g0(d8, 18), rVar8), rVar8, 12582912, 120);
                                rVar8.p(false);
                            }
                            if (z21) {
                                rVar8.b0(-1629330461);
                                f3.a(androidx.compose.foundation.layout.b.e(androidx.compose.foundation.layout.b.o(oVar, 6), jVar5), androidx.compose.foundation.shape.e.a, androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.p), 0L, 0.0f, 0.0f, b0.e, rVar8, 12583296, 120);
                                rVar8.p(r1);
                            } else if (z22) {
                                rVar8.b0(-1628709438);
                                f3.a(androidx.compose.foundation.layout.b.e(androidx.compose.foundation.layout.b.o(oVar, 6), jVar5), androidx.compose.foundation.shape.e.a, androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.i), 0L, 0.0f, 0.0f, b0.f, rVar8, 12583296, 120);
                                rVar8.p(r1);
                            } else {
                                rVar8.b0(-1628210245);
                                rVar8.p(r1);
                            }
                            androidx.compose.ui.j jVar6 = androidx.compose.ui.c.D;
                            androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(w0.d(androidx.compose.foundation.layout.b.e(oVar, jVar6), 1.0f), 8);
                            androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar8, r1);
                            int iHashCode2 = Long.hashCode(rVar8.T);
                            androidx.compose.runtime.internal.j jVarL2 = rVar8.l();
                            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar8, rVarO);
                            androidx.compose.ui.node.g.b.getClass();
                            kotlin.jvm.functions.a aVar7 = androidx.compose.ui.node.f.b;
                            rVar8.e0();
                            if (rVar8.S) {
                                rVar8.k(aVar7);
                            } else {
                                rVar8.o0();
                            }
                            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                            androidx.compose.runtime.s.x(rVar8, vVarA, eVar);
                            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                            androidx.compose.runtime.s.x(rVar8, jVarL2, eVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode2);
                            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                            androidx.compose.runtime.s.p(rVar8, numValueOf, eVar3);
                            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                            androidx.compose.runtime.s.t(rVar8, dVar);
                            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                            androidx.compose.runtime.s.x(rVar8, rVarC2, eVar4);
                            p1 p1Var = u3.a;
                            androidx.compose.ui.text.m0 m0Var = ((t3) rVar8.j(p1Var)).n;
                            long j5 = androidx.compose.ui.graphics.t.d;
                            p3.b(str13, null, j5, 0L, null, 0L, new androidx.compose.ui.text.style.k(5), 0L, 2, false, 2, 0, m0Var, rVar8, 384, 24960, 109562);
                            androidx.compose.runtime.r rVar9 = rVar8;
                            String str14 = str11;
                            if (str14 != null) {
                                rVar9.b0(-1035013059);
                                j3 = j5;
                                p3.b(str14, null, androidx.compose.ui.graphics.t.b(0.7f, j5), 0L, null, 0L, null, 0L, 2, false, 1, 0, ((t3) rVar9.j(p1Var)).o, rVar9, 384, 24960, 110586);
                                androidx.compose.runtime.r rVar10 = rVar9;
                                rVar10.p(false);
                                rVar7 = rVar10;
                            } else {
                                j3 = j5;
                                rVar9.b0(-1034710747);
                                rVar9.p(false);
                                rVar7 = rVar9;
                            }
                            rVar7.p(true);
                            float f13 = f10;
                            if (f13 > 0.0f) {
                                rVar7.b0(-1627148991);
                                androidx.compose.ui.r rVarE2 = androidx.compose.foundation.layout.b.e(w0.f(w0.d(oVar, 1.0f), 3), jVar6);
                                androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(jVar5, false);
                                int iHashCode3 = Long.hashCode(rVar7.T);
                                androidx.compose.runtime.internal.j jVarL3 = rVar7.l();
                                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar7, rVarE2);
                                rVar7.e0();
                                if (rVar7.S) {
                                    rVar7.k(aVar7);
                                } else {
                                    rVar7.o0();
                                }
                                androidx.compose.runtime.s.x(rVar7, q0VarD2, eVar);
                                androidx.compose.runtime.s.x(rVar7, jVarL3, eVar2);
                                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar7, eVar3, rVar7, dVar);
                                androidx.compose.runtime.s.x(rVar7, rVarC3, eVar4);
                                androidx.compose.ui.r rVarD3 = w0.d(w0.c(oVar, 1.0f), 1.0f);
                                long jB = androidx.compose.ui.graphics.t.b(0.25f, j3);
                                androidx.compose.ui.graphics.j0 j0Var = androidx.compose.ui.graphics.a0.b;
                                androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.f(rVarD3, jB, j0Var), rVar7, 6);
                                androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.f(w0.d(w0.c(oVar, 1.0f), com.google.android.material.resources.c.b(f13, 0.0f, 1.0f)), com.app.mlounge.ui.theme.b.f, j0Var), rVar7, 0);
                                rVar7.p(true);
                                rVar7.p(false);
                            } else {
                                rVar7.b0(-1626416709);
                                rVar7.p(false);
                            }
                            rVar7.p(true);
                        } else {
                            rVar8.W();
                        }
                        return kotlin.y.a;
                    }
                }, rVar2), rVar2, 196608, 16);
                kotlin.jvm.functions.a aVar7 = aVar3;
                str7 = str9;
                aVar4 = aVar7;
                z4 = z21;
                d4 = d7;
                str6 = str5;
                f5 = f7;
                bVar2 = bVar3;
                rVar4 = rVar6;
                f4 = f10;
                z5 = z22;
                jVar2 = jVar4;
            } else {
                rVar2.W();
                bVar2 = bVar;
                f4 = f2;
                rVar4 = rVar3;
                d4 = d3;
                str6 = str5;
                aVar4 = aVar3;
                z4 = z;
                z5 = z2;
                f5 = f3;
                str7 = str4;
            }
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.components.c0
                    @Override // kotlin.jvm.functions.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iA = androidx.compose.runtime.s.A(i | 1);
                        int iA2 = androidx.compose.runtime.s.A(i2);
                        b0.h(str, str2, aVar, rVar4, d4, str6, aVar4, jVar2, bVar2, f4, z4, z5, f5, str7, (androidx.compose.runtime.r) obj2, iA, iA2, i3);
                        return kotlin.y.a;
                    }
                };
            }
        }
        i37 |= 3072;
        rVar3 = rVar;
        i4 = i3 & 16;
        if (i4 != 0) {
            i6 = i37 | 24576;
            d3 = d2;
        } else {
            d3 = d2;
            if (rVar2.f(d3)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i6 = i37 | i5;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            i6 |= 196608;
            str5 = str3;
        } else {
            str5 = str3;
            if ((i & 196608) == 0) {
                if (rVar2.f(str5)) {
                    i8 = 131072;
                } else {
                    i8 = Parser.ARGC_LIMIT;
                }
                i6 |= i8;
            }
        }
        i9 = i3 & 64;
        if (i9 != 0) {
            i11 = i6 | 1572864;
            aVar3 = aVar2;
        } else {
            aVar3 = aVar2;
            if (rVar2.h(aVar3)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i11 = i6 | i10;
        }
        i12 = i3 & 128;
        if (i12 != 0) {
            i11 |= 12582912;
            jVar2 = jVar;
        } else {
            jVar2 = jVar;
            if ((i & 12582912) == 0) {
                if (rVar2.f(jVar2)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i11 |= i13;
            }
        }
        i14 = i3 & LibretroCore.SCREEN_WIDTH;
        if (i14 != 0) {
            i15 = 100663296;
        } else {
            if ((i & 134217728) == 0) {
                zH = rVar2.f(bVar);
            } else {
                zH = rVar2.h(bVar);
            }
            if (zH) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
        }
        i16 = i11 | i15;
        i17 = i3 & 512;
        if (i17 != 0) {
            i19 = i16 | 805306368;
        } else {
            if (rVar2.c(f2)) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i19 = i16 | i18;
        }
        i20 = i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i20 != 0) {
            i22 = i2 | 6;
        } else {
            if (rVar2.g(z)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i22 = i2 | i21;
        }
        i23 = i3 & 2048;
        if (i23 != 0) {
            i25 = i22 | 48;
        } else {
            if (rVar2.g(z2)) {
                i24 = 32;
            } else {
                i24 = 16;
            }
            i25 = i22 | i24;
        }
        i26 = i25;
        i27 = i3 & 4096;
        if (i27 != 0) {
            i29 = i26 | 384;
        } else {
            i28 = i26;
            if ((i2 & 384) != 0) {
                if (rVar2.c(f3)) {
                    i30 = LibretroCore.SCREEN_WIDTH;
                } else {
                    i30 = 128;
                }
                i28 |= i30;
            }
            i29 = i28;
        }
        i31 = i3 & 8192;
        if (i31 != 0) {
            i33 = i29 | 3072;
        } else {
            i32 = i29;
            if ((i2 & 3072) == 0) {
                if (rVar2.f(str4)) {
                    i39 = 2048;
                }
                i33 = i32 | i39;
            } else {
                i33 = i32;
            }
        }
        if ((i19 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (rVar2.T(i19 & 1, z3)) {
            rVarT = androidx.compose.ui.o.b;
            if (i38 != 0) {
                rVar3 = rVarT;
            }
            if (i4 != 0) {
                d3 = null;
            }
            if (i7 != 0) {
                str5 = null;
            }
            if (i9 != 0) {
                aVar3 = null;
            }
            if (i12 != 0) {
                jVar3 = androidx.compose.ui.layout.i.a;
            } else {
                jVar3 = jVar2;
            }
            if (i14 != 0) {
                bVar3 = null;
            } else {
                bVar3 = bVar;
            }
            if (i17 != 0) {
                f6 = 0.0f;
            } else {
                f6 = f2;
            }
            if (i20 != 0) {
                z6 = false;
            } else {
                z6 = z;
            }
            if (i23 != 0) {
                z7 = false;
            } else {
                z7 = z2;
            }
            if (i27 != 0) {
                f7 = 0.6666667f;
            } else {
                f7 = f3;
            }
            if (i31 != 0) {
                str8 = null;
            } else {
                str8 = str4;
            }
            objQ = rVar2.Q();
            obj = androidx.compose.runtime.m.a;
            if (objQ == obj) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
            }
            androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ;
            y0VarG = android.support.v4.media.session.b.g(kVar2, rVar2, 6);
            if (((Boolean) y0VarG.getValue()).booleanValue()) {
                j = com.app.mlounge.ui.theme.b.q;
            } else {
                j = androidx.compose.ui.graphics.t.h;
            }
            i34 = i19;
            long j3 = j;
            final androidx.compose.ui.layout.j jVar5 = jVar3;
            if (((Boolean) y0VarG.getValue()).booleanValue()) {
                f8 = 8;
            } else {
                f8 = 2;
            }
            objQ2 = rVar2.Q();
            if (objQ2 == obj) {
                objQ2 = androidx.compose.runtime.s.r(Boolean.FALSE);
                rVar2.l0(objQ2);
            }
            y0Var = (y0) objQ2;
            objQ3 = rVar2.Q();
            if (objQ3 == obj) {
                objQ3 = androidx.compose.runtime.s.r(Boolean.FALSE);
                rVar2.l0(objQ3);
            }
            y0Var2 = (y0) objQ3;
            objQ4 = rVar2.Q();
            if (objQ4 == obj) {
                objQ4 = androidx.compose.runtime.j0.f(rVar2);
                rVar2.l0(objQ4);
            }
            coroutineScope = (CoroutineScope) objQ4;
            objQ5 = rVar2.Q();
            if (objQ5 == obj) {
                objQ5 = androidx.compose.runtime.s.r(null);
                rVar2.l0(objQ5);
            }
            y0Var3 = (y0) objQ5;
            float f12 = 8;
            final float f13 = f6;
            androidx.compose.ui.r rVar7 = rVar3;
            androidx.compose.ui.r rVarG2 = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(rVar3, androidx.compose.foundation.shape.e.a(f12)), 2, j3, androidx.compose.foundation.shape.e.a(f12));
            if (aVar3 != null) {
                rVar2.b0(1532165806);
                if ((i33 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zH3 = z15 | rVar2.h(coroutineScope);
                if ((i34 & 3670016) == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z110 = zH3 | z16;
                i35 = i34;
                if ((i35 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z110 | z17;
                objQ9 = rVar2.Q();
                if (z18) {
                    String str12 = str8;
                    objQ9 = new h0(str12, coroutineScope, aVar, y0Var2, y0Var, y0Var3, aVar3);
                    str9 = str12;
                    aVar5 = aVar;
                    rVar2.l0(objQ9);
                } else {
                    String str13 = str8;
                    objQ9 = new h0(str13, coroutineScope, aVar, y0Var2, y0Var, y0Var3, aVar3);
                    str9 = str13;
                    aVar5 = aVar;
                    rVar2.l0(objQ9);
                }
                androidx.compose.ui.r rVarE2 = androidx.compose.ui.input.key.c.e(rVarT, (kotlin.jvm.functions.l) objQ9);
                z8 = false;
                rVar2.p(false);
                Double d8 = d3;
                rVar5 = rVarE2;
                d5 = d8;
            } else {
                aVar5 = aVar;
                y0Var = y0Var;
                d5 = d3;
                str9 = str8;
                i35 = i34;
                z8 = false;
                rVar2.b0(742252983);
                rVar2.p(false);
                rVar5 = rVarT;
            }
            androidx.compose.ui.r rVarD2 = rVarG2.d(rVar5);
            if (aVar3 == null) {
                rVar2.b0(1535612819);
                rVar2.p(z8);
                aVar6 = null;
            } else {
                rVar2.b0(1535612820);
                if ((i33 & 7168) == 2048) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zF = z9 | rVar2.f(aVar3);
                objQ6 = rVar2.Q();
                if (zF) {
                    final int i42 = 0;
                    objQ6 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.components.e0
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            int i43 = i42;
                            kotlin.y yVar = kotlin.y.a;
                            y0 y0Var4 = y0Var;
                            kotlin.jvm.functions.a aVar8 = aVar3;
                            String str14 = str9;
                            switch (i43) {
                                case 0:
                                    if (str14 != null) {
                                        kotlin.o oVar = com.app.mlounge.util.a.a;
                                    }
                                    y0Var4.setValue(Boolean.TRUE);
                                    aVar8.invoke();
                                    break;
                                default:
                                    if (!((Boolean) y0Var4.getValue()).booleanValue()) {
                                        if (str14 != null) {
                                            kotlin.o oVar2 = com.app.mlounge.util.a.a;
                                        }
                                        aVar8.invoke();
                                    } else {
                                        if (str14 != null) {
                                            kotlin.o oVar3 = com.app.mlounge.util.a.a;
                                        }
                                        y0Var4.setValue(Boolean.FALSE);
                                    }
                                    break;
                            }
                            return yVar;
                        }
                    };
                    rVar2.l0(objQ6);
                } else {
                    final int i43 = 0;
                    objQ6 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.components.e0
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            int i44 = i43;
                            kotlin.y yVar = kotlin.y.a;
                            y0 y0Var4 = y0Var;
                            kotlin.jvm.functions.a aVar8 = aVar3;
                            String str14 = str9;
                            switch (i44) {
                                case 0:
                                    if (str14 != null) {
                                        kotlin.o oVar = com.app.mlounge.util.a.a;
                                    }
                                    y0Var4.setValue(Boolean.TRUE);
                                    aVar8.invoke();
                                    break;
                                default:
                                    if (!((Boolean) y0Var4.getValue()).booleanValue()) {
                                        if (str14 != null) {
                                            kotlin.o oVar2 = com.app.mlounge.util.a.a;
                                        }
                                        aVar8.invoke();
                                    } else {
                                        if (str14 != null) {
                                            kotlin.o oVar3 = com.app.mlounge.util.a.a;
                                        }
                                        y0Var4.setValue(Boolean.FALSE);
                                    }
                                    break;
                            }
                            return yVar;
                        }
                    };
                    rVar2.l0(objQ6);
                }
                aVar6 = (kotlin.jvm.functions.a) objQ6;
                rVar2.p(false);
            }
            i36 = i33 & 7168;
            if (i36 == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z23 = z10;
            if ((i35 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z23 | z11;
            objQ7 = rVar2.Q();
            if (z12) {
                final int i44 = 1;
                objQ7 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.components.e0
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        int i45 = i44;
                        kotlin.y yVar = kotlin.y.a;
                        y0 y0Var4 = y0Var;
                        kotlin.jvm.functions.a aVar8 = aVar5;
                        String str14 = str9;
                        switch (i45) {
                            case 0:
                                if (str14 != null) {
                                    kotlin.o oVar = com.app.mlounge.util.a.a;
                                }
                                y0Var4.setValue(Boolean.TRUE);
                                aVar8.invoke();
                                break;
                            default:
                                if (!((Boolean) y0Var4.getValue()).booleanValue()) {
                                    if (str14 != null) {
                                        kotlin.o oVar2 = com.app.mlounge.util.a.a;
                                    }
                                    aVar8.invoke();
                                } else {
                                    if (str14 != null) {
                                        kotlin.o oVar3 = com.app.mlounge.util.a.a;
                                    }
                                    y0Var4.setValue(Boolean.FALSE);
                                }
                                break;
                        }
                        return yVar;
                    }
                };
                rVar2.l0(objQ7);
            } else {
                final int i45 = 1;
                objQ7 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.components.e0
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        int i46 = i45;
                        kotlin.y yVar = kotlin.y.a;
                        y0 y0Var4 = y0Var;
                        kotlin.jvm.functions.a aVar8 = aVar5;
                        String str14 = str9;
                        switch (i46) {
                            case 0:
                                if (str14 != null) {
                                    kotlin.o oVar = com.app.mlounge.util.a.a;
                                }
                                y0Var4.setValue(Boolean.TRUE);
                                aVar8.invoke();
                                break;
                            default:
                                if (!((Boolean) y0Var4.getValue()).booleanValue()) {
                                    if (str14 != null) {
                                        kotlin.o oVar2 = com.app.mlounge.util.a.a;
                                    }
                                    aVar8.invoke();
                                } else {
                                    if (str14 != null) {
                                        kotlin.o oVar3 = com.app.mlounge.util.a.a;
                                    }
                                    y0Var4.setValue(Boolean.FALSE);
                                }
                                break;
                        }
                        return yVar;
                    }
                };
                rVar2.l0(objQ7);
            }
            androidx.compose.ui.r rVarK2 = androidx.compose.foundation.s.k(rVarD2, kVar2, aVar6, (kotlin.jvm.functions.a) objQ7);
            if (str9 != null) {
                rVar2.b0(742281133);
                if (i36 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ8 = rVar2.Q();
                if (z14) {
                    objQ8 = new com.app.mlounge.ui.q(str9);
                    rVar2.l0(objQ8);
                } else {
                    objQ8 = new com.app.mlounge.ui.q(str9);
                    rVar2.l0(objQ8);
                }
                rVarT = androidx.compose.ui.focus.d.t(rVarT, (kotlin.jvm.functions.l) objQ8);
                z13 = false;
            } else {
                z13 = false;
                rVar2.b0(742283255);
            }
            rVar2.p(z13);
            final Double d9 = d5;
            final String str14 = str5;
            final boolean z24 = z6;
            final float f14 = f7;
            final boolean z25 = z7;
            final androidx.compose.ui.graphics.painter.b bVar5 = bVar3;
            t2.c(androidx.compose.foundation.s.m(rVarK2.d(rVarT), kVar2, 1), androidx.compose.foundation.shape.e.a(f12), t2.i(com.app.mlounge.ui.theme.b.d, rVar2, 6), t2.j(62, f8), androidx.compose.runtime.internal.k.c(1107814689, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.components.f0
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v17 */
                /* JADX WARN: Type inference failed for: r1v18, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r1v27 */
                @Override // kotlin.jvm.functions.q
                public final Object invoke(Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
                    ?? r1;
                    long j4;
                    androidx.compose.runtime.r rVar8;
                    androidx.compose.runtime.r rVar9 = (androidx.compose.runtime.r) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    androidx.compose.ui.j jVar6 = androidx.compose.ui.c.e;
                    ((androidx.compose.foundation.layout.w) obj2).getClass();
                    if (rVar9.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(jVar6, false);
                        int iHashCode = Long.hashCode(rVar9.T);
                        androidx.compose.runtime.internal.j jVarL = rVar9.l();
                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar9, oVar);
                        androidx.compose.ui.node.g.b.getClass();
                        androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                        rVar9.e0();
                        if (rVar9.S) {
                            rVar9.k(yVar);
                        } else {
                            rVar9.o0();
                        }
                        androidx.compose.runtime.s.x(rVar9, q0VarD, androidx.compose.ui.node.f.e);
                        androidx.compose.runtime.s.x(rVar9, jVarL, androidx.compose.ui.node.f.d);
                        androidx.compose.runtime.s.p(rVar9, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                        androidx.compose.runtime.s.t(rVar9, androidx.compose.ui.node.f.g);
                        androidx.compose.runtime.s.x(rVar9, rVarC, androidx.compose.ui.node.f.c);
                        androidx.compose.ui.graphics.painter.b bVarQ = bVar5;
                        if (bVarQ == null) {
                            rVar9.b0(-1992286185);
                            bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar9);
                        } else {
                            rVar9.b0(-1992286650);
                        }
                        rVar9.p(false);
                        androidx.compose.ui.graphics.painter.b bVar6 = bVarQ;
                        String str15 = str2;
                        if (str15 == null) {
                            str15 = "";
                        }
                        androidx.compose.ui.r rVarD3 = w0.d(oVar, 1.0f);
                        float f15 = f14;
                        androidx.compose.ui.r rVarG3 = androidx.compose.foundation.layout.b.g(rVarD3, f15);
                        String str16 = str;
                        coil3.compose.k.c(str15, str16, rVarG3, bVar6, bVar6, null, jVar5, rVar9, 36864, 0, 31712);
                        androidx.compose.ui.r rVarG4 = androidx.compose.foundation.layout.b.g(w0.d(oVar, 1.0f), f15);
                        kotlin.k kVar3 = new kotlin.k(Float.valueOf(0.35f), new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.h));
                        Float fValueOf = Float.valueOf(0.65f);
                        long j5 = androidx.compose.ui.graphics.t.b;
                        kotlin.k[] kVarArr = (kotlin.k[]) Arrays.copyOf(new kotlin.k[]{kVar3, new kotlin.k(fValueOf, new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.75f, j5))), new kotlin.k(Float.valueOf(1.0f), new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.b(0.97f, j5)))}, 3);
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L);
                        ArrayList arrayList = new ArrayList(kVarArr.length);
                        for (kotlin.k kVar4 : kVarArr) {
                            arrayList.add(new androidx.compose.ui.graphics.t(((androidx.compose.ui.graphics.t) kVar4.y).a));
                        }
                        ArrayList arrayList2 = new ArrayList(kVarArr.length);
                        for (kotlin.k kVar5 : kVarArr) {
                            arrayList2.add(Float.valueOf(((Number) kVar5.e).floatValue()));
                        }
                        androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.e(rVarG4, new androidx.compose.ui.graphics.e0(arrayList, arrayList2, jFloatToRawIntBits, jFloatToRawIntBits2)), rVar9, 0);
                        Double d10 = d9;
                        if (d10 == null || d10.doubleValue() <= 0.0d) {
                            r1 = 0;
                            rVar9.b0(-1629421477);
                            rVar9.p(false);
                        } else {
                            rVar9.b0(-1630185906);
                            r1 = 0;
                            f3.a(androidx.compose.foundation.layout.b.e(androidx.compose.foundation.layout.b.o(oVar, 6), androidx.compose.ui.c.z), androidx.compose.foundation.shape.e.a(4), d10.doubleValue() >= 7.0d ? androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.p) : d10.doubleValue() >= 5.0d ? androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.i) : androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.o), 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1350699997, new androidx.compose.animation.core.g0(d10, 18), rVar9), rVar9, 12582912, 120);
                            rVar9.p(false);
                        }
                        if (z24) {
                            rVar9.b0(-1629330461);
                            f3.a(androidx.compose.foundation.layout.b.e(androidx.compose.foundation.layout.b.o(oVar, 6), jVar6), androidx.compose.foundation.shape.e.a, androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.p), 0L, 0.0f, 0.0f, b0.e, rVar9, 12583296, 120);
                            rVar9.p(r1);
                        } else if (z25) {
                            rVar9.b0(-1628709438);
                            f3.a(androidx.compose.foundation.layout.b.e(androidx.compose.foundation.layout.b.o(oVar, 6), jVar6), androidx.compose.foundation.shape.e.a, androidx.compose.ui.graphics.t.b(0.9f, com.app.mlounge.ui.theme.b.i), 0L, 0.0f, 0.0f, b0.f, rVar9, 12583296, 120);
                            rVar9.p(r1);
                        } else {
                            rVar9.b0(-1628210245);
                            rVar9.p(r1);
                        }
                        androidx.compose.ui.j jVar7 = androidx.compose.ui.c.D;
                        androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(w0.d(androidx.compose.foundation.layout.b.e(oVar, jVar7), 1.0f), 8);
                        androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar9, r1);
                        int iHashCode2 = Long.hashCode(rVar9.T);
                        androidx.compose.runtime.internal.j jVarL2 = rVar9.l();
                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar9, rVarO);
                        androidx.compose.ui.node.g.b.getClass();
                        kotlin.jvm.functions.a aVar8 = androidx.compose.ui.node.f.b;
                        rVar9.e0();
                        if (rVar9.S) {
                            rVar9.k(aVar8);
                        } else {
                            rVar9.o0();
                        }
                        androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                        androidx.compose.runtime.s.x(rVar9, vVarA, eVar);
                        androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                        androidx.compose.runtime.s.x(rVar9, jVarL2, eVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode2);
                        androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                        androidx.compose.runtime.s.p(rVar9, numValueOf, eVar3);
                        androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                        androidx.compose.runtime.s.t(rVar9, dVar);
                        androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                        androidx.compose.runtime.s.x(rVar9, rVarC2, eVar4);
                        p1 p1Var = u3.a;
                        androidx.compose.ui.text.m0 m0Var = ((t3) rVar9.j(p1Var)).n;
                        long j6 = androidx.compose.ui.graphics.t.d;
                        p3.b(str16, null, j6, 0L, null, 0L, new androidx.compose.ui.text.style.k(5), 0L, 2, false, 2, 0, m0Var, rVar9, 384, 24960, 109562);
                        androidx.compose.runtime.r rVar10 = rVar9;
                        String str17 = str14;
                        if (str17 != null) {
                            rVar10.b0(-1035013059);
                            j4 = j6;
                            p3.b(str17, null, androidx.compose.ui.graphics.t.b(0.7f, j6), 0L, null, 0L, null, 0L, 2, false, 1, 0, ((t3) rVar10.j(p1Var)).o, rVar10, 384, 24960, 110586);
                            androidx.compose.runtime.r rVar11 = rVar10;
                            rVar11.p(false);
                            rVar8 = rVar11;
                        } else {
                            j4 = j6;
                            rVar10.b0(-1034710747);
                            rVar10.p(false);
                            rVar8 = rVar10;
                        }
                        rVar8.p(true);
                        float f16 = f13;
                        if (f16 > 0.0f) {
                            rVar8.b0(-1627148991);
                            androidx.compose.ui.r rVarE3 = androidx.compose.foundation.layout.b.e(w0.f(w0.d(oVar, 1.0f), 3), jVar7);
                            androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(jVar6, false);
                            int iHashCode3 = Long.hashCode(rVar8.T);
                            androidx.compose.runtime.internal.j jVarL3 = rVar8.l();
                            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar8, rVarE3);
                            rVar8.e0();
                            if (rVar8.S) {
                                rVar8.k(aVar8);
                            } else {
                                rVar8.o0();
                            }
                            androidx.compose.runtime.s.x(rVar8, q0VarD2, eVar);
                            androidx.compose.runtime.s.x(rVar8, jVarL3, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar8, eVar3, rVar8, dVar);
                            androidx.compose.runtime.s.x(rVar8, rVarC3, eVar4);
                            androidx.compose.ui.r rVarD4 = w0.d(w0.c(oVar, 1.0f), 1.0f);
                            long jB = androidx.compose.ui.graphics.t.b(0.25f, j4);
                            androidx.compose.ui.graphics.j0 j0Var = androidx.compose.ui.graphics.a0.b;
                            androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.f(rVarD4, jB, j0Var), rVar8, 6);
                            androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.f(w0.d(w0.c(oVar, 1.0f), com.google.android.material.resources.c.b(f16, 0.0f, 1.0f)), com.app.mlounge.ui.theme.b.f, j0Var), rVar8, 0);
                            rVar8.p(true);
                            rVar8.p(false);
                        } else {
                            rVar8.b0(-1626416709);
                            rVar8.p(false);
                        }
                        rVar8.p(true);
                    } else {
                        rVar9.W();
                    }
                    return kotlin.y.a;
                }
            }, rVar2), rVar2, 196608, 16);
            kotlin.jvm.functions.a aVar8 = aVar3;
            str7 = str9;
            aVar4 = aVar8;
            z4 = z24;
            d4 = d9;
            str6 = str5;
            f5 = f7;
            bVar2 = bVar3;
            rVar4 = rVar7;
            f4 = f13;
            z5 = z25;
            jVar2 = jVar5;
        } else {
            rVar2.W();
            bVar2 = bVar;
            f4 = f2;
            rVar4 = rVar3;
            d4 = d3;
            str6 = str5;
            aVar4 = aVar3;
            z4 = z;
            z5 = z2;
            f5 = f3;
            str7 = str4;
        }
        q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.components.c0
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = androidx.compose.runtime.s.A(i | 1);
                    int iA2 = androidx.compose.runtime.s.A(i2);
                    b0.h(str, str2, aVar, rVar4, d4, str6, aVar4, jVar2, bVar2, f4, z4, z5, f5, str7, (androidx.compose.runtime.r) obj2, iA, iA2, i3);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void i(String str, androidx.compose.ui.r rVar, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar2, int i) {
        androidx.compose.ui.r rVar3;
        androidx.compose.runtime.r rVar4 = rVar2;
        rVar4.c0(-261870357);
        int i2 = i | (rVar4.f(str) ? 4 : 2) | 48 | (rVar4.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (rVar4.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            androidx.compose.foundation.layout.a0 a0Var = w0.c;
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
            int iHashCode = Long.hashCode(rVar4.T);
            androidx.compose.runtime.internal.j jVarL = rVar4.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar4, a0Var);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar4.e0();
            if (rVar4.S) {
                rVar4.k(yVar);
            } else {
                rVar4.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
            androidx.compose.runtime.s.x(rVar4, q0VarD, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
            androidx.compose.runtime.s.x(rVar4, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
            androidx.compose.runtime.s.p(rVar4, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
            androidx.compose.runtime.s.t(rVar4, dVar);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
            androidx.compose.runtime.s.x(rVar4, rVarC, eVar4);
            androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, rVar4, 48);
            int iHashCode2 = Long.hashCode(rVar4.T);
            androidx.compose.runtime.internal.j jVarL2 = rVar4.l();
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar4, oVar);
            rVar4.e0();
            if (rVar4.S) {
                rVar4.k(yVar);
            } else {
                rVar4.o0();
            }
            androidx.compose.runtime.s.x(rVar4, vVarA, eVar);
            androidx.compose.runtime.s.x(rVar4, jVarL2, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar4, eVar3, rVar4, dVar);
            androidx.compose.runtime.s.x(rVar4, rVarC2, eVar4);
            p3.b(str, null, com.app.mlounge.ui.theme.b.o, 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, ((t3) rVar4.j(u3.a)).j, rVar2, (i2 & 14) | 384, 0, 130042);
            rVar4 = rVar2;
            if (aVar != null) {
                rVar4.b0(-1166736630);
                androidx.compose.foundation.layout.b.d(rVar4, w0.f(oVar, 16));
                androidx.compose.foundation.layout.m0 m0Var = androidx.compose.material3.r.a;
                long j = com.app.mlounge.ui.theme.b.f;
                long j2 = androidx.compose.ui.graphics.t.d;
                long j3 = androidx.compose.ui.graphics.t.i;
                androidx.compose.material3.n0 n0Var = (androidx.compose.material3.n0) rVar4.j(androidx.compose.material3.o0.a);
                androidx.compose.material3.q qVar = n0Var.W;
                if (qVar == null) {
                    qVar = new androidx.compose.material3.q(androidx.compose.material3.o0.c(n0Var, androidx.compose.material3.tokens.j.a), androidx.compose.material3.o0.c(n0Var, androidx.compose.material3.tokens.j.j), androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.j.e, androidx.compose.material3.o0.c(n0Var, androidx.compose.material3.tokens.j.c)), androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.j.g, androidx.compose.material3.o0.c(n0Var, androidx.compose.material3.tokens.j.f)));
                    n0Var.W = qVar;
                }
                t2.b(aVar, null, false, null, qVar.a(j, j2, j3, j3), null, null, null, null, d, rVar4, ((i2 >> 6) & 14) | 805306368, 494);
                rVar4.p(false);
            } else {
                rVar4.b0(-1166358957);
                rVar4.p(false);
            }
            rVar4.p(true);
            rVar4.p(true);
            rVar3 = oVar;
        } else {
            rVar4.W();
            rVar3 = rVar;
        }
        q1 q1VarT = rVar4.t();
        if (q1VarT != null) {
            q1VarT.d = new w1(str, rVar3, aVar, i, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0264  */
    /* JADX WARN: Code duplicated, block: B:108:0x0289 A[LOOP:3: B:106:0x0283->B:108:0x0289, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:121:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:124:0x0306  */
    /* JADX WARN: Code duplicated, block: B:125:0x0309  */
    /* JADX WARN: Code duplicated, block: B:128:0x031b  */
    /* JADX WARN: Code duplicated, block: B:129:0x031d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0327  */
    /* JADX WARN: Code duplicated, block: B:133:0x0329  */
    /* JADX WARN: Code duplicated, block: B:137:0x0333  */
    /* JADX WARN: Code duplicated, block: B:140:0x0355  */
    /* JADX WARN: Code duplicated, block: B:142:0x0361  */
    /* JADX WARN: Code duplicated, block: B:145:0x0390  */
    public static final void j(final List list, final TmdbGenre tmdbGenre, final String str, final Integer num, final boolean z, final kotlin.jvm.functions.l lVar, final kotlin.jvm.functions.l lVar2, final kotlin.jvm.functions.l lVar3, final kotlin.jvm.functions.l lVar4, androidx.compose.ui.r rVar, final boolean z2, androidx.compose.runtime.r rVar2, final int i) {
        androidx.compose.ui.r rVar3;
        String strB;
        Object next;
        String str2;
        androidx.compose.runtime.f fVar;
        String strValueOf;
        ArrayList arrayList;
        Iterator it;
        int i2;
        boolean z3;
        Object objQ;
        Object objQ2;
        y0 y0VarG;
        long j;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objQ3;
        long jB;
        list.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        rVar2.c0(1619764482);
        int i3 = i | (rVar2.h(list) ? 4 : 2) | (rVar2.f(tmdbGenre) ? 32 : 16) | (rVar2.f(str) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar2.f(num) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (rVar2.g(z) ? 16384 : 8192) | (rVar2.h(lVar) ? 131072 : Parser.ARGC_LIMIT) | (rVar2.h(lVar2) ? 1048576 : 524288) | (rVar2.h(lVar3) ? 8388608 : 4194304) | (rVar2.h(lVar4) ? 67108864 : 33554432) | 805306368;
        if (rVar2.T(i3 & 1, ((306783379 & i3) == 306783378 && ((rVar2.g(z2) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            float f2 = 8;
            androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.p(w0.d(oVar, 1.0f), androidx.compose.foundation.s.o(rVar2), false), 12, f2);
            t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.g(f2), androidx.compose.ui.c.H, rVar2, 54);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarP);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, t0VarA, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            f1.b(t1.o(), "Filters", w0.l(oVar, 20), com.app.mlounge.ui.theme.b.m, rVar2, 3504, 0);
            if (tmdbGenre == null || (strB = tmdbGenre.b()) == null) {
                strB = "Genre";
            }
            List listP = com.google.common.base.c.p(new kotlin.k(null, "All Genres"));
            ArrayList arrayList2 = new ArrayList(kotlin.collections.p.y(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                TmdbGenre tmdbGenre2 = (TmdbGenre) it2.next();
                arrayList2.add(new kotlin.k(tmdbGenre2, tmdbGenre2.b()));
                strB = strB;
            }
            String str3 = strB;
            ArrayList arrayListX = kotlin.collections.o.X(listP, arrayList2);
            boolean z7 = (i3 & 458752) == 131072;
            Object objQ4 = rVar2.Q();
            androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
            if (z7 || objQ4 == fVar2) {
                objQ4 = new r1(6, lVar);
                rVar2.l0(objQ4);
            }
            int i4 = i3;
            k(str3, arrayListX, tmdbGenre, (kotlin.jvm.functions.l) objQ4, rVar2, (i3 << 3) & 896);
            Iterator it3 = com.app.mlounge.util.b.a.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!kotlin.jvm.internal.l.a(((kotlin.k) next).e, str));
            kotlin.k kVar = (kotlin.k) next;
            if (kVar == null || (str2 = (String) kVar.y) == null) {
                str2 = "Sort By";
            }
            List listP2 = com.google.common.base.c.p(new kotlin.k(null, "Default"));
            List<kotlin.k> list2 = com.app.mlounge.util.b.a;
            ArrayList arrayList3 = new ArrayList(kotlin.collections.p.y(list2, 10));
            for (kotlin.k kVar2 : list2) {
                arrayList3.add(new kotlin.k(kVar2.e, kVar2.y));
            }
            ArrayList arrayListX2 = kotlin.collections.o.X(listP2, arrayList3);
            boolean z8 = (3670016 & i4) == 1048576;
            Object objQ5 = rVar2.Q();
            if (z8) {
                fVar = fVar2;
            } else {
                fVar = fVar2;
                if (objQ5 == fVar) {
                }
                k(str2, arrayListX2, str, (kotlin.jvm.functions.l) objQ5, rVar2, i4 & 896);
                if (num != null || (strValueOf = String.valueOf(num.intValue())) == null) {
                    strValueOf = "Year";
                }
                List listP3 = com.google.common.base.c.p(new kotlin.k(null, "All Years"));
                List list3 = com.app.mlounge.util.b.b;
                arrayList = new ArrayList(kotlin.collections.p.y(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    arrayList.add(new kotlin.k(Integer.valueOf(iIntValue), String.valueOf(iIntValue)));
                    i4 = i4;
                }
                i2 = i4;
                ArrayList arrayListX3 = kotlin.collections.o.X(listP3, arrayList);
                if ((i2 & 29360128) == 8388608) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objQ = rVar2.Q();
                if (z3 || objQ == fVar) {
                    objQ = new r1(8, lVar3);
                    rVar2.l0(objQ);
                }
                k(strValueOf, arrayListX3, num, (kotlin.jvm.functions.l) objQ, rVar2, (i2 >> 3) & 896);
                if (z2) {
                    rVar2.b0(-1182192821);
                    objQ2 = rVar2.Q();
                    if (objQ2 == fVar) {
                        objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                    }
                    androidx.compose.foundation.interaction.k kVar3 = (androidx.compose.foundation.interaction.k) objQ2;
                    y0VarG = android.support.v4.media.session.b.g(kVar3, rVar2, 6);
                    androidx.compose.ui.r rVarA = androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f2));
                    float f3 = 2;
                    if (((Boolean) y0VarG.getValue()).booleanValue()) {
                        j = com.app.mlounge.ui.theme.b.q;
                    } else {
                        j = androidx.compose.ui.graphics.t.h;
                    }
                    androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(rVarA, f3, j, androidx.compose.foundation.shape.e.a(f2));
                    if ((i2 & 234881024) == 67108864) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((i2 & 57344) == 16384) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z4 | z5;
                    objQ3 = rVar2.Q();
                    if (z6 || objQ3 == fVar) {
                        objQ3 = new androidx.compose.foundation.selection.f(lVar4, z, 1);
                        rVar2.l0(objQ3);
                    }
                    androidx.compose.ui.r rVarM = androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar3, null, false, null, (kotlin.jvm.functions.a) objQ3, 28), kVar3, 1);
                    if (z) {
                        jB = androidx.compose.ui.graphics.t.b(0.3f, com.app.mlounge.ui.theme.b.j);
                    } else {
                        jB = com.app.mlounge.ui.theme.b.c;
                    }
                    rVar3 = oVar;
                    f3.a(rVarM, androidx.compose.foundation.shape.e.a(f2), jB, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(788676380, new p(z, 1, (byte) 0), rVar2), rVar2, 12582912, 120);
                    rVar2.p(false);
                } else {
                    rVar3 = oVar;
                    rVar2.b0(-1181038660);
                    rVar2.p(false);
                }
                rVar2.p(true);
            }
            objQ5 = new r1(7, lVar2);
            rVar2.l0(objQ5);
            k(str2, arrayListX2, str, (kotlin.jvm.functions.l) objQ5, rVar2, i4 & 896);
            if (num != null) {
                strValueOf = "Year";
            } else {
                strValueOf = "Year";
            }
            List listP4 = com.google.common.base.c.p(new kotlin.k(null, "All Years"));
            List list4 = com.app.mlounge.util.b.b;
            arrayList = new ArrayList(kotlin.collections.p.y(list4, 10));
            it = list4.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Number) it.next()).intValue();
                arrayList.add(new kotlin.k(Integer.valueOf(iIntValue2), String.valueOf(iIntValue2)));
                i4 = i4;
            }
            i2 = i4;
            ArrayList arrayListX4 = kotlin.collections.o.X(listP4, arrayList);
            if ((i2 & 29360128) == 8388608) {
                z3 = true;
            } else {
                z3 = false;
            }
            objQ = rVar2.Q();
            if (z3) {
                objQ = new r1(8, lVar3);
                rVar2.l0(objQ);
            } else {
                objQ = new r1(8, lVar3);
                rVar2.l0(objQ);
            }
            k(strValueOf, arrayListX4, num, (kotlin.jvm.functions.l) objQ, rVar2, (i2 >> 3) & 896);
            if (z2) {
                rVar2.b0(-1182192821);
                objQ2 = rVar2.Q();
                if (objQ2 == fVar) {
                    objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
                }
                androidx.compose.foundation.interaction.k kVar4 = (androidx.compose.foundation.interaction.k) objQ2;
                y0VarG = android.support.v4.media.session.b.g(kVar4, rVar2, 6);
                androidx.compose.ui.r rVarA2 = androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f2));
                float f4 = 2;
                if (((Boolean) y0VarG.getValue()).booleanValue()) {
                    j = com.app.mlounge.ui.theme.b.q;
                } else {
                    j = androidx.compose.ui.graphics.t.h;
                }
                androidx.compose.ui.r rVarG2 = androidx.compose.foundation.s.g(rVarA2, f4, j, androidx.compose.foundation.shape.e.a(f2));
                if ((i2 & 234881024) == 67108864) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((i2 & 57344) == 16384) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z4 | z5;
                objQ3 = rVar2.Q();
                if (z6) {
                    objQ3 = new androidx.compose.foundation.selection.f(lVar4, z, 1);
                    rVar2.l0(objQ3);
                } else {
                    objQ3 = new androidx.compose.foundation.selection.f(lVar4, z, 1);
                    rVar2.l0(objQ3);
                }
                androidx.compose.ui.r rVarM2 = androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG2, kVar4, null, false, null, (kotlin.jvm.functions.a) objQ3, 28), kVar4, 1);
                if (z) {
                    jB = androidx.compose.ui.graphics.t.b(0.3f, com.app.mlounge.ui.theme.b.j);
                } else {
                    jB = com.app.mlounge.ui.theme.b.c;
                }
                rVar3 = oVar;
                f3.a(rVarM2, androidx.compose.foundation.shape.e.a(f2), jB, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(788676380, new p(z, 1, (byte) 0), rVar2), rVar2, 12582912, 120);
                rVar2.p(false);
            } else {
                rVar3 = oVar;
                rVar2.b0(-1181038660);
                rVar2.p(false);
            }
            rVar2.p(true);
        } else {
            rVar2.W();
            rVar3 = rVar;
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            final androidx.compose.ui.r rVar4 = rVar3;
            q1VarT.d = new kotlin.jvm.functions.p(list, tmdbGenre, str, num, z, lVar, lVar2, lVar3, lVar4, rVar4, z2, i) { // from class: com.app.mlounge.ui.components.k0
                public final /* synthetic */ Integer A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ kotlin.jvm.functions.l C;
                public final /* synthetic */ kotlin.jvm.functions.l D;
                public final /* synthetic */ kotlin.jvm.functions.l E;
                public final /* synthetic */ kotlin.jvm.functions.l F;
                public final /* synthetic */ androidx.compose.ui.r G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ List e;
                public final /* synthetic */ TmdbGenre y;
                public final /* synthetic */ String z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.s.A(1);
                    b0.j(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (androidx.compose.runtime.r) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void k(String str, ArrayList arrayList, Object obj, kotlin.jvm.functions.l lVar, androidx.compose.runtime.r rVar, int i) {
        int i2;
        androidx.compose.runtime.r rVar2 = rVar;
        rVar2.c0(-74803891);
        if ((i & 6) == 0) {
            i2 = (rVar2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.h(arrayList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? rVar2.f(obj) : rVar2.h(obj) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar2.h(lVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (rVar2.T(i2 & 1, (i2 & 1171) != 1170)) {
            Object objQ = rVar2.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (objQ == fVar) {
                objQ = androidx.compose.runtime.s.r(Boolean.FALSE);
                rVar2.l0(objQ);
            }
            y0 y0Var = (y0) objQ;
            Object objQ2 = rVar2.Q();
            if (objQ2 == fVar) {
                objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ2;
            y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar2, 6);
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, oVar);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, q0VarD, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            float f2 = 8;
            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f2)), 2, ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f2));
            Object objQ3 = rVar2.Q();
            if (objQ3 == fVar) {
                objQ3 = new androidx.compose.foundation.lazy.n(y0Var, 8);
                rVar2.l0(objQ3);
            }
            f3.a(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ3, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f2), obj != null ? androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-724386066, new androidx.compose.foundation.contextmenu.f(14, obj, str), rVar2), rVar2, 12582912, 120);
            boolean zBooleanValue = ((Boolean) y0Var.getValue()).booleanValue();
            Object objQ4 = rVar2.Q();
            if (objQ4 == fVar) {
                objQ4 = new androidx.compose.foundation.lazy.n(y0Var, 9);
                rVar2.l0(objQ4);
            }
            androidx.compose.material3.p.a(zBooleanValue, (kotlin.jvm.functions.a) objQ4, w0.h(androidx.compose.foundation.s.f(oVar, com.app.mlounge.ui.theme.b.b, androidx.compose.ui.graphics.a0.b), 0.0f, 300, 1), 0L, null, null, null, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(2092769016, new androidx.compose.foundation.contextmenu.e(arrayList, lVar, obj, y0Var, 2), rVar2), rVar, 432, 2040);
            rVar2 = rVar;
            rVar2.p(true);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.material3.d(str, arrayList, obj, lVar, i, 3);
        }
    }

    public static final void l(String str, long j, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, int i) {
        rVar.c0(-1583729884);
        int i2 = i | (rVar.e(j) ? 32 : 16) | (rVar.h(aVar) ? 256 : 128);
        if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            Object objQ = rVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            float f2 = 12;
            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(androidx.compose.ui.o.b, androidx.compose.foundation.shape.e.a(f2)), 2, ((Boolean) android.support.v4.media.session.b.g(kVar, rVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f2));
            boolean z = (i2 & 896) == 256;
            Object objQ2 = rVar.Q();
            if (z || objQ2 == fVar) {
                objQ2 = new j2(1, aVar);
                rVar.l0(objQ2);
            }
            androidx.compose.ui.r rVarM = androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1);
            long j2 = com.app.mlounge.ui.theme.b.f;
            if (!androidx.compose.ui.graphics.t.c(j, j2)) {
                j2 = com.app.mlounge.ui.theme.b.b;
            }
            f3.a(rVarM, androidx.compose.foundation.shape.e.a(f2), j2, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-581934231, new androidx.compose.foundation.text.a(j, str, 2), rVar), rVar, 12582912, 120);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.text.b(str, j, aVar, i);
        }
    }

    public static final void m(final kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z, final kotlin.jvm.functions.p pVar, androidx.compose.runtime.r rVar2, final int i) {
        int i2;
        final androidx.compose.ui.r rVar3;
        final boolean z2;
        aVar.getClass();
        pVar.getClass();
        rVar2.c0(-563145657);
        if ((i & 6) == 0) {
            i2 = i | (rVar2.h(aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if (rVar2.T(i3 & 1, (i3 & 1171) != 1170)) {
            Object objQ = rVar2.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            float f2 = 2;
            long j = ((Boolean) android.support.v4.media.session.b.g(kVar, rVar2, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h;
            androidx.compose.foundation.shape.d dVarA = androidx.compose.foundation.shape.e.a(8);
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            t2.e(aVar, androidx.compose.foundation.s.g(oVar, f2, j, dVarA), true, null, kVar, null, androidx.compose.runtime.internal.k.c(797900009, new androidx.compose.runtime.saveable.a(pVar, 1, (byte) 0), rVar2), rVar2, (i3 & 14) | 1597824, 40);
            z2 = true;
            rVar3 = oVar;
        } else {
            rVar2.W();
            rVar3 = rVar;
            z2 = z;
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.components.q
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b0.m(aVar, rVar3, z2, pVar, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(i | 1));
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void n(androidx.compose.ui.r rVar, androidx.compose.runtime.r rVar2, int i) {
        androidx.compose.ui.r rVar3;
        rVar2.c0(1372479750);
        int i2 = i | 6;
        if (rVar2.T(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.foundation.layout.a0 a0Var = w0.c;
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, a0Var);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, q0VarD, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            o2.a(null, com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, rVar2, 48, 61);
            rVar2.p(true);
            rVar3 = androidx.compose.ui.o.b;
        } else {
            rVar2.W();
            rVar3 = rVar;
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new com.app.mlounge.ui.n(rVar3, i, 1);
        }
    }

    public static final void o(String str, kotlin.jvm.functions.l lVar, MusicGenre musicGenre, kotlin.jvm.functions.l lVar2, String str2, List list, kotlin.jvm.functions.l lVar3, androidx.compose.ui.r rVar, androidx.compose.runtime.r rVar2, int i) {
        androidx.compose.ui.r rVar3;
        List<String> list2 = list;
        androidx.compose.runtime.r rVar4 = rVar2;
        str.getClass();
        lVar.getClass();
        musicGenre.getClass();
        lVar2.getClass();
        str2.getClass();
        list2.getClass();
        lVar3.getClass();
        rVar4.c0(-1891279626);
        int i2 = i | (rVar4.f(str) ? 4 : 2) | (rVar4.h(lVar) ? 32 : 16) | (rVar4.h(musicGenre) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar4.h(lVar2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (rVar4.f(str2) ? 16384 : 8192) | (rVar4.h(list2) ? 131072 : Parser.ARGC_LIMIT) | (rVar4.h(lVar3) ? 1048576 : 524288) | 12582912;
        if (rVar4.T(i2 & 1, (4793491 & i2) != 4793490)) {
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            float f2 = 8;
            androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.p(w0.d(oVar, 1.0f), androidx.compose.foundation.s.o(rVar4), false), 12, f2);
            t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.g(f2), androidx.compose.ui.c.H, rVar4, 54);
            int iHashCode = Long.hashCode(rVar4.T);
            androidx.compose.runtime.internal.j jVarL = rVar4.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar4, rVarP);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar4.e0();
            if (rVar4.S) {
                rVar4.k(yVar);
            } else {
                rVar4.o0();
            }
            androidx.compose.runtime.s.x(rVar4, t0VarA, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar4, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(rVar4, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(rVar4, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar4, rVarC, androidx.compose.ui.node.f.c);
            f1.b(t1.o(), "Filters", w0.l(oVar, 20), com.app.mlounge.ui.theme.b.m, rVar2, 3504, 0);
            rVar4 = rVar2;
            List<String> listQ = com.google.common.base.c.q("MusicMp3", "YouTube Music");
            ArrayList arrayList = new ArrayList(kotlin.collections.p.y(listQ, 10));
            for (String str3 : listQ) {
                arrayList.add(new kotlin.k(str3, str3));
            }
            boolean z = (i2 & Token.ASSIGN_MOD) == 32;
            Object objQ = rVar4.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (z || objQ == fVar) {
                objQ = new r1(3, lVar);
                rVar4.l0(objQ);
            }
            k(str, arrayList, str, (kotlin.jvm.functions.l) objQ, rVar4, (i2 & 14) | ((i2 << 6) & 896));
            String strB = musicGenre.b();
            List<MusicGenre> list3 = com.app.mlounge.data.repository.a0.e;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.p.y(list3, 10));
            for (MusicGenre musicGenre2 : list3) {
                arrayList2.add(new kotlin.k(musicGenre2, musicGenre2.b()));
            }
            boolean z2 = (i2 & 7168) == 2048;
            Object objQ2 = rVar4.Q();
            if (z2 || objQ2 == fVar) {
                objQ2 = new r1(4, lVar2);
                rVar4.l0(objQ2);
            }
            k(strB, arrayList2, musicGenre, (kotlin.jvm.functions.l) objQ2, rVar4, i2 & 896);
            list2 = list;
            ArrayList arrayList3 = new ArrayList(kotlin.collections.p.y(list2, 10));
            for (String str4 : list2) {
                arrayList3.add(new kotlin.k(str4, str4));
            }
            boolean z3 = (3670016 & i2) == 1048576;
            Object objQ3 = rVar4.Q();
            if (z3 || objQ3 == fVar) {
                objQ3 = new r1(5, lVar3);
                rVar4.l0(objQ3);
            }
            k(str2, arrayList3, str2, (kotlin.jvm.functions.l) objQ3, rVar4, ((i2 >> 12) & 14) | ((i2 >> 6) & 896));
            rVar4.p(true);
            rVar3 = oVar;
        } else {
            rVar4.W();
            rVar3 = rVar;
        }
        q1 q1VarT = rVar4.t();
        if (q1VarT != null) {
            q1VarT.d = new j0(str, lVar, musicGenre, lVar2, str2, list2, lVar3, rVar3, i);
        }
    }

    public static final void p(final com.app.mlounge.ui.navigation.w wVar, final boolean z, final kotlin.jvm.functions.a aVar, final androidx.compose.ui.focus.y yVar, androidx.compose.runtime.r rVar, final int i) {
        long j;
        long j2;
        androidx.compose.runtime.r rVar2 = rVar;
        String str = wVar.b;
        rVar2.c0(831523471);
        int i2 = i | (rVar2.f(wVar) ? 4 : 2) | (rVar2.g(z) ? 32 : 16) | (rVar2.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar2.f(yVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (rVar2.T(i2 & 1, (i2 & 1171) != 1170)) {
            Object objQ = rVar2.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar2, 6);
            if (z) {
                j = com.app.mlounge.ui.theme.b.r;
            } else {
                j = ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.c : androidx.compose.ui.graphics.t.h;
            }
            long j3 = j;
            if (z) {
                j2 = com.app.mlounge.ui.theme.b.f;
            } else {
                j2 = ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.l : com.app.mlounge.ui.theme.b.m;
            }
            long j4 = j2;
            long j5 = ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h;
            androidx.compose.ui.h hVar = androidx.compose.ui.c.K;
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            float f2 = 4;
            float f3 = 2;
            float f4 = 12;
            androidx.compose.ui.r rVarF = androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(androidx.compose.foundation.layout.b.p(w0.d(oVar, 1.0f), f2, f3), androidx.compose.foundation.shape.e.a(f4)), f3, j5, androidx.compose.foundation.shape.e.a(f4)), j3, androidx.compose.foundation.shape.e.a(f4));
            boolean z2 = (i2 & 896) == 256;
            Object objQ2 = rVar2.Q();
            if (z2 || objQ2 == fVar) {
                objQ2 = new j2(4, aVar);
                rVar2.l0(objQ2);
            }
            androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.m(androidx.compose.ui.focus.d.k(androidx.compose.foundation.s.i(rVarF, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), yVar), kVar, 1), f2, 8);
            androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, hVar, rVar2, 48);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarP);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar2);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, vVarA, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            f1.b(z ? wVar.d : wVar.c, str, w0.l(oVar, 24), j4, rVar2, 384, 0);
            androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, f2));
            p3.b(str, null, j4, 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 2, false, 1, 0, ((t3) rVar2.j(u3.a)).o, rVar, 0, 24960, 109562);
            rVar2 = rVar;
            rVar2.p(true);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p(z, aVar, yVar, i) { // from class: com.app.mlounge.ui.components.p0
                public final /* synthetic */ androidx.compose.ui.focus.y A;
                public final /* synthetic */ boolean y;
                public final /* synthetic */ kotlin.jvm.functions.a z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.s.A(1);
                    b0.p(this.e, this.y, this.z, this.A, (androidx.compose.runtime.r) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void q(final String str, final List list, final kotlin.jvm.functions.l lVar, final androidx.compose.ui.focus.y yVar, androidx.compose.ui.focus.y yVar2, androidx.compose.ui.r rVar, androidx.compose.runtime.r rVar2, final int i) {
        androidx.compose.ui.focus.y yVar3;
        final androidx.compose.ui.r rVar3;
        androidx.compose.runtime.r rVar4;
        Object obj;
        boolean z;
        androidx.compose.runtime.r rVar5 = rVar2;
        list.getClass();
        lVar.getClass();
        yVar.getClass();
        yVar2.getClass();
        rVar5.c0(-1044233966);
        int i2 = i | (rVar5.f(str) ? 4 : 2) | (rVar5.h(list) ? 32 : 16) | (rVar5.h(lVar) ? LibretroCore.SCREEN_WIDTH : 128) | 196608;
        if (rVar5.T(i2 & 1, (74899 & i2) != 74898)) {
            b2 b2VarO = androidx.compose.foundation.s.o(rVar5);
            boolean zF = rVar5.f(list);
            Object objQ = rVar5.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (zF || objQ == fVar) {
                obj = objQ;
                int iU = kotlin.collections.a0.u(kotlin.collections.p.y(list, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iU >= 16 ? iU : 16);
                for (Object obj2 : list) {
                    linkedHashMap.put(obj2, new androidx.compose.ui.focus.y());
                }
                rVar5.l0(linkedHashMap);
                obj = linkedHashMap;
            }
            Map map = (Map) obj;
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            float f2 = 8;
            androidx.compose.ui.r rVarP = androidx.compose.foundation.s.p(androidx.compose.foundation.layout.b.q(androidx.compose.foundation.s.f(w0.c(w0.p(oVar, 80), 1.0f), com.app.mlounge.ui.theme.b.b, androidx.compose.ui.graphics.a0.b), 0.0f, f2, 1), b2VarO, true);
            Object objQ2 = rVar5.Q();
            if (objQ2 == fVar) {
                yVar3 = yVar2;
                objQ2 = new n0(yVar3, 0);
                rVar5.l0(objQ2);
            } else {
                yVar3 = yVar2;
            }
            androidx.compose.ui.r rVarI = androidx.compose.ui.focus.d.i(rVarP, (kotlin.jvm.functions.l) objQ2);
            androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, rVar5, 48);
            int iHashCode = Long.hashCode(rVar5.T);
            androidx.compose.runtime.internal.j jVarL = rVar5.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar5, rVarI);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar4 = androidx.compose.ui.node.f.b;
            rVar5.e0();
            if (rVar5.S) {
                rVar5.k(yVar4);
            } else {
                rVar5.o0();
            }
            androidx.compose.runtime.s.x(rVar5, vVarA, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar5, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(rVar5, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(rVar5, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar5, rVarC, androidx.compose.ui.node.f.c);
            float f3 = 12;
            androidx.compose.foundation.s.c(androidx.room.r.q(R.mipmap.ic_launcher_round, rVar5), w0.l(androidx.compose.foundation.layout.b.q(oVar, 0.0f, f3, 1), 40), null, null, 0.0f, rVar2, 440);
            androidx.compose.runtime.r rVar6 = rVar2;
            t2.d(androidx.compose.foundation.layout.b.p(oVar, f3, 4), 0.0f, com.app.mlounge.ui.theme.b.e, rVar6, 390, 2);
            androidx.compose.foundation.layout.b.d(rVar6, w0.f(oVar, f2));
            rVar6.b0(482379739);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.app.mlounge.ui.navigation.w wVar = (com.app.mlounge.ui.navigation.w) it.next();
                boolean z2 = kotlin.jvm.internal.l.a(str, wVar.a) || (str != null && kotlin.text.r.O(str, kotlin.text.k.v0(wVar.a, "/"), false));
                androidx.compose.ui.focus.y yVar5 = (androidx.compose.ui.focus.y) map.get(wVar);
                if (yVar5 == null) {
                    rVar6.b0(-805941422);
                    Object objQ3 = rVar6.Q();
                    if (objQ3 == fVar) {
                        objQ3 = new androidx.compose.ui.focus.y();
                        rVar6.l0(objQ3);
                    }
                    yVar5 = (androidx.compose.ui.focus.y) objQ3;
                    z = false;
                } else {
                    z = false;
                    rVar6.b0(-1688566933);
                }
                rVar6.p(z);
                boolean zF2 = rVar6.f(wVar) | ((i2 & 896) == 256);
                Object objQ4 = rVar6.Q();
                if (zF2 || objQ4 == fVar) {
                    objQ4 = new androidx.activity.compose.f(22, lVar, wVar);
                    rVar6.l0(objQ4);
                }
                p(wVar, z2, (kotlin.jvm.functions.a) objQ4, z2 ? yVar : yVar5, rVar6, 0);
            }
            rVar6.p(false);
            rVar6.p(true);
            rVar3 = oVar;
            rVar4 = rVar6;
        } else {
            yVar3 = yVar2;
            rVar5.W();
            rVar3 = rVar;
            rVar4 = rVar5;
        }
        q1 q1VarT = rVar4.t();
        if (q1VarT != null) {
            final androidx.compose.ui.focus.y yVar6 = yVar3;
            q1VarT.d = new kotlin.jvm.functions.p(str, list, lVar, yVar, yVar6, rVar3, i) { // from class: com.app.mlounge.ui.components.o0
                public final /* synthetic */ androidx.compose.ui.focus.y A;
                public final /* synthetic */ androidx.compose.ui.focus.y B;
                public final /* synthetic */ androidx.compose.ui.r C;
                public final /* synthetic */ String e;
                public final /* synthetic */ List y;
                public final /* synthetic */ kotlin.jvm.functions.l z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iA = androidx.compose.runtime.s.A(27649);
                    b0.q(this.e, this.y, this.z, this.A, this.B, this.C, (androidx.compose.runtime.r) obj3, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void r(String str, final String str2, boolean z, kotlin.jvm.functions.p pVar, final kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, int i, int i2) {
        boolean z2;
        int i3;
        kotlin.coroutines.d dVar;
        pVar.getClass();
        aVar.getClass();
        rVar.c0(-1833946259);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 = i | 384;
            z2 = z;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 = (rVar.g(z2) ? LibretroCore.SCREEN_WIDTH : 128) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        int i5 = i3 | 3072 | (rVar.h(pVar) ? 16384 : 8192);
        if (rVar.T(i5 & 1, (74899 & i5) != 74898)) {
            boolean z3 = i4 != 0 ? false : z2;
            Object objQ = rVar.Q();
            Object obj = androidx.compose.runtime.m.a;
            if (objQ == obj) {
                objQ = androidx.compose.runtime.s.r("");
                rVar.l0(objQ);
            }
            final y0 y0Var = (y0) objQ;
            Object objQ2 = rVar.Q();
            if (objQ2 == obj) {
                objQ2 = androidx.compose.runtime.s.r("");
                rVar.l0(objQ2);
            }
            final y0 y0Var2 = (y0) objQ2;
            Object objQ3 = rVar.Q();
            if (objQ3 == obj) {
                objQ3 = androidx.compose.runtime.s.r(Boolean.FALSE);
                rVar.l0(objQ3);
            }
            final y0 y0Var3 = (y0) objQ3;
            Object objQ4 = rVar.Q();
            if (objQ4 == obj) {
                objQ4 = androidx.compose.runtime.s.r(null);
                rVar.l0(objQ4);
            }
            final y0 y0Var4 = (y0) objQ4;
            Object objQ5 = rVar.Q();
            if (objQ5 == obj) {
                objQ5 = androidx.compose.runtime.s.r(Boolean.FALSE);
                rVar.l0(objQ5);
            }
            final y0 y0Var5 = (y0) objQ5;
            Object objQ6 = rVar.Q();
            if (objQ6 == obj) {
                objQ6 = androidx.compose.runtime.s.r(Boolean.FALSE);
                rVar.l0(objQ6);
            }
            final y0 y0Var6 = (y0) objQ6;
            Object objQ7 = rVar.Q();
            if (objQ7 == obj) {
                objQ7 = androidx.compose.runtime.s.r(Boolean.FALSE);
                rVar.l0(objQ7);
            }
            final y0 y0Var7 = (y0) objQ7;
            final k2 k2Var = (k2) rVar.j(l1.p);
            Object objQ8 = rVar.Q();
            if (objQ8 == obj) {
                objQ8 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            final androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ8;
            Object objQ9 = rVar.Q();
            if (objQ9 == obj) {
                objQ9 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            final androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ9;
            Object objQ10 = rVar.Q();
            if (objQ10 == obj) {
                objQ10 = new androidx.compose.ui.focus.y();
                rVar.l0(objQ10);
            }
            final androidx.compose.ui.focus.y yVar = (androidx.compose.ui.focus.y) objQ10;
            Object objQ11 = rVar.Q();
            if (objQ11 == obj) {
                objQ11 = new androidx.compose.ui.focus.y();
                rVar.l0(objQ11);
            }
            final androidx.compose.ui.focus.y yVar2 = (androidx.compose.ui.focus.y) objQ11;
            Object objQ12 = rVar.Q();
            if (objQ12 == obj) {
                objQ12 = new androidx.compose.ui.focus.y();
                rVar.l0(objQ12);
            }
            final androidx.compose.ui.focus.y yVar3 = (androidx.compose.ui.focus.y) objQ12;
            Object objQ13 = rVar.Q();
            if (objQ13 == obj) {
                objQ13 = new androidx.compose.ui.focus.y();
                rVar.l0(objQ13);
            }
            final androidx.compose.ui.focus.y yVar4 = (androidx.compose.ui.focus.y) objQ13;
            Boolean boolValueOf = Boolean.valueOf(((Boolean) y0Var6.getValue()).booleanValue());
            boolean zF = rVar.f(k2Var);
            Object objQ14 = rVar.Q();
            if (zF || objQ14 == obj) {
                objQ14 = new w(k2Var, y0Var6, null, 0);
                rVar.l0(objQ14);
            }
            androidx.compose.runtime.j0.c(rVar, boolValueOf, (kotlin.jvm.functions.p) objQ14);
            Boolean boolValueOf2 = Boolean.valueOf(((Boolean) y0Var7.getValue()).booleanValue());
            boolean zF2 = rVar.f(k2Var);
            Object objQ15 = rVar.Q();
            if (zF2 || objQ15 == obj) {
                dVar = null;
                objQ15 = new w(k2Var, y0Var7, null, 1);
                rVar.l0(objQ15);
            } else {
                dVar = null;
            }
            androidx.compose.runtime.j0.c(rVar, boolValueOf2, (kotlin.jvm.functions.p) objQ15);
            Object objQ16 = rVar.Q();
            if (objQ16 == obj) {
                objQ16 = new androidx.compose.foundation.interaction.g(kVar, y0Var6, dVar, 1);
                rVar.l0(objQ16);
            }
            androidx.compose.runtime.j0.c(rVar, kVar, (kotlin.jvm.functions.p) objQ16);
            Object objQ17 = rVar.Q();
            if (objQ17 == obj) {
                objQ17 = new androidx.compose.foundation.interaction.g(kVar2, y0Var7, dVar, 2);
                rVar.l0(objQ17);
            }
            androidx.compose.runtime.j0.c(rVar, kVar2, (kotlin.jvm.functions.p) objQ17);
            final boolean z4 = z3;
            t2.a(aVar, androidx.compose.runtime.internal.k.c(-2004296155, new o(z4, pVar, yVar3, y0Var, y0Var4, y0Var2, y0Var5, yVar2, yVar, yVar4), rVar), null, androidx.compose.runtime.internal.k.c(967492195, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.components.r
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj2, Object obj3) {
                    androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (rVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        androidx.compose.ui.r rVarK = androidx.compose.ui.focus.d.k(androidx.compose.ui.o.b, yVar4);
                        boolean z5 = z4;
                        boolean zG = rVar2.g(z5);
                        Object objQ18 = rVar2.Q();
                        if (zG || objQ18 == androidx.compose.runtime.m.a) {
                            objQ18 = new y(z5, yVar2, yVar, yVar3, 1);
                            rVar2.l0(objQ18);
                        }
                        t2.h(aVar, androidx.compose.ui.input.key.c.e(rVarK, (kotlin.jvm.functions.l) objQ18), false, null, null, null, null, b0.b, rVar2, 805306368, 508);
                    } else {
                        rVar2.W();
                    }
                    return kotlin.y.a;
                }
            }, rVar), androidx.compose.runtime.internal.k.c(-355686751, new s(str, 0), rVar), androidx.compose.runtime.internal.k.c(-1017276224, new kotlin.jvm.functions.p(str2, yVar, k2Var, z4, kVar, yVar2, kVar2, y0Var, y0Var6, y0Var3, yVar3, y0Var4, y0Var2, y0Var7, y0Var5) { // from class: com.app.mlounge.ui.components.t
                public final /* synthetic */ boolean A;
                public final /* synthetic */ androidx.compose.foundation.interaction.k B;
                public final /* synthetic */ androidx.compose.ui.focus.y C;
                public final /* synthetic */ androidx.compose.foundation.interaction.k D;
                public final /* synthetic */ y0 E;
                public final /* synthetic */ y0 F;
                public final /* synthetic */ y0 G;
                public final /* synthetic */ androidx.compose.ui.focus.y H;
                public final /* synthetic */ y0 I;
                public final /* synthetic */ y0 J;
                public final /* synthetic */ y0 K;
                public final /* synthetic */ String e;
                public final /* synthetic */ androidx.compose.ui.focus.y y;
                public final /* synthetic */ k2 z;

                /* JADX WARN: Code duplicated, block: B:44:0x0291  */
                /* JADX WARN: Code duplicated, block: B:47:0x02a6  */
                /* JADX WARN: Code duplicated, block: B:48:0x02b4  */
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj2, Object obj3) {
                    Object zVar;
                    androidx.compose.ui.focus.y yVar5;
                    y0 y0Var8;
                    int i6;
                    y0 y0Var9;
                    boolean z5;
                    androidx.compose.runtime.f fVar;
                    Object objQ18;
                    Object objQ19;
                    y0 y0Var10;
                    androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (rVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                        androidx.compose.ui.r rVarD = w0.d(oVar, 1.0f);
                        androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.g(12), androidx.compose.ui.c.K, rVar2, 54);
                        int iHashCode = Long.hashCode(rVar2.T);
                        androidx.compose.runtime.internal.j jVarL = rVar2.l();
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarD);
                        androidx.compose.ui.node.g.b.getClass();
                        androidx.compose.ui.node.y yVar6 = androidx.compose.ui.node.f.b;
                        rVar2.e0();
                        if (rVar2.S) {
                            rVar2.k(yVar6);
                        } else {
                            rVar2.o0();
                        }
                        androidx.compose.runtime.s.x(rVar2, vVarA, androidx.compose.ui.node.f.e);
                        androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
                        androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                        androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                        androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
                        p3.b(this.e, null, 0L, 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, null, rVar2, 0, 0, 261118);
                        y0 y0Var11 = this.E;
                        String str3 = (String) y0Var11.getValue();
                        y0 y0Var12 = this.F;
                        boolean z6 = !((Boolean) y0Var12.getValue()).booleanValue();
                        y0 y0Var13 = this.G;
                        boolean zBooleanValue = ((Boolean) y0Var13.getValue()).booleanValue();
                        androidx.compose.ui.text.input.g0 rVar3 = androidx.compose.ui.text.input.f0.e;
                        androidx.compose.ui.text.input.g0 rVar4 = zBooleanValue ? rVar3 : new androidx.compose.ui.text.input.r();
                        androidx.compose.foundation.text.q0 q0Var = new androidx.compose.foundation.text.q0(8, Token.EXPORT);
                        androidx.compose.material3.w1 w1Var = androidx.compose.material3.w1.a;
                        long j = com.app.mlounge.ui.theme.b.f;
                        long j2 = com.app.mlounge.ui.theme.b.e;
                        long j3 = com.app.mlounge.ui.theme.b.l;
                        k3 k3VarC = androidx.compose.material3.w1.c(j3, j3, j, j, j2, 0L, 0L, rVar2, 2147477244);
                        androidx.compose.ui.r rVarD2 = w0.d(oVar, 1.0f);
                        androidx.compose.ui.focus.y yVar7 = this.y;
                        androidx.compose.ui.r rVarK = androidx.compose.ui.focus.d.k(rVarD2, yVar7);
                        k2 k2Var2 = this.z;
                        boolean zF3 = rVar2.f(k2Var2);
                        boolean z7 = this.A;
                        boolean zG = zF3 | rVar2.g(z7);
                        Object objQ20 = rVar2.Q();
                        androidx.compose.ui.focus.y yVar8 = this.C;
                        androidx.compose.ui.focus.y yVar9 = this.H;
                        androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                        if (zG || objQ20 == fVar2) {
                            yVar5 = yVar8;
                            y0Var8 = y0Var12;
                            zVar = new z(k2Var2, z7, yVar5, yVar9, y0Var8);
                            rVar2.l0(zVar);
                        } else {
                            zVar = objQ20;
                            yVar5 = yVar8;
                            y0Var8 = y0Var12;
                        }
                        androidx.compose.ui.r rVarE = androidx.compose.ui.input.key.c.e(rVarK, (kotlin.jvm.functions.l) zVar);
                        Object objQ21 = rVar2.Q();
                        if (objQ21 == fVar2) {
                            objQ21 = new h2(y0Var8, 6);
                            rVar2.l0(objQ21);
                        }
                        androidx.compose.ui.r rVarT = androidx.compose.ui.focus.d.t(rVarE, (kotlin.jvm.functions.l) objQ21);
                        Object objQ22 = rVar2.Q();
                        y0 y0Var14 = this.I;
                        if (objQ22 == fVar2) {
                            i6 = 3;
                            objQ22 = new e(y0Var11, y0Var14, 3);
                            rVar2.l0(objQ22);
                        } else {
                            i6 = 3;
                        }
                        byte b2 = 0;
                        androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(1326687280, new p(z7, b2, b2), rVar2);
                        androidx.compose.runtime.internal.f fVarC2 = androidx.compose.runtime.internal.k.c(985855795, new androidx.compose.material3.m(y0Var13, i6), rVar2);
                        androidx.compose.ui.focus.y yVar10 = yVar5;
                        c2.a(str3, (kotlin.jvm.functions.l) objQ22, rVarT, false, z6, null, fVarC, null, null, fVarC2, rVar4, q0Var, null, true, 0, 0, this.B, null, k3VarC, rVar2, 806879280, 12779520, 6, 2964904);
                        androidx.compose.runtime.r rVar5 = rVar2;
                        if (z7) {
                            y0Var9 = y0Var14;
                            z5 = false;
                            rVar5.b0(-484777928);
                            rVar5.p(false);
                        } else {
                            rVar5.b0(-488717625);
                            y0 y0Var15 = this.J;
                            String str4 = (String) y0Var15.getValue();
                            y0 y0Var16 = this.K;
                            boolean z8 = !((Boolean) y0Var16.getValue()).booleanValue();
                            if (!((Boolean) y0Var13.getValue()).booleanValue()) {
                                rVar3 = new androidx.compose.ui.text.input.r();
                            }
                            androidx.compose.foundation.text.q0 q0Var2 = new androidx.compose.foundation.text.q0(8, Token.EXPORT);
                            k3 k3VarC2 = androidx.compose.material3.w1.c(j3, j3, j, j, j2, 0L, 0L, rVar5, 2147477244);
                            androidx.compose.ui.r rVarK2 = androidx.compose.ui.focus.d.k(w0.d(oVar, 1.0f), yVar10);
                            boolean zF4 = rVar5.f(k2Var2);
                            Object objQ23 = rVar5.Q();
                            if (zF4) {
                                fVar = fVar2;
                            } else {
                                fVar = fVar2;
                                if (objQ23 == fVar) {
                                }
                                androidx.compose.ui.r rVarE2 = androidx.compose.ui.input.key.c.e(rVarK2, (kotlin.jvm.functions.l) objQ23);
                                objQ18 = rVar5.Q();
                                if (objQ18 == fVar) {
                                    objQ18 = new h2(y0Var16, 5);
                                    rVar5.l0(objQ18);
                                }
                                androidx.compose.ui.r rVarT2 = androidx.compose.ui.focus.d.t(rVarE2, (kotlin.jvm.functions.l) objQ18);
                                objQ19 = rVar5.Q();
                                if (objQ19 == fVar) {
                                    y0Var10 = y0Var14;
                                    objQ19 = new e(y0Var15, y0Var10, 2);
                                    rVar5.l0(objQ19);
                                } else {
                                    y0Var10 = y0Var14;
                                }
                                y0Var9 = y0Var10;
                                c2.a(str4, (kotlin.jvm.functions.l) objQ19, rVarT2, false, z8, null, b0.c, null, null, null, rVar3, q0Var2, null, true, 0, 0, this.D, null, k3VarC2, rVar5, 1572912, 12779520, 6, 2965416);
                                rVar5 = rVar5;
                                z5 = false;
                                rVar5.p(false);
                            }
                            objQ23 = new a0(k2Var2, yVar7, yVar9, y0Var16);
                            rVar5.l0(objQ23);
                            androidx.compose.ui.r rVarE3 = androidx.compose.ui.input.key.c.e(rVarK2, (kotlin.jvm.functions.l) objQ23);
                            objQ18 = rVar5.Q();
                            if (objQ18 == fVar) {
                                objQ18 = new h2(y0Var16, 5);
                                rVar5.l0(objQ18);
                            }
                            androidx.compose.ui.r rVarT3 = androidx.compose.ui.focus.d.t(rVarE3, (kotlin.jvm.functions.l) objQ18);
                            objQ19 = rVar5.Q();
                            if (objQ19 == fVar) {
                                y0Var10 = y0Var14;
                                objQ19 = new e(y0Var15, y0Var10, 2);
                                rVar5.l0(objQ19);
                            } else {
                                y0Var10 = y0Var14;
                            }
                            y0Var9 = y0Var10;
                            c2.a(str4, (kotlin.jvm.functions.l) objQ19, rVarT3, false, z8, null, b0.c, null, null, null, rVar3, q0Var2, null, true, 0, 0, this.D, null, k3VarC2, rVar5, 1572912, 12779520, 6, 2965416);
                            rVar5 = rVar5;
                            z5 = false;
                            rVar5.p(false);
                        }
                        String str5 = (String) y0Var9.getValue();
                        if (str5 == null) {
                            rVar5.b0(-484749595);
                            rVar5.p(z5);
                        } else {
                            rVar5.b0(-484749594);
                            androidx.compose.runtime.r rVar6 = rVar5;
                            p3.b(str5, null, com.app.mlounge.ui.theme.b.o, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar5.j(u3.a)).l, rVar6, 384, 0, 131066);
                            rVar5 = rVar6;
                            rVar5.p(z5);
                        }
                        rVar5.b0(-483646056);
                        rVar5.p(z5);
                        rVar5.p(true);
                    } else {
                        rVar2.W();
                    }
                    return kotlin.y.a;
                }
            }, rVar), null, com.app.mlounge.ui.theme.b.b, 0L, com.app.mlounge.ui.theme.b.l, com.app.mlounge.ui.theme.b.m, 0.0f, null, rVar, 102435894, 54, 12948);
            z2 = z4;
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new u(str, str2, z2, pVar, aVar, i, i2);
        }
    }

    public static final void s(Context context, File file) {
        Uri uriD = FileProvider.d(context, context.getPackageName() + ".provider", file);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uriD, "application/vnd.android.package-archive");
        intent.setFlags(268435457);
        context.startActivity(intent);
    }

    public static final i0 t(androidx.compose.ui.graphics.vector.f fVar, long j, androidx.compose.runtime.r rVar, int i) {
        androidx.compose.ui.graphics.vector.j0 j0VarD = androidx.compose.ui.graphics.vector.b.d(fVar, rVar);
        boolean zF = ((((i & Token.ASSIGN_MOD) ^ 48) > 32 && rVar.e(j)) || (i & 48) == 32) | rVar.f(j0VarD);
        Object objQ = rVar.Q();
        if (zF || objQ == androidx.compose.runtime.m.a) {
            objQ = new i0(j0VarD, j);
            rVar.l0(objQ);
        }
        return (i0) objQ;
    }
}
