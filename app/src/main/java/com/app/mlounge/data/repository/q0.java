package com.app.mlounge.data.repository;

import androidx.datastore.preferences.protobuf.h1;
import com.app.mlounge.data.local.prefs.x1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    public final Flow a;
    public final l0 b;
    public final x1 c;

    public q0(com.app.mlounge.data.local.dao.j jVar, com.app.mlounge.data.local.dao.m mVar) {
        Flow flowCombine = FlowKt.combine(jVar.a(), h1.i(mVar.a, new String[]{"watch_progress"}, new androidx.room.z(12)), new p0(this, null));
        this.a = flowCombine;
        this.b = new l0(jVar.a(), 1);
        this.c = new x1(flowCombine, 1);
    }
}
