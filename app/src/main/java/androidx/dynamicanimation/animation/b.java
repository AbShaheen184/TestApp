package androidx.dynamicanimation.animation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import androidx.media3.common.i0;
import androidx.media3.common.r;
import androidx.media3.exoplayer.audio.g;
import androidx.media3.exoplayer.audio.h;
import androidx.media3.exoplayer.audio.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements j0 {
    public Object a;
    public Object b;

    public b(Context context) {
        this.a = context == null ? null : context.getApplicationContext();
    }

    public h a(androidx.media3.common.e eVar, r rVar) {
        boolean zBooleanValue;
        rVar.getClass();
        int i = rVar.H;
        eVar.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return h.d;
        }
        Context context = (Context) this.a;
        Boolean bool = (Boolean) this.b;
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = androidx.media3.common.audio.h.l(context).getParameters("offloadVariableRateSupported");
                this.b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.b = Boolean.FALSE;
            }
            zBooleanValue = ((Boolean) this.b).booleanValue();
        }
        String str = rVar.o;
        str.getClass();
        int iD = i0.d(str, rVar.k);
        if (iD == 0 || i2 < androidx.media3.common.util.j0.s(iD)) {
            return h.d;
        }
        int iT = androidx.media3.common.util.j0.t(rVar.G);
        if (iT == 0) {
            return h.d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i).setChannelMask(iT).setEncoding(iD).build();
            if (i2 >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(audioFormatBuild, eVar.a());
                if ((directPlaybackSupport & 1) == 0) {
                    return h.d;
                }
                z = (directPlaybackSupport & 3) == 3;
                g gVar = new g();
                gVar.a = true;
                gVar.b = z;
                gVar.c = zBooleanValue;
                return gVar.a();
            }
            if (i2 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, eVar.a())) {
                    return h.d;
                }
                g gVar2 = new g();
                gVar2.a = true;
                gVar2.c = zBooleanValue;
                return gVar2.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, eVar.a());
            if (playbackOffloadSupport == 0) {
                return h.d;
            }
            g gVar3 = new g();
            if (i2 > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            gVar3.a = true;
            gVar3.b = z;
            gVar3.c = zBooleanValue;
            return gVar3.a();
        } catch (IllegalArgumentException unused) {
            return h.d;
        }
    }

    public boolean b() {
        boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener((a) this.a);
        this.a = null;
        return zUnregisterDurationScaleChangeListener;
    }
}
