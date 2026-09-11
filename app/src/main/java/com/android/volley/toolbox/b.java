package com.android.volley.toolbox;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends FilterInputStream implements InputStreamRetargetInterface {
    public final /* synthetic */ int e = 0;
    public long y;
    public long z;

    public b(InputStream inputStream) {
        super(inputStream);
        this.z = -1L;
        this.y = 1048577L;
    }

    private /* synthetic */ long a(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    private /* synthetic */ long g(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        switch (this.e) {
            case 1:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.y);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.e) {
            case 1:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i);
                    this.z = this.y;
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.e) {
            case 0:
                int i3 = super.read(bArr, i, i2);
                if (i3 != -1) {
                    this.z += (long) i3;
                }
                return i3;
            default:
                long j = this.y;
                if (j == 0) {
                    return -1;
                }
                int i4 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
                if (i4 != -1) {
                    this.y -= (long) i4;
                }
                return i4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.e) {
            case 1:
                synchronized (this) {
                    if (!((FilterInputStream) this).in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.z == -1) {
                        throw new IOException("Mark not set");
                    }
                    ((FilterInputStream) this).in.reset();
                    this.y = this.z;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        switch (this.e) {
            case 1:
                long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.y));
                this.y -= jSkip;
                return jSkip;
            default:
                return super.skip(j);
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        switch (this.e) {
            case 0:
                return a(outputStream);
            default:
                return g(outputStream);
        }
    }

    public b(BufferedInputStream bufferedInputStream, long j) {
        super(bufferedInputStream);
        this.y = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.e) {
            case 0:
                int i = super.read();
                if (i != -1) {
                    this.z++;
                }
                return i;
            default:
                if (this.y == 0) {
                    return -1;
                }
                int i2 = ((FilterInputStream) this).in.read();
                if (i2 != -1) {
                    this.y--;
                }
                return i2;
        }
    }
}
