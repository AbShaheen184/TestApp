package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d3 {
    public static final dc a;
    public static volatile String b;
    public static final s5 c;

    static {
        c3 c3Var = c3.y;
        int i = com.google.common.collect.k0.z;
        hc hcVar = new hc(c3Var, true, com.google.common.collect.h1.G);
        com.appsalt.internal.q0 q0Var = new com.appsalt.internal.q0();
        q0Var.e = hcVar;
        c = new s5(q0Var, 12);
        a = new dc("__phenotype_server_token", q0Var, "");
        b = null;
    }

    public static String a() {
        return (String) a.get();
    }
}
