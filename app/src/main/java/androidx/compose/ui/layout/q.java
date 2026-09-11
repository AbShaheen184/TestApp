package androidx.compose.ui.layout;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final /* synthetic */ int a;
    public final p b;
    public final p c;
    public final p d;
    public final p e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public q(q[] qVarArr) {
        this.a = 0;
        this.f = qVarArr;
        int length = qVarArr.length;
        p[] pVarArr = new p[length];
        for (int i = 0; i < length; i++) {
            pVarArr[i] = ((q[]) this.f)[i].b();
        }
        this.b = new p(1, new o1(pVarArr, 0));
        int length2 = ((q[]) this.f).length;
        p[] pVarArr2 = new p[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            pVarArr2[i2] = ((q[]) this.f)[i2].d();
        }
        this.c = new p(0, new o(pVarArr2, 0));
        int length3 = ((q[]) this.f).length;
        p[] pVarArr3 = new p[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            pVarArr3[i3] = ((q[]) this.f)[i3].c();
        }
        this.d = new p(1, new o1(pVarArr3, 1));
        int length4 = ((q[]) this.f).length;
        p[] pVarArr4 = new p[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            pVarArr4[i4] = ((q[]) this.f)[i4].a();
        }
        this.e = new p(0, new o(pVarArr4, 1));
    }

    public final p a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }

    public final p b() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public final p c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public final p d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                q[] qVarArr = (q[]) this.f;
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "innermostOf(");
                int i = 0;
                for (q qVar : qVarArr) {
                    i++;
                    if (i > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    com.google.android.material.sidesheet.b.c(sb, qVar, null);
                }
                sb.append((CharSequence) ")");
                return sb.toString();
            default:
                return androidx.privacysandbox.ads.adservices.java.internal.a.k(')', "RectRulers(", (String) this.f);
        }
    }

    public q(String str) {
        this.a = 1;
        this.f = str;
        this.b = new p(1, null);
        this.c = new p(0, null);
        this.d = new p(1, null);
        this.e = new p(0, null);
    }
}
