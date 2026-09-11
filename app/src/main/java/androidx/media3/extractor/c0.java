package androidx.media3.extractor;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements n {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public p f;
    public h0 g;

    public c0(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // androidx.media3.extractor.n
    public final boolean a(o oVar) {
        int i = this.b;
        int i2 = this.a;
        com.google.android.material.motion.a.q((i2 == -1 || i == -1) ? false : true);
        androidx.media3.common.util.w wVar = new androidx.media3.common.util.w(i);
        ((k) oVar).e(wVar.a, 0, i, false);
        return wVar.G() == i2;
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // androidx.media3.extractor.n
    public final int c(o oVar, r rVar) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            org.mozilla.javascript.c.a();
            return 0;
        }
        h0 h0Var = this.g;
        h0Var.getClass();
        int iA = h0Var.a(oVar, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, true);
        if (iA != -1) {
            this.d += iA;
            return 0;
        }
        this.e = 2;
        this.g.g(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // androidx.media3.extractor.n
    public final void d(p pVar) {
        this.f = pVar;
        h0 h0VarU = pVar.u(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 4);
        this.g = h0VarU;
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        String str = this.c;
        qVar.m = androidx.media3.common.i0.p(str);
        qVar.n = androidx.media3.common.i0.p(str);
        h0VarU.e(new androidx.media3.common.r(qVar));
        this.f.o();
        this.f.g(new d0());
        this.e = 1;
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
    }
}
