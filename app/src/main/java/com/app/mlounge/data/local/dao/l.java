package com.app.mlounge.data.local.dao;

import androidx.compose.material3.r0;
import androidx.datastore.core.t0;
import androidx.room.q;
import java.util.List;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements k {
    public final q a;
    public final e b = new e(3);

    public l(q qVar) {
        this.a = qVar;
    }

    public final Object a(String str, kotlin.coroutines.jvm.internal.c cVar) {
        Object objA = com.google.android.gms.dynamite.g.A(this.a, cVar, new r0(str, 3), false, true);
        return objA == kotlin.coroutines.intrinsics.a.e ? objA : y.a;
    }

    public final Object b(List list, kotlin.coroutines.jvm.internal.c cVar) {
        Object objA = com.google.android.gms.dynamite.g.A(this.a, cVar, new t0(8, this, list), false, true);
        return objA == kotlin.coroutines.intrinsics.a.e ? objA : y.a;
    }
}
