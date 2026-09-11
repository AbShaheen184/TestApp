package j$.util;

import j$.time.ZoneId;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class TimeZoneRetargetClass {
    public static ZoneId toZoneId(TimeZone timeZone) {
        String id = timeZone.getID();
        Map map = ZoneId.a;
        Objects.requireNonNull(id, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        String str = (String) map.get(id);
        if (str != null) {
            id = str;
        }
        return ZoneId.O(id, true);
    }
}
