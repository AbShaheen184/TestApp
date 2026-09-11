package com.app.mlounge.ui.viewmodel;

import android.content.Context;
import com.app.mlounge.data.remote.api.NtvApi;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.NtvChannel;
import com.app.mlounge.data.remote.model.NtvChannelsResponse;
import com.app.mlounge.data.remote.model.SportsMatch;
import com.app.mlounge.data.remote.model.SportsMatchResponse;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends androidx.lifecycle.q0 {
    public final SharedFlow A;
    public final MutableStateFlow B;
    public final StateFlow C;
    public final MutableStateFlow D;
    public final StateFlow E;
    public final MutableStateFlow F;
    public final StateFlow G;
    public final MutableStateFlow H;
    public final StateFlow I;
    public final MutableStateFlow J;
    public final StateFlow K;
    public final MutableStateFlow L;
    public final StateFlow M;
    public final List N;
    public final List O;
    public final LinkedHashSet P;
    public final Context b;
    public final com.app.mlounge.data.repository.x c;
    public final NtvApi d;
    public final com.app.mlounge.data.remote.ntv.l e;
    public final com.app.mlounge.data.iptv.c0 f;
    public final com.app.mlounge.data.iptv.l g;
    public final com.app.mlounge.data.local.dao.k h;
    public final com.app.mlounge.data.local.prefs.y1 i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public final MutableStateFlow l;
    public final MutableStateFlow m;
    public final StateFlow n;
    public final MutableStateFlow o;
    public final StateFlow p;
    public final MutableStateFlow q;
    public final StateFlow r;
    public final MutableStateFlow s;
    public final StateFlow t;
    public final MutableStateFlow u;
    public final StateFlow v;
    public final Set w;
    public final MutableStateFlow x;
    public final StateFlow y;
    public final MutableSharedFlow z;

    public a0(Context context, com.app.mlounge.data.repository.r rVar, com.app.mlounge.data.repository.x xVar, NtvApi ntvApi, com.app.mlounge.data.remote.ntv.l lVar, com.app.mlounge.data.iptv.c0 c0Var, com.app.mlounge.data.iptv.l lVar2, com.app.mlounge.data.local.dao.k kVar, com.app.mlounge.data.local.prefs.y1 y1Var) {
        rVar.getClass();
        xVar.getClass();
        ntvApi.getClass();
        lVar.getClass();
        c0Var.getClass();
        lVar2.getClass();
        y1Var.getClass();
        this.b = context;
        this.c = xVar;
        this.d = ntvApi;
        this.e = lVar;
        this.f = c0Var;
        this.g = lVar2;
        this.h = kVar;
        this.i = y1Var;
        kotlin.collections.u uVar = kotlin.collections.u.e;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(uVar);
        this.j = MutableStateFlow;
        this.k = FlowKt.asStateFlow(MutableStateFlow);
        this.l = StateFlowKt.MutableStateFlow(uVar);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(uVar);
        this.m = MutableStateFlow2;
        this.n = FlowKt.asStateFlow(MutableStateFlow2);
        kotlin.coroutines.d dVar = null;
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.o = MutableStateFlow3;
        this.p = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.q = MutableStateFlow4;
        this.r = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.s = MutableStateFlow5;
        this.t = FlowKt.asStateFlow(MutableStateFlow5);
        List list = com.app.mlounge.data.repository.r.M;
        MutableStateFlow MutableStateFlow6 = StateFlowKt.MutableStateFlow(((kotlin.k) kotlin.collections.o.K(list)).e);
        this.u = MutableStateFlow6;
        this.v = FlowKt.asStateFlow(MutableStateFlow6);
        ArrayList arrayList = new ArrayList(kotlin.collections.p.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((kotlin.k) it.next()).e);
        }
        this.w = kotlin.collections.o.o0(arrayList);
        MutableStateFlow MutableStateFlow7 = StateFlowKt.MutableStateFlow("");
        this.x = MutableStateFlow7;
        this.y = FlowKt.asStateFlow(MutableStateFlow7);
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.z = mutableSharedFlowMutableSharedFlow$default;
        this.A = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow MutableStateFlow8 = StateFlowKt.MutableStateFlow(null);
        this.B = MutableStateFlow8;
        this.C = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow MutableStateFlow9 = StateFlowKt.MutableStateFlow(kotlin.collections.v.e);
        this.D = MutableStateFlow9;
        this.E = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow MutableStateFlow10 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.F = MutableStateFlow10;
        this.G = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow MutableStateFlow11 = StateFlowKt.MutableStateFlow(uVar);
        this.H = MutableStateFlow11;
        this.I = FlowKt.asStateFlow(MutableStateFlow11);
        MutableStateFlow MutableStateFlow12 = StateFlowKt.MutableStateFlow(null);
        this.J = MutableStateFlow12;
        this.K = FlowKt.asStateFlow(MutableStateFlow12);
        MutableStateFlow MutableStateFlow13 = StateFlowKt.MutableStateFlow(null);
        this.L = MutableStateFlow13;
        this.M = FlowKt.asStateFlow(MutableStateFlow13);
        this.N = com.google.common.base.c.q("Kobra", "Raptor");
        this.O = com.app.mlounge.data.repository.r.M;
        com.app.mlounge.data.iptv.c0.Companion.getClass();
        this.P = com.google.common.base.i.s(com.google.common.base.i.s(com.app.mlounge.data.iptv.c0.PROVIDER_SOURCES.keySet(), "plutotv"), "earthcam");
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new u(this, dVar, 0), 3, null);
    }

    public static final void e(a0 a0Var) {
        Iterable iterable = (Iterable) a0Var.j.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String strE = ((IptvChannel) it.next()).e();
            if (strE != null) {
                arrayList.add(strE);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!kotlin.text.k.d0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        Set setO0 = kotlin.collections.o.o0(arrayList2);
        if (setO0.isEmpty() || !a0Var.g.l()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(a0Var), Dispatchers.getIO(), null, new androidx.compose.foundation.text.input.internal.k(a0Var, setO0, null, 14), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(a0 a0Var, String str, kotlin.coroutines.jvm.internal.c cVar) {
        w wVar;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i = wVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                wVar.z = i - Integer.MIN_VALUE;
            } else {
                wVar = new w(a0Var, cVar);
            }
        } else {
            wVar = new w(a0Var, cVar);
        }
        Object objA = wVar.e;
        int i2 = wVar.z;
        if (i2 == 0) {
            kotlin.a.e(objA);
            com.app.mlounge.data.local.dao.k kVar = a0Var.h;
            wVar.z = 1;
            objA = com.google.android.gms.dynamite.g.A(((com.app.mlounge.data.local.dao.l) kVar).a, wVar, new androidx.compose.material3.r0(str, 4), true, false);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(objA);
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : (Iterable) objA) {
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        a0Var.m.setValue(arrayList);
        a0Var.o.setValue(kotlin.collections.o.M(arrayList));
        a0Var.i();
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object g(a0 a0Var, kotlin.coroutines.jvm.internal.c cVar) throws UnsupportedEncodingException {
        x xVar;
        String string;
        String strE;
        String strE2;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i = xVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                xVar.z = i - Integer.MIN_VALUE;
            } else {
                xVar = new x(a0Var, cVar);
            }
        } else {
            xVar = new x(a0Var, cVar);
        }
        Object channels = xVar.e;
        int i2 = xVar.z;
        if (i2 == 0) {
            kotlin.a.e(channels);
            NtvApi ntvApi = a0Var.d;
            xVar.z = 1;
            channels = ntvApi.getChannels(xVar);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (channels == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(channels);
        }
        Iterable<NtvChannel> iterableA = ((NtvChannelsResponse) channels).a();
        if (iterableA == null) {
            iterableA = kotlin.collections.u.e;
        }
        String lowerCase = ((String) a0Var.x.getValue()).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (!kotlin.text.k.d0(lowerCase)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterableA) {
                String strD = ((NtvChannel) obj).d();
                if (strD != null && kotlin.text.k.T(strD, lowerCase, true)) {
                    arrayList.add(obj);
                }
            }
            iterableA = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (NtvChannel ntvChannel : iterableA) {
            String strF = ntvChannel.f();
            String str = strF == null ? "cdnlive" : strF;
            Object iptvChannel = null;
            if (!str.equals("cdnlive") && (!str.equals("hesgoales") || ((strE2 = ntvChannel.e()) != null && kotlin.text.k.T(strE2, "livelive24.com", false)))) {
                if (str.equals("hesgoales") || ((strE = ntvChannel.e()) != null && kotlin.text.k.T(strE, "livelive24.com", false))) {
                    String strE3 = ntvChannel.e();
                    if (strE3 == null) {
                        strE3 = "";
                    }
                    String strEncode = URLEncoder.encode(strE3, "UTF-8");
                    String strD2 = ntvChannel.d();
                    if (strD2 == null) {
                        strD2 = "Unknown";
                    }
                    String strA = ntvChannel.a();
                    if (strA == null) {
                        strA = "";
                    }
                    String strB = ntvChannel.b();
                    String str2 = strB != null ? strB : "";
                    StringBuilder sbO = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("ntv://", strD2, "|", strA, "|");
                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sbO, str, "|", str2, "|");
                    sbO.append(strEncode);
                    string = sbO.toString();
                } else {
                    String strD3 = ntvChannel.d();
                    if (strD3 == null) {
                        strD3 = "Unknown";
                    }
                    String strA2 = ntvChannel.a();
                    if (strA2 == null) {
                        strA2 = "";
                    }
                    String strB2 = ntvChannel.b();
                    string = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("ntv://", strD3, "|", strA2, "|"), str, "|", strB2 != null ? strB2 : "");
                }
                String strD4 = ntvChannel.d();
                if (strD4 == null) {
                    strD4 = "Unknown";
                }
                String strC = ntvChannel.c();
                iptvChannel = new IptvChannel(strD4, string, strC != null ? kotlin.text.r.M(strC, "dlhd.link", "dlhd.st", false) : null, str, "ntv", ntvChannel.b());
            }
            if (iptvChannel != null) {
                arrayList2.add(iptvChannel);
            }
        }
        a0Var.l(arrayList2, false);
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078 A[LOOP:0: B:26:0x0072->B:28:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098 A[LOOP:1: B:32:0x0092->B:34:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object h(a0 a0Var, kotlin.coroutines.jvm.internal.c cVar) {
        y yVar;
        SportsMatchResponse sportsMatchResponse;
        ArrayList arrayList;
        List listB;
        List listA;
        Iterator it;
        Iterator it2;
        NtvApi ntvApi = a0Var.d;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i = yVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                yVar.A = i - Integer.MIN_VALUE;
            } else {
                yVar = new y(a0Var, cVar);
            }
        } else {
            yVar = new y(a0Var, cVar);
        }
        Object matches = yVar.y;
        int i2 = yVar.A;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(matches);
            a0Var.J.setValue(null);
            yVar.A = 1;
            matches = ntvApi.getMatches("kobra", "both", yVar);
            if (matches != aVar) {
            }
            return aVar;
        }
        if (i2 == 1) {
            kotlin.a.e(matches);
        } else {
            if (i2 != 2) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sportsMatchResponse = yVar.e;
            kotlin.a.e(matches);
        }
        SportsMatchResponse sportsMatchResponse2 = (SportsMatchResponse) matches;
        arrayList = new ArrayList();
        listB = sportsMatchResponse.b();
        if (listB != null) {
            it2 = listB.iterator();
            while (it2.hasNext()) {
                arrayList.add(SportsMatch.a((SportsMatch) it2.next(), "Kobra"));
            }
        }
        listA = sportsMatchResponse2.a();
        if (listA != null) {
            it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(SportsMatch.a((SportsMatch) it.next(), "Raptor"));
            }
        }
        a0Var.H.setValue(kotlin.collections.o.f0(arrayList, new androidx.constraintlayout.core.e(18)));
        MutableStateFlow mutableStateFlow = a0Var.j;
        kotlin.collections.u uVar = kotlin.collections.u.e;
        mutableStateFlow.setValue(uVar);
        a0Var.m.setValue(uVar);
        return kotlin.y.a;
        SportsMatchResponse sportsMatchResponse3 = (SportsMatchResponse) matches;
        yVar.e = sportsMatchResponse3;
        yVar.A = 2;
        Object matches2 = ntvApi.getMatches("raptor", "both", yVar);
        if (matches2 != aVar) {
            sportsMatchResponse = sportsMatchResponse3;
            matches = matches2;
            SportsMatchResponse sportsMatchResponse4 = (SportsMatchResponse) matches;
            arrayList = new ArrayList();
            listB = sportsMatchResponse.b();
            if (listB != null) {
                it2 = listB.iterator();
                while (it2.hasNext()) {
                    arrayList.add(SportsMatch.a((SportsMatch) it2.next(), "Kobra"));
                }
            }
            listA = sportsMatchResponse4.a();
            if (listA != null) {
                it = listA.iterator();
                while (it.hasNext()) {
                    arrayList.add(SportsMatch.a((SportsMatch) it.next(), "Raptor"));
                }
            }
            a0Var.H.setValue(kotlin.collections.o.f0(arrayList, new androidx.constraintlayout.core.e(18)));
            MutableStateFlow mutableStateFlow2 = a0Var.j;
            kotlin.collections.u uVar2 = kotlin.collections.u.e;
            mutableStateFlow2.setValue(uVar2);
            a0Var.m.setValue(uVar2);
            return kotlin.y.a;
        }
        return aVar;
    }

    public final void i() {
        List list;
        String str = (String) this.o.getValue();
        String str2 = (String) this.u.getValue();
        if (!kotlin.jvm.internal.l.a(str2, "ntv") && !kotlin.jvm.internal.l.a(str2, "sports")) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new com.app.mlounge.ui.screens.adult.e(this, str2, str, null, 12), 3, null);
            return;
        }
        Object value = this.l.getValue();
        if (str == null) {
            list = (List) value;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) value) {
                if (kotlin.jvm.internal.l.a(((IptvChannel) obj).a(), str)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        this.j.setValue(list);
    }

    public final void j(SportsMatch sportsMatch, String str, String str2, kotlin.jvm.functions.q qVar) {
        String lowerCase;
        sportsMatch.getClass();
        str.getClass();
        String strE = sportsMatch.e();
        if (strE != null) {
            lowerCase = strE.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        String str3 = "kobra";
        if (!kotlin.jvm.internal.l.a(lowerCase, "kobra")) {
            str3 = "raptor";
            if (!kotlin.jvm.internal.l.a(lowerCase, "raptor")) {
                return;
            }
        }
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new androidx.compose.animation.core.g(this, sportsMatch, str3, str, str2, qVar, null), 3, null);
    }

    public final void k() {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new u(this, null, 1), 3, null);
    }

    public final void l(ArrayList arrayList, boolean z) {
        String upperCase;
        String str;
        List listQ = com.google.common.base.c.q("18+", "XXX", "ADULT", "PORN", "EROTIC", "SEX");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            IptvChannel iptvChannel = (IptvChannel) obj;
            String strC = iptvChannel.c();
            Locale locale = Locale.ROOT;
            String upperCase2 = strC.toUpperCase(locale);
            upperCase2.getClass();
            String strA = iptvChannel.a();
            if (strA != null) {
                upperCase = strA.toUpperCase(locale);
                upperCase.getClass();
            } else {
                upperCase = "";
            }
            if (!listQ.isEmpty()) {
                Iterator it = listQ.iterator();
                do {
                    if (it.hasNext()) {
                        str = (String) it.next();
                        if (!kotlin.text.k.T(upperCase2, str, false)) {
                        }
                    }
                } while (!kotlin.text.k.T(upperCase, str, false));
            }
            arrayList2.add(obj);
        }
        this.l.setValue(arrayList2);
        this.j.setValue(arrayList2);
        if (z) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String strA2 = ((IptvChannel) it2.next()).a();
            if (strA2 != null) {
                arrayList3.add(strA2);
            }
        }
        List listE0 = kotlin.collections.o.e0(kotlin.collections.o.k0(kotlin.collections.o.n0(arrayList3)));
        if (listE0.size() <= 1) {
            listE0 = kotlin.collections.u.e;
        }
        this.m.setValue(listE0);
    }
}
