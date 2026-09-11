package kotlin.math;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.RectF;
import android.os.Build;
import android.os.Looper;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.compose.animation.core.g0;
import androidx.compose.foundation.gestures.o0;
import androidx.compose.foundation.text.k1;
import androidx.compose.foundation.text.r0;
import androidx.compose.foundation.text.selection.c1;
import androidx.compose.foundation.text.selection.d1;
import androidx.compose.foundation.text.selection.g;
import androidx.compose.foundation.text.selection.z0;
import androidx.compose.foundation.text.x0;
import androidx.compose.runtime.a2;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.i2;
import androidx.compose.runtime.m;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.tooling.j;
import androidx.compose.runtime.z1;
import androidx.compose.ui.graphics.layer.i;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.a0;
import androidx.compose.ui.graphics.vector.f;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.h0;
import androidx.compose.ui.o;
import androidx.compose.ui.text.d0;
import androidx.compose.ui.text.i0;
import androidx.compose.ui.text.j0;
import androidx.compose.ui.text.l0;
import androidx.concurrent.futures.h;
import androidx.datastore.core.d;
import androidx.emoji2.text.t;
import androidx.lifecycle.u;
import androidx.media3.common.util.v;
import com.app.mlounge.emulator.LibretroCore;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.tasks.k;
import com.google.android.gms.tasks.l;
import com.google.android.gms.tasks.n;
import com.google.android.gms.tasks.q;
import com.google.android.material.shape.e;
import com.google.android.material.textfield.p;
import com.google.gson.b;
import java.lang.reflect.Field;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Deferred;
import net.luminis.tls.engine.impl.c;
import org.mozilla.javascript.Token;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static f a = null;
    public static f b = null;
    public static f c = null;
    public static f d = null;
    public static f e = null;
    public static f f = null;
    public static f g = null;
    public static f h = null;
    public static boolean i = true;
    public static Field j;
    public static boolean k;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;

    public static int D(v vVar, int i2, int i3, int i4) {
        com.google.android.material.motion.a.f(Math.max(Math.max(i2, i3), i4) <= 31);
        int i5 = (1 << i2) - 1;
        int i6 = (1 << i3) - 1;
        p.e(p.e(i5, i6), 1 << i4);
        if (vVar.b() < i2) {
            return -1;
        }
        int iG = vVar.g(i2);
        if (iG == i5) {
            if (vVar.b() < i3) {
                return -1;
            }
            int iG2 = vVar.g(i3);
            iG += iG2;
            if (iG2 == i6) {
                if (vVar.b() < i4) {
                    return -1;
                }
                return vVar.g(i4) + iG;
            }
        }
        return iG;
    }

    public static int E(double d2) {
        if (Double.isNaN(d2)) {
            c.o("Cannot round NaN value.");
            return 0;
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    public static int F(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        c.o("Cannot round NaN value.");
        return 0;
    }

    public static long G(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        c.o("Cannot round NaN value.");
        return 0L;
    }

    public static void H(Window window, boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            i.i(window, z);
        } else {
            if (i2 >= 30) {
                i.h(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static void J(v vVar) {
        vVar.o(3);
        vVar.o(8);
        boolean zF = vVar.f();
        boolean zF2 = vVar.f();
        if (zF) {
            vVar.o(5);
        }
        if (zF2) {
            vVar.o(6);
        }
    }

    public static void K(v vVar) {
        int iG;
        int iG2 = vVar.g(2);
        if (iG2 == 0) {
            vVar.o(6);
            return;
        }
        int iD = D(vVar, 5, 8, 16) + 1;
        if (iG2 == 1) {
            vVar.o(iD * 7);
            return;
        }
        if (iG2 == 2) {
            boolean zF = vVar.f();
            int i2 = zF ? 1 : 5;
            int i3 = zF ? 7 : 5;
            int i4 = zF ? 8 : 6;
            int i5 = 0;
            while (i5 < iD) {
                if (vVar.f()) {
                    vVar.o(7);
                    iG = 0;
                } else {
                    if (vVar.g(2) == 3 && vVar.g(i3) * i2 != 0) {
                        vVar.n();
                    }
                    iG = vVar.g(i4) * i2;
                    if (iG != 0 && iG != 180) {
                        vVar.n();
                    }
                    vVar.n();
                }
                if (iG != 0 && iG != 180 && vVar.f()) {
                    i5++;
                }
                i5++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.animation.core.j2, androidx.compose.runtime.tooling.j] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList L(e2 e2Var, int i2, Integer num) {
        ?? jVar = new j(e2Var);
        i2 = e2Var.q(i2);
        androidx.compose.runtime.a aVarA = e2Var.a(i2);
        while (i2 >= 0) {
            jVar.r(e2Var.i(i2), e2Var.k(i2) ? e2Var.p(i2, e2Var.b) : m.a, e2Var.a.h(i2), num);
            if (i2 >= 0) {
                androidx.compose.runtime.a aVar = aVarA;
                aVarA = e2Var.a(i2);
                i2 = e2Var.q(i2);
                num = aVar;
            } else {
                num = aVarA;
            }
        }
        return (ArrayList) jVar.e;
    }

    public static q M(List list) {
        if (list == null || list.isEmpty()) {
            return t(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((com.google.android.gms.tasks.i) it.next()) == null) {
                b.h("null tasks are not accepted");
                return null;
            }
        }
        q qVar = new q();
        l lVar = new l(list.size(), qVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            com.google.android.gms.tasks.i iVar = (com.google.android.gms.tasks.i) it2.next();
            com.google.android.gms.tasks.p pVar = k.b;
            iVar.c(pVar, lVar);
            iVar.b(pVar, lVar);
            q qVar2 = (q) iVar;
            qVar2.b.h(new n((Executor) pVar, (com.google.android.gms.tasks.c) lVar));
            qVar2.p();
        }
        return qVar;
    }

    public static Object N(com.google.android.gms.tasks.i iVar) throws ExecutionException {
        if (iVar.h()) {
            return iVar.f();
        }
        if (((q) iVar).d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(iVar.e());
    }

    public static final void a(boolean z, androidx.compose.ui.text.style.j jVar, c1 c1Var, r rVar, int i2) {
        int i3;
        k1 k1VarD;
        rVar.c0(-1344558920);
        if ((i2 & 6) == 0) {
            i3 = (rVar.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= rVar.d(jVar.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= rVar.h(c1Var) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if (rVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            int i4 = i3 & 14;
            boolean zF = (i4 == 4) | rVar.f(c1Var);
            Object objQ = rVar.Q();
            androidx.compose.runtime.f fVar = m.a;
            if (zF || objQ == fVar) {
                objQ = new z0(c1Var, z);
                rVar.l0(objQ);
            }
            x0 x0Var = (x0) objQ;
            boolean zH = (i4 == 4) | rVar.h(c1Var);
            Object objQ2 = rVar.Q();
            if (zH || objQ2 == fVar) {
                objQ2 = new d1(c1Var, z);
                rVar.l0(objQ2);
            }
            androidx.compose.foundation.text.selection.m mVar = (androidx.compose.foundation.text.selection.m) objQ2;
            boolean zG = l0.g(c1Var.n().b);
            int i5 = (int) (z ? c1Var.n().b >> 32 : c1Var.n().b & 4294967295L);
            r0 r0Var = c1Var.d;
            float fE = 0.0f;
            if (r0Var != null && (k1VarD = r0Var.d()) != null) {
                j0 j0Var = k1VarD.a;
                if (i5 >= 0) {
                    i0 i0Var = j0Var.a;
                    androidx.compose.ui.text.n nVar = j0Var.b;
                    if (i0Var.a.y.length() != 0) {
                        int iMin = Math.min(nVar.d(i5), Math.min(nVar.b - 1, nVar.f - 1));
                        if (i5 <= nVar.c(iMin, false)) {
                            nVar.l(iMin);
                            ArrayList arrayList = nVar.h;
                            androidx.compose.ui.text.p pVar = (androidx.compose.ui.text.p) arrayList.get(d0.e(iMin, arrayList));
                            androidx.compose.ui.text.a aVar = pVar.a;
                            int i6 = iMin - pVar.d;
                            androidx.compose.ui.text.android.l lVar = aVar.d;
                            fE = lVar.e(i6) - lVar.g(i6);
                        }
                    }
                }
            }
            float f2 = fE;
            boolean zH2 = rVar.h(x0Var);
            Object objQ3 = rVar.Q();
            if (zH2 || objQ3 == fVar) {
                objQ3 = new androidx.compose.foundation.m(x0Var, 6);
                rVar.l0(objQ3);
            }
            _COROUTINE.b.e(mVar, z, jVar, zG, 0L, f2, h0.a(o.b, x0Var, (PointerInputEventHandler) objQ3), rVar, (i3 << 3) & 1008);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new g(z, jVar, c1Var, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[LOOP:0: B:21:0x0050->B:25:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.k0 r6, kotlin.coroutines.jvm.internal.a r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.text.contextmenu.gestures.a
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.text.contextmenu.gestures.a r0 = (androidx.compose.foundation.text.contextmenu.gestures.a) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            androidx.compose.foundation.text.contextmenu.gestures.a r0 = new androidx.compose.foundation.text.contextmenu.gestures.a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.y
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            androidx.compose.ui.input.pointer.k0 r6 = r0.e
            kotlin.a.e(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L2e:
            kotlin.a.e(r7)
        L31:
            r0.e = r6
            r0.z = r2
            androidx.compose.ui.input.pointer.n r7 = androidx.compose.ui.input.pointer.n.y
            java.lang.Object r7 = r6.b(r7, r0)
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.e
            if (r7 != r1) goto L40
            return r1
        L40:
            androidx.compose.ui.input.pointer.m r7 = (androidx.compose.ui.input.pointer.m) r7
            int r1 = r7.d
            java.lang.Object r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r7.get(r4)
            androidx.compose.ui.input.pointer.v r5 = (androidx.compose.ui.input.pointer.v) r5
            boolean r5 = androidx.compose.ui.input.pointer.u.a(r5)
            if (r5 != 0) goto L5f
            goto L31
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.math.a.b(androidx.compose.ui.input.pointer.k0, kotlin.coroutines.jvm.internal.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0064->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0081 -> B:25:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0084 -> B:25:0x0064). Please report as a decompilation issue!!! */
    public static final Object c(List list, androidx.datastore.core.i iVar, kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        d dVar;
        List list2;
        z zVar;
        Iterator it;
        Throwable th;
        kotlin.jvm.functions.l lVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i2 = dVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.A = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(cVar);
            }
        } else {
            dVar = new d(cVar);
        }
        Object obj = dVar.z;
        int i3 = dVar.A;
        Object obj2 = kotlin.coroutines.intrinsics.a.e;
        if (i3 != 0) {
            if (i3 == 1) {
                list2 = (List) dVar.e;
                kotlin.a.e(obj);
            } else {
                if (i3 != 2) {
                    c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = dVar.y;
                zVar = (z) dVar.e;
                try {
                    kotlin.a.e(obj);
                } catch (Throwable th2) {
                    Object obj3 = zVar.e;
                    if (obj3 == null) {
                        zVar.e = th2;
                    } else {
                        kotlin.a.a((Throwable) obj3, th2);
                    }
                }
            }
            while (it.hasNext()) {
                lVar = (kotlin.jvm.functions.l) it.next();
                dVar.e = zVar;
                dVar.y = it;
                dVar.A = 2;
                if (lVar.invoke(dVar) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) zVar.e;
            if (th == null) {
                return y.a;
            }
            throw th;
        }
        kotlin.a.e(obj);
        ArrayList arrayList = new ArrayList();
        androidx.compose.animation.core.g gVar = new androidx.compose.animation.core.g(list, arrayList, null);
        dVar.e = arrayList;
        dVar.A = 1;
        if (iVar.a(gVar, dVar) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        zVar = new z();
        it = list2.iterator();
        while (it.hasNext()) {
            lVar = (kotlin.jvm.functions.l) it.next();
            dVar.e = zVar;
            dVar.y = it;
            dVar.A = 2;
            if (lVar.invoke(dVar) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) zVar.e;
        if (th == null) {
            return y.a;
        }
        throw th;
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, Object obj, int i2, int i3) {
        for (Object obj2 : spannableStringBuilder.getSpans(i2, i3, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i2 && spannableStringBuilder.getSpanEnd(obj2) == i3 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i2, i3, 33);
    }

    public static androidx.concurrent.futures.k e(Deferred deferred) {
        deferred.getClass();
        androidx.concurrent.futures.i iVar = new androidx.concurrent.futures.i();
        iVar.c = new androidx.concurrent.futures.l();
        androidx.concurrent.futures.k kVar = new androidx.concurrent.futures.k(iVar);
        iVar.b = kVar;
        iVar.a = androidx.privacysandbox.ads.adservices.java.internal.a.class;
        try {
            deferred.invokeOnCompletion(new androidx.compose.animation.c(13, iVar, deferred));
            iVar.a = "Deferred.asListenableFuture";
            return kVar;
        } catch (Exception e2) {
            kVar.y.m(e2);
            return kVar;
        }
    }

    public static Object f(com.google.android.gms.tasks.i iVar) throws InterruptedException {
        x.f("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            c.r("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        x.h(iVar, "Task must not be null");
        if (iVar.g()) {
            return N(iVar);
        }
        androidx.media3.exoplayer.hls.c cVar = new androidx.media3.exoplayer.hls.c(26);
        Executor executor = k.b;
        iVar.c(executor, cVar);
        iVar.b(executor, cVar);
        q qVar = (q) iVar;
        qVar.b.h(new n(executor, (com.google.android.gms.tasks.c) cVar));
        qVar.p();
        ((CountDownLatch) cVar.e).await();
        return N(iVar);
    }

    public static Object g(com.google.android.gms.tasks.i iVar, long j2, TimeUnit timeUnit) throws TimeoutException {
        x.f("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            c.r("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        x.h(iVar, "Task must not be null");
        x.h(timeUnit, "TimeUnit must not be null");
        if (iVar.g()) {
            return N(iVar);
        }
        androidx.media3.exoplayer.hls.c cVar = new androidx.media3.exoplayer.hls.c(26);
        Executor executor = k.b;
        iVar.c(executor, cVar);
        iVar.b(executor, cVar);
        q qVar = (q) iVar;
        qVar.b.h(new n(executor, (com.google.android.gms.tasks.c) cVar));
        qVar.p();
        if (((CountDownLatch) cVar.e).await(j2, timeUnit)) {
            return N(iVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:22:0x0066->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x004e A[EDGE_INSN: B:31:0x004e->B:18:0x004e BREAK  A[LOOP:0: B:22:0x0066->B:26:0x0073], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object h(androidx.compose.ui.input.pointer.k0 r7, androidx.compose.ui.input.pointer.n r8, kotlin.coroutines.jvm.internal.a r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.n0
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.n0 r0 = (androidx.compose.foundation.gestures.n0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.n0 r0 = new androidx.compose.foundation.gestures.n0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.z
            int r1 = r0.A
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            androidx.compose.ui.input.pointer.n r7 = r0.y
            androidx.compose.ui.input.pointer.k0 r8 = r0.e
            kotlin.a.e(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L5d
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            return r7
        L34:
            kotlin.a.e(r9)
            androidx.compose.ui.input.pointer.l0 r9 = r7.C
            androidx.compose.ui.input.pointer.m r9 = r9.P
            java.lang.Object r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L42:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            androidx.compose.ui.input.pointer.v r5 = (androidx.compose.ui.input.pointer.v) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L76
        L4e:
            r0.e = r7
            r0.y = r8
            r0.A = r3
            java.lang.Object r9 = r7.b(r8, r0)
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.e
            if (r9 != r1) goto L5d
            return r1
        L5d:
            androidx.compose.ui.input.pointer.m r9 = (androidx.compose.ui.input.pointer.m) r9
            java.lang.Object r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L66:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            androidx.compose.ui.input.pointer.v r5 = (androidx.compose.ui.input.pointer.v) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L73
            goto L4e
        L73:
            int r4 = r4 + 1
            goto L66
        L76:
            int r4 = r4 + 1
            goto L42
        L79:
            kotlin.y r7 = kotlin.y.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.math.a.h(androidx.compose.ui.input.pointer.k0, androidx.compose.ui.input.pointer.n, kotlin.coroutines.jvm.internal.a):java.lang.Object");
    }

    public static final Object i(androidx.compose.ui.input.pointer.y yVar, kotlin.jvm.functions.p pVar, kotlin.coroutines.d dVar) {
        Object objL0 = ((androidx.compose.ui.input.pointer.l0) yVar).L0(new o0(dVar.getContext(), pVar, (kotlin.coroutines.d) null), dVar);
        return objL0 == kotlin.coroutines.intrinsics.a.e ? objL0 : y.a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object j(androidx.lifecycle.p pVar, kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        coil3.util.f fVar;
        androidx.lifecycle.p pVar2;
        z zVar;
        Throwable th;
        u uVar;
        u uVar2;
        if (cVar instanceof coil3.util.f) {
            fVar = (coil3.util.f) cVar;
            int i2 = fVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.A = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new coil3.util.f(cVar);
            }
        } else {
            fVar = new coil3.util.f(cVar);
        }
        Object obj = fVar.z;
        int i3 = fVar.A;
        y yVar = y.a;
        if (i3 != 0) {
            if (i3 != 1) {
                c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zVar = fVar.y;
            pVar2 = fVar.e;
            try {
                kotlin.a.e(obj);
                uVar2 = (u) zVar.e;
                if (uVar2 != null) {
                    pVar2.b(uVar2);
                }
                return yVar;
            } catch (Throwable th2) {
                th = th2;
                uVar = (u) zVar.e;
                if (uVar != null) {
                    pVar2.b(uVar);
                }
                throw th;
            }
        }
        kotlin.a.e(obj);
        if (((androidx.lifecycle.x) pVar).d.compareTo(androidx.lifecycle.o.A) >= 0) {
            return yVar;
        }
        z zVar2 = new z();
        try {
            fVar.e = pVar;
            fVar.y = zVar2;
            fVar.A = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(e.g(fVar), 1);
            cancellableContinuationImpl.initCancellability();
            coil3.util.g gVar = new coil3.util.g(cancellableContinuationImpl);
            zVar2.e = gVar;
            pVar.a(gVar);
            Object result = cancellableContinuationImpl.getResult();
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (result == aVar) {
                return aVar;
            }
            pVar2 = pVar;
            zVar = zVar2;
            uVar2 = (u) zVar.e;
            if (uVar2 != null) {
                pVar2.b(uVar2);
            }
            return yVar;
        } catch (Throwable th3) {
            pVar2 = pVar;
            zVar = zVar2;
            th = th3;
            uVar = (u) zVar.e;
            if (uVar != null) {
                pVar2.b(uVar);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.animation.core.j2, androidx.compose.runtime.tooling.j] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.a] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List k(i2 i2Var, Integer num, int i2, Integer num2) {
        int iE;
        int iS;
        androidx.collection.j0 j0Var;
        if (i2Var.w || i2Var.p() == 0) {
            return kotlin.collections.u.e;
        }
        ?? jVar = new j(i2Var);
        if (num2 != null) {
            iE = num2.intValue();
        } else {
            iE = i2Var.v;
            if (iE < 0) {
                iE = i2Var.E(i2, i2Var.b);
            }
        }
        if (num == 0) {
            int iN = i2Var.i - i2Var.N(i2Var.r(i2), i2Var.b);
            androidx.collection.z zVar = i2Var.s;
            num = Integer.valueOf(iN + ((zVar == null || (j0Var = (androidx.collection.j0) zVar.b(i2)) == null) ? 0 : j0Var.b));
        }
        int iR = i2Var.r(i2) * 5;
        int[] iArr = i2Var.b;
        if (iR < iArr.length) {
            iS = i2Var.s(i2);
        } else {
            int iE2 = iE >= 0 ? i2Var.E(iE, iArr) : iE;
            iS = i2Var.s(iE);
            int i3 = iE;
            iE = iE2;
            i2 = i3;
        }
        while (i2 >= 0) {
            jVar.r(iS, (i2Var.b[(i2Var.r(i2) * 5) + 1] & 536870912) != 0 ? i2Var.t(i2) : m.a, i2Var.O(i2), num);
            num = i2Var.b(i2);
            if (iE >= 0) {
                int iE3 = i2Var.E(iE, i2Var.b);
                iS = i2Var.s(iE);
                int i4 = iE;
                iE = iE3;
                i2 = i4;
            } else {
                i2 = iE;
            }
        }
        return (ArrayList) jVar.e;
    }

    public static q l(Executor executor, Callable callable) {
        x.h(executor, "Executor must not be null");
        q qVar = new q();
        executor.execute(new com.google.common.util.concurrent.l0(29, qVar, callable));
        return qVar;
    }

    public static final int p(androidx.sqlite.c cVar, String str) {
        cVar.getClass();
        int columnCount = cVar.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount) {
                i2 = -1;
                break;
            }
            if (str.equals(cVar.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        String strK = androidx.privacysandbox.ads.adservices.java.internal.a.k('`', "`", str);
        int columnCount2 = cVar.getColumnCount();
        int i3 = 0;
        while (true) {
            if (i3 >= columnCount2) {
                i3 = -1;
                break;
            }
            if (strK.equals(cVar.getColumnName(i3))) {
                break;
            }
            i3++;
        }
        if (i3 >= 0) {
            return i3;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = cVar.getColumnCount();
            String strConcat = ".".concat(str);
            String strK2 = androidx.privacysandbox.ads.adservices.java.internal.a.k('`', ".", str);
            for (int i4 = 0; i4 < columnCount3; i4++) {
                String columnName = cVar.getColumnName(i4);
                if (columnName.length() >= str.length() + 2 && (kotlin.text.r.H(columnName, strConcat, false) || (columnName.charAt(0) == '`' && kotlin.text.r.H(columnName, strK2, false)))) {
                    return i4;
                }
            }
        }
        return -1;
    }

    public static androidx.emoji2.text.u q(Context context) {
        ProviderInfo providerInfo;
        androidx.core.provider.d dVar;
        ApplicationInfo applicationInfo;
        com.google.android.material.shape.g cVar = Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.c() : new com.google.android.material.shape.g();
        PackageManager packageManager = context.getPackageManager();
        com.google.firebase.b.h(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            dVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrF = cVar.f(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrF) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new androidx.core.provider.d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
                dVar = null;
            }
        }
        if (dVar == null) {
            return null;
        }
        return new androidx.emoji2.text.u(new t(context, dVar));
    }

    public static final Integer s(e2 e2Var, androidx.compose.runtime.v vVar, int i2, int i3) {
        Integer numS;
        int[] iArr = e2Var.b;
        while (true) {
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (e2Var.j(i2) && e2Var.i(i2) == 206 && kotlin.jvm.internal.l.a(e2Var.p(i2, iArr), androidx.compose.runtime.t.e)) {
                Object objH = e2Var.h(i2, 0);
                a2 a2Var = objH instanceof a2 ? (a2) objH : null;
                z1 z1Var = a2Var != null ? a2Var.a : null;
                androidx.compose.runtime.o oVar = z1Var instanceof androidx.compose.runtime.o ? (androidx.compose.runtime.o) z1Var : null;
                if (oVar != null && oVar.e.equals(vVar)) {
                    return Integer.valueOf(i2);
                }
            }
            if (e2Var.d(i2) && (numS = s(e2Var, vVar, i2 + 1, i4)) != null) {
                return Integer.valueOf(numS.intValue());
            }
            i2 = i4;
        }
    }

    public static q t(Object obj) {
        q qVar = new q();
        qVar.k(obj);
        return qVar;
    }

    public static final float u(int i2, int i3, float[] fArr) {
        return fArr[((i2 - i3) * 2) + 1];
    }

    public static final int v(androidx.sqlite.c cVar, String str) {
        cVar.getClass();
        int iP = p(cVar, str);
        if (iP >= 0) {
            return iP;
        }
        int columnCount = cVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i2 = 0; i2 < columnCount; i2++) {
            arrayList.add(cVar.getColumnName(i2));
        }
        androidx.core.graphics.b.c("Column '", str, "' does not exist. Available columns: [", kotlin.collections.o.R(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static final f w() {
        f fVar = e;
        if (fVar != null) {
            return fVar;
        }
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = androidx.compose.ui.graphics.vector.h0.a;
        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new androidx.compose.ui.graphics.vector.o(8.0f, 5.0f));
        arrayList.add(new a0(14.0f));
        arrayList.add(new androidx.compose.ui.graphics.vector.v(11.0f, -7.0f));
        arrayList.add(androidx.compose.ui.graphics.vector.k.c);
        androidx.compose.ui.graphics.vector.e.a(eVar, arrayList, 0, p0Var);
        f fVarB = eVar.b();
        e = fVarB;
        return fVarB;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x025e A[EDGE_INSN: B:144:0x025e->B:171:0x02ba BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a6  */
    public static final int x(androidx.compose.ui.text.android.l lVar, Layout layout, androidx.compose.runtime.internal.c cVar, int i2, RectF rectF, androidx.compose.ui.text.android.selection.d dVar, g0 g0Var, boolean z) {
        androidx.compose.ui.text.android.g[] gVarArr;
        androidx.compose.ui.text.android.g[] gVarArr2;
        int i3;
        int i4;
        int i5;
        int i6;
        int iG;
        Bidi bidiCreateLineBidi;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i2);
        int lineBottom = layout.getLineBottom(i2);
        int lineStart = layout.getLineStart(i2);
        int lineEnd = layout.getLineEnd(i2);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i7 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i7];
        Layout layout2 = lVar.f;
        int lineStart2 = layout2.getLineStart(i2);
        int iF = lVar.f(i2);
        if (i7 < (iF - lineStart2) * 2) {
            androidx.compose.ui.text.internal.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        androidx.compose.ui.scrollcapture.g gVar = new androidx.compose.ui.scrollcapture.g(lVar);
        boolean z2 = false;
        boolean z3 = layout2.getParagraphDirection(i2) == 1;
        int i8 = 0;
        while (lineStart2 < iF) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z3 && !zIsRtlCharAt) {
                fA = gVar.a(lineStart2, z2, z2, true);
                fA3 = gVar.a(lineStart2 + 1, true, true, true);
            } else if (z3 && zIsRtlCharAt) {
                fA3 = gVar.a(lineStart2, false, false, false);
                fA = gVar.a(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fA2 = gVar.a(lineStart2, false, false, true);
                    fA = gVar.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = gVar.a(lineStart2, false, false, false);
                    fA2 = gVar.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i8] = fA;
            fArr[i8 + 1] = fA3;
            i8 += 2;
            lineStart2++;
            z3 = z3;
            z2 = false;
        }
        Layout layout3 = (Layout) cVar.e;
        int lineStart3 = layout3.getLineStart(i2);
        int lineEnd2 = layout3.getLineEnd(i2);
        int iX = cVar.x(lineStart3, false);
        int iY = cVar.y(iX);
        int i9 = lineStart3 - iY;
        int i10 = lineEnd2 - iY;
        Bidi bidiN = cVar.n(iX);
        if (bidiN == null || (bidiCreateLineBidi = bidiN.createLineBidi(i9, i10)) == null) {
            gVarArr = new androidx.compose.ui.text.android.g[]{new androidx.compose.ui.text.android.g(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            gVarArr = new androidx.compose.ui.text.android.g[runCount];
            int i11 = 0;
            while (i11 < runCount) {
                int i12 = runCount;
                gVarArr[i11] = new androidx.compose.ui.text.android.g(bidiCreateLineBidi.getRunStart(i11) + lineStart3, bidiCreateLineBidi.getRunLimit(i11) + lineStart3, bidiCreateLineBidi.getRunLevel(i11) % 2 == 1);
                i11++;
                runCount = i12;
            }
        }
        kotlin.ranges.b dVar2 = z ? new kotlin.ranges.d(0, gVarArr.length - 1, 1) : new kotlin.ranges.b(gVarArr.length - 1, 0, -1);
        int i13 = dVar2.e;
        int i14 = dVar2.y;
        int i15 = dVar2.z;
        if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
            return -1;
        }
        while (true) {
            androidx.compose.ui.text.android.g gVar2 = gVarArr[i13];
            boolean z4 = gVar2.c;
            int iC = gVar2.a;
            int iD = gVar2.b;
            float f2 = z4 ? fArr[((iD - 1) - lineStart) * 2] : fArr[(iC - lineStart) * 2];
            float fU = z4 ? u(iC, lineStart, fArr) : u(iD - 1, lineStart, fArr);
            float f3 = rectF.left;
            int i16 = i15;
            if (!z) {
                gVarArr2 = gVarArr;
                if (fU < f3) {
                    iD = -1;
                    break;
                }
                float f4 = rectF.right;
                if (f2 <= f4) {
                    if ((z4 || f4 < fU) && (!z4 || f3 > f2)) {
                        int i17 = iD;
                        int i18 = iC;
                        while (i17 - i18 > 1) {
                            int i19 = (i17 + i18) / 2;
                            float f5 = fArr[(i19 - lineStart) * 2];
                            int i20 = i17;
                            if ((z4 || f5 <= rectF.right) && (!z4 || f5 >= rectF.left)) {
                                i17 = i20;
                                i18 = i19;
                            } else {
                                i17 = i19;
                            }
                        }
                        i3 = z4 ? i17 : i18;
                    } else {
                        i3 = iD - 1;
                    }
                    int iG2 = dVar.g(i3 + 1);
                    if (iG2 == -1 || (i4 = dVar.i(iG2)) <= iC) {
                        iD = -1;
                        break;
                    }
                    if (iG2 < iC) {
                        iG2 = iC;
                    }
                    if (i4 <= iD) {
                        iD = i4;
                    }
                    RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iG3 = iG2;
                    while (true) {
                        rectF2.left = z4 ? fArr[((iD - 1) - lineStart) * 2] : fArr[(iG3 - lineStart) * 2];
                        rectF2.right = z4 ? u(iG3, lineStart, fArr) : u(iD - 1, lineStart, fArr);
                        if (((Boolean) g0Var.invoke(rectF2, rectF)).booleanValue()) {
                            break;
                        }
                        iD = dVar.d(iD);
                        if (iD == -1 || iD <= iC) {
                            iD = -1;
                            break;
                        }
                        iG3 = dVar.g(iD);
                        if (iG3 < iC) {
                            iG3 = iC;
                        }
                    }
                } else {
                    iD = -1;
                    break;
                }
                iC = iD;
            } else {
                if (fU < f3) {
                    gVarArr2 = gVarArr;
                    iC = -1;
                    break;
                }
                float f6 = rectF.right;
                if (f2 <= f6) {
                    if ((z4 || f3 > f2) && (!z4 || f6 < fU)) {
                        int i21 = iD;
                        int i22 = iC;
                        while (true) {
                            i5 = i21;
                            if (i21 - i22 <= 1) {
                                break;
                            }
                            int i23 = (i5 + i22) / 2;
                            float f7 = fArr[(i23 - lineStart) * 2];
                            if ((z4 || f7 <= rectF.left) && (!z4 || f7 >= rectF.right)) {
                                i21 = i5;
                                i22 = i23;
                            } else {
                                i21 = i23;
                            }
                        }
                        i6 = z4 ? i5 : i22;
                    } else {
                        i6 = iC;
                    }
                    int i24 = dVar.i(i6);
                    if (i24 != -1 && (iG = dVar.g(i24)) < iD) {
                        if (iG >= iC) {
                            iC = iG;
                        }
                        if (i24 > iD) {
                            i24 = iD;
                        }
                        gVarArr2 = gVarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int i25 = i24;
                        while (true) {
                            rectF3.left = z4 ? fArr[((i25 - 1) - lineStart) * 2] : fArr[(iC - lineStart) * 2];
                            rectF3.right = z4 ? u(iC, lineStart, fArr) : u(i25 - 1, lineStart, fArr);
                            if (((Boolean) g0Var.invoke(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iC = dVar.c(iC);
                            if (iC != -1 && iC < iD) {
                                i25 = dVar.i(iC);
                                if (i25 > iD) {
                                    i25 = iD;
                                }
                            }
                        }
                    } else {
                        gVarArr2 = gVarArr;
                    }
                    iC = -1;
                    break;
                } else {
                    gVarArr2 = gVarArr;
                    iC = -1;
                    break;
                }
            }
            if (iC >= 0) {
                return iC;
            }
            if (i13 == i14) {
                return -1;
            }
            i13 += i16;
            i15 = i16;
            gVarArr = gVarArr2;
        }
    }

    public static final long z(float f2, long j2) {
        return (Float.isNaN(f2) || f2 >= 1.0f) ? j2 : androidx.compose.ui.graphics.t.b(androidx.compose.ui.graphics.t.d(j2) * f2, j2);
    }

    public abstract void A(String str);

    public abstract void B(androidx.concurrent.futures.g gVar, androidx.concurrent.futures.g gVar2);

    public abstract void C(androidx.concurrent.futures.g gVar, Thread thread);

    public void I(View view, float f2) {
        if (i) {
            try {
                androidx.compose.ui.platform.coreshims.b.y(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
        view.setAlpha(f2);
    }

    public abstract boolean m(h hVar, androidx.concurrent.futures.d dVar, androidx.concurrent.futures.d dVar2);

    public abstract boolean n(h hVar, Object obj, Object obj2);

    public abstract boolean o(h hVar, androidx.concurrent.futures.g gVar, androidx.concurrent.futures.g gVar2);

    public boolean r(com.caverock.androidsvg.k1 k1Var) {
        return true;
    }

    public float y(View view) {
        if (i) {
            try {
                return androidx.compose.ui.platform.coreshims.b.r(view);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
        return view.getAlpha();
    }
}
