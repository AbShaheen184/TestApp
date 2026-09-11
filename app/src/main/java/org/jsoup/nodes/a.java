package org.jsoup.nodes;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Map.Entry, Cloneable {
    public static final String[] A = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    public static final Pattern B = Pattern.compile("[^-a-zA-Z0-9_:.]+");
    public static final Pattern C = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]+");
    public final String e;
    public String y;
    public b z;

    public a(String str, String str2, b bVar) {
        org.jsoup.helper.n.H(str);
        String strTrim = str.trim();
        org.jsoup.helper.n.E(strTrim);
        this.e = strTrim;
        this.y = str2;
        this.z = bVar;
    }

    public static String a(int i, String str) {
        if (i == 2 && !c(str)) {
            String strReplaceAll = B.matcher(str).replaceAll("_");
            if (c(strReplaceAll)) {
                return strReplaceAll;
            }
            return null;
        }
        if (i != 1 || b(str)) {
            return str;
        }
        String strReplaceAll2 = C.matcher(str).replaceAll("_");
        if (b(strReplaceAll2)) {
            return strReplaceAll2;
        }
        return null;
    }

    public static boolean b(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || ((cCharAt >= 127 && cCharAt <= 159) || cCharAt == ' ' || cCharAt == '\"' || cCharAt == '\'' || cCharAt == '/' || cCharAt == '=')) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == '_' || cCharAt == ':')) {
            return false;
        }
        for (int i = 1; i < length; i++) {
            char cCharAt2 = str.charAt(i);
            if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && !((cCharAt2 >= '0' && cCharAt2 <= '9') || cCharAt2 == '-' || cCharAt2 == '_' || cCharAt2 == ':' || cCharAt2 == '.'))) {
                return false;
            }
        }
        return true;
    }

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e) {
            net.luminis.tls.engine.impl.c.k(e);
            return null;
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (Objects.equals(this.e, aVar.e) && Objects.equals(this.y, aVar.y)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        String str = this.y;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return Objects.hash(this.e, this.y);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        String str;
        int iL;
        String str2 = (String) obj;
        String strH = this.y;
        b bVar = this.z;
        if (bVar != null && (iL = bVar.l((str = this.e))) != -1) {
            strH = this.z.h(str);
            this.z.z[iL] = str2;
        }
        this.y = str2;
        return strH == null ? "" : strH;
    }

    public final String toString() {
        StringBuilder sbB = org.jsoup.internal.k.b();
        org.jsoup.internal.b bVarE = org.jsoup.internal.b.e(sbB);
        k kVar = k.base;
        Charset charset = org.jsoup.helper.b.b;
        String str = this.y;
        String strA = a(1, this.e);
        if (strA != null) {
            bVarE.b(strA);
            if (str != null && ((!str.isEmpty() && !str.equalsIgnoreCase(strA)) || Arrays.binarySearch(A, org.jsoup.internal.b.c(strA)) < 0)) {
                bVarE.b("=\"");
                l.c(str, bVarE, kVar, charset, 2);
                bVarE.a('\"');
            }
        }
        return org.jsoup.internal.k.l(sbB);
    }
}
