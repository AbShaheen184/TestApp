package androidx.media3.extractor.metadata.flac;

import androidx.media3.common.e0;
import androidx.media3.common.g0;
import androidx.media3.common.i0;
import androidx.media3.common.util.w;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g0 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public a(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static a d(w wVar) {
        int iM = wVar.m();
        String strP = i0.p(wVar.x(wVar.m(), StandardCharsets.US_ASCII));
        String strX = wVar.x(wVar.m(), StandardCharsets.UTF_8);
        int iM2 = wVar.m();
        int iM3 = wVar.m();
        int iM4 = wVar.m();
        int iM5 = wVar.m();
        int iM6 = wVar.m();
        byte[] bArr = new byte[iM6];
        wVar.k(bArr, 0, iM6);
        return new a(iM, strP, strX, iM2, iM3, iM4, iM5, bArr);
    }

    @Override // androidx.media3.common.g0
    public final void b(e0 e0Var) {
        e0Var.a(this.h, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && Arrays.equals(this.h, aVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
