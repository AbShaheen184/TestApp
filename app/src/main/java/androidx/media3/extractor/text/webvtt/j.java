package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.util.j0;
import androidx.media3.common.util.w;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(w wVar) {
        wVar.getClass();
        String strN = wVar.n(StandardCharsets.UTF_8);
        return strN != null && strN.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String str2 = j0.a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                net.luminis.tls.engine.impl.c.o("Expected 3 decimal places, got: ".concat(strTrim));
                return 0L;
            }
            j2 += Long.parseLong(strTrim);
        }
        return j2 * 1000;
    }

    public static void d(w wVar) throws androidx.media3.common.j0 {
        int i = wVar.b;
        if (a(wVar)) {
            return;
        }
        wVar.M(i);
        throw androidx.media3.common.j0.a(null, "Expected WEBVTT. Got " + wVar.n(StandardCharsets.UTF_8));
    }
}
