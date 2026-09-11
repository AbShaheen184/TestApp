package androidx.compose.ui.text.android;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.SegmentFinder;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.widget.TextView;
import androidx.compose.animation.core.g0;
import androidx.compose.foundation.text.input.internal.o;
import androidx.compose.ui.text.j0;
import androidx.compose.ui.text.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(CursorAnchorInfo.Builder builder, j0 j0Var, androidx.compose.ui.geometry.c cVar) {
        if (cVar.f()) {
            return;
        }
        n nVar = j0Var.b;
        int i = nVar.f - 1;
        if (i < 0) {
            i = 0;
        }
        int iC = com.google.android.material.resources.c.c(nVar.e(cVar.b), 0, i);
        int iC2 = com.google.android.material.resources.c.c(nVar.e(cVar.d), 0, i);
        if (iC > iC2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(j0Var.d(iC), nVar.f(iC), j0Var.e(iC), nVar.b(iC));
            if (iC == iC2) {
                return;
            } else {
                iC++;
            }
        }
    }

    public static AccessibilityNodeInfo.AccessibilityAction b() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float c(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static void d(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int[] f(l lVar, RectF rectF, int i, final g0 g0Var) {
        SegmentFinder graphemeClusterSegmentFinder;
        if (i == 1) {
            graphemeClusterSegmentFinder = new androidx.compose.ui.text.android.selection.a(new o(19, lVar.f.getText(), lVar.j()));
        } else {
            graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(lVar.f.getText(), lVar.a);
        }
        return lVar.f.getRangeForRect(rectF, graphemeClusterSegmentFinder, new Layout.TextInclusionStrategy() { // from class: androidx.compose.ui.text.android.a
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) g0Var.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }

    public static int g(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static int h(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static boolean i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean j(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static void k(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static void m(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    public static void n(SurfaceView surfaceView) {
        surfaceView.setSurfaceLifecycle(2);
    }
}
