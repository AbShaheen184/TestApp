package com.appsalt.internal;

import java.util.LinkedHashMap;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 {
    public final coil3.memory.c a;
    public final CoroutineScope b;
    public CoroutineScope c;
    public final Mutex d;
    public final Mutex e;
    public final LinkedHashMap f;
    public kotlin.coroutines.jvm.internal.i g;
    public Channel h;
    public final LinkedHashMap i;

    public e3(coil3.memory.c cVar) {
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        this.a = cVar;
        this.b = CoroutineScope;
        this.c = CoroutineScopeKt.plus(CoroutineScope, JobKt__JobKt.Job$default((Job) null, 1, (Object) null));
        this.d = MutexKt.Mutex$default(false, 1, null);
        this.e = MutexKt.Mutex$default(false, 1, null);
        this.f = new LinkedHashMap();
        this.g = new androidx.activity.compose.n(2, 8, null);
        this.h = ChannelKt.Channel$default(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, null, null, 6, null);
        this.i = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(e3 e3Var, j4 j4Var, kotlin.coroutines.jvm.internal.c cVar) {
        w1 w1Var;
        Mutex mutex;
        e3 e3Var2;
        Mutex mutex2;
        coil3.memory.c cVar2;
        byte b;
        i3 i3VarB;
        e3Var.getClass();
        if (cVar instanceof w1) {
            w1Var = (w1) cVar;
            int i = w1Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                w1Var.C = i - Integer.MIN_VALUE;
            } else {
                w1Var = new w1(e3Var, cVar);
            }
        } else {
            w1Var = new w1(e3Var, cVar);
        }
        Object obj = w1Var.A;
        int i2 = w1Var.C;
        kotlin.y yVar = kotlin.y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            if (i2 == 0) {
                kotlin.a.e(obj);
                mutex = e3Var.d;
                w1Var.e = e3Var;
                w1Var.y = j4Var;
                w1Var.z = mutex;
                w1Var.C = 1;
                if (mutex.lock(null, w1Var) != aVar) {
                }
                return aVar;
            }
            if (i2 == 1) {
                Mutex mutex3 = w1Var.z;
                j4Var = w1Var.y;
                e3 e3Var3 = w1Var.e;
                kotlin.a.e(obj);
                mutex = mutex3;
                e3Var = e3Var3;
            } else {
                if (i2 != 2) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutex2 = w1Var.z;
                j4Var = w1Var.y;
                e3Var2 = w1Var.e;
                kotlin.a.e(obj);
            }
            try {
                LinkedHashMap linkedHashMap = e3Var2.i;
                cVar2 = e3Var2.a;
                linkedHashMap.put(j4Var.a, ChannelKt.Channel$default(128, null, null, 6, null));
                mutex2.unlock(null);
                b = j4Var.d;
                if (b != 0) {
                    if (b == 1) {
                        i3VarB = b0.b(cVar2, 1);
                    }
                    return yVar;
                }
                i3VarB = b0.b(cVar2, 2);
                BuildersKt__Builders_commonKt.launch$default(e3Var2.c, null, null, new k2(i3VarB, j4Var, e3Var2, null), 3, null);
                return yVar;
            } catch (Throwable th) {
                mutex2.unlock(null);
                throw th;
            }
            boolean zContainsKey = e3Var.f.containsKey(j4Var.a);
            mutex.unlock(null);
            if (!zContainsKey) {
                Mutex mutex4 = e3Var.e;
                w1Var.e = e3Var;
                w1Var.y = j4Var;
                w1Var.z = mutex4;
                w1Var.C = 2;
                if (mutex4.lock(null, w1Var) != aVar) {
                    e3Var2 = e3Var;
                    mutex2 = mutex4;
                    LinkedHashMap linkedHashMap2 = e3Var2.i;
                    cVar2 = e3Var2.a;
                    linkedHashMap2.put(j4Var.a, ChannelKt.Channel$default(128, null, null, 6, null));
                    mutex2.unlock(null);
                    b = j4Var.d;
                    if (b != 0) {
                        i3VarB = b0.b(cVar2, 2);
                    } else if (b == 1) {
                        i3VarB = b0.b(cVar2, 1);
                    }
                    BuildersKt__Builders_commonKt.launch$default(e3Var2.c, null, null, new k2(i3VarB, j4Var, e3Var2, null), 3, null);
                }
                return aVar;
            }
            return yVar;
        } catch (Throwable th2) {
            mutex.unlock(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r11v6, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    public static final Object b(e3 e3Var, String str, kotlin.coroutines.jvm.internal.c cVar) {
        i1 i1Var;
        Mutex mutex;
        e3 e3Var2;
        String str2;
        Mutex mutex2;
        e3 e3Var3;
        Mutex mutex3;
        Channel channel;
        e3Var.getClass();
        if (cVar instanceof i1) {
            i1Var = (i1) cVar;
            int i = i1Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                i1Var.C = i - Integer.MIN_VALUE;
            } else {
                i1Var = new i1(e3Var, cVar);
            }
        } else {
            i1Var = new i1(e3Var, cVar);
        }
        Object obj = i1Var.A;
        int i2 = i1Var.C;
        int i3 = 2;
        kotlin.coroutines.d dVar = null;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            if (i2 == 0) {
                kotlin.a.e(obj);
                mutex = e3Var.d;
                i1Var.e = e3Var;
                i1Var.y = str;
                i1Var.z = mutex;
                i1Var.C = 1;
                if (mutex.lock(null, i1Var) != aVar) {
                }
                return aVar;
            }
            if (i2 == 1) {
                Mutex mutex4 = i1Var.z;
                str = i1Var.y;
                e3 e3Var4 = i1Var.e;
                kotlin.a.e(obj);
                mutex = mutex4;
                e3Var = e3Var4;
            } else {
                if (i2 == 2) {
                    str2 = i1Var.y;
                    e3Var2 = i1Var.e;
                    kotlin.a.e(obj);
                    e3 e3Var5 = e3Var2;
                    str = str2;
                    e3Var = e3Var5;
                    mutex2 = e3Var.e;
                    i1Var.e = e3Var;
                    i1Var.y = str;
                    i1Var.z = mutex2;
                    i1Var.C = 3;
                    if (mutex2.lock(null, i1Var) != aVar) {
                        e3Var3 = e3Var;
                        mutex3 = mutex2;
                    }
                    return aVar;
                }
                if (i2 != 3) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutex3 = i1Var.z;
                str = i1Var.y;
                e3Var3 = i1Var.e;
                kotlin.a.e(obj);
            }
            try {
                channel = (Channel) e3Var3.i.get(str);
                mutex3.unlock(null);
                if (channel != null) {
                    SendChannel.DefaultImpls.close$default(channel, null, 1, null);
                }
                return kotlin.y.a;
            } catch (Throwable th) {
                mutex3.unlock(null);
                throw th;
            }
            i3 i3Var = (i3) e3Var.f.remove(str);
            mutex.unlock(null);
            if (i3Var != null) {
                i3Var.b(new androidx.activity.compose.n(i3, 6, dVar));
                i3Var.f(new androidx.activity.compose.n(i3, 7, dVar));
                ?? r11 = e3Var.g;
                e4 e4Var = new e4(str);
                i1Var.e = e3Var;
                i1Var.y = str;
                i1Var.z = null;
                i1Var.C = 2;
                if (r11.invoke(e4Var, i1Var) != aVar) {
                    String str3 = str;
                    e3Var2 = e3Var;
                    str2 = str3;
                    e3 e3Var6 = e3Var2;
                    str = str2;
                    e3Var = e3Var6;
                    mutex2 = e3Var.e;
                    i1Var.e = e3Var;
                    i1Var.y = str;
                    i1Var.z = mutex2;
                    i1Var.C = 3;
                    if (mutex2.lock(null, i1Var) != aVar) {
                        e3Var3 = e3Var;
                        mutex3 = mutex2;
                        channel = (Channel) e3Var3.i.get(str);
                        mutex3.unlock(null);
                        if (channel != null) {
                            SendChannel.DefaultImpls.close$default(channel, null, 1, null);
                        }
                        return kotlin.y.a;
                    }
                }
            } else {
                mutex2 = e3Var.e;
                i1Var.e = e3Var;
                i1Var.y = str;
                i1Var.z = mutex2;
                i1Var.C = 3;
                if (mutex2.lock(null, i1Var) != aVar) {
                    e3Var3 = e3Var;
                    mutex3 = mutex2;
                    channel = (Channel) e3Var3.i.get(str);
                    mutex3.unlock(null);
                    if (channel != null) {
                        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
                    }
                    return kotlin.y.a;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            mutex.unlock(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(e3 e3Var, String str, byte[] bArr, kotlin.coroutines.jvm.internal.c cVar) {
        o2 o2Var;
        Mutex mutex;
        e3Var.getClass();
        if (cVar instanceof o2) {
            o2Var = (o2) cVar;
            int i = o2Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                o2Var.D = i - Integer.MIN_VALUE;
            } else {
                o2Var = new o2(e3Var, cVar);
            }
        } else {
            o2Var = new o2(e3Var, cVar);
        }
        Object obj = o2Var.B;
        int i2 = o2Var.D;
        if (i2 == 0) {
            kotlin.a.e(obj);
            mutex = e3Var.e;
            o2Var.e = e3Var;
            o2Var.y = str;
            o2Var.z = bArr;
            o2Var.A = mutex;
            o2Var.D = 1;
            Object objLock = mutex.lock(null, o2Var);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objLock == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Mutex mutex2 = o2Var.A;
            bArr = o2Var.z;
            str = o2Var.y;
            e3 e3Var2 = o2Var.e;
            kotlin.a.e(obj);
            mutex = mutex2;
            e3Var = e3Var2;
        }
        try {
            Channel channel = (Channel) e3Var.i.get(str);
            mutex.unlock(null);
            if (channel != null) {
                ChannelResult.m42boximpl(channel.mo28trySendJP2dKIU(bArr));
            }
            return kotlin.y.a;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
