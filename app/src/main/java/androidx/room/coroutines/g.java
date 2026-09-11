package androidx.room.coroutines;

import androidx.datastore.preferences.protobuf.h1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.ThreadContextElementKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements b {
    public final ThreadLocal A;
    public volatile boolean B;
    public final long C;
    public final int D;
    public final v e;
    public final v y;
    public final com.google.android.material.shape.g z;

    public g(final androidx.media3.common.util.b bVar, final String str, int i) {
        str.getClass();
        this.z = new com.google.android.material.shape.g();
        this.A = new ThreadLocal();
        kotlin.time.g gVar = kotlin.time.a.y;
        this.C = com.google.common.base.b.u(30, kotlin.time.c.SECONDS);
        this.D = 2;
        if (i <= 0) {
            net.luminis.tls.engine.impl.c.o("Maximum number of readers must be greater than 0");
            throw null;
        }
        final int i2 = 0;
        this.e = new v(i, new kotlin.jvm.functions.a() { // from class: androidx.room.coroutines.c
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        androidx.sqlite.a aVarT = bVar.t(str);
                        h1.l(aVarT, "PRAGMA query_only = 1");
                        return aVarT;
                    default:
                        return bVar.t(str);
                }
            }
        });
        final int i3 = 1;
        this.y = new v(1, new kotlin.jvm.functions.a() { // from class: androidx.room.coroutines.c
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        androidx.sqlite.a aVarT = bVar.t(str);
                        h1.l(aVarT, "PRAGMA query_only = 1");
                        return aVarT;
                    default:
                        return bVar.t(str);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:68:0x013b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0147 A[Catch: all -> 0x01a0, TRY_LEAVE, TryCatch #0 {all -> 0x01a0, blocks: (B:64:0x0120, B:69:0x013c, B:71:0x0147, B:86:0x01a4, B:87:0x01ab), top: B:107:0x0120 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0178  */
    /* JADX WARN: Code duplicated, block: B:77:0x0180  */
    /* JADX WARN: Code duplicated, block: B:79:0x0184  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a4 A[Catch: all -> 0x01a0, TRY_ENTER, TryCatch #0 {all -> 0x01a0, blocks: (B:64:0x0120, B:69:0x013c, B:71:0x0147, B:86:0x01a4, B:87:0x01ab), top: B:107:0x0120 }] */
    @Override // androidx.room.coroutines.b
    public final Object D(boolean z, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        e eVar;
        kotlin.jvm.internal.z zVar;
        Throwable th;
        v vVar;
        kotlin.coroutines.i context;
        kotlin.jvm.functions.p pVar2;
        com.google.android.material.shape.g gVar;
        v vVar2;
        kotlin.jvm.internal.z zVar2;
        boolean z2;
        Object obj;
        kotlin.jvm.internal.z zVar3;
        c0 c0Var;
        boolean z3 = z;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i = eVar.G;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.G = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objWithContext = eVar.E;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i2 = eVar.G;
        kotlin.coroutines.d dVar = null;
        if (i2 != 0) {
            if (i2 == 1) {
                kotlin.a.e(objWithContext);
                return objWithContext;
            }
            if (i2 == 2) {
                kotlin.a.e(objWithContext);
                return objWithContext;
            }
            if (i2 == 3) {
                z3 = eVar.e;
                gVar = eVar.D;
                kotlin.jvm.internal.z zVar4 = eVar.C;
                kotlin.coroutines.i iVar = eVar.B;
                kotlin.jvm.internal.z zVar5 = eVar.A;
                vVar2 = (v) eVar.z;
                pVar2 = (kotlin.jvm.functions.p) eVar.y;
                try {
                    kotlin.a.e(objWithContext);
                    zVar2 = zVar4;
                    zVar = zVar5;
                    context = iVar;
                    try {
                        j jVar = (j) objWithContext;
                        jVar.getClass();
                        context.getClass();
                        jVar.z = context;
                        jVar.A = new Throwable();
                        if (this.e == this.y && z3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zVar2.e = new c0(gVar, jVar, z2);
                        obj = zVar.e;
                        if (obj != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        c0 c0Var2 = (c0) obj;
                        a aVar2 = new a(this.z, c0Var2);
                        ThreadLocal threadLocal = this.A;
                        threadLocal.getClass();
                        kotlin.coroutines.i iVarK = com.google.android.material.resources.g.k(ThreadContextElementKt.asContextElement(threadLocal, c0Var2), aVar2);
                        f fVar = new f(pVar2, zVar, dVar, 1);
                        eVar.y = vVar2;
                        eVar.z = zVar;
                        eVar.A = null;
                        eVar.B = null;
                        eVar.C = null;
                        eVar.D = null;
                        eVar.G = 4;
                        objWithContext = BuildersKt.withContext(iVarK, fVar, eVar);
                        if (objWithContext != aVar) {
                            zVar3 = zVar;
                            vVar = vVar2;
                        }
                        return aVar;
                    } catch (Throwable th2) {
                        th = th2;
                        vVar = vVar2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    zVar = zVar5;
                    vVar = vVar2;
                    throw th;
                }
            }
            if (i2 != 4) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zVar3 = (kotlin.jvm.internal.z) eVar.z;
            vVar = (v) eVar.y;
            try {
                kotlin.a.e(objWithContext);
            } catch (Throwable th4) {
                zVar = zVar3;
                th = th4;
            }
            c0Var = (c0) zVar3.e;
            if (c0Var != null) {
                if (!c0Var.e) {
                    c0Var.e = true;
                    if (c0Var.b.e.H()) {
                        h1.l(c0Var.b, "ROLLBACK TRANSACTION");
                    }
                }
                j jVar2 = c0Var.b;
                jVar2.z = null;
                jVar2.A = null;
                vVar.e(jVar2);
            }
            return objWithContext;
        }
        kotlin.a.e(objWithContext);
        if (this.B) {
            h1.y(21, "Connection pool is closed");
            throw null;
        }
        c0 c0Var3 = (c0) this.A.get();
        if (c0Var3 == null) {
            a aVar3 = (a) eVar.getContext().get(this.z);
            c0Var3 = aVar3 != null ? aVar3.y : null;
        }
        if (c0Var3 == null) {
            v vVar3 = z3 ? this.e : this.y;
            zVar = new kotlin.jvm.internal.z();
            try {
                context = eVar.getContext();
                com.google.android.material.shape.g gVar2 = this.z;
                long j = this.C;
                androidx.compose.foundation.text.r rVar = new androidx.compose.foundation.text.r(this, z3);
                eVar.y = pVar;
                eVar.z = vVar3;
                eVar.A = zVar;
                eVar.B = context;
                eVar.C = zVar;
                eVar.D = gVar2;
                eVar.e = z3;
                eVar.G = 3;
                Object objB = vVar3.b(j, rVar, eVar);
                if (objB != aVar) {
                    pVar2 = pVar;
                    gVar = gVar2;
                    vVar2 = vVar3;
                    objWithContext = objB;
                    zVar2 = zVar;
                    j jVar3 = (j) objWithContext;
                    jVar3.getClass();
                    context.getClass();
                    jVar3.z = context;
                    jVar3.A = new Throwable();
                    if (this.e == this.y) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    zVar2.e = new c0(gVar, jVar3, z2);
                    obj = zVar.e;
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    c0 c0Var4 = (c0) obj;
                    a aVar4 = new a(this.z, c0Var4);
                    ThreadLocal threadLocal2 = this.A;
                    threadLocal2.getClass();
                    kotlin.coroutines.i iVarK2 = com.google.android.material.resources.g.k(ThreadContextElementKt.asContextElement(threadLocal2, c0Var4), aVar4);
                    f fVar2 = new f(pVar2, zVar, dVar, 1);
                    eVar.y = vVar2;
                    eVar.z = zVar;
                    eVar.A = null;
                    eVar.B = null;
                    eVar.C = null;
                    eVar.D = null;
                    eVar.G = 4;
                    objWithContext = BuildersKt.withContext(iVarK2, fVar2, eVar);
                    if (objWithContext != aVar) {
                        zVar3 = zVar;
                        vVar = vVar2;
                        c0Var = (c0) zVar3.e;
                        if (c0Var != null) {
                            if (!c0Var.e) {
                                c0Var.e = true;
                                if (c0Var.b.e.H()) {
                                    h1.l(c0Var.b, "ROLLBACK TRANSACTION");
                                }
                            }
                            j jVar4 = c0Var.b;
                            jVar4.z = null;
                            jVar4.A = null;
                            vVar.e(jVar4);
                        }
                        return objWithContext;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                vVar = vVar3;
            }
        } else {
            if (!z3 && c0Var3.c) {
                h1.y(1, "Cannot upgrade connection from reader to writer");
                throw null;
            }
            if (eVar.getContext().get(this.z) == null) {
                a aVar5 = new a(this.z, c0Var3);
                ThreadLocal threadLocal3 = this.A;
                threadLocal3.getClass();
                kotlin.coroutines.i iVarK3 = com.google.android.material.resources.g.k(ThreadContextElementKt.asContextElement(threadLocal3, c0Var3), aVar5);
                f fVar3 = new f(pVar, c0Var3, dVar, 0);
                eVar.G = 1;
                Object objWithContext2 = BuildersKt.withContext(iVarK3, fVar3, eVar);
                if (objWithContext2 != aVar) {
                    return objWithContext2;
                }
            } else {
                eVar.G = 2;
                Object objInvoke = pVar.invoke(c0Var3, eVar);
                if (objInvoke != aVar) {
                    return objInvoke;
                }
            }
        }
        return aVar;
        try {
            throw th;
        } catch (Throwable th6) {
            try {
                c0 c0Var5 = (c0) zVar.e;
                if (c0Var5 == null) {
                    throw th6;
                }
                if (!c0Var5.e) {
                    c0Var5.e = true;
                    if (c0Var5.b.e.H()) {
                        h1.l(c0Var5.b, "ROLLBACK TRANSACTION");
                    }
                }
                j jVar5 = c0Var5.b;
                jVar5.z = null;
                jVar5.A = null;
                vVar.e(jVar5);
                throw th6;
            } catch (Throwable th7) {
                kotlin.a.a(th, th7);
                throw th6;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.B) {
            return;
        }
        this.B = true;
        this.e.c();
        this.y.c();
    }

    public g(androidx.media3.common.util.b bVar) {
        this.z = new com.google.android.material.shape.g();
        this.A = new ThreadLocal();
        kotlin.time.g gVar = kotlin.time.a.y;
        this.C = com.google.common.base.b.u(30, kotlin.time.c.SECONDS);
        this.D = 2;
        v vVar = new v(1, new d(bVar, 0));
        this.e = vVar;
        this.y = vVar;
    }
}
