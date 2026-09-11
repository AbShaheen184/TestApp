package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static final ColorSpace a(androidx.compose.ui.graphics.colorspace.c cVar) {
        if (kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (kotlin.jvm.internal.l.a(cVar, androidx.compose.ui.graphics.colorspace.d.w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }
}
