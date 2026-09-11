package androidx.datastore.core;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements e {
    public final d0 a;
    public final androidx.compose.ui.draw.i b;
    public final CoroutineScope c;
    public final Flow d;
    public final Mutex e;
    public int f;
    public Job g;
    public final a0 h;
    public final com.google.firebase.messaging.o i;
    public final kotlin.o j;
    public final kotlin.o k;
    public final c1 l;

    public z(d0 d0Var, List list, androidx.compose.ui.draw.i iVar, CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        this.a = d0Var;
        this.b = iVar;
        this.c = coroutineScope;
        kotlin.coroutines.d dVar = null;
        this.d = FlowKt.flow(new androidx.compose.animation.b0(this, dVar, 16));
        this.e = MutexKt.Mutex$default(false, 1, null);
        this.h = new a0();
        this.i = new com.google.firebase.messaging.o(this, list);
        final int i = 0;
        this.j = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: androidx.datastore.core.f
            public final /* synthetic */ z y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() throws IOException {
                switch (i) {
                    case 0:
                        d0 d0Var2 = this.y.a;
                        File canonicalFile = ((File) d0Var2.c.invoke()).getCanonicalFile();
                        synchronized (d0.e) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = d0.d;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new g0(canonicalFile, d0Var2.a, (k0) d0Var2.b.invoke(canonicalFile), new androidx.activity.w(canonicalFile, 23));
                    default:
                        return ((g0) ((h1) this.y.j.getValue())).c;
                }
            }
        });
        final int i2 = 1;
        this.k = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: androidx.datastore.core.f
            public final /* synthetic */ z y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() throws IOException {
                switch (i2) {
                    case 0:
                        d0 d0Var2 = this.y.a;
                        File canonicalFile = ((File) d0Var2.c.invoke()).getCanonicalFile();
                        synchronized (d0.e) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = d0.d;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new g0(canonicalFile, d0Var2.a, (k0) d0Var2.b.invoke(canonicalFile), new androidx.activity.w(canonicalFile, 23));
                    default:
                        return ((g0) ((h1) this.y.j.getValue())).c;
                }
            }
        });
        this.l = new c1(coroutineScope, new androidx.compose.ui.text.font.e(this, 2), new androidx.compose.ui.text.x(19), new androidx.activity.compose.p(this, dVar, 25));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(z zVar, kotlin.coroutines.jvm.internal.c cVar) {
        p pVar;
        Mutex mutex;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i = pVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                pVar.A = i - Integer.MIN_VALUE;
            } else {
                pVar = new p(zVar, cVar);
            }
        } else {
            pVar = new p(zVar, cVar);
        }
        Object obj = pVar.y;
        int i2 = pVar.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            Mutex mutex2 = zVar.e;
            pVar.e = mutex2;
            pVar.A = 1;
            Object objLock = mutex2.lock(null, pVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objLock == aVar) {
                return aVar;
            }
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mutex = pVar.e;
            kotlin.a.e(obj);
        }
        try {
            int i3 = zVar.f - 1;
            zVar.f = i3;
            if (i3 == 0) {
                Job job = zVar.g;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                zVar.g = null;
            }
            return kotlin.y.a;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(z zVar, l0 l0Var, kotlin.coroutines.jvm.internal.c cVar) {
        q qVar;
        CompletableDeferred completableDeferred;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i = qVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                qVar.A = i - Integer.MIN_VALUE;
            } else {
                qVar = new q(zVar, cVar);
            }
        } else {
            qVar = new q(zVar, cVar);
        }
        Object lVar = qVar.y;
        int i2 = qVar.A;
        if (i2 == 0) {
            kotlin.a.e(lVar);
            CompletableDeferred completableDeferred2 = l0Var.b;
            try {
                kotlin.coroutines.i iVarPlus = l0Var.d.plus(qVar.getContext());
                androidx.activity.compose.p pVar = new androidx.activity.compose.p(zVar, l0Var, null, 23);
                qVar.e = completableDeferred2;
                qVar.A = 1;
                Object objWithContext = BuildersKt.withContext(iVarPlus, pVar, qVar);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objWithContext == aVar) {
                    return aVar;
                }
                lVar = objWithContext;
                completableDeferred = completableDeferred2;
            } catch (Throwable th) {
                th = th;
                completableDeferred = completableDeferred2;
                lVar = new kotlin.l(th);
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            completableDeferred = qVar.e;
            try {
                kotlin.a.e(lVar);
            } catch (Throwable th2) {
                th = th2;
                lVar = new kotlin.l(th);
            }
        }
        CompletableDeferredKt.completeWith(completableDeferred, lVar);
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(z zVar, kotlin.coroutines.jvm.internal.c cVar) {
        r rVar;
        Mutex mutex;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i = rVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                rVar.A = i - Integer.MIN_VALUE;
            } else {
                rVar = new r(zVar, cVar);
            }
        } else {
            rVar = new r(zVar, cVar);
        }
        Object obj = rVar.y;
        int i2 = rVar.A;
        kotlin.coroutines.d dVar = null;
        if (i2 == 0) {
            kotlin.a.e(obj);
            mutex = zVar.e;
            rVar.e = mutex;
            rVar.A = 1;
            Object objLock = mutex.lock(null, rVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objLock == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Mutex mutex2 = rVar.e;
            kotlin.a.e(obj);
            mutex = mutex2;
        }
        try {
            int i3 = zVar.f + 1;
            zVar.f = i3;
            if (i3 == 1) {
                zVar.g = BuildersKt__Builders_commonKt.launch$default(zVar.c, null, null, new k(zVar, dVar, 1), 3, null);
            }
            return kotlin.y.a;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r1.E(r0) == r4) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(androidx.datastore.core.z r6, kotlin.coroutines.jvm.internal.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof androidx.datastore.core.s
            if (r0 == 0) goto L13
            r0 = r7
            androidx.datastore.core.s r0 = (androidx.datastore.core.s) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            androidx.datastore.core.s r0 = new androidx.datastore.core.s
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.y
            int r1 = r0.A
            r2 = 2
            r3 = 1
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            int r0 = r0.e
            kotlin.a.e(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5c
        L2c:
            r7 = move-exception
            goto L63
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L35:
            kotlin.a.e(r7)
            goto L49
        L39:
            kotlin.a.e(r7)
            androidx.datastore.core.k0 r7 = r6.i()
            r0.A = r3
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r4) goto L49
            goto L5b
        L49:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            com.google.firebase.messaging.o r1 = r6.i     // Catch: java.lang.Throwable -> L5f
            r0.e = r7     // Catch: java.lang.Throwable -> L5f
            r0.A = r2     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r1.E(r0)     // Catch: java.lang.Throwable -> L5f
            if (r6 != r4) goto L5c
        L5b:
            return r4
        L5c:
            kotlin.y r6 = kotlin.y.a
            return r6
        L5f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L63:
            androidx.datastore.core.a0 r6 = r6.h
            androidx.datastore.core.w0 r1 = new androidx.datastore.core.w0
            r1.<init>(r7, r0)
            r6.c(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.z.f(androidx.datastore.core.z, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (r10 == r6) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
    
        if (r10 == r6) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(androidx.datastore.core.z r8, boolean r9, kotlin.coroutines.d r10) {
        /*
            androidx.datastore.core.a0 r0 = r8.h
            boolean r1 = r10 instanceof androidx.datastore.core.t
            if (r1 == 0) goto L15
            r1 = r10
            androidx.datastore.core.t r1 = (androidx.datastore.core.t) r1
            int r2 = r1.B
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.B = r2
            goto L1a
        L15:
            androidx.datastore.core.t r1 = new androidx.datastore.core.t
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.z
            int r2 = r1.B
            r3 = 3
            r4 = 2
            r5 = 1
            kotlin.coroutines.intrinsics.a r6 = kotlin.coroutines.intrinsics.a.e
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L30
            kotlin.a.e(r10)
            goto La5
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r8)
        L35:
            r8 = 0
            return r8
        L37:
            kotlin.a.e(r10)
            goto L8d
        L3b:
            boolean r9 = r1.e
            androidx.datastore.core.g1 r2 = r1.y
            kotlin.a.e(r10)
            goto L5f
        L43:
            kotlin.a.e(r10)
            androidx.datastore.core.g1 r2 = r0.b()
            boolean r10 = r2 instanceof androidx.datastore.core.i1
            if (r10 != 0) goto Lb9
            androidx.datastore.core.k0 r10 = r8.i()
            r1.y = r2
            r1.e = r9
            r1.B = r5
            java.lang.Object r10 = r10.c(r1)
            if (r10 != r6) goto L5f
            goto La4
        L5f:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            boolean r5 = r2 instanceof androidx.datastore.core.c
            if (r5 == 0) goto L6f
            r7 = r2
            androidx.datastore.core.c r7 = (androidx.datastore.core.c) r7
            int r7 = r7.a
            goto L70
        L6f:
            r7 = -1
        L70:
            if (r5 == 0) goto L75
            if (r10 != r7) goto L75
            return r2
        L75:
            r10 = 0
            if (r9 == 0) goto L90
            androidx.datastore.core.k0 r9 = r8.i()
            androidx.compose.foundation.text.contextmenu.internal.h r2 = new androidx.compose.foundation.text.contextmenu.internal.h
            r3 = 2
            r2.<init>(r8, r10, r3)
            r1.y = r10
            r1.B = r4
            java.lang.Object r10 = r9.d(r2, r1)
            if (r10 != r6) goto L8d
            goto La4
        L8d:
            kotlin.k r10 = (kotlin.k) r10
            goto La7
        L90:
            androidx.datastore.core.k0 r9 = r8.i()
            androidx.datastore.core.u r2 = new androidx.datastore.core.u
            r4 = 0
            r2.<init>(r8, r7, r10, r4)
            r1.y = r10
            r1.B = r3
            java.lang.Object r10 = r9.b(r2, r1)
            if (r10 != r6) goto La5
        La4:
            return r6
        La5:
            kotlin.k r10 = (kotlin.k) r10
        La7:
            java.lang.Object r8 = r10.e
            androidx.datastore.core.g1 r8 = (androidx.datastore.core.g1) r8
            java.lang.Object r9 = r10.y
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb8
            r0.c(r8)
        Lb8:
            return r8
        Lb9:
            java.lang.String r8 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            net.luminis.tls.engine.impl.c.r(r8)
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.z.g(androidx.datastore.core.z, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0089 A[Catch: b -> 0x0057, TryCatch #2 {b -> 0x0057, blocks: (B:19:0x0052, B:54:0x00e3, B:24:0x005c, B:51:0x00c7, B:32:0x0071, B:40:0x0089, B:42:0x008f, B:36:0x007a, B:48:0x00b6), top: B:81:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:63:0x011b A[Catch: all -> 0x0145, TryCatch #1 {all -> 0x0145, blocks: (B:61:0x010b, B:63:0x011b, B:64:0x0120), top: B:80:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0120 A[Catch: all -> 0x0145, TRY_LEAVE, TryCatch #1 {all -> 0x0145, blocks: (B:61:0x010b, B:63:0x011b, B:64:0x0120), top: B:80:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0131  */
    /* JADX WARN: Code duplicated, block: B:70:0x0139  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(z zVar, boolean z, kotlin.coroutines.jvm.internal.c cVar) {
        v vVar;
        kotlin.jvm.internal.z zVar2;
        b bVar;
        kotlin.jvm.internal.z zVar3;
        kotlin.jvm.internal.x xVar;
        b bVar2;
        w wVar;
        Object objD;
        kotlin.jvm.internal.x xVar2;
        kotlin.jvm.internal.z zVar4;
        int iHashCode;
        Object objC;
        boolean z2;
        int i;
        Object obj;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i2 = vVar.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.E = i2 - Integer.MIN_VALUE;
            } else {
                vVar = new v(zVar, cVar);
            }
        } else {
            vVar = new v(zVar, cVar);
        }
        Object objC2 = vVar.C;
        int i3 = vVar.E;
        kotlin.coroutines.d dVar = null;
        Object cVar2 = kotlin.coroutines.intrinsics.a.e;
        try {
            switch (i3) {
                case 0:
                    kotlin.a.e(objC2);
                    if (z) {
                        vVar.e = z;
                        vVar.E = 1;
                        objC2 = zVar.j(vVar);
                        if (objC2 != cVar2) {
                            if (objC2 != null) {
                                iHashCode = objC2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            k0 k0VarI = zVar.i();
                            vVar.y = objC2;
                            vVar.e = z;
                            vVar.B = iHashCode;
                            vVar.E = 2;
                            objC = k0VarI.c(vVar);
                            if (objC != cVar2) {
                                int i4 = iHashCode;
                                z2 = z;
                                i = i4;
                                obj = objC2;
                                objC2 = objC;
                                return new c(obj, i, ((Number) objC2).intValue());
                            }
                        }
                    } else {
                        k0 k0VarI2 = zVar.i();
                        vVar.e = z;
                        vVar.E = 3;
                        objC2 = k0VarI2.c(vVar);
                        if (objC2 != cVar2) {
                            int iIntValue = ((Number) objC2).intValue();
                            k0 k0VarI3 = zVar.i();
                            kotlin.jvm.functions.p uVar = new u(zVar, iIntValue, dVar, 1);
                            vVar.e = z;
                            vVar.E = 4;
                            objC2 = k0VarI3.b(uVar, vVar);
                            if (objC2 == cVar2) {
                            }
                            return (c) objC2;
                        }
                    }
                    return cVar2;
                case 1:
                    z = vVar.e;
                    kotlin.a.e(objC2);
                    if (objC2 != null) {
                        iHashCode = objC2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    k0 k0VarI4 = zVar.i();
                    vVar.y = objC2;
                    vVar.e = z;
                    vVar.B = iHashCode;
                    vVar.E = 2;
                    objC = k0VarI4.c(vVar);
                    if (objC != cVar2) {
                        int i5 = iHashCode;
                        z2 = z;
                        i = i5;
                        obj = objC2;
                        objC2 = objC;
                        return new c(obj, i, ((Number) objC2).intValue());
                    }
                    return cVar2;
                case 2:
                    i = vVar.B;
                    z2 = vVar.e;
                    obj = vVar.y;
                    try {
                        kotlin.a.e(objC2);
                        return new c(obj, i, ((Number) objC2).intValue());
                    } catch (b e) {
                        e = e;
                        z = z2;
                        zVar2 = new kotlin.jvm.internal.z();
                        androidx.compose.ui.draw.i iVar = zVar.b;
                        vVar.y = e;
                        vVar.z = zVar2;
                        vVar.A = zVar2;
                        vVar.e = z;
                        vVar.E = 5;
                        Object objInvoke = iVar.a.invoke(e);
                        if (objInvoke != cVar2) {
                            bVar = e;
                            objC2 = objInvoke;
                            zVar3 = zVar2;
                            zVar3.e = objC2;
                            xVar = new kotlin.jvm.internal.x();
                            try {
                                wVar = new w(zVar2, zVar, xVar, (kotlin.coroutines.d) null);
                                vVar.y = bVar;
                                vVar.z = zVar2;
                                vVar.A = xVar;
                                vVar.E = 6;
                                if (z) {
                                    objD = wVar.invoke(vVar);
                                } else {
                                    objD = zVar.i().d(new androidx.compose.foundation.text.selection.v0(wVar, dVar, 2), vVar);
                                }
                                if (objD != cVar2) {
                                    xVar2 = xVar;
                                    zVar4 = zVar2;
                                    Object obj2 = zVar4.e;
                                    cVar2 = new c(obj2, obj2 != null ? obj2.hashCode() : 0, xVar2.e);
                                }
                            } catch (Throwable th) {
                                th = th;
                                bVar2 = bVar;
                                kotlin.a.a(bVar2, th);
                                throw bVar2;
                            }
                        }
                        return cVar2;
                    }
                case 3:
                    z = vVar.e;
                    kotlin.a.e(objC2);
                    int iIntValue2 = ((Number) objC2).intValue();
                    k0 k0VarI5 = zVar.i();
                    kotlin.jvm.functions.p uVar2 = new u(zVar, iIntValue2, dVar, 1);
                    vVar.e = z;
                    vVar.E = 4;
                    objC2 = k0VarI5.b(uVar2, vVar);
                    if (objC2 == cVar2) {
                        return cVar2;
                    }
                    return (c) objC2;
                case 4:
                    boolean z3 = vVar.e;
                    kotlin.a.e(objC2);
                    return (c) objC2;
                case 5:
                    z = vVar.e;
                    kotlin.jvm.internal.z zVar5 = (kotlin.jvm.internal.z) vVar.A;
                    kotlin.jvm.internal.z zVar6 = vVar.z;
                    bVar = (b) vVar.y;
                    kotlin.a.e(objC2);
                    zVar3 = zVar5;
                    zVar2 = zVar6;
                    zVar3.e = objC2;
                    xVar = new kotlin.jvm.internal.x();
                    wVar = new w(zVar2, zVar, xVar, (kotlin.coroutines.d) null);
                    vVar.y = bVar;
                    vVar.z = zVar2;
                    vVar.A = xVar;
                    vVar.E = 6;
                    if (z) {
                        objD = wVar.invoke(vVar);
                    } else {
                        objD = zVar.i().d(new androidx.compose.foundation.text.selection.v0(wVar, dVar, 2), vVar);
                    }
                    if (objD != cVar2) {
                        xVar2 = xVar;
                        zVar4 = zVar2;
                        Object obj3 = zVar4.e;
                        cVar2 = new c(obj3, obj3 != null ? obj3.hashCode() : 0, xVar2.e);
                    }
                    return cVar2;
                case 6:
                    xVar2 = (kotlin.jvm.internal.x) vVar.A;
                    zVar4 = vVar.z;
                    bVar2 = (b) vVar.y;
                    try {
                        kotlin.a.e(objC2);
                        Object obj4 = zVar4.e;
                        cVar2 = new c(obj4, obj4 != null ? obj4.hashCode() : 0, xVar2.e);
                        return cVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        kotlin.a.a(bVar2, th);
                        throw bVar2;
                    }
                default:
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (b e2) {
            e = e2;
        }
    }

    @Override // androidx.datastore.core.e
    public final Object a(kotlin.jvm.functions.p pVar, kotlin.coroutines.d dVar) {
        l1 l1Var = (l1) dVar.getContext().get(k1.e);
        if (l1Var != null) {
            l1Var.a(this);
        }
        return BuildersKt.withContext(new l1(l1Var, this), new androidx.compose.animation.b0(this, pVar, (kotlin.coroutines.d) null), dVar);
    }

    @Override // androidx.datastore.core.e
    public final Flow b() {
        return this.d;
    }

    public final k0 i() {
        return (k0) this.k.getValue();
    }

    public final Object j(kotlin.coroutines.jvm.internal.c cVar) {
        int i = 3;
        return ((g0) ((h1) this.j.getValue())).a(new l(i, (kotlin.coroutines.d) null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(Object obj, boolean z, kotlin.coroutines.jvm.internal.c cVar) {
        x xVar;
        kotlin.jvm.internal.x xVar2;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i = xVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                xVar.A = i - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object obj2 = xVar.y;
        int i2 = xVar.A;
        if (i2 == 0) {
            kotlin.a.e(obj2);
            kotlin.jvm.internal.x xVar3 = new kotlin.jvm.internal.x();
            h1 h1Var = (h1) this.j.getValue();
            y yVar = new y(xVar3, this, obj, z, null);
            xVar.e = xVar3;
            xVar.A = 1;
            Object objB = ((g0) h1Var).b(yVar, xVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objB == aVar) {
                return aVar;
            }
            xVar2 = xVar3;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xVar2 = xVar.e;
            kotlin.a.e(obj2);
        }
        return new Integer(xVar2.e);
    }
}
