package okhttp3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public s a;
    public e0 d;
    public com.google.android.material.shape.k e = okhttp3.internal.a.b;
    public String b = "GET";
    public com.caverock.androidsvg.m c = new com.caverock.androidsvg.m(1);

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.c.b(str, str2);
    }

    public final void b(String str, String str2) {
        str.getClass();
        str2.getClass();
        com.caverock.androidsvg.m mVar = this.c;
        mVar.getClass();
        com.google.android.material.textfield.p.n(str);
        com.google.android.material.textfield.p.o(str2, str);
        mVar.h(str);
        com.google.android.material.textfield.p.f(mVar, str, str2);
    }

    public final void c(String str, e0 e0Var) {
        str.getClass();
        if (str.length() <= 0) {
            net.luminis.tls.engine.impl.c.o("method.isEmpty() == true");
            return;
        }
        if (e0Var == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.q("method ", str, " must have a request body."));
                return;
            }
        } else if (!com.google.common.base.i.q(str)) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.q("method ", str, " must not have a request body."));
            return;
        }
        this.b = str;
        this.d = e0Var;
    }

    public final void d(String str) {
        str.getClass();
        if (kotlin.text.r.O(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (kotlin.text.r.O(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        com.google.android.material.shape.a0 a0Var = new com.google.android.material.shape.a0(1);
        a0Var.f(null, str);
        this.a = a0Var.c();
    }
}
