package io.hopmonsdk.util;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class TimeUtils {
    private TimeUtils() {
    }

    public static String millisToShortDHMS(long j) {
        long j2 = j / 86400000;
        long j3 = j / 3600000;
        long hours = j3 - TimeUnit.DAYS.toHours(j2);
        long j4 = j / 60000;
        long minutes = j4 - TimeUnit.HOURS.toMinutes(j3);
        long seconds = (j / 1000) - TimeUnit.MINUTES.toSeconds(j4);
        return j2 == 0 ? String.format(Locale.US, "%02d:%02d:%02d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)) : String.format(Locale.US, "%dd%02d:%02d:%02d", Long.valueOf(j2), Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds));
    }
}
