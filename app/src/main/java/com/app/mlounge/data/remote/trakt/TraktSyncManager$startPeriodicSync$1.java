package com.app.mlounge.data.remote.trakt;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.app.mlounge.data.remote.trakt.TraktSyncManager$startPeriodicSync$1", f = "TraktSyncManager.kt", l = {Token.SETPROP, Token.GETELEM, Token.SETELEM_SUPER, Token.NAME, Token.THIS, Token.ENUM_INIT_VALUES}, m = "invokeSuspend", v = 2)
final class TraktSyncManager$startPeriodicSync$1 extends i implements p {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ TraktSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraktSyncManager$startPeriodicSync$1(TraktSyncManager traktSyncManager, d dVar) {
        super(2, dVar);
        this.this$0 = traktSyncManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        TraktSyncManager$startPeriodicSync$1 traktSyncManager$startPeriodicSync$1 = new TraktSyncManager$startPeriodicSync$1(this.this$0, dVar);
        traktSyncManager$startPeriodicSync$1.L$0 = obj;
        return traktSyncManager$startPeriodicSync$1;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TraktSyncManager$startPeriodicSync$1) create((CoroutineScope) obj, (d) obj2)).invokeSuspend(y.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b A[Catch: Exception -> 0x001c, TRY_ENTER, TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0017, B:72:0x012c, B:27:0x006b, B:30:0x007e, B:33:0x0088, B:34:0x008d, B:37:0x009e, B:40:0x00a4, B:42:0x00b0, B:44:0x00b6, B:46:0x00bc, B:48:0x00c2, B:50:0x00c8, B:52:0x00ce, B:54:0x00e2, B:56:0x00e8, B:58:0x00f2, B:60:0x00fe, B:62:0x0104, B:69:0x0116, B:10:0x001f, B:11:0x0024), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e A[Catch: Exception -> 0x001c, PHI: r10
  0x007e: PHI (r10v7 java.lang.Object) = (r10v14 java.lang.Object), (r10v0 java.lang.Object) binds: [B:28:0x007a, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0017, B:72:0x012c, B:27:0x006b, B:30:0x007e, B:33:0x0088, B:34:0x008d, B:37:0x009e, B:40:0x00a4, B:42:0x00b0, B:44:0x00b6, B:46:0x00bc, B:48:0x00c2, B:50:0x00c8, B:52:0x00ce, B:54:0x00e2, B:56:0x00e8, B:58:0x00f2, B:60:0x00fe, B:62:0x0104, B:69:0x0116, B:10:0x001f, B:11:0x0024), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0088 A[Catch: Exception -> 0x001c, TRY_ENTER, TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0017, B:72:0x012c, B:27:0x006b, B:30:0x007e, B:33:0x0088, B:34:0x008d, B:37:0x009e, B:40:0x00a4, B:42:0x00b0, B:44:0x00b6, B:46:0x00bc, B:48:0x00c2, B:50:0x00c8, B:52:0x00ce, B:54:0x00e2, B:56:0x00e8, B:58:0x00f2, B:60:0x00fe, B:62:0x0104, B:69:0x0116, B:10:0x001f, B:11:0x0024), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008d A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0017, B:72:0x012c, B:27:0x006b, B:30:0x007e, B:33:0x0088, B:34:0x008d, B:37:0x009e, B:40:0x00a4, B:42:0x00b0, B:44:0x00b6, B:46:0x00bc, B:48:0x00c2, B:50:0x00c8, B:52:0x00ce, B:54:0x00e2, B:56:0x00e8, B:58:0x00f2, B:60:0x00fe, B:62:0x0104, B:69:0x0116, B:10:0x001f, B:11:0x0024), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e A[Catch: Exception -> 0x001c, PHI: r10
  0x009e: PHI (r10v3 java.lang.Object) = (r10v11 java.lang.Object), (r10v0 java.lang.Object) binds: [B:35:0x009a, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0017, B:72:0x012c, B:27:0x006b, B:30:0x007e, B:33:0x0088, B:34:0x008d, B:37:0x009e, B:40:0x00a4, B:42:0x00b0, B:44:0x00b6, B:46:0x00bc, B:48:0x00c2, B:50:0x00c8, B:52:0x00ce, B:54:0x00e2, B:56:0x00e8, B:58:0x00f2, B:60:0x00fe, B:62:0x0104, B:69:0x0116, B:10:0x001f, B:11:0x0024), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4 A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0017, B:72:0x012c, B:27:0x006b, B:30:0x007e, B:33:0x0088, B:34:0x008d, B:37:0x009e, B:40:0x00a4, B:42:0x00b0, B:44:0x00b6, B:46:0x00bc, B:48:0x00c2, B:50:0x00c8, B:52:0x00ce, B:54:0x00e2, B:56:0x00e8, B:58:0x00f2, B:60:0x00fe, B:62:0x0104, B:69:0x0116, B:10:0x001f, B:11:0x0024), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0 A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0017, B:72:0x012c, B:27:0x006b, B:30:0x007e, B:33:0x0088, B:34:0x008d, B:37:0x009e, B:40:0x00a4, B:42:0x00b0, B:44:0x00b6, B:46:0x00bc, B:48:0x00c2, B:50:0x00c8, B:52:0x00ce, B:54:0x00e2, B:56:0x00e8, B:58:0x00f2, B:60:0x00fe, B:62:0x0104, B:69:0x0116, B:10:0x001f, B:11:0x0024), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0017, B:72:0x012c, B:27:0x006b, B:30:0x007e, B:33:0x0088, B:34:0x008d, B:37:0x009e, B:40:0x00a4, B:42:0x00b0, B:44:0x00b6, B:46:0x00bc, B:48:0x00c2, B:50:0x00c8, B:52:0x00ce, B:54:0x00e2, B:56:0x00e8, B:58:0x00f2, B:60:0x00fe, B:62:0x0104, B:69:0x0116, B:10:0x001f, B:11:0x0024), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8 A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0017, B:72:0x012c, B:27:0x006b, B:30:0x007e, B:33:0x0088, B:34:0x008d, B:37:0x009e, B:40:0x00a4, B:42:0x00b0, B:44:0x00b6, B:46:0x00bc, B:48:0x00c2, B:50:0x00c8, B:52:0x00ce, B:54:0x00e2, B:56:0x00e8, B:58:0x00f2, B:60:0x00fe, B:62:0x0104, B:69:0x0116, B:10:0x001f, B:11:0x0024), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2 A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0017, B:72:0x012c, B:27:0x006b, B:30:0x007e, B:33:0x0088, B:34:0x008d, B:37:0x009e, B:40:0x00a4, B:42:0x00b0, B:44:0x00b6, B:46:0x00bc, B:48:0x00c2, B:50:0x00c8, B:52:0x00ce, B:54:0x00e2, B:56:0x00e8, B:58:0x00f2, B:60:0x00fe, B:62:0x0104, B:69:0x0116, B:10:0x001f, B:11:0x0024), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2 A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0017, B:72:0x012c, B:27:0x006b, B:30:0x007e, B:33:0x0088, B:34:0x008d, B:37:0x009e, B:40:0x00a4, B:42:0x00b0, B:44:0x00b6, B:46:0x00bc, B:48:0x00c2, B:50:0x00c8, B:52:0x00ce, B:54:0x00e2, B:56:0x00e8, B:58:0x00f2, B:60:0x00fe, B:62:0x0104, B:69:0x0116, B:10:0x001f, B:11:0x0024), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fe A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0017, B:72:0x012c, B:27:0x006b, B:30:0x007e, B:33:0x0088, B:34:0x008d, B:37:0x009e, B:40:0x00a4, B:42:0x00b0, B:44:0x00b6, B:46:0x00bc, B:48:0x00c2, B:50:0x00c8, B:52:0x00ce, B:54:0x00e2, B:56:0x00e8, B:58:0x00f2, B:60:0x00fe, B:62:0x0104, B:69:0x0116, B:10:0x001f, B:11:0x0024), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0103  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x010f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0111  */
    /* JADX WARN: Code duplicated, block: B:68:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00a3 -> B:22:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0114 -> B:22:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0129 -> B:72:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0133 -> B:22:0x0054). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.trakt.TraktSyncManager$startPeriodicSync$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
