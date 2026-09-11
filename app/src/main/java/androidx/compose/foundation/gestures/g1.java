package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ kotlin.jvm.internal.w C;
    public final /* synthetic */ kotlin.jvm.internal.z D;
    public final /* synthetic */ kotlin.jvm.internal.z E;
    public final /* synthetic */ float F;
    public final /* synthetic */ j1 G;
    public final /* synthetic */ float H;
    public final /* synthetic */ m2 I;
    public kotlin.jvm.internal.v e;
    public kotlin.jvm.internal.v y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(kotlin.jvm.internal.w wVar, kotlin.jvm.internal.z zVar, kotlin.jvm.internal.z zVar2, float f, j1 j1Var, float f2, m2 m2Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = wVar;
        this.D = zVar;
        this.E = zVar2;
        this.F = f;
        this.G = j1Var;
        this.H = f2;
        this.I = m2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        g1 g1Var = new g1(this.C, this.D, this.E, this.F, this.G, this.H, this.I, dVar);
        g1Var.B = obj;
        return g1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g1) create((l2) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
    /* JADX WARN: Code duplicated, block: B:18:0x008f  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:23:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:27:0x0141  */
    /* JADX WARN: Code duplicated, block: B:29:0x0145  */
    /* JADX WARN: Code duplicated, block: B:30:0x0148  */
    /* JADX WARN: Code duplicated, block: B:33:0x0150  */
    /* JADX WARN: Code duplicated, block: B:35:0x0170  */
    /* JADX WARN: Code duplicated, block: B:36:0x0172  */
    /* JADX WARN: Code duplicated, block: B:39:0x0183  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0172 -> B:37:0x0173). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0183 -> B:14:0x0069). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.g1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
