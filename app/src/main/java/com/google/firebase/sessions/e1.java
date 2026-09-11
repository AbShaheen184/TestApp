package com.google.firebase.sessions;

import android.util.Log;
import com.app.mlounge.ui.viewmodel.w1;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {
    public final com.google.firebase.sessions.settings.j a;
    public final v0 b;
    public final t0 c;
    public final j1 d;
    public final androidx.datastore.core.e e;
    public final f0 f;
    public final kotlin.coroutines.i g;
    public k0 h;
    public boolean i;
    public boolean j;
    public String k;

    public e1(com.google.firebase.sessions.settings.j jVar, v0 v0Var, t0 t0Var, j1 j1Var, androidx.datastore.core.e eVar, f0 f0Var, kotlin.coroutines.i iVar) {
        jVar.getClass();
        v0Var.getClass();
        t0Var.getClass();
        j1Var.getClass();
        eVar.getClass();
        f0Var.getClass();
        iVar.getClass();
        this.a = jVar;
        this.b = v0Var;
        this.c = t0Var;
        this.d = j1Var;
        this.e = eVar;
        this.f = f0Var;
        this.g = iVar;
        this.k = "";
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(iVar), null, null, new a1(this, null, 0), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(e1 e1Var, String str, b1 b1Var, kotlin.coroutines.d dVar) {
        d1 d1Var;
        String str2;
        if (dVar instanceof d1) {
            d1Var = (d1) dVar;
            int i = d1Var.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                d1Var.B = i - Integer.MIN_VALUE;
            } else {
                d1Var = new d1(e1Var, dVar);
            }
        } else {
            d1Var = new d1(e1Var, dVar);
        }
        Object objB = d1Var.z;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = d1Var.B;
        if (i2 == 0) {
            kotlin.a.e(objB);
            if (kotlin.jvm.internal.l.a(e1Var.k, str)) {
                return kotlin.y.a;
            }
            e1Var.k = str;
            com.google.firebase.sessions.api.c cVar = com.google.firebase.sessions.api.c.a;
            d1Var.e = str;
            d1Var.y = b1Var;
            d1Var.B = 1;
            objB = cVar.b(d1Var);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b1Var = d1Var.y;
            str = d1Var.e;
            kotlin.a.e(objB);
        }
        for (com.google.firebase.crashlytics.internal.common.j jVar : ((Map) objB).values()) {
            com.google.firebase.sessions.api.e eVar = new com.google.firebase.sessions.api.e(str);
            jVar.getClass();
            String str3 = "App Quality Sessions session changed: " + eVar;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
            com.google.firebase.crashlytics.internal.common.i iVar = jVar.b;
            synchronized (iVar) {
                if (!Objects.equals(iVar.c, str)) {
                    com.google.firebase.crashlytics.internal.common.i.a(iVar.a, iVar.b, str);
                    iVar.c = str;
                }
            }
            int iOrdinal = b1Var.ordinal();
            if (iOrdinal == 0) {
                str2 = "Notified " + com.google.firebase.sessions.api.d.e + " of new session " + str;
            } else {
                if (iOrdinal != 1) {
                    coil3.g.a();
                    return null;
                }
                str2 = "Notified " + com.google.firebase.sessions.api.d.e + " of new fallback session " + str;
            }
            Log.d("FirebaseSessions", str2);
        }
        return kotlin.y.a;
    }

    public final void b() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.g), null, null, new a1(this, null, 1), 3, null);
    }

    public final void c() {
        this.i = true;
        k0 k0Var = this.h;
        if (k0Var == null) {
            this.j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        kotlin.coroutines.d dVar = null;
        if (k0Var == null) {
            kotlin.jvm.internal.l.f("localSessionData");
            throw null;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
        if (e(k0Var) || d(k0Var)) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.g), null, null, new w1(this, k0Var, dVar, 11), 3, null);
        }
    }

    public final boolean d(k0 k0Var) {
        Map map = k0Var.c;
        boolean z = true;
        f0 f0Var = this.f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + f0Var.a());
            return true;
        }
        f0Var.getClass();
        d0 d0Var = (d0) map.get(f0Var.a());
        if (d0Var != null && d0Var.a == f0Var.c && kotlin.jvm.internal.l.a(d0Var.b, (String) f0Var.d.getValue())) {
            z = false;
        }
        if (z) {
            Log.d("FirebaseSessions", "Process " + f0Var.a() + " is stale");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    public final boolean e(k0 k0Var) {
        kotlin.time.a aVarB;
        long jU;
        i1 i1Var = k0Var.b;
        p0 p0Var = k0Var.a;
        if (i1Var == null) {
            Log.d("FirebaseSessions", "Session " + p0Var.a + " has not backgrounded yet");
            return false;
        }
        this.d.getClass();
        i1 i1VarA = j1.a();
        kotlin.time.g gVar = kotlin.time.a.y;
        long jV = com.google.common.base.b.v(i1VarA.a - i1Var.a, kotlin.time.c.MILLISECONDS);
        com.google.firebase.sessions.settings.j jVar = this.a;
        kotlin.time.a aVarB2 = jVar.a.b();
        if (aVarB2 != null) {
            jU = aVarB2.e;
            if (jU <= 0 || kotlin.time.a.h(jU)) {
                aVarB = jVar.b.b();
                if (aVarB != null) {
                    jU = aVarB.e;
                    if (jU > 0 || kotlin.time.a.h(jU)) {
                        jU = com.google.common.base.b.u(30, kotlin.time.c.MINUTES);
                    }
                } else {
                    jU = com.google.common.base.b.u(30, kotlin.time.c.MINUTES);
                }
            }
        } else {
            aVarB = jVar.b.b();
            if (aVarB != null) {
                jU = aVarB.e;
                if (jU > 0) {
                    jU = com.google.common.base.b.u(30, kotlin.time.c.MINUTES);
                } else {
                    jU = com.google.common.base.b.u(30, kotlin.time.c.MINUTES);
                }
            } else {
                jU = com.google.common.base.b.u(30, kotlin.time.c.MINUTES);
            }
        }
        boolean z = kotlin.time.a.e(jV, jU) > 0;
        if (z) {
            Log.d("FirebaseSessions", "Session " + p0Var.a + " is expired");
        }
        return z;
    }
}
