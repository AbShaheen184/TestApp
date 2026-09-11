package androidx.core.graphics;

import android.content.ClipData;
import android.graphics.fonts.Font;
import android.view.ContentInfo;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ Font.Builder a(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ ContentInfo.Builder b(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }
}
