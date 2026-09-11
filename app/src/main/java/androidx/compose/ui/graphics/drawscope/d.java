package androidx.compose.ui.graphics.drawscope;

import androidx.appcompat.widget.c2;
import androidx.compose.ui.graphics.j;
import androidx.compose.ui.graphics.m;
import androidx.compose.ui.graphics.p;
import androidx.compose.ui.node.h0;
import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface d extends androidx.compose.ui.unit.c {
    static /* synthetic */ void C(d dVar, j jVar, p pVar, float f, h hVar, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        e eVar = hVar;
        if ((i & 8) != 0) {
            eVar = g.a;
        }
        dVar.e(jVar, pVar, f2, eVar, (i & 32) != 0 ? 3 : 0);
    }

    static long P(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static /* synthetic */ void R(d dVar, long j, float f, long j2, e eVar, int i) {
        if ((i & 4) != 0) {
            j2 = dVar.i0();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            eVar = g.a;
        }
        dVar.A(j, f, j3, eVar);
    }

    static void Y(h0 h0Var, p pVar, long j, long j2, float f, e eVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = P(h0Var.e.d(), j3);
        }
        h0Var.f(pVar, j3, j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? g.a : eVar);
    }

    static /* synthetic */ void p0(d dVar, long j, long j2, long j3, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            j3 = P(dVar.d(), j4);
        }
        dVar.y0((i & 64) != 0 ? 3 : 0, j, j4, j3);
    }

    static void w(d dVar, androidx.compose.ui.graphics.g gVar, long j, long j2, float f, m mVar, int i, int i2) {
        dVar.h(gVar, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, mVar, (i2 & 512) != 0 ? 1 : i);
    }

    static /* synthetic */ void z(d dVar, p pVar, long j, long j2, long j3, e eVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        dVar.x0(pVar, j4, (i & 4) != 0 ? P(dVar.d(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? g.a : eVar);
    }

    void A(long j, float f, long j2, e eVar);

    c2 b0();

    default long d() {
        return b0().H();
    }

    void d0(j jVar, long j, e eVar);

    void e(j jVar, p pVar, float f, e eVar, int i);

    androidx.compose.ui.unit.m getLayoutDirection();

    void h(androidx.compose.ui.graphics.g gVar, long j, long j2, long j3, float f, m mVar, int i);

    default long i0() {
        return t1.m(b0().H());
    }

    void r(long j, long j2, long j3, long j4, e eVar);

    void r0(long j, float f, float f2, long j2, long j3, e eVar);

    void x0(p pVar, long j, long j2, long j3, float f, e eVar);

    void y(long j, long j2, long j3, float f, int i);

    void y0(int i, long j, long j2, long j3);
}
