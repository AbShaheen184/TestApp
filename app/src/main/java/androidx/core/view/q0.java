package androidx.core.view;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static f b(View view, f fVar) {
        ContentInfo contentInfoF = fVar.a.f();
        Objects.requireNonNull(contentInfoF);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoF ? fVar : new f(new androidx.compose.ui.scrollcapture.i(contentInfoPerformReceiveContent));
    }
}
