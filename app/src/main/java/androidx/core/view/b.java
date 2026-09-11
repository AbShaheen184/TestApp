package androidx.core.view;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.app.mlounge.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public static final View.AccessibilityDelegate z = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate e;
    public final a y;

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.e = accessibilityDelegate;
        this.y = new a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.e.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public com.app.mlounge.data.music.e b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.e.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new com.app.mlounge.data.music.e(accessibilityNodeProvider, 22);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.e.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, androidx.core.view.accessibility.d dVar) {
        this.e.onInitializeAccessibilityNodeInfo(view, dVar.a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.e.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.e.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 < list.size()) {
                androidx.core.view.accessibility.b bVar = (androidx.core.view.accessibility.b) list.get(i2);
                if (bVar.a() == i) {
                    Class cls = bVar.c;
                    androidx.core.view.accessibility.n nVar = bVar.d;
                    if (nVar != null) {
                        if (cls != null) {
                            try {
                                if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                    throw null;
                                }
                                throw new ClassCastException();
                            } catch (Exception e) {
                                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                            }
                        }
                        zPerformAccessibilityAction = nVar.j(view);
                        break;
                    }
                } else {
                    i2++;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.e.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z2 = true;
                    break;
                }
            }
        }
        return z2;
    }

    public void h(View view, int i) {
        this.e.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.e.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public b() {
        this(z);
    }
}
