package com.app.mlounge.ui.viewmodel;

import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends androidx.lifecycle.q0 {
    public final com.app.mlounge.data.download.h b;
    public final StateFlow c;
    public final StateFlow d;

    public p(com.app.mlounge.data.download.h hVar, com.app.mlounge.data.local.prefs.y1 y1Var) {
        hVar.getClass();
        y1Var.getClass();
        this.b = hVar;
        androidx.room.coroutines.l lVar = hVar.g;
        androidx.lifecycle.viewmodel.internal.a aVarG = androidx.lifecycle.l0.g(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.c = FlowKt.stateIn(lVar, aVarG, SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), kotlin.collections.u.e);
        this.d = FlowKt.stateIn(new o(y1Var.J, this, 0), androidx.lifecycle.l0.g(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), "");
    }
}
