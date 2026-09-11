package com.appsalt.internal;

import java.util.Iterator;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public c3 A;
    public ProducerScope B;
    public kotlin.jvm.internal.z C;
    public Iterable D;
    public Iterator E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ c3 H;
    public byte[] e;
    public kotlin.jvm.internal.z y;
    public kotlin.jvm.internal.z z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(c3 c3Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.H = c3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        t2 t2Var = new t2(this.H, dVar);
        t2Var.G = obj;
        return t2Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        t2 t2Var = new t2(this.H, (kotlin.coroutines.d) obj2);
        t2Var.G = (ProducerScope) obj;
        return t2Var.invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0085 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:7:0x002a, B:27:0x00cf, B:29:0x00d5, B:33:0x00fc, B:34:0x0102, B:36:0x0108, B:38:0x0115, B:43:0x0132, B:20:0x007f, B:22:0x0085, B:26:0x00ae, B:39:0x011b, B:41:0x0123, B:42:0x0127), top: B:55:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d5 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:7:0x002a, B:27:0x00cf, B:29:0x00d5, B:33:0x00fc, B:34:0x0102, B:36:0x0108, B:38:0x0115, B:43:0x0132, B:20:0x007f, B:22:0x0085, B:26:0x00ae, B:39:0x011b, B:41:0x0123, B:42:0x0127), top: B:55:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00f9 A[LOOP:0: B:27:0x00cf->B:32:0x00f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0108 A[Catch: all -> 0x0035, LOOP:1: B:34:0x0102->B:36:0x0108, LOOP_END, TryCatch #0 {all -> 0x0035, blocks: (B:7:0x002a, B:27:0x00cf, B:29:0x00d5, B:33:0x00fc, B:34:0x0102, B:36:0x0108, B:38:0x0115, B:43:0x0132, B:20:0x007f, B:22:0x0085, B:26:0x00ae, B:39:0x011b, B:41:0x0123, B:42:0x0127), top: B:55:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0115 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:7:0x002a, B:27:0x00cf, B:29:0x00d5, B:33:0x00fc, B:34:0x0102, B:36:0x0108, B:38:0x0115, B:43:0x0132, B:20:0x007f, B:22:0x0085, B:26:0x00ae, B:39:0x011b, B:41:0x0123, B:42:0x0127), top: B:55:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:39:0x011b A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:7:0x002a, B:27:0x00cf, B:29:0x00d5, B:33:0x00fc, B:34:0x0102, B:36:0x0108, B:38:0x0115, B:43:0x0132, B:20:0x007f, B:22:0x0085, B:26:0x00ae, B:39:0x011b, B:41:0x0123, B:42:0x0127), top: B:55:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0123 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:7:0x002a, B:27:0x00cf, B:29:0x00d5, B:33:0x00fc, B:34:0x0102, B:36:0x0108, B:38:0x0115, B:43:0x0132, B:20:0x007f, B:22:0x0085, B:26:0x00ae, B:39:0x011b, B:41:0x0123, B:42:0x0127), top: B:55:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0127 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:7:0x002a, B:27:0x00cf, B:29:0x00d5, B:33:0x00fc, B:34:0x0102, B:36:0x0108, B:38:0x0115, B:43:0x0132, B:20:0x007f, B:22:0x0085, B:26:0x00ae, B:39:0x011b, B:41:0x0123, B:42:0x0127), top: B:55:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable, java.util.Iterator, kotlin.coroutines.d, kotlin.jvm.internal.z] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ae -> B:27:0x00cf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsalt.internal.t2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
