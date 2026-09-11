package androidx.compose.ui.graphics.drawscope;

import android.graphics.Paint;
import android.graphics.Shader;
import androidx.appcompat.widget.c2;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.j;
import androidx.compose.ui.graphics.p;
import androidx.compose.ui.graphics.r;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.unit.m;
import com.google.android.gms.cloudmessaging.n;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {
    public n A;
    public final a e;
    public final c2 y;
    public n z;

    public b() {
        a aVar = new a();
        aVar.a = c.a;
        aVar.b = m.e;
        aVar.c = f.a;
        aVar.d = 0L;
        this.e = aVar;
        this.y = new c2(this);
    }

    public static n b(b bVar, long j, e eVar, int i) {
        n nVarG = bVar.g(eVar);
        Paint paint = (Paint) nVarG.y;
        if (!t.c(a0.c(paint.getColor()), j)) {
            nVarG.h(j);
        }
        if (((Shader) nVarG.z) != null) {
            nVarG.k(null);
        }
        if (!l.a((androidx.compose.ui.graphics.m) nVarG.A, null)) {
            nVarG.i(null);
        }
        if (nVarG.e != i) {
            nVarG.g(i);
        }
        if (paint.isFilterBitmap()) {
            return nVarG;
        }
        nVarG.j(1);
        return nVarG;
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final void A(long j, float f, long j2, e eVar) {
        this.e.c.n(f, j2, b(this, j, eVar, 3));
    }

    @Override // androidx.compose.ui.unit.c
    public final float T() {
        return this.e.a.T();
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.e.a.a();
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final c2 b0() {
        return this.y;
    }

    public final n c(p pVar, e eVar, float f, androidx.compose.ui.graphics.m mVar, int i, int i2) {
        n nVarG = g(eVar);
        Paint paint = (Paint) nVarG.y;
        if (pVar != null) {
            pVar.a(f, d(), nVarG);
        } else {
            if (((Shader) nVarG.z) != null) {
                nVarG.k(null);
            }
            long jC = a0.c(paint.getColor());
            long j = t.b;
            if (!t.c(jC, j)) {
                nVarG.h(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                nVarG.e(f);
            }
        }
        if (!l.a((androidx.compose.ui.graphics.m) nVarG.A, mVar)) {
            nVarG.i(mVar);
        }
        if (nVarG.e != i) {
            nVarG.g(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return nVarG;
        }
        nVarG.j(i2);
        return nVarG;
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final void d0(j jVar, long j, e eVar) {
        this.e.c.e(jVar, b(this, j, eVar, 3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final void e(j jVar, p pVar, float f, e eVar, int i) {
        this.e.c.e(jVar, c(pVar, eVar, f, null, i, 1));
    }

    public final void f(androidx.compose.ui.graphics.g gVar, androidx.compose.ui.graphics.m mVar) {
        this.e.c.d(gVar, c(null, g.a, 1.0f, mVar, 3, 1));
    }

    public final n g(e eVar) {
        if (l.a(eVar, g.a)) {
            n nVar = this.z;
            if (nVar != null) {
                return nVar;
            }
            n nVarG = a0.g();
            nVarG.o(0);
            this.z = nVarG;
            return nVarG;
        }
        if (!(eVar instanceof h)) {
            coil3.g.a();
            return null;
        }
        n nVarG2 = this.A;
        if (nVarG2 == null) {
            nVarG2 = a0.g();
            nVarG2.o(1);
            this.A = nVarG2;
        }
        Paint paint = (Paint) nVarG2.y;
        float strokeWidth = paint.getStrokeWidth();
        h hVar = (h) eVar;
        float f = hVar.a;
        if (strokeWidth != f) {
            nVarG2.n(f);
        }
        int iB = nVarG2.b();
        int i = hVar.c;
        if (iB != i) {
            nVarG2.l(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = hVar.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iC = nVarG2.c();
        int i2 = hVar.d;
        if (iC == i2) {
            return nVarG2;
        }
        nVarG2.m(i2);
        return nVarG2;
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final m getLayoutDirection() {
        return this.e.b;
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final void h(androidx.compose.ui.graphics.g gVar, long j, long j2, long j3, float f, androidx.compose.ui.graphics.m mVar, int i) {
        this.e.c.r(gVar, j, j2, j3, c(null, g.a, f, mVar, 3, i));
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final void r(long j, long j2, long j3, long j4, e eVar) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.e.c.l(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), b(this, j, eVar, 3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final void r0(long j, float f, float f2, long j2, long j3, e eVar) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.e.c.s(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, b(this, j, eVar, 3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final void x0(p pVar, long j, long j2, long j3, float f, e eVar) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.e.c.l(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), c(pVar, eVar, f, null, 3, 1));
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final void y(long j, long j2, long j3, float f, int i) {
        r rVar = this.e.c;
        n nVarG = this.A;
        if (nVarG == null) {
            nVarG = a0.g();
            nVarG.o(1);
            this.A = nVarG;
        }
        Paint paint = (Paint) nVarG.y;
        if (!t.c(a0.c(paint.getColor()), j)) {
            nVarG.h(j);
        }
        if (((Shader) nVarG.z) != null) {
            nVarG.k(null);
        }
        if (!l.a((androidx.compose.ui.graphics.m) nVarG.A, null)) {
            nVarG.i(null);
        }
        if (nVarG.e != 3) {
            nVarG.g(3);
        }
        if (paint.getStrokeWidth() != f) {
            nVarG.n(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (nVarG.b() != i) {
            nVarG.l(i);
        }
        if (nVarG.c() != 0) {
            nVarG.m(0);
        }
        if (!paint.isFilterBitmap()) {
            nVarG.j(1);
        }
        rVar.i(j2, j3, nVarG);
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final void y0(int i, long j, long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.e.c.m(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), b(this, j, g.a, i));
    }
}
