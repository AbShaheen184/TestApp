package androidx.sqlite.driver;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import androidx.datastore.preferences.protobuf.h1;
import androidx.sqlite.db.framework.i;
import coil3.g;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends f {
    public final /* synthetic */ int A = 1;
    public final Object B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.sqlite.db.framework.b bVar, String str) {
        super(bVar, str);
        bVar.getClass();
        str.getClass();
        bVar.getClass();
        str.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = bVar.e.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        this.B = new i(sQLiteStatementCompileStatement);
    }

    @Override // androidx.sqlite.c
    public final String F(int i) {
        switch (this.A) {
            case 0:
                return ((e) this.B).F(i);
            case 1:
                a();
                h1.y(21, "no row");
                throw null;
            default:
                a();
                h1.y(21, "no row");
                throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.h] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.h] */
    @Override // androidx.sqlite.c
    public final boolean Q() throws IllegalAccessException, InvocationTargetException {
        switch (this.A) {
            case 0:
                e eVar = (e) this.B;
                boolean zQ = eVar.Q();
                boolean zEqualsIgnoreCase = eVar.F(0).equalsIgnoreCase("wal");
                androidx.sqlite.db.framework.b bVar = this.e;
                if (zEqualsIgnoreCase) {
                    bVar.e.enableWriteAheadLogging();
                } else {
                    bVar.e.disableWriteAheadLogging();
                }
                return zQ;
            case 1:
                a();
                ((i) this.B).y.execute();
                return false;
            default:
                int iOrdinal = ((c) this.B).ordinal();
                androidx.sqlite.db.framework.b bVar2 = this.e;
                if (iOrdinal == 0) {
                    bVar2.e.setTransactionSuccessful();
                    bVar2.g();
                    return false;
                }
                if (iOrdinal == 1) {
                    bVar2.g();
                    return false;
                }
                if (iOrdinal == 2) {
                    bVar2.a();
                    return false;
                }
                if (iOrdinal == 3) {
                    bVar2.e.beginTransactionNonExclusive();
                    return false;
                }
                if (iOrdinal != 4) {
                    g.a();
                    return false;
                }
                SQLiteDatabase sQLiteDatabase = bVar2.e;
                ?? r3 = androidx.sqlite.db.framework.b.A;
                if (((Method) r3.getValue()) != null) {
                    ?? r4 = androidx.sqlite.db.framework.b.z;
                    if (((Method) r4.getValue()) != null) {
                        Method method = (Method) r3.getValue();
                        method.getClass();
                        Method method2 = (Method) r4.getValue();
                        method2.getClass();
                        Object objInvoke = method2.invoke(sQLiteDatabase, null);
                        if (objInvoke != null) {
                            method.invoke(objInvoke, 0, null, 0, null);
                            return false;
                        }
                        net.luminis.tls.engine.impl.c.r("Required value was null.");
                        return false;
                    }
                }
                bVar2.a();
                return false;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.A) {
            case 0:
                ((e) this.B).close();
                break;
            case 1:
                ((i) this.B).close();
                this.z = true;
                break;
            default:
                this.z = true;
                break;
        }
    }

    @Override // androidx.sqlite.c
    public final void f(int i, long j) {
        switch (this.A) {
            case 0:
                ((e) this.B).f(i, j);
                return;
            case 1:
                a();
                ((i) this.B).f(i, j);
                return;
            default:
                a();
                h1.y(25, "column index out of range");
                throw null;
        }
    }

    @Override // androidx.sqlite.c
    public final int getColumnCount() {
        switch (this.A) {
            case 0:
                return ((e) this.B).getColumnCount();
            case 1:
                a();
                return 0;
            default:
                a();
                return 0;
        }
    }

    @Override // androidx.sqlite.c
    public final String getColumnName(int i) {
        switch (this.A) {
            case 0:
                return ((e) this.B).getColumnName(i);
            case 1:
                a();
                h1.y(21, "no row");
                throw null;
            default:
                a();
                h1.y(21, "no row");
                throw null;
        }
    }

    @Override // androidx.sqlite.c
    public final double getDouble(int i) {
        switch (this.A) {
            case 0:
                return ((e) this.B).getDouble(i);
            case 1:
                a();
                h1.y(21, "no row");
                throw null;
            default:
                a();
                h1.y(21, "no row");
                throw null;
        }
    }

    @Override // androidx.sqlite.c
    public final long getLong(int i) {
        switch (this.A) {
            case 0:
                return ((e) this.B).getLong(i);
            case 1:
                a();
                h1.y(21, "no row");
                throw null;
            default:
                a();
                h1.y(21, "no row");
                throw null;
        }
    }

    @Override // androidx.sqlite.c
    public final void i(int i) {
        switch (this.A) {
            case 0:
                ((e) this.B).i(i);
                return;
            case 1:
                a();
                ((i) this.B).i(i);
                return;
            default:
                a();
                h1.y(25, "column index out of range");
                throw null;
        }
    }

    @Override // androidx.sqlite.c
    public final boolean isNull(int i) {
        switch (this.A) {
            case 0:
                return ((e) this.B).isNull(i);
            case 1:
                a();
                h1.y(21, "no row");
                throw null;
            default:
                a();
                h1.y(21, "no row");
                throw null;
        }
    }

    @Override // androidx.sqlite.driver.f, androidx.sqlite.c
    public void j() {
        switch (this.A) {
            case 0:
                ((e) this.B).j();
                break;
            case 1:
                a();
                ((i) this.B).j();
                break;
            default:
                super.j();
                break;
        }
    }

    @Override // androidx.sqlite.c
    public final void r(int i, String str) {
        switch (this.A) {
            case 0:
                str.getClass();
                ((e) this.B).r(i, str);
                return;
            case 1:
                str.getClass();
                a();
                ((i) this.B).l(i, str);
                return;
            default:
                str.getClass();
                a();
                h1.y(25, "column index out of range");
                throw null;
        }
    }

    @Override // androidx.sqlite.driver.f, androidx.sqlite.c
    public void reset() {
        switch (this.A) {
            case 0:
                ((e) this.B).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // androidx.sqlite.c
    public boolean t() {
        switch (this.A) {
            case 0:
                return ((e) this.B).t();
            default:
                return super.t();
        }
    }

    @Override // androidx.sqlite.c
    public final void u(double d) {
        switch (this.A) {
            case 0:
                ((e) this.B).u(d);
                return;
            case 1:
                a();
                ((i) this.B).G(d, 6);
                return;
            default:
                a();
                h1.y(25, "column index out of range");
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.sqlite.db.framework.b bVar, String str, e eVar) {
        super(bVar, str);
        bVar.getClass();
        str.getClass();
        this.B = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.sqlite.db.framework.b bVar, String str, c cVar) {
        super(bVar, str);
        bVar.getClass();
        str.getClass();
        this.B = cVar;
    }
}
