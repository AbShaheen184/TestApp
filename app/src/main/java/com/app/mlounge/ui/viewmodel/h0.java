package com.app.mlounge.ui.viewmodel;

import android.content.Context;
import com.app.mlounge.data.remote.model.MusicPageResponse;
import com.app.mlounge.data.remote.model.MusicSearchResponse;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
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
public final class h0 extends androidx.lifecycle.q0 {
    public final StateFlow A;
    public final MutableSharedFlow B;
    public final SharedFlow C;
    public final List D;
    public final Context b;
    public final com.app.mlounge.data.repository.a0 c;
    public final com.app.mlounge.data.download.h d;
    public final com.app.mlounge.data.local.prefs.y1 e;
    public final MutableStateFlow f;
    public final StateFlow g;
    public final MutableStateFlow h;
    public final StateFlow i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public Object l;
    public boolean m;
    public final MutableStateFlow n;
    public final StateFlow o;
    public final MutableStateFlow p;
    public final StateFlow q;
    public final MutableStateFlow r;
    public final StateFlow s;
    public final MutableStateFlow t;
    public final StateFlow u;
    public final MutableStateFlow v;
    public final StateFlow w;
    public final MutableStateFlow x;
    public final StateFlow y;
    public final MutableStateFlow z;

    public h0(Context context, com.app.mlounge.data.repository.a0 a0Var, com.app.mlounge.data.download.h hVar, com.app.mlounge.data.local.prefs.y1 y1Var) {
        a0Var.getClass();
        hVar.getClass();
        y1Var.getClass();
        this.b = context;
        this.c = a0Var;
        this.d = hVar;
        this.e = y1Var;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(kotlin.collections.u.e);
        this.f = MutableStateFlow;
        this.g = FlowKt.asStateFlow(MutableStateFlow);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.h = MutableStateFlow2;
        this.i = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.j = MutableStateFlow3;
        this.k = FlowKt.asStateFlow(MutableStateFlow3);
        this.m = true;
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(kotlin.collections.o.K(com.app.mlounge.data.repository.a0.e));
        this.n = MutableStateFlow4;
        this.o = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow("Top Albums");
        this.p = MutableStateFlow5;
        this.q = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow MutableStateFlow6 = StateFlowKt.MutableStateFlow("MusicMp3");
        this.r = MutableStateFlow6;
        this.s = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow MutableStateFlow7 = StateFlowKt.MutableStateFlow("");
        this.t = MutableStateFlow7;
        this.u = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow MutableStateFlow8 = StateFlowKt.MutableStateFlow(new MusicSearchResponse(null, null, null, null, 15));
        this.v = MutableStateFlow8;
        this.w = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow MutableStateFlow9 = StateFlowKt.MutableStateFlow(null);
        this.x = MutableStateFlow9;
        this.y = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow MutableStateFlow10 = StateFlowKt.MutableStateFlow(null);
        this.z = MutableStateFlow10;
        this.A = FlowKt.asStateFlow(MutableStateFlow10);
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.B = mutableSharedFlowMutableSharedFlow$default;
        this.C = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.D = com.google.common.base.c.q("Top Albums", "New Releases");
        f();
    }

    public static final Object e(h0 h0Var, String str, String str2, Object obj, kotlin.coroutines.jvm.internal.i iVar) {
        com.app.mlounge.data.repository.a0 a0Var = h0Var.c;
        String str3 = (String) h0Var.p.getValue();
        int iHashCode = str3.hashCode();
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (iHashCode != -165968561) {
            if (iHashCode != 269130764) {
                if (iHashCode == 932291052 && str3.equals("Artists")) {
                    a0Var.getClass();
                    Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.repository.z(a0Var, str, str2, obj, null, 0), iVar);
                    return objWithContext == aVar ? objWithContext : (MusicPageResponse) objWithContext;
                }
            } else if (str3.equals("New Releases")) {
                a0Var.getClass();
                Object objWithContext2 = BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.repository.z(a0Var, str, str2, obj, null, 1), iVar);
                return objWithContext2 == aVar ? objWithContext2 : (MusicPageResponse) objWithContext2;
            }
        } else if (str3.equals("Top Albums")) {
            a0Var.getClass();
            Object objWithContext3 = BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.repository.z(a0Var, str, str2, obj, null, 2), iVar);
            return objWithContext3 == aVar ? objWithContext3 : (MusicPageResponse) objWithContext3;
        }
        return new MusicPageResponse();
    }

    public final void f() {
        if (((Boolean) this.h.getValue()).booleanValue()) {
            return;
        }
        g();
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new g0(this, null, 0), 3, null);
    }

    public final void g() {
        this.l = null;
        this.m = true;
        this.f.setValue(kotlin.collections.u.e);
    }
}
