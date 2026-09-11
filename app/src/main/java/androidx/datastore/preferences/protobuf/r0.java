package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    public static final r0 c = new r0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final d0 a = new d0();

    public final u0 a(Class cls) {
        m mVar;
        u0 u0VarW;
        Class cls2;
        v.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        u0 u0Var = (u0) concurrentHashMap.get(cls);
        if (u0Var != null) {
            return u0Var;
        }
        d0 d0Var = this.a;
        d0Var.getClass();
        Class cls3 = v0.a;
        if (!t.class.isAssignableFrom(cls) && (cls2 = v0.a) != null && !cls2.isAssignableFrom(cls)) {
            net.luminis.tls.engine.impl.c.o("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        t0 t0VarA = ((c0) d0Var.a).a(cls);
        int i = t0VarA.d;
        a aVar = t0VarA.a;
        if ((i & 2) == 2) {
            if (t.class.isAssignableFrom(cls)) {
                u0VarW = new m0(v0.c, n.a, aVar);
            } else {
                b1 b1Var = v0.b;
                m mVar2 = n.b;
                if (mVar2 == null) {
                    net.luminis.tls.engine.impl.c.r("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                u0VarW = new m0(b1Var, mVar2, aVar);
            }
        } else if (t.class.isAssignableFrom(cls)) {
            n0 n0Var = o0.b;
            a0 a0Var = b0.b;
            b1 b1Var2 = v0.c;
            m mVar3 = androidx.constraintlayout.core.g.e(t0VarA.a()) != 1 ? n.a : null;
            h0 h0Var = i0.b;
            if (!(t0VarA instanceof t0)) {
                int[] iArr = l0.n;
                t0VarA.getClass();
                androidx.transition.k.i();
                return null;
            }
            u0VarW = l0.w(t0VarA, n0Var, a0Var, b1Var2, mVar3, h0Var);
        } else {
            n0 n0Var2 = o0.a;
            a0 a0Var2 = b0.a;
            b1 b1Var3 = v0.b;
            if (androidx.constraintlayout.core.g.e(t0VarA.a()) != 1) {
                m mVar4 = n.b;
                if (mVar4 == null) {
                    net.luminis.tls.engine.impl.c.r("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                mVar = mVar4;
            } else {
                mVar = null;
            }
            h0 h0Var2 = i0.a;
            if (!(t0VarA instanceof t0)) {
                int[] iArr2 = l0.n;
                t0VarA.getClass();
                androidx.transition.k.i();
                return null;
            }
            u0VarW = l0.w(t0VarA, n0Var2, a0Var2, b1Var3, mVar, h0Var2);
        }
        u0 u0Var2 = (u0) concurrentHashMap.putIfAbsent(cls, u0VarW);
        return u0Var2 != null ? u0Var2 : u0VarW;
    }
}
