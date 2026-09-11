package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.a9;
import com.google.android.gms.internal.measurement.b9;
import com.google.android.gms.internal.measurement.e9;
import com.google.android.gms.internal.measurement.g8;
import com.google.android.gms.internal.measurement.g9;
import com.google.android.gms.internal.measurement.i9;
import com.google.android.gms.internal.measurement.j7;
import com.google.android.gms.internal.measurement.j8;
import com.google.android.gms.internal.measurement.j9;
import com.google.android.gms.internal.measurement.k9;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.internal.measurement.w8;
import com.google.android.gms.internal.measurement.z8;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n4 extends g4 {
    public long A;
    public long B;

    public static Bundle A(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(A((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void D(s8 s8Var, String str, Long l) {
        List listG = s8Var.g();
        int i = 0;
        while (true) {
            if (i >= listG.size()) {
                i = -1;
                break;
            } else if (str.equals(((w8) listG.get(i)).v())) {
                break;
            } else {
                i++;
            }
        }
        v8 v8VarG = w8.G();
        v8VarG.g(str);
        v8VarG.i(l.longValue());
        if (i < 0) {
            s8Var.k(v8VarG);
        } else {
            s8Var.b();
            ((t8) s8Var.y).L(i, (w8) v8VarG.d());
        }
    }

    public static final Bundle E(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w8 w8Var = (w8) it.next();
            String strV = w8Var.v();
            if (w8Var.C()) {
                bundle.putDouble(strV, w8Var.D());
            } else if (w8Var.A()) {
                bundle.putFloat(strV, w8Var.B());
            } else if (w8Var.w()) {
                bundle.putString(strV, w8Var.x());
            } else if (w8Var.y()) {
                bundle.putLong(strV, w8Var.z());
            }
        }
        return bundle;
    }

    public static final w8 F(t8 t8Var, String str) {
        for (w8 w8Var : t8Var.w()) {
            if (w8Var.v().equals(str)) {
                return w8Var;
            }
        }
        return null;
    }

    public static final String G(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final Serializable H(t8 t8Var, String str) {
        w8 w8VarF = F(t8Var, str);
        if (w8VarF == null) {
            return null;
        }
        return N(w8VarF);
    }

    public static final void K(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void L(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (hashSet.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String M(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable N(w8 w8Var) {
        if (w8Var.w()) {
            return w8Var.x();
        }
        if (w8Var.y()) {
            return Long.valueOf(w8Var.z());
        }
        if (w8Var.C()) {
            return Double.valueOf(w8Var.D());
        }
        if (w8Var.F() > 0) {
            return i0(w8Var.E());
        }
        return null;
    }

    public static final void O(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                L(builder, str3, string, hashSet);
            }
        }
    }

    public static final void P(StringBuilder sb, String str, e9 e9Var) {
        if (e9Var == null) {
            return;
        }
        K(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (e9Var.x() != 0) {
            K(sb, 4);
            sb.append("results: ");
            int i = 0;
            for (Long l : e9Var.w()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (e9Var.v() != 0) {
            K(sb, 4);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : e9Var.u()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (e9Var.z() != 0) {
            K(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (r8 r8Var : e9Var.y()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(r8Var.u() ? Integer.valueOf(r8Var.v()) : null);
                sb.append(":");
                sb.append(r8Var.w() ? Long.valueOf(r8Var.x()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (e9Var.B() != 0) {
            K(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (g9 g9Var : e9Var.A()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(g9Var.u() ? Integer.valueOf(g9Var.v()) : null);
                sb.append(": [");
                Iterator it = g9Var.w().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        K(sb, 3);
        sb.append("}\n");
    }

    public static final void Q(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        K(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void R(StringBuilder sb, int i, String str, l7 l7Var) {
        String str2;
        if (l7Var == null) {
            return;
        }
        K(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (l7Var.u()) {
            int iE = l7Var.E();
            if (iE == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iE == 2) {
                str2 = "LESS_THAN";
            } else if (iE != 3) {
                str2 = iE != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            Q(sb, i, "comparison_type", str2);
        }
        if (l7Var.v()) {
            Q(sb, i, "match_as_float", Boolean.valueOf(l7Var.w()));
        }
        if (l7Var.x()) {
            Q(sb, i, "comparison_value", l7Var.y());
        }
        if (l7Var.z()) {
            Q(sb, i, "min_comparison_value", l7Var.A());
        }
        if (l7Var.B()) {
            Q(sb, i, "max_comparison_value", l7Var.C());
        }
        K(sb, i);
        sb.append("}\n");
    }

    public static boolean Z(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean a0(com.google.android.gms.internal.measurement.q1 q1Var, int i) {
        if (i < ((com.google.android.gms.internal.measurement.x1) q1Var).z * 64) {
            return ((1 << (i % 64)) & ((Long) ((com.google.android.gms.internal.measurement.x1) q1Var).get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList b0(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static com.google.android.gms.internal.measurement.g1 g0(com.google.android.gms.internal.measurement.g1 g1Var, byte[] bArr) throws com.google.android.gms.internal.measurement.t1 {
        com.google.android.gms.internal.measurement.a1 a1VarA = com.google.android.gms.internal.measurement.a1.a();
        if (a1VarA != null) {
            g1Var.getClass();
            g1Var.f(bArr, bArr.length, a1VarA);
            return g1Var;
        }
        g1Var.getClass();
        int length = bArr.length;
        int i = com.google.android.gms.internal.measurement.o0.a;
        g1Var.f(bArr, length, com.google.android.gms.internal.measurement.a1.b);
        return g1Var;
    }

    public static int h0(a9 a9Var, String str) {
        for (int i = 0; i < ((b9) a9Var.y).b2(); i++) {
            if (str.equals(((b9) a9Var.y).c2(i).w())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] i0(com.google.android.gms.internal.measurement.r1 r1Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = r1Var.iterator();
        while (it.hasNext()) {
            w8 w8Var = (w8) it.next();
            if (w8Var != null) {
                Bundle bundle = new Bundle();
                for (w8 w8Var2 : w8Var.E()) {
                    if (w8Var2.w()) {
                        bundle.putString(w8Var2.v(), w8Var2.x());
                    } else if (w8Var2.y()) {
                        bundle.putLong(w8Var2.v(), w8Var2.z());
                    } else if (w8Var2.C()) {
                        bundle.putDouble(w8Var2.v(), w8Var2.D());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap j0(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(j0((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(j0((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(j0((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static u z(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle bundleA = A(bVar.c, true);
        String string = (!bundleA.containsKey("_o") || (obj = bundleA.get("_o")) == null) ? "app" : obj.toString();
        String strG = g2.g(bVar.a, g2.a, g2.f);
        if (strG == null) {
            strG = bVar.a;
        }
        return new u(strG, new t(bundleA), string, bVar.b, 0L);
    }

    public final void B(Map map) {
        long epochMilli;
        s1 s1Var = (s1) this.e;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            String strG = G("Date", map);
            if (TextUtils.isEmpty(strG)) {
                return;
            }
            if (i >= 26) {
                try {
                    epochMilli = ZonedDateTime.parse(strG, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
                } catch (DateTimeParseException unused) {
                    x0 x0Var = s1Var.C;
                    s1.m(x0Var);
                    x0Var.F.b(strG, "Unable to parse header time, time");
                    epochMilli = 0;
                }
            } else {
                epochMilli = 0;
            }
            if (epochMilli > 0) {
                s1Var.H.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                v();
                if (this.B == 0) {
                    this.A = jElapsedRealtime;
                    this.B = epochMilli;
                }
            }
        }
    }

    public final long C(long j) {
        v();
        long j2 = this.B;
        if (j2 == 0 || j == 0) {
            return 0L;
        }
        return (j2 - this.A) + j;
    }

    public final void I(StringBuilder sb, int i, com.google.android.gms.internal.measurement.r1 r1Var) {
        if (r1Var == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = r1Var.iterator();
        while (it.hasNext()) {
            w8 w8Var = (w8) it.next();
            if (w8Var != null) {
                K(sb, i2);
                sb.append("param {\n");
                Q(sb, i2, "name", w8Var.u() ? ((s1) this.e).G.b(w8Var.v()) : null);
                Q(sb, i2, "string_value", w8Var.w() ? w8Var.x() : null);
                Q(sb, i2, "int_value", w8Var.y() ? Long.valueOf(w8Var.z()) : null);
                Q(sb, i2, "double_value", w8Var.C() ? Double.valueOf(w8Var.D()) : null);
                if (w8Var.F() > 0) {
                    I(sb, i2, w8Var.E());
                }
                K(sb, i2);
                sb.append("}\n");
            }
        }
    }

    public final void J(StringBuilder sb, int i, j7 j7Var) {
        String str;
        if (j7Var == null) {
            return;
        }
        K(sb, i);
        sb.append("filter {\n");
        if (j7Var.y()) {
            Q(sb, i, "complement", Boolean.valueOf(j7Var.z()));
        }
        if (j7Var.A()) {
            Q(sb, i, "param_name", ((s1) this.e).G.b(j7Var.B()));
        }
        if (j7Var.u()) {
            int i2 = i + 1;
            o7 o7VarV = j7Var.v();
            if (o7VarV != null) {
                K(sb, i2);
                sb.append("string_filter {\n");
                if (o7VarV.u()) {
                    switch (o7VarV.C()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    Q(sb, i2, "match_type", str);
                }
                if (o7VarV.v()) {
                    Q(sb, i2, "expression", o7VarV.w());
                }
                if (o7VarV.x()) {
                    Q(sb, i2, "case_sensitive", Boolean.valueOf(o7VarV.y()));
                }
                if (o7VarV.A() > 0) {
                    K(sb, i + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : o7VarV.z()) {
                        K(sb, i + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                K(sb, i2);
                sb.append("}\n");
            }
        }
        if (j7Var.w()) {
            R(sb, i + 1, "number_filter", j7Var.x());
        }
        K(sb, i);
        sb.append("}\n");
    }

    public final void S(j9 j9Var, Object obj) {
        com.google.android.gms.common.internal.x.g(obj);
        j9Var.b();
        ((k9) j9Var.y).J();
        j9Var.b();
        ((k9) j9Var.y).L();
        j9Var.b();
        ((k9) j9Var.y).N();
        if (obj instanceof String) {
            j9Var.b();
            ((k9) j9Var.y).I((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            j9Var.b();
            ((k9) j9Var.y).K(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            j9Var.b();
            ((k9) j9Var.y).M(dDoubleValue);
        } else {
            x0 x0Var = ((s1) this.e).C;
            s1.m(x0Var);
            x0Var.C.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public final void T(v8 v8Var, Object obj) {
        v8Var.b();
        ((w8) v8Var.y).J();
        v8Var.b();
        ((w8) v8Var.y).L();
        v8Var.b();
        ((w8) v8Var.y).N();
        v8Var.b();
        ((w8) v8Var.y).Q();
        if (obj instanceof String) {
            v8Var.h((String) obj);
            return;
        }
        if (obj instanceof Long) {
            v8Var.i(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            v8Var.b();
            ((w8) v8Var.y).M(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            x0 x0Var = ((s1) this.e).C;
            s1.m(x0Var);
            x0Var.C.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                v8 v8VarG = w8.G();
                for (String str : bundle.keySet()) {
                    v8 v8VarG2 = w8.G();
                    v8VarG2.g(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        v8VarG2.i(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        v8VarG2.h((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        v8VarG2.b();
                        ((w8) v8VarG2.y).M(dDoubleValue2);
                    }
                    v8VarG.b();
                    ((w8) v8VarG.y).O((w8) v8VarG2.d());
                }
                if (((w8) v8VarG.y).F() > 0) {
                    arrayList.add((w8) v8VarG.d());
                }
            }
        }
        v8Var.b();
        ((w8) v8Var.y).P(arrayList);
    }

    public final a4 U(String str, a9 a9Var, s8 s8Var, String str2) {
        int iIndexOf;
        com.google.android.gms.internal.measurement.g4.a();
        s1 s1Var = (s1) this.e;
        g gVar = s1Var.A;
        if (!gVar.G(str, h0.O0)) {
            return null;
        }
        s1Var.H.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(gVar.C(str, h0.t0).split(",")));
        l4 l4Var = this.y;
        i4 i4Var = l4Var.G;
        l1 l1Var = l4Var.e;
        l1 l1Var2 = i4Var.y.e;
        l4.U(l1Var2);
        String strI = l1Var2.I(str);
        Uri.Builder builder = new Uri.Builder();
        g gVar2 = ((s1) i4Var.e).A;
        builder.scheme(gVar2.C(str, h0.m0));
        if (TextUtils.isEmpty(strI)) {
            builder.authority(gVar2.C(str, h0.n0));
        } else {
            String strC = gVar2.C(str, h0.n0);
            StringBuilder sb = new StringBuilder(String.valueOf(strI).length() + 1 + String.valueOf(strC).length());
            sb.append(strI);
            sb.append(".");
            sb.append(strC);
            builder.authority(sb.toString());
        }
        builder.path(gVar2.C(str, h0.o0));
        L(builder, "gmp_app_id", ((b9) a9Var.y).J(), hashSet);
        gVar.B();
        L(builder, "gmp_version", String.valueOf(161000L), hashSet);
        String strD = ((b9) a9Var.y).D();
        g0 g0Var = h0.R0;
        if (gVar.G(str, g0Var)) {
            l4.U(l1Var);
            if (l1Var.P(str)) {
                strD = "";
            }
        }
        L(builder, "app_instance_id", strD, hashSet);
        L(builder, "rdid", ((b9) a9Var.y).A(), hashSet);
        L(builder, "bundle_id", a9Var.n(), hashSet);
        String strM = s8Var.m();
        String strG = g2.g(strM, g2.f, g2.a);
        if (true != TextUtils.isEmpty(strG)) {
            strM = strG;
        }
        L(builder, "app_event_name", strM, hashSet);
        L(builder, "app_version", String.valueOf(((b9) a9Var.y).P()), hashSet);
        String strO2 = ((b9) a9Var.y).o2();
        if (gVar.G(str, g0Var)) {
            l4.U(l1Var);
            if (l1Var.O(str) && !TextUtils.isEmpty(strO2) && (iIndexOf = strO2.indexOf(".")) != -1) {
                strO2 = strO2.substring(0, iIndexOf);
            }
        }
        L(builder, "os_version", strO2, hashSet);
        L(builder, "timestamp", String.valueOf(s8Var.o()), hashSet);
        if (((b9) a9Var.y).C()) {
            L(builder, "lat", "1", hashSet);
        }
        L(builder, "privacy_sandbox_version", String.valueOf(((b9) a9Var.y).L0()), hashSet);
        L(builder, "trigger_uri_source", "1", hashSet);
        L(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), hashSet);
        L(builder, "request_uuid", str2, hashSet);
        List<w8> listG = s8Var.g();
        Bundle bundle = new Bundle();
        for (w8 w8Var : listG) {
            String strV = w8Var.v();
            if (w8Var.C()) {
                bundle.putString(strV, String.valueOf(w8Var.D()));
            } else if (w8Var.A()) {
                bundle.putString(strV, String.valueOf(w8Var.B()));
            } else if (w8Var.w()) {
                bundle.putString(strV, w8Var.x());
            } else if (w8Var.y()) {
                bundle.putString(strV, String.valueOf(w8Var.z()));
            }
        }
        O(builder, gVar.C(str, h0.s0).split("\\|"), bundle, hashSet);
        List<k9> listUnmodifiableList = Collections.unmodifiableList(((b9) a9Var.y).a2());
        Bundle bundle2 = new Bundle();
        for (k9 k9Var : listUnmodifiableList) {
            String strW = k9Var.w();
            if (k9Var.D()) {
                bundle2.putString(strW, String.valueOf(k9Var.E()));
            } else if (k9Var.B()) {
                bundle2.putString(strW, String.valueOf(k9Var.C()));
            } else if (k9Var.x()) {
                bundle2.putString(strW, k9Var.y());
            } else if (k9Var.z()) {
                bundle2.putString(strW, String.valueOf(k9Var.A()));
            }
        }
        O(builder, gVar.C(str, h0.r0).split("\\|"), bundle2, hashSet);
        L(builder, "dma", true != ((b9) a9Var.y).I0() ? "0" : "1", hashSet);
        if (!((b9) a9Var.y).K0().isEmpty()) {
            L(builder, "dma_cps", ((b9) a9Var.y).K0(), hashSet);
        }
        if (((b9) a9Var.y).Q0()) {
            g8 g8VarR0 = ((b9) a9Var.y).R0();
            if (!g8VarR0.I().isEmpty()) {
                L(builder, "dl_gclid", g8VarR0.I(), hashSet);
            }
            if (!g8VarR0.K().isEmpty()) {
                L(builder, "dl_gbraid", g8VarR0.K(), hashSet);
            }
            if (!g8VarR0.M().isEmpty()) {
                L(builder, "dl_gs", g8VarR0.M(), hashSet);
            }
            if (g8VarR0.O() > 0) {
                L(builder, "dl_ss_ts", String.valueOf(g8VarR0.O()), hashSet);
            }
            if (!g8VarR0.Q().isEmpty()) {
                L(builder, "mr_gclid", g8VarR0.Q(), hashSet);
            }
            if (!g8VarR0.S().isEmpty()) {
                L(builder, "mr_gbraid", g8VarR0.S(), hashSet);
            }
            if (!g8VarR0.U().isEmpty()) {
                L(builder, "mr_gs", g8VarR0.U(), hashSet);
            }
            if (g8VarR0.W() > 0) {
                L(builder, "mr_click_ts", String.valueOf(g8VarR0.W()), hashSet);
            }
        }
        return new a4(1, jCurrentTimeMillis, builder.build().toString());
    }

    public final t8 V(q qVar) {
        s8 s8VarK = t8.K();
        long j = qVar.f;
        s8VarK.b();
        ((t8) s8VarK.y).S(j);
        long j2 = qVar.e;
        s8VarK.b();
        ((t8) s8VarK.y).u(j2);
        t tVar = qVar.g;
        Objects.requireNonNull(tVar);
        Bundle bundle = tVar.e;
        for (String str : bundle.keySet()) {
            v8 v8VarG = w8.G();
            v8VarG.g(str);
            Object obj = bundle.get(str);
            com.google.android.gms.common.internal.x.g(obj);
            T(v8VarG, obj);
            s8VarK.k(v8VarG);
        }
        String str2 = qVar.c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            v8 v8VarG2 = w8.G();
            v8VarG2.g("_o");
            v8VarG2.h(str2);
            s8VarK.j((w8) v8VarG2.d());
        }
        return (t8) s8VarK.d();
    }

    public final String W(z8 z8Var) {
        String str;
        String str2;
        String str3;
        j8 j8VarN0;
        StringBuilder sbN = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.n("\nbatch {\n");
        if (z8Var.z()) {
            Q(sbN, 0, "upload_subdomain", z8Var.A());
        }
        if (z8Var.x()) {
            Q(sbN, 0, "sgtm_join_id", z8Var.y());
        }
        for (b9 b9Var : z8Var.u()) {
            if (b9Var != null) {
                K(sbN, 1);
                sbN.append("bundle {\n");
                if (b9Var.U()) {
                    Q(sbN, 1, "protocol_version", Integer.valueOf(b9Var.U0()));
                }
                s1 s1Var = (s1) this.e;
                g gVar = s1Var.A;
                s0 s0Var = s1Var.G;
                if (gVar.G(b9Var.u(), h0.M0) && b9Var.A0()) {
                    Q(sbN, 1, "session_stitching_token", b9Var.B0());
                }
                Q(sbN, 1, "platform", b9Var.n2());
                if (b9Var.w()) {
                    Q(sbN, 1, "gmp_version", Long.valueOf(b9Var.x()));
                }
                if (b9Var.y()) {
                    Q(sbN, 1, "uploading_gmp_version", Long.valueOf(b9Var.z()));
                }
                if (b9Var.w0()) {
                    Q(sbN, 1, "dynamite_version", Long.valueOf(b9Var.x0()));
                }
                if (b9Var.Q()) {
                    Q(sbN, 1, "config_version", Long.valueOf(b9Var.R()));
                }
                Q(sbN, 1, "gmp_app_id", b9Var.J());
                Q(sbN, 1, "app_id", b9Var.u());
                Q(sbN, 1, "app_version", b9Var.v());
                if (b9Var.O()) {
                    Q(sbN, 1, "app_version_major", Integer.valueOf(b9Var.P()));
                }
                Q(sbN, 1, "firebase_instance_id", b9Var.N());
                if (b9Var.E()) {
                    Q(sbN, 1, "dev_cert_hash", Long.valueOf(b9Var.F()));
                }
                Q(sbN, 1, "app_store", b9Var.t2());
                if (b9Var.d2()) {
                    Q(sbN, 1, "upload_timestamp_millis", Long.valueOf(b9Var.e2()));
                }
                if (b9Var.f2()) {
                    Q(sbN, 1, "start_timestamp_millis", Long.valueOf(b9Var.g2()));
                }
                if (b9Var.h2()) {
                    Q(sbN, 1, "end_timestamp_millis", Long.valueOf(b9Var.i2()));
                }
                if (b9Var.j2()) {
                    Q(sbN, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(b9Var.k2()));
                }
                if (b9Var.l2()) {
                    Q(sbN, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(b9Var.m2()));
                }
                Q(sbN, 1, "app_instance_id", b9Var.D());
                Q(sbN, 1, "resettable_device_id", b9Var.A());
                Q(sbN, 1, "ds_id", b9Var.T());
                if (b9Var.B()) {
                    Q(sbN, 1, "limited_ad_tracking", Boolean.valueOf(b9Var.C()));
                }
                Q(sbN, 1, "os_version", b9Var.o2());
                Q(sbN, 1, "device_model", b9Var.p2());
                Q(sbN, 1, "user_default_language", b9Var.q2());
                if (b9Var.r2()) {
                    Q(sbN, 1, "time_zone_offset_minutes", Integer.valueOf(b9Var.s2()));
                }
                if (b9Var.G()) {
                    Q(sbN, 1, "bundle_sequential_index", Integer.valueOf(b9Var.H()));
                }
                if (b9Var.O0()) {
                    Q(sbN, 1, "delivery_index", Integer.valueOf(b9Var.P0()));
                }
                if (b9Var.K()) {
                    Q(sbN, 1, "service_upload", Boolean.valueOf(b9Var.L()));
                }
                Q(sbN, 1, "health_monitor", b9Var.I());
                if (b9Var.u0()) {
                    Q(sbN, 1, "retry_counter", Integer.valueOf(b9Var.v0()));
                }
                if (b9Var.y0()) {
                    Q(sbN, 1, "consent_signals", b9Var.z0());
                }
                if (b9Var.H0()) {
                    Q(sbN, 1, "is_dma_region", Boolean.valueOf(b9Var.I0()));
                }
                if (b9Var.J0()) {
                    Q(sbN, 1, "core_platform_services", b9Var.K0());
                }
                if (b9Var.F0()) {
                    Q(sbN, 1, "consent_diagnostics", b9Var.G0());
                }
                if (b9Var.C0()) {
                    Q(sbN, 1, "target_os_version", Long.valueOf(b9Var.D0()));
                }
                com.google.android.gms.internal.measurement.g4.a();
                if (gVar.G(b9Var.u(), h0.O0)) {
                    Q(sbN, 1, "ad_services_version", Integer.valueOf(b9Var.L0()));
                    if (b9Var.M0() && (j8VarN0 = b9Var.N0()) != null) {
                        K(sbN, 2);
                        sbN.append("attribution_eligibility_status {\n");
                        Q(sbN, 2, "eligible", Boolean.valueOf(j8VarN0.u()));
                        Q(sbN, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(j8VarN0.v()));
                        Q(sbN, 2, "pre_r", Boolean.valueOf(j8VarN0.w()));
                        Q(sbN, 2, "r_extensions_too_old", Boolean.valueOf(j8VarN0.x()));
                        Q(sbN, 2, "adservices_extension_too_old", Boolean.valueOf(j8VarN0.y()));
                        Q(sbN, 2, "ad_storage_not_allowed", Boolean.valueOf(j8VarN0.z()));
                        Q(sbN, 2, "measurement_manager_disabled", Boolean.valueOf(j8VarN0.A()));
                        K(sbN, 2);
                        sbN.append("}\n");
                    }
                }
                if (b9Var.Q0()) {
                    g8 g8VarR0 = b9Var.R0();
                    K(sbN, 2);
                    sbN.append("ad_campaign_info {\n");
                    if (g8VarR0.H()) {
                        Q(sbN, 2, "deep_link_gclid", g8VarR0.I());
                    }
                    if (g8VarR0.J()) {
                        Q(sbN, 2, "deep_link_gbraid", g8VarR0.K());
                    }
                    if (g8VarR0.L()) {
                        Q(sbN, 2, "deep_link_gad_source", g8VarR0.M());
                    }
                    if (g8VarR0.X()) {
                        Q(sbN, 2, "deep_link_url", g8VarR0.Y());
                    }
                    if (g8VarR0.N()) {
                        Q(sbN, 2, "deep_link_session_millis", Long.valueOf(g8VarR0.O()));
                    }
                    if (g8VarR0.P()) {
                        Q(sbN, 2, "market_referrer_gclid", g8VarR0.Q());
                    }
                    if (g8VarR0.R()) {
                        Q(sbN, 2, "market_referrer_gbraid", g8VarR0.S());
                    }
                    if (g8VarR0.T()) {
                        Q(sbN, 2, "market_referrer_gad_source", g8VarR0.U());
                    }
                    if (g8VarR0.V()) {
                        Q(sbN, 2, "market_referrer_click_millis", Long.valueOf(g8VarR0.W()));
                    }
                    K(sbN, 2);
                    sbN.append("}\n");
                }
                if (b9Var.V()) {
                    Q(sbN, 1, "batching_timestamp_millis", Long.valueOf(b9Var.W()));
                }
                if (b9Var.S0()) {
                    i9 i9VarT0 = b9Var.T0();
                    K(sbN, 2);
                    sbN.append("sgtm_diagnostics {\n");
                    int iY = i9VarT0.y();
                    if (iY == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iY == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iY != 3) {
                        str2 = iY != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    Q(sbN, 2, "upload_type", str2);
                    Q(sbN, 2, "client_upload_eligibility", com.google.android.datatransport.runtime.backends.c.v(i9VarT0.u()));
                    int iZ = i9VarT0.z();
                    if (iZ == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iZ == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iZ == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iZ != 4) {
                        str3 = iZ != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    Q(sbN, 2, "service_upload_eligibility", str3);
                    K(sbN, 2);
                    sbN.append("}\n");
                }
                if (b9Var.X()) {
                    p8 p8VarY = b9Var.Y();
                    K(sbN, 2);
                    sbN.append("consent_info_extra {\n");
                    for (o8 o8Var : p8VarY.u()) {
                        K(sbN, 3);
                        sbN.append("limited_data_modes {\n");
                        int iV = o8Var.v();
                        if (iV == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iV == 2) {
                            str = "AD_STORAGE";
                        } else if (iV != 3) {
                            str = iV != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        Q(sbN, 3, "type", str);
                        int iW = o8Var.w();
                        Q(sbN, 3, "mode", iW != 1 ? iW != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        K(sbN, 3);
                        sbN.append("}\n");
                    }
                    K(sbN, 2);
                    sbN.append("}\n");
                }
                com.google.android.gms.internal.measurement.r1<k9> r1VarA2 = b9Var.a2();
                if (r1VarA2 != null) {
                    for (k9 k9Var : r1VarA2) {
                        if (k9Var != null) {
                            K(sbN, 2);
                            sbN.append("user_property {\n");
                            Q(sbN, 2, "set_timestamp_millis", k9Var.u() ? Long.valueOf(k9Var.v()) : null);
                            Q(sbN, 2, "name", s0Var.c(k9Var.w()));
                            Q(sbN, 2, "string_value", k9Var.y());
                            Q(sbN, 2, "int_value", k9Var.z() ? Long.valueOf(k9Var.A()) : null);
                            Q(sbN, 2, "double_value", k9Var.D() ? Double.valueOf(k9Var.E()) : null);
                            K(sbN, 2);
                            sbN.append("}\n");
                        }
                    }
                }
                com.google.android.gms.internal.measurement.r1<l8> r1VarM = b9Var.M();
                if (r1VarM != null) {
                    for (l8 l8Var : r1VarM) {
                        if (l8Var != null) {
                            K(sbN, 2);
                            sbN.append("audience_membership {\n");
                            if (l8Var.u()) {
                                Q(sbN, 2, "audience_id", Integer.valueOf(l8Var.v()));
                            }
                            if (l8Var.z()) {
                                Q(sbN, 2, "new_audience", Boolean.valueOf(l8Var.A()));
                            }
                            P(sbN, "current_data", l8Var.w());
                            if (l8Var.x()) {
                                P(sbN, "previous_data", l8Var.y());
                            }
                            K(sbN, 2);
                            sbN.append("}\n");
                        }
                    }
                }
                List<t8> listU1 = b9Var.U1();
                if (listU1 != null) {
                    for (t8 t8Var : listU1) {
                        if (t8Var != null) {
                            K(sbN, 2);
                            sbN.append("event {\n");
                            Q(sbN, 2, "name", s0Var.a(t8Var.z()));
                            if (t8Var.A()) {
                                Q(sbN, 2, "timestamp_millis", Long.valueOf(t8Var.B()));
                            }
                            if (gVar.G(null, h0.e1) && t8Var.G()) {
                                Q(sbN, 2, "corrected_timestamp_millis", Long.valueOf(t8Var.H()));
                            }
                            if (t8Var.C()) {
                                Q(sbN, 2, "previous_timestamp_millis", Long.valueOf(t8Var.D()));
                            }
                            if (t8Var.E()) {
                                Q(sbN, 2, "count", Integer.valueOf(t8Var.F()));
                            }
                            if (t8Var.x() != 0) {
                                I(sbN, 2, (com.google.android.gms.internal.measurement.r1) t8Var.w());
                            }
                            K(sbN, 2);
                            sbN.append("}\n");
                        }
                    }
                }
                K(sbN, 1);
                sbN.append("}\n");
            }
        }
        sbN.append("} // End-of-batch\n");
        return sbN.toString();
    }

    public final String X(n7 n7Var) {
        StringBuilder sbN = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.n("\nproperty_filter {\n");
        if (n7Var.u()) {
            Q(sbN, 0, "filter_id", Integer.valueOf(n7Var.v()));
        }
        Q(sbN, 0, "property_name", ((s1) this.e).G.c(n7Var.w()));
        String strM = M(n7Var.y(), n7Var.z(), n7Var.B());
        if (!strM.isEmpty()) {
            Q(sbN, 0, "filter_type", strM);
        }
        J(sbN, 1, n7Var.x());
        sbN.append("}\n");
        return sbN.toString();
    }

    public final Parcelable Y(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (com.google.android.gms.common.internal.safeparcel.b unused) {
            x0 x0Var = ((s1) this.e).C;
            s1.m(x0Var);
            x0Var.C.a("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    public final List c0(com.google.android.gms.internal.measurement.q1 q1Var, List list) {
        int i;
        s1 s1Var = (s1) this.e;
        ArrayList arrayList = new ArrayList(q1Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                x0 x0Var = s1Var.C;
                s1.m(x0Var);
                x0Var.F.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    x0 x0Var2 = s1Var.C;
                    s1.m(x0Var2);
                    x0Var2.F.c(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final boolean d0(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((s1) this.e).H.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public final long e0(byte[] bArr) {
        com.google.android.gms.common.internal.x.g(bArr);
        s1 s1Var = (s1) this.e;
        r4 r4Var = s1Var.F;
        s1.k(r4Var);
        r4Var.v();
        MessageDigest messageDigestO = r4.O();
        if (messageDigestO != null) {
            return r4.P(messageDigestO.digest(bArr));
        }
        x0 x0Var = s1Var.C;
        s1.m(x0Var);
        x0Var.C.a("Failed to get MD5");
        return 0L;
    }

    public final byte[] f0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            x0 x0Var = ((s1) this.e).C;
            s1.m(x0Var);
            x0Var.C.b(e, "Failed to gzip content");
            throw e;
        }
    }

    @Override // com.google.android.gms.measurement.internal.g4
    public final void y() {
    }
}
