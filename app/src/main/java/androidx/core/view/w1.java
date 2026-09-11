package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class w1 {
    public static final z1 b;
    public final z1 a;

    static {
        n1 h1Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            h1Var = new m1();
        } else if (i >= 35) {
            h1Var = new l1();
        } else if (i >= 34) {
            h1Var = new k1();
        } else if (i >= 31) {
            h1Var = new j1();
        } else if (i >= 30) {
            h1Var = new i1();
        } else {
            h1Var = i >= 29 ? new h1() : new g1();
        }
        b = h1Var.b().a.a().a.b().a.c();
    }

    public w1(z1 z1Var) {
        this.a = z1Var;
    }

    public z1 a() {
        return this.a;
    }

    public z1 b() {
        return this.a;
    }

    public z1 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return t() == w1Var.t() && s() == w1Var.s() && Objects.equals(n(), w1Var.n()) && Objects.equals(l(), w1Var.l()) && Objects.equals(h(), w1Var.h());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> g(int i) {
        return Collections.EMPTY_LIST;
    }

    public h h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
    }

    public androidx.core.graphics.c i(int i) {
        return androidx.core.graphics.c.e;
    }

    public androidx.core.graphics.c j(int i) {
        if ((i & 8) == 0) {
            return androidx.core.graphics.c.e;
        }
        net.luminis.tls.engine.impl.c.o("Unable to query the maximum insets for IME");
        return null;
    }

    public androidx.core.graphics.c k() {
        return n();
    }

    public androidx.core.graphics.c l() {
        return androidx.core.graphics.c.e;
    }

    public androidx.core.graphics.c m() {
        return n();
    }

    public androidx.core.graphics.c n() {
        return androidx.core.graphics.c.e;
    }

    public androidx.core.graphics.c o() {
        return n();
    }

    public z1 r(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u(int i) {
        return true;
    }

    public void q() {
    }

    public void A(int i) {
    }

    public void B(Rect[][] rectArr) {
    }

    public void C(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void e(z1 z1Var) {
    }

    public void p(View view) {
    }

    public void v(j jVar) {
    }

    public void w(androidx.core.graphics.c[] cVarArr) {
    }

    public void x(androidx.core.graphics.c cVar) {
    }

    public void y(z1 z1Var) {
    }

    public void z(androidx.core.graphics.c cVar) {
    }
}
