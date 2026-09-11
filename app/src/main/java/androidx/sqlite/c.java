package androidx.sqlite;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface c extends AutoCloseable {
    String F(int i);

    boolean Q();

    void f(int i, long j);

    int getColumnCount();

    String getColumnName(int i);

    double getDouble(int i);

    long getLong(int i);

    void i(int i);

    boolean isNull(int i);

    void j();

    void r(int i, String str);

    void reset();

    default boolean t() {
        return getLong(0) != 0;
    }

    void u(double d);
}
