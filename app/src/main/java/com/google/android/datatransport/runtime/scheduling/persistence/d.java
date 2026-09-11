package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements e {
    public final /* synthetic */ long e;
    public final /* synthetic */ com.google.android.datatransport.runtime.i y;

    public /* synthetic */ d(long j, com.google.android.datatransport.runtime.i iVar) {
        this.e = j;
        this.y = iVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.e));
        com.google.android.datatransport.runtime.i iVar = this.y;
        String str = iVar.a;
        com.google.android.datatransport.d dVar = iVar.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(com.google.android.datatransport.runtime.util.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(com.google.android.datatransport.runtime.util.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
