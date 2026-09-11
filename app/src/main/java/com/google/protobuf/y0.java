package com.google.protobuf;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends InputStream implements InputStreamRetargetInterface {
    public int A;
    public int B;
    public boolean C;
    public byte[] D;
    public int E;
    public long F;
    public Iterator e;
    public ByteBuffer y;
    public int z;

    public final boolean a() {
        ByteBuffer byteBuffer;
        Iterator it = this.e;
        do {
            this.A++;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.y = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.B = this.y.position();
        if (this.y.hasArray()) {
            this.C = true;
            this.D = this.y.array();
            this.E = this.y.arrayOffset();
            return true;
        }
        this.C = false;
        this.F = l2.c.j(l2.g, this.y);
        this.D = null;
        return true;
    }

    public final void g(int i) {
        int i2 = this.B + i;
        this.B = i2;
        if (i2 == this.y.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.A == this.z) {
            return -1;
        }
        int iLimit = this.y.limit();
        int i3 = this.B;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.C) {
            System.arraycopy(this.D, i3 + this.E, bArr, i, i2);
            g(i2);
            return i2;
        }
        int iPosition = this.y.position();
        this.y.position(this.B);
        this.y.get(bArr, i, i2);
        this.y.position(iPosition);
        g(i2);
        return i2;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.A == this.z) {
            return -1;
        }
        if (this.C) {
            int i = this.D[this.B + this.E] & 255;
            g(1);
            return i;
        }
        int iD = l2.c.d(((long) this.B) + this.F) & 255;
        g(1);
        return iD;
    }
}
