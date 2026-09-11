package com.appsalt.internal;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {
    public static final long h;
    public final ArrayList a;
    public final ArrayList b;
    public final o0 c;
    public final int d;
    public m0 e;
    public m0 f;
    public androidx.appcompat.widget.c2 g;

    static {
        kotlin.time.g gVar = kotlin.time.a.y;
        h = com.google.common.base.b.u(3, kotlin.time.c.MINUTES);
    }

    public n0(ArrayList arrayList, ArrayList arrayList2, o0 o0Var, int i) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = o0Var;
        this.d = i;
        kotlin.random.a aVar = kotlin.random.d.e;
        this.e = (m0) kotlin.collections.o.Y(arrayList);
        this.f = (m0) kotlin.collections.o.Y(arrayList2);
        o0Var.a.getClass();
    }
}
