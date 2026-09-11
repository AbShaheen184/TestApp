package com.app.mlounge.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.u2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.platform.m0;
import androidx.core.content.FileProvider;
import androidx.datastore.preferences.protobuf.h1;
import androidx.lifecycle.w0;
import androidx.navigation.k0;
import com.app.mlounge.data.anime.AnimeSubtitleStore;
import com.app.mlounge.data.remote.model.HiAnimeTrack;
import com.app.mlounge.ui.viewmodel.k1;
import com.google.firebase.crashlytics.internal.model.t1;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {
    /* JADX WARN: Code duplicated, block: B:134:0x0436  */
    /* JADX WARN: Code duplicated, block: B:135:0x043a  */
    /* JADX WARN: Code duplicated, block: B:138:0x045e  */
    /* JADX WARN: Code duplicated, block: B:143:0x047c  */
    /* JADX WARN: Code duplicated, block: B:145:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:147:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:148:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:151:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:155:0x052a  */
    /* JADX WARN: Code duplicated, block: B:156:0x052e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0588  */
    /* JADX WARN: Code duplicated, block: B:165:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:167:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:169:0x0636  */
    /* JADX WARN: Code duplicated, block: B:172:0x0651  */
    /* JADX WARN: Code duplicated, block: B:174:0x0665  */
    /* JADX WARN: Code duplicated, block: B:176:0x067d  */
    public static final void a(androidx.compose.ui.r rVar, androidx.compose.runtime.r rVar2, int i) {
        boolean z;
        List list;
        Object d0Var;
        y0 y0Var;
        y0 y0Var2;
        String str;
        String str2;
        androidx.navigation.y yVar;
        final y0 y0Var3;
        Object obj;
        Context context;
        androidx.navigation.y yVar2;
        kotlin.jvm.functions.w wVar;
        y0 y0Var4;
        y0 y0Var5;
        y0 y0Var6;
        kotlin.jvm.functions.r rVar3;
        androidx.compose.ui.focus.y yVar3;
        boolean z2;
        androidx.compose.foundation.layout.a0 a0Var;
        String str3;
        androidx.compose.ui.node.y yVar4;
        androidx.compose.ui.node.e eVar;
        androidx.compose.ui.node.e eVar2;
        androidx.compose.ui.node.e eVar3;
        androidx.compose.ui.node.e eVar4;
        androidx.compose.ui.node.e eVar5;
        androidx.compose.ui.node.y yVar5;
        androidx.compose.ui.focus.y yVar6;
        androidx.compose.ui.focus.y yVar7;
        androidx.compose.ui.node.e eVar6;
        androidx.compose.ui.r h0Var;
        y0 y0Var7;
        kotlin.jvm.functions.r rVar4;
        kotlin.jvm.functions.w wVar2;
        y0 y0Var8;
        boolean zH;
        Object objQ;
        androidx.navigation.y yVar8;
        boolean z3;
        Object objQ2;
        Object objQ3;
        boolean zH2;
        Object objQ4;
        androidx.navigation.t tVar;
        androidx.compose.runtime.r rVar5 = rVar2;
        rVar5.c0(-1832585396);
        if (rVar5.T(i & 1, (i & 3) != 2)) {
            u2 u2Var = m0.b;
            Context context2 = (Context) rVar5.j(u2Var);
            Object[] objArrCopyOf = Arrays.copyOf(new k0[0], 0);
            androidx.compose.foundation.text.input.internal.o oVar = new androidx.compose.foundation.text.input.internal.o(13, new androidx.compose.ui.text.x(20), new androidx.compose.ui.text.font.e(context2, 5));
            boolean zH3 = rVar5.h(context2);
            Object objQ5 = rVar5.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (zH3 || objQ5 == fVar) {
                objQ5 = new androidx.navigation.compose.p(context2, 0);
                rVar5.l0(objQ5);
            }
            androidx.navigation.y yVar9 = (androidx.navigation.y) androidx.compose.runtime.saveable.n.d(objArrCopyOf, oVar, (kotlin.jvm.functions.a) objQ5, rVar5, 0, 4);
            androidx.navigation.i iVar = (androidx.navigation.i) androidx.compose.runtime.s.f(FlowKt.asSharedFlow(yVar9.b.A), null, null, rVar2, 48, 2).getValue();
            Object obj2 = null;
            byte b = 0;
            String str4 = (iVar == null || (tVar = iVar.y) == null) ? null : (String) tVar.y.e;
            w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar2);
            if (w0VarA == null) {
                net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            k1 k1Var = (k1) h1.B(kotlin.jvm.internal.a0.a(k1.class), w0VarA, androidx.room.r.i(w0VarA, rVar2), w0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar2);
            y0 y0VarF = androidx.compose.runtime.s.f(k1Var.r, null, null, rVar2, 48, 2);
            Flow flow = k1Var.d;
            Boolean bool = Boolean.FALSE;
            y0 y0VarF2 = androidx.compose.runtime.s.f(flow, bool, null, rVar2, 48, 2);
            y0 y0VarF3 = androidx.compose.runtime.s.f(k1Var.f, kotlin.collections.w.e, null, rVar2, 48, 2);
            androidx.compose.runtime.r rVar6 = rVar2;
            y0 y0VarF4 = androidx.compose.runtime.s.f(k1Var.K, kotlin.collections.u.e, null, rVar6, 48, 2);
            y0 y0VarF5 = androidx.compose.runtime.s.f(k1Var.p, bool, null, rVar6, 48, 2);
            y0 y0VarF6 = androidx.compose.runtime.s.f(k1Var.q, bool, null, rVar6, 48, 2);
            final y0 y0VarF7 = androidx.compose.runtime.s.f(k1Var.i, bool, null, rVar6, 48, 2);
            final Context context3 = (Context) rVar6.j(u2Var);
            Object objQ6 = rVar6.Q();
            if (objQ6 == fVar) {
                objQ6 = androidx.compose.runtime.j0.f(rVar6);
                rVar6.l0(objQ6);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objQ6;
            Object objQ7 = rVar6.Q();
            if (objQ7 == fVar) {
                Context applicationContext = context3.getApplicationContext();
                applicationContext.getClass();
                objQ7 = (com.app.mlounge.data.remote.ntv.l) ((com.app.mlounge.h) ((j0) com.google.android.material.resources.g.e(com.google.android.material.shape.e.e(applicationContext.getApplicationContext()), j0.class))).H.get();
                rVar6.l0(objQ7);
            }
            com.app.mlounge.data.remote.ntv.l lVar = (com.app.mlounge.data.remote.ntv.l) objQ7;
            Object objQ8 = rVar6.Q();
            if (objQ8 == fVar) {
                objQ8 = androidx.compose.runtime.s.r(null);
                rVar6.l0(objQ8);
            }
            y0 y0Var9 = (y0) objQ8;
            Object objQ9 = rVar6.Q();
            if (objQ9 == fVar) {
                objQ9 = androidx.compose.runtime.s.r(bool);
                rVar6.l0(objQ9);
            }
            final y0 y0Var10 = (y0) objQ9;
            Object objQ10 = rVar6.Q();
            if (objQ10 == fVar) {
                objQ10 = androidx.compose.runtime.s.r("");
                rVar6.l0(objQ10);
            }
            final y0 y0Var11 = (y0) objQ10;
            Object objQ11 = rVar6.Q();
            if (objQ11 == fVar) {
                objQ11 = androidx.compose.runtime.s.r(null);
                rVar6.l0(objQ11);
            }
            final y0 y0Var12 = (y0) objQ11;
            Object objQ12 = rVar6.Q();
            if (objQ12 == fVar) {
                objQ12 = androidx.compose.runtime.s.r(bool);
                rVar6.l0(objQ12);
            }
            y0 y0Var13 = (y0) objQ12;
            androidx.navigation.i iVar2 = (androidx.navigation.i) androidx.compose.runtime.s.f(FlowKt.asSharedFlow(yVar9.b.A), null, null, rVar6, 48, 2).getValue();
            Object objQ13 = rVar6.Q();
            if (objQ13 == fVar) {
                objQ13 = new androidx.compose.foundation.text.selection.q(y0Var13, b == true ? 1 : 0, 4);
                rVar6.l0(objQ13);
            }
            androidx.compose.runtime.j0.c(rVar6, iVar2, (kotlin.jvm.functions.p) objQ13);
            Object objQ14 = rVar6.Q();
            if (objQ14 == fVar) {
                objQ14 = androidx.compose.runtime.s.k(new androidx.compose.foundation.gestures.g(6, y0VarF4, y0VarF2, y0VarF3));
                rVar6.l0(objQ14);
            }
            t2 t2Var = (t2) objQ14;
            for (Object obj3 : (List) t2Var.getValue()) {
                if (!kotlin.jvm.internal.l.a((com.app.mlounge.ui.navigation.w) obj3, com.app.mlounge.ui.navigation.p.g)) {
                    obj2 = obj3;
                    break;
                }
            }
            com.app.mlounge.ui.navigation.w wVar3 = (com.app.mlounge.ui.navigation.w) obj2;
            if (wVar3 == null) {
                wVar3 = (com.app.mlounge.ui.navigation.w) kotlin.collections.o.M((List) t2Var.getValue());
            }
            String str5 = wVar3 != null ? wVar3.a : com.app.mlounge.ui.navigation.k.g.a;
            boolean zF = rVar6.f((List) t2Var.getValue()) | rVar6.f(str4);
            Object objQ15 = rVar6.Q();
            if (zF || objQ15 == fVar) {
                if (str4 != null && ((list = com.app.mlounge.ui.navigation.w.f) == null || !list.isEmpty())) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((com.app.mlounge.ui.navigation.w) it.next()).a.equals(str4)) {
                                List list2 = (List) t2Var.getValue();
                                if (list2 == null || !list2.isEmpty()) {
                                    Iterator it2 = list2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (((com.app.mlounge.ui.navigation.w) it2.next()).a.equals(str4)) {
                                            }
                                        }
                                    }
                                }
                                z = true;
                                break;
                            }
                        }
                        z = false;
                        break;
                    }
                }
                z = false;
                break;
                objQ15 = Boolean.valueOf(z);
                rVar6.l0(objQ15);
            }
            Boolean bool2 = (Boolean) objQ15;
            boolean zBooleanValue = bool2.booleanValue();
            boolean zG = rVar6.g(zBooleanValue) | rVar6.f(str4) | rVar6.f(str5) | rVar6.h(yVar9);
            Object objQ16 = rVar6.Q();
            if (zG || objQ16 == fVar) {
                String str6 = str5;
                y0Var = y0VarF;
                String str7 = str4;
                y0Var2 = y0VarF2;
                d0Var = new d0(zBooleanValue, str7, str6, yVar9, y0Var13, null);
                str = str7;
                str2 = str6;
                yVar = yVar9;
                y0Var3 = y0Var13;
                rVar6.l0(d0Var);
            } else {
                d0Var = objQ16;
                y0Var2 = y0VarF2;
                yVar = yVar9;
                str = str4;
                y0Var3 = y0Var13;
                str2 = str5;
                y0Var = y0VarF;
            }
            androidx.compose.runtime.j0.d(bool2, str2, (kotlin.jvm.functions.p) d0Var, rVar6);
            boolean zF2 = rVar6.f(y0Var) | rVar6.h(coroutineScope) | rVar6.h(context3) | rVar6.h(yVar);
            Object objQ17 = rVar6.Q();
            if (zF2 || objQ17 == fVar) {
                final y0 y0Var14 = y0Var;
                final androidx.navigation.y yVar10 = yVar;
                obj = new kotlin.jvm.functions.w() { // from class: com.app.mlounge.ui.p
                    @Override // kotlin.jvm.functions.w
                    public final Object b(Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
                        String str8 = (String) obj4;
                        String str9 = (String) obj5;
                        Map map = (Map) obj6;
                        String str10 = (String) obj7;
                        String str11 = (String) obj8;
                        int iIntValue = ((Integer) obj9).intValue();
                        int iIntValue2 = ((Integer) obj10).intValue();
                        int iIntValue3 = ((Integer) obj11).intValue();
                        String str12 = (String) obj12;
                        str8.getClass();
                        str9.getClass();
                        str10.getClass();
                        str12.getClass();
                        y0 y0Var15 = y0Var3;
                        if (!h0.b(y0Var15)) {
                            y0Var15.setValue(Boolean.TRUE);
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.app.mlounge.data.download.d((String) y0Var14.getValue(), context3, str12, str8, str9, map, yVar10, str10, str11, iIntValue, iIntValue2, iIntValue3, y0Var15, (kotlin.coroutines.d) null), 3, null);
                        }
                        return kotlin.y.a;
                    }
                };
                context = context3;
                yVar2 = yVar10;
                rVar6.l0(obj);
            } else {
                obj = objQ17;
                yVar2 = yVar;
                context = context3;
            }
            final kotlin.jvm.functions.w wVar4 = (kotlin.jvm.functions.w) obj;
            boolean zF3 = rVar6.f(y0VarF7) | rVar6.h(coroutineScope) | rVar6.h(context) | rVar6.f(wVar4);
            Object objQ18 = rVar6.Q();
            if (zF3 || objQ18 == fVar) {
                final Context context4 = context;
                final y0 y0Var15 = y0Var3;
                objQ18 = new kotlin.jvm.functions.w() { // from class: com.app.mlounge.ui.r
                    @Override // kotlin.jvm.functions.w
                    public final Object b(Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
                        String str8 = (String) obj4;
                        String str9 = (String) obj5;
                        Map map = (Map) obj6;
                        String str10 = (String) obj7;
                        String str11 = (String) obj8;
                        Integer num = (Integer) obj9;
                        int iIntValue = num.intValue();
                        Integer num2 = (Integer) obj10;
                        int iIntValue2 = num2.intValue();
                        Integer num3 = (Integer) obj11;
                        int iIntValue3 = num3.intValue();
                        String str12 = (String) obj12;
                        str8.getClass();
                        str9.getClass();
                        str10.getClass();
                        str12.getClass();
                        if (!h0.b(y0Var15)) {
                            y0 y0Var16 = y0Var10;
                            if (!((Boolean) y0Var16.getValue()).booleanValue()) {
                                boolean zD0 = kotlin.text.k.d0(str8);
                                kotlin.jvm.functions.w wVar5 = wVar4;
                                if (zD0 && ((Boolean) y0VarF7.getValue()).booleanValue()) {
                                    y0Var16.setValue(Boolean.TRUE);
                                    y0 y0Var17 = y0Var11;
                                    y0Var17.setValue("Starting search...");
                                    y0 y0Var18 = y0Var12;
                                    Job job = (Job) y0Var18.getValue();
                                    if (job != null) {
                                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                    }
                                    y0Var18.setValue(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new g0(context4, iIntValue, str12, str10, iIntValue2, iIntValue3, str9, wVar5, y0Var17, y0Var16, null), 3, null));
                                } else {
                                    wVar5.b(str8, str9, map, str10, str11, num, num2, num3, str12);
                                }
                            }
                        }
                        return kotlin.y.a;
                    }
                };
                wVar = wVar4;
                y0Var4 = y0Var15;
                y0Var5 = y0VarF7;
                rVar6.l0(objQ18);
            } else {
                y0Var5 = y0VarF7;
                wVar = wVar4;
                y0Var4 = y0Var3;
            }
            kotlin.jvm.functions.w wVar5 = (kotlin.jvm.functions.w) objQ18;
            boolean zF4 = rVar6.f(y0Var) | rVar6.h(context) | rVar6.h(yVar2);
            Object objQ19 = rVar6.Q();
            if (zF4 || objQ19 == fVar) {
                objQ19 = new u(context, yVar2, y0Var4, y0Var);
                rVar6.l0(objQ19);
            }
            kotlin.jvm.functions.r rVar7 = (kotlin.jvm.functions.r) objQ19;
            boolean zH4 = rVar6.h(coroutineScope) | rVar6.h(lVar) | rVar6.h(context) | rVar6.f(rVar7);
            Object objQ20 = rVar6.Q();
            if (zH4 || objQ20 == fVar) {
                y0Var6 = y0Var9;
                objQ20 = new w(coroutineScope, rVar7, lVar, context, y0Var6, 0);
                rVar3 = rVar7;
                rVar6.l0(objQ20);
            } else {
                rVar3 = rVar7;
                y0Var6 = y0Var9;
            }
            kotlin.jvm.functions.r rVar8 = (kotlin.jvm.functions.r) objQ20;
            Object objQ21 = rVar6.Q();
            if (objQ21 == fVar) {
                objQ21 = new androidx.compose.ui.focus.y();
                rVar6.l0(objQ21);
            }
            androidx.compose.ui.focus.y yVar11 = (androidx.compose.ui.focus.y) objQ21;
            Object objQ22 = rVar6.Q();
            if (objQ22 == fVar) {
                objQ22 = new androidx.compose.ui.focus.y();
                rVar6.l0(objQ22);
            }
            androidx.compose.ui.focus.y yVar12 = (androidx.compose.ui.focus.y) objQ22;
            if (str != null) {
                yVar3 = yVar11;
                z2 = kotlin.text.r.O(str, "player", false);
                a0Var = androidx.compose.foundation.layout.w0.c;
                androidx.compose.ui.r rVarD = rVar.d(a0Var);
                str3 = str;
                t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.G, rVar6, 0);
                int iHashCode = Long.hashCode(rVar6.T);
                androidx.compose.runtime.internal.j jVarL = rVar6.l();
                androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar6, rVarD);
                androidx.compose.ui.node.g.b.getClass();
                yVar4 = androidx.compose.ui.node.f.b;
                rVar6.e0();
                if (rVar6.S) {
                    rVar6.k(yVar4);
                } else {
                    rVar6.o0();
                }
                eVar = androidx.compose.ui.node.f.e;
                androidx.compose.runtime.s.x(rVar6, t0VarA, eVar);
                eVar2 = androidx.compose.ui.node.f.d;
                androidx.compose.runtime.s.x(rVar6, jVarL, eVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                androidx.compose.ui.node.e eVar7 = androidx.compose.ui.node.f.f;
                androidx.compose.runtime.s.p(rVar6, numValueOf, eVar7);
                androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                androidx.compose.runtime.s.t(rVar6, dVar);
                eVar3 = androidx.compose.ui.node.f.c;
                androidx.compose.runtime.s.x(rVar6, rVarC, eVar3);
                if (z2) {
                    eVar4 = eVar2;
                    eVar5 = eVar;
                    yVar5 = yVar4;
                    yVar7 = yVar3;
                    eVar6 = eVar3;
                    rVar6.b0(-1127064678);
                    rVar6.p(false);
                } else {
                    rVar6.b0(-1127849815);
                    List list3 = (List) t2Var.getValue();
                    zH2 = rVar6.h(yVar2);
                    objQ4 = rVar6.Q();
                    if (zH2 || objQ4 == fVar) {
                        objQ4 = new d(yVar2, y0Var4, 12);
                        rVar6.l0(objQ4);
                    }
                    eVar5 = eVar;
                    yVar5 = yVar4;
                    eVar4 = eVar2;
                    androidx.compose.ui.focus.y yVar13 = yVar3;
                    eVar6 = eVar3;
                    yVar6 = yVar12;
                    com.app.mlounge.ui.components.b0.q(str3, list3, (kotlin.jvm.functions.l) objQ4, yVar13, yVar6, null, rVar6, 27648);
                    yVar7 = yVar13;
                    rVar6 = rVar6;
                    rVar6.p(false);
                }
                if (z2) {
                    yVar6 = yVar12;
                    h0Var = a0Var;
                } else {
                    yVar6 = yVar12;
                    if (1.0f <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    h0Var = new androidx.compose.foundation.layout.h0(1.0f, true);
                }
                androidx.compose.ui.r rVarK = androidx.compose.ui.focus.d.k(h0Var, yVar6);
                q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                int iHashCode2 = Long.hashCode(rVar6.T);
                androidx.compose.runtime.internal.j jVarL2 = rVar6.l();
                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar6, rVarK);
                rVar6.e0();
                if (rVar6.S) {
                    rVar6.k(yVar5);
                } else {
                    rVar6.o0();
                }
                androidx.compose.runtime.s.x(rVar6, q0VarD, eVar5);
                androidx.compose.runtime.s.x(rVar6, jVarL2, eVar4);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar6, eVar7, rVar6, dVar);
                androidx.compose.runtime.s.x(rVar6, rVarC2, eVar6);
                y0Var7 = y0Var5;
                rVar4 = rVar3;
                wVar2 = wVar;
                y0Var8 = y0Var2;
                zH = rVar6.h(yVar2) | rVar6.f(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x057d: ARITH (r1v68 'zH' boolean) = (wrap boolean:0x0576: ARITH (wrap boolean:0x056f: ARITH (wrap boolean:0x0568: ARITH (wrap boolean:0x0561: ARITH (wrap boolean:0x055a: ARITH (wrap boolean:0x0553: ARITH (wrap boolean:0x054c: ARITH (wrap boolean:0x0545: ARITH (wrap boolean:0x053d: INVOKE (r4v7 'rVar6' androidx.compose.runtime.r), (r11v9 'yVar2' androidx.navigation.y) VIRTUAL call: androidx.compose.runtime.r.h(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1342)) | (wrap boolean:0x0541: INVOKE (r4v7 'rVar6' androidx.compose.runtime.r), (r16v10 java.lang.Object) VIRTUAL call: androidx.compose.runtime.r.f(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1346)) A[DONT_WRAP, WRAPPED] (LINE:1350)) | (wrap boolean:0x0548: INVOKE (r4v7 'rVar6' androidx.compose.runtime.r), (r12v8 'wVar5' kotlin.jvm.functions.w) VIRTUAL call: androidx.compose.runtime.r.f(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1353)) A[DONT_WRAP, WRAPPED] (LINE:1357)) | (wrap boolean:0x054f: INVOKE (r4v7 'rVar6' androidx.compose.runtime.r), (r13v5 'y0Var7' androidx.compose.runtime.y0) VIRTUAL call: androidx.compose.runtime.r.f(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1360)) A[DONT_WRAP, WRAPPED] (LINE:1364)) | (wrap boolean:0x0556: INVOKE (r4v7 'rVar6' androidx.compose.runtime.r), (r5v51 'rVar4' kotlin.jvm.functions.r) VIRTUAL call: androidx.compose.runtime.r.f(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1367)) A[DONT_WRAP, WRAPPED] (LINE:1371)) | (wrap boolean:0x055d: INVOKE (r4v7 'rVar6' androidx.compose.runtime.r), (r22v1 'coroutineScope' kotlinx.coroutines.CoroutineScope) VIRTUAL call: androidx.compose.runtime.r.h(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1374)) A[DONT_WRAP, WRAPPED] (LINE:1378)) | (wrap boolean:0x0564: INVOKE (r4v7 'rVar6' androidx.compose.runtime.r), (r15v11 'wVar2' kotlin.jvm.functions.w) VIRTUAL call: androidx.compose.runtime.r.f(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1381)) A[DONT_WRAP, WRAPPED] (LINE:1385)) | (wrap boolean:0x056b: INVOKE (r4v7 'rVar6' androidx.compose.runtime.r), (r9v13 'y0Var8' androidx.compose.runtime.y0) VIRTUAL call: androidx.compose.runtime.r.f(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1388)) A[DONT_WRAP, WRAPPED] (LINE:1392)) | (wrap boolean:0x0572: INVOKE (r4v7 'rVar6' androidx.compose.runtime.r), (r25v0 'y0VarF5' androidx.compose.runtime.y0) VIRTUAL call: androidx.compose.runtime.r.f(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1395)) A[DONT_WRAP, WRAPPED] (LINE:1399)) | (wrap boolean:0x0579: INVOKE (r4v7 'rVar6' androidx.compose.runtime.r), (r27v0 'y0VarF6' androidx.compose.runtime.y0) VIRTUAL call: androidx.compose.runtime.r.f(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1402)) (LINE:1406) in method: com.app.mlounge.ui.h0.a(androidx.compose.ui.r, androidx.compose.runtime.r, int):void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v10 java.lang.Object
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1699
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.h0.a(androidx.compose.ui.r, androidx.compose.runtime.r, int):void");
            }

            public static final boolean b(y0 y0Var) {
                return ((Boolean) y0Var.getValue()).booleanValue();
            }

            public static final void c(String str, kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar, int i) {
                kotlin.jvm.functions.a aVar2;
                androidx.compose.runtime.r rVar2;
                str.getClass();
                aVar.getClass();
                rVar.c0(-1789708697);
                int i2 = (rVar.f(str) ? 4 : 2) | i;
                if (rVar.T(i2 & 1, (i2 & 19) != 18)) {
                    aVar2 = aVar;
                    rVar2 = rVar;
                    t1.a(aVar2, null, androidx.compose.runtime.internal.k.c(1573244030, new v(str, aVar, 0), rVar), rVar2, 390, 2);
                } else {
                    aVar2 = aVar;
                    rVar2 = rVar;
                    rVar2.W();
                }
                q1 q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new v(str, aVar2, i, 1);
                }
            }

            public static final void d(Context context, String str, String str2, Map map, String str3, long j) {
                List<HiAnimeTrack> listConsume = AnimeSubtitleStore.INSTANCE.consume();
                Uri uriD = Uri.parse(str);
                if (kotlin.jvm.internal.l.a(uriD.getScheme(), "file")) {
                    try {
                        String str4 = context.getPackageName() + ".provider";
                        String path = uriD.getPath();
                        path.getClass();
                        uriD = FileProvider.d(context, str4, new File(path));
                    } catch (Exception e) {
                        kotlin.o oVar = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.b("CinemaHQ", "FileProvider conversion failed for " + uriD.getPath(), e);
                    }
                }
                Uri uri = uriD;
                try {
                    context.startActivity(e(str, str3, uri, str2, map, listConsume, j, true));
                } catch (Exception e2) {
                    kotlin.o oVar2 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.a("CinemaHQ", "External player launch failed for " + str3 + ": " + e2.getMessage());
                    try {
                        context.startActivity(e(str, str3, uri, str2, map, listConsume, j, false));
                    } catch (Exception unused) {
                        Toast.makeText(context, "No compatible player found", 0).show();
                    }
                }
            }

            public static final Intent e(String str, String str2, Uri uri, String str3, Map map, List list, long j, boolean z) {
                Object obj;
                String strA;
                String strB;
                Intent intent = new Intent("android.intent.action.VIEW");
                String lowerCase = kotlin.text.k.s0(str, ".", "").toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String str4 = "video/*";
                String str5 = (lowerCase.equals("m3u8") || kotlin.text.k.T(str, "m3u8", false) || kotlin.text.k.T(str, ".mpd", false) || kotlin.text.k.T(str, "playlist", false) || kotlin.text.k.T(str, "master", false)) ? kotlin.text.k.T(str, ".mpd", false) ? "application/dash+xml" : "application/vnd.apple.mpegurl" : "video/*";
                if (!kotlin.jvm.internal.l.a(str2, "com.player.bear") && !kotlin.jvm.internal.l.a(str2, "com.brouken.player")) {
                    str4 = str5;
                }
                intent.setDataAndType(uri, str4);
                if (z) {
                    intent.setPackage(str2);
                }
                intent.putExtra("title", str3);
                if (map != null && !map.isEmpty()) {
                    Bundle bundle = new Bundle();
                    for (Map.Entry entry : map.entrySet()) {
                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    intent.putExtra("android.media.intent.extra.HTTP_HEADERS", bundle);
                    String str6 = (String) map.get("User-Agent");
                    if (str6 != null) {
                        intent.putExtra("android.intent.extra.user_agent", str6);
                    }
                    if (kotlin.jvm.internal.l.a(str2, "org.videolan.vlc")) {
                        intent.putExtra("headers", bundle);
                    } else if (kotlin.text.k.T(str2, "videoplayer", false) || kotlin.text.k.T(str2, "hbplayer", false)) {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry2 : map.entrySet()) {
                            String str7 = (String) entry2.getKey();
                            String str8 = (String) entry2.getValue();
                            arrayList.add(str7);
                            arrayList.add(str8);
                        }
                        intent.putExtra("headers", (String[]) arrayList.toArray(new String[0]));
                    }
                    ArrayList arrayList2 = new ArrayList(map.size());
                    for (Map.Entry entry3 : map.entrySet()) {
                        arrayList2.add(entry3.getKey() + ": " + entry3.getValue());
                    }
                    intent.putExtra("extra_headers", (String[]) arrayList2.toArray(new String[0]));
                }
                if (!list.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = list.iterator();
                    while (true) {
                        obj = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        String strA2 = ((HiAnimeTrack) it.next()).a();
                        obj = strA2 != null ? Uri.parse(strA2) : null;
                        if (obj != null) {
                            arrayList3.add(obj);
                        }
                    }
                    Uri[] uriArr = (Uri[]) arrayList3.toArray(new Uri[0]);
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        String strB2 = ((HiAnimeTrack) it2.next()).b();
                        if (strB2 != null) {
                            arrayList4.add(strB2);
                        }
                    }
                    String[] strArr = (String[]) arrayList4.toArray(new String[0]);
                    if (uriArr.length != 0) {
                        Uri[] uriArr2 = uriArr;
                        intent.putExtra("subs", uriArr2);
                        intent.putExtra("subs.name", strArr);
                        intent.putExtra("subs.filename", strArr);
                        intent.putExtra("subs.enable", uriArr2);
                    }
                    for (Object obj2 : list) {
                        HiAnimeTrack hiAnimeTrack = (HiAnimeTrack) obj2;
                        if (kotlin.jvm.internal.l.a(hiAnimeTrack.c(), Boolean.TRUE) || ((strB = hiAnimeTrack.b()) != null && kotlin.text.k.T(strB, "English", true))) {
                            obj = obj2;
                            break;
                        }
                    }
                    HiAnimeTrack hiAnimeTrack2 = (HiAnimeTrack) obj;
                    if (hiAnimeTrack2 != null && (strA = hiAnimeTrack2.a()) != null) {
                        intent.putExtra("subtitles_location", strA);
                    }
                }
                if (kotlin.text.k.T(str2, "videoplayer", false) || kotlin.text.k.T(str2, "hbplayer", false)) {
                    intent.putExtra("decode_mode", 4);
                }
                if (j > 0) {
                    intent.putExtra("position", (int) j);
                    intent.putExtra("return_result", true);
                }
                intent.addFlags(1);
                return intent;
            }

            public static final void f(androidx.navigation.y yVar, String str, String str2, Map map, String str3, String str4, int i, int i2, int i3, String str5) {
                Set setEntrySet;
                String strR = (map == null || (setEntrySet = map.entrySet()) == null) ? "" : kotlin.collections.o.R(setEntrySet, "\n", null, null, new q(14), 30);
                String strEncode = Uri.encode(str);
                String strEncode2 = Uri.encode(str2);
                String strEncode3 = Uri.encode(strR);
                if (str4 == null) {
                    str4 = "";
                }
                String strEncode4 = Uri.encode(str4);
                String strEncode5 = Uri.encode(str5);
                StringBuilder sbO = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("player?url=", strEncode, "&title=", strEncode2, "&headers=");
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sbO, strEncode3, "&contentType=", str3, "&streamType=");
                sbO.append(strEncode4);
                sbO.append("&tmdbId=");
                sbO.append(i);
                sbO.append("&season=");
                sbO.append(i2);
                sbO.append("&episode=");
                sbO.append(i3);
                sbO.append("&contentKey=");
                sbO.append(strEncode5);
                androidx.navigation.y.b(yVar, sbO.toString());
            }
        }
