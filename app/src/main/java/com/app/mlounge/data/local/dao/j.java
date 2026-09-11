package com.app.mlounge.data.local.dao;

import androidx.datastore.preferences.protobuf.h1;
import androidx.room.q;
import androidx.room.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final q a;
    public final e b = new e(2);

    public j(q qVar) {
        this.a = qVar;
    }

    public final androidx.room.coroutines.l a() {
        z zVar = new z(9);
        return h1.i(this.a, new String[]{"history"}, zVar);
    }
}
