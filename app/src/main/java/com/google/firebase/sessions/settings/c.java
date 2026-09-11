package com.google.firebase.sessions.settings;

import android.os.Build;
import android.util.Log;
import androidx.compose.runtime.t1;
import com.app.mlounge.ui.viewmodel.w1;
import com.google.firebase.sessions.j1;
import com.google.firebase.sessions.z;
import java.util.Map;
import kotlin.collections.a0;
import kotlin.y;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements o {
    public static final int g;
    public static final kotlin.text.i h;
    public final j1 a;
    public final com.google.firebase.installations.d b;
    public final com.google.firebase.sessions.b c;
    public final d d;
    public final n e;
    public final Mutex f;

    static {
        kotlin.time.g gVar = kotlin.time.a.y;
        g = (int) kotlin.time.a.j(com.google.common.base.b.u(24, kotlin.time.c.HOURS), kotlin.time.c.SECONDS);
        h = new kotlin.text.i("com/google/firebase/sessions//");
    }

    public c(j1 j1Var, com.google.firebase.installations.d dVar, com.google.firebase.sessions.b bVar, d dVar2, n nVar) {
        j1Var.getClass();
        dVar.getClass();
        bVar.getClass();
        dVar2.getClass();
        nVar.getClass();
        this.a = j1Var;
        this.b = dVar;
        this.c = bVar;
        this.d = dVar2;
        this.e = nVar;
        this.f = MutexKt.Mutex$default(false, 1, null);
    }

    @Override // com.google.firebase.sessions.settings.o
    public final Boolean a() {
        return this.e.a().a;
    }

    @Override // com.google.firebase.sessions.settings.o
    public final kotlin.time.a b() {
        Integer num = this.e.a().c;
        if (num == null) {
            return null;
        }
        kotlin.time.g gVar = kotlin.time.a.y;
        return new kotlin.time.a(com.google.common.base.b.u(num.intValue(), kotlin.time.c.SECONDS));
    }

    @Override // com.google.firebase.sessions.settings.o
    public final Double c() {
        return this.e.a().b;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b2 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:21:0x004f, B:43:0x00a8, B:45:0x00b2, B:48:0x00bb, B:35:0x0085, B:37:0x008d, B:40:0x0096), top: B:59:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb A[Catch: all -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:21:0x004f, B:43:0x00a8, B:45:0x00b2, B:48:0x00bb, B:35:0x0085, B:37:0x008d, B:40:0x0096), top: B:59:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0149  */
    /* JADX WARN: Code duplicated, block: B:54:0x014d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00bb, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // com.google.firebase.sessions.settings.o
    public final Object d(kotlin.coroutines.d dVar) throws Throwable {
        b bVar;
        Mutex mutex;
        Mutex mutex2;
        c cVar;
        String str;
        Object objWithContext;
        Mutex mutex3;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i = bVar.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.B = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, (kotlin.coroutines.jvm.internal.c) dVar);
            }
        } else {
            bVar = new b(this, (kotlin.coroutines.jvm.internal.c) dVar);
        }
        Object objA = bVar.z;
        ?? r4 = bVar.B;
        int i2 = 2;
        Object obj = y.a;
        kotlin.coroutines.d dVar2 = null;
        Object obj2 = kotlin.coroutines.intrinsics.a.e;
        try {
            if (r4 == 0) {
                kotlin.a.e(objA);
                Mutex mutex4 = this.f;
                if (!mutex4.isLocked() && !this.e.b()) {
                    return obj;
                }
                bVar.e = this;
                bVar.y = mutex4;
                bVar.B = 1;
                if (mutex4.lock(null, bVar) != obj2) {
                    mutex2 = mutex4;
                    cVar = this;
                }
                return obj2;
            }
            if (r4 == 1) {
                mutex2 = bVar.y;
                cVar = (c) bVar.e;
                kotlin.a.e(objA);
            } else {
                if (r4 == 2) {
                    mutex2 = bVar.y;
                    cVar = (c) bVar.e;
                    kotlin.a.e(objA);
                    str = ((z) objA).a;
                    if (str.equals("")) {
                        Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                        mutex2.unlock(null);
                        return obj;
                    }
                    kotlin.k kVar = new kotlin.k("X-Crashlytics-Installation-ID", str);
                    String str2 = Build.MANUFACTURER + Build.MODEL;
                    cVar.getClass();
                    kotlin.text.i iVar = h;
                    kotlin.k kVar2 = new kotlin.k("X-Crashlytics-Device-Model", iVar.g(str2));
                    String str3 = Build.VERSION.INCREMENTAL;
                    str3.getClass();
                    kotlin.k kVar3 = new kotlin.k("X-Crashlytics-OS-Build-Version", iVar.g(str3));
                    String str4 = Build.VERSION.RELEASE;
                    str4.getClass();
                    kotlin.k kVar4 = new kotlin.k("X-Crashlytics-OS-Display-Version", iVar.g(str4));
                    cVar.c.getClass();
                    Map mapV = a0.v(kVar, kVar2, kVar3, kVar4, new kotlin.k("X-Crashlytics-API-Client-Version", "3.0.5"));
                    Log.d("FirebaseSessions", "Fetching settings from server.");
                    d dVar3 = cVar.d;
                    w1 w1Var = new w1(cVar, dVar2, 12);
                    t1 t1Var = new t1(i2, 11, dVar2);
                    bVar.e = mutex2;
                    bVar.y = null;
                    bVar.B = 3;
                    objWithContext = BuildersKt.withContext(dVar3.b, new androidx.compose.animation.core.f(dVar3, mapV, w1Var, t1Var, (kotlin.coroutines.d) null), bVar);
                    if (objWithContext != obj2) {
                        objWithContext = obj;
                    }
                    if (objWithContext != obj2) {
                        mutex3 = mutex2;
                    }
                    return obj2;
                }
                if (r4 != 3) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutex = (Mutex) bVar.e;
                try {
                    kotlin.a.e(objA);
                    mutex3 = mutex;
                } catch (Throwable th) {
                    th = th;
                    mutex.unlock(null);
                    throw th;
                }
            }
            mutex3.unlock(null);
            return obj;
            if (!cVar.e.b()) {
                Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                mutex2.unlock(null);
                return obj;
            }
            com.google.firebase.sessions.y yVar = z.c;
            com.google.firebase.installations.d dVar4 = cVar.b;
            bVar.e = cVar;
            bVar.y = mutex2;
            bVar.B = 2;
            objA = yVar.a(dVar4, bVar);
            if (objA != obj2) {
                str = ((z) objA).a;
                if (str.equals("")) {
                    Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    mutex2.unlock(null);
                    return obj;
                }
                kotlin.k kVar5 = new kotlin.k("X-Crashlytics-Installation-ID", str);
                String str5 = Build.MANUFACTURER + Build.MODEL;
                cVar.getClass();
                kotlin.text.i iVar2 = h;
                kotlin.k kVar6 = new kotlin.k("X-Crashlytics-Device-Model", iVar2.g(str5));
                String str6 = Build.VERSION.INCREMENTAL;
                str6.getClass();
                kotlin.k kVar7 = new kotlin.k("X-Crashlytics-OS-Build-Version", iVar2.g(str6));
                String str7 = Build.VERSION.RELEASE;
                str7.getClass();
                kotlin.k kVar8 = new kotlin.k("X-Crashlytics-OS-Display-Version", iVar2.g(str7));
                cVar.c.getClass();
                Map mapV2 = a0.v(kVar5, kVar6, kVar7, kVar8, new kotlin.k("X-Crashlytics-API-Client-Version", "3.0.5"));
                Log.d("FirebaseSessions", "Fetching settings from server.");
                d dVar5 = cVar.d;
                w1 w1Var2 = new w1(cVar, dVar2, 12);
                t1 t1Var2 = new t1(i2, 11, dVar2);
                bVar.e = mutex2;
                bVar.y = null;
                bVar.B = 3;
                objWithContext = BuildersKt.withContext(dVar5.b, new androidx.compose.animation.core.f(dVar5, mapV2, w1Var2, t1Var2, (kotlin.coroutines.d) null), bVar);
                if (objWithContext != obj2) {
                    objWithContext = obj;
                }
                if (objWithContext != obj2) {
                    mutex3 = mutex2;
                    mutex3.unlock(null);
                    return obj;
                }
            }
            return obj2;
        } catch (Throwable th2) {
            th = th2;
            mutex = r4;
        }
    }
}
