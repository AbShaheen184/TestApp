package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface z4 {
    static d5 k(z4 z4Var, g5 g5Var, b7 b7Var, ArrayList arrayList) {
        String str = g5Var.e;
        if (z4Var.i(str)) {
            d5 d5VarE = z4Var.e(str);
            if (d5VarE instanceof c4) {
                return ((c4) d5VarE).a(b7Var, arrayList);
            }
            net.luminis.tls.engine.impl.c.o(androidx.constraintlayout.core.g.c(str, " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            ea.c("hasOwnProperty", 1, arrayList);
            return z4Var.i(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).d()) ? d5.r : d5.s;
        }
        net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Object has no function ", str));
        return null;
    }

    d5 e(String str);

    void f(String str, d5 d5Var);

    boolean i(String str);
}
