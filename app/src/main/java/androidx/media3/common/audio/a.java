package androidx.media3.common.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.lazy.layout.b1;
import androidx.media3.common.util.g0;
import androidx.media3.exoplayer.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends BroadcastReceiver {
    public final x a;
    public final g0 b;
    public final /* synthetic */ b1 c;

    public a(b1 b1Var, g0 g0Var, x xVar) {
        this.c = b1Var;
        this.b = g0Var;
        this.a = xVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.d(new androidx.activity.l(this, 11));
        }
    }
}
