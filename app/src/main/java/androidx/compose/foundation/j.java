package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.p2;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends androidx.compose.ui.node.j implements androidx.compose.ui.node.r1, androidx.compose.ui.input.key.e, androidx.compose.ui.node.u1, androidx.compose.ui.node.z1, androidx.compose.ui.node.h, androidx.compose.ui.node.h1, androidx.compose.ui.input.indirect.c {
    public static final b i0 = new b();
    public androidx.compose.foundation.interaction.k N;
    public d1 O;
    public boolean P;
    public String Q;
    public androidx.compose.ui.semantics.h R;
    public boolean S;
    public kotlin.jvm.functions.a T;
    public final t0 U;
    public d1 V;
    public androidx.compose.ui.input.pointer.l0 W;
    public androidx.compose.ui.node.i X;
    public androidx.compose.foundation.interaction.m Y;
    public androidx.compose.foundation.interaction.h Z;
    public final androidx.collection.c0 a0;
    public long b0;
    public androidx.compose.foundation.interaction.m c0;
    public androidx.compose.foundation.interaction.k d0;
    public boolean e0;
    public androidx.compose.foundation.text.input.internal.o f0;
    public Job g0;
    public final b h0;

    public j(androidx.compose.foundation.interaction.k kVar, d1 d1Var, boolean z, boolean z2, String str, androidx.compose.ui.semantics.h hVar, kotlin.jvm.functions.a aVar) {
        this.N = kVar;
        this.O = d1Var;
        this.P = z;
        this.Q = str;
        this.R = hVar;
        this.S = z2;
        this.T = aVar;
        this.U = new t0(kVar, 0, new c(1, this, j.class, "onFocusChange", "onFocusChange(Z)V", 0, 0));
        int i = androidx.collection.q.a;
        this.a0 = new androidx.collection.c0(6);
        this.b0 = 0L;
        androidx.compose.foundation.interaction.k kVar2 = this.N;
        this.d0 = kVar2;
        this.e0 = kVar2 == null;
        this.h0 = i0;
    }

    @Override // androidx.compose.ui.q
    public final boolean A0() {
        return false;
    }

    public void D(androidx.compose.ui.input.pointer.m mVar, androidx.compose.ui.input.pointer.n nVar, long j) {
        androidx.compose.ui.input.pointer.l0 l0VarP0;
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.b0 = (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L);
        V0();
        if (this.S && nVar == androidx.compose.ui.input.pointer.n.y) {
            int i = mVar.f;
            kotlin.coroutines.d dVar = null;
            if (i == 4) {
                BuildersKt__Builders_commonKt.launch$default(z0(), null, null, new i(this, dVar, 0), 3, null);
            } else if (i == 5) {
                BuildersKt__Builders_commonKt.launch$default(z0(), null, null, new i(this, dVar, 1), 3, null);
            }
        }
        if (this.W == null && (l0VarP0 = P0()) != null) {
            L0(l0VarP0);
            this.W = l0VarP0;
        }
        androidx.compose.ui.input.pointer.l0 l0Var = this.W;
        if (l0Var != null) {
            l0Var.D(mVar, nVar, j);
        }
    }

    @Override // androidx.compose.ui.q
    public final void D0() {
        e0();
        if (!this.e0) {
            V0();
        }
        if (this.S) {
            L0(this.U);
        }
    }

    public void E() {
        androidx.compose.foundation.interaction.h hVar;
        androidx.compose.foundation.interaction.k kVar = this.N;
        if (kVar != null && (hVar = this.Z) != null) {
            kVar.b(new androidx.compose.foundation.interaction.i(hVar));
        }
        this.Z = null;
        androidx.compose.ui.input.pointer.l0 l0Var = this.W;
        if (l0Var != null) {
            l0Var.E();
        }
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        R0();
        if (this.d0 == null) {
            this.N = null;
        }
        androidx.compose.ui.node.i iVar = this.X;
        if (iVar != null) {
            M0(iVar);
        }
        this.X = null;
    }

    public abstract androidx.compose.ui.input.pointer.l0 P0();

    @Override // androidx.compose.ui.input.indirect.c
    public final void Q(androidx.appcompat.widget.x xVar, androidx.compose.ui.input.pointer.n nVar) {
        ArrayList arrayList = (ArrayList) xVar.z;
        V0();
        if (this.S) {
            if (this.f0 == null) {
                this.f0 = new androidx.compose.foundation.text.input.internal.o(this);
            }
            androidx.compose.foundation.text.input.internal.o oVar = this.f0;
            if (oVar != null) {
                kotlin.jvm.functions.a aVar = this.T;
                j jVar = (j) oVar.y;
                int i = 0;
                if (nVar != androidx.compose.ui.input.pointer.n.y) {
                    if (nVar != androidx.compose.ui.input.pointer.n.z || ((androidx.compose.ui.input.indirect.b) oVar.z) == null) {
                        return;
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        androidx.compose.ui.input.indirect.b bVar = (androidx.compose.ui.input.indirect.b) arrayList.get(i);
                        if (bVar.i && !bVar.equals((androidx.compose.ui.input.indirect.b) oVar.z)) {
                            oVar.r();
                            return;
                        }
                        i++;
                    }
                    return;
                }
                androidx.compose.ui.input.indirect.b bVar2 = (androidx.compose.ui.input.indirect.b) oVar.z;
                if (bVar2 == null) {
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        androidx.compose.ui.input.indirect.b bVar3 = (androidx.compose.ui.input.indirect.b) arrayList.get(i2);
                        if (!bVar3.h && bVar3.d) {
                            androidx.compose.ui.input.indirect.b bVar4 = (androidx.compose.ui.input.indirect.b) arrayList.get(0);
                            oVar.z = bVar4;
                            jVar.U0(bVar4.c, true);
                            bVar4.i = true;
                            return;
                        }
                    }
                    return;
                }
                long j = bVar2.c;
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    androidx.compose.ui.input.indirect.b bVar5 = (androidx.compose.ui.input.indirect.b) arrayList.get(i3);
                    if (bVar5.h && bVar5.d) {
                        if (Math.abs(androidx.compose.ui.geometry.b.c(androidx.compose.ui.geometry.b.d(((androidx.compose.ui.input.indirect.b) arrayList.get(0)).c, j))) > ((p2) androidx.compose.ui.node.k.h(jVar, androidx.compose.ui.platform.l1.s)).f()) {
                            oVar.r();
                            return;
                        }
                        return;
                    }
                }
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    androidx.compose.ui.input.indirect.b bVar6 = (androidx.compose.ui.input.indirect.b) arrayList.get(i4);
                    if (bVar6.i || !bVar6.h || bVar6.d) {
                        int size5 = arrayList.size();
                        while (i < size5) {
                            if (((androidx.compose.ui.input.indirect.b) arrayList.get(i)).i) {
                                oVar.r();
                                return;
                            }
                            i++;
                        }
                        return;
                    }
                }
                ((androidx.compose.ui.input.indirect.b) arrayList.get(0)).i = true;
                jVar.T0(j, true);
                aVar.invoke();
                oVar.z = null;
            }
        }
    }

    public final boolean Q0() {
        kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
        androidx.compose.ui.node.k.w(this, androidx.compose.foundation.gestures.q1.M, new androidx.activity.compose.g(vVar, 3));
        if (vVar.e) {
            return true;
        }
        int i = e0.b;
        ViewParent parent = androidx.compose.ui.node.k.v(this).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:16:0x0037->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:27:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:26:0x0073], SYNTHETIC] */
    public final void R0() {
        androidx.compose.foundation.interaction.k kVar = this.N;
        androidx.collection.c0 c0Var = this.a0;
        if (kVar != null) {
            androidx.compose.foundation.interaction.m mVar = this.Y;
            if (mVar != null) {
                kVar.b(new androidx.compose.foundation.interaction.l(mVar));
            }
            androidx.compose.foundation.interaction.m mVar2 = this.c0;
            if (mVar2 != null) {
                kVar.b(new androidx.compose.foundation.interaction.l(mVar2));
            }
            androidx.compose.foundation.interaction.h hVar = this.Z;
            if (hVar != null) {
                kVar.b(new androidx.compose.foundation.interaction.i(hVar));
            }
            Object[] objArr = c0Var.c;
            long[] jArr = c0Var.a;
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
                            if ((255 & j) < 128) {
                                kVar.b(new androidx.compose.foundation.interaction.l((androidx.compose.foundation.interaction.m) objArr[(i << 3) + i3]));
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
        }
        this.Y = null;
        this.c0 = null;
        this.Z = null;
        c0Var.a();
    }

    public final void S0(boolean z) {
        androidx.compose.foundation.interaction.k kVar = this.N;
        if (kVar != null) {
            Job job = this.g0;
            kotlin.coroutines.d dVar = null;
            if (job == null || !job.isActive()) {
                androidx.compose.foundation.interaction.m mVar = z ? this.c0 : this.Y;
                if (mVar != null) {
                    androidx.compose.foundation.interaction.l lVar = new androidx.compose.foundation.interaction.l(mVar);
                    Job job2 = (Job) z0().getCoroutineContext().get(Job.Key);
                    BuildersKt__Builders_commonKt.launch$default(z0(), null, null, new androidx.compose.animation.b0(kVar, lVar, job2 != null ? job2.invokeOnCompletion(new androidx.activity.compose.h(7, kVar, lVar)) : null, dVar, 2), 3, null);
                }
            } else {
                Job job3 = this.g0;
                if (job3 != null) {
                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                }
            }
            if (z) {
                this.c0 = null;
            } else {
                this.Y = null;
            }
        }
    }

    public final void T0(long j, boolean z) {
        androidx.compose.foundation.interaction.k kVar = this.N;
        if (kVar != null) {
            Job job = this.g0;
            if (job == null || !job.isActive()) {
                androidx.compose.foundation.interaction.m mVar = z ? this.c0 : this.Y;
                if (mVar != null) {
                    BuildersKt__Builders_commonKt.launch$default(z0(), null, null, new f(mVar, kVar, (kotlin.coroutines.d) null), 3, null);
                }
            } else {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                BuildersKt__Builders_commonKt.launch$default(z0(), null, null, new d(job, j, kVar, null, 1), 3, null);
            }
            if (z) {
                this.c0 = null;
            } else {
                this.Y = null;
            }
        }
    }

    public final void U0(long j, boolean z) {
        androidx.compose.foundation.interaction.k kVar = this.N;
        if (kVar != null) {
            androidx.compose.foundation.interaction.m mVar = new androidx.compose.foundation.interaction.m(j);
            if (Q0()) {
                this.g0 = BuildersKt__Builders_commonKt.launch$default(z0(), null, null, new g(kVar, mVar, z, this, (kotlin.coroutines.d) null), 3, null);
                return;
            }
            if (z) {
                this.c0 = mVar;
            } else {
                this.Y = mVar;
            }
            BuildersKt__Builders_commonKt.launch$default(z0(), null, null, new f(kVar, mVar, (kotlin.coroutines.d) null), 3, null);
        }
    }

    public final void V0() {
        if (this.X != null) {
            return;
        }
        d1 d1Var = this.P ? this.V : this.O;
        if (d1Var != null) {
            if (this.N == null) {
                this.N = new androidx.compose.foundation.interaction.k();
            }
            this.U.Q0(this.N);
            androidx.compose.foundation.interaction.k kVar = this.N;
            kVar.getClass();
            androidx.compose.ui.node.i iVarA = d1Var.a(kVar);
            L0(iVarA);
            this.X = iVarA;
        }
    }

    public abstract boolean X0(KeyEvent keyEvent);

    public abstract void Y0(KeyEvent keyEvent);

    @Override // androidx.compose.ui.input.indirect.c
    public final void Z() {
        androidx.compose.foundation.text.input.internal.o oVar = this.f0;
        if (oVar != null) {
            oVar.r();
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    public final void Z0(androidx.compose.foundation.interaction.k kVar, d1 d1Var, boolean z, boolean z2, String str, androidx.compose.ui.semantics.h hVar, kotlin.jvm.functions.a aVar) {
        boolean z3;
        boolean z4;
        androidx.compose.ui.node.i iVar;
        if (kotlin.jvm.internal.l.a(this.d0, kVar)) {
            z3 = false;
        } else {
            R0();
            this.d0 = kVar;
            this.N = kVar;
            z3 = true;
        }
        if (!kotlin.jvm.internal.l.a(this.O, d1Var)) {
            this.O = d1Var;
            z3 = true;
        }
        if (this.P != z) {
            this.P = z;
            if (z) {
                e0();
            }
            z3 = true;
        }
        boolean z5 = this.S;
        t0 t0Var = this.U;
        if (z5 != z2) {
            if (z2) {
                L0(t0Var);
            } else {
                M0(t0Var);
                R0();
            }
            androidx.compose.ui.node.k.l(this);
            this.S = z2;
        }
        if (!kotlin.jvm.internal.l.a(this.Q, str)) {
            this.Q = str;
            androidx.compose.ui.node.k.l(this);
        }
        if (!kotlin.jvm.internal.l.a(this.R, hVar)) {
            this.R = hVar;
            androidx.compose.ui.node.k.l(this);
        }
        this.T = aVar;
        boolean z6 = this.e0;
        androidx.compose.foundation.interaction.k kVar2 = this.d0;
        if (z6 != (kVar2 == null)) {
            boolean z7 = kVar2 == null;
            this.e0 = z7;
            z4 = (z7 || this.X != null) ? z3 : true;
        }
        if (z4 && ((iVar = this.X) != null || !this.e0)) {
            if (iVar != null) {
                M0(iVar);
            }
            this.X = null;
            V0();
        }
        t0Var.Q0(this.N);
    }

    @Override // androidx.compose.ui.node.h1
    public final void e0() {
        if (this.P) {
            androidx.compose.ui.node.k.p(this, new a(this, 0));
        }
    }

    @Override // androidx.compose.ui.input.key.e
    public final boolean g(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.node.z1
    public final Object i() {
        return this.h0;
    }

    @Override // androidx.compose.ui.node.u1
    public final void l0(androidx.compose.ui.semantics.x xVar) {
        androidx.compose.ui.semantics.h hVar = this.R;
        if (hVar != null) {
            androidx.compose.ui.semantics.v.c(xVar, hVar.a);
        }
        String str = this.Q;
        a aVar = new a(this, 1);
        kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.v.a;
        xVar.b(androidx.compose.ui.semantics.k.b, new androidx.compose.ui.semantics.a(str, aVar));
        if (this.S) {
            this.U.l0(xVar);
        } else {
            xVar.b(androidx.compose.ui.semantics.t.i, kotlin.y.a);
        }
        O0(xVar);
    }

    @Override // androidx.compose.ui.node.u1
    public final boolean t0() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0080 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.ui.input.key.e
    public final boolean x(KeyEvent keyEvent) {
        boolean z;
        V0();
        long jB = androidx.compose.ui.input.key.c.b(keyEvent);
        boolean z2 = this.S;
        kotlin.coroutines.d dVar = null;
        androidx.collection.c0 c0Var = this.a0;
        if (z2 && androidx.compose.ui.input.key.c.c(keyEvent) == 2 && s.n(keyEvent)) {
            if (c0Var.b(jB)) {
                z = false;
            } else {
                androidx.compose.foundation.interaction.m mVar = new androidx.compose.foundation.interaction.m(this.b0);
                c0Var.g(jB, mVar);
                if (this.N != null) {
                    BuildersKt__Builders_commonKt.launch$default(z0(), null, null, new h(this, mVar, dVar, 2), 3, null);
                }
                z = true;
            }
            if (X0(keyEvent) || z) {
                return true;
            }
            return false;
        }
        if (this.S && androidx.compose.ui.input.key.c.c(keyEvent) == 1 && s.n(keyEvent)) {
            androidx.compose.foundation.interaction.m mVar2 = (androidx.compose.foundation.interaction.m) c0Var.f(jB);
            if (mVar2 != null) {
                if (this.N != null) {
                    BuildersKt__Builders_commonKt.launch$default(z0(), null, null, new h(this, mVar2, dVar, 3), 3, null);
                }
                Y0(keyEvent);
            }
            if (mVar2 != null) {
                return true;
            }
        }
        return false;
    }

    public void W0() {
    }

    public void O0(androidx.compose.ui.semantics.x xVar) {
    }
}
