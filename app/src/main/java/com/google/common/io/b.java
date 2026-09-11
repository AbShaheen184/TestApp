package com.google.common.io;

import com.app.mlounge.emulator.LibretroCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d {
    public final char[] f;

    public b(a aVar) {
        super(aVar, (Character) null);
        this.f = new char[512];
        char[] cArr = aVar.b;
        com.google.android.material.motion.a.f(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | LibretroCore.SCREEN_WIDTH] = cArr[i & 15];
        }
    }

    @Override // com.google.common.io.d
    public final void c(StringBuilder sb, byte[] bArr, int i) {
        com.google.android.material.motion.a.o(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.f;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | LibretroCore.SCREEN_WIDTH]);
        }
    }
}
