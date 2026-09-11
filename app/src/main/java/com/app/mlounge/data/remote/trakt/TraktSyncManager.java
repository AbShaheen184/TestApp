package com.app.mlounge.data.remote.trakt;

import com.app.mlounge.data.local.entity.f;
import com.app.mlounge.data.repository.j0;
import com.app.mlounge.data.repository.x;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.a;
import kotlin.collections.n;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.internal.l;
import kotlin.k;
import kotlin.text.r;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktSyncManager {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    private static final long POLL_INTERVAL_MS = 2000;
    private static final String TAG = "TraktSyncManager";
    private String lastEpisodeWatchedActivity;
    private String lastMovieWatchedActivity;
    private String lastWatchlistActivity;
    private final x localRepo;
    private final CoroutineScope scope;
    private Job syncJob;
    private final j0 tmdbRepo;
    private final TraktManager traktManager;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Companion {
    }

    public TraktSyncManager(TraktManager traktManager, x xVar, j0 j0Var) {
        traktManager.getClass();
        xVar.getClass();
        j0Var.getClass();
        this.traktManager = traktManager;
        this.localRepo = xVar;
        this.tmdbRepo = j0Var;
        this.scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
    }

    public static final boolean e(TraktSyncManager traktSyncManager, String str, String... strArr) {
        if (str == null) {
            traktSyncManager.getClass();
            return true;
        }
        traktSyncManager.getClass();
        Long lJ = j(str);
        if (lJ != null) {
            long jLongValue = lJ.longValue();
            for (String str2 : strArr) {
                Long lJ2 = j(str2);
                if (lJ2 == null || lJ2.longValue() <= jLongValue) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object f(TraktSyncManager traktSyncManager, c cVar) {
        TraktSyncManager$seedActivityTimestamps$1 traktSyncManager$seedActivityTimestamps$1;
        traktSyncManager.getClass();
        if (cVar instanceof TraktSyncManager$seedActivityTimestamps$1) {
            traktSyncManager$seedActivityTimestamps$1 = (TraktSyncManager$seedActivityTimestamps$1) cVar;
            int i = traktSyncManager$seedActivityTimestamps$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                traktSyncManager$seedActivityTimestamps$1.label = i - Integer.MIN_VALUE;
            } else {
                traktSyncManager$seedActivityTimestamps$1 = new TraktSyncManager$seedActivityTimestamps$1(traktSyncManager, cVar);
            }
        } else {
            traktSyncManager$seedActivityTimestamps$1 = new TraktSyncManager$seedActivityTimestamps$1(traktSyncManager, cVar);
        }
        Object objG = traktSyncManager$seedActivityTimestamps$1.result;
        int i2 = traktSyncManager$seedActivityTimestamps$1.label;
        y yVar = y.a;
        try {
            if (i2 == 0) {
                a.e(objG);
                TraktManager traktManager = traktSyncManager.traktManager;
                traktSyncManager$seedActivityTimestamps$1.label = 1;
                objG = traktManager.g(traktSyncManager$seedActivityTimestamps$1);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objG == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a.e(objG);
            }
            TraktLastActivities traktLastActivities = (TraktLastActivities) objG;
            if (traktLastActivities == null) {
                return yVar;
            }
            traktSyncManager.v(traktLastActivities);
            return yVar;
        } catch (Exception e) {
            com.app.mlounge.util.a.b(TAG, "Failed to seed activity timestamps", e);
            return yVar;
        }
    }

    public static k i(String str) {
        Integer numQ;
        List listP0 = kotlin.text.k.p0(new String[]{"_"}, str, 2);
        if (listP0.size() == 2 && (numQ = r.Q(kotlin.text.k.v0((String) listP0.get(1), "_"))) != null) {
            return new k(listP0.get(0), numQ);
        }
        return null;
    }

    public static Long j(String str) {
        Long lValueOf = null;
        if (str != null) {
            Iterator it = com.google.common.base.c.q("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "yyyy-MM-dd'T'HH:mm:ss'Z'").iterator();
            while (it.hasNext()) {
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String) it.next(), Locale.US);
                    simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                    Date date = simpleDateFormat.parse(str);
                    if (date == null) {
                        break;
                    }
                    lValueOf = Long.valueOf(date.getTime());
                    break;
                } catch (Exception unused) {
                }
            }
        }
        return lValueOf;
    }

    public static String t(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -795103699) {
            if (str.equals("anime_tv")) {
                return "show";
            }
            return null;
        }
        if (iHashCode != -196215899) {
            if (iHashCode == 3714) {
                if (str.equals("tv")) {
                    return "show";
                }
                return null;
            }
            if (iHashCode != 104087344 || !str.equals("movie")) {
                return null;
            }
        } else if (!str.equals("anime_movie")) {
            return null;
        }
        return "movie";
    }

    public static f u(TraktWatchlistItem traktWatchlistItem) {
        Integer numA;
        String strB;
        Integer numC;
        TraktIds traktIdsA;
        TraktIds traktIdsA2;
        String strD = traktWatchlistItem.d();
        String str = "movie";
        if (!l.a(strD, "movie")) {
            if (l.a(strD, "show")) {
                TraktShow traktShowC = traktWatchlistItem.c();
                numA = (traktShowC == null || (traktIdsA = traktShowC.a()) == null) ? null : traktIdsA.a();
                TraktShow traktShowC2 = traktWatchlistItem.c();
                strB = traktShowC2 != null ? traktShowC2.b() : null;
                TraktShow traktShowC3 = traktWatchlistItem.c();
                numC = traktShowC3 != null ? traktShowC3.c() : null;
                str = "tv";
            }
            return null;
        }
        TraktMovie traktMovieB = traktWatchlistItem.b();
        numA = (traktMovieB == null || (traktIdsA2 = traktMovieB.a()) == null) ? null : traktIdsA2.a();
        TraktMovie traktMovieB2 = traktWatchlistItem.b();
        strB = traktMovieB2 != null ? traktMovieB2.b() : null;
        TraktMovie traktMovieB3 = traktWatchlistItem.b();
        numC = traktMovieB3 != null ? traktMovieB3.c() : null;
        String str2 = str;
        if (numA != null) {
            String str3 = str2 + "_" + numA;
            if (strB == null) {
                strB = "";
            }
            String str4 = strB;
            String strValueOf = String.valueOf(numA.intValue());
            String strValueOf2 = numC != null ? String.valueOf(numC.intValue()) : null;
            Long lJ = j(traktWatchlistItem.a());
            return new f(str3, str2, str4, null, null, null, strValueOf2, null, lJ != null ? lJ.longValue() : System.currentTimeMillis(), strValueOf, null, 1208);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        if (r11 == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
    
        if (r11 == r7) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(com.app.mlounge.data.local.entity.c r10, kotlin.coroutines.jvm.internal.c r11) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.trakt.TraktSyncManager.g(com.app.mlounge.data.local.entity.c, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        if (r11 == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
    
        if (r11 == r7) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(com.app.mlounge.data.local.entity.f r10, kotlin.coroutines.jvm.internal.c r11) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.trakt.TraktSyncManager.h(com.app.mlounge.data.local.entity.f, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object k(String str, String str2, Integer num, Integer num2, c cVar) {
        TraktSyncManager$pushHistoryAdd$1 traktSyncManager$pushHistoryAdd$1;
        String str3;
        String str4;
        Integer num3;
        Integer num4;
        Integer numQ;
        if (cVar instanceof TraktSyncManager$pushHistoryAdd$1) {
            traktSyncManager$pushHistoryAdd$1 = (TraktSyncManager$pushHistoryAdd$1) cVar;
            int i = traktSyncManager$pushHistoryAdd$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                traktSyncManager$pushHistoryAdd$1.label = i - Integer.MIN_VALUE;
            } else {
                traktSyncManager$pushHistoryAdd$1 = new TraktSyncManager$pushHistoryAdd$1(this, cVar);
            }
        } else {
            traktSyncManager$pushHistoryAdd$1 = new TraktSyncManager$pushHistoryAdd$1(this, cVar);
        }
        Object objJ = traktSyncManager$pushHistoryAdd$1.result;
        int i2 = traktSyncManager$pushHistoryAdd$1.label;
        if (i2 == 0) {
            a.e(objJ);
            TraktManager traktManager = this.traktManager;
            traktSyncManager$pushHistoryAdd$1.L$0 = str;
            str3 = str2;
            traktSyncManager$pushHistoryAdd$1.L$1 = str3;
            traktSyncManager$pushHistoryAdd$1.L$2 = num;
            traktSyncManager$pushHistoryAdd$1.L$3 = num2;
            traktSyncManager$pushHistoryAdd$1.label = 1;
            objJ = traktManager.j(traktSyncManager$pushHistoryAdd$1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objJ == aVar) {
                return aVar;
            }
            str4 = str;
            num3 = num;
            num4 = num2;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            num4 = (Integer) traktSyncManager$pushHistoryAdd$1.L$3;
            num3 = (Integer) traktSyncManager$pushHistoryAdd$1.L$2;
            str3 = (String) traktSyncManager$pushHistoryAdd$1.L$1;
            str4 = (String) traktSyncManager$pushHistoryAdd$1.L$0;
            a.e(objJ);
        }
        boolean zBooleanValue = ((Boolean) objJ).booleanValue();
        y yVar = y.a;
        if (zBooleanValue && str3 != null && (numQ = r.Q(str3)) != null) {
            int iIntValue = numQ.intValue();
            String strT = t(str4);
            if (strT != null) {
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new TraktSyncManager$pushHistoryAdd$2(this, iIntValue, strT, num3, num4, null), 3, null);
            }
        }
        return yVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(String str, c cVar) {
        TraktSyncManager$pushHistoryRemove$1 traktSyncManager$pushHistoryRemove$1;
        k kVarI;
        if (cVar instanceof TraktSyncManager$pushHistoryRemove$1) {
            traktSyncManager$pushHistoryRemove$1 = (TraktSyncManager$pushHistoryRemove$1) cVar;
            int i = traktSyncManager$pushHistoryRemove$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                traktSyncManager$pushHistoryRemove$1.label = i - Integer.MIN_VALUE;
            } else {
                traktSyncManager$pushHistoryRemove$1 = new TraktSyncManager$pushHistoryRemove$1(this, cVar);
            }
        } else {
            traktSyncManager$pushHistoryRemove$1 = new TraktSyncManager$pushHistoryRemove$1(this, cVar);
        }
        Object objJ = traktSyncManager$pushHistoryRemove$1.result;
        int i2 = traktSyncManager$pushHistoryRemove$1.label;
        if (i2 == 0) {
            a.e(objJ);
            TraktManager traktManager = this.traktManager;
            traktSyncManager$pushHistoryRemove$1.L$0 = str;
            traktSyncManager$pushHistoryRemove$1.label = 1;
            objJ = traktManager.j(traktSyncManager$pushHistoryRemove$1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) traktSyncManager$pushHistoryRemove$1.L$0;
            a.e(objJ);
        }
        boolean zBooleanValue = ((Boolean) objJ).booleanValue();
        y yVar = y.a;
        if (zBooleanValue && (kVarI = i(str)) != null) {
            String str2 = (String) kVarI.e;
            int iIntValue = ((Number) kVarI.y).intValue();
            String strT = t(str2);
            if (strT != null) {
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new TraktSyncManager$pushHistoryRemove$2(this, iIntValue, strT, null), 3, null);
                return yVar;
            }
        }
        return yVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(String str, String str2, c cVar) {
        TraktSyncManager$pushWatchlistAdd$1 traktSyncManager$pushWatchlistAdd$1;
        Integer numQ;
        if (cVar instanceof TraktSyncManager$pushWatchlistAdd$1) {
            traktSyncManager$pushWatchlistAdd$1 = (TraktSyncManager$pushWatchlistAdd$1) cVar;
            int i = traktSyncManager$pushWatchlistAdd$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                traktSyncManager$pushWatchlistAdd$1.label = i - Integer.MIN_VALUE;
            } else {
                traktSyncManager$pushWatchlistAdd$1 = new TraktSyncManager$pushWatchlistAdd$1(this, cVar);
            }
        } else {
            traktSyncManager$pushWatchlistAdd$1 = new TraktSyncManager$pushWatchlistAdd$1(this, cVar);
        }
        Object objJ = traktSyncManager$pushWatchlistAdd$1.result;
        int i2 = traktSyncManager$pushWatchlistAdd$1.label;
        if (i2 == 0) {
            a.e(objJ);
            TraktManager traktManager = this.traktManager;
            traktSyncManager$pushWatchlistAdd$1.L$0 = str;
            traktSyncManager$pushWatchlistAdd$1.L$1 = str2;
            traktSyncManager$pushWatchlistAdd$1.label = 1;
            objJ = traktManager.j(traktSyncManager$pushWatchlistAdd$1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = (String) traktSyncManager$pushWatchlistAdd$1.L$1;
            str = (String) traktSyncManager$pushWatchlistAdd$1.L$0;
            a.e(objJ);
        }
        boolean zBooleanValue = ((Boolean) objJ).booleanValue();
        y yVar = y.a;
        if (zBooleanValue && str2 != null && (numQ = r.Q(str2)) != null) {
            int iIntValue = numQ.intValue();
            String strT = t(str);
            if (strT != null) {
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new TraktSyncManager$pushWatchlistAdd$2(this, iIntValue, strT, null), 3, null);
            }
        }
        return yVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(String str, c cVar) {
        TraktSyncManager$pushWatchlistRemove$1 traktSyncManager$pushWatchlistRemove$1;
        k kVarI;
        if (cVar instanceof TraktSyncManager$pushWatchlistRemove$1) {
            traktSyncManager$pushWatchlistRemove$1 = (TraktSyncManager$pushWatchlistRemove$1) cVar;
            int i = traktSyncManager$pushWatchlistRemove$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                traktSyncManager$pushWatchlistRemove$1.label = i - Integer.MIN_VALUE;
            } else {
                traktSyncManager$pushWatchlistRemove$1 = new TraktSyncManager$pushWatchlistRemove$1(this, cVar);
            }
        } else {
            traktSyncManager$pushWatchlistRemove$1 = new TraktSyncManager$pushWatchlistRemove$1(this, cVar);
        }
        Object objJ = traktSyncManager$pushWatchlistRemove$1.result;
        int i2 = traktSyncManager$pushWatchlistRemove$1.label;
        if (i2 == 0) {
            a.e(objJ);
            TraktManager traktManager = this.traktManager;
            traktSyncManager$pushWatchlistRemove$1.L$0 = str;
            traktSyncManager$pushWatchlistRemove$1.label = 1;
            objJ = traktManager.j(traktSyncManager$pushWatchlistRemove$1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) traktSyncManager$pushWatchlistRemove$1.L$0;
            a.e(objJ);
        }
        boolean zBooleanValue = ((Boolean) objJ).booleanValue();
        y yVar = y.a;
        if (zBooleanValue && (kVarI = i(str)) != null) {
            String str2 = (String) kVarI.e;
            int iIntValue = ((Number) kVarI.y).intValue();
            String strT = t(str2);
            if (strT != null) {
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new TraktSyncManager$pushWatchlistRemove$2(this, iIntValue, strT, null), 3, null);
                return yVar;
            }
        }
        return yVar;
    }

    public final void o() {
        Job job = this.syncJob;
        if (job == null || !job.isActive()) {
            this.syncJob = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new TraktSyncManager$startPeriodicSync$1(this, null), 3, null);
        }
    }

    public final void p() {
        Job job = this.syncJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.syncJob = null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007a A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:13:0x002b, B:42:0x0087, B:20:0x003c, B:39:0x007a, B:23:0x0044, B:29:0x005a, B:33:0x0065, B:26:0x004b), top: B:46:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (r(r0) == r6) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(boolean r9, boolean r10, kotlin.coroutines.jvm.internal.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.app.mlounge.data.remote.trakt.TraktSyncManager$syncFromTrakt$1
            if (r0 == 0) goto L13
            r0 = r11
            com.app.mlounge.data.remote.trakt.TraktSyncManager$syncFromTrakt$1 r0 = (com.app.mlounge.data.remote.trakt.TraktSyncManager$syncFromTrakt$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.app.mlounge.data.remote.trakt.TraktSyncManager$syncFromTrakt$1 r0 = new com.app.mlounge.data.remote.trakt.TraktSyncManager$syncFromTrakt$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            int r1 = r0.label
            kotlin.y r2 = kotlin.y.a
            r3 = 3
            r4 = 2
            r5 = 1
            kotlin.coroutines.intrinsics.a r6 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L48
            if (r1 == r5) goto L40
            if (r1 == r4) goto L38
            if (r1 != r3) goto L31
            kotlin.a.e(r11)     // Catch: java.lang.Exception -> L2f
            goto L87
        L2f:
            r9 = move-exception
            goto L8a
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r9)
            r9 = 0
            return r9
        L38:
            boolean r9 = r0.Z$1
            boolean r10 = r0.Z$0
            kotlin.a.e(r11)     // Catch: java.lang.Exception -> L2f
            goto L75
        L40:
            boolean r10 = r0.Z$1
            boolean r9 = r0.Z$0
            kotlin.a.e(r11)     // Catch: java.lang.Exception -> L2f
            goto L5a
        L48:
            kotlin.a.e(r11)
            com.app.mlounge.data.remote.trakt.TraktManager r11 = r8.traktManager     // Catch: java.lang.Exception -> L2f
            r0.Z$0 = r9     // Catch: java.lang.Exception -> L2f
            r0.Z$1 = r10     // Catch: java.lang.Exception -> L2f
            r0.label = r5     // Catch: java.lang.Exception -> L2f
            java.lang.Object r11 = r11.j(r0)     // Catch: java.lang.Exception -> L2f
            if (r11 != r6) goto L5a
            goto L86
        L5a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Exception -> L2f
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Exception -> L2f
            if (r11 != 0) goto L63
            return r2
        L63:
            if (r9 == 0) goto L78
            r0.Z$0 = r9     // Catch: java.lang.Exception -> L2f
            r0.Z$1 = r10     // Catch: java.lang.Exception -> L2f
            r0.label = r4     // Catch: java.lang.Exception -> L2f
            java.lang.Object r11 = r8.s(r0)     // Catch: java.lang.Exception -> L2f
            if (r11 != r6) goto L72
            goto L86
        L72:
            r7 = r10
            r10 = r9
            r9 = r7
        L75:
            r7 = r10
            r10 = r9
            r9 = r7
        L78:
            if (r10 == 0) goto L87
            r0.Z$0 = r9     // Catch: java.lang.Exception -> L2f
            r0.Z$1 = r10     // Catch: java.lang.Exception -> L2f
            r0.label = r3     // Catch: java.lang.Exception -> L2f
            java.lang.Object r9 = r8.r(r0)     // Catch: java.lang.Exception -> L2f
            if (r9 != r6) goto L87
        L86:
            return r6
        L87:
            kotlin.o r9 = com.app.mlounge.util.a.a     // Catch: java.lang.Exception -> L2f
            return r2
        L8a:
            java.lang.String r10 = "TraktSyncManager"
            java.lang.String r11 = "Sync from Trakt failed"
            com.app.mlounge.util.a.b(r10, r11, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.trakt.TraktSyncManager.q(boolean, boolean, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0278  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x02a6 -> B:123:0x02a7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object r(kotlin.coroutines.jvm.internal.c r33) {
        /*
            Method dump skipped, instruction units count: 750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.trakt.TraktSyncManager.r(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0185  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01b2 -> B:56:0x01bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object s(kotlin.coroutines.jvm.internal.c r18) {
        /*
            Method dump skipped, instruction units count: 711
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.remote.trakt.TraktSyncManager.s(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    public final void v(TraktLastActivities traktLastActivities) {
        Object next;
        TraktActivityTimestamps traktActivityTimestampsD = traktLastActivities.d();
        String strA = traktActivityTimestampsD != null ? traktActivityTimestampsD.a() : null;
        TraktActivityTimestamps traktActivityTimestampsB = traktLastActivities.b();
        String strC = traktActivityTimestampsB != null ? traktActivityTimestampsB.c() : null;
        TraktActivityTimestamps traktActivityTimestampsC = traktLastActivities.c();
        Iterator it = n.N(new String[]{strA, strC, traktActivityTimestampsC != null ? traktActivityTimestampsC.c() : null}).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Long lJ = j((String) next);
                long jLongValue = lJ != null ? lJ.longValue() : 0L;
                do {
                    Object next2 = it.next();
                    Long lJ2 = j((String) next2);
                    long jLongValue2 = lJ2 != null ? lJ2.longValue() : 0L;
                    if (jLongValue < jLongValue2) {
                        next = next2;
                        jLongValue = jLongValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        this.lastWatchlistActivity = (String) next;
        TraktActivityTimestamps traktActivityTimestampsB2 = traktLastActivities.b();
        this.lastMovieWatchedActivity = traktActivityTimestampsB2 != null ? traktActivityTimestampsB2.b() : null;
        TraktActivityTimestamps traktActivityTimestampsA = traktLastActivities.a();
        this.lastEpisodeWatchedActivity = traktActivityTimestampsA != null ? traktActivityTimestampsA.b() : null;
    }
}
