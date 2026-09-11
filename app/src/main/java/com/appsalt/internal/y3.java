package com.appsalt.internal;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y3 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public byte[] A;
    public DatagramPacket B;
    public byte[] C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ d4 F;
    public final /* synthetic */ InetAddress G;
    public final /* synthetic */ int H;
    public final /* synthetic */ d4 I;
    public d4 e;
    public CoroutineScope y;
    public DatagramSocket z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(d4 d4Var, InetAddress inetAddress, int i, d4 d4Var2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.F = d4Var;
        this.G = inetAddress;
        this.H = i;
        this.I = d4Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        y3 y3Var = new y3(this.F, this.G, this.H, this.I, dVar);
        y3Var.E = obj;
        return y3Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y3) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007b A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:14:0x003b, B:26:0x0075, B:28:0x007b, B:30:0x009c, B:32:0x00ae, B:36:0x00da, B:31:0x009f, B:19:0x0052, B:22:0x0063, B:24:0x0067), top: B:52:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:30:0x009c A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:14:0x003b, B:26:0x0075, B:28:0x007b, B:30:0x009c, B:32:0x00ae, B:36:0x00da, B:31:0x009f, B:19:0x0052, B:22:0x0063, B:24:0x0067), top: B:52:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:31:0x009f A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:14:0x003b, B:26:0x0075, B:28:0x007b, B:30:0x009c, B:32:0x00ae, B:36:0x00da, B:31:0x009f, B:19:0x0052, B:22:0x0063, B:24:0x0067), top: B:52:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f3 -> B:26:0x0075). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsalt.internal.y3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
