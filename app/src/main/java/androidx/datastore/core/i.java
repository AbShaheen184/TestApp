package androidx.datastore.core;

import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final /* synthetic */ Mutex a;
    public final /* synthetic */ kotlin.jvm.internal.v b;
    public final /* synthetic */ kotlin.jvm.internal.z c;
    public final /* synthetic */ z d;

    public i(Mutex mutex, kotlin.jvm.internal.v vVar, kotlin.jvm.internal.z zVar, z zVar2) {
        this.a = mutex;
        this.b = vVar;
        this.c = zVar;
        this.d = zVar2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b3 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:21:0x004f, B:36:0x00ab, B:38:0x00b3), top: B:53:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(androidx.compose.animation.core.g gVar, kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        h hVar;
        Mutex mutex;
        z zVar;
        kotlin.jvm.internal.v vVar;
        kotlin.jvm.internal.z zVar2;
        kotlin.jvm.functions.p pVar;
        Mutex mutex2;
        Mutex mutex3;
        z zVar3;
        Object obj;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i = hVar.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.E = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj2 = hVar.C;
        int i2 = hVar.E;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            if (i2 == 0) {
                kotlin.a.e(obj2);
                hVar.e = gVar;
                mutex = this.a;
                hVar.y = mutex;
                kotlin.jvm.internal.v vVar2 = this.b;
                hVar.z = vVar2;
                kotlin.jvm.internal.z zVar4 = this.c;
                hVar.A = zVar4;
                zVar = this.d;
                hVar.B = zVar;
                hVar.E = 1;
                if (mutex.lock(null, hVar) != aVar) {
                    vVar = vVar2;
                    zVar2 = zVar4;
                    pVar = gVar;
                }
                return aVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = hVar.z;
                    zVar2 = (kotlin.jvm.internal.z) hVar.y;
                    mutex2 = (Mutex) hVar.e;
                    try {
                        kotlin.a.e(obj2);
                        zVar2.e = obj;
                        Object obj3 = zVar2.e;
                        mutex2.unlock(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                zVar3 = (z) hVar.z;
                zVar2 = (kotlin.jvm.internal.z) hVar.y;
                mutex3 = (Mutex) hVar.e;
                try {
                    kotlin.a.e(obj2);
                    if (!kotlin.jvm.internal.l.a(obj2, zVar2.e)) {
                        hVar.e = mutex3;
                        hVar.y = zVar2;
                        hVar.z = obj2;
                        hVar.E = 3;
                        if (zVar3.k(obj2, false, hVar) != aVar) {
                            obj = obj2;
                            mutex2 = mutex3;
                            zVar2.e = obj;
                        }
                        return aVar;
                    }
                    mutex2 = mutex3;
                    Object obj4 = zVar2.e;
                    mutex2.unlock(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2 = mutex3;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            z zVar5 = hVar.B;
            zVar2 = hVar.A;
            vVar = (kotlin.jvm.internal.v) hVar.z;
            Mutex mutex4 = (Mutex) hVar.y;
            kotlin.jvm.functions.p pVar2 = (kotlin.jvm.functions.p) hVar.e;
            kotlin.a.e(obj2);
            zVar = zVar5;
            pVar = pVar2;
            mutex = mutex4;
            if (vVar.e) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = zVar2.e;
            hVar.e = mutex;
            hVar.y = zVar2;
            hVar.z = zVar;
            hVar.A = null;
            hVar.B = null;
            hVar.E = 2;
            Object objInvoke = pVar.invoke(obj5, hVar);
            if (objInvoke != aVar) {
                mutex3 = mutex;
                obj2 = objInvoke;
                zVar3 = zVar;
                if (!kotlin.jvm.internal.l.a(obj2, zVar2.e)) {
                    hVar.e = mutex3;
                    hVar.y = zVar2;
                    hVar.z = obj2;
                    hVar.E = 3;
                    if (zVar3.k(obj2, false, hVar) != aVar) {
                        obj = obj2;
                        mutex2 = mutex3;
                        zVar2.e = obj;
                    }
                } else {
                    mutex2 = mutex3;
                }
                Object obj6 = zVar2.e;
                mutex2.unlock(null);
                return obj6;
            }
            return aVar;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }
}
