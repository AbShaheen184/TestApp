package com.google.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b2 {
    public static final Class a;
    public static final g2 b;
    public static final g2 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        Class cls3 = d.a;
        g2 g2Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            Class cls4 = d.a;
            try {
                cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                g2Var = (g2) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = g2Var;
        c = new g2();
    }

    public static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m0)) {
            int iG = 0;
            while (i < size) {
                iG += w.g(((Integer) list.get(i)).intValue());
                i++;
            }
            return iG;
        }
        m0 m0Var = (m0) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += w.g(m0Var.e(i));
            i++;
        }
        return iG2;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (w.e(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (w.e(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m0)) {
            int iG = 0;
            while (i < size) {
                iG += w.g(((Integer) list.get(i)).intValue());
                i++;
            }
            return iG;
        }
        m0 m0Var = (m0) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += w.g(m0Var.e(i));
            i++;
        }
        return iG2;
    }

    public static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof d1)) {
            int iG = 0;
            while (i < size) {
                iG += w.g(((Long) list.get(i)).longValue());
                i++;
            }
            return iG;
        }
        d1 d1Var = (d1) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += w.g(d1Var.e(i));
            i++;
        }
        return iG2;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m0)) {
            int iC = 0;
            while (i < size) {
                iC += w.c(((Integer) list.get(i)).intValue());
                i++;
            }
            return iC;
        }
        m0 m0Var = (m0) list;
        int iC2 = 0;
        while (i < size) {
            iC2 += w.c(m0Var.e(i));
            i++;
        }
        return iC2;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof d1)) {
            int iD = 0;
            while (i < size) {
                iD += w.d(((Long) list.get(i)).longValue());
                i++;
            }
            return iD;
        }
        d1 d1Var = (d1) list;
        int iD2 = 0;
        while (i < size) {
            iD2 += w.d(d1Var.e(i));
            i++;
        }
        return iD2;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m0)) {
            int iF = 0;
            while (i < size) {
                iF += w.f(((Integer) list.get(i)).intValue());
                i++;
            }
            return iF;
        }
        m0 m0Var = (m0) list;
        int iF2 = 0;
        while (i < size) {
            iF2 += w.f(m0Var.e(i));
            i++;
        }
        return iF2;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof d1)) {
            int iG = 0;
            while (i < size) {
                iG += w.g(((Long) list.get(i)).longValue());
                i++;
            }
            return iG;
        }
        d1 d1Var = (d1) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += w.g(d1Var.e(i));
            i++;
        }
        return iG2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void k(g2 g2Var, Object obj, Object obj2) {
        g2Var.getClass();
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        f2 f2VarE = generatedMessageLite.unknownFields;
        f2 f2Var = ((GeneratedMessageLite) obj2).unknownFields;
        f2 f2Var2 = f2.f;
        if (!f2Var2.equals(f2Var)) {
            if (f2Var2.equals(f2VarE)) {
                f2VarE = f2.e(f2VarE, f2Var);
            } else {
                f2VarE.getClass();
                if (!f2Var.equals(f2Var2)) {
                    f2VarE.a();
                    int i = f2VarE.a + f2Var.a;
                    f2VarE.b(i);
                    System.arraycopy(f2Var.b, 0, f2VarE.b, f2VarE.a, f2Var.a);
                    System.arraycopy(f2Var.c, 0, f2VarE.c, f2VarE.a, f2Var.a);
                    f2VarE.a = i;
                }
            }
        }
        generatedMessageLite.unknownFields = f2VarE;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, f1 f1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof e;
        w wVar = (w) f1Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    wVar.i(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            wVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                boolean z3 = w.b;
                i3++;
            }
            wVar.x(i3);
            while (i2 < list.size()) {
                wVar.h(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        e eVar = (e) list;
        if (!z) {
            while (i2 < eVar.z) {
                eVar.d(i2);
                wVar.i(i, eVar.y[i2]);
                i2++;
            }
            return;
        }
        wVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eVar.z; i6++) {
            eVar.d(i6);
            boolean z4 = eVar.y[i6];
            boolean z5 = w.b;
            i5++;
        }
        wVar.x(i5);
        while (i2 < eVar.z) {
            eVar.d(i2);
            wVar.h(eVar.y[i2] ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, f1 f1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof x;
        w wVar = (w) f1Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                    wVar.getClass();
                    wVar.o(i, Double.doubleToRawLongBits(dDoubleValue));
                    i2++;
                }
                return;
            }
            wVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                boolean z3 = w.b;
                i3 += 8;
            }
            wVar.x(i3);
            while (i2 < list.size()) {
                wVar.p(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        x xVar = (x) list;
        if (!z) {
            while (i2 < xVar.z) {
                xVar.d(i2);
                double d = xVar.y[i2];
                wVar.getClass();
                wVar.o(i, Double.doubleToRawLongBits(d));
                i2++;
            }
            return;
        }
        wVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < xVar.z; i6++) {
            xVar.d(i6);
            double d2 = xVar.y[i6];
            boolean z4 = w.b;
            i5 += 8;
        }
        wVar.x(i5);
        while (i2 < xVar.z) {
            xVar.d(i2);
            wVar.p(Double.doubleToRawLongBits(xVar.y[i2]));
            i2++;
        }
    }

    public static void o(int i, List list, f1 f1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof m0;
        w wVar = (w) f1Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    wVar.q(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            wVar.v(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += w.g(((Integer) list.get(i3)).intValue());
            }
            wVar.x(iG);
            while (i2 < list.size()) {
                wVar.r(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        m0 m0Var = (m0) list;
        if (!z) {
            while (i2 < m0Var.z) {
                wVar.q(i, m0Var.e(i2));
                i2++;
            }
            return;
        }
        wVar.v(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < m0Var.z; i4++) {
            iG2 += w.g(m0Var.e(i4));
        }
        wVar.x(iG2);
        while (i2 < m0Var.z) {
            wVar.r(m0Var.e(i2));
            i2++;
        }
    }

    public static void p(int i, List list, f1 f1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof m0;
        w wVar = (w) f1Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    wVar.m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            wVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                boolean z3 = w.b;
                i3 += 4;
            }
            wVar.x(i3);
            while (i2 < list.size()) {
                wVar.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        m0 m0Var = (m0) list;
        if (!z) {
            while (i2 < m0Var.z) {
                wVar.m(i, m0Var.e(i2));
                i2++;
            }
            return;
        }
        wVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < m0Var.z; i6++) {
            m0Var.e(i6);
            boolean z4 = w.b;
            i5 += 4;
        }
        wVar.x(i5);
        while (i2 < m0Var.z) {
            wVar.n(m0Var.e(i2));
            i2++;
        }
    }

    public static void q(int i, List list, f1 f1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof d1;
        w wVar = (w) f1Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    wVar.o(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            wVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                boolean z3 = w.b;
                i3 += 8;
            }
            wVar.x(i3);
            while (i2 < list.size()) {
                wVar.p(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        d1 d1Var = (d1) list;
        if (!z) {
            while (i2 < d1Var.z) {
                wVar.o(i, d1Var.e(i2));
                i2++;
            }
            return;
        }
        wVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < d1Var.z; i6++) {
            d1Var.e(i6);
            boolean z4 = w.b;
            i5 += 8;
        }
        wVar.x(i5);
        while (i2 < d1Var.z) {
            wVar.p(d1Var.e(i2));
            i2++;
        }
    }

    public static void r(int i, List list, f1 f1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof f0;
        w wVar = (w) f1Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    float fFloatValue = ((Float) list.get(i2)).floatValue();
                    wVar.getClass();
                    wVar.m(i, Float.floatToRawIntBits(fFloatValue));
                    i2++;
                }
                return;
            }
            wVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                boolean z3 = w.b;
                i3 += 4;
            }
            wVar.x(i3);
            while (i2 < list.size()) {
                wVar.n(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        f0 f0Var = (f0) list;
        if (!z) {
            while (i2 < f0Var.z) {
                f0Var.d(i2);
                float f = f0Var.y[i2];
                wVar.getClass();
                wVar.m(i, Float.floatToRawIntBits(f));
                i2++;
            }
            return;
        }
        wVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < f0Var.z; i6++) {
            f0Var.d(i6);
            float f2 = f0Var.y[i6];
            boolean z4 = w.b;
            i5 += 4;
        }
        wVar.x(i5);
        while (i2 < f0Var.z) {
            f0Var.d(i2);
            wVar.n(Float.floatToRawIntBits(f0Var.y[i2]));
            i2++;
        }
    }

    public static void s(int i, List list, f1 f1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof m0;
        w wVar = (w) f1Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    wVar.q(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            wVar.v(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += w.g(((Integer) list.get(i3)).intValue());
            }
            wVar.x(iG);
            while (i2 < list.size()) {
                wVar.r(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        m0 m0Var = (m0) list;
        if (!z) {
            while (i2 < m0Var.z) {
                wVar.q(i, m0Var.e(i2));
                i2++;
            }
            return;
        }
        wVar.v(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < m0Var.z; i4++) {
            iG2 += w.g(m0Var.e(i4));
        }
        wVar.x(iG2);
        while (i2 < m0Var.z) {
            wVar.r(m0Var.e(i2));
            i2++;
        }
    }

    public static void t(int i, List list, f1 f1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof d1;
        w wVar = (w) f1Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    wVar.y(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            wVar.v(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += w.g(((Long) list.get(i3)).longValue());
            }
            wVar.x(iG);
            while (i2 < list.size()) {
                wVar.z(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        d1 d1Var = (d1) list;
        if (!z) {
            while (i2 < d1Var.z) {
                wVar.y(i, d1Var.e(i2));
                i2++;
            }
            return;
        }
        wVar.v(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < d1Var.z; i4++) {
            iG2 += w.g(d1Var.e(i4));
        }
        wVar.x(iG2);
        while (i2 < d1Var.z) {
            wVar.z(d1Var.e(i2));
            i2++;
        }
    }

    public static void u(int i, List list, f1 f1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof m0;
        w wVar = (w) f1Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    wVar.m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            wVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                boolean z3 = w.b;
                i3 += 4;
            }
            wVar.x(i3);
            while (i2 < list.size()) {
                wVar.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        m0 m0Var = (m0) list;
        if (!z) {
            while (i2 < m0Var.z) {
                wVar.m(i, m0Var.e(i2));
                i2++;
            }
            return;
        }
        wVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < m0Var.z; i6++) {
            m0Var.e(i6);
            boolean z4 = w.b;
            i5 += 4;
        }
        wVar.x(i5);
        while (i2 < m0Var.z) {
            wVar.n(m0Var.e(i2));
            i2++;
        }
    }

    public static void v(int i, List list, f1 f1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof d1;
        w wVar = (w) f1Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    wVar.o(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            wVar.v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                boolean z3 = w.b;
                i3 += 8;
            }
            wVar.x(i3);
            while (i2 < list.size()) {
                wVar.p(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        d1 d1Var = (d1) list;
        if (!z) {
            while (i2 < d1Var.z) {
                wVar.o(i, d1Var.e(i2));
                i2++;
            }
            return;
        }
        wVar.v(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < d1Var.z; i6++) {
            d1Var.e(i6);
            boolean z4 = w.b;
            i5 += 8;
        }
        wVar.x(i5);
        while (i2 < d1Var.z) {
            wVar.p(d1Var.e(i2));
            i2++;
        }
    }

    public static void w(int i, List list, f1 f1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof m0;
        w wVar = (w) f1Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    wVar.w(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            wVar.v(i, 2);
            int iC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iC += w.c(((Integer) list.get(i3)).intValue());
            }
            wVar.x(iC);
            while (i2 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i2)).intValue();
                wVar.x((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        m0 m0Var = (m0) list;
        if (!z) {
            while (i2 < m0Var.z) {
                int iE = m0Var.e(i2);
                wVar.w(i, (iE >> 31) ^ (iE << 1));
                i2++;
            }
            return;
        }
        wVar.v(i, 2);
        int iC2 = 0;
        for (int i4 = 0; i4 < m0Var.z; i4++) {
            iC2 += w.c(m0Var.e(i4));
        }
        wVar.x(iC2);
        while (i2 < m0Var.z) {
            int iE2 = m0Var.e(i2);
            wVar.x((iE2 >> 31) ^ (iE2 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, f1 f1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof d1;
        w wVar = (w) f1Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    wVar.y(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            wVar.v(i, 2);
            int iD = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iD += w.d(((Long) list.get(i3)).longValue());
            }
            wVar.x(iD);
            while (i2 < list.size()) {
                long jLongValue2 = ((Long) list.get(i2)).longValue();
                wVar.z((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        d1 d1Var = (d1) list;
        if (!z) {
            while (i2 < d1Var.z) {
                long jE = d1Var.e(i2);
                wVar.y(i, (jE >> 63) ^ (jE << 1));
                i2++;
            }
            return;
        }
        wVar.v(i, 2);
        int iD2 = 0;
        for (int i4 = 0; i4 < d1Var.z; i4++) {
            iD2 += w.d(d1Var.e(i4));
        }
        wVar.x(iD2);
        while (i2 < d1Var.z) {
            long jE2 = d1Var.e(i2);
            wVar.z((jE2 >> 63) ^ (jE2 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, f1 f1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof m0;
        w wVar = (w) f1Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    wVar.w(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            wVar.v(i, 2);
            int iF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iF += w.f(((Integer) list.get(i3)).intValue());
            }
            wVar.x(iF);
            while (i2 < list.size()) {
                wVar.x(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        m0 m0Var = (m0) list;
        if (!z) {
            while (i2 < m0Var.z) {
                wVar.w(i, m0Var.e(i2));
                i2++;
            }
            return;
        }
        wVar.v(i, 2);
        int iF2 = 0;
        for (int i4 = 0; i4 < m0Var.z; i4++) {
            iF2 += w.f(m0Var.e(i4));
        }
        wVar.x(iF2);
        while (i2 < m0Var.z) {
            wVar.x(m0Var.e(i2));
            i2++;
        }
    }

    public static void z(int i, List list, f1 f1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof d1;
        w wVar = (w) f1Var.a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    wVar.y(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            wVar.v(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += w.g(((Long) list.get(i3)).longValue());
            }
            wVar.x(iG);
            while (i2 < list.size()) {
                wVar.z(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        d1 d1Var = (d1) list;
        if (!z) {
            while (i2 < d1Var.z) {
                wVar.y(i, d1Var.e(i2));
                i2++;
            }
            return;
        }
        wVar.v(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < d1Var.z; i4++) {
            iG2 += w.g(d1Var.e(i4));
        }
        wVar.x(iG2);
        while (i2 < d1Var.z) {
            wVar.z(d1Var.e(i2));
            i2++;
        }
    }

    public static Object j(Object obj, int i, t0 t0Var, Object obj2, g2 g2Var) {
        return obj2;
    }
}
