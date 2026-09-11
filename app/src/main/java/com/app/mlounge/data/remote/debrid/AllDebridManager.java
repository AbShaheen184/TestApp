package com.app.mlounge.data.remote.debrid;

import android.support.v4.media.session.b;
import com.app.mlounge.data.local.prefs.d;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.local.prefs.z1;
import com.app.mlounge.ui.viewmodel.z0;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.k;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.a;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.internal.l;
import kotlin.y;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class AllDebridManager {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    private static final long POLL_DELAY_MS = 5000;
    private static final int POLL_MAX_ATTEMPTS = 60;
    private static final int STATUS_READY = 4;
    private static final String TAG = "AllDebridManager";
    private final AllDebridApi api;
    private final y1 prefs;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Companion {
    }

    public AllDebridManager(AllDebridApi allDebridApi, y1 y1Var) {
        allDebridApi.getClass();
        y1Var.getClass();
        this.api = allDebridApi;
        this.prefs = y1Var;
    }

    public static void a(g gVar, ArrayList arrayList) {
        Iterator it = gVar.e.iterator();
        it.getClass();
        while (it.hasNext()) {
            k kVarE = ((h) it.next()).e();
            h hVarL = kVarE.l("l");
            String strH = hVarL != null ? hVarL.h() : null;
            if (strH != null) {
                h hVarL2 = kVarE.l("s");
                arrayList.add(new kotlin.k(Long.valueOf(hVarL2 != null ? hVarL2.f() : 0L), strH));
            } else {
                g gVarN = kVarE.n("e");
                if (gVarN != null) {
                    a(gVarN, arrayList);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(c cVar) {
        AllDebridManager$getAuthHeader$1 allDebridManager$getAuthHeader$1;
        if (cVar instanceof AllDebridManager$getAuthHeader$1) {
            allDebridManager$getAuthHeader$1 = (AllDebridManager$getAuthHeader$1) cVar;
            int i = allDebridManager$getAuthHeader$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                allDebridManager$getAuthHeader$1.label = i - Integer.MIN_VALUE;
            } else {
                allDebridManager$getAuthHeader$1 = new AllDebridManager$getAuthHeader$1(this, cVar);
            }
        } else {
            allDebridManager$getAuthHeader$1 = new AllDebridManager$getAuthHeader$1(this, cVar);
        }
        Object objFirst = allDebridManager$getAuthHeader$1.result;
        int i2 = allDebridManager$getAuthHeader$1.label;
        if (i2 == 0) {
            a.e(objFirst);
            allDebridManager$getAuthHeader$1.label = 1;
            objFirst = FlowKt.first(this.prefs.j, allDebridManager$getAuthHeader$1);
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
        AllDebridManager$getPinForAuth$1 allDebridManager$getPinForAuth$1;
        k kVarO;
        h hVarL;
        String strH;
        h hVarL2;
        String strH2;
        String strH3;
        if (cVar instanceof AllDebridManager$getPinForAuth$1) {
            allDebridManager$getPinForAuth$1 = (AllDebridManager$getPinForAuth$1) cVar;
            int i = allDebridManager$getPinForAuth$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                allDebridManager$getPinForAuth$1.label = i - Integer.MIN_VALUE;
            } else {
                allDebridManager$getPinForAuth$1 = new AllDebridManager$getPinForAuth$1(this, cVar);
            }
        } else {
            allDebridManager$getPinForAuth$1 = new AllDebridManager$getPinForAuth$1(this, cVar);
        }
        Object objB = allDebridManager$getPinForAuth$1.result;
        int i2 = allDebridManager$getPinForAuth$1.label;
        try {
            if (i2 == 0) {
                a.e(objB);
                AllDebridApi allDebridApi = this.api;
                allDebridManager$getPinForAuth$1.label = 1;
                objB = allDebridApi.b(allDebridManager$getPinForAuth$1);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a.e(objB);
            }
            k kVar = (k) objB;
            h hVarL3 = kVar.l("status");
            if (l.a(hVarL3 != null ? hVarL3.h() : null, "success") && (kVarO = kVar.o("data")) != null && (hVarL = kVarO.l("pin")) != null && (strH = hVarL.h()) != null && (hVarL2 = kVarO.l("check")) != null && (strH2 = hVarL2.h()) != null) {
                h hVarL4 = kVarO.l("expires_in");
                int iC = hVarL4 != null ? hVarL4.c() : 600;
                h hVarL5 = kVarO.l("user_url");
                if (hVarL5 != null && (strH3 = hVarL5.h()) != null) {
                    return new AllDebridPinData(strH, iC, strH2, strH3);
                }
            }
            return null;
        } catch (Exception e) {
            com.app.mlounge.util.a.b(TAG, "getPinForAuth failed", e);
            return null;
        }
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
            boolean r0 = r7 instanceof com.app.mlounge.data.remote.debrid.AllDebridManager$getUserInfo$1
            if (r0 == 0) goto L13
            r0 = r7
            com.app.mlounge.data.remote.debrid.AllDebridManager$getUserInfo$1 r0 = (com.app.mlounge.data.remote.debrid.AllDebridManager$getUserInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.app.mlounge.data.remote.debrid.AllDebridManager$getUserInfo$1 r0 = new com.app.mlounge.data.remote.debrid.AllDebridManager$getUserInfo$1
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
            goto L93
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
            goto L84
        L4d:
            com.app.mlounge.data.remote.debrid.AllDebridApi r1 = r6.api     // Catch: java.lang.Exception -> L2f
            r0.L$0 = r4     // Catch: java.lang.Exception -> L2f
            r0.label = r2     // Catch: java.lang.Exception -> L2f
            java.lang.Object r7 = r1.a(r7, r0)     // Catch: java.lang.Exception -> L2f
            if (r7 != r5) goto L5a
        L59:
            return r5
        L5a:
            com.google.gson.k r7 = (com.google.gson.k) r7     // Catch: java.lang.Exception -> L2f
            java.lang.String r0 = "status"
            com.google.gson.h r0 = r7.l(r0)     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L69
            java.lang.String r0 = r0.h()     // Catch: java.lang.Exception -> L2f
            goto L6a
        L69:
            r0 = r4
        L6a:
            java.lang.String r1 = "success"
            boolean r0 = kotlin.jvm.internal.l.a(r0, r1)     // Catch: java.lang.Exception -> L2f
            if (r0 != 0) goto L73
            goto L84
        L73:
            java.lang.String r0 = "data"
            com.google.gson.k r7 = r7.o(r0)     // Catch: java.lang.Exception -> L2f
            if (r7 != 0) goto L7c
            goto L84
        L7c:
            java.lang.String r0 = "user"
            com.google.gson.k r7 = r7.o(r0)     // Catch: java.lang.Exception -> L2f
            if (r7 != 0) goto L85
        L84:
            return r4
        L85:
            com.google.gson.f r0 = new com.google.gson.f     // Catch: java.lang.Exception -> L2f
            r0.<init>()     // Catch: java.lang.Exception -> L2f
            java.lang.Class<com.app.mlounge.data.remote.debrid.AllDebridUserInfo> r1 = com.app.mlounge.data.remote.debrid.AllDebridUserInfo.class
            java.lang.Object r7 = r0.b(r7, r1)     // Catch: java.lang.Exception -> L2f
            com.app.mlounge.data.remote.debrid.AllDebridUserInfo r7 = (com.app.mlounge.data.remote.debrid.AllDebridUserInfo) r7     // Catch: java.lang.Exception -> L2f
            return r7
        L93:
            java.lang.String r0 = "AllDebridManager"
            java.lang.String r1 = "getUserInfo failed"
            com.app.mlounge.util.a.b(r0, r1, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.AllDebridManager.d(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(c cVar) {
        AllDebridManager$isLoggedIn$1 allDebridManager$isLoggedIn$1;
        if (cVar instanceof AllDebridManager$isLoggedIn$1) {
            allDebridManager$isLoggedIn$1 = (AllDebridManager$isLoggedIn$1) cVar;
            int i = allDebridManager$isLoggedIn$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                allDebridManager$isLoggedIn$1.label = i - Integer.MIN_VALUE;
            } else {
                allDebridManager$isLoggedIn$1 = new AllDebridManager$isLoggedIn$1(this, cVar);
            }
        } else {
            allDebridManager$isLoggedIn$1 = new AllDebridManager$isLoggedIn$1(this, cVar);
        }
        Object objFirst = allDebridManager$isLoggedIn$1.result;
        int i2 = allDebridManager$isLoggedIn$1.label;
        if (i2 == 0) {
            a.e(objFirst);
            Flow flow = this.prefs.j;
            allDebridManager$isLoggedIn$1.label = 1;
            objFirst = FlowKt.first(flow, allDebridManager$isLoggedIn$1);
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
        Object objS = b.s(z1.a(this.prefs.a), new d(1, null, null), z0Var);
        y yVar = y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (objS != aVar) {
            objS = yVar;
        }
        return objS == aVar ? objS : yVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0 A[Catch: Exception -> 0x010a, TryCatch #1 {Exception -> 0x010a, blocks: (B:13:0x0032, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ae, B:37:0x00b7, B:40:0x00c0, B:42:0x00c8, B:44:0x00d4, B:48:0x00dd, B:54:0x00e7), top: B:64:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae A[Catch: Exception -> 0x010a, TryCatch #1 {Exception -> 0x010a, blocks: (B:13:0x0032, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ae, B:37:0x00b7, B:40:0x00c0, B:42:0x00c8, B:44:0x00d4, B:48:0x00dd, B:54:0x00e7), top: B:64:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4 A[Catch: Exception -> 0x010a, TryCatch #1 {Exception -> 0x010a, blocks: (B:13:0x0032, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ae, B:37:0x00b7, B:40:0x00c0, B:42:0x00c8, B:44:0x00d4, B:48:0x00dd, B:54:0x00e7), top: B:64:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dd A[Catch: Exception -> 0x010a, TryCatch #1 {Exception -> 0x010a, blocks: (B:13:0x0032, B:28:0x0096, B:30:0x00a0, B:32:0x00a6, B:34:0x00ae, B:37:0x00b7, B:40:0x00c0, B:42:0x00c8, B:44:0x00d4, B:48:0x00dd, B:54:0x00e7), top: B:64:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0093 -> B:28:0x0096). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(int r13, java.lang.String r14, kotlin.coroutines.jvm.internal.c r15) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.AllDebridManager.g(int, java.lang.String, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, String str2, c cVar) {
        AllDebridManager$pollPinAuth$1 allDebridManager$pollPinAuth$1;
        k kVarO;
        h hVarL;
        h hVarL2;
        String strH;
        if (cVar instanceof AllDebridManager$pollPinAuth$1) {
            allDebridManager$pollPinAuth$1 = (AllDebridManager$pollPinAuth$1) cVar;
            int i = allDebridManager$pollPinAuth$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                allDebridManager$pollPinAuth$1.label = i - Integer.MIN_VALUE;
            } else {
                allDebridManager$pollPinAuth$1 = new AllDebridManager$pollPinAuth$1(this, cVar);
            }
        } else {
            allDebridManager$pollPinAuth$1 = new AllDebridManager$pollPinAuth$1(this, cVar);
        }
        Object objE = allDebridManager$pollPinAuth$1.result;
        int i2 = allDebridManager$pollPinAuth$1.label;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            if (i2 == 0) {
                a.e(objE);
                AllDebridApi allDebridApi = this.api;
                allDebridManager$pollPinAuth$1.L$0 = null;
                allDebridManager$pollPinAuth$1.L$1 = null;
                allDebridManager$pollPinAuth$1.label = 1;
                objE = allDebridApi.e(str2, str, allDebridManager$pollPinAuth$1);
                if (objE == aVar) {
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str3 = (String) allDebridManager$pollPinAuth$1.L$4;
                a.e(objE);
                return str3;
            }
            a.e(objE);
            k kVar = (k) objE;
            h hVarL3 = kVar.l("status");
            if (l.a(hVarL3 != null ? hVarL3.h() : null, "success") && (kVarO = kVar.o("data")) != null && (hVarL = kVarO.l("activated")) != null && hVarL.b() && (hVarL2 = kVarO.l("apikey")) != null && (strH = hVarL2.h()) != null) {
                y1 y1Var = this.prefs;
                allDebridManager$pollPinAuth$1.L$0 = null;
                allDebridManager$pollPinAuth$1.L$1 = null;
                allDebridManager$pollPinAuth$1.L$2 = null;
                allDebridManager$pollPinAuth$1.L$3 = null;
                allDebridManager$pollPinAuth$1.L$4 = strH;
                allDebridManager$pollPinAuth$1.label = 2;
                Object objS = b.s(z1.a(y1Var.a), new d(1, strH, null), allDebridManager$pollPinAuth$1);
                if (objS != aVar) {
                    objS = y.a;
                }
                return objS == aVar ? aVar : strH;
            }
            return null;
        } catch (Exception e) {
            com.app.mlounge.util.a.b(TAG, "pollPinAuth failed", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x027e A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:19:0x0083, B:124:0x0325, B:126:0x032d, B:128:0x0333, B:130:0x0339, B:132:0x0352, B:135:0x035a, B:137:0x0362, B:26:0x00b5, B:81:0x0222, B:83:0x022a, B:85:0x0230, B:87:0x0236, B:89:0x024a, B:92:0x0252, B:95:0x025a, B:97:0x0262, B:100:0x0270, B:102:0x027e, B:105:0x0296, B:107:0x02a0, B:121:0x02f6, B:108:0x02af, B:120:0x02ed, B:111:0x02bb, B:114:0x02c6, B:115:0x02d1, B:118:0x02e7, B:29:0x00e2, B:74:0x01db, B:76:0x01e3, B:78:0x01fc, B:32:0x00fd, B:47:0x0158, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:55:0x0180, B:58:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a5, B:67:0x01b1, B:71:0x01bb, B:43:0x013d), top: B:142:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0294  */
    /* JADX WARN: Code duplicated, block: B:105:0x0296 A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:19:0x0083, B:124:0x0325, B:126:0x032d, B:128:0x0333, B:130:0x0339, B:132:0x0352, B:135:0x035a, B:137:0x0362, B:26:0x00b5, B:81:0x0222, B:83:0x022a, B:85:0x0230, B:87:0x0236, B:89:0x024a, B:92:0x0252, B:95:0x025a, B:97:0x0262, B:100:0x0270, B:102:0x027e, B:105:0x0296, B:107:0x02a0, B:121:0x02f6, B:108:0x02af, B:120:0x02ed, B:111:0x02bb, B:114:0x02c6, B:115:0x02d1, B:118:0x02e7, B:29:0x00e2, B:74:0x01db, B:76:0x01e3, B:78:0x01fc, B:32:0x00fd, B:47:0x0158, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:55:0x0180, B:58:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a5, B:67:0x01b1, B:71:0x01bb, B:43:0x013d), top: B:142:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02af A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:19:0x0083, B:124:0x0325, B:126:0x032d, B:128:0x0333, B:130:0x0339, B:132:0x0352, B:135:0x035a, B:137:0x0362, B:26:0x00b5, B:81:0x0222, B:83:0x022a, B:85:0x0230, B:87:0x0236, B:89:0x024a, B:92:0x0252, B:95:0x025a, B:97:0x0262, B:100:0x0270, B:102:0x027e, B:105:0x0296, B:107:0x02a0, B:121:0x02f6, B:108:0x02af, B:120:0x02ed, B:111:0x02bb, B:114:0x02c6, B:115:0x02d1, B:118:0x02e7, B:29:0x00e2, B:74:0x01db, B:76:0x01e3, B:78:0x01fc, B:32:0x00fd, B:47:0x0158, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:55:0x0180, B:58:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a5, B:67:0x01b1, B:71:0x01bb, B:43:0x013d), top: B:142:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:111:0x02bb A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:19:0x0083, B:124:0x0325, B:126:0x032d, B:128:0x0333, B:130:0x0339, B:132:0x0352, B:135:0x035a, B:137:0x0362, B:26:0x00b5, B:81:0x0222, B:83:0x022a, B:85:0x0230, B:87:0x0236, B:89:0x024a, B:92:0x0252, B:95:0x025a, B:97:0x0262, B:100:0x0270, B:102:0x027e, B:105:0x0296, B:107:0x02a0, B:121:0x02f6, B:108:0x02af, B:120:0x02ed, B:111:0x02bb, B:114:0x02c6, B:115:0x02d1, B:118:0x02e7, B:29:0x00e2, B:74:0x01db, B:76:0x01e3, B:78:0x01fc, B:32:0x00fd, B:47:0x0158, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:55:0x0180, B:58:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a5, B:67:0x01b1, B:71:0x01bb, B:43:0x013d), top: B:142:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c6 A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:19:0x0083, B:124:0x0325, B:126:0x032d, B:128:0x0333, B:130:0x0339, B:132:0x0352, B:135:0x035a, B:137:0x0362, B:26:0x00b5, B:81:0x0222, B:83:0x022a, B:85:0x0230, B:87:0x0236, B:89:0x024a, B:92:0x0252, B:95:0x025a, B:97:0x0262, B:100:0x0270, B:102:0x027e, B:105:0x0296, B:107:0x02a0, B:121:0x02f6, B:108:0x02af, B:120:0x02ed, B:111:0x02bb, B:114:0x02c6, B:115:0x02d1, B:118:0x02e7, B:29:0x00e2, B:74:0x01db, B:76:0x01e3, B:78:0x01fc, B:32:0x00fd, B:47:0x0158, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:55:0x0180, B:58:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a5, B:67:0x01b1, B:71:0x01bb, B:43:0x013d), top: B:142:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:49:0x0160 A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:19:0x0083, B:124:0x0325, B:126:0x032d, B:128:0x0333, B:130:0x0339, B:132:0x0352, B:135:0x035a, B:137:0x0362, B:26:0x00b5, B:81:0x0222, B:83:0x022a, B:85:0x0230, B:87:0x0236, B:89:0x024a, B:92:0x0252, B:95:0x025a, B:97:0x0262, B:100:0x0270, B:102:0x027e, B:105:0x0296, B:107:0x02a0, B:121:0x02f6, B:108:0x02af, B:120:0x02ed, B:111:0x02bb, B:114:0x02c6, B:115:0x02d1, B:118:0x02e7, B:29:0x00e2, B:74:0x01db, B:76:0x01e3, B:78:0x01fc, B:32:0x00fd, B:47:0x0158, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:55:0x0180, B:58:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a5, B:67:0x01b1, B:71:0x01bb, B:43:0x013d), top: B:142:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0165  */
    /* JADX WARN: Code duplicated, block: B:53:0x016c A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:19:0x0083, B:124:0x0325, B:126:0x032d, B:128:0x0333, B:130:0x0339, B:132:0x0352, B:135:0x035a, B:137:0x0362, B:26:0x00b5, B:81:0x0222, B:83:0x022a, B:85:0x0230, B:87:0x0236, B:89:0x024a, B:92:0x0252, B:95:0x025a, B:97:0x0262, B:100:0x0270, B:102:0x027e, B:105:0x0296, B:107:0x02a0, B:121:0x02f6, B:108:0x02af, B:120:0x02ed, B:111:0x02bb, B:114:0x02c6, B:115:0x02d1, B:118:0x02e7, B:29:0x00e2, B:74:0x01db, B:76:0x01e3, B:78:0x01fc, B:32:0x00fd, B:47:0x0158, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:55:0x0180, B:58:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a5, B:67:0x01b1, B:71:0x01bb, B:43:0x013d), top: B:142:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0180 A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:19:0x0083, B:124:0x0325, B:126:0x032d, B:128:0x0333, B:130:0x0339, B:132:0x0352, B:135:0x035a, B:137:0x0362, B:26:0x00b5, B:81:0x0222, B:83:0x022a, B:85:0x0230, B:87:0x0236, B:89:0x024a, B:92:0x0252, B:95:0x025a, B:97:0x0262, B:100:0x0270, B:102:0x027e, B:105:0x0296, B:107:0x02a0, B:121:0x02f6, B:108:0x02af, B:120:0x02ed, B:111:0x02bb, B:114:0x02c6, B:115:0x02d1, B:118:0x02e7, B:29:0x00e2, B:74:0x01db, B:76:0x01e3, B:78:0x01fc, B:32:0x00fd, B:47:0x0158, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:55:0x0180, B:58:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a5, B:67:0x01b1, B:71:0x01bb, B:43:0x013d), top: B:142:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01b1 A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:19:0x0083, B:124:0x0325, B:126:0x032d, B:128:0x0333, B:130:0x0339, B:132:0x0352, B:135:0x035a, B:137:0x0362, B:26:0x00b5, B:81:0x0222, B:83:0x022a, B:85:0x0230, B:87:0x0236, B:89:0x024a, B:92:0x0252, B:95:0x025a, B:97:0x0262, B:100:0x0270, B:102:0x027e, B:105:0x0296, B:107:0x02a0, B:121:0x02f6, B:108:0x02af, B:120:0x02ed, B:111:0x02bb, B:114:0x02c6, B:115:0x02d1, B:118:0x02e7, B:29:0x00e2, B:74:0x01db, B:76:0x01e3, B:78:0x01fc, B:32:0x00fd, B:47:0x0158, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:55:0x0180, B:58:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a5, B:67:0x01b1, B:71:0x01bb, B:43:0x013d), top: B:142:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bb A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:19:0x0083, B:124:0x0325, B:126:0x032d, B:128:0x0333, B:130:0x0339, B:132:0x0352, B:135:0x035a, B:137:0x0362, B:26:0x00b5, B:81:0x0222, B:83:0x022a, B:85:0x0230, B:87:0x0236, B:89:0x024a, B:92:0x0252, B:95:0x025a, B:97:0x0262, B:100:0x0270, B:102:0x027e, B:105:0x0296, B:107:0x02a0, B:121:0x02f6, B:108:0x02af, B:120:0x02ed, B:111:0x02bb, B:114:0x02c6, B:115:0x02d1, B:118:0x02e7, B:29:0x00e2, B:74:0x01db, B:76:0x01e3, B:78:0x01fc, B:32:0x00fd, B:47:0x0158, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:55:0x0180, B:58:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a5, B:67:0x01b1, B:71:0x01bb, B:43:0x013d), top: B:142:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:74:0x01db A[Catch: Exception -> 0x0088, PHI: r0 r5 r7 r12 r13 r20
  0x01db: PHI (r0v23 java.lang.Object) = (r0v18 java.lang.Object), (r0v69 java.lang.Object) binds: [B:72:0x01d7, B:30:0x00e5] A[DONT_GENERATE, DONT_INLINE]
  0x01db: PHI (r5v4 ??) = (r5v9 ??), (r5v10 ??) binds: [B:72:0x01d7, B:30:0x00e5] A[DONT_GENERATE, DONT_INLINE]
  0x01db: PHI (r7v7 int) = (r7v4 int), (r7v14 int) binds: [B:72:0x01d7, B:30:0x00e5] A[DONT_GENERATE, DONT_INLINE]
  0x01db: PHI (r12v7 java.lang.String) = (r12v4 java.lang.String), (r12v28 java.lang.String) binds: [B:72:0x01d7, B:30:0x00e5] A[DONT_GENERATE, DONT_INLINE]
  0x01db: PHI (r13v6 java.lang.Integer) = (r13v4 java.lang.Integer), (r13v10 java.lang.Integer) binds: [B:72:0x01d7, B:30:0x00e5] A[DONT_GENERATE, DONT_INLINE]
  0x01db: PHI (r20v3 java.lang.String) = (r2v0 java.lang.String), (r20v6 java.lang.String) binds: [B:72:0x01d7, B:30:0x00e5] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0088, blocks: (B:19:0x0083, B:124:0x0325, B:126:0x032d, B:128:0x0333, B:130:0x0339, B:132:0x0352, B:135:0x035a, B:137:0x0362, B:26:0x00b5, B:81:0x0222, B:83:0x022a, B:85:0x0230, B:87:0x0236, B:89:0x024a, B:92:0x0252, B:95:0x025a, B:97:0x0262, B:100:0x0270, B:102:0x027e, B:105:0x0296, B:107:0x02a0, B:121:0x02f6, B:108:0x02af, B:120:0x02ed, B:111:0x02bb, B:114:0x02c6, B:115:0x02d1, B:118:0x02e7, B:29:0x00e2, B:74:0x01db, B:76:0x01e3, B:78:0x01fc, B:32:0x00fd, B:47:0x0158, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:55:0x0180, B:58:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a5, B:67:0x01b1, B:71:0x01bb, B:43:0x013d), top: B:142:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e3 A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:19:0x0083, B:124:0x0325, B:126:0x032d, B:128:0x0333, B:130:0x0339, B:132:0x0352, B:135:0x035a, B:137:0x0362, B:26:0x00b5, B:81:0x0222, B:83:0x022a, B:85:0x0230, B:87:0x0236, B:89:0x024a, B:92:0x0252, B:95:0x025a, B:97:0x0262, B:100:0x0270, B:102:0x027e, B:105:0x0296, B:107:0x02a0, B:121:0x02f6, B:108:0x02af, B:120:0x02ed, B:111:0x02bb, B:114:0x02c6, B:115:0x02d1, B:118:0x02e7, B:29:0x00e2, B:74:0x01db, B:76:0x01e3, B:78:0x01fc, B:32:0x00fd, B:47:0x0158, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:55:0x0180, B:58:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a5, B:67:0x01b1, B:71:0x01bb, B:43:0x013d), top: B:142:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01fc A[Catch: Exception -> 0x0088, PHI: r5 r7 r12 r13 r20
  0x01fc: PHI (r5v2 ??) = (r5v11 ??), (r5v12 ??) binds: [B:70:0x01b9, B:75:0x01e1] A[DONT_GENERATE, DONT_INLINE]
  0x01fc: PHI (r7v5 int) = (r7v4 int), (r7v7 int) binds: [B:70:0x01b9, B:75:0x01e1] A[DONT_GENERATE, DONT_INLINE]
  0x01fc: PHI (r12v5 java.lang.String) = (r12v4 java.lang.String), (r12v7 java.lang.String) binds: [B:70:0x01b9, B:75:0x01e1] A[DONT_GENERATE, DONT_INLINE]
  0x01fc: PHI (r13v5 java.lang.Integer) = (r13v4 java.lang.Integer), (r13v6 java.lang.Integer) binds: [B:70:0x01b9, B:75:0x01e1] A[DONT_GENERATE, DONT_INLINE]
  0x01fc: PHI (r20v2 java.lang.String) = (r2v0 java.lang.String), (r20v3 java.lang.String) binds: [B:70:0x01b9, B:75:0x01e1] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0088, blocks: (B:19:0x0083, B:124:0x0325, B:126:0x032d, B:128:0x0333, B:130:0x0339, B:132:0x0352, B:135:0x035a, B:137:0x0362, B:26:0x00b5, B:81:0x0222, B:83:0x022a, B:85:0x0230, B:87:0x0236, B:89:0x024a, B:92:0x0252, B:95:0x025a, B:97:0x0262, B:100:0x0270, B:102:0x027e, B:105:0x0296, B:107:0x02a0, B:121:0x02f6, B:108:0x02af, B:120:0x02ed, B:111:0x02bb, B:114:0x02c6, B:115:0x02d1, B:118:0x02e7, B:29:0x00e2, B:74:0x01db, B:76:0x01e3, B:78:0x01fc, B:32:0x00fd, B:47:0x0158, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:55:0x0180, B:58:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a5, B:67:0x01b1, B:71:0x01bb, B:43:0x013d), top: B:142:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0220  */
    /* JADX WARN: Code duplicated, block: B:81:0x0222 A[Catch: Exception -> 0x0088, PHI: r0 r4 r5 r7 r12 r20
  0x0222: PHI (r0v29 java.lang.Object) = (r0v22 java.lang.Object), (r0v1 java.lang.Object) binds: [B:79:0x021e, B:27:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x0222: PHI (r4v2 ??) = (r4v4 ??), (r4v5 ??) binds: [B:79:0x021e, B:27:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x0222: PHI (r5v5 int) = (r5v3 int), (r5v8 int) binds: [B:79:0x021e, B:27:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x0222: PHI (r7v8 java.lang.String) = (r7v6 java.lang.String), (r7v26 java.lang.String) binds: [B:79:0x021e, B:27:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x0222: PHI (r12v8 java.lang.Integer) = (r12v6 java.lang.Integer), (r12v30 java.lang.Integer) binds: [B:79:0x021e, B:27:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x0222: PHI (r20v4 java.lang.String) = (r20v2 java.lang.String), (r20v7 java.lang.String) binds: [B:79:0x021e, B:27:0x00b8] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0088, blocks: (B:19:0x0083, B:124:0x0325, B:126:0x032d, B:128:0x0333, B:130:0x0339, B:132:0x0352, B:135:0x035a, B:137:0x0362, B:26:0x00b5, B:81:0x0222, B:83:0x022a, B:85:0x0230, B:87:0x0236, B:89:0x024a, B:92:0x0252, B:95:0x025a, B:97:0x0262, B:100:0x0270, B:102:0x027e, B:105:0x0296, B:107:0x02a0, B:121:0x02f6, B:108:0x02af, B:120:0x02ed, B:111:0x02bb, B:114:0x02c6, B:115:0x02d1, B:118:0x02e7, B:29:0x00e2, B:74:0x01db, B:76:0x01e3, B:78:0x01fc, B:32:0x00fd, B:47:0x0158, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:55:0x0180, B:58:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a5, B:67:0x01b1, B:71:0x01bb, B:43:0x013d), top: B:142:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x022a A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:19:0x0083, B:124:0x0325, B:126:0x032d, B:128:0x0333, B:130:0x0339, B:132:0x0352, B:135:0x035a, B:137:0x0362, B:26:0x00b5, B:81:0x0222, B:83:0x022a, B:85:0x0230, B:87:0x0236, B:89:0x024a, B:92:0x0252, B:95:0x025a, B:97:0x0262, B:100:0x0270, B:102:0x027e, B:105:0x0296, B:107:0x02a0, B:121:0x02f6, B:108:0x02af, B:120:0x02ed, B:111:0x02bb, B:114:0x02c6, B:115:0x02d1, B:118:0x02e7, B:29:0x00e2, B:74:0x01db, B:76:0x01e3, B:78:0x01fc, B:32:0x00fd, B:47:0x0158, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:55:0x0180, B:58:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a5, B:67:0x01b1, B:71:0x01bb, B:43:0x013d), top: B:142:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x022f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0236 A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:19:0x0083, B:124:0x0325, B:126:0x032d, B:128:0x0333, B:130:0x0339, B:132:0x0352, B:135:0x035a, B:137:0x0362, B:26:0x00b5, B:81:0x0222, B:83:0x022a, B:85:0x0230, B:87:0x0236, B:89:0x024a, B:92:0x0252, B:95:0x025a, B:97:0x0262, B:100:0x0270, B:102:0x027e, B:105:0x0296, B:107:0x02a0, B:121:0x02f6, B:108:0x02af, B:120:0x02ed, B:111:0x02bb, B:114:0x02c6, B:115:0x02d1, B:118:0x02e7, B:29:0x00e2, B:74:0x01db, B:76:0x01e3, B:78:0x01fc, B:32:0x00fd, B:47:0x0158, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:55:0x0180, B:58:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a5, B:67:0x01b1, B:71:0x01bb, B:43:0x013d), top: B:142:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x024a A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:19:0x0083, B:124:0x0325, B:126:0x032d, B:128:0x0333, B:130:0x0339, B:132:0x0352, B:135:0x035a, B:137:0x0362, B:26:0x00b5, B:81:0x0222, B:83:0x022a, B:85:0x0230, B:87:0x0236, B:89:0x024a, B:92:0x0252, B:95:0x025a, B:97:0x0262, B:100:0x0270, B:102:0x027e, B:105:0x0296, B:107:0x02a0, B:121:0x02f6, B:108:0x02af, B:120:0x02ed, B:111:0x02bb, B:114:0x02c6, B:115:0x02d1, B:118:0x02e7, B:29:0x00e2, B:74:0x01db, B:76:0x01e3, B:78:0x01fc, B:32:0x00fd, B:47:0x0158, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:55:0x0180, B:58:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a5, B:67:0x01b1, B:71:0x01bb, B:43:0x013d), top: B:142:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0250 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:92:0x0252 A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:19:0x0083, B:124:0x0325, B:126:0x032d, B:128:0x0333, B:130:0x0339, B:132:0x0352, B:135:0x035a, B:137:0x0362, B:26:0x00b5, B:81:0x0222, B:83:0x022a, B:85:0x0230, B:87:0x0236, B:89:0x024a, B:92:0x0252, B:95:0x025a, B:97:0x0262, B:100:0x0270, B:102:0x027e, B:105:0x0296, B:107:0x02a0, B:121:0x02f6, B:108:0x02af, B:120:0x02ed, B:111:0x02bb, B:114:0x02c6, B:115:0x02d1, B:118:0x02e7, B:29:0x00e2, B:74:0x01db, B:76:0x01e3, B:78:0x01fc, B:32:0x00fd, B:47:0x0158, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:55:0x0180, B:58:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a5, B:67:0x01b1, B:71:0x01bb, B:43:0x013d), top: B:142:0x0038 }] */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0322, code lost:
    
        if (r0 == r11) goto L123;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x027e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x016c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x01e3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x0236, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.app.mlounge.data.remote.debrid.AllDebridManager] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.String r22, java.lang.Integer r23, kotlin.coroutines.jvm.internal.c r24) {
        /*
            Method dump skipped, instruction units count: 880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.AllDebridManager.i(java.lang.String, java.lang.Integer, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
