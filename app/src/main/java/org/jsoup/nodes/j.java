package org.jsoup.nodes;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.jsoup.parser.d0;
import org.jsoup.parser.e0;
import org.jsoup.parser.f0;
import org.jsoup.parser.g0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class j extends o implements Iterable {
    public static final List D = Collections.EMPTY_LIST;
    public static final i E = new i(0);
    public static final String F;
    public final f0 A;
    public i B;
    public b C;

    static {
        Pattern.compile("\\s+");
        F = "/".concat("baseUri");
    }

    public j(f0 f0Var, String str, b bVar) {
        org.jsoup.helper.n.H(f0Var);
        this.B = E;
        this.C = bVar;
        this.A = f0Var;
        if (org.jsoup.internal.k.f(str)) {
            return;
        }
        org.jsoup.helper.n.H(str);
        R(str);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0023  */
    public static void M(StringBuilder sb, v vVar) {
        String strJ = vVar.J();
        j jVar = vVar.e;
        if (jVar != null) {
            int i = 0;
            do {
                if ((jVar.A.A & 64) == 0) {
                    jVar = jVar.e;
                    i++;
                    if (i >= 6) {
                        break;
                    }
                }
            } while (jVar != null);
            if (!(vVar instanceof c)) {
                org.jsoup.internal.k.a(strJ, sb, v.O(sb));
                return;
            }
        } else if (!(vVar instanceof c)) {
            org.jsoup.internal.k.a(strJ, sb, v.O(sb));
            return;
        }
        sb.append(strJ);
    }

    @Override // org.jsoup.nodes.o
    public void B(org.jsoup.internal.b bVar, f fVar) {
        int i = fVar.C;
        f0 f0Var = this.A;
        String strA = i == 2 ? a.a(2, f0Var.y) : f0Var.y;
        bVar.a('<').b(strA);
        b bVar2 = this.C;
        if (bVar2 != null) {
            bVar2.k(bVar, fVar);
        }
        if (!this.B.isEmpty()) {
            bVar.a('>');
            return;
        }
        boolean z = fVar.C == 2 || !f0Var.e.equals("http://www.w3.org/1999/xhtml");
        if (z && (f0Var.b(32) || ((f0Var.A & 1) != 0 && (f0Var.c() || f0Var.d())))) {
            bVar.b(" />");
        } else if (z || !f0Var.c()) {
            bVar.b("></").b(strA).a('>');
        } else {
            bVar.a('>');
        }
    }

    @Override // org.jsoup.nodes.o
    public final j D() {
        return this.e;
    }

    public final void J(o oVar) {
        org.jsoup.helper.n.H(oVar);
        j jVar = oVar.e;
        if (jVar != null) {
            jVar.G(oVar);
        }
        oVar.e = this;
        o();
        this.B.add(oVar);
        oVar.y = this.B.size() - 1;
    }

    public final j K(String str) {
        String str2 = this.A.e;
        g gVarC = C();
        e0 e0Var = gVarC != null ? gVarC.H : new e0(new org.jsoup.parser.b());
        g0 g0VarB = e0Var.b();
        d0 d0Var = e0Var.z;
        g0VarB.getClass();
        j jVar = new j(g0VarB.d(str, null, str2, d0Var.a), h(), null);
        J(jVar);
        return jVar;
    }

    public final List O() {
        List list;
        Integer num;
        b bVar = this.C;
        if (bVar != null && bVar.j("/jsoup.userdata")) {
            Map mapR = this.C.r();
            WeakReference weakReference = (WeakReference) mapR.get("jsoup.childEls");
            if (weakReference != null && (list = (List) weakReference.get()) != null && (num = (Integer) mapR.get("jsoup.childElsMod")) != null && num.intValue() == this.B.c()) {
                return list;
            }
        }
        return null;
    }

    public final List P() {
        List listO;
        if (this.B.size() == 0) {
            return D;
        }
        synchronized (this.B) {
            try {
                listO = O();
                if (listO == null) {
                    listO = T(j.class);
                    Map mapR = f().r();
                    mapR.put("jsoup.childEls", new WeakReference(listO));
                    mapR.put("jsoup.childElsMod", Integer.valueOf(this.B.c()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return listO;
    }

    @Override // org.jsoup.nodes.o
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public j l() {
        return (j) super.l();
    }

    public final void R(String str) {
        f().p(F, str);
    }

    public final int S() {
        j jVar = this.e;
        if (jVar == null) {
            return 0;
        }
        List listP = jVar.P();
        int size = listP.size();
        for (int i = 0; i < size; i++) {
            if (listP.get(i) == this) {
                return i;
            }
        }
        return 0;
    }

    public final List T(Class cls) {
        return (List) this.B.stream().filter(new net.luminis.quic.ack.a(cls, 2)).map(new net.luminis.quic.crypto.e(cls, 1)).collect(Collectors.collectingAndThen(Collectors.toList(), new androidx.media3.exoplayer.audio.f(6)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j U() {
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            o oVar = (o) this.B.get(i);
            if (oVar instanceof j) {
                return (j) oVar;
            }
        }
        return null;
    }

    public final org.jsoup.select.e V(String str) {
        org.jsoup.helper.n.E(str);
        return com.google.android.material.shape.k.E(new org.jsoup.select.h(2, str, false), this);
    }

    public final org.jsoup.select.e W(String str) {
        org.jsoup.helper.n.E(str);
        return com.google.android.material.shape.k.E(new org.jsoup.select.h(9, org.jsoup.internal.b.d(str), false), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.android.datatransport.runtime.scheduling.jobscheduling.c] */
    /* JADX WARN: Type inference failed for: r6v2, types: [org.jsoup.select.u] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.android.datatransport.runtime.scheduling.jobscheduling.c, org.jsoup.nodes.q] */
    public final String X() {
        ?? cVar;
        StringBuilder sbB = org.jsoup.internal.k.b();
        o oVarP = p();
        if (oVarP != null) {
            org.jsoup.internal.b bVarE = org.jsoup.internal.b.e(sbB);
            g gVarC = oVarP.C();
            if (gVarC == null) {
                gVarC = new g("http://www.w3.org/1999/xhtml", "");
            }
            f fVar = gVarC.G;
            fVar.getClass();
            if (fVar.z) {
                cVar = new q(24, oVarP, bVarE, fVar);
                cVar.C = false;
                for (o oVar = oVarP; oVar != null; oVar = oVar.e) {
                    if ((oVar instanceof j) && ((j) oVar).A.b(64)) {
                        cVar.C = true;
                        break;
                    }
                }
            } else {
                cVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(24, oVarP, bVarE, fVar);
            }
            while (oVarP != null) {
                cVar.j(oVarP);
                oVarP = oVarP.u();
            }
        }
        String strL = org.jsoup.internal.k.l(sbB);
        g gVarC2 = C();
        if (gVarC2 == null) {
            gVarC2 = new g("http://www.w3.org/1999/xhtml", "");
        }
        return gVarC2.G.z ? strL.trim() : strL;
    }

    public final boolean Y() {
        return (this.A.A & 4) != 0;
    }

    public void Z(org.jsoup.internal.b bVar, f fVar) {
        if (this.B.isEmpty()) {
            return;
        }
        org.jsoup.internal.b bVarB = bVar.b("</");
        int i = fVar.C;
        f0 f0Var = this.A;
        bVarB.b(i == 2 ? a.a(2, f0Var.y) : f0Var.y).a('>');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a0() {
        StringBuilder sbB = org.jsoup.internal.k.b();
        for (int i = 0; i < this.B.size(); i++) {
            o oVar = (o) this.B.get(i);
            if (oVar instanceof v) {
                M(sbB, (v) oVar);
            } else if (oVar.s("br") && !v.O(sbB)) {
                sbB.append(" ");
            }
        }
        return org.jsoup.internal.k.l(sbB).trim();
    }

    public final org.jsoup.select.e b0(String str) {
        org.jsoup.helper.n.E(str);
        return com.google.android.material.shape.k.E(org.jsoup.select.v.Z(str), this);
    }

    public final j c0(String str) {
        org.jsoup.helper.n.E(str);
        org.jsoup.select.p pVarZ = org.jsoup.select.v.Z(str);
        pVarZ.e();
        j jVar = (j) com.google.android.material.shape.e.j(this, j.class).filter(new org.jsoup.select.f(pVarZ, this, 1)).findFirst().orElse(null);
        pVarZ.e();
        return jVar;
    }

    public final String d0() {
        StringBuilder sbB = org.jsoup.internal.k.b();
        new com.google.android.material.internal.b(sbB).j(this);
        return org.jsoup.internal.k.l(sbB).trim();
    }

    @Override // org.jsoup.nodes.o
    public final b f() {
        if (this.C == null) {
            this.C = new b();
        }
        return this.C;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        com.google.android.material.shape.e.j(this, j.class).forEach(consumer);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x001d A[RETURN] */
    @Override // org.jsoup.nodes.o
    public final String h() {
        String strH;
        for (j jVar = this; jVar != null; jVar = jVar.e) {
            b bVar = jVar.C;
            if (bVar != null) {
                String str = F;
                if (bVar.j(str)) {
                    strH = jVar.C.h(str);
                    if (strH != null) {
                        return strH;
                    }
                    return "";
                }
            }
        }
        strH = null;
        if (strH != null) {
            return strH;
        }
        return "";
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p(this, j.class);
    }

    @Override // org.jsoup.nodes.o
    public final int j() {
        return this.B.size();
    }

    @Override // org.jsoup.nodes.o
    public final o n(o oVar) {
        j jVar = (j) super.n(oVar);
        i iVar = new i(this.B.size());
        jVar.B = iVar;
        iVar.addAll(this.B);
        b bVar = this.C;
        if (bVar != null) {
            b bVarE = bVar.clone();
            jVar.C = bVarE;
            bVarE.s(null, "jsoup.childEls");
        }
        return jVar;
    }

    @Override // org.jsoup.nodes.o
    public final List o() {
        if (this.B == E) {
            this.B = new i(4);
        }
        return this.B;
    }

    @Override // org.jsoup.nodes.o
    public final boolean r() {
        return this.C != null;
    }

    @Override // org.jsoup.nodes.o
    public String v() {
        return this.A.y;
    }

    @Override // org.jsoup.nodes.o
    public final String x() {
        return (String) this.B.stream().map(new androidx.media3.exoplayer.audio.f(7)).collect(org.jsoup.internal.k.k(""));
    }

    @Override // org.jsoup.nodes.o
    public final String y() {
        return this.A.z;
    }
}
