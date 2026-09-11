package com.app.mlounge.data.remote.debrid;

import android.support.v4.media.session.b;
import com.app.mlounge.data.local.prefs.d;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.local.prefs.z1;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.a;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.internal.l;
import kotlin.y;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TorBoxManager {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    private static final String TAG = "TorBoxManager";
    private final TorBoxApi api;
    private final y1 prefs;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Companion {
    }

    public TorBoxManager(TorBoxApi torBoxApi, y1 y1Var) {
        torBoxApi.getClass();
        y1Var.getClass();
        this.api = torBoxApi;
        this.prefs = y1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, c cVar) {
        TorBoxManager$findExistingTorrent$1 torBoxManager$findExistingTorrent$1;
        Object next;
        String lowerCase;
        if (cVar instanceof TorBoxManager$findExistingTorrent$1) {
            torBoxManager$findExistingTorrent$1 = (TorBoxManager$findExistingTorrent$1) cVar;
            int i = torBoxManager$findExistingTorrent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                torBoxManager$findExistingTorrent$1.label = i - Integer.MIN_VALUE;
            } else {
                torBoxManager$findExistingTorrent$1 = new TorBoxManager$findExistingTorrent$1(this, cVar);
            }
        } else {
            torBoxManager$findExistingTorrent$1 = new TorBoxManager$findExistingTorrent$1(this, cVar);
        }
        Object objB = torBoxManager$findExistingTorrent$1.result;
        int i2 = torBoxManager$findExistingTorrent$1.label;
        try {
            if (i2 == 0) {
                a.e(objB);
                TorBoxApi torBoxApi = this.api;
                torBoxManager$findExistingTorrent$1.L$0 = null;
                torBoxManager$findExistingTorrent$1.L$1 = str2;
                torBoxManager$findExistingTorrent$1.label = 1;
                objB = torBoxApi.b(str, true, torBoxManager$findExistingTorrent$1);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = (String) torBoxManager$findExistingTorrent$1.L$1;
                a.e(objB);
            }
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            List listA = ((TorBoxTorrentListResponse) objB).a();
            if (listA != null) {
                Iterator it = listA.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    String strB = ((TorBoxTorrentListResponse.TorrentItem) next).b();
                    if (strB != null) {
                        lowerCase = strB.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    } else {
                        lowerCase = null;
                    }
                } while (!l.a(lowerCase, lowerCase2));
                TorBoxTorrentListResponse.TorrentItem torrentItem = (TorBoxTorrentListResponse.TorrentItem) next;
                if (torrentItem != null) {
                    return new Integer(torrentItem.c());
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(c cVar) {
        TorBoxManager$getAuthHeader$1 torBoxManager$getAuthHeader$1;
        if (cVar instanceof TorBoxManager$getAuthHeader$1) {
            torBoxManager$getAuthHeader$1 = (TorBoxManager$getAuthHeader$1) cVar;
            int i = torBoxManager$getAuthHeader$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                torBoxManager$getAuthHeader$1.label = i - Integer.MIN_VALUE;
            } else {
                torBoxManager$getAuthHeader$1 = new TorBoxManager$getAuthHeader$1(this, cVar);
            }
        } else {
            torBoxManager$getAuthHeader$1 = new TorBoxManager$getAuthHeader$1(this, cVar);
        }
        Object objFirst = torBoxManager$getAuthHeader$1.result;
        int i2 = torBoxManager$getAuthHeader$1.label;
        if (i2 == 0) {
            a.e(objFirst);
            torBoxManager$getAuthHeader$1.label = 1;
            objFirst = FlowKt.first(this.prefs.i, torBoxManager$getAuthHeader$1);
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

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
    
        if (r14 == r8) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r10, java.lang.String r11, int r12, java.lang.Integer r13, kotlin.coroutines.jvm.internal.c r14) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.TorBoxManager.c(java.lang.String, java.lang.String, int, java.lang.Integer, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        if (r7 == r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.app.mlounge.data.remote.debrid.TorBoxManager$getUserInfo$1
            if (r0 == 0) goto L13
            r0 = r7
            com.app.mlounge.data.remote.debrid.TorBoxManager$getUserInfo$1 r0 = (com.app.mlounge.data.remote.debrid.TorBoxManager$getUserInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.app.mlounge.data.remote.debrid.TorBoxManager$getUserInfo$1 r0 = new com.app.mlounge.data.remote.debrid.TorBoxManager$getUserInfo$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            kotlin.coroutines.intrinsics.a r5 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L38
            if (r1 != r2) goto L31
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.a.e(r7)     // Catch: java.lang.Exception -> L2f
            goto L5a
        L2f:
            r7 = move-exception
            goto L6a
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            return r7
        L38:
            kotlin.a.e(r7)
            goto L48
        L3c:
            kotlin.a.e(r7)
            r0.label = r3
            java.lang.Object r7 = r6.b(r0)
            if (r7 != r5) goto L48
            goto L59
        L48:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L4d
            goto L69
        L4d:
            com.app.mlounge.data.remote.debrid.TorBoxApi r1 = r6.api     // Catch: java.lang.Exception -> L2f
            r0.L$0 = r4     // Catch: java.lang.Exception -> L2f
            r0.label = r2     // Catch: java.lang.Exception -> L2f
            java.lang.Object r7 = r1.a(r7, r0)     // Catch: java.lang.Exception -> L2f
            if (r7 != r5) goto L5a
        L59:
            return r5
        L5a:
            com.app.mlounge.data.remote.debrid.TorBoxUserInfo r7 = (com.app.mlounge.data.remote.debrid.TorBoxUserInfo) r7     // Catch: java.lang.Exception -> L2f
            boolean r0 = r7.b()     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L69
            com.app.mlounge.data.remote.debrid.TorBoxUserInfo$UserData r0 = r7.a()     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L69
            return r7
        L69:
            return r4
        L6a:
            java.lang.String r0 = "TorBoxManager"
            java.lang.String r1 = "Get user info failed"
            com.app.mlounge.util.a.b(r0, r1, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.TorBoxManager.d(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(c cVar) {
        TorBoxManager$isLoggedIn$1 torBoxManager$isLoggedIn$1;
        if (cVar instanceof TorBoxManager$isLoggedIn$1) {
            torBoxManager$isLoggedIn$1 = (TorBoxManager$isLoggedIn$1) cVar;
            int i = torBoxManager$isLoggedIn$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                torBoxManager$isLoggedIn$1.label = i - Integer.MIN_VALUE;
            } else {
                torBoxManager$isLoggedIn$1 = new TorBoxManager$isLoggedIn$1(this, cVar);
            }
        } else {
            torBoxManager$isLoggedIn$1 = new TorBoxManager$isLoggedIn$1(this, cVar);
        }
        Object objFirst = torBoxManager$isLoggedIn$1.result;
        int i2 = torBoxManager$isLoggedIn$1.label;
        if (i2 == 0) {
            a.e(objFirst);
            Flow flow = this.prefs.i;
            torBoxManager$isLoggedIn$1.label = 1;
            objFirst = FlowKt.first(flow, torBoxManager$isLoggedIn$1);
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

    public final Object f(c cVar) {
        Object objS = b.s(z1.a(this.prefs.a), new d(19, null, null), cVar);
        y yVar = y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (objS != aVar) {
            objS = yVar;
        }
        return objS == aVar ? objS : yVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x0072 A[Catch: Exception -> 0x0033, TRY_LEAVE, TryCatch #0 {Exception -> 0x0033, blocks: (B:12:0x002f, B:19:0x0040, B:32:0x0068, B:35:0x0072, B:29:0x005b), top: B:41:0x001f }] */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        if (f(r0) == r7) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(kotlin.coroutines.d r9) {
        /*
            r8 = this;
            r0 = r9
            com.app.mlounge.data.remote.debrid.TorBoxManager$refreshSession$1 r0 = (com.app.mlounge.data.remote.debrid.TorBoxManager$refreshSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto Lf
            int r1 = r1 - r2
            r0.label = r1
            goto L14
        Lf:
            com.app.mlounge.data.remote.debrid.TorBoxManager$refreshSession$1 r0 = new com.app.mlounge.data.remote.debrid.TorBoxManager$refreshSession$1
            r0.<init>(r8, r9)
        L14:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            kotlin.coroutines.intrinsics.a r7 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L48
            if (r1 == r6) goto L44
            if (r1 == r4) goto L3c
            if (r1 != r3) goto L35
            java.lang.Object r1 = r0.L$1
            com.app.mlounge.data.remote.debrid.TorBoxUserInfo r1 = (com.app.mlounge.data.remote.debrid.TorBoxUserInfo) r1
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.a.e(r9)     // Catch: java.lang.Exception -> L33
            goto L86
        L33:
            r9 = move-exception
            goto L7f
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r9)
            r9 = 0
            return r9
        L3c:
            java.lang.Object r1 = r0.L$0
            java.lang.String r1 = (java.lang.String) r1
            kotlin.a.e(r9)     // Catch: java.lang.Exception -> L33
            goto L68
        L44:
            kotlin.a.e(r9)
            goto L54
        L48:
            kotlin.a.e(r9)
            r0.label = r6
            java.lang.Object r9 = r8.b(r0)
            if (r9 != r7) goto L54
            goto L7e
        L54:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L5b
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L5b:
            com.app.mlounge.data.remote.debrid.TorBoxApi r1 = r8.api     // Catch: java.lang.Exception -> L33
            r0.L$0 = r5     // Catch: java.lang.Exception -> L33
            r0.label = r4     // Catch: java.lang.Exception -> L33
            java.lang.Object r9 = r1.a(r9, r0)     // Catch: java.lang.Exception -> L33
            if (r9 != r7) goto L68
            goto L7e
        L68:
            com.app.mlounge.data.remote.debrid.TorBoxUserInfo r9 = (com.app.mlounge.data.remote.debrid.TorBoxUserInfo) r9     // Catch: java.lang.Exception -> L33
            boolean r9 = r9.b()     // Catch: java.lang.Exception -> L33
            if (r9 == 0) goto L72
            r2 = r6
            goto L86
        L72:
            r0.L$0 = r5     // Catch: java.lang.Exception -> L33
            r0.L$1 = r5     // Catch: java.lang.Exception -> L33
            r0.label = r3     // Catch: java.lang.Exception -> L33
            java.lang.Object r9 = r8.f(r0)     // Catch: java.lang.Exception -> L33
            if (r9 != r7) goto L86
        L7e:
            return r7
        L7f:
            java.lang.String r0 = "TorBoxManager"
            java.lang.String r1 = "Session refresh failed (transient)"
            com.app.mlounge.util.a.b(r0, r1, r9)
        L86:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.TorBoxManager.g(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:42:0x0103  */
    /* JADX WARN: Code duplicated, block: B:45:0x0132 A[Catch: Exception -> 0x004c, TRY_LEAVE, TryCatch #2 {Exception -> 0x004c, blocks: (B:14:0x0047, B:69:0x01dd, B:19:0x006c, B:64:0x01b8, B:66:0x01be, B:61:0x01a0, B:43:0x0109, B:45:0x0132, B:71:0x01e2, B:72:0x01e9), top: B:76:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x015c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0169 A[Catch: Exception -> 0x01a0, TryCatch #0 {Exception -> 0x01a0, blocks: (B:22:0x008d, B:58:0x0195, B:25:0x00aa, B:50:0x0161, B:52:0x0169, B:54:0x016f, B:55:0x017d), top: B:76:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0194  */
    /* JADX WARN: Code duplicated, block: B:58:0x0195 A[Catch: Exception -> 0x01a0, PHI: r0 r11 r12 r13
  0x0195: PHI (r0v28 ??) = (r0v40 ??), (r0v41 ??) binds: [B:56:0x0192, B:22:0x008d] A[DONT_GENERATE, DONT_INLINE]
  0x0195: PHI (r11v25 java.lang.String) = (r11v18 java.lang.String), (r11v33 java.lang.String) binds: [B:56:0x0192, B:22:0x008d] A[DONT_GENERATE, DONT_INLINE]
  0x0195: PHI (r12v17 java.lang.String) = (r12v27 java.lang.String), (r12v28 java.lang.String) binds: [B:56:0x0192, B:22:0x008d] A[DONT_GENERATE, DONT_INLINE]
  0x0195: PHI (r13v23 java.lang.Object) = (r13v20 java.lang.Object), (r13v1 java.lang.Object) binds: [B:56:0x0192, B:22:0x008d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x01a0, blocks: (B:22:0x008d, B:58:0x0195, B:25:0x00aa, B:50:0x0161, B:52:0x0169, B:54:0x016f, B:55:0x017d), top: B:76:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01be A[Catch: Exception -> 0x004c, TryCatch #2 {Exception -> 0x004c, blocks: (B:14:0x0047, B:69:0x01dd, B:19:0x006c, B:64:0x01b8, B:66:0x01be, B:61:0x01a0, B:43:0x0109, B:45:0x0132, B:71:0x01e2, B:72:0x01e9), top: B:76:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01e2 A[Catch: Exception -> 0x004c, TryCatch #2 {Exception -> 0x004c, blocks: (B:14:0x0047, B:69:0x01dd, B:19:0x006c, B:64:0x01b8, B:66:0x01be, B:61:0x01a0, B:43:0x0109, B:45:0x0132, B:71:0x01e2, B:72:0x01e9), top: B:76:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01da, code lost:
    
        if (r13 == r8) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.app.mlounge.data.remote.debrid.TorBoxManager] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.lang.String r11, java.lang.Integer r12, kotlin.coroutines.jvm.internal.c r13) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.TorBoxManager.h(java.lang.String, java.lang.Integer, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object i(String str, c cVar) {
        TorBoxManager$validateApiKey$1 torBoxManager$validateApiKey$1;
        if (cVar instanceof TorBoxManager$validateApiKey$1) {
            torBoxManager$validateApiKey$1 = (TorBoxManager$validateApiKey$1) cVar;
            int i = torBoxManager$validateApiKey$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                torBoxManager$validateApiKey$1.label = i - Integer.MIN_VALUE;
            } else {
                torBoxManager$validateApiKey$1 = new TorBoxManager$validateApiKey$1(this, cVar);
            }
        } else {
            torBoxManager$validateApiKey$1 = new TorBoxManager$validateApiKey$1(this, cVar);
        }
        Object objA = torBoxManager$validateApiKey$1.result;
        int i2 = torBoxManager$validateApiKey$1.label;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            if (i2 == 0) {
                a.e(objA);
                torBoxManager$validateApiKey$1.L$0 = str;
                torBoxManager$validateApiKey$1.label = 1;
                objA = this.api.a("Bearer " + str, torBoxManager$validateApiKey$1);
                if (objA == aVar) {
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                TorBoxUserInfo torBoxUserInfo = (TorBoxUserInfo) torBoxManager$validateApiKey$1.L$1;
                a.e(objA);
                return torBoxUserInfo;
            }
            str = (String) torBoxManager$validateApiKey$1.L$0;
            a.e(objA);
            TorBoxUserInfo torBoxUserInfo2 = (TorBoxUserInfo) objA;
            if (!torBoxUserInfo2.b() || torBoxUserInfo2.a() == null) {
                return null;
            }
            y1 y1Var = this.prefs;
            torBoxManager$validateApiKey$1.L$0 = null;
            torBoxManager$validateApiKey$1.L$1 = torBoxUserInfo2;
            torBoxManager$validateApiKey$1.label = 2;
            Object objS = b.s(z1.a(y1Var.a), new d(19, str, null), torBoxManager$validateApiKey$1);
            if (objS != aVar) {
                objS = y.a;
            }
            return objS == aVar ? aVar : torBoxUserInfo2;
        } catch (Exception e) {
            com.app.mlounge.util.a.b(TAG, "API key validation failed", e);
            return null;
        }
    }
}
