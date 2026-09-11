package androidx.media3.extractor;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h0 {
    public final byte[] a = new byte[4096];

    @Override // androidx.media3.extractor.h0
    public final void b(androidx.media3.common.util.w wVar, int i, int i2) {
        wVar.N(i);
    }

    @Override // androidx.media3.extractor.h0
    public final int c(androidx.media3.common.i iVar, int i, boolean z) throws EOFException {
        byte[] bArr = this.a;
        int i2 = iVar.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // androidx.media3.extractor.h0
    public final void e(androidx.media3.common.r rVar) {
    }

    @Override // androidx.media3.extractor.h0
    public final void g(long j, int i, int i2, int i3, g0 g0Var) {
    }
}
