package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class lf extends mf {
    public static final mf e;
    public static final mf f;

    static {
        mf mfVarB = new lf(null, new androidx.collection.y0(0)).b();
        e = mfVarB;
        lf lfVar = new lf(mfVarB, new androidx.collection.y0(0));
        boolean z = !lfVar.c;
        Boolean bool = Boolean.TRUE;
        com.google.android.material.motion.a.p("Can't mutate after handing to trace", z);
        com.google.android.material.motion.a.p("Key already present", !lfVar.c());
        lfVar.b.put(mf.d, bool);
        f = lfVar.b();
    }
}
