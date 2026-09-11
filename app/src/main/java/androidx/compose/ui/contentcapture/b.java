package androidx.compose.ui.contentcapture;

import android.app.Notification;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.media.AudioDescriptor;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.util.LongSparseArray;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.semantics.k;
import androidx.compose.ui.semantics.p;
import androidx.compose.ui.semantics.q;
import androidx.compose.ui.semantics.t;
import androidx.core.view.v;
import androidx.media3.common.util.j0;
import com.caverock.androidsvg.y1;
import com.google.common.collect.a1;
import com.google.common.collect.e0;
import com.google.common.collect.h0;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static void a(f fVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        q qVar;
        p pVar;
        l lVar;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (qVar = (q) fVar.d().b((int) jKeyAt)) != null && (pVar = qVar.a) != null) {
                Object objG = pVar.d.e.g(k.l);
                if (objG == null) {
                    objG = null;
                }
                androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) objG;
                if (aVar != null && (lVar = (l) aVar.b) != null) {
                }
            }
        }
    }

    public static void b(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    public static void c(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static void d(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public static h0 e(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            e0 e0Var = h0.y;
            return a1.B;
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(new androidx.media3.exoplayer.audio.f(0)).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorA = androidx.media3.exoplayer.analytics.d.a(it.next());
            if (audioDescriptorA.getStandard() == 1) {
                byte[] descriptor = audioDescriptorA.getDescriptor();
                if (descriptor.length != 3) {
                    androidx.media3.common.util.c.t("AudioDescriptorUtil", "Invalid SAD length: " + descriptor.length);
                } else {
                    byte b = descriptor[0];
                    int i = (b & 7) + 1;
                    if (((b >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(j0.t(i)));
                    }
                }
            }
        }
        return h0.o(treeSet);
    }

    public static v f(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new v(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static Typeface g(Configuration configuration, Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT < 31 || (i = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, android.support.v4.media.session.b.f(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    public static void h(f fVar, long[] jArr, Consumer consumer) {
        p pVar;
        for (long j : jArr) {
            q qVar = (q) fVar.d().b((int) j);
            if (qVar != null && (pVar = qVar.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(fVar.e.getAutofillId(), pVar.g);
                Object objG = pVar.d.e.g(t.B);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new androidx.compose.ui.text.g(androidx.compose.ui.util.a.a(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static void i(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void j(y1 y1Var, androidx.media3.exoplayer.analytics.k kVar) {
        LogSessionId logSessionIdA = kVar.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        ((MediaFormat) y1Var.b).setString("log-session-id", logSessionIdA.getStringId());
    }
}
