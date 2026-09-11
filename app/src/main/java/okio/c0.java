package okio;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public c0 f;
    public c0 g;

    public c0(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final c0 a() {
        c0 c0Var = this.f;
        if (c0Var == this) {
            c0Var = null;
        }
        c0 c0Var2 = this.g;
        c0Var2.getClass();
        c0Var2.f = this.f;
        c0 c0Var3 = this.f;
        c0Var3.getClass();
        c0Var3.g = this.g;
        this.f = null;
        this.g = null;
        return c0Var;
    }

    public final void b(c0 c0Var) {
        c0Var.getClass();
        c0Var.g = this;
        c0Var.f = this.f;
        c0 c0Var2 = this.f;
        c0Var2.getClass();
        c0Var2.g = c0Var;
        this.f = c0Var;
    }

    public final c0 c() {
        this.d = true;
        return new c0(this.a, this.b, this.c, true, false);
    }

    public final void d(c0 c0Var, int i) {
        c0Var.getClass();
        byte[] bArr = c0Var.a;
        if (!c0Var.e) {
            net.luminis.tls.engine.impl.c.r("only owner can write");
            return;
        }
        int i2 = c0Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c0Var.d) {
                net.luminis.tls.engine.impl.c.a();
                return;
            }
            int i4 = c0Var.b;
            if (i3 - i4 > 8192) {
                net.luminis.tls.engine.impl.c.a();
                return;
            } else {
                kotlin.collections.n.E(bArr, 0, bArr, i4, i2);
                c0Var.c -= c0Var.b;
                c0Var.b = 0;
            }
        }
        int i5 = c0Var.c;
        int i6 = this.b;
        kotlin.collections.n.E(this.a, i5, bArr, i6, i6 + i);
        c0Var.c += i;
        this.b += i;
    }

    public c0() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
