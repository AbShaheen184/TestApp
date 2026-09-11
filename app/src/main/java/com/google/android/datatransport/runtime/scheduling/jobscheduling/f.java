package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.exoplayer.source.a0;
import com.google.firebase.messaging.o;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements com.google.android.datatransport.runtime.synchronization.b {
    public final /* synthetic */ int e;
    public final /* synthetic */ com.google.android.datatransport.runtime.scheduling.persistence.g y;

    public /* synthetic */ f(com.google.android.datatransport.runtime.scheduling.persistence.g gVar, int i) {
        this.e = i;
        this.y = gVar;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.b
    public final Object h() {
        int i = this.e;
        com.google.android.datatransport.runtime.scheduling.persistence.g gVar = this.y;
        boolean z = false;
        switch (i) {
            case 0:
                gVar.getClass();
                int i2 = com.google.android.datatransport.runtime.firebase.transport.a.e;
                o oVar = new o(19, z);
                oVar.z = null;
                oVar.A = new ArrayList();
                oVar.B = null;
                oVar.y = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseA = gVar.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    com.google.android.datatransport.runtime.firebase.transport.a aVar = (com.google.android.datatransport.runtime.firebase.transport.a) com.google.android.datatransport.runtime.scheduling.persistence.g.X(sQLiteDatabaseA.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new a0(5, gVar, map, oVar));
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return aVar;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            default:
                long jH = gVar.y.h() - gVar.A.d;
                SQLiteDatabase sQLiteDatabaseA2 = gVar.a();
                sQLiteDatabaseA2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jH)};
                    Cursor cursorRawQuery = sQLiteDatabaseA2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            gVar.z(cursorRawQuery.getInt(0), com.google.android.datatransport.runtime.firebase.transport.c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseA2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseA2.setTransactionSuccessful();
                    sQLiteDatabaseA2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseA2.endTransaction();
                    throw th2;
                }
        }
    }
}
