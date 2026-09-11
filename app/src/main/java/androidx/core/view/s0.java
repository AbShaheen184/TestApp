package androidx.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.app.mlounge.R;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {
    public static Field a = null;
    public static boolean b = false;
    public static final int[] c = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final g0 d = new g0();
    public static final h0 e = new h0();

    public static void a(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static void b(View view, z1 z1Var) {
        WindowInsets windowInsetsC = z1Var.c();
        if (windowInsetsC != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? p0.a(view, windowInsetsC) : i0.a(view, windowInsetsC);
            if (windowInsetsA.equals(windowInsetsC)) {
                return;
            }
            z1.d(view, windowInsetsA);
        }
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return o0.a(view);
        }
        if (b) {
            return null;
        }
        if (a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                b = true;
                return null;
            }
        }
        try {
            Object obj = a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            b = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = n0.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] f(androidx.appcompat.widget.u uVar) {
        return Build.VERSION.SDK_INT >= 31 ? q0.a(uVar) : (String[]) uVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(d(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(d(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x002d  */
    /* JADX WARN: Code duplicated, block: B:25:0x002f  */
    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    public static void h(View view, int i) {
        int i2;
        if (i == -1) {
            i2 = -1;
        } else {
            int i3 = Build.VERSION.SDK_INT;
            i2 = 6;
            if (i3 < 34) {
                switch (i) {
                    case 21:
                    case 23:
                    case 26:
                        i = 6;
                        break;
                    case 22:
                    case 24:
                    case 27:
                        i = 4;
                        break;
                    case 25:
                        i = 0;
                        break;
                }
            }
            if (i3 >= 30) {
                i2 = i;
            } else if (i == 12) {
                i2 = 1;
            } else if (i != 13) {
                if (i == 16) {
                    i2 = 1;
                } else if (i != 17) {
                    i2 = i;
                } else {
                    i2 = 0;
                }
            }
            if (i3 < 27 && (i2 == 7 || i2 == 8 || i2 == 9)) {
                i2 = -1;
            }
        }
        if (i2 == -1) {
            return;
        }
        view.performHapticFeedback(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f i(View view, f fVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + fVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return q0.b(view, fVar);
        }
        androidx.core.widget.h hVar = (androidx.core.widget.h) view.getTag(R.id.tag_on_receive_content_listener);
        t tVar = d;
        if (hVar == null) {
            if (view instanceof t) {
                tVar = (t) view;
            }
            return tVar.a(fVar);
        }
        f fVarA = androidx.core.widget.h.a(view, fVar);
        if (fVarA == null) {
            return null;
        }
        if (view instanceof t) {
            tVar = (t) view;
        }
        return tVar.a(fVarA);
    }

    public static void j(View view, int i) {
        ArrayList arrayListE = e(view);
        for (int i2 = 0; i2 < arrayListE.size(); i2++) {
            if (((androidx.core.view.accessibility.b) arrayListE.get(i2)).a() == i) {
                arrayListE.remove(i2);
                return;
            }
        }
    }

    public static void k(View view, androidx.core.view.accessibility.b bVar, androidx.core.view.accessibility.n nVar) {
        b bVar2;
        androidx.core.view.accessibility.b bVar3 = new androidx.core.view.accessibility.b(null, bVar.b, null, nVar, bVar.c);
        View.AccessibilityDelegate accessibilityDelegateC = c(view);
        if (accessibilityDelegateC == null) {
            bVar2 = null;
        } else {
            bVar2 = accessibilityDelegateC instanceof a ? ((a) accessibilityDelegateC).a : new b(accessibilityDelegateC);
        }
        if (bVar2 == null) {
            bVar2 = new b();
        }
        m(view, bVar2);
        j(view, bVar3.a());
        e(view).add(bVar3);
        g(view, 0);
    }

    public static void l(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            o0.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void m(View view, b bVar) {
        if (bVar == null && (c(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.y);
    }

    public static void n(View view, CharSequence charSequence) {
        Object tag;
        b bVar;
        androidx.compose.foundation.text.selection.w wVar = new androidx.compose.foundation.text.selection.w(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
        if (Build.VERSION.SDK_INT >= wVar.c) {
            n0.d(view, charSequence);
        } else {
            if (Build.VERSION.SDK_INT >= wVar.c) {
                tag = n0.a(view);
            } else {
                tag = view.getTag(wVar.b);
                if (!((Class) wVar.e).isInstance(tag)) {
                    tag = null;
                }
            }
            if (!TextUtils.equals((CharSequence) tag, charSequence)) {
                View.AccessibilityDelegate accessibilityDelegateC = c(view);
                if (accessibilityDelegateC == null) {
                    bVar = null;
                } else {
                    bVar = accessibilityDelegateC instanceof a ? ((a) accessibilityDelegateC).a : new b(accessibilityDelegateC);
                }
                if (bVar == null) {
                    bVar = new b();
                }
                m(view, bVar);
                view.setTag(wVar.b, charSequence);
                g(view, wVar.d);
            }
        }
        h0 h0Var = e;
        if (charSequence == null) {
            h0Var.e.remove(view);
            view.removeOnAttachStateChangeListener(h0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(h0Var);
        } else {
            h0Var.e.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(h0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(h0Var);
            }
        }
    }

    public static void o(View view, w0 w0Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            d1.h(view, w0Var);
            return;
        }
        PathInterpolator pathInterpolator = a1.e;
        View.OnApplyWindowInsetsListener z0Var = w0Var != null ? new z0(view, w0Var) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, z0Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(z0Var);
        }
    }
}
