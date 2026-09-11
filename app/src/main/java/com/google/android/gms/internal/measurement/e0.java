package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {
    public static final String[] a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    public static final g0 b;

    static {
        g0 g0Var;
        for (int i = 0; i < 2; i++) {
            g0Var = null;
            try {
                g0Var = (g0) Class.forName(a[i]).asSubclass(g0.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (g0Var != null) {
                b = g0Var;
            }
        }
        g0Var = new g0();
        b = g0Var;
    }
}
