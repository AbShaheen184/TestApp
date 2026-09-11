package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public static x2 d;
    public static final i0 a = new i0(4);
    public static final i0 b = new i0(5);
    public static final androidx.compose.runtime.saveable.f c = new androidx.compose.runtime.saveable.f(28);
    public static final i0 e = new i0(6);
    public static final /* synthetic */ int[] f = {1, 2, 3, 4, 5, 6, 7};

    public static int a(Boolean bool) {
        if (kotlin.jvm.internal.l.a(bool, Boolean.TRUE)) {
            return 2;
        }
        return kotlin.jvm.internal.l.a(bool, Boolean.FALSE) ? 3 : 1;
    }

    public static i3 b(coil3.memory.c cVar, int i) {
        cVar.getClass();
        o0 o0Var = (o0) cVar.z;
        x xVar = (x) cVar.y;
        int iE = androidx.constraintlayout.core.g.e(i);
        if (iE == 0) {
            return new d4(xVar, o0Var);
        }
        if (iE == 1) {
            return new k0(xVar, o0Var);
        }
        coil3.g.a();
        return null;
    }
}
