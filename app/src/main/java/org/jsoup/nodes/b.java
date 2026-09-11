package org.jsoup.nodes;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.jsoup.parser.d0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterable, Cloneable {
    public int e = 0;
    public String[] y = new String[3];
    public Object[] z = new Object[3];

    public static boolean o(String str) {
        return str.length() > 1 && str.charAt(0) == '/';
    }

    public final void b(b bVar) {
        int size = bVar.size();
        if (size == 0) {
            return;
        }
        d(this.e + size);
        boolean z = this.e != 0;
        androidx.datastore.preferences.protobuf.c cVar = new androidx.datastore.preferences.protobuf.c(bVar);
        while (cVar.hasNext()) {
            a aVar = (a) cVar.next();
            String str = aVar.e;
            if (z) {
                String str2 = aVar.y;
                p(str, str2 != null ? str2 : "");
                aVar.z = this;
            } else {
                String str3 = aVar.y;
                c(str, str3 != null ? str3 : "");
            }
        }
    }

    public final void c(String str, Serializable serializable) {
        d(this.e + 1);
        String[] strArr = this.y;
        int i = this.e;
        strArr[i] = str;
        this.z[i] = serializable;
        this.e = i + 1;
    }

    public final void d(int i) {
        org.jsoup.helper.n.C(i >= this.e);
        String[] strArr = this.y;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.e * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.y = (String[]) Arrays.copyOf(strArr, i);
        this.z = Arrays.copyOf(this.z, i);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        try {
            b bVar = (b) super.clone();
            bVar.e = this.e;
            bVar.y = (String[]) Arrays.copyOf(this.y, this.e);
            bVar.z = Arrays.copyOf(this.z, this.e);
            int iL = l("/jsoup.userdata");
            if (iL != -1) {
                this.z[iL] = new HashMap((Map) this.z[iL]);
            }
            return bVar;
        } catch (CloneNotSupportedException e) {
            net.luminis.tls.engine.impl.c.k(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.e == bVar.e) {
                for (int i = 0; i < this.e; i++) {
                    int iL = bVar.l(this.y[i]);
                    if (iL != -1 && Objects.equals(this.z[i], bVar.z[iL])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int f(d0 d0Var) {
        int i = 0;
        if (this.e == 0) {
            return 0;
        }
        boolean z = d0Var.b;
        int i2 = 0;
        while (i < this.e) {
            String str = this.y[i];
            i++;
            int i3 = i;
            while (i3 < this.e) {
                if ((z && str.equals(this.y[i3])) || (!z && str.equalsIgnoreCase(this.y[i3]))) {
                    i2++;
                    q(i3);
                    i3--;
                }
                i3++;
            }
        }
        return i2;
    }

    public final String h(String str) {
        Object obj;
        int iL = l(str);
        return (iL == -1 || (obj = this.z[iL]) == null) ? "" : (String) obj;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.z) + (((this.e * 31) + Arrays.hashCode(this.y)) * 31);
    }

    public final String i(String str) {
        Object obj;
        int iN = n(str);
        return (iN == -1 || (obj = this.z[iN]) == null) ? "" : (String) obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.c(this);
    }

    public final boolean j(String str) {
        return l(str) != -1;
    }

    public final void k(org.jsoup.internal.b bVar, f fVar) {
        String strA;
        int i = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.y[i2];
            if (!o(str) && (strA = a.a(fVar.C, str)) != null) {
                String str2 = (String) this.z[i2];
                org.jsoup.internal.b bVarA = bVar.a(' ');
                bVarA.b(strA);
                if (fVar.C != 1 || (str2 != null && ((!str2.isEmpty() && !str2.equalsIgnoreCase(strA)) || Arrays.binarySearch(a.A, org.jsoup.internal.b.c(strA)) < 0))) {
                    bVarA.b("=\"");
                    if (str2 == null) {
                        str2 = "";
                    }
                    char[] cArr = l.a;
                    l.c(str2, bVarA, fVar.e, fVar.y, 2);
                    bVarA.a('\"');
                }
            }
        }
    }

    public final int l(String str) {
        org.jsoup.helper.n.H(str);
        for (int i = 0; i < this.e; i++) {
            if (str.equals(this.y[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int n(String str) {
        org.jsoup.helper.n.H(str);
        for (int i = 0; i < this.e; i++) {
            if (str.equalsIgnoreCase(this.y[i])) {
                return i;
            }
        }
        return -1;
    }

    public final void p(String str, String str2) {
        org.jsoup.helper.n.H(str);
        int iL = l(str);
        if (iL != -1) {
            this.z[iL] = str2;
        } else {
            c(str, str2);
        }
    }

    public final void q(int i) {
        int i2 = this.e;
        if (i >= i2) {
            throw new org.jsoup.helper.o("Must be false");
        }
        int i3 = (i2 - i) - 1;
        if (i3 > 0) {
            String[] strArr = this.y;
            int i4 = i + 1;
            System.arraycopy(strArr, i4, strArr, i, i3);
            Object[] objArr = this.z;
            System.arraycopy(objArr, i4, objArr, i, i3);
        }
        int i5 = this.e - 1;
        this.e = i5;
        this.y[i5] = null;
        this.z[i5] = null;
    }

    public final Map r() {
        int iL = l("/jsoup.userdata");
        if (iL != -1) {
            return (Map) this.z[iL];
        }
        HashMap map = new HashMap();
        c("/jsoup.userdata", map);
        return map;
    }

    public final void s(Object obj, String str) {
        org.jsoup.helper.n.H(str);
        if (obj != null || j("/jsoup.userdata")) {
            Map mapR = r();
            if (obj == null) {
                mapR.remove(str);
            } else {
                mapR.put(str, obj);
            }
        }
    }

    public final int size() {
        if (this.e == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.e; i2++) {
            if (!o(this.y[i2])) {
                i++;
            }
        }
        return i;
    }

    public final String toString() {
        StringBuilder sbB = org.jsoup.internal.k.b();
        k(org.jsoup.internal.b.e(sbB), new f());
        return org.jsoup.internal.k.l(sbB);
    }
}
