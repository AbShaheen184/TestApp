package com.app.mlounge.data.repository;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.sync.Semaphore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public ProducerScope A;
    public int B;
    public int C;
    public int D;
    public final /* synthetic */ r E;
    public final /* synthetic */ com.app.mlounge.data.providers.k0 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ ProducerScope H;
    public Semaphore e;
    public com.app.mlounge.data.providers.k0 y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r rVar, com.app.mlounge.data.providers.k0 k0Var, String str, ProducerScope producerScope, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.E = rVar;
        this.F = k0Var;
        this.G = str;
        this.H = producerScope;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new h(this.E, this.F, this.G, this.H, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8 A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #2 {all -> 0x0025, blocks: (B:8:0x0020, B:48:0x00e4, B:50:0x00e8, B:53:0x011f), top: B:58:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x011f A[Catch: all -> 0x0025, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0025, blocks: (B:8:0x0020, B:48:0x00e4, B:50:0x00e8, B:53:0x011f), top: B:58:0x000b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x00e8, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Semaphore semaphore;
        com.app.mlounge.data.providers.k0 k0Var;
        String str;
        ProducerScope producerScope;
        Semaphore semaphore2;
        int i;
        ProducerScope producerScope2;
        String str2;
        com.app.mlounge.data.providers.k0 k0Var2;
        com.app.mlounge.data.providers.k0 k0Var3;
        ProducerScope producerScope3;
        Object objA;
        int i2;
        com.app.mlounge.data.providers.k0 k0Var4;
        int i3;
        Semaphore semaphore3;
        b0 b0Var;
        int i4 = this.D;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            try {
                try {
                    try {
                        if (i4 == 0) {
                            kotlin.a.e(obj);
                            Semaphore semaphore4 = this.E.o;
                            this.e = semaphore4;
                            k0Var = this.F;
                            this.y = k0Var;
                            str = this.G;
                            this.z = str;
                            producerScope = this.H;
                            this.A = producerScope;
                            this.B = 0;
                            this.D = 1;
                            if (semaphore4.acquire(this) != aVar) {
                                semaphore2 = semaphore4;
                                i = 0;
                            }
                            return aVar;
                        }
                        if (i4 != 1) {
                            if (i4 == 2) {
                                i3 = this.C;
                                int i5 = this.B;
                                ProducerScope producerScope4 = (ProducerScope) this.z;
                                com.app.mlounge.data.providers.k0 k0Var5 = this.y;
                                Semaphore semaphore5 = this.e;
                                try {
                                    kotlin.a.e(obj);
                                    semaphore2 = semaphore5;
                                    k0Var4 = k0Var5;
                                    i2 = i5;
                                    producerScope3 = producerScope4;
                                    objA = obj;
                                    try {
                                        List list = (List) objA;
                                        kotlin.o oVar = com.app.mlounge.util.a.a;
                                        k0Var4.getClass();
                                        list.size();
                                        b0Var = new b0(k0Var4.getName(), list, null, true);
                                        this.e = semaphore2;
                                        this.y = k0Var4;
                                        this.z = producerScope3;
                                        this.A = null;
                                        this.B = i2;
                                        this.C = i3;
                                        this.D = 3;
                                        if (producerScope3.send(b0Var, this) != aVar) {
                                            semaphore3 = semaphore2;
                                        }
                                        return aVar;
                                    } catch (Exception e) {
                                        e = e;
                                        k0Var3 = k0Var4;
                                        semaphore3 = semaphore2;
                                        if (e instanceof CancellationException) {
                                            throw e;
                                        }
                                        kotlin.o oVar2 = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.b("ChqRepo", "Provider " + k0Var3.getName() + " failed: " + e.getMessage(), e);
                                        producerScope3.mo28trySendJP2dKIU(new b0(k0Var3.getName(), kotlin.collections.u.e, null, false));
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    producerScope3 = producerScope4;
                                    k0Var3 = k0Var5;
                                    semaphore3 = semaphore5;
                                    if (e instanceof CancellationException) {
                                        throw e;
                                    }
                                    kotlin.o oVar3 = com.app.mlounge.util.a.a;
                                    com.app.mlounge.util.a.b("ChqRepo", "Provider " + k0Var3.getName() + " failed: " + e.getMessage(), e);
                                    producerScope3.mo28trySendJP2dKIU(new b0(k0Var3.getName(), kotlin.collections.u.e, null, false));
                                } catch (Throwable th) {
                                    th = th;
                                    semaphore = semaphore5;
                                    semaphore.release();
                                    throw th;
                                }
                            } else {
                                if (i4 != 3) {
                                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                producerScope3 = (ProducerScope) this.z;
                                k0Var3 = this.y;
                                semaphore3 = this.e;
                                try {
                                    kotlin.a.e(obj);
                                } catch (Exception e3) {
                                    e = e3;
                                    if (e instanceof CancellationException) {
                                        throw e;
                                    }
                                    kotlin.o oVar4 = com.app.mlounge.util.a.a;
                                    com.app.mlounge.util.a.b("ChqRepo", "Provider " + k0Var3.getName() + " failed: " + e.getMessage(), e);
                                    producerScope3.mo28trySendJP2dKIU(new b0(k0Var3.getName(), kotlin.collections.u.e, null, false));
                                }
                            }
                            if (e instanceof CancellationException) {
                                throw e;
                            }
                            kotlin.o oVar5 = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.b("ChqRepo", "Provider " + k0Var3.getName() + " failed: " + e.getMessage(), e);
                            producerScope3.mo28trySendJP2dKIU(new b0(k0Var3.getName(), kotlin.collections.u.e, null, false));
                        } else {
                            i = this.B;
                            producerScope = this.A;
                            str = (String) this.z;
                            k0Var = this.y;
                            Semaphore semaphore6 = this.e;
                            kotlin.a.e(obj);
                            semaphore2 = semaphore6;
                        }
                        semaphore3.release();
                        return kotlin.y.a;
                        objA = k0Var2.a(str2, "movie", null, null, this);
                        if (objA != aVar) {
                            i2 = i;
                            k0Var4 = k0Var2;
                            i3 = 0;
                            producerScope3 = producerScope2;
                            List list2 = (List) objA;
                            kotlin.o oVar6 = com.app.mlounge.util.a.a;
                            k0Var4.getClass();
                            list2.size();
                            b0Var = new b0(k0Var4.getName(), list2, null, true);
                            this.e = semaphore2;
                            this.y = k0Var4;
                            this.z = producerScope3;
                            this.A = null;
                            this.B = i2;
                            this.C = i3;
                            this.D = 3;
                            if (producerScope3.send(b0Var, this) != aVar) {
                                semaphore3 = semaphore2;
                                semaphore3.release();
                                return kotlin.y.a;
                            }
                        }
                        return aVar;
                    } catch (Exception e4) {
                        e = e4;
                        k0Var3 = k0Var2;
                        producerScope3 = producerScope2;
                        semaphore3 = semaphore2;
                        if (e instanceof CancellationException) {
                            throw e;
                        }
                        kotlin.o oVar7 = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.b("ChqRepo", "Provider " + k0Var3.getName() + " failed: " + e.getMessage(), e);
                        producerScope3.mo28trySendJP2dKIU(new b0(k0Var3.getName(), kotlin.collections.u.e, null, false));
                        semaphore3.release();
                        return kotlin.y.a;
                    }
                    kotlin.o oVar8 = com.app.mlounge.util.a.a;
                    k0Var.getClass();
                    this.e = semaphore2;
                    this.y = k0Var;
                    this.z = producerScope2;
                    this.A = null;
                    this.B = i;
                    this.C = 0;
                    this.D = 2;
                    k0Var2 = k0Var;
                } catch (Exception e5) {
                    e = e5;
                    k0Var2 = k0Var;
                }
            } catch (Throwable th2) {
                th = th2;
                semaphore = semaphore2;
                semaphore.release();
                throw th;
            }
            producerScope2 = producerScope;
            str2 = str;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
