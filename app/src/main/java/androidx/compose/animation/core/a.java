package androidx.compose.animation.core;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.widget.Toast;
import androidx.compose.foundation.gestures.b3;
import com.app.mlounge.data.remote.model.GameDetailResponse;
import com.app.mlounge.data.remote.model.MusicTrack;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.tasks.TasksKt;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ a(androidx.compose.foundation.gestures.j jVar, b3 b3Var, Job job, androidx.compose.foundation.gestures.l2 l2Var) {
        this.e = 1;
        this.y = jVar;
        this.z = job;
        this.A = l2Var;
    }

    private final Object d(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.y;
        com.app.mlounge.ui.viewmodel.h0 h0Var = (com.app.mlounge.ui.viewmodel.h0) this.z;
        kotlin.jvm.functions.w wVar = (kotlin.jvm.functions.w) this.A;
        MusicTrack musicTrack = (MusicTrack) obj;
        musicTrack.getClass();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.animation.b0(h0Var, musicTrack, wVar, (kotlin.coroutines.d) null, 28), 3, null);
        return kotlin.y.a;
    }

    private final Object e(Object obj) {
        androidx.compose.runtime.t2 t2Var = (androidx.compose.runtime.t2) this.y;
        kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.z;
        androidx.compose.runtime.t2 t2Var2 = (androidx.compose.runtime.t2) this.A;
        androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj;
        hVar.getClass();
        List list = (List) t2Var.getValue();
        hVar.q(list.size(), new androidx.compose.foundation.text.c0(4, new com.app.mlounge.ui.q(17), list), new com.app.mlounge.ui.screens.adult.g(0, list), new androidx.compose.runtime.internal.f(-1117249557, true, new com.app.mlounge.ui.screens.adult.h(list, lVar, 0)));
        if (((Boolean) t2Var2.getValue()).booleanValue()) {
            androidx.compose.foundation.lazy.grid.h.p(7, hVar, com.app.mlounge.ui.screens.adult.i.b, null);
        }
        return kotlin.y.a;
    }

    private final Object f(Object obj) {
        androidx.compose.runtime.y0 y0Var = (androidx.compose.runtime.y0) this.y;
        GameDetailResponse gameDetailResponse = (GameDetailResponse) this.z;
        Context context = (Context) this.A;
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        y0Var.setValue(bool);
        Toast.makeText(context, zBooleanValue ? androidx.constraintlayout.core.g.c(gameDetailResponse.d(), " downloaded!") : "Download failed", 0).show();
        return kotlin.y.a;
    }

    private final Object g(Object obj) {
        androidx.compose.runtime.t2 t2Var = (androidx.compose.runtime.t2) this.y;
        com.app.mlounge.ui.viewmodel.a0 a0Var = (com.app.mlounge.ui.viewmodel.a0) this.z;
        kotlin.jvm.functions.r rVar = (kotlin.jvm.functions.r) this.A;
        androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj;
        hVar.getClass();
        List list = (List) t2Var.getValue();
        hVar.q(list.size(), new androidx.compose.foundation.text.c0(12, new com.app.mlounge.ui.screens.anime.n(17), list), new com.app.mlounge.ui.screens.adult.g(7, list), new androidx.compose.runtime.internal.f(-1942245546, true, new com.app.mlounge.ui.screens.anime.m(list, a0Var, rVar, 1)));
        return kotlin.y.a;
    }

    private final Object h(Object obj) {
        List list = (List) this.y;
        androidx.compose.runtime.y0 y0Var = (androidx.compose.runtime.y0) this.z;
        androidx.compose.runtime.y0 y0Var2 = (androidx.compose.runtime.y0) this.A;
        androidx.compose.foundation.lazy.k kVar = (androidx.compose.foundation.lazy.k) obj;
        kVar.getClass();
        if (((File) y0Var.getValue()).getParentFile() != null && !kotlin.jvm.internal.l.a(((File) y0Var.getValue()).getAbsolutePath(), "/")) {
            if (list != null && list.isEmpty()) {
                androidx.compose.foundation.lazy.k.p(kVar, new androidx.compose.runtime.internal.f(25393286, true, new com.app.mlounge.ui.screens.anime.a(y0Var, 1)), 2);
                break;
            }
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    androidx.compose.foundation.lazy.k.p(kVar, new androidx.compose.runtime.internal.f(25393286, true, new com.app.mlounge.ui.screens.anime.a(y0Var, 1)), 2);
                    break;
                }
            } while (!kotlin.jvm.internal.l.a(((File) ((kotlin.k) it.next()).e).getAbsolutePath(), ((File) y0Var.getValue()).getAbsolutePath()));
        }
        if (((List) y0Var2.getValue()).isEmpty()) {
            androidx.compose.foundation.lazy.k.p(kVar, com.app.mlounge.ui.screens.settings.b.q, 3);
        } else {
            List list2 = (List) y0Var2.getValue();
            kVar.q(list2.size(), new androidx.compose.foundation.text.c0(25, new com.app.mlounge.ui.screens.player.j0(4), list2), new com.app.mlounge.ui.screens.adult.g(20, list2), new androidx.compose.runtime.internal.f(802480018, true, new com.app.mlounge.ui.screens.search.i(list2, y0Var, 1)));
        }
        return kotlin.y.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v6, types: [androidx.compose.runtime.internal.f] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r2v201, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [androidx.compose.ui.graphics.r] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r5v5, types: [long] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) throws Throwable {
        ?? r4;
        androidx.compose.ui.graphics.r rVar;
        androidx.compose.ui.graphics.r rVar2;
        Integer numE;
        Integer numD;
        Integer numD2;
        Integer numE2;
        androidx.compose.ui.text.j0 j0Var;
        androidx.compose.ui.text.j0 j0Var2;
        androidx.compose.foundation.text.k1 k1Var;
        androidx.compose.foundation.text.k1 k1Var2;
        androidx.compose.ui.text.j0 j0Var3;
        androidx.compose.ui.text.j0 j0Var4;
        androidx.compose.foundation.text.k1 k1Var3;
        androidx.compose.foundation.text.k1 k1Var4;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        androidx.compose.ui.text.input.x xVar;
        androidx.compose.foundation.text.input.internal.o oVar;
        androidx.compose.ui.text.input.x xVar2;
        boolean z;
        androidx.compose.foundation.text.r0 r0Var;
        int i = this.e;
        int i2 = 10;
        int i3 = 3;
        final int i4 = 2;
        kotlin.coroutines.d dVar = null;
        kotlin.y yVar = kotlin.y.a;
        Object obj2 = this.A;
        Object obj3 = this.z;
        Object obj4 = this.y;
        int i5 = 1;
        switch (i) {
            case 0:
                d dVar2 = (d) obj4;
                n nVar = (n) obj3;
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj2;
                l lVar = (l) obj;
                e.o(lVar, dVar2.c);
                androidx.compose.runtime.h1 h1Var = lVar.e;
                Object objA = d.a(dVar2, h1Var.getValue());
                if (!kotlin.jvm.internal.l.a(objA, h1Var.getValue())) {
                    dVar2.c.y.setValue(objA);
                    nVar.y.setValue(objA);
                    lVar.i.setValue(Boolean.FALSE);
                    lVar.d.invoke();
                    vVar.e = true;
                }
                return yVar;
            case 1:
                androidx.compose.foundation.gestures.j jVar = (androidx.compose.foundation.gestures.j) obj4;
                Job job = (Job) obj3;
                androidx.compose.foundation.gestures.l2 l2Var = (androidx.compose.foundation.gestures.l2) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float f = jVar.N ? 1.0f : -1.0f;
                androidx.compose.foundation.gestures.m2 m2Var = jVar.M;
                long jE = m2Var.e(m2Var.h(f * fFloatValue));
                androidx.compose.foundation.gestures.m2 m2Var2 = l2Var.a;
                float fG = m2Var.g(m2Var.e(m2Var2.c(m2Var2.k, jE, 1))) * f;
                if (Math.abs(fG) < Math.abs(fFloatValue)) {
                    JobKt__JobKt.cancel$default(job, "Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')', null, 2, null);
                }
                return yVar;
            case 2:
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) obj4;
                androidx.compose.runtime.y0 y0Var = (androidx.compose.runtime.y0) obj2;
                androidx.compose.ui.text.input.x xVar3 = (androidx.compose.ui.text.input.x) obj;
                ((androidx.compose.runtime.y0) obj3).setValue(xVar3);
                boolean zA = kotlin.jvm.internal.l.a((String) y0Var.getValue(), xVar3.a.y);
                androidx.compose.ui.text.g gVar = xVar3.a;
                y0Var.setValue(gVar.y);
                if (!zA) {
                    lVar2.invoke(gVar.y);
                }
                return yVar;
            case 3:
                androidx.compose.foundation.text.r0 r0Var2 = (androidx.compose.foundation.text.r0) obj4;
                long j = ((androidx.compose.ui.text.input.x) obj3).b;
                androidx.compose.ui.text.input.q qVar = (androidx.compose.ui.text.input.q) obj2;
                androidx.compose.ui.graphics.drawscope.d dVar3 = (androidx.compose.ui.graphics.drawscope.d) obj;
                androidx.compose.foundation.text.k1 k1VarD = r0Var2.d();
                if (k1VarD != null) {
                    androidx.compose.ui.graphics.r rVarW = dVar3.b0().w();
                    long j2 = ((androidx.compose.ui.text.l0) r0Var2.A.getValue()).a;
                    ?? r5 = ((androidx.compose.ui.text.l0) r0Var2.B.getValue()).a;
                    androidx.compose.ui.text.j0 j0Var5 = k1VarD.a;
                    androidx.compose.ui.text.i0 i0Var = j0Var5.a;
                    androidx.compose.ui.text.n nVar2 = j0Var5.b;
                    com.google.android.gms.cloudmessaging.n nVar3 = r0Var2.y;
                    long j3 = r0Var2.z;
                    if (!androidx.compose.ui.text.l0.c(j2)) {
                        nVar3.h(j3);
                        int iV = qVar.v(androidx.compose.ui.text.l0.f(j2));
                        int iV2 = qVar.v(androidx.compose.ui.text.l0.e(j2));
                        if (iV != iV2) {
                            rVarW.e(j0Var5.h(iV, iV2), nVar3);
                        }
                    } else if (!androidx.compose.ui.text.l0.c(r5)) {
                        long jB = i0Var.b.b();
                        androidx.compose.ui.graphics.t tVar = jB == 16 ? null : new androidx.compose.ui.graphics.t(jB);
                        long j4 = tVar != null ? tVar.a : androidx.compose.ui.graphics.t.b;
                        nVar3.h(androidx.compose.ui.graphics.t.b(androidx.compose.ui.graphics.t.d(j4) * 0.2f, j4));
                        int iV3 = qVar.v(androidx.compose.ui.text.l0.f(r5));
                        int iV4 = qVar.v(androidx.compose.ui.text.l0.e(r5));
                        if (iV3 != iV4) {
                            rVarW.e(j0Var5.h(iV3, iV4), nVar3);
                        }
                    } else if (!androidx.compose.ui.text.l0.c(j)) {
                        nVar3.h(j3);
                        int iV5 = qVar.v(androidx.compose.ui.text.l0.f(j));
                        int iV6 = qVar.v(androidx.compose.ui.text.l0.e(j));
                        if (iV5 != iV6) {
                            rVarW.e(j0Var5.h(iV5, iV6), nVar3);
                        }
                    }
                    long j5 = j0Var5.c;
                    boolean z2 = ((((float) ((int) (j5 >> 32))) > nVar2.d ? 1 : (((float) ((int) (j5 >> 32))) == nVar2.d ? 0 : -1)) < 0 || nVar2.c || (((float) ((int) (j5 & 4294967295L))) > nVar2.e ? 1 : (((float) ((int) (j5 & 4294967295L))) == nVar2.e ? 0 : -1)) < 0) && i0Var.f != 3;
                    if (z2) {
                        androidx.compose.ui.geometry.c cVarC = com.google.android.gms.dynamite.g.c(0L, (((long) Float.floatToRawIntBits((int) (j5 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j5 & 4294967295L))) & 4294967295L));
                        rVarW.f();
                        androidx.compose.ui.graphics.r.k(rVarW, cVarC);
                    }
                    androidx.compose.ui.text.e0 e0Var = i0Var.b.a;
                    androidx.compose.ui.text.style.l lVar3 = e0Var.m;
                    androidx.compose.ui.text.style.o oVar2 = e0Var.a;
                    if (lVar3 == null) {
                        lVar3 = androidx.compose.ui.text.style.l.b;
                    }
                    androidx.compose.ui.text.style.l lVar4 = lVar3;
                    androidx.compose.ui.graphics.m0 m0Var = e0Var.n;
                    if (m0Var == null) {
                        m0Var = androidx.compose.ui.graphics.m0.d;
                    }
                    androidx.compose.ui.graphics.m0 m0Var2 = m0Var;
                    androidx.compose.ui.graphics.drawscope.e eVar = e0Var.p;
                    if (eVar == null) {
                        eVar = androidx.compose.ui.graphics.drawscope.g.a;
                    }
                    androidx.compose.ui.graphics.drawscope.e eVar2 = eVar;
                    try {
                        androidx.compose.ui.graphics.p pVarC = oVar2.c();
                        androidx.compose.ui.text.style.n nVar4 = androidx.compose.ui.text.style.n.a;
                        try {
                            if (pVarC == null) {
                                androidx.compose.ui.graphics.r rVar3 = rVarW;
                                long jB2 = oVar2 != nVar4 ? oVar2.b() : androidx.compose.ui.graphics.t.b;
                                rVar3.f();
                                ArrayList arrayList = nVar2.h;
                                int size = arrayList.size();
                                int i6 = 0;
                                androidx.compose.ui.graphics.r rVar4 = rVar3;
                                while (i6 < size) {
                                    androidx.compose.ui.text.p pVar = (androidx.compose.ui.text.p) arrayList.get(i6);
                                    pVar.a.f(rVar4, jB2, m0Var2, lVar4, eVar2);
                                    rVar = rVar4;
                                    try {
                                        rVar.p(0.0f, pVar.a.b());
                                        i6++;
                                        rVar4 = rVar;
                                    } catch (Throwable th) {
                                        th = th;
                                        r4 = rVar;
                                        if (z2) {
                                            r4.q();
                                        }
                                        throw th;
                                    }
                                }
                                rVar = rVar4;
                                rVar.q();
                                rVar2 = rVar;
                            } else {
                                androidx.compose.ui.text.n.i(nVar2, rVarW, pVarC, oVar2 != nVar4 ? oVar2.a() : 1.0f, m0Var2, lVar4, eVar2);
                                rVar2 = rVarW;
                            }
                            if (z2) {
                                rVar2.q();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r4 = r5;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r4 = rVarW;
                    }
                    break;
                }
                return yVar;
            case 4:
                kotlin.jvm.functions.l lVar5 = (kotlin.jvm.functions.l) obj3;
                androidx.compose.ui.text.input.d0 d0Var = (androidx.compose.ui.text.input.d0) ((kotlin.jvm.internal.z) obj2).e;
                androidx.compose.ui.text.input.x xVarJ = ((androidx.compose.foundation.text.input.internal.o) obj4).j((List) obj);
                if (d0Var != null) {
                    d0Var.a(null, xVarJ);
                }
                lVar5.invoke(xVarJ);
                return yVar;
            case 5:
                androidx.compose.foundation.text.b1 b1Var = (androidx.compose.foundation.text.b1) obj3;
                kotlin.jvm.internal.v vVar2 = (kotlin.jvm.internal.v) obj2;
                androidx.compose.foundation.text.selection.t0 t0Var = (androidx.compose.foundation.text.selection.t0) obj;
                int i7 = 7;
                switch (((androidx.compose.foundation.text.j0) obj4).ordinal()) {
                    case 0:
                        t0Var.e.a = null;
                        if (t0Var.g.y.length() > 0) {
                            if (!androidx.compose.ui.text.l0.c(t0Var.f)) {
                                boolean zF = t0Var.f();
                                long j6 = t0Var.f;
                                if (!zF) {
                                    int iE = androidx.compose.ui.text.l0.e(j6);
                                    t0Var.q(iE, iE);
                                } else {
                                    int iF = androidx.compose.ui.text.l0.f(j6);
                                    t0Var.q(iF, iF);
                                }
                            } else {
                                t0Var.i();
                            }
                        }
                        break;
                    case 1:
                        t0Var.e.a = null;
                        if (t0Var.g.y.length() > 0) {
                            if (!androidx.compose.ui.text.l0.c(t0Var.f)) {
                                boolean zF2 = t0Var.f();
                                long j7 = t0Var.f;
                                if (!zF2) {
                                    int iF2 = androidx.compose.ui.text.l0.f(j7);
                                    t0Var.q(iF2, iF2);
                                } else {
                                    int iE2 = androidx.compose.ui.text.l0.e(j7);
                                    t0Var.q(iE2, iE2);
                                }
                            } else {
                                t0Var.m();
                            }
                        }
                        break;
                    case 2:
                        androidx.compose.foundation.text.selection.i1 i1Var = t0Var.e;
                        i1Var.a = null;
                        androidx.compose.ui.text.g gVar2 = t0Var.g;
                        String str = gVar2.y;
                        String str2 = gVar2.y;
                        if (str.length() > 0) {
                            if (!t0Var.f()) {
                                i1Var.a = null;
                                if (str2.length() > 0 && (numE = t0Var.e()) != null) {
                                    int iIntValue = numE.intValue();
                                    t0Var.q(iIntValue, iIntValue);
                                }
                            } else {
                                i1Var.a = null;
                                if (str2.length() > 0 && (numD = t0Var.d()) != null) {
                                    int iIntValue2 = numD.intValue();
                                    t0Var.q(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        break;
                    case 3:
                        androidx.compose.foundation.text.selection.i1 i1Var2 = t0Var.e;
                        i1Var2.a = null;
                        androidx.compose.ui.text.g gVar3 = t0Var.g;
                        String str3 = gVar3.y;
                        String str4 = gVar3.y;
                        if (str3.length() > 0) {
                            if (!t0Var.f()) {
                                i1Var2.a = null;
                                if (str4.length() > 0 && (numD2 = t0Var.d()) != null) {
                                    int iIntValue3 = numD2.intValue();
                                    t0Var.q(iIntValue3, iIntValue3);
                                }
                            } else {
                                i1Var2.a = null;
                                if (str4.length() > 0 && (numE2 = t0Var.e()) != null) {
                                    int iIntValue4 = numE2.intValue();
                                    t0Var.q(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        break;
                    case 4:
                        t0Var.j();
                        break;
                    case 5:
                        t0Var.l();
                        break;
                    case 6:
                        t0Var.o();
                        break;
                    case 7:
                        t0Var.n();
                        break;
                    case 8:
                        t0Var.e.a = null;
                        if (t0Var.g.y.length() > 0) {
                            if (!t0Var.f()) {
                                t0Var.n();
                            } else {
                                t0Var.o();
                            }
                        }
                        break;
                    case 9:
                        t0Var.e.a = null;
                        if (t0Var.g.y.length() > 0) {
                            if (!t0Var.f()) {
                                t0Var.o();
                            } else {
                                t0Var.n();
                            }
                        }
                        break;
                    case 10:
                        if (t0Var.g.y.length() > 0 && (j0Var = t0Var.c) != null) {
                            int iG = t0Var.g(j0Var, -1);
                            t0Var.q(iG, iG);
                        }
                        break;
                    case 11:
                        if (t0Var.g.y.length() > 0 && (j0Var2 = t0Var.c) != null) {
                            int iG2 = t0Var.g(j0Var2, 1);
                            t0Var.q(iG2, iG2);
                        }
                        break;
                    case 12:
                    case Token.THIS /* 48 */:
                        break;
                    case 13:
                        if (t0Var.g.y.length() > 0 && (k1Var = t0Var.i) != null) {
                            int iH = t0Var.h(k1Var, -1);
                            t0Var.q(iH, iH);
                        }
                        break;
                    case 14:
                        if (t0Var.g.y.length() > 0 && (k1Var2 = t0Var.i) != null) {
                            int iH2 = t0Var.h(k1Var2, 1);
                            t0Var.q(iH2, iH2);
                        }
                        break;
                    case 15:
                        t0Var.e.a = null;
                        if (t0Var.g.y.length() > 0) {
                            t0Var.q(0, 0);
                        }
                        break;
                    case 16:
                        t0Var.e.a = null;
                        androidx.compose.ui.text.g gVar4 = t0Var.g;
                        if (gVar4.y.length() > 0) {
                            int length = gVar4.y.length();
                            t0Var.q(length, length);
                        }
                        break;
                    case 17:
                        b1Var.b.d(false);
                        break;
                    case 18:
                        b1Var.b.p();
                        break;
                    case 19:
                        b1Var.b.f();
                        break;
                    case 20:
                        List listA = t0Var.a(new androidx.compose.foundation.lazy.i(8));
                        if (listA != null) {
                            b1Var.a(listA);
                        }
                        break;
                    case 21:
                        List listA2 = t0Var.a(new androidx.compose.foundation.lazy.i(9));
                        if (listA2 != null) {
                            b1Var.a(listA2);
                        }
                        break;
                    case 22:
                        List listA3 = t0Var.a(new androidx.compose.foundation.lazy.i(i2));
                        if (listA3 != null) {
                            b1Var.a(listA3);
                        }
                        break;
                    case 23:
                        List listA4 = t0Var.a(new androidx.compose.foundation.lazy.i(11));
                        if (listA4 != null) {
                            b1Var.a(listA4);
                        }
                        break;
                    case 24:
                        List listA5 = t0Var.a(new androidx.compose.foundation.lazy.i(12));
                        if (listA5 != null) {
                            b1Var.a(listA5);
                        }
                        break;
                    case 25:
                        List listA6 = t0Var.a(new androidx.compose.foundation.lazy.i(13));
                        if (listA6 != null) {
                            b1Var.a(listA6);
                        }
                        break;
                    case 26:
                        t0Var.e.a = null;
                        androidx.compose.ui.text.g gVar5 = t0Var.g;
                        if (gVar5.y.length() > 0) {
                            t0Var.q(0, gVar5.y.length());
                        }
                        break;
                    case 27:
                        t0Var.i();
                        t0Var.p();
                        break;
                    case 28:
                        t0Var.m();
                        t0Var.p();
                        break;
                    case 29:
                        if (t0Var.g.y.length() > 0 && (j0Var3 = t0Var.c) != null) {
                            int iG3 = t0Var.g(j0Var3, -1);
                            t0Var.q(iG3, iG3);
                        }
                        t0Var.p();
                        break;
                    case 30:
                        if (t0Var.g.y.length() > 0 && (j0Var4 = t0Var.c) != null) {
                            int iG4 = t0Var.g(j0Var4, 1);
                            t0Var.q(iG4, iG4);
                        }
                        t0Var.p();
                        break;
                    case 31:
                        if (t0Var.g.y.length() > 0 && (k1Var3 = t0Var.i) != null) {
                            int iH3 = t0Var.h(k1Var3, -1);
                            t0Var.q(iH3, iH3);
                        }
                        t0Var.p();
                        break;
                    case 32:
                        if (t0Var.g.y.length() > 0 && (k1Var4 = t0Var.i) != null) {
                            int iH4 = t0Var.h(k1Var4, 1);
                            t0Var.q(iH4, iH4);
                        }
                        t0Var.p();
                        break;
                    case Token.GETPROP /* 33 */:
                        t0Var.e.a = null;
                        if (t0Var.g.y.length() > 0) {
                            t0Var.q(0, 0);
                        }
                        t0Var.p();
                        break;
                    case Token.GETPROPNOWARN /* 34 */:
                        t0Var.e.a = null;
                        androidx.compose.ui.text.g gVar6 = t0Var.g;
                        if (gVar6.y.length() > 0) {
                            int length2 = gVar6.y.length();
                            t0Var.q(length2, length2);
                        }
                        t0Var.p();
                        break;
                    case 35:
                        androidx.compose.foundation.text.selection.i1 i1Var3 = t0Var.e;
                        i1Var3.a = null;
                        androidx.compose.ui.text.g gVar7 = t0Var.g;
                        String str5 = gVar7.y;
                        String str6 = gVar7.y;
                        if (str5.length() > 0) {
                            if (t0Var.f()) {
                                i1Var3.a = null;
                                if (str6.length() > 0 && (numE3 = t0Var.e()) != null) {
                                    int iIntValue5 = numE3.intValue();
                                    t0Var.q(iIntValue5, iIntValue5);
                                }
                            } else {
                                i1Var3.a = null;
                                if (str6.length() > 0 && (numD3 = t0Var.d()) != null) {
                                    int iIntValue6 = numD3.intValue();
                                    t0Var.q(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        t0Var.p();
                        break;
                    case Token.GETPROPNOWARN_SUPER /* 36 */:
                        androidx.compose.foundation.text.selection.i1 i1Var4 = t0Var.e;
                        i1Var4.a = null;
                        androidx.compose.ui.text.g gVar8 = t0Var.g;
                        String str7 = gVar8.y;
                        String str8 = gVar8.y;
                        if (str7.length() > 0) {
                            if (t0Var.f()) {
                                i1Var4.a = null;
                                if (str8.length() > 0 && (numD4 = t0Var.d()) != null) {
                                    int iIntValue7 = numD4.intValue();
                                    t0Var.q(iIntValue7, iIntValue7);
                                }
                            } else {
                                i1Var4.a = null;
                                if (str8.length() > 0 && (numE4 = t0Var.e()) != null) {
                                    int iIntValue8 = numE4.intValue();
                                    t0Var.q(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        t0Var.p();
                        break;
                    case Token.SETPROP /* 37 */:
                        t0Var.j();
                        t0Var.p();
                        break;
                    case Token.SETPROP_SUPER /* 38 */:
                        t0Var.l();
                        t0Var.p();
                        break;
                    case Token.GETELEM /* 39 */:
                        t0Var.o();
                        t0Var.p();
                        break;
                    case Token.GETELEM_SUPER /* 40 */:
                        t0Var.n();
                        t0Var.p();
                        break;
                    case Token.SETELEM /* 41 */:
                        t0Var.e.a = null;
                        if (t0Var.g.y.length() > 0) {
                            if (t0Var.f()) {
                                t0Var.o();
                            } else {
                                t0Var.n();
                            }
                        }
                        t0Var.p();
                        break;
                    case Token.SETELEM_SUPER /* 42 */:
                        t0Var.e.a = null;
                        if (t0Var.g.y.length() > 0) {
                            if (t0Var.f()) {
                                t0Var.n();
                            } else {
                                t0Var.o();
                            }
                        }
                        t0Var.p();
                        break;
                    case Token.CALL /* 43 */:
                        t0Var.e.a = null;
                        if (t0Var.g.y.length() > 0) {
                            long j8 = t0Var.f;
                            int i8 = androidx.compose.ui.text.l0.c;
                            int i9 = (int) (j8 & 4294967295L);
                            t0Var.q(i9, i9);
                        }
                        break;
                    case Token.NAME /* 44 */:
                        if (!b1Var.e) {
                            b1Var.a(com.google.common.base.c.p(new androidx.compose.ui.text.input.a("\n", 1)));
                        } else {
                            vVar2.e = b1Var.a.x.y.r.b(b1Var.l);
                        }
                        break;
                    case Token.NUMBER /* 45 */:
                        if (!b1Var.e) {
                            b1Var.a(com.google.common.base.c.p(new androidx.compose.ui.text.input.a("\t", 1)));
                        } else {
                            vVar2.e = false;
                        }
                        break;
                    case Token.STRING /* 46 */:
                        androidx.compose.foundation.text.l1 l1Var = b1Var.h;
                        if (l1Var != null) {
                            l1Var.a(androidx.compose.ui.text.input.x.a(t0Var.h, t0Var.g, t0Var.f, 4));
                        }
                        androidx.compose.foundation.text.l1 l1Var2 = b1Var.h;
                        if (l1Var2 != null) {
                            androidx.compose.foundation.text.input.internal.o oVar3 = l1Var2.a;
                            if (oVar3 == null || (oVar = (androidx.compose.foundation.text.input.internal.o) oVar3.y) == null) {
                                xVar = null;
                            } else {
                                l1Var2.a = oVar;
                                l1Var2.c -= ((androidx.compose.ui.text.input.x) oVar3.z).a.y.length();
                                l1Var2.b = new androidx.compose.foundation.text.input.internal.o(i7, l1Var2.b, (androidx.compose.ui.text.input.x) oVar3.z);
                                xVar = (androidx.compose.ui.text.input.x) oVar.z;
                            }
                            if (xVar != null) {
                                b1Var.k.invoke(xVar);
                            }
                        }
                        break;
                    case Token.NULL /* 47 */:
                        androidx.compose.foundation.text.l1 l1Var3 = b1Var.h;
                        if (l1Var3 != null) {
                            androidx.compose.foundation.text.input.internal.o oVar4 = l1Var3.b;
                            if (oVar4 != null) {
                                l1Var3.b = (androidx.compose.foundation.text.input.internal.o) oVar4.y;
                                androidx.compose.ui.text.input.x xVar4 = (androidx.compose.ui.text.input.x) oVar4.z;
                                l1Var3.a = new androidx.compose.foundation.text.input.internal.o(i7, l1Var3.a, xVar4);
                                l1Var3.c = xVar4.a.y.length() + l1Var3.c;
                                xVar2 = (androidx.compose.ui.text.input.x) oVar4.z;
                            } else {
                                xVar2 = null;
                            }
                            if (xVar2 != null) {
                                b1Var.k.invoke(xVar2);
                            }
                        }
                        break;
                    default:
                        coil3.g.a();
                        return null;
                }
                return yVar;
            case 6:
                Context context = (Context) obj3;
                androidx.compose.foundation.text.contextmenu.data.g gVar9 = (androidx.compose.foundation.text.contextmenu.data.g) obj2;
                androidx.compose.foundation.contextmenu.g gVar10 = (androidx.compose.foundation.contextmenu.g) obj;
                ?? r2 = ((androidx.compose.foundation.text.contextmenu.data.c) obj4).a;
                int size2 = r2.size();
                int i10 = 0;
                while (i10 < size2) {
                    androidx.compose.foundation.text.contextmenu.data.b bVar = (androidx.compose.foundation.text.contextmenu.data.b) r2.get(i10);
                    if (bVar instanceof androidx.compose.foundation.text.contextmenu.data.d) {
                        androidx.compose.foundation.text.contextmenu.data.d dVar4 = (androidx.compose.foundation.text.contextmenu.data.d) bVar;
                        androidx.compose.foundation.contextmenu.g.b(gVar10, new g0(dVar4, 6), dVar4.c == 0 ? dVar : new androidx.compose.runtime.internal.f(-1930700965, true, new androidx.compose.foundation.text.contextmenu.internal.m(dVar4, 0)), new androidx.activity.compose.f(i2, dVar4, gVar9), 6);
                    } else if (bVar instanceof androidx.compose.foundation.text.contextmenu.data.h) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            androidx.compose.foundation.text.contextmenu.internal.v.f(gVar10, context, (androidx.compose.foundation.text.contextmenu.data.h) bVar);
                        }
                    } else if (bVar instanceof androidx.compose.foundation.text.contextmenu.data.f) {
                        gVar10.a.add(androidx.compose.foundation.contextmenu.c.b);
                    }
                    i10++;
                    dVar = null;
                }
                return yVar;
            case 7:
                androidx.compose.foundation.text.selection.q0 q0Var = (androidx.compose.foundation.text.selection.q0) obj4;
                androidx.collection.g gVar11 = (androidx.collection.g) obj3;
                kotlin.jvm.internal.v vVar3 = (kotlin.jvm.internal.v) obj2;
                androidx.compose.ui.input.pointer.v vVar4 = (androidx.compose.ui.input.pointer.v) obj;
                long j9 = vVar4.c;
                androidx.compose.foundation.text.selection.c1 c1Var = (androidx.compose.foundation.text.selection.c1) q0Var.A;
                if (!c1Var.k() || c1Var.n().a.y.length() == 0 || (r0Var = c1Var.d) == null || r0Var.d() == null) {
                    z = false;
                } else {
                    q0Var.g(c1Var.n(), j9, false, gVar11);
                    z = true;
                }
                if (z) {
                    vVar4.a();
                    vVar3.e = true;
                }
                return yVar;
            case 8:
                final androidx.compose.foundation.text.selection.c1 c1Var2 = (androidx.compose.foundation.text.selection.c1) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                Context context2 = (Context) obj2;
                androidx.compose.foundation.text.contextmenu.builder.a aVar = (androidx.compose.foundation.text.contextmenu.builder.a) obj;
                androidx.collection.j0 j0Var6 = aVar.a;
                androidx.collection.j0 j0Var7 = aVar.a;
                androidx.compose.foundation.text.contextmenu.data.f fVar = androidx.compose.foundation.text.contextmenu.data.f.b;
                j0Var6.a(fVar);
                androidx.compose.foundation.text.v0 v0Var = androidx.compose.foundation.text.v0.Autofill;
                boolean z3 = (androidx.compose.ui.text.l0.c(c1Var2.n().b) || !c1Var2.j() || (c1Var2.f instanceof androidx.compose.ui.text.input.r) || c1Var2.h == null) ? false : true;
                androidx.activity.compose.f fVar2 = new androidx.activity.compose.f(coroutineScope, new androidx.compose.foundation.text.selection.w0(c1Var2, dVar, i5));
                Resources resources = context2.getResources();
                int i11 = 23;
                androidx.activity.compose.h hVar = new androidx.activity.compose.h(i11, fVar2, dVar);
                if (z3) {
                    j0Var7.a(new androidx.compose.foundation.text.contextmenu.data.d(androidx.compose.foundation.text.contextmenu.data.e.a, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, hVar));
                }
                androidx.compose.foundation.text.v0 v0Var2 = androidx.compose.foundation.text.v0.Autofill;
                boolean z4 = (androidx.compose.ui.text.l0.c(c1Var2.n().b) || (c1Var2.f instanceof androidx.compose.ui.text.input.r) || c1Var2.h == null) ? false : true;
                androidx.activity.compose.f fVar3 = new androidx.activity.compose.f(coroutineScope, new androidx.compose.foundation.text.selection.w0(c1Var2, dVar, i4));
                Resources resources2 = context2.getResources();
                androidx.activity.compose.h hVar2 = new androidx.activity.compose.h(i11, fVar3, dVar);
                if (z4) {
                    j0Var7.a(new androidx.compose.foundation.text.contextmenu.data.d(androidx.compose.foundation.text.contextmenu.data.e.b, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, hVar2));
                }
                androidx.compose.foundation.text.v0 v0Var3 = androidx.compose.foundation.text.v0.Autofill;
                boolean z5 = c1Var2.j() && ((Boolean) c1Var2.x.getValue()).booleanValue() && c1Var2.h != null;
                androidx.activity.compose.f fVar4 = new androidx.activity.compose.f(coroutineScope, new androidx.compose.foundation.text.selection.w0(c1Var2, dVar, i3));
                Resources resources3 = context2.getResources();
                androidx.activity.compose.h hVar3 = new androidx.activity.compose.h(i11, fVar4, dVar);
                if (z5) {
                    j0Var7.a(new androidx.compose.foundation.text.contextmenu.data.d(androidx.compose.foundation.text.contextmenu.data.e.c, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, hVar3));
                }
                androidx.compose.foundation.text.v0 v0Var4 = androidx.compose.foundation.text.v0.Autofill;
                boolean z6 = androidx.compose.ui.text.l0.d(c1Var2.n().b) != c1Var2.n().a.y.length();
                final int i12 = 0;
                kotlin.jvm.functions.a aVar2 = new kotlin.jvm.functions.a() { // from class: androidx.compose.foundation.text.selection.g1
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                return Boolean.valueOf(!c1Var2.B);
                            case 1:
                                c1 c1Var3 = c1Var2;
                                androidx.compose.ui.text.input.x xVarE = c1.e(c1Var3.n().a, androidx.compose.ui.text.d0.b(0, c1Var3.n().a.y.length()));
                                c1Var3.c.invoke(xVarE);
                                long j10 = xVarE.b;
                                c1Var3.w = new androidx.compose.ui.text.l0(j10);
                                c1Var3.u = androidx.compose.ui.text.input.x.a(c1Var3.u, null, j10, 5);
                                c1Var3.h(true);
                                return kotlin.y.a;
                            default:
                                kotlin.jvm.functions.a aVar3 = c1Var2.g;
                                if (aVar3 != null) {
                                    aVar3.invoke();
                                }
                                return kotlin.y.a;
                        }
                    }
                };
                final int i13 = 1;
                kotlin.jvm.functions.a aVar3 = new kotlin.jvm.functions.a() { // from class: androidx.compose.foundation.text.selection.g1
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                return Boolean.valueOf(!c1Var2.B);
                            case 1:
                                c1 c1Var3 = c1Var2;
                                androidx.compose.ui.text.input.x xVarE = c1.e(c1Var3.n().a, androidx.compose.ui.text.d0.b(0, c1Var3.n().a.y.length()));
                                c1Var3.c.invoke(xVarE);
                                long j10 = xVarE.b;
                                c1Var3.w = new androidx.compose.ui.text.l0(j10);
                                c1Var3.u = androidx.compose.ui.text.input.x.a(c1Var3.u, null, j10, 5);
                                c1Var3.h(true);
                                return kotlin.y.a;
                            default:
                                kotlin.jvm.functions.a aVar4 = c1Var2.g;
                                if (aVar4 != null) {
                                    aVar4.invoke();
                                }
                                return kotlin.y.a;
                        }
                    }
                };
                Resources resources4 = context2.getResources();
                androidx.activity.compose.h hVar4 = new androidx.activity.compose.h(i11, aVar3, aVar2);
                if (z6) {
                    j0Var7.a(new androidx.compose.foundation.text.contextmenu.data.d(androidx.compose.foundation.text.contextmenu.data.e.d, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, hVar4));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    androidx.compose.foundation.text.v0 v0Var5 = androidx.compose.foundation.text.v0.Autofill;
                    boolean z7 = c1Var2.j() && androidx.compose.ui.text.l0.c(c1Var2.n().b);
                    kotlin.jvm.functions.a aVar4 = new kotlin.jvm.functions.a() { // from class: androidx.compose.foundation.text.selection.g1
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            switch (i4) {
                                case 0:
                                    return Boolean.valueOf(!c1Var2.B);
                                case 1:
                                    c1 c1Var3 = c1Var2;
                                    androidx.compose.ui.text.input.x xVarE = c1.e(c1Var3.n().a, androidx.compose.ui.text.d0.b(0, c1Var3.n().a.y.length()));
                                    c1Var3.c.invoke(xVarE);
                                    long j10 = xVarE.b;
                                    c1Var3.w = new androidx.compose.ui.text.l0(j10);
                                    c1Var3.u = androidx.compose.ui.text.input.x.a(c1Var3.u, null, j10, 5);
                                    c1Var3.h(true);
                                    return kotlin.y.a;
                                default:
                                    kotlin.jvm.functions.a aVar5 = c1Var2.g;
                                    if (aVar5 != null) {
                                        aVar5.invoke();
                                    }
                                    return kotlin.y.a;
                            }
                        }
                    };
                    Resources resources5 = context2.getResources();
                    androidx.activity.compose.h hVar5 = new androidx.activity.compose.h(i11, aVar4, dVar);
                    if (z7) {
                        j0Var7.a(new androidx.compose.foundation.text.contextmenu.data.d(v0Var5.e, resources5.getString(v0Var5.y), v0Var5.z, hVar5));
                    }
                }
                j0Var7.a(fVar);
                return yVar;
            case 9:
                androidx.compose.foundation.layout.m0 m0Var3 = (androidx.compose.foundation.layout.m0) obj3;
                androidx.compose.ui.d dVar5 = (androidx.compose.ui.d) obj2;
                androidx.compose.ui.node.h0 h0Var = (androidx.compose.ui.node.h0) obj;
                long j10 = ((androidx.compose.ui.geometry.e) ((androidx.compose.material3.internal.q) obj4).get()).a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                if (fIntBitsToFloat > 0.0f) {
                    float fV = h0Var.V(androidx.compose.material3.c2.a);
                    androidx.compose.ui.graphics.drawscope.b bVar2 = h0Var.e;
                    float fV2 = h0Var.V(m0Var3.a(h0Var.getLayoutDirection()));
                    float fA = dVar5.a(kotlin.math.a.F(fIntBitsToFloat), kotlin.math.a.F((Float.intBitsToFloat((int) (bVar2.d() >> 32)) - fV2) - h0Var.V(m0Var3.b(h0Var.getLayoutDirection()))), h0Var.getLayoutDirection()) + fV2;
                    float f2 = 2;
                    float f3 = fIntBitsToFloat / f2;
                    float f4 = fA + f3;
                    float f5 = (f4 - f3) - fV;
                    float f6 = f5 < 0.0f ? 0.0f : f5;
                    float f7 = f4 + f3 + fV;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar2.d() >> 32));
                    float f8 = f7 > fIntBitsToFloat2 ? fIntBitsToFloat2 : f7;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                    float f9 = (-fIntBitsToFloat3) / f2;
                    float f10 = fIntBitsToFloat3 / f2;
                    androidx.appcompat.widget.c2 c2Var = bVar2.y;
                    long jH = c2Var.H();
                    c2Var.w().f();
                    try {
                        ((androidx.appcompat.widget.c2) ((com.google.firebase.platforminfo.c) c2Var.y).e).w().o(f6, f9, f8, f10, 0);
                        h0Var.b();
                    } finally {
                        androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var, jH);
                    }
                } else {
                    h0Var.b();
                }
                return yVar;
            case 10:
                androidx.compose.runtime.saveable.e eVar3 = (androidx.compose.runtime.saveable.e) obj4;
                androidx.compose.runtime.saveable.k kVar = (androidx.compose.runtime.saveable.k) obj2;
                androidx.collection.o0 o0Var = eVar3.y;
                if (o0Var.b(obj3)) {
                    androidx.media3.exoplayer.hls.playlist.a.g(obj3, " was used multiple times ", "Key ");
                    return null;
                }
                eVar3.e.remove(obj3);
                o0Var.m(obj3, kVar);
                return new androidx.compose.animation.g(i5, eVar3, obj3, kVar);
            case 11:
                androidx.compose.ui.text.x xVar5 = (androidx.compose.ui.text.x) obj2;
                Throwable th4 = (Throwable) obj;
                ((androidx.compose.ui.text.font.e) obj4).invoke(th4);
                Channel channel = ((androidx.datastore.core.c1) obj3).c;
                channel.close(th4);
                while (true) {
                    Object objM47getOrNullimpl = ChannelResult.m47getOrNullimpl(channel.mo35tryReceivePtdJZtk());
                    if (objM47getOrNullimpl == null) {
                        return yVar;
                    }
                    xVar5.invoke(objM47getOrNullimpl, th4);
                }
                break;
            case 12:
                androidx.lifecycle.v vVar5 = (androidx.lifecycle.v) obj4;
                kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
                androidx.core.view.k kVar2 = new androidx.core.view.k((androidx.lifecycle.compose.b) obj3, zVar, (kotlin.jvm.functions.l) obj2, i5);
                vVar5.getLifecycle().a(kVar2);
                return new androidx.compose.animation.g(i4, vVar5, kVar2, zVar);
            case 13:
                androidx.compose.runtime.snapshots.q qVar2 = (androidx.compose.runtime.snapshots.q) obj4;
                androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                qVar2.add(iVar);
                return new androidx.compose.animation.g((androidx.navigation.compose.o) obj2, iVar, qVar2);
            case 14:
                androidx.compose.ui.graphics.painter.b bVar3 = (androidx.compose.ui.graphics.painter.b) obj4;
                androidx.compose.ui.graphics.painter.b bVar4 = (androidx.compose.ui.graphics.painter.b) obj3;
                androidx.compose.ui.graphics.painter.b bVar5 = (androidx.compose.ui.graphics.painter.b) obj2;
                coil3.compose.h hVar6 = (coil3.compose.h) obj;
                if (hVar6 instanceof coil3.compose.f) {
                    return bVar3 != null ? new coil3.compose.f(bVar3) : (coil3.compose.f) hVar6;
                }
                if (!(hVar6 instanceof coil3.compose.e)) {
                    return hVar6;
                }
                coil3.compose.e eVar4 = (coil3.compose.e) hVar6;
                coil3.request.c cVar = eVar4.b;
                if (cVar.c instanceof coil3.request.m) {
                    return bVar4 != null ? new coil3.compose.e(bVar4, cVar) : eVar4;
                }
                return bVar5 != null ? new coil3.compose.e(bVar5, cVar) : eVar4;
            case 15:
                return d(obj);
            case 16:
                return e(obj);
            case 17:
                return f(obj);
            case 18:
                return g(obj);
            case 19:
                return h(obj);
            default:
                return TasksKt.asTask$lambda$0((com.google.android.gms.tasks.a) obj4, (Deferred) obj3, (com.google.android.gms.tasks.j) obj2, (Throwable) obj);
        }
    }

    public /* synthetic */ a(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }
}
