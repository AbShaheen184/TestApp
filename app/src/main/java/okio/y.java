package okio;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements h0 {
    public int A;
    public boolean B;
    public long C;
    public final h e;
    public final f y;
    public c0 z;

    public y(h hVar) {
        this.e = hVar;
        f fVarD = hVar.d();
        this.y = fVarD;
        c0 c0Var = fVarD.e;
        this.z = c0Var;
        this.A = c0Var != null ? c0Var.b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3 == r5.b) goto L16;
     */
    @Override // okio.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long K(okio.f r9, long r10) {
        /*
            r8 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L67
            boolean r3 = r8.B
            if (r3 != 0) goto L61
            okio.c0 r3 = r8.z
            okio.f r4 = r8.y
            if (r3 == 0) goto L29
            okio.c0 r5 = r4.e
            if (r3 != r5) goto L21
            int r3 = r8.A
            r5.getClass()
            int r5 = r5.b
            if (r3 != r5) goto L21
            goto L29
        L21:
            java.lang.String r9 = "Peek source is invalid because upstream source was used"
            net.luminis.tls.engine.impl.c.r(r9)
        L26:
            r9 = 0
            return r9
        L29:
            if (r2 != 0) goto L2c
            return r0
        L2c:
            long r0 = r8.C
            r2 = 1
            long r0 = r0 + r2
            okio.h r2 = r8.e
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L3c
            r9 = -1
            return r9
        L3c:
            okio.c0 r0 = r8.z
            if (r0 != 0) goto L4a
            okio.c0 r0 = r4.e
            if (r0 == 0) goto L4a
            r8.z = r0
            int r0 = r0.b
            r8.A = r0
        L4a:
            long r0 = r4.y
            long r2 = r8.C
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            okio.f r2 = r8.y
            long r4 = r8.C
            r3 = r9
            r2.L(r3, r4, r6)
            long r9 = r8.C
            long r9 = r9 + r6
            r8.C = r9
            return r6
        L61:
            java.lang.String r9 = "closed"
            net.luminis.tls.engine.impl.c.r(r9)
            goto L26
        L67:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g(r9, r10)
            net.luminis.tls.engine.impl.c.p(r9)
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.y.K(okio.f, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.B = true;
    }

    @Override // okio.h0
    public final j0 e() {
        return this.e.e();
    }
}
