package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.v0;
import com.app.mlounge.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ d(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.e) {
            case 0:
            case 1:
                break;
            case 2:
                androidx.compose.ui.graphics.f fVar = (androidx.compose.ui.graphics.f) this.y;
                Context context = view.getContext();
                if (!fVar.d) {
                    context.getApplicationContext().registerComponentCallbacks(fVar.e);
                    fVar.d = true;
                }
                break;
            case 3:
            case 4:
            case 5:
                break;
            default:
                com.google.android.material.textfield.n nVar = (com.google.android.material.textfield.n) this.y;
                AccessibilityManager accessibilityManager = nVar.Q;
                if (nVar.R != null && accessibilityManager != null && nVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(nVar.R);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z;
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.e) {
            case 0:
                g gVar = (g) this.y;
                ViewTreeObserver viewTreeObserver = gVar.U;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.U = view.getViewTreeObserver();
                    }
                    gVar.U.removeGlobalOnLayoutListener(gVar.F);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                s sVar = (s) this.y;
                ViewTreeObserver viewTreeObserver2 = sVar.L;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sVar.L = view.getViewTreeObserver();
                    }
                    sVar.L.removeGlobalOnLayoutListener(sVar.F);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                androidx.compose.ui.graphics.f fVar = (androidx.compose.ui.graphics.f) this.y;
                Context context = view.getContext();
                if (fVar.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(fVar.e);
                    fVar.d = false;
                }
                break;
            case 3:
                androidx.compose.ui.platform.a aVar = (androidx.compose.ui.platform.a) this.y;
                Iterator it = kotlin.sequences.k.o(aVar.getParent(), v0.e).iterator();
                while (true) {
                    z = false;
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            view2.getClass();
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    aVar.c();
                }
                break;
            case 4:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.y;
                com.google.android.material.behavior.a aVar2 = hideBottomViewOnScrollBehavior.h;
                if (aVar2 != null && (accessibilityManager = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(aVar2);
                    hideBottomViewOnScrollBehavior.h = null;
                    break;
                }
                break;
            case 5:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.y;
                com.google.android.material.behavior.a aVar3 = hideViewOnScrollBehavior.c;
                if (aVar3 != null && (accessibilityManager2 = hideViewOnScrollBehavior.b) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(aVar3);
                    hideViewOnScrollBehavior.c = null;
                    break;
                }
                break;
            default:
                com.google.android.material.textfield.n nVar = (com.google.android.material.textfield.n) this.y;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = nVar.R;
                if (touchExplorationStateChangeListener != null && (accessibilityManager3 = nVar.Q) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
