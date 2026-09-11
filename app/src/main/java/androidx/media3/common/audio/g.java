package androidx.media3.common.audio;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final int a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final androidx.media3.common.e d;
    public final Object e;

    public g(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, androidx.media3.common.e eVar, boolean z) {
        this.a = i;
        this.c = handler;
        this.d = eVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.b = new f(onAudioFocusChangeListener, handler);
        } else {
            this.b = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.e = new AudioFocusRequest.Builder(i).setAudioAttributes(eVar.a()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z).build();
        } else {
            this.e = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && Objects.equals(this.b, gVar.b) && Objects.equals(this.c, gVar.c) && Objects.equals(this.d, gVar.d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.FALSE);
    }
}
