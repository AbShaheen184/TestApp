package androidx.media3.extractor.text;

import androidx.activity.y;
import com.google.common.collect.d0;
import com.google.common.collect.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface l {
    void k(byte[] bArr, int i, int i2, k kVar, androidx.media3.common.util.i iVar);

    default d o(byte[] bArr, int i, int i2) {
        d0 d0VarK = h0.k();
        k(bArr, 0, i2, k.c, new y(d0VarK, 22));
        return new b(d0VarK.g());
    }

    int z();

    default void reset() {
    }
}
