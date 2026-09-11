package com.google.protobuf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements l {
    public final /* synthetic */ int a;

    @Override // com.google.protobuf.l
    public final byte[] a(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                return Arrays.copyOfRange(bArr, i, i2 + i);
            default:
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                return bArr2;
        }
    }
}
