package com.google.firebase.sessions;

import android.util.Log;
import com.appsalt.internal.k2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ e1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(e1 e1Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = e1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                c1 c1Var = new c1(this.z, dVar, 0);
                c1Var.y = obj;
                return c1Var;
            default:
                c1 c1Var2 = new c1(this.z, dVar, 1);
                c1Var2.y = obj;
                return c1Var2;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((c1) create(k0Var, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                k0 k0Var = (k0) this.y;
                this.z.d.getClass();
                return k0.a(k0Var, null, j1.a(), null, 5);
            default:
                kotlin.a.e(obj);
                k0 k0Var2 = (k0) this.y;
                e1 e1Var = this.z;
                f0 f0Var = e1Var.f;
                boolean zE = e1Var.e(k0Var2);
                Map mapB = k0Var2.c;
                if (mapB != null) {
                    f0Var.getClass();
                    z = false;
                    if (!f0Var.f) {
                        ArrayList<g0> arrayListA = h0.a(f0Var.a);
                        ArrayList arrayList = new ArrayList();
                        for (g0 g0Var : arrayListA) {
                            d0 d0Var = (d0) mapB.get(g0Var.a);
                            kotlin.k kVar = d0Var != null ? new kotlin.k(g0Var, d0Var) : null;
                            if (kVar != null) {
                                arrayList.add(kVar);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            z = true;
                        } else {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    kotlin.k kVar2 = (kotlin.k) it.next();
                                    g0 g0Var2 = (g0) kVar2.e;
                                    d0 d0Var2 = (d0) kVar2.y;
                                    boolean zA = kotlin.jvm.internal.l.a(f0Var.a(), g0Var2.a);
                                    int i = g0Var2.b;
                                    if (zA) {
                                        if (i != d0Var2.a || !kotlin.jvm.internal.l.a((String) f0Var.d.getValue(), d0Var2.b)) {
                                        }
                                    } else if (i != d0Var2.a) {
                                    }
                                } else {
                                    z = true;
                                }
                            }
                        }
                    }
                    if (z) {
                        Log.d("FirebaseSessions", "Cold app start detected");
                    }
                } else {
                    Log.d("FirebaseSessions", "No process data map");
                    z = true;
                }
                boolean zD = e1Var.d(k0Var2);
                if (z) {
                    mapB = f0Var.b(kotlin.collections.v.e);
                } else if (zD) {
                    mapB = f0Var.b(mapB);
                }
                p0 p0Var = z ? null : k0Var2.a;
                if (!zE && !z) {
                    return zD ? k0.a(k0Var2, null, null, f0Var.b(mapB), 3) : k0Var2;
                }
                p0 p0VarA = e1Var.b.a(p0Var);
                t0 t0Var = e1Var.c;
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(t0Var.e), null, null, new k2(t0Var, p0VarA, null), 3, null);
                f0Var.f = true;
                return new k0(p0VarA, null, mapB);
        }
    }
}
