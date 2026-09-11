package androidx.compose.foundation.text.selection;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Bitmap b(Picture picture) {
        return Bitmap.createBitmap(picture);
    }

    public static TextClassifier c(Context context, x xVar) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int iOrdinal = xVar.ordinal();
        if (iOrdinal == 0) {
            str = "edittext";
        } else {
            if (iOrdinal != 1) {
                coil3.g.a();
                return null;
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public static List d(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static String[] e(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static int f(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String g(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int h(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int i(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int j(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int k(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int l(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params m(androidx.appcompat.widget.l0 l0Var) {
        return l0Var.getTextMetricsParams();
    }

    public static int n(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri o(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static void p(View view) {
        view.resetPivot();
    }

    public static void q(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void r(ViewStructure viewStructure, int i) {
        viewStructure.setMaxTextLength(i);
    }

    public static void s(View view, int i) {
        view.setOutlineAmbientShadowColor(i);
    }

    public static void t(View view, int i) {
        view.setOutlineSpotShadowColor(i);
    }

    public static void u(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static final void v(StaticLayout.Builder builder) {
        builder.setUseLineSpacingFromFallbacks(true);
    }

    public static boolean w(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
