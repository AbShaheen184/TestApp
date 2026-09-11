package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    public static t0 a(long j, Object obj) {
        t0 t0Var = (t0) l2.c.k(j, obj);
        if (((c) t0Var).e) {
            return t0Var;
        }
        int size = t0Var.size();
        t0 t0VarM = t0Var.m(size == 0 ? 10 : size * 2);
        l2.p(j, obj, t0VarM);
        return t0VarM;
    }
}
