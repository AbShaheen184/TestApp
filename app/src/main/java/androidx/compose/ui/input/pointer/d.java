package androidx.compose.ui.input.pointer;

import androidx.compose.foundation.text.selection.q0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final androidx.compose.ui.layout.x a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final androidx.collection.j0 f = new androidx.collection.j0();
    public final l g = new l();
    public final androidx.collection.c0 h = new androidx.collection.c0(10);

    public d(androidx.compose.ui.layout.x xVar) {
        this.a = xVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa A[LOOP:2: B:38:0x00a1->B:52:0x00fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ff A[EDGE_INSN: B:61:0x00ff->B:53:0x00ff BREAK  A[LOOP:2: B:38:0x00a1->B:52:0x00fa], SYNTHETIC] */
    public final void a(long j, List list, boolean z) {
        androidx.collection.c0 c0Var;
        k kVar;
        Object objD;
        Object obj;
        int size = list.size();
        l lVar = this.g;
        l lVar2 = lVar;
        boolean z2 = true;
        int i = 0;
        while (true) {
            c0Var = this.h;
            if (i >= size) {
                break;
            }
            androidx.compose.ui.q qVar = (androidx.compose.ui.q) list.get(i);
            if (qVar.K) {
                qVar.J = new androidx.compose.ui.draw.b(2, this, qVar);
                if (z2) {
                    androidx.compose.runtime.collection.b bVar = lVar2.a;
                    Object[] objArr = bVar.e;
                    int i2 = bVar.z;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i3];
                        if (kotlin.jvm.internal.l.a(((k) obj).c, qVar)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    kVar = (k) obj;
                    if (kVar != null) {
                        kVar.i = true;
                        kVar.d.a(j);
                        if (z) {
                            Object objD2 = c0Var.d(j);
                            if (objD2 == null) {
                                objD2 = new androidx.collection.j0();
                                c0Var.g(j, objD2);
                            }
                            ((androidx.collection.j0) objD2).a(kVar);
                        }
                    } else {
                        z2 = false;
                        kVar = new k(qVar);
                        kVar.d.a(j);
                        if (z) {
                            objD = c0Var.d(j);
                            if (objD == null) {
                                objD = new androidx.collection.j0();
                                c0Var.g(j, objD);
                            }
                            ((androidx.collection.j0) objD).a(kVar);
                        }
                        lVar2.a.b(kVar);
                    }
                } else {
                    kVar = new k(qVar);
                    kVar.d.a(j);
                    if (z) {
                        objD = c0Var.d(j);
                        if (objD == null) {
                            objD = new androidx.collection.j0();
                            c0Var.g(j, objD);
                        }
                        ((androidx.collection.j0) objD).a(kVar);
                    }
                    lVar2.a.b(kVar);
                }
                lVar2 = kVar;
            }
            i++;
        }
        if (z) {
            long[] jArr = c0Var.b;
            Object[] objArr2 = c0Var.c;
            long[] jArr2 = c0Var.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr2[i4];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i4 != length) {
                            break;
                            break;
                        }
                        i4++;
                    } else {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((255 & j2) < 128) {
                                int i8 = (i4 << 3) + i7;
                                long j3 = jArr[i8];
                                androidx.collection.j0 j0Var = (androidx.collection.j0) objArr2[i8];
                                androidx.compose.runtime.collection.b bVar2 = lVar.a;
                                Object[] objArr3 = bVar2.e;
                                int i9 = bVar2.z;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    ((k) objArr3[i10]).f(j3, j0Var);
                                }
                            }
                            j2 >>= i5;
                            i7++;
                            i5 = i5;
                        }
                        if (i6 != i5) {
                            break;
                        } else if (i4 != length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
        }
        c0Var.a();
    }

    public final boolean b(q0 q0Var, boolean z) {
        androidx.collection.s sVar = (androidx.collection.s) q0Var.z;
        androidx.compose.ui.layout.x xVar = this.a;
        l lVar = this.g;
        boolean zA = lVar.a(sVar, xVar, q0Var, z);
        androidx.compose.runtime.collection.b bVar = lVar.a;
        if (!zA) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = bVar.e;
        int i = bVar.z;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((k) objArr[i2]).e(q0Var, z) || z3;
        }
        Object[] objArr2 = bVar.e;
        int i3 = bVar.z;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((k) objArr2[i4]).d(q0Var) || z4;
        }
        lVar.b(q0Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            androidx.collection.j0 j0Var = this.f;
            int i5 = j0Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((androidx.compose.ui.q) j0Var.f(i6));
            }
            j0Var.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            lVar.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        l lVar = this.g;
        androidx.compose.runtime.collection.b bVar = lVar.a;
        Object[] objArr = bVar.e;
        int i = bVar.z;
        for (int i2 = 0; i2 < i; i2++) {
            ((k) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            lVar.a.g();
        }
    }

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
    public final void d(androidx.compose.ui.q qVar) {
        if (this.b) {
            this.e = true;
            this.f.a(qVar);
            return;
        }
        l lVar = this.g;
        androidx.collection.j0 j0Var = lVar.b;
        j0Var.d();
        j0Var.a(lVar);
        while (j0Var.i()) {
            l lVar2 = (l) j0Var.k(j0Var.b - 1);
            int i = 0;
            while (true) {
                androidx.compose.runtime.collection.b bVar = lVar2.a;
                if (i < bVar.z) {
                    k kVar = (k) bVar.e[i];
                    if (kotlin.jvm.internal.l.a(kVar.c, qVar)) {
                        lVar2.a.j(kVar);
                        kVar.c();
                    } else {
                        j0Var.a(kVar);
                        i++;
                    }
                }
            }
        }
    }
}
