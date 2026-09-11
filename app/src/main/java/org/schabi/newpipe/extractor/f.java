package org.schabi.newpipe.extractor;

import androidx.core.view.w0;
import com.google.android.gms.measurement.internal.e0;
import com.google.android.material.textfield.p;
import com.google.common.util.concurrent.g0;
import j$.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public final w0 a;
    public final org.schabi.newpipe.extractor.linkhandler.a b;
    public boolean c;
    public final com.app.mlounge.data.music.e d;

    public f(w0 w0Var, org.schabi.newpipe.extractor.linkhandler.a aVar) {
        String simpleName = getClass().getSimpleName();
        int iHashCode = hashCode();
        StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("@");
        sb.append(iHashCode);
        this.c = false;
        Objects.requireNonNull(w0Var, "service is null");
        this.a = w0Var;
        Objects.requireNonNull(aVar, "LinkHandler is null");
        this.b = aVar;
        com.app.mlounge.data.music.e eVar = p.a;
        Objects.requireNonNull(eVar, "downloader is null");
        this.d = eVar;
    }

    public void A() {
        List list = Collections.EMPTY_LIST;
    }

    public abstract int B();

    public void C() {
        List list = Collections.EMPTY_LIST;
    }

    public void F() {
        List list = Collections.EMPTY_LIST;
    }

    public List H() {
        return Collections.EMPTY_LIST;
    }

    public String I() {
        return null;
    }

    public abstract List J();

    public final g0 K() {
        org.schabi.newpipe.extractor.localization.c cVarC = this.a.c();
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        String str = cVarC.e;
        String strA = cVarC.a();
        String strC = androidx.constraintlayout.core.g.c(str, (strA == null || strA.isEmpty()) ? "" : "_".concat(strA));
        HashMap map = org.schabi.newpipe.extractor.timeago.a.a;
        org.schabi.newpipe.extractor.timeago.b bVar = (org.schabi.newpipe.extractor.timeago.b) map.get(strC);
        g0 g0Var = bVar == null ? null : new g0(22, bVar, localDateTimeNow, false);
        if (g0Var != null) {
            return g0Var;
        }
        if (!cVarC.a().isEmpty()) {
            LocalDateTime localDateTimeNow2 = LocalDateTime.now();
            org.schabi.newpipe.extractor.timeago.b bVar2 = (org.schabi.newpipe.extractor.timeago.b) map.get(str + "");
            g0 g0Var2 = bVar2 != null ? new g0(22, bVar2, localDateTimeNow2, false) : null;
            if (g0Var2 != null) {
                return g0Var2;
            }
        }
        net.luminis.tls.engine.impl.c.d(cVarC, "\")", "Localization is not supported (\"");
        return null;
    }

    public long M(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        String strI;
        String strI2;
        String strI3 = "";
        try {
            String strI4 = org.schabi.newpipe.extractor.utils.a.i(str, 1, w());
            if (strI4.isEmpty()) {
                return 0L;
            }
            try {
                strI = org.schabi.newpipe.extractor.utils.a.i("(\\d+)s", 1, strI4);
                try {
                    strI2 = org.schabi.newpipe.extractor.utils.a.i("(\\d+)m", 1, strI4);
                    try {
                        strI3 = org.schabi.newpipe.extractor.utils.a.i("(\\d+)h", 1, strI4);
                    } catch (Exception unused) {
                        try {
                            if (strI.isEmpty() && strI2.isEmpty()) {
                                strI = org.schabi.newpipe.extractor.utils.a.i("t=(\\d+)", 1, strI4);
                            }
                        } catch (org.schabi.newpipe.extractor.exceptions.f e) {
                            org.mozilla.javascript.typedarrays.c.d("Could not get timestamp.", e);
                            return 0L;
                        }
                    }
                } catch (Exception unused2) {
                    strI2 = "";
                }
            } catch (Exception unused3) {
                strI = "";
                strI2 = strI;
            }
            int i = 0;
            int i2 = strI.isEmpty() ? 0 : Integer.parseInt(strI);
            int i3 = strI2.isEmpty() ? 0 : Integer.parseInt(strI2);
            if (!strI3.isEmpty()) {
                i = Integer.parseInt(strI3);
            }
            return (((long) i) * 3600) + (((long) i3) * 60) + ((long) i2);
        } catch (org.schabi.newpipe.extractor.utils.d unused4) {
            return -2L;
        }
    }

    public List O() {
        return Collections.EMPTY_LIST;
    }

    public abstract String P();

    public abstract String R();

    public String S() {
        return this.b.y;
    }

    public abstract List T();

    public abstract List U();

    public abstract void X(com.app.mlounge.data.music.e eVar);

    public final void a() {
        if (this.c) {
            return;
        }
        net.luminis.tls.engine.impl.c.r("Page is not fetched. Make sure you call fetchPage()");
    }

    public final void b() {
        e0 e0Var = org.schabi.newpipe.extractor.utils.a.b;
        e0 e0Var2 = org.schabi.newpipe.extractor.utils.a.a;
        if (e0Var != e0Var2) {
            androidx.constraintlayout.core.g.e(1);
        }
        if (!this.c) {
            X(this.d);
            this.c = true;
        } else {
            if (e0Var == e0Var2) {
                return;
            }
            androidx.constraintlayout.core.g.e(1);
        }
    }

    public int c() {
        return 0;
    }

    public abstract List d();

    public final String e() {
        return org.schabi.newpipe.extractor.utils.f.c(this.b.y);
    }

    public String g() {
        return "";
    }

    public abstract org.schabi.newpipe.extractor.stream.c h();

    public String j() {
        return null;
    }

    public final org.schabi.newpipe.extractor.localization.a k() {
        w0 w0Var = this.a;
        w0Var.getClass();
        org.schabi.newpipe.extractor.localization.a aVar = p.c;
        org.schabi.newpipe.extractor.localization.a aVar2 = org.schabi.newpipe.extractor.localization.a.y;
        if (aVar == null) {
            aVar = aVar2;
        }
        return w0Var.h().contains(aVar) ? aVar : aVar2;
    }

    public void l() {
        List list = Collections.EMPTY_LIST;
    }

    public String m() {
        return "";
    }

    public String o() {
        return this.b.z;
    }

    public abstract e p();

    public long r() {
        return 0L;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public List u() {
        return Collections.EMPTY_LIST;
    }

    public abstract String v();

    public String w() {
        return this.b.e;
    }

    public abstract e x(k kVar);

    public androidx.emoji2.text.g z() {
        return null;
    }

    public void D() {
    }

    public void E() {
    }

    public void G() {
    }

    public void L() {
    }

    public void N() {
    }

    public void Q() {
    }

    public void V() {
    }

    public void W() {
    }

    public void f() {
    }

    public void i() {
    }

    public void n() {
    }

    public void q() {
    }

    public void s() {
    }

    public void t() {
    }

    public void y() {
    }
}
