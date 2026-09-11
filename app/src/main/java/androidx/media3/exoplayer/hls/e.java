package androidx.media3.exoplayer.hls;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends LinkedHashMap {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, float f, boolean z, int i2) {
        super(i, f, z);
        this.e = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Matcher a(e eVar, String str, Pattern pattern) {
        Matcher matcher = (Matcher) eVar.get(pattern);
        if (matcher != null) {
            matcher.reset(str);
            return matcher;
        }
        Matcher matcher2 = pattern.matcher(str);
        eVar.put(pattern, matcher2);
        return matcher2;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.e) {
            case 0:
                return size() > 4;
            default:
                return size() > 32;
        }
    }
}
