package androidx.compose.foundation.gestures;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {
    public final f2 a;
    public q0 b;
    public t0 c;
    public s0 d;
    public r0 e;
    public okhttp3.internal.platform.android.g f;
    public com.google.firebase.platforminfo.c g;
    public long h = 9205357640488583168L;
    public y2 i;
    public final w0 j;
    public final w0 k;
    public long l;

    public v0(f2 f2Var) {
        this.a = f2Var;
        w0 w0Var = new w0();
        w0Var.b = new ArrayList();
        this.j = w0Var;
        w0 w0Var2 = new w0();
        w0Var2.b = new ArrayList();
        this.k = w0Var2;
        this.l = 0L;
    }

    public static void c(v0 v0Var, androidx.compose.ui.input.indirect.b bVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        f2 f2Var = v0Var.a;
        s0 s0Var = v0Var.d;
        if (s0Var == null) {
            s0Var = new s0();
            s0Var.H = null;
            s0Var.I = Long.MAX_VALUE;
            s0Var.J = false;
            v0Var.d = s0Var;
        }
        s0Var.H = bVar;
        s0Var.I = j;
        y2 y2Var = v0Var.i;
        k1 k1Var = f2Var.N;
        if (y2Var == null) {
            v0Var.i = new y2(k1Var);
        } else {
            y2Var.z = k1Var;
            y2Var.y = j2;
        }
        s0Var.J = false;
        v0Var.f = s0Var;
    }

    public final void a() {
        q0 q0Var = this.b;
        p0 p0Var = p0.z;
        if (q0Var == null) {
            q0Var = new q0();
            q0Var.H = p0Var;
            q0Var.I = false;
            this.b = q0Var;
        }
        q0Var.H = p0Var;
        q0Var.I = false;
        this.f = q0Var;
    }

    public final void b(androidx.compose.ui.input.indirect.b bVar, long j, y2 y2Var) {
        r0 r0Var = this.e;
        if (r0Var == null) {
            r0Var = new r0();
            r0Var.H = null;
            r0Var.I = Long.MAX_VALUE;
            this.e = r0Var;
        }
        r0Var.H = bVar;
        r0Var.I = j;
        y2Var.y = 0L;
        this.f = r0Var;
    }

    public final com.google.firebase.platforminfo.c d() {
        com.google.firebase.platforminfo.c cVar = this.g;
        if (cVar != null) {
            return cVar;
        }
        net.luminis.tls.engine.impl.c.o("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(androidx.compose.ui.input.indirect.b bVar, androidx.compose.ui.input.indirect.a aVar, long j) {
        f2 f2Var = this.a;
        long jE = androidx.compose.ui.node.k.s(f2Var).E(0L);
        if (!androidx.compose.ui.geometry.b.b(this.h, 9205357640488583168L) && !androidx.compose.ui.geometry.b.b(jE, this.h)) {
            this.l = androidx.compose.ui.geometry.b.e(this.l, androidx.compose.ui.geometry.b.d(jE, this.h));
        }
        this.h = jE;
        k1 k1Var = f2Var.N;
        k1Var.getClass();
        int i = m0.a;
        if (Math.abs(Float.intBitsToFloat((int) (k1Var == k1.e ? j & 4294967295L : j >> 32))) > 2.0f) {
            org.jsoup.helper.n.a(d(), bVar, f2Var.N, aVar, this.j, this.l);
            w0 w0Var = this.k;
            ArrayList arrayList = w0Var.b;
            if (arrayList.size() == 3) {
                int i2 = w0Var.a;
                w0Var.a = i2 + 1;
                arrayList.set(i2, new androidx.compose.ui.geometry.b(j));
            } else {
                arrayList.add(new androidx.compose.ui.geometry.b(j));
            }
            if (w0Var.a == 3) {
                w0Var.a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.b) arrayList.get(i3)).a >> 32))));
            }
            float fE = (float) kotlin.collections.o.E(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.b) arrayList.get(i4)).a & 4294967295L))));
            }
            f2Var.V0(new u((((long) Float.floatToRawIntBits((float) kotlin.collections.o.E(arrayList3))) & 4294967295L) | (((long) Float.floatToRawIntBits(fE)) << 32), true));
        }
    }

    public final void f(androidx.compose.ui.input.indirect.b bVar, androidx.compose.ui.input.indirect.b bVar2, androidx.compose.ui.input.indirect.a aVar, long j) {
        if (this.g == null) {
            this.g = new com.google.firebase.platforminfo.c(15);
        }
        this.l = 0L;
        com.google.firebase.platforminfo.c cVarD = d();
        f2 f2Var = this.a;
        org.jsoup.helper.n.a(cVarD, bVar, f2Var.N, aVar, this.j, this.l);
        long jD = androidx.compose.ui.geometry.b.d(org.jsoup.helper.n.J(bVar2, f2Var.N, aVar), j);
        f2Var.O.getClass();
        this.h = androidx.compose.ui.node.k.s(f2Var).E(0L);
        f2Var.V0(new v(jD));
        w0 w0Var = this.k;
        w0Var.a = 0;
        w0Var.b.clear();
    }
}
