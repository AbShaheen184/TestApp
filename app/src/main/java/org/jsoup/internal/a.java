package org.jsoup.internal;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends FilterInputStream implements InputStreamRetargetInterface {
    public static final /* synthetic */ int G = 0;
    public long A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public final d e;
    public int y;
    public long z;

    public a(d dVar, int i) {
        super(dVar);
        this.A = 0L;
        this.E = true;
        this.F = 0;
        n.C(i >= 0);
        this.e = dVar;
        this.y = i;
        this.B = i;
        this.C = -1;
        this.z = System.nanoTime();
    }

    public final void a(int i) {
        int i2 = (i - this.y) + this.B;
        this.B = i2;
        if (i2 < 0) {
            this.B = 0;
        }
        this.y = i;
        int i3 = i == 0 ? Integer.MAX_VALUE : this.B;
        d dVar = this.e;
        dVar.getClass();
        dVar.e = Math.max(0, i3);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.E) {
            super.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        this.C = this.F;
        d dVar = this.e;
        dVar.B = dVar.z;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        boolean z = this.y != 0;
        if (this.D || (z && this.B <= 0)) {
            return -1;
        }
        if (Thread.currentThread().isInterrupted()) {
            this.D = true;
            return -1;
        }
        if (z && i2 > (i3 = this.B)) {
            i2 = i3;
        }
        int i4 = z ? this.B : Integer.MAX_VALUE;
        d dVar = this.e;
        dVar.getClass();
        dVar.e = Math.max(0, i4);
        do {
            if (this.A != 0 && System.nanoTime() - this.z > this.A) {
                throw new SocketTimeoutException("Read timeout");
            }
            try {
                int i5 = super.read(bArr, i, i2);
                if (i5 != -1) {
                    if (z && i5 > 0) {
                        this.B -= i5;
                    }
                    this.F += i5;
                }
                return i5;
            } catch (SocketTimeoutException e) {
                if (this.A != 0 && System.nanoTime() - this.z > this.A) {
                    break;
                }
                throw e;
            }
        } while (this.A != 0);
        throw e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        int i = this.C;
        if (i < 0) {
            net.luminis.tls.engine.impl.c.t("Resetting to invalid mark");
            return;
        }
        d dVar = this.e;
        int i2 = dVar.B;
        if (i2 < 0) {
            net.luminis.tls.engine.impl.c.t("Resetting to invalid mark");
            return;
        }
        dVar.z = i2;
        dVar.B = -1;
        int i3 = this.y;
        if (i3 != 0) {
            int i4 = i3 - i;
            this.B = i4;
            dVar.e = Math.max(0, i4);
        } else {
            this.B = 0;
            dVar.e = Math.max(0, Integer.MAX_VALUE);
        }
        this.F = this.C;
        this.C = -1;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
