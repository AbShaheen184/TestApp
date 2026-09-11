package com.caverock.androidsvg;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final /* synthetic */ int a;
    public ArrayList b;

    public m(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new ArrayList(20);
                break;
            default:
                this.b = null;
                break;
        }
    }

    public void a(l lVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        int i = 0;
        while (true) {
            int size = this.b.size();
            ArrayList arrayList = this.b;
            if (i >= size) {
                arrayList.add(lVar);
                return;
            } else {
                if (((l) arrayList.get(i)).a.b > lVar.a.b) {
                    this.b.add(i, lVar);
                    return;
                }
                i++;
            }
        }
    }

    public void b(String str, String str2) {
        str.getClass();
        str2.getClass();
        com.google.android.material.textfield.p.n(str);
        com.google.android.material.textfield.p.o(str2, str);
        com.google.android.material.textfield.p.f(this, str, str2);
    }

    public void c(m mVar) {
        if (mVar.b == null) {
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList(mVar.b.size());
        }
        Iterator it = mVar.b.iterator();
        while (it.hasNext()) {
            a((l) it.next());
        }
    }

    public void d(String str) {
        int iA0 = kotlin.text.k.a0(str, ':', 1, 4);
        if (iA0 != -1) {
            com.google.android.material.textfield.p.f(this, str.substring(0, iA0), str.substring(iA0 + 1));
        } else if (str.charAt(0) == ':') {
            com.google.android.material.textfield.p.f(this, "", str.substring(1));
        } else {
            com.google.android.material.textfield.p.f(this, "", str);
        }
    }

    public void e(String str, String str2) {
        str.getClass();
        str2.getClass();
        com.google.android.material.textfield.p.n(str);
        com.google.android.material.textfield.p.f(this, str, str2);
    }

    public okhttp3.r f() {
        return new okhttp3.r((String[]) this.b.toArray(new String[0]));
    }

    public String g(String str) {
        str.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size() - 2;
        int iQ = com.google.android.material.sidesheet.b.q(size, 0, -2);
        if (iQ > size) {
            return null;
        }
        while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
            if (size == iQ) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    public void h(String str) {
        str.getClass();
        ArrayList arrayList = this.b;
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (this.b == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    sb.append(((l) it.next()).toString());
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
