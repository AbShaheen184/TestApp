package androidx.media3.exoplayer.audio;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public final Context a;
    public j0 b;
    public o0 c;
    public b d;
    public final float e;

    public e0(Context context) {
        this.a = context != null ? context.getApplicationContext() : null;
        this.c = o0.a;
        if (context == null) {
            this.d = b.f;
        }
        this.e = 8.0f;
    }
}
