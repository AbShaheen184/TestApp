package androidx.compose.ui.layout;

import android.os.Handler;
import android.view.ViewGroup;
import androidx.compose.ui.node.a2;
import androidx.compose.ui.platform.h3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements androidx.compose.runtime.i {
    public int A;
    public int B;
    public final androidx.collection.o0 C;
    public final androidx.collection.o0 D;
    public final h0 E;
    public final e0 F;
    public final androidx.collection.o0 G;
    public final androidx.collection.c1 H;
    public final androidx.collection.o0 I;
    public final androidx.compose.runtime.collection.b J;
    public int K;
    public int L;
    public final String M;
    public final androidx.compose.ui.node.f0 e;
    public androidx.compose.runtime.v y;
    public androidx.compose.foundation.text.input.internal.o z;

    public m0(androidx.compose.ui.node.f0 f0Var, androidx.compose.foundation.text.input.internal.o oVar) {
        this.e = f0Var;
        this.z = oVar;
        long[] jArr = androidx.collection.w0.a;
        this.C = new androidx.collection.o0();
        this.D = new androidx.collection.o0();
        this.E = new h0(this);
        this.F = new e0(this);
        this.G = new androidx.collection.o0();
        this.H = new androidx.collection.c1();
        this.I = new androidx.collection.o0();
        this.J = new androidx.compose.runtime.collection.b(new Object[16]);
        this.M = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void d(f0 f0Var) {
        androidx.collection.p0 p0Var;
        androidx.compose.runtime.j1 j1Var = f0Var.f;
        if (j1Var != null) {
            j1Var.h.set(androidx.compose.runtime.k1.y);
            androidx.compose.runtime.internal.l lVar = j1Var.k;
            if (lVar.d.h()) {
                p0Var = lVar.d;
                androidx.collection.p0 p0Var2 = androidx.collection.x0.a;
                lVar.d = new androidx.collection.p0();
                lVar.c.g();
            } else {
                p0Var = null;
            }
            lVar.b();
            androidx.compose.runtime.y yVar = j1Var.a;
            yVar.N = null;
            if (p0Var != null) {
                yVar.R.k = p0Var;
                yVar.T = 2;
            }
            f0Var.f = null;
            androidx.compose.runtime.y yVar2 = f0Var.c;
            if (yVar2 != null) {
                yVar2.m();
            }
            f0Var.c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // androidx.compose.runtime.i
    public final void a() {
        androidx.compose.runtime.y yVar;
        androidx.compose.ui.node.f0 f0Var = this.e;
        f0Var.O = true;
        androidx.collection.o0 o0Var = this.C;
        Object[] objArr = o0Var.c;
        long[] jArr = o0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (yVar = ((f0) objArr[(i << 3) + i3]).c) != null) {
                            yVar.m();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        f0Var.P();
        f0Var.O = false;
        o0Var.a();
        this.D.a();
        this.L = 0;
        this.K = 0;
        this.G.a();
        g();
    }

    @Override // androidx.compose.runtime.i
    public final void b() {
        h(true);
    }

    public final void c(f0 f0Var, boolean z) {
        androidx.compose.runtime.j1 j1Var = f0Var.f;
        if (j1Var != null) {
            androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
            kotlin.jvm.functions.l lVarE = fVarE != null ? fVarE.e() : null;
            androidx.compose.runtime.snapshots.f fVarH = androidx.compose.runtime.snapshots.r.h(fVarE);
            try {
                androidx.compose.ui.node.f0 f0Var2 = this.e;
                f0Var2.O = true;
                if (z) {
                    while (!j1Var.c()) {
                        try {
                            j1Var.e(new androidx.compose.ui.graphics.a(20));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                j1Var.a();
                f0Var.f = null;
                f0Var2.O = false;
                androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
            } catch (Throwable th2) {
                androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
                throw th2;
            }
        }
    }

    public final j1 e(Object obj) {
        return !this.e.H() ? new k0() : new l0(this, obj);
    }

    public final void f(int i) {
        boolean z;
        boolean z2 = false;
        this.K = 0;
        List listO = this.e.o();
        androidx.collection.h0 h0Var = (androidx.collection.h0) listO;
        int i2 = (((androidx.compose.runtime.collection.b) h0Var.y).z - this.L) - 1;
        if (i <= i2) {
            this.H.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objG = this.C.g((androidx.compose.ui.node.f0) h0Var.get(i3));
                    objG.getClass();
                    ((androidx.collection.k0) this.H.y).a(((f0) objG).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            androidx.compose.foundation.text.input.internal.o oVar = this.z;
            androidx.collection.c1 c1Var = this.H;
            androidx.collection.f0 f0Var = (androidx.collection.f0) oVar.z;
            f0Var.a();
            androidx.collection.k0 k0Var = (androidx.collection.k0) c1Var.y;
            Object[] objArr = k0Var.b;
            long[] jArr = k0Var.c;
            int i4 = k0Var.e;
            while (i4 != Integer.MAX_VALUE) {
                int i5 = (int) ((jArr[i4] >> 31) & 2147483647L);
                Object obj = objArr[i4];
                Object objB = ((androidx.compose.foundation.lazy.layout.x) oVar.y).b(obj);
                int iD = f0Var.d(objB);
                int i6 = iD >= 0 ? f0Var.c[iD] : 0;
                if (i6 == 7) {
                    c1Var.remove(obj);
                } else {
                    f0Var.g(i6 + 1, objB);
                }
                i4 = i5;
            }
            androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
            kotlin.jvm.functions.l lVarE = fVarE != null ? fVarE.e() : null;
            androidx.compose.runtime.snapshots.f fVarH = androidx.compose.runtime.snapshots.r.h(fVarE);
            z = false;
            while (i2 >= i) {
                try {
                    androidx.compose.ui.node.f0 f0Var2 = (androidx.compose.ui.node.f0) ((androidx.collection.h0) listO).get(i2);
                    Object objG2 = this.C.g(f0Var2);
                    objG2.getClass();
                    f0 f0Var3 = (f0) objG2;
                    Object obj2 = f0Var3.a;
                    if (((androidx.collection.k0) this.H.y).c(obj2)) {
                        this.K++;
                        if (((Boolean) f0Var3.g.getValue()).booleanValue()) {
                            androidx.compose.ui.node.j0 j0Var = f0Var2.e0;
                            androidx.compose.ui.node.v0 v0Var = j0Var.p;
                            androidx.compose.ui.node.d0 d0Var = androidx.compose.ui.node.d0.z;
                            v0Var.I = d0Var;
                            androidx.compose.ui.node.r0 r0Var = j0Var.q;
                            if (r0Var != null) {
                                r0Var.G = d0Var;
                            }
                            j(f0Var3, false);
                            if (f0Var3.h) {
                                z = true;
                            }
                        }
                    } else {
                        androidx.compose.ui.node.f0 f0Var4 = this.e;
                        f0Var4.O = true;
                        this.C.k(f0Var2);
                        androidx.compose.runtime.y yVar = f0Var3.c;
                        if (yVar != null) {
                            yVar.m();
                        }
                        this.e.Q(i2, 1);
                        f0Var4.O = false;
                    }
                    this.D.k(obj2);
                    i2--;
                } catch (Throwable th) {
                    androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
                    throw th;
                }
            }
            androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
        } else {
            z = false;
        }
        if (z) {
            synchronized (androidx.compose.runtime.snapshots.n.c) {
                androidx.collection.p0 p0Var = androidx.compose.runtime.snapshots.n.j.h;
                if (p0Var != null && p0Var.h()) {
                    z2 = true;
                }
            }
            if (z2) {
                androidx.compose.runtime.snapshots.n.a();
            }
        }
        g();
    }

    public final void g() {
        int i = ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) this.e.o()).y).z;
        androidx.collection.o0 o0Var = this.C;
        if (o0Var.e != i) {
            androidx.compose.ui.internal.a.a("Inconsistency between the count of nodes tracked by the state (" + o0Var.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.K) - this.L < 0) {
            StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("Incorrect state. Total children ", i, ". Reusable children ");
            sbV.append(this.K);
            sbV.append(". Precomposed children ");
            sbV.append(this.L);
            androidx.compose.ui.internal.a.a(sbV.toString());
        }
        androidx.collection.o0 o0Var2 = this.G;
        if (o0Var2.e == this.L) {
            return;
        }
        androidx.compose.ui.internal.a.a("Incorrect state. Precomposed children " + this.L + ". Map size " + o0Var2.e);
    }

    public final void h(boolean z) {
        this.L = 0;
        this.G.a();
        List listO = this.e.o();
        int i = ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) listO).y).z;
        if (this.K != i) {
            this.K = i;
            androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
            kotlin.jvm.functions.l lVarE = fVarE != null ? fVarE.e() : null;
            androidx.compose.runtime.snapshots.f fVarH = androidx.compose.runtime.snapshots.r.h(fVarE);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    androidx.compose.ui.node.f0 f0Var = (androidx.compose.ui.node.f0) ((androidx.collection.h0) listO).get(i2);
                    f0 f0Var2 = (f0) this.C.g(f0Var);
                    if (f0Var2 != null && ((Boolean) f0Var2.g.getValue()).booleanValue()) {
                        androidx.compose.ui.node.j0 j0Var = f0Var.e0;
                        androidx.compose.ui.node.v0 v0Var = j0Var.p;
                        androidx.compose.ui.node.d0 d0Var = androidx.compose.ui.node.d0.z;
                        v0Var.I = d0Var;
                        androidx.compose.ui.node.r0 r0Var = j0Var.q;
                        if (r0Var != null) {
                            r0Var.G = d0Var;
                        }
                        j(f0Var2, z);
                        f0Var2.a = a0.a;
                    }
                } catch (Throwable th) {
                    androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
                    throw th;
                }
            }
            androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
            this.D.a();
        }
        g();
    }

    public final void i(int i, int i2) {
        androidx.compose.ui.node.f0 f0Var = this.e;
        f0Var.O = true;
        f0Var.L(i, i2, 1);
        f0Var.O = false;
    }

    public final void j(f0 f0Var, boolean z) {
        androidx.compose.runtime.y yVar;
        if (z || !f0Var.h) {
            f0Var.g = androidx.compose.runtime.s.r(Boolean.FALSE);
        } else {
            f0Var.g.setValue(Boolean.FALSE);
        }
        if (f0Var.f != null) {
            d(f0Var);
            return;
        }
        if (z) {
            androidx.compose.runtime.y yVar2 = f0Var.c;
            if (yVar2 != null) {
                yVar2.l();
                return;
            }
            return;
        }
        androidx.compose.ui.node.k1 outOfFrameExecutor = ((androidx.compose.ui.platform.u) androidx.compose.ui.node.i0.a(this.e)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (f0Var.h || (yVar = f0Var.c) == null) {
                return;
            }
            yVar.l();
            return;
        }
        androidx.compose.animation.z zVar = new androidx.compose.animation.z(f0Var, 5);
        androidx.compose.ui.platform.u uVar = (androidx.compose.ui.platform.u) outOfFrameExecutor;
        kotlin.collections.k kVar = uVar.E;
        boolean zIsEmpty = kVar.isEmpty();
        kVar.addLast(zVar);
        if (zIsEmpty) {
            Handler handler = uVar.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(uVar.F);
            } else {
                net.luminis.tls.engine.impl.c.o("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x0121), top: B:79:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x0121), top: B:79:0x0076 }] */
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
    public final void k(androidx.compose.ui.node.f0 f0Var, Object obj, boolean z, kotlin.jvm.functions.p pVar) {
        boolean z2;
        androidx.compose.runtime.y yVar;
        androidx.collection.o0 o0Var = this.C;
        Object objG = o0Var.g(f0Var);
        Object obj2 = objG;
        if (objG == null) {
            androidx.compose.runtime.internal.f fVar = g.a;
            f0 f0Var2 = new f0();
            f0Var2.a = obj;
            f0Var2.b = fVar;
            f0Var2.c = null;
            f0Var2.g = androidx.compose.runtime.s.r(Boolean.TRUE);
            o0Var.m(f0Var, f0Var2);
            obj2 = f0Var2;
        }
        f0 f0Var3 = (f0) obj2;
        int i = 1;
        boolean z3 = f0Var3.b != pVar;
        if (f0Var3.f != null) {
            if (z3) {
                d(f0Var3);
            } else if (z) {
                return;
            } else {
                c(f0Var3, true);
            }
        }
        androidx.compose.runtime.y yVar2 = f0Var3.c;
        if (yVar2 != null) {
            synchronized (yVar2.A) {
                z2 = yVar2.K.e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || f0Var3.d) {
            f0Var3.b = pVar;
            if (f0Var3.f != null) {
                androidx.compose.ui.internal.a.a("new subcompose call while paused composition is still active");
            }
            androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
            kotlin.jvm.functions.l lVarE = fVarE != null ? fVarE.e() : null;
            androidx.compose.runtime.snapshots.f fVarH = androidx.compose.runtime.snapshots.r.h(fVarE);
            try {
                androidx.compose.ui.node.f0 f0Var4 = this.e;
                f0Var4.O = true;
                androidx.compose.runtime.y yVar3 = f0Var3.c;
                androidx.compose.runtime.v vVar = this.y;
                if (vVar == null) {
                    androidx.compose.ui.internal.a.c("parent composition reference not set");
                    throw new androidx.compose.ui.res.e(10);
                }
                if (yVar3 == null) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = h3.a;
                        yVar = new androidx.compose.runtime.y(vVar, new a2(f0Var));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = h3.a;
                        yVar = new androidx.compose.runtime.y(vVar, new a2(f0Var));
                    }
                    yVar3 = yVar;
                } else {
                    if (yVar3.T == 3) {
                        if (z) {
                            ViewGroup.LayoutParams layoutParams3 = h3.a;
                            yVar = new androidx.compose.runtime.y(vVar, new a2(f0Var));
                        } else {
                            ViewGroup.LayoutParams layoutParams4 = h3.a;
                            yVar = new androidx.compose.runtime.y(vVar, new a2(f0Var));
                        }
                        yVar3 = yVar;
                    }
                }
                f0Var3.c = yVar3;
                kotlin.jvm.functions.p fVar2 = f0Var3.b;
                if (((androidx.compose.ui.platform.u) androidx.compose.ui.node.i0.a(this.e)).getOutOfFrameExecutor() != null) {
                    f0Var3.h = false;
                } else {
                    f0Var3.h = true;
                    fVar2 = new androidx.compose.runtime.internal.f(1524156494, true, new androidx.compose.ui.contentcapture.e(i, f0Var3, fVar2));
                }
                if (z) {
                    if (f0Var3.e) {
                        yVar3.i();
                        yVar3.q();
                        f0Var3.f = yVar3.k(true, fVar2);
                    } else {
                        f0Var3.f = yVar3.k(yVar3.i(), fVar2);
                    }
                } else if (f0Var3.e) {
                    yVar3.i();
                    yVar3.q();
                    androidx.compose.runtime.r rVar = yVar3.S;
                    rVar.z = 0;
                    rVar.y = true;
                    yVar3.e.a(yVar3, fVar2);
                    rVar.u();
                } else {
                    yVar3.B(fVar2);
                }
                f0Var3.e = false;
                f0Var4.O = false;
                androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
                f0Var3.d = false;
            } catch (Throwable th) {
                androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
                throw th;
            }
        }
    }

    public final androidx.compose.ui.node.f0 l(Object obj) {
        androidx.collection.o0 o0Var;
        int i;
        if (this.K == 0) {
            return null;
        }
        androidx.collection.h0 h0Var = (androidx.collection.h0) this.e.o();
        int i2 = ((androidx.compose.runtime.collection.b) h0Var.y).z - this.L;
        int i3 = i2 - this.K;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            o0Var = this.C;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objG = o0Var.g((androidx.compose.ui.node.f0) h0Var.get(i5));
            objG.getClass();
            if (kotlin.jvm.internal.l.a(((f0) objG).a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                Object objG2 = o0Var.g((androidx.compose.ui.node.f0) h0Var.get(i4));
                objG2.getClass();
                f0 f0Var = (f0) objG2;
                Object obj2 = f0Var.a;
                if (obj2 != a0.a) {
                    androidx.compose.foundation.lazy.layout.x xVar = (androidx.compose.foundation.lazy.layout.x) this.z.y;
                    if (!kotlin.jvm.internal.l.a(xVar.b(obj), xVar.b(obj2))) {
                        i4--;
                    }
                }
                f0Var.a = obj;
                i5 = i4;
                i = i5;
                break;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            i(i5, i3);
        }
        this.K--;
        androidx.compose.ui.node.f0 f0Var2 = (androidx.compose.ui.node.f0) h0Var.get(i3);
        Object objG3 = o0Var.g(f0Var2);
        objG3.getClass();
        f0 f0Var3 = (f0) objG3;
        f0Var3.g = androidx.compose.runtime.s.r(Boolean.TRUE);
        f0Var3.e = true;
        f0Var3.d = true;
        return f0Var2;
    }
}
