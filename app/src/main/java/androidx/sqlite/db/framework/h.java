package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class h implements androidx.sqlite.db.b {
    public final SQLiteProgram e;

    public h(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.e = sQLiteProgram;
    }

    @Override // androidx.sqlite.db.b
    public final void C(byte[] bArr, int i) {
        this.e.bindBlob(i, bArr);
    }

    @Override // androidx.sqlite.db.b
    public final void G(double d, int i) {
        this.e.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    @Override // androidx.sqlite.db.b
    public final void f(int i, long j) {
        this.e.bindLong(i, j);
    }

    @Override // androidx.sqlite.db.b
    public final void i(int i) {
        this.e.bindNull(i);
    }

    @Override // androidx.sqlite.db.b
    public final void j() {
        this.e.clearBindings();
    }

    @Override // androidx.sqlite.db.b
    public final void l(int i, String str) {
        str.getClass();
        this.e.bindString(i, str);
    }
}
