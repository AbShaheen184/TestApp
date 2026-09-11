package androidx.compose.animation;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.MotionEvent;
import androidx.appcompat.widget.c2;
import androidx.compose.ui.layout.q1;
import androidx.compose.ui.layout.r1;
import androidx.compose.ui.layout.s1;
import androidx.compose.ui.layout.t1;
import androidx.compose.ui.node.b2;
import androidx.compose.ui.node.y1;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.platform.p1;
import androidx.compose.ui.platform.v1;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, int i) {
        super(1);
        this.y = i;
        this.z = obj;
    }

    /* JADX WARN: Type inference failed for: r2v42, types: [androidx.compose.ui.layout.c1, androidx.compose.ui.node.a] */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.y;
        int i2 = 0;
        kotlin.coroutines.d dVar = null;
        kotlin.y yVar = kotlin.y.a;
        Object obj2 = this.z;
        switch (i) {
            case 0:
                return Boolean.valueOf(kotlin.jvm.internal.l.a(obj, obj2));
            case 1:
                androidx.compose.animation.core.r rVar = (androidx.compose.animation.core.r) obj;
                float f = rVar.b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = rVar.c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = rVar.d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = rVar.a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new androidx.compose.ui.graphics.t(androidx.compose.ui.graphics.t.a(androidx.compose.ui.graphics.a0.b(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, androidx.compose.ui.graphics.colorspace.d.x), (androidx.compose.ui.graphics.colorspace.c) obj2));
            case 2:
                androidx.compose.ui.draganddrop.g gVar = (androidx.compose.ui.draganddrop.g) obj;
                if (!gVar.e.K) {
                    return y1.y;
                }
                androidx.compose.ui.draganddrop.g gVar2 = gVar.M;
                y1 y1Var = y1.e;
                if (gVar2 != null) {
                    e eVar = new e((com.app.mlounge.data.music.e) obj2, 2);
                    if (eVar.invoke(gVar2) == y1Var) {
                        androidx.compose.ui.node.k.y(gVar2, eVar);
                    }
                }
                gVar.M = null;
                gVar.L = null;
                return y1Var;
            case 3:
                androidx.compose.ui.node.h0 h0Var = (androidx.compose.ui.node.h0) obj;
                ((androidx.activity.compose.h) obj2).invoke(h0Var);
                h0Var.b();
                return yVar;
            case 4:
                androidx.compose.ui.graphics.k0 k0Var = (androidx.compose.ui.graphics.k0) obj;
                androidx.compose.ui.draw.p pVar = (androidx.compose.ui.draw.p) obj2;
                k0Var.l(k0Var.J.a() * androidx.compose.foundation.contextmenu.h.d);
                k0Var.m(pVar.b);
                k0Var.g(pVar.c);
                k0Var.f(pVar.d);
                k0Var.p(pVar.e);
                return yVar;
            case 5:
                androidx.compose.ui.graphics.k0 k0Var2 = (androidx.compose.ui.graphics.k0) obj;
                androidx.compose.ui.graphics.o0 o0Var = (androidx.compose.ui.graphics.o0) obj2;
                k0Var2.i(o0Var.L);
                k0Var2.k(o0Var.M);
                k0Var2.c(o0Var.N);
                k0Var2.l(o0Var.O);
                float f8 = o0Var.P;
                if (k0Var2.E != f8) {
                    k0Var2.e |= 2048;
                    k0Var2.E = f8;
                }
                k0Var2.s(o0Var.Q);
                k0Var2.m(o0Var.R);
                k0Var2.g(o0Var.S);
                k0Var2.f(o0Var.T);
                k0Var2.p(o0Var.U);
                int i3 = o0Var.V;
                if (k0Var2.L != i3) {
                    k0Var2.e |= 524288;
                    k0Var2.L = i3;
                }
                return yVar;
            case 6:
                androidx.compose.ui.graphics.drawscope.d dVar2 = (androidx.compose.ui.graphics.drawscope.d) obj;
                androidx.compose.ui.graphics.layer.b bVar = (androidx.compose.ui.graphics.layer.b) obj2;
                androidx.compose.ui.graphics.j jVar = bVar.l;
                if (bVar.n && bVar.w && jVar != null) {
                    c2 c2VarB0 = dVar2.b0();
                    long jH = c2VarB0.H();
                    c2VarB0.w().f();
                    try {
                        ((c2) ((com.google.firebase.platforminfo.c) c2VarB0.y).e).w().a(jVar);
                        bVar.c(dVar2);
                    } finally {
                        androidx.privacysandbox.ads.adservices.java.internal.a.B(c2VarB0, jH);
                    }
                } else {
                    bVar.c(dVar2);
                }
                return yVar;
            case 7:
                androidx.compose.ui.graphics.vector.d0 d0Var = (androidx.compose.ui.graphics.vector.d0) obj;
                androidx.compose.ui.graphics.vector.c cVar = (androidx.compose.ui.graphics.vector.c) obj2;
                cVar.g(d0Var);
                kotlin.jvm.functions.l lVar = cVar.i;
                if (lVar != null) {
                    lVar.invoke(d0Var);
                }
                return yVar;
            case 8:
                ((androidx.compose.ui.input.pointer.b0) ((androidx.compose.ui.input.pointer.a0) obj2).e()).invoke((MotionEvent) obj);
                return yVar;
            case 9:
                Throwable th = (Throwable) obj;
                androidx.compose.ui.input.pointer.k0 k0Var3 = (androidx.compose.ui.input.pointer.k0) obj2;
                CancellableContinuationImpl cancellableContinuationImpl = k0Var3.z;
                if (cancellableContinuationImpl != null) {
                    cancellableContinuationImpl.cancel(th);
                }
                k0Var3.z = null;
                return yVar;
            case 10:
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) obj;
                androidx.compose.ui.node.g0 g0Var = (androidx.compose.ui.node.g0) obj2;
                if (aVar.x() != Integer.MAX_VALUE) {
                    if (aVar.c().b) {
                        aVar.Q();
                    }
                    for (Map.Entry entry : aVar.c().g.entrySet()) {
                        androidx.compose.ui.node.g0.a(g0Var, (androidx.compose.ui.layout.a) entry.getKey(), ((Number) entry.getValue()).intValue(), aVar.g());
                    }
                    androidx.compose.ui.node.d1 d1Var = aVar.g().N;
                    d1Var.getClass();
                    while (!d1Var.equals(g0Var.a.g())) {
                        for (androidx.compose.ui.layout.a aVar2 : g0Var.b(d1Var).keySet()) {
                            androidx.compose.ui.node.g0.a(g0Var, aVar2, g0Var.c(d1Var, aVar2), d1Var);
                        }
                        d1Var = d1Var.N;
                        d1Var.getClass();
                    }
                }
                return yVar;
            case 11:
                ((androidx.compose.runtime.collection.b) obj2).b((androidx.compose.ui.p) obj);
                return Boolean.TRUE;
            case 12:
                return Boolean.valueOf(((androidx.compose.ui.focus.e0) obj).S0(((androidx.compose.ui.focus.f) obj2).a));
            case 13:
                androidx.compose.ui.node.k0 k0Var4 = (androidx.compose.ui.node.k0) obj;
                androidx.compose.ui.platform.u uVar = ((androidx.compose.ui.platform.k) obj2).M;
                if (uVar.getInsetsListener().E.g() > 0) {
                    androidx.collection.z zVar = s1.a;
                    k0Var4.e = true;
                    androidx.compose.ui.node.n0 n0Var = k0Var4.A;
                    androidx.compose.ui.layout.x xVarW0 = n0Var.w0();
                    if (androidx.compose.ui.unit.j.a(k0Var4.y, 9223372034707292159L)) {
                        k0Var4.y = android.support.v4.media.session.b.I(xVarW0.E(0L));
                        k0Var4.z = xVarW0.u();
                    }
                    n0Var.A0().e0.b();
                    long jU = xVarW0.u();
                    androidx.collection.o0 o0Var2 = uVar.getInsetsListener().D;
                    int i4 = (int) (jU >> 32);
                    int i5 = (int) (jU & 4294967295L);
                    for (q1 q1Var : s1.b) {
                        Object objG = o0Var2.g(q1Var);
                        objG.getClass();
                        t1 t1Var = (t1) objG;
                        r1 r1Var = (r1) q1Var;
                        s1.a(k0Var4, r1Var.c, t1Var.h, i4, i5);
                        if (((Boolean) t1Var.b.getValue()).booleanValue()) {
                            s1.a(k0Var4, t1Var.f, t1Var.j, i4, i5);
                            s1.a(k0Var4, t1Var.g, t1Var.k, i4, i5);
                        }
                        s1.a(k0Var4, r1Var.d, t1Var.i, i4, i5);
                    }
                    androidx.collection.j0 j0Var = uVar.getInsetsListener().F;
                    if (j0Var.i()) {
                        androidx.compose.runtime.snapshots.q qVar = uVar.getInsetsListener().G;
                        Object[] objArr = j0Var.a;
                        int i6 = j0Var.b;
                        while (i2 < i6) {
                            androidx.compose.runtime.y0 y0Var = (androidx.compose.runtime.y0) objArr[i2];
                            androidx.compose.ui.layout.q qVar2 = (androidx.compose.ui.layout.q) qVar.get(i2);
                            Rect rect = (Rect) y0Var.getValue();
                            k0Var4.b(qVar2.b(), rect.left);
                            k0Var4.b(qVar2.d(), rect.top);
                            k0Var4.b(qVar2.c(), rect.right);
                            k0Var4.b(qVar2.a(), rect.bottom);
                            i2++;
                        }
                    }
                }
                return yVar;
            case 14:
                return Boolean.valueOf(((androidx.collection.n) obj2).a(((androidx.compose.ui.semantics.p) obj).g));
            case 15:
                return Boolean.valueOf(androidx.compose.ui.platform.i0.c((androidx.compose.ui.semantics.p) obj, (Resources) obj2));
            case 16:
                return new androidx.activity.compose.d((n1) obj2, 7);
            case 17:
                if (p1.b.compareAndSet(false, true)) {
                    ((Channel) obj2).mo28trySendJP2dKIU(yVar);
                }
                return yVar;
            case 18:
                androidx.compose.ui.graphics.drawscope.d dVar3 = (androidx.compose.ui.graphics.drawscope.d) obj;
                androidx.compose.ui.graphics.r rVarW = dVar3.b0().w();
                kotlin.jvm.functions.p pVar2 = ((androidx.compose.ui.platform.q1) obj2).A;
                if (pVar2 != null) {
                    pVar2.invoke(rVarW, (androidx.compose.ui.graphics.layer.b) dVar3.b0().z);
                }
                return yVar;
            case 19:
                androidx.compose.ui.text.input.m mVar = (androidx.compose.ui.text.input.m) obj;
                androidx.compose.foundation.text.input.internal.x xVar = mVar.b;
                if (xVar != null) {
                    xVar.closeConnection();
                    mVar.b = null;
                }
                v1 v1Var = (v1) obj2;
                androidx.compose.runtime.collection.b bVar2 = v1Var.d;
                Object[] objArr2 = bVar2.e;
                int i7 = bVar2.z;
                while (true) {
                    if (i2 >= i7) {
                        i2 = -1;
                    } else if (!kotlin.jvm.internal.l.a((b2) objArr2[i2], mVar)) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    bVar2.k(i2);
                }
                if (bVar2.z == 0) {
                    v1Var.b.invoke();
                }
                return yVar;
            case 20:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return yVar;
            case 21:
                androidx.compose.ui.semantics.v.c((androidx.compose.ui.semantics.x) obj, ((androidx.compose.ui.semantics.h) obj2).a);
                return yVar;
            case 22:
                kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.v.a;
                ((androidx.compose.ui.semantics.x) obj).b(androidx.compose.ui.semantics.t.a, com.google.common.base.c.p((String) obj2));
                return yVar;
            case 23:
                ((List) obj).add((Float) ((androidx.compose.foundation.lazy.layout.t0) obj2).invoke());
                return true;
            case 24:
                ((androidx.compose.ui.node.f0) obj2).Z((androidx.compose.ui.unit.c) obj);
                return yVar;
            default:
                androidx.compose.ui.geometry.c cVar2 = (androidx.compose.ui.geometry.c) obj;
                androidx.compose.ui.viewinterop.n nVar = (androidx.compose.ui.viewinterop.n) obj2;
                if (nVar.K) {
                    BuildersKt__Builders_commonKt.launch$default(nVar.z0(), null, null, new androidx.activity.compose.p(nVar, cVar2, dVar, 20), 3, null);
                }
                return yVar;
        }
    }
}
