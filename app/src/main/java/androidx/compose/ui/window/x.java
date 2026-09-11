package androidx.compose.ui.window;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.l0;
import com.app.mlounge.R;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends androidx.activity.r {
    public kotlin.jvm.functions.a B;
    public w C;
    public final View D;
    public final v E;
    public boolean F;

    public x(kotlin.jvm.functions.a aVar, w wVar, View view, androidx.compose.ui.unit.m mVar, androidx.compose.ui.unit.c cVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), wVar.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme));
        this.B = aVar;
        this.C = wVar;
        this.D = view;
        float f = 8;
        Window window = getWindow();
        if (window == null) {
            net.luminis.tls.engine.impl.c.r("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        kotlin.math.a.H(window, this.C.e);
        window.setGravity(17);
        if (!this.C.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                q.a.a(attributes);
            }
            if (i >= 30) {
                r rVar = r.a;
                rVar.b(attributes, 0);
                rVar.c(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        v vVar = new v(getContext(), window);
        setTitle(this.C.f);
        vVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        vVar.setClipChildren(false);
        vVar.setElevation(cVar.V(f));
        vVar.setOutlineProvider(new androidx.compose.ui.graphics.layer.l(2));
        this.E = vVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(vVar);
        vVar.setTag(R.id.view_tree_lifecycle_owner, l0.d(view));
        vVar.setTag(R.id.view_tree_view_model_store_owner, l0.e(view));
        vVar.setTag(R.id.view_tree_saved_state_registry_owner, coil3.network.g.m(view));
        e(this.B, this.C, mVar);
        androidx.activity.c0 onBackPressedDispatcher = getOnBackPressedDispatcher();
        a aVar2 = new a(this, 1);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.a(new androidx.activity.d0(aVar2), this);
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof v) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    public final void e(kotlin.jvm.functions.a aVar, w wVar, androidx.compose.ui.unit.m mVar) {
        int i;
        this.B = aVar;
        this.C = wVar;
        e0 e0Var = wVar.c;
        boolean zB = o.b(this.D);
        int iOrdinal = e0Var.ordinal();
        int i2 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    coil3.g.a();
                    return;
                }
                zB = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = mVar.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                coil3.g.a();
                return;
            }
            i = 1;
        }
        v vVar = this.E;
        vVar.setLayoutDirection(i);
        boolean z = wVar.e;
        boolean z2 = wVar.d;
        Window window2 = vVar.F;
        boolean z3 = (vVar.J && z2 == vVar.H && z == vVar.I) ? false : true;
        vVar.H = z2;
        vVar.I = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i3 = z2 ? -2 : -1;
            if (i3 != attributes.width || !vVar.J) {
                window2.setLayout(i3, -2);
                vVar.J = true;
            }
        }
        setCanceledOnTouchOutside(wVar.b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z) {
                i2 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window3.setSoftInputMode(i2);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.C.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.B.invoke();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iF;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.C.b) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.F = false;
            return zOnTouchEvent;
        }
        v vVar = this.E;
        vVar.getClass();
        float x = motionEvent.getX();
        if (!Float.isInfinite(x) && !Float.isNaN(x)) {
            float y = motionEvent.getY();
            if (!Float.isInfinite(y) && !Float.isNaN(y) && (childAt = vVar.getChildAt(0)) != null) {
                int left = childAt.getLeft() + vVar.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + vVar.getTop();
                int height = childAt.getHeight() + top;
                int iF2 = kotlin.math.a.F(motionEvent.getX());
                if (left <= iF2 && iF2 <= width && top <= (iF = kotlin.math.a.F(motionEvent.getY())) && iF <= height) {
                    actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                        this.F = false;
                        return zOnTouchEvent;
                    }
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.F = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.F = false;
                return zOnTouchEvent;
            }
        } else if (this.F) {
            this.B.invoke();
            this.F = false;
            return true;
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
