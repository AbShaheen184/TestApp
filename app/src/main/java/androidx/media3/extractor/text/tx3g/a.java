package androidx.media3.extractor.text.tx3g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.text.b;
import androidx.media3.common.util.c;
import androidx.media3.common.util.i;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.w;
import androidx.media3.extractor.text.k;
import androidx.media3.extractor.text.l;
import com.google.common.collect.a1;
import com.google.common.collect.e0;
import com.google.common.collect.h0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements l {
    public final int A;
    public final String B;
    public final float C;
    public final int D;
    public final w e = new w();
    public final boolean y;
    public final int z;

    public a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.z = 0;
            this.A = -1;
            this.B = "sans-serif";
            this.y = false;
            this.C = 0.85f;
            this.D = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.z = bArr[24];
        this.A = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.B = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.D = i;
        boolean z = (bArr[0] & 32) != 0;
        this.y = z;
        if (z) {
            this.C = j0.i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.C = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.extractor.text.l
    public final void k(byte[] bArr, int i, int i2, k kVar, i iVar) {
        String strX;
        int i3;
        w wVar = this.e;
        wVar.K(bArr, i + i2);
        wVar.M(i);
        int i4 = 1;
        int i5 = 0;
        int i6 = 2;
        com.google.android.material.motion.a.f(wVar.a() >= 2);
        int iG = wVar.G();
        if (iG == 0) {
            strX = "";
        } else {
            int i7 = wVar.b;
            Charset charsetI = wVar.I();
            int i8 = iG - (wVar.b - i7);
            if (charsetI == null) {
                charsetI = StandardCharsets.UTF_8;
            }
            strX = wVar.x(i8, charsetI);
        }
        if (strX.isEmpty()) {
            e0 e0Var = h0.y;
            iVar.accept(new androidx.media3.extractor.text.a(-9223372036854775807L, -9223372036854775807L, a1.B));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strX);
        b(spannableStringBuilder, this.z, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.A, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.B;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fI = this.C;
        while (wVar.a() >= 8) {
            int i9 = wVar.b;
            int iM = wVar.m();
            int iM2 = wVar.m();
            if (iM2 == 1937013100) {
                com.google.android.material.motion.a.f(wVar.a() >= i6 ? i4 : i5);
                int iG2 = wVar.G();
                int i10 = i5;
                while (i10 < iG2) {
                    com.google.android.material.motion.a.f(wVar.a() >= 12 ? i4 : i5);
                    int iG3 = wVar.G();
                    int iG4 = wVar.G();
                    wVar.N(i6);
                    int i11 = i10;
                    int iZ = wVar.z();
                    wVar.N(i4);
                    int iM3 = wVar.m();
                    if (iG4 > spannableStringBuilder.length()) {
                        StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("Truncating styl end (", iG4, ") to cueText.length() (");
                        sbV.append(spannableStringBuilder.length());
                        sbV.append(").");
                        c.t("Tx3gParser", sbV.toString());
                        iG4 = spannableStringBuilder.length();
                    }
                    if (iG3 >= iG4) {
                        c.t("Tx3gParser", "Ignoring styl with start (" + iG3 + ") >= end (" + iG4 + ").");
                    } else {
                        int i12 = iG4;
                        b(spannableStringBuilder, iZ, this.z, iG3, i12, 0);
                        a(spannableStringBuilder, iM3, this.A, iG3, i12, 0);
                    }
                    i10 = i11 + 1;
                    i4 = 1;
                    i5 = 0;
                    i6 = 2;
                }
                i3 = i6;
            } else if (iM2 == 1952608120 && this.y) {
                i3 = 2;
                com.google.android.material.motion.a.f(wVar.a() >= 2);
                fI = j0.i(wVar.G() / this.D, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            wVar.M(i9 + iM);
            i6 = i3;
            i4 = 1;
            i5 = 0;
        }
        iVar.accept(new androidx.media3.extractor.text.a(-9223372036854775807L, -9223372036854775807L, h0.s(new b(spannableStringBuilder, null, null, null, fI, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0))));
    }

    @Override // androidx.media3.extractor.text.l
    public final int z() {
        return 2;
    }
}
