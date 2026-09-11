package org.jsoup.parser;

import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public static final u A;
    public static final v B;
    public static final w C;
    public static final x D;
    public static final y E;
    public static final z F;
    public static final c G;
    public static final d H;
    public static final e I;
    public static final f J;
    public static final g K;
    public static final h L;
    public static final i M;
    public static final j N;
    public static final k O;
    public static final l P;
    public static final n Q;
    public static final o R;
    public static final p S;
    public static final q T;
    public static final r U;
    public static final /* synthetic */ b0[] V;
    public static final m e;
    public static final s y;
    public static final t z;

    static {
        m mVar = new m();
        e = mVar;
        s sVar = new s();
        y = sVar;
        t tVar = new t();
        z = tVar;
        u uVar = new u();
        A = uVar;
        v vVar = new v();
        B = vVar;
        w wVar = new w();
        C = wVar;
        x xVar = new x();
        D = xVar;
        y yVar = new y();
        E = yVar;
        z zVar = new z();
        F = zVar;
        c cVar = new c();
        G = cVar;
        d dVar = new d();
        H = dVar;
        e eVar = new e();
        I = eVar;
        f fVar = new f();
        J = fVar;
        g gVar = new g();
        K = gVar;
        h hVar = new h();
        L = hVar;
        i iVar = new i();
        M = iVar;
        j jVar = new j();
        N = jVar;
        k kVar = new k();
        O = kVar;
        l lVar = new l();
        P = lVar;
        n nVar = new n();
        Q = nVar;
        o oVar = new o();
        R = oVar;
        p pVar = new p();
        S = pVar;
        q qVar = new q();
        T = qVar;
        r rVar = new r();
        U = rVar;
        V = new b0[]{mVar, sVar, tVar, uVar, vVar, wVar, xVar, yVar, zVar, cVar, dVar, eVar, fVar, gVar, hVar, iVar, jVar, kVar, lVar, nVar, oVar, pVar, qVar, rVar};
        String.valueOf((char) 0);
    }

    public static boolean a(r0 r0Var) {
        if (r0Var.a == 5) {
            return org.jsoup.internal.k.f(((i0) r0Var).d.E());
        }
        return false;
    }

    public static void d(n0 n0Var, b bVar, l3 l3Var) {
        if (l3Var != null) {
            bVar.c.o(l3Var);
        }
        bVar.m = bVar.l;
        bVar.l = E;
        bVar.L(n0Var);
    }

    public static void e(n0 n0Var, org.jsoup.nodes.j jVar) {
        org.jsoup.nodes.b bVar = n0Var.g;
        if (bVar != null) {
            bVar.getClass();
            androidx.datastore.preferences.protobuf.c cVar = new androidx.datastore.preferences.protobuf.c(bVar);
            while (cVar.hasNext()) {
                org.jsoup.nodes.a aVar = (org.jsoup.nodes.a) cVar.next();
                String str = aVar.e;
                org.jsoup.nodes.b bVarF = jVar.f();
                if (!bVarF.j(str)) {
                    org.jsoup.nodes.b bVar2 = aVar.z;
                    if (bVar2 != null && bVar2.j(str)) {
                        Map map = (Map) (!bVar2.j("/jsoup.userdata") ? null : bVar2.r().get("jsoup.attrs"));
                        if (map == null || ((org.jsoup.nodes.s) map.get(str)) == null) {
                            int i = org.jsoup.nodes.s.c;
                        }
                    } else {
                        int i2 = org.jsoup.nodes.s.c;
                    }
                    String str2 = aVar.y;
                    if (str2 == null) {
                        str2 = "";
                    }
                    bVarF.p(str, str2);
                    aVar.z = bVarF;
                }
            }
        }
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) V.clone();
    }

    public abstract boolean f(r0 r0Var, b bVar);
}
