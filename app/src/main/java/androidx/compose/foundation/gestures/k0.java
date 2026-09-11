package androidx.compose.foundation.gestures;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ f2 C;
    public final /* synthetic */ int e = 1;
    public kotlin.jvm.internal.z y;
    public kotlin.jvm.internal.z z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(kotlin.jvm.internal.z zVar, f2 f2Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = zVar;
        this.C = f2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                k0 k0Var = new k0(this.z, this.C, dVar);
                k0Var.B = obj;
                return k0Var;
            default:
                k0 k0Var2 = new k0(this.C, dVar);
                k0Var2.B = obj;
                return k0Var2;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((k0) create((kotlin.jvm.functions.l) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((k0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039 A[PHI: r0 r5
  0x0039: PHI (r0v13 kotlin.jvm.internal.z) = (r0v5 kotlin.jvm.internal.z), (r0v17 kotlin.jvm.internal.z) binds: [B:14:0x0036, B:40:0x00bd] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r5v6 kotlinx.coroutines.CoroutineScope) = (r5v4 kotlinx.coroutines.CoroutineScope), (r5v7 kotlinx.coroutines.CoroutineScope) binds: [B:14:0x0036, B:40:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[PHI: r6
  0x005d: PHI (r6v8 kotlinx.coroutines.CoroutineScope) = 
  (r6v0 kotlinx.coroutines.CoroutineScope)
  (r6v3 kotlinx.coroutines.CoroutineScope)
  (r6v3 kotlinx.coroutines.CoroutineScope)
  (r6v3 kotlinx.coroutines.CoroutineScope)
  (r6v6 kotlinx.coroutines.CoroutineScope)
  (r6v9 kotlinx.coroutines.CoroutineScope)
 binds: [B:19:0x0055, B:49:0x00da, B:51:0x00e7, B:45:0x00d3, B:31:0x0089, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8 A[Catch: CancellationException -> 0x00d6, TryCatch #2 {CancellationException -> 0x00d6, blocks: (B:42:0x00c0, B:44:0x00c6, B:48:0x00d8, B:50:0x00dc), top: B:89:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc A[Catch: CancellationException -> 0x00d6, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00d6, blocks: (B:42:0x00c0, B:44:0x00c6, B:48:0x00d8, B:50:0x00dc), top: B:89:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0121  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0089 -> B:20:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d3 -> B:20:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00da -> B:20:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e7 -> B:20:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00f5 -> B:12:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0149 -> B:79:0x014a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x014e -> B:81:0x014f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(f2 f2Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = f2Var;
    }
}
