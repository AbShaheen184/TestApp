package com.google.common.io;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d {
    /* JADX WARN: Illegal instructions before constructor call */
    public c(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new a(str, charArray), (Character) '=');
        com.google.android.material.motion.a.f(charArray.length == 64);
    }

    @Override // com.google.common.io.d
    public final void c(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        com.google.android.material.motion.a.o(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            a aVar = this.a;
            char[] cArr = aVar.b;
            char[] cArr2 = aVar.b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            b(sb, bArr, i2, i - i2);
        }
    }
}
