package com.google.android.material.shape;

import android.util.StateSet;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Serializable d;
    public Serializable e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public a0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.d = "";
                this.e = "";
                this.b = -1;
                this.g = com.google.common.base.c.s("");
                break;
        }
    }

    public static ArrayList g(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iA0 = kotlin.text.k.a0(str, '&', i, 4);
            if (iA0 == -1) {
                iA0 = str.length();
            }
            int iA1 = kotlin.text.k.a0(str, '=', i, 4);
            if (iA1 == -1 || iA1 > iA0) {
                arrayList.add(str.substring(i, iA0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iA1));
                arrayList.add(str.substring(iA1 + 1, iA0));
            }
            i = iA0 + 1;
        }
        return arrayList;
    }

    public void a(String str, String str2) {
        str.getClass();
        if (((ArrayList) this.h) == null) {
            this.h = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) this.h;
        arrayList.getClass();
        arrayList.add(okhttp3.internal.url.a.a(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList2 = (ArrayList) this.h;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? okhttp3.internal.url.a.a(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91) : null);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.material.shape.o[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    public void b(int[] iArr, o oVar) {
        int i = this.b;
        if (i == 0 || iArr.length == 0) {
            this.c = oVar;
        }
        int[][] iArr2 = (int[][]) this.d;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            ?? r3 = new int[i2][];
            System.arraycopy(iArr2, 0, r3, 0, i);
            this.d = r3;
            ?? r1 = new o[i2];
            System.arraycopy((o[]) this.e, 0, r1, 0, i);
            this.e = r1;
        }
        int[][] iArr3 = (int[][]) this.d;
        int i3 = this.b;
        iArr3[i3] = iArr;
        ((o[]) this.e)[i3] = oVar;
        this.b = i3 + 1;
    }

    public okhttp3.s c() {
        ArrayList arrayList;
        String str = (String) this.c;
        if (str == null) {
            net.luminis.tls.engine.impl.c.r("scheme == null");
            return null;
        }
        String strD = okhttp3.internal.url.a.d(0, (String) this.d, 0, 7);
        String strD2 = okhttp3.internal.url.a.d(0, (String) this.e, 0, 7);
        String str2 = (String) this.f;
        if (str2 == null) {
            net.luminis.tls.engine.impl.c.r("host == null");
            return null;
        }
        int iD = d();
        ArrayList arrayList2 = (ArrayList) this.g;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.p.y(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(okhttp3.internal.url.a.d(0, (String) it.next(), 0, 7));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.h;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(kotlin.collections.p.y(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? okhttp3.internal.url.a.d(0, str3, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.i;
        return new okhttp3.s(str, strD, strD2, str2, iD, arrayList3, arrayList, str4 != null ? okhttp3.internal.url.a.d(0, str4, 0, 7) : null, toString());
    }

    public int d() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.c;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.shape.o[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void e() {
        this.c = new o();
        this.d = new int[10][];
        this.e = new o[10];
    }

    /* JADX WARN: Code duplicated, block: B:4:0x002c  */
    public void f(okhttp3.s sVar, String str) {
        int i;
        int iF;
        int i2;
        char cCharAt;
        ArrayList arrayList = (ArrayList) this.g;
        str.getClass();
        byte[] bArr = okhttp3.internal.e.a;
        int iJ = okhttp3.internal.e.j(0, str.length(), str);
        int iK = okhttp3.internal.e.k(iJ, str.length(), str);
        byte b = -1;
        if (iK - iJ < 2) {
            i = -1;
            break;
        }
        char cCharAt2 = str.charAt(iJ);
        char c = 'a';
        if ((kotlin.jvm.internal.l.b(cCharAt2, 97) < 0 || kotlin.jvm.internal.l.b(cCharAt2, Token.FUNCTION) > 0) && (kotlin.jvm.internal.l.b(cCharAt2, 65) < 0 || kotlin.jvm.internal.l.b(cCharAt2, 90) > 0)) {
            i = -1;
            break;
        }
        i = iJ + 1;
        while (true) {
            if (i < iK) {
                char cCharAt3 = str.charAt(i);
                if ((c > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && !(('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                    if (cCharAt3 != ':') {
                        break;
                    } else {
                        break;
                    }
                } else {
                    i++;
                    c = 'a';
                }
            }
            i = -1;
            break;
        }
        if (i == -1) {
            if (sVar == null) {
                net.luminis.tls.engine.impl.c.o("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? kotlin.text.k.y0(6, str).concat("...") : str));
                return;
            }
            this.c = sVar.a;
        } else if (kotlin.text.r.N(iJ, str, "https:", true)) {
            this.c = "https";
            iJ += 6;
        } else {
            if (!kotlin.text.r.N(iJ, str, "http:", true)) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
            }
            this.c = "http";
            iJ += 5;
        }
        int i3 = 0;
        for (int i4 = iJ; i4 < iK && ((cCharAt = str.charAt(i4)) == '/' || cCharAt == '\\'); i4++) {
            i3++;
        }
        byte b2 = 35;
        if (i3 >= 2 || sVar == null || !kotlin.jvm.internal.l.a(sVar.a, (String) this.c)) {
            int i5 = iJ + i3;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                iF = okhttp3.internal.e.f(str, i5, "@/\\?#", iK);
                byte bCharAt = iF != iK ? str.charAt(iF) : b;
                if (bCharAt == b || bCharAt == b2 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z) {
                        this.e = ((String) this.e) + "%40" + okhttp3.internal.url.a.a(str, i5, iF, " \"':;<=>@[]^`{}|/\\?#", Token.ASSIGN_MOD);
                    } else {
                        int iE = okhttp3.internal.e.e(str, ':', i5, iF);
                        String strA = okhttp3.internal.url.a.a(str, i5, iE, " \"':;<=>@[]^`{}|/\\?#", Token.ASSIGN_MOD);
                        if (z2) {
                            strA = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder(), (String) this.d, "%40", strA);
                        }
                        this.d = strA;
                        if (iE != iF) {
                            this.e = okhttp3.internal.url.a.a(str, iE + 1, iF, " \"':;<=>@[]^`{}|/\\?#", Token.ASSIGN_MOD);
                            z = true;
                        }
                        z2 = true;
                    }
                    i5 = iF + 1;
                    b = -1;
                    b2 = 35;
                }
            }
            int i6 = i5;
            while (true) {
                if (i6 >= iF) {
                    i6 = iF;
                    break;
                }
                char cCharAt4 = str.charAt(i6);
                if (cCharAt4 == ':') {
                    break;
                }
                if (cCharAt4 == '[') {
                    do {
                        i6++;
                        if (i6 >= iF) {
                            break;
                        }
                    } while (str.charAt(i6) != ']');
                }
                i6++;
            }
            int i7 = i6 + 1;
            if (i7 < iF) {
                this.f = okhttp3.internal.d.b(okhttp3.internal.url.a.d(i5, str, i6, 4));
                try {
                    i2 = Integer.parseInt(okhttp3.internal.url.a.a(str, i7, iF, "", 120));
                    if (1 > i2 || i2 >= 65536) {
                        i2 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.b = i2;
                if (i2 == -1) {
                    net.luminis.tls.engine.impl.c.f(str.substring(i7, iF), "Invalid URL port: \"", 34);
                    return;
                }
            } else {
                this.f = okhttp3.internal.d.b(okhttp3.internal.url.a.d(i5, str, i6, 4));
                String str2 = (String) this.c;
                str2.getClass();
                this.b = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
            }
            if (((String) this.f) == null) {
                net.luminis.tls.engine.impl.c.f(str.substring(i5, i6), "Invalid URL host: \"", 34);
                return;
            }
            iJ = iF;
        } else {
            this.d = sVar.e();
            this.e = sVar.a();
            this.f = sVar.d;
            this.b = sVar.e;
            arrayList.clear();
            arrayList.addAll(sVar.c());
            if (iJ == iK || str.charAt(iJ) == '#') {
                String strD = sVar.d();
                this.h = strD != null ? g(okhttp3.internal.url.a.a(strD, 0, 0, " \"'<>#", 83)) : null;
            }
        }
        int iF2 = okhttp3.internal.e.f(str, iJ, "?#", iK);
        if (iJ != iF2) {
            char cCharAt5 = str.charAt(iJ);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iJ++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iJ < iF2) {
                int iF3 = okhttp3.internal.e.f(str, iJ, "/\\", iF2);
                boolean z3 = iF3 < iF2;
                String strA2 = okhttp3.internal.url.a.a(str, iJ, iF3, " \"<>^`{}|/\\?#", Token.ASSIGN_MOD);
                if (!strA2.equals(".") && !strA2.equalsIgnoreCase("%2e")) {
                    if (!strA2.equals("..") && !strA2.equalsIgnoreCase("%2e.") && !strA2.equalsIgnoreCase(".%2e") && !strA2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) androidx.privacysandbox.ads.adservices.java.internal.a.j(1, arrayList)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strA2);
                        } else {
                            arrayList.add(strA2);
                        }
                        if (z3) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iJ = z3 ? iF3 + 1 : iF3;
            }
        }
        if (iF2 < iK && str.charAt(iF2) == '?') {
            int iE2 = okhttp3.internal.e.e(str, '#', iF2, iK);
            this.h = g(okhttp3.internal.url.a.a(str, iF2 + 1, iE2, " \"'<>#", 80));
            iF2 = iE2;
        }
        if (iF2 >= iK || str.charAt(iF2) != '#') {
            return;
        }
        this.i = okhttp3.internal.url.a.a(str, iF2 + 1, iK, "", 48);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.c;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.d).length() > 0 || ((String) this.e).length() > 0) {
                    sb.append((String) this.d);
                    if (((String) this.e).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.e);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.f;
                if (str2 != null) {
                    if (kotlin.text.k.U(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.f);
                        sb.append(']');
                    } else {
                        sb.append((String) this.f);
                    }
                }
                int i = -1;
                if (this.b != -1 || ((String) this.c) != null) {
                    int iD = d();
                    String str3 = (String) this.c;
                    if (str3 == null) {
                        sb.append(':');
                        sb.append(iD);
                    } else {
                        if (str3.equals("http")) {
                            i = 80;
                        } else if (str3.equals("https")) {
                            i = 443;
                        }
                        if (iD != i) {
                            sb.append(':');
                            sb.append(iD);
                        }
                    }
                }
                ArrayList arrayList = (ArrayList) this.g;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i2));
                }
                if (((ArrayList) this.h) != null) {
                    sb.append('?');
                    ArrayList arrayList2 = (ArrayList) this.h;
                    arrayList2.getClass();
                    okhttp3.b.b(arrayList2, sb);
                }
                if (((String) this.i) != null) {
                    sb.append('#');
                    sb.append((String) this.i);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public a0(o oVar) {
        this.a = 0;
        e();
        b(StateSet.WILD_CARD, oVar);
    }
}
