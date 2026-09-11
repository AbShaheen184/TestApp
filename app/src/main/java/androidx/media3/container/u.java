package androidx.media3.container;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final byte m;
    public final byte n;
    public final byte o;

    public u(t tVar) {
        int i = tVar.a;
        ByteBuffer byteBuffer = tVar.b;
        com.google.android.material.motion.a.f(i == 1);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        androidx.media3.common.util.v vVar = new androidx.media3.common.util.v(bArr, iRemaining);
        this.g = vVar.g(3);
        vVar.n();
        boolean zF = vVar.f();
        this.a = zF;
        if (zF) {
            vVar.g(5);
            this.b = false;
            this.h = false;
        } else {
            if (vVar.f()) {
                vVar.o(64);
                if (vVar.f()) {
                    int i2 = 0;
                    while (!vVar.f()) {
                        i2++;
                    }
                    if (i2 < 32) {
                        vVar.o(i2);
                    }
                }
                boolean zF2 = vVar.f();
                this.b = zF2;
                if (zF2) {
                    vVar.o(47);
                }
            } else {
                this.b = false;
            }
            this.h = vVar.f();
            int iG = vVar.g(5);
            for (int i3 = 0; i3 <= iG; i3++) {
                vVar.o(12);
                if (i3 == 0) {
                    if (vVar.g(5) > 7) {
                        vVar.f();
                    }
                } else if (vVar.g(5) > 7) {
                    vVar.n();
                }
                if (this.b) {
                    vVar.n();
                }
                if (this.h && vVar.f()) {
                    if (i3 == 0) {
                        vVar.g(4);
                    } else {
                        vVar.o(4);
                    }
                }
            }
        }
        int iG2 = vVar.g(4);
        int iG3 = vVar.g(4);
        vVar.o(iG2 + 1);
        vVar.o(iG3 + 1);
        if (this.a) {
            this.c = false;
        } else {
            this.c = vVar.f();
        }
        if (this.c) {
            vVar.o(4);
            vVar.o(3);
        }
        vVar.o(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            vVar.o(4);
            boolean zF3 = vVar.f();
            if (zF3) {
                vVar.o(2);
            }
            if (vVar.f()) {
                this.d = true;
            } else {
                this.d = vVar.f();
            }
            if (!this.d || vVar.f()) {
                this.e = true;
            } else {
                this.e = vVar.f();
            }
            if (zF3) {
                this.f = vVar.g(3) + 1;
            } else {
                this.f = 0;
            }
        }
        vVar.o(3);
        boolean zF4 = vVar.f();
        if (this.g == 2 && zF4) {
            this.i = vVar.f();
        } else {
            this.i = false;
        }
        if (this.g != 1) {
            this.j = vVar.f();
        } else {
            this.j = false;
        }
        if (vVar.f()) {
            this.m = (byte) vVar.g(8);
            this.n = (byte) vVar.g(8);
            this.o = (byte) vVar.g(8);
        } else {
            this.m = (byte) 0;
            this.n = (byte) 0;
            this.o = (byte) 0;
        }
        if (this.j) {
            vVar.n();
            this.k = false;
            this.l = false;
        } else if (this.m == 1 && this.n == 13 && this.o == 0) {
            this.k = false;
            this.l = false;
        } else {
            vVar.n();
            int i4 = this.g;
            if (i4 == 0) {
                this.k = true;
                this.l = true;
            } else if (i4 == 1) {
                this.k = false;
                this.l = false;
            } else if (this.i) {
                boolean zF5 = vVar.f();
                this.k = zF5;
                if (zF5) {
                    this.l = vVar.f();
                } else {
                    this.l = false;
                }
            } else {
                this.k = true;
                this.l = false;
            }
            if (this.k && this.l) {
                vVar.g(2);
            }
        }
        vVar.n();
    }
}
