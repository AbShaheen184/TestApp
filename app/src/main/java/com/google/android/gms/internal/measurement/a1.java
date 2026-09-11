package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {
    public static volatile a1 a;
    public static final a1 b;

    static {
        a1 a1Var = new a1();
        Map map = Collections.EMPTY_MAP;
        b = a1Var;
    }

    public static a1 a() {
        a1 a1Var = a;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (a1.class) {
            try {
                a1 a1Var2 = a;
                if (a1Var2 != null) {
                    return a1Var2;
                }
                int i = o0.a;
                a1 a1VarD = e1.d();
                a = a1VarD;
                return a1VarD;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
