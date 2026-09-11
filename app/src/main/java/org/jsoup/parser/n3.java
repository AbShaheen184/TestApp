package org.jsoup.parser;

import com.app.mlounge.emulator.LibretroCore;
import java.io.Reader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n3 extends m3 {
    public final ArrayDeque l = new ArrayDeque();

    @Override // org.jsoup.parser.m3
    public final List a() {
        return this.d.k();
    }

    @Override // org.jsoup.parser.m3
    public final int d() {
        return Integer.MAX_VALUE;
    }

    @Override // org.jsoup.parser.m3
    public final String e() {
        return "http://www.w3.org/XML/1998/namespace";
    }

    @Override // org.jsoup.parser.m3
    public final d0 f() {
        return d0.d;
    }

    @Override // org.jsoup.parser.m3
    public final g0 g() {
        return new g0(null, null);
    }

    @Override // org.jsoup.parser.m3
    public final void i(Reader reader, String str, e0 e0Var) {
        super.i(reader, str, e0Var);
        org.jsoup.nodes.f fVar = this.d.G;
        fVar.C = 2;
        fVar.e = org.jsoup.nodes.k.xhtml;
        fVar.z = false;
        ArrayDeque arrayDeque = this.l;
        arrayDeque.clear();
        HashMap map = new HashMap();
        map.put("xml", "http://www.w3.org/XML/1998/namespace");
        map.put("", "http://www.w3.org/XML/1998/namespace");
        arrayDeque.push(map);
    }

    @Override // org.jsoup.parser.m3
    public final m3 k() {
        return new n3();
    }

    @Override // org.jsoup.parser.m3
    public final org.jsoup.nodes.j l() {
        this.l.pop();
        return super.l();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
    @Override // org.jsoup.parser.m3
    public final boolean m(r0 r0Var) {
        String str;
        int size;
        this.g = r0Var;
        org.jsoup.nodes.j jVar = null;
        switch (androidx.constraintlayout.core.g.e(r0Var.a)) {
            case 0:
                k0 k0Var = (k0) r0Var;
                d0 d0Var = this.h;
                String strE = k0Var.d.E();
                d0Var.getClass();
                String strTrim = strE.trim();
                if (!d0Var.a) {
                    strTrim = org.jsoup.internal.b.c(strTrim);
                }
                org.jsoup.nodes.h hVar = new org.jsoup.nodes.h(strTrim, k0Var.f.E(), k0Var.g.E());
                String str2 = k0Var.e;
                if (str2 != null) {
                    hVar.e("pubSysKey", str2);
                }
                if (k0Var.i) {
                    hVar.f().p(org.jsoup.nodes.h.B, k0Var.h.E());
                }
                b().J(hVar);
                return true;
            case 1:
                n0 n0Var = (n0) r0Var;
                ArrayDeque arrayDeque = this.l;
                HashMap map = new HashMap((Map) arrayDeque.peek());
                arrayDeque.push(map);
                org.jsoup.nodes.b bVar = n0Var.g;
                if (bVar != null) {
                    this.h.a(bVar);
                    bVar.f(this.h);
                    bVar.getClass();
                    androidx.datastore.preferences.protobuf.c cVar = new androidx.datastore.preferences.protobuf.c(bVar);
                    while (cVar.hasNext()) {
                        org.jsoup.nodes.a aVar = (org.jsoup.nodes.a) cVar.next();
                        String str3 = aVar.e;
                        String str4 = aVar.y;
                        if (str4 == null) {
                            str4 = "";
                        }
                        if (str3.equals("xmlns")) {
                            map.put("", str4);
                        } else if (str3.startsWith("xmlns:")) {
                            map.put(str3.substring(6), str4);
                        }
                    }
                    HashMap map2 = new HashMap();
                    androidx.datastore.preferences.protobuf.c cVar2 = new androidx.datastore.preferences.protobuf.c(bVar);
                    while (cVar2.hasNext()) {
                        String str5 = ((org.jsoup.nodes.a) cVar2.next()).e;
                        int iIndexOf = str5.indexOf(58);
                        String strSubstring = iIndexOf == -1 ? "" : str5.substring(0, iIndexOf);
                        if (!strSubstring.isEmpty() && !strSubstring.equals("xmlns") && (str = (String) map.get(strSubstring)) != null) {
                            map2.put("jsoup.xmlns-".concat(strSubstring), str);
                        }
                    }
                    for (Map.Entry entry : map2.entrySet()) {
                        bVar.s(entry.getValue(), (String) entry.getKey());
                    }
                }
                int i = this.a.C;
                if (i != Integer.MAX_VALUE) {
                    while (this.e.size() >= i) {
                        l();
                    }
                }
                String strE2 = n0Var.d.E();
                String str6 = (String) map.get("");
                int iIndexOf2 = strE2.indexOf(58);
                if (iIndexOf2 > 0) {
                    String strSubstring2 = strE2.substring(0, iIndexOf2);
                    if (map.containsKey(strSubstring2)) {
                        str6 = (String) map.get(strSubstring2);
                    }
                }
                f0 f0VarD = this.i.d(strE2, n0Var.e, str6, this.h.a);
                org.jsoup.nodes.j jVar2 = new org.jsoup.nodes.j(f0VarD, null, bVar);
                b().J(jVar2);
                this.e.add(jVar2);
                if (n0Var.f) {
                    f0VarD.A |= 32;
                    l();
                    return true;
                }
                if (f0VarD.c()) {
                    l();
                    return true;
                }
                l3 l3VarF = f0VarD.f();
                if (l3VarF != null) {
                    this.c.o(l3VarF);
                }
                return true;
            case 2:
                d0 d0Var2 = this.h;
                String strE3 = ((m0) r0Var).d.E();
                d0Var2.getClass();
                String strTrim2 = strE3.trim();
                if (!d0Var2.a) {
                    strTrim2 = org.jsoup.internal.b.c(strTrim2);
                }
                int size2 = this.e.size();
                int i2 = size2 + (-1) >= 256 ? size2 - 257 : 0;
                for (int size3 = this.e.size() - 1; size3 >= i2; size3--) {
                    org.jsoup.nodes.j jVar3 = (org.jsoup.nodes.j) this.e.get(size3);
                    if (jVar3.v().equals(strTrim2)) {
                        jVar = jVar3;
                        if (jVar != null) {
                            for (size = this.e.size() - 1; size >= 0 && l() != jVar; size--) {
                            }
                        }
                        return true;
                    }
                }
                if (jVar != null) {
                    while (size >= 0) {
                    }
                }
                return true;
            case 3:
                b().J(new org.jsoup.nodes.d(((j0) r0Var).d.E()));
                return true;
            case 4:
                i0 i0Var = (i0) r0Var;
                String strE4 = i0Var.d.E();
                b().J(i0Var instanceof h0 ? new org.jsoup.nodes.c(strE4) : b().A.b(LibretroCore.SCREEN_WIDTH) ? new org.jsoup.nodes.e(strE4) : new org.jsoup.nodes.v(strE4));
                return true;
            case 5:
                q0 q0Var = (q0) r0Var;
                org.jsoup.nodes.w wVar = new org.jsoup.nodes.w(q0Var.d.E(), q0Var.k);
                if (q0Var.g != null) {
                    wVar.f().b(q0Var.g);
                }
                b().J(wVar);
                return true;
            case 6:
                return true;
            default:
                throw new org.jsoup.helper.o("Unexpected token type: ".concat(p0.e(r0Var.a)));
        }
    }

    @Override // org.jsoup.parser.m3
    public final void j() {
    }
}
