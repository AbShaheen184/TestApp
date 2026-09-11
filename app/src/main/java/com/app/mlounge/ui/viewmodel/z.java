package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.model.IptvChannel;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ com.app.mlounge.ui.screens.livetv.h A;
    public int e;
    public final /* synthetic */ a0 y;
    public final /* synthetic */ IptvChannel z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, IptvChannel iptvChannel, com.app.mlounge.ui.screens.livetv.h hVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.y = a0Var;
        this.z = iptvChannel;
        this.A = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new z(this.y, this.z, this.A, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (r1.emit(r13, r12) == r11) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        if (r1.emit(r13, r12) == r11) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            com.app.mlounge.ui.viewmodel.a0 r0 = r12.y
            kotlinx.coroutines.flow.MutableSharedFlow r1 = r0.z
            kotlinx.coroutines.flow.MutableStateFlow r2 = r0.B
            java.lang.String r3 = "Error resolving "
            java.lang.String r4 = "Failed to resolve stream for "
            int r5 = r12.e
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            com.app.mlounge.data.remote.model.IptvChannel r10 = r12.z
            kotlin.coroutines.intrinsics.a r11 = kotlin.coroutines.intrinsics.a.e
            if (r5 == 0) goto L34
            if (r5 == r8) goto L30
            if (r5 == r7) goto L2a
            if (r5 != r6) goto L23
            kotlin.a.e(r13)     // Catch: java.lang.Throwable -> L20
            goto L80
        L20:
            r13 = move-exception
            goto Lac
        L23:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r13)
            r13 = 0
            return r13
        L2a:
            kotlin.a.e(r13)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            goto L80
        L2e:
            r13 = move-exception
            goto L84
        L30:
            kotlin.a.e(r13)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            goto L51
        L34:
            kotlin.a.e(r13)
            java.lang.String r13 = r10.c()
            r2.setValue(r13)
            com.app.mlounge.data.iptv.c0 r13 = r0.f     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            com.app.mlounge.data.iptv.EarthCamProvider r13 = r13.g()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            java.lang.String r0 = r10.f()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            r12.e = r8     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            java.lang.Object r13 = r13.resolveStream(r0, r12)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            if (r13 != r11) goto L51
            goto La8
        L51:
            com.app.mlounge.data.iptv.EarthCamProvider$EarthCamStreamResult r13 = (com.app.mlounge.data.iptv.EarthCamProvider.EarthCamStreamResult) r13     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            if (r13 == 0) goto L67
            com.app.mlounge.ui.screens.livetv.h r0 = r12.A     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            java.lang.String r4 = r13.getUrl()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            java.lang.String r5 = r10.c()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            java.util.Map r13 = r13.getHeaders()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            r0.invoke(r4, r5, r13)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            goto L80
        L67:
            java.lang.String r13 = r10.c()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            r0.append(r13)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            java.lang.String r13 = r0.toString()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            r12.e = r7     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            java.lang.Object r13 = r1.emit(r13, r12)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2e
            if (r13 != r11) goto L80
            goto La8
        L80:
            r2.setValue(r9)
            goto La9
        L84:
            java.lang.String r0 = r10.c()     // Catch: java.lang.Throwable -> L20
            java.lang.String r13 = r13.getMessage()     // Catch: java.lang.Throwable -> L20
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L20
            r4.append(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = ": "
            r4.append(r0)     // Catch: java.lang.Throwable -> L20
            r4.append(r13)     // Catch: java.lang.Throwable -> L20
            java.lang.String r13 = r4.toString()     // Catch: java.lang.Throwable -> L20
            r12.e = r6     // Catch: java.lang.Throwable -> L20
            java.lang.Object r13 = r1.emit(r13, r12)     // Catch: java.lang.Throwable -> L20
            if (r13 != r11) goto L80
        La8:
            return r11
        La9:
            kotlin.y r13 = kotlin.y.a
            return r13
        Lac:
            r2.setValue(r9)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.viewmodel.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
