package androidx.compose.ui.graphics.vector;

import android.graphics.Bitmap;
import androidx.compose.runtime.h1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends d0 {
    public final c b;
    public String c;
    public boolean d;
    public final a e;
    public kotlin.jvm.internal.m f;
    public final h1 g;
    public androidx.compose.ui.graphics.m h;
    public final h1 i;
    public long j;
    public float k;
    public float l;
    public final e0 m;

    public f0(c cVar) {
        this.b = cVar;
        cVar.i = new e0(this, 0);
        this.c = "";
        this.d = true;
        this.e = new a();
        this.f = h.A;
        this.g = androidx.compose.runtime.s.r(null);
        this.i = androidx.compose.runtime.s.r(new androidx.compose.ui.geometry.e(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new e0(this, 1);
    }

    @Override // androidx.compose.ui.graphics.vector.d0
    public final void a(androidx.compose.ui.graphics.drawscope.d dVar) {
        e(dVar, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x007a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x011a  */
    public final void e(androidx.compose.ui.graphics.drawscope.d dVar, float f, androidx.compose.ui.graphics.m mVar) {
        int i;
        androidx.compose.ui.graphics.m mVar2;
        androidx.compose.ui.graphics.g gVarF;
        char c;
        long j;
        long jB;
        int iD;
        int i2;
        int i3;
        androidx.compose.ui.graphics.m mVar3 = mVar;
        c cVar = this.b;
        boolean z = cVar.d;
        h1 h1Var = this.g;
        if (!z || cVar.e == 16) {
            i = 0;
        } else {
            androidx.compose.ui.graphics.m mVar4 = (androidx.compose.ui.graphics.m) h1Var.getValue();
            int i4 = h0.a;
            if (!(mVar4 instanceof androidx.compose.ui.graphics.m) ? mVar4 == null : (i3 = mVar4.c) == 5 || i3 == 3) {
                i = 0;
            } else if (!(mVar3 instanceof androidx.compose.ui.graphics.m) ? mVar3 == null : (i2 = mVar3.c) == 5 || i2 == 3) {
                i = 0;
            } else {
                i = 1;
            }
        }
        boolean z2 = this.d;
        a aVar = this.e;
        if (z2 || !androidx.compose.ui.geometry.e.a(this.j, dVar.d())) {
            if (i == 1) {
                jB = cVar.e;
                int i5 = h0.a;
                if (androidx.compose.ui.graphics.t.d(jB) != 1.0f) {
                    jB = androidx.compose.ui.graphics.t.b(1.0f, jB);
                }
                mVar2 = new androidx.compose.ui.graphics.m(jB, 5);
            } else {
                mVar2 = null;
            }
            this.h = mVar2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.d() >> 32));
            h1 h1Var2 = this.i;
            this.k = fIntBitsToFloat / Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.e) h1Var2.getValue()).a >> 32));
            this.l = Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) / Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.e) h1Var2.getValue()).a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.d() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.d() & 4294967295L))))) & 4294967295L);
            androidx.compose.ui.unit.m layoutDirection = dVar.getLayoutDirection();
            gVarF = (androidx.compose.ui.graphics.g) aVar.c;
            androidx.compose.ui.graphics.c cVarA = (androidx.compose.ui.graphics.c) aVar.d;
            if (gVarF != null || cVarA == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i6 = (int) (jCeil >> 32);
                Bitmap bitmap = gVarF.a;
                c = ' ';
                j = 4294967295L;
                if (i6 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || aVar.a != i) {
                }
                aVar.b = jCeil;
                androidx.compose.ui.graphics.drawscope.b bVar = (androidx.compose.ui.graphics.drawscope.b) aVar.e;
                long jX = coil3.network.g.x(jCeil);
                androidx.compose.ui.graphics.drawscope.a aVar2 = bVar.e;
                androidx.compose.ui.unit.c cVar2 = aVar2.a;
                androidx.compose.ui.unit.m mVar5 = aVar2.b;
                androidx.compose.ui.graphics.r rVar = aVar2.c;
                androidx.compose.ui.graphics.c cVar3 = cVarA;
                long j2 = aVar2.d;
                aVar2.a = dVar;
                aVar2.b = layoutDirection;
                aVar2.c = cVar3;
                aVar2.d = jX;
                cVar3.f();
                androidx.compose.ui.graphics.drawscope.d.p0(bVar, androidx.compose.ui.graphics.t.b, 0L, 0L, 62);
                this.m.invoke(bVar);
                cVar3.q();
                androidx.compose.ui.graphics.drawscope.a aVar3 = bVar.e;
                aVar3.a = cVar2;
                aVar3.b = mVar5;
                aVar3.c = rVar;
                aVar3.d = j2;
                gVarF.a.prepareToDraw();
                this.d = false;
                this.j = dVar.d();
            }
            gVarF = androidx.compose.ui.graphics.a0.f((int) (jCeil >> c), (int) (jCeil & j), i);
            cVarA = androidx.compose.ui.graphics.a0.a(gVarF);
            aVar.c = gVarF;
            aVar.d = cVarA;
            aVar.a = i;
            aVar.b = jCeil;
            androidx.compose.ui.graphics.drawscope.b bVar2 = (androidx.compose.ui.graphics.drawscope.b) aVar.e;
            long jX2 = coil3.network.g.x(jCeil);
            androidx.compose.ui.graphics.drawscope.a aVar4 = bVar2.e;
            androidx.compose.ui.unit.c cVar4 = aVar4.a;
            androidx.compose.ui.unit.m mVar6 = aVar4.b;
            androidx.compose.ui.graphics.r rVar2 = aVar4.c;
            androidx.compose.ui.graphics.c cVar5 = cVarA;
            long j3 = aVar4.d;
            aVar4.a = dVar;
            aVar4.b = layoutDirection;
            aVar4.c = cVar5;
            aVar4.d = jX2;
            cVar5.f();
            androidx.compose.ui.graphics.drawscope.d.p0(bVar2, androidx.compose.ui.graphics.t.b, 0L, 0L, 62);
            this.m.invoke(bVar2);
            cVar5.q();
            androidx.compose.ui.graphics.drawscope.a aVar5 = bVar2.e;
            aVar5.a = cVar4;
            aVar5.b = mVar6;
            aVar5.c = rVar2;
            aVar5.d = j3;
            gVarF.a.prepareToDraw();
            this.d = false;
            this.j = dVar.d();
        } else {
            androidx.compose.ui.graphics.g gVar = (androidx.compose.ui.graphics.g) aVar.c;
            if (gVar != null) {
                Bitmap.Config config = gVar.a.getConfig();
                config.getClass();
                iD = androidx.compose.ui.graphics.h.d(config);
            } else {
                iD = 0;
            }
            if (i != iD) {
                if (i == 1) {
                    jB = cVar.e;
                    int i7 = h0.a;
                    if (androidx.compose.ui.graphics.t.d(jB) != 1.0f) {
                        jB = androidx.compose.ui.graphics.t.b(1.0f, jB);
                    }
                    mVar2 = new androidx.compose.ui.graphics.m(jB, 5);
                } else {
                    mVar2 = null;
                }
                this.h = mVar2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.d() >> 32));
                h1 h1Var3 = this.i;
                this.k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.e) h1Var3.getValue()).a >> 32));
                this.l = Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) / Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.e) h1Var3.getValue()).a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.d() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.d() & 4294967295L))))) & 4294967295L);
                androidx.compose.ui.unit.m layoutDirection2 = dVar.getLayoutDirection();
                gVarF = (androidx.compose.ui.graphics.g) aVar.c;
                androidx.compose.ui.graphics.c cVarA2 = (androidx.compose.ui.graphics.c) aVar.d;
                if (gVarF != null) {
                    c = ' ';
                    j = 4294967295L;
                    gVarF = androidx.compose.ui.graphics.a0.f((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    cVarA2 = androidx.compose.ui.graphics.a0.a(gVarF);
                    aVar.c = gVarF;
                    aVar.d = cVarA2;
                    aVar.a = i;
                } else {
                    c = ' ';
                    j = 4294967295L;
                    gVarF = androidx.compose.ui.graphics.a0.f((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    cVarA2 = androidx.compose.ui.graphics.a0.a(gVarF);
                    aVar.c = gVarF;
                    aVar.d = cVarA2;
                    aVar.a = i;
                }
                aVar.b = jCeil2;
                androidx.compose.ui.graphics.drawscope.b bVar3 = (androidx.compose.ui.graphics.drawscope.b) aVar.e;
                long jX3 = coil3.network.g.x(jCeil2);
                androidx.compose.ui.graphics.drawscope.a aVar6 = bVar3.e;
                androidx.compose.ui.unit.c cVar6 = aVar6.a;
                androidx.compose.ui.unit.m mVar7 = aVar6.b;
                androidx.compose.ui.graphics.r rVar3 = aVar6.c;
                androidx.compose.ui.graphics.c cVar7 = cVarA2;
                long j4 = aVar6.d;
                aVar6.a = dVar;
                aVar6.b = layoutDirection2;
                aVar6.c = cVar7;
                aVar6.d = jX3;
                cVar7.f();
                androidx.compose.ui.graphics.drawscope.d.p0(bVar3, androidx.compose.ui.graphics.t.b, 0L, 0L, 62);
                this.m.invoke(bVar3);
                cVar7.q();
                androidx.compose.ui.graphics.drawscope.a aVar7 = bVar3.e;
                aVar7.a = cVar6;
                aVar7.b = mVar7;
                aVar7.c = rVar3;
                aVar7.d = j4;
                gVarF.a.prepareToDraw();
                this.d = false;
                this.j = dVar.d();
            }
        }
        if (mVar3 == null) {
            mVar3 = ((androidx.compose.ui.graphics.m) h1Var.getValue()) != null ? (androidx.compose.ui.graphics.m) h1Var.getValue() : this.h;
        }
        androidx.compose.ui.graphics.m mVar8 = mVar3;
        androidx.compose.ui.graphics.g gVar2 = (androidx.compose.ui.graphics.g) aVar.c;
        if (gVar2 == null) {
            androidx.compose.ui.internal.a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        androidx.compose.ui.graphics.drawscope.d.w(dVar, gVar2, aVar.b, 0L, f, mVar8, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        h1 h1Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.e) h1Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.e) h1Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
