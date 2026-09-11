package okio;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Closeable {
    public byte[] B;
    public f e;
    public boolean y;
    public c0 z;
    public long A = -1;
    public int C = -1;
    public int D = -1;

    public final void a(long j) {
        f fVar = this.e;
        if (fVar == null) {
            net.luminis.tls.engine.impl.c.r("not attached to a buffer");
            return;
        }
        if (!this.y) {
            net.luminis.tls.engine.impl.c.r("resizeBuffer() only permitted for read/write buffers");
            return;
        }
        long j2 = fVar.y;
        if (j <= j2) {
            if (j < 0) {
                net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("newSize < 0: ", j));
                return;
            }
            long j3 = j2 - j;
            while (j3 > 0) {
                c0 c0Var = fVar.e;
                c0Var.getClass();
                c0 c0Var2 = c0Var.g;
                c0Var2.getClass();
                int i = c0Var2.c;
                long j4 = i - c0Var2.b;
                if (j4 > j3) {
                    c0Var2.c = i - ((int) j3);
                    break;
                } else {
                    fVar.e = c0Var2.a();
                    d0.a(c0Var2);
                    j3 -= j4;
                }
            }
            this.z = null;
            this.A = j;
            this.B = null;
            this.C = -1;
            this.D = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                c0 c0VarL0 = fVar.l0(i2);
                int iMin = (int) Math.min(j5, 8192 - c0VarL0.c);
                int i3 = c0VarL0.c + iMin;
                c0VarL0.c = i3;
                j5 -= (long) iMin;
                if (z) {
                    this.z = c0VarL0;
                    this.A = j2;
                    this.B = c0VarL0.a;
                    this.C = i3 - iMin;
                    this.D = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        fVar.y = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e == null) {
            net.luminis.tls.engine.impl.c.r("not attached to a buffer");
            return;
        }
        this.e = null;
        this.z = null;
        this.A = -1L;
        this.B = null;
        this.C = -1;
        this.D = -1;
    }

    public final int g(long j) {
        f fVar = this.e;
        if (fVar == null) {
            net.luminis.tls.engine.impl.c.r("not attached to a buffer");
            return 0;
        }
        if (j >= -1) {
            long j2 = fVar.y;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.z = null;
                    this.A = j;
                    this.B = null;
                    this.C = -1;
                    this.D = -1;
                    return -1;
                }
                c0 c0Var = fVar.e;
                c0 c0Var2 = this.z;
                long j3 = 0;
                if (c0Var2 != null) {
                    long j4 = this.A - ((long) (this.C - c0Var2.b));
                    if (j4 > j) {
                        c0Var2 = c0Var;
                        c0Var = c0Var2;
                        j2 = j4;
                    } else {
                        j3 = j4;
                    }
                } else {
                    c0Var2 = c0Var;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        c0Var2.getClass();
                        long j5 = ((long) (c0Var2.c - c0Var2.b)) + j3;
                        if (j < j5) {
                            break;
                        }
                        c0Var2 = c0Var2.f;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        c0Var.getClass();
                        c0Var = c0Var.g;
                        c0Var.getClass();
                        j2 -= (long) (c0Var.c - c0Var.b);
                    }
                    c0Var2 = c0Var;
                    j3 = j2;
                }
                if (this.y) {
                    c0Var2.getClass();
                    if (c0Var2.d) {
                        byte[] bArr = c0Var2.a;
                        c0 c0Var3 = new c0(Arrays.copyOf(bArr, bArr.length), c0Var2.b, c0Var2.c, false, true);
                        if (fVar.e == c0Var2) {
                            fVar.e = c0Var3;
                        }
                        c0Var2.b(c0Var3);
                        c0 c0Var4 = c0Var3.g;
                        c0Var4.getClass();
                        c0Var4.a();
                        c0Var2 = c0Var3;
                    }
                }
                this.z = c0Var2;
                this.A = j;
                c0Var2.getClass();
                this.B = c0Var2.a;
                int i = c0Var2.b + ((int) (j - j3));
                this.C = i;
                int i2 = c0Var2.c;
                this.D = i2;
                return i2 - i;
            }
        }
        StringBuilder sbM = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j, "offset=", " > size=");
        sbM.append(fVar.y);
        throw new ArrayIndexOutOfBoundsException(sbM.toString());
    }
}
