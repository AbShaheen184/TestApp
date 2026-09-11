package androidx.media3.exoplayer.hls;

import android.text.TextUtils;
import androidx.compose.foundation.lazy.layout.b1;
import androidx.media3.common.i0;
import androidx.media3.common.j0;
import androidx.media3.common.util.h0;
import androidx.media3.common.util.w;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements androidx.media3.extractor.n {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final h0 b;
    public final com.google.android.gms.common.internal.k d;
    public final boolean e;
    public androidx.media3.extractor.p f;
    public int h;
    public final w c = new w();
    public byte[] g = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];

    public u(String str, h0 h0Var, com.google.android.gms.common.internal.k kVar, boolean z) {
        this.a = str;
        this.b = h0Var;
        this.d = kVar;
        this.e = z;
    }

    @Override // androidx.media3.extractor.n
    public final boolean a(androidx.media3.extractor.o oVar) {
        androidx.media3.extractor.k kVar = (androidx.media3.extractor.k) oVar;
        kVar.e(this.g, 0, 6, false);
        byte[] bArr = this.g;
        w wVar = this.c;
        wVar.K(bArr, 6);
        if (androidx.media3.extractor.text.webvtt.j.a(wVar)) {
            return true;
        }
        kVar.e(this.g, 6, 3, false);
        wVar.K(this.g, 9);
        return androidx.media3.extractor.text.webvtt.j.a(wVar);
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.extractor.n
    public final int c(androidx.media3.extractor.o oVar, androidx.media3.extractor.r rVar) throws j0 {
        String strN;
        this.f.getClass();
        int length = (int) oVar.getLength();
        int i2 = this.h;
        byte[] bArr = this.g;
        if (i2 == bArr.length) {
            this.g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.g;
        int i3 = this.h;
        int i4 = oVar.read(bArr2, i3, bArr2.length - i3);
        if (i4 != -1) {
            int i5 = this.h + i4;
            this.h = i5;
            if (length == -1 || i5 != length) {
                return 0;
            }
        }
        w wVar = new w(this.g);
        androidx.media3.extractor.text.webvtt.j.d(wVar);
        String strN2 = wVar.n(StandardCharsets.UTF_8);
        long jY = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strN2)) {
                while (true) {
                    String strN3 = wVar.n(StandardCharsets.UTF_8);
                    if (strN3 == null) {
                        break;
                    }
                    if (androidx.media3.extractor.text.webvtt.j.a.matcher(strN3).matches()) {
                        do {
                            strN = wVar.n(StandardCharsets.UTF_8);
                            if (strN == null) {
                                break;
                            }
                        } while (!strN.isEmpty());
                    } else {
                        Matcher matcher2 = androidx.media3.extractor.text.webvtt.h.a.matcher(strN3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    f(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = androidx.media3.extractor.text.webvtt.j.c(strGroup);
                String str = androidx.media3.common.util.j0.a;
                long jB = this.b.b(androidx.media3.common.util.j0.Y((jY + jC2) - jC, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                androidx.media3.extractor.h0 h0VarF = f(jB - jC2);
                byte[] bArr3 = this.g;
                int i6 = this.h;
                w wVar2 = this.c;
                wVar2.K(bArr3, i6);
                h0VarF.f(this.h, wVar2);
                h0VarF.g(jB, 1, this.h, 0, null);
                return -1;
            }
            if (strN2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(strN2);
                if (!matcher3.find()) {
                    throw j0.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strN2));
                }
                Matcher matcher4 = j.matcher(strN2);
                if (!matcher4.find()) {
                    throw j0.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strN2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = androidx.media3.extractor.text.webvtt.j.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j2 = Long.parseLong(strGroup3);
                String str2 = androidx.media3.common.util.j0.a;
                jY = androidx.media3.common.util.j0.Y(j2, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strN2 = wVar.n(StandardCharsets.UTF_8);
        }
    }

    @Override // androidx.media3.extractor.n
    public final void d(androidx.media3.extractor.p pVar) {
        if (this.e) {
            pVar = new b1(pVar, this.d);
        }
        this.f = pVar;
        pVar.g(new androidx.media3.extractor.s(-9223372036854775807L));
    }

    public final androidx.media3.extractor.h0 f(long j2) {
        androidx.media3.extractor.h0 h0VarU = this.f.u(0, 3);
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        qVar.n = i0.p("text/vtt");
        qVar.d = this.a;
        qVar.s = j2;
        h0VarU.e(new androidx.media3.common.r(qVar));
        this.f.o();
        return h0VarU;
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
    }
}
