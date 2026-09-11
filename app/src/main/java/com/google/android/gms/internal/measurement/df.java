package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class df extends c4 {
    public final HashMap A;
    public final s5 z;

    public df(s5 s5Var) {
        super("require");
        this.A = new HashMap();
        this.z = s5Var;
    }

    @Override // com.google.android.gms.internal.measurement.c4
    public final d5 a(b7 b7Var, List list) {
        d5 d5Var;
        ea.c("require", 1, list);
        String strD = ((j5) b7Var.z).f(b7Var, (d5) list.get(0)).d();
        HashMap map = this.A;
        if (map.containsKey(strD)) {
            return (d5) map.get(strD);
        }
        HashMap map2 = (HashMap) this.z.y;
        if (map2.containsKey(strD)) {
            try {
                d5Var = (d5) ((Callable) map2.get(strD)).call();
            } catch (Exception unused) {
                net.luminis.tls.engine.impl.c.r("Failed to create API implementation: ".concat(String.valueOf(strD)));
                return null;
            }
        } else {
            d5Var = d5.m;
        }
        if (d5Var instanceof c4) {
            map.put(strD, (c4) d5Var);
        }
        return d5Var;
    }
}
