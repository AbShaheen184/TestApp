package androidx.compose.ui.window;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.widget.f2;
import androidx.compose.runtime.h1;
import androidx.compose.runtime.q1;
import androidx.lifecycle.l0;
import com.app.mlounge.R;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends androidx.compose.ui.platform.a {
    public kotlin.jvm.functions.a F;
    public d0 G;
    public String H;
    public final View I;
    public final boolean J;
    public final b0 K;
    public final WindowManager L;
    public final WindowManager.LayoutParams M;
    public c0 N;
    public androidx.compose.ui.unit.m O;
    public final h1 P;
    public final h1 Q;
    public androidx.compose.ui.unit.k R;
    public final androidx.compose.runtime.e0 S;
    public final Rect T;
    public final androidx.compose.runtime.snapshots.t U;
    public f2 V;
    public final h1 W;
    public boolean a0;
    public final int[] b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(kotlin.jvm.functions.a aVar, d0 d0Var, String str, View view, androidx.compose.ui.unit.c cVar, c0 c0Var, UUID uuid, boolean z) {
        super(view.getContext());
        b0 a0Var = Build.VERSION.SDK_INT >= 29 ? new a0() : new b0();
        this.F = aVar;
        this.G = d0Var;
        this.H = str;
        this.I = view;
        this.J = z;
        this.K = a0Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.L = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        d0 d0Var2 = this.G;
        boolean zB = o.b(view);
        boolean z2 = d0Var2.b;
        int i = d0Var2.a;
        if (z2 && zB) {
            i |= 8192;
        } else if (z2 && !zB) {
            i &= -8193;
        }
        layoutParams.flags = i;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.M = layoutParams;
        this.N = c0Var;
        this.O = androidx.compose.ui.unit.m.e;
        this.P = androidx.compose.runtime.s.r(null);
        this.Q = androidx.compose.runtime.s.r(null);
        this.S = androidx.compose.runtime.s.k(new androidx.compose.animation.z(this, 15));
        this.T = new Rect();
        this.U = new androidx.compose.runtime.snapshots.t(new k(this, 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, l0.d(view));
        setTag(R.id.view_tree_view_model_store_owner, l0.e(view));
        setTag(R.id.view_tree_saved_state_registry_owner, coil3.network.g.m(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(cVar.V((float) 8));
        setOutlineProvider(new androidx.compose.ui.graphics.layer.l(3));
        this.W = androidx.compose.runtime.s.r(u.a);
        this.b0 = new int[2];
    }

    private final kotlin.jvm.functions.p getContent() {
        return (kotlin.jvm.functions.p) this.W.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.layout.x getParentLayoutCoordinates() {
        return (androidx.compose.ui.layout.x) this.Q.getValue();
    }

    private final androidx.compose.ui.unit.k getVisibleDisplayBounds() {
        this.K.getClass();
        View view = this.I;
        Rect rect = this.T;
        view.getWindowVisibleDisplayFrame(rect);
        return new androidx.compose.ui.unit.k(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(kotlin.jvm.functions.p pVar) {
        this.W.setValue(pVar);
    }

    private final void setParentLayoutCoordinates(androidx.compose.ui.layout.x xVar) {
        this.Q.setValue(xVar);
    }

    @Override // androidx.compose.ui.platform.a
    public final void a(int i, androidx.compose.runtime.r rVar) {
        rVar.c0(-857613600);
        int i2 = (rVar.h(this) ? 4 : 2) | i;
        if (rVar.T(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(rVar, 0);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.animation.f(this, i, 6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.G.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                kotlin.jvm.functions.a aVar = this.F;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.a
    public final void e(boolean z, int i, int i2, int i3, int i4) {
        super.e(z, i, i2, i3, i4);
        this.G.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.M;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.K.getClass();
        this.L.updateViewLayout(this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.a
    public final void f(int i, int i2) {
        this.G.getClass();
        androidx.compose.ui.unit.k visibleDisplayBounds = getVisibleDisplayBounds();
        super.f(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.c(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.b(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.S.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.M;
    }

    public final androidx.compose.ui.unit.m getParentLayoutDirection() {
        return this.O;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final androidx.compose.ui.unit.l m11getPopupContentSizebOM6tXw() {
        return (androidx.compose.ui.unit.l) this.P.getValue();
    }

    public final c0 getPositionProvider() {
        return this.N;
    }

    @Override // androidx.compose.ui.platform.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.a0;
    }

    public final String getTestTag() {
        return this.H;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void j(androidx.compose.runtime.v vVar, kotlin.jvm.functions.p pVar) {
        setParentCompositionContext(vVar);
        setContent(pVar);
        this.a0 = true;
    }

    public final void k(kotlin.jvm.functions.a aVar, d0 d0Var, String str, androidx.compose.ui.unit.m mVar) {
        int i;
        this.F = aVar;
        this.H = str;
        if (!kotlin.jvm.internal.l.a(this.G, d0Var)) {
            d0Var.getClass();
            this.G = d0Var;
            boolean zB = o.b(this.I);
            boolean z = d0Var.b;
            int i2 = d0Var.a;
            if (z && zB) {
                i2 |= 8192;
            } else if (z && !zB) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.M;
            layoutParams.flags = i2;
            this.K.getClass();
            this.L.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = mVar.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                coil3.g.a();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void l() {
        androidx.compose.ui.layout.x parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.l()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jU = parentLayoutCoordinates.u();
            long jE = this.J ? parentLayoutCoordinates.E(0L) : parentLayoutCoordinates.f(0L);
            androidx.compose.ui.unit.k kVarA = androidx.room.r.a((((long) Math.round(Float.intBitsToFloat((int) (jE >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jE & 4294967295L))))), jU);
            if (kVarA.equals(this.R)) {
                return;
            }
            this.R = kVarA;
            n();
        }
    }

    public final void m(androidx.compose.ui.layout.x xVar) {
        setParentLayoutCoordinates(xVar);
        l();
    }

    public final void n() {
        androidx.compose.ui.unit.l lVarM11getPopupContentSizebOM6tXw;
        androidx.compose.ui.unit.k kVar = this.R;
        if (kVar == null || (lVarM11getPopupContentSizebOM6tXw = m11getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = lVarM11getPopupContentSizebOM6tXw.a;
        androidx.compose.ui.unit.k visibleDisplayBounds = getVisibleDisplayBounds();
        long jB = (((long) visibleDisplayBounds.b()) & 4294967295L) | (((long) visibleDisplayBounds.c()) << 32);
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        yVar.e = 0L;
        this.U.d(this, d.E, new y(yVar, this, kVar, jB, j));
        long j2 = yVar.e;
        WindowManager.LayoutParams layoutParams = this.M;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.G.e;
        b0 b0Var = this.K;
        if (z) {
            b0Var.a(this, (int) (jB >> 32), (int) (jB & 4294967295L));
        }
        b0Var.getClass();
        this.L.updateViewLayout(this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U.e();
        if (!this.G.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.V == null) {
            this.V = new f2(this.F, 1);
        }
        androidx.compose.ui.text.android.d.l(this, this.V);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.compose.runtime.snapshots.t tVar = this.U;
        androidx.activity.y yVar = tVar.h;
        if (yVar != null) {
            yVar.f();
        }
        tVar.a();
        if (Build.VERSION.SDK_INT >= 33) {
            androidx.compose.ui.text.android.d.m(this, this.V);
        }
        this.V = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.G.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            kotlin.jvm.functions.a aVar = this.F;
            if (aVar != null) {
                aVar.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            kotlin.jvm.functions.a aVar2 = this.F;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
        return true;
    }

    public final void setParentLayoutDirection(androidx.compose.ui.unit.m mVar) {
        this.O = mVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m12setPopupContentSizefhxjrPA(androidx.compose.ui.unit.l lVar) {
        this.P.setValue(lVar);
    }

    public final void setPositionProvider(c0 c0Var) {
        this.N = c0Var;
    }

    public final void setTestTag(String str) {
        this.H = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public androidx.compose.ui.platform.a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
