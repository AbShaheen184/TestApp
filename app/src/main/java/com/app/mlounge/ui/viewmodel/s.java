package com.app.mlounge.ui.viewmodel;

import android.content.Context;
import com.app.mlounge.data.remote.model.GamePlatform;
import java.io.File;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends androidx.lifecycle.q0 {
    public final MutableStateFlow A;
    public final StateFlow B;
    public final MutableStateFlow C;
    public final StateFlow D;
    public final MutableStateFlow E;
    public final StateFlow F;
    public final MutableStateFlow G;
    public final StateFlow H;
    public final StateFlow I;
    public final MutableStateFlow J;
    public final StateFlow K;
    public Job L;
    public int M;
    public int N;
    public final com.app.mlounge.data.repository.r b;
    public final com.app.mlounge.data.local.dao.i c;
    public final Context d;
    public final MutableStateFlow e;
    public final StateFlow f;
    public final MutableStateFlow g;
    public final StateFlow h;
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
    public final MutableStateFlow u;
    public final StateFlow v;
    public final MutableStateFlow w;
    public final StateFlow x;
    public final MutableStateFlow y;
    public final StateFlow z;

    public s(com.app.mlounge.data.repository.r rVar, com.app.mlounge.data.local.dao.i iVar, Context context) {
        rVar.getClass();
        this.b = rVar;
        this.c = iVar;
        this.d = context;
        kotlin.collections.u uVar = kotlin.collections.u.e;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(uVar);
        this.e = MutableStateFlow;
        this.f = FlowKt.asStateFlow(MutableStateFlow);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.g = MutableStateFlow2;
        this.h = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.i = MutableStateFlow3;
        this.j = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.k = MutableStateFlow4;
        this.l = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.m = MutableStateFlow5;
        this.n = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow MutableStateFlow6 = StateFlowKt.MutableStateFlow(bool);
        this.o = MutableStateFlow6;
        this.p = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow MutableStateFlow7 = StateFlowKt.MutableStateFlow(bool);
        this.q = MutableStateFlow7;
        this.r = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow MutableStateFlow8 = StateFlowKt.MutableStateFlow(Float.valueOf(0.0f));
        this.s = MutableStateFlow8;
        this.t = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow MutableStateFlow9 = StateFlowKt.MutableStateFlow(GamePlatform.SNES);
        this.u = MutableStateFlow9;
        this.v = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow MutableStateFlow10 = StateFlowKt.MutableStateFlow(null);
        this.w = MutableStateFlow10;
        this.x = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow MutableStateFlow11 = StateFlowKt.MutableStateFlow(uVar);
        this.y = MutableStateFlow11;
        this.z = FlowKt.asStateFlow(MutableStateFlow11);
        MutableStateFlow MutableStateFlow12 = StateFlowKt.MutableStateFlow(uVar);
        this.A = MutableStateFlow12;
        this.B = FlowKt.asStateFlow(MutableStateFlow12);
        MutableStateFlow MutableStateFlow13 = StateFlowKt.MutableStateFlow(null);
        this.C = MutableStateFlow13;
        this.D = FlowKt.asStateFlow(MutableStateFlow13);
        MutableStateFlow MutableStateFlow14 = StateFlowKt.MutableStateFlow(null);
        this.E = MutableStateFlow14;
        this.F = FlowKt.asStateFlow(MutableStateFlow14);
        MutableStateFlow MutableStateFlow15 = StateFlowKt.MutableStateFlow(bool);
        this.G = MutableStateFlow15;
        this.H = FlowKt.asStateFlow(MutableStateFlow15);
        this.I = FlowKt.stateIn(androidx.datastore.preferences.protobuf.h1.i(iVar.a, new String[]{"favourite_games"}, new androidx.room.z(8)), androidx.lifecycle.l0.g(this), SharingStarted.Companion.getEagerly(), uVar);
        MutableStateFlow MutableStateFlow16 = StateFlowKt.MutableStateFlow(bool);
        this.J = MutableStateFlow16;
        this.K = FlowKt.asStateFlow(MutableStateFlow16);
        this.M = 1;
        this.N = 1;
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new r(this, null, 2), 3, null);
        f();
    }

    public final boolean e(String str) {
        str.getClass();
        GamePlatform gamePlatform = (GamePlatform) this.u.getValue();
        File file = new File(this.d.getFilesDir(), "roms");
        file.mkdirs();
        return new File(file, androidx.constraintlayout.core.g.c(str, gamePlatform.g())).exists();
    }

    public final void f() {
        if (((Boolean) this.g.getValue()).booleanValue()) {
            return;
        }
        this.M = 1;
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new r(this, null, 0), 3, null);
    }

    public final void g(GamePlatform gamePlatform) {
        gamePlatform.getClass();
        MutableStateFlow mutableStateFlow = this.u;
        if (mutableStateFlow.getValue() == gamePlatform) {
            return;
        }
        mutableStateFlow.setValue(gamePlatform);
        this.C.setValue(null);
        this.E.setValue(null);
        this.G.setValue(Boolean.FALSE);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new r(this, null, 2), 3, null);
        f();
    }
}
