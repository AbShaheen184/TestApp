package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x1 {
    public static final okio.internal.j a = new okio.internal.j(1);
    public static final t1 b = new t1();
    public static final s1 c = new s1();
    public static final u1 d = new u1();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(m2 m2Var, long j, kotlin.coroutines.jvm.internal.c cVar) {
        v1 v1Var;
        kotlin.jvm.internal.w wVar;
        m2 m2Var2;
        if (cVar instanceof v1) {
            v1Var = (v1) cVar;
            int i = v1Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                v1Var.A = i - Integer.MIN_VALUE;
            } else {
                v1Var = new v1(cVar);
            }
        } else {
            v1Var = new v1(cVar);
        }
        Object obj = v1Var.z;
        int i2 = v1Var.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            wVar = new kotlin.jvm.internal.w();
            androidx.compose.foundation.d dVar = new androidx.compose.foundation.d(m2Var, j, wVar, null, 2);
            v1Var.e = m2Var;
            v1Var.y = wVar;
            v1Var.A = 1;
            Object objF = m2Var.f(androidx.compose.foundation.i1.e, dVar, v1Var);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objF == aVar) {
                return aVar;
            }
            m2Var2 = m2Var;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.jvm.internal.w wVar2 = v1Var.y;
            m2 m2Var3 = v1Var.e;
            kotlin.a.e(obj);
            wVar = wVar2;
            m2Var2 = m2Var3;
        }
        return new androidx.compose.ui.geometry.b(m2Var2.h(wVar.e));
    }

    public static androidx.compose.ui.r b(androidx.compose.foundation.text.h1 h1Var, k1 k1Var, boolean z, boolean z2, androidx.compose.foundation.interaction.k kVar) {
        return new r1(h1Var, k1Var, z, z2, kVar);
    }
}
