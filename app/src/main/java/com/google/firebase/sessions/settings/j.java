package com.google.firebase.sessions.settings;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final o a;
    public final o b;

    public j(o oVar, o oVar2) {
        oVar.getClass();
        oVar2.getClass();
        this.a = oVar;
        this.b = oVar2;
    }

    public final double a() {
        Double dC = this.a.c();
        if (dC != null) {
            double dDoubleValue = dC.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double dC2 = this.b.c();
        if (dC2 != null) {
            double dDoubleValue2 = dC2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r6.d(r0) == r4) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.i
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.settings.i r0 = (com.google.firebase.sessions.settings.i) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.i r0 = new com.google.firebase.sessions.settings.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.y
            int r1 = r0.A
            r2 = 2
            r3 = 1
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            kotlin.a.e(r6)
            goto L56
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L31:
            com.google.firebase.sessions.settings.j r1 = r0.e
            kotlin.a.e(r6)
            goto L48
        L37:
            kotlin.a.e(r6)
            r0.e = r5
            r0.A = r3
            com.google.firebase.sessions.settings.o r6 = r5.a
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r4) goto L47
            goto L55
        L47:
            r1 = r5
        L48:
            com.google.firebase.sessions.settings.o r6 = r1.b
            r1 = 0
            r0.e = r1
            r0.A = r2
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r4) goto L56
        L55:
            return r4
        L56:
            kotlin.y r6 = kotlin.y.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.j.b(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
