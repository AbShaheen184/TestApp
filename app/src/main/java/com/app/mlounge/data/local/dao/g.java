package com.app.mlounge.data.local.dao;

import androidx.datastore.preferences.protobuf.h1;
import androidx.room.q;
import androidx.room.z;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final q a;
    public final e b = new e(0);
    public final f c = new f(0);

    public g(q qVar) {
        this.a = qVar;
    }

    public static Object c(g gVar, final long j, final String str, final long j2, com.app.mlounge.data.download.f fVar) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Object objA = com.google.android.gms.dynamite.g.A(gVar.a, fVar, new kotlin.jvm.functions.l() { // from class: com.app.mlounge.data.local.dao.b
            @Override // kotlin.jvm.functions.l
            public final Object invoke(Object obj) throws Exception {
                long j3 = jCurrentTimeMillis;
                String str2 = str;
                long j4 = j2;
                long j5 = j;
                androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
                aVar.getClass();
                androidx.sqlite.c cVarU = aVar.U("UPDATE downloads SET status = 'completed', progress = 100, completedAt = ?, filePath = ?, totalBytes = ?, downloadedBytes = ? WHERE id = ?");
                try {
                    cVarU.f(1, j3);
                    cVarU.r(2, str2);
                    cVarU.f(3, j4);
                    cVarU.f(4, j4);
                    cVarU.f(5, j5);
                    cVarU.Q();
                    return y.a;
                } finally {
                    cVarU.close();
                }
            }
        }, false, true);
        return objA == kotlin.coroutines.intrinsics.a.e ? objA : y.a;
    }

    public final androidx.room.coroutines.l a() {
        z zVar = new z(7);
        return h1.i(this.a, new String[]{"downloads"}, zVar);
    }

    public final Object b(long j, kotlin.coroutines.jvm.internal.i iVar) {
        return com.google.android.gms.dynamite.g.A(this.a, iVar, new androidx.compose.foundation.text.c(j, 4), true, false);
    }

    public final Object d(final long j, final String str, com.app.mlounge.data.download.f fVar) {
        Object objA = com.google.android.gms.dynamite.g.A(this.a, fVar, new kotlin.jvm.functions.l() { // from class: com.app.mlounge.data.local.dao.c
            @Override // kotlin.jvm.functions.l
            public final Object invoke(Object obj) throws Exception {
                String str2 = str;
                long j2 = j;
                androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
                aVar.getClass();
                androidx.sqlite.c cVarU = aVar.U("UPDATE downloads SET status = 'failed', failureReason = ? WHERE id = ?");
                try {
                    cVarU.r(1, str2);
                    cVarU.f(2, j2);
                    cVarU.Q();
                    return y.a;
                } finally {
                    cVarU.close();
                }
            }
        }, false, true);
        return objA == kotlin.coroutines.intrinsics.a.e ? objA : y.a;
    }

    public final Object e(com.app.mlounge.data.local.entity.a aVar, kotlin.coroutines.jvm.internal.i iVar) {
        Object objA = com.google.android.gms.dynamite.g.A(this.a, iVar, new a(this, aVar, 1), false, true);
        return objA == kotlin.coroutines.intrinsics.a.e ? objA : y.a;
    }
}
