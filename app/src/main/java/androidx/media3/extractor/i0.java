package androidx.media3.extractor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(h0 h0Var, g0 g0Var) {
        if (this.c > 0) {
            h0Var.g(this.d, this.e, this.f, this.g, g0Var);
            this.c = 0;
        }
    }

    public final void b(h0 h0Var, long j, int i, int i2, int i3, g0 g0Var) {
        com.google.android.material.motion.a.p("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(h0Var, g0Var);
            }
        }
    }

    public final void c(o oVar) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        int i = 0;
        oVar.x(bArr, 0, 10);
        oVar.n();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.b = true;
    }
}
