package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.app.mlounge.R;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.android.HandlerDispatcherKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ViewGroup {
    public androidx.compose.runtime.v A;
    public n2 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public WeakReference e;
    public IBinder y;
    public e3 z;

    public a(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        androidx.appcompat.view.menu.d dVar = new androidx.appcompat.view.menu.d(this, 3);
        addOnAttachStateChangeListener(dVar);
        m2 m2Var = new m2(this);
        androidx.datastore.preferences.protobuf.h1.p(this).a.add(m2Var);
        this.B = new n2(this, dVar, m2Var);
    }

    private final void setParentContext(androidx.compose.runtime.v vVar) {
        if (this.A != vVar) {
            this.A = vVar;
            if (vVar != null) {
                this.e = null;
            }
            e3 e3Var = this.z;
            if (e3Var != null) {
                e3Var.b();
                this.z = null;
                if (isAttachedToWindow()) {
                    d();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.y != iBinder) {
            this.y = iBinder;
            this.e = null;
        }
    }

    public abstract void a(int i, androidx.compose.runtime.r rVar);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (this.D) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        e3 e3Var = this.z;
        if (e3Var != null) {
            e3Var.b();
        }
        this.z = null;
        requestLayout();
    }

    public final void d() {
        if (this.z == null) {
            try {
                this.D = true;
                this.z = h3.a(this, g(), new androidx.compose.runtime.internal.f(-656146368, true, new androidx.compose.animation.f(this, 2)));
            } finally {
                this.D = false;
            }
        }
    }

    public void e(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void f(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.runtime.v g() {
        androidx.compose.runtime.w1 w1Var;
        kotlin.coroutines.i iVar;
        androidx.compose.runtime.e eVar;
        Object objW;
        androidx.compose.runtime.v vVarB = this.A;
        if (vVarB == null) {
            vVarB = b3.b(this);
            if (vVarB == null) {
                ViewParent parent = getParent();
                while (true) {
                    if (vVarB != null || !(objW instanceof View)) {
                        objW = parent;
                        break;
                    }
                    objW = parent;
                    View view = (View) objW;
                    vVarB = b3.b(view);
                    objW = android.support.v4.media.session.b.w(view);
                }
            }
            boolean z = false;
            if (vVarB != null) {
                androidx.compose.runtime.v vVar = (!(vVarB instanceof androidx.compose.runtime.w1) || ((androidx.compose.runtime.s1) ((androidx.compose.runtime.w1) vVarB).u.getValue()).compareTo(androidx.compose.runtime.s1.y) > 0) ? vVarB : null;
                if (vVar != null) {
                    this.e = new WeakReference(vVar);
                }
            } else {
                vVarB = null;
            }
            if (vVarB == null) {
                WeakReference weakReference = this.e;
                if (weakReference == null || (vVarB = (androidx.compose.runtime.v) weakReference.get()) == null || ((vVarB instanceof androidx.compose.runtime.w1) && ((androidx.compose.runtime.s1) ((androidx.compose.runtime.w1) vVarB).u.getValue()).compareTo(androidx.compose.runtime.s1.y) <= 0)) {
                    vVarB = null;
                }
                if (vVarB == null) {
                    if (!isAttachedToWindow()) {
                        androidx.compose.ui.internal.a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    View view2 = this;
                    Object parent2 = getParent();
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    androidx.compose.runtime.v vVarB2 = b3.b(view2);
                    if (vVarB2 == null) {
                        ((t2) v2.a.get()).getClass();
                        kotlin.coroutines.i iVar2 = kotlin.coroutines.j.e;
                        kotlin.o oVar = s0.H;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            iVar = (kotlin.coroutines.i) s0.H.getValue();
                        } else {
                            iVar = (kotlin.coroutines.i) s0.I.get();
                            if (iVar == null) {
                                net.luminis.tls.engine.impl.c.r("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        kotlin.coroutines.i iVarPlus = iVar.plus(iVar2);
                        androidx.compose.runtime.e eVar2 = (androidx.compose.runtime.e) iVarPlus.get(androidx.compose.runtime.f.z);
                        if (eVar2 != null) {
                            eVar = new androidx.compose.runtime.e(eVar2);
                            androidx.compose.foundation.lazy.layout.b1 b1Var = (androidx.compose.foundation.lazy.layout.b1) eVar.z;
                            synchronized (b1Var.y) {
                                b1Var.e = false;
                            }
                        } else {
                            eVar = null;
                        }
                        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
                        kotlin.coroutines.i b2Var = (androidx.compose.ui.t) iVarPlus.get(androidx.compose.ui.c.M);
                        if (b2Var == null) {
                            b2Var = new b2();
                            zVar.e = b2Var;
                        }
                        if (eVar != null) {
                            iVar2 = eVar;
                        }
                        kotlin.coroutines.i iVarPlus2 = iVarPlus.plus(iVar2).plus(b2Var);
                        w1Var = new androidx.compose.runtime.w1(iVarPlus2);
                        synchronized (w1Var.c) {
                            w1Var.t = true;
                        }
                        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(iVarPlus2);
                        androidx.lifecycle.v vVarD = androidx.lifecycle.l0.d(view2);
                        androidx.lifecycle.p lifecycle = vVarD != null ? vVarD.getLifecycle() : null;
                        if (lifecycle == null) {
                            androidx.compose.ui.internal.a.c("ViewTreeLifecycleOwner not found from " + view2);
                            com.google.gson.b.b();
                            return null;
                        }
                        view2.addOnAttachStateChangeListener(new w2(view2, w1Var));
                        lifecycle.a(new z2(CoroutineScope, eVar, w1Var, zVar, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, w1Var);
                        view2.addOnAttachStateChangeListener(new u2(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, HandlerDispatcherKt.from(view2.getHandler(), "windowRecomposer cleanup").getImmediate(), null, new androidx.activity.compose.p(w1Var, view2, z ? 1 : 0, 17), 2, null)));
                    } else {
                        if (!(vVarB2 instanceof androidx.compose.runtime.w1)) {
                            net.luminis.tls.engine.impl.c.r("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        w1Var = (androidx.compose.runtime.w1) vVarB2;
                    }
                    androidx.compose.runtime.w1 w1Var2 = ((androidx.compose.runtime.s1) w1Var.u.getValue()).compareTo(androidx.compose.runtime.s1.y) > 0 ? w1Var : null;
                    if (w1Var2 != null) {
                        this.e = new WeakReference(w1Var2);
                    }
                    return w1Var;
                }
            }
        }
        return vVarB;
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m0getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        b1 b1Var = tag instanceof b1 ? (b1) tag : null;
        if (b1Var != null) {
            return b1Var.a;
        }
        return 1;
    }

    public final boolean getHasComposition() {
        return this.z != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.C;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.E || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        e(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        d();
        f(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m1setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new b1(i));
    }

    public final void setParentCompositionContext(androidx.compose.runtime.v vVar) {
        setParentContext(vVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.C = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((u) ((androidx.compose.ui.node.m1) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.E = true;
    }

    public final void setViewCompositionStrategy(o2 o2Var) {
        n2 n2Var = this.B;
        if (n2Var != null) {
            n2Var.invoke();
        }
        ((i0) o2Var).getClass();
        androidx.appcompat.view.menu.d dVar = new androidx.appcompat.view.menu.d(this, 3);
        addOnAttachStateChangeListener(dVar);
        m2 m2Var = new m2(this);
        androidx.datastore.preferences.protobuf.h1.p(this).a.add(m2Var);
        this.B = new n2(this, dVar, m2Var);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        b();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        b();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        b();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
