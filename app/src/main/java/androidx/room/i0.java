package androidx.room;

import com.app.mlounge.data.local.AppDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final AppDatabase_Impl a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final boolean d;
    public final androidx.compose.foundation.c e;
    public final String[] g;
    public final j h;
    public final androidx.datastore.core.a0 i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public kotlin.jvm.functions.a k = new androidx.compose.runtime.saveable.f(10);
    public final LinkedHashMap f = new LinkedHashMap();

    public i0(AppDatabase_Impl appDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, androidx.compose.foundation.c cVar) {
        String lowerCase;
        this.a = appDatabase_Impl;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = z;
        this.e = cVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.f.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap3 = this.f;
                linkedHashMap3.put(lowerCase4, kotlin.collections.a0.r(lowerCase3, linkedHashMap3));
            }
        }
        this.h = new j(this.g.length);
        this.i = new androidx.datastore.core.a0(this.g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(i0 i0Var, m mVar, kotlin.coroutines.jvm.internal.c cVar) {
        a0 a0Var;
        i0Var.getClass();
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i = a0Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                a0Var.A = i - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(i0Var, cVar);
            }
        } else {
            a0Var = new a0(i0Var, cVar);
        }
        Object objB = a0Var.y;
        int i2 = a0Var.A;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(objB);
            z zVar = new z(0);
            a0Var.e = mVar;
            a0Var.A = 1;
            objB = mVar.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1", zVar, a0Var);
            if (objB != aVar) {
            }
            return aVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) a0Var.e;
            kotlin.a.e(objB);
            return set;
        }
        mVar = (m) a0Var.e;
        kotlin.a.e(objB);
        Set set2 = (Set) objB;
        if (!set2.isEmpty()) {
            a0Var.e = set2;
            a0Var.A = 2;
            if (r.k(mVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", a0Var) == aVar) {
                return aVar;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object b(i0 i0Var, kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        c0 c0Var;
        androidx.media3.common.util.b bVar;
        Object value;
        int[] iArr;
        AppDatabase_Impl appDatabase_Impl = i0Var.a;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i = c0Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0Var.A = i - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(i0Var, cVar);
            }
        } else {
            c0Var = new c0(i0Var, cVar);
        }
        Object obj = c0Var.y;
        int i2 = c0Var.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            androidx.media3.common.util.b bVar2 = appDatabase_Impl.g;
            boolean zM = bVar2.m();
            kotlin.collections.w wVar = kotlin.collections.w.e;
            if (!zM) {
                return wVar;
            }
            try {
                if (!i0Var.j.compareAndSet(true, false)) {
                    bVar2.J();
                    return wVar;
                }
                if (!((Boolean) i0Var.k.invoke()).booleanValue()) {
                    bVar2.J();
                    return wVar;
                }
                d0 d0Var = new d0(i0Var, null, 1);
                c0Var.e = bVar2;
                c0Var.A = 1;
                Object objJ = appDatabase_Impl.j(false, d0Var, c0Var);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objJ == aVar) {
                    return aVar;
                }
                bVar = bVar2;
                obj = objJ;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                bVar.J();
                throw th;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = c0Var.e;
            try {
                kotlin.a.e(obj);
            } catch (Throwable th2) {
                th = th2;
                bVar.J();
                throw th;
            }
        }
        Set set = (Set) obj;
        if (!set.isEmpty()) {
            androidx.datastore.core.a0 a0Var = i0Var.i;
            a0Var.getClass();
            set.getClass();
            if (!set.isEmpty()) {
                MutableStateFlow mutableStateFlow = a0Var.a;
                do {
                    value = mutableStateFlow.getValue();
                    int[] iArr2 = (int[]) value;
                    int length = iArr2.length;
                    iArr = new int[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr[i3] = set.contains(Integer.valueOf(i3)) ? iArr2[i3] + 1 : iArr2[i3];
                    }
                } while (!mutableStateFlow.compareAndSet(value, iArr));
            }
            i0Var.e.invoke(set);
        }
        bVar.J();
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:24:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (androidx.room.r.k(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
    
        if (androidx.room.r.k(r11, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00da, code lost:
    
        return r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d8 -> B:28:0x00db). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.room.i0 r17, androidx.room.y r18, int r19, kotlin.coroutines.jvm.internal.c r20) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.i0.c(androidx.room.i0, androidx.room.y, int, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0081 -> B:19:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(androidx.room.i0 r7, androidx.room.y r8, int r9, kotlin.coroutines.jvm.internal.c r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof androidx.room.f0
            if (r0 == 0) goto L16
            r0 = r10
            androidx.room.f0 r0 = (androidx.room.f0) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.E = r1
            goto L1b
        L16:
            androidx.room.f0 r0 = new androidx.room.f0
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.C
            int r1 = r0.E
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L34
            int r7 = r0.B
            int r8 = r0.A
            java.lang.String[] r9 = r0.z
            java.lang.String r1 = r0.y
            androidx.room.m r3 = r0.e
            kotlin.a.e(r10)
            r10 = r9
            r9 = r3
            goto L84
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            return r7
        L3b:
            kotlin.a.e(r10)
            java.lang.String[] r7 = r7.g
            r7 = r7[r9]
            java.lang.String[] r9 = androidx.room.i0.l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4d:
            if (r8 >= r7) goto L86
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = androidx.privacysandbox.ads.adservices.java.internal.a.k(r5, r4, r3)
            r0.e = r9
            r0.y = r1
            r0.z = r10
            r0.A = r8
            r0.B = r7
            r0.E = r2
            java.lang.Object r3 = androidx.room.r.k(r9, r3, r0)
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r3 != r4) goto L84
            return r4
        L84:
            int r8 = r8 + r2
            goto L4d
        L86:
            kotlin.y r7 = kotlin.y.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.i0.d(androidx.room.i0, androidx.room.y, int, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        g0 g0Var;
        androidx.media3.common.util.b bVar;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i = g0Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                g0Var.A = i - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, cVar);
            }
        } else {
            g0Var = new g0(this, cVar);
        }
        Object obj = g0Var.y;
        int i2 = g0Var.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            AppDatabase_Impl appDatabase_Impl = this.a;
            androidx.media3.common.util.b bVar2 = appDatabase_Impl.g;
            if (bVar2.m()) {
                try {
                    androidx.compose.animation.b0 b0Var = new androidx.compose.animation.b0(this, (kotlin.coroutines.d) null, 21);
                    g0Var.e = bVar2;
                    g0Var.A = 1;
                    Object objJ = appDatabase_Impl.j(false, b0Var, g0Var);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objJ == aVar) {
                        return aVar;
                    }
                    bVar = bVar2;
                    bVar.J();
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar2;
                    bVar.J();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = g0Var.e;
            try {
                kotlin.a.e(obj);
                bVar.J();
            } catch (Throwable th2) {
                th = th2;
                bVar.J();
                throw th;
            }
        }
        return kotlin.y.a;
    }
}
