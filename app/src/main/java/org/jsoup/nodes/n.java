package org.jsoup.nodes;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends o {
    public Object A;

    public n(String str) {
        org.jsoup.helper.n.H(str);
        this.A = str;
    }

    @Override // org.jsoup.nodes.o
    public final j D() {
        return this.e;
    }

    public final String J() {
        return d(v());
    }

    public final void K() {
        Object obj = this.A;
        if (obj instanceof b) {
            return;
        }
        b bVar = new b();
        this.A = bVar;
        bVar.p(v(), (String) obj);
    }

    @Override // org.jsoup.nodes.o
    public final String b(String str) {
        K();
        return super.b(str);
    }

    @Override // org.jsoup.nodes.o
    public final String d(String str) {
        if (this.A instanceof b) {
            return super.d(str);
        }
        return v().equals(str) ? (String) this.A : "";
    }

    @Override // org.jsoup.nodes.o
    public final void e(String str, String str2) {
        if (!(this.A instanceof b) && str.equals(v())) {
            this.A = str2;
        } else {
            K();
            super.e(str, str2);
        }
    }

    @Override // org.jsoup.nodes.o
    public final b f() {
        K();
        return (b) this.A;
    }

    @Override // org.jsoup.nodes.o
    public final String h() {
        j jVar = this.e;
        return jVar != null ? jVar.h() : "";
    }

    @Override // org.jsoup.nodes.o
    public final int j() {
        return 0;
    }

    @Override // org.jsoup.nodes.o
    public final o n(o oVar) {
        n nVar = (n) super.n(oVar);
        Object obj = this.A;
        if (obj instanceof b) {
            nVar.A = ((b) obj).clone();
        }
        return nVar;
    }

    @Override // org.jsoup.nodes.o
    public final List o() {
        return o.z;
    }

    @Override // org.jsoup.nodes.o
    public final boolean r() {
        return this.A instanceof b;
    }

    @Override // org.jsoup.nodes.o
    public final String x() {
        return J();
    }
}
