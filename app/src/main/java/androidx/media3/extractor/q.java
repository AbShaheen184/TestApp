package androidx.media3.extractor;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface q {
    n[] a();

    default n[] b(Uri uri, Map map) {
        return a();
    }
}
