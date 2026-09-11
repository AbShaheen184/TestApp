package androidx.compose.runtime.snapshots;

import androidx.appcompat.widget.c2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public l a;
    public long b;
    public boolean c;
    public int d;

    public f(long j, l lVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = lVar;
        this.b = j;
        androidx.compose.runtime.saveable.m mVar = n.a;
        if (j != 0) {
            l lVarD = d();
            long j2 = lVarD.z;
            long[] jArr = lVarD.A;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = lVarD.y;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = lVarD.e;
                    if (j4 != 0) {
                        j2 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (n.c) {
                iA = n.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(f fVar) {
        n.b.X(fVar);
    }

    public final void a() {
        synchronized (n.c) {
            b();
            p();
        }
    }

    public void b() {
        n.d = n.d.c(g());
    }

    public abstract void c();

    public l d() {
        return this.a;
    }

    public abstract kotlin.jvm.functions.l e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract kotlin.jvm.functions.l i();

    public final f j() {
        c2 c2Var = n.b;
        f fVar = (f) c2Var.v();
        c2Var.X(this);
        return fVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(w wVar);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            n.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(l lVar) {
        this.a = lVar;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract f u(kotlin.jvm.functions.l lVar);
}
