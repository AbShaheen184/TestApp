package androidx.room.coroutines;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements androidx.sqlite.c {
    public final androidx.sqlite.c e;

    public h(androidx.sqlite.c cVar) {
        this.e = cVar;
    }

    @Override // androidx.sqlite.c
    public final String F(int i) {
        return this.e.F(i);
    }

    @Override // androidx.sqlite.c
    public final boolean Q() {
        return this.e.Q();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        androidx.sqlite.c cVar = this.e;
        cVar.reset();
        cVar.j();
    }

    @Override // androidx.sqlite.c
    public final void f(int i, long j) {
        this.e.f(i, j);
    }

    @Override // androidx.sqlite.c
    public final int getColumnCount() {
        return this.e.getColumnCount();
    }

    @Override // androidx.sqlite.c
    public final String getColumnName(int i) {
        return this.e.getColumnName(i);
    }

    @Override // androidx.sqlite.c
    public final double getDouble(int i) {
        return this.e.getDouble(i);
    }

    @Override // androidx.sqlite.c
    public final long getLong(int i) {
        return this.e.getLong(i);
    }

    @Override // androidx.sqlite.c
    public final void i(int i) {
        this.e.i(i);
    }

    @Override // androidx.sqlite.c
    public final boolean isNull(int i) {
        return this.e.isNull(i);
    }

    @Override // androidx.sqlite.c
    public final void j() {
        this.e.j();
    }

    @Override // androidx.sqlite.c
    public final void r(int i, String str) {
        str.getClass();
        this.e.r(i, str);
    }

    @Override // androidx.sqlite.c
    public final void reset() {
        this.e.reset();
    }

    @Override // androidx.sqlite.c
    public final boolean t() {
        return this.e.t();
    }

    @Override // androidx.sqlite.c
    public final void u(double d) {
        this.e.u(d);
    }
}
