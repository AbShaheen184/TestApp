package com.google.android.gms.common.internal;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ e c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ e f;

    public s(e eVar, int i, Bundle bundle) {
        this.f = eVar;
        Boolean bool = Boolean.TRUE;
        this.c = eVar;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public abstract boolean a();

    public abstract void b(com.google.android.gms.common.b bVar);
}
