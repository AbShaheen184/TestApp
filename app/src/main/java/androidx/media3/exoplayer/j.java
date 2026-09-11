package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends androidx.media3.common.k0 {
    public final String A;
    public final int B;
    public final androidx.media3.common.r C;
    public final int D;
    public final androidx.media3.exoplayer.source.v E;
    public final boolean F;
    public final int z;

    /* JADX WARN: Illegal instructions before constructor call */
    public j(int i, Exception exc, int i2, String str, int i3, androidx.media3.common.r rVar, int i4, androidx.media3.exoplayer.source.v vVar, boolean z) {
        String str2;
        int i5;
        androidx.media3.common.r rVar2;
        String string;
        String str3;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            rVar2 = rVar;
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            rVar2 = rVar;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            rVar2 = rVar;
            sb.append(rVar2);
            sb.append(", format_supported=");
            String str4 = androidx.media3.common.util.j0.a;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    org.mozilla.javascript.c.a();
                    throw null;
                }
                str3 = "YES";
            }
            sb.append(str3);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), exc, i2, i, str2, i5, rVar2, i4, vVar, SystemClock.elapsedRealtime(), z);
    }

    public final j a(androidx.media3.exoplayer.source.v vVar) {
        String message = getMessage();
        String str = androidx.media3.common.util.j0.a;
        return new j(message, getCause(), this.e, this.z, this.A, this.B, this.C, this.D, vVar, this.y, this.F);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, Throwable th, int i, int i2, String str2, int i3, androidx.media3.common.r rVar, int i4, androidx.media3.exoplayer.source.v vVar, long j, boolean z) {
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        com.google.android.material.motion.a.f(!z || i2 == 1);
        com.google.android.material.motion.a.f(th != null || i2 == 3);
        this.z = i2;
        this.A = str2;
        this.B = i3;
        this.C = rVar;
        this.D = i4;
        this.E = vVar;
        this.F = z;
    }

    public j(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}
