package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 {
    public static final j2 c = new j2();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final s5 a = new s5(1);

    public final m2 a(Class cls) {
        m2 m2VarZ;
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (m2) obj;
        }
        s5 s5Var = this.a;
        s5Var.getClass();
        f1 f1Var = n2.a;
        if (!i1.class.isAssignableFrom(cls)) {
            int i = o0.a;
        }
        l2 l2VarB = ((s5) s5Var.y).b(cls);
        if ((l2VarB.d & 2) == 2) {
            int i2 = o0.a;
            f1 f1Var2 = n2.a;
            f1 f1Var3 = b1.a;
            m2VarZ = new f2(f1Var2, l2VarB.a);
        } else {
            int i3 = o0.a;
            int i4 = g2.a;
            int i5 = w1.a;
            f1 f1Var4 = n2.a;
            f1 f1Var5 = l2VarB.a() + (-1) != 1 ? b1.a : null;
            int i6 = a2.a;
            m2VarZ = e2.z(l2VarB, f1Var4, f1Var5);
        }
        m2 m2Var = (m2) concurrentHashMap.putIfAbsent(cls, m2VarZ);
        return m2Var != null ? m2Var : m2VarZ;
    }
}
