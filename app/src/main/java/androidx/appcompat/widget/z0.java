package androidx.appcompat.widget;

import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.gms.measurement.internal.b4;
import com.google.android.gms.measurement.internal.j3;
import com.google.android.gms.measurement.internal.l4;
import com.google.android.gms.measurement.internal.m3;
import com.google.android.gms.measurement.internal.n3;
import com.google.android.gms.measurement.internal.o3;
import com.google.android.gms.measurement.internal.q3;
import com.google.android.gms.measurement.internal.r4;
import com.google.android.gms.measurement.internal.u3;
import com.google.android.gms.measurement.internal.v2;
import com.google.android.gms.measurement.internal.v3;
import com.google.android.gms.measurement.internal.w3;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements Runnable {
    public final /* synthetic */ int e;
    public final Object y;

    public z0(com.google.android.gms.common.api.internal.i iVar, com.google.android.gms.common.api.internal.x xVar) {
        this.e = 16;
        this.y = xVar;
    }

    private final void a() {
        com.google.android.gms.tasks.n nVar = (com.google.android.gms.tasks.n) this.y;
        synchronized (nVar.z) {
            try {
                com.google.android.gms.tasks.c cVar = (com.google.android.gms.tasks.c) nVar.A;
                if (cVar != null) {
                    cVar.l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0337  */
    /* JADX WARN: Code duplicated, block: B:193:0x0564  */
    @Override // java.lang.Runnable
    public final void run() {
        j jVar;
        int i;
        boolean z;
        okhttp3.internal.concurrent.a aVarB;
        long jNanoTime;
        int i2 = 3;
        int i3 = 2;
        int i4 = 1;
        int i5 = 0;
        switch (this.e) {
            case 0:
                a1 a1Var = (a1) this.y;
                a1Var.I = null;
                a1Var.drawableStateChanged();
                return;
            case 1:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.y;
                if (searchView$SearchAutoComplete.C) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.C = false;
                    return;
                }
                return;
            case 2:
                ActionMenuView actionMenuView = ((Toolbar) this.y).e;
                if (actionMenuView == null || (jVar = actionMenuView.P) == null) {
                    return;
                }
                jVar.i();
                return;
            case 3:
                androidx.compose.ui.platform.u uVar = (androidx.compose.ui.platform.u) this.y;
                uVar.removeCallbacks(this);
                MotionEvent motionEvent = uVar.R0;
                if (motionEvent != null) {
                    boolean z2 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z2) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    uVar.K(motionEvent, (actionMasked == 7 || actionMasked == 9) ? 7 : 2, uVar.S0, false);
                    return;
                }
                return;
            case 4:
                androidx.core.widget.c cVar = (androidx.core.widget.c) this.y;
                a1 a1Var2 = cVar.z;
                androidx.core.widget.a aVar = cVar.e;
                if (cVar.L) {
                    if (cVar.J) {
                        cVar.J = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.e = jCurrentAnimationTimeMillis;
                        aVar.g = -1L;
                        aVar.f = jCurrentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.g + ((long) aVar.i)) || !cVar.e()) {
                        cVar.L = false;
                        return;
                    }
                    if (cVar.K) {
                        cVar.K = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        a1Var2.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f == 0) {
                        org.mozilla.javascript.c.b("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - aVar.f;
                    aVar.f = jCurrentAnimationTimeMillis2;
                    cVar.N.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.d));
                    Field field = androidx.core.view.s0.a;
                    a1Var2.postOnAnimation(this);
                    return;
                }
                return;
            case 5:
                ((androidx.customview.widget.d) this.y).n(0);
                return;
            case 6:
                ((androidx.fragment.app.c) this.y).H.getClass();
                return;
            case 7:
                ((androidx.fragment.app.h) this.y).v();
                throw null;
            case 8:
                ((androidx.media3.exoplayer.upstream.l) this.y).c();
                return;
            case 9:
                androidx.recyclerview.widget.l lVar = (androidx.recyclerview.widget.l) this.y;
                ValueAnimator valueAnimator = lVar.z;
                int i6 = lVar.A;
                if (i6 != 1) {
                    i = 2;
                    if (i6 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                lVar.A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 10:
                RecyclerView recyclerView = (RecyclerView) this.y;
                androidx.recyclerview.widget.z zVar = recyclerView.j0;
                if (zVar != null) {
                    androidx.recyclerview.widget.h hVar = (androidx.recyclerview.widget.h) zVar;
                    long j2 = hVar.d;
                    ArrayList<androidx.recyclerview.widget.p0> arrayList = hVar.h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = hVar.j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = hVar.k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = hVar.i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z = false;
                    } else {
                        for (androidx.recyclerview.widget.p0 p0Var : arrayList) {
                            View view = p0Var.a;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            hVar.q.add(p0Var);
                            viewPropertyAnimatorAnimate.setDuration(j2).alpha(0.0f).setListener(new androidx.recyclerview.widget.c(hVar, p0Var, viewPropertyAnimatorAnimate, view)).start();
                            zIsEmpty4 = zIsEmpty4;
                        }
                        boolean z3 = zIsEmpty4;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            hVar.m.add(arrayList5);
                            arrayList2.clear();
                            androidx.recyclerview.widget.b bVar = new androidx.recyclerview.widget.b(hVar, arrayList5, 0);
                            if (zIsEmpty) {
                                bVar.run();
                            } else {
                                View view2 = ((androidx.recyclerview.widget.g) arrayList5.get(0)).a.a;
                                Field field2 = androidx.core.view.s0.a;
                                view2.postOnAnimationDelayed(bVar, j2);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            hVar.n.add(arrayList6);
                            arrayList3.clear();
                            androidx.recyclerview.widget.b bVar2 = new androidx.recyclerview.widget.b(hVar, arrayList6, 1);
                            if (zIsEmpty) {
                                bVar2.run();
                            } else {
                                View view3 = ((androidx.recyclerview.widget.f) arrayList6.get(0)).a.a;
                                Field field3 = androidx.core.view.s0.a;
                                view3.postOnAnimationDelayed(bVar2, j2);
                            }
                        }
                        if (z3) {
                            z = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            hVar.l.add(arrayList7);
                            arrayList4.clear();
                            androidx.recyclerview.widget.b bVar3 = new androidx.recyclerview.widget.b(hVar, arrayList7, 2);
                            if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                                bVar3.run();
                                z = false;
                            } else {
                                if (zIsEmpty) {
                                    j2 = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? hVar.e : 0L, !zIsEmpty3 ? hVar.f : 0L) + j2;
                                z = false;
                                View view4 = ((androidx.recyclerview.widget.p0) arrayList7.get(0)).a;
                                Field field4 = androidx.core.view.s0.a;
                                view4.postOnAnimationDelayed(bVar3, jMax);
                            }
                        }
                    }
                } else {
                    z = false;
                }
                recyclerView.G0 = z;
                return;
            case 11:
                ((StaggeredGridLayoutManager) this.y).y0();
                return;
            case 12:
                if (((com.google.android.gms.tasks.j) this.y).c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 13:
                ((com.google.android.gms.common.api.internal.k) this.y).i();
                return;
            case 14:
                com.google.android.gms.common.api.c cVar2 = ((com.google.android.gms.common.api.internal.k) ((androidx.media3.exoplayer.hls.c) this.y).e).e;
                cVar2.c(cVar2.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 15:
                ((com.google.android.gms.common.api.internal.u) this.y).k.c(new com.google.android.gms.common.b(4, null, null));
                return;
            case 16:
                throw null;
            case 17:
                com.google.android.gms.measurement.internal.m mVar = (com.google.android.gms.measurement.internal.m) this.y;
                try {
                    SQLiteDatabase sQLiteDatabaseM0 = mVar.m0();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("elapsed_time", (Long) 0L);
                    sQLiteDatabaseM0.update("raw_events", contentValues, null, null);
                    return;
                } catch (SQLiteException e) {
                    com.google.android.gms.measurement.internal.x0 x0Var = ((com.google.android.gms.measurement.internal.s1) mVar.e).C;
                    com.google.android.gms.measurement.internal.s1.m(x0Var);
                    x0Var.C.b(e, "Failed to remove elapsed times from raw events table");
                    return;
                }
            case 18:
                ((com.google.android.gms.measurement.internal.d1) this.y).a.N();
                return;
            case 19:
                o3 o3Var = ((n3) this.y).z;
                o3Var.G(new ComponentName(((com.google.android.gms.measurement.internal.s1) o3Var.e).e, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 20:
                o3 o3Var2 = ((n3) ((com.google.common.util.concurrent.l0) this.y).z).z;
                com.google.android.gms.measurement.internal.p1 p1Var = ((com.google.android.gms.measurement.internal.s1) o3Var2.e).D;
                com.google.android.gms.measurement.internal.s1.m(p1Var);
                p1Var.E(new m3(o3Var2, i5));
                return;
            case 21:
                u3 u3Var = (u3) this.y;
                w3 w3Var = (w3) u3Var.z.z;
                w3Var.v();
                com.google.android.gms.measurement.internal.s1 s1Var = (com.google.android.gms.measurement.internal.s1) w3Var.e;
                com.google.android.gms.measurement.internal.x0 x0Var2 = s1Var.C;
                Context context = s1Var.e;
                com.google.android.gms.measurement.internal.s1.m(x0Var2);
                x0Var2.J.a("Application going to the background");
                com.google.android.gms.measurement.internal.g1 g1Var = s1Var.B;
                com.google.android.gms.measurement.internal.s1.k(g1Var);
                g1Var.P.b(true);
                w3Var.v();
                w3Var.A = true;
                com.google.android.gms.measurement.internal.g gVar = s1Var.A;
                if (!gVar.K()) {
                    long j3 = u3Var.y;
                    androidx.media3.exoplayer.source.r0 r0Var = w3Var.C;
                    r0Var.e(j3, false, false);
                    ((v3) r0Var.z).c();
                }
                long j4 = u3Var.e;
                com.google.android.gms.measurement.internal.s1.m(x0Var2);
                x0Var2.I.b(Long.valueOf(j4), "Application backgrounded at: timestamp_millis");
                v2 v2Var = s1Var.J;
                com.google.android.gms.measurement.internal.s1.l(v2Var);
                v2Var.v();
                com.google.android.gms.measurement.internal.s1 s1Var2 = (com.google.android.gms.measurement.internal.s1) v2Var.e;
                v2Var.w();
                o3 o3VarP = s1Var2.p();
                o3VarP.v();
                o3VarP.w();
                if (o3VarP.C()) {
                    r4 r4Var = ((com.google.android.gms.measurement.internal.s1) o3VarP.e).F;
                    com.google.android.gms.measurement.internal.s1.k(r4Var);
                    if (r4Var.h0() >= 242600) {
                        o3 o3VarP2 = s1Var2.p();
                        o3VarP2.v();
                        o3VarP2.w();
                        o3VarP2.J(new j3(o3VarP2, o3VarP2.L(true), i3));
                    }
                } else {
                    o3 o3VarP3 = s1Var2.p();
                    o3VarP3.v();
                    o3VarP3.w();
                    o3VarP3.J(new j3(o3VarP3, o3VarP3.L(true), i3));
                }
                if (gVar.G(null, com.google.android.gms.measurement.internal.h0.N0)) {
                    r4 r4Var2 = s1Var.F;
                    com.google.android.gms.measurement.internal.s1.k(r4Var2);
                    long jD = r4Var2.b0(context.getPackageName(), gVar.z) ? 1000L : gVar.D(context.getPackageName(), com.google.android.gms.measurement.internal.h0.E);
                    com.google.android.gms.measurement.internal.s1.m(x0Var2);
                    x0Var2.K.b(Long.valueOf(jD), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    com.google.android.gms.measurement.internal.s1.j(s1Var.R);
                    s1Var.R.z(jD);
                    return;
                }
                return;
            case 22:
                l4 l4Var = (l4) this.y;
                l4Var.e().v();
                l4Var.H = new com.google.android.gms.measurement.internal.i1(l4Var);
                com.google.android.gms.measurement.internal.m mVar2 = new com.google.android.gms.measurement.internal.m(l4Var);
                mVar2.x();
                l4Var.z = mVar2;
                com.google.android.gms.measurement.internal.l1 l1Var = l4Var.e;
                com.google.android.gms.measurement.internal.g gVarF0 = l4Var.f0();
                com.google.android.gms.common.internal.x.g(l1Var);
                gVarF0.A = l1Var;
                q3 q3Var = new q3(l4Var);
                q3Var.x();
                l4Var.F = q3Var;
                com.google.android.gms.measurement.internal.c cVar3 = new com.google.android.gms.measurement.internal.c(l4Var);
                cVar3.x();
                l4Var.C = cVar3;
                com.google.android.gms.measurement.internal.b1 b1Var = new com.google.android.gms.measurement.internal.b1(l4Var, i4);
                b1Var.x();
                l4Var.E = b1Var;
                b4 b4Var = new b4(l4Var);
                b4Var.x();
                l4Var.B = b4Var;
                l4Var.A = new com.google.android.gms.measurement.internal.d1(l4Var);
                if (l4Var.O != l4Var.P) {
                    l4Var.b().C.c(Integer.valueOf(l4Var.O), Integer.valueOf(l4Var.P), "Not all upload components initialized");
                }
                l4Var.J.set(true);
                l4Var.b().K.a("UploadController is now fully initialized");
                l4Var.e().v();
                com.google.android.gms.measurement.internal.m mVar3 = l4Var.z;
                l4.U(mVar3);
                mVar3.F();
                com.google.android.gms.measurement.internal.m mVar4 = l4Var.z;
                l4.U(mVar4);
                mVar4.v();
                mVar4.w();
                if (mVar4.g0()) {
                    com.google.android.gms.measurement.internal.g0 g0Var = com.google.android.gms.measurement.internal.h0.u0;
                    if (((Long) g0Var.a(null)).longValue() != 0) {
                        SQLiteDatabase sQLiteDatabaseM1 = mVar4.m0();
                        com.google.android.gms.measurement.internal.s1 s1Var3 = (com.google.android.gms.measurement.internal.s1) mVar4.e;
                        s1Var3.H.getClass();
                        int iDelete = sQLiteDatabaseM1.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(g0Var.a(null))});
                        if (iDelete > 0) {
                            com.google.android.gms.measurement.internal.x0 x0Var3 = s1Var3.C;
                            com.google.android.gms.measurement.internal.s1.m(x0Var3);
                            x0Var3.K.b(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (l4Var.F.E.g() == 0) {
                    androidx.media3.exoplayer.l1 l1Var2 = l4Var.F.E;
                    l4Var.c().getClass();
                    l1Var2.h(System.currentTimeMillis());
                }
                l4Var.N();
                return;
            case 23:
                com.google.android.gms.measurement.internal.s1 s1Var4 = (com.google.android.gms.measurement.internal.s1) ((androidx.media3.common.util.t) this.y).b;
                com.google.android.gms.measurement.internal.s1.j(s1Var4.R);
                s1Var4.R.z(((Long) com.google.android.gms.measurement.internal.h0.D.a(null)).longValue());
                return;
            case 24:
                com.google.android.gms.measurement.internal.s1 s1Var5 = (com.google.android.gms.measurement.internal.s1) this.y;
                r4 r4Var3 = s1Var5.F;
                v2 v2Var2 = s1Var5.J;
                com.google.android.gms.measurement.internal.s1.k(r4Var3);
                r4Var3.v();
                if (r4Var3.T() != 1) {
                    com.google.android.gms.measurement.internal.x0 x0Var4 = s1Var5.C;
                    com.google.android.gms.measurement.internal.s1.m(x0Var4);
                    x0Var4.F.a("registerTrigger called but app not eligible");
                    return;
                }
                com.google.android.gms.measurement.internal.s1.l(v2Var2);
                v2Var2.v();
                com.google.android.gms.measurement.internal.k2 k2Var = v2Var2.I;
                if (k2Var != null) {
                    k2Var.c();
                }
                com.google.android.gms.measurement.internal.s1.l(v2Var2);
                new Thread(new com.google.android.gms.measurement.internal.j2(v2Var2, i2)).start();
                return;
            case 25:
                com.google.android.gms.stats.a aVar2 = (com.google.android.gms.stats.a) this.y;
                synchronized (aVar2.a) {
                    try {
                        if (aVar2.b()) {
                            Log.e("WakeLock", String.valueOf(aVar2.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar2.d();
                            if (aVar2.b()) {
                                aVar2.c = 1;
                                aVar2.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 26:
                a();
                return;
            case 27:
                androidx.compose.ui.platform.t1 t1Var = (androidx.compose.ui.platform.t1) this.y;
                t1Var.b = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) t1Var.e;
                androidx.customview.widget.d dVar = bottomSheetBehavior.O;
                if (dVar != null && dVar.f()) {
                    t1Var.a(t1Var.c);
                    return;
                } else {
                    if (bottomSheetBehavior.N == 2) {
                        bottomSheetBehavior.C(t1Var.c);
                        return;
                    }
                    return;
                }
            case 28:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.y).z.D;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            default:
                okhttp3.internal.concurrent.d dVar2 = (okhttp3.internal.concurrent.d) this.y;
                synchronized (dVar2) {
                    dVar2.g++;
                    aVarB = dVar2.b();
                }
                if (aVarB == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                do {
                    okhttp3.internal.concurrent.a aVar3 = aVarB;
                    try {
                        threadCurrentThread.setName(aVar3.a);
                        Logger logger = ((okhttp3.internal.concurrent.d) this.y).b;
                        okhttp3.internal.concurrent.c cVar4 = aVar3.c;
                        cVar4.getClass();
                        boolean zIsLoggable = logger.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = System.nanoTime();
                            kotlin.collections.a0.a(logger, aVar3, cVar4, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jA = aVar3.a();
                            if (zIsLoggable) {
                                kotlin.collections.a0.a(logger, aVar3, cVar4, "finished run in " + kotlin.collections.a0.o(System.nanoTime() - jNanoTime));
                            }
                            okhttp3.internal.concurrent.d dVar3 = (okhttp3.internal.concurrent.d) this.y;
                            synchronized (dVar3) {
                                okhttp3.internal.concurrent.d.a(dVar3, aVar3, jA, true);
                                aVarB = dVar3.b();
                            }
                        } catch (Throwable th2) {
                            if (zIsLoggable) {
                                kotlin.collections.a0.a(logger, aVar3, cVar4, "failed a run in " + kotlin.collections.a0.o(System.nanoTime() - jNanoTime));
                            }
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        try {
                            okhttp3.internal.concurrent.d dVar4 = (okhttp3.internal.concurrent.d) this.y;
                            synchronized (dVar4) {
                                okhttp3.internal.concurrent.d.a(dVar4, aVar3, -1L, false);
                                if (!(th3 instanceof InterruptedException)) {
                                    throw th3;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th4) {
                            threadCurrentThread.setName(name);
                            throw th4;
                        }
                    }
                } while (aVarB != null);
                threadCurrentThread.setName(name);
                return;
        }
    }

    public /* synthetic */ z0(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    public z0(com.google.android.gms.measurement.internal.d1 d1Var, boolean z) {
        this.e = 18;
        this.y = d1Var;
    }

    public z0(l4 l4Var, androidx.media3.exoplayer.mediacodec.g gVar) {
        this.e = 22;
        this.y = l4Var;
    }
}
