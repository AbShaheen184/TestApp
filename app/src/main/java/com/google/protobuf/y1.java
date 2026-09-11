package com.google.protobuf;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends InputStream implements InputStreamRetargetInterface {
    public int A;
    public int B;
    public int C;
    public final /* synthetic */ z1 D;
    public x1 e;
    public o y;
    public int z;

    public y1(z1 z1Var) {
        this.D = z1Var;
        x1 x1Var = new x1(z1Var);
        this.e = x1Var;
        o next = x1Var.next();
        this.y = next;
        this.z = next.size();
        this.A = 0;
        this.B = 0;
    }

    public final void a() {
        if (this.y != null) {
            int i = this.A;
            int i2 = this.z;
            if (i == i2) {
                this.B += i2;
                this.A = 0;
                if (!this.e.hasNext()) {
                    this.y = null;
                    this.z = 0;
                } else {
                    o next = this.e.next();
                    this.y = next;
                    this.z = next.size();
                }
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.D.e - (this.B + this.A);
    }

    public final int g(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            a();
            if (this.y == null) {
                break;
            }
            int iMin = Math.min(this.z - this.A, i3);
            if (bArr != null) {
                this.y.copyTo(bArr, this.A, i, iMin);
                i += iMin;
            }
            this.A += iMin;
            i3 -= iMin;
        }
        return i2 - i3;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.C = this.B + this.A;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        int iG = g(bArr, i, i2);
        if (iG != 0) {
            return iG;
        }
        if (i2 <= 0) {
            if (this.D.e - (this.B + this.A) != 0) {
                return iG;
            }
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        x1 x1Var = new x1(this.D);
        this.e = x1Var;
        o next = x1Var.next();
        this.y = next;
        this.z = next.size();
        this.A = 0;
        this.B = 0;
        g(null, 0, this.C);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return g(null, 0, (int) j);
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        a();
        o oVar = this.y;
        if (oVar == null) {
            return -1;
        }
        int i = this.A;
        this.A = i + 1;
        return oVar.byteAt(i) & 255;
    }
}
