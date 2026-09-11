package com.app.mlounge.data.local.dao;

import androidx.datastore.core.t0;
import androidx.room.q;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final q a;
    public final androidx.media3.common.util.b b = new androidx.media3.common.util.b(26, new e(4), new f(1));

    public m(q qVar) {
        this.a = qVar;
    }

    public final Object a(com.app.mlounge.data.local.entity.e eVar, kotlin.coroutines.jvm.internal.i iVar) {
        Object objA = com.google.android.gms.dynamite.g.A(this.a, iVar, new t0(9, this, eVar), false, true);
        return objA == kotlin.coroutines.intrinsics.a.e ? objA : y.a;
    }
}
