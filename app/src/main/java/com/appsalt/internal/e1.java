package com.appsalt.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {
    public static final long d;
    public final List a;
    public String b;
    public coil3.memory.c c;

    static {
        kotlin.time.g gVar = kotlin.time.a.y;
        d = com.google.common.base.b.u(3, kotlin.time.c.MINUTES);
    }

    public e1(List list) {
        this.a = list;
        kotlin.random.a aVar = kotlin.random.d.e;
        this.b = (String) kotlin.collections.o.Y(list);
    }

    public final void a(ArrayList arrayList) {
        long jB = kotlin.time.e.b();
        ArrayList arrayList2 = new ArrayList(kotlin.collections.p.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add("wss://" + kotlin.text.k.A0((String) it.next()).toString());
        }
        this.c = new coil3.memory.c(11, new kotlin.time.f(jB), arrayList2);
    }
}
