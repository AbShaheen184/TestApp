package com.google.android.gms.common.internal.service;

import androidx.compose.foundation.text.selection.q0;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.tasks.q;
import com.google.firebase.heartbeatinfo.e;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends f {
    public static final coil3.memory.c j = new coil3.memory.c("ClientTelemetry.API", new b(0), new e());

    public final q c(m mVar) {
        q0 q0VarC = q0.c();
        q0VarC.A = new com.google.android.gms.common.d[]{com.google.android.gms.internal.base.d.a};
        q0VarC.y = false;
        q0VarC.z = new androidx.media3.exoplayer.hls.c(mVar);
        return b(2, q0VarC.b());
    }
}
