package org.jsoup.internal;

import com.google.common.util.concurrent.g0;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends FilterInputStream implements InputStreamRetargetInterface {
    public static final g0 D = new g0(new c(0));
    public int A;
    public int B;
    public boolean C;
    public int e;
    public byte[] y;
    public int z;

    public d(InputStream inputStream) {
        super(inputStream);
        this.e = Integer.MAX_VALUE;
        this.B = -1;
        this.C = false;
        if (inputStream == null) {
            this.C = true;
        }
    }

    public final void a() throws IOException {
        int iMin;
        int i;
        if (this.C) {
            return;
        }
        if (this.y == null) {
            this.y = (byte[]) D.m();
        }
        byte[] bArr = this.y;
        if (bArr != null && (i = this.z) != 0) {
            int i2 = this.B;
            if (i2 >= 0) {
                i = i2;
            }
            if (i > 0) {
                int i3 = this.A - i;
                if (i3 > 0) {
                    System.arraycopy(bArr, i, bArr, 0, i3);
                }
                this.A = i3;
                this.z -= i;
                int i4 = this.B;
                if (i4 >= 0) {
                    this.B = i4 - i;
                }
            }
        }
        int i5 = this.z;
        this.A = i5;
        int iMin2 = Math.min(this.y.length - i5, this.e);
        if (iMin2 <= 0) {
            return;
        }
        int i6 = ((FilterInputStream) this).in.read(this.y, this.z, iMin2);
        if (i6 > 0) {
            this.A = this.z + i6;
            this.e -= i6;
            while (this.y.length - this.A > 0 && this.e > 0) {
                try {
                    if (((FilterInputStream) this).in.available() < 1 || (iMin = Math.min(this.y.length - this.A, this.e)) <= 0 || (i6 = ((FilterInputStream) this).in.read(this.y, this.A, iMin)) <= 0) {
                        break;
                    }
                    this.A += i6;
                    this.e -= i6;
                } catch (IOException unused) {
                }
            }
        }
        if (i6 == -1) {
            this.C = true;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.y != null ? this.A - this.z : 0;
        if (i > 0) {
            return i;
        }
        if (this.C) {
            return 0;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (((FilterInputStream) this).in != null) {
            super.close();
        }
        byte[] bArr = this.y;
        if (bArr == null) {
            return;
        }
        D.z(bArr);
        this.y = null;
    }

    public final void g() {
        if (((FilterInputStream) this).in != null) {
            this.C = false;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        n.H(bArr);
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.A - this.z;
        if (i3 <= 0) {
            a();
            i3 = this.A - this.z;
        }
        int iMin = Math.min(i3, i2);
        if (iMin <= 0) {
            return -1;
        }
        n.H(this.y);
        System.arraycopy(this.y, this.z, bArr, i, iMin);
        this.z += iMin;
        return iMin;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.z >= this.A) {
            a();
            if (this.z >= this.A) {
                return -1;
            }
        }
        n.H(this.y);
        byte[] bArr = this.y;
        int i = this.z;
        this.z = i + 1;
        return bArr[i] & 255;
    }
}
