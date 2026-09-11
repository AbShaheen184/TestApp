package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.google.android.gms.internal.measurement.h7;
import com.google.android.gms.internal.measurement.j7;
import com.google.android.gms.internal.measurement.k9;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.w8;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ c h;
    public final com.google.android.gms.internal.measurement.i1 i;

    public b(c cVar, String str, int i, com.google.android.gms.internal.measurement.i1 i1Var, int i2) {
        this.g = i2;
        this.h = cVar;
        this.a = str;
        this.b = i;
        this.i = i1Var;
    }

    public static Boolean c(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, o7 o7Var, x0 x0Var) {
        List listZ;
        com.google.android.gms.common.internal.x.g(o7Var);
        if (str != null && o7Var.u() && o7Var.C() != 1 && (o7Var.C() != 7 ? o7Var.v() : o7Var.A() != 0)) {
            int iC = o7Var.C();
            boolean zY = o7Var.y();
            String strW = (zY || iC == 2 || iC == 7) ? o7Var.w() : o7Var.w().toUpperCase(Locale.ENGLISH);
            if (o7Var.A() == 0) {
                listZ = null;
            } else {
                listZ = o7Var.z();
                if (!zY) {
                    ArrayList arrayList = new ArrayList(listZ.size());
                    Iterator it = listZ.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listZ = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iC == 2 ? strW : null;
            if (iC != 7 ? strW != null : listZ != null && !listZ.isEmpty()) {
                if (!zY && iC != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iC - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zY ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (x0Var != null) {
                                    x0Var.F.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strW));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strW));
                    case 4:
                        return Boolean.valueOf(str.contains(strW));
                    case 5:
                        return Boolean.valueOf(str.equals(strW));
                    case 6:
                        if (listZ != null) {
                            return Boolean.valueOf(listZ.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x010b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0112  */
    public static Boolean e(BigDecimal bigDecimal, l7 l7Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        int i;
        com.google.android.gms.common.internal.x.g(l7Var);
        if (l7Var.u()) {
            if (l7Var.E() != 1 && (l7Var.E() != 5 ? l7Var.x() : l7Var.z() && l7Var.B())) {
                int iE = l7Var.E();
                try {
                    if (l7Var.E() == 5) {
                        if (n4.Z(l7Var.A()) && n4.Z(l7Var.C())) {
                            BigDecimal bigDecimal5 = new BigDecimal(l7Var.A());
                            bigDecimal4 = new BigDecimal(l7Var.C());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                            if (iE == 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                                i = iE - 1;
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            if (i == 4 && bigDecimal3 != null) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                            }
                                        } else if (bigDecimal2 != null) {
                                            if (d != 0.0d) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                            }
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                }
                            }
                        }
                    } else if (n4.Z(l7Var.y())) {
                        bigDecimal2 = new BigDecimal(l7Var.y());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                        if (iE == 5) {
                            i = iE - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        } else {
                            i = iE - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0279  */
    /* JADX WARN: Code duplicated, block: B:105:0x0299  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:120:0x02de  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:131:0x030a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0310  */
    /* JADX WARN: Code duplicated, block: B:135:0x0324  */
    /* JADX WARN: Code duplicated, block: B:137:0x032a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0332  */
    /* JADX WARN: Code duplicated, block: B:141:0x033c  */
    /* JADX WARN: Code duplicated, block: B:150:0x035f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0368  */
    /* JADX WARN: Code duplicated, block: B:158:0x039f A[EDGE_INSN: B:158:0x039f->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:159:0x03b2 A[EDGE_INSN: B:159:0x03b2->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:199:0x0343 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x03c9 A[EDGE_INSN: B:234:0x03c9->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x017c  */
    /* JADX WARN: Code duplicated, block: B:61:0x018f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac A[LOOP:1: B:59:0x0189->B:64:0x01ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0207  */
    /* JADX WARN: Code duplicated, block: B:82:0x0210  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    /* JADX WARN: Code duplicated, block: B:91:0x024c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0260  */
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
    public boolean a(Long l, Long l2, t8 t8Var, long j, r rVar, boolean z) {
        HashSet hashSet;
        Iterator it;
        androidx.collection.f fVar;
        Iterator it2;
        Iterator it3;
        j7 j7Var;
        boolean z2;
        String strB;
        Object obj;
        Boolean boolE;
        Boolean boolE2;
        String str;
        l7 l7VarX;
        long j2;
        Boolean boolE3;
        w8 w8Var;
        Long lValueOf;
        Double dValueOf;
        j7 j7Var2;
        Boolean boolE4;
        int i;
        com.google.android.gms.internal.measurement.t3.a();
        c cVar = this.h;
        s1 s1Var = (s1) cVar.e;
        g gVar = s1Var.A;
        x0 x0Var = s1Var.C;
        s0 s0Var = s1Var.G;
        g0 g0Var = h0.F0;
        String str2 = this.a;
        boolean zG = gVar.G(str2, g0Var);
        h7 h7Var = (h7) this.i;
        long j3 = h7Var.F() ? rVar.e : j;
        s1.m(x0Var);
        v0 v0Var = x0Var.K;
        v0 v0Var2 = x0Var.F;
        boolean zIsLoggable = Log.isLoggable(x0Var.F(), 2);
        int i2 = this.b;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (zIsLoggable) {
            s1.m(x0Var);
            v0Var.d("Evaluating filter. audience, filter, event", Integer.valueOf(i2), h7Var.u() ? Integer.valueOf(h7Var.v()) : null, s0Var.a(h7Var.w()));
            s1.m(x0Var);
            n4 n4Var = cVar.y.D;
            l4.U(n4Var);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (h7Var.u()) {
                i = 0;
                n4.Q(sb, 0, "filter_id", Integer.valueOf(h7Var.v()));
            } else {
                i = 0;
            }
            n4.Q(sb, i, "event_name", ((s1) n4Var.e).G.a(h7Var.w()));
            String strM = n4.M(h7Var.C(), h7Var.D(), h7Var.F());
            if (!strM.isEmpty()) {
                n4.Q(sb, 0, "filter_type", strM);
            }
            if (h7Var.A()) {
                n4.R(sb, 1, "event_count_filter", h7Var.B());
            }
            if (h7Var.y() > 0) {
                sb.append("  filters {\n");
                Iterator it4 = h7Var.x().iterator();
                while (it4.hasNext()) {
                    n4Var.J(sb, 2, (j7) it4.next());
                }
            }
            n4.K(sb, 1);
            sb.append("}\n}\n");
            v0Var.b(sb.toString(), "Filter definition");
        }
        if (!h7Var.u() || h7Var.v() > 256) {
            s1.m(x0Var);
            v0Var2.c(x0.D(str2), String.valueOf(h7Var.u() ? Integer.valueOf(h7Var.v()) : null), "Invalid event filter ID. appId, id");
            return false;
        }
        boolean z3 = h7Var.C() || h7Var.D() || h7Var.F();
        if (z && !z3) {
            s1.m(x0Var);
            v0Var.c(Integer.valueOf(i2), h7Var.u() ? Integer.valueOf(h7Var.v()) : null, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        String strZ = t8Var.z();
        if (!h7Var.A()) {
            hashSet = new HashSet();
            it = h7Var.x().iterator();
            while (true) {
                if (it.hasNext()) {
                    fVar = new androidx.collection.f(0);
                    it2 = t8Var.w().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = h7Var.x().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zG = zG;
                                    x0Var = x0Var;
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                j7Var = (j7) it3.next();
                                if (j7Var.y()) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                strB = j7Var.B();
                                if (strB.isEmpty()) {
                                    obj = fVar.get(strB);
                                    if (obj instanceof Long) {
                                        if (obj instanceof Double) {
                                            if (obj instanceof String) {
                                                zG = zG;
                                                x0Var = x0Var;
                                                if (obj == null) {
                                                    s1.m(x0Var);
                                                    v0Var2.c(s0Var.a(strZ), s0Var.b(strB), "Unknown param type. event, param");
                                                    break;
                                                }
                                                s1.m(x0Var);
                                                v0Var.c(s0Var.a(strZ), s0Var.b(strB), "Missing param for filter. event, param");
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (j7Var.u()) {
                                                if (j7Var.w()) {
                                                    zG = zG;
                                                    x0Var = x0Var;
                                                    s1.m(x0Var);
                                                    v0Var2.c(s0Var.a(strZ), s0Var.b(strB), "No filter for String param. event, param");
                                                    break;
                                                }
                                                str = (String) obj;
                                                if (n4.Z(str)) {
                                                    zG = zG;
                                                    x0Var = x0Var;
                                                    s1.m(x0Var);
                                                    v0Var2.c(s0Var.a(strZ), s0Var.b(strB), "Invalid param value for number filter. event, param");
                                                    break;
                                                }
                                                l7VarX = j7Var.x();
                                                if (n4.Z(str)) {
                                                    zG = zG;
                                                    x0Var = x0Var;
                                                    j2 = 0;
                                                    boolE3 = e(new BigDecimal(str), l7VarX, 0.0d);
                                                } else {
                                                    boolE3 = null;
                                                }
                                                if (boolE3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolE3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                x0Var = x0Var;
                                                zG = zG;
                                            } else {
                                                o7 o7VarV = j7Var.v();
                                                s1.m(x0Var);
                                                boolE3 = d((String) obj, o7VarV, x0Var);
                                            }
                                            j2 = 0;
                                            if (boolE3 != null) {
                                                break;
                                                break;
                                            }
                                            if (boolE3.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            x0Var = x0Var;
                                            zG = zG;
                                        } else if (j7Var.w()) {
                                            double dDoubleValue = ((Double) obj).doubleValue();
                                            boolE2 = e(new BigDecimal(dDoubleValue), j7Var.x(), Math.ulp(dDoubleValue));
                                            if (boolE2 != null) {
                                                if (boolE2.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        } else {
                                            s1.m(x0Var);
                                            v0Var2.c(s0Var.a(strZ), s0Var.b(strB), "No number filter for double param. event, param");
                                        }
                                    } else if (j7Var.w()) {
                                        boolE = e(new BigDecimal(((Long) obj).longValue()), j7Var.x(), 0.0d);
                                        if (boolE != null) {
                                            if (boolE.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    } else {
                                        s1.m(x0Var);
                                        v0Var2.c(s0Var.a(strZ), s0Var.b(strB), "No number filter for long param. event, param");
                                    }
                                } else {
                                    s1.m(x0Var);
                                    v0Var2.b(s0Var.a(strZ), "Event has empty param name. event");
                                }
                            }
                        } else {
                            w8Var = (w8) it2.next();
                            if (!hashSet.contains(w8Var.v())) {
                                if (w8Var.y()) {
                                    String strV = w8Var.v();
                                    if (w8Var.y()) {
                                        lValueOf = Long.valueOf(w8Var.z());
                                    } else {
                                        lValueOf = null;
                                    }
                                    fVar.put(strV, lValueOf);
                                } else if (w8Var.C()) {
                                    String strV2 = w8Var.v();
                                    if (w8Var.C()) {
                                        dValueOf = Double.valueOf(w8Var.D());
                                    } else {
                                        dValueOf = null;
                                    }
                                    fVar.put(strV2, dValueOf);
                                } else if (w8Var.w()) {
                                    fVar.put(w8Var.v(), w8Var.x());
                                } else {
                                    s1.m(x0Var);
                                    v0Var2.c(s0Var.a(strZ), s0Var.b(w8Var.v()), "Unknown value for param. event, param");
                                }
                            }
                        }
                    }
                } else {
                    j7Var2 = (j7) it.next();
                    if (j7Var2.B().isEmpty()) {
                        s1.m(x0Var);
                        v0Var2.b(s0Var.a(strZ), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(j7Var2.B());
                    }
                }
                zG = zG;
                x0Var = x0Var;
                break;
            }
        }
        try {
            boolE4 = e(new BigDecimal(j3), h7Var.B(), 0.0d);
        } catch (NumberFormatException unused) {
            boolE4 = null;
        }
        if (boolE4 != null) {
            if (boolE4.booleanValue()) {
                hashSet = new HashSet();
                it = h7Var.x().iterator();
                while (true) {
                    if (it.hasNext()) {
                        fVar = new androidx.collection.f(0);
                        it2 = t8Var.w().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                it3 = h7Var.x().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        zG = zG;
                                        x0Var = x0Var;
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    j7Var = (j7) it3.next();
                                    if (j7Var.y() || !j7Var.z()) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    strB = j7Var.B();
                                    if (strB.isEmpty()) {
                                        obj = fVar.get(strB);
                                        if (obj instanceof Long) {
                                            if (obj instanceof Double) {
                                                if (obj instanceof String) {
                                                    zG = zG;
                                                    x0Var = x0Var;
                                                    if (obj == null) {
                                                        s1.m(x0Var);
                                                        v0Var2.c(s0Var.a(strZ), s0Var.b(strB), "Unknown param type. event, param");
                                                        break;
                                                    }
                                                    s1.m(x0Var);
                                                    v0Var.c(s0Var.a(strZ), s0Var.b(strB), "Missing param for filter. event, param");
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                if (j7Var.u()) {
                                                    if (j7Var.w()) {
                                                        zG = zG;
                                                        x0Var = x0Var;
                                                        s1.m(x0Var);
                                                        v0Var2.c(s0Var.a(strZ), s0Var.b(strB), "No filter for String param. event, param");
                                                        break;
                                                    }
                                                    str = (String) obj;
                                                    if (n4.Z(str)) {
                                                        zG = zG;
                                                        x0Var = x0Var;
                                                        s1.m(x0Var);
                                                        v0Var2.c(s0Var.a(strZ), s0Var.b(strB), "Invalid param value for number filter. event, param");
                                                        break;
                                                    }
                                                    l7VarX = j7Var.x();
                                                    if (n4.Z(str)) {
                                                        boolE3 = null;
                                                    } else {
                                                        try {
                                                            zG = zG;
                                                            x0Var = x0Var;
                                                            j2 = 0;
                                                            try {
                                                                boolE3 = e(new BigDecimal(str), l7VarX, 0.0d);
                                                            } catch (NumberFormatException unused2) {
                                                                boolE3 = null;
                                                            }
                                                        } catch (NumberFormatException unused3) {
                                                            zG = zG;
                                                            x0Var = x0Var;
                                                            j2 = 0;
                                                        }
                                                    }
                                                    if (boolE3 != null) {
                                                        break;
                                                    }
                                                    if (boolE3.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    x0Var = x0Var;
                                                    zG = zG;
                                                } else {
                                                    o7 o7VarV2 = j7Var.v();
                                                    s1.m(x0Var);
                                                    boolE3 = d((String) obj, o7VarV2, x0Var);
                                                }
                                                j2 = 0;
                                                if (boolE3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolE3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                x0Var = x0Var;
                                                zG = zG;
                                            } else if (j7Var.w()) {
                                                s1.m(x0Var);
                                                v0Var2.c(s0Var.a(strZ), s0Var.b(strB), "No number filter for double param. event, param");
                                            } else {
                                                double dDoubleValue2 = ((Double) obj).doubleValue();
                                                try {
                                                    boolE2 = e(new BigDecimal(dDoubleValue2), j7Var.x(), Math.ulp(dDoubleValue2));
                                                } catch (NumberFormatException unused4) {
                                                    boolE2 = null;
                                                }
                                                if (boolE2 != null) {
                                                    if (boolE2.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                    }
                                                }
                                            }
                                        } else if (j7Var.w()) {
                                            s1.m(x0Var);
                                            v0Var2.c(s0Var.a(strZ), s0Var.b(strB), "No number filter for long param. event, param");
                                        } else {
                                            try {
                                                boolE = e(new BigDecimal(((Long) obj).longValue()), j7Var.x(), 0.0d);
                                            } catch (NumberFormatException unused5) {
                                                boolE = null;
                                            }
                                            if (boolE != null) {
                                                if (boolE.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        }
                                    } else {
                                        s1.m(x0Var);
                                        v0Var2.b(s0Var.a(strZ), "Event has empty param name. event");
                                    }
                                }
                            } else {
                                w8Var = (w8) it2.next();
                                if (!hashSet.contains(w8Var.v())) {
                                    if (w8Var.y()) {
                                        String strV3 = w8Var.v();
                                        if (w8Var.y()) {
                                            lValueOf = Long.valueOf(w8Var.z());
                                        } else {
                                            lValueOf = null;
                                        }
                                        fVar.put(strV3, lValueOf);
                                    } else if (w8Var.C()) {
                                        String strV4 = w8Var.v();
                                        if (w8Var.C()) {
                                            dValueOf = Double.valueOf(w8Var.D());
                                        } else {
                                            dValueOf = null;
                                        }
                                        fVar.put(strV4, dValueOf);
                                    } else if (w8Var.w()) {
                                        fVar.put(w8Var.v(), w8Var.x());
                                    } else {
                                        s1.m(x0Var);
                                        v0Var2.c(s0Var.a(strZ), s0Var.b(w8Var.v()), "Unknown value for param. event, param");
                                    }
                                }
                            }
                        }
                    } else {
                        j7Var2 = (j7) it.next();
                        if (j7Var2.B().isEmpty()) {
                            s1.m(x0Var);
                            v0Var2.b(s0Var.a(strZ), "null or empty param name in filter. event");
                        } else {
                            hashSet.add(j7Var2.B());
                        }
                    }
                }
            } else {
                bool = Boolean.FALSE;
            }
        }
        zG = zG;
        x0Var = x0Var;
        break;
        s1.m(x0Var);
        v0Var.b(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.d = bool2;
        if (!z3 || !t8Var.A()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(t8Var.B());
        if (h7Var.D()) {
            if (zG && h7Var.A()) {
                lValueOf2 = l;
            }
            this.f = lValueOf2;
            return true;
        }
        if (zG && h7Var.A()) {
            lValueOf2 = l2;
        }
        this.e = lValueOf2;
        return true;
    }

    public boolean b(Long l, Long l2, k9 k9Var, boolean z) {
        boolean z2;
        Boolean boolC;
        Boolean boolE;
        Boolean boolE2;
        Boolean boolE3;
        com.google.android.gms.internal.measurement.t3.a();
        s1 s1Var = (s1) this.h.e;
        g gVar = s1Var.A;
        s0 s0Var = s1Var.G;
        x0 x0Var = s1Var.C;
        boolean zG = gVar.G(this.a, h0.D0);
        n7 n7Var = (n7) this.i;
        boolean zY = n7Var.y();
        boolean z3 = n7Var.z();
        boolean zB = n7Var.B();
        boolean z4 = zY || z3 || zB;
        if (z && !z4) {
            s1.m(x0Var);
            x0Var.K.c(Integer.valueOf(this.b), n7Var.u() ? Integer.valueOf(n7Var.v()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        j7 j7VarX = n7Var.x();
        boolean z5 = j7VarX.z();
        if (!k9Var.z()) {
            z2 = zB;
            if (!k9Var.D()) {
                if (!k9Var.x()) {
                    s1.m(x0Var);
                    x0Var.F.b(s0Var.c(k9Var.w()), "User property has no value, property");
                } else if (j7VarX.u()) {
                    String strY = k9Var.y();
                    o7 o7VarV = j7VarX.v();
                    s1.m(x0Var);
                    boolC = c(d(strY, o7VarV, x0Var), z5);
                } else if (!j7VarX.w()) {
                    s1.m(x0Var);
                    x0Var.F.b(s0Var.c(k9Var.w()), "No string or number filter defined. property");
                } else if (n4.Z(k9Var.y())) {
                    String strY2 = k9Var.y();
                    l7 l7VarX = j7VarX.x();
                    if (n4.Z(strY2)) {
                        try {
                            boolE = e(new BigDecimal(strY2), l7VarX, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolE = null;
                        }
                    } else {
                        boolE = null;
                    }
                    boolC = c(boolE, z5);
                } else {
                    s1.m(x0Var);
                    x0Var.F.c(s0Var.c(k9Var.w()), k9Var.y(), "Invalid user property value for Numeric number filter. property, value");
                }
                boolC = null;
            } else if (j7VarX.w()) {
                double dE = k9Var.E();
                try {
                    boolE2 = e(new BigDecimal(dE), j7VarX.x(), Math.ulp(dE));
                } catch (NumberFormatException unused2) {
                    boolE2 = null;
                }
                boolC = c(boolE2, z5);
            } else {
                s1.m(x0Var);
                x0Var.F.b(s0Var.c(k9Var.w()), "No number filter for double property. property");
                boolC = null;
            }
        } else if (j7VarX.w()) {
            z2 = zB;
            try {
                boolE3 = e(new BigDecimal(k9Var.A()), j7VarX.x(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolE3 = null;
            }
            boolC = c(boolE3, z5);
        } else {
            s1.m(x0Var);
            x0Var.F.b(s0Var.c(k9Var.w()), "No number filter for long property. property");
            z2 = zB;
            boolC = null;
        }
        s1.m(x0Var);
        x0Var.K.b(boolC == null ? "null" : boolC, "Property filter result");
        if (boolC == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (!z2 || boolC.booleanValue()) {
            if (!z || n7Var.y()) {
                this.d = boolC;
            }
            if (boolC.booleanValue() && z4 && k9Var.u()) {
                long jV = k9Var.v();
                if (l != null) {
                    jV = l.longValue();
                }
                if (zG && n7Var.y() && !n7Var.z() && l2 != null) {
                    jV = l2.longValue();
                }
                if (n7Var.z()) {
                    this.f = Long.valueOf(jV);
                } else {
                    this.e = Long.valueOf(jV);
                }
            }
        }
        return true;
    }
}
