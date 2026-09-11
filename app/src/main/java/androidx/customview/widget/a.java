package androidx.customview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.collection.t;
import androidx.collection.z0;
import androidx.compose.ui.platform.v;
import androidx.core.view.s0;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.dynamite.g;
import com.google.android.material.chip.Chip;
import com.google.firebase.heartbeatinfo.e;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends androidx.core.view.b {
    public static final Rect K = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final e L = new e();
    public static final k M = new k(7);
    public final AccessibilityManager E;
    public final Chip F;
    public v G;
    public final Rect A = new Rect();
    public final Rect B = new Rect();
    public final Rect C = new Rect();
    public final int[] D = new int[2];
    public int H = Integer.MIN_VALUE;
    public int I = Integer.MIN_VALUE;
    public int J = Integer.MIN_VALUE;

    public a(Chip chip) {
        this.F = chip;
        this.E = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        Field field = s0.a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // androidx.core.view.b
    public final com.app.mlounge.data.music.e b(View view) {
        if (this.G == null) {
            this.G = new v(this, 1);
        }
        return this.G;
    }

    @Override // androidx.core.view.b
    public final void d(View view, androidx.core.view.accessibility.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        this.e.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((com.google.android.material.chip.d) this).N;
        com.google.android.material.chip.e eVar = chip.B;
        accessibilityNodeInfo.setCheckable(eVar != null && eVar.w0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        dVar.k(chip.getAccessibilityClassName());
        dVar.r(chip.getText());
    }

    public final boolean j(int i) {
        if (this.I != i) {
            return false;
        }
        this.I = Integer.MIN_VALUE;
        p(i, false);
        r(i, 8);
        return true;
    }

    public final androidx.core.view.accessibility.d k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        androidx.core.view.accessibility.d dVar = new androidx.core.view.accessibility.d(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        dVar.k("android.view.View");
        Rect rect = K;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        dVar.b = -1;
        Chip chip = this.F;
        accessibilityNodeInfoObtain.setParent(chip);
        o(i, dVar);
        if (dVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            org.mozilla.javascript.c.b("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.B;
        dVar.f(rect2);
        if (rect2.equals(rect)) {
            org.mozilla.javascript.c.b("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            org.mozilla.javascript.c.b("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & 128) != 0) {
            org.mozilla.javascript.c.b("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        dVar.c = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.H == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            dVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            dVar.a(64);
        }
        boolean z = this.I == i;
        if (z) {
            dVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            dVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.D;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.A;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            dVar.f(rect3);
            if (dVar.b != -1) {
                androidx.core.view.accessibility.d dVar2 = new androidx.core.view.accessibility.d(AccessibilityNodeInfo.obtain());
                for (int i2 = dVar.b; i2 != -1; i2 = dVar2.b) {
                    dVar2.b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = dVar2.a;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i2, dVar2);
                    dVar2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.C;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = dVar.a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() > 0.0f && view.getVisibility() == 0) {
                            parent = view.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfo2.setVisibleToUser(true);
                    }
                }
            }
        }
        return dVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Code duplicated, block: B:67:0x0147  */
    public final boolean m(int i, Rect rect) {
        int i2;
        Object obj;
        androidx.core.view.accessibility.d dVar;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        z0 z0Var = new z0(0);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            z0Var.e(((Integer) arrayList.get(i3)).intValue(), k(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.I;
        int iD = Integer.MIN_VALUE;
        androidx.core.view.accessibility.d dVar2 = i4 == Integer.MIN_VALUE ? null : (androidx.core.view.accessibility.d) z0Var.c(i4);
        e eVar = L;
        k kVar = M;
        Chip chip = this.F;
        int i5 = -1;
        if (i == 1 || i == 2) {
            Field field = s0.a;
            boolean z = chip.getLayoutDirection() == 1;
            kVar.getClass();
            int iF = z0Var.f();
            ArrayList arrayList2 = new ArrayList(iF);
            for (int i6 = 0; i6 < iF; i6++) {
                arrayList2.add((androidx.core.view.accessibility.d) z0Var.g(i6));
            }
            Collections.sort(arrayList2, new b(z, eVar));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (dVar2 != null) {
                    size = arrayList2.indexOf(dVar2);
                }
                int i7 = size - 1;
                obj = i7 >= 0 ? arrayList2.get(i7) : null;
            } else {
                if (i != 2) {
                    net.luminis.tls.engine.impl.c.o("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (dVar2 == null ? -1 : arrayList2.lastIndexOf(dVar2)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
                i2 = 0;
            }
            dVar = (androidx.core.view.accessibility.d) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                net.luminis.tls.engine.impl.c.o("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i8 = this.I;
            if (i8 != Integer.MIN_VALUE) {
                n(i8).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        net.luminis.tls.engine.impl.c.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    net.luminis.tls.engine.impl.c.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            kVar.getClass();
            int iF2 = z0Var.f();
            Rect rect4 = new Rect();
            dVar = null;
            for (int i9 = 0; i9 < iF2; i9++) {
                androidx.core.view.accessibility.d dVar3 = (androidx.core.view.accessibility.d) z0Var.g(i9);
                if (dVar3 != dVar2) {
                    eVar.getClass();
                    dVar3.f(rect4);
                    if (g.v(i, rect2, rect4)) {
                        if (!g.v(i, rect2, rect3) || g.e(i, rect2, rect4, rect3)) {
                            rect3.set(rect4);
                            dVar = dVar3;
                        } else if (!g.e(i, rect2, rect3, rect4)) {
                            int iY = g.y(i, rect2, rect4);
                            int iZ = g.z(i, rect2, rect4);
                            int i10 = (iZ * iZ) + (iY * 13 * iY);
                            int iY2 = g.y(i, rect2, rect3);
                            int iZ2 = g.z(i, rect2, rect3);
                            if (i10 < (iZ2 * iZ2) + (iY2 * 13 * iY2)) {
                                rect3.set(rect4);
                                dVar = dVar3;
                            }
                        }
                    }
                }
            }
            i2 = 0;
        }
        androidx.core.view.accessibility.d dVar4 = dVar;
        if (dVar4 != null) {
            if (z0Var.e) {
                t.a(z0Var);
            }
            int i11 = z0Var.A;
            for (int i12 = i2; i12 < i11; i12++) {
                if (z0Var.z[i12] == dVar4) {
                    i5 = i12;
                    break;
                }
            }
            iD = z0Var.d(i5);
        }
        return q(iD);
    }

    public final androidx.core.view.accessibility.d n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.F;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        androidx.core.view.accessibility.d dVar = new androidx.core.view.accessibility.d(accessibilityNodeInfoObtain);
        Field field = s0.a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            org.mozilla.javascript.c.b("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            dVar.a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return dVar;
    }

    public abstract void o(int i, androidx.core.view.accessibility.d dVar);

    public abstract void p(int i, boolean z);

    public final boolean q(int i) {
        int i2;
        Chip chip = this.F;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.I) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.I = i;
        p(i, true);
        r(i, 8);
        return true;
    }

    public final void r(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.E.isEnabled() || (parent = (view = this.F).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            androidx.core.view.accessibility.d dVarN = n(i);
            accessibilityEventObtain.getText().add(dVarN.g());
            AccessibilityNodeInfo accessibilityNodeInfo = dVarN.a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                org.mozilla.javascript.c.b("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                return;
            } else {
                accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
                accessibilityEventObtain.setSource(view, i);
                accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
            }
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
