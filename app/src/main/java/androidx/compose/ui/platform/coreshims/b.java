package androidx.compose.ui.platform.coreshims;

import android.app.Notification;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.text.MeasuredText;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.view.View;
import android.view.ViewGroup;
import android.view.contentcapture.ContentCaptureSession;
import androidx.media3.common.e;
import androidx.media3.common.i0;
import androidx.media3.common.util.j0;
import androidx.media3.exoplayer.mediacodec.i;
import androidx.media3.exoplayer.mediacodec.o;
import androidx.media3.exoplayer.mediacodec.t;
import androidx.media3.exoplayer.mediacodec.v;
import coil3.decode.f;
import coil3.decode.g;
import coil3.decode.q;
import coil3.decode.r;
import coil3.decode.y;
import coil3.request.n;
import com.google.common.collect.a1;
import com.google.common.collect.d0;
import com.google.common.collect.h0;
import com.google.common.collect.p1;
import java.util.List;
import okio.k;
import okio.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static void A(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }

    public static final ImageDecoder.Source B(q qVar, n nVar) {
        x xVarI;
        if (qVar.getFileSystem() == k.e && (xVarI = qVar.I()) != null) {
            return ImageDecoder.createSource(xVarI.toFile());
        }
        org.jsoup.helper.n nVarQ = qVar.q();
        if (nVarQ instanceof coil3.decode.a) {
            return ImageDecoder.createSource(nVar.a.getAssets(), ((coil3.decode.a) nVarQ).l);
        }
        if ((nVarQ instanceof g) && Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((g) nVarQ).l;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new y(assetFileDescriptor, 0));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (nVarQ instanceof r) {
            r rVar = (r) nVarQ;
            if (rVar.l.equals(nVar.a.getPackageName())) {
                return ImageDecoder.createSource(nVar.a.getResources(), rVar.m);
            }
        }
        if (nVarQ instanceof f) {
            return ImageDecoder.createSource(((f) nVarQ).l);
        }
        return null;
    }

    public static final void C(String str, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    public static void D(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void E(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    public static void a(AudioAttributes.Builder builder) {
        builder.setHapticChannelsMuted(true);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    public static int b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean z;
        int i3;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 >= supportedPerformancePoints.size()) {
                    i3 = 1;
                    break;
                }
                if (i.c(supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                    i3 = 2;
                    break;
                }
                i4++;
            }
            if (i3 == 1 && android.support.v4.media.session.b.l == null) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 37) {
                    z = false;
                } else {
                    int iL = l(true);
                    if (i5 < 35 ? !(l(false) != 2 || iL == 1) : iL != 1) {
                        z = false;
                    }
                }
                android.support.v4.media.session.b.l = Boolean.valueOf(z);
                if (z) {
                }
            }
            return i3;
        }
        return 0;
    }

    public static void c(Canvas canvas) {
        canvas.disableZ();
    }

    public static void d(Canvas canvas, int i, BlendMode blendMode) {
        canvas.drawColor(i, blendMode);
    }

    public static void e(Canvas canvas, long j) {
        canvas.drawColor(j);
    }

    public static void f(Canvas canvas, long j, BlendMode blendMode) {
        canvas.drawColor(j, blendMode);
    }

    public static void g(Canvas canvas, RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    public static void h(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public static void i(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static void j(Canvas canvas, MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    public static void k(Canvas canvas) {
        canvas.enableZ();
    }

    public static int l(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            androidx.media3.common.q qVar = new androidx.media3.common.q();
            qVar.n = i0.p("video/avc");
            androidx.media3.common.r rVar = new androidx.media3.common.r(qVar);
            String str = rVar.o;
            if (str != null) {
                List listE = v.e(str, z, false);
                String strC = v.c(rVar);
                Iterable iterableE = strC == null ? a1.B : v.e(strC, z, false);
                d0 d0VarK = h0.k();
                d0VarK.c(listE);
                d0VarK.c(iterableE);
                a1 a1VarG = d0VarK.g();
                for (int i = 0; i < a1VarG.A; i++) {
                    if (((o) a1VarG.get(i)).d != null && (videoCapabilities = ((o) a1VarG.get(i)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (i.c(supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (t unused) {
        }
        return 0;
    }

    public static ColorStateList m(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !(drawable instanceof ColorStateListDrawable)) {
            return null;
        }
        return ((ColorStateListDrawable) drawable).getColorStateList();
    }

    public static ContentCaptureSession n(View view) {
        return view.getContentCaptureSession();
    }

    public static a1 o(e eVar) {
        d0 d0VarK = h0.k();
        p1 p1VarI = androidx.media3.exoplayer.audio.b.h.keySet().iterator();
        while (p1VarI.hasNext()) {
            Integer num = (Integer) p1VarI.next();
            int iIntValue = num.intValue();
            if (Build.VERSION.SDK_INT >= j0.s(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), eVar.a())) {
                d0VarK.b(num);
            }
        }
        d0VarK.b(2);
        return d0VarK.g();
    }

    public static int p(int i, int i2, e eVar) {
        for (int i3 = 10; i3 > 0; i3--) {
            int iT = j0.t(i3);
            if (iT != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iT).build(), eVar.a())) {
                return i3;
            }
        }
        return 0;
    }

    public static final void q(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        paint.getTextBounds(charSequence, i, i2, rect);
    }

    public static float r(View view) {
        return view.getTransitionAlpha();
    }

    public static Insets s(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void t(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void u(AudioAttributes.Builder builder) {
        builder.setAllowedCapturePolicy(1);
    }

    public static void v(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void w(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void x(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    public static void y(View view, float f) {
        view.setTransitionAlpha(f);
    }

    public static void z(View view, int i) {
        view.setTransitionVisibility(i);
    }
}
