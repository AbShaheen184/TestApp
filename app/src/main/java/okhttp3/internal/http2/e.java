package okhttp3.internal.http2;

import androidx.compose.animation.core.u2;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final okio.b0 c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public d[] d = new d[8];
    public int e = 7;

    public e(r rVar) {
        this.c = new okio.b0(rVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                d dVar = this.d[length];
                dVar.getClass();
                int i4 = dVar.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            d[] dVarArr = this.d;
            System.arraycopy(dVarArr, i2 + 1, dVarArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final okio.i b(int i) throws IOException {
        if (i >= 0) {
            d[] dVarArr = g.a;
            if (i <= dVarArr.length - 1) {
                return dVarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - g.a.length);
        if (length >= 0) {
            d[] dVarArr2 = this.d;
            if (length < dVarArr2.length) {
                d dVar = dVarArr2[length];
                dVar.getClass();
                return dVar.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(d dVar) {
        this.b.add(dVar);
        int i = dVar.c;
        int i2 = this.a;
        if (i > i2) {
            d[] dVarArr = this.d;
            kotlin.collections.n.K(0, dVarArr.length, null, dVarArr);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        d[] dVarArr2 = this.d;
        if (i3 > dVarArr2.length) {
            d[] dVarArr3 = new d[dVarArr2.length * 2];
            System.arraycopy(dVarArr2, 0, dVarArr3, dVarArr2.length, dVarArr2.length);
            this.e = this.d.length - 1;
            this.d = dVarArr3;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = dVar;
        this.f++;
        this.g += i;
    }

    public final okio.i d() {
        okio.b0 b0Var = this.c;
        byte b = b0Var.readByte();
        byte[] bArr = okhttp3.internal.e.a;
        int i = b & 255;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jE = e(i, 127);
        if (!z) {
            return b0Var.k(jE);
        }
        okio.f fVar = new okio.f();
        int[] iArr = y.a;
        b0Var.getClass();
        u2 u2Var = y.c;
        u2 u2Var2 = u2Var;
        int i3 = 0;
        for (long j = 0; j < jE; j++) {
            byte b2 = b0Var.readByte();
            byte[] bArr2 = okhttp3.internal.e.a;
            i2 = (i2 << 8) | (b2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                u2[] u2VarArr = (u2[]) u2Var2.z;
                u2VarArr.getClass();
                u2Var2 = u2VarArr[(i2 >>> (i3 - 8)) & 255];
                u2Var2.getClass();
                if (((u2[]) u2Var2.z) == null) {
                    fVar.o0(u2Var2.e);
                    i3 -= u2Var2.y;
                    u2Var2 = u2Var;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            u2[] u2VarArr2 = (u2[]) u2Var2.z;
            u2VarArr2.getClass();
            u2 u2Var3 = u2VarArr2[(i2 << (8 - i3)) & 255];
            u2Var3.getClass();
            int i4 = u2Var3.y;
            if (((u2[]) u2Var3.z) != null || i4 > i3) {
                break;
            }
            fVar.o0(u2Var3.e);
            i3 -= i4;
            u2Var2 = u2Var;
        }
        return fVar.k(fVar.y);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.c.readByte();
            byte[] bArr = okhttp3.internal.e.a;
            int i5 = b & 255;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }
}
