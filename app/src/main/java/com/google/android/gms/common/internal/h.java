package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.caverock.androidsvg.y1;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends e implements com.google.android.gms.common.api.c {
    public final Set V;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Context context, Looper looper, int i, y1 y1Var, com.google.android.gms.common.api.g gVar, com.google.android.gms.common.api.h hVar) {
        i0 i0VarA = i0.a(context);
        com.google.android.gms.common.e eVar = com.google.android.gms.common.e.d;
        x.g(gVar);
        x.g(hVar);
        super(context, looper, i0VarA, eVar, i, new androidx.media3.exoplayer.dash.manifest.t(gVar, 22), new androidx.media3.exoplayer.hls.c(hVar), (String) y1Var.d);
        Set set = (Set) y1Var.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                net.luminis.tls.engine.impl.c.r("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.V = set;
    }

    @Override // com.google.android.gms.common.api.c
    public final Set a() {
        return l() ? this.V : Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.internal.e
    public final Account p() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.e
    public final Set s() {
        return this.V;
    }
}
