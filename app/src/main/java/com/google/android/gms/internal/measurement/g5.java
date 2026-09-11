package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g5 implements Iterable, d5 {
    public final String e;

    public g5(String str) {
        if (str != null) {
            this.e = str;
        } else {
            net.luminis.tls.engine.impl.c.o("StringValue cannot be null.");
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Iterator b() {
        return new f5(this, 0);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Boolean c() {
        return Boolean.valueOf(!this.e.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final String d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g5) {
            return this.e.equals(((g5) obj).e);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Double h() {
        String str = this.e;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f5(this, 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x02e4 A[PHI: r8
  0x02e4: PHI (r8v6 boolean) = (r8v12 boolean), (r8v13 boolean), (r8v16 boolean) binds: [B:100:0x02d0, B:101:0x02d2, B:103:0x02e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.d5
    public final d5 j(String str, b7 b7Var, ArrayList arrayList) {
        String str2;
        int i;
        int i2;
        int i3;
        boolean zIsEmpty;
        b7 b7Var2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                net.luminis.tls.engine.impl.c.o(str.concat(" is not a String function"));
                return null;
            }
        }
        int iHashCode = str.hashCode();
        String strD = "undefined";
        String str3 = this.e;
        z = false;
        boolean z = false;
        switch (iHashCode) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    ea.c("hasOwnProperty", 1, arrayList);
                    d5 d5VarF = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0));
                    boolean zEquals = "length".equals(d5VarF.d());
                    b2 b2Var = d5.r;
                    if (zEquals) {
                        return b2Var;
                    }
                    double dDoubleValue = d5VarF.h().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str3.length()) ? d5.s : b2Var;
                }
                net.luminis.tls.engine.impl.c.o("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    ea.c("toString", 0, arrayList);
                    return this;
                }
                net.luminis.tls.engine.impl.c.o("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    ea.c("toLocaleLowerCase", 0, arrayList);
                    return new g5(str3.toLowerCase());
                }
                net.luminis.tls.engine.impl.c.o("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    ea.h("charAt", 1, arrayList);
                    int iR = arrayList.isEmpty() ? 0 : (int) ea.r(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).h().doubleValue());
                    return (iR < 0 || iR >= str3.length()) ? d5.t : new g5(String.valueOf(str3.charAt(iR)));
                }
                net.luminis.tls.engine.impl.c.o("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str3);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            sb.append(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(i4)).d());
                        }
                        return new g5(sb.toString());
                    }
                    return this;
                }
                net.luminis.tls.engine.impl.c.o("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    ea.c("toLowerCase", 0, arrayList);
                    return new g5(str3.toLowerCase(Locale.ENGLISH));
                }
                net.luminis.tls.engine.impl.c.o("Command not supported");
                return null;
            case -906336856:
                if (str.equals("search")) {
                    ea.h("search", 1, arrayList);
                    Matcher matcher = Pattern.compile(arrayList.isEmpty() ? "undefined" : ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).d()).matcher(str3);
                    return matcher.find() ? new j3(Double.valueOf(matcher.start())) : new j3(Double.valueOf(-1.0d));
                }
                net.luminis.tls.engine.impl.c.o("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    ea.c("toLocaleUpperCase", 0, arrayList);
                    return new g5(str3.toUpperCase());
                }
                net.luminis.tls.engine.impl.c.o("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    ea.h("lastIndexOf", 2, arrayList);
                    String strD2 = arrayList.size() > 0 ? ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).d() : "undefined";
                    double dDoubleValue2 = arrayList.size() < 2 ? Double.NaN : ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1)).h().doubleValue();
                    return new j3(Double.valueOf(str3.lastIndexOf(strD2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : ea.r(dDoubleValue2)))));
                }
                net.luminis.tls.engine.impl.c.o("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    ea.c("toUpperCase", 0, arrayList);
                    return new g5(str3.toUpperCase(Locale.ENGLISH));
                }
                net.luminis.tls.engine.impl.c.o("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str2)) {
                    ea.c("toUpperCase", 0, arrayList);
                    return new g5(str3.trim());
                }
                net.luminis.tls.engine.impl.c.o("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    ea.h("match", 1, arrayList);
                    Matcher matcher2 = Pattern.compile(arrayList.size() <= 0 ? "" : ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).d()).matcher(str3);
                    return matcher2.find() ? new l1(Arrays.asList(new g5(matcher2.group()))) : d5.n;
                }
                net.luminis.tls.engine.impl.c.o("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    ea.h("slice", 2, arrayList);
                    double dR = ea.r(!arrayList.isEmpty() ? ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).h().doubleValue() : 0.0d);
                    double dMax = dR < 0.0d ? Math.max(((double) str3.length()) + dR, 0.0d) : Math.min(dR, str3.length());
                    double dR2 = ea.r(arrayList.size() > 1 ? ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1)).h().doubleValue() : str3.length());
                    int i5 = (int) dMax;
                    return new g5(str3.substring(i5, Math.max(0, ((int) (dR2 < 0.0d ? Math.max(((double) str3.length()) + dR2, 0.0d) : Math.min(dR2, str3.length()))) - i5) + i5));
                }
                net.luminis.tls.engine.impl.c.o("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    ea.h("split", 2, arrayList);
                    if (str3.length() == 0) {
                        return new l1(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String strD3 = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).d();
                        long jP = arrayList.size() > 1 ? ((long) ea.p(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1)).h().doubleValue())) & 4294967295L : 2147483647L;
                        if (jP == 0) {
                            return new l1();
                        }
                        String[] strArrSplit = str3.split(Pattern.quote(strD3), ((int) jP) + 1);
                        int length = strArrSplit.length;
                        if (!strD3.isEmpty() || length <= 0) {
                            i3 = zIsEmpty;
                            z = zIsEmpty;
                            i2 = length;
                            i3 = z;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i2 = length - 1;
                            if (!strArrSplit[i2].isEmpty()) {
                                i3 = zIsEmpty;
                                z = zIsEmpty;
                                i2 = length;
                                i3 = z;
                            }
                        }
                        i3 = zIsEmpty;
                        z = zIsEmpty;
                        if (length > jP) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList2.add(new g5(strArrSplit[i3]));
                            i3++;
                        }
                    }
                    return new l1(arrayList2);
                }
                net.luminis.tls.engine.impl.c.o("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    ea.h("substring", 2, arrayList);
                    int iR2 = !arrayList.isEmpty() ? (int) ea.r(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).h().doubleValue()) : 0;
                    int iR3 = arrayList.size() > 1 ? (int) ea.r(((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1)).h().doubleValue()) : str3.length();
                    int iMin = Math.min(Math.max(iR2, 0), str3.length());
                    int iMin2 = Math.min(Math.max(iR3, 0), str3.length());
                    return new g5(str3.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                net.luminis.tls.engine.impl.c.o("Command not supported");
                return null;
            case 1094496948:
                if (str.equals("replace")) {
                    ea.h("replace", 2, arrayList);
                    boolean zIsEmpty2 = arrayList.isEmpty();
                    d5 d5VarA = d5.m;
                    if (!zIsEmpty2) {
                        strD = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(0)).d();
                        if (arrayList.size() > 1) {
                            d5VarA = ((j5) b7Var.z).f(b7Var, (d5) arrayList.get(1));
                        }
                    }
                    String str4 = strD;
                    int iIndexOf = str3.indexOf(str4);
                    if (iIndexOf >= 0) {
                        if (d5VarA instanceof c4) {
                            d5VarA = ((c4) d5VarA).a(b7Var, Arrays.asList(new g5(str4), new j3(Double.valueOf(iIndexOf)), this));
                        }
                        String strSubstring = str3.substring(0, iIndexOf);
                        String strD4 = d5VarA.d();
                        String strSubstring2 = str3.substring(str4.length() + iIndexOf);
                        return new g5(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder(strSubstring.length() + String.valueOf(strD4).length() + strSubstring2.length()), strSubstring, strD4, strSubstring2));
                    }
                    return this;
                }
                net.luminis.tls.engine.impl.c.o("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    ea.h("indexOf", 2, arrayList);
                    if (arrayList.size() <= 0) {
                        b7Var2 = b7Var;
                    } else {
                        b7Var2 = b7Var;
                        strD = ((j5) b7Var2.z).f(b7Var2, (d5) arrayList.get(0)).d();
                    }
                    return new j3(Double.valueOf(str3.indexOf(strD, (int) ea.r(arrayList.size() < 2 ? 0.0d : ((j5) b7Var2.z).f(b7Var2, (d5) arrayList.get(1)).h().doubleValue()))));
                }
                net.luminis.tls.engine.impl.c.o("Command not supported");
                return null;
            default:
                net.luminis.tls.engine.impl.c.o("Command not supported");
                return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final d5 l() {
        return new g5(this.e);
    }

    public final String toString() {
        String str = this.e;
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }
}
