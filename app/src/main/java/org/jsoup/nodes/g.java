package org.jsoup.nodes;

import java.nio.charset.Charset;
import java.util.Iterator;
import org.jsoup.parser.d0;
import org.jsoup.parser.e0;
import org.jsoup.parser.f0;
import org.jsoup.parser.g0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j {
    public f G;
    public e0 H;
    public int I;

    public g(String str, String str2, e0 e0Var) {
        super(new f0("#root", org.jsoup.internal.b.d("#root"), str), str2, null);
        this.G = new f();
        this.I = 1;
        this.H = e0Var;
    }

    @Override // org.jsoup.nodes.o
    public final String A() {
        return X();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
    public final void e0(Charset charset) {
        w wVar;
        f fVar = this.G;
        fVar.y = charset;
        int i = fVar.C;
        if (i != 1) {
            if (i == 2) {
                o oVarP = p();
                if (oVarP instanceof w) {
                    wVar = (w) oVarP;
                    if (!wVar.J().equals("xml")) {
                        wVar = new w("xml", false);
                        c(0, wVar);
                    }
                } else {
                    wVar = new w("xml", false);
                    c(0, wVar);
                }
                wVar.e("version", "1.0");
                wVar.e("encoding", this.G.y.displayName());
                return;
            }
            return;
        }
        j jVarC0 = c0("meta[charset]");
        if (jVarC0 != null) {
            jVarC0.e("charset", this.G.y.displayName());
        } else {
            j jVarU = U();
            while (true) {
                if (jVarU == null) {
                    jVarU = K("html");
                    break;
                } else if (jVarU.s("html")) {
                    break;
                } else {
                    jVarU = jVarU.t();
                }
            }
            j jVarU2 = jVarU.U();
            while (true) {
                if (jVarU2 == null) {
                    String str = jVarU.A.e;
                    g gVarC = jVarU.C();
                    e0 e0Var = gVarC != null ? gVarC.H : new e0(new org.jsoup.parser.b());
                    g0 g0VarB = e0Var.b();
                    d0 d0Var = e0Var.z;
                    g0VarB.getClass();
                    j jVar = new j(g0VarB.d("head", null, str, d0Var.a), jVarU.h(), null);
                    jVarU.c(0, jVar);
                    jVarU2 = jVar;
                    break;
                }
                if (jVarU2.s("head")) {
                    break;
                } else {
                    jVarU2 = jVarU2.t();
                }
            }
            jVarU2.K("meta").e("charset", this.G.y.displayName());
        }
        Iterator<E> it = b0("meta[name=charset]").iterator();
        while (it.hasNext()) {
            ((o) it.next()).F();
        }
    }

    @Override // org.jsoup.nodes.j, org.jsoup.nodes.o
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final g l() {
        g gVar = (g) super.l();
        b bVar = this.C;
        if (bVar != null) {
            gVar.C = bVar.clone();
        }
        gVar.G = this.G.clone();
        return gVar;
    }

    @Override // org.jsoup.nodes.j, org.jsoup.nodes.o
    public final String v() {
        return "#document";
    }

    public g(String str, String str2) {
        this(str, str2, new e0(new org.jsoup.parser.b()));
    }
}
