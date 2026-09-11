package com.app.mlounge.data.repository;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.sync.Semaphore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public ProducerScope A;
    public int B;
    public int C;
    public int D;
    public final /* synthetic */ r E;
    public final /* synthetic */ com.app.mlounge.data.providers.k0 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ ProducerScope J;
    public Semaphore e;
    public com.app.mlounge.data.providers.k0 y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, com.app.mlounge.data.providers.k0 k0Var, String str, int i, int i2, ProducerScope producerScope, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.E = rVar;
        this.F = k0Var;
        this.G = str;
        this.H = i;
        this.I = i2;
        this.J = producerScope;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new l(this.E, this.F, this.G, this.H, this.I, this.J, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #3 {all -> 0x0027, blocks: (B:8:0x0022, B:47:0x00f9, B:49:0x00fd, B:52:0x0134), top: B:57:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0134 A[Catch: all -> 0x0027, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0027, blocks: (B:8:0x0022, B:47:0x00f9, B:49:0x00fd, B:52:0x0134), top: B:57:0x0022 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00fd, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        com.app.mlounge.data.providers.k0 k0Var;
        String str;
        Semaphore semaphore;
        int i;
        ProducerScope producerScope;
        int i2;
        com.app.mlounge.data.providers.k0 k0Var2;
        com.app.mlounge.data.providers.k0 k0Var3;
        ProducerScope producerScope2;
        String str2;
        Integer num;
        Integer num2;
        Object objA;
        com.app.mlounge.data.providers.k0 k0Var4;
        int i3;
        int i4;
        ProducerScope producerScope3;
        Semaphore semaphore2;
        b0 b0Var;
        int i5 = this.D;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            try {
                try {
                    if (i5 == 0) {
                        kotlin.a.e(obj);
                        Semaphore semaphore3 = this.E.o;
                        this.e = semaphore3;
                        k0Var = this.F;
                        this.y = k0Var;
                        str = this.G;
                        this.z = str;
                        ProducerScope producerScope4 = this.J;
                        this.A = producerScope4;
                        int i6 = this.H;
                        this.B = i6;
                        int i7 = this.I;
                        this.C = i7;
                        this.D = 1;
                        if (semaphore3.acquire(this) != aVar) {
                            semaphore = semaphore3;
                            i = i7;
                            producerScope = producerScope4;
                            i2 = i6;
                        }
                        return aVar;
                    }
                    if (i5 == 1) {
                        i = this.C;
                        i2 = this.B;
                        ProducerScope producerScope5 = this.A;
                        str = (String) this.z;
                        k0Var = this.y;
                        Semaphore semaphore4 = this.e;
                        kotlin.a.e(obj);
                        semaphore = semaphore4;
                        producerScope = producerScope5;
                    } else if (i5 == 2) {
                        int i8 = this.C;
                        int i9 = this.B;
                        producerScope3 = (ProducerScope) this.z;
                        com.app.mlounge.data.providers.k0 k0Var5 = this.y;
                        Semaphore semaphore5 = this.e;
                        try {
                            kotlin.a.e(obj);
                            semaphore = semaphore5;
                            k0Var4 = k0Var5;
                            i4 = i9;
                            i3 = i8;
                            objA = obj;
                            try {
                                List list = (List) objA;
                                kotlin.o oVar = com.app.mlounge.util.a.a;
                                k0Var4.getClass();
                                list.size();
                                b0Var = new b0(k0Var4.getName(), list, null, true);
                                this.e = semaphore;
                                this.y = k0Var4;
                                this.z = producerScope3;
                                this.A = null;
                                this.B = i4;
                                this.C = i3;
                                this.D = 3;
                                if (producerScope3.send(b0Var, this) != aVar) {
                                    semaphore2 = semaphore;
                                }
                                return aVar;
                            } catch (Exception e) {
                                e = e;
                                producerScope2 = producerScope3;
                                k0Var3 = k0Var4;
                                semaphore2 = semaphore;
                                if (!(e instanceof CancellationException)) {
                                    throw e;
                                }
                                kotlin.o oVar2 = com.app.mlounge.util.a.a;
                                com.app.mlounge.util.a.b("ChqRepo", "Provider " + k0Var3.getName() + " failed: " + e.getMessage(), e);
                                producerScope2.mo28trySendJP2dKIU(new b0(k0Var3.getName(), kotlin.collections.u.e, null, false));
                            }
                        } catch (Exception e2) {
                            e = e2;
                            producerScope2 = producerScope3;
                            k0Var3 = k0Var5;
                            semaphore2 = semaphore5;
                            if (!(e instanceof CancellationException)) {
                                throw e;
                            }
                            kotlin.o oVar3 = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.b("ChqRepo", "Provider " + k0Var3.getName() + " failed: " + e.getMessage(), e);
                            producerScope2.mo28trySendJP2dKIU(new b0(k0Var3.getName(), kotlin.collections.u.e, null, false));
                        } catch (Throwable th) {
                            th = th;
                            semaphore2 = semaphore5;
                            semaphore2.release();
                            throw th;
                        }
                    } else {
                        if (i5 != 3) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        producerScope2 = (ProducerScope) this.z;
                        k0Var3 = this.y;
                        semaphore2 = this.e;
                        try {
                            try {
                                kotlin.a.e(obj);
                            } catch (Throwable th2) {
                                th = th2;
                                semaphore2.release();
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            if (!(e instanceof CancellationException)) {
                                throw e;
                            }
                            kotlin.o oVar4 = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.b("ChqRepo", "Provider " + k0Var3.getName() + " failed: " + e.getMessage(), e);
                            producerScope2.mo28trySendJP2dKIU(new b0(k0Var3.getName(), kotlin.collections.u.e, null, false));
                        }
                    }
                    semaphore2.release();
                    return kotlin.y.a;
                    objA = k0Var2.a(str2, "tv", num, num2, this);
                    if (objA != aVar) {
                        k0Var4 = k0Var2;
                        i3 = 0;
                        i4 = 0;
                        producerScope3 = producerScope;
                        List list2 = (List) objA;
                        kotlin.o oVar5 = com.app.mlounge.util.a.a;
                        k0Var4.getClass();
                        list2.size();
                        b0Var = new b0(k0Var4.getName(), list2, null, true);
                        this.e = semaphore;
                        this.y = k0Var4;
                        this.z = producerScope3;
                        this.A = null;
                        this.B = i4;
                        this.C = i3;
                        this.D = 3;
                        if (producerScope3.send(b0Var, this) != aVar) {
                            semaphore2 = semaphore;
                            semaphore2.release();
                            return kotlin.y.a;
                        }
                    }
                    return aVar;
                } catch (Exception e4) {
                    e = e4;
                    k0Var3 = k0Var2;
                    producerScope2 = producerScope;
                    semaphore2 = semaphore;
                    if (!(e instanceof CancellationException)) {
                        throw e;
                    }
                    kotlin.o oVar6 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.b("ChqRepo", "Provider " + k0Var3.getName() + " failed: " + e.getMessage(), e);
                    producerScope2.mo28trySendJP2dKIU(new b0(k0Var3.getName(), kotlin.collections.u.e, null, false));
                    semaphore2.release();
                    return kotlin.y.a;
                }
                kotlin.o oVar7 = com.app.mlounge.util.a.a;
                k0Var.getClass();
                str2 = str;
                num = new Integer(i2);
                num2 = new Integer(i);
                this.e = semaphore;
                this.y = k0Var;
                this.z = producerScope;
                this.A = null;
                this.B = 0;
                this.C = 0;
                this.D = 2;
                k0Var2 = k0Var;
            } catch (Throwable th3) {
                th = th3;
                semaphore2 = semaphore;
                semaphore2.release();
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            k0Var2 = k0Var;
        }
    }
}
