package kotlin.text;

import androidx.compose.material3.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.s;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends com.google.android.material.sidesheet.b {
    public static String C(String str) {
        return kotlin.sequences.k.p(new kotlin.sequences.n(new s(str, 3), new r0("    ", 13), 1), "\n");
    }

    public static String D(String str) {
        int length;
        Comparable comparable;
        String strSubstring;
        List listG0 = k.g0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG0) {
            if (!k.d0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.p.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!com.google.android.material.shape.e.i(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listG0.size();
        int size = listG0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listG0) {
            int i = length + 1;
            if (length < 0) {
                com.google.common.base.c.w();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == size) && k.d0(str3)) {
                strSubstring = null;
            } else {
                str3.getClass();
                if (iIntValue < 0) {
                    net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.p("Requested character count ", iIntValue, " is less than zero."));
                    return null;
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        kotlin.collections.o.Q(arrayList3, sb, null, Token.IMPORT);
        return sb.toString();
    }

    public static String E(String str) {
        if (k.d0("|")) {
            net.luminis.tls.engine.impl.c.o("marginPrefix must be non-blank string.");
            return null;
        }
        List listG0 = k.g0(str);
        int length = str.length();
        listG0.size();
        int size = listG0.size() - 1;
        ArrayList arrayList = new ArrayList();
        Iterator it = listG0.iterator();
        int i = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                kotlin.collections.o.Q(arrayList, sb, null, Token.IMPORT);
                return sb.toString();
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                com.google.common.base.c.w();
                throw null;
            }
            String str2 = (String) next;
            if ((i != 0 && i != size) || !k.d0(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!com.google.android.material.shape.e.i(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && r.N(i3, str2, "|", false)) {
                    strSubstring = str2.substring("|".length() + i3);
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i = i2;
        }
    }
}
