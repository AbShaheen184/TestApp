package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends l {
    public final byte[] f;

    public m(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f = bArr;
    }

    @Override // com.google.android.gms.common.l
    public final byte[] H() {
        return this.f;
    }
}
