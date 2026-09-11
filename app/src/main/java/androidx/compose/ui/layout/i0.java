package androidx.compose.ui.layout;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ m0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ r0 e;

    public /* synthetic */ i0(r0 r0Var, m0 m0Var, int i, r0 r0Var2, int i2) {
        this.a = i2;
        this.c = m0Var;
        this.d = i;
        this.e = r0Var2;
        this.b = r0Var;
    }

    @Override // androidx.compose.ui.layout.r0
    public final int a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.a();
    }

    @Override // androidx.compose.ui.layout.r0
    public final int b() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.b();
    }

    @Override // androidx.compose.ui.layout.r0
    public final Map c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.c();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x009a A[LOOP:0: B:11:0x0035->B:32:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x009d A[SYNTHETIC] */
    @Override // androidx.compose.ui.layout.r0
    public final void d() {
        int i;
        switch (this.a) {
            case 0:
                int i2 = this.d;
                m0 m0Var = this.c;
                m0Var.B = i2;
                this.e.d();
                androidx.compose.runtime.collection.b bVar = m0Var.J;
                androidx.collection.o0 o0Var = m0Var.I;
                long[] jArr = o0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j) < 128) {
                                    int i7 = (i3 << 3) + i6;
                                    Object obj = o0Var.b[i7];
                                    j1 j1Var = (j1) o0Var.c[i7];
                                    int i8 = bVar.i(obj);
                                    i = i4;
                                    if (i8 < 0 || i8 >= m0Var.B) {
                                        if (i8 >= 0) {
                                            Object[] objArr = bVar.e;
                                            Object obj2 = objArr[i8];
                                            objArr[i8] = a0.b;
                                        }
                                        if (m0Var.G.b(obj)) {
                                            j1Var.dispose();
                                        }
                                        o0Var.l(i7);
                                    }
                                } else {
                                    i = i4;
                                }
                                j >>= i;
                                i6++;
                                i4 = i;
                            }
                            if (i5 == i4) {
                                if (i3 != length) {
                                    i3++;
                                }
                            }
                        } else if (i3 != length) {
                            i3++;
                        }
                    }
                }
                m0Var.f(m0Var.A);
                break;
            default:
                int i9 = this.d;
                m0 m0Var2 = this.c;
                m0Var2.A = i9;
                this.e.d();
                if (m0Var2.e.F == null) {
                    m0Var2.f(m0Var2.A);
                }
                break;
        }
    }

    @Override // androidx.compose.ui.layout.r0
    public final kotlin.jvm.functions.l e() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.e();
    }
}
