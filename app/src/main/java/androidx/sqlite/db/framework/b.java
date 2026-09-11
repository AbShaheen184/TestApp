package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Closeable {
    public static final Object A;
    public static final String[] y = new String[0];
    public static final Object z;
    public final SQLiteDatabase e;

    static {
        androidx.compose.runtime.saveable.f fVar = new androidx.compose.runtime.saveable.f(12);
        kotlin.i iVar = kotlin.i.e;
        z = kotlin.a.c(iVar, fVar);
        A = kotlin.a.c(iVar, new androidx.compose.runtime.saveable.f(13));
    }

    public b(SQLiteDatabase sQLiteDatabase) {
        this.e = sQLiteDatabase;
    }

    public final boolean H() {
        return this.e.inTransaction();
    }

    public final void a() {
        this.e.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    public final void g() {
        this.e.endTransaction();
    }

    public final boolean isOpen() {
        return this.e.isOpen();
    }

    public final void m(String str) {
        this.e.execSQL(str);
    }
}
