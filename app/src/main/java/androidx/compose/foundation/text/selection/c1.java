package androidx.compose.foundation.text.selection;

import android.content.ClipDescription;
import androidx.compose.foundation.text.l1;
import androidx.compose.foundation.text.m1;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    public final q0 A;
    public boolean B;
    public final l1 a;
    public androidx.compose.foundation.text.r0 d;
    public kotlin.jvm.functions.a g;
    public androidx.compose.ui.platform.g1 h;
    public CoroutineScope i;
    public n j;
    public androidx.compose.ui.hapticfeedback.a k;
    public androidx.compose.ui.focus.y l;
    public final androidx.compose.runtime.h1 m;
    public final androidx.compose.runtime.h1 n;
    public long o;
    public androidx.compose.ui.text.l0 p;
    public long q;
    public final androidx.compose.runtime.h1 r;
    public final androidx.compose.runtime.h1 s;
    public int t;
    public androidx.compose.ui.text.input.x u;
    public q0 v;
    public androidx.compose.ui.text.l0 w;
    public final androidx.compose.runtime.h1 x;
    public final androidx.compose.foundation.text.input.internal.o y;
    public final a1 z;
    public androidx.compose.ui.text.input.q b = m1.a;
    public kotlin.jvm.functions.l c = new androidx.compose.foundation.lazy.i(7);
    public final androidx.compose.runtime.h1 e = androidx.compose.runtime.s.r(new androidx.compose.ui.text.input.x(7, 0, (String) null));
    public androidx.compose.ui.text.input.g0 f = androidx.compose.ui.text.input.f0.e;

    public c1(l1 l1Var) {
        this.a = l1Var;
        Boolean bool = Boolean.TRUE;
        this.m = androidx.compose.runtime.s.r(bool);
        this.n = androidx.compose.runtime.s.r(bool);
        this.o = 0L;
        this.q = 0L;
        this.r = androidx.compose.runtime.s.r(null);
        this.s = androidx.compose.runtime.s.r(null);
        this.t = -1;
        this.u = new androidx.compose.ui.text.input.x(7, 0L, (String) null);
        this.x = androidx.compose.runtime.s.r(Boolean.FALSE);
        androidx.compose.foundation.text.input.internal.o oVar = new androidx.compose.foundation.text.input.internal.o(8, false);
        oVar.z = androidx.compose.foundation.text.contextmenu.modifier.k.e;
        this.y = oVar;
        this.z = new a1(this);
        this.A = new q0(this);
    }

    public static final kotlin.k a(c1 c1Var) {
        String str;
        androidx.compose.ui.text.l0 l0Var;
        androidx.compose.ui.text.g gVarM = c1Var.m();
        if (gVarM == null || (str = gVarM.y) == null || (l0Var = c1Var.w) == null) {
            return null;
        }
        long j = l0Var.a;
        return new kotlin.k(str, new androidx.compose.ui.text.l0(androidx.compose.ui.text.d0.b(c1Var.b.v((int) (j >> 32)), c1Var.b.v((int) (j & 4294967295L)))));
    }

    public static final void b(c1 c1Var, androidx.compose.ui.text.l0 l0Var) {
        androidx.compose.ui.text.g gVarM;
        String str;
        CoroutineScope coroutineScope;
        if (l0Var == null) {
            return;
        }
        long j = l0Var.a;
        n nVar = c1Var.j;
        if (nVar == null || (gVarM = c1Var.m()) == null || (str = gVarM.y) == null) {
            return;
        }
        androidx.compose.ui.text.input.q qVar = c1Var.b;
        long jB = androidx.compose.ui.text.d0.b(qVar.v((int) (j >> 32)), qVar.v((int) (j & 4294967295L)));
        if (str.length() <= 0 || androidx.compose.ui.text.l0.c(jB) || (coroutineScope = c1Var.i) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.gestures.h(nVar, str, jB, l0Var, c1Var, qVar, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0155  */
    public static final long c(c1 c1Var, androidx.compose.ui.text.input.x xVar, long j, boolean z, boolean z2, androidx.collection.g gVar, boolean z3) {
        androidx.compose.foundation.text.k1 k1VarD;
        long j2;
        z zVar;
        z zVar2;
        boolean z4;
        androidx.compose.ui.hapticfeedback.a aVar;
        y yVarD;
        y yVar;
        y yVar2;
        z zVar3;
        androidx.compose.foundation.text.r0 r0Var = c1Var.d;
        if (r0Var == null || (k1VarD = r0Var.d()) == null) {
            return androidx.compose.ui.text.l0.b;
        }
        androidx.compose.ui.text.input.q qVar = c1Var.b;
        long j3 = xVar.b;
        androidx.compose.ui.text.g gVar2 = xVar.a;
        int i = androidx.compose.ui.text.l0.c;
        long jB = androidx.compose.ui.text.d0.b(qVar.v((int) (j3 >> 32)), c1Var.b.v((int) (j3 & 4294967295L)));
        int iB = k1VarD.b(j, false);
        int i2 = (z2 || z) ? iB : (int) (jB >> 32);
        int i3 = (!z2 || z) ? iB : (int) (jB & 4294967295L);
        q0 q0Var = c1Var.v;
        int i4 = -1;
        if (z || q0Var == null) {
            j2 = 4294967295L;
        } else {
            j2 = 4294967295L;
            int i5 = c1Var.t;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        androidx.compose.ui.text.j0 j0Var = k1VarD.a;
        if (z) {
            zVar = null;
        } else {
            int i6 = (int) (jB >> 32);
            int i7 = (int) (jB & j2);
            zVar = new z(new y(com.google.android.gms.dynamite.g.s(j0Var, i6), i6, 1L), new y(com.google.android.gms.dynamite.g.s(j0Var, i7), i7, 1L), androidx.compose.ui.text.l0.g(jB));
        }
        q0 q0Var2 = new q0(z2, zVar, new w(i2, i3, i4, j0Var));
        if (zVar != null && q0Var != null && z2 == q0Var.y) {
            w wVar = (w) q0Var.A;
            if (i2 == wVar.b && i3 == wVar.c) {
                return j3;
            }
        }
        c1Var.v = q0Var2;
        c1Var.t = iB;
        int i8 = gVar.e;
        j jVar = j.e;
        switch (i8) {
            case 4:
                w wVar2 = (w) q0Var2.A;
                zVar2 = new z(wVar2.a(wVar2.b), wVar2.a(wVar2.c), q0Var2.e() == jVar);
                break;
            case 5:
                zVar2 = androidx.room.r.c(q0Var2, a0.c);
                break;
            case 6:
                zVar2 = androidx.room.r.c(q0Var2, a0.b);
                break;
            default:
                zVar2 = (z) q0Var2.z;
                w wVar3 = (w) q0Var2.A;
                if (zVar2 != null) {
                    y yVar3 = zVar2.b;
                    y yVar4 = zVar2.a;
                    if (q0Var2.y) {
                        yVarD = androidx.room.r.d(q0Var2, wVar3, yVar4);
                        yVar2 = yVar3;
                        yVar3 = yVar4;
                        yVar = yVarD;
                    } else {
                        yVarD = androidx.room.r.d(q0Var2, wVar3, yVar3);
                        yVar = yVar4;
                        yVar2 = yVarD;
                    }
                    if (!kotlin.jvm.internal.l.a(yVarD, yVar3)) {
                        z zVar4 = new z(yVar, yVar2, q0Var2.e() == jVar || (q0Var2.e() == j.z && yVar.b > yVar2.b));
                        w wVar4 = (w) q0Var2.A;
                        y yVar5 = zVar4.a;
                        long j4 = yVar5.c;
                        y yVar6 = zVar4.b;
                        if (j4 != yVar6.c) {
                            boolean z5 = zVar4.c;
                            if ((z5 ? yVar5 : yVar6).b == 0) {
                                if (((androidx.compose.ui.text.j0) wVar4.e).a.a.y.length() == (z5 ? yVar6 : yVar5).b) {
                                    zVar3 = (z) q0Var2.z;
                                    String str = ((androidx.compose.ui.text.j0) wVar4.e).a.a.y;
                                    if (zVar3 == null) {
                                    }
                                }
                            }
                        } else if (yVar5.b == yVar6.b) {
                            zVar3 = (z) q0Var2.z;
                            String str2 = ((androidx.compose.ui.text.j0) wVar4.e).a.a.y;
                            if (zVar3 == null && str2.length() != 0) {
                                boolean z6 = q0Var2.y;
                                String str3 = ((androidx.compose.ui.text.j0) wVar4.e).a.a.y;
                                int i9 = wVar4.b;
                                int length = str3.length();
                                if (i9 == 0) {
                                    int iL = androidx.compose.foundation.text.n0.l(0, str3);
                                    zVar2 = !z6 ? z.a(zVar4, null, androidx.room.r.f(yVar6, wVar4, iL), false, 1) : z.a(zVar4, androidx.room.r.f(yVar5, wVar4, iL), null, true, 2);
                                } else if (i9 != length) {
                                    boolean z7 = zVar3.c;
                                    int iO = z6 ^ z7 ? androidx.compose.foundation.text.n0.o(i9, str3) : androidx.compose.foundation.text.n0.l(i9, str3);
                                    zVar2 = !z6 ? z.a(zVar4, null, androidx.room.r.f(yVar6, wVar4, iO), z7, 1) : z.a(zVar4, androidx.room.r.f(yVar5, wVar4, iO), null, z7, 2);
                                } else {
                                    int iO2 = androidx.compose.foundation.text.n0.o(length, str3);
                                    zVar2 = !z6 ? z.a(zVar4, null, androidx.room.r.f(yVar6, wVar4, iO2), true, 1) : z.a(zVar4, androidx.room.r.f(yVar5, wVar4, iO2), null, false, 2);
                                }
                                break;
                            }
                        }
                        zVar2 = zVar4;
                    }
                } else {
                    zVar2 = androidx.room.r.c(q0Var2, a0.c);
                }
                break;
        }
        long jB2 = androidx.compose.ui.text.d0.b(c1Var.b.j(zVar2.a.b), c1Var.b.j(zVar2.b.b));
        if (androidx.compose.ui.text.l0.b(jB2, j3)) {
            return j3;
        }
        boolean z8 = androidx.compose.ui.text.l0.g(jB2) != androidx.compose.ui.text.l0.g(j3) && androidx.compose.ui.text.l0.b(androidx.compose.ui.text.d0.b((int) (jB2 & j2), (int) (jB2 >> 32)), j3);
        boolean z9 = androidx.compose.ui.text.l0.c(jB2) && androidx.compose.ui.text.l0.c(j3);
        if (z3 && gVar2.y.length() > 0 && !z8 && !z9 && (aVar = c1Var.k) != null) {
            aVar.a(9);
        }
        c1Var.c.invoke(e(gVar2, jB2));
        c1Var.w = new androidx.compose.ui.text.l0(jB2);
        if (!z3) {
            c1Var.t(!androidx.compose.ui.text.l0.c(jB2));
        }
        androidx.compose.foundation.text.r0 r0Var2 = c1Var.d;
        if (r0Var2 != null) {
            r0Var2.q.setValue(Boolean.valueOf(z3));
        }
        androidx.compose.foundation.text.r0 r0Var3 = c1Var.d;
        if (r0Var3 != null) {
            r0Var3.m.setValue(Boolean.valueOf(!androidx.compose.ui.text.l0.c(jB2) && okhttp3.internal.platform.android.g.y(c1Var, true)));
        }
        androidx.compose.foundation.text.r0 r0Var4 = c1Var.d;
        if (r0Var4 != null) {
            z4 = false;
            r0Var4.n.setValue(Boolean.valueOf(!androidx.compose.ui.text.l0.c(jB2) && okhttp3.internal.platform.android.g.y(c1Var, false)));
        } else {
            z4 = false;
        }
        androidx.compose.foundation.text.r0 r0Var5 = c1Var.d;
        if (r0Var5 != null) {
            if (androidx.compose.ui.text.l0.c(jB2) && okhttp3.internal.platform.android.g.y(c1Var, true)) {
                z4 = true;
            }
            r0Var5.o.setValue(Boolean.valueOf(z4));
        }
        return jB2;
    }

    public static androidx.compose.ui.text.input.x e(androidx.compose.ui.text.g gVar, long j) {
        return new androidx.compose.ui.text.input.x(gVar, j, (androidx.compose.ui.text.l0) null);
    }

    public final Job d(boolean z) {
        CoroutineScope coroutineScope = this.i;
        kotlin.coroutines.d dVar = null;
        if (coroutineScope != null) {
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new x0(this, z, dVar, 0), 1, null);
        }
        return null;
    }

    public final void f() {
        CoroutineScope coroutineScope = this.i;
        if (coroutineScope != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new u0(this, null, 1), 1, null);
        }
    }

    public final void g(androidx.compose.ui.geometry.b bVar) {
        if (!androidx.compose.ui.text.l0.c(n().b)) {
            androidx.compose.foundation.text.r0 r0Var = this.d;
            androidx.compose.foundation.text.k1 k1VarD = r0Var != null ? r0Var.d() : null;
            int iE = (bVar == null || k1VarD == null) ? androidx.compose.ui.text.l0.e(n().b) : this.b.j(k1VarD.b(bVar.a, true));
            androidx.compose.ui.text.input.x xVarA = androidx.compose.ui.text.input.x.a(n(), null, androidx.compose.ui.text.d0.b(iE, iE), 5);
            this.c.invoke(xVarA);
            this.w = new androidx.compose.ui.text.l0(xVarA.b);
        }
        q((bVar == null || n().a.y.length() <= 0) ? androidx.compose.foundation.text.g0.e : androidx.compose.foundation.text.g0.z);
        t(false);
    }

    public final void h(boolean z) {
        androidx.compose.ui.focus.y yVar;
        androidx.compose.foundation.text.r0 r0Var = this.d;
        if (r0Var != null && !r0Var.b() && (yVar = this.l) != null) {
            androidx.compose.ui.focus.y.a(yVar);
        }
        this.u = n();
        t(z);
        q(androidx.compose.foundation.text.g0.y);
    }

    public final androidx.compose.ui.geometry.b i() {
        return (androidx.compose.ui.geometry.b) this.s.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public final long l(boolean z) {
        androidx.compose.foundation.text.k1 k1VarD;
        long j;
        androidx.compose.foundation.text.r0 r0Var = this.d;
        if (r0Var == null || (k1VarD = r0Var.d()) == null) {
            return 9205357640488583168L;
        }
        androidx.compose.ui.text.j0 j0Var = k1VarD.a;
        androidx.compose.ui.text.n nVar = j0Var.b;
        androidx.compose.ui.text.g gVarM = m();
        if (gVarM == null) {
            return 9205357640488583168L;
        }
        if (!kotlin.jvm.internal.l.a(gVarM.y, j0Var.a.a.y)) {
            return 9205357640488583168L;
        }
        androidx.compose.ui.text.input.x xVarN = n();
        if (z) {
            long j2 = xVarN.b;
            int i = androidx.compose.ui.text.l0.c;
            j = j2 >> 32;
        } else {
            long j3 = xVarN.b;
            int i2 = androidx.compose.ui.text.l0.c;
            j = j3 & 4294967295L;
        }
        int iV = this.b.v((int) j);
        boolean zG = androidx.compose.ui.text.l0.g(n().b);
        long j4 = j0Var.c;
        int iD = nVar.d(iV);
        if (iD >= nVar.f) {
            return 9205357640488583168L;
        }
        boolean z2 = j0Var.a(((!z || zG) && (z || !zG)) ? Math.max(iV + (-1), 0) : iV) == j0Var.g(iV);
        nVar.k(iV);
        int length = ((androidx.compose.ui.text.g) nVar.a.y).y.length();
        ArrayList arrayList = nVar.h;
        androidx.compose.ui.text.p pVar = (androidx.compose.ui.text.p) arrayList.get(iV == length ? com.google.common.base.c.k(arrayList) : androidx.compose.ui.text.d0.d(iV, arrayList));
        androidx.compose.ui.text.a aVar = pVar.a;
        int iD2 = pVar.d(iV);
        androidx.compose.ui.text.android.l lVar = aVar.d;
        return (((long) Float.floatToRawIntBits(com.google.android.material.resources.c.b(nVar.b(iD), 0.0f, (int) (j4 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(com.google.android.material.resources.c.b(z2 ? lVar.h(iD2, false) : lVar.i(iD2, false), 0.0f, (int) (j4 >> 32)))) << 32);
    }

    public final androidx.compose.ui.text.g m() {
        androidx.compose.foundation.text.r0 r0Var = this.d;
        if (r0Var != null) {
            return r0Var.a.a;
        }
        return null;
    }

    public final androidx.compose.ui.text.input.x n() {
        return (androidx.compose.ui.text.input.x) this.e.getValue();
    }

    public final void o() {
        Job job;
        androidx.compose.foundation.text.contextmenu.modifier.j jVar = (androidx.compose.foundation.text.contextmenu.modifier.j) this.y.y;
        if (jVar == null || (job = jVar.R) == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        jVar.R = null;
    }

    public final void p() {
        CoroutineScope coroutineScope = this.i;
        if (coroutineScope != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new u0(this, null, 2), 1, null);
        }
    }

    public final void q(androidx.compose.foundation.text.g0 g0Var) {
        androidx.compose.foundation.text.r0 r0Var = this.d;
        if (r0Var != null) {
            if (r0Var.a() == g0Var) {
                r0Var = null;
            }
            if (r0Var != null) {
                r0Var.k.setValue(g0Var);
            }
        }
    }

    public final void r() {
        androidx.compose.foundation.text.r0 r0Var;
        androidx.compose.foundation.text.contextmenu.provider.f fVar;
        androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
        kotlin.coroutines.d dVar = null;
        kotlin.jvm.functions.l lVarE = fVarE != null ? fVarE.e() : null;
        androidx.compose.runtime.snapshots.f fVarH = androidx.compose.runtime.snapshots.r.h(fVarE);
        try {
            if (!k() || ((r0Var = this.d) != null && !((Boolean) r0Var.q.getValue()).booleanValue())) {
                androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
                return;
            }
            androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
            androidx.compose.foundation.text.input.internal.o oVar = this.y;
            if (((androidx.compose.foundation.text.contextmenu.modifier.k) oVar.z) == androidx.compose.foundation.text.contextmenu.modifier.k.e) {
                androidx.compose.foundation.internal.b.c("ToolbarRequester is not initialized.");
            }
            androidx.compose.foundation.text.contextmenu.modifier.j jVar = (androidx.compose.foundation.text.contextmenu.modifier.j) oVar.y;
            if (jVar == null || !jVar.K) {
                return;
            }
            Job job = jVar.R;
            if ((job == null || !job.isActive()) && (fVar = (androidx.compose.foundation.text.contextmenu.provider.f) androidx.compose.ui.node.k.h(jVar, androidx.compose.foundation.text.contextmenu.provider.g.b)) != null) {
                jVar.R = BuildersKt__Builders_commonKt.launch$default(jVar.z0(), null, CoroutineStart.UNDISPATCHED, new androidx.compose.animation.b0(jVar, fVar, dVar, 11), 1, null);
            }
        } catch (Throwable th) {
            androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(kotlin.coroutines.jvm.internal.c cVar) {
        b1 b1Var;
        c1 c1Var;
        if (cVar instanceof b1) {
            b1Var = (b1) cVar;
            int i = b1Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                b1Var.A = i - Integer.MIN_VALUE;
            } else {
                b1Var = new b1(this, cVar);
            }
        } else {
            b1Var = new b1(this, cVar);
        }
        Object objValueOf = b1Var.y;
        int i2 = b1Var.A;
        if (i2 == 0) {
            kotlin.a.e(objValueOf);
            androidx.compose.ui.platform.g1 g1Var = this.h;
            if (g1Var != null) {
                b1Var.e = this;
                b1Var.A = 1;
                ClipDescription primaryClipDescription = ((androidx.compose.ui.platform.g) g1Var).a.a.getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*"));
                Object obj = kotlin.coroutines.intrinsics.a.e;
                if (objValueOf == obj) {
                    return obj;
                }
                c1Var = this;
            }
            return kotlin.y.a;
        }
        if (i2 != 1) {
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c1Var = b1Var.e;
        kotlin.a.e(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        c1Var.x.setValue(bool);
        return kotlin.y.a;
    }

    public final void t(boolean z) {
        androidx.compose.foundation.text.r0 r0Var = this.d;
        if (r0Var != null) {
            r0Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            r();
        } else {
            o();
        }
    }
}
