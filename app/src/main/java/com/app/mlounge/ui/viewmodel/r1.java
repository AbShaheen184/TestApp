package com.app.mlounge.ui.viewmodel;

import android.content.Context;
import android.net.Uri;
import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends androidx.lifecycle.q0 {
    public final Semaphore A;
    public final Semaphore B;
    public final kotlin.o C;
    public final Context b;
    public final com.app.mlounge.data.repository.r c;
    public final com.app.mlounge.data.local.prefs.y1 d;
    public final com.app.mlounge.data.download.h e;
    public final okhttp3.y f;
    public volatile List g;
    public final MutableStateFlow h;
    public final StateFlow i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public final MutableStateFlow l;
    public final StateFlow m;
    public final MutableStateFlow n;
    public final StateFlow o;
    public final MutableSharedFlow p;
    public final SharedFlow q;
    public final String r;
    public final String s;
    public final int t;
    public final String u;
    public final int v;
    public final int w;
    public final String x;
    public final MutableSharedFlow y;
    public final SharedFlow z;

    public r1(Context context, com.app.mlounge.data.repository.r rVar, com.app.mlounge.data.local.prefs.y1 y1Var, com.app.mlounge.data.download.h hVar, okhttp3.y yVar, androidx.lifecycle.i0 i0Var) {
        rVar.getClass();
        y1Var.getClass();
        hVar.getClass();
        yVar.getClass();
        i0Var.getClass();
        this.b = context;
        this.c = rVar;
        this.d = y1Var;
        this.e = hVar;
        this.f = yVar;
        kotlin.collections.u uVar = kotlin.collections.u.e;
        this.g = uVar;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(uVar);
        this.h = MutableStateFlow;
        this.i = FlowKt.stateIn(new o(MutableStateFlow, this, 1), androidx.lifecycle.l0.g(this), SharingStarted.Companion.getEagerly(), uVar);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.j = MutableStateFlow2;
        this.k = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(uVar);
        this.l = MutableStateFlow3;
        this.m = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(new m(null, null, null, null, 63));
        this.n = MutableStateFlow4;
        this.o = FlowKt.asStateFlow(MutableStateFlow4);
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.p = mutableSharedFlowMutableSharedFlow$default;
        this.q = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        String str = (String) i0Var.a("type");
        this.r = str == null ? "" : str;
        String str2 = (String) i0Var.a("id");
        String str3 = str2 != null ? str2 : "";
        this.s = str3;
        Integer numQ = kotlin.text.r.Q(str3);
        this.t = numQ != null ? numQ.intValue() : 0;
        String str4 = (String) i0Var.a("title");
        String strDecode = Uri.decode(str4 == null ? "Sources" : str4);
        strDecode.getClass();
        this.u = strDecode;
        Integer num = (Integer) i0Var.a("season");
        this.v = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) i0Var.a("episode");
        this.w = num2 != null ? num2.intValue() : 0;
        String str5 = (String) i0Var.a("mode");
        this.x = str5 == null ? "play" : str5;
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.y = mutableSharedFlowMutableSharedFlow$default2;
        this.z = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        m();
        this.A = SemaphoreKt.Semaphore$default(4, 0, 2, null);
        this.B = SemaphoreKt.Semaphore$default(4, 0, 2, null);
        this.C = new kotlin.o(new com.app.mlounge.ui.screens.sources.b(this, 3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object e(r1 r1Var, ChqStream chqStream, kotlin.coroutines.jvm.internal.c cVar) {
        l1 l1Var;
        Exception e;
        ChqStream chqStream2;
        Semaphore semaphore = r1Var.A;
        if (cVar instanceof l1) {
            l1Var = (l1) cVar;
            int i = l1Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                l1Var.A = i - Integer.MIN_VALUE;
            } else {
                l1Var = new l1(r1Var, cVar);
            }
        } else {
            l1Var = new l1(r1Var, cVar);
        }
        Object objWithContext = l1Var.y;
        int i2 = l1Var.A;
        kotlin.coroutines.d dVar = null;
        boolean zBooleanValue = false;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            try {
                if (i2 == 0) {
                    kotlin.a.e(objWithContext);
                    Boolean boolN = chqStream.n();
                    Boolean bool = Boolean.TRUE;
                    if (!kotlin.jvm.internal.l.a(boolN, bool) && !kotlin.jvm.internal.l.a(chqStream.k(), "torrent") && !kotlin.text.r.O(chqStream.m(), "magnet:", false) && kotlin.text.r.O(chqStream.m(), "http", false)) {
                        if (!kotlin.text.k.T(chqStream.m(), "googleusercontent.com", false) && !kotlin.text.k.T(chqStream.m(), ".workers.dev", false) && !kotlin.text.k.T(chqStream.m(), "freehandyflix.online", false) && !kotlin.text.k.T(chqStream.m(), "fsharetv.cc", false)) {
                            l1Var.e = chqStream;
                            l1Var.A = 1;
                            if (semaphore.acquire(l1Var) != aVar) {
                            }
                            return aVar;
                        }
                        kotlin.o oVar = com.app.mlounge.util.a.a;
                        kotlin.text.k.z0(chqStream.m());
                    }
                    return bool;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    chqStream2 = l1Var.e;
                    try {
                        kotlin.a.e(objWithContext);
                        zBooleanValue = ((Boolean) objWithContext).booleanValue();
                    } catch (Exception e2) {
                        e = e2;
                        kotlin.o oVar2 = com.app.mlounge.util.a.a;
                        chqStream2.getClass();
                        e.getMessage();
                    }
                    semaphore.release();
                    return Boolean.valueOf(zBooleanValue);
                }
                chqStream = l1Var.e;
                kotlin.a.e(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                androidx.compose.foundation.text.input.internal.k kVar = new androidx.compose.foundation.text.input.internal.k(chqStream, r1Var, dVar, 15);
                l1Var.e = chqStream;
                l1Var.A = 2;
                objWithContext = BuildersKt.withContext(io2, kVar, l1Var);
                if (objWithContext != aVar) {
                    chqStream2 = chqStream;
                    zBooleanValue = ((Boolean) objWithContext).booleanValue();
                    semaphore.release();
                    return Boolean.valueOf(zBooleanValue);
                }
                return aVar;
            } catch (Exception e3) {
                ChqStream chqStream3 = chqStream;
                e = e3;
                chqStream2 = chqStream3;
                kotlin.o oVar3 = com.app.mlounge.util.a.a;
                chqStream2.getClass();
                e.getMessage();
            }
        } catch (Throwable th) {
            semaphore.release();
            throw th;
        }
    }

    public static final Long f(r1 r1Var, String str, Map map) {
        Long lR;
        String strG;
        r1Var.getClass();
        if (!kotlin.text.k.T(str, "googleusercontent.com", false) && !kotlin.text.k.T(str, ".workers.dev", false)) {
            try {
                okhttp3.a0 a0Var = new okhttp3.a0();
                a0Var.d(str);
                a0Var.c("HEAD", null);
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        a0Var.a((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                okhttp3.y yVar = r1Var.f;
                yVar.getClass();
                okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                try {
                    if (!g0VarE.N || (strG = okhttp3.g0.g("Content-Length", g0VarE)) == null || (lR = kotlin.text.r.R(strG)) == null || lR.longValue() <= 0) {
                        lR = null;
                    }
                    g0VarE.close();
                    return lR;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        com.google.common.base.b.d(g0VarE, th);
                        throw th2;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static final String g(r1 r1Var, long j) {
        if (j >= 1073741824) {
            return String.format(Locale.US, "%.1f GB", Arrays.copyOf(new Object[]{Double.valueOf(j / 1.073741824E9d)}, 1));
        }
        if (j >= 1048576) {
            return String.format(Locale.US, "%.0f MB", Arrays.copyOf(new Object[]{Double.valueOf(j / 1048576.0d)}, 1));
        }
        if (j >= 1024) {
            return String.format(Locale.US, "%.0f KB", Arrays.copyOf(new Object[]{Double.valueOf(j / 1024.0d)}, 1));
        }
        return j + " B";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(r1 r1Var, kotlin.coroutines.jvm.internal.c cVar) {
        o1 o1Var;
        if (cVar instanceof o1) {
            o1Var = (o1) cVar;
            int i = o1Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                o1Var.z = i - Integer.MIN_VALUE;
            } else {
                o1Var = new o1(r1Var, cVar);
            }
        } else {
            o1Var = new o1(r1Var, cVar);
        }
        Object objFirst = o1Var.e;
        int i2 = o1Var.z;
        if (i2 == 0) {
            kotlin.a.e(objFirst);
            Flow flow = r1Var.d.O;
            o1Var.z = 1;
            objFirst = FlowKt.first(flow, o1Var);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objFirst == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(objFirst);
        }
        return com.google.common.base.i.n(kotlin.collections.o.n0(r1Var.c.F), (Set) objFirst);
    }

    public static final void i(r1 r1Var, List list) {
        MutableStateFlow mutableStateFlow = r1Var.l;
        ArrayList arrayList = new ArrayList(kotlin.collections.p.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new m0((String) it.next(), l0.e, 0));
        }
        mutableStateFlow.setValue(arrayList);
    }

    public static final Object j(r1 r1Var, androidx.room.coroutines.f fVar) {
        r1Var.g = kotlin.collections.u.e;
        int iE0 = kotlin.text.k.e0(r1Var.s, '|', 0, 6);
        Integer numQ = iE0 >= 0 ? kotlin.text.r.Q(r1Var.s.substring(iE0 + 1)) : null;
        String string = kotlin.text.k.A0(kotlin.text.k.v0(r1Var.u, " - ")).toString();
        com.app.mlounge.data.repository.r rVar = r1Var.c;
        String str = r1Var.s;
        rVar.getClass();
        str.getClass();
        string.getClass();
        Object objL = r1Var.l(FlowKt.channelFlow(new androidx.compose.foundation.relocation.g(rVar, str, string, numQ, null, 1)), fVar);
        return objL == kotlin.coroutines.intrinsics.a.e ? objL : kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0149, code lost:
    
        if (r0.emit(r12, r6) == r7) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(com.app.mlounge.ui.viewmodel.r1 r22, com.app.mlounge.data.remote.model.ChqStream r23, com.app.mlounge.ui.viewmodel.l r24, kotlin.coroutines.jvm.internal.c r25) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.viewmodel.r1.k(com.app.mlounge.ui.viewmodel.r1, com.app.mlounge.data.remote.model.ChqStream, com.app.mlounge.ui.viewmodel.l, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    public final Object l(Flow flow, androidx.room.coroutines.f fVar) {
        Object objCollect = flow.collect(new androidx.compose.animation.a0(4, this, new ArrayList(), new LinkedHashSet()), fVar);
        return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : kotlin.y.a;
    }

    public final void m() {
        if (((Boolean) this.j.getValue()).booleanValue()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new androidx.room.coroutines.f(this, (kotlin.coroutines.d) null, 27), 3, null);
    }
}
