package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public static u a(long j, Object obj) {
        u uVar = (u) g1.c.h(j, obj);
        if (((s0) uVar).e) {
            return uVar;
        }
        s0 s0Var = (s0) uVar;
        int i = s0Var.z;
        s0 s0VarD = s0Var.d(i == 0 ? 10 : i * 2);
        g1.o(j, obj, s0VarD);
        return s0VarD;
    }
}
