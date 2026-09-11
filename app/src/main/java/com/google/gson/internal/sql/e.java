package com.google.gson.internal.sql;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final boolean a;
    public static final a.C0000a b;
    public static final b.a c;
    public static final c d;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = a.b;
            c = b.b;
            d = d.b;
        } else {
            b = null;
            c = null;
            d = null;
        }
    }
}
