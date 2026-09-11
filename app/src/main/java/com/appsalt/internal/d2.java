package com.appsalt.internal;

import java.util.List;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 {
    public static final long i;
    public final h2 a = new h2();
    public kotlin.time.f b = new kotlin.time.f(kotlin.time.e.b());
    public final List c;
    public int d;
    public final int e;
    public final MutableSharedFlow f;
    public final MutableSharedFlow g;
    public boolean h;

    static {
        kotlin.time.g gVar = kotlin.time.a.y;
        i = com.google.common.base.b.u(10, kotlin.time.c.MINUTES);
    }

    public d2() {
        kotlin.time.g gVar = kotlin.time.a.y;
        kotlin.time.c cVar = kotlin.time.c.SECONDS;
        long jU = com.google.common.base.b.u(5, cVar);
        kotlin.time.c cVar2 = kotlin.time.c.MILLISECONDS;
        List listQ = com.google.common.base.c.q(new kotlin.ranges.f(kotlin.time.a.j(jU, cVar2), kotlin.time.a.j(com.google.common.base.b.u(10, cVar), cVar2)), new kotlin.ranges.f(kotlin.time.a.j(com.google.common.base.b.u(10, cVar), cVar2), kotlin.time.a.j(com.google.common.base.b.u(20, cVar), cVar2)), new kotlin.ranges.f(kotlin.time.a.j(com.google.common.base.b.u(20, cVar), cVar2), kotlin.time.a.j(com.google.common.base.b.u(40, cVar), cVar2)), new kotlin.ranges.f(kotlin.time.a.j(com.google.common.base.b.u(40, cVar), cVar2), kotlin.time.a.j(com.google.common.base.b.u(80, cVar), cVar2)), new kotlin.ranges.f(kotlin.time.a.j(com.google.common.base.b.u(60, cVar), cVar2), kotlin.time.a.j(com.google.common.base.b.u(180, cVar), cVar2)));
        this.c = listQ;
        this.e = listQ.size() - 1;
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.f = mutableSharedFlowMutableSharedFlow$default;
        this.g = mutableSharedFlowMutableSharedFlow$default;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013d, code lost:
    
        if (r2.emit(r0, r3) == r8) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r18, kotlin.coroutines.jvm.internal.c r19) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsalt.internal.d2.a(int, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
