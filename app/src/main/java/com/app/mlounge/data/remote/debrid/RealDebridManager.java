package com.app.mlounge.data.remote.debrid;

import android.support.v4.media.session.b;
import androidx.compose.runtime.t1;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.local.prefs.z1;
import com.app.mlounge.ui.viewmodel.z0;
import kotlin.a;
import kotlin.coroutines.jvm.internal.c;
import kotlin.y;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class RealDebridManager {
    public static final int $stable = 8;
    public static final String CLIENT_ID = "X245A4XAIBGVM";
    public static final Companion Companion = new Companion();
    public static final String GRANT_TYPE = "http://oauth.net/grant_type/device/1.0";
    private static final String TAG = "RealDebridManager";
    private final RealDebridApi api;
    private final y1 prefs;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Companion {
    }

    public RealDebridManager(RealDebridApi realDebridApi, y1 y1Var) {
        realDebridApi.getClass();
        y1Var.getClass();
        this.api = realDebridApi;
        this.prefs = y1Var;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9 A[Catch: Exception -> 0x0047, PHI: r13
  0x00d9: PHI (r13v11 java.lang.Object) = (r13v10 java.lang.Object), (r13v1 java.lang.Object) binds: [B:46:0x00d5, B:27:0x0075] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0047, blocks: (B:17:0x0042, B:69:0x014a, B:24:0x0064, B:61:0x0119, B:63:0x011f, B:66:0x0145, B:27:0x0075, B:48:0x00d9, B:50:0x00e1, B:53:0x00e8, B:55:0x00ee, B:57:0x00ff, B:45:0x00c5), top: B:74:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e1 A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:17:0x0042, B:69:0x014a, B:24:0x0064, B:61:0x0119, B:63:0x011f, B:66:0x0145, B:27:0x0075, B:48:0x00d9, B:50:0x00e1, B:53:0x00e8, B:55:0x00ee, B:57:0x00ff, B:45:0x00c5), top: B:74:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:17:0x0042, B:69:0x014a, B:24:0x0064, B:61:0x0119, B:63:0x011f, B:66:0x0145, B:27:0x0075, B:48:0x00d9, B:50:0x00e1, B:53:0x00e8, B:55:0x00ee, B:57:0x00ff, B:45:0x00c5), top: B:74:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0117  */
    /* JADX WARN: Code duplicated, block: B:60:0x0118  */
    /* JADX WARN: Code duplicated, block: B:63:0x011f A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:17:0x0042, B:69:0x014a, B:24:0x0064, B:61:0x0119, B:63:0x011f, B:66:0x0145, B:27:0x0075, B:48:0x00d9, B:50:0x00e1, B:53:0x00e8, B:55:0x00ee, B:57:0x00ff, B:45:0x00c5), top: B:74:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0144  */
    /* JADX WARN: Code duplicated, block: B:66:0x0145 A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:17:0x0042, B:69:0x014a, B:24:0x0064, B:61:0x0119, B:63:0x011f, B:66:0x0145, B:27:0x0075, B:48:0x00d9, B:50:0x00e1, B:53:0x00e8, B:55:0x00ee, B:57:0x00ff, B:45:0x00c5), top: B:74:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0147, code lost:
    
        if (r13 == r10) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r12, kotlin.coroutines.jvm.internal.c r13) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.RealDebridManager.a(java.lang.String, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(c cVar) {
        RealDebridManager$getAuthHeader$1 realDebridManager$getAuthHeader$1;
        if (cVar instanceof RealDebridManager$getAuthHeader$1) {
            realDebridManager$getAuthHeader$1 = (RealDebridManager$getAuthHeader$1) cVar;
            int i = realDebridManager$getAuthHeader$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realDebridManager$getAuthHeader$1.label = i - Integer.MIN_VALUE;
            } else {
                realDebridManager$getAuthHeader$1 = new RealDebridManager$getAuthHeader$1(this, cVar);
            }
        } else {
            realDebridManager$getAuthHeader$1 = new RealDebridManager$getAuthHeader$1(this, cVar);
        }
        Object objFirst = realDebridManager$getAuthHeader$1.result;
        int i2 = realDebridManager$getAuthHeader$1.label;
        if (i2 == 0) {
            a.e(objFirst);
            realDebridManager$getAuthHeader$1.label = 1;
            objFirst = FlowKt.first(this.prefs.k, realDebridManager$getAuthHeader$1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objFirst == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a.e(objFirst);
        }
        String str = (String) objFirst;
        if (str == null) {
            return null;
        }
        return "Bearer ".concat(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(c cVar) {
        RealDebridManager$getDeviceCode$1 realDebridManager$getDeviceCode$1;
        if (cVar instanceof RealDebridManager$getDeviceCode$1) {
            realDebridManager$getDeviceCode$1 = (RealDebridManager$getDeviceCode$1) cVar;
            int i = realDebridManager$getDeviceCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realDebridManager$getDeviceCode$1.label = i - Integer.MIN_VALUE;
            } else {
                realDebridManager$getDeviceCode$1 = new RealDebridManager$getDeviceCode$1(this, cVar);
            }
        } else {
            realDebridManager$getDeviceCode$1 = new RealDebridManager$getDeviceCode$1(this, cVar);
        }
        Object objE = realDebridManager$getDeviceCode$1.result;
        int i2 = realDebridManager$getDeviceCode$1.label;
        try {
            if (i2 == 0) {
                a.e(objE);
                RealDebridApi realDebridApi = this.api;
                realDebridManager$getDeviceCode$1.label = 1;
                objE = realDebridApi.e(CLIENT_ID, "yes", realDebridManager$getDeviceCode$1);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objE == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a.e(objE);
            }
            return (RealDebridDeviceCodeResponse) objE;
        } catch (Exception e) {
            com.app.mlounge.util.a.b(TAG, "getDeviceCode failed", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (r7 == r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.app.mlounge.data.remote.debrid.RealDebridManager$getUserInfo$1
            if (r0 == 0) goto L13
            r0 = r7
            com.app.mlounge.data.remote.debrid.RealDebridManager$getUserInfo$1 r0 = (com.app.mlounge.data.remote.debrid.RealDebridManager$getUserInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.app.mlounge.data.remote.debrid.RealDebridManager$getUserInfo$1 r0 = new com.app.mlounge.data.remote.debrid.RealDebridManager$getUserInfo$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            kotlin.coroutines.intrinsics.a r5 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.a.e(r7)     // Catch: java.lang.Exception -> L2f
            goto L59
        L2f:
            r7 = move-exception
            goto L6e
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            return r4
        L37:
            kotlin.a.e(r7)
            goto L47
        L3b:
            kotlin.a.e(r7)
            r0.label = r3
            java.lang.Object r7 = r6.b(r0)
            if (r7 != r5) goto L47
            goto L58
        L47:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L4c
            return r4
        L4c:
            com.app.mlounge.data.remote.debrid.RealDebridApi r1 = r6.api     // Catch: java.lang.Exception -> L2f
            r0.L$0 = r4     // Catch: java.lang.Exception -> L2f
            r0.label = r2     // Catch: java.lang.Exception -> L2f
            java.lang.Object r7 = r1.a(r7, r0)     // Catch: java.lang.Exception -> L2f
            if (r7 != r5) goto L59
        L58:
            return r5
        L59:
            com.google.gson.k r7 = (com.google.gson.k) r7     // Catch: java.lang.Exception -> L2f
            kotlin.o r0 = com.app.mlounge.util.a.a     // Catch: java.lang.Exception -> L2f
            java.util.Objects.toString(r7)     // Catch: java.lang.Exception -> L2f
            com.google.gson.f r0 = new com.google.gson.f     // Catch: java.lang.Exception -> L2f
            r0.<init>()     // Catch: java.lang.Exception -> L2f
            java.lang.Class<com.app.mlounge.data.remote.debrid.RealDebridUserInfo> r1 = com.app.mlounge.data.remote.debrid.RealDebridUserInfo.class
            java.lang.Object r7 = r0.b(r7, r1)     // Catch: java.lang.Exception -> L2f
            com.app.mlounge.data.remote.debrid.RealDebridUserInfo r7 = (com.app.mlounge.data.remote.debrid.RealDebridUserInfo) r7     // Catch: java.lang.Exception -> L2f
            return r7
        L6e:
            java.lang.String r0 = "RealDebridManager"
            java.lang.String r1 = "getUserInfo failed"
            com.app.mlounge.util.a.b(r0, r1, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.RealDebridManager.d(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(c cVar) {
        RealDebridManager$isLoggedIn$1 realDebridManager$isLoggedIn$1;
        if (cVar instanceof RealDebridManager$isLoggedIn$1) {
            realDebridManager$isLoggedIn$1 = (RealDebridManager$isLoggedIn$1) cVar;
            int i = realDebridManager$isLoggedIn$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realDebridManager$isLoggedIn$1.label = i - Integer.MIN_VALUE;
            } else {
                realDebridManager$isLoggedIn$1 = new RealDebridManager$isLoggedIn$1(this, cVar);
            }
        } else {
            realDebridManager$isLoggedIn$1 = new RealDebridManager$isLoggedIn$1(this, cVar);
        }
        Object objFirst = realDebridManager$isLoggedIn$1.result;
        int i2 = realDebridManager$isLoggedIn$1.label;
        if (i2 == 0) {
            a.e(objFirst);
            Flow flow = this.prefs.k;
            realDebridManager$isLoggedIn$1.label = 1;
            objFirst = FlowKt.first(flow, realDebridManager$isLoggedIn$1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objFirst == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a.e(objFirst);
        }
        CharSequence charSequence = (CharSequence) objFirst;
        return Boolean.valueOf(!(charSequence == null || charSequence.length() == 0));
    }

    public final Object f(z0 z0Var) {
        Object objS = b.s(z1.a(this.prefs.a), new t1(2, 2, null), z0Var);
        y yVar = y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (objS != aVar) {
            objS = yVar;
        }
        return objS == aVar ? objS : yVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        if (r9 == r5) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable g(java.lang.String r8, kotlin.coroutines.jvm.internal.c r9) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.RealDebridManager.g(java.lang.String, kotlin.coroutines.jvm.internal.c):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0078 A[PHI: r0 r1 r13
  0x0078: PHI (r0v14 java.lang.String) = (r0v11 java.lang.String), (r0v16 java.lang.String) binds: [B:44:0x00ca, B:24:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r1v4 java.lang.String) = (r1v2 java.lang.String), (r1v7 java.lang.String) binds: [B:44:0x00ca, B:24:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r13v17 java.lang.Object) = (r13v15 java.lang.Object), (r13v1 java.lang.Object) binds: [B:44:0x00ca, B:24:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6 A[Catch: Exception -> 0x0041, TRY_ENTER, TryCatch #0 {Exception -> 0x0041, blocks: (B:14:0x003c, B:19:0x0057, B:65:0x012c, B:67:0x0132, B:70:0x0159, B:22:0x0068, B:53:0x00eb, B:55:0x00f4, B:58:0x00fb, B:60:0x0101, B:62:0x0112, B:73:0x015e, B:50:0x00d6), top: B:78:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb A[Catch: Exception -> 0x0041, PHI: r13
  0x00eb: PHI (r13v21 java.lang.Object) = (r13v19 java.lang.Object), (r13v1 java.lang.Object) binds: [B:51:0x00e7, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0041, blocks: (B:14:0x003c, B:19:0x0057, B:65:0x012c, B:67:0x0132, B:70:0x0159, B:22:0x0068, B:53:0x00eb, B:55:0x00f4, B:58:0x00fb, B:60:0x0101, B:62:0x0112, B:73:0x015e, B:50:0x00d6), top: B:78:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:14:0x003c, B:19:0x0057, B:65:0x012c, B:67:0x0132, B:70:0x0159, B:22:0x0068, B:53:0x00eb, B:55:0x00f4, B:58:0x00fb, B:60:0x0101, B:62:0x0112, B:73:0x015e, B:50:0x00d6), top: B:78:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0101 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:14:0x003c, B:19:0x0057, B:65:0x012c, B:67:0x0132, B:70:0x0159, B:22:0x0068, B:53:0x00eb, B:55:0x00f4, B:58:0x00fb, B:60:0x0101, B:62:0x0112, B:73:0x015e, B:50:0x00d6), top: B:78:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0110  */
    /* JADX WARN: Code duplicated, block: B:64:0x012b  */
    /* JADX WARN: Code duplicated, block: B:65:0x012c A[Catch: Exception -> 0x0041, PHI: r0 r2
  0x012c: PHI (r0v27 long) = (r0v18 long), (r0v30 long) binds: [B:63:0x0129, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x012c: PHI (r2v3 com.app.mlounge.data.remote.debrid.RealDebridTokenResponse) = 
  (r2v2 com.app.mlounge.data.remote.debrid.RealDebridTokenResponse)
  (r2v6 com.app.mlounge.data.remote.debrid.RealDebridTokenResponse)
 binds: [B:63:0x0129, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0041, blocks: (B:14:0x003c, B:19:0x0057, B:65:0x012c, B:67:0x0132, B:70:0x0159, B:22:0x0068, B:53:0x00eb, B:55:0x00f4, B:58:0x00fb, B:60:0x0101, B:62:0x0112, B:73:0x015e, B:50:0x00d6), top: B:78:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0132 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:14:0x003c, B:19:0x0057, B:65:0x012c, B:67:0x0132, B:70:0x0159, B:22:0x0068, B:53:0x00eb, B:55:0x00f4, B:58:0x00fb, B:60:0x0101, B:62:0x0112, B:73:0x015e, B:50:0x00d6), top: B:78:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0158  */
    /* JADX WARN: Code duplicated, block: B:70:0x0159 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:14:0x003c, B:19:0x0057, B:65:0x012c, B:67:0x0132, B:70:0x0159, B:22:0x0068, B:53:0x00eb, B:55:0x00f4, B:58:0x00fb, B:60:0x0101, B:62:0x0112, B:73:0x015e, B:50:0x00d6), top: B:78:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015b, code lost:
    
        if (r13 == r9) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(kotlin.coroutines.jvm.internal.c r13) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.RealDebridManager.h(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00bb A[PHI: r2 r10 r15
  0x00bb: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v11 java.lang.String) binds: [B:45:0x00b8, B:25:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x00bb: PHI (r10v1 long) = (r10v0 long), (r10v4 long) binds: [B:45:0x00b8, B:25:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x00bb: PHI (r15v19 java.lang.Object) = (r15v16 java.lang.Object), (r15v1 java.lang.Object) binds: [B:45:0x00b8, B:25:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6 A[Catch: Exception -> 0x0043, TRY_ENTER, TryCatch #0 {Exception -> 0x0043, blocks: (B:16:0x003e, B:23:0x0053, B:55:0x00e3, B:57:0x00ee, B:60:0x00f6, B:62:0x00fc, B:51:0x00c6), top: B:82:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:16:0x003e, B:23:0x0053, B:55:0x00e3, B:57:0x00ee, B:60:0x00f6, B:62:0x00fc, B:51:0x00c6), top: B:82:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f6 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:16:0x003e, B:23:0x0053, B:55:0x00e3, B:57:0x00ee, B:60:0x00f6, B:62:0x00fc, B:51:0x00c6), top: B:82:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0117  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0114, code lost:
    
        if (r15.o(r0, r10, r1) == r9) goto L64;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00c6, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(kotlin.coroutines.jvm.internal.c r15) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.RealDebridManager.i(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r10 == r7) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.String r9, kotlin.coroutines.jvm.internal.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.app.mlounge.data.remote.debrid.RealDebridManager$unrestrictLink$1
            if (r0 == 0) goto L13
            r0 = r10
            com.app.mlounge.data.remote.debrid.RealDebridManager$unrestrictLink$1 r0 = (com.app.mlounge.data.remote.debrid.RealDebridManager$unrestrictLink$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.app.mlounge.data.remote.debrid.RealDebridManager$unrestrictLink$1 r0 = new com.app.mlounge.data.remote.debrid.RealDebridManager$unrestrictLink$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            java.lang.String r2 = "unrestrictLink failed"
            java.lang.String r3 = "RealDebridManager"
            r4 = 2
            r5 = 1
            r6 = 0
            kotlin.coroutines.intrinsics.a r7 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L4a
            if (r1 == r5) goto L42
            if (r1 != r4) goto L3b
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            kotlin.a.e(r10)     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            goto L6c
        L37:
            r9 = move-exception
            goto L8c
        L39:
            r9 = move-exception
            goto L90
        L3b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r9)
            r9 = 0
            return r9
        L42:
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            kotlin.a.e(r10)
            goto L58
        L4a:
            kotlin.a.e(r10)
            r0.L$0 = r9
            r0.label = r5
            java.lang.Object r10 = r8.b(r0)
            if (r10 != r7) goto L58
            goto L6b
        L58:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L5d
            goto L8b
        L5d:
            com.app.mlounge.data.remote.debrid.RealDebridApi r1 = r8.api     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            r0.L$0 = r6     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            r0.L$1 = r6     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            r0.label = r4     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            java.lang.Object r10 = r1.f(r10, r9, r0)     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            if (r10 != r7) goto L6c
        L6b:
            return r7
        L6c:
            com.google.gson.k r10 = (com.google.gson.k) r10     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            java.lang.String r9 = "download"
            com.google.gson.h r9 = r10.l(r9)     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            if (r9 == 0) goto L7e
            java.lang.String r9 = r9.h()     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            if (r9 != 0) goto L7d
            goto L7e
        L7d:
            return r9
        L7e:
            java.lang.String r9 = "link"
            com.google.gson.h r9 = r10.l(r9)     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            if (r9 == 0) goto L8b
            java.lang.String r9 = r9.h()     // Catch: java.lang.Exception -> L37 retrofit2.q -> L39
            return r9
        L8b:
            return r6
        L8c:
            com.app.mlounge.util.a.b(r3, r2, r9)
            return r6
        L90:
            com.app.mlounge.util.a.b(r3, r2, r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.RealDebridManager.j(java.lang.String, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x029a A[Catch: Exception -> 0x006a, q -> 0x006d, TryCatch #2 {q -> 0x006d, Exception -> 0x006a, blocks: (B:13:0x0066, B:20:0x0098, B:108:0x02eb, B:110:0x02f5, B:111:0x02f8, B:113:0x0300, B:118:0x0308, B:120:0x030e, B:122:0x0312, B:124:0x0319, B:126:0x0321, B:131:0x0330, B:134:0x0338, B:101:0x029a, B:105:0x02c6, B:23:0x00cd, B:26:0x00f2, B:98:0x0293, B:29:0x011b, B:94:0x0271, B:32:0x0138, B:58:0x01d2, B:60:0x01dc, B:65:0x01e4, B:66:0x01f3, B:68:0x01f9, B:70:0x0206, B:72:0x0210, B:77:0x0218, B:80:0x0220, B:83:0x0227, B:87:0x0230, B:89:0x023a, B:91:0x0252, B:90:0x0245, B:95:0x0274, B:35:0x014d, B:49:0x01a3, B:51:0x01ab, B:54:0x01b3, B:45:0x017e), top: B:144:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:103:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:104:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:107:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:110:0x02f5 A[Catch: Exception -> 0x006a, q -> 0x006d, TryCatch #2 {q -> 0x006d, Exception -> 0x006a, blocks: (B:13:0x0066, B:20:0x0098, B:108:0x02eb, B:110:0x02f5, B:111:0x02f8, B:113:0x0300, B:118:0x0308, B:120:0x030e, B:122:0x0312, B:124:0x0319, B:126:0x0321, B:131:0x0330, B:134:0x0338, B:101:0x029a, B:105:0x02c6, B:23:0x00cd, B:26:0x00f2, B:98:0x0293, B:29:0x011b, B:94:0x0271, B:32:0x0138, B:58:0x01d2, B:60:0x01dc, B:65:0x01e4, B:66:0x01f3, B:68:0x01f9, B:70:0x0206, B:72:0x0210, B:77:0x0218, B:80:0x0220, B:83:0x0227, B:87:0x0230, B:89:0x023a, B:91:0x0252, B:90:0x0245, B:95:0x0274, B:35:0x014d, B:49:0x01a3, B:51:0x01ab, B:54:0x01b3, B:45:0x017e), top: B:144:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0300 A[Catch: Exception -> 0x006a, q -> 0x006d, TryCatch #2 {q -> 0x006d, Exception -> 0x006a, blocks: (B:13:0x0066, B:20:0x0098, B:108:0x02eb, B:110:0x02f5, B:111:0x02f8, B:113:0x0300, B:118:0x0308, B:120:0x030e, B:122:0x0312, B:124:0x0319, B:126:0x0321, B:131:0x0330, B:134:0x0338, B:101:0x029a, B:105:0x02c6, B:23:0x00cd, B:26:0x00f2, B:98:0x0293, B:29:0x011b, B:94:0x0271, B:32:0x0138, B:58:0x01d2, B:60:0x01dc, B:65:0x01e4, B:66:0x01f3, B:68:0x01f9, B:70:0x0206, B:72:0x0210, B:77:0x0218, B:80:0x0220, B:83:0x0227, B:87:0x0230, B:89:0x023a, B:91:0x0252, B:90:0x0245, B:95:0x0274, B:35:0x014d, B:49:0x01a3, B:51:0x01ab, B:54:0x01b3, B:45:0x017e), top: B:144:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0304  */
    /* JADX WARN: Code duplicated, block: B:116:0x0305  */
    /* JADX WARN: Code duplicated, block: B:118:0x0308 A[Catch: Exception -> 0x006a, q -> 0x006d, TryCatch #2 {q -> 0x006d, Exception -> 0x006a, blocks: (B:13:0x0066, B:20:0x0098, B:108:0x02eb, B:110:0x02f5, B:111:0x02f8, B:113:0x0300, B:118:0x0308, B:120:0x030e, B:122:0x0312, B:124:0x0319, B:126:0x0321, B:131:0x0330, B:134:0x0338, B:101:0x029a, B:105:0x02c6, B:23:0x00cd, B:26:0x00f2, B:98:0x0293, B:29:0x011b, B:94:0x0271, B:32:0x0138, B:58:0x01d2, B:60:0x01dc, B:65:0x01e4, B:66:0x01f3, B:68:0x01f9, B:70:0x0206, B:72:0x0210, B:77:0x0218, B:80:0x0220, B:83:0x0227, B:87:0x0230, B:89:0x023a, B:91:0x0252, B:90:0x0245, B:95:0x0274, B:35:0x014d, B:49:0x01a3, B:51:0x01ab, B:54:0x01b3, B:45:0x017e), top: B:144:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:119:0x030d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0312 A[Catch: Exception -> 0x006a, q -> 0x006d, TryCatch #2 {q -> 0x006d, Exception -> 0x006a, blocks: (B:13:0x0066, B:20:0x0098, B:108:0x02eb, B:110:0x02f5, B:111:0x02f8, B:113:0x0300, B:118:0x0308, B:120:0x030e, B:122:0x0312, B:124:0x0319, B:126:0x0321, B:131:0x0330, B:134:0x0338, B:101:0x029a, B:105:0x02c6, B:23:0x00cd, B:26:0x00f2, B:98:0x0293, B:29:0x011b, B:94:0x0271, B:32:0x0138, B:58:0x01d2, B:60:0x01dc, B:65:0x01e4, B:66:0x01f3, B:68:0x01f9, B:70:0x0206, B:72:0x0210, B:77:0x0218, B:80:0x0220, B:83:0x0227, B:87:0x0230, B:89:0x023a, B:91:0x0252, B:90:0x0245, B:95:0x0274, B:35:0x014d, B:49:0x01a3, B:51:0x01ab, B:54:0x01b3, B:45:0x017e), top: B:144:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0319 A[Catch: Exception -> 0x006a, q -> 0x006d, TryCatch #2 {q -> 0x006d, Exception -> 0x006a, blocks: (B:13:0x0066, B:20:0x0098, B:108:0x02eb, B:110:0x02f5, B:111:0x02f8, B:113:0x0300, B:118:0x0308, B:120:0x030e, B:122:0x0312, B:124:0x0319, B:126:0x0321, B:131:0x0330, B:134:0x0338, B:101:0x029a, B:105:0x02c6, B:23:0x00cd, B:26:0x00f2, B:98:0x0293, B:29:0x011b, B:94:0x0271, B:32:0x0138, B:58:0x01d2, B:60:0x01dc, B:65:0x01e4, B:66:0x01f3, B:68:0x01f9, B:70:0x0206, B:72:0x0210, B:77:0x0218, B:80:0x0220, B:83:0x0227, B:87:0x0230, B:89:0x023a, B:91:0x0252, B:90:0x0245, B:95:0x0274, B:35:0x014d, B:49:0x01a3, B:51:0x01ab, B:54:0x01b3, B:45:0x017e), top: B:144:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:128:0x032c  */
    /* JADX WARN: Code duplicated, block: B:129:0x032d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0330 A[Catch: Exception -> 0x006a, q -> 0x006d, TryCatch #2 {q -> 0x006d, Exception -> 0x006a, blocks: (B:13:0x0066, B:20:0x0098, B:108:0x02eb, B:110:0x02f5, B:111:0x02f8, B:113:0x0300, B:118:0x0308, B:120:0x030e, B:122:0x0312, B:124:0x0319, B:126:0x0321, B:131:0x0330, B:134:0x0338, B:101:0x029a, B:105:0x02c6, B:23:0x00cd, B:26:0x00f2, B:98:0x0293, B:29:0x011b, B:94:0x0271, B:32:0x0138, B:58:0x01d2, B:60:0x01dc, B:65:0x01e4, B:66:0x01f3, B:68:0x01f9, B:70:0x0206, B:72:0x0210, B:77:0x0218, B:80:0x0220, B:83:0x0227, B:87:0x0230, B:89:0x023a, B:91:0x0252, B:90:0x0245, B:95:0x0274, B:35:0x014d, B:49:0x01a3, B:51:0x01ab, B:54:0x01b3, B:45:0x017e), top: B:144:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0335  */
    /* JADX WARN: Code duplicated, block: B:134:0x0338 A[Catch: Exception -> 0x006a, q -> 0x006d, TRY_LEAVE, TryCatch #2 {q -> 0x006d, Exception -> 0x006a, blocks: (B:13:0x0066, B:20:0x0098, B:108:0x02eb, B:110:0x02f5, B:111:0x02f8, B:113:0x0300, B:118:0x0308, B:120:0x030e, B:122:0x0312, B:124:0x0319, B:126:0x0321, B:131:0x0330, B:134:0x0338, B:101:0x029a, B:105:0x02c6, B:23:0x00cd, B:26:0x00f2, B:98:0x0293, B:29:0x011b, B:94:0x0271, B:32:0x0138, B:58:0x01d2, B:60:0x01dc, B:65:0x01e4, B:66:0x01f3, B:68:0x01f9, B:70:0x0206, B:72:0x0210, B:77:0x0218, B:80:0x0220, B:83:0x0227, B:87:0x0230, B:89:0x023a, B:91:0x0252, B:90:0x0245, B:95:0x0274, B:35:0x014d, B:49:0x01a3, B:51:0x01ab, B:54:0x01b3, B:45:0x017e), top: B:144:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:137:0x035f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x009b A[PHI: r0 r2 r3 r4 r7 r12 r13 r14
  0x009b: PHI (r0v40 java.lang.Object) = (r0v38 java.lang.Object), (r0v1 java.lang.Object) binds: [B:106:0x02e7, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r2v34 int) = (r2v31 int), (r2v37 int) binds: [B:106:0x02e7, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r3v5 com.app.mlounge.data.remote.debrid.RealDebridManager$unrestrictTorrent$1) = 
  (r3v3 com.app.mlounge.data.remote.debrid.RealDebridManager$unrestrictTorrent$1)
  (r3v2 com.app.mlounge.data.remote.debrid.RealDebridManager$unrestrictTorrent$1)
 binds: [B:106:0x02e7, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r4v37 int) = (r4v34 int), (r4v40 int) binds: [B:106:0x02e7, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r7v16 int) = (r7v14 int), (r7v19 int) binds: [B:106:0x02e7, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r12v22 int) = (r12v17 int), (r12v23 int) binds: [B:106:0x02e7, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r13v19 java.lang.String) = (r13v17 java.lang.String), (r13v26 java.lang.String) binds: [B:106:0x02e7, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r14v19 java.lang.String) = (r14v17 java.lang.String), (r14v25 java.lang.String) binds: [B:106:0x02e7, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x021d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0224  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x02e7 -> B:21:0x009b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object k(java.lang.String r20, java.lang.Integer r21, kotlin.coroutines.jvm.internal.c r22) {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.RealDebridManager.k(java.lang.String, java.lang.Integer, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
