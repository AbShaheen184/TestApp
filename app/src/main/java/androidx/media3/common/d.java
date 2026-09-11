package androidx.media3.common;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static void a(AudioAttributes.Builder builder) {
        builder.setIsContentSpatialized(false);
    }

    public static void b(AudioAttributes.Builder builder) {
        builder.setSpatializationBehavior(0);
    }
}
