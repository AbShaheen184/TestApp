package com.app.mlounge.data.repository;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ ProducerScope C;
    public final /* synthetic */ int D;
    public int e;
    public final /* synthetic */ r y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r rVar, String str, String str2, String str3, ProducerScope producerScope, int i, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.y = rVar;
        this.z = str;
        this.A = str2;
        this.B = str3;
        this.C = producerScope;
        this.D = i;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new e(this.y, this.z, this.A, this.B, this.C, this.D, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0132, code lost:
    
        if (r4.send(r6, r28) == r10) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0147, code lost:
    
        if (r4.send(r1, r28) == r10) goto L48;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.repository.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
