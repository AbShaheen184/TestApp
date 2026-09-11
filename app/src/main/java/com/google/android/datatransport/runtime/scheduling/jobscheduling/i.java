package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.appsalt.internal.j0;
import com.google.firebase.crashlytics.internal.model.k1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements com.google.android.datatransport.runtime.synchronization.b, com.google.android.datatransport.runtime.scheduling.persistence.e, com.google.firebase.inject.a {
    public final /* synthetic */ long e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ i(long j, Object obj, Object obj2) {
        this.y = obj;
        this.z = obj2;
        this.e = j;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public Object apply(Object obj) {
        String str = (String) this.y;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((com.google.android.datatransport.runtime.firebase.transport.c) this.z).e;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.e;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // com.google.firebase.inject.a
    public void e(com.google.firebase.inject.b bVar) {
        ((com.google.firebase.crashlytics.internal.a) bVar.get()).d((String) this.y, this.e, (k1) this.z);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.b
    public Object h() {
        j0 j0Var = (j0) this.y;
        com.google.android.datatransport.runtime.i iVar = (com.google.android.datatransport.runtime.i) this.z;
        com.google.android.datatransport.runtime.scheduling.persistence.g gVar = (com.google.android.datatransport.runtime.scheduling.persistence.g) j0Var.c;
        long jH = ((com.google.android.datatransport.runtime.time.a) j0Var.g).h() + this.e;
        gVar.getClass();
        gVar.m(new com.google.android.datatransport.runtime.scheduling.persistence.d(jH, iVar));
        return null;
    }

    public /* synthetic */ i(String str, long j, k1 k1Var) {
        this.y = str;
        this.e = j;
        this.z = k1Var;
    }
}
