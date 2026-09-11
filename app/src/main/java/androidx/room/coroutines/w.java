package androidx.room.coroutines;

import androidx.datastore.preferences.protobuf.h1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements androidx.sqlite.c {
    public final androidx.sqlite.c e;
    public final long y;
    public final /* synthetic */ c0 z;

    public w(c0 c0Var, androidx.sqlite.c cVar) {
        cVar.getClass();
        this.z = c0Var;
        this.e = cVar;
        this.y = coil3.network.g.k();
    }

    @Override // androidx.sqlite.c
    public final String F(int i) {
        if (this.z.e) {
            h1.y(21, "Statement is recycled");
            throw null;
        }
        if (this.y == coil3.network.g.k()) {
            return this.e.F(i);
        }
        h1.y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.c
    public final boolean Q() {
        if (this.z.e) {
            h1.y(21, "Statement is recycled");
            throw null;
        }
        if (this.y == coil3.network.g.k()) {
            return this.e.Q();
        }
        h1.y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.z.e) {
            h1.y(21, "Statement is recycled");
            throw null;
        }
        if (this.y == coil3.network.g.k()) {
            this.e.close();
        } else {
            h1.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.c
    public final void f(int i, long j) {
        if (this.z.e) {
            h1.y(21, "Statement is recycled");
            throw null;
        }
        if (this.y == coil3.network.g.k()) {
            this.e.f(i, j);
        } else {
            h1.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.c
    public final int getColumnCount() {
        if (this.z.e) {
            h1.y(21, "Statement is recycled");
            throw null;
        }
        if (this.y == coil3.network.g.k()) {
            return this.e.getColumnCount();
        }
        h1.y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.c
    public final String getColumnName(int i) {
        if (this.z.e) {
            h1.y(21, "Statement is recycled");
            throw null;
        }
        if (this.y == coil3.network.g.k()) {
            return this.e.getColumnName(i);
        }
        h1.y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.c
    public final double getDouble(int i) {
        if (this.z.e) {
            h1.y(21, "Statement is recycled");
            throw null;
        }
        if (this.y == coil3.network.g.k()) {
            return this.e.getDouble(i);
        }
        h1.y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.c
    public final long getLong(int i) {
        if (this.z.e) {
            h1.y(21, "Statement is recycled");
            throw null;
        }
        if (this.y == coil3.network.g.k()) {
            return this.e.getLong(i);
        }
        h1.y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.c
    public final void i(int i) {
        if (this.z.e) {
            h1.y(21, "Statement is recycled");
            throw null;
        }
        if (this.y == coil3.network.g.k()) {
            this.e.i(i);
        } else {
            h1.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.c
    public final boolean isNull(int i) {
        if (this.z.e) {
            h1.y(21, "Statement is recycled");
            throw null;
        }
        if (this.y == coil3.network.g.k()) {
            return this.e.isNull(i);
        }
        h1.y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // androidx.sqlite.c
    public final void j() {
        if (this.z.e) {
            h1.y(21, "Statement is recycled");
            throw null;
        }
        if (this.y == coil3.network.g.k()) {
            this.e.j();
        } else {
            h1.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.c
    public final void r(int i, String str) {
        str.getClass();
        if (this.z.e) {
            h1.y(21, "Statement is recycled");
            throw null;
        }
        if (this.y == coil3.network.g.k()) {
            this.e.r(i, str);
        } else {
            h1.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.c
    public final void reset() {
        if (this.z.e) {
            h1.y(21, "Statement is recycled");
            throw null;
        }
        if (this.y == coil3.network.g.k()) {
            this.e.reset();
        } else {
            h1.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // androidx.sqlite.c
    public final void u(double d) {
        if (this.z.e) {
            h1.y(21, "Statement is recycled");
            throw null;
        }
        if (this.y == coil3.network.g.k()) {
            this.e.u(d);
        } else {
            h1.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
