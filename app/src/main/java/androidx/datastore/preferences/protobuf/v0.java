package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {
    public static final Class a;
    public static final b1 b;
    public static final b1 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        r0 r0Var = r0.c;
        b1 b1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            r0 r0Var2 = r0.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                b1Var = (b1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = b1Var;
        c = new b1();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += j.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.h(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += j.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += j.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int iIntValue = ((Integer) list.get(i2)).intValue();
            i += j.i((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return i;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iJ += j.j((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iJ;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += j.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += j.j(((Long) list.get(i)).longValue());
        }
        return iJ;
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
    public static void k(b1 b1Var, Object obj, Object obj2) {
        b1Var.getClass();
        t tVar = (t) obj;
        a1 a1Var = tVar.unknownFields;
        a1 a1Var2 = ((t) obj2).unknownFields;
        a1 a1Var3 = a1.f;
        if (!a1Var3.equals(a1Var2)) {
            if (a1Var3.equals(a1Var)) {
                int i = a1Var.a + a1Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(a1Var.b, i);
                System.arraycopy(a1Var2.b, 0, iArrCopyOf, a1Var.a, a1Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(a1Var.c, i);
                System.arraycopy(a1Var2.c, 0, objArrCopyOf, a1Var.a, a1Var2.a);
                a1Var = new a1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                a1Var.getClass();
                if (!a1Var2.equals(a1Var3)) {
                    if (!a1Var.e) {
                        androidx.transition.k.n();
                        return;
                    }
                    int i2 = a1Var.a + a1Var2.a;
                    a1Var.a(i2);
                    System.arraycopy(a1Var2.b, 0, a1Var.b, a1Var.a, a1Var2.a);
                    System.arraycopy(a1Var2.c, 0, a1Var.c, a1Var.a, a1Var2.a);
                    a1Var.a = i2;
                }
            }
        }
        tVar.unknownFields = a1Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, d0 d0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) d0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.o(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        jVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = j.f;
            i3++;
        }
        jVar.D(i3);
        while (i2 < list.size()) {
            jVar.m(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, d0 d0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) d0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                jVar.getClass();
                jVar.t(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        jVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = j.f;
            i3 += 8;
        }
        jVar.D(i3);
        while (i2 < list.size()) {
            jVar.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, d0 d0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) d0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += j.j(((Integer) list.get(i3)).intValue());
        }
        jVar.D(iJ);
        while (i2 < list.size()) {
            jVar.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, d0 d0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) d0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = j.f;
            i3 += 4;
        }
        jVar.D(i3);
        while (i2 < list.size()) {
            jVar.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, d0 d0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) d0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        jVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = j.f;
            i3 += 8;
        }
        jVar.D(i3);
        while (i2 < list.size()) {
            jVar.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void r(int i, List list, d0 d0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) d0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                jVar.getClass();
                jVar.r(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        jVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = j.f;
            i3 += 4;
        }
        jVar.D(i3);
        while (i2 < list.size()) {
            jVar.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, d0 d0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) d0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += j.j(((Integer) list.get(i3)).intValue());
        }
        jVar.D(iJ);
        while (i2 < list.size()) {
            jVar.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, d0 d0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) d0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        jVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += j.j(((Long) list.get(i3)).longValue());
        }
        jVar.D(iJ);
        while (i2 < list.size()) {
            jVar.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, d0 d0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) d0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = j.f;
            i3 += 4;
        }
        jVar.D(i3);
        while (i2 < list.size()) {
            jVar.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, d0 d0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) d0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        jVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = j.f;
            i3 += 8;
        }
        jVar.D(i3);
        while (i2 < list.size()) {
            jVar.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, d0 d0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) d0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                jVar.C(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        jVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            i3 += j.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        jVar.D(i3);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            jVar.D((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, d0 d0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) d0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                jVar.E(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        jVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iJ += j.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        jVar.D(iJ);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            jVar.F((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, d0 d0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) d0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += j.i(((Integer) list.get(i4)).intValue());
        }
        jVar.D(i3);
        while (i2 < list.size()) {
            jVar.D(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, d0 d0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) d0Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                jVar.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        jVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += j.j(((Long) list.get(i3)).longValue());
        }
        jVar.D(iJ);
        while (i2 < list.size()) {
            jVar.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static Object j(Object obj, int i, u uVar, Object obj2, b1 b1Var) {
        return obj2;
    }
}
