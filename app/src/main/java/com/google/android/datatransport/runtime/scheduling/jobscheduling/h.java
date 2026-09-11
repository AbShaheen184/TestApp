package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.appsalt.internal.j0;
import com.google.android.material.shape.c0;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements com.google.android.datatransport.runtime.synchronization.b, com.google.firebase.concurrent.g {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    public /* synthetic */ h(j0 j0Var, Iterable iterable, com.google.android.datatransport.runtime.i iVar, long j) {
        this.e = 0;
        this.z = j0Var;
        this.A = iterable;
        this.B = iVar;
        this.y = j;
    }

    @Override // com.google.firebase.concurrent.g
    public ScheduledFuture a(final c0 c0Var) {
        switch (this.e) {
            case 1:
                com.google.firebase.concurrent.f fVar = (com.google.firebase.concurrent.f) this.z;
                Runnable runnable = (Runnable) this.A;
                return fVar.y.schedule(new com.google.firebase.concurrent.d(fVar, runnable, c0Var, 1), this.y, (TimeUnit) this.B);
            default:
                final com.google.firebase.concurrent.f fVar2 = (com.google.firebase.concurrent.f) this.z;
                final Callable callable = (Callable) this.A;
                return fVar2.y.schedule(new Callable() { // from class: com.google.firebase.concurrent.e
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return fVar2.e.submit(new androidx.media3.ui.c0(8, callable, c0Var));
                    }
                }, this.y, (TimeUnit) this.B);
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.b
    public Object h() {
        j0 j0Var = (j0) this.z;
        Iterable iterable = (Iterable) this.A;
        com.google.android.datatransport.runtime.i iVar = (com.google.android.datatransport.runtime.i) this.B;
        com.google.android.datatransport.runtime.scheduling.persistence.g gVar = (com.google.android.datatransport.runtime.scheduling.persistence.g) j0Var.c;
        gVar.getClass();
        if (iterable.iterator().hasNext()) {
            String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(com.google.android.datatransport.runtime.scheduling.persistence.g.N(iterable));
            SQLiteDatabase sQLiteDatabaseA = gVar.a();
            sQLiteDatabaseA.beginTransaction();
            try {
                sQLiteDatabaseA.compileStatement(strConcat).execute();
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        gVar.z(cursorRawQuery.getInt(0), com.google.android.datatransport.runtime.firebase.transport.c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseA.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseA.setTransactionSuccessful();
                sQLiteDatabaseA.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseA.endTransaction();
                throw th2;
            }
        }
        gVar.m(new com.google.android.datatransport.runtime.scheduling.persistence.d(((com.google.android.datatransport.runtime.time.a) j0Var.g).h() + this.y, iVar));
        return null;
    }

    public /* synthetic */ h(com.google.firebase.concurrent.f fVar, Object obj, long j, TimeUnit timeUnit, int i) {
        this.e = i;
        this.z = fVar;
        this.A = obj;
        this.y = j;
        this.B = timeUnit;
    }
}
