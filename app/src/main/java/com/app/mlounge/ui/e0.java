package com.app.mlounge.ui;

import android.content.Context;
import androidx.compose.runtime.y0;
import com.appsalt.internal.k0;
import java.io.Serializable;
import java.net.Socket;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public Object A;
    public Object B;
    public Serializable C;
    public Serializable D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ int e = 1;
    public int y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(String str, com.app.mlounge.data.remote.ntv.l lVar, Context context, String str2, String str3, String str4, String str5, kotlin.jvm.functions.r rVar, y0 y0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = str;
        this.E = lVar;
        this.F = context;
        this.A = str2;
        this.B = str3;
        this.C = str4;
        this.D = str5;
        this.G = rVar;
        this.H = y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new e0((String) this.z, (com.app.mlounge.data.remote.ntv.l) this.E, (Context) this.F, (String) this.A, (String) this.B, (String) this.C, (String) this.D, (kotlin.jvm.functions.r) this.G, (y0) this.H, dVar);
            default:
                e0 e0Var = new e0((k0) this.F, (Socket) this.G, (k0) this.H, dVar);
                e0Var.E = obj;
                return e0Var;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((e0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009b A[Catch: all -> 0x004d, TryCatch #3 {all -> 0x004d, blocks: (B:12:0x0049, B:25:0x0095, B:27:0x009b, B:29:0x00a9, B:33:0x00c5, B:36:0x00d6, B:40:0x00f9, B:17:0x0069, B:18:0x006e, B:21:0x0077, B:24:0x008c), top: B:94:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9 A[Catch: all -> 0x004d, TryCatch #3 {all -> 0x004d, blocks: (B:12:0x0049, B:25:0x0095, B:27:0x009b, B:29:0x00a9, B:33:0x00c5, B:36:0x00d6, B:40:0x00f9, B:17:0x0069, B:18:0x006e, B:21:0x0077, B:24:0x008c), top: B:94:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6 A[Catch: all -> 0x004d, TryCatch #3 {all -> 0x004d, blocks: (B:12:0x0049, B:25:0x0095, B:27:0x009b, B:29:0x00a9, B:33:0x00c5, B:36:0x00d6, B:40:0x00f9, B:17:0x0069, B:18:0x006e, B:21:0x0077, B:24:0x008c), top: B:94:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:43:0x0112  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v27, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r14v22, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r14v24, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r14v30, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r14v32, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r14v36, types: [byte[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0112 -> B:25:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(k0 k0Var, Socket socket, k0 k0Var2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.F = k0Var;
        this.G = socket;
        this.H = k0Var2;
    }
}
