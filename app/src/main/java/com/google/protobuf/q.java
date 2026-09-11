package com.google.protobuf;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends OutputStream {
    public byte[] A;
    public int B;
    public final int e;
    public final ArrayList y;
    public int z;

    public q(int i) {
        if (i < 0) {
            net.luminis.tls.engine.impl.c.o("Buffer size < 0");
            throw null;
        }
        this.e = i;
        this.y = new ArrayList();
        this.A = new byte[i];
    }

    public final void a(int i) {
        this.y.add(new p(this.A));
        int length = this.z + this.A.length;
        this.z = length;
        this.A = new byte[Math.max(this.e, Math.max(i, length >>> 1))];
        this.B = 0;
    }

    public final String toString() {
        int i;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.z + this.B;
        }
        return "<ByteString.Output@" + hexString + " size=" + i + ">";
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            byte[] bArr2 = this.A;
            int length = bArr2.length;
            int i3 = this.B;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.B += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                a(i4);
                System.arraycopy(bArr, i + length2, this.A, 0, i4);
                this.B = i4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.B == this.A.length) {
                a(1);
            }
            byte[] bArr = this.A;
            int i2 = this.B;
            this.B = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }
}
