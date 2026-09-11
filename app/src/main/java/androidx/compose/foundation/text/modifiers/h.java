package androidx.compose.foundation.text.modifiers;

import android.os.Trace;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.graphics.p;
import androidx.compose.ui.graphics.r;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.p0;
import androidx.compose.ui.layout.r0;
import androidx.compose.ui.layout.s0;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.m;
import androidx.compose.ui.node.n0;
import androidx.compose.ui.node.u1;
import androidx.compose.ui.node.v;
import androidx.compose.ui.q;
import androidx.compose.ui.semantics.w;
import androidx.compose.ui.semantics.x;
import androidx.compose.ui.text.e0;
import androidx.compose.ui.text.i0;
import androidx.compose.ui.text.j0;
import androidx.compose.ui.text.m0;
import androidx.compose.ui.text.style.l;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.u;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends q implements v, m, u1 {
    public String L;
    public m0 M;
    public androidx.compose.ui.text.font.d N;
    public int O;
    public boolean P;
    public int Q;
    public int R;
    public HashMap S;
    public d T;
    public f U;
    public g V;

    @Override // androidx.compose.ui.q
    public final boolean A0() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // androidx.compose.ui.node.v
    public final int B(n0 n0Var, p0 p0Var, int i) {
        d dVarL0;
        g gVar = this.V;
        if (gVar == null) {
            dVarL0 = L0();
        } else {
            if (!gVar.c) {
                gVar = null;
            }
            if (gVar == null || (dVarL0 = gVar.d) == null) {
                dVarL0 = L0();
            }
        }
        dVarL0.d(n0Var);
        return androidx.compose.foundation.text.n0.j(dVarL0.e(n0Var.getLayoutDirection()).b());
    }

    public final d L0() {
        if (this.T == null) {
            this.T = new d(this.L, this.M, this.N, this.O, this.P, this.Q, this.R);
        }
        d dVar = this.T;
        dVar.getClass();
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    @Override // androidx.compose.ui.node.m
    public final void W(h0 h0Var) {
        d dVarL0;
        if (this.K) {
            g gVar = this.V;
            if (gVar == null) {
                dVarL0 = L0();
            } else {
                if (!gVar.c) {
                    gVar = null;
                }
                if (gVar == null || (dVarL0 = gVar.d) == null) {
                    dVarL0 = L0();
                }
            }
            androidx.compose.ui.text.a aVar = dVarL0.j;
            if (aVar == null) {
                androidx.compose.foundation.internal.b.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.T + ", textSubstitution=" + this.V + ')');
                com.google.gson.b.b();
                return;
            }
            r rVarW = h0Var.e.y.w();
            boolean z = dVarL0.k;
            if (z) {
                long j = dVarL0.l;
                rVarW.f();
                rVarW.o(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                e0 e0Var = this.M.a;
                l lVar = e0Var.m;
                if (lVar == null) {
                    lVar = l.b;
                }
                l lVar2 = lVar;
                androidx.compose.ui.graphics.m0 m0Var = e0Var.n;
                if (m0Var == null) {
                    m0Var = androidx.compose.ui.graphics.m0.d;
                }
                androidx.compose.ui.graphics.m0 m0Var2 = m0Var;
                androidx.compose.ui.graphics.drawscope.e eVar = e0Var.p;
                if (eVar == null) {
                    eVar = androidx.compose.ui.graphics.drawscope.g.a;
                }
                androidx.compose.ui.graphics.drawscope.e eVar2 = eVar;
                p pVarC = e0Var.a.c();
                if (pVarC != null) {
                    aVar.g(rVarW, pVarC, this.M.a.a.a(), m0Var2, lVar2, eVar2);
                } else {
                    long jB = t.i;
                    if (jB == 16) {
                        jB = this.M.b() != 16 ? this.M.b() : t.b;
                    }
                    aVar.f(rVarW, jB, m0Var2, lVar2, eVar2);
                }
            } finally {
                if (z) {
                    rVarW.q();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // androidx.compose.ui.node.v
    public final int a0(n0 n0Var, p0 p0Var, int i) {
        d dVarL0;
        g gVar = this.V;
        if (gVar == null) {
            dVarL0 = L0();
        } else {
            if (!gVar.c) {
                gVar = null;
            }
            if (gVar == null || (dVarL0 = gVar.d) == null) {
                dVarL0 = L0();
            }
        }
        dVarL0.d(n0Var);
        return dVarL0.a(i, n0Var.getLayoutDirection());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:23:0x004c, B:24:0x0073, B:12:0x0015), top: B:29:0x0005 }] */
    @Override // androidx.compose.ui.node.v
    public final r0 c(s0 s0Var, p0 p0Var, long j) {
        d dVarL0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            g gVar = this.V;
            if (gVar == null) {
                dVarL0 = L0();
            } else {
                if (!gVar.c) {
                    gVar = null;
                }
                if (gVar == null || (dVarL0 = gVar.d) == null) {
                    dVarL0 = L0();
                }
            }
            dVarL0.d(s0Var);
            boolean zB = dVarL0.b(j, s0Var.getLayoutDirection());
            androidx.compose.ui.text.r rVar = dVarL0.n;
            if (rVar != null) {
                rVar.a();
            }
            androidx.compose.ui.text.a aVar = dVarL0.j;
            aVar.getClass();
            androidx.compose.ui.text.android.l lVar = aVar.d;
            long j2 = dVarL0.l;
            if (zB) {
                k.r(this, 2).a1();
                HashMap map = this.S;
                if (map == null) {
                    map = new HashMap(2);
                    this.S = map;
                }
                map.put(androidx.compose.ui.layout.d.a, Integer.valueOf(Math.round(lVar.d(0))));
                map.put(androidx.compose.ui.layout.d.b, Integer.valueOf(Math.round(lVar.d(lVar.g - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            c1 c1VarF = p0Var.F(n.o(i, i, i2, i2));
            HashMap map2 = this.S;
            map2.getClass();
            return s0Var.q(i, i2, map2, new j(c1VarF, 7));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.l] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.foundation.text.modifiers.f] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // androidx.compose.ui.node.u1
    public final void l0(x xVar) {
        f fVar = this.U;
        ?? r0 = fVar;
        if (fVar == null) {
            final int i = 0;
            ?? r1 = new kotlin.jvm.functions.l(this) { // from class: androidx.compose.foundation.text.modifiers.f
                public final /* synthetic */ h y;

                {
                    this.y = this;
                }

                /* JADX WARN: Code duplicated, block: B:23:0x00bd  */
                @Override // kotlin.jvm.functions.l
                public final Object invoke(Object obj) {
                    androidx.compose.ui.unit.c cVar;
                    j0 j0Var;
                    boolean z;
                    switch (i) {
                        case 0:
                            List list = (List) obj;
                            h hVar = this.y;
                            d dVarL0 = hVar.L0();
                            m0 m0VarE = m0.e(hVar.M, t.i, 0L, null, 0L, 0, 0L, 16777214);
                            androidx.compose.ui.unit.m mVar = dVarL0.o;
                            j0 j0Var2 = null;
                            if (mVar == null || (cVar = dVarL0.i) == null) {
                                j0Var = null;
                            } else {
                                androidx.compose.ui.text.g gVar = new androidx.compose.ui.text.g(dVarL0.a);
                                if (dVarL0.j == null || dVarL0.n == null) {
                                    j0Var = null;
                                } else {
                                    long j = dVarL0.p & (-8589934589L);
                                    int i2 = dVarL0.f;
                                    boolean z2 = dVarL0.e;
                                    int i3 = dVarL0.d;
                                    androidx.compose.ui.text.font.d dVar = dVarL0.c;
                                    u uVar = u.e;
                                    j0Var = new j0(new i0(gVar, m0VarE, uVar, i2, z2, i3, cVar, mVar, dVar, j), new androidx.compose.ui.text.n(new androidx.compose.runtime.internal.c(gVar, m0VarE, uVar, cVar, dVar), j, dVarL0.f, dVarL0.d), dVarL0.l);
                                }
                            }
                            if (j0Var != null) {
                                list.add(j0Var);
                                j0Var2 = j0Var;
                            }
                            return Boolean.valueOf(j0Var2 != null);
                        case 1:
                            String str = ((androidx.compose.ui.text.g) obj).y;
                            h hVar2 = this.y;
                            g gVar2 = hVar2.V;
                            if (gVar2 == null) {
                                g gVar3 = new g(hVar2.L, str);
                                d dVar2 = new d(str, hVar2.M, hVar2.N, hVar2.O, hVar2.P, hVar2.Q, hVar2.R);
                                dVar2.d(hVar2.L0().i);
                                gVar3.d = dVar2;
                                hVar2.V = gVar3;
                            } else if (!kotlin.jvm.internal.l.a(str, gVar2.b)) {
                                gVar2.b = str;
                                d dVar3 = gVar2.d;
                                if (dVar3 != null) {
                                    m0 m0Var = hVar2.M;
                                    androidx.compose.ui.text.font.d dVar4 = hVar2.N;
                                    int i4 = hVar2.O;
                                    boolean z3 = hVar2.P;
                                    int i5 = hVar2.Q;
                                    int i6 = hVar2.R;
                                    dVar3.a = str;
                                    dVar3.b = m0Var;
                                    dVar3.c = dVar4;
                                    dVar3.d = i4;
                                    dVar3.e = z3;
                                    dVar3.f = i5;
                                    dVar3.g = i6;
                                    dVar3.s = (dVar3.s << 2) | 2;
                                    dVar3.c();
                                }
                            }
                            k.l(hVar2);
                            k.k(hVar2);
                            k.j(hVar2);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            h hVar3 = this.y;
                            g gVar4 = hVar3.V;
                            if (gVar4 == null) {
                                z = false;
                            } else {
                                gVar4.c = zBooleanValue;
                                k.l(hVar3);
                                k.k(hVar3);
                                k.j(hVar3);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.U = r1;
            r0 = r1;
        }
        androidx.compose.ui.text.g gVar = new androidx.compose.ui.text.g(this.L);
        kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.v.a;
        xVar.b(androidx.compose.ui.semantics.t.B, com.google.common.base.c.p(gVar));
        g gVar2 = this.V;
        if (gVar2 != null) {
            boolean z = gVar2.c;
            w wVar = androidx.compose.ui.semantics.t.D;
            kotlin.reflect.j[] jVarArr2 = androidx.compose.ui.semantics.v.a;
            kotlin.reflect.j jVar = jVarArr2[17];
            xVar.b(wVar, Boolean.valueOf(z));
            androidx.compose.ui.text.g gVar3 = new androidx.compose.ui.text.g(gVar2.b);
            w wVar2 = androidx.compose.ui.semantics.t.C;
            kotlin.reflect.j jVar2 = jVarArr2[16];
            xVar.b(wVar2, gVar3);
        }
        final int i2 = 1;
        xVar.b(androidx.compose.ui.semantics.k.l, new androidx.compose.ui.semantics.a(null, new kotlin.jvm.functions.l(this) { // from class: androidx.compose.foundation.text.modifiers.f
            public final /* synthetic */ h y;

            {
                this.y = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00bd  */
            @Override // kotlin.jvm.functions.l
            public final Object invoke(Object obj) {
                androidx.compose.ui.unit.c cVar;
                j0 j0Var;
                boolean z2;
                switch (i2) {
                    case 0:
                        List list = (List) obj;
                        h hVar = this.y;
                        d dVarL0 = hVar.L0();
                        m0 m0VarE = m0.e(hVar.M, t.i, 0L, null, 0L, 0, 0L, 16777214);
                        androidx.compose.ui.unit.m mVar = dVarL0.o;
                        j0 j0Var2 = null;
                        if (mVar == null || (cVar = dVarL0.i) == null) {
                            j0Var = null;
                        } else {
                            androidx.compose.ui.text.g gVar4 = new androidx.compose.ui.text.g(dVarL0.a);
                            if (dVarL0.j == null || dVarL0.n == null) {
                                j0Var = null;
                            } else {
                                long j = dVarL0.p & (-8589934589L);
                                int i3 = dVarL0.f;
                                boolean z3 = dVarL0.e;
                                int i4 = dVarL0.d;
                                androidx.compose.ui.text.font.d dVar = dVarL0.c;
                                u uVar = u.e;
                                j0Var = new j0(new i0(gVar4, m0VarE, uVar, i3, z3, i4, cVar, mVar, dVar, j), new androidx.compose.ui.text.n(new androidx.compose.runtime.internal.c(gVar4, m0VarE, uVar, cVar, dVar), j, dVarL0.f, dVarL0.d), dVarL0.l);
                            }
                        }
                        if (j0Var != null) {
                            list.add(j0Var);
                            j0Var2 = j0Var;
                        }
                        return Boolean.valueOf(j0Var2 != null);
                    case 1:
                        String str = ((androidx.compose.ui.text.g) obj).y;
                        h hVar2 = this.y;
                        g gVar5 = hVar2.V;
                        if (gVar5 == null) {
                            g gVar6 = new g(hVar2.L, str);
                            d dVar2 = new d(str, hVar2.M, hVar2.N, hVar2.O, hVar2.P, hVar2.Q, hVar2.R);
                            dVar2.d(hVar2.L0().i);
                            gVar6.d = dVar2;
                            hVar2.V = gVar6;
                        } else if (!kotlin.jvm.internal.l.a(str, gVar5.b)) {
                            gVar5.b = str;
                            d dVar3 = gVar5.d;
                            if (dVar3 != null) {
                                m0 m0Var = hVar2.M;
                                androidx.compose.ui.text.font.d dVar4 = hVar2.N;
                                int i5 = hVar2.O;
                                boolean z4 = hVar2.P;
                                int i6 = hVar2.Q;
                                int i7 = hVar2.R;
                                dVar3.a = str;
                                dVar3.b = m0Var;
                                dVar3.c = dVar4;
                                dVar3.d = i5;
                                dVar3.e = z4;
                                dVar3.f = i6;
                                dVar3.g = i7;
                                dVar3.s = (dVar3.s << 2) | 2;
                                dVar3.c();
                            }
                        }
                        k.l(hVar2);
                        k.k(hVar2);
                        k.j(hVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar3 = this.y;
                        g gVar7 = hVar3.V;
                        if (gVar7 == null) {
                            z2 = false;
                        } else {
                            gVar7.c = zBooleanValue;
                            k.l(hVar3);
                            k.k(hVar3);
                            k.j(hVar3);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        xVar.b(androidx.compose.ui.semantics.k.m, new androidx.compose.ui.semantics.a(null, new kotlin.jvm.functions.l(this) { // from class: androidx.compose.foundation.text.modifiers.f
            public final /* synthetic */ h y;

            {
                this.y = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00bd  */
            @Override // kotlin.jvm.functions.l
            public final Object invoke(Object obj) {
                androidx.compose.ui.unit.c cVar;
                j0 j0Var;
                boolean z2;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        h hVar = this.y;
                        d dVarL0 = hVar.L0();
                        m0 m0VarE = m0.e(hVar.M, t.i, 0L, null, 0L, 0, 0L, 16777214);
                        androidx.compose.ui.unit.m mVar = dVarL0.o;
                        j0 j0Var2 = null;
                        if (mVar == null || (cVar = dVarL0.i) == null) {
                            j0Var = null;
                        } else {
                            androidx.compose.ui.text.g gVar4 = new androidx.compose.ui.text.g(dVarL0.a);
                            if (dVarL0.j == null || dVarL0.n == null) {
                                j0Var = null;
                            } else {
                                long j = dVarL0.p & (-8589934589L);
                                int i4 = dVarL0.f;
                                boolean z3 = dVarL0.e;
                                int i5 = dVarL0.d;
                                androidx.compose.ui.text.font.d dVar = dVarL0.c;
                                u uVar = u.e;
                                j0Var = new j0(new i0(gVar4, m0VarE, uVar, i4, z3, i5, cVar, mVar, dVar, j), new androidx.compose.ui.text.n(new androidx.compose.runtime.internal.c(gVar4, m0VarE, uVar, cVar, dVar), j, dVarL0.f, dVarL0.d), dVarL0.l);
                            }
                        }
                        if (j0Var != null) {
                            list.add(j0Var);
                            j0Var2 = j0Var;
                        }
                        return Boolean.valueOf(j0Var2 != null);
                    case 1:
                        String str = ((androidx.compose.ui.text.g) obj).y;
                        h hVar2 = this.y;
                        g gVar5 = hVar2.V;
                        if (gVar5 == null) {
                            g gVar6 = new g(hVar2.L, str);
                            d dVar2 = new d(str, hVar2.M, hVar2.N, hVar2.O, hVar2.P, hVar2.Q, hVar2.R);
                            dVar2.d(hVar2.L0().i);
                            gVar6.d = dVar2;
                            hVar2.V = gVar6;
                        } else if (!kotlin.jvm.internal.l.a(str, gVar5.b)) {
                            gVar5.b = str;
                            d dVar3 = gVar5.d;
                            if (dVar3 != null) {
                                m0 m0Var = hVar2.M;
                                androidx.compose.ui.text.font.d dVar4 = hVar2.N;
                                int i6 = hVar2.O;
                                boolean z4 = hVar2.P;
                                int i7 = hVar2.Q;
                                int i8 = hVar2.R;
                                dVar3.a = str;
                                dVar3.b = m0Var;
                                dVar3.c = dVar4;
                                dVar3.d = i6;
                                dVar3.e = z4;
                                dVar3.f = i7;
                                dVar3.g = i8;
                                dVar3.s = (dVar3.s << 2) | 2;
                                dVar3.c();
                            }
                        }
                        k.l(hVar2);
                        k.k(hVar2);
                        k.j(hVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar3 = this.y;
                        g gVar7 = hVar3.V;
                        if (gVar7 == null) {
                            z2 = false;
                        } else {
                            gVar7.c = zBooleanValue;
                            k.l(hVar3);
                            k.k(hVar3);
                            k.j(hVar3);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        xVar.b(androidx.compose.ui.semantics.k.n, new androidx.compose.ui.semantics.a(null, new androidx.activity.w(this, 16)));
        androidx.compose.ui.semantics.v.a(xVar, r0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // androidx.compose.ui.node.v
    public final int v(n0 n0Var, p0 p0Var, int i) {
        d dVarL0;
        g gVar = this.V;
        if (gVar == null) {
            dVarL0 = L0();
        } else {
            if (!gVar.c) {
                gVar = null;
            }
            if (gVar == null || (dVarL0 = gVar.d) == null) {
                dVarL0 = L0();
            }
        }
        dVarL0.d(n0Var);
        return androidx.compose.foundation.text.n0.j(dVarL0.e(n0Var.getLayoutDirection()).c());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // androidx.compose.ui.node.v
    public final int v0(n0 n0Var, p0 p0Var, int i) {
        d dVarL0;
        g gVar = this.V;
        if (gVar == null) {
            dVarL0 = L0();
        } else {
            if (!gVar.c) {
                gVar = null;
            }
            if (gVar == null || (dVarL0 = gVar.d) == null) {
                dVarL0 = L0();
            }
        }
        dVarL0.d(n0Var);
        return dVarL0.a(i, n0Var.getLayoutDirection());
    }
}
