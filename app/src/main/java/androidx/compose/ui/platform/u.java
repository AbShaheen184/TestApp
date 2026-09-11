package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.app.mlounge.R;
import com.app.mlounge.emulator.LibretroCore;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends ViewGroup implements androidx.compose.ui.node.m1, androidx.compose.ui.node.t1, androidx.compose.ui.input.pointer.g, androidx.lifecycle.f, androidx.compose.ui.node.k1, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, androidx.compose.ui.focus.j {
    public static Class h1;
    public static Method i1;
    public static Method j1;
    public static final androidx.collection.j0 k1 = new androidx.collection.j0();
    public static j l1;
    public static Method m1;
    public final androidx.compose.ui.node.h0 A;
    public long A0;
    public y1 B;
    public boolean B0;
    public z1 C;
    public long C0;
    public androidx.compose.runtime.retain.d D;
    public final androidx.compose.runtime.h1 D0;
    public final kotlin.collections.k E;
    public final androidx.compose.runtime.e0 E0;
    public final i F;
    public kotlin.jvm.functions.l F0;
    public final androidx.compose.runtime.h1 G;
    public final androidx.compose.ui.text.input.a0 G0;
    public final View H;
    public final androidx.compose.ui.text.input.y H0;
    public final boolean I;
    public final AtomicReference I0;
    public final androidx.compose.ui.focus.p J;
    public final m1 J0;
    public kotlin.coroutines.i K;
    public final u1 K0;
    public final androidx.compose.ui.draganddrop.b L;
    public final androidx.compose.runtime.h1 L0;
    public final x1 M;
    public final androidx.compose.runtime.h1 M0;
    public final androidx.compose.ui.graphics.s N;
    public final androidx.compose.ui.hapticfeedback.b N0;
    public final v0 O;
    public final androidx.compose.ui.input.c O0;
    public final androidx.compose.ui.layout.r P;
    public final androidx.compose.ui.modifier.b P0;
    public final androidx.compose.ui.node.f0 Q;
    public final p0 Q0;
    public final androidx.collection.z R;
    public MotionEvent R0;
    public final androidx.compose.ui.spatial.b S;
    public long S0;
    public final u T;
    public final androidx.compose.foundation.text.input.internal.o T0;
    public final androidx.compose.ui.semantics.r U;
    public final androidx.collection.j0 U0;
    public final a0 V;
    public float V0;
    public androidx.compose.ui.contentcapture.f W;
    public float W0;
    public final androidx.appcompat.widget.z0 X0;
    public final i Y0;
    public boolean Z0;
    public final f a0;
    public final t1 a1;
    public final androidx.compose.ui.graphics.f b0;
    public final r b1;
    public final androidx.compose.ui.autofill.m c0;
    public final c1 c1;
    public final androidx.collection.j0 d0;
    public boolean d1;
    public long e;
    public androidx.collection.j0 e0;
    public final androidx.compose.ui.scrollcapture.i e1;
    public boolean f0;
    public View f1;
    public boolean g0;
    public final q g1;
    public final androidx.compose.ui.input.pointer.i h0;
    public final androidx.compose.material.ripple.g i0;
    public final androidx.compose.runtime.h1 j0;
    public final androidx.compose.ui.autofill.a k0;
    public final androidx.compose.ui.autofill.d l0;
    public boolean m0;
    public final h n0;
    public final g o0;
    public final androidx.compose.ui.node.o1 p0;
    public boolean q0;
    public x0 r0;
    public androidx.compose.ui.unit.a s0;
    public boolean t0;
    public final androidx.compose.ui.node.t0 u0;
    public long v0;
    public final int[] w0;
    public final float[] x0;
    public final boolean y;
    public final float[] y0;
    public androidx.compose.ui.input.indirect.a z;
    public final float[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, kotlin.coroutines.i iVar) {
        androidx.compose.ui.autofill.d dVar;
        androidx.compose.ui.unit.m mVar;
        super(context);
        u uVar = this;
        uVar.e = 9205357640488583168L;
        int i = 1;
        uVar.y = true;
        uVar.A = new androidx.compose.ui.node.h0();
        uVar.D = androidx.compose.runtime.retain.a.e;
        uVar.E = new kotlin.collections.k();
        int i2 = 0;
        uVar.F = new i(uVar, i2);
        androidx.compose.ui.unit.e eVarA = okhttp3.internal.platform.android.g.a(context);
        androidx.compose.runtime.f fVar = androidx.compose.runtime.f.B;
        uVar.G = new androidx.compose.runtime.h1(eVarA, fVar);
        int i3 = Build.VERSION.SDK_INT;
        boolean z = i3 >= 35;
        uVar.I = z;
        androidx.compose.ui.semantics.e eVar = new androidx.compose.ui.semantics.e();
        uVar.J = new androidx.compose.ui.focus.p(uVar, uVar);
        uVar.K = iVar;
        uVar.L = new androidx.compose.ui.draganddrop.b();
        uVar.M = new x1();
        uVar.N = new androidx.compose.ui.graphics.s();
        uVar.O = new v0(ViewConfiguration.get(context));
        uVar.P = new androidx.compose.ui.layout.r();
        androidx.compose.ui.node.f0 f0Var = new androidx.compose.ui.node.f0(3);
        f0Var.c0(androidx.compose.ui.layout.f1.b);
        f0Var.Z(uVar.getDensity());
        f0Var.e0(uVar.getViewConfiguration());
        f0Var.d0(new s(uVar).d(((androidx.compose.ui.focus.p) uVar.getFocusOwner()).e).d(uVar.m8getDragAndDropManager().c));
        uVar.Q = f0Var;
        androidx.collection.z zVar = androidx.collection.o.a;
        uVar.R = new androidx.collection.z();
        uVar.getLayoutNodes();
        uVar.S = new androidx.compose.ui.spatial.b();
        uVar.T = uVar;
        uVar.U = new androidx.compose.ui.semantics.r(uVar.getRoot(), eVar, uVar.getLayoutNodes());
        a0 a0Var = new a0(uVar);
        uVar.V = a0Var;
        uVar.W = new androidx.compose.ui.contentcapture.f(uVar, new androidx.compose.foundation.r0(0, uVar, i0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 3));
        f fVar2 = new f();
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        uVar.a0 = fVar2;
        uVar.b0 = new androidx.compose.ui.graphics.f(uVar);
        uVar.c0 = new androidx.compose.ui.autofill.m();
        uVar.d0 = new androidx.collection.j0();
        uVar.h0 = new androidx.compose.ui.input.pointer.i(0);
        androidx.compose.ui.node.f0 root = uVar.getRoot();
        androidx.compose.material.ripple.g gVar = new androidx.compose.material.ripple.g();
        gVar.b = root;
        gVar.c = new androidx.compose.ui.input.pointer.d((androidx.compose.ui.node.r) root.d0.d);
        gVar.d = new com.app.mlounge.data.music.e(16);
        gVar.e = new androidx.compose.ui.node.p();
        uVar.i0 = gVar;
        uVar.j0 = androidx.compose.runtime.s.r(new Configuration(context.getResources().getConfiguration()));
        uVar.k0 = f() ? new androidx.compose.ui.autofill.a(uVar, uVar.getAutofillTree()) : null;
        if (f()) {
            AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
            if (autofillManager == null) {
                throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("Autofill service could not be located.");
            }
            uVar = this;
            dVar = new androidx.compose.ui.autofill.d(new androidx.compose.ui.autofill.r(autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            dVar = null;
        }
        uVar.l0 = dVar;
        uVar.n0 = new h(context);
        uVar.o0 = new g(uVar.getClipboardManager());
        uVar.p0 = new androidx.compose.ui.node.o1(new p(uVar, i));
        uVar.u0 = new androidx.compose.ui.node.t0(uVar.getRoot());
        long j = Integer.MAX_VALUE;
        uVar.v0 = (j & 4294967295L) | (j << 32);
        uVar.w0 = new int[]{0, 0};
        float[] fArrA = androidx.compose.ui.graphics.f0.a();
        uVar.x0 = fArrA;
        uVar.y0 = androidx.compose.ui.graphics.f0.a();
        uVar.z0 = androidx.compose.ui.graphics.f0.a();
        uVar.A0 = -1L;
        uVar.C0 = 9187343241974906880L;
        uVar.D0 = androidx.compose.runtime.s.r(null);
        uVar.E0 = androidx.compose.runtime.s.k(new r(uVar, i));
        androidx.compose.ui.text.input.a0 a0Var2 = new androidx.compose.ui.text.input.a0(uVar.getView(), uVar);
        uVar.G0 = a0Var2;
        uVar.H0 = new androidx.compose.ui.text.input.y(a0Var2);
        uVar.I0 = new AtomicReference(null);
        uVar.J0 = new m1(uVar.getTextInputService());
        uVar.K0 = new u1();
        uVar.L0 = new androidx.compose.runtime.h1(android.support.v4.media.session.b.m(context), fVar);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = androidx.compose.ui.focus.h.a;
        androidx.compose.ui.unit.m mVar2 = androidx.compose.ui.unit.m.e;
        if (layoutDirection != 0) {
            mVar = layoutDirection != 1 ? null : androidx.compose.ui.unit.m.y;
        } else {
            mVar = mVar2;
        }
        uVar.M0 = androidx.compose.runtime.s.r(mVar != null ? mVar : mVar2);
        uVar.N0 = new androidx.compose.ui.hapticfeedback.b(uVar, i2);
        uVar.O0 = new androidx.compose.ui.input.c(uVar.isInTouchMode() ? 1 : 2);
        androidx.compose.ui.modifier.b bVar = new androidx.compose.ui.modifier.b();
        new androidx.compose.runtime.collection.b(new androidx.compose.ui.node.b[16]);
        new androidx.compose.runtime.collection.b(new org.jsoup.helper.n[16]);
        new androidx.compose.runtime.collection.b(new androidx.compose.ui.node.f0[16]);
        new androidx.compose.runtime.collection.b(new org.jsoup.helper.n[16]);
        uVar.P0 = bVar;
        p0 p0Var = new p0();
        int i4 = 3;
        new com.google.android.gms.common.internal.k(new androidx.compose.animation.z(p0Var, 9), i4);
        uVar.Q0 = p0Var;
        uVar.T0 = new androidx.compose.foundation.text.input.internal.o(18);
        uVar.U0 = new androidx.collection.j0();
        uVar.X0 = new androidx.appcompat.widget.z0(uVar, i4);
        uVar.Y0 = new i(uVar, i);
        uVar.a1 = new t1(context, new p(uVar, i2));
        uVar.b1 = new r(uVar, i2);
        uVar.c1 = i3 < 29 ? new d1(fArrA) : new e1();
        uVar.addOnAttachStateChangeListener(uVar.W);
        uVar.setWillNotDraw(false);
        uVar.setFocusable(true);
        if (i3 >= 26) {
            h0.a.a(uVar, 1, false);
        }
        uVar.setFocusableInTouchMode(true);
        uVar.setClipChildren(false);
        androidx.core.view.s0.m(uVar, a0Var);
        uVar.setOnDragListener(uVar.m8getDragAndDropManager());
        uVar.getRoot().d(uVar);
        if (i3 >= 29) {
            c0.a.a(uVar);
        }
        if (z) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            uVar.H = view;
            uVar.addView(view, -1);
        }
        uVar.e1 = i3 >= 31 ? new androidx.compose.ui.scrollcapture.i(0) : null;
        uVar.g1 = new q(uVar);
    }

    public static final void c(u uVar, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        a0 a0Var = uVar.V;
        if (kotlin.jvm.internal.l.a(str, a0Var.b0)) {
            int iD2 = a0Var.Z.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.l.a(str, a0Var.c0) || (iD = a0Var.a0.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l get_viewTreeOwners() {
        return (l) this.D0.getValue();
    }

    public static void h(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof u) {
                ((u) childAt).y();
            } else if (childAt instanceof ViewGroup) {
                h((ViewGroup) childAt);
            }
        }
    }

    public static long i(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return (((long) 0) << 32) | ((long) size);
        }
        if (mode == 0) {
            return (((long) 0) << 32) | ((long) Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            long j = size;
            return j | (j << 32);
        }
        org.mozilla.javascript.c.a();
        return 0L;
    }

    public static View j(View view, int i) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (kotlin.jvm.internal.l.a(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewJ = j(viewGroup.getChildAt(i2), i);
                    if (viewJ != null) {
                        return viewJ;
                    }
                }
            }
        }
        return null;
    }

    public static void n(androidx.compose.ui.node.f0 f0Var) {
        f0Var.D();
        androidx.compose.runtime.collection.b bVarZ = f0Var.z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            n((androidx.compose.ui.node.f0) objArr[i2]);
        }
    }

    public static boolean p(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !c2.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private void setDensity(androidx.compose.ui.unit.c cVar) {
        this.G.setValue(cVar);
    }

    private void setFontFamilyResolver(androidx.compose.ui.text.font.d dVar) {
        this.L0.setValue(dVar);
    }

    private void setLayoutDirection(androidx.compose.ui.unit.m mVar) {
        this.M0.setValue(mVar);
    }

    private final void set_viewTreeOwners(l lVar) {
        this.D0.setValue(lVar);
    }

    public final void A(androidx.compose.ui.node.f0 f0Var) {
        a0 a0Var = this.V;
        a0Var.V = true;
        if (a0Var.v()) {
            a0Var.w(f0Var);
        }
        androidx.compose.ui.contentcapture.f fVar = this.W;
        fVar.D = true;
        if (fVar.e()) {
            fVar.E.mo28trySendJP2dKIU(kotlin.y.a);
        }
    }

    public final void B(androidx.compose.ui.node.f0 f0Var, boolean z, boolean z2, boolean z3) {
        androidx.compose.ui.node.f0 f0VarV;
        androidx.compose.ui.node.f0 f0VarV2;
        androidx.compose.ui.node.t0 t0Var = this.u0;
        if (!z) {
            if (t0Var.p(f0Var, z2) && z3) {
                H(f0Var);
                return;
            }
            return;
        }
        androidx.appcompat.widget.c2 c2Var = t0Var.b;
        androidx.compose.ui.node.f0 f0Var2 = f0Var.F;
        androidx.compose.ui.node.j0 j0Var = f0Var.e0;
        if (f0Var2 == null) {
            androidx.compose.ui.internal.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = j0Var.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    coil3.g.a();
                    return;
                }
                if (!j0Var.e || z2) {
                    j0Var.e = true;
                    j0Var.p.Q = true;
                    if (f0Var.o0) {
                        return;
                    }
                    if ((kotlin.jvm.internal.l.a(f0Var.J(), Boolean.TRUE) || androidx.compose.ui.node.t0.h(f0Var)) && ((f0VarV = f0Var.v()) == null || !f0VarV.e0.e)) {
                        c2Var.n(f0Var, androidx.compose.ui.node.s.e);
                    } else if ((f0Var.I() || androidx.compose.ui.node.t0.i(f0Var)) && ((f0VarV2 = f0Var.v()) == null || !f0VarV2.r())) {
                        c2Var.n(f0Var, androidx.compose.ui.node.s.z);
                    }
                    if (t0Var.d || !z3) {
                        return;
                    }
                    H(f0Var);
                    return;
                }
                return;
            }
        }
        t0Var.h.b(new androidx.compose.ui.node.s0(f0Var, true, z2));
    }

    public final void C(androidx.compose.ui.node.f0 f0Var, boolean z, boolean z2) {
        androidx.compose.ui.node.j0 j0Var = f0Var.e0;
        androidx.compose.ui.node.s sVar = androidx.compose.ui.node.s.A;
        androidx.compose.ui.node.t0 t0Var = this.u0;
        if (!z) {
            t0Var.getClass();
            int iOrdinal = j0Var.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                coil3.g.a();
                return;
            }
            androidx.compose.ui.node.f0 f0VarV = f0Var.v();
            boolean z3 = f0VarV == null || f0VarV.I();
            if (!z2) {
                if (f0Var.r()) {
                    return;
                }
                if (f0Var.q() && f0Var.I() == z3 && f0Var.I() == j0Var.p.P) {
                    return;
                }
            }
            androidx.compose.ui.node.v0 v0Var = j0Var.p;
            v0Var.R = true;
            v0Var.S = true;
            if (!f0Var.o0 && v0Var.P && z3) {
                if ((f0VarV == null || !f0VarV.q()) && (f0VarV == null || !f0VarV.r())) {
                    t0Var.b.n(f0Var, sVar);
                }
                if (t0Var.d) {
                    return;
                }
                H(null);
                return;
            }
            return;
        }
        androidx.appcompat.widget.c2 c2Var = t0Var.b;
        int iOrdinal2 = j0Var.d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    coil3.g.a();
                    return;
                }
            }
        }
        if ((j0Var.e || j0Var.f) && !z2) {
            return;
        }
        j0Var.f = true;
        j0Var.g = true;
        androidx.compose.ui.node.v0 v0Var2 = j0Var.p;
        v0Var2.R = true;
        v0Var2.S = true;
        if (f0Var.o0) {
            return;
        }
        androidx.compose.ui.node.f0 f0VarV2 = f0Var.v();
        if (kotlin.jvm.internal.l.a(f0Var.J(), Boolean.TRUE) && ((f0VarV2 == null || !f0VarV2.e0.e) && (f0VarV2 == null || !f0VarV2.e0.f))) {
            c2Var.n(f0Var, androidx.compose.ui.node.s.y);
        } else if (f0Var.I() && ((f0VarV2 == null || !f0VarV2.q()) && (f0VarV2 == null || !f0VarV2.r()))) {
            c2Var.n(f0Var, sVar);
        }
        if (t0Var.d) {
            return;
        }
        H(null);
    }

    public final void D() {
        a0 a0Var = this.V;
        a0Var.V = true;
        if (a0Var.v() && !a0Var.g0) {
            a0Var.g0 = true;
            a0Var.G.post(a0Var.i0);
        }
        androidx.compose.ui.contentcapture.f fVar = this.W;
        fVar.D = true;
        if (!fVar.e() || fVar.K) {
            return;
        }
        fVar.K = true;
        fVar.F.post(fVar.L);
    }

    public final void E() {
        if (this.B0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.A0) {
            this.A0 = jCurrentAnimationTimeMillis;
            c1 c1Var = this.c1;
            float[] fArr = this.y0;
            c1Var.a(this, fArr);
            i0.l(fArr, this.z0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.w0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.C0 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    public final void F(MotionEvent motionEvent) {
        this.A0 = AnimationUtils.currentAnimationTimeMillis();
        c1 c1Var = this.c1;
        float[] fArr = this.y0;
        c1Var.a(this, fArr);
        i0.l(fArr, this.z0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jB = androidx.compose.ui.graphics.f0.b((((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.C0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    public final boolean G() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void H(androidx.compose.ui.node.f0 f0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (f0Var != null) {
            while (f0Var != null && f0Var.s() == androidx.compose.ui.node.d0.e) {
                if (!this.t0) {
                    androidx.compose.ui.node.f0 f0VarV = f0Var.v();
                    if (f0VarV == null) {
                        break;
                    }
                    long j = ((androidx.compose.ui.node.r) f0VarV.d0.d).A;
                    if (androidx.compose.ui.unit.a.f(j) && androidx.compose.ui.unit.a.e(j)) {
                        break;
                    }
                }
                f0Var = f0Var.v();
            }
            if (f0Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long I(long j) {
        E();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.C0 >> 32));
        return androidx.compose.ui.graphics.f0.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.C0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.z0);
    }

    public final int J(MotionEvent motionEvent) {
        Object obj;
        if (this.d1) {
            this.d1 = false;
            int metaState = motionEvent.getMetaState();
            this.M.getClass();
            s2.a.setValue(new androidx.compose.ui.input.pointer.c0(metaState));
        }
        androidx.compose.ui.input.pointer.i iVar = this.h0;
        androidx.compose.foundation.text.input.internal.o oVarC = iVar.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        androidx.compose.material.ripple.g gVar = this.i0;
        if (oVarC == null) {
            if (!gVar.a) {
                ((androidx.collection.s) ((com.app.mlounge.data.music.e) gVar.d).y).a();
                ((androidx.compose.ui.input.pointer.d) gVar.c).c();
            }
            return 0;
        }
        List list = (List) oVarC.y;
        int size = list.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i = size - 1;
            obj = list.get(size);
            if (((androidx.compose.ui.input.pointer.x) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i < 0) {
                obj = null;
                break;
            }
            size = i;
        }
        androidx.compose.ui.input.pointer.x xVar = (androidx.compose.ui.input.pointer.x) obj;
        if (xVar != null) {
            this.e = xVar.d;
        }
        int iG = gVar.g(oVarC, this, q(motionEvent));
        oVarC.z = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iG & 1) != 0) {
            return iG;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        ((SparseBooleanArray) iVar.e).delete(pointerId);
        ((SparseLongArray) iVar.d).delete(pointerId);
        return iG;
    }

    public final void K(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jT = t((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jT >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jT & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        androidx.compose.foundation.text.input.internal.o oVarC = this.h0.c(motionEventObtain, this);
        oVarC.getClass();
        this.i0.g(oVarC, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void L(kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        t tVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i = tVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                tVar.z = i - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object obj = tVar.e;
        int i2 = tVar.z;
        if (i2 == 0) {
            kotlin.a.e(obj);
            p pVar2 = new p(this, 2);
            tVar.z = 1;
            if (CoroutineScopeKt.coroutineScope(new androidx.compose.animation.core.f(pVar2, this.I0, pVar, (kotlin.coroutines.d) null), tVar) == kotlin.coroutines.intrinsics.a.e) {
                return;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            kotlin.a.e(obj);
        }
        com.google.gson.b.b();
    }

    public final void M(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (kotlin.jvm.internal.l.a(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(okhttp3.internal.platform.android.g.a(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) != 0) {
            this.M.getClass();
        }
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 ? configuration2.fontWeightAdjustment : 0) != (i >= 31 ? configuration.fontWeightAdjustment : 0)) {
            setFontFamilyResolver(android.support.v4.media.session.b.m(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    public final void N() {
        boolean z;
        int i;
        boolean z2;
        int[] iArr = this.w0;
        getLocationOnScreen(iArr);
        long j = this.v0;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 == i4 && i3 == iArr[1] && this.A0 >= 0) {
            z = false;
        } else {
            this.v0 = (((long) i4) << 32) | (((long) iArr[1]) & 4294967295L);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                getRoot().e0.p.t0();
                z = true;
            }
        }
        E();
        View rootView = this.f1;
        if (rootView == null) {
            rootView = getRootView();
            this.f1 = rootView;
        }
        androidx.compose.ui.spatial.b rectManager = getRectManager();
        long j2 = this.v0;
        long jI = android.support.v4.media.session.b.I(this.C0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.y0;
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = (((fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) ? 1 : 0);
        }
        androidx.compose.ui.spatial.e eVar = rectManager.b;
        if ((i & 2) != 0) {
            fArr = null;
        }
        if (androidx.compose.ui.unit.j.a(jI, eVar.d)) {
            z2 = false;
        } else {
            eVar.d = jI;
            z2 = true;
        }
        if (!androidx.compose.ui.unit.j.a(j2, eVar.e)) {
            eVar.e = j2;
            z2 = true;
        }
        if (fArr != null) {
            eVar.g = fArr;
            z2 = true;
        }
        long j3 = (((long) width) << 32) | (((long) height) & 4294967295L);
        if (j3 != eVar.f) {
            eVar.f = j3;
            z2 = true;
        }
        rectManager.e = z2 || rectManager.e;
        this.u0.a(z);
        getRectManager().a();
    }

    public final void O(float f) {
        if (this.I) {
            if (f > 0.0f) {
                if (Float.isNaN(this.V0) || f > this.V0) {
                    this.V0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.W0) || f < this.W0) {
                    this.W0 = f;
                }
            }
        }
    }

    @Override // androidx.lifecycle.f
    public final void a(androidx.lifecycle.v vVar) {
        androidx.compose.runtime.g gVarS;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(i0.j());
        }
        z1 z1Var = this.C;
        if (z1Var != null) {
            y1 y1Var = this.B;
            y1Var.getClass();
            com.app.mlounge.data.music.e eVar = z1Var.a;
            androidx.compose.runtime.retain.c cVar = (androidx.compose.runtime.retain.c) eVar.y;
            if (!cVar.e || cVar.z) {
                return;
            }
            try {
                gVarS = ((g3) y1Var).e.s(new androidx.compose.animation.z(z1Var, 10));
            } catch (CancellationException unused) {
                androidx.compose.runtime.retain.c cVar2 = (androidx.compose.runtime.retain.c) eVar.y;
                if (!cVar2.y) {
                    if (cVar2.z) {
                        androidx.compose.runtime.retain.impl.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar2.a();
                    cVar2.z = true;
                }
                gVarS = null;
            }
            androidx.compose.runtime.g gVar = z1Var.d;
            if (gVar != null) {
                gVar.cancel();
            }
            z1Var.d = gVarS;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        androidx.compose.ui.focus.e0 e0Var = ((androidx.compose.ui.focus.p) getFocusOwner()).c;
        if (!e0Var.K) {
            return;
        }
        if (!e0Var.e.K) {
            androidx.compose.ui.internal.a.b("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.b bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
        androidx.compose.ui.q qVar = e0Var.e;
        androidx.compose.ui.q qVar2 = qVar.C;
        if (qVar2 == null) {
            androidx.compose.ui.node.k.b(bVar, qVar);
        } else {
            bVar.b(qVar2);
        }
        while (true) {
            int i3 = bVar.z;
            if (i3 == 0) {
                return;
            }
            androidx.compose.ui.q qVar3 = (androidx.compose.ui.q) bVar.k(i3 - 1);
            if ((qVar3.A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                for (androidx.compose.ui.q qVar4 = qVar3; qVar4 != null && qVar4.K; qVar4 = qVar4.C) {
                    if ((qVar4.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        androidx.compose.ui.q qVarE = qVar4;
                        androidx.compose.runtime.collection.b bVar2 = null;
                        while (qVarE != null) {
                            int i4 = 0;
                            if (qVarE instanceof androidx.compose.ui.focus.e0) {
                                androidx.compose.ui.focus.e0 e0Var2 = (androidx.compose.ui.focus.e0) qVarE;
                                if (e0Var2.K && e0Var2.N0().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    androidx.compose.ui.focus.e0 e0Var3 = ((androidx.compose.ui.focus.p) getFocusOwner()).c;
                                    if (e0Var3.K) {
                                        if (!e0Var3.e.K) {
                                            androidx.compose.ui.internal.a.b("visitSubtreeIf called on an unattached node");
                                        }
                                        androidx.compose.runtime.collection.b bVar3 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                        androidx.compose.ui.q qVar5 = e0Var3.e;
                                        androidx.compose.ui.q qVar6 = qVar5.C;
                                        if (qVar6 == null) {
                                            androidx.compose.ui.node.k.b(bVar3, qVar5);
                                        } else {
                                            bVar3.b(qVar6);
                                        }
                                        while (true) {
                                            int i5 = bVar3.z;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            androidx.compose.ui.q qVar7 = (androidx.compose.ui.q) bVar3.k(i5 - 1);
                                            if ((qVar7.A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                                for (androidx.compose.ui.q qVar8 = qVar7; qVar8 != null && qVar8.K; qVar8 = qVar8.C) {
                                                    if ((qVar8.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                                        androidx.compose.ui.q qVarE2 = qVar8;
                                                        androidx.compose.runtime.collection.b bVar4 = null;
                                                        while (qVarE2 != null) {
                                                            if (qVarE2 instanceof androidx.compose.ui.focus.e0) {
                                                                androidx.compose.ui.focus.e0 e0Var4 = (androidx.compose.ui.focus.e0) qVarE2;
                                                                if (e0Var4.K) {
                                                                    androidx.compose.ui.focus.u uVarN0 = e0Var4.N0();
                                                                    if (e0Var4.K && !e0Var4.L && uVarN0.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((qVarE2.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (qVarE2 instanceof androidx.compose.ui.node.j)) {
                                                                int i6 = 0;
                                                                for (androidx.compose.ui.q qVar9 = ((androidx.compose.ui.node.j) qVarE2).M; qVar9 != null; qVar9 = qVar9.C) {
                                                                    if ((qVar9.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            qVarE2 = qVar9;
                                                                        } else {
                                                                            if (bVar4 == null) {
                                                                                bVar4 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                                            }
                                                                            if (qVarE2 != null) {
                                                                                bVar4.b(qVarE2);
                                                                                qVarE2 = null;
                                                                            }
                                                                            bVar4.b(qVar9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            qVarE2 = androidx.compose.ui.node.k.e(bVar4);
                                                        }
                                                    }
                                                }
                                            }
                                            androidx.compose.ui.node.k.b(bVar3, qVar7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                                for (androidx.compose.ui.q qVar10 = ((androidx.compose.ui.node.j) qVarE).M; qVar10 != null; qVar10 = qVar10.C) {
                                    if ((qVar10.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            qVarE = qVar10;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                            }
                                            if (qVarE != null) {
                                                bVar2.b(qVarE);
                                                qVarE = null;
                                            }
                                            bVar2.b(qVar10);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            qVarE = androidx.compose.ui.node.k.e(bVar2);
                        }
                    }
                }
            }
            androidx.compose.ui.node.k.b(bVar, qVar3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        if (f()) {
            androidx.compose.ui.autofill.d dVar = this.l0;
            if (dVar != null) {
                dVar.a(sparseArray);
            }
            androidx.compose.ui.autofill.a aVar = this.k0;
            if (aVar != null) {
                com.google.android.gms.common.wrappers.a.g(aVar, sparseArray);
            }
        }
    }

    @Override // androidx.compose.ui.focus.j
    public final void b(androidx.compose.ui.focus.e0 e0Var, androidx.compose.ui.focus.e0 e0Var2) {
        androidx.compose.ui.node.a1 a1Var;
        androidx.compose.ui.node.a1 a1Var2;
        if (e0Var != null) {
            androidx.compose.ui.focus.e0 e0Var3 = e0Var;
            if (!e0Var3.e.K) {
                androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.q qVar = e0Var3.e;
            androidx.compose.ui.node.f0 f0VarT = androidx.compose.ui.node.k.t(e0Var);
            LinkedHashSet linkedHashSet = null;
            ArrayList arrayList = null;
            while (f0VarT != null) {
                if ((((androidx.compose.ui.q) f0VarT.d0.g).A & 2097152) != 0) {
                    while (qVar != null) {
                        if ((qVar.z & 2097152) != 0) {
                            androidx.compose.ui.q qVarE = qVar;
                            androidx.compose.runtime.collection.b bVar = null;
                            while (qVarE != null) {
                                if (qVarE instanceof androidx.compose.ui.input.indirect.c) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(qVarE);
                                } else if ((qVarE.z & 2097152) != 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                                    int i = 0;
                                    for (androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.j) qVarE).M; qVar2 != null; qVar2 = qVar2.C) {
                                        if ((qVar2.z & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                qVarE = qVar2;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (qVarE != null) {
                                                    bVar.b(qVarE);
                                                    qVarE = null;
                                                }
                                                bVar.b(qVar2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                qVarE = androidx.compose.ui.node.k.e(bVar);
                            }
                        }
                        qVar = qVar.B;
                    }
                }
                f0VarT = f0VarT.v();
                qVar = (f0VarT == null || (a1Var2 = f0VarT.d0) == null) ? null : (androidx.compose.ui.node.w1) a1Var2.f;
            }
            if (arrayList == null) {
                return;
            }
            if (e0Var2 != null) {
                if (!e0Var2.e.K) {
                    androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                }
                androidx.compose.ui.q qVar3 = e0Var2.e;
                androidx.compose.ui.node.f0 f0VarT2 = androidx.compose.ui.node.k.t(e0Var2);
                LinkedHashSet linkedHashSet2 = null;
                while (f0VarT2 != null) {
                    if ((((androidx.compose.ui.q) f0VarT2.d0.g).A & 2097152) != 0) {
                        while (qVar3 != null) {
                            if ((qVar3.z & 2097152) != 0) {
                                androidx.compose.ui.q qVarE2 = qVar3;
                                androidx.compose.runtime.collection.b bVar2 = null;
                                while (qVarE2 != null) {
                                    if (qVarE2 instanceof androidx.compose.ui.input.indirect.c) {
                                        if (linkedHashSet2 == null) {
                                            linkedHashSet2 = new LinkedHashSet();
                                        }
                                        linkedHashSet2.add(qVarE2);
                                    } else if ((qVarE2.z & 2097152) != 0 && (qVarE2 instanceof androidx.compose.ui.node.j)) {
                                        int i2 = 0;
                                        for (androidx.compose.ui.q qVar4 = ((androidx.compose.ui.node.j) qVarE2).M; qVar4 != null; qVar4 = qVar4.C) {
                                            if ((qVar4.z & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    qVarE2 = qVar4;
                                                } else {
                                                    if (bVar2 == null) {
                                                        bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                    }
                                                    if (qVarE2 != null) {
                                                        bVar2.b(qVarE2);
                                                        qVarE2 = null;
                                                    }
                                                    bVar2.b(qVar4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    qVarE2 = androidx.compose.ui.node.k.e(bVar2);
                                }
                            }
                            qVar3 = qVar3.B;
                        }
                    }
                    f0VarT2 = f0VarT2.v();
                    qVar3 = (f0VarT2 == null || (a1Var = f0VarT2.d0) == null) ? null : (androidx.compose.ui.node.w1) a1Var.f;
                }
                linkedHashSet = linkedHashSet2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                androidx.compose.ui.input.indirect.c cVar = (androidx.compose.ui.input.indirect.c) arrayList.get(i3);
                if (!(linkedHashSet != null ? linkedHashSet.contains(cVar) : false)) {
                    cVar.Z();
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.V.m(this.e, i, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.V.m(this.e, i, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            n(getRoot());
        }
        u(true);
        androidx.compose.runtime.snapshots.n.j().m();
        this.f0 = true;
        androidx.compose.ui.graphics.s sVar = this.N;
        androidx.compose.ui.graphics.c cVar = sVar.a;
        Canvas canvas2 = cVar.a;
        cVar.a = canvas;
        getRoot().i(cVar, null);
        sVar.a.a = canvas2;
        androidx.collection.j0 j0Var = this.d0;
        if (j0Var.i()) {
            int i = j0Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((q1) ((androidx.compose.ui.node.l1) j0Var.f(i2))).g();
            }
        }
        int i3 = q2.e;
        j0Var.d();
        this.f0 = false;
        androidx.collection.j0 j0Var2 = this.e0;
        if (j0Var2 != null) {
            j0Var.b(j0Var2);
            j0Var2.d();
        }
        if (this.I) {
            a1.a(this, this.V0);
            View view = this.H;
            if (view == null) {
                kotlin.jvm.internal.l.f("frameRateCategoryView");
                throw null;
            }
            a1.a(view, this.W0);
            if (!Float.isNaN(this.W0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.V0 = Float.NaN;
            this.W0 = Float.NaN;
        }
        getRectManager().a();
    }

    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v13 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instruction units count: 1996
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.u.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:68:0x0160 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.Z0;
        i iVar = this.Y0;
        if (z) {
            removeCallbacks(iVar);
            iVar.run();
        }
        if (!p(motionEvent) && isAttachedToWindow()) {
            a0 a0Var = this.V;
            u uVar = a0Var.A;
            AccessibilityManager accessibilityManager = a0Var.D;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    uVar.u(true);
                    androidx.compose.ui.node.p pVar = new androidx.compose.ui.node.p();
                    androidx.compose.ui.node.f0 root = uVar.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
                    androidx.compose.ui.node.a1 a1Var = root.d0;
                    androidx.compose.ui.node.d1 d1Var = (androidx.compose.ui.node.d1) a1Var.e;
                    androidx.compose.ui.graphics.k0 k0Var = androidx.compose.ui.node.d1.j0;
                    ((androidx.compose.ui.node.d1) a1Var.e).Y0(androidx.compose.ui.node.d1.n0, d1Var.Q0(jFloatToRawIntBits), pVar, 1, true);
                    androidx.collection.j0 j0Var = pVar.e;
                    int i2 = j0Var.b - 1;
                    while (true) {
                        if (-1 < i2) {
                            Object objF = j0Var.f(i2);
                            objF.getClass();
                            androidx.compose.ui.node.f0 f0VarT = androidx.compose.ui.node.k.t((androidx.compose.ui.q) objF);
                            if (uVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(f0VarT) == null) {
                                if (f0VarT.d0.f(8)) {
                                    int iA = a0Var.A(f0VarT.y);
                                    androidx.compose.ui.semantics.p pVarA = androidx.compose.ui.semantics.s.a(f0VarT, false);
                                    if (androidx.compose.ui.semantics.s.f(pVarA)) {
                                        if (!pVarA.k().e.c(androidx.compose.ui.semantics.t.A)) {
                                            i = iA;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                i2--;
                            }
                        }
                        i = Integer.MIN_VALUE;
                        break;
                    }
                    uVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i3 = a0Var.B;
                    if (i3 != i) {
                        a0Var.B = i;
                        a0.E(a0Var, i, 128, null, 12);
                        a0.E(a0Var, i3, LibretroCore.SCREEN_WIDTH, null, 12);
                    }
                } else if (action == 10) {
                    int i4 = a0Var.B;
                    if (i4 == Integer.MIN_VALUE) {
                        uVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i4 != Integer.MIN_VALUE) {
                        a0Var.B = Integer.MIN_VALUE;
                        a0.E(a0Var, Integer.MIN_VALUE, 128, null, 12);
                        a0.E(a0Var, i4, LibretroCore.SCREEN_WIDTH, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && q(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.R0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.R0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.Z0 = true;
                        postDelayed(iVar, 8L);
                        return false;
                    }
                } else if ((l(motionEvent) & 1) != 0) {
                    return true;
                }
            } else if (r(motionEvent)) {
                if ((l(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((androidx.compose.ui.focus.p) getFocusOwner()).d(keyEvent, new androidx.compose.ui.draw.b(5, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.M.getClass();
        s2.a.setValue(new androidx.compose.ui.input.pointer.c0(metaState));
        return ((androidx.compose.ui.focus.p) getFocusOwner()).d(keyEvent, androidx.compose.ui.focus.k.y) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        androidx.compose.ui.node.a1 a1Var;
        if (isFocused()) {
            androidx.compose.ui.focus.p pVar = (androidx.compose.ui.focus.p) getFocusOwner();
            if (pVar.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                androidx.compose.ui.focus.e0 e0VarF = androidx.compose.ui.focus.d.f(pVar.c);
                if (e0VarF != null) {
                    if (!e0VarF.e.K) {
                        androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                    }
                    androidx.compose.ui.q qVar = e0VarF.e;
                    androidx.compose.ui.node.f0 f0VarT = androidx.compose.ui.node.k.t(e0VarF);
                    while (f0VarT != null) {
                        if ((((androidx.compose.ui.q) f0VarT.d0.g).A & 131072) != 0) {
                            while (qVar != null) {
                                if ((qVar.z & 131072) != 0) {
                                    androidx.compose.ui.q qVarE = qVar;
                                    androidx.compose.runtime.collection.b bVar = null;
                                    while (qVarE != null) {
                                        if ((qVarE.z & 131072) != 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                                            int i = 0;
                                            for (androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.j) qVarE).M; qVar2 != null; qVar2 = qVar2.C) {
                                                if ((qVar2.z & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        qVarE = qVar2;
                                                    } else {
                                                        if (bVar == null) {
                                                            bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                        }
                                                        if (qVarE != null) {
                                                            bVar.b(qVarE);
                                                            qVarE = null;
                                                        }
                                                        bVar.b(qVar2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        qVarE = androidx.compose.ui.node.k.e(bVar);
                                    }
                                }
                                qVar = qVar.B;
                            }
                        }
                        f0VarT = f0VarT.v();
                        qVar = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (androidx.compose.ui.node.w1) a1Var.f;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            b0.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object b1Var;
        androidx.compose.ui.focus.e0 e0VarF;
        if (this.Z0) {
            i iVar = this.Y0;
            removeCallbacks(iVar);
            MotionEvent motionEvent2 = this.R0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.Z0 = false;
            } else {
                iVar.run();
            }
        }
        if (!p(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || r(motionEvent))) {
            int iL = l(motionEvent);
            if ((iL & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (b1Var = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    b1Var = new b1(1);
                }
                if (b1Var.equals(new b1(1)) && (e0VarF = ((androidx.compose.ui.focus.p) getFocusOwner()).f()) != null) {
                    androidx.compose.ui.node.d1 d1VarS = androidx.compose.ui.node.k.s(e0VarF);
                    if (!androidx.compose.ui.layout.a0.g(d1VarS).s(d1VarS, true).a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        ((androidx.compose.ui.focus.p) getFocusOwner()).b(8, false, true);
                    }
                }
            }
            if ((iL & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return j(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        androidx.compose.ui.geometry.c cVarA;
        if (view == null || this.u0.c) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !i0.a(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            androidx.compose.ui.focus.e0 e0VarF = androidx.compose.ui.focus.d.f(((androidx.compose.ui.focus.p) getFocusOwner()).c);
            cVarA = e0VarF != null ? androidx.compose.ui.focus.d.j(e0VarF) : null;
            if (cVarA == null) {
                cVarA = androidx.compose.ui.focus.h.a(view, this);
            }
        } else {
            cVarA = androidx.compose.ui.focus.h.a(view, this);
        }
        androidx.compose.ui.focus.f fVarD = androidx.compose.ui.focus.h.d(i);
        int i2 = fVarD != null ? fVarD.a : 6;
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        if (((androidx.compose.ui.focus.p) getFocusOwner()).e(i2, cVarA, new androidx.compose.ui.input.nestedscroll.j(2, zVar)) == null) {
            return view;
        }
        Object obj = zVar.e;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || androidx.compose.ui.focus.d.p(androidx.compose.ui.focus.d.j((androidx.compose.ui.focus.e0) obj), androidx.compose.ui.focus.h.a(viewFindNextFocus, this), cVarA, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public final x0 getAndroidViewsHandler$ui() {
        if (this.r0 == null) {
            x0 x0Var = new x0(getContext());
            this.r0 = x0Var;
            addView(x0Var, -1);
            requestLayout();
        }
        x0 x0Var2 = this.r0;
        x0Var2.getClass();
        return x0Var2;
    }

    public androidx.compose.ui.autofill.h getAutofill() {
        return this.k0;
    }

    public androidx.compose.ui.autofill.l getAutofillManager() {
        return this.l0;
    }

    public androidx.compose.ui.autofill.m getAutofillTree() {
        return this.c0;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.j0.getValue();
    }

    public final androidx.compose.ui.contentcapture.f getContentCaptureManager$ui() {
        return this.W;
    }

    public kotlin.coroutines.i getCoroutineContext() {
        return this.K;
    }

    public androidx.compose.ui.unit.c getDensity() {
        return (androidx.compose.ui.unit.c) this.G.getValue();
    }

    public androidx.compose.ui.geometry.c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            androidx.compose.ui.focus.e0 e0VarF = androidx.compose.ui.focus.d.f(((androidx.compose.ui.focus.p) getFocusOwner()).c);
            if (e0VarF != null) {
                return androidx.compose.ui.focus.d.j(e0VarF);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return androidx.compose.ui.focus.h.a(viewFindFocus, this);
        }
        return null;
    }

    public androidx.compose.ui.focus.l getFocusOwner() {
        return this.J;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        androidx.compose.ui.geometry.c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (kotlin.jvm.internal.l.a(((androidx.compose.ui.focus.p) getFocusOwner()).e(6, null, o.z), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public androidx.compose.ui.text.font.d getFontFamilyResolver() {
        return (androidx.compose.ui.text.font.d) this.L0.getValue();
    }

    public androidx.compose.ui.text.font.c getFontLoader() {
        return this.K0;
    }

    public final y1 getFrameEndScheduler$ui() {
        return this.B;
    }

    public androidx.compose.ui.graphics.y getGraphicsContext() {
        return this.b0;
    }

    public androidx.compose.ui.hapticfeedback.a getHapticFeedBack() {
        return this.N0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.u0.b.O() || !this.E.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public androidx.compose.ui.input.b getInputModeManager() {
        return this.O0;
    }

    public final androidx.compose.ui.layout.r getInsetsListener() {
        return this.P;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.A0;
    }

    @Override // android.view.View, android.view.ViewParent
    public androidx.compose.ui.unit.m getLayoutDirection() {
        return (androidx.compose.ui.unit.m) this.M0.getValue();
    }

    public long getMeasureIteration() {
        androidx.compose.ui.node.t0 t0Var = this.u0;
        if (!t0Var.c) {
            androidx.compose.ui.internal.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return t0Var.g;
    }

    public androidx.compose.ui.modifier.b getModifierLocalManager() {
        return this.P0;
    }

    public u getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public androidx.compose.ui.layout.b1 getPlacementScope() {
        int i = androidx.compose.ui.layout.e1.b;
        return new androidx.compose.ui.layout.n0(this, 1);
    }

    public androidx.compose.ui.input.pointer.t getPointerIconService() {
        return this.g1;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final androidx.compose.ui.input.indirect.a m3getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.z;
    }

    public androidx.compose.ui.spatial.b getRectManager() {
        return this.S;
    }

    public androidx.compose.runtime.retain.d getRetainedValuesStore() {
        return this.D;
    }

    public androidx.compose.ui.node.f0 getRoot() {
        return this.Q;
    }

    public androidx.compose.ui.node.t1 getRootForTest() {
        return this.T;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        androidx.compose.ui.scrollcapture.i iVar;
        if (Build.VERSION.SDK_INT < 31 || (iVar = this.e1) == null) {
            return false;
        }
        return ((Boolean) ((androidx.compose.runtime.h1) iVar.b).getValue()).booleanValue();
    }

    public androidx.compose.ui.semantics.r getSemanticsOwner() {
        return this.U;
    }

    public androidx.compose.ui.node.h0 getSharedDrawScope() {
        return this.A;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? z0.a.a(this) : this.q0;
    }

    public androidx.compose.ui.node.o1 getSnapshotObserver() {
        return this.p0;
    }

    public k2 getSoftwareKeyboardController() {
        return this.J0;
    }

    public androidx.compose.ui.text.input.y getTextInputService() {
        return this.H0;
    }

    public l2 getTextToolbar() {
        return this.Q0;
    }

    public final androidx.compose.ui.node.s1 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public p2 getViewConfiguration() {
        return this.O;
    }

    public final l getViewTreeOwners() {
        return (l) this.E0.getValue();
    }

    public r2 getWindowInfo() {
        return this.M;
    }

    public final androidx.compose.ui.autofill.d get_autofillManager$ui() {
        return this.l0;
    }

    public final void k(androidx.compose.ui.node.f0 f0Var, boolean z) {
        this.u0.f(f0Var, z);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    public final int l(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        u uVar;
        removeCallbacks(this.X0);
        try {
            F(motionEvent);
            this.B0 = true;
            u(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.R0;
                boolean z = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                androidx.compose.material.ripple.g gVar = this.i0;
                if (motionEvent3 != null) {
                    try {
                        if (!((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                            motionEvent2 = motionEvent3;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            if (!gVar.a) {
                                ((androidx.collection.s) ((com.app.mlounge.data.music.e) gVar.d).y).a();
                                ((androidx.compose.ui.input.pointer.d) gVar.c).c();
                            }
                        } else if (motionEvent3.getActionMasked() == 10 || !z) {
                            motionEvent2 = motionEvent3;
                        } else {
                            K(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    motionEvent2 = motionEvent3;
                }
                boolean z2 = motionEvent.getToolType(0) == 3;
                if (z || !z2 || actionMasked2 == 3 || actionMasked2 == 9 || !q(motionEvent)) {
                    uVar = this;
                } else {
                    uVar = this;
                    uVar.K(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = uVar.R0;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = uVar.R0;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    androidx.compose.ui.input.pointer.i iVar = uVar.h0;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            ((SparseBooleanArray) iVar.e).delete(pointerId);
                            ((SparseLongArray) iVar.d).delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = uVar.R0;
                        float x = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = uVar.R0;
                        boolean z3 = (x == motionEvent.getX() && (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent8 = uVar.R0;
                        boolean z4 = (motionEvent8 != null ? motionEvent8.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z3 || z4) {
                            if (pointerId >= 0) {
                                ((SparseBooleanArray) iVar.e).delete(pointerId);
                                ((SparseLongArray) iVar.d).delete(pointerId);
                            }
                            androidx.compose.ui.input.pointer.d dVar = (androidx.compose.ui.input.pointer.d) gVar.c;
                            if (dVar.d) {
                                dVar.d = true;
                            } else {
                                dVar.g.a.g();
                            }
                        }
                    }
                }
                uVar.R0 = MotionEvent.obtainNoHistory(motionEvent);
                int iJ = J(motionEvent);
                Trace.endSection();
                uVar.B0 = false;
                return iJ;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.B0 = false;
            throw th3;
        }
    }

    @Override // androidx.lifecycle.f
    public final void m(androidx.lifecycle.v vVar) {
        z1 z1Var = this.C;
        if (z1Var != null) {
            androidx.compose.runtime.retain.c cVar = (androidx.compose.runtime.retain.c) z1Var.a.y;
            if (cVar.e && !cVar.z) {
                androidx.compose.runtime.g gVar = z1Var.d;
                if (gVar != null) {
                    gVar.cancel();
                }
                z1Var.d = null;
                return;
            }
            if (cVar.y) {
                return;
            }
            if (!cVar.z) {
                androidx.compose.runtime.retain.impl.a.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!cVar.A.i()) {
                androidx.compose.runtime.retain.impl.a.a("Attempted to start retaining exited values with pending exited values");
            }
            cVar.z = false;
        }
    }

    public final void o(androidx.compose.ui.node.f0 f0Var) {
        this.u0.p(f0Var, false);
        androidx.compose.runtime.collection.b bVarZ = f0Var.z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            o((androidx.compose.ui.node.f0) objArr[i2]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.compose.runtime.retain.d dVar;
        androidx.lifecycle.p lifecycle;
        Object obj;
        androidx.compose.ui.autofill.a aVar;
        super.onAttachedToWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(i0.j());
        }
        this.P.onViewAttachedToWindow(this);
        int i2 = 0;
        if (i > 28) {
            if (l1 == null) {
                j jVar = new j(i2);
                l1 = jVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (h1 == null) {
                        h1 = Class.forName("android.os.SystemProperties");
                    }
                    if (j1 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = h1;
                        j1 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = j1;
                    if (method != null) {
                        method.invoke(null, jVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            androidx.collection.j0 j0Var = k1;
            synchronized (j0Var) {
                j0Var.a(this);
            }
        }
        this.M.a.setValue(Boolean.valueOf(hasWindowFocus()));
        this.M.getClass();
        this.M.getClass();
        o(getRoot());
        n(getRoot());
        getSnapshotObserver().a.e();
        if (f() && (aVar = this.k0) != null) {
            androidx.compose.ui.autofill.k.a.a(aVar);
        }
        androidx.lifecycle.v vVarD = androidx.lifecycle.l0.d(this);
        androidx.savedstate.g gVarM = coil3.network.g.m(this);
        androidx.lifecycle.w0 w0VarE = androidx.lifecycle.l0.e(this);
        y1 y1Var = this.B;
        if (vVarD == null || w0VarE == null || y1Var == null) {
            dVar = null;
        } else {
            androidx.lifecycle.v0 viewModelStore = w0VarE.getViewModelStore();
            androidx.lifecycle.t0 t0Var = new androidx.lifecycle.t0();
            androidx.lifecycle.viewmodel.a aVar2 = androidx.lifecycle.viewmodel.a.b;
            viewModelStore.getClass();
            aVar2.getClass();
            com.google.firebase.messaging.o oVar = new com.google.firebase.messaging.o(viewModelStore, t0Var, aVar2);
            kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.a0.a(a2.class);
            String strB = eVarA.b();
            if (strB == null) {
                net.luminis.tls.engine.impl.c.o("Local and anonymous classes can not be ViewModels");
                return;
            }
            a2 a2Var = (a2) oVar.y("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB), eVarA);
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            androidx.collection.z zVar = a2Var.b;
            Object objB = zVar.b(id);
            if (objB == null) {
                objB = new androidx.collection.j0(1);
                zVar.h(id, objB);
            }
            androidx.collection.j0 j0Var2 = (androidx.collection.j0) objB;
            Object[] objArr = j0Var2.a;
            int i3 = j0Var2.b;
            while (true) {
                if (i2 >= i3) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((z1) obj).c) {
                    break;
                } else {
                    i2++;
                }
            }
            z1 z1Var = (z1) obj;
            if (z1Var == null) {
                z1Var = new z1();
                j0Var2.a(z1Var);
            }
            z1Var.c = true;
            this.C = z1Var;
            dVar = z1Var.b;
        }
        if (dVar == null) {
            dVar = androidx.compose.runtime.retain.a.e;
        }
        this.D = dVar;
        l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (vVarD != null && gVarM != null && (vVarD != viewTreeOwners.a || gVarM != viewTreeOwners.b || w0VarE != viewTreeOwners.c))) {
            if (vVarD == null) {
                net.luminis.tls.engine.impl.c.r("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            if (gVarM == null) {
                net.luminis.tls.engine.impl.c.r("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                return;
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.a.getLifecycle()) != null) {
                lifecycle.b(this);
            }
            vVarD.getLifecycle().a(this);
            l lVar = new l(vVarD, gVarM, w0VarE);
            set_viewTreeOwners(lVar);
            kotlin.jvm.functions.l lVar2 = this.F0;
            if (lVar2 != null) {
                lVar2.invoke(lVar);
            }
            this.F0 = null;
        }
        this.O0.a.setValue(new androidx.compose.ui.input.a(isInTouchMode() ? 1 : 2));
        l viewTreeOwners2 = getViewTreeOwners();
        androidx.lifecycle.p lifecycle2 = viewTreeOwners2 != null ? viewTreeOwners2.a.getLifecycle() : null;
        if (lifecycle2 == null) {
            throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("No lifecycle owner exists");
        }
        lifecycle2.a(this);
        lifecycle2.a(this.W);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            f0.a.b(this);
        }
        androidx.compose.ui.autofill.d dVar2 = this.l0;
        if (dVar2 != null) {
            ((androidx.compose.ui.focus.p) getFocusOwner()).g.a(dVar2);
            getSemanticsOwner().d.a(dVar2);
        }
        ((androidx.compose.ui.focus.p) getFocusOwner()).g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        androidx.compose.ui.u uVar = (androidx.compose.ui.u) this.I0.get();
        o0 o0Var = (o0) (uVar != null ? uVar.b : null);
        if (o0Var == null) {
            return this.G0.d;
        }
        androidx.compose.ui.u uVar2 = (androidx.compose.ui.u) o0Var.A.get();
        v1 v1Var = (v1) (uVar2 != null ? uVar2.b : null);
        return v1Var != null && (v1Var.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        M(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection nVar;
        int i;
        androidx.compose.ui.u uVar = (androidx.compose.ui.u) this.I0.get();
        o0 o0Var = (o0) (uVar != null ? uVar.b : null);
        if (o0Var != null) {
            androidx.compose.ui.u uVar2 = (androidx.compose.ui.u) o0Var.A.get();
            v1 v1Var = (v1) (uVar2 != null ? uVar2.b : null);
            if (v1Var == null) {
                return null;
            }
            synchronized (v1Var.c) {
                if (v1Var.e) {
                    return null;
                }
                androidx.compose.foundation.text.input.internal.x xVarA = v1Var.a.a(editorInfo);
                androidx.compose.animation.e eVar = new androidx.compose.animation.e(v1Var, 19);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 34) {
                    nVar = new androidx.compose.ui.text.input.o(xVarA, eVar);
                } else {
                    nVar = i2 >= 25 ? new androidx.compose.ui.text.input.n(xVarA, eVar) : new androidx.compose.ui.text.input.m(xVarA, eVar);
                }
                v1Var.d.b(new androidx.compose.ui.node.b2(nVar));
                return nVar;
            }
        }
        androidx.compose.ui.text.input.a0 a0Var = this.G0;
        if (!a0Var.d) {
            return null;
        }
        androidx.compose.ui.text.input.k kVar = a0Var.h;
        androidx.compose.ui.text.input.x xVar = a0Var.g;
        int i3 = kVar.e;
        boolean z = kVar.a;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                net.luminis.tls.engine.impl.c.r("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        int i4 = kVar.d;
        if (i4 == 1) {
            editorInfo.inputType = 1;
        } else if (i4 == 2) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions = Integer.MIN_VALUE | i;
        } else if (i4 == 3) {
            editorInfo.inputType = 2;
        } else if (i4 == 4) {
            editorInfo.inputType = 3;
        } else if (i4 == 5) {
            editorInfo.inputType = 17;
        } else if (i4 == 6) {
            editorInfo.inputType = 33;
        } else if (i4 == 7) {
            editorInfo.inputType = Token.DEFAULT;
        } else if (i4 == 8) {
            editorInfo.inputType = 18;
        } else {
            if (i4 != 9) {
                net.luminis.tls.engine.impl.c.r("Invalid Keyboard Type");
                return null;
            }
            editorInfo.inputType = 8194;
        }
        if (!z) {
            int i5 = editorInfo.inputType;
            if ((i5 & 1) == 1) {
                editorInfo.inputType = i5 | 131072;
                if (i3 == 1) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
        }
        int i6 = editorInfo.inputType;
        if ((i6 & 1) == 1) {
            int i7 = kVar.b;
            if (i7 == 1) {
                editorInfo.inputType = i6 | 4096;
            } else if (i7 == 2) {
                editorInfo.inputType = i6 | 8192;
            } else if (i7 == 3) {
                editorInfo.inputType = i6 | 16384;
            }
            if (kVar.c) {
                editorInfo.inputType |= 32768;
            }
        }
        long j = xVar.b;
        int i8 = androidx.compose.ui.text.l0.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        androidx.core.view.inputmethod.c.c(editorInfo, xVar.a.y);
        editorInfo.imeOptions |= 33554432;
        if (androidx.emoji2.text.j.d()) {
            androidx.emoji2.text.j.a().i(editorInfo);
        }
        androidx.compose.ui.text.input.t tVar = new androidx.compose.ui.text.input.t(a0Var.g, new com.app.mlounge.data.music.e(a0Var, 20), a0Var.h.c);
        a0Var.i.add(new WeakReference(tVar));
        return tVar;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        androidx.compose.ui.contentcapture.f fVar = this.W;
        fVar.getClass();
        androidx.compose.ui.contentcapture.b.h(fVar, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        androidx.compose.ui.autofill.a aVar;
        super.onDetachedFromWindow();
        this.P.onViewDetachedFromWindow(this);
        if (this.I) {
            View view = this.H;
            if (view == null) {
                kotlin.jvm.internal.l.f("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            androidx.collection.j0 j0Var = k1;
            synchronized (j0Var) {
                j0Var.j(this);
            }
        }
        androidx.compose.runtime.snapshots.t tVar = getSnapshotObserver().a;
        androidx.activity.y yVar = tVar.h;
        if (yVar != null) {
            yVar.f();
        }
        tVar.a();
        this.M.getClass();
        l viewTreeOwners = getViewTreeOwners();
        androidx.lifecycle.p lifecycle = viewTreeOwners != null ? viewTreeOwners.a.getLifecycle() : null;
        if (lifecycle == null) {
            throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("No lifecycle owner exists");
        }
        lifecycle.b(this.W);
        lifecycle.b(this);
        if (f() && (aVar = this.k0) != null) {
            androidx.compose.ui.autofill.k.a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        z1 z1Var = this.C;
        if (z1Var != null) {
            z1Var.c = false;
        }
        this.C = null;
        if (i >= 31) {
            f0.a.a(this);
        }
        androidx.compose.ui.autofill.d dVar = this.l0;
        if (dVar != null) {
            getSemanticsOwner().d.j(dVar);
            ((androidx.compose.ui.focus.p) getFocusOwner()).g.j(dVar);
        }
        androidx.compose.ui.spatial.b rectManager = getRectManager();
        androidx.compose.foundation.text.contextmenu.internal.c cVar = rectManager.g;
        if (cVar != null) {
            androidx.compose.ui.b.a.removeCallbacks(cVar);
            rectManager.g = null;
        }
        ((androidx.compose.ui.focus.p) getFocusOwner()).g.j(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        androidx.compose.ui.focus.p pVar = (androidx.compose.ui.focus.p) getFocusOwner();
        androidx.compose.ui.focus.d.d(pVar.c, true);
        if (pVar.f() != null) {
            androidx.compose.ui.focus.e0 e0VarF = pVar.f();
            pVar.i(null);
            if (e0VarF != null) {
                e0VarF.M0(androidx.compose.ui.focus.c0.e, androidx.compose.ui.focus.c0.z);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.A0 = 0L;
        N();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        M(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0 = 0L;
        this.u0.j(this.b1);
        this.s0 = null;
        N();
        if (this.r0 != null) {
            getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        androidx.compose.ui.node.t0 t0Var = this.u0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                o(getRoot());
            }
            long jI = i(i);
            long jI2 = i(i2);
            long jN = org.jsoup.helper.n.n((int) (jI >>> 32), (int) (jI & 4294967295L), (int) (jI2 >>> 32), (int) (4294967295L & jI2));
            androidx.compose.ui.unit.a aVar = this.s0;
            if (aVar == null) {
                this.s0 = new androidx.compose.ui.unit.a(jN);
                this.t0 = false;
            } else if (!androidx.compose.ui.unit.a.b(aVar.a, jN)) {
                this.t0 = true;
            }
            t0Var.q(jN);
            t0Var.l();
            setMeasuredDimension(getRoot().e0.p.e, getRoot().e0.p.y);
            if (this.r0 != null) {
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().e0.p.e, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().e0.p.y, 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!f() || viewStructure == null) {
            return;
        }
        androidx.compose.ui.autofill.d dVar = this.l0;
        if (dVar != null) {
            androidx.compose.ui.node.f0 f0Var = dVar.y.a;
            AutofillId autofillId = dVar.D;
            String str = dVar.B;
            androidx.compose.ui.spatial.b bVar = dVar.A;
            _COROUTINE.b.B(viewStructure, f0Var, autofillId, str, bVar);
            Object[] objArr = androidx.collection.u0.a;
            androidx.collection.j0 j0Var = new androidx.collection.j0(2);
            j0Var.a(f0Var);
            j0Var.a(viewStructure);
            while (j0Var.i()) {
                Object objK = j0Var.k(j0Var.b - 1);
                objK.getClass();
                ViewStructure viewStructure2 = (ViewStructure) objK;
                Object objK2 = j0Var.k(j0Var.b - 1);
                objK2.getClass();
                androidx.collection.h0 h0Var = (androidx.collection.h0) ((androidx.compose.ui.node.f0) objK2).n();
                int i2 = ((androidx.compose.runtime.collection.b) h0Var.y).z;
                for (int i3 = 0; i3 < i2; i3++) {
                    androidx.compose.ui.node.f0 f0Var2 = (androidx.compose.ui.node.f0) h0Var.get(i3);
                    if (!f0Var2.o0 && f0Var2.H() && f0Var2.I()) {
                        androidx.compose.ui.semantics.l lVarX = f0Var2.x();
                        if (lVarX != null) {
                            androidx.collection.o0 o0Var = lVarX.e;
                            if (o0Var.b(androidx.compose.ui.semantics.k.g) || o0Var.b(androidx.compose.ui.semantics.k.h) || o0Var.b(androidx.compose.ui.semantics.t.q) || o0Var.b(androidx.compose.ui.semantics.t.r)) {
                                ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                _COROUTINE.b.B(viewStructureNewChild, f0Var2, dVar.D, str, bVar);
                                j0Var.a(f0Var2);
                                j0Var.a(viewStructureNewChild);
                            } else {
                                j0Var.a(f0Var2);
                                j0Var.a(viewStructure2);
                            }
                        } else {
                            j0Var.a(f0Var2);
                            j0Var.a(viewStructure2);
                        }
                    }
                }
            }
        }
        androidx.compose.ui.autofill.a aVar = this.k0;
        if (aVar != null) {
            androidx.compose.ui.autofill.m mVar = aVar.b;
            LinkedHashMap linkedHashMap = mVar.a;
            LinkedHashMap linkedHashMap2 = mVar.a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    androidx.transition.k.i();
                    return;
                }
                ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                androidx.compose.ui.autofill.i.d(viewStructureNewChild2, aVar.d, iIntValue);
                viewStructureNewChild2.setId(iIntValue, aVar.a.getContext().getPackageName(), null, null);
                androidx.compose.ui.autofill.i.e(viewStructureNewChild2, 1);
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        androidx.compose.ui.input.pointer.s sVar;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (sVar = ((q) getPointerIconService()).a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return sVar instanceof androidx.compose.ui.input.pointer.a ? PointerIcon.getSystemIcon(context, ((androidx.compose.ui.input.pointer.a) sVar).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        androidx.compose.ui.unit.m mVar;
        if (this.y) {
            int[] iArr = androidx.compose.ui.focus.h.a;
            androidx.compose.ui.unit.m mVar2 = androidx.compose.ui.unit.m.e;
            if (i != 0) {
                mVar = i != 1 ? null : androidx.compose.ui.unit.m.y;
            } else {
                mVar = mVar2;
            }
            if (mVar != null) {
                mVar2 = mVar;
            }
            setLayoutDirection(mVar2);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        androidx.compose.ui.scrollcapture.i iVar;
        if (Build.VERSION.SDK_INT < 31 || (iVar = this.e1) == null) {
            return;
        }
        iVar.g(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        N();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        this.O0.a.setValue(new androidx.compose.ui.input.a(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        androidx.compose.ui.contentcapture.f fVar = this.W;
        fVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (kotlin.jvm.internal.l.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            androidx.compose.ui.contentcapture.b.a(fVar, longSparseArray);
        } else {
            fVar.e.post(new androidx.activity.c(1, fVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zJ;
        this.M.a.setValue(Boolean.valueOf(z));
        this.d1 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zJ = i0.j())) {
            return;
        }
        setShowLayoutBounds(zJ);
        n(getRoot());
    }

    public final boolean q(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean r(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.R0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (!isFocused()) {
            androidx.compose.ui.focus.f fVarD = androidx.compose.ui.focus.h.d(i);
            int i2 = fVarD != null ? fVarD.a : 7;
            Boolean boolE = ((androidx.compose.ui.focus.p) getFocusOwner()).e(i2, rect != null ? androidx.compose.ui.graphics.a0.z(rect) : null, new androidx.compose.ui.focus.o(i2, 3));
            Boolean bool = Boolean.TRUE;
            if (!kotlin.jvm.internal.l.a(boolE, bool)) {
                if (!kotlin.jvm.internal.l.a(((androidx.compose.ui.focus.p) getFocusOwner()).e(i2, null, new androidx.compose.ui.focus.o(i2, 4)), bool)) {
                    if (!hasFocus()) {
                        return false;
                    }
                    if (i2 == 1 || i2 == 2) {
                        return ((androidx.compose.ui.focus.p) getFocusOwner()).h(i2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void s(float[] fArr) {
        E();
        androidx.compose.ui.graphics.f0.e(fArr, this.y0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.C0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.C0 & 4294967295L));
        float[] fArr2 = this.x0;
        androidx.compose.ui.graphics.f0.d(fArr2);
        androidx.compose.ui.graphics.f0.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        i0.o(fArr, fArr2);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.V.E = j;
    }

    public final void setConfiguration(Configuration configuration) {
        this.j0.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(androidx.compose.ui.contentcapture.f fVar) {
        this.W = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public void setCoroutineContext(kotlin.coroutines.i iVar) {
        this.K = iVar;
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) getRoot().d0.g;
        if (qVar instanceof androidx.compose.ui.input.pointer.l0) {
            ((androidx.compose.ui.input.pointer.l0) qVar).N0();
        }
        if (!qVar.e.K) {
            androidx.compose.ui.internal.a.b("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.b bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
        androidx.compose.ui.q qVar2 = qVar.e;
        androidx.compose.ui.q qVar3 = qVar2.C;
        if (qVar3 == null) {
            androidx.compose.ui.node.k.b(bVar, qVar2);
        } else {
            bVar.b(qVar3);
        }
        while (true) {
            int i = bVar.z;
            if (i == 0) {
                return;
            }
            androidx.compose.ui.q qVar4 = (androidx.compose.ui.q) bVar.k(i - 1);
            if ((qVar4.A & 16) != 0) {
                for (androidx.compose.ui.q qVar5 = qVar4; qVar5 != null && qVar5.K; qVar5 = qVar5.C) {
                    if ((qVar5.z & 16) != 0) {
                        ?? E = qVar5;
                        ?? bVar2 = 0;
                        while (E != 0) {
                            if (E instanceof androidx.compose.ui.node.r1) {
                                androidx.compose.ui.node.r1 r1Var = (androidx.compose.ui.node.r1) E;
                                if (r1Var instanceof androidx.compose.ui.input.pointer.l0) {
                                    ((androidx.compose.ui.input.pointer.l0) r1Var).N0();
                                }
                            } else if ((E.z & 16) != 0 && (E instanceof androidx.compose.ui.node.j)) {
                                androidx.compose.ui.q qVar6 = ((androidx.compose.ui.node.j) E).M;
                                int i2 = 0;
                                E = E;
                                bVar2 = bVar2;
                                while (qVar6 != null) {
                                    if ((qVar6.z & 16) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            bVar2 = bVar2;
                                            E = qVar6;
                                        } else {
                                            if (bVar2 == 0) {
                                                bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                            }
                                            if (E != 0) {
                                                bVar2.b(E);
                                                E = 0;
                                            }
                                            bVar2.b(qVar6);
                                        }
                                    }
                                    qVar6 = qVar6.C;
                                    E = E;
                                    bVar2 = bVar2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            E = androidx.compose.ui.node.k.e(bVar2);
                        }
                    }
                }
            }
            androidx.compose.ui.node.k.b(bVar, qVar4);
        }
    }

    public final void setFrameEndScheduler$ui(y1 y1Var) {
        this.B = y1Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.A0 = j;
    }

    public final void setOnViewTreeOwnersAvailable(kotlin.jvm.functions.l lVar) {
        l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.F0 = lVar;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m4setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(androidx.compose.ui.input.indirect.a aVar) {
        this.z = aVar;
    }

    public void setShowLayoutBounds(boolean z) {
        this.q0 = z;
    }

    public void setUncaughtExceptionHandler(androidx.compose.ui.node.s1 s1Var) {
        this.u0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final long t(long j) {
        E();
        long jB = androidx.compose.ui.graphics.f0.b(j, this.y0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.C0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.C0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void u(boolean z) {
        r rVar;
        androidx.compose.ui.node.t0 t0Var = this.u0;
        if (t0Var.b.O() || ((androidx.compose.runtime.collection.b) t0Var.e.y).z != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    rVar = this.b1;
                } finally {
                    Trace.endSection();
                }
            } else {
                rVar = null;
            }
            if (t0Var.j(rVar)) {
                requestLayout();
            }
            t0Var.a(false);
            if (this.g0) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.g0 = false;
            }
        }
    }

    public final void v(androidx.compose.ui.node.f0 f0Var, long j) {
        androidx.compose.ui.node.t0 t0Var = this.u0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            t0Var.k(f0Var, j);
            if (!t0Var.b.O()) {
                t0Var.a(false);
                if (this.g0) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.g0 = false;
                }
            }
            getRectManager().a();
        } finally {
            Trace.endSection();
        }
    }

    public final boolean x(int i) {
        if (i == 7 || i == 8) {
            return false;
        }
        Integer numC = androidx.compose.ui.focus.h.c(i);
        if (numC == null) {
            throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("Invalid focus direction");
        }
        int iIntValue = numC.intValue();
        androidx.compose.ui.focus.e0 e0VarF = ((androidx.compose.ui.focus.p) getFocusOwner()).f();
        if (e0VarF == null) {
            net.luminis.tls.engine.impl.c.r("findNextViewInEmbeddedView called when owner does not have anything focused.");
            return false;
        }
        Integer numC2 = androidx.compose.ui.focus.h.c(i);
        if (numC2 == null) {
            throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("Invalid focus direction");
        }
        int iIntValue2 = numC2.intValue();
        androidx.compose.ui.viewinterop.v vVar = androidx.compose.ui.node.k.t(e0VarF).M;
        View interopView = vVar != null ? vVar.getInteropView() : null;
        View viewFindFocus = findFocus();
        FocusFinder focusFinder = FocusFinder.getInstance();
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
        if (viewFindNextFocus == null || interopView == null || !i0.a(interopView, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (viewFindNextFocus != null) {
            return androidx.compose.ui.focus.h.b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
        }
        return false;
    }

    public final void y() {
        androidx.collection.j0 j0Var;
        androidx.compose.ui.autofill.d dVar;
        Object[] objArr;
        if (this.m0) {
            androidx.compose.runtime.snapshots.t tVar = getSnapshotObserver().a;
            synchronized (tVar.g) {
                try {
                    androidx.compose.runtime.collection.b bVar = tVar.f;
                    int i = bVar.z;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = bVar.e;
                        if (i2 >= i) {
                            break;
                        }
                        androidx.compose.runtime.snapshots.s sVar = (androidx.compose.runtime.snapshots.s) objArr[i2];
                        sVar.d();
                        if (!sVar.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = bVar.e;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    bVar.z = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.m0 = false;
        }
        x0 x0Var = this.r0;
        if (x0Var != null) {
            h(x0Var);
        }
        if (f() && (dVar = this.l0) != null) {
            androidx.collection.a0 a0Var = dVar.E;
            if (a0Var.d == 0 && dVar.F) {
                dVar.e.a();
                dVar.F = false;
            }
            if (a0Var.d != 0) {
                dVar.F = true;
            }
        }
        while (this.U0.i() && this.U0.f(0) != null) {
            int i5 = this.U0.b;
            int i6 = 0;
            while (true) {
                j0Var = this.U0;
                if (i6 < i5) {
                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) j0Var.f(i6);
                    androidx.collection.j0 j0Var2 = this.U0;
                    if (i6 < 0 || i6 >= j0Var2.b) {
                        j0Var2.n(i6);
                        throw null;
                    }
                    Object[] objArr3 = j0Var2.a;
                    Object obj = objArr3[i6];
                    objArr3[i6] = null;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    i6++;
                }
            }
            j0Var.l(0, i5);
        }
    }

    public f getAccessibilityManager() {
        return this.a0;
    }

    public g getClipboard() {
        return this.o0;
    }

    public h getClipboardManager() {
        return this.n0;
    }

    /* JADX INFO: renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.draganddrop.b m8getDragAndDropManager() {
        return this.L;
    }

    public androidx.collection.z getLayoutNodes() {
        return this.R;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @kotlin.c
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m2getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @kotlin.c
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(androidx.compose.ui.node.s1 s1Var) {
    }
}
