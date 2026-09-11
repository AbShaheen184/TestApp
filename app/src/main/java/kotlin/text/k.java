package kotlin.text;

import androidx.compose.animation.core.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends r {
    public static CharSequence A0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zI = com.google.android.material.shape.e.i(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zI) {
                    break;
                }
                length--;
            } else if (zI) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String B0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i = length - 1;
            if (!kotlin.collections.n.y(str.charAt(length), cArr)) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i;
        }
        return charSequenceSubSequence.toString();
    }

    public static CharSequence C0(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!com.google.android.material.shape.e.i(str.charAt(i))) {
                return str.subSequence(i, str.length());
            }
        }
        return "";
    }

    public static String D0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!kotlin.collections.n.y(str.charAt(i), cArr)) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }

    public static ArrayList S(int i, String str) {
        str.getClass();
        com.google.android.material.motion.a.r(i, i);
        int length = str.length();
        int i2 = 0;
        ArrayList arrayList = new ArrayList((length / i) + (length % i == 0 ? 0 : 1));
        while (i2 >= 0 && i2 < length) {
            int i3 = i2 + i;
            CharSequence charSequenceSubSequence = str.subSequence(i2, (i3 < 0 || i3 > length) ? length : i3);
            charSequenceSubSequence.getClass();
            arrayList.add(charSequenceSubSequence.toString());
            i2 = i3;
        }
        return arrayList;
    }

    public static boolean T(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (b0(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (Z(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean U(CharSequence charSequence, char c) {
        charSequence.getClass();
        return a0(charSequence, c, 0, 2) >= 0;
    }

    public static boolean W(CharSequence charSequence, String str) {
        return charSequence instanceof String ? r.H((String) charSequence, str, false) : i0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean X(String str, char c) {
        return str.length() > 0 && com.google.android.material.shape.e.d(str.charAt(str.length() - 1), c, false);
    }

    public static final int Y(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? Z(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int Z(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        kotlin.ranges.b bVar;
        if (z2) {
            charSequence.getClass();
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            bVar = new kotlin.ranges.b(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length2 = charSequence.length();
            if (i2 > length2) {
                i2 = length2;
            }
            bVar = new kotlin.ranges.d(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = bVar.z;
        int i4 = bVar.y;
        int i5 = bVar.e;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (i0(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
                        return i5;
                    }
                    if (i5 != i4) {
                        i5 += i3;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z;
                if (r.K(0, i6, str.length(), str, (String) charSequence, z6)) {
                    return i6;
                }
                if (i6 != i4) {
                    i6 += i3;
                    z = z6;
                }
            }
        }
        return -1;
    }

    public static int a0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? c0(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int b0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return Y(charSequence, str, i, z);
    }

    public static final int c0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kotlin.collections.n.U(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (com.google.android.material.shape.e.d(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static boolean d0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!com.google.android.material.shape.e.i(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int e0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            charSequence.getClass();
            i = charSequence.length() - 1;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(kotlin.collections.n.U(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (com.google.android.material.shape.e.d(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int f0(String str, int i, String str2) {
        int length;
        if ((i & 2) != 0) {
            str.getClass();
            length = str.length() - 1;
        } else {
            length = 0;
        }
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, length);
    }

    public static List g0(CharSequence charSequence) {
        charSequence.getClass();
        e eVar = new e(charSequence);
        if (!eVar.hasNext()) {
            return u.e;
        }
        Object next = eVar.next();
        if (!eVar.hasNext()) {
            return com.google.common.base.c.p(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (eVar.hasNext()) {
            arrayList.add(eVar.next());
        }
        return arrayList;
    }

    public static String h0(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.p("Desired length ", i, " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean i0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!com.google.android.material.shape.e.d(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String j0(String str, String str2) {
        str.getClass();
        return r.O(str, str2, false) ? str.substring(str2.length()) : str;
    }

    public static String k0(String str, String str2) {
        return W(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static String l0(String str) {
        return (str.length() >= 2 && r.O(str, "\"", false) && W(str, "\"")) ? str.substring(1, str.length() - 1) : str;
    }

    public static final void m0(int i) {
        if (i >= 0) {
            return;
        }
        net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Limit must be non-negative, but was "));
    }

    public static final List n0(int i, CharSequence charSequence, String str) {
        m0(i);
        int iY = Y(charSequence, str, 0, false);
        if (iY == -1 || i == 1) {
            return com.google.common.base.c.p(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iY).toString());
            length = str.length() + iY;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iY = Y(charSequence, str, length, false);
        } while (iY != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List o0(String str, char[] cArr) {
        if (cArr.length == 1) {
            return n0(0, str, String.valueOf(cArr[0]));
        }
        m0(0);
        kotlin.collections.m mVar = new kotlin.collections.m(new c(str, 0, new g0(cArr, 26)), 2);
        ArrayList arrayList = new ArrayList(kotlin.collections.p.y(mVar, 10));
        Iterator it = mVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            kotlin.ranges.d dVar = (kotlin.ranges.d) bVar.next();
            dVar.getClass();
            arrayList.add(str.subSequence(dVar.e, dVar.y + 1).toString());
        }
    }

    public static List p0(String[] strArr, String str, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        str.getClass();
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return n0(i2, str, str2);
            }
        }
        m0(i2);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        kotlin.collections.m mVar = new kotlin.collections.m(new c(str, i2, new com.app.mlounge.ui.screens.services.k(listAsList, 2, (byte) 0)), 2);
        ArrayList arrayList = new ArrayList(kotlin.collections.p.y(mVar, 10));
        Iterator it = mVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            kotlin.ranges.d dVar = (kotlin.ranges.d) bVar.next();
            dVar.getClass();
            arrayList.add(str.subSequence(dVar.e, dVar.y + 1).toString());
        }
    }

    public static String q0(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int iB0 = b0(str, str2, 0, false, 6);
        return iB0 == -1 ? str3 : str.substring(str2.length() + iB0, str.length());
    }

    public static String r0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int iE0 = e0(str, c, 0, 6);
        return iE0 == -1 ? str2 : str.substring(iE0 + 1, str.length());
    }

    public static String s0(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int iF0 = f0(str, 6, str2);
        return iF0 == -1 ? str3 : str.substring(str2.length() + iF0, str.length());
    }

    public static String u0(String str, char c) {
        str.getClass();
        str.getClass();
        int iA0 = a0(str, c, 0, 6);
        return iA0 == -1 ? str : str.substring(0, iA0);
    }

    public static String v0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iB0 = b0(str, str2, 0, false, 6);
        return iB0 == -1 ? str : str.substring(0, iB0);
    }

    public static String w0(String str, char c) {
        int iE0 = e0(str, c, 0, 6);
        return iE0 == -1 ? str : str.substring(0, iE0);
    }

    public static String x0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iF0 = f0(str, 6, str2);
        return iF0 == -1 ? str : str.substring(0, iF0);
    }

    public static String y0(int i, String str) {
        str.getClass();
        if (i < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.p("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static void z0(String str) {
        str.getClass();
        int length = str.length();
        str.substring(length - (60 > length ? length : 60));
    }
}
