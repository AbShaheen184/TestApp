package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.appcompat.widget.c2;
import androidx.appcompat.widget.z0;
import androidx.collection.y0;
import androidx.compose.foundation.gestures.y2;
import androidx.compose.ui.platform.m2;
import androidx.datastore.preferences.protobuf.h1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] T0 = {R.attr.nestedScrollingEnabled};
    public static final float U0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean V0 = true;
    public static final boolean W0 = true;
    public static final Class[] X0;
    public static final androidx.customview.widget.c Y0;
    public static final m0 Z0;
    public k0 A;
    public final l0 A0;
    public final androidx.compose.runtime.internal.c B;
    public f0 B0;
    public final c2 C;
    public ArrayList C0;
    public final androidx.media3.common.util.b D;
    public boolean D0;
    public boolean E;
    public boolean E0;
    public final Rect F;
    public final u F0;
    public final Rect G;
    public boolean G0;
    public final RectF H;
    public r0 H0;
    public v I;
    public final int[] I0;
    public c0 J;
    public androidx.core.view.o J0;
    public final ArrayList K;
    public final int[] K0;
    public final ArrayList L;
    public final int[] L0;
    public final ArrayList M;
    public final int[] M0;
    public l N;
    public final ArrayList N0;
    public boolean O;
    public final z0 O0;
    public boolean P;
    public boolean P0;
    public boolean Q;
    public int Q0;
    public int R;
    public int R0;
    public boolean S;
    public final t S0;
    public boolean T;
    public boolean U;
    public int V;
    public final AccessibilityManager W;
    public boolean a0;
    public boolean b0;
    public int c0;
    public int d0;
    public final float e;
    public y e0;
    public EdgeEffect f0;
    public EdgeEffect g0;
    public EdgeEffect h0;
    public EdgeEffect i0;
    public z j0;
    public int k0;
    public int l0;
    public VelocityTracker m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public final int s0;
    public final int t0;
    public final float u0;
    public final float v0;
    public boolean w0;
    public final o0 x0;
    public final com.google.firebase.heartbeatinfo.e y;
    public n y0;
    public final i0 z;
    public final androidx.media3.common.util.e z0;

    static {
        Class cls = Integer.TYPE;
        X0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        Y0 = new androidx.customview.widget.c(1);
        Z0 = new m0();
    }

    /* JADX WARN: Failed to calculate best type for var: r16v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v10 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r16v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v10 ??, new type: java.lang.Throwable
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
    /* JADX WARN: Failed to calculate best type for var: r16v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v3 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r16v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v3 ??, new type: java.lang.Throwable
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
    /* JADX WARN: Failed to calculate best type for var: r16v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v4 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r16v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v4 ??, new type: java.lang.Throwable
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
    /* JADX WARN: Failed to calculate best type for var: r16v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v5 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r16v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v5 ??, new type: java.lang.Throwable
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
    /* JADX WARN: Failed to calculate best type for var: r16v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v6 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r16v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v6 ??, new type: java.lang.Throwable
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
    /* JADX WARN: Failed to calculate best type for var: r16v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v7 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r16v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v7 ??, new type: java.lang.Throwable
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
    /* JADX WARN: Failed to calculate best type for var: r16v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v8 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r16v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v8 ??, new type: java.lang.Throwable
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
    /* JADX WARN: Failed to calculate best type for var: r16v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v9 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r16v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v9 ??, new type: java.lang.Throwable
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
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: TypeSearchVarInfo not found in map for var: r10v0 ??
    	at jadx.core.dex.visitors.typeinference.TypeSearchState.getVarInfo(TypeSearchState.java:34)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.lambda$resolveIndependentVariables$1(TypeSearch.java:173)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(Unknown Source)
    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.test(Unknown Source)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(Unknown Source)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(Unknown Source)
    	at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(Unknown Source)
     */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        float fA;
        char c;
        int i2;
        ?? r16;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i);
        this.y = new com.google.firebase.heartbeatinfo.e();
        this.z = new i0(this);
        this.D = new androidx.media3.common.util.b(24);
        this.F = new Rect();
        this.G = new Rect();
        this.H = new RectF();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.R = 0;
        this.a0 = false;
        this.b0 = false;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = Z0;
        h hVar = new h();
        hVar.a = null;
        hVar.b = new ArrayList();
        hVar.c = 120L;
        hVar.d = 120L;
        hVar.e = 250L;
        hVar.f = 250L;
        hVar.g = true;
        hVar.h = new ArrayList();
        hVar.i = new ArrayList();
        hVar.j = new ArrayList();
        hVar.k = new ArrayList();
        hVar.l = new ArrayList();
        hVar.m = new ArrayList();
        hVar.n = new ArrayList();
        hVar.o = new ArrayList();
        hVar.p = new ArrayList();
        hVar.q = new ArrayList();
        hVar.r = new ArrayList();
        this.j0 = hVar;
        this.k0 = 0;
        this.l0 = -1;
        this.u0 = Float.MIN_VALUE;
        this.v0 = Float.MIN_VALUE;
        this.w0 = true;
        this.x0 = new o0(this);
        this.z0 = W0 ? new androidx.media3.common.util.e() : null;
        l0 l0Var = new l0();
        l0Var.a = -1;
        l0Var.b = 0;
        l0Var.c = 0;
        l0Var.d = 1;
        l0Var.e = 0;
        l0Var.f = false;
        l0Var.g = false;
        l0Var.h = false;
        l0Var.i = false;
        l0Var.j = false;
        l0Var.k = false;
        this.A0 = l0Var;
        this.D0 = false;
        this.E0 = false;
        u uVar = new u(this);
        this.F0 = uVar;
        this.G0 = false;
        this.I0 = new int[2];
        this.K0 = new int[2];
        this.L0 = new int[2];
        this.M0 = new int[2];
        this.N0 = new ArrayList();
        this.O0 = new z0(this, 10);
        this.Q0 = 0;
        this.R0 = 0;
        this.S0 = new t(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.r0 = viewConfiguration.getScaledTouchSlop();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            Method method = androidx.core.view.t0.a;
            fA = androidx.media3.common.audio.h.n(viewConfiguration);
        } else {
            fA = androidx.core.view.t0.a(viewConfiguration, context);
        }
        this.u0 = fA;
        this.v0 = i3 >= 26 ? androidx.media3.common.audio.h.o(viewConfiguration) : androidx.core.view.t0.a(viewConfiguration, context);
        this.s0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.t0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.e = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.j0.a = uVar;
        this.B = new androidx.compose.runtime.internal.c(new t(this));
        this.C = new c2(new u(this));
        Field field = androidx.core.view.s0.a;
        if ((i3 >= 26 ? androidx.core.view.m0.a(this) : 0) == 0 && i3 >= 26) {
            androidx.core.view.m0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.W = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new r0(this));
        int[] iArr = androidx.recyclerview.a.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        androidx.core.view.s0.l(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.E = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                net.luminis.tls.engine.impl.c.o("Trying to set fast scroller without both required drawables.".concat(w()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c = 3;
            i2 = 4;
            new l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.app.mlounge.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.app.mlounge.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.app.mlounge.R.dimen.fastscroll_margin));
        } else {
            c = 3;
            i2 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            try {
                                classLoader = context.getClassLoader();
                            } catch (ClassNotFoundException e) {
                                e = e;
                                r16 = 0;
                                androidx.media3.exoplayer.hls.playlist.a.e(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e);
                                throw r16;
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                r16 = 0;
                                androidx.media3.exoplayer.hls.playlist.a.e(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e);
                                throw r16;
                            } catch (InstantiationException e3) {
                                e = e3;
                                r16 = 0;
                                androidx.media3.exoplayer.hls.playlist.a.e(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw r16;
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                r16 = 0;
                                androidx.media3.exoplayer.hls.playlist.a.e(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw r16;
                            }
                        }
                        Class clsAsSubclass = Class.forName(str, false, classLoader).asSubclass(c0.class);
                        try {
                            constructor = clsAsSubclass.getConstructor(X0);
                            objArr = new Object[i2];
                            objArr[0] = context;
                            objArr[r11] = attributeSet;
                            objArr[2] = Integer.valueOf(i);
                            objArr[c] = 0;
                        } catch (NoSuchMethodException e5) {
                            try {
                                constructor = clsAsSubclass.getConstructor(null);
                                objArr = null;
                            } catch (NoSuchMethodException e6) {
                                e6.initCause(e5);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e6);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((c0) constructor.newInstance(objArr));
                    } catch (ClassNotFoundException e7) {
                        e = e7;
                    } catch (IllegalAccessException e8) {
                        e = e8;
                    } catch (InstantiationException e9) {
                        e = e9;
                    } catch (InvocationTargetException e10) {
                        e = e10;
                    }
                } catch (ClassCastException e11) {
                    androidx.media3.exoplayer.hls.playlist.a.e(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e11);
                    throw null;
                }
            }
        }
        int[] iArr2 = T0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        androidx.core.view.s0.l(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(com.app.mlounge.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView B(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewB = B(viewGroup.getChildAt(i));
            if (recyclerViewB != null) {
                return recyclerViewB;
            }
        }
        return null;
    }

    public static p0 G(View view) {
        if (view == null) {
            return null;
        }
        return ((d0) view.getLayoutParams()).a;
    }

    public static void g(p0 p0Var) {
        WeakReference weakReference = p0Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == p0Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            p0Var.b = null;
        }
    }

    private androidx.core.view.o getScrollingChildHelper() {
        if (this.J0 == null) {
            this.J0 = new androidx.core.view.o(this);
        }
        return this.J0;
    }

    public static int j(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && androidx.room.r.m(edgeEffect) != 0.0f) {
            int iRound = Math.round(androidx.room.r.p(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || androidx.room.r.m(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(androidx.room.r.p(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public final void A(int[] iArr) {
        int iY = this.C.y();
        if (iY == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iY; i3++) {
            p0 p0VarG = G(this.C.x(i3));
            if (!p0VarG.o()) {
                int iB = p0VarG.b();
                if (iB < i) {
                    i = iB;
                }
                if (iB > i2) {
                    i2 = iB;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final p0 C(int i) {
        p0 p0Var = null;
        if (this.a0) {
            return null;
        }
        int iJ = this.C.J();
        for (int i2 = 0; i2 < iJ; i2++) {
            p0 p0VarG = G(this.C.I(i2));
            if (p0VarG != null && !p0VarG.h() && D(p0VarG) == i) {
                if (!((ArrayList) this.C.A).contains(p0VarG.a)) {
                    return p0VarG;
                }
                p0Var = p0VarG;
            }
        }
        return p0Var;
    }

    public final int D(p0 p0Var) {
        if ((p0Var.j & 524) == 0 && p0Var.e()) {
            int i = p0Var.c;
            ArrayList arrayList = (ArrayList) this.B.y;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = (a) arrayList.get(i2);
                int i3 = aVar.a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = aVar.b;
                        if (i4 <= i) {
                            int i5 = aVar.c;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = aVar.b;
                        if (i6 == i) {
                            i = aVar.c;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (aVar.c <= i) {
                                i++;
                            }
                        }
                    }
                } else if (aVar.b <= i) {
                    i += aVar.c;
                }
            }
            return i;
        }
        return -1;
    }

    public final long E(p0 p0Var) {
        return this.I.b ? p0Var.e : p0Var.c;
    }

    public final p0 F(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return G(view);
        }
        org.mozilla.javascript.typedarrays.c.c("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect H(View view) {
        d0 d0Var = (d0) view.getLayoutParams();
        boolean z = d0Var.c;
        Rect rect = d0Var.b;
        if (!z || (this.A0.g && (d0Var.a.k() || d0Var.a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.F;
            rect2.set(0, 0, 0, 0);
            ((a0) arrayList.get(i)).getClass();
            ((d0) view.getLayoutParams()).a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        d0Var.c = false;
        return rect;
    }

    public final boolean I() {
        return !this.Q || this.a0 || this.B.z();
    }

    public final boolean J() {
        return this.c0 > 0;
    }

    public final void K() {
        int iJ = this.C.J();
        for (int i = 0; i < iJ; i++) {
            ((d0) this.C.I(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.z.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            d0 d0Var = (d0) ((p0) arrayList.get(i2)).a.getLayoutParams();
            if (d0Var != null) {
                d0Var.c = true;
            }
        }
    }

    public final void L(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iJ = this.C.J();
        for (int i4 = 0; i4 < iJ; i4++) {
            p0 p0VarG = G(this.C.I(i4));
            if (p0VarG != null && !p0VarG.o()) {
                int i5 = p0VarG.c;
                l0 l0Var = this.A0;
                if (i5 >= i3) {
                    p0VarG.l(-i2, z);
                    l0Var.f = true;
                } else if (i5 >= i) {
                    p0VarG.a(8);
                    p0VarG.l(-i2, z);
                    p0VarG.c = i - 1;
                    l0Var.f = true;
                }
            }
        }
        i0 i0Var = this.z;
        ArrayList arrayList = i0Var.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p0 p0Var = (p0) arrayList.get(size);
            if (p0Var != null) {
                int i6 = p0Var.c;
                if (i6 >= i3) {
                    p0Var.l(-i2, z);
                } else if (i6 >= i) {
                    p0Var.a(8);
                    i0Var.h(size);
                }
            }
        }
        requestLayout();
    }

    public final void M() {
        this.c0++;
    }

    public final void N(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.c0 - 1;
        this.c0 = i2;
        if (i2 < 1) {
            this.c0 = 0;
            if (z) {
                int i3 = this.V;
                this.V = 0;
                if (i3 != 0 && (accessibilityManager = this.W) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.N0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    p0 p0Var = (p0) arrayList.get(size);
                    if (p0Var.a.getParent() == this && !p0Var.o() && (i = p0Var.q) != -1) {
                        View view = p0Var.a;
                        Field field = androidx.core.view.s0.a;
                        view.setImportantForAccessibility(i);
                        p0Var.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void O(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.l0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.l0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.p0 = x;
            this.n0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.q0 = y;
            this.o0 = y;
        }
    }

    public final void P() {
        if (this.G0 || !this.O) {
            return;
        }
        Field field = androidx.core.view.s0.a;
        postOnAnimation(this.O0);
        this.G0 = true;
    }

    public final void Q(p0 p0Var, androidx.core.view.r rVar) {
        p0Var.j &= -8193;
        boolean z = this.A0.h;
        androidx.media3.common.util.b bVar = this.D;
        if (z && p0Var.k() && !p0Var.h() && !p0Var.o()) {
            ((androidx.collection.s) bVar.z).e(E(p0Var), p0Var);
        }
        y0 y0Var = (y0) bVar.y;
        x0 x0VarA = (x0) y0Var.get(p0Var);
        if (x0VarA == null) {
            x0VarA = x0.a();
            y0Var.put(p0Var, x0VarA);
        }
        x0VarA.b = rVar;
        x0VarA.a |= 4;
    }

    public final int R(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.f0;
        float f2 = 0.0f;
        if (edgeEffect == null || androidx.room.r.m(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.h0;
            if (edgeEffect2 != null && androidx.room.r.m(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.h0;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fP = androidx.room.r.p(edgeEffect3, width, height);
                    if (androidx.room.r.m(this.h0) == 0.0f) {
                        this.h0.onRelease();
                    }
                    f2 = fP;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.f0;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -androidx.room.r.p(edgeEffect4, -width, 1.0f - height);
                if (androidx.room.r.m(this.f0) == 0.0f) {
                    this.f0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    public final int S(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.g0;
        float f2 = 0.0f;
        if (edgeEffect == null || androidx.room.r.m(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.i0;
            if (edgeEffect2 != null && androidx.room.r.m(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.i0;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fP = androidx.room.r.p(edgeEffect3, height, 1.0f - width);
                    if (androidx.room.r.m(this.i0) == 0.0f) {
                        this.i0.onRelease();
                    }
                    f2 = fP;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.g0;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -androidx.room.r.p(edgeEffect4, -height, width);
                if (androidx.room.r.m(this.g0) == 0.0f) {
                    this.g0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    public final void T(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.F;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof d0) {
            d0 d0Var = (d0) layoutParams;
            if (!d0Var.c) {
                Rect rect2 = d0Var.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.J.l0(this, view, this.F, !this.Q, view2 == null);
    }

    public final void U() {
        VelocityTracker velocityTracker = this.m0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        b0(0);
        EdgeEffect edgeEffect = this.f0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.g0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.g0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.h0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.h0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.i0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.i0.isFinished();
        }
        if (zIsFinished) {
            Field field = androidx.core.view.s0.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fc A[DONT_INVERT, PHI: r7
  0x00fc: PHI (r7v10 boolean) = (r7v8 boolean), (r7v11 boolean) binds: [B:34:0x00e3, B:32:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:41:0x0106  */
    public final boolean V(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        k();
        v vVar = this.I;
        int[] iArr = this.M0;
        if (vVar != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            W(iArr, i, i2);
            i4 = iArr[0];
            i5 = iArr[1];
            i6 = i - i4;
            i7 = i2 - i5;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.L.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        q(i4, i5, i6, i7, this.K0, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z3 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.p0;
        int[] iArr2 = this.K0;
        int i13 = iArr2[0];
        this.p0 = i12 - i13;
        int i14 = this.q0;
        int i15 = iArr2[1];
        this.q0 = i14 - i15;
        int[] iArr3 = this.L0;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z = true;
            } else {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i11;
                if (f < 0.0f) {
                    t();
                    z = true;
                    androidx.room.r.p(this.f0, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    if (f > 0.0f) {
                        u();
                        androidx.room.r.p(this.h0, f / getWidth(), y / getHeight());
                    } else {
                        z2 = false;
                    }
                    if (f2 < 0.0f) {
                        v();
                        androidx.room.r.p(this.g0, (-f2) / getHeight(), x / getWidth());
                    } else if (f2 > 0.0f) {
                        s();
                        androidx.room.r.p(this.i0, f2 / getHeight(), 1.0f - (x / getWidth()));
                    } else if (z2 || f != 0.0f || f2 != 0.0f) {
                        Field field = androidx.core.view.s0.a;
                        postInvalidateOnAnimation();
                    }
                    z2 = z;
                    if (z2) {
                        Field field2 = androidx.core.view.s0.a;
                        postInvalidateOnAnimation();
                    } else {
                        Field field3 = androidx.core.view.s0.a;
                        postInvalidateOnAnimation();
                    }
                }
                z2 = z;
                if (f2 < 0.0f) {
                    v();
                    androidx.room.r.p(this.g0, (-f2) / getHeight(), x / getWidth());
                } else if (f2 > 0.0f) {
                    s();
                    androidx.room.r.p(this.i0, f2 / getHeight(), 1.0f - (x / getWidth()));
                } else if (z2) {
                    Field field4 = androidx.core.view.s0.a;
                    postInvalidateOnAnimation();
                } else {
                    Field field5 = androidx.core.view.s0.a;
                    postInvalidateOnAnimation();
                }
                z2 = z;
                if (z2) {
                    Field field6 = androidx.core.view.s0.a;
                    postInvalidateOnAnimation();
                } else {
                    Field field7 = androidx.core.view.s0.a;
                    postInvalidateOnAnimation();
                }
            }
            i(i, i2);
        } else {
            z = true;
        }
        if (i4 != 0 || i5 != 0) {
            r(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z3 && i4 == 0 && i5 == 0) {
            return false;
        }
        return z;
    }

    public final void W(int[] iArr, int i, int i2) {
        p0 p0Var;
        Z();
        M();
        int i3 = androidx.core.os.e.a;
        Trace.beginSection("RV Scroll");
        l0 l0Var = this.A0;
        x(l0Var);
        i0 i0Var = this.z;
        int iN0 = i != 0 ? this.J.n0(i, i0Var, l0Var) : 0;
        int iO0 = i2 != 0 ? this.J.o0(i2, i0Var, l0Var) : 0;
        Trace.endSection();
        c2 c2Var = this.C;
        int iY = c2Var.y();
        for (int i4 = 0; i4 < iY; i4++) {
            View viewX = c2Var.x(i4);
            p0 p0VarF = F(viewX);
            if (p0VarF != null && (p0Var = p0VarF.i) != null) {
                View view = p0Var.a;
                int left = viewX.getLeft();
                int top = viewX.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        N(true);
        a0(false);
        if (iArr != null) {
            iArr[0] = iN0;
            iArr[1] = iO0;
        }
    }

    public final boolean X(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fM = androidx.room.r.m(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.e * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = U0;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM;
    }

    public final void Y(int i, int i2, boolean z) {
        c0 c0Var = this.J;
        if (c0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.T) {
            return;
        }
        int i3 = !c0Var.c() ? 0 : i;
        int i4 = !this.J.d() ? 0 : i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        if (z) {
            int i5 = i3 != 0 ? 1 : 0;
            if (i4 != 0) {
                i5 |= 2;
            }
            getScrollingChildHelper().g(i5, 1);
        }
        o0 o0Var = this.x0;
        RecyclerView recyclerView = o0Var.D;
        int iAbs = Math.abs(i3);
        int iAbs2 = Math.abs(i4);
        boolean z2 = iAbs > iAbs2;
        int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
        if (!z2) {
            iAbs = iAbs2;
        }
        int iMin = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        androidx.customview.widget.c cVar = Y0;
        if (o0Var.A != cVar) {
            o0Var.A = cVar;
            o0Var.z = new OverScroller(recyclerView.getContext(), cVar);
        }
        o0Var.y = 0;
        o0Var.e = 0;
        recyclerView.setScrollState(2);
        o0Var.z.startScroll(0, 0, i3, i4, iMin);
        o0Var.b();
    }

    public final void Z() {
        int i = this.R + 1;
        this.R = i;
        if (i != 1 || this.T) {
            return;
        }
        this.S = false;
    }

    public final void a0(boolean z) {
        if (this.R < 1) {
            this.R = 1;
        }
        if (!z && !this.T) {
            this.S = false;
        }
        if (this.R == 1) {
            if (z && this.S && !this.T && this.J != null && this.I != null) {
                m();
            }
            if (!this.T) {
                this.S = false;
            }
        }
        this.R--;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        c0 c0Var = this.J;
        if (c0Var != null) {
            c0Var.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d0) && this.J.e((d0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        c0 c0Var = this.J;
        if (c0Var != null && c0Var.c()) {
            return this.J.i(this.A0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        c0 c0Var = this.J;
        if (c0Var != null && c0Var.c()) {
            return this.J.j(this.A0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        c0 c0Var = this.J;
        if (c0Var != null && c0Var.c()) {
            return this.J.k(this.A0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        c0 c0Var = this.J;
        if (c0Var != null && c0Var.d()) {
            return this.J.l(this.A0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        c0 c0Var = this.J;
        if (c0Var != null && c0Var.d()) {
            return this.J.m(this.A0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        c0 c0Var = this.J;
        if (c0Var != null && c0Var.d()) {
            return this.J.n(this.A0);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((a0) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.E ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f0;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.g0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.E) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.g0;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.h0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.E ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.h0;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.i0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.E) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.i0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.j0 == null || arrayList.size() <= 0 || !this.j0.f()) ? z : true) {
            Field field = androidx.core.view.s0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e(p0 p0Var) {
        View view = p0Var.a;
        boolean z = view.getParent() == this;
        this.z.m(F(view));
        boolean zJ = p0Var.j();
        c2 c2Var = this.C;
        if (zJ) {
            c2Var.p(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            c2Var.o(view, -1, true);
            return;
        }
        int iIndexOfChild = ((u) c2Var.y).a.indexOfChild(view);
        if (iIndexOfChild < 0) {
            com.google.gson.b.g(view, "view is not a child, cannot hide ");
        } else {
            ((y2) c2Var.z).L(iIndexOfChild);
            c2Var.M(view);
        }
    }

    public final void f(String str) {
        if (!J()) {
            if (this.d0 > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(w()));
            }
        } else if (str == null) {
            net.luminis.tls.engine.impl.c.r("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(w()));
        } else {
            net.luminis.tls.engine.impl.c.r(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0163  */
    /* JADX WARN: Code duplicated, block: B:137:0x019a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:138:0x019b  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        View viewS;
        int i2;
        byte b;
        boolean z;
        this.J.getClass();
        boolean z2 = true;
        boolean z3 = (this.I == null || this.J == null || J() || this.T) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        l0 l0Var = this.A0;
        i0 i0Var = this.z;
        if (z3 && (i == 2 || i == 1)) {
            if (this.J.d()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z && this.J.c()) {
                z = focusFinder.findNextFocus(this, view, (this.J.B() == 1) ^ (i == 2) ? 66 : 17) == null;
            }
            if (z) {
                k();
                if (y(view) != null) {
                    Z();
                    this.J.S(view, i, i0Var, l0Var);
                    a0(false);
                }
                return null;
            }
            viewS = focusFinder.findNextFocus(this, view, i);
            if (viewS == null) {
            }
            if (viewS != null) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z2) {
                return viewS;
            }
            return super.focusSearch(view, i);
        }
        View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
        if (viewFindNextFocus == null && z3) {
            k();
            if (y(view) != null) {
                Z();
                viewS = this.J.S(view, i, i0Var, l0Var);
                a0(false);
            }
            return null;
        }
        viewS = viewFindNextFocus;
        if (viewS == null && !viewS.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            T(viewS, null);
            return view;
        }
        if (viewS != null || viewS == this || viewS == view) {
            z2 = false;
        } else if (y(viewS) == null) {
            z2 = false;
        } else if (view != null && y(view) != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.F;
            rect.set(0, 0, width, height);
            int width2 = viewS.getWidth();
            int height2 = viewS.getHeight();
            Rect rect2 = this.G;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewS, rect2);
            int i3 = this.J.B() == 1 ? -1 : 1;
            int i4 = rect.left;
            int i5 = rect2.left;
            if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                i2 = 1;
            } else {
                int i6 = rect.right;
                int i7 = rect2.right;
                i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                b = 1;
            } else {
                int i10 = rect.bottom;
                int i11 = rect2.bottom;
                b = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (byte) -1 : (byte) 0;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 17) {
                        if (i != 33) {
                            if (i != 66) {
                                if (i != 130) {
                                    throw new IllegalArgumentException("Invalid direction: " + i + w());
                                }
                                if (b <= 0) {
                                    z2 = false;
                                }
                            } else if (i2 <= 0) {
                                z2 = false;
                            }
                        } else if (b >= 0) {
                            z2 = false;
                        }
                    } else if (i2 >= 0) {
                        z2 = false;
                    }
                } else if (b <= 0 && (b != 0 || i2 * i3 <= 0)) {
                    z2 = false;
                }
            } else if (b >= 0 && (b != 0 || i2 * i3 >= 0)) {
                z2 = false;
            }
        }
        if (z2) {
            return viewS;
        }
        return super.focusSearch(view, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c0 c0Var = this.J;
        if (c0Var != null) {
            return c0Var.q();
        }
        net.luminis.tls.engine.impl.c.r("RecyclerView has no LayoutManager".concat(w()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        c0 c0Var = this.J;
        if (c0Var != null) {
            return c0Var.r(getContext(), attributeSet);
        }
        net.luminis.tls.engine.impl.c.r("RecyclerView has no LayoutManager".concat(w()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public v getAdapter() {
        return this.I;
    }

    @Override // android.view.View
    public int getBaseline() {
        c0 c0Var = this.J;
        if (c0Var == null) {
            return super.getBaseline();
        }
        c0Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.E;
    }

    public r0 getCompatAccessibilityDelegate() {
        return this.H0;
    }

    public y getEdgeEffectFactory() {
        return this.e0;
    }

    public z getItemAnimator() {
        return this.j0;
    }

    public int getItemDecorationCount() {
        return this.L.size();
    }

    public c0 getLayoutManager() {
        return this.J;
    }

    public int getMaxFlingVelocity() {
        return this.t0;
    }

    public int getMinFlingVelocity() {
        return this.s0;
    }

    public long getNanoTime() {
        if (W0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public e0 getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.w0;
    }

    public h0 getRecycledViewPool() {
        return this.z.c();
    }

    public int getScrollState() {
        return this.k0;
    }

    public final void h() {
        int iJ = this.C.J();
        for (int i = 0; i < iJ; i++) {
            p0 p0VarG = G(this.C.I(i));
            if (!p0VarG.o()) {
                p0VarG.d = -1;
                p0VarG.g = -1;
            }
        }
        i0 i0Var = this.z;
        ArrayList arrayList = i0Var.a;
        ArrayList arrayList2 = i0Var.c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            p0 p0Var = (p0) arrayList2.get(i2);
            p0Var.d = -1;
            p0Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            p0 p0Var2 = (p0) arrayList.get(i3);
            p0Var2.d = -1;
            p0Var2.g = -1;
        }
        ArrayList arrayList3 = i0Var.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                p0 p0Var3 = (p0) i0Var.b.get(i4);
                p0Var3.d = -1;
                p0Var3.g = -1;
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f0;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f0.onRelease();
            zIsFinished = this.f0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.h0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.h0.onRelease();
            zIsFinished |= this.h0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.g0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.g0.onRelease();
            zIsFinished |= this.g0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.i0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.i0.onRelease();
            zIsFinished |= this.i0.isFinished();
        }
        if (zIsFinished) {
            Field field = androidx.core.view.s0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.O;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.T;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        if (!this.Q || this.a0) {
            int i = androidx.core.os.e.a;
            Trace.beginSection("RV FullInvalidate");
            m();
            Trace.endSection();
            return;
        }
        androidx.compose.runtime.internal.c cVar = this.B;
        if (cVar.z()) {
            cVar.getClass();
            if (cVar.z()) {
                int i2 = androidx.core.os.e.a;
                Trace.beginSection("RV FullInvalidate");
                m();
                Trace.endSection();
            }
        }
    }

    public final void l(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = androidx.core.view.s0.a;
        setMeasuredDimension(c0.f(i, paddingRight, getMinimumWidth()), c0.f(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0343  */
    /* JADX WARN: Code duplicated, block: B:185:0x0389  */
    /* JADX WARN: Code duplicated, block: B:187:0x038c  */
    /* JADX WARN: Code duplicated, block: B:193:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:195:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:197:0x03af  */
    /* JADX WARN: Code duplicated, block: B:200:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:203:0x03be  */
    /* JADX WARN: Code duplicated, block: B:206:0x03c8 A[LOOP:4: B:199:0x03b5->B:206:0x03c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:212:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:215:0x03e6 A[LOOP:5: B:208:0x03d3->B:215:0x03e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:217:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:247:0x03cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x03cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x03e9 A[EDGE_INSN: B:251:0x03e9->B:216:0x03e9 BREAK  A[LOOP:5: B:208:0x03d3->B:215:0x03e6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x03e4 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m() {
        boolean z;
        long j;
        p0 p0Var;
        int i;
        int iB;
        int i2;
        int iMin;
        p0 p0VarC;
        View view;
        p0 p0VarC2;
        View view2;
        int i3;
        View viewFindViewById;
        View view3;
        boolean z2;
        androidx.core.view.r rVar;
        ?? r3;
        boolean zG;
        boolean z3;
        if (this.I == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.J == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        l0 l0Var = this.A0;
        boolean z4 = false;
        l0Var.i = false;
        boolean z5 = true;
        boolean z6 = this.P0 && !(this.Q0 == getWidth() && this.R0 == getHeight());
        this.Q0 = 0;
        this.R0 = 0;
        this.P0 = false;
        if (l0Var.d == 1) {
            n();
            this.J.p0(this);
            o();
        } else {
            androidx.compose.runtime.internal.c cVar = this.B;
            if ((((ArrayList) cVar.z).isEmpty() || ((ArrayList) cVar.y).isEmpty()) && !z6 && this.J.m == getWidth() && this.J.n == getHeight()) {
                this.J.p0(this);
            } else {
                this.J.p0(this);
                o();
            }
        }
        l0Var.a(4);
        Z();
        M();
        l0Var.d = 1;
        boolean z7 = l0Var.j;
        i0 i0Var = this.z;
        androidx.media3.common.util.b bVar = this.D;
        if (z7) {
            int iY = this.C.y() - 1;
            while (iY >= 0) {
                p0 p0VarG = G(this.C.x(iY));
                if (p0VarG.o()) {
                    z3 = z5;
                } else {
                    long jE = E(p0VarG);
                    this.j0.getClass();
                    androidx.core.view.r rVar2 = new androidx.core.view.r();
                    rVar2.b(p0VarG);
                    androidx.collection.s sVar = (androidx.collection.s) bVar.z;
                    y0 y0Var = (y0) bVar.y;
                    p0 p0Var2 = (p0) sVar.b(jE);
                    if (p0Var2 == null || p0Var2.o()) {
                        z3 = z5;
                        bVar.l(p0VarG, rVar2);
                    } else {
                        z3 = z5;
                        x0 x0Var = (x0) y0Var.get(p0Var2);
                        boolean z8 = (x0Var == null || (x0Var.a & 1) == 0) ? false : z3;
                        x0 x0Var2 = (x0) y0Var.get(p0VarG);
                        boolean z9 = (x0Var2 == null || (x0Var2.a & 1) == 0) ? false : z3;
                        if (z8 && p0Var2 == p0VarG) {
                            bVar.l(p0VarG, rVar2);
                        } else {
                            androidx.core.view.r rVarE = bVar.E(p0Var2, 4);
                            bVar.l(p0VarG, rVar2);
                            androidx.core.view.r rVarE2 = bVar.E(p0VarG, 8);
                            if (rVarE == null) {
                                int iY2 = this.C.y();
                                for (int i4 = 0; i4 < iY2; i4++) {
                                    p0 p0VarG2 = G(this.C.x(i4));
                                    if (p0VarG2 != p0VarG && E(p0VarG2) == jE) {
                                        v vVar = this.I;
                                        if (vVar == null || !vVar.b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(p0VarG2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(p0VarG);
                                            androidx.media3.exoplayer.hls.playlist.a.k(sb, w());
                                            return;
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(p0VarG2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(p0VarG);
                                        androidx.media3.exoplayer.hls.playlist.a.k(sb2, w());
                                        return;
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + p0Var2 + " cannot be found but it is necessary for " + p0VarG + w());
                            } else {
                                p0Var2.n(false);
                                if (z8) {
                                    e(p0Var2);
                                }
                                if (p0Var2 != p0VarG) {
                                    if (z9) {
                                        e(p0VarG);
                                    }
                                    p0Var2.h = p0VarG;
                                    e(p0Var2);
                                    i0Var.m(p0Var2);
                                    p0VarG.n(false);
                                    p0VarG.i = p0Var2;
                                }
                                if (this.j0.a(p0Var2, p0VarG, rVarE, rVarE2)) {
                                    P();
                                }
                            }
                        }
                    }
                }
                iY--;
                z5 = z3;
            }
            z = z5;
            y0 y0Var2 = (y0) bVar.y;
            int i5 = y0Var2.z - 1;
            while (i5 >= 0) {
                p0 p0Var3 = (p0) y0Var2.f(i5);
                x0 x0Var3 = (x0) y0Var2.g(i5);
                int i6 = x0Var3.a;
                int i7 = i6 & 3;
                t tVar = this.S0;
                if (i7 == 3) {
                    RecyclerView recyclerView = tVar.a;
                    recyclerView.J.j0(p0Var3.a, recyclerView.z);
                    r3 = z4;
                } else if ((i6 & 1) != 0) {
                    androidx.core.view.r rVar3 = x0Var3.b;
                    if (rVar3 == null) {
                        RecyclerView recyclerView2 = tVar.a;
                        recyclerView2.J.j0(p0Var3.a, recyclerView2.z);
                        r3 = z4;
                    } else {
                        tVar.g(p0Var3, rVar3, x0Var3.c);
                        r3 = z4;
                    }
                } else if ((i6 & 14) == 14) {
                    tVar.f(p0Var3, x0Var3.b, x0Var3.c);
                    r3 = z4;
                } else {
                    if ((i6 & 12) == 12) {
                        androidx.core.view.r rVar4 = x0Var3.b;
                        androidx.core.view.r rVar5 = x0Var3.c;
                        tVar.getClass();
                        p0Var3.n(z4);
                        RecyclerView recyclerView3 = tVar.a;
                        boolean z10 = recyclerView3.a0;
                        z zVar = recyclerView3.j0;
                        if (!z10) {
                            h hVar = (h) zVar;
                            hVar.getClass();
                            int i8 = rVar4.a;
                            int i9 = rVar5.a;
                            if (i8 == i9 && rVar4.b == rVar5.b) {
                                hVar.c(p0Var3);
                                zG = false;
                            } else {
                                zG = hVar.g(p0Var3, i8, rVar4.b, i9, rVar5.b);
                            }
                            if (zG) {
                                recyclerView3.P();
                            }
                        } else if (zVar.a(p0Var3, p0Var3, rVar4, rVar5)) {
                            recyclerView3.P();
                        }
                        r3 = 0;
                    } else {
                        if ((i6 & 4) != 0) {
                            rVar = null;
                            tVar.g(p0Var3, x0Var3.b, null);
                        } else {
                            rVar = null;
                            if ((i6 & 8) != 0) {
                                tVar.f(p0Var3, x0Var3.b, x0Var3.c);
                            }
                        }
                        r3 = 0;
                    }
                    x0Var3.a = r3;
                    x0Var3.b = rVar;
                    x0Var3.c = rVar;
                    x0.d.c(x0Var3);
                    i5--;
                    z4 = false;
                }
                rVar = null;
                x0Var3.a = r3;
                x0Var3.b = rVar;
                x0Var3.c = rVar;
                x0.d.c(x0Var3);
                i5--;
                z4 = false;
            }
        } else {
            z = true;
        }
        View view4 = null;
        this.J.i0(i0Var);
        l0Var.b = l0Var.e;
        this.a0 = false;
        this.b0 = false;
        l0Var.j = false;
        l0Var.k = false;
        this.J.e = false;
        ArrayList arrayList = i0Var.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        c0 c0Var = this.J;
        if (c0Var.j) {
            c0Var.i = 0;
            c0Var.j = false;
            i0Var.n();
        }
        this.J.d0(l0Var);
        boolean z11 = z;
        N(z11);
        a0(false);
        ((y0) bVar.y).clear();
        ((androidx.collection.s) bVar.z).a();
        int[] iArr = this.I0;
        int i10 = iArr[0];
        int i11 = iArr[z11 ? 1 : 0];
        A(iArr);
        if ((iArr[0] == i10 && iArr[z11 ? 1 : 0] == i11) ? false : true) {
            r(0, 0);
        }
        if (this.w0 && this.I != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = l0Var.m;
                if (j == -1) {
                    p0Var = null;
                } else {
                    p0Var = null;
                }
                if (p0Var != null) {
                    view3 = p0Var.a;
                    if (!((ArrayList) this.C.A).contains(view3)) {
                        if (this.C.y() > 0) {
                            int i12 = l0Var.l;
                            if (i12 != -1) {
                            }
                            iB = l0Var.b();
                            i2 = i;
                            while (true) {
                                if (i2 < iB) {
                                    p0VarC2 = C(i2);
                                    if (p0VarC2 != null) {
                                        view2 = p0VarC2.a;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iB, i) - 1; iMin >= 0; iMin--) {
                                    p0VarC = C(iMin);
                                    if (p0VarC == null) {
                                        break;
                                        break;
                                    }
                                    view = p0VarC.a;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.C.y() > 0) {
                        int i13 = l0Var.l;
                        if (i13 != -1) {
                        }
                        iB = l0Var.b();
                        i2 = i;
                        while (true) {
                            if (i2 < iB) {
                                p0VarC2 = C(i2);
                                if (p0VarC2 != null) {
                                    view2 = p0VarC2.a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                p0VarC = C(iMin);
                                if (p0VarC == null) {
                                    break;
                                    break;
                                }
                                view = p0VarC.a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.C.y() > 0) {
                    int i14 = l0Var.l;
                    if (i14 != -1) {
                    }
                    iB = l0Var.b();
                    i2 = i;
                    while (true) {
                        if (i2 < iB) {
                            p0VarC2 = C(i2);
                            if (p0VarC2 != null) {
                                view2 = p0VarC2.a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            p0VarC = C(iMin);
                            if (p0VarC == null) {
                                break;
                                break;
                            }
                            view = p0VarC.a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = l0Var.n;
                    if (i3 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (((ArrayList) this.C.A).contains(getFocusedChild())) {
                j = l0Var.m;
                if (j == -1 && (z2 = this.I.b) && z2) {
                    int iJ = this.C.J();
                    p0Var = null;
                    for (int i15 = 0; i15 < iJ; i15++) {
                        p0 p0VarG3 = G(this.C.I(i15));
                        if (p0VarG3 != null && !p0VarG3.h() && p0VarG3.e == j) {
                            if (!((ArrayList) this.C.A).contains(p0VarG3.a)) {
                                p0Var = p0VarG3;
                                break;
                            }
                            p0Var = p0VarG3;
                        }
                    }
                } else {
                    p0Var = null;
                }
                if (p0Var != null) {
                    view3 = p0Var.a;
                    if (!((ArrayList) this.C.A).contains(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (this.C.y() > 0) {
                        int i16 = l0Var.l;
                        i = i16 != -1 ? i16 : 0;
                        iB = l0Var.b();
                        i2 = i;
                        while (true) {
                            if (i2 < iB) {
                                p0VarC2 = C(i2);
                                if (p0VarC2 != null) {
                                    view2 = p0VarC2.a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                p0VarC = C(iMin);
                                if (p0VarC == null) {
                                    break;
                                }
                                view = p0VarC.a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.C.y() > 0) {
                    int i17 = l0Var.l;
                    if (i17 != -1) {
                    }
                    iB = l0Var.b();
                    i2 = i;
                    while (true) {
                        if (i2 < iB) {
                            p0VarC2 = C(i2);
                            if (p0VarC2 != null) {
                                view2 = p0VarC2.a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            p0VarC = C(iMin);
                            if (p0VarC == null) {
                                break;
                                break;
                            }
                            view = p0VarC.a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = l0Var.n;
                    if (i3 != -1 && (viewFindViewById = view4.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        l0Var.m = -1L;
        l0Var.l = -1;
        l0Var.n = -1;
    }

    /* JADX WARN: Code duplicated, block: B:258:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:351:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Code duplicated, block: B:52:0x0116  */
    /* JADX WARN: Code duplicated, block: B:54:0x011e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0123  */
    public final void n() {
        androidx.collection.s sVar;
        y0 y0Var;
        int iD;
        x0 x0Var;
        androidx.collection.s sVar2;
        y0 y0Var2;
        View viewY;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        byte b;
        boolean z4;
        boolean z5;
        a aVarB;
        int i2;
        int i3;
        int i4;
        a aVar;
        l0 l0Var = this.A0;
        l0Var.a(1);
        x(l0Var);
        l0Var.i = false;
        Z();
        androidx.media3.common.util.b bVar = this.D;
        y0 y0Var3 = (y0) bVar.y;
        y0 y0Var4 = (y0) bVar.y;
        y0Var3.clear();
        androidx.collection.s sVar3 = (androidx.collection.s) bVar.z;
        sVar3.a();
        M();
        if (this.a0) {
            androidx.compose.runtime.internal.c cVar = this.B;
            cVar.D((ArrayList) cVar.y);
            cVar.D((ArrayList) cVar.z);
            if (this.b0) {
                this.J.Y();
            }
        }
        boolean z6 = this.j0 != null && this.J.x0();
        androidx.compose.runtime.internal.c cVar2 = this.B;
        if (z6) {
            androidx.constraintlayout.core.d dVar = (androidx.constraintlayout.core.d) cVar2.e;
            t tVar = (t) cVar2.A;
            androidx.media3.exoplayer.dash.manifest.t tVar2 = (androidx.media3.exoplayer.dash.manifest.t) cVar2.B;
            ArrayList arrayList = (ArrayList) cVar2.y;
            tVar2.getClass();
            while (true) {
                int size = arrayList.size() - 1;
                boolean z7 = false;
                while (true) {
                    i = 8;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    if (((a) arrayList.get(size)).a == 8) {
                        if (z7) {
                            break;
                        }
                    } else {
                        z7 = true;
                    }
                    size--;
                }
                if (size == -1) {
                    break;
                }
                int i5 = size + 1;
                androidx.compose.runtime.internal.c cVar3 = (androidx.compose.runtime.internal.c) tVar2.y;
                androidx.constraintlayout.core.d dVar2 = (androidx.constraintlayout.core.d) cVar3.e;
                a aVar2 = (a) arrayList.get(size);
                a aVar3 = (a) arrayList.get(i5);
                androidx.media3.exoplayer.dash.manifest.t tVar3 = tVar2;
                int i6 = aVar3.a;
                if (i6 != 1) {
                    a aVarB2 = null;
                    if (i6 == 2) {
                        sVar3 = sVar3;
                        y0Var4 = y0Var4;
                        int i7 = aVar2.b;
                        int i8 = aVar2.c;
                        int i9 = aVar3.b;
                        if (i7 < i8) {
                            if (i9 == i7 && aVar3.c == i8 - i7) {
                                z4 = false;
                                z5 = true;
                            } else {
                                z4 = false;
                                z5 = false;
                            }
                        } else if (i9 == i8 + 1 && aVar3.c == i7 - i8) {
                            z4 = true;
                            z5 = true;
                        } else {
                            z4 = true;
                            z5 = false;
                        }
                        if (i8 < i9) {
                            aVar3.b = i9 - 1;
                        } else {
                            int i10 = aVar3.c;
                            if (i8 < i9 + i10) {
                                aVar3.c = i10 - 1;
                                aVar2.a = 2;
                                aVar2.c = 1;
                                if (aVar3.c == 0) {
                                    arrayList.remove(i5);
                                    dVar2.c(aVar3);
                                }
                            }
                        }
                        int i11 = aVar2.b;
                        int i12 = aVar3.b;
                        if (i11 <= i12) {
                            aVar3.b = i12 + 1;
                        } else {
                            int i13 = i12 + aVar3.c;
                            if (i11 < i13) {
                                aVarB2 = cVar3.B(2, i11 + 1, i13 - i11);
                                aVar3.c = aVar2.b - aVar3.b;
                            }
                        }
                        a aVar4 = aVarB2;
                        if (z5) {
                            arrayList.set(size, aVar3);
                            arrayList.remove(i5);
                            dVar2.c(aVar2);
                        } else {
                            if (z4) {
                                if (aVar4 != null) {
                                    int i14 = aVar2.b;
                                    if (i14 > aVar4.b) {
                                        aVar2.b = i14 - aVar4.c;
                                    }
                                    int i15 = aVar2.c;
                                    if (i15 > aVar4.b) {
                                        aVar2.c = i15 - aVar4.c;
                                    }
                                }
                                int i16 = aVar2.b;
                                if (i16 > aVar3.b) {
                                    aVar2.b = i16 - aVar3.c;
                                }
                                int i17 = aVar2.c;
                                if (i17 > aVar3.b) {
                                    aVar2.c = i17 - aVar3.c;
                                }
                            } else {
                                if (aVar4 != null) {
                                    int i18 = aVar2.b;
                                    if (i18 >= aVar4.b) {
                                        aVar2.b = i18 - aVar4.c;
                                    }
                                    int i19 = aVar2.c;
                                    if (i19 >= aVar4.b) {
                                        aVar2.c = i19 - aVar4.c;
                                    }
                                }
                                int i20 = aVar2.b;
                                if (i20 >= aVar3.b) {
                                    aVar2.b = i20 - aVar3.c;
                                }
                                int i21 = aVar2.c;
                                if (i21 >= aVar3.b) {
                                    aVar2.c = i21 - aVar3.c;
                                }
                            }
                            arrayList.set(size, aVar3);
                            if (aVar2.b != aVar2.c) {
                                arrayList.set(i5, aVar2);
                            } else {
                                arrayList.remove(i5);
                            }
                            if (aVar4 != null) {
                                arrayList.add(size, aVar4);
                            }
                        }
                    } else if (i6 != 4) {
                        sVar3 = sVar3;
                        y0Var4 = y0Var4;
                    } else {
                        int i22 = aVar2.c;
                        int i23 = aVar3.b;
                        if (i22 < i23) {
                            aVar3.b = i23 - 1;
                        } else {
                            int i24 = aVar3.c;
                            if (i22 < i23 + i24) {
                                aVar3.c = i24 - 1;
                                aVarB = cVar3.B(4, aVar2.b, 1);
                            }
                            i2 = aVar2.b;
                            i3 = aVar3.b;
                            if (i2 <= i3) {
                                aVar3.b = i3 + 1;
                            } else {
                                i4 = i3 + aVar3.c;
                                if (i2 < i4) {
                                    int i25 = i4 - i2;
                                    aVarB2 = cVar3.B(4, i2 + 1, i25);
                                    aVar3.c -= i25;
                                }
                                aVar = aVarB2;
                                arrayList.set(i5, aVar2);
                                if (aVar3.c > 0) {
                                    arrayList.set(size, aVar3);
                                } else {
                                    arrayList.remove(size);
                                    dVar2.c(aVar3);
                                }
                                if (aVarB != null) {
                                    arrayList.add(size, aVarB);
                                }
                                if (aVar != null) {
                                    arrayList.add(size, aVar);
                                }
                            }
                            aVar = aVarB2;
                            arrayList.set(i5, aVar2);
                            if (aVar3.c > 0) {
                                arrayList.set(size, aVar3);
                            } else {
                                arrayList.remove(size);
                                dVar2.c(aVar3);
                            }
                            if (aVarB != null) {
                                arrayList.add(size, aVarB);
                            }
                            if (aVar != null) {
                                arrayList.add(size, aVar);
                            }
                        }
                        aVarB = null;
                        i2 = aVar2.b;
                        i3 = aVar3.b;
                        if (i2 <= i3) {
                            aVar3.b = i3 + 1;
                        } else {
                            i4 = i3 + aVar3.c;
                            if (i2 < i4) {
                                int i26 = i4 - i2;
                                aVarB2 = cVar3.B(4, i2 + 1, i26);
                                aVar3.c -= i26;
                            }
                            aVar = aVarB2;
                            arrayList.set(i5, aVar2);
                            if (aVar3.c > 0) {
                                arrayList.set(size, aVar3);
                            } else {
                                arrayList.remove(size);
                                dVar2.c(aVar3);
                            }
                            if (aVarB != null) {
                                arrayList.add(size, aVarB);
                            }
                            if (aVar != null) {
                                arrayList.add(size, aVar);
                            }
                        }
                        aVar = aVarB2;
                        arrayList.set(i5, aVar2);
                        if (aVar3.c > 0) {
                            arrayList.set(size, aVar3);
                        } else {
                            arrayList.remove(size);
                            dVar2.c(aVar3);
                        }
                        if (aVarB != null) {
                            arrayList.add(size, aVarB);
                        }
                        if (aVar != null) {
                            arrayList.add(size, aVar);
                        }
                    }
                } else {
                    sVar3 = sVar3;
                    y0Var4 = y0Var4;
                    int i27 = aVar2.c;
                    int i28 = aVar3.b;
                    int i29 = i27 < i28 ? -1 : 0;
                    int i30 = aVar2.b;
                    if (i30 < i28) {
                        i29++;
                    }
                    if (i28 <= i30) {
                        aVar2.b = i30 + aVar3.c;
                    }
                    int i31 = aVar3.b;
                    if (i31 <= i27) {
                        aVar2.c = i27 + aVar3.c;
                    }
                    aVar3.b = i31 + i29;
                    arrayList.set(size, aVar3);
                    arrayList.set(i5, aVar2);
                }
                tVar2 = tVar3;
                sVar3 = sVar3;
                y0Var4 = y0Var4;
            }
            sVar = sVar3;
            y0Var = y0Var4;
            int size2 = arrayList.size();
            int i32 = 0;
            while (i32 < size2) {
                a aVarB3 = (a) arrayList.get(i32);
                int i33 = aVarB3.a;
                if (i33 == 1) {
                    cVar2.C(aVarB3);
                } else if (i33 == 2) {
                    int i34 = aVarB3.b;
                    int i35 = aVarB3.c + i34;
                    int i36 = i34;
                    int i37 = 0;
                    byte b2 = -1;
                    while (i36 < i35) {
                        if (tVar.b(i36) != null || cVar2.o(i36)) {
                            if (b2 == 0) {
                                cVar2.r(cVar2.B(2, i34, i37));
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            z3 = z2;
                            b = 1;
                        } else {
                            if (b2 == 1) {
                                cVar2.C(cVar2.B(2, i34, i37));
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            b = 0;
                        }
                        if (z3) {
                            i36 -= i37;
                            i35 -= i37;
                            i37 = 1;
                        } else {
                            i37++;
                        }
                        i36++;
                        b2 = b;
                    }
                    if (i37 != aVarB3.c) {
                        dVar.c(aVarB3);
                        aVarB3 = cVar2.B(2, i34, i37);
                    }
                    if (b2 == 0) {
                        cVar2.r(aVarB3);
                    } else {
                        cVar2.C(aVarB3);
                    }
                } else if (i33 == 4) {
                    int i38 = aVarB3.b;
                    int i39 = aVarB3.c + i38;
                    int i40 = i38;
                    int i41 = 0;
                    byte b3 = -1;
                    while (i38 < i39) {
                        if (tVar.b(i38) != null || cVar2.o(i38)) {
                            if (b3 == 0) {
                                cVar2.r(cVar2.B(4, i40, i41));
                                i40 = i38;
                                i41 = 0;
                            }
                            b3 = 1;
                        } else {
                            if (b3 == 1) {
                                cVar2.C(cVar2.B(4, i40, i41));
                                i40 = i38;
                                i41 = 0;
                            }
                            b3 = 0;
                        }
                        i41++;
                        i38++;
                    }
                    if (i41 != aVarB3.c) {
                        dVar.c(aVarB3);
                        aVarB3 = cVar2.B(4, i40, i41);
                    }
                    if (b3 == 0) {
                        cVar2.r(aVarB3);
                    } else {
                        cVar2.C(aVarB3);
                    }
                } else if (i33 == i) {
                    cVar2.C(aVarB3);
                }
                i32++;
                i = 8;
            }
            arrayList.clear();
        } else {
            sVar = sVar3;
            y0Var = y0Var4;
            cVar2.p();
        }
        boolean z8 = this.D0 || this.E0;
        boolean z9 = this.Q && this.j0 != null && ((z = this.a0) || z8 || this.J.e) && (!z || this.I.b);
        l0 l0Var2 = this.A0;
        l0Var2.j = z9;
        l0Var2.k = z9 && z8 && !this.a0 && this.j0 != null && this.J.x0();
        p0 p0VarF = null;
        View focusedChild = (this.w0 && hasFocus() && this.I != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewY = y(focusedChild)) != null) {
            p0VarF = F(viewY);
        }
        if (p0VarF == null) {
            l0Var.m = -1L;
            l0Var.l = -1;
            l0Var.n = -1;
        } else {
            l0Var.m = this.I.b ? p0VarF.e : -1L;
            if (this.a0) {
                iD = -1;
            } else if (p0VarF.h()) {
                iD = p0VarF.d;
            } else {
                RecyclerView recyclerView = p0VarF.r;
                if (recyclerView == null) {
                    iD = -1;
                } else {
                    iD = recyclerView.D(p0VarF);
                }
            }
            l0Var.l = iD;
            View focusedChild2 = p0VarF.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            l0Var.n = id;
        }
        l0Var.h = l0Var.j && this.E0;
        this.E0 = false;
        this.D0 = false;
        l0Var.g = l0Var.k;
        l0Var.e = this.I.a();
        A(this.I0);
        if (l0Var.j) {
            int iY = this.C.y();
            int i42 = 0;
            while (i42 < iY) {
                p0 p0VarG = G(this.C.x(i42));
                if (p0VarG.o() || (p0VarG.f() && !this.I.b)) {
                    sVar2 = sVar;
                    y0Var2 = y0Var;
                } else {
                    z zVar = this.j0;
                    z.b(p0VarG);
                    p0VarG.c();
                    zVar.getClass();
                    androidx.core.view.r rVar = new androidx.core.view.r();
                    rVar.b(p0VarG);
                    y0Var2 = y0Var;
                    x0 x0VarA = (x0) y0Var2.get(p0VarG);
                    if (x0VarA == null) {
                        x0VarA = x0.a();
                        y0Var2.put(p0VarG, x0VarA);
                    }
                    x0VarA.b = rVar;
                    x0VarA.a |= 4;
                    if (!l0Var.h || !p0VarG.k() || p0VarG.h() || p0VarG.o() || p0VarG.f()) {
                        sVar2 = sVar;
                    } else {
                        sVar2 = sVar;
                        sVar2.e(E(p0VarG), p0VarG);
                    }
                }
                i42++;
                sVar = sVar2;
                y0Var = y0Var2;
            }
        }
        y0 y0Var5 = y0Var;
        if (l0Var.k) {
            int iJ = this.C.J();
            for (int i43 = 0; i43 < iJ; i43++) {
                p0 p0VarG2 = G(this.C.I(i43));
                if (!p0VarG2.o() && p0VarG2.d == -1) {
                    p0VarG2.d = p0VarG2.c;
                }
            }
            boolean z10 = l0Var.f;
            l0Var.f = false;
            this.J.c0(this.z, l0Var);
            l0Var.f = z10;
            for (int i44 = 0; i44 < this.C.y(); i44++) {
                p0 p0VarG3 = G(this.C.x(i44));
                if (!p0VarG3.o() && ((x0Var = (x0) y0Var5.get(p0VarG3)) == null || (x0Var.a & 4) == 0)) {
                    z.b(p0VarG3);
                    boolean z11 = (p0VarG3.j & 8192) != 0;
                    z zVar2 = this.j0;
                    p0VarG3.c();
                    zVar2.getClass();
                    androidx.core.view.r rVar2 = new androidx.core.view.r();
                    rVar2.b(p0VarG3);
                    if (z11) {
                        Q(p0VarG3, rVar2);
                    } else {
                        x0 x0VarA2 = (x0) y0Var5.get(p0VarG3);
                        if (x0VarA2 == null) {
                            x0VarA2 = x0.a();
                            y0Var5.put(p0VarG3, x0VarA2);
                        }
                        x0VarA2.a |= 2;
                        x0VarA2.b = rVar2;
                    }
                }
            }
            h();
        } else {
            h();
        }
        N(true);
        a0(false);
        l0Var.d = 2;
    }

    public final void o() {
        Z();
        M();
        l0 l0Var = this.A0;
        l0Var.a(6);
        this.B.p();
        l0Var.e = this.I.a();
        l0Var.c = 0;
        if (this.A != null) {
            v vVar = this.I;
            int iE = androidx.constraintlayout.core.g.e(vVar.c);
            if (iE == 1 ? vVar.a() > 0 : iE != 2) {
                Parcelable parcelable = this.A.z;
                if (parcelable != null) {
                    this.J.e0(parcelable);
                }
                this.A = null;
            }
        }
        l0Var.g = false;
        this.J.c0(this.z, l0Var);
        l0Var.f = false;
        l0Var.j = l0Var.j && this.j0 != null;
        l0Var.d = 4;
        N(true);
        a0(false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.c0 = 0;
        this.O = true;
        this.Q = this.Q && !isLayoutRequested();
        this.z.e();
        c0 c0Var = this.J;
        if (c0Var != null) {
            c0Var.f = true;
            c0Var.Q(this);
        }
        this.G0 = false;
        if (W0) {
            ThreadLocal threadLocal = n.B;
            n nVar = (n) threadLocal.get();
            this.y0 = nVar;
            if (nVar == null) {
                n nVar2 = new n();
                nVar2.e = new ArrayList();
                nVar2.A = new ArrayList();
                this.y0 = nVar2;
                Field field = androidx.core.view.s0.a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                n nVar3 = this.y0;
                nVar3.z = (long) (1.0E9f / refreshRate);
                threadLocal.set(nVar3);
            }
            this.y0.e.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        n nVar;
        super.onDetachedFromWindow();
        z zVar = this.j0;
        if (zVar != null) {
            zVar.e();
        }
        int i = 0;
        setScrollState(0);
        o0 o0Var = this.x0;
        o0Var.D.removeCallbacks(o0Var);
        o0Var.z.abortAnimation();
        this.O = false;
        c0 c0Var = this.J;
        if (c0Var != null) {
            c0Var.f = false;
            c0Var.R(this);
        }
        this.N0.clear();
        removeCallbacks(this.O0);
        this.D.getClass();
        while (x0.d.a() != null) {
        }
        i0 i0Var = this.z;
        ArrayList arrayList = i0Var.c;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            h1.f(((p0) arrayList.get(i2)).a);
        }
        i0Var.f(i0Var.h.I, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = h1.p(childAt).a;
            for (int iK = com.google.common.base.c.k(arrayList2); -1 < iK; iK--) {
                ((m2) arrayList2.get(iK)).a.c();
            }
            i = i3;
        }
        if (!W0 || (nVar = this.y0) == null) {
            return;
        }
        nVar.e.remove(this);
        this.y0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((a0) arrayList.get(i)).getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.J != null && !this.T && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.J.d() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.J.c() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.J.d()) {
                    f = -axisValue2;
                } else if (this.J.c()) {
                    axisValue = axisValue2;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f = 0.0f;
                axisValue = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                int i = (int) (axisValue * this.u0);
                int i2 = (int) (f * this.v0);
                c0 c0Var = this.J;
                if (c0Var == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    return false;
                }
                if (!this.T) {
                    int[] iArr = this.M0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zC = c0Var.c();
                    boolean zD = this.J.d();
                    int i3 = zD ? (zC ? 1 : 0) | 2 : zC ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iR = i - R(i, y);
                    int iS = i2 - S(i2, x);
                    getScrollingChildHelper().g(i3, 1);
                    if (p(zC ? iR : 0, zD ? iS : 0, 1, this.M0, this.K0)) {
                        iR -= iArr[0];
                        iS -= iArr[1];
                    }
                    V(zC ? iR : 0, zD ? iS : 0, motionEvent, 1);
                    n nVar = this.y0;
                    if (nVar != null && (iR != 0 || iS != 0)) {
                        nVar.a(this, iR, iS);
                    }
                    b0(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.T) {
            this.N = null;
            if (z(motionEvent)) {
                U();
                setScrollState(0);
                return true;
            }
            c0 c0Var = this.J;
            if (c0Var != null) {
                boolean zC = c0Var.c();
                boolean zD = this.J.d();
                if (this.m0 == null) {
                    this.m0 = VelocityTracker.obtain();
                }
                this.m0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.U) {
                        this.U = false;
                    }
                    this.l0 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.p0 = x;
                    this.n0 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.q0 = y;
                    this.o0 = y;
                    EdgeEffect edgeEffect = this.f0;
                    if (edgeEffect == null || androidx.room.r.m(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        androidx.room.r.p(this.f0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.h0;
                    boolean z3 = z;
                    if (edgeEffect2 != null && androidx.room.r.m(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        z3 = z;
                        z3 = z;
                        androidx.room.r.p(this.h0, 0.0f, motionEvent.getY() / getHeight());
                        z3 = true;
                    }
                    z3 = z;
                    z3 = z;
                    z3 = z;
                    EdgeEffect edgeEffect3 = this.g0;
                    boolean z4 = z3;
                    if (edgeEffect3 != null && androidx.room.r.m(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        z4 = z3;
                        z4 = z3;
                        androidx.room.r.p(this.g0, 0.0f, motionEvent.getX() / getWidth());
                        z4 = true;
                    }
                    z4 = z3;
                    z4 = z3;
                    z4 = z3;
                    EdgeEffect edgeEffect4 = this.i0;
                    boolean z5 = z4;
                    if (edgeEffect4 != null && androidx.room.r.m(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        z5 = z4;
                        z5 = z4;
                        androidx.room.r.p(this.i0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z5 = true;
                    }
                    if (z5 || this.k0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        b0(1);
                    }
                    int[] iArr = this.L0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = zC;
                    if (zD) {
                        i = (zC ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i, 0);
                } else if (actionMasked == 1) {
                    this.m0.clear();
                    b0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.l0);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.l0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.k0 != 1) {
                        int i2 = x2 - this.n0;
                        int i3 = y2 - this.o0;
                        if (!zC || Math.abs(i2) <= this.r0) {
                            z2 = false;
                        } else {
                            this.p0 = x2;
                            z2 = true;
                        }
                        if (zD && Math.abs(i3) > this.r0) {
                            this.q0 = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    U();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.l0 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.p0 = x3;
                    this.n0 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.q0 = y3;
                    this.o0 = y3;
                } else if (actionMasked == 6) {
                    O(motionEvent);
                }
                if (this.k0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = androidx.core.os.e.a;
        Trace.beginSection("RV OnLayout");
        m();
        Trace.endSection();
        this.Q = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        c0 c0Var = this.J;
        if (c0Var == null) {
            l(i, i2);
            return;
        }
        boolean zK = c0Var.K();
        boolean z = false;
        l0 l0Var = this.A0;
        if (!zK) {
            if (this.P) {
                this.J.b.l(i, i2);
                return;
            }
            if (l0Var.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            v vVar = this.I;
            if (vVar != null) {
                l0Var.e = vVar.a();
            } else {
                l0Var.e = 0;
            }
            Z();
            this.J.b.l(i, i2);
            a0(false);
            l0Var.g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.J.b.l(i, i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z = true;
        }
        this.P0 = z;
        if (z || this.I == null) {
            return;
        }
        if (l0Var.d == 1) {
            n();
        }
        this.J.q0(i, i2);
        l0Var.i = true;
        o();
        this.J.s0(i, i2);
        if (this.J.v0()) {
            this.J.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            l0Var.i = true;
            o();
            this.J.s0(i, i2);
        }
        this.Q0 = getMeasuredWidth();
        this.R0 = getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (J()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k0 k0Var = (k0) parcelable;
        this.A = k0Var;
        super.onRestoreInstanceState(k0Var.e);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k0 k0Var = new k0(super.onSaveInstanceState());
        k0 k0Var2 = this.A;
        if (k0Var2 != null) {
            k0Var.z = k0Var2.z;
            return k0Var;
        }
        c0 c0Var = this.J;
        if (c0Var != null) {
            k0Var.z = c0Var.f0();
            return k0Var;
        }
        k0Var.z = null;
        return k0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.i0 = null;
        this.g0 = null;
        this.h0 = null;
        this.f0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:180:0x033f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0381  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f5 A[PHI: r1
  0x01f5: PHI (r1v59 int) = (r1v43 int), (r1v63 int) binds: [B:90:0x01e0, B:95:0x01f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int iMax;
        int i2;
        boolean z2;
        if (!this.T && !this.U) {
            l lVar = this.N;
            if (lVar == null) {
                z = motionEvent.getAction() == 0 ? false : z(motionEvent);
            } else {
                int i3 = lVar.b;
                if (lVar.v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean zD = lVar.d(motionEvent.getX(), motionEvent.getY());
                        boolean zC = lVar.c(motionEvent.getX(), motionEvent.getY());
                        if (zD || zC) {
                            if (zC) {
                                lVar.w = 1;
                                lVar.p = (int) motionEvent.getX();
                            } else if (zD) {
                                lVar.w = 2;
                                lVar.m = (int) motionEvent.getY();
                            }
                            lVar.f(2);
                        }
                    } else if (motionEvent.getAction() == 1 && lVar.v == 2) {
                        lVar.m = 0.0f;
                        lVar.p = 0.0f;
                        lVar.f(1);
                        lVar.w = 0;
                    } else if (motionEvent.getAction() == 2 && lVar.v == 2) {
                        lVar.g();
                        if (lVar.w == 1) {
                            float x = motionEvent.getX();
                            int[] iArr = lVar.y;
                            iArr[0] = i3;
                            int i4 = lVar.q - i3;
                            iArr[1] = i4;
                            float fMax = Math.max(i3, Math.min(i4, x));
                            if (Math.abs(lVar.o - fMax) >= 2.0f) {
                                int iE = l.e(lVar.p, fMax, iArr, lVar.s.computeHorizontalScrollRange(), lVar.s.computeHorizontalScrollOffset(), lVar.q);
                                if (iE != 0) {
                                    lVar.s.scrollBy(iE, 0);
                                }
                                lVar.p = fMax;
                            }
                        }
                        if (lVar.w == 2) {
                            float y = motionEvent.getY();
                            int[] iArr2 = lVar.x;
                            iArr2[0] = i3;
                            int i5 = lVar.r - i3;
                            iArr2[1] = i5;
                            float fMax2 = Math.max(i3, Math.min(i5, y));
                            if (Math.abs(lVar.l - fMax2) >= 2.0f) {
                                int iE2 = l.e(lVar.m, fMax2, iArr2, lVar.s.computeVerticalScrollRange(), lVar.s.computeVerticalScrollOffset(), lVar.r);
                                if (iE2 != 0) {
                                    lVar.s.scrollBy(0, iE2);
                                }
                                lVar.m = fMax2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.N = null;
                }
                z = true;
            }
            if (z) {
                U();
                setScrollState(0);
                return true;
            }
            c0 c0Var = this.J;
            if (c0Var != null) {
                boolean zC2 = c0Var.c();
                boolean zD2 = this.J.d();
                if (this.m0 == null) {
                    this.m0 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.L0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.m0.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker = this.m0;
                        int i6 = this.t0;
                        velocityTracker.computeCurrentVelocity(1000, i6);
                        float f = zC2 ? -this.m0.getXVelocity(this.l0) : 0.0f;
                        float f2 = zD2 ? -this.m0.getYVelocity(this.l0) : 0.0f;
                        if (f == 0.0f && f2 == 0.0f) {
                            setScrollState(0);
                        } else {
                            int i7 = (int) f;
                            int iMax2 = (int) f2;
                            c0 c0Var2 = this.J;
                            if (c0Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.T) {
                                boolean zC3 = c0Var2.c();
                                boolean zD3 = this.J.d();
                                int i8 = this.s0;
                                if (!zC3 || Math.abs(i7) < i8) {
                                    i7 = 0;
                                }
                                if (!zD3 || Math.abs(iMax2) < i8) {
                                    iMax2 = 0;
                                }
                                if (i7 != 0 || iMax2 != 0) {
                                    if (i7 == 0) {
                                        iMax = 0;
                                    } else {
                                        EdgeEffect edgeEffect = this.f0;
                                        if (edgeEffect == null || androidx.room.r.m(edgeEffect) == 0.0f) {
                                            EdgeEffect edgeEffect2 = this.h0;
                                            if (edgeEffect2 == null || androidx.room.r.m(edgeEffect2) == 0.0f) {
                                                iMax = 0;
                                            } else if (X(this.h0, i7, getWidth())) {
                                                this.h0.onAbsorb(i7);
                                                i7 = 0;
                                            }
                                        } else {
                                            int i9 = -i7;
                                            if (X(this.f0, i9, getWidth())) {
                                                this.f0.onAbsorb(i9);
                                                i7 = 0;
                                            }
                                        }
                                        iMax = i7;
                                        i7 = 0;
                                    }
                                    if (iMax2 == 0) {
                                        i2 = iMax2;
                                        iMax2 = 0;
                                    } else {
                                        EdgeEffect edgeEffect3 = this.g0;
                                        if (edgeEffect3 == null || androidx.room.r.m(edgeEffect3) == 0.0f) {
                                            EdgeEffect edgeEffect4 = this.i0;
                                            if (edgeEffect4 == null || androidx.room.r.m(edgeEffect4) == 0.0f) {
                                                i2 = iMax2;
                                                iMax2 = 0;
                                            } else if (X(this.i0, iMax2, getHeight())) {
                                                this.i0.onAbsorb(iMax2);
                                                iMax2 = 0;
                                            }
                                        } else {
                                            int i10 = -iMax2;
                                            if (X(this.g0, i10, getHeight())) {
                                                this.g0.onAbsorb(i10);
                                                iMax2 = 0;
                                            }
                                        }
                                        i2 = 0;
                                    }
                                    o0 o0Var = this.x0;
                                    if (iMax != 0 || iMax2 != 0) {
                                        int i11 = -i6;
                                        iMax = Math.max(i11, Math.min(iMax, i6));
                                        iMax2 = Math.max(i11, Math.min(iMax2, i6));
                                        o0Var.a(iMax, iMax2);
                                    }
                                    if (i7 != 0 || i2 != 0) {
                                        float f3 = i7;
                                        float f4 = i2;
                                        if (!dispatchNestedPreFling(f3, f4)) {
                                            boolean z3 = zC3 || zD3;
                                            dispatchNestedFling(f3, f4, z3);
                                            int i12 = zC3;
                                            if (z3) {
                                                if (zD3) {
                                                    i12 = (zC3 ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(i12, 1);
                                                int i13 = -i6;
                                                o0Var.a(Math.max(i13, Math.min(i7, i6)), Math.max(i13, Math.min(i2, i6)));
                                            }
                                        }
                                    } else if (iMax == 0 && iMax2 == 0) {
                                    }
                                }
                            }
                            setScrollState(0);
                        }
                        U();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.l0);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.l0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax3 = this.p0 - x2;
                        int iMax4 = this.q0 - y2;
                        if (this.k0 != 1) {
                            if (zC2) {
                                int i14 = this.r0;
                                iMax3 = iMax3 > 0 ? Math.max(0, iMax3 - i14) : Math.min(0, iMax3 + i14);
                                if (iMax3 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z2 = false;
                            }
                            if (zD2) {
                                int i15 = this.r0;
                                iMax4 = iMax4 > 0 ? Math.max(0, iMax4 - i15) : Math.min(0, iMax4 + i15);
                                if (iMax4 != 0) {
                                    z2 = true;
                                }
                            }
                            if (z2) {
                                setScrollState(1);
                            }
                        }
                        if (this.k0 == 1) {
                            int[] iArr4 = this.M0;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            int iR = iMax3 - R(iMax3, motionEvent.getY());
                            int iS = iMax4 - S(iMax4, motionEvent.getX());
                            boolean zP = p(zC2 ? iR : 0, zD2 ? iS : 0, 0, this.M0, this.K0);
                            int[] iArr5 = this.K0;
                            if (zP) {
                                iR -= iArr4[0];
                                iS -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i16 = iR;
                            int i17 = iS;
                            this.p0 = x2 - iArr5[0];
                            this.q0 = y2 - iArr5[1];
                            if (V(zC2 ? i16 : 0, zD2 ? i17 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            n nVar = this.y0;
                            if (nVar != null && (i16 != 0 || i17 != 0)) {
                                nVar.a(this, i16, i17);
                            }
                        }
                    } else if (actionMasked == 3) {
                        U();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.l0 = motionEvent.getPointerId(actionIndex);
                        int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.p0 = x3;
                        this.n0 = x3;
                        int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.q0 = y3;
                        this.o0 = y3;
                    } else if (actionMasked == 6) {
                        O(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.l0 = motionEvent.getPointerId(0);
                int x4 = (int) (motionEvent.getX() + 0.5f);
                this.p0 = x4;
                this.n0 = x4;
                int y4 = (int) (motionEvent.getY() + 0.5f);
                this.q0 = y4;
                this.o0 = y4;
                if (zD2) {
                    i = zC2;
                    i = (zC2 ? 1 : 0) | 2;
                }
                i = zC2;
                getScrollingChildHelper().g(i, 0);
                this.m0.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final boolean p(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void q(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void r(int i, int i2) {
        this.d0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        f0 f0Var = this.B0;
        if (f0Var != null) {
            f0Var.b(this, i, i2);
        }
        ArrayList arrayList = this.C0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((f0) this.C0.get(size)).b(this, i, i2);
            }
        }
        this.d0--;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        p0 p0VarG = G(view);
        if (p0VarG != null) {
            if (p0VarG.j()) {
                p0VarG.j &= -257;
            } else if (!p0VarG.o()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(p0VarG);
                com.google.gson.b.k(sb, w());
                return;
            }
        }
        view.clearAnimation();
        G(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.J.getClass();
        if (!J() && view2 != null) {
            T(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.J.l0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((l) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.R != 0 || this.T) {
            this.S = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        if (this.i0 != null) {
            return;
        }
        ((m0) this.e0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.i0 = edgeEffect;
        if (this.E) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        c0 c0Var = this.J;
        if (c0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.T) {
            return;
        }
        boolean zC = c0Var.c();
        boolean zD = this.J.d();
        if (zC || zD) {
            if (!zC) {
                i = 0;
            }
            if (!zD) {
                i2 = 0;
            }
            V(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!J()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.V |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(r0 r0Var) {
        this.H0 = r0Var;
        androidx.core.view.s0.m(this, r0Var);
    }

    public void setAdapter(v vVar) {
        setLayoutFrozen(false);
        v vVar2 = this.I;
        com.google.firebase.heartbeatinfo.e eVar = this.y;
        if (vVar2 != null) {
            vVar2.a.unregisterObserver(eVar);
            this.I.getClass();
        }
        z zVar = this.j0;
        if (zVar != null) {
            zVar.e();
        }
        c0 c0Var = this.J;
        i0 i0Var = this.z;
        if (c0Var != null) {
            c0Var.h0(i0Var);
            this.J.i0(i0Var);
        }
        i0Var.a.clear();
        i0Var.g();
        androidx.compose.runtime.internal.c cVar = this.B;
        cVar.D((ArrayList) cVar.y);
        cVar.D((ArrayList) cVar.z);
        v vVar3 = this.I;
        this.I = vVar;
        if (vVar != null) {
            vVar.a.registerObserver(eVar);
        }
        c0 c0Var2 = this.J;
        if (c0Var2 != null) {
            c0Var2.P();
        }
        v vVar4 = this.I;
        i0Var.a.clear();
        i0Var.g();
        i0Var.f(vVar3, true);
        h0 h0VarC = i0Var.c();
        if (vVar3 != null) {
            h0VarC.b--;
        }
        if (h0VarC.b == 0) {
            SparseArray sparseArray = h0VarC.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                g0 g0Var = (g0) sparseArray.valueAt(i);
                Iterator it = g0Var.a.iterator();
                while (it.hasNext()) {
                    h1.f(((p0) it.next()).a);
                }
                g0Var.a.clear();
            }
        }
        if (vVar4 != null) {
            h0VarC.b++;
        }
        i0Var.e();
        this.A0.f = true;
        this.b0 |= false;
        this.a0 = true;
        int iJ = this.C.J();
        for (int i2 = 0; i2 < iJ; i2++) {
            p0 p0VarG = G(this.C.I(i2));
            if (p0VarG != null && !p0VarG.o()) {
                p0VarG.a(6);
            }
        }
        K();
        i0 i0Var2 = this.z;
        ArrayList arrayList = i0Var2.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            p0 p0Var = (p0) arrayList.get(i3);
            if (p0Var != null) {
                p0Var.a(6);
                p0Var.a(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            }
        }
        v vVar5 = i0Var2.h.I;
        if (vVar5 == null || !vVar5.b) {
            i0Var2.g();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(x xVar) {
        if (xVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.E) {
            this.i0 = null;
            this.g0 = null;
            this.h0 = null;
            this.f0 = null;
        }
        this.E = z;
        super.setClipToPadding(z);
        if (this.Q) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(y yVar) {
        yVar.getClass();
        this.e0 = yVar;
        this.i0 = null;
        this.g0 = null;
        this.h0 = null;
        this.f0 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.P = z;
    }

    public void setItemAnimator(z zVar) {
        z zVar2 = this.j0;
        if (zVar2 != null) {
            zVar2.e();
            this.j0.a = null;
        }
        this.j0 = zVar;
        if (zVar != null) {
            zVar.a = this.F0;
        }
    }

    public void setItemViewCacheSize(int i) {
        i0 i0Var = this.z;
        i0Var.e = i;
        i0Var.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(c0 c0Var) {
        RecyclerView recyclerView;
        if (c0Var == this.J) {
            return;
        }
        setScrollState(0);
        o0 o0Var = this.x0;
        o0Var.D.removeCallbacks(o0Var);
        o0Var.z.abortAnimation();
        c0 c0Var2 = this.J;
        i0 i0Var = this.z;
        if (c0Var2 != null) {
            z zVar = this.j0;
            if (zVar != null) {
                zVar.e();
            }
            this.J.h0(i0Var);
            this.J.i0(i0Var);
            i0Var.a.clear();
            i0Var.g();
            if (this.O) {
                c0 c0Var3 = this.J;
                c0Var3.f = false;
                c0Var3.R(this);
            }
            this.J.t0(null);
            this.J = null;
        } else {
            i0Var.a.clear();
            i0Var.g();
        }
        c2 c2Var = this.C;
        ((y2) c2Var.z).K();
        ArrayList arrayList = (ArrayList) c2Var.A;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((u) c2Var.y).a;
            if (size < 0) {
                break;
            }
            p0 p0VarG = G((View) arrayList.get(size));
            if (p0VarG != null) {
                int i = p0VarG.p;
                if (recyclerView.J()) {
                    p0VarG.q = i;
                    recyclerView.N0.add(p0VarG);
                } else {
                    View view = p0VarG.a;
                    Field field = androidx.core.view.s0.a;
                    view.setImportantForAccessibility(i);
                }
                p0VarG.p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            G(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.J = c0Var;
        if (c0Var != null) {
            if (c0Var.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(c0Var);
                org.mozilla.javascript.typedarrays.c.e(sb, " is already attached to a RecyclerView:", c0Var.b.w());
                return;
            } else {
                c0Var.t0(this);
                if (this.O) {
                    c0 c0Var4 = this.J;
                    c0Var4.f = true;
                    c0Var4.Q(this);
                }
            }
        }
        i0Var.n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            net.luminis.tls.engine.impl.c.o("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        androidx.core.view.o scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            Field field = androidx.core.view.s0.a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.d = z;
    }

    @Deprecated
    public void setOnScrollListener(f0 f0Var) {
        this.B0 = f0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.w0 = z;
    }

    public void setRecycledViewPool(h0 h0Var) {
        i0 i0Var = this.z;
        RecyclerView recyclerView = i0Var.h;
        i0Var.f(recyclerView.I, false);
        h0 h0Var2 = i0Var.g;
        if (h0Var2 != null) {
            h0Var2.b--;
        }
        i0Var.g = h0Var;
        if (h0Var != null && recyclerView.getAdapter() != null) {
            i0Var.g.b++;
        }
        i0Var.e();
    }

    public void setScrollState(int i) {
        if (i == this.k0) {
            return;
        }
        this.k0 = i;
        if (i != 2) {
            o0 o0Var = this.x0;
            o0Var.D.removeCallbacks(o0Var);
            o0Var.z.abortAnimation();
        }
        c0 c0Var = this.J;
        if (c0Var != null) {
            c0Var.g0(i);
        }
        f0 f0Var = this.B0;
        if (f0Var != null) {
            f0Var.a(i);
        }
        ArrayList arrayList = this.C0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((f0) this.C0.get(size)).a(i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.r0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.r0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(n0 n0Var) {
        this.z.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.T) {
            f("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.T = false;
                if (this.S && this.J != null && this.I != null) {
                    requestLayout();
                }
                this.S = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.T = true;
            this.U = true;
            setScrollState(0);
            o0 o0Var = this.x0;
            o0Var.D.removeCallbacks(o0Var);
            o0Var.z.abortAnimation();
        }
    }

    public final void t() {
        if (this.f0 != null) {
            return;
        }
        ((m0) this.e0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f0 = edgeEffect;
        if (this.E) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void u() {
        if (this.h0 != null) {
            return;
        }
        ((m0) this.e0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.h0 = edgeEffect;
        if (this.E) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void v() {
        if (this.g0 != null) {
            return;
        }
        ((m0) this.e0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.g0 = edgeEffect;
        if (this.E) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String w() {
        return " " + super.toString() + ", adapter:" + this.I + ", layout:" + this.J + ", context:" + getContext();
    }

    public final void x(l0 l0Var) {
        if (getScrollState() != 2) {
            l0Var.getClass();
            return;
        }
        OverScroller overScroller = this.x0.z;
        overScroller.getFinalX();
        overScroller.getCurrX();
        l0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View y(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[SYNTHETIC] */
    public final boolean z(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            l lVar = (l) arrayList.get(i);
            int i2 = lVar.v;
            if (i2 == 1) {
                boolean zD = lVar.d(motionEvent.getX(), motionEvent.getY());
                boolean zC = lVar.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zD || zC)) {
                    if (zC) {
                        lVar.w = 1;
                        lVar.p = (int) motionEvent.getX();
                    } else if (zD) {
                        lVar.w = 2;
                        lVar.m = (int) motionEvent.getY();
                    }
                    lVar.f(2);
                    if (action != 3) {
                        this.N = lVar;
                        return true;
                    }
                }
            } else if (i2 != 2) {
                continue;
            } else if (action != 3) {
                this.N = lVar;
                return true;
            }
        }
        return false;
    }

    public void setOnFlingListener(e0 e0Var) {
    }

    @Deprecated
    public void setRecyclerListener(j0 j0Var) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        c0 c0Var = this.J;
        if (c0Var != null) {
            return c0Var.s(layoutParams);
        }
        net.luminis.tls.engine.impl.c.r("RecyclerView has no LayoutManager".concat(w()));
        return null;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.app.mlounge.R.attr.recyclerViewStyle);
    }
}
