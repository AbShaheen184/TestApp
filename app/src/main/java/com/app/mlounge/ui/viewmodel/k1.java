package com.app.mlounge.ui.viewmodel;

import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends androidx.lifecycle.q0 {
    public final Flow A;
    public final Flow B;
    public final Flow C;
    public final Flow D;
    public final Flow E;
    public final Flow F;
    public final Flow G;
    public final List H;
    public final List I;
    public final com.app.mlounge.data.local.prefs.x1 J;
    public final Flow K;
    public final Flow L;
    public final Flow M;
    public final Flow N;
    public final com.app.mlounge.data.local.prefs.y1 b;
    public final okhttp3.y c;
    public final Flow d;
    public final Flow e;
    public final Flow f;
    public final Flow g;
    public final Flow h;
    public final Flow i;
    public final Flow j;
    public final Flow k;
    public final Flow l;
    public final Flow m;
    public final Flow n;
    public final Flow o;
    public final Flow p;
    public final Flow q;
    public final Flow r;
    public final Flow s;
    public final Flow t;
    public final Flow u;
    public final Flow v;
    public final Flow w;
    public final Flow x;
    public final Flow y;
    public final Flow z;

    public k1(com.app.mlounge.data.local.prefs.y1 y1Var, com.app.mlounge.data.repository.r rVar, okhttp3.y yVar) {
        y1Var.getClass();
        rVar.getClass();
        yVar.getClass();
        this.b = y1Var;
        this.c = yVar;
        this.d = y1Var.c;
        this.e = y1Var.d;
        this.f = y1Var.u;
        this.g = y1Var.v;
        this.h = y1Var.w;
        this.i = y1Var.x;
        this.j = y1Var.y;
        this.k = y1Var.z;
        this.l = y1Var.h;
        this.m = y1Var.i;
        this.n = y1Var.r;
        this.o = y1Var.e;
        this.p = y1Var.f;
        this.q = y1Var.g;
        this.r = y1Var.A;
        this.s = y1Var.B;
        this.t = y1Var.C;
        this.u = y1Var.D;
        this.v = y1Var.E;
        this.w = y1Var.F;
        this.x = y1Var.G;
        this.y = y1Var.H;
        this.z = y1Var.I;
        this.A = y1Var.J;
        this.B = y1Var.K;
        this.C = y1Var.L;
        this.D = y1Var.M;
        this.E = y1Var.N;
        this.F = y1Var.O;
        this.G = y1Var.T;
        this.H = rVar.G;
        this.I = rVar.H;
        this.J = new com.app.mlounge.data.local.prefs.x1(y1Var.p, 3);
        this.K = y1Var.P;
        this.L = y1Var.Q;
        this.M = y1Var.R;
        this.N = y1Var.S;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r13, r5, r0) == r11) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(com.app.mlounge.ui.viewmodel.k1 r12, kotlin.coroutines.jvm.internal.c r13) {
        /*
            boolean r0 = r13 instanceof com.app.mlounge.ui.viewmodel.j1
            if (r0 == 0) goto L13
            r0 = r13
            com.app.mlounge.ui.viewmodel.j1 r0 = (com.app.mlounge.ui.viewmodel.j1) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            com.app.mlounge.ui.viewmodel.j1 r0 = new com.app.mlounge.ui.viewmodel.j1
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.e
            int r1 = r0.z
            kotlin.y r2 = kotlin.y.a
            r3 = 2
            r4 = 1
            r9 = 0
            kotlin.coroutines.intrinsics.a r11 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L37
            if (r1 != r3) goto L30
            kotlin.a.e(r13)     // Catch: java.lang.Exception -> L2d
            goto L9b
        L2d:
            r0 = move-exception
            r12 = r0
            goto L9e
        L30:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r12)
            r12 = 0
            return r12
        L37:
            kotlin.a.e(r13)     // Catch: java.lang.Exception -> L2d
            goto L51
        L3b:
            kotlin.a.e(r13)
            kotlinx.coroutines.CoroutineDispatcher r13 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Exception -> L2d
            androidx.compose.foundation.text.selection.q r1 = new androidx.compose.foundation.text.selection.q     // Catch: java.lang.Exception -> L2d
            r5 = 7
            r1.<init>(r12, r9, r5)     // Catch: java.lang.Exception -> L2d
            r0.z = r4     // Catch: java.lang.Exception -> L2d
            java.lang.Object r13 = kotlinx.coroutines.BuildersKt.withContext(r13, r1, r0)     // Catch: java.lang.Exception -> L2d
            if (r13 != r11) goto L51
            goto L9a
        L51:
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Exception -> L2d
            if (r13 != 0) goto L56
            return r2
        L56:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2d
            r7.<init>()     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = "ips"
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Exception -> L2d
            java.util.List r13 = com.google.common.base.c.p(r13)     // Catch: java.lang.Exception -> L2d
            r4.<init>(r13)     // Catch: java.lang.Exception -> L2d
            r7.put(r1, r4)     // Catch: java.lang.Exception -> L2d
            java.nio.charset.Charset r13 = kotlin.text.a.d     // Catch: java.lang.Exception -> L2d
            r13.getClass()     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = "cinemahq4:631202bd5fd9659a"
            okio.i r4 = new okio.i     // Catch: java.lang.Exception -> L2d
            byte[] r13 = r1.getBytes(r13)     // Catch: java.lang.Exception -> L2d
            r13.getClass()     // Catch: java.lang.Exception -> L2d
            r4.<init>(r13)     // Catch: java.lang.Exception -> L2d
            java.lang.String r13 = r4.a()     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = "Basic "
            java.lang.String r6 = r1.concat(r13)     // Catch: java.lang.Exception -> L2d
            kotlinx.coroutines.CoroutineDispatcher r13 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Exception -> L2d
            androidx.compose.foundation.text.u0 r5 = new androidx.compose.foundation.text.u0     // Catch: java.lang.Exception -> L2d
            r10 = 9
            r8 = r12
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L2d
            r0.z = r3     // Catch: java.lang.Exception -> L2d
            java.lang.Object r12 = kotlinx.coroutines.BuildersKt.withContext(r13, r5, r0)     // Catch: java.lang.Exception -> L2d
            if (r12 != r11) goto L9b
        L9a:
            return r11
        L9b:
            kotlin.o r12 = com.app.mlounge.util.a.a     // Catch: java.lang.Exception -> L2d
            return r2
        L9e:
            java.lang.String r13 = "SettingsVM"
            java.lang.String r0 = "Failed to submit opt-out IP"
            com.app.mlounge.util.a.b(r13, r0, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.viewmodel.k1.e(com.app.mlounge.ui.viewmodel.k1, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    public final void f(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new f1(this, z, null, 0), 3, null);
    }
}
