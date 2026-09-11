package com.app.mlounge.data.remote.trakt;

import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.ui.viewmodel.z0;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.c;
import kotlin.y;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import retrofit2.r0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktManager {
    public static final int $stable = 8;
    public static final String CLIENT_ID = "f133eb323f56303361d63cd7ed586acbb1881c0085a6db63d60eb7a0737700ea";
    public static final String CLIENT_SECRET = "4f040f9423d50b266a5d56f2e0ac168a4e068b5d0b257ca2cf00603e9334411d";
    public static final Companion Companion = new Companion();
    private static final String TAG = "TraktManager";
    private final TraktApi api;
    private final y1 prefs;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Companion {
    }

    public TraktManager(TraktApi traktApi, y1 y1Var) {
        traktApi.getClass();
        y1Var.getClass();
        this.api = traktApi;
        this.prefs = y1Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0119, code lost:
    
        if (r12.c(r14, r11, r0) == r5) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r10, java.lang.String r11, java.lang.Integer r12, java.lang.Integer r13, kotlin.coroutines.jvm.internal.c r14) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.trakt.TraktManager.a(int, java.lang.String, java.lang.Integer, java.lang.Integer, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
    
        if (r12 == r6) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(int r10, java.lang.String r11, kotlin.coroutines.jvm.internal.c r12) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.trakt.TraktManager.b(int, java.lang.String, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(c cVar) {
        TraktManager$ensureValidToken$1 traktManager$ensureValidToken$1;
        if (cVar instanceof TraktManager$ensureValidToken$1) {
            traktManager$ensureValidToken$1 = (TraktManager$ensureValidToken$1) cVar;
            int i = traktManager$ensureValidToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                traktManager$ensureValidToken$1.label = i - Integer.MIN_VALUE;
            } else {
                traktManager$ensureValidToken$1 = new TraktManager$ensureValidToken$1(this, cVar);
            }
        } else {
            traktManager$ensureValidToken$1 = new TraktManager$ensureValidToken$1(this, cVar);
        }
        Object objL = traktManager$ensureValidToken$1.result;
        int i2 = traktManager$ensureValidToken$1.label;
        y yVar = y.a;
        Object obj = a.e;
        if (i2 == 0) {
            kotlin.a.e(objL);
            traktManager$ensureValidToken$1.label = 1;
            objL = l(traktManager$ensureValidToken$1);
            if (objL != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                kotlin.a.e(objL);
                return yVar;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(objL);
        if (((Boolean) objL).booleanValue()) {
            traktManager$ensureValidToken$1.label = 2;
            if (n(traktManager$ensureValidToken$1) == obj) {
                return obj;
            }
        }
        return yVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(c cVar) {
        TraktManager$getAuthHeader$1 traktManager$getAuthHeader$1;
        if (cVar instanceof TraktManager$getAuthHeader$1) {
            traktManager$getAuthHeader$1 = (TraktManager$getAuthHeader$1) cVar;
            int i = traktManager$getAuthHeader$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                traktManager$getAuthHeader$1.label = i - Integer.MIN_VALUE;
            } else {
                traktManager$getAuthHeader$1 = new TraktManager$getAuthHeader$1(this, cVar);
            }
        } else {
            traktManager$getAuthHeader$1 = new TraktManager$getAuthHeader$1(this, cVar);
        }
        Object objFirst = traktManager$getAuthHeader$1.result;
        int i2 = traktManager$getAuthHeader$1.label;
        if (i2 == 0) {
            kotlin.a.e(objFirst);
            Flow flow = this.prefs.r;
            traktManager$getAuthHeader$1.label = 1;
            objFirst = FlowKt.first(flow, traktManager$getAuthHeader$1);
            a aVar = a.e;
            if (objFirst == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(objFirst);
        }
        String str = (String) objFirst;
        if (str == null || str.length() == 0) {
            return null;
        }
        return "Bearer ".concat(str);
    }

    public final Object e(z0 z0Var) {
        return this.api.l(new TraktDeviceCodeRequest(), z0Var);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:14:0x0039, B:36:0x0098, B:38:0x00a0, B:41:0x00a7, B:43:0x00b6, B:45:0x00bc, B:32:0x0082), top: B:53:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:14:0x0039, B:36:0x0098, B:38:0x00a0, B:41:0x00a7, B:43:0x00b6, B:45:0x00bc, B:32:0x0082), top: B:53:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0097 -> B:36:0x0098). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(java.lang.String r14, kotlin.coroutines.jvm.internal.c r15) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.trakt.TraktManager.f(java.lang.String, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x005d A[Catch: Exception -> 0x0032, TRY_ENTER, TryCatch #0 {Exception -> 0x0032, blocks: (B:14:0x002e, B:34:0x006a, B:31:0x005d), top: B:38:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r8 == r6) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(kotlin.coroutines.jvm.internal.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.app.mlounge.data.remote.trakt.TraktManager$getLastActivities$1
            if (r0 == 0) goto L13
            r0 = r8
            com.app.mlounge.data.remote.trakt.TraktManager$getLastActivities$1 r0 = (com.app.mlounge.data.remote.trakt.TraktManager$getLastActivities$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.app.mlounge.data.remote.trakt.TraktManager$getLastActivities$1 r0 = new com.app.mlounge.data.remote.trakt.TraktManager$getLastActivities$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            kotlin.coroutines.intrinsics.a r6 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L43
            if (r1 == r4) goto L3f
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L34
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.a.e(r8)     // Catch: java.lang.Exception -> L32
            goto L6a
        L32:
            r8 = move-exception
            goto L6d
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r8)
            r8 = 0
            return r8
        L3b:
            kotlin.a.e(r8)
            goto L58
        L3f:
            kotlin.a.e(r8)
            goto L4f
        L43:
            kotlin.a.e(r8)
            r0.label = r4
            java.lang.Object r8 = r7.c(r0)
            if (r8 != r6) goto L4f
            goto L69
        L4f:
            r0.label = r3
            java.lang.Object r8 = r7.d(r0)
            if (r8 != r6) goto L58
            goto L69
        L58:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L5d
            return r5
        L5d:
            com.app.mlounge.data.remote.trakt.TraktApi r1 = r7.api     // Catch: java.lang.Exception -> L32
            r0.L$0 = r5     // Catch: java.lang.Exception -> L32
            r0.label = r2     // Catch: java.lang.Exception -> L32
            java.lang.Object r8 = r1.k(r8, r0)     // Catch: java.lang.Exception -> L32
            if (r8 != r6) goto L6a
        L69:
            return r6
        L6a:
            com.app.mlounge.data.remote.trakt.TraktLastActivities r8 = (com.app.mlounge.data.remote.trakt.TraktLastActivities) r8     // Catch: java.lang.Exception -> L32
            return r8
        L6d:
            java.lang.String r0 = "TraktManager"
            java.lang.String r1 = "Failed to get last activities"
            com.app.mlounge.util.a.b(r0, r1, r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.trakt.TraktManager.g(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a A[PHI: r6
  0x007a: PHI (r6v18 java.lang.Object) = (r6v17 java.lang.Object), (r6v1 java.lang.Object) binds: [B:26:0x0077, B:20:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x007f A[Catch: Exception -> 0x0090, TRY_ENTER, TryCatch #0 {Exception -> 0x0090, blocks: (B:18:0x0057, B:34:0x008d, B:31:0x007f), top: B:54:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4 A[PHI: r6
  0x00b4: PHI (r6v9 java.lang.Object) = (r6v8 java.lang.Object), (r6v1 java.lang.Object) binds: [B:42:0x00b1, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9 A[Catch: Exception -> 0x00ce, TRY_ENTER, TryCatch #1 {Exception -> 0x00ce, blocks: (B:13:0x0035, B:50:0x00cb, B:47:0x00b9), top: B:54:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c8, code lost:
    
        if (r6 == r3) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(kotlin.coroutines.jvm.internal.c r6) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.trakt.TraktManager.h(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:14:0x0039, B:36:0x0098, B:38:0x00a0, B:41:0x00a7, B:43:0x00b6, B:45:0x00bc, B:32:0x0082), top: B:53:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:14:0x0039, B:36:0x0098, B:38:0x00a0, B:41:0x00a7, B:43:0x00b6, B:45:0x00bc, B:32:0x0082), top: B:53:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0097 -> B:36:0x0098). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(java.lang.String r14, kotlin.coroutines.jvm.internal.c r15) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.trakt.TraktManager.i(java.lang.String, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(c cVar) {
        TraktManager$isLoggedIn$1 traktManager$isLoggedIn$1;
        if (cVar instanceof TraktManager$isLoggedIn$1) {
            traktManager$isLoggedIn$1 = (TraktManager$isLoggedIn$1) cVar;
            int i = traktManager$isLoggedIn$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                traktManager$isLoggedIn$1.label = i - Integer.MIN_VALUE;
            } else {
                traktManager$isLoggedIn$1 = new TraktManager$isLoggedIn$1(this, cVar);
            }
        } else {
            traktManager$isLoggedIn$1 = new TraktManager$isLoggedIn$1(this, cVar);
        }
        Object objFirst = traktManager$isLoggedIn$1.result;
        int i2 = traktManager$isLoggedIn$1.label;
        if (i2 == 0) {
            kotlin.a.e(objFirst);
            Flow flow = this.prefs.r;
            traktManager$isLoggedIn$1.label = 1;
            objFirst = FlowKt.first(flow, traktManager$isLoggedIn$1);
            a aVar = a.e;
            if (objFirst == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(objFirst);
        }
        CharSequence charSequence = (CharSequence) objFirst;
        return Boolean.valueOf(!(charSequence == null || charSequence.length() == 0));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r1.i(r6, r0) == r8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        if (r10.r(0, r0) == r8) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(kotlin.coroutines.jvm.internal.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.app.mlounge.data.remote.trakt.TraktManager$logout$1
            if (r0 == 0) goto L13
            r0 = r10
            com.app.mlounge.data.remote.trakt.TraktManager$logout$1 r0 = (com.app.mlounge.data.remote.trakt.TraktManager$logout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.app.mlounge.data.remote.trakt.TraktManager$logout$1 r0 = new com.app.mlounge.data.remote.trakt.TraktManager$logout$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            kotlin.coroutines.intrinsics.a r8 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L5c
            if (r1 == r6) goto L58
            if (r1 == r5) goto L50
            if (r1 == r4) goto L48
            if (r1 == r3) goto L40
            if (r1 != r2) goto L39
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.a.e(r10)
            goto Lb2
        L39:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r10)
            r10 = 0
            return r10
        L40:
            java.lang.Object r1 = r0.L$0
            java.lang.String r1 = (java.lang.String) r1
            kotlin.a.e(r10)
            goto La3
        L48:
            java.lang.Object r1 = r0.L$0
            java.lang.String r1 = (java.lang.String) r1
            kotlin.a.e(r10)
            goto L96
        L50:
            java.lang.Object r1 = r0.L$0
            java.lang.String r1 = (java.lang.String) r1
            kotlin.a.e(r10)     // Catch: java.lang.Exception -> L89
            goto L89
        L58:
            kotlin.a.e(r10)
            goto L6c
        L5c:
            kotlin.a.e(r10)
            com.app.mlounge.data.local.prefs.y1 r10 = r9.prefs
            kotlinx.coroutines.flow.Flow r10 = r10.r
            r0.label = r6
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.first(r10, r0)
            if (r10 != r8) goto L6c
            goto Lb1
        L6c:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L89
            int r1 = r10.length()
            if (r1 != 0) goto L77
            goto L89
        L77:
            com.app.mlounge.data.remote.trakt.TraktApi r1 = r9.api     // Catch: java.lang.Exception -> L89
            com.app.mlounge.data.remote.trakt.TraktRevokeRequest r6 = new com.app.mlounge.data.remote.trakt.TraktRevokeRequest     // Catch: java.lang.Exception -> L89
            r6.<init>(r10)     // Catch: java.lang.Exception -> L89
            r0.L$0 = r7     // Catch: java.lang.Exception -> L89
            r0.label = r5     // Catch: java.lang.Exception -> L89
            java.lang.Object r10 = r1.i(r6, r0)     // Catch: java.lang.Exception -> L89
            if (r10 != r8) goto L89
            goto Lb1
        L89:
            com.app.mlounge.data.local.prefs.y1 r10 = r9.prefs
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r10 = r10.q(r7, r0)
            if (r10 != r8) goto L96
            goto Lb1
        L96:
            com.app.mlounge.data.local.prefs.y1 r10 = r9.prefs
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r10 = r10.p(r7, r0)
            if (r10 != r8) goto La3
            goto Lb1
        La3:
            com.app.mlounge.data.local.prefs.y1 r10 = r9.prefs
            r0.L$0 = r7
            r0.label = r2
            r1 = 0
            java.lang.Object r10 = r10.r(r1, r0)
            if (r10 != r8) goto Lb2
        Lb1:
            return r8
        Lb2:
            kotlin.y r10 = kotlin.y.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.trakt.TraktManager.k(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(c cVar) {
        TraktManager$needsTokenRefresh$1 traktManager$needsTokenRefresh$1;
        if (cVar instanceof TraktManager$needsTokenRefresh$1) {
            traktManager$needsTokenRefresh$1 = (TraktManager$needsTokenRefresh$1) cVar;
            int i = traktManager$needsTokenRefresh$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                traktManager$needsTokenRefresh$1.label = i - Integer.MIN_VALUE;
            } else {
                traktManager$needsTokenRefresh$1 = new TraktManager$needsTokenRefresh$1(this, cVar);
            }
        } else {
            traktManager$needsTokenRefresh$1 = new TraktManager$needsTokenRefresh$1(this, cVar);
        }
        Object objFirst = traktManager$needsTokenRefresh$1.result;
        int i2 = traktManager$needsTokenRefresh$1.label;
        if (i2 == 0) {
            kotlin.a.e(objFirst);
            Flow flow = this.prefs.t;
            traktManager$needsTokenRefresh$1.label = 1;
            objFirst = FlowKt.first(flow, traktManager$needsTokenRefresh$1);
            a aVar = a.e;
            if (objFirst == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(objFirst);
        }
        long jLongValue = ((Number) objFirst).longValue();
        return Boolean.valueOf(jLongValue > 0 && jLongValue - System.currentTimeMillis() < 86400000);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(String str, c cVar) {
        TraktManager$pollDeviceToken$1 traktManager$pollDeviceToken$1;
        Object obj;
        TraktTokenResponse traktTokenResponse;
        String strA;
        y1 y1Var;
        String strD;
        Long lB;
        long jCurrentTimeMillis;
        Long lC;
        long jLongValue;
        long j;
        if (cVar instanceof TraktManager$pollDeviceToken$1) {
            traktManager$pollDeviceToken$1 = (TraktManager$pollDeviceToken$1) cVar;
            int i = traktManager$pollDeviceToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                traktManager$pollDeviceToken$1.label = i - Integer.MIN_VALUE;
            } else {
                traktManager$pollDeviceToken$1 = new TraktManager$pollDeviceToken$1(this, cVar);
            }
        } else {
            traktManager$pollDeviceToken$1 = new TraktManager$pollDeviceToken$1(this, cVar);
        }
        Object objF = traktManager$pollDeviceToken$1.result;
        int i2 = traktManager$pollDeviceToken$1.label;
        a aVar = a.e;
        if (i2 == 0) {
            kotlin.a.e(objF);
            TraktApi traktApi = this.api;
            TraktDeviceTokenRequest traktDeviceTokenRequest = new TraktDeviceTokenRequest(str);
            traktManager$pollDeviceToken$1.L$0 = null;
            traktManager$pollDeviceToken$1.label = 1;
            objF = traktApi.f(traktDeviceTokenRequest, traktManager$pollDeviceToken$1);
            if (objF != aVar) {
            }
            return aVar;
        }
        if (i2 == 1) {
            kotlin.a.e(objF);
        } else {
            if (i2 == 2) {
                traktTokenResponse = (TraktTokenResponse) traktManager$pollDeviceToken$1.L$2;
                kotlin.a.e(objF);
                y1Var = this.prefs;
                strD = traktTokenResponse.d();
                traktManager$pollDeviceToken$1.L$0 = null;
                traktManager$pollDeviceToken$1.L$1 = null;
                traktManager$pollDeviceToken$1.L$2 = traktTokenResponse;
                traktManager$pollDeviceToken$1.label = 3;
                if (y1Var.p(strD, traktManager$pollDeviceToken$1) != aVar) {
                }
                return aVar;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                TraktTokenResponse traktTokenResponse2 = (TraktTokenResponse) traktManager$pollDeviceToken$1.L$2;
                kotlin.a.e(objF);
                return traktTokenResponse2;
            }
            traktTokenResponse = (TraktTokenResponse) traktManager$pollDeviceToken$1.L$2;
            kotlin.a.e(objF);
        }
        lB = traktTokenResponse.b();
        if (lB != null) {
            jCurrentTimeMillis = lB.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        }
        lC = traktTokenResponse.c();
        if (lC != null) {
            jLongValue = lC.longValue();
        } else {
            jLongValue = 7776000;
        }
        j = jCurrentTimeMillis + jLongValue;
        traktManager$pollDeviceToken$1.L$0 = null;
        traktManager$pollDeviceToken$1.L$1 = null;
        traktManager$pollDeviceToken$1.L$2 = traktTokenResponse;
        traktManager$pollDeviceToken$1.J$0 = j;
        traktManager$pollDeviceToken$1.label = 4;
        if (this.prefs.r(((long) 1000) * j, traktManager$pollDeviceToken$1) != aVar) {
            return aVar;
        }
        return traktTokenResponse;
        r0 r0Var = (r0) objF;
        if (!r0Var.a.N || (obj = r0Var.b) == null || (strA = (traktTokenResponse = (TraktTokenResponse) obj).a()) == null || strA.length() == 0) {
            return null;
        }
        y1 y1Var2 = this.prefs;
        String strA2 = traktTokenResponse.a();
        traktManager$pollDeviceToken$1.L$0 = null;
        traktManager$pollDeviceToken$1.L$1 = null;
        traktManager$pollDeviceToken$1.L$2 = traktTokenResponse;
        traktManager$pollDeviceToken$1.label = 2;
        if (y1Var2.q(strA2, traktManager$pollDeviceToken$1) != aVar) {
            y1Var = this.prefs;
            strD = traktTokenResponse.d();
            traktManager$pollDeviceToken$1.L$0 = null;
            traktManager$pollDeviceToken$1.L$1 = null;
            traktManager$pollDeviceToken$1.L$2 = traktTokenResponse;
            traktManager$pollDeviceToken$1.label = 3;
            if (y1Var.p(strD, traktManager$pollDeviceToken$1) != aVar) {
                lB = traktTokenResponse.b();
                if (lB != null) {
                    jCurrentTimeMillis = lB.longValue();
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                }
                lC = traktTokenResponse.c();
                if (lC != null) {
                    jLongValue = lC.longValue();
                } else {
                    jLongValue = 7776000;
                }
                j = jCurrentTimeMillis + jLongValue;
                traktManager$pollDeviceToken$1.L$0 = null;
                traktManager$pollDeviceToken$1.L$1 = null;
                traktManager$pollDeviceToken$1.L$2 = traktTokenResponse;
                traktManager$pollDeviceToken$1.J$0 = j;
                traktManager$pollDeviceToken$1.label = 4;
                if (this.prefs.r(((long) 1000) * j, traktManager$pollDeviceToken$1) != aVar) {
                    return traktTokenResponse;
                }
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c1 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:16:0x0039, B:70:0x0110, B:23:0x004f, B:59:0x00db, B:61:0x00e3, B:63:0x00ee, B:65:0x00f4, B:67:0x00fc, B:62:0x00e8, B:26:0x005c, B:51:0x00bb, B:53:0x00c1, B:56:0x00c8, B:29:0x0064, B:42:0x0097, B:44:0x009f, B:47:0x00a7, B:39:0x0084), top: B:75:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00db A[Catch: Exception -> 0x003e, PHI: r1
  0x00db: PHI (r1v9 com.app.mlounge.data.remote.trakt.TraktTokenResponse) = 
  (r1v8 com.app.mlounge.data.remote.trakt.TraktTokenResponse)
  (r1v8 com.app.mlounge.data.remote.trakt.TraktTokenResponse)
  (r1v8 com.app.mlounge.data.remote.trakt.TraktTokenResponse)
  (r1v15 com.app.mlounge.data.remote.trakt.TraktTokenResponse)
 binds: [B:52:0x00bf, B:57:0x00d8, B:55:0x00c7, B:23:0x004f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x003e, blocks: (B:16:0x0039, B:70:0x0110, B:23:0x004f, B:59:0x00db, B:61:0x00e3, B:63:0x00ee, B:65:0x00f4, B:67:0x00fc, B:62:0x00e8, B:26:0x005c, B:51:0x00bb, B:53:0x00c1, B:56:0x00c8, B:29:0x0064, B:42:0x0097, B:44:0x009f, B:47:0x00a7, B:39:0x0084), top: B:75:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e3 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:16:0x0039, B:70:0x0110, B:23:0x004f, B:59:0x00db, B:61:0x00e3, B:63:0x00ee, B:65:0x00f4, B:67:0x00fc, B:62:0x00e8, B:26:0x005c, B:51:0x00bb, B:53:0x00c1, B:56:0x00c8, B:29:0x0064, B:42:0x0097, B:44:0x009f, B:47:0x00a7, B:39:0x0084), top: B:75:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:16:0x0039, B:70:0x0110, B:23:0x004f, B:59:0x00db, B:61:0x00e3, B:63:0x00ee, B:65:0x00f4, B:67:0x00fc, B:62:0x00e8, B:26:0x005c, B:51:0x00bb, B:53:0x00c1, B:56:0x00c8, B:29:0x0064, B:42:0x0097, B:44:0x009f, B:47:0x00a7, B:39:0x0084), top: B:75:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f4 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:16:0x0039, B:70:0x0110, B:23:0x004f, B:59:0x00db, B:61:0x00e3, B:63:0x00ee, B:65:0x00f4, B:67:0x00fc, B:62:0x00e8, B:26:0x005c, B:51:0x00bb, B:53:0x00c1, B:56:0x00c8, B:29:0x0064, B:42:0x0097, B:44:0x009f, B:47:0x00a7, B:39:0x0084), top: B:75:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010d, code lost:
    
        if (r12.prefs.r(((long) 1000) * r5, r0) == r9) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(kotlin.coroutines.jvm.internal.c r13) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.trakt.TraktManager.n(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
    
        if (r3.j(r11, r10, r0) == r5) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(int r9, java.lang.String r10, kotlin.coroutines.jvm.internal.c r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.trakt.TraktManager.o(int, java.lang.String, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
    
        if (r12 == r6) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(int r10, java.lang.String r11, kotlin.coroutines.jvm.internal.c r12) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.trakt.TraktManager.p(int, java.lang.String, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
