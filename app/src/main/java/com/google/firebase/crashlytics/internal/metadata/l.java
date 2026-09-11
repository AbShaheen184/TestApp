package com.google.firebase.crashlytics.internal.metadata;

import androidx.compose.foundation.gestures.z1;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Closeable {
    public static final Logger D = Logger.getLogger(l.class.getName());
    public i A;
    public i B;
    public final byte[] C;
    public final RandomAccessFile e;
    public int y;
    public int z;

    public l(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.C = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    c0(bArr2, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    net.luminis.tls.engine.impl.c.t("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.e = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iL = L(bArr, 0);
        this.y = iL;
        if (iL <= randomAccessFile2.length()) {
            this.z = L(bArr, 4);
            int iL2 = L(bArr, 8);
            int iL3 = L(bArr, 12);
            this.A = z(iL2);
            this.B = z(iL3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.y + ", Actual length: " + randomAccessFile2.length());
    }

    public static int L(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static void c0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public final synchronized void N() {
        if (w()) {
            throw new NoSuchElementException();
        }
        if (this.z == 1) {
            synchronized (this) {
                b0(4096, 0, 0, 0);
                this.z = 0;
                i iVar = i.c;
                this.A = iVar;
                this.B = iVar;
                if (this.y > 4096) {
                    RandomAccessFile randomAccessFile = this.e;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.y = 4096;
            }
        } else {
            i iVar2 = this.A;
            int iA0 = a0(iVar2.a + 4 + iVar2.b);
            X(iA0, this.C, 0, 4);
            int iL = L(this.C, 0);
            b0(this.y, this.z - 1, iA0, this.B.a);
            this.z--;
            this.A = new i(iA0, iL);
        }
    }

    public final void X(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iA0 = a0(i);
        int i4 = iA0 + i3;
        int i5 = this.y;
        RandomAccessFile randomAccessFile = this.e;
        if (i4 <= i5) {
            randomAccessFile.seek(iA0);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iA0;
        randomAccessFile.seek(iA0);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void Y(byte[] bArr, int i, int i2) throws IOException {
        int iA0 = a0(i);
        int i3 = iA0 + i2;
        int i4 = this.y;
        RandomAccessFile randomAccessFile = this.e;
        if (i3 <= i4) {
            randomAccessFile.seek(iA0);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iA0;
        randomAccessFile.seek(iA0);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final int Z() {
        if (this.z == 0) {
            return 16;
        }
        i iVar = this.B;
        int i = iVar.a;
        int i2 = this.A.a;
        return i >= i2 ? (i - i2) + 4 + iVar.b + 16 : (((i + 4) + iVar.b) + this.y) - i2;
    }

    public final void a(byte[] bArr) {
        int iA0;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    g(length);
                    boolean zW = w();
                    if (zW) {
                        iA0 = 16;
                    } else {
                        i iVar = this.B;
                        iA0 = a0(iVar.a + 4 + iVar.b);
                    }
                    i iVar2 = new i(iA0, length);
                    c0(this.C, 0, length);
                    Y(this.C, iA0, 4);
                    Y(bArr, iA0 + 4, length);
                    b0(this.y, this.z + 1, zW ? iA0 : this.A.a, iA0);
                    this.B = iVar2;
                    this.z++;
                    if (zW) {
                        this.A = iVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final int a0(int i) {
        int i2 = this.y;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void b0(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.C;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.e;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                c0(bArr, i6, iArr[i5]);
                i6 += 4;
                i5++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e.close();
    }

    public final void g(int i) throws IOException {
        int i2 = i + 4;
        int iZ = this.y - Z();
        if (iZ >= i2) {
            return;
        }
        int i3 = this.y;
        do {
            iZ += i3;
            i3 <<= 1;
        } while (iZ < i2);
        RandomAccessFile randomAccessFile = this.e;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        i iVar = this.B;
        int iA0 = a0(iVar.a + 4 + iVar.b);
        if (iA0 < this.A.a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.y);
            long j = iA0 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                net.luminis.tls.engine.impl.c.m("Copied insufficient number of bytes!");
                return;
            }
        }
        int i4 = this.B.a;
        int i5 = this.A.a;
        if (i4 < i5) {
            int i6 = (this.y + i4) - 16;
            b0(i3, this.z, i5, i6);
            this.B = new i(i6, this.B.b);
        } else {
            b0(i3, this.z, i5, i4);
        }
        this.y = i3;
    }

    public final synchronized void m(k kVar) {
        int iA0 = this.A.a;
        for (int i = 0; i < this.z; i++) {
            i iVarZ = z(iA0);
            kVar.a(new j(this, iVarZ), iVarZ.b);
            iA0 = a0(iVarZ.a + 4 + iVarZ.b);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(l.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.y);
        sb.append(", size=");
        sb.append(this.z);
        sb.append(", first=");
        sb.append(this.A);
        sb.append(", last=");
        sb.append(this.B);
        sb.append(", element lengths=[");
        try {
            m(new z1(sb));
        } catch (IOException e) {
            D.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final synchronized boolean w() {
        return this.z == 0;
    }

    public final i z(int i) throws IOException {
        if (i == 0) {
            return i.c;
        }
        RandomAccessFile randomAccessFile = this.e;
        randomAccessFile.seek(i);
        return new i(i, randomAccessFile.readInt());
    }
}
