package com.app.mlounge.data.remote.debrid;

import android.support.v4.media.session.b;
import com.app.mlounge.data.local.prefs.d;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.local.prefs.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.a;
import kotlin.coroutines.jvm.internal.c;
import kotlin.y;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class PremiumizeManager {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    private static final String TAG = "PremiumizeManager";
    private final PremiumizeApi api;
    private final y1 prefs;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Companion {
    }

    public PremiumizeManager(PremiumizeApi premiumizeApi, y1 y1Var) {
        premiumizeApi.getClass();
        y1Var.getClass();
        this.api = premiumizeApi;
        this.prefs = y1Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0219  */
    /* JADX WARN: Code duplicated, block: B:107:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f9 A[Catch: Exception -> 0x01e6, TryCatch #2 {Exception -> 0x01e6, blocks: (B:33:0x00f1, B:35:0x00f9, B:36:0x00fd, B:38:0x0103, B:43:0x0119, B:46:0x011f, B:48:0x0125, B:19:0x0078, B:22:0x00a1, B:25:0x00ba), top: B:110:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0103 A[Catch: Exception -> 0x01e6, TryCatch #2 {Exception -> 0x01e6, blocks: (B:33:0x00f1, B:35:0x00f9, B:36:0x00fd, B:38:0x0103, B:43:0x0119, B:46:0x011f, B:48:0x0125, B:19:0x0078, B:22:0x00a1, B:25:0x00ba), top: B:110:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x011c  */
    /* JADX WARN: Code duplicated, block: B:46:0x011f A[Catch: Exception -> 0x01e6, TryCatch #2 {Exception -> 0x01e6, blocks: (B:33:0x00f1, B:35:0x00f9, B:36:0x00fd, B:38:0x0103, B:43:0x0119, B:46:0x011f, B:48:0x0125, B:19:0x0078, B:22:0x00a1, B:25:0x00ba), top: B:110:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:46:0x011f, B:96:0x01e6], limit reached: 114 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.app.mlounge.data.remote.debrid.PremiumizeManager] */
    /* JADX WARN: Type inference failed for: r1v15, types: [com.app.mlounge.data.remote.debrid.PremiumizeApi] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.app.mlounge.data.remote.debrid.PremiumizeApi] */
    /* JADX WARN: Type inference failed for: r6v8 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x0219 -> B:15:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.lang.String r19, java.lang.String r20, java.lang.Integer r21, kotlin.coroutines.jvm.internal.c r22) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.PremiumizeManager.a(java.lang.String, java.lang.String, java.lang.Integer, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r7 == r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.app.mlounge.data.remote.debrid.PremiumizeManager$getUserInfo$1
            if (r0 == 0) goto L13
            r0 = r7
            com.app.mlounge.data.remote.debrid.PremiumizeManager$getUserInfo$1 r0 = (com.app.mlounge.data.remote.debrid.PremiumizeManager$getUserInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.app.mlounge.data.remote.debrid.PremiumizeManager$getUserInfo$1 r0 = new com.app.mlounge.data.remote.debrid.PremiumizeManager$getUserInfo$1
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
            goto L5e
        L2f:
            r7 = move-exception
            goto L68
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            return r7
        L38:
            kotlin.a.e(r7)
            goto L4c
        L3c:
            kotlin.a.e(r7)
            r0.label = r3
            com.app.mlounge.data.local.prefs.y1 r7 = r6.prefs
            kotlinx.coroutines.flow.Flow r7 = r7.h
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.first(r7, r0)
            if (r7 != r5) goto L4c
            goto L5d
        L4c:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L51
            goto L67
        L51:
            com.app.mlounge.data.remote.debrid.PremiumizeApi r1 = r6.api     // Catch: java.lang.Exception -> L2f
            r0.L$0 = r4     // Catch: java.lang.Exception -> L2f
            r0.label = r2     // Catch: java.lang.Exception -> L2f
            java.lang.Object r7 = r1.b(r7, r0)     // Catch: java.lang.Exception -> L2f
            if (r7 != r5) goto L5e
        L5d:
            return r5
        L5e:
            com.app.mlounge.data.remote.debrid.PremiumizeUserInfo r7 = (com.app.mlounge.data.remote.debrid.PremiumizeUserInfo) r7     // Catch: java.lang.Exception -> L2f
            boolean r0 = r7.e()     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L67
            return r7
        L67:
            return r4
        L68:
            java.lang.String r0 = "PremiumizeManager"
            java.lang.String r1 = "Get user info failed"
            com.app.mlounge.util.a.b(r0, r1, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.PremiumizeManager.b(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, String str2, Integer num, c cVar) {
        PremiumizeManager$getVideoFromFolder$1 premiumizeManager$getVideoFromFolder$1;
        List listA;
        Object next;
        PremiumizeFolderListResponse.PremiumizeFolderItem premiumizeFolderItem;
        Object next2;
        String strB;
        if (cVar instanceof PremiumizeManager$getVideoFromFolder$1) {
            premiumizeManager$getVideoFromFolder$1 = (PremiumizeManager$getVideoFromFolder$1) cVar;
            int i = premiumizeManager$getVideoFromFolder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumizeManager$getVideoFromFolder$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumizeManager$getVideoFromFolder$1 = new PremiumizeManager$getVideoFromFolder$1(this, cVar);
            }
        } else {
            premiumizeManager$getVideoFromFolder$1 = new PremiumizeManager$getVideoFromFolder$1(this, cVar);
        }
        Object objD = premiumizeManager$getVideoFromFolder$1.result;
        int i2 = premiumizeManager$getVideoFromFolder$1.label;
        if (i2 == 0) {
            a.e(objD);
            PremiumizeApi premiumizeApi = this.api;
            premiumizeManager$getVideoFromFolder$1.L$0 = null;
            premiumizeManager$getVideoFromFolder$1.L$1 = null;
            premiumizeManager$getVideoFromFolder$1.L$2 = num;
            premiumizeManager$getVideoFromFolder$1.label = 1;
            objD = premiumizeApi.d(str, str2, premiumizeManager$getVideoFromFolder$1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            num = (Integer) premiumizeManager$getVideoFromFolder$1.L$2;
            a.e(objD);
        }
        PremiumizeFolderListResponse premiumizeFolderListResponse = (PremiumizeFolderListResponse) objD;
        if (premiumizeFolderListResponse.b() && (listA = premiumizeFolderListResponse.a()) != null && !listA.isEmpty()) {
            List listA2 = premiumizeFolderListResponse.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA2) {
                if (((PremiumizeFolderListResponse.PremiumizeFolderItem) obj).e()) {
                    arrayList.add(obj);
                }
            }
            if (num == null || num.intValue() >= arrayList.size()) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        Long lC = ((PremiumizeFolderListResponse.PremiumizeFolderItem) next).c();
                        long jLongValue = lC != null ? lC.longValue() : 0L;
                        do {
                            Object next3 = it.next();
                            Long lC2 = ((PremiumizeFolderListResponse.PremiumizeFolderItem) next3).c();
                            long jLongValue2 = lC2 != null ? lC2.longValue() : 0L;
                            if (jLongValue < jLongValue2) {
                                next = next3;
                                jLongValue = jLongValue2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                premiumizeFolderItem = (PremiumizeFolderListResponse.PremiumizeFolderItem) next;
            } else {
                premiumizeFolderItem = (PremiumizeFolderListResponse.PremiumizeFolderItem) arrayList.get(num.intValue());
            }
            if (premiumizeFolderItem != null && (strB = premiumizeFolderItem.b()) != null) {
                return strB;
            }
            String strD = premiumizeFolderItem != null ? premiumizeFolderItem.d() : null;
            if (strD != null) {
                return strD;
            }
            Iterator it2 = premiumizeFolderListResponse.a().iterator();
            if (it2.hasNext()) {
                next2 = it2.next();
                if (it2.hasNext()) {
                    Long lC3 = ((PremiumizeFolderListResponse.PremiumizeFolderItem) next2).c();
                    long jLongValue3 = lC3 != null ? lC3.longValue() : 0L;
                    do {
                        Object next4 = it2.next();
                        Long lC4 = ((PremiumizeFolderListResponse.PremiumizeFolderItem) next4).c();
                        long jLongValue4 = lC4 != null ? lC4.longValue() : 0L;
                        if (jLongValue3 < jLongValue4) {
                            next2 = next4;
                            jLongValue3 = jLongValue4;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next2 = null;
            }
            PremiumizeFolderListResponse.PremiumizeFolderItem premiumizeFolderItem2 = (PremiumizeFolderListResponse.PremiumizeFolderItem) next2;
            if (premiumizeFolderItem2 != null) {
                String strB2 = premiumizeFolderItem2.b();
                return strB2 == null ? premiumizeFolderItem2.d() : strB2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(c cVar) {
        PremiumizeManager$isLoggedIn$1 premiumizeManager$isLoggedIn$1;
        if (cVar instanceof PremiumizeManager$isLoggedIn$1) {
            premiumizeManager$isLoggedIn$1 = (PremiumizeManager$isLoggedIn$1) cVar;
            int i = premiumizeManager$isLoggedIn$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumizeManager$isLoggedIn$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumizeManager$isLoggedIn$1 = new PremiumizeManager$isLoggedIn$1(this, cVar);
            }
        } else {
            premiumizeManager$isLoggedIn$1 = new PremiumizeManager$isLoggedIn$1(this, cVar);
        }
        Object objFirst = premiumizeManager$isLoggedIn$1.result;
        int i2 = premiumizeManager$isLoggedIn$1.label;
        if (i2 == 0) {
            a.e(objFirst);
            Flow flow = this.prefs.h;
            premiumizeManager$isLoggedIn$1.label = 1;
            objFirst = FlowKt.first(flow, premiumizeManager$isLoggedIn$1);
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

    public final Object e(c cVar) {
        Object objS = b.s(z1.a(this.prefs.a), new d(16, null, null), cVar);
        y yVar = y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (objS != aVar) {
            objS = yVar;
        }
        return objS == aVar ? objS : yVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076 A[Catch: Exception -> 0x0033, TRY_LEAVE, TryCatch #0 {Exception -> 0x0033, blocks: (B:12:0x002f, B:19:0x0040, B:32:0x006c, B:35:0x0076, B:29:0x005f), top: B:41:0x001f }] */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        if (e(r0) == r7) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(kotlin.coroutines.d r9) {
        /*
            r8 = this;
            r0 = r9
            com.app.mlounge.data.remote.debrid.PremiumizeManager$refreshSession$1 r0 = (com.app.mlounge.data.remote.debrid.PremiumizeManager$refreshSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto Lf
            int r1 = r1 - r2
            r0.label = r1
            goto L14
        Lf:
            com.app.mlounge.data.remote.debrid.PremiumizeManager$refreshSession$1 r0 = new com.app.mlounge.data.remote.debrid.PremiumizeManager$refreshSession$1
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
            com.app.mlounge.data.remote.debrid.PremiumizeUserInfo r1 = (com.app.mlounge.data.remote.debrid.PremiumizeUserInfo) r1
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.a.e(r9)     // Catch: java.lang.Exception -> L33
            goto L8a
        L33:
            r9 = move-exception
            goto L83
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r9)
            r9 = 0
            return r9
        L3c:
            java.lang.Object r1 = r0.L$0
            java.lang.String r1 = (java.lang.String) r1
            kotlin.a.e(r9)     // Catch: java.lang.Exception -> L33
            goto L6c
        L44:
            kotlin.a.e(r9)
            goto L58
        L48:
            kotlin.a.e(r9)
            r0.label = r6
            com.app.mlounge.data.local.prefs.y1 r9 = r8.prefs
            kotlinx.coroutines.flow.Flow r9 = r9.h
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.first(r9, r0)
            if (r9 != r7) goto L58
            goto L82
        L58:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L5f
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L5f:
            com.app.mlounge.data.remote.debrid.PremiumizeApi r1 = r8.api     // Catch: java.lang.Exception -> L33
            r0.L$0 = r5     // Catch: java.lang.Exception -> L33
            r0.label = r4     // Catch: java.lang.Exception -> L33
            java.lang.Object r9 = r1.b(r9, r0)     // Catch: java.lang.Exception -> L33
            if (r9 != r7) goto L6c
            goto L82
        L6c:
            com.app.mlounge.data.remote.debrid.PremiumizeUserInfo r9 = (com.app.mlounge.data.remote.debrid.PremiumizeUserInfo) r9     // Catch: java.lang.Exception -> L33
            boolean r9 = r9.e()     // Catch: java.lang.Exception -> L33
            if (r9 == 0) goto L76
            r2 = r6
            goto L8a
        L76:
            r0.L$0 = r5     // Catch: java.lang.Exception -> L33
            r0.L$1 = r5     // Catch: java.lang.Exception -> L33
            r0.label = r3     // Catch: java.lang.Exception -> L33
            java.lang.Object r9 = r8.e(r0)     // Catch: java.lang.Exception -> L33
            if (r9 != r7) goto L8a
        L82:
            return r7
        L83:
            java.lang.String r0 = "PremiumizeManager"
            java.lang.String r1 = "Session refresh failed (transient)"
            com.app.mlounge.util.a.b(r0, r1, r9)
        L8a:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.PremiumizeManager.f(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01da  */
    /* JADX WARN: Code duplicated, block: B:108:0x01db  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e4 A[Catch: Exception -> 0x004a, TryCatch #0 {Exception -> 0x004a, blocks: (B:15:0x0045, B:116:0x0203, B:22:0x0068, B:109:0x01dc, B:111:0x01e4, B:113:0x01ea, B:25:0x007d, B:39:0x00cb, B:41:0x00d3, B:43:0x00d9, B:46:0x00e1, B:47:0x00ee, B:49:0x00f4, B:51:0x0101, B:53:0x0107, B:55:0x0111, B:98:0x01b7, B:103:0x01c1, B:56:0x011d, B:75:0x0164, B:77:0x0169, B:96:0x01b2, B:80:0x0179, B:83:0x0184, B:85:0x018d, B:87:0x0193, B:89:0x01a0, B:94:0x01ac, B:59:0x012b, B:62:0x0136, B:64:0x013f, B:66:0x0145, B:68:0x0152, B:73:0x015e, B:105:0x01c6, B:35:0x00b2), top: B:121:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0200, code lost:
    
        if (r13 == r7) goto L115;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.String r11, java.lang.Integer r12, kotlin.coroutines.jvm.internal.c r13) {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.debrid.PremiumizeManager.g(java.lang.String, java.lang.Integer, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, c cVar) {
        PremiumizeManager$validateApiKey$1 premiumizeManager$validateApiKey$1;
        if (cVar instanceof PremiumizeManager$validateApiKey$1) {
            premiumizeManager$validateApiKey$1 = (PremiumizeManager$validateApiKey$1) cVar;
            int i = premiumizeManager$validateApiKey$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumizeManager$validateApiKey$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumizeManager$validateApiKey$1 = new PremiumizeManager$validateApiKey$1(this, cVar);
            }
        } else {
            premiumizeManager$validateApiKey$1 = new PremiumizeManager$validateApiKey$1(this, cVar);
        }
        Object objB = premiumizeManager$validateApiKey$1.result;
        int i2 = premiumizeManager$validateApiKey$1.label;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            if (i2 == 0) {
                a.e(objB);
                PremiumizeApi premiumizeApi = this.api;
                premiumizeManager$validateApiKey$1.L$0 = str;
                premiumizeManager$validateApiKey$1.label = 1;
                objB = premiumizeApi.b(str, premiumizeManager$validateApiKey$1);
                if (objB == aVar) {
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                PremiumizeUserInfo premiumizeUserInfo = (PremiumizeUserInfo) premiumizeManager$validateApiKey$1.L$1;
                a.e(objB);
                return premiumizeUserInfo;
            }
            str = (String) premiumizeManager$validateApiKey$1.L$0;
            a.e(objB);
            PremiumizeUserInfo premiumizeUserInfo2 = (PremiumizeUserInfo) objB;
            if (!premiumizeUserInfo2.e()) {
                return null;
            }
            y1 y1Var = this.prefs;
            premiumizeManager$validateApiKey$1.L$0 = null;
            premiumizeManager$validateApiKey$1.L$1 = premiumizeUserInfo2;
            premiumizeManager$validateApiKey$1.label = 2;
            Object objS = b.s(z1.a(y1Var.a), new d(16, str, null), premiumizeManager$validateApiKey$1);
            if (objS != aVar) {
                objS = y.a;
            }
            return objS == aVar ? aVar : premiumizeUserInfo2;
        } catch (Exception e) {
            com.app.mlounge.util.a.b(TAG, "API key validation failed", e);
            return null;
        }
    }
}
