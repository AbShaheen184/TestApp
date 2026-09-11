package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.media3.exoplayer.source.a0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Closeable {
    public static final com.google.android.datatransport.c C = new com.google.android.datatransport.c("proto");
    public final a A;
    public final javax.inject.a B;
    public final i e;
    public final com.google.android.datatransport.runtime.time.a y;
    public final com.google.android.datatransport.runtime.time.a z;

    public g(com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, a aVar3, i iVar, javax.inject.a aVar4) {
        this.e = iVar;
        this.y = aVar;
        this.z = aVar2;
        this.A = aVar3;
        this.B = aVar4;
    }

    public static String N(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object X(Cursor cursor, e eVar) {
        try {
            return eVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long g(SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.i iVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.a, String.valueOf(com.google.android.datatransport.runtime.util.a.a(iVar.c))));
        byte[] bArr = iVar.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public final Object L(com.google.android.datatransport.runtime.synchronization.b bVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        com.google.android.datatransport.runtime.time.a aVar = this.z;
        long jH = aVar.h();
        while (true) {
            try {
                sQLiteDatabaseA.beginTransaction();
                try {
                    Object objH = bVar.h();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return objH;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.h() >= ((long) this.A.c) + jH) {
                    throw new com.google.android.datatransport.runtime.synchronization.a("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final SQLiteDatabase a() {
        i iVar = this.e;
        Objects.requireNonNull(iVar);
        com.google.android.datatransport.runtime.time.a aVar = this.z;
        long jH = aVar.h();
        while (true) {
            try {
                return iVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.h() >= ((long) this.A.c) + jH) {
                    throw new com.google.android.datatransport.runtime.synchronization.a("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    public final Object m(e eVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            Object objApply = eVar.apply(sQLiteDatabaseA);
            sQLiteDatabaseA.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    public final ArrayList w(SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.i iVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long lG = g(sQLiteDatabase, iVar);
        if (lG == null) {
            return arrayList;
        }
        X(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lG.toString()}, null, null, null, String.valueOf(i)), new a0(4, this, arrayList, iVar));
        return arrayList;
    }

    public final void z(long j, com.google.android.datatransport.runtime.firebase.transport.c cVar, String str) {
        m(new com.google.android.datatransport.runtime.scheduling.jobscheduling.i(j, str, cVar));
    }
}
