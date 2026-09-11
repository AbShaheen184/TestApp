package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.s;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.p;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.t;
import com.google.android.gms.cloudmessaging.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends TextPaint {
    public n a;
    public androidx.compose.ui.text.style.l b;
    public int c;
    public m0 d;
    public t e;
    public p f;
    public e0 g;
    public androidx.compose.ui.geometry.e h;
    public androidx.compose.ui.graphics.drawscope.e i;

    public final n a() {
        n nVar = this.a;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this);
        this.a = nVar2;
        return nVar2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().g(i);
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    public final void c(p pVar, long j, float f) {
        if (pVar == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (pVar instanceof p0) {
            d(kotlin.math.a.z(f, ((p0) pVar).a));
            return;
        }
        if (!(pVar instanceof l0)) {
            coil3.g.a();
            return;
        }
        if (kotlin.jvm.internal.l.a(this.f, pVar)) {
            androidx.compose.ui.geometry.e eVar = this.h;
            if (!(eVar == null ? false : androidx.compose.ui.geometry.e.a(eVar.a, j))) {
                if (j != 9205357640488583168L) {
                    this.f = pVar;
                    this.h = new androidx.compose.ui.geometry.e(j);
                    this.g = s.k(new e(pVar, j, 0));
                }
            }
        } else {
            if (j != 9205357640488583168L) {
                this.f = pVar;
                this.h = new androidx.compose.ui.geometry.e(j);
                this.g = s.k(new e(pVar, j, 0));
            }
        }
        n nVarA = a();
        e0 e0Var = this.g;
        nVarA.k(e0Var != null ? (Shader) e0Var.getValue() : null);
        this.e = null;
        k.c(this, f);
    }

    public final void d(long j) {
        t tVar = this.e;
        if (tVar == null ? false : t.c(tVar.a, j)) {
            return;
        }
        if (j != 16) {
            this.e = new t(j);
            setColor(a0.y(j));
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
        }
    }

    public final void e(androidx.compose.ui.graphics.drawscope.e eVar) {
        if (eVar == null || kotlin.jvm.internal.l.a(this.i, eVar)) {
            return;
        }
        this.i = eVar;
        if (eVar.equals(androidx.compose.ui.graphics.drawscope.g.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(eVar instanceof androidx.compose.ui.graphics.drawscope.h)) {
            coil3.g.a();
            return;
        }
        a().o(1);
        androidx.compose.ui.graphics.drawscope.h hVar = (androidx.compose.ui.graphics.drawscope.h) eVar;
        a().n(hVar.a);
        n nVarA = a();
        ((Paint) nVarA.y).setStrokeMiter(hVar.b);
        a().m(hVar.d);
        a().l(hVar.c);
        ((Paint) a().y).setPathEffect(null);
    }

    public final void f(m0 m0Var) {
        if (m0Var == null || kotlin.jvm.internal.l.a(this.d, m0Var)) {
            return;
        }
        this.d = m0Var;
        if (m0Var.equals(m0.d)) {
            clearShadowLayer();
            return;
        }
        m0 m0Var2 = this.d;
        float f = m0Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (m0Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), a0.y(this.d.a));
    }

    public final void g(androidx.compose.ui.text.style.l lVar) {
        if (lVar == null || kotlin.jvm.internal.l.a(this.b, lVar)) {
            return;
        }
        this.b = lVar;
        int i = lVar.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
