package okhttp3.internal.http2;

import com.app.mlounge.emulator.LibretroCore;
import com.google.android.gms.measurement.internal.e0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final okio.i a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;

    static {
        okio.i iVar = okio.i.A;
        a = e0.h("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] strArr = new String[LibretroCore.SCREEN_WIDTH];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            binaryString.getClass();
            String strReplace = okhttp3.internal.g.d("%8s", binaryString).replace(' ', '0');
            strReplace.getClass();
            strArr[i] = strReplace;
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, strArr3[i4], "|PADDED");
        }
        int length = c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = c;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
        }
    }

    public static String a(int i) {
        String[] strArr = b;
        return i < strArr.length ? strArr[i] : okhttp3.internal.g.d("0x%02x", Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    public static String b(boolean z, int i, int i2, int i3, int i4) {
        String strM;
        String str;
        String strA = a(i3);
        if (i4 == 0) {
            strM = "";
        } else {
            String[] strArr = d;
            if (i3 == 2 || i3 == 3) {
                strM = strArr[i4];
            } else if (i3 == 4 || i3 == 6) {
                strM = i4 == 1 ? "ACK" : strArr[i4];
            } else if (i3 == 7 || i3 == 8) {
                strM = strArr[i4];
            } else {
                String[] strArr2 = c;
                if (i4 < strArr2.length) {
                    str = strArr2[i4];
                    str.getClass();
                } else {
                    str = strArr[i4];
                }
                if (i3 != 5 || (i4 & 4) == 0) {
                    strM = (i3 != 0 || (i4 & 32) == 0) ? str : kotlin.text.r.M(str, "PRIORITY", "COMPRESSED", false);
                } else {
                    strM = kotlin.text.r.M(str, "HEADERS", "PUSH_PROMISE", false);
                }
            }
        }
        return okhttp3.internal.g.d("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strA, strM);
    }

    public static String c(int i, long j, int i2, boolean z) {
        return okhttp3.internal.g.d("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), a(8), Long.valueOf(j));
    }
}
