package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class zc {
    public final Context a;
    public final com.google.common.base.t b;
    public final com.google.common.base.t c;
    public final com.google.common.base.t d;
    public volatile int e = 0;
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public final Object g = new Object();
    public volatile com.google.common.util.concurrent.h0 h = null;

    public zc(Context context, com.google.common.base.t tVar, com.google.common.base.t tVar2, com.google.common.base.t tVar3) {
        this.a = context;
        this.b = tVar;
        this.c = tVar2;
        this.d = tVar3;
    }
}
