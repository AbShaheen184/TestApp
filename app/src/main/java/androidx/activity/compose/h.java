package androidx.activity.compose;

import androidx.collection.p0;
import androidx.compose.animation.core.a2;
import androidx.compose.animation.core.c2;
import androidx.compose.animation.core.d2;
import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.h0;
import androidx.compose.animation.core.k0;
import androidx.compose.animation.core.x1;
import androidx.compose.foundation.gestures.b3;
import androidx.compose.foundation.gestures.k1;
import androidx.compose.foundation.gestures.l2;
import androidx.compose.foundation.gestures.m2;
import androidx.compose.foundation.lazy.layout.w0;
import androidx.compose.foundation.text.r0;
import androidx.compose.material3.l3;
import androidx.compose.material3.n3;
import androidx.compose.material3.r2;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.w1;
import androidx.compose.runtime.y0;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.g0;
import androidx.compose.ui.graphics.n0;
import androidx.compose.ui.layout.b1;
import androidx.compose.ui.layout.c1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.x;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ h(n3 n3Var, a2 a2Var, y0 y0Var) {
        this.e = 25;
        this.y = a2Var;
        this.z = y0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                androidx.activity.compose.internal.c cVar = (androidx.activity.compose.internal.c) this.y;
                m mVar = (m) this.z;
                cVar.a(mVar);
                return new k(0, cVar, mVar);
            case 1:
                androidx.activity.compose.internal.c cVar2 = (androidx.activity.compose.internal.c) this.y;
                q qVar = (q) this.z;
                cVar2.a(qVar);
                return new k(1, cVar2, qVar);
            case 2:
                k0 k0Var = (k0) this.y;
                h0 h0Var = (h0) this.z;
                k0Var.a.b(h0Var);
                k0Var.b.setValue(Boolean.TRUE);
                return new k(2, k0Var, h0Var);
            case 3:
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.y, null, CoroutineStart.UNDISPATCHED, new c2((e2) this.z, null), 1, null);
                return new d2();
            case 4:
                e2 e2Var = (e2) this.y;
                a2 a2Var = (a2) this.z;
                e2Var.i.add(a2Var);
                return new k(5, e2Var, a2Var);
            case 5:
                e2 e2Var2 = (e2) this.y;
                e2 e2Var3 = (e2) this.z;
                e2Var2.j.add(e2Var3);
                return new k(3, e2Var2, e2Var3);
            case 6:
                return new k(4, (e2) this.y, (x1) this.z);
            case 7:
                ((androidx.compose.foundation.interaction.k) this.y).b((androidx.compose.foundation.interaction.l) this.z);
                return y.a;
            case 8:
                androidx.compose.ui.graphics.j jVar = (androidx.compose.ui.graphics.j) this.y;
                androidx.compose.ui.graphics.p pVar = (androidx.compose.ui.graphics.p) this.z;
                androidx.compose.ui.node.h0 h0Var2 = (androidx.compose.ui.node.h0) obj;
                h0Var2.b();
                androidx.compose.ui.graphics.drawscope.d.C(h0Var2, jVar, pVar, 0.0f, null, 60);
                return y.a;
            case 9:
                g0 g0Var = (g0) this.y;
                androidx.compose.ui.graphics.p pVar2 = (androidx.compose.ui.graphics.p) this.z;
                androidx.compose.ui.node.h0 h0Var3 = (androidx.compose.ui.node.h0) obj;
                h0Var3.b();
                androidx.compose.ui.graphics.drawscope.d.C(h0Var3, g0Var.f, pVar2, 0.0f, null, 60);
                return y.a;
            case 10:
                ((androidx.compose.foundation.interaction.k) this.y).b((androidx.compose.foundation.interaction.j) this.z);
                return y.a;
            case 11:
                ((androidx.compose.runtime.collection.b) ((com.app.mlounge.data.music.e) this.y).y).j((androidx.compose.foundation.gestures.f) this.z);
                return y.a;
            case 12:
                l2 l2Var = (l2) this.y;
                m2 m2Var = (m2) this.z;
                androidx.compose.foundation.gestures.u uVar = (androidx.compose.foundation.gestures.u) obj;
                float f = uVar.b ? -1.0f : 1.0f;
                long j = uVar.a;
                l2Var.a(1, androidx.compose.ui.geometry.b.f(f, m2Var.d == k1.y ? androidx.compose.ui.geometry.b.a(j, 0.0f, 1) : androidx.compose.ui.geometry.b.a(j, 0.0f, 2)));
                return y.a;
            case 13:
                b3 b3Var = (b3) this.y;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.z;
                ((Long) obj).getClass();
                float f2 = b3Var.e;
                b3Var.e = 0.0f;
                lVar.invoke(Float.valueOf(f2));
                return y.a;
            case 14:
                androidx.compose.foundation.layout.k0 k0Var2 = (androidx.compose.foundation.layout.k0) this.y;
                c1 c1Var = (c1) this.z;
                b1 b1Var = (b1) obj;
                boolean z = k0Var2.P;
                float f3 = k0Var2.L;
                if (z) {
                    b1.l(b1Var, c1Var, b1Var.g0(f3), b1Var.g0(k0Var2.M));
                } else {
                    b1.i(b1Var, c1Var, b1Var.g0(f3), b1Var.g0(k0Var2.M));
                }
                return y.a;
            case 15:
                androidx.compose.foundation.lazy.grid.u uVar2 = (androidx.compose.foundation.lazy.grid.u) this.y;
                androidx.compose.foundation.lazy.grid.l lVar2 = (androidx.compose.foundation.lazy.grid.l) this.z;
                androidx.compose.foundation.lazy.grid.t tVarC = uVar2.c(((Integer) obj).intValue());
                int i = tVarC.a;
                List list = tVarC.b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    int i4 = (int) ((androidx.compose.foundation.lazy.grid.b) list.get(i3)).a;
                    arrayList.add(new kotlin.k(Integer.valueOf(i), new androidx.compose.ui.unit.a(lVar2.b(i2, i4))));
                    i++;
                    i2 += i4;
                }
                return arrayList;
            case 16:
                androidx.compose.foundation.lazy.grid.l lVar3 = (androidx.compose.foundation.lazy.grid.l) this.y;
                androidx.compose.foundation.lazy.grid.k kVar = (androidx.compose.foundation.lazy.grid.k) this.z;
                int iIntValue = ((Integer) obj).intValue();
                androidx.compose.foundation.lazy.grid.u uVar3 = (androidx.compose.foundation.lazy.grid.u) lVar3.f;
                int i5 = uVar3.f;
                int iG = uVar3.g(iIntValue);
                return kVar.w(iIntValue, lVar3.b(0, iG), 0, iG, kVar.A);
            case 17:
                androidx.compose.foundation.lazy.layout.e eVar = (androidx.compose.foundation.lazy.layout.e) this.y;
                androidx.compose.foundation.lazy.layout.f fVar = (androidx.compose.foundation.lazy.layout.f) this.z;
                y yVar = y.a;
                androidx.compose.ui.spatial.d dVar = eVar.L;
                if (dVar != null) {
                    dVar.b();
                }
                eVar.L = null;
                CompletableDeferred completableDeferred = fVar.c;
                if (completableDeferred != null) {
                    completableDeferred.complete(yVar);
                }
                fVar.c = null;
                return yVar;
            case 18:
                w0 w0Var = (w0) this.y;
                Object obj2 = this.z;
                w0Var.z.i(obj2);
                return new k(6, w0Var, obj2);
            case 19:
                return new w0((androidx.compose.runtime.saveable.h) this.y, (Map) obj, (androidx.compose.runtime.saveable.d) this.z);
            case 20:
                r0 r0Var = (r0) this.y;
                androidx.compose.ui.graphics.p pVar3 = (androidx.compose.ui.graphics.p) this.z;
                androidx.compose.ui.node.h0 h0Var4 = (androidx.compose.ui.node.h0) obj;
                h0Var4.b();
                if (((Boolean) r0Var.s.getValue()).booleanValue() || ((Boolean) r0Var.t.getValue()).booleanValue()) {
                    androidx.compose.ui.graphics.drawscope.d.Y(h0Var4, pVar3, 0L, 0L, 0.0f, null, Token.ELSE);
                }
                return y.a;
            case 21:
                return new k(7, (y0) this.y, (androidx.compose.foundation.interaction.k) this.z);
            case 22:
                x xVar = (x) this.y;
                x xVar2 = (x) this.z;
                kotlin.text.g gVar = (kotlin.text.g) obj;
                if (xVar.e == -1) {
                    xVar.e = gVar.b().e;
                }
                xVar2.e = gVar.b().y + 1;
                return "";
            case 23:
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.y;
                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) this.z;
                androidx.compose.foundation.text.contextmenu.data.g gVar2 = (androidx.compose.foundation.text.contextmenu.data.g) obj;
                aVar.invoke();
                if (aVar2 != null ? ((Boolean) aVar2.invoke()).booleanValue() : true) {
                    gVar2.close();
                }
                return y.a;
            case 24:
                t2 t2Var = (t2) this.y;
                t2 t2Var2 = (t2) this.z;
                androidx.compose.ui.graphics.drawscope.d dVar2 = (androidx.compose.ui.graphics.drawscope.d) obj;
                float fV = dVar2.V(r2.c);
                float f4 = 2;
                float f5 = fV / f4;
                androidx.compose.ui.graphics.drawscope.d.R(dVar2, ((androidx.compose.ui.graphics.t) t2Var.getValue()).a, dVar2.V(androidx.compose.material3.tokens.t.c / f4) - f5, 0L, new androidx.compose.ui.graphics.drawscope.h(fV, 0.0f, 0, 0, 30), Token.ASSIGN_ADD);
                if (androidx.compose.ui.unit.f.a(((androidx.compose.ui.unit.f) t2Var2.getValue()).e, 0) > 0) {
                    androidx.compose.ui.graphics.drawscope.d.R(dVar2, ((androidx.compose.ui.graphics.t) t2Var.getValue()).a, dVar2.V(((androidx.compose.ui.unit.f) t2Var2.getValue()).e) - f5, 0L, androidx.compose.ui.graphics.drawscope.g.a, Token.ASSIGN_ADD);
                }
                return y.a;
            case 25:
                t2 t2Var3 = (t2) this.y;
                y0 y0Var = (y0) this.z;
                androidx.compose.ui.geometry.e eVar2 = (androidx.compose.ui.geometry.e) obj;
                float fFloatValue = ((Number) t2Var3.getValue()).floatValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (eVar2.a >> 32)) * fFloatValue;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (eVar2.a & 4294967295L)) * fFloatValue;
                if (Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.e) y0Var.getValue()).a >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.e) y0Var.getValue()).a & 4294967295L)) != fIntBitsToFloat2) {
                    y0Var.setValue(new androidx.compose.ui.geometry.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)));
                }
                return y.a;
            case 26:
                androidx.compose.ui.draw.d dVar3 = (androidx.compose.ui.draw.d) obj;
                return dVar3.b(new androidx.compose.animation.e(new h(27, ((n0) this.y).a(dVar3.e.d(), dVar3.e.getLayoutDirection(), dVar3), (l3) this.z), 3));
            case 27:
                a0.k((androidx.compose.ui.graphics.drawscope.d) obj, (a0) this.y, ((l3) this.z).a());
                return y.a;
            case 28:
                androidx.compose.runtime.y yVar2 = (androidx.compose.runtime.y) this.y;
                p0 p0Var = (p0) this.z;
                yVar2.A(obj);
                if (p0Var != null) {
                    p0Var.a(obj);
                }
                return y.a;
            default:
                w1 w1Var = (w1) this.y;
                Throwable th = (Throwable) this.z;
                Throwable th2 = (Throwable) obj;
                synchronized (w1Var.c) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                kotlin.a.a(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    w1Var.e = th;
                    w1Var.u.setValue(s1.e);
                }
                return y.a;
        }
    }

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }
}
