package androidx.compose.runtime;

import android.os.Trace;
import com.app.mlounge.emulator.LibretroCore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public int A;
    public int B;
    public boolean C;
    public final q D;
    public final ArrayList E;
    public boolean F;
    public e2 G;
    public f2 H;
    public i2 I;
    public boolean J;
    public androidx.compose.runtime.internal.j K;
    public androidx.compose.runtime.changelist.a L;
    public final androidx.compose.runtime.changelist.b M;
    public a N;
    public androidx.compose.runtime.changelist.c O;
    public androidx.compose.ui.graphics.a P;
    public final androidx.compose.runtime.tooling.d Q;
    public final kotlin.coroutines.i R;
    public boolean S;
    public long T;
    public x U;
    public final androidx.compose.ui.node.a2 a;
    public final v b;
    public final f2 c;
    public final androidx.collection.r0 d;
    public final androidx.compose.runtime.changelist.a e;
    public final androidx.compose.runtime.changelist.a f;
    public final com.app.mlounge.data.music.e g;
    public final y h;
    public m1 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public androidx.collection.x p;
    public boolean q;
    public boolean r;
    public androidx.collection.z v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final o0 n = new o0();
    public final ArrayList s = new ArrayList();
    public final o0 t = new o0();
    public androidx.compose.runtime.internal.j u = androidx.compose.runtime.internal.j.A;
    public final o0 x = new o0();
    public int z = -1;

    public r(androidx.compose.ui.node.a2 a2Var, v vVar, f2 f2Var, androidx.collection.r0 r0Var, androidx.compose.runtime.changelist.a aVar, androidx.compose.runtime.changelist.a aVar2, com.app.mlounge.data.music.e eVar, y yVar) {
        this.a = a2Var;
        this.b = vVar;
        this.c = f2Var;
        this.d = r0Var;
        this.e = aVar;
        this.f = aVar2;
        this.g = eVar;
        this.h = yVar;
        this.C = vVar.f() || vVar.d();
        this.D = new q(this, 0);
        this.E = new ArrayList();
        e2 e2VarD = f2Var.d();
        e2VarD.c();
        this.G = e2VarD;
        f2 f2Var2 = new f2();
        if (vVar.f()) {
            f2Var2.c();
        }
        if (vVar.d()) {
            f2Var2.H = new androidx.collection.z();
        }
        this.H = f2Var2;
        i2 i2VarE = f2Var2.e();
        i2VarE.e(true);
        this.I = i2VarE;
        this.M = new androidx.compose.runtime.changelist.b(this, aVar);
        e2 e2VarD2 = this.H.d();
        try {
            a aVarA = e2VarD2.a(0);
            e2VarD2.c();
            this.N = aVarA;
            this.O = new androidx.compose.runtime.changelist.c();
            this.Q = new androidx.compose.runtime.tooling.d(this);
            kotlin.coroutines.i iVarJ = vVar.j();
            kotlin.coroutines.i iVarD = D();
            this.R = iVarJ.plus(iVarD == null ? kotlin.coroutines.j.e : iVarD);
        } catch (Throwable th) {
            e2VarD2.c();
            throw th;
        }
    }

    public static final int S(r rVar, int i, boolean z, int i2) {
        e2 e2Var = rVar.G;
        androidx.compose.runtime.changelist.b bVar = rVar.M;
        boolean zJ = e2Var.j(i);
        int[] iArr = e2Var.b;
        if (zJ) {
            int i3 = e2Var.i(i);
            Object objP = e2Var.p(i, iArr);
            if (i3 == 206 && kotlin.jvm.internal.l.a(objP, t.e)) {
                Object objH = e2Var.h(i, 0);
                a2 a2Var = objH instanceof a2 ? (a2) objH : null;
                z1 z1Var = a2Var != null ? a2Var.a : null;
                o oVar = z1Var instanceof o ? (o) z1Var : null;
                if (oVar != null) {
                    for (r rVar2 : oVar.e.e) {
                        f2 f2Var = rVar2.c;
                        if (f2Var.y > 0 && (f2Var.e[1] & 67108864) != 0) {
                            y yVar = rVar2.h;
                            synchronized (yVar.A) {
                                yVar.p();
                                androidx.collection.o0 o0Var = yVar.K;
                                yVar.K = androidx.datastore.preferences.protobuf.h1.g();
                                try {
                                    yVar.S.h0(o0Var);
                                } catch (Throwable th) {
                                    yVar.K = o0Var;
                                    throw th;
                                }
                            }
                            androidx.compose.runtime.changelist.a aVar = new androidx.compose.runtime.changelist.a();
                            rVar2.L = aVar;
                            e2 e2VarD = rVar2.c.d();
                            try {
                                rVar2.G = e2VarD;
                                androidx.compose.runtime.changelist.b bVar2 = rVar2.M;
                                androidx.compose.runtime.changelist.a aVar2 = bVar2.b;
                                try {
                                    bVar2.b = aVar;
                                    rVar2.R(0);
                                    androidx.compose.runtime.changelist.b bVar3 = rVar2.M;
                                    bVar3.b();
                                    if (bVar3.c) {
                                        bVar3.b.l.J(androidx.compose.runtime.changelist.c0.c);
                                        if (bVar3.c) {
                                            bVar3.d(false);
                                            bVar3.d(false);
                                            bVar3.b.l.J(androidx.compose.runtime.changelist.m.c);
                                            bVar3.c = false;
                                        }
                                    }
                                    bVar2.b = aVar2;
                                    e2VarD.c();
                                } catch (Throwable th2) {
                                    bVar2.b = aVar2;
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                e2VarD.c();
                                throw th3;
                            }
                        }
                        rVar.b.r(rVar2.h);
                    }
                }
                return e2Var.o(i);
            }
            if (!e2Var.l(i)) {
                return e2Var.o(i);
            }
        } else if (e2Var.d(i)) {
            int i4 = iArr[(i * 5) + 3] + i;
            int iS = 0;
            for (int i5 = i + 1; i5 < i4; i5 += iArr[(i5 * 5) + 3]) {
                boolean zL = e2Var.l(i5);
                if (zL) {
                    bVar.c();
                    Object objN = e2Var.n(i5);
                    bVar.c();
                    bVar.h.add(objN);
                }
                iS += S(rVar, i5, zL || z, zL ? 0 : i2 + iS);
                if (zL) {
                    bVar.c();
                    bVar.a();
                }
            }
            if (!e2Var.l(i)) {
                return iS;
            }
        } else if (!e2Var.l(i)) {
            return e2Var.o(i);
        }
        return 1;
    }

    public final androidx.compose.runtime.internal.j A() {
        return l();
    }

    public final q1 B() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (q1) androidx.privacysandbox.ads.adservices.java.internal.a.j(1, arrayList);
    }

    public final boolean C() {
        if (!F() || this.w) {
            return true;
        }
        q1 q1VarB = B();
        return (q1VarB == null || (q1VarB.b & 4) == 0) ? false : true;
    }

    public final androidx.compose.runtime.tooling.d D() {
        if (this.b.k()) {
            return this.Q;
        }
        return null;
    }

    public final boolean E() {
        return this.S;
    }

    public final boolean F() {
        q1 q1VarB;
        return (this.S || this.y || this.w || (q1VarB = B()) == null || (q1VarB.b & 8) != 0) ? false : true;
    }

    public final void G(ArrayList arrayList) {
        androidx.compose.runtime.changelist.a aVar = this.f;
        androidx.compose.runtime.changelist.b bVar = this.M;
        androidx.compose.runtime.changelist.a aVar2 = bVar.b;
        try {
            bVar.b = aVar;
            aVar.l.J(androidx.compose.runtime.changelist.a0.c);
            if (arrayList.size() <= 0) {
                bVar.b();
                bVar.b.l.J(androidx.compose.runtime.changelist.n.c);
                bVar.f = 0;
                bVar.b = aVar2;
                return;
            }
            kotlin.k kVar = (kotlin.k) arrayList.get(0);
            x0 x0Var = (x0) kVar.e;
            x0Var.getClass();
            throw null;
        } catch (Throwable th) {
            bVar.b = aVar2;
            throw th;
        }
    }

    public final void H(androidx.compose.runtime.internal.j jVar, Object obj) {
        X(126665345, null, null, 0);
        I();
        m0(obj);
        long j = this.T;
        try {
            this.T = 126665345;
            if (this.S) {
                i2.z(this.I);
            }
            boolean z = (this.S || kotlin.jvm.internal.l.a(this.G.f(), jVar)) ? false : true;
            if (z) {
                O(jVar);
            }
            X(202, t.c, jVar, 0);
            this.K = null;
            this.w = z;
            throw null;
        } catch (Throwable th) {
            try {
                okhttp3.internal.platform.android.g.L(th, new n(2, this));
                throw th;
            } catch (Throwable th2) {
                p(false);
                this.K = null;
                this.T = j;
                p(false);
                throw th2;
            }
        }
    }

    public final Object I() {
        boolean z = this.S;
        f fVar = m.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof d2)) {
                return objM;
            }
        } else if (this.r) {
            t.a("A call to createNode(), emitNode() or useNode() expected");
            return fVar;
        }
        return fVar;
    }

    public final List J() {
        v vVar = this.b;
        u uVarH = vVar.h();
        y yVar = uVarH != null ? (y) uVarH : null;
        if (yVar != null) {
            f2 f2Var = yVar.C;
            e2 e2VarD = f2Var.d();
            try {
                Integer numS = kotlin.math.a.s(e2VarD, vVar, 0, e2VarD.c);
                e2VarD.c();
                if (numS != null) {
                    e2 e2VarD2 = f2Var.d();
                    try {
                        return kotlin.collections.o.X(kotlin.math.a.L(e2VarD2, numS.intValue(), 0), yVar.S.J());
                    } finally {
                        e2VarD2.c();
                    }
                }
            } catch (Throwable th) {
                e2VarD.c();
                throw th;
            }
        }
        return kotlin.collections.u.e;
    }

    public final int K(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += this.G.b[(iQ * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0059 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:18:0x0038, B:21:0x0040, B:23:0x0048, B:25:0x004e, B:26:0x0052, B:27:0x0053, B:29:0x0059, B:22:0x0044), top: B:34:0x0005, inners: #1 }] */
    public final Object L(y yVar, y yVar2, Integer num, List list, kotlin.jvm.functions.a aVar) {
        Object objInvoke;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                kotlin.k kVar = (kotlin.k) list.get(i2);
                q1 q1Var = (q1) kVar.e;
                Object obj = kVar.y;
                if (obj != null) {
                    g0(q1Var, obj);
                } else {
                    g0(q1Var, null);
                }
            }
            if (yVar == null) {
                objInvoke = aVar.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (yVar2 == null || yVar2.equals(yVar) || iIntValue < 0) {
                    objInvoke = aVar.invoke();
                } else {
                    yVar.O = yVar2;
                    yVar.P = iIntValue;
                    try {
                        objInvoke = aVar.invoke();
                        yVar.O = null;
                        yVar.P = 0;
                    } catch (Throwable th) {
                        yVar.O = null;
                        yVar.P = 0;
                        throw th;
                    }
                }
                if (objInvoke == null) {
                    objInvoke = aVar.invoke();
                }
            }
            this.F = z;
            this.k = i;
            return objInvoke;
        } catch (Throwable th2) {
            this.F = z;
            this.k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    /* JADX WARN: Code duplicated, block: B:204:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0122 A[LOOP:7: B:37:0x00cb->B:56:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0166  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:73:0x0177
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void M() {
        /*
            Method dump skipped, instruction units count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.r.M():void");
    }

    public final void N() {
        int i;
        R(this.G.g);
        androidx.compose.runtime.changelist.b bVar = this.M;
        bVar.d(false);
        o0 o0Var = bVar.d;
        r rVar = bVar.a;
        e2 e2Var = rVar.G;
        if (e2Var.c > 0 && o0Var.a(-2) != (i = e2Var.i)) {
            if (!bVar.c && bVar.e) {
                bVar.d(false);
                bVar.b.l.J(androidx.compose.runtime.changelist.q.c);
                bVar.c = true;
            }
            if (i > 0) {
                a aVarA = e2Var.a(i);
                o0Var.c(i);
                bVar.d(false);
                androidx.compose.runtime.changelist.l0 l0Var = bVar.b.l;
                l0Var.J(androidx.compose.runtime.changelist.p.c);
                androidx.room.r.v(l0Var, 0, aVarA);
                bVar.c = true;
            }
        }
        bVar.b.l.J(androidx.compose.runtime.changelist.y.c);
        int i2 = bVar.f;
        e2 e2Var2 = rVar.G;
        bVar.f = e2Var2.b[(e2Var2.g * 5) + 3] + i2;
    }

    public final void O(androidx.compose.runtime.internal.j jVar) {
        androidx.collection.z zVar = this.v;
        if (zVar == null) {
            zVar = new androidx.collection.z();
            this.v = zVar;
        }
        zVar.h(this.G.g, jVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    public final void P(int i, int i2, int i3) {
        e2 e2Var = this.G;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (e2Var.q(i) == i2) {
                i3 = i2;
            } else if (e2Var.q(i2) == i) {
                i3 = i;
            } else if (e2Var.q(i) == e2Var.q(i2)) {
                i3 = e2Var.q(i);
            } else {
                int iQ = i;
                int i4 = 0;
                while (iQ > 0 && iQ != i3) {
                    iQ = e2Var.q(iQ);
                    i4++;
                }
                int iQ2 = i2;
                int i5 = 0;
                while (iQ2 > 0 && iQ2 != i3) {
                    iQ2 = e2Var.q(iQ2);
                    i5++;
                }
                int i6 = i4 - i5;
                int iQ3 = i;
                for (int i7 = 0; i7 < i6; i7++) {
                    iQ3 = e2Var.q(iQ3);
                }
                int i8 = i5 - i4;
                int iQ4 = i2;
                for (int i9 = 0; i9 < i8; i9++) {
                    iQ4 = e2Var.q(iQ4);
                }
                i3 = iQ3;
                for (int iQ5 = iQ4; i3 != iQ5; iQ5 = e2Var.q(iQ5)) {
                    i3 = e2Var.q(i3);
                }
            }
        }
        while (i > 0 && i != i3) {
            if (e2Var.l(i)) {
                this.M.a();
            }
            i = e2Var.q(i);
        }
        o(i2, i3);
    }

    public final Object Q() {
        boolean z = this.S;
        f fVar = m.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof d2)) {
                return objM instanceof a2 ? ((a2) objM).a : objM;
            }
        } else if (this.r) {
            t.a("A call to createNode(), emitNode() or useNode() expected");
            return fVar;
        }
        return fVar;
    }

    public final void R(int i) {
        boolean zL = this.G.l(i);
        androidx.compose.runtime.changelist.b bVar = this.M;
        if (zL) {
            bVar.c();
            Object objN = this.G.n(i);
            bVar.c();
            bVar.h.add(objN);
        }
        S(this, i, zL, 0);
        bVar.c();
        if (zL) {
            bVar.a();
        }
    }

    public final boolean T(int i, boolean z) {
        if ((i & 1) == 0 && (this.S || this.y)) {
            androidx.compose.ui.graphics.a aVar = this.P;
            if (aVar != null && B() != null) {
                aVar.getClass();
            }
        } else if (!z && F()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff  */
    public final void U() {
        int i;
        long jRotateLeft;
        long jRotateLeft2;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        e2 e2Var = this.G;
        int iG = e2Var.g();
        int[] iArr = e2Var.b;
        int i2 = e2Var.g;
        Object objP = i2 < e2Var.h ? e2Var.p(i2, iArr) : null;
        Object objF = e2Var.f();
        int i3 = this.m;
        f fVar = m.a;
        if (objP == null) {
            if (objF == null || iG != 207 || objF.equals(fVar)) {
                jRotateLeft2 = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i3);
            } else {
                this.T = Long.rotateLeft(((long) objF.hashCode()) ^ Long.rotateLeft(this.T, 3), 3) ^ ((long) i3);
            }
            a0(null, (iArr[(e2Var.g * 5) + 1] & 1073741824) != 0);
            M();
            e2Var.e();
            if (objP != null) {
                if (objP instanceof Enum) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) objP.hashCode()), 3);
                }
            }
            if (objF == null && iG == 207 && !objF.equals(fVar)) {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i3), 3) ^ ((long) objF.hashCode()), 3);
                return;
            } else {
                this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i3), 3), 3);
            }
        }
        if (objP instanceof Enum) {
            jRotateLeft = Long.rotateLeft(((long) ((Enum) objP).ordinal()) ^ Long.rotateLeft(this.T, 3), 3);
            i = 0;
        } else {
            i = 0;
            jRotateLeft = Long.rotateLeft(((long) objP.hashCode()) ^ Long.rotateLeft(this.T, 3), 3);
        }
        jRotateLeft2 = jRotateLeft ^ ((long) i);
        this.T = jRotateLeft2;
        a0(null, (iArr[(e2Var.g * 5) + 1] & 1073741824) != 0);
        M();
        e2Var.e();
        if (objP != null) {
            if (objF == null) {
            }
            this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i3), 3), 3);
        } else if (objP instanceof Enum) {
            this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) ((Enum) objP).ordinal()), 3);
        } else {
            this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) objP.hashCode()), 3);
        }
    }

    public final void V() {
        e2 e2Var = this.G;
        int i = e2Var.i;
        this.l = i >= 0 ? e2Var.b[(i * 5) + 1] & 67108863 : 0;
        e2Var.t();
    }

    public final void W() {
        if (this.l != 0) {
            t.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        q1 q1VarB = B();
        if (q1VarB != null) {
            int i = q1VarB.b;
            if ((i & 128) == 0) {
                q1VarB.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            V();
        } else {
            M();
        }
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0327  */
    /* JADX WARN: Code duplicated, block: B:175:0x033d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0358  */
    /* JADX WARN: Code duplicated, block: B:179:0x035e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x0360 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x0364  */
    /* JADX WARN: Code duplicated, block: B:184:0x036b  */
    /* JADX WARN: Code duplicated, block: B:186:0x036e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0370  */
    /* JADX WARN: Code duplicated, block: B:191:0x039e  */
    /* JADX WARN: Code duplicated, block: B:192:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x010c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:70:0x0126  */
    /* JADX WARN: Code duplicated, block: B:71:0x012a  */
    /* JADX WARN: Code duplicated, block: B:76:0x014e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0156  */
    /* JADX WARN: Code duplicated, block: B:79:0x0160  */
    /* JADX WARN: Code duplicated, block: B:82:0x0174  */
    /* JADX WARN: Code duplicated, block: B:83:0x0176  */
    /* JADX WARN: Code duplicated, block: B:85:0x017a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0187  */
    /* JADX WARN: Code duplicated, block: B:90:0x018f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0198  */
    public final void X(int i, Object obj, Object obj2, int i2) {
        long jRotateLeft;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        m1 m1Var;
        m1 m1Var2;
        ArrayList arrayList;
        androidx.collection.z zVar;
        int i3;
        Object objValueOf;
        androidx.collection.o0 o0Var;
        Object objG;
        androidx.collection.j0 j0Var;
        i2 i2Var;
        int i4;
        Object obj3;
        int i5;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        int i9;
        e2 e2Var;
        int[] iArr;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        e2 e2Var2;
        int i13;
        Object objP;
        i2 i2Var2;
        int i14;
        m1 m1Var3;
        Object obj4 = obj;
        if (this.r) {
            t.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i15 = this.m;
        Object obj5 = m.a;
        if (obj4 == null) {
            if (obj2 == null || i != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3);
                j = i15;
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i15);
            }
            if (obj4 == null) {
                this.m++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.S) {
                this.G.k++;
                i2Var2 = this.I;
                i14 = i2Var2.t;
                if (z) {
                    i2Var2.Q(i, obj5, obj5, true);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    i2Var2.Q(i, obj4, obj2, false);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    i2Var2.Q(i, obj4, obj5, false);
                }
                m1Var3 = this.j;
                if (m1Var3 != null) {
                    int i16 = (-2) - i14;
                    s0 s0Var = new s0(i, i16, -1, -1);
                    m1Var3.e.h(i16, new l0(-1, this.k - m1Var3.b, 0));
                    m1Var3.d.add(s0Var);
                }
                x(z, null);
                return;
            }
            if (i2 != 1 && this.y) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.j == null) {
                int iG = this.G.g();
                if (!z2 && iG == i) {
                    e2Var2 = this.G;
                    i13 = e2Var2.g;
                    if (i13 < e2Var2.h) {
                        objP = e2Var2.p(i13, e2Var2.b);
                    } else {
                        objP = null;
                    }
                    if (kotlin.jvm.internal.l.a(obj4, objP)) {
                        a0(obj2, z);
                        z3 = z2;
                    }
                }
                e2Var = this.G;
                iArr = e2Var.b;
                arrayList2 = new ArrayList();
                if (e2Var.k <= 0) {
                    i10 = e2Var.g;
                    while (i10 < e2Var.h) {
                        int i17 = i10 * 5;
                        int i18 = iArr[i17];
                        Object objP2 = e2Var.p(i10, iArr);
                        i11 = iArr[i17 + 1];
                        if ((i11 & 1073741824) != 0) {
                            i12 = 1;
                        } else {
                            i12 = i11 & 67108863;
                        }
                        arrayList2.add(new s0(i18, i10, i12, objP2));
                        i10 += iArr[i17 + 3];
                        z2 = z2;
                    }
                }
                z3 = z2;
                this.j = new m1(this.k, arrayList2);
            } else {
                z3 = z2;
            }
            m1Var = this.j;
            if (m1Var != null) {
                arrayList = m1Var.d;
                zVar = m1Var.e;
                i3 = m1Var.b;
                if (obj4 != null) {
                    objValueOf = new r0(Integer.valueOf(i), obj4);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                o0Var = ((androidx.compose.runtime.collection.a) m1Var.f.getValue()).a;
                objG = o0Var.g(objValueOf);
                if (objG == null) {
                    objG = null;
                } else if (objG instanceof androidx.collection.j0) {
                    j0Var = (androidx.collection.j0) objG;
                    Object objK = j0Var.k(0);
                    if (j0Var.h()) {
                        o0Var.k(objValueOf);
                    }
                    if (j0Var.b == 1) {
                        o0Var.m(objValueOf, j0Var.e());
                    }
                    objG = objK;
                } else {
                    o0Var.k(objValueOf);
                }
                s0 s0Var2 = (s0) objG;
                if (!z3 || s0Var2 == null) {
                    this.G.k++;
                    this.S = true;
                    this.K = null;
                    if (this.I.w) {
                        i2 i2VarE = this.H.e();
                        this.I = i2VarE;
                        i2VarE.M();
                        this.J = false;
                        this.K = null;
                    }
                    this.I.d();
                    i2Var = this.I;
                    int i19 = i2Var.t;
                    if (z) {
                        i2Var.Q(i, obj5, obj5, true);
                        i4 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i4 = 0;
                        i2Var.Q(i, obj5, obj2, false);
                    } else {
                        i4 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        i2Var.Q(i, obj3, obj5, false);
                    }
                    this.N = this.I.b(i19);
                    int i20 = (-2) - i19;
                    s0 s0Var3 = new s0(i, i20, -1, -1);
                    zVar.h(i20, new l0(-1, this.k - i3, i4));
                    arrayList.add(s0Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.k;
                    }
                    m1Var2 = new m1(i5, arrayList3);
                } else {
                    int i21 = s0Var2.c;
                    arrayList.add(s0Var2);
                    l0 l0Var = (l0) zVar.b(i21);
                    this.k = (l0Var != null ? l0Var.b : -1) + i3;
                    l0 l0Var2 = (l0) zVar.b(i21);
                    int i22 = l0Var2 != null ? l0Var2.a : -1;
                    int i23 = m1Var.c;
                    int i24 = i22 - i23;
                    int i25 = 8;
                    if (i22 <= i23) {
                        i6 = i24;
                        if (i23 > i22) {
                            Object[] objArr3 = zVar.c;
                            long[] jArr = zVar.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i26 = 0;
                                while (true) {
                                    long j2 = jArr[i26];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i27 = 8 - ((~(i26 - length)) >>> 31);
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            if ((j2 & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                l0 l0Var3 = (l0) objArr3[(i26 << 3) + i28];
                                                int i29 = l0Var3.a;
                                                if (i29 == i22) {
                                                    l0Var3.a = i23;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i22 + 1 <= i29 && i29 < i23) {
                                                        l0Var3.a = i29 - 1;
                                                    }
                                                }
                                            }
                                            j2 >>= 8;
                                            i28++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i27 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i26 == length) {
                                        break;
                                    }
                                    i26++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = zVar.c;
                        long[] jArr2 = zVar.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i30 = 0;
                            while (true) {
                                long j3 = jArr2[i30];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i31 = 8 - ((~(i30 - length2)) >>> 31);
                                    int i32 = 0;
                                    while (i32 < i31) {
                                        if ((j3 & 255) < 128) {
                                            i9 = i25;
                                            l0 l0Var4 = (l0) objArr4[(i30 << 3) + i32];
                                            i8 = i24;
                                            int i33 = l0Var4.a;
                                            if (i33 == i22) {
                                                l0Var4.a = i23;
                                            } else if (i23 <= i33 && i33 < i22) {
                                                l0Var4.a = i33 + 1;
                                            }
                                        } else {
                                            i8 = i24;
                                            i9 = i25;
                                        }
                                        j3 >>= i9;
                                        i32++;
                                        i25 = i9;
                                        i24 = i8;
                                    }
                                    i6 = i24;
                                    if (i31 != i25) {
                                        break;
                                    }
                                } else {
                                    i6 = i24;
                                }
                                if (i30 == length2) {
                                    break;
                                }
                                i30++;
                                i24 = i6;
                                i25 = 8;
                            }
                        } else {
                            i6 = i24;
                        }
                    }
                    androidx.compose.runtime.changelist.b bVar = this.M;
                    int i34 = bVar.f;
                    r rVar = bVar.a;
                    bVar.f = (i21 - rVar.G.g) + i34;
                    this.G.r(i21);
                    if (i6 > 0) {
                        bVar.d(false);
                        o0 o0Var2 = bVar.d;
                        e2 e2Var3 = rVar.G;
                        if (e2Var3.c > 0 && o0Var2.a(-2) != (i7 = e2Var3.i)) {
                            if (!bVar.c && bVar.e) {
                                bVar.d(false);
                                bVar.b.l.J(androidx.compose.runtime.changelist.q.c);
                                bVar.c = true;
                            }
                            if (i7 > 0) {
                                a aVarA = e2Var3.a(i7);
                                o0Var2.c(i7);
                                bVar.d(false);
                                androidx.compose.runtime.changelist.l0 l0Var5 = bVar.b.l;
                                l0Var5.J(androidx.compose.runtime.changelist.p.c);
                                androidx.room.r.v(l0Var5, 0, aVarA);
                                bVar.c = true;
                            }
                        }
                        androidx.compose.runtime.changelist.l0 l0Var6 = bVar.b.l;
                        l0Var6.J(androidx.compose.runtime.changelist.u.c);
                        l0Var6.n[l0Var6.o - l0Var6.l[l0Var6.m - 1].a] = i6;
                    }
                    a0(obj2, z);
                    m1Var2 = null;
                }
            } else {
                m1Var2 = null;
            }
            x(z, m1Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        j = 0;
        this.T = jRotateLeft ^ j;
        if (obj4 == null) {
            this.m++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.S) {
            this.G.k++;
            i2Var2 = this.I;
            i14 = i2Var2.t;
            if (z) {
                i2Var2.Q(i, obj5, obj5, true);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                i2Var2.Q(i, obj4, obj2, false);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                i2Var2.Q(i, obj4, obj5, false);
            }
            m1Var3 = this.j;
            if (m1Var3 != null) {
                int i110 = (-2) - i14;
                s0 s0Var4 = new s0(i, i110, -1, -1);
                m1Var3.e.h(i110, new l0(-1, this.k - m1Var3.b, 0));
                m1Var3.d.add(s0Var4);
            }
            x(z, null);
            return;
        }
        if (i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.j == null) {
            int iG2 = this.G.g();
            if (!z2) {
                e2Var2 = this.G;
                i13 = e2Var2.g;
                if (i13 < e2Var2.h) {
                    objP = e2Var2.p(i13, e2Var2.b);
                } else {
                    objP = null;
                }
                if (kotlin.jvm.internal.l.a(obj4, objP)) {
                    a0(obj2, z);
                    z3 = z2;
                }
            }
            e2Var = this.G;
            iArr = e2Var.b;
            arrayList2 = new ArrayList();
            if (e2Var.k <= 0) {
                i10 = e2Var.g;
                while (i10 < e2Var.h) {
                    int i111 = i10 * 5;
                    int i112 = iArr[i111];
                    Object objP3 = e2Var.p(i10, iArr);
                    i11 = iArr[i111 + 1];
                    if ((i11 & 1073741824) != 0) {
                        i12 = 1;
                    } else {
                        i12 = i11 & 67108863;
                    }
                    arrayList2.add(new s0(i112, i10, i12, objP3));
                    i10 += iArr[i111 + 3];
                    z2 = z2;
                }
            }
            z3 = z2;
            this.j = new m1(this.k, arrayList2);
        } else {
            z3 = z2;
        }
        m1Var = this.j;
        if (m1Var != null) {
            arrayList = m1Var.d;
            zVar = m1Var.e;
            i3 = m1Var.b;
            if (obj4 != null) {
                objValueOf = new r0(Integer.valueOf(i), obj4);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            o0Var = ((androidx.compose.runtime.collection.a) m1Var.f.getValue()).a;
            objG = o0Var.g(objValueOf);
            if (objG == null) {
                objG = null;
            } else if (objG instanceof androidx.collection.j0) {
                j0Var = (androidx.collection.j0) objG;
                Object objK2 = j0Var.k(0);
                if (j0Var.h()) {
                    o0Var.k(objValueOf);
                }
                if (j0Var.b == 1) {
                    o0Var.m(objValueOf, j0Var.e());
                }
                objG = objK2;
            } else {
                o0Var.k(objValueOf);
            }
            s0 s0Var5 = (s0) objG;
            if (z3) {
            }
            this.G.k++;
            this.S = true;
            this.K = null;
            if (this.I.w) {
                i2 i2VarE2 = this.H.e();
                this.I = i2VarE2;
                i2VarE2.M();
                this.J = false;
                this.K = null;
            }
            this.I.d();
            i2Var = this.I;
            int i113 = i2Var.t;
            if (z) {
                i2Var.Q(i, obj5, obj5, true);
                i4 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i4 = 0;
                i2Var.Q(i, obj5, obj2, false);
            } else {
                i4 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                i2Var.Q(i, obj3, obj5, false);
            }
            this.N = this.I.b(i113);
            int i210 = (-2) - i113;
            s0 s0Var6 = new s0(i, i210, -1, -1);
            zVar.h(i210, new l0(-1, this.k - i3, i4));
            arrayList.add(s0Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.k;
            }
            m1Var2 = new m1(i5, arrayList4);
        } else {
            m1Var2 = null;
        }
        x(z, m1Var2);
    }

    public final void Y() {
        X(-127, null, null, 0);
    }

    public final void Z(int i, b1 b1Var) {
        X(i, b1Var, null, 0);
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        androidx.compose.runtime.changelist.c cVar = this.O;
        cVar.m.F();
        cVar.l.F();
        this.T = 0;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        e2 e2Var = this.G;
        if (!e2Var.f) {
            e2Var.c();
        }
        if (this.I.w) {
            return;
        }
        y();
    }

    public final void a0(Object obj, boolean z) {
        if (z) {
            e2 e2Var = this.G;
            if (e2Var.k <= 0) {
                if ((e2Var.b[(e2Var.g * 5) + 1] & 1073741824) == 0) {
                    n1.a("Expected a node group");
                }
                e2Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            androidx.compose.runtime.changelist.b bVar = this.M;
            bVar.getClass();
            bVar.d(false);
            androidx.compose.runtime.changelist.l0 l0Var = bVar.b.l;
            l0Var.J(androidx.compose.runtime.changelist.f0.c);
            androidx.room.r.v(l0Var, 0, obj);
        }
        this.G.u();
    }

    public final void b(Object obj, kotlin.jvm.functions.p pVar) {
        if (this.S) {
            androidx.compose.runtime.changelist.l0 l0Var = this.O.l;
            l0Var.J(androidx.compose.runtime.changelist.g0.c);
            androidx.room.r.v(l0Var, 0, obj);
            pVar.getClass();
            kotlin.jvm.internal.c0.c(2, pVar);
            androidx.room.r.v(l0Var, 1, pVar);
            return;
        }
        androidx.compose.runtime.changelist.b bVar = this.M;
        bVar.b();
        androidx.compose.runtime.changelist.l0 l0Var2 = bVar.b.l;
        l0Var2.J(androidx.compose.runtime.changelist.g0.c);
        pVar.getClass();
        kotlin.jvm.internal.c0.c(2, pVar);
        androidx.room.r.w(l0Var2, 0, obj, 1, pVar);
    }

    public final void b0(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            X(i, null, null, 0);
            return;
        }
        if (this.r) {
            t.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        e2 e2Var = this.G;
        boolean z = this.S;
        f fVar = m.a;
        if (z) {
            e2Var.k++;
            this.I.Q(i, fVar, fVar, false);
            x(false, null);
            return;
        }
        if (e2Var.g() == i && ((i3 = e2Var.g) >= e2Var.h || (e2Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            e2Var.u();
            x(false, null);
            return;
        }
        if (e2Var.k <= 0 && (i2 = e2Var.g) != e2Var.h) {
            int i4 = this.k;
            N();
            this.M.e(i4, e2Var.s());
            s.c(i2, this.s, e2Var.g);
        }
        e2Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            i2 i2VarE = this.H.e();
            this.I = i2VarE;
            i2VarE.M();
            this.J = false;
            this.K = null;
        }
        i2 i2Var = this.I;
        i2Var.d();
        int i5 = i2Var.t;
        i2Var.Q(i, fVar, fVar, false);
        this.N = i2Var.b(i5);
        x(false, null);
    }

    public final boolean c(float f) {
        Object objI = I();
        if ((objI instanceof Float) && f == ((Number) objI).floatValue()) {
            return false;
        }
        m0(Float.valueOf(f));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    public final r c0(int i) {
        q1 q1Var;
        boolean z;
        b0(i);
        boolean z2 = this.S;
        com.app.mlounge.data.music.e eVar = this.g;
        ArrayList arrayList = this.E;
        y yVar = this.h;
        if (z2) {
            q1 q1Var2 = new q1(yVar);
            arrayList.add(q1Var2);
            m0(q1Var2);
            q1Var2.e = this.B;
            q1Var2.b &= -17;
            eVar.k();
            return this;
        }
        int i2 = this.G.i;
        ArrayList arrayList2 = this.s;
        int iL = s.l(i2, arrayList2);
        p0 p0Var = iL >= 0 ? (p0) arrayList2.remove(iL) : null;
        Object objM = this.G.m();
        if (kotlin.jvm.internal.l.a(objM, m.a)) {
            q1Var = new q1(yVar);
            m0(q1Var);
        } else {
            objM.getClass();
            q1Var = (q1) objM;
        }
        if (p0Var == null) {
            int i3 = q1Var.b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                q1Var.b = i3 & (-65);
            }
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i4 = q1Var.b;
        q1Var.b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(q1Var);
        q1Var.e = this.B;
        q1Var.b &= -17;
        eVar.k();
        int i5 = q1Var.b;
        if ((i5 & LibretroCore.SCREEN_WIDTH) != 0) {
            q1Var.b = (i5 & (-257)) | 512;
            androidx.compose.runtime.changelist.l0 l0Var = this.M.b.l;
            l0Var.J(androidx.compose.runtime.changelist.d0.c);
            androidx.room.r.v(l0Var, 0, q1Var);
            if (!this.y) {
                int i6 = q1Var.b;
                if ((i6 & 128) != 0) {
                    this.y = true;
                    this.z = this.G.i;
                    q1Var.b = i6 | LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
            }
        }
        return this;
    }

    public final boolean d(int i) {
        Object objI = I();
        if ((objI instanceof Integer) && i == ((Number) objI).intValue()) {
            return false;
        }
        m0(Integer.valueOf(i));
        return true;
    }

    public final void d0(Object obj) {
        if (!this.S && this.G.g() == 207 && !kotlin.jvm.internal.l.a(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        X(207, null, obj, 0);
    }

    public final boolean e(long j) {
        Object objI = I();
        if ((objI instanceof Long) && j == ((Number) objI).longValue()) {
            return false;
        }
        m0(Long.valueOf(j));
        return true;
    }

    public final void e0() {
        X(Token.IF, null, null, 2);
        this.r = true;
    }

    public final boolean f(Object obj) {
        if (kotlin.jvm.internal.l.a(I(), obj)) {
            return false;
        }
        m0(obj);
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f0() {
        this.m = 0;
        this.G = this.c.d();
        X(100, null, null, 0);
        v vVar = this.b;
        vVar.t();
        androidx.compose.runtime.internal.j jVarI = vVar.i();
        this.x.c(this.w ? 1 : 0);
        this.w = f(jVarI);
        this.K = null;
        if (!this.q) {
            this.q = vVar.e();
        }
        if (!this.C) {
            this.C = vVar.f();
        }
        if (this.C) {
            u2 u2Var = androidx.compose.runtime.tooling.e.a;
            u2Var.getClass();
            jVarI = jVarI.b(u2Var, new v2(D()));
        }
        this.u = jVarI;
        Set set = (Set) s.s(jVarI, androidx.compose.runtime.tooling.g.a);
        if (set != null) {
            set.add(z());
            vVar.o(set);
        }
        X(Long.hashCode(vVar.g()), null, null, 0);
    }

    public final boolean g(boolean z) {
        Object objI = I();
        if ((objI instanceof Boolean) && z == ((Boolean) objI).booleanValue()) {
            return false;
        }
        m0(Boolean.valueOf(z));
        return true;
    }

    public final boolean g0(q1 q1Var, Object obj) {
        a aVar = q1Var.c;
        if (aVar == null) {
            return false;
        }
        int iB = this.G.a.b(aVar);
        if (!this.F || iB < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iL = s.l(iB, arrayList);
        if (iL < 0) {
            int i = -(iL + 1);
            if (!(obj instanceof e0)) {
                obj = null;
            }
            arrayList.add(i, new p0(q1Var, iB, obj));
            return true;
        }
        p0 p0Var = (p0) arrayList.get(iL);
        if (!(obj instanceof e0)) {
            p0Var.c = null;
            return true;
        }
        Object obj2 = p0Var.c;
        if (obj2 == null) {
            p0Var.c = obj;
            return true;
        }
        if (obj2 instanceof androidx.collection.p0) {
            ((androidx.collection.p0) obj2).a(obj);
            return true;
        }
        androidx.collection.p0 p0Var2 = androidx.collection.x0.a;
        androidx.collection.p0 p0Var3 = new androidx.collection.p0(2);
        p0Var3.k(obj2);
        p0Var3.k(obj);
        p0Var.c = p0Var3;
        return true;
    }

    public final boolean h(Object obj) {
        if (I() == obj) {
            return false;
        }
        m0(obj);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0086 A[LOOP:1: B:17:0x003a->B:32:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0089 A[EDGE_INSN: B:40:0x0089->B:33:0x0089 BREAK  A[LOOP:1: B:17:0x003a->B:32:0x0086], SYNTHETIC] */
    public final void h0(androidx.collection.o0 o0Var) {
        ArrayList arrayList = this.s;
        for (int iK = com.google.common.base.c.k(arrayList); -1 < iK; iK--) {
            p0 p0Var = (p0) arrayList.get(iK);
            a aVar = p0Var.a.c;
            if (aVar == null || !aVar.a()) {
                arrayList.remove(iK);
            } else {
                int i = p0Var.b;
                int i2 = aVar.a;
                if (i != i2) {
                    p0Var.b = i2;
                }
            }
        }
        Object[] objArr = o0Var.b;
        Object[] objArr2 = o0Var.c;
        long[] jArr = o0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            q1 q1Var = (q1) obj;
                            a aVar2 = q1Var.c;
                            if (aVar2 != null) {
                                int i7 = aVar2.a;
                                if (obj2 == f.C) {
                                    obj2 = null;
                                }
                                arrayList.add(new p0(q1Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        kotlin.collections.r.B(s.a, arrayList);
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        androidx.compose.runtime.changelist.b bVar = this.M;
        bVar.c = false;
        bVar.d.b = 0;
        bVar.f = 0;
        bVar.e = true;
        bVar.g = 0;
        bVar.h.clear();
        bVar.i = -1;
        bVar.j = -1;
        bVar.k = -1;
        bVar.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final void i0(int i, int i2) {
        if (n0(i) != i2) {
            if (i < 0) {
                androidx.collection.x xVar = this.p;
                if (xVar == null) {
                    xVar = new androidx.collection.x();
                    this.p = xVar;
                }
                xVar.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final Object j(p1 p1Var) {
        return s.s(l(), p1Var);
    }

    public final void j0(int i, int i2) {
        int iN0 = n0(i);
        if (iN0 != i2) {
            int i3 = i2 - iN0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iN1 = n0(i) + i3;
                i0(i, iN1);
                for (int i4 = size; -1 < i4; i4--) {
                    m1 m1Var = (m1) arrayList.get(i4);
                    if (m1Var != null && m1Var.a(i, iN1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                e2 e2Var = this.G;
                if (i < 0) {
                    i = e2Var.i;
                } else if (e2Var.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final void k(kotlin.jvm.functions.a aVar) {
        if (!this.r) {
            t.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            t.a("createNode() can only be called when inserting");
        }
        o0 o0Var = this.n;
        int i = o0Var.a[o0Var.b - 1];
        i2 i2Var = this.I;
        a aVarB = i2Var.b(i2Var.v);
        this.l++;
        androidx.compose.runtime.changelist.c cVar = this.O;
        androidx.compose.runtime.changelist.l0 l0Var = cVar.l;
        l0Var.J(androidx.compose.runtime.changelist.r.d);
        androidx.room.r.v(l0Var, 0, aVar);
        l0Var.n[l0Var.o - l0Var.l[l0Var.m - 1].a] = i;
        androidx.room.r.v(l0Var, 1, aVarB);
        androidx.compose.runtime.changelist.l0 l0Var2 = cVar.m;
        l0Var2.J(androidx.compose.runtime.changelist.r.e);
        l0Var2.n[l0Var2.o - l0Var2.l[l0Var2.m - 1].a] = i;
        androidx.room.r.v(l0Var2, 0, aVarB);
    }

    public final androidx.compose.runtime.internal.j k0(androidx.compose.runtime.internal.j jVar, androidx.compose.runtime.internal.j jVar2) {
        jVar.getClass();
        androidx.compose.runtime.internal.i iVar = new androidx.compose.runtime.internal.i(jVar);
        iVar.putAll(jVar2);
        androidx.compose.runtime.internal.j jVarA = iVar.a();
        Z(204, t.d);
        I();
        m0(jVarA);
        I();
        m0(jVar2);
        p(false);
        return jVarA;
    }

    public final androidx.compose.runtime.internal.j l() {
        androidx.compose.runtime.internal.j jVar;
        androidx.compose.runtime.internal.j jVar2 = this.K;
        if (jVar2 != null) {
            return jVar2;
        }
        int iQ = this.G.i;
        boolean z = this.S;
        b1 b1Var = t.c;
        if (z && this.J) {
            int iE = this.I.v;
            while (iE > 0) {
                if (this.I.s(iE) == 202 && kotlin.jvm.internal.l.a(this.I.t(iE), b1Var)) {
                    Object objQ = this.I.q(iE);
                    objQ.getClass();
                    androidx.compose.runtime.internal.j jVar3 = (androidx.compose.runtime.internal.j) objQ;
                    this.K = jVar3;
                    return jVar3;
                }
                i2 i2Var = this.I;
                iE = i2Var.E(iE, i2Var.b);
            }
        }
        if (this.G.c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    e2 e2Var = this.G;
                    if (kotlin.jvm.internal.l.a(e2Var.p(iQ, e2Var.b), b1Var)) {
                        androidx.collection.z zVar = this.v;
                        if (zVar == null || (jVar = (androidx.compose.runtime.internal.j) zVar.b(iQ)) == null) {
                            e2 e2Var2 = this.G;
                            Object objB = e2Var2.b(iQ, e2Var2.b);
                            objB.getClass();
                            jVar = (androidx.compose.runtime.internal.j) objB;
                        }
                        this.K = jVar;
                        return jVar;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        androidx.compose.runtime.internal.j jVar4 = this.u;
        this.K = jVar4;
        return jVar4;
    }

    public final void l0(Object obj) {
        if (obj instanceof z1) {
            a2 a2Var = new a2((z1) obj, this.m - 1);
            if (this.S) {
                androidx.compose.runtime.changelist.l0 l0Var = this.M.b.l;
                l0Var.J(androidx.compose.runtime.changelist.w.c);
                androidx.room.r.v(l0Var, 0, a2Var);
            }
            this.d.add(obj);
            obj = a2Var;
        }
        m0(obj);
    }

    public final androidx.compose.runtime.tooling.a m() {
        Collection collection;
        if (!this.b.k()) {
            return null;
        }
        kotlin.collections.builders.b bVarH = com.google.common.base.c.h();
        i2 i2Var = this.I;
        bVarH.addAll(kotlin.math.a.k(i2Var, null, i2Var.t, null));
        e2 e2Var = this.G;
        boolean z = e2Var.f;
        int[] iArr = e2Var.b;
        if (z || e2Var.c == 0) {
            collection = kotlin.collections.u.e;
        } else {
            androidx.compose.runtime.tooling.j jVar = new androidx.compose.runtime.tooling.j(e2Var);
            int iQ = e2Var.i;
            Object objValueOf = Integer.valueOf(e2Var.l - h2.b(iQ, iArr));
            while (iQ >= 0) {
                jVar.r(e2Var.i(iQ), e2Var.k(iQ) ? e2Var.p(iQ, iArr) : m.a, e2Var.a.h(iQ), objValueOf);
                objValueOf = e2Var.a(iQ);
                iQ = e2Var.q(iQ);
            }
            collection = (ArrayList) jVar.e;
        }
        bVarH.addAll(collection);
        bVarH.addAll(J());
        return new androidx.compose.runtime.tooling.a(com.google.common.base.c.c(bVarH));
    }

    public final void m0(Object obj) {
        if (this.S) {
            i2 i2Var = this.I;
            if (i2Var.n <= 0 || i2Var.i == i2Var.k) {
                i2Var.F(obj);
                return;
            }
            androidx.collection.z zVar = i2Var.s;
            if (zVar == null) {
                zVar = new androidx.collection.z();
            }
            i2Var.s = zVar;
            int i = i2Var.v;
            Object objB = zVar.b(i);
            if (objB == null) {
                objB = new androidx.collection.j0();
                zVar.h(i, objB);
            }
            ((androidx.collection.j0) objB).a(obj);
            return;
        }
        e2 e2Var = this.G;
        boolean z = e2Var.n;
        androidx.compose.runtime.changelist.b bVar = this.M;
        if (!z) {
            a aVarA = e2Var.a(e2Var.i);
            androidx.compose.runtime.changelist.l0 l0Var = bVar.b.l;
            l0Var.J(androidx.compose.runtime.changelist.e.c);
            androidx.room.r.w(l0Var, 0, aVarA, 1, obj);
            return;
        }
        int iB = (e2Var.l - h2.b(e2Var.i, e2Var.b)) - 1;
        if (bVar.a.G.i - bVar.f >= 0) {
            bVar.d(true);
            androidx.compose.runtime.changelist.l0 l0Var2 = bVar.b.l;
            l0Var2.J(androidx.compose.runtime.changelist.r.g);
            androidx.room.r.v(l0Var2, 0, obj);
            l0Var2.n[l0Var2.o - l0Var2.l[l0Var2.m - 1].a] = iB;
            return;
        }
        e2 e2Var2 = this.G;
        a aVarA2 = e2Var2.a(e2Var2.i);
        androidx.compose.runtime.changelist.l0 l0Var3 = bVar.b.l;
        l0Var3.J(androidx.compose.runtime.changelist.r.f);
        androidx.room.r.w(l0Var3, 0, obj, 1, aVarA2);
        l0Var3.n[l0Var3.o - l0Var3.l[l0Var3.m - 1].a] = iB;
    }

    public final void n(androidx.collection.o0 o0Var, kotlin.jvm.functions.p pVar) {
        ArrayList arrayList = this.s;
        if (this.F) {
            t.a("Reentrant composition is not supported");
        }
        this.g.k();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(androidx.compose.runtime.snapshots.n.j().g());
            this.v = null;
            h0(o0Var);
            this.k = 0;
            this.F = true;
            try {
                f0();
                Object objI = I();
                if (objI != pVar && pVar != null) {
                    m0(pVar);
                }
                q qVar = this.D;
                androidx.compose.runtime.collection.b bVarI = s.i();
                try {
                    bVarI.b(qVar);
                    b1 b1Var = t.a;
                    if (pVar != null) {
                        Z(Context.VERSION_ES6, b1Var);
                        kotlin.jvm.internal.c0.c(2, pVar);
                        pVar.invoke(this, 1);
                        p(false);
                    } else if (!this.w || objI == null || objI.equals(m.a)) {
                        U();
                    } else {
                        Z(Context.VERSION_ES6, b1Var);
                        kotlin.jvm.internal.c0.c(2, objI);
                        kotlin.jvm.functions.p pVar2 = (kotlin.jvm.functions.p) objI;
                        kotlin.jvm.internal.c0.c(2, pVar2);
                        pVar2.invoke(this, 1);
                        p(false);
                    }
                    bVarI.k(bVarI.z - 1);
                    v();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        t.a("Check failed");
                    }
                    y();
                    Trace.endSection();
                } catch (Throwable th) {
                    bVarI.k(bVarI.z - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    okhttp3.internal.platform.android.g.L(th2, new n(1, this));
                    throw th2;
                } catch (Throwable th3) {
                    this.F = false;
                    arrayList.clear();
                    a();
                    if (!this.I.w) {
                        t.a("Check failed");
                    }
                    y();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final int n0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        androidx.collection.x xVar = this.p;
        if (xVar == null || xVar.c(i) < 0) {
            return 0;
        }
        int iC = xVar.c(i);
        if (iC >= 0) {
            return xVar.c[iC];
        }
        androidx.transition.k.m(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Cannot find value for key "));
        return 0;
    }

    public final void o(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        o(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            androidx.compose.runtime.changelist.b bVar = this.M;
            bVar.c();
            bVar.h.add(objN);
        }
    }

    public final void o0() {
        if (!this.r) {
            t.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            t.a("useNode() called while inserting");
        }
        e2 e2Var = this.G;
        Object objN = e2Var.n(e2Var.i);
        androidx.compose.runtime.changelist.b bVar = this.M;
        bVar.c();
        bVar.h.add(objN);
        if (this.y && (objN instanceof i)) {
            bVar.b();
            bVar.b.l.J(androidx.compose.runtime.changelist.i0.c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:201:0x0516  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    public final void p(boolean z) {
        long jRotateRight;
        o0 o0Var;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        o0 o0Var2;
        int i7;
        LinkedHashSet linkedHashSet;
        int i8;
        int i9;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i10;
        int i11;
        Object[] objArr;
        long[] jArr;
        int i12;
        Object[] objArr2;
        long[] jArr2;
        int i13;
        Object[] objArr3;
        long[] jArr3;
        int i14;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        o0 o0Var3 = this.n;
        int i15 = o0Var3.a[o0Var3.b - 2] - 1;
        boolean z2 = this.S;
        f fVar = m.a;
        if (z2) {
            i2 i2Var = this.I;
            int i16 = i2Var.v;
            int iS = i2Var.s(i16);
            Object objT = this.I.t(i16);
            Object objQ = this.I.q(i16);
            if (objT != null) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) (objT instanceof Enum ? ((Enum) objT).ordinal() : objT.hashCode()));
            } else if (objQ == null || iS != 207 || objQ.equals(fVar)) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) iS);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objQ.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight2, 3);
        } else {
            e2 e2Var = this.G;
            int i17 = e2Var.i;
            int i18 = e2Var.i(i17);
            e2 e2Var2 = this.G;
            Object objP = e2Var2.p(i17, e2Var2.b);
            e2 e2Var3 = this.G;
            Object objB = e2Var3.b(i17, e2Var3.b);
            if (objP != null) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode()));
            } else if (objB == null || i18 != 207 || objB.equals(fVar)) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) i18);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight, 3);
        }
        int i19 = this.l;
        m1 m1Var = this.j;
        ArrayList arrayList4 = this.s;
        androidx.compose.runtime.changelist.b bVar = this.M;
        if (m1Var != null) {
            androidx.collection.z zVar = m1Var.e;
            int i20 = m1Var.b;
            ArrayList arrayList5 = m1Var.a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = m1Var.d;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i21 = 0; i21 < size; i21++) {
                    hashSet2.add(arrayList6.get(i21));
                }
                i = -1;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (i22 < size3) {
                    s0 s0Var = (s0) arrayList5.get(i22);
                    if (hashSet2.contains(s0Var)) {
                        o0Var2 = o0Var3;
                        i7 = i22;
                        if (!linkedHashSet2.contains(s0Var)) {
                            int i25 = i23;
                            if (i25 < size2) {
                                s0 s0Var2 = (s0) arrayList6.get(i25);
                                if (s0Var2 != s0Var) {
                                    l0 l0Var = (l0) zVar.b(s0Var2.c);
                                    int i26 = l0Var != null ? l0Var.b : -1;
                                    linkedHashSet2.add(s0Var2);
                                    i10 = i24;
                                    if (i26 != i10) {
                                        l0 l0Var2 = (l0) zVar.b(s0Var2.c);
                                        int i27 = l0Var2 != null ? l0Var2.c : s0Var2.d;
                                        linkedHashSet = linkedHashSet2;
                                        int i28 = i26 + i20;
                                        i8 = size2;
                                        int i29 = i10 + i20;
                                        if (i27 > 0) {
                                            i9 = i20;
                                            int i30 = bVar.l;
                                            if (i30 > 0) {
                                                arrayList2 = arrayList5;
                                                if (bVar.j == i28 - i30 && bVar.k == i29 - i30) {
                                                    bVar.l = i30 + i27;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            bVar.c();
                                            bVar.j = i28;
                                            bVar.k = i29;
                                            bVar.l = i27;
                                        } else {
                                            i9 = i20;
                                            arrayList2 = arrayList5;
                                            bVar.getClass();
                                        }
                                        if (i26 <= i10) {
                                            int i31 = i27;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i10 > i26) {
                                                Object[] objArr5 = zVar.c;
                                                long[] jArr5 = zVar.a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i32 = 0;
                                                    while (true) {
                                                        long j = jArr5[i32];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i33 = 8 - ((~(i32 - length)) >>> 31);
                                                            int i34 = 0;
                                                            while (i34 < i33) {
                                                                if ((j & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    l0 l0Var3 = (l0) objArr5[(i32 << 3) + i34];
                                                                    jArr2 = jArr5;
                                                                    int i35 = l0Var3.b;
                                                                    i13 = i26;
                                                                    if (i26 <= i35 && i35 < i13 + i31) {
                                                                        l0Var3.b = (i35 - i13) + i10;
                                                                    } else if (i13 + 1 <= i35 && i35 < i10) {
                                                                        l0Var3.b = i35 - i31;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i13 = i26;
                                                                }
                                                                j >>= 8;
                                                                i34++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i26 = i13;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i26;
                                                            if (i33 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i26;
                                                        }
                                                        if (i32 == length) {
                                                            break;
                                                        }
                                                        i32++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i26 = i12;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = zVar.c;
                                            long[] jArr6 = zVar.a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i36 = 0;
                                                while (true) {
                                                    long j2 = jArr6[i36];
                                                    int i37 = i27;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i38 = 8 - ((~(i36 - length2)) >>> 31);
                                                        int i39 = 0;
                                                        while (i39 < i38) {
                                                            if ((j2 & 255) < 128) {
                                                                i14 = i39;
                                                                l0 l0Var4 = (l0) objArr6[(i36 << 3) + i39];
                                                                objArr4 = objArr6;
                                                                int i40 = l0Var4.b;
                                                                jArr4 = jArr6;
                                                                if (i26 <= i40 && i40 < i26 + i37) {
                                                                    l0Var4.b = (i40 - i26) + i10;
                                                                } else if (i10 <= i40 && i40 < i26) {
                                                                    l0Var4.b = i40 + i37;
                                                                }
                                                            } else {
                                                                i14 = i39;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j2 >>= 8;
                                                            i39 = i14 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i38 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i36 == length2) {
                                                        break;
                                                    }
                                                    i36++;
                                                    arrayList4 = arrayList4;
                                                    i27 = i37;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i11 = i7;
                                    } else {
                                        linkedHashSet = linkedHashSet2;
                                        i8 = size2;
                                        i9 = i20;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i11 = i7;
                                } else {
                                    arrayList4 = arrayList4;
                                    linkedHashSet = linkedHashSet2;
                                    i8 = size2;
                                    i9 = i20;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i10 = i24;
                                    i11 = i7 + 1;
                                }
                                i23 = i25 + 1;
                                l0 l0Var5 = (l0) zVar.b(s0Var2.c);
                                int i41 = i10 + (l0Var5 != null ? l0Var5.c : s0Var2.d);
                                i22 = i11;
                                m1Var = m1Var;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i8;
                                i20 = i9;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i24 = i41;
                                o0Var3 = o0Var2;
                            } else {
                                i23 = i25;
                                o0Var3 = o0Var2;
                                i22 = i7;
                            }
                        }
                    } else {
                        o0Var2 = o0Var3;
                        l0 l0Var6 = (l0) zVar.b(s0Var.c);
                        int i42 = l0Var6 != null ? l0Var6.b : -1;
                        int i43 = s0Var.c;
                        i7 = i22;
                        bVar.e(i42 + i20, s0Var.d);
                        m1Var.a(i43, 0);
                        bVar.f = (i43 - bVar.a.G.g) + bVar.f;
                        this.G.r(i43);
                        N();
                        this.G.s();
                        s.c(i43, arrayList4, this.G.b[(i43 * 5) + 3] + i43);
                    }
                    i22 = i7 + 1;
                    o0Var3 = o0Var2;
                }
                o0Var = o0Var3;
                arrayList = arrayList4;
                bVar.c();
                if (arrayList5.size() > 0) {
                    e2 e2Var4 = this.G;
                    bVar.f = (e2Var4.h - bVar.a.G.g) + bVar.f;
                    e2Var4.t();
                }
            } else {
                o0Var = o0Var3;
                arrayList = arrayList4;
                i = -1;
            }
        } else {
            o0Var = o0Var3;
            arrayList = arrayList4;
            i = -1;
        }
        boolean z3 = this.S;
        if (!z3) {
            e2 e2Var5 = this.G;
            int i44 = e2Var5.m - e2Var5.l;
            if (i44 > 0) {
                if (i44 > 0) {
                    bVar.d(false);
                    o0 o0Var4 = bVar.d;
                    e2 e2Var6 = bVar.a.G;
                    if (e2Var6.c > 0 && o0Var4.a(-2) != (i6 = e2Var6.i)) {
                        if (!bVar.c && bVar.e) {
                            bVar.d(false);
                            bVar.b.l.J(androidx.compose.runtime.changelist.q.c);
                            bVar.c = true;
                        }
                        if (i6 > 0) {
                            a aVarA = e2Var6.a(i6);
                            o0Var4.c(i6);
                            bVar.d(false);
                            androidx.compose.runtime.changelist.l0 l0Var7 = bVar.b.l;
                            l0Var7.J(androidx.compose.runtime.changelist.p.c);
                            androidx.room.r.v(l0Var7, 0, aVarA);
                            bVar.c = true;
                        }
                    }
                    androidx.compose.runtime.changelist.l0 l0Var8 = bVar.b.l;
                    l0Var8.J(androidx.compose.runtime.changelist.e0.c);
                    l0Var8.n[l0Var8.o - l0Var8.l[l0Var8.m - 1].a] = i44;
                } else {
                    bVar.getClass();
                }
            }
        }
        int i45 = this.k;
        while (true) {
            e2 e2Var7 = this.G;
            if (e2Var7.k > 0 || (i5 = e2Var7.g) == e2Var7.h) {
                break;
            }
            N();
            bVar.e(i45, this.G.s());
            s.c(i5, arrayList, this.G.g);
        }
        if (z3) {
            if (z) {
                androidx.compose.runtime.changelist.c cVar = this.O;
                androidx.compose.runtime.changelist.l0 l0Var9 = cVar.m;
                if (!l0Var9.I()) {
                    t.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                androidx.compose.runtime.changelist.l0 l0Var10 = cVar.l;
                androidx.compose.runtime.changelist.j0[] j0VarArr = l0Var9.l;
                int i46 = l0Var9.m - 1;
                l0Var9.m = i46;
                androidx.compose.runtime.changelist.j0 j0Var = j0VarArr[i46];
                j0VarArr[i46] = null;
                l0Var10.J(j0Var);
                Object[] objArr7 = l0Var9.p;
                Object[] objArr8 = l0Var10.p;
                int i47 = l0Var10.q;
                int i48 = j0Var.b;
                int i49 = l0Var9.q;
                int i50 = i49 - i48;
                System.arraycopy(objArr7, i50, objArr8, i47 - i48, i49 - i50);
                Object[] objArr9 = l0Var9.p;
                int i51 = l0Var9.q;
                Arrays.fill(objArr9, i51 - i48, i51, (Object) null);
                int[] iArr = l0Var9.n;
                int[] iArr2 = l0Var10.n;
                int i52 = l0Var10.o;
                int i53 = j0Var.a;
                int i54 = l0Var9.o;
                kotlin.collections.n.C(i52 - i53, i54 - i53, i54, iArr, iArr2);
                l0Var9.q -= i48;
                l0Var9.o -= i53;
                i19 = 1;
            }
            e2 e2Var8 = this.G;
            if (e2Var8.k <= 0) {
                n1.a("Unbalanced begin/end empty");
            }
            e2Var8.k--;
            i2 i2Var2 = this.I;
            int i55 = i2Var2.v;
            i2Var2.j();
            if (this.G.k <= 0) {
                int i56 = (-2) - i55;
                this.I.k();
                this.I.e(true);
                a aVar = this.N;
                boolean zH = this.O.l.H();
                f2 f2Var = this.H;
                if (zH) {
                    bVar.b();
                    bVar.d(false);
                    o0 o0Var5 = bVar.d;
                    e2 e2Var9 = bVar.a.G;
                    if (e2Var9.c <= 0 || o0Var5.a(-2) == (i4 = e2Var9.i)) {
                        i3 = 1;
                    } else {
                        if (!bVar.c && bVar.e) {
                            bVar.d(false);
                            bVar.b.l.J(androidx.compose.runtime.changelist.q.c);
                            bVar.c = true;
                        }
                        if (i4 > 0) {
                            a aVarA2 = e2Var9.a(i4);
                            o0Var5.c(i4);
                            bVar.d(false);
                            androidx.compose.runtime.changelist.l0 l0Var11 = bVar.b.l;
                            l0Var11.J(androidx.compose.runtime.changelist.p.c);
                            androidx.room.r.v(l0Var11, 0, aVarA2);
                            i3 = 1;
                            bVar.c = true;
                        } else {
                            i3 = 1;
                        }
                    }
                    bVar.c();
                    androidx.compose.runtime.changelist.l0 l0Var12 = bVar.b.l;
                    l0Var12.J(androidx.compose.runtime.changelist.s.c);
                    androidx.room.r.w(l0Var12, 0, aVar, i3, f2Var);
                    r3 = 0;
                } else {
                    androidx.compose.runtime.changelist.c cVar2 = this.O;
                    bVar.b();
                    bVar.d(false);
                    o0 o0Var6 = bVar.d;
                    e2 e2Var10 = bVar.a.G;
                    if (e2Var10.c > 0 && o0Var6.a(-2) != (i2 = e2Var10.i)) {
                        if (!bVar.c && bVar.e) {
                            bVar.d(false);
                            bVar.b.l.J(androidx.compose.runtime.changelist.q.c);
                            bVar.c = true;
                        }
                        if (i2 > 0) {
                            a aVarA3 = e2Var10.a(i2);
                            o0Var6.c(i2);
                            bVar.d(false);
                            androidx.compose.runtime.changelist.l0 l0Var13 = bVar.b.l;
                            l0Var13.J(androidx.compose.runtime.changelist.p.c);
                            androidx.room.r.v(l0Var13, 0, aVarA3);
                            bVar.c = true;
                        }
                    }
                    bVar.c();
                    androidx.compose.runtime.changelist.l0 l0Var14 = bVar.b.l;
                    l0Var14.J(androidx.compose.runtime.changelist.t.c);
                    int i57 = l0Var14.q - l0Var14.l[l0Var14.m - 1].b;
                    Object[] objArr10 = l0Var14.p;
                    objArr10[i57] = aVar;
                    objArr10[i57 + 1] = f2Var;
                    objArr10[i57 + 2] = cVar2;
                    this.O = new androidx.compose.runtime.changelist.c();
                    r3 = 0;
                }
                this.S = r3;
                if (this.c.y != 0) {
                    i0(i56, r3);
                    j0(i56, i19);
                }
            }
        } else {
            if (z) {
                bVar.a();
            }
            int i58 = bVar.a.G.i;
            o0 o0Var7 = bVar.d;
            int i59 = i;
            if (o0Var7.a(i59) > i58) {
                t.a("Missed recording an endGroup");
            }
            if (o0Var7.a(i59) == i58) {
                bVar.d(false);
                o0Var7.b();
                bVar.b.l.J(androidx.compose.runtime.changelist.m.c);
            }
            int i60 = this.G.i;
            if (i19 != n0(i60)) {
                j0(i60, i19);
            }
            if (z) {
                i19 = 1;
            }
            this.G.e();
            bVar.c();
        }
        ArrayList arrayList7 = this.i;
        m1 m1Var2 = (m1) arrayList7.remove(arrayList7.size() - 1);
        if (m1Var2 != null && !z3) {
            m1Var2.c++;
        }
        this.j = m1Var2;
        this.k = o0Var.b() + i19;
        this.m = o0Var.b();
        this.l = o0Var.b() + i19;
    }

    public final void q() {
        p(false);
        q1 q1VarB = B();
        if (q1VarB != null) {
            int i = q1VarB.b;
            if ((i & 1) != 0) {
                q1VarB.b = i | 2;
            }
        }
    }

    public final void r() {
        p(true);
    }

    public final void s() {
        p(false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0080 A[LOOP:0: B:15:0x003e->B:27:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[EDGE_INSN: B:28:0x0083->B:29:0x0084 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x0080]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:62:0x0083 A[SYNTHETIC] */
    public final q1 t() {
        q1 q1Var;
        a aVarA;
        androidx.compose.foundation.w1 w1Var;
        ArrayList arrayList = this.E;
        q1 q1Var2 = !arrayList.isEmpty() ? (q1) arrayList.remove(arrayList.size() - 1) : null;
        if (q1Var2 != null) {
            q1Var2.b &= -9;
            this.g.k();
            int i = this.B;
            androidx.collection.f0 f0Var = q1Var2.f;
            if (f0Var == null || (q1Var2.b & 16) != 0) {
                w1Var = null;
                break;
            }
            Object[] objArr = f0Var.b;
            int[] iArr = f0Var.c;
            long[] jArr = f0Var.a;
            int length = jArr.length - 2;
            if (length < 0) {
                w1Var = null;
                break;
            }
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            if (iArr[i5] != i) {
                                w1Var = new androidx.compose.foundation.w1(q1Var2, i, f0Var, 2);
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 == 8) {
                        if (i2 == length) {
                            i2++;
                        }
                    }
                    w1Var = null;
                    break;
                }
                if (i2 == length) {
                    w1Var = null;
                    break;
                }
                i2++;
            }
            androidx.compose.runtime.changelist.b bVar = this.M;
            if (w1Var != null) {
                androidx.compose.runtime.changelist.l0 l0Var = bVar.b.l;
                l0Var.J(androidx.compose.runtime.changelist.l.c);
                androidx.room.r.w(l0Var, 0, w1Var, 1, this.h);
            }
            int i6 = q1Var2.b;
            if ((i6 & 512) != 0) {
                q1Var2.b = i6 & (-513);
                androidx.compose.runtime.changelist.l0 l0Var2 = bVar.b.l;
                l0Var2.J(androidx.compose.runtime.changelist.o.c);
                androidx.room.r.v(l0Var2, 0, q1Var2);
                int i7 = q1Var2.b;
                q1Var2.b = i7 & (-129);
                if ((i7 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    q1Var2.b = i7 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (q1Var2 != null) {
            int i8 = q1Var2.b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.q)) {
                if (q1Var2.c == null) {
                    if (this.S) {
                        i2 i2Var = this.I;
                        aVarA = i2Var.b(i2Var.v);
                    } else {
                        e2 e2Var = this.G;
                        aVarA = e2Var.a(e2Var.i);
                    }
                    q1Var2.c = aVarA;
                }
                q1Var2.b &= -5;
                q1Var = q1Var2;
            } else {
                q1Var = null;
            }
        } else {
            q1Var = null;
        }
        p(false);
        return q1Var;
    }

    public final void u() {
        if (this.F || this.z != 0) {
            n1.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    public final void v() {
        p(false);
        this.b.c();
        p(false);
        androidx.compose.runtime.changelist.b bVar = this.M;
        if (bVar.c) {
            bVar.d(false);
            bVar.d(false);
            bVar.b.l.J(androidx.compose.runtime.changelist.m.c);
            bVar.c = false;
        }
        bVar.b();
        if (bVar.d.b != 0) {
            t.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            t.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    public final void w(int i) {
        if (i < 0) {
            int i2 = -i;
            i2 i2Var = this.I;
            while (true) {
                int i3 = i2Var.v;
                if (i3 <= i2) {
                    return;
                } else {
                    p(i2Var.y(i3));
                }
            }
        } else {
            if (this.S) {
                i2 i2Var2 = this.I;
                while (this.S) {
                    p(i2Var2.y(i2Var2.v));
                }
            }
            e2 e2Var = this.G;
            while (true) {
                int i4 = e2Var.i;
                if (i4 <= i) {
                    return;
                } else {
                    p(e2Var.l(i4));
                }
            }
        }
    }

    public final void x(boolean z, m1 m1Var) {
        this.i.add(this.j);
        this.j = m1Var;
        int i = this.l;
        o0 o0Var = this.n;
        o0Var.c(i);
        o0Var.c(this.m);
        o0Var.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void y() {
        f2 f2Var = new f2();
        if (this.C) {
            f2Var.c();
        }
        if (this.b.d()) {
            f2Var.H = new androidx.collection.z();
        }
        this.H = f2Var;
        i2 i2VarE = f2Var.e();
        i2VarE.e(true);
        this.I = i2VarE;
    }

    public final androidx.compose.runtime.tooling.c z() {
        x xVar = this.U;
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(this.h);
        this.U = xVar2;
        return xVar2;
    }
}
