package com.app.mlounge;

import com.app.mlounge.data.local.AppDatabase;
import com.app.mlounge.ui.i0;
import com.app.mlounge.ui.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements c, i0, j0, dagger.hilt.android.internal.managers.c, dagger.hilt.internal.a {
    public final dagger.internal.d N;
    public final dagger.internal.d O;
    public final dagger.internal.d P;
    public final dagger.internal.d Q;
    public final dagger.internal.d R;
    public final dagger.internal.d S;
    public final dagger.internal.d T;
    public final dagger.internal.d U;
    public final dagger.internal.d V;
    public final androidx.emoji2.text.m a;
    public final h b = this;
    public final dagger.internal.d c = coil3.compose.internal.f.d(this, 3);
    public final dagger.internal.d d = coil3.compose.internal.f.d(this, 2);
    public final dagger.internal.d e = coil3.compose.internal.f.d(this, 1);
    public final dagger.internal.d f = coil3.compose.internal.f.d(this, 4);
    public final dagger.internal.d g = coil3.compose.internal.f.d(this, 0);
    public final dagger.internal.d h = coil3.compose.internal.f.d(this, 7);
    public final dagger.internal.d i = coil3.compose.internal.f.d(this, 6);
    public final dagger.internal.d j = coil3.compose.internal.f.d(this, 5);
    public final dagger.internal.d k = coil3.compose.internal.f.d(this, 9);
    public final dagger.internal.d l = coil3.compose.internal.f.d(this, 8);
    public final dagger.internal.d m = coil3.compose.internal.f.d(this, 10);
    public final dagger.internal.d n = coil3.compose.internal.f.d(this, 11);
    public final dagger.internal.d o = coil3.compose.internal.f.d(this, 14);
    public final dagger.internal.d p = coil3.compose.internal.f.d(this, 13);
    public final dagger.internal.d q = coil3.compose.internal.f.d(this, 15);
    public final dagger.internal.d r = coil3.compose.internal.f.d(this, 16);
    public final dagger.internal.d s = coil3.compose.internal.f.d(this, 17);
    public final dagger.internal.d t = coil3.compose.internal.f.d(this, 20);
    public final dagger.internal.d u = coil3.compose.internal.f.d(this, 19);
    public final dagger.internal.d v = coil3.compose.internal.f.d(this, 18);
    public final dagger.internal.d w = coil3.compose.internal.f.d(this, 23);
    public final dagger.internal.d x = coil3.compose.internal.f.d(this, 22);
    public final dagger.internal.d y = coil3.compose.internal.f.d(this, 21);
    public final dagger.internal.d z = coil3.compose.internal.f.d(this, 26);
    public final dagger.internal.d A = coil3.compose.internal.f.d(this, 25);
    public final dagger.internal.d B = coil3.compose.internal.f.d(this, 24);
    public final dagger.internal.d C = coil3.compose.internal.f.d(this, 27);
    public final dagger.internal.d D = coil3.compose.internal.f.d(this, 30);
    public final dagger.internal.d E = coil3.compose.internal.f.d(this, 29);
    public final dagger.internal.d F = coil3.compose.internal.f.d(this, 28);
    public final dagger.internal.d G = coil3.compose.internal.f.d(this, 12);
    public final dagger.internal.d H = coil3.compose.internal.f.d(this, 31);
    public final dagger.internal.d I = coil3.compose.internal.f.d(this, 36);
    public final dagger.internal.d J = coil3.compose.internal.f.d(this, 35);
    public final dagger.internal.d K = coil3.compose.internal.f.d(this, 34);
    public final dagger.internal.a L = new dagger.internal.a();
    public final dagger.internal.d M = coil3.compose.internal.f.d(this, 33);

    public h(androidx.emoji2.text.m mVar) {
        this.a = mVar;
        dagger.internal.a aVar = this.L;
        dagger.internal.d dVarD = coil3.compose.internal.f.d(this, 32);
        if (aVar.a != null) {
            org.mozilla.javascript.c.a();
            throw null;
        }
        aVar.a = dVarD;
        this.N = coil3.compose.internal.f.d(this, 37);
        this.O = coil3.compose.internal.f.d(this, 38);
        this.P = coil3.compose.internal.f.d(this, 39);
        this.Q = coil3.compose.internal.f.d(this, 40);
        this.R = coil3.compose.internal.f.d(this, 42);
        this.S = coil3.compose.internal.f.d(this, 41);
        this.T = coil3.compose.internal.f.d(this, 43);
        this.U = coil3.compose.internal.f.d(this, 45);
        this.V = coil3.compose.internal.f.d(this, 44);
    }

    public final com.app.mlounge.data.local.dao.k a() {
        AppDatabase appDatabase = (AppDatabase) this.k.get();
        appDatabase.getClass();
        com.app.mlounge.data.local.dao.k kVarN = appDatabase.n();
        com.google.android.material.sidesheet.b.g(kVarN);
        return kVarN;
    }

    public final com.app.mlounge.data.local.dao.m b() {
        AppDatabase appDatabase = (AppDatabase) this.k.get();
        appDatabase.getClass();
        com.app.mlounge.data.local.dao.m mVarO = appDatabase.o();
        com.google.android.material.sidesheet.b.g(mVarO);
        return mVarO;
    }
}
