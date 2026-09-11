package androidx.media3.exoplayer.util;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.text.input.b0;
import androidx.media3.common.audio.h;
import androidx.media3.common.e;
import androidx.media3.common.r;
import androidx.media3.common.util.j0;
import com.google.common.collect.a1;
import com.google.common.collect.e0;
import com.google.common.collect.h0;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final c d;

    public d(Context context, Runnable runnable, Boolean bool) {
        AudioManager audioManagerL = context == null ? null : h.l(context);
        if (audioManagerL == null || (bool != null && bool.booleanValue())) {
            this.a = null;
            this.b = false;
            this.c = null;
            this.d = null;
            return;
        }
        Spatializer spatializer = audioManagerL.getSpatializer();
        this.a = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        Handler handler = new Handler(looperMyLooper);
        this.c = handler;
        c cVar = new c(runnable);
        this.d = cVar;
        spatializer.addOnSpatializerStateChangedListener(new b0(handler, 2), cVar);
    }

    public final boolean a(e eVar, r rVar) {
        if (this.a == null || !this.b || !c() || !d()) {
            return false;
        }
        String str = rVar.o;
        int i = rVar.G;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i == 16) {
                i = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i == -1) {
                i = 6;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i == 18 || i == 21)) {
            i = 24;
        }
        int iT = j0.t(i);
        if (iT == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iT);
        int i2 = rVar.H;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(eVar.a(), channelMask.build());
    }

    public final List b() {
        if (this.a == null || !this.b || !c() || !d()) {
            e0 e0Var = h0.y;
            return a1.B;
        }
        if (Build.VERSION.SDK_INT < 36) {
            return h0.s(252);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.getSpatializedChannelMasks();
    }

    public final boolean c() {
        Spatializer spatializer = this.a;
        return spatializer != null && spatializer.isAvailable();
    }

    public final boolean d() {
        Spatializer spatializer = this.a;
        return spatializer != null && spatializer.isEnabled();
    }

    public final void e() {
        c cVar;
        Handler handler;
        Spatializer spatializer = this.a;
        if (spatializer == null || (cVar = this.d) == null || (handler = this.c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(cVar);
        handler.removeCallbacksAndMessages(null);
    }
}
