package androidx.media3.datasource;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final Pattern a;

    static {
        Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
        a = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");
    }

    public static String a(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sbM = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j, "bytes=", "-");
        if (j2 != -1) {
            sbM.append((j + j2) - 1);
        }
        return sbM.toString();
    }
}
