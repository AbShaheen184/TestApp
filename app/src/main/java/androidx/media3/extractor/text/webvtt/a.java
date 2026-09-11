package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.util.w;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final w a = new w();
    public final StringBuilder b = new StringBuilder();

    public static String a(w wVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = wVar.b;
        int i2 = wVar.c;
        while (i < i2 && !z) {
            char c2 = (char) wVar.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        wVar.N(i - wVar.b);
        return sb.toString();
    }

    public static String b(w wVar, StringBuilder sb) {
        c(wVar);
        if (wVar.a() == 0) {
            return null;
        }
        String strA = a(wVar, sb);
        if (!strA.isEmpty()) {
            return strA;
        }
        return "" + ((char) wVar.z());
    }

    public static void c(w wVar) {
        while (true) {
            for (boolean z = true; wVar.a() > 0 && z; z = false) {
                int i = wVar.b;
                byte[] bArr = wVar.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    wVar.N(1);
                } else {
                    int i2 = wVar.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            wVar.N(i2 - wVar.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
