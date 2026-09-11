package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 {
    public static final kotlin.ranges.d d = new kotlin.ranges.d(2, 3, 1);
    public static final long e;
    public final int a;
    public int b;
    public kotlin.time.f c;

    static {
        kotlin.time.g gVar = kotlin.time.a.y;
        e = com.google.common.base.b.u(1, kotlin.time.c.MINUTES);
    }

    public h2() {
        int iB;
        kotlin.random.a aVar = kotlin.random.d.e;
        kotlin.ranges.d dVar = d;
        dVar.getClass();
        try {
            kotlin.random.a aVar2 = kotlin.random.d.e;
            dVar.getClass();
            if (dVar.isEmpty()) {
                com.google.gson.b.g(dVar, "Cannot get random in empty range: ");
                iB = 0;
            } else {
                int i = dVar.y;
                int i2 = dVar.e;
                if (i < Integer.MAX_VALUE) {
                    iB = kotlin.random.d.e.c(i2, i + 1);
                } else if (i2 > Integer.MIN_VALUE) {
                    iB = kotlin.random.d.e.c(i2 - 1, i) + 1;
                } else {
                    iB = kotlin.random.d.e.b();
                }
            }
            this.a = iB;
            this.c = new kotlin.time.f(kotlin.time.e.b());
        } catch (IllegalArgumentException e2) {
            androidx.transition.k.m(e2.getMessage());
            throw null;
        }
    }
}
