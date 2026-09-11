package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {
    public long A = e1.a;
    public long B = 0;
    public int e;
    public int y;
    public long z;

    public c1() {
        long j = 0;
        this.z = (j & 4294967295L) | (j << 32);
    }

    public Object K() {
        return null;
    }

    public int a0() {
        return (int) (this.z & 4294967295L);
    }

    public int c0() {
        return (int) (this.z >> 32);
    }

    public final void e0() {
        this.e = com.google.android.material.resources.c.c((int) (this.z >> 32), androidx.compose.ui.unit.a.j(this.A), androidx.compose.ui.unit.a.h(this.A));
        int iC = com.google.android.material.resources.c.c((int) (this.z & 4294967295L), androidx.compose.ui.unit.a.i(this.A), androidx.compose.ui.unit.a.g(this.A));
        this.y = iC;
        int i = this.e;
        long j = this.z;
        this.B = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iC - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void h0(long j, float f, kotlin.jvm.functions.l lVar);

    public final void j0(long j) {
        if (androidx.compose.ui.unit.l.a(this.z, j)) {
            return;
        }
        this.z = j;
        e0();
    }

    public final void l0(long j) {
        if (androidx.compose.ui.unit.a.b(this.A, j)) {
            return;
        }
        this.A = j;
        e0();
    }
}
