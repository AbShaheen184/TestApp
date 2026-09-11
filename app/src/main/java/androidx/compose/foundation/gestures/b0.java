package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends kotlin.coroutines.jvm.internal.h implements kotlin.jvm.functions.p {
    public /* synthetic */ Object A;
    public final /* synthetic */ kotlin.jvm.internal.v B;
    public final /* synthetic */ kotlin.jvm.internal.z C;
    public final /* synthetic */ kotlin.jvm.internal.z D;
    public androidx.compose.ui.input.pointer.m e;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kotlin.jvm.internal.v vVar, kotlin.jvm.internal.z zVar, kotlin.jvm.internal.z zVar2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.B = vVar;
        this.C = zVar;
        this.D = zVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        b0 b0Var = new b0(this.B, this.C, this.D, dVar);
        b0Var.A = obj;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((androidx.compose.ui.input.pointer.k0) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[LOOP:2: B:16:0x0057->B:20:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x006a A[EDGE_INSN: B:74:0x006a->B:22:0x006a BREAK  A[LOOP:2: B:16:0x0057->B:20:0x0066], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b0 -> B:39:0x00b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
