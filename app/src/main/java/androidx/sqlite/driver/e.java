package androidx.sqlite.driver;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.datastore.preferences.protobuf.h1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f {
    public int[] A;
    public long[] B;
    public double[] C;
    public String[] D;
    public byte[][] E;
    public Cursor F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.sqlite.db.framework.b bVar, String str) {
        super(bVar, str);
        bVar.getClass();
        str.getClass();
        this.A = new int[0];
        this.B = new long[0];
        this.C = new double[0];
        this.D = new String[0];
        this.E = new byte[0][];
    }

    public static void w(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            h1.y(25, "column index out of range");
            throw null;
        }
    }

    @Override // androidx.sqlite.c
    public final String F(int i) {
        a();
        Cursor cursorZ = z();
        w(cursorZ, i);
        String string = cursorZ.getString(i);
        string.getClass();
        return string;
    }

    @Override // androidx.sqlite.c
    public final boolean Q() {
        a();
        m();
        Cursor cursor = this.F;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        net.luminis.tls.engine.impl.c.r("Required value was null.");
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.z) {
            j();
            reset();
        }
        this.z = true;
    }

    @Override // androidx.sqlite.c
    public final void f(int i, long j) {
        a();
        g(1, i);
        this.A[i] = 1;
        this.B[i] = j;
    }

    public final void g(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.A;
        if (iArr.length < i3) {
            this.A = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.B;
            if (jArr.length < i3) {
                this.B = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.C;
            if (dArr.length < i3) {
                this.C = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.D;
            if (strArr.length < i3) {
                this.D = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.E;
        if (bArr.length < i3) {
            this.E = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // androidx.sqlite.c
    public final int getColumnCount() {
        a();
        m();
        Cursor cursor = this.F;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // androidx.sqlite.c
    public final String getColumnName(int i) {
        a();
        m();
        Cursor cursor = this.F;
        if (cursor == null) {
            net.luminis.tls.engine.impl.c.r("Required value was null.");
            return null;
        }
        w(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // androidx.sqlite.c
    public final double getDouble(int i) {
        a();
        Cursor cursorZ = z();
        w(cursorZ, i);
        return cursorZ.getDouble(i);
    }

    @Override // androidx.sqlite.c
    public final long getLong(int i) {
        a();
        Cursor cursorZ = z();
        w(cursorZ, i);
        return cursorZ.getLong(i);
    }

    @Override // androidx.sqlite.c
    public final void i(int i) {
        a();
        g(5, i);
        this.A[i] = 5;
    }

    @Override // androidx.sqlite.c
    public final boolean isNull(int i) {
        a();
        Cursor cursorZ = z();
        w(cursorZ, i);
        return cursorZ.isNull(i);
    }

    @Override // androidx.sqlite.driver.f, androidx.sqlite.c
    public final void j() {
        a();
        this.A = new int[0];
        this.B = new long[0];
        this.C = new double[0];
        this.D = new String[0];
        this.E = new byte[0][];
    }

    public final void m() {
        if (this.F == null) {
            androidx.media3.exoplayer.hls.c cVar = new androidx.media3.exoplayer.hls.c(this);
            androidx.sqlite.db.framework.b bVar = this.e;
            bVar.getClass();
            final androidx.compose.ui.text.platform.c cVar2 = new androidx.compose.ui.text.platform.c(cVar, 1);
            Cursor cursorRawQueryWithFactory = bVar.e.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.a
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return (Cursor) cVar2.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, ((e) cVar.e).y, androidx.sqlite.db.framework.b.y, null);
            cursorRawQueryWithFactory.getClass();
            this.F = cursorRawQueryWithFactory;
        }
    }

    @Override // androidx.sqlite.c
    public final void r(int i, String str) {
        str.getClass();
        a();
        g(3, i);
        this.A[i] = 3;
        this.D[i] = str;
    }

    @Override // androidx.sqlite.driver.f, androidx.sqlite.c
    public final void reset() {
        a();
        Cursor cursor = this.F;
        if (cursor != null) {
            cursor.close();
        }
        this.F = null;
    }

    @Override // androidx.sqlite.c
    public final void u(double d) {
        a();
        g(2, 6);
        this.A[6] = 2;
        this.C[6] = d;
    }

    public final Cursor z() {
        Cursor cursor = this.F;
        if (cursor != null) {
            return cursor;
        }
        h1.y(21, "no row");
        throw null;
    }
}
