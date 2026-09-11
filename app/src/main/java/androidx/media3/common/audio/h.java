package androidx.media3.common.audio;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.hardware.display.DisplayManager;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.view.Display;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static AudioManager a;

    public static void a(AudioManager audioManager, g gVar) {
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(gVar.b);
            return;
        }
        Object obj = gVar.e;
        obj.getClass();
        audioManager.abandonAudioFocusRequest((AudioFocusRequest) obj);
    }

    public static boolean b(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public static boolean c(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    public static boolean d(Canvas canvas, int i, int i2, int i3, int i4) {
        return canvas.clipOutRect(i, i2, i3, i4);
    }

    public static boolean e(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public static boolean f(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    public static Notification.Builder g(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static final androidx.compose.ui.autofill.g h(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new androidx.compose.ui.autofill.g(AutofillValue.forToggle(z));
        }
        return null;
    }

    public static final androidx.compose.ui.autofill.g i(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new androidx.compose.ui.autofill.g(AutofillValue.forText(charSequence));
        }
        return null;
    }

    public static Icon j(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static boolean k(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i : hdrCapabilities.getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public static synchronized AudioManager l(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                a = null;
            }
            AudioManager audioManager = a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                androidx.media3.common.util.h hVar = new androidx.media3.common.util.h();
                androidx.media3.common.util.c.h().execute(new androidx.activity.c(3, applicationContext, hVar));
                hVar.a();
                AudioManager audioManager2 = a;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            a = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static float m(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float n(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float o(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static float p(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static Intent q(Context context, androidx.media3.common.util.t tVar, IntentFilter intentFilter) {
        return context.registerReceiver(tVar, intentFilter, null, null, 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public static int r(AudioManager audioManager, g gVar) {
        int volumeControlStream;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            Object obj = gVar.e;
            obj.getClass();
            return audioManager.requestAudioFocus((AudioFocusRequest) obj);
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = gVar.b;
        androidx.media3.common.e eVar = gVar.d;
        eVar.getClass();
        if (i >= 26) {
            try {
                volumeControlStream = eVar.a().getVolumeControlStream();
                if (volumeControlStream == Integer.MIN_VALUE) {
                    volumeControlStream = 3;
                }
            } catch (RuntimeException unused) {
            }
        } else {
            volumeControlStream = 3;
        }
        return audioManager.requestAudioFocus(onAudioFocusChangeListener, volumeControlStream, gVar.a);
    }

    public static void s(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void t(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void u(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void v(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void w(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }
}
