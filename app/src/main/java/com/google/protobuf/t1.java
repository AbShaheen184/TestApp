package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {
    public static final t1 c = new t1();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final f1 a = new f1(0);

    public final a2 a(Class cls) {
        b0 b0Var;
        a2 a2VarA;
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (a2) obj;
        }
        f1 f1Var = this.a;
        f1Var.getClass();
        Class cls2 = b2.a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            Class cls3 = d.a;
            Class cls4 = b2.a;
            if (cls4 != null && !cls4.isAssignableFrom(cls)) {
                net.luminis.tls.engine.impl.c.o("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
        }
        v1 v1VarA = ((e1) f1Var.a).a(cls);
        int i = v1VarA.d;
        l1 l1Var = v1VarA.a;
        if ((i & 2) == 2) {
            Class cls5 = d.a;
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                a2VarA = new o1(b2.c, c0.a, l1Var);
            } else {
                g2 g2Var = b2.b;
                b0 b0Var2 = c0.b;
                if (b0Var2 == null) {
                    net.luminis.tls.engine.impl.c.r("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                a2VarA = new o1(g2Var, b0Var2, l1Var);
            }
        } else {
            Class cls6 = d.a;
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                p1 p1Var = q1.b;
                b1 b1Var = c1.b;
                g2 g2Var2 = b2.c;
                b0 b0Var3 = androidx.constraintlayout.core.g.e(v1VarA.a()) != 1 ? c0.a : null;
                h1 h1Var = i1.b;
                if (!(v1VarA instanceof v1)) {
                    int[] iArr = n1.n;
                    v1VarA.getClass();
                    androidx.transition.k.i();
                    return null;
                }
                a2VarA = n1.A(v1VarA, p1Var, b1Var, g2Var2, b0Var3, h1Var);
            } else {
                p1 p1Var2 = q1.a;
                b1 b1Var2 = c1.a;
                g2 g2Var3 = b2.b;
                if (androidx.constraintlayout.core.g.e(v1VarA.a()) != 1) {
                    b0 b0Var4 = c0.b;
                    if (b0Var4 == null) {
                        net.luminis.tls.engine.impl.c.r("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                    b0Var = b0Var4;
                } else {
                    b0Var = null;
                }
                h1 h1Var2 = i1.a;
                if (!(v1VarA instanceof v1)) {
                    int[] iArr2 = n1.n;
                    v1VarA.getClass();
                    androidx.transition.k.i();
                    return null;
                }
                a2VarA = n1.A(v1VarA, p1Var2, b1Var2, g2Var3, b0Var, h1Var2);
            }
        }
        byte[] bArr = u0.a;
        a2 a2Var = (a2) concurrentHashMap.putIfAbsent(cls, a2VarA);
        return a2Var != null ? a2Var : a2VarA;
    }
}
