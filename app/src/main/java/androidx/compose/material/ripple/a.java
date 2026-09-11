package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.compose.p;
import androidx.activity.w;
import androidx.appcompat.widget.c2;
import androidx.collection.j0;
import androidx.compose.foundation.interaction.k;
import androidx.compose.foundation.interaction.l;
import androidx.compose.foundation.interaction.n;
import androidx.compose.foundation.text.input.internal.o;
import androidx.compose.material3.t0;
import androidx.compose.material3.u0;
import androidx.compose.ui.graphics.r;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.node.m;
import androidx.compose.ui.node.u;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends q implements androidx.compose.ui.node.h, m, u {
    public final k L;
    public final boolean M;
    public final float N;
    public final u0 O;
    public final t0 P;
    public g Q;
    public float R;
    public boolean T;
    public d V;
    public e W;
    public long S = 0;
    public final j0 U = new j0();

    public a(k kVar, boolean z, float f, u0 u0Var, t0 t0Var) {
        this.L = kVar;
        this.M = z;
        this.N = f;
        this.O = u0Var;
        this.P = t0Var;
    }

    @Override // androidx.compose.ui.q
    public final boolean A0() {
        return false;
    }

    @Override // androidx.compose.ui.q
    public final void D0() {
        BuildersKt__Builders_commonKt.launch$default(z0(), null, null, new p(this, (kotlin.coroutines.d) null, 13), 3, null);
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        d dVar = this.V;
        if (dVar != null) {
            this.W = null;
            androidx.compose.ui.node.k.j(this);
            o oVar = dVar.A;
            e eVar = (e) ((LinkedHashMap) oVar.y).get(this);
            if (eVar != null) {
                eVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) oVar.y;
                e eVar2 = (e) linkedHashMap.get(this);
                if (eVar2 != null) {
                }
                linkedHashMap.remove(this);
                dVar.z.add(eVar);
            }
        }
    }

    public final void L0(androidx.compose.foundation.interaction.o oVar) {
        e eVar;
        if (!(oVar instanceof androidx.compose.foundation.interaction.m)) {
            if (oVar instanceof n) {
                e eVar2 = this.W;
                if (eVar2 != null) {
                    eVar2.d();
                    return;
                }
                return;
            }
            if (!(oVar instanceof l) || (eVar = this.W) == null) {
                return;
            }
            eVar.d();
            return;
        }
        androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) oVar;
        long j = this.S;
        float f = this.R;
        d dVar = this.V;
        if (dVar == null) {
            Object obj = (View) androidx.compose.ui.node.k.h(this, m0.f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    androidx.media3.exoplayer.hls.playlist.a.g(obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    d dVar2 = new d(viewGroup.getContext());
                    viewGroup.addView(dVar2);
                    dVar = dVar2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof d) {
                        dVar = (d) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.V = dVar;
        }
        ArrayList arrayList = dVar.y;
        o oVar2 = dVar.A;
        LinkedHashMap linkedHashMap = (LinkedHashMap) oVar2.y;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) oVar2.y;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) oVar2.z;
        e eVar3 = (e) linkedHashMap.get(this);
        if (eVar3 == null) {
            ArrayList arrayList2 = dVar.z;
            arrayList2.getClass();
            eVar3 = (e) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (eVar3 == null) {
                if (dVar.B > com.google.common.base.c.k(arrayList)) {
                    eVar3 = new e(dVar.getContext());
                    dVar.addView(eVar3);
                    arrayList.add(eVar3);
                } else {
                    eVar3 = (e) arrayList.get(dVar.B);
                    a aVar = (a) linkedHashMap3.get(eVar3);
                    if (aVar != null) {
                        aVar.W = null;
                        androidx.compose.ui.node.k.j(aVar);
                        e eVar4 = (e) linkedHashMap2.get(aVar);
                        if (eVar4 != null) {
                        }
                        linkedHashMap2.remove(aVar);
                        eVar3.c();
                    }
                }
                int i2 = dVar.B;
                if (i2 < dVar.e - 1) {
                    dVar.B = i2 + 1;
                } else {
                    dVar.B = 0;
                }
            }
            linkedHashMap2.put(this, eVar3);
            linkedHashMap3.put(eVar3, this);
        }
        e eVar5 = eVar3;
        int iF = kotlin.math.a.F(f);
        long jA = this.O.a();
        this.P.invoke();
        eVar5.b(mVar, this.M, j, iF, jA, new w(this, 17));
        this.W = eVar5;
        androidx.compose.ui.node.k.j(this);
    }

    @Override // androidx.compose.ui.node.m
    public final void W(h0 h0Var) {
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        h0Var.b();
        g gVar = this.Q;
        if (gVar != null) {
            float f = this.R;
            long jA = this.O.a();
            float fFloatValue = ((Number) ((androidx.compose.animation.core.d) gVar.c).d()).floatValue();
            if (fFloatValue > 0.0f) {
                long jB = t.b(fFloatValue, jA);
                if (gVar.a) {
                    float fD = androidx.compose.ui.geometry.e.d(bVar.d());
                    float fB = androidx.compose.ui.geometry.e.b(bVar.d());
                    c2 c2Var = bVar.y;
                    long jH = c2Var.H();
                    c2Var.w().f();
                    try {
                        ((c2) ((com.google.firebase.platforminfo.c) c2Var.y).e).w().o(0.0f, 0.0f, fD, fB, 1);
                        androidx.compose.ui.graphics.drawscope.d.R(h0Var, jB, f, 0L, null, Token.IMPORT);
                        androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var, jH);
                    } catch (Throwable th) {
                        androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var, jH);
                        throw th;
                    }
                } else {
                    androidx.compose.ui.graphics.drawscope.d.R(h0Var, jB, f, 0L, null, Token.IMPORT);
                }
            }
        }
        r rVarW = bVar.y.w();
        e eVar = this.W;
        if (eVar != null) {
            long j = this.S;
            int iF = kotlin.math.a.F(this.R);
            long jA2 = this.O.a();
            this.P.invoke();
            eVar.e(j, jA2, iF);
            eVar.draw(androidx.compose.ui.graphics.d.a(rVarW));
        }
    }

    @Override // androidx.compose.ui.node.u
    public final void l(long j) {
        float fV;
        this.T = true;
        androidx.compose.ui.unit.c cVar = androidx.compose.ui.node.k.t(this).W;
        this.S = coil3.network.g.x(j);
        float f = this.N;
        if (Float.isNaN(f)) {
            long j2 = this.S;
            float f2 = c.a;
            float fD = androidx.compose.ui.geometry.e.d(j2);
            fV = androidx.compose.ui.geometry.b.c((((long) Float.floatToRawIntBits(androidx.compose.ui.geometry.e.b(j2))) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32)) / 2.0f;
            if (this.M) {
                fV += cVar.V(c.a);
            }
        } else {
            fV = cVar.V(f);
        }
        this.R = fV;
        j0 j0Var = this.U;
        Object[] objArr = j0Var.a;
        int i = j0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            L0((androidx.compose.foundation.interaction.o) objArr[i2]);
        }
        j0Var.d();
    }
}
