package com.google.android.gms.internal.measurement;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class hb extends InputStream implements InputStreamRetargetInterface {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public hb(ib ibVar, w0 w0Var) {
        this.e = 1;
        this.y = w0Var;
    }

    private /* synthetic */ long g(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    private /* synthetic */ long m(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    private /* synthetic */ long w(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int available() {
        switch (this.e) {
            case 2:
                return (int) Math.min(((okio.f) this.y).y, Integer.MAX_VALUE);
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.e) {
            case 2:
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.e) {
            case 0:
                ib ibVar = (ib) this.y;
                try {
                    int iInflate = ibVar.e.inflate(bArr, i, i2);
                    if (iInflate > 0) {
                        return iInflate;
                    }
                    if (i2 == 0) {
                        return 0;
                    }
                    if (ibVar.e.getRemaining() == 0) {
                        return -1;
                    }
                    int remaining = ibVar.e.getRemaining();
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 70 + String.valueOf(remaining).length());
                    sb.append("Read no bytes (requested up to ");
                    sb.append(i2);
                    sb.append(") but did not reach end of stream, had ");
                    sb.append(remaining);
                    throw new IOException(sb.toString());
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            case 1:
                return ((w0) this.y).f(bArr, i, i2);
            default:
                bArr.getClass();
                return ((okio.f) this.y).read(bArr, i, i2);
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        switch (this.e) {
            case 1:
                if (j <= 0) {
                    return 0L;
                }
                int i = j > 2147483647L ? Integer.MAX_VALUE : (int) j;
                ((w0) this.y).g(i);
                return i;
            default:
                return super.skip(j);
        }
    }

    public String toString() {
        switch (this.e) {
            case 2:
                return ((okio.f) this.y) + ".inputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        switch (this.e) {
            case 0:
                return g(outputStream);
            case 1:
                return m(outputStream);
            default:
                return w(outputStream);
        }
    }

    public /* synthetic */ hb(Closeable closeable, int i) {
        this.e = i;
        this.y = closeable;
    }

    private final void a() {
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.e) {
            case 0:
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) == -1) {
                    return -1;
                }
                return bArr[0];
            case 1:
                byte[] bArr2 = new byte[1];
                if (((w0) this.y).f(bArr2, 0, 1) == -1) {
                    return -1;
                }
                return bArr2[0];
            default:
                okio.f fVar = (okio.f) this.y;
                if (fVar.y > 0) {
                    return fVar.readByte() & 255;
                }
                return -1;
        }
    }
}
