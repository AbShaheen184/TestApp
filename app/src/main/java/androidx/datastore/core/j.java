package androidx.datastore.core;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.l {
    public Object A;
    public Iterator B;
    public int C;
    public int D;
    public final /* synthetic */ z E;
    public final /* synthetic */ com.google.firebase.messaging.o F;
    public Object e;
    public Serializable y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(z zVar, com.google.firebase.messaging.o oVar, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.E = zVar;
        this.F = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new j(this.E, this.F, dVar);
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        return ((j) create((kotlin.coroutines.d) obj)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:21:0x00a0->B:50:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Mutex mutexMutex$default;
        kotlin.jvm.internal.v vVar;
        kotlin.jvm.internal.z zVar;
        kotlin.jvm.internal.z zVar2;
        Mutex mutex;
        Iterator it;
        Mutex mutex2;
        kotlin.jvm.internal.v vVar2;
        kotlin.jvm.internal.z zVar3;
        i iVar;
        kotlin.jvm.internal.z zVar4;
        kotlin.jvm.internal.v vVar3;
        kotlin.jvm.functions.p pVar;
        Object obj2;
        int iHashCode;
        int i;
        int i2 = this.D;
        com.google.firebase.messaging.o oVar = this.F;
        z zVar5 = this.E;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(obj);
            mutexMutex$default = MutexKt.Mutex$default(false, 1, null);
            vVar = new kotlin.jvm.internal.v();
            zVar = new kotlin.jvm.internal.z();
            this.e = mutexMutex$default;
            this.y = vVar;
            this.z = zVar;
            this.A = zVar;
            this.D = 1;
            obj = z.h(zVar5, true, this);
            if (obj != aVar) {
                zVar2 = zVar;
            }
            return aVar;
        }
        if (i2 == 1) {
            zVar = (kotlin.jvm.internal.z) this.A;
            zVar2 = (kotlin.jvm.internal.z) this.z;
            vVar = (kotlin.jvm.internal.v) this.y;
            mutexMutex$default = (Mutex) this.e;
            kotlin.a.e(obj);
        } else {
            if (i2 == 2) {
                it = this.B;
                iVar = (i) this.A;
                zVar3 = (kotlin.jvm.internal.z) this.z;
                vVar2 = (kotlin.jvm.internal.v) this.y;
                mutex2 = (Mutex) this.e;
                kotlin.a.e(obj);
                while (it.hasNext()) {
                    pVar = (kotlin.jvm.functions.p) it.next();
                    this.e = mutex2;
                    this.y = vVar2;
                    this.z = zVar3;
                    this.A = iVar;
                    this.B = it;
                    this.D = 2;
                    if (pVar.invoke(iVar, this) == aVar) {
                        return aVar;
                    }
                }
                zVar2 = zVar3;
                vVar = vVar2;
                mutex = mutex2;
                oVar.A = null;
                this.e = vVar;
                this.y = zVar2;
                this.z = mutex;
                this.A = null;
                this.B = null;
                this.D = 3;
                if (mutex.lock(null, this) != aVar) {
                    zVar4 = zVar2;
                    vVar3 = vVar;
                    vVar3.e = true;
                    mutex.unlock(null);
                    obj2 = zVar4.e;
                    if (obj2 != null) {
                    }
                    k0 k0VarI = zVar5.i();
                    this.e = obj2;
                    this.y = null;
                    this.z = null;
                    this.C = iHashCode;
                    this.D = 4;
                    obj = k0VarI.c(this);
                    if (obj != aVar) {
                        i = iHashCode;
                    }
                }
                return aVar;
            }
            if (i2 == 3) {
                mutex = (Mutex) this.z;
                zVar4 = (kotlin.jvm.internal.z) this.y;
                vVar3 = (kotlin.jvm.internal.v) this.e;
                kotlin.a.e(obj);
                try {
                    vVar3.e = true;
                    mutex.unlock(null);
                    obj2 = zVar4.e;
                    iHashCode = obj2 != null ? obj2.hashCode() : 0;
                    k0 k0VarI2 = zVar5.i();
                    this.e = obj2;
                    this.y = null;
                    this.z = null;
                    this.C = iHashCode;
                    this.D = 4;
                    obj = k0VarI2.c(this);
                    if (obj != aVar) {
                        i = iHashCode;
                    }
                    return aVar;
                } catch (Throwable th) {
                    mutex.unlock(null);
                    throw th;
                }
            }
            if (i2 != 4) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.C;
            obj2 = this.e;
            kotlin.a.e(obj);
        }
        return new c(obj2, i, ((Number) obj).intValue());
        zVar.e = ((c) obj).b;
        i iVar2 = new i(mutexMutex$default, vVar, zVar2, zVar5);
        List list = (List) oVar.A;
        if (list != null) {
            it = list.iterator();
            mutex2 = mutexMutex$default;
            vVar2 = vVar;
            zVar3 = zVar2;
            iVar = iVar2;
            while (it.hasNext()) {
                pVar = (kotlin.jvm.functions.p) it.next();
                this.e = mutex2;
                this.y = vVar2;
                this.z = zVar3;
                this.A = iVar;
                this.B = it;
                this.D = 2;
                if (pVar.invoke(iVar, this) == aVar) {
                    return aVar;
                }
            }
            zVar2 = zVar3;
            vVar = vVar2;
            mutex = mutex2;
        } else {
            mutex = mutexMutex$default;
        }
        oVar.A = null;
        this.e = vVar;
        this.y = zVar2;
        this.z = mutex;
        this.A = null;
        this.B = null;
        this.D = 3;
        if (mutex.lock(null, this) != aVar) {
            zVar4 = zVar2;
            vVar3 = vVar;
            vVar3.e = true;
            mutex.unlock(null);
            obj2 = zVar4.e;
            if (obj2 != null) {
            }
            k0 k0VarI3 = zVar5.i();
            this.e = obj2;
            this.y = null;
            this.z = null;
            this.C = iHashCode;
            this.D = 4;
            obj = k0VarI3.c(this);
            if (obj != aVar) {
                i = iHashCode;
                return new c(obj2, i, ((Number) obj).intValue());
            }
        }
        return aVar;
    }
}
