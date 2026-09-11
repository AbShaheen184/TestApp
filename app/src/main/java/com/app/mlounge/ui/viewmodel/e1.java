package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.debrid.AllDebridManager;
import com.app.mlounge.data.remote.debrid.PremiumizeManager;
import com.app.mlounge.data.remote.debrid.RealDebridManager;
import com.app.mlounge.data.remote.debrid.TorBoxManager;
import com.app.mlounge.data.remote.trakt.TraktManager;
import com.app.mlounge.data.remote.trakt.TraktSyncManager;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends androidx.lifecycle.q0 {
    public final com.app.mlounge.data.local.prefs.y1 b;
    public final PremiumizeManager c;
    public final TorBoxManager d;
    public final AllDebridManager e;
    public final RealDebridManager f;
    public final TraktManager g;
    public final TraktSyncManager h;
    public final MutableStateFlow i;
    public final StateFlow j;
    public final MutableStateFlow k;
    public final StateFlow l;
    public final MutableStateFlow m;
    public final StateFlow n;
    public final MutableStateFlow o;
    public final StateFlow p;
    public final MutableStateFlow q;
    public final StateFlow r;
    public final MutableStateFlow s;
    public final StateFlow t;
    public Job u;
    public Job v;
    public Job w;

    public e1(com.app.mlounge.data.local.prefs.y1 y1Var, PremiumizeManager premiumizeManager, TorBoxManager torBoxManager, AllDebridManager allDebridManager, RealDebridManager realDebridManager, TraktManager traktManager, TraktSyncManager traktSyncManager) {
        y1Var.getClass();
        premiumizeManager.getClass();
        torBoxManager.getClass();
        allDebridManager.getClass();
        realDebridManager.getClass();
        traktManager.getClass();
        traktSyncManager.getClass();
        this.b = y1Var;
        this.c = premiumizeManager;
        this.d = torBoxManager;
        this.e = allDebridManager;
        this.f = realDebridManager;
        this.g = traktManager;
        this.h = traktSyncManager;
        kotlin.coroutines.d dVar = null;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new k0(null, 15));
        this.i = MutableStateFlow;
        this.j = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(new s1(null, 15));
        this.k = MutableStateFlow2;
        this.l = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(new d(null, 63));
        this.m = MutableStateFlow3;
        this.n = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(new n0(null, 63));
        this.o = MutableStateFlow4;
        this.p = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow(new q(null, 15));
        this.q = MutableStateFlow5;
        this.r = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow MutableStateFlow6 = StateFlowKt.MutableStateFlow(new t1(null, 63));
        this.s = MutableStateFlow6;
        this.t = FlowKt.asStateFlow(MutableStateFlow6);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new z0(this, dVar, 0), 3, null);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new z0(this, dVar, 1), 3, null);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new z0(this, dVar, 2), 3, null);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new z0(this, dVar, 3), 3, null);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new z0(this, dVar, 4), 3, null);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new z0(this, dVar, 5), 3, null);
    }

    @Override // androidx.lifecycle.q0
    public final void d() {
        Job job = this.w;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.h.p();
    }
}
