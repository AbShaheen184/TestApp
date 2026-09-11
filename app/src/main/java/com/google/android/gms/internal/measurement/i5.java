package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i5 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ int b;

    public i5(int i) {
        this.b = i;
    }

    public static c5 c(b7 b7Var, List list) {
        m5 m5Var = m5.ADD;
        ea.f("FN", 2, list);
        d5 d5VarF = ((j5) b7Var.z).f(b7Var, (d5) list.get(0));
        d5 d5VarF2 = ((j5) b7Var.z).f(b7Var, (d5) list.get(1));
        if (!(d5VarF2 instanceof l1)) {
            net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("FN requires an ArrayValue of parameter names found ", d5VarF2.getClass().getCanonicalName()));
            return null;
        }
        List listN = ((l1) d5VarF2).n();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new c5(d5VarF.d(), (ArrayList) listN, arrayList, b7Var);
    }

    public static boolean d(d5 d5Var, d5 d5Var2) {
        if (d5Var instanceof z4) {
            d5Var = new g5(d5Var.d());
        }
        if (d5Var2 instanceof z4) {
            d5Var2 = new g5(d5Var2.d());
        }
        if ((d5Var instanceof g5) && (d5Var2 instanceof g5)) {
            return ((g5) d5Var).e.compareTo(((g5) d5Var2).e) < 0;
        }
        double dDoubleValue = d5Var.h().doubleValue();
        double dDoubleValue2 = d5Var2.h().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static d5 e(l5 l5Var, d5 d5Var, d5 d5Var2) {
        if (d5Var instanceof Iterable) {
            return g(l5Var, ((Iterable) d5Var).iterator(), d5Var2);
        }
        net.luminis.tls.engine.impl.c.o("Non-iterable type in for...of loop.");
        return null;
    }

    public static boolean f(d5 d5Var, d5 d5Var2) {
        if (d5Var.getClass().equals(d5Var2.getClass())) {
            if ((d5Var instanceof h5) || (d5Var instanceof b5)) {
                return true;
            }
            if (d5Var instanceof j3) {
                return (Double.isNaN(d5Var.h().doubleValue()) || Double.isNaN(d5Var2.h().doubleValue()) || d5Var.h().doubleValue() != d5Var2.h().doubleValue()) ? false : true;
            }
            if (d5Var instanceof g5) {
                return d5Var.d().equals(d5Var2.d());
            }
            if (d5Var instanceof b2) {
                return d5Var.c().equals(d5Var2.c());
            }
            return d5Var == d5Var2;
        }
        if (((d5Var instanceof h5) || (d5Var instanceof b5)) && ((d5Var2 instanceof h5) || (d5Var2 instanceof b5))) {
            return true;
        }
        boolean z = d5Var instanceof j3;
        if (z && (d5Var2 instanceof g5)) {
            return f(d5Var, new j3(d5Var2.h()));
        }
        boolean z2 = d5Var instanceof g5;
        if (z2 && (d5Var2 instanceof j3)) {
            return f(new j3(d5Var.h()), d5Var2);
        }
        if (d5Var instanceof b2) {
            return f(new j3(d5Var.h()), d5Var2);
        }
        if (d5Var2 instanceof b2) {
            return f(d5Var, new j3(d5Var2.h()));
        }
        if ((z2 || z) && (d5Var2 instanceof z4)) {
            return f(d5Var, new g5(d5Var2.d()));
        }
        if ((d5Var instanceof z4) && ((d5Var2 instanceof g5) || (d5Var2 instanceof j3))) {
            return f(new g5(d5Var.d()), d5Var2);
        }
        return false;
    }

    public static d5 g(l5 l5Var, Iterator it, d5 d5Var) {
        b7 b7VarD;
        if (it != null) {
            while (it.hasNext()) {
                d5 d5Var2 = (d5) it.next();
                switch (l5Var.a) {
                    case 0:
                        b7VarD = l5Var.b.d();
                        String str = l5Var.c;
                        b7VarD.g(str, d5Var2);
                        ((HashMap) b7VarD.B).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        b7VarD = l5Var.b.d();
                        b7VarD.g(l5Var.c, d5Var2);
                        break;
                    default:
                        b7VarD = l5Var.b;
                        b7VarD.g(l5Var.c, d5Var2);
                        break;
                }
                d5 d5VarC = b7VarD.c((l1) d5Var);
                if (d5VarC instanceof r2) {
                    r2 r2Var = (r2) d5VarC;
                    String str2 = r2Var.y;
                    if ("break".equals(str2)) {
                        return d5.m;
                    }
                    if ("return".equals(str2)) {
                        return r2Var;
                    }
                }
            }
        }
        return d5.m;
    }

    public static boolean h(d5 d5Var, d5 d5Var2) {
        if (d5Var instanceof z4) {
            d5Var = new g5(d5Var.d());
        }
        if (d5Var2 instanceof z4) {
            d5Var2 = new g5(d5Var2.d());
        }
        return (((d5Var instanceof g5) && (d5Var2 instanceof g5)) || !(Double.isNaN(d5Var.h().doubleValue()) || Double.isNaN(d5Var2.h().doubleValue()))) && !d(d5Var2, d5Var);
    }

    /* JADX WARN: Code duplicated, block: B:401:0x0bbb  */
    /* JADX WARN: Code duplicated, block: B:565:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v320 */
    /* JADX WARN: Type inference failed for: r12v325 */
    /* JADX WARN: Type inference failed for: r12v345, types: [com.google.android.gms.internal.measurement.l1] */
    /* JADX WARN: Type inference failed for: r12v352, types: [com.google.android.gms.internal.measurement.a5] */
    /* JADX WARN: Type inference failed for: r12v388 */
    /* JADX WARN: Type inference failed for: r12v389 */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.google.android.gms.internal.measurement.b7] */
    /* JADX WARN: Type inference failed for: r7v63, types: [com.google.android.gms.internal.measurement.d5] */
    public final d5 a(String str, b7 b7Var, ArrayList arrayList) {
        boolean zF;
        boolean zF2;
        d5 d5Var;
        d5 d5VarC;
        h5 h5Var;
        r2 r2Var;
        d5 g5Var;
        ?? l1Var;
        String str2;
        int i = 0;
        switch (this.b) {
            case 0:
                m5 m5Var = m5.ADD;
                switch (ea.m(str).ordinal()) {
                    case 4:
                        ea.c("BITWISE_AND", 2, arrayList);
                        return new j3(Double.valueOf(ea.p(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).h().doubleValue()) & ea.p(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1)).h().doubleValue())));
                    case 5:
                        ea.c("BITWISE_LEFT_SHIFT", 2, arrayList);
                        return new j3(Double.valueOf(ea.p(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).h().doubleValue()) << ((int) (((long) ea.p(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1)).h().doubleValue())) & 31))));
                    case 6:
                        ea.c("BITWISE_NOT", 1, arrayList);
                        return new j3(Double.valueOf(~ea.p(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).h().doubleValue())));
                    case 7:
                        ea.c("BITWISE_OR", 2, arrayList);
                        return new j3(Double.valueOf(ea.p(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).h().doubleValue()) | ea.p(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1)).h().doubleValue())));
                    case 8:
                        ea.c("BITWISE_RIGHT_SHIFT", 2, arrayList);
                        return new j3(Double.valueOf(ea.p(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).h().doubleValue()) >> ((int) (((long) ea.p(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1)).h().doubleValue())) & 31))));
                    case 9:
                        ea.c("BITWISE_UNSIGNED_RIGHT_SHIFT", 2, arrayList);
                        return new j3(Double.valueOf((((long) ea.p(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).h().doubleValue())) & 4294967295L) >>> ((int) (((long) ea.p(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1)).h().doubleValue())) & 31))));
                    case 10:
                        ea.c("BITWISE_XOR", 2, arrayList);
                        return new j3(Double.valueOf(ea.p(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).h().doubleValue()) ^ ea.p(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1)).h().doubleValue())));
                    default:
                        b(str);
                        throw null;
                }
            case 1:
                ea.c(ea.m(str).name(), 2, arrayList);
                d5 d5VarF = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0));
                d5 d5VarF2 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1));
                int iOrdinal = ea.m(str).ordinal();
                if (iOrdinal != 23) {
                    if (iOrdinal == 48) {
                        zF2 = f(d5VarF, d5VarF2);
                    } else if (iOrdinal == 42) {
                        zF = d(d5VarF, d5VarF2);
                    } else if (iOrdinal != 43) {
                        switch (iOrdinal) {
                            case Token.SETPROP /* 37 */:
                                zF = d(d5VarF2, d5VarF);
                                break;
                            case Token.SETPROP_SUPER /* 38 */:
                                zF = h(d5VarF2, d5VarF);
                                break;
                            case Token.GETELEM /* 39 */:
                                zF = ea.o(d5VarF, d5VarF2);
                                break;
                            case Token.GETELEM_SUPER /* 40 */:
                                zF2 = ea.o(d5VarF, d5VarF2);
                                break;
                            default:
                                b(str);
                                throw null;
                        }
                    } else {
                        zF = h(d5VarF, d5VarF2);
                    }
                    zF = !zF2;
                } else {
                    zF = f(d5VarF, d5VarF2);
                }
                return zF ? d5.r : d5.s;
            case 2:
                m5 m5Var2 = m5.ADD;
                int iOrdinal2 = ea.m(str).ordinal();
                if (iOrdinal2 == 2) {
                    ea.c("APPLY", 3, arrayList);
                    d5 d5Var2 = (d5) arrayList.get(0);
                    j5 j5Var = (j5) b7Var.z;
                    j5 j5Var2 = (j5) b7Var.z;
                    d5 d5VarF3 = j5Var.f(b7Var, d5Var2);
                    String strD = j5Var2.f(b7Var, (d5) arrayList.get(1)).d();
                    d5 d5VarF4 = j5Var2.f(b7Var, (d5) arrayList.get(2));
                    if (!(d5VarF4 instanceof l1)) {
                        net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Function arguments for Apply are not a list found ", d5VarF4.getClass().getCanonicalName()));
                        return null;
                    }
                    if (!strD.isEmpty()) {
                        return d5VarF3.j(strD, b7Var, (ArrayList) ((l1) d5VarF4).n());
                    }
                    net.luminis.tls.engine.impl.c.o("Function name for apply is undefined");
                    return null;
                }
                if (iOrdinal2 == 15) {
                    ea.c("BREAK", 0, arrayList);
                    return d5.o;
                }
                if (iOrdinal2 == 25) {
                    return c(b7Var, arrayList);
                }
                if (iOrdinal2 == 41) {
                    ea.f("IF", 2, arrayList);
                    d5 d5Var3 = (d5) arrayList.get(0);
                    j5 j5Var3 = (j5) b7Var.z;
                    j5 j5Var4 = (j5) b7Var.z;
                    d5 d5VarF5 = j5Var3.f(b7Var, d5Var3);
                    d5 d5VarF6 = j5Var4.f(b7Var, (d5) arrayList.get(1));
                    d5 d5VarF7 = arrayList.size() > 2 ? j5Var4.f(b7Var, (d5) arrayList.get(2)) : null;
                    h5 h5Var2 = d5.m;
                    if (!d5VarF5.c().booleanValue()) {
                        if (d5VarF7 != null) {
                            d5VarC = b7Var.c((l1) d5VarF7);
                        } else {
                            d5Var = h5Var2;
                        }
                        if (true != (d5Var instanceof r2)) {
                            return h5Var2;
                        }
                        return d5Var;
                    }
                    d5VarC = b7Var.c((l1) d5VarF6);
                    d5Var = d5VarC;
                    if (true != (d5Var instanceof r2)) {
                        return h5Var2;
                    }
                    return d5Var;
                }
                if (iOrdinal2 == 54) {
                    return new l1(arrayList);
                }
                if (iOrdinal2 == 57) {
                    if (arrayList.isEmpty()) {
                        return d5.q;
                    }
                    ea.c("RETURN", 1, arrayList);
                    return new r2("return", ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)));
                }
                if (iOrdinal2 != 19) {
                    if (iOrdinal2 == 20) {
                        ea.f("DEFINE_FUNCTION", 2, arrayList);
                        c5 c5VarC = c(b7Var, arrayList);
                        String str3 = c5VarC.e;
                        if (str3 == null) {
                            b7Var.f("", c5VarC);
                            return c5VarC;
                        }
                        b7Var.f(str3, c5VarC);
                        return c5VarC;
                    }
                    if (iOrdinal2 == 60) {
                        ea.c("SWITCH", 3, arrayList);
                        d5 d5Var4 = (d5) arrayList.get(0);
                        j5 j5Var5 = (j5) b7Var.z;
                        j5 j5Var6 = (j5) b7Var.z;
                        d5 d5VarF8 = j5Var5.f(b7Var, d5Var4);
                        d5 d5VarF9 = j5Var6.f(b7Var, (d5) arrayList.get(1));
                        d5 d5VarF10 = j5Var6.f(b7Var, (d5) arrayList.get(2));
                        if (!(d5VarF9 instanceof l1)) {
                            net.luminis.tls.engine.impl.c.o("Malformed SWITCH statement, cases are not a list");
                            return null;
                        }
                        if (!(d5VarF10 instanceof l1)) {
                            net.luminis.tls.engine.impl.c.o("Malformed SWITCH statement, case statements are not a list");
                            return null;
                        }
                        l1 l1Var2 = (l1) d5VarF9;
                        l1 l1Var3 = (l1) d5VarF10;
                        boolean z = false;
                        for (int i2 = 0; i2 < l1Var2.p(); i2++) {
                            if (z || d5VarF8.equals(j5Var6.f(b7Var, l1Var2.q(i2)))) {
                                d5 d5VarF11 = j5Var6.f(b7Var, l1Var3.q(i2));
                                if (d5VarF11 instanceof r2) {
                                    return ((r2) d5VarF11).y.equals("break") ? d5.m : d5VarF11;
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (l1Var2.p() + 1 == l1Var3.p()) {
                            d5 d5VarF12 = j5Var6.f(b7Var, l1Var3.q(l1Var2.p()));
                            if (d5VarF12 instanceof r2) {
                                String str4 = ((r2) d5VarF12).y;
                                if (str4.equals("return") || str4.equals("continue")) {
                                    return d5VarF12;
                                }
                            }
                        }
                        return d5.m;
                    }
                    if (iOrdinal2 == 61) {
                        ea.c("TERNARY", 3, arrayList);
                        d5 d5Var5 = (d5) arrayList.get(0);
                        j5 j5Var7 = (j5) b7Var.z;
                        j5 j5Var8 = (j5) b7Var.z;
                        return j5Var7.f(b7Var, d5Var5).c().booleanValue() ? j5Var8.f(b7Var, (d5) arrayList.get(1)) : j5Var8.f(b7Var, (d5) arrayList.get(2));
                    }
                    switch (iOrdinal2) {
                        case 11:
                            return b7Var.d().c(new l1(arrayList));
                        case 12:
                            ea.c("BREAK", 0, arrayList);
                            return d5.p;
                        case 13:
                            break;
                        default:
                            b(str);
                            throw null;
                    }
                }
                if (arrayList.isEmpty()) {
                    return d5.m;
                }
                d5 d5VarF13 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0));
                return d5VarF13 instanceof l1 ? b7Var.c((l1) d5VarF13) : d5.m;
            case 3:
                m5 m5Var3 = m5.ADD;
                int iOrdinal3 = ea.m(str).ordinal();
                if (iOrdinal3 == 1) {
                    ea.c("AND", 2, arrayList);
                    d5 d5VarF14 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0));
                    if (d5VarF14.c().booleanValue()) {
                        return ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1));
                    }
                    return d5VarF14;
                }
                if (iOrdinal3 == 47) {
                    ea.c("NOT", 1, arrayList);
                    return new b2(Boolean.valueOf(!((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).c().booleanValue()));
                }
                if (iOrdinal3 != 50) {
                    b(str);
                    throw null;
                }
                ea.c("OR", 2, arrayList);
                d5 d5VarF15 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0));
                if (d5VarF15.c().booleanValue()) {
                    return d5VarF15;
                }
                return ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1));
            case 4:
                m5 m5Var4 = m5.ADD;
                int iOrdinal4 = ea.m(str).ordinal();
                if (iOrdinal4 == 65) {
                    ea.c("WHILE", 4, arrayList);
                    d5 d5Var6 = (d5) arrayList.get(0);
                    d5 d5Var7 = (d5) arrayList.get(1);
                    d5 d5Var8 = (d5) arrayList.get(2);
                    d5 d5Var9 = (d5) arrayList.get(3);
                    j5 j5Var9 = (j5) b7Var.z;
                    j5 j5Var10 = (j5) b7Var.z;
                    d5 d5VarF16 = j5Var9.f(b7Var, d5Var9);
                    if (j5Var10.f(b7Var, d5Var8).c().booleanValue()) {
                        d5 d5VarC2 = b7Var.c((l1) d5VarF16);
                        if (d5VarC2 instanceof r2) {
                            r2 r2Var2 = (r2) d5VarC2;
                            String str5 = r2Var2.y;
                            if ("break".equals(str5)) {
                                return d5.m;
                            }
                            if ("return".equals(str5)) {
                                return r2Var2;
                            }
                        }
                    }
                    while (j5Var10.f(b7Var, d5Var6).c().booleanValue()) {
                        d5 d5VarC3 = b7Var.c((l1) d5VarF16);
                        if (d5VarC3 instanceof r2) {
                            r2 r2Var3 = (r2) d5VarC3;
                            String str6 = r2Var3.y;
                            if ("break".equals(str6)) {
                                return d5.m;
                            }
                            if ("return".equals(str6)) {
                                return r2Var3;
                            }
                        }
                        b7Var.a(d5Var7);
                    }
                    return d5.m;
                }
                switch (iOrdinal4) {
                    case 26:
                        ea.c("FOR_IN", 3, arrayList);
                        if (!(arrayList.get(0) instanceof g5)) {
                            net.luminis.tls.engine.impl.c.o("Variable name in FOR_IN must be a string");
                            return null;
                        }
                        String strD2 = ((d5) arrayList.get(0)).d();
                        d5 d5VarF17 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1));
                        d5 d5VarF18 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(2));
                        Iterator itB = d5VarF17.b();
                        if (itB != null) {
                            while (itB.hasNext()) {
                                b7Var.g(strD2, (d5) itB.next());
                                d5 d5VarC4 = b7Var.c((l1) d5VarF18);
                                if (d5VarC4 instanceof r2) {
                                    r2Var = (r2) d5VarC4;
                                    String str7 = r2Var.y;
                                    if ("break".equals(str7)) {
                                        h5Var = d5.m;
                                    } else if ("return".equals(str7)) {
                                        return r2Var;
                                    }
                                }
                            }
                            h5Var = d5.m;
                        } else {
                            h5Var = d5.m;
                        }
                        return h5Var;
                    case 27:
                        ea.c("FOR_IN_CONST", 3, arrayList);
                        if (arrayList.get(0) instanceof g5) {
                            return g(new l5(b7Var, ((d5) arrayList.get(0)).d(), 0), ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1)).b(), ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(2)));
                        }
                        net.luminis.tls.engine.impl.c.o("Variable name in FOR_IN_CONST must be a string");
                        return null;
                    case 28:
                        ea.c("FOR_IN_LET", 3, arrayList);
                        if (!(arrayList.get(0) instanceof g5)) {
                            net.luminis.tls.engine.impl.c.o("Variable name in FOR_IN_LET must be a string");
                            return null;
                        }
                        String strD3 = ((d5) arrayList.get(0)).d();
                        d5 d5VarF19 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1));
                        d5 d5VarF20 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(2));
                        Iterator itB2 = d5VarF19.b();
                        if (itB2 != null) {
                            while (itB2.hasNext()) {
                                d5 d5Var10 = (d5) itB2.next();
                                b7 b7VarD = b7Var.d();
                                b7VarD.g(strD3, d5Var10);
                                d5 d5VarC5 = b7VarD.c((l1) d5VarF20);
                                if (d5VarC5 instanceof r2) {
                                    r2Var = (r2) d5VarC5;
                                    String str8 = r2Var.y;
                                    if ("break".equals(str8)) {
                                        h5Var = d5.m;
                                    } else if ("return".equals(str8)) {
                                        return r2Var;
                                    }
                                }
                            }
                            h5Var = d5.m;
                        } else {
                            h5Var = d5.m;
                        }
                        return h5Var;
                    case 29:
                        ea.c("FOR_LET", 4, arrayList);
                        d5 d5Var11 = (d5) arrayList.get(0);
                        j5 j5Var11 = (j5) b7Var.z;
                        j5 j5Var12 = (j5) b7Var.z;
                        d5 d5VarF21 = j5Var11.f(b7Var, d5Var11);
                        if (!(d5VarF21 instanceof l1)) {
                            net.luminis.tls.engine.impl.c.o("Initializer variables in FOR_LET must be an ArrayList");
                            return null;
                        }
                        l1 l1Var4 = (l1) d5VarF21;
                        d5 d5Var12 = (d5) arrayList.get(1);
                        d5 d5Var13 = (d5) arrayList.get(2);
                        d5 d5VarF22 = j5Var12.f(b7Var, (d5) arrayList.get(3));
                        b7 b7VarD2 = b7Var.d();
                        for (int i3 = 0; i3 < l1Var4.p(); i3++) {
                            String strD4 = l1Var4.q(i3).d();
                            b7VarD2.f(strD4, b7Var.h(strD4));
                        }
                        while (j5Var12.f(b7Var, d5Var12).c().booleanValue()) {
                            d5 d5VarC6 = b7Var.c((l1) d5VarF22);
                            if (d5VarC6 instanceof r2) {
                                r2 r2Var4 = (r2) d5VarC6;
                                String str9 = r2Var4.y;
                                if ("break".equals(str9)) {
                                    return d5.m;
                                }
                                if ("return".equals(str9)) {
                                    return r2Var4;
                                }
                            }
                            b7 b7VarD3 = b7Var.d();
                            for (int i4 = 0; i4 < l1Var4.p(); i4++) {
                                String strD5 = l1Var4.q(i4).d();
                                b7VarD3.f(strD5, b7VarD2.h(strD5));
                            }
                            b7VarD3.a(d5Var13);
                            b7VarD2 = b7VarD3;
                        }
                        return d5.m;
                    case 30:
                        ea.c("FOR_OF", 3, arrayList);
                        if (arrayList.get(0) instanceof g5) {
                            return e(new l5(b7Var, ((d5) arrayList.get(0)).d(), 2), ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1)), ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(2)));
                        }
                        net.luminis.tls.engine.impl.c.o("Variable name in FOR_OF must be a string");
                        return null;
                    case 31:
                        ea.c("FOR_OF_CONST", 3, arrayList);
                        if (arrayList.get(0) instanceof g5) {
                            return e(new l5(b7Var, ((d5) arrayList.get(0)).d(), 0), ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1)), ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(2)));
                        }
                        net.luminis.tls.engine.impl.c.o("Variable name in FOR_OF_CONST must be a string");
                        return null;
                    case 32:
                        ea.c("FOR_OF_LET", 3, arrayList);
                        if (arrayList.get(0) instanceof g5) {
                            return e(new l5(b7Var, ((d5) arrayList.get(0)).d(), 1), ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1)), ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(2)));
                        }
                        net.luminis.tls.engine.impl.c.o("Variable name in FOR_OF_LET must be a string");
                        return null;
                    default:
                        b(str);
                        throw null;
                }
            case 5:
                m5 m5Var5 = m5.ADD;
                int iOrdinal5 = ea.m(str).ordinal();
                if (iOrdinal5 == 0) {
                    ea.c("ADD", 2, arrayList);
                    d5 d5VarF23 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0));
                    d5 d5VarF24 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1));
                    g5Var = ((d5VarF23 instanceof z4) || (d5VarF23 instanceof g5) || (d5VarF24 instanceof z4) || (d5VarF24 instanceof g5)) ? new g5(String.valueOf(d5VarF23.d()).concat(String.valueOf(d5VarF24.d()))) : new j3(Double.valueOf(d5VarF24.h().doubleValue() + d5VarF23.h().doubleValue()));
                } else {
                    if (iOrdinal5 == 21) {
                        ea.c("DIVIDE", 2, arrayList);
                        return new j3(Double.valueOf(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).h().doubleValue() / ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1)).h().doubleValue()));
                    }
                    if (iOrdinal5 == 59) {
                        ea.c("SUBTRACT", 2, arrayList);
                        return new j3(Double.valueOf(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).h().doubleValue() + (-((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1)).h().doubleValue())));
                    }
                    if (iOrdinal5 == 52 || iOrdinal5 == 53) {
                        ea.c(str, 2, arrayList);
                        d5 d5VarF25 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0));
                        b7Var.a((d5) arrayList.get(1));
                        return d5VarF25;
                    }
                    if (iOrdinal5 == 55 || iOrdinal5 == 56) {
                        ea.c(str, 1, arrayList);
                        return ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0));
                    }
                    switch (iOrdinal5) {
                        case Token.NAME /* 44 */:
                            ea.c("MODULUS", 2, arrayList);
                            return new j3(Double.valueOf(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).h().doubleValue() % ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1)).h().doubleValue()));
                        case Token.NUMBER /* 45 */:
                            ea.c("MULTIPLY", 2, arrayList);
                            g5Var = new j3(Double.valueOf(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1)).h().doubleValue() * ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).h().doubleValue()));
                            break;
                        case Token.STRING /* 46 */:
                            ea.c("NEGATE", 1, arrayList);
                            return new j3(Double.valueOf(-((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).h().doubleValue()));
                        default:
                            b(str);
                            throw null;
                    }
                }
                return g5Var;
            case 6:
                if (str == null || str.isEmpty() || !b7Var.e(str)) {
                    net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Command not found: ", str));
                    return null;
                }
                d5 d5VarH = b7Var.h(str);
                if (d5VarH instanceof c4) {
                    return ((c4) d5VarH).a(b7Var, arrayList);
                }
                net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.q("Function ", str, " is not defined"));
                return null;
            default:
                m5 m5Var6 = m5.ADD;
                int iOrdinal6 = ea.m(str).ordinal();
                if (iOrdinal6 == 3) {
                    ea.c("ASSIGN", 2, arrayList);
                    d5 d5VarF26 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0));
                    if (!(d5VarF26 instanceof g5)) {
                        net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Expected string for assign var. got ", d5VarF26.getClass().getCanonicalName()));
                        return null;
                    }
                    String str10 = ((g5) d5VarF26).e;
                    if (!b7Var.e(str10)) {
                        net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Attempting to assign undefined value ", str10));
                        return null;
                    }
                    d5 d5VarF27 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1));
                    b7Var.f(str10, d5VarF27);
                    return d5VarF27;
                }
                if (iOrdinal6 == 14) {
                    ea.f("CONST", 2, arrayList);
                    if (arrayList.size() % 2 != 0) {
                        net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(arrayList.size(), "CONST requires an even number of arguments, found "));
                        return null;
                    }
                    while (i < arrayList.size() - 1) {
                        d5 d5VarF28 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(i));
                        if (!(d5VarF28 instanceof g5)) {
                            net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Expected string for const name. got ", d5VarF28.getClass().getCanonicalName()));
                            return null;
                        }
                        String str11 = ((g5) d5VarF28).e;
                        b7Var.g(str11, ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(i + 1)));
                        ((HashMap) b7Var.B).put(str11, Boolean.TRUE);
                        i += 2;
                    }
                    return d5.m;
                }
                if (iOrdinal6 == 24) {
                    ea.f("EXPRESSION_LIST", 1, arrayList);
                    l1Var = d5.m;
                    while (i < arrayList.size()) {
                        d5 d5VarF29 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(i));
                        if (d5VarF29 instanceof r2) {
                            net.luminis.tls.engine.impl.c.r("ControlValue cannot be in an expression list");
                            return null;
                        }
                        i++;
                        l1Var = d5VarF29;
                    }
                } else {
                    if (iOrdinal6 == 33) {
                        ea.c("GET", 1, arrayList);
                        d5 d5VarF30 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0));
                        if (d5VarF30 instanceof g5) {
                            return b7Var.h(((g5) d5VarF30).e);
                        }
                        net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Expected string for get var. got ", d5VarF30.getClass().getCanonicalName()));
                        return null;
                    }
                    if (iOrdinal6 == 49) {
                        ea.c("NULL", 0, arrayList);
                        return d5.n;
                    }
                    if (iOrdinal6 == 58) {
                        ea.c("SET_PROPERTY", 3, arrayList);
                        d5 d5Var14 = (d5) arrayList.get(0);
                        j5 j5Var13 = (j5) b7Var.z;
                        j5 j5Var14 = (j5) b7Var.z;
                        d5 d5VarF31 = j5Var13.f(b7Var, d5Var14);
                        d5 d5VarF32 = j5Var14.f(b7Var, (d5) arrayList.get(1));
                        d5 d5VarF33 = j5Var14.f(b7Var, (d5) arrayList.get(2));
                        if (d5VarF31 == d5.m || d5VarF31 == d5.n) {
                            net.luminis.tls.engine.impl.c.r(coil3.compose.internal.f.e("Can't set property ", d5VarF32.d(), " of ", d5VarF31.d()));
                            return null;
                        }
                        if ((d5VarF31 instanceof l1) && (d5VarF32 instanceof j3)) {
                            ((l1) d5VarF31).r(((j3) d5VarF32).e.intValue(), d5VarF33);
                        } else if (d5VarF31 instanceof z4) {
                            ((z4) d5VarF31).f(d5VarF32.d(), d5VarF33);
                        }
                        return d5VarF33;
                    }
                    if (iOrdinal6 != 17) {
                        if (iOrdinal6 != 18) {
                            if (iOrdinal6 == 35 || iOrdinal6 == 36) {
                                ea.c("GET_PROPERTY", 2, arrayList);
                                d5 d5VarF34 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0));
                                d5 d5VarF35 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1));
                                if ((d5VarF34 instanceof l1) && ea.k(d5VarF35)) {
                                    return ((l1) d5VarF34).q(d5VarF35.h().intValue());
                                }
                                if (d5VarF34 instanceof z4) {
                                    return ((z4) d5VarF34).e(d5VarF35.d());
                                }
                                if (d5VarF34 instanceof g5) {
                                    if ("length".equals(d5VarF35.d())) {
                                        return new j3(Double.valueOf(((g5) d5VarF34).e.length()));
                                    }
                                    if (ea.k(d5VarF35)) {
                                        double dDoubleValue = d5VarF35.h().doubleValue();
                                        String str12 = ((g5) d5VarF34).e;
                                        if (dDoubleValue < str12.length()) {
                                            return new g5(String.valueOf(str12.charAt(d5VarF35.h().intValue())));
                                        }
                                    }
                                }
                                return d5.m;
                            }
                            switch (iOrdinal6) {
                                case Token.CATCH_SCOPE /* 62 */:
                                    ea.c("TYPEOF", 1, arrayList);
                                    d5 d5VarF36 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0));
                                    if (d5VarF36 instanceof h5) {
                                        str2 = "undefined";
                                    } else if (d5VarF36 instanceof b2) {
                                        str2 = "boolean";
                                    } else if (d5VarF36 instanceof j3) {
                                        str2 = "number";
                                    } else if (d5VarF36 instanceof g5) {
                                        str2 = "string";
                                    } else if (d5VarF36 instanceof c5) {
                                        str2 = "function";
                                    } else {
                                        if ((d5VarF36 instanceof e5) || (d5VarF36 instanceof r2)) {
                                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", d5VarF36));
                                        }
                                        str2 = "object";
                                    }
                                    return new g5(str2);
                                case Token.ENUM_INIT_KEYS /* 63 */:
                                    ea.c("UNDEFINED", 0, arrayList);
                                    return d5.m;
                                case Token.ENUM_INIT_VALUES /* 64 */:
                                    ea.f("VAR", 1, arrayList);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        d5 d5VarF37 = ((j5) b7Var.z).f(b7Var, (d5) it.next());
                                        if (!(d5VarF37 instanceof g5)) {
                                            net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Expected string for var name. got ", d5VarF37.getClass().getCanonicalName()));
                                            return null;
                                        }
                                        b7Var.g(((g5) d5VarF37).e, d5.m);
                                    }
                                    return d5.m;
                                default:
                                    b(str);
                                    throw null;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return new a5();
                        }
                        if (arrayList.size() % 2 != 0) {
                            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                            return null;
                        }
                        l1Var = new a5();
                        while (i < arrayList.size() - 1) {
                            d5 d5VarF38 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(i));
                            d5 d5VarF39 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(i + 1));
                            if ((d5VarF38 instanceof r2) || (d5VarF39 instanceof r2)) {
                                net.luminis.tls.engine.impl.c.r("Failed to evaluate map entry");
                                return null;
                            }
                            l1Var.f(d5VarF38.d(), d5VarF39);
                            i += 2;
                        }
                    } else {
                        if (arrayList.isEmpty()) {
                            return new l1();
                        }
                        l1Var = new l1();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            d5 d5VarF40 = ((j5) b7Var.z).f(b7Var, (d5) it2.next());
                            if (d5VarF40 instanceof r2) {
                                net.luminis.tls.engine.impl.c.r("Failed to evaluate array element");
                                return null;
                            }
                            l1Var.r(i, d5VarF40);
                            i++;
                        }
                    }
                }
                return l1Var;
        }
    }

    public final void b(String str) {
        if (!this.a.contains(ea.m(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
