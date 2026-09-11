package com.app.mlounge.ui.screens.player;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import androidx.media3.exoplayer.c1;
import com.app.mlounge.data.local.prefs.y1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends androidx.lifecycle.a {
    public final com.app.mlounge.data.local.dao.m b;
    public final com.app.mlounge.data.repository.r c;
    public final Context d;
    public final MutableStateFlow e;
    public final StateFlow f;
    public androidx.media3.exoplayer.c0 g;
    public Job h;
    public Job i;
    public Job j;
    public final ArrayList k;
    public String l;
    public String m;
    public String n;
    public long o;
    public androidx.media3.common.util.b p;
    public androidx.media3.extractor.q q;
    public okhttp3.y r;

    public z0(com.app.mlounge.data.local.dao.m mVar, com.app.mlounge.data.repository.r rVar, y1 y1Var, Application application) {
        rVar.getClass();
        y1Var.getClass();
        this.b = mVar;
        this.c = rVar;
        this.d = application.getApplicationContext();
        int iArgb = Color.argb(128, 0, 0, 0);
        kotlin.collections.u uVar = kotlin.collections.u.e;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new o0(true, true, true, false, false, false, false, false, 0L, 0L, 0L, uVar, uVar, null, false, 16.0f, -1, iArgb, 0L, null, false, false, null, null, null, true, false, false, null, null, true, false, false, 0));
        this.e = MutableStateFlow;
        this.f = FlowKt.asStateFlow(MutableStateFlow);
        this.k = new ArrayList();
        this.l = "";
        this.m = "";
        this.n = "tv";
        this.o = 30000L;
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new v0(this, null, 0), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object e(z0 z0Var, b1 b1Var, String str, long j, kotlin.coroutines.jvm.internal.c cVar) {
        p0 p0Var;
        androidx.media3.common.util.b bVar;
        MutableStateFlow mutableStateFlow;
        Context context;
        kotlin.y yVar;
        boolean z;
        String str2;
        kotlin.coroutines.intrinsics.a aVar;
        String str3;
        long j2;
        b1 b1Var2;
        File file;
        Iterator it;
        Exception e;
        String str4;
        String strM = str;
        MutableStateFlow mutableStateFlow2 = z0Var.e;
        Context context2 = z0Var.d;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i = p0Var.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                p0Var.E = i - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(z0Var, cVar);
            }
        } else {
            p0Var = new p0(z0Var, cVar);
        }
        p0 p0Var2 = p0Var;
        Object obj = p0Var2.C;
        int i2 = p0Var2.E;
        kotlin.y yVar2 = kotlin.y.a;
        boolean z2 = true;
        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(obj);
            bVar = z0Var.p;
            if (bVar == null || strM == null) {
                return yVar2;
            }
            kotlin.o oVar = com.app.mlounge.util.a.a;
            String str5 = b1Var.c;
            String str6 = b1Var.b;
            int i3 = 0;
            kotlin.sequences.g gVar = new kotlin.sequences.g(new kotlin.collections.s(strM, 3), true, new j0(0));
            Iterator it2 = (gVar instanceof kotlin.sequences.d ? ((kotlin.sequences.d) gVar).take() : new kotlin.sequences.m(gVar)).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    mutableStateFlow = mutableStateFlow2;
                    context = context2;
                    yVar = yVar2;
                    z = z2;
                    if (!kotlin.text.k.T(str6, ".vtt", z)) {
                        break;
                    }
                    strM = kotlin.text.r.M(strM, "\ufeff", "", false);
                    if (!kotlin.text.r.O(kotlin.text.k.C0(strM).toString(), "WEBVTT", z)) {
                        strM = "WEBVTT\n\n".concat(strM);
                        break;
                    }
                    break;
                }
                String str7 = (String) it2.next();
                Pattern patternCompile = Pattern.compile("\\{\\d+\\}\\{\\d+\\}.*");
                patternCompile.getClass();
                String string = kotlin.text.k.A0(str7).toString();
                string.getClass();
                if (patternCompile.matcher(string).matches()) {
                    StringBuilder sb = new StringBuilder();
                    Iterator it3 = kotlin.text.k.g0(strM).iterator();
                    int i4 = 1;
                    while (it3.hasNext()) {
                        String string2 = kotlin.text.k.A0((String) it3.next()).toString();
                        if (string2.length() == 0) {
                            it = it3;
                        } else {
                            it = it3;
                            kotlin.text.g gVarQ = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("\\{(\\d+)\\}\\{(\\d+)\\}(.*)", i3, string2, string2);
                            if (gVarQ != null) {
                                long j3 = Long.parseLong((String) ((kotlin.collections.b0) gVarQ.a()).get(1));
                                long j4 = Long.parseLong((String) ((kotlin.collections.b0) gVarQ.a()).get(2));
                                String strM2 = kotlin.text.r.M(kotlin.text.k.A0((String) ((kotlin.collections.b0) gVarQ.a()).get(3)).toString(), "|", "\n", false);
                                int i5 = i4 + 1;
                                sb.append(i4);
                                sb.append('\n');
                                sb.append(n0.c(j3) + " --> " + n0.c(j4));
                                sb.append('\n');
                                sb.append(strM2);
                                sb.append("\n\n");
                                i4 = i5;
                            }
                            it3 = it;
                            mutableStateFlow2 = mutableStateFlow2;
                            context2 = context2;
                            yVar2 = yVar2;
                            i3 = 0;
                        }
                        it3 = it;
                        mutableStateFlow2 = mutableStateFlow2;
                        context2 = context2;
                        yVar2 = yVar2;
                        i3 = 0;
                    }
                    mutableStateFlow = mutableStateFlow2;
                    context = context2;
                    yVar = yVar2;
                    strM = sb.toString();
                    z = true;
                    break;
                }
                z2 = true;
            }
            if (kotlin.text.k.T(str6, ".vtt", z)) {
                str2 = "vtt";
            } else {
                str2 = (kotlin.text.k.T(str6, ".ass", z) || kotlin.text.k.T(str6, ".ssa", z)) ? "ass" : "srt";
            }
            File file2 = new File(context.getCacheDir(), "active_sub.".concat(str2));
            try {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                androidx.compose.foundation.text.input.internal.k kVar = new androidx.compose.foundation.text.input.internal.k(file2, strM, null, 9);
                p0Var2.e = b1Var;
                p0Var2.y = bVar;
                p0Var2.z = str2;
                p0Var2.A = file2;
                p0Var2.B = j;
                p0Var2.E = 1;
                aVar = aVar2;
                if (BuildersKt.withContext(io2, kVar, p0Var2) != aVar) {
                    str3 = str2;
                    j2 = j;
                    b1Var2 = b1Var;
                    file = file2;
                }
            } catch (Exception e2) {
                e = e2;
                kotlin.o oVar2 = com.app.mlounge.util.a.a;
                coil3.compose.internal.f.i("Failed to write subtitle file: ", e.getMessage(), "CinemaHQ-Player");
                return yVar;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                kotlin.a.e(obj);
                return obj;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = p0Var2.B;
        file = p0Var2.A;
        str3 = p0Var2.z;
        bVar = p0Var2.y;
        b1 b1Var3 = p0Var2.e;
        try {
            kotlin.a.e(obj);
            mutableStateFlow = mutableStateFlow2;
            context = context2;
            yVar = yVar2;
            b1Var2 = b1Var3;
            aVar = aVar2;
        } catch (Exception e3) {
            e = e3;
            yVar = yVar2;
            kotlin.o oVar3 = com.app.mlounge.util.a.a;
            coil3.compose.internal.f.i("Failed to write subtitle file: ", e.getMessage(), "CinemaHQ-Player");
            return yVar;
        }
        kotlin.o oVar4 = com.app.mlounge.util.a.a;
        file.getAbsolutePath();
        Uri uriFromFile = Uri.fromFile(file);
        androidx.fragment.app.h hVar = new androidx.fragment.app.h(1);
        hVar.z = uriFromFile;
        if (kotlin.jvm.internal.l.a(str3, "vtt")) {
            str4 = "text/vtt";
        } else {
            str4 = kotlin.jvm.internal.l.a(str3, "ass") ? "text/x-ssa" : "application/x-subrip";
        }
        hVar.A = androidx.media3.common.i0.p(str4);
        hVar.B = b1Var2.c;
        hVar.C = b1Var2.a;
        hVar.y = b1Var2.f ? 1 : 0;
        androidx.media3.common.b0 b0Var = new androidx.media3.common.b0(hVar);
        context.getClass();
        androidx.media3.exoplayer.source.a aVarA = n0.a(context, z0Var.l, ((o0) mutableStateFlow.getValue()).v, bVar, b0Var, ((o0) mutableStateFlow.getValue()).w, z0Var.q);
        MainCoroutineDispatcher main = Dispatchers.getMain();
        long j5 = j2;
        androidx.compose.foundation.gestures.h hVar2 = new androidx.compose.foundation.gestures.h(z0Var, aVarA, b1Var2, j5, null);
        p0Var2.e = null;
        p0Var2.y = null;
        p0Var2.z = null;
        p0Var2.A = null;
        p0Var2.B = j5;
        p0Var2.E = 2;
        Object objWithContext = BuildersKt.withContext(main, hVar2, p0Var2);
        return objWithContext == aVar ? aVar : objWithContext;
    }

    public static void k(z0 z0Var, Float f, Integer num, Integer num2, int i) {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(z0Var), null, null, new androidx.compose.animation.core.f(z0Var, (i & 1) != 0 ? null : f, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, null, 15), 3, null);
    }

    @Override // androidx.lifecycle.q0
    public final void d() {
        String str;
        boolean zB;
        androidx.media3.exoplayer.c0 c0Var = this.g;
        if (c0Var != null) {
            long j = c0Var.j();
            long jO = c0Var.o();
            if (jO < 0) {
                jO = 0;
            }
            kotlin.coroutines.d dVar = null;
            if (!kotlin.text.k.d0(this.m) && j > 0 && jO > 0) {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new androidx.room.coroutines.f(this, new com.app.mlounge.data.local.entity.e(j, jO, this.m), dVar, 13), 2, null);
            }
            StringBuilder sb = new StringBuilder("Release ");
            sb.append(Integer.toHexString(System.identityHashCode(c0Var)));
            sb.append(" [AndroidXMedia3/1.10.1] [");
            sb.append(androidx.media3.common.util.j0.a);
            sb.append("] [");
            HashSet hashSet = androidx.media3.common.d0.a;
            synchronized (androidx.media3.common.d0.class) {
                str = androidx.media3.common.d0.b;
            }
            sb.append(str);
            sb.append("]");
            androidx.media3.common.util.c.k("ExoPlayerImpl", sb.toString());
            c0Var.V();
            c0Var.x.p();
            c0Var.y.b(false);
            c0Var.z.b(false);
            androidx.media3.exoplayer.b0 b0Var = c0Var.D;
            if (b0Var != null && Build.VERSION.SDK_INT >= 34) {
                androidx.media3.exoplayer.b0.a(b0Var);
            }
            androidx.compose.ui.node.a1 a1Var = c0Var.C;
            ((androidx.media3.common.util.g0) a1Var.g).a.removeCallbacksAndMessages(null);
            ((androidx.media3.exoplayer.c0) a1Var.b).D((androidx.media3.common.util.y) a1Var.c);
            androidx.media3.exoplayer.k0 k0Var = c0Var.l;
            if (k0Var.g0 || !k0Var.G.getThread().isAlive()) {
                zB = true;
            } else {
                k0Var.g0 = true;
                androidx.media3.common.util.h hVar = new androidx.media3.common.util.h(k0Var.M);
                k0Var.E.b(7, hVar).b();
                zB = hVar.b(k0Var.R);
            }
            if (!zB) {
                c0Var.m.e(10, new androidx.core.graphics.b());
            }
            c0Var.m.d();
            c0Var.j.a.removeCallbacksAndMessages(null);
            androidx.media3.exoplayer.upstream.f fVar = c0Var.t;
            androidx.media3.exoplayer.analytics.g gVar = c0Var.r;
            CopyOnWriteArrayList<androidx.media3.exoplayer.upstream.c> copyOnWriteArrayList = (CopyOnWriteArrayList) fVar.c.e;
            for (androidx.media3.exoplayer.upstream.c cVar : copyOnWriteArrayList) {
                if (cVar.b == gVar) {
                    cVar.c = true;
                    copyOnWriteArrayList.remove(cVar);
                }
            }
            c1 c1Var = c0Var.n0;
            if (c1Var.p) {
                c0Var.n0 = c1Var.a();
            }
            c1 c1VarY = androidx.media3.exoplayer.c0.y(c0Var.n0, 1);
            c0Var.n0 = c1VarY;
            c1 c1VarC = c1VarY.c(c1VarY.b);
            c0Var.n0 = c1VarC;
            c1VarC.q = c1VarC.s;
            c0Var.n0.r = 0L;
            androidx.media3.exoplayer.analytics.g gVar2 = c0Var.r;
            androidx.media3.common.util.g0 g0Var = gVar2.E;
            g0Var.getClass();
            g0Var.d(new androidx.activity.l(gVar2, 16));
            c0Var.E();
            Surface surface = c0Var.U;
            if (surface != null) {
                surface.release();
                c0Var.U = null;
            }
            c0Var.d0 = androidx.media3.common.text.c.c;
            c0Var.h0 = true;
        }
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            kotlin.io.j.y((File) it.next());
        }
    }

    public final void f() {
        long j;
        androidx.media3.exoplayer.c0 c0Var = this.g;
        if (c0Var != null) {
            long jO = c0Var.o();
            if (jO < 0) {
                jO = 0;
            }
            j = jO;
        } else {
            j = 0;
        }
        if (kotlin.text.k.d0(this.m) || j <= 0) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), Dispatchers.getIO(), null, new w0(this, j, j, null, 0), 2, null);
    }

    public final void g() {
        Job job = this.i;
        kotlin.coroutines.d dVar = null;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.i = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new v0(this, dVar, 2), 3, null);
    }

    public final void h(b1 b1Var) {
        z0 z0Var = this;
        b1Var.getClass();
        if (!b1Var.e) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(z0Var), null, null, new x0(z0Var, b1Var, null), 3, null);
            return;
        }
        while (true) {
            MutableStateFlow mutableStateFlow = z0Var.e;
            Object value = mutableStateFlow.getValue();
            if (mutableStateFlow.compareAndSet(value, o0.a((o0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, b1Var, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, -270337, 3))) {
                break;
            } else {
                z0Var = this;
            }
        }
        androidx.media3.exoplayer.c0 c0Var = this.g;
        if (c0Var != null) {
            androidx.media3.common.x0 x0Var = new androidx.media3.common.x0(((androidx.media3.common.b1) c0Var.m().a.get(b1Var.g)).b, b1Var.h);
            androidx.media3.exoplayer.trackselection.j jVar = (androidx.media3.exoplayer.trackselection.j) c0Var.t();
            jVar.getClass();
            androidx.media3.exoplayer.trackselection.i iVar = new androidx.media3.exoplayer.trackselection.i(jVar);
            iVar.i(3, false);
            iVar.e(x0Var);
            c0Var.O(iVar.a());
        }
    }

    public final void i() {
        Object value;
        MutableStateFlow mutableStateFlow = this.e;
        boolean z = ((o0) mutableStateFlow.getValue()).c;
        boolean z2 = !z;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, o0.a((o0) value, false, false, z2, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, -5, 3)));
        if (z) {
            return;
        }
        g();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void j(String str, boolean z) {
        MutableStateFlow mutableStateFlow;
        Object value;
        o0 o0VarA;
        str.getClass();
        do {
            mutableStateFlow = this.e;
            value = mutableStateFlow.getValue();
            o0VarA = (o0) value;
            switch (str.hashCode()) {
                case -2060497896:
                    if (str.equals("subtitle")) {
                        o0VarA = o0.a(o0VarA, false, false, false, false, false, z, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, -33, 3);
                    }
                    break;
                case -799113323:
                    if (str.equals("recovery")) {
                        o0VarA = o0.a(o0VarA, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, z, false, null, null, false, false, false, 0, -67108865, 3);
                    }
                    break;
                case 93166550:
                    if (str.equals("audio")) {
                        o0VarA = o0.a(o0VarA, false, false, false, false, z, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, -17, 3);
                    }
                    break;
                case 1434631203:
                    if (str.equals("settings")) {
                        o0VarA = o0.a(o0VarA, false, false, false, false, false, false, z, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, -65, 3);
                    }
                    break;
            }
        } while (!mutableStateFlow.compareAndSet(value, o0VarA));
    }
}
