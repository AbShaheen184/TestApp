package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n2 {
    public static final f1 a;

    static {
        int i = o0.a;
        a = new f1(1);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
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
    public static void b(Object obj, Object obj2) {
        i1 i1Var = (i1) obj;
        s2 s2Var = i1Var.zzc;
        s2 s2Var2 = ((i1) obj2).zzc;
        s2 s2Var3 = s2.f;
        if (!s2Var3.equals(s2Var2)) {
            if (s2Var3.equals(s2Var)) {
                int i = s2Var.a + s2Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(s2Var.b, i);
                System.arraycopy(s2Var2.b, 0, iArrCopyOf, s2Var.a, s2Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(s2Var.c, i);
                System.arraycopy(s2Var2.c, 0, objArrCopyOf, s2Var.a, s2Var2.a);
                s2Var = new s2(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                s2Var.getClass();
                if (!s2Var2.equals(s2Var3)) {
                    if (!s2Var.e) {
                        androidx.transition.k.n();
                        return;
                    }
                    int i2 = s2Var.a + s2Var2.a;
                    s2Var.e(i2);
                    System.arraycopy(s2Var2.b, 0, s2Var.b, s2Var.a, s2Var2.a);
                    System.arraycopy(s2Var2.c, 0, s2Var.c, s2Var.a, s2Var2.a);
                    s2Var.a = i2;
                }
            }
        }
        i1Var.zzc = s2Var;
    }

    public static Object c(Object obj, int i, r1 r1Var, j0 j0Var, Object obj2, f1 f1Var) {
        if (j0Var == null) {
            return obj2;
        }
        if (r1Var == null) {
            Iterator it = r1Var.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!j0Var.a(iIntValue)) {
                    if (obj2 == null) {
                        f1Var.getClass();
                        obj2 = f1.g(obj);
                    }
                    f1Var.getClass();
                    ((s2) obj2).d(i << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = r1Var.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) r1Var.get(i3);
            int iIntValue2 = num.intValue();
            if (j0Var.a(iIntValue2)) {
                if (i3 != i2) {
                    r1Var.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    f1Var.getClass();
                    obj2 = f1.g(obj);
                }
                f1Var.getClass();
                ((s2) obj2).d(i << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i2 != size) {
            r1Var.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void d(int i, List list, s5 s5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z0 z0Var = (z0) s5Var.y;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                z0Var.i(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        z0Var.d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        z0Var.r(i3);
        while (i2 < list.size()) {
            z0Var.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void e(int i, List list, s5 s5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z0 z0Var = (z0) s5Var.y;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                z0Var.g(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        z0Var.d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        z0Var.r(i3);
        while (i2 < list.size()) {
            z0Var.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void f(int i, List list, s5 s5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z0 z0Var = (z0) s5Var.y;
        int i2 = 0;
        if (!(list instanceof x1)) {
            if (!z) {
                while (i2 < list.size()) {
                    z0Var.h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            z0Var.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += z0.b(((Long) list.get(i3)).longValue());
            }
            z0Var.r(iB);
            while (i2 < list.size()) {
                z0Var.t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        x1 x1Var = (x1) list;
        if (!z) {
            while (i2 < x1Var.z) {
                z0Var.h(i, x1Var.c(i2));
                i2++;
            }
            return;
        }
        z0Var.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < x1Var.z; i4++) {
            iB2 += z0.b(x1Var.c(i4));
        }
        z0Var.r(iB2);
        while (i2 < x1Var.z) {
            z0Var.t(x1Var.c(i2));
            i2++;
        }
    }

    public static void g(int i, List list, s5 s5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z0 z0Var = (z0) s5Var.y;
        int i2 = 0;
        if (!(list instanceof x1)) {
            if (!z) {
                while (i2 < list.size()) {
                    z0Var.h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            z0Var.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += z0.b(((Long) list.get(i3)).longValue());
            }
            z0Var.r(iB);
            while (i2 < list.size()) {
                z0Var.t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        x1 x1Var = (x1) list;
        if (!z) {
            while (i2 < x1Var.z) {
                z0Var.h(i, x1Var.c(i2));
                i2++;
            }
            return;
        }
        z0Var.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < x1Var.z; i4++) {
            iB2 += z0.b(x1Var.c(i4));
        }
        z0Var.r(iB2);
        while (i2 < x1Var.z) {
            z0Var.t(x1Var.c(i2));
            i2++;
        }
    }

    public static void h(int i, List list, s5 s5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z0 z0Var = (z0) s5Var.y;
        int i2 = 0;
        if (!(list instanceof x1)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    z0Var.h(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            z0Var.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iB += z0.b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            z0Var.r(iB);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                z0Var.t((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        x1 x1Var = (x1) list;
        if (!z) {
            while (i2 < x1Var.z) {
                long jC = x1Var.c(i2);
                z0Var.h(i, (jC >> 63) ^ (jC + jC));
                i2++;
            }
            return;
        }
        z0Var.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < x1Var.z; i4++) {
            long jC2 = x1Var.c(i4);
            iB2 += z0.b((jC2 >> 63) ^ (jC2 + jC2));
        }
        z0Var.r(iB2);
        while (i2 < x1Var.z) {
            long jC3 = x1Var.c(i2);
            z0Var.t((jC3 >> 63) ^ (jC3 + jC3));
            i2++;
        }
    }

    public static void i(int i, List list, s5 s5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z0 z0Var = (z0) s5Var.y;
        int i2 = 0;
        if (!(list instanceof x1)) {
            if (!z) {
                while (i2 < list.size()) {
                    z0Var.i(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            z0Var.d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            z0Var.r(i3);
            while (i2 < list.size()) {
                z0Var.u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        x1 x1Var = (x1) list;
        if (!z) {
            while (i2 < x1Var.z) {
                z0Var.i(i, x1Var.c(i2));
                i2++;
            }
            return;
        }
        z0Var.d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < x1Var.z; i6++) {
            x1Var.c(i6);
            i5 += 8;
        }
        z0Var.r(i5);
        while (i2 < x1Var.z) {
            z0Var.u(x1Var.c(i2));
            i2++;
        }
    }

    public static void j(int i, List list, s5 s5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z0 z0Var = (z0) s5Var.y;
        int i2 = 0;
        if (!(list instanceof x1)) {
            if (!z) {
                while (i2 < list.size()) {
                    z0Var.i(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            z0Var.d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            z0Var.r(i3);
            while (i2 < list.size()) {
                z0Var.u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        x1 x1Var = (x1) list;
        if (!z) {
            while (i2 < x1Var.z) {
                z0Var.i(i, x1Var.c(i2));
                i2++;
            }
            return;
        }
        z0Var.d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < x1Var.z; i6++) {
            x1Var.c(i6);
            i5 += 8;
        }
        z0Var.r(i5);
        while (i2 < x1Var.z) {
            z0Var.u(x1Var.c(i2));
            i2++;
        }
    }

    public static void k(int i, List list, s5 s5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z0 z0Var = (z0) s5Var.y;
        int i2 = 0;
        if (!(list instanceof j1)) {
            if (!z) {
                while (i2 < list.size()) {
                    z0Var.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            z0Var.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += z0.b(((Integer) list.get(i3)).intValue());
            }
            z0Var.r(iB);
            while (i2 < list.size()) {
                z0Var.q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j1 j1Var = (j1) list;
        if (!z) {
            while (i2 < j1Var.z) {
                z0Var.e(i, j1Var.d(i2));
                i2++;
            }
            return;
        }
        z0Var.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < j1Var.z; i4++) {
            iB2 += z0.b(j1Var.d(i4));
        }
        z0Var.r(iB2);
        while (i2 < j1Var.z) {
            z0Var.q(j1Var.d(i2));
            i2++;
        }
    }

    public static void l(int i, List list, s5 s5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z0 z0Var = (z0) s5Var.y;
        int i2 = 0;
        if (!(list instanceof j1)) {
            if (!z) {
                while (i2 < list.size()) {
                    z0Var.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            z0Var.d(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += z0.a(((Integer) list.get(i3)).intValue());
            }
            z0Var.r(iA);
            while (i2 < list.size()) {
                z0Var.r(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j1 j1Var = (j1) list;
        if (!z) {
            while (i2 < j1Var.z) {
                z0Var.f(i, j1Var.d(i2));
                i2++;
            }
            return;
        }
        z0Var.d(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < j1Var.z; i4++) {
            iA2 += z0.a(j1Var.d(i4));
        }
        z0Var.r(iA2);
        while (i2 < j1Var.z) {
            z0Var.r(j1Var.d(i2));
            i2++;
        }
    }

    public static void m(int i, List list, s5 s5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z0 z0Var = (z0) s5Var.y;
        int i2 = 0;
        if (!(list instanceof j1)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    z0Var.f(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            z0Var.d(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iA += z0.a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            z0Var.r(iA);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                z0Var.r((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        j1 j1Var = (j1) list;
        if (!z) {
            while (i2 < j1Var.z) {
                int iD = j1Var.d(i2);
                z0Var.f(i, (iD >> 31) ^ (iD + iD));
                i2++;
            }
            return;
        }
        z0Var.d(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < j1Var.z; i4++) {
            int iD2 = j1Var.d(i4);
            iA2 += z0.a((iD2 >> 31) ^ (iD2 + iD2));
        }
        z0Var.r(iA2);
        while (i2 < j1Var.z) {
            int iD3 = j1Var.d(i2);
            z0Var.r((iD3 >> 31) ^ (iD3 + iD3));
            i2++;
        }
    }

    public static void n(int i, List list, s5 s5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z0 z0Var = (z0) s5Var.y;
        int i2 = 0;
        if (!(list instanceof j1)) {
            if (!z) {
                while (i2 < list.size()) {
                    z0Var.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            z0Var.d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            z0Var.r(i3);
            while (i2 < list.size()) {
                z0Var.s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j1 j1Var = (j1) list;
        if (!z) {
            while (i2 < j1Var.z) {
                z0Var.g(i, j1Var.d(i2));
                i2++;
            }
            return;
        }
        z0Var.d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < j1Var.z; i6++) {
            j1Var.d(i6);
            i5 += 4;
        }
        z0Var.r(i5);
        while (i2 < j1Var.z) {
            z0Var.s(j1Var.d(i2));
            i2++;
        }
    }

    public static void o(int i, List list, s5 s5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z0 z0Var = (z0) s5Var.y;
        int i2 = 0;
        if (!(list instanceof j1)) {
            if (!z) {
                while (i2 < list.size()) {
                    z0Var.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            z0Var.d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            z0Var.r(i3);
            while (i2 < list.size()) {
                z0Var.s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j1 j1Var = (j1) list;
        if (!z) {
            while (i2 < j1Var.z) {
                z0Var.g(i, j1Var.d(i2));
                i2++;
            }
            return;
        }
        z0Var.d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < j1Var.z; i6++) {
            j1Var.d(i6);
            i5 += 4;
        }
        z0Var.r(i5);
        while (i2 < j1Var.z) {
            z0Var.s(j1Var.d(i2));
            i2++;
        }
    }

    public static void p(int i, List list, s5 s5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z0 z0Var = (z0) s5Var.y;
        int i2 = 0;
        if (!(list instanceof j1)) {
            if (!z) {
                while (i2 < list.size()) {
                    z0Var.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            z0Var.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += z0.b(((Integer) list.get(i3)).intValue());
            }
            z0Var.r(iB);
            while (i2 < list.size()) {
                z0Var.q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j1 j1Var = (j1) list;
        if (!z) {
            while (i2 < j1Var.z) {
                z0Var.e(i, j1Var.d(i2));
                i2++;
            }
            return;
        }
        z0Var.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < j1Var.z; i4++) {
            iB2 += z0.b(j1Var.d(i4));
        }
        z0Var.r(iB2);
        while (i2 < j1Var.z) {
            z0Var.q(j1Var.d(i2));
            i2++;
        }
    }

    public static void q(int i, List list, s5 s5Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z0 z0Var = (z0) s5Var.y;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                z0Var.j(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        z0Var.d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        z0Var.r(i3);
        while (i2 < list.size()) {
            z0Var.p(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x1)) {
            int iB = 0;
            while (i < size) {
                iB += z0.b(((Long) list.get(i)).longValue());
                i++;
            }
            return iB;
        }
        x1 x1Var = (x1) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += z0.b(x1Var.c(i));
            i++;
        }
        return iB2;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x1)) {
            int iB = 0;
            while (i < size) {
                iB += z0.b(((Long) list.get(i)).longValue());
                i++;
            }
            return iB;
        }
        x1 x1Var = (x1) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += z0.b(x1Var.c(i));
            i++;
        }
        return iB2;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x1)) {
            int iB = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iB += z0.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iB;
        }
        x1 x1Var = (x1) list;
        int iB2 = 0;
        while (i < size) {
            long jC = x1Var.c(i);
            iB2 += z0.b((jC >> 63) ^ (jC + jC));
            i++;
        }
        return iB2;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j1)) {
            int iB = 0;
            while (i < size) {
                iB += z0.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB;
        }
        j1 j1Var = (j1) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += z0.b(j1Var.d(i));
            i++;
        }
        return iB2;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j1)) {
            int iB = 0;
            while (i < size) {
                iB += z0.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB;
        }
        j1 j1Var = (j1) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += z0.b(j1Var.d(i));
            i++;
        }
        return iB2;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j1)) {
            int iA = 0;
            while (i < size) {
                iA += z0.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        j1 j1Var = (j1) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += z0.a(j1Var.d(i));
            i++;
        }
        return iA2;
    }

    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j1)) {
            int iA = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iA += z0.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iA;
        }
        j1 j1Var = (j1) list;
        int iA2 = 0;
        while (i < size) {
            int iD = j1Var.d(i);
            iA2 += z0.a((iD >> 31) ^ (iD + iD));
            i++;
        }
        return iA2;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (z0.a(i << 3) + 4) * size;
    }

    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (z0.a(i << 3) + 8) * size;
    }
}
