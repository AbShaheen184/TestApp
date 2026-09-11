package com.google.firebase.crashlytics.internal.metadata;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends InputStream implements InputStreamRetargetInterface {
    public int e;
    public int y;
    public final /* synthetic */ l z;

    public j(l lVar, i iVar) {
        this.z = lVar;
        this.e = lVar.a0(iVar.a + 4);
        this.y = iVar.b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            com.google.gson.b.h("buffer");
            return 0;
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.y;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = this.e;
        l lVar = this.z;
        lVar.X(i4, bArr, i, i2);
        this.e = lVar.a0(this.e + i2);
        this.y -= i2;
        return i2;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        l lVar = this.z;
        RandomAccessFile randomAccessFile = lVar.e;
        if (this.y == 0) {
            return -1;
        }
        randomAccessFile.seek(this.e);
        int i = randomAccessFile.read();
        this.e = lVar.a0(this.e + 1);
        this.y--;
        return i;
    }
}
