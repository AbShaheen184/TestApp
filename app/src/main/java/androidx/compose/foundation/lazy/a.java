package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.k1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public int a;
    public boolean b;
    public int c;
    public float d;
    public Object e;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    public static int a(t tVar, boolean z) {
        return z ? ((u) kotlin.collections.o.S(tVar.k)).a + 1 : ((u) kotlin.collections.o.K(tVar.k)).a - 1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    public static int b(androidx.compose.foundation.lazy.grid.n nVar, boolean z) {
        k1 k1Var = k1.e;
        if (z) {
            androidx.compose.foundation.lazy.grid.o oVar = (androidx.compose.foundation.lazy.grid.o) kotlin.collections.o.S(nVar.m);
            return (nVar.q == k1Var ? oVar.p : oVar.q) + 1;
        }
        androidx.compose.foundation.lazy.grid.o oVar2 = (androidx.compose.foundation.lazy.grid.o) kotlin.collections.o.K(nVar.m);
        return (nVar.q == k1Var ? oVar2.p : oVar2.q) - 1;
    }
}
