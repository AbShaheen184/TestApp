package androidx.compose.ui.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.activity.l;
import androidx.collection.n;
import androidx.collection.o;
import androidx.collection.o0;
import androidx.collection.z;
import androidx.compose.foundation.r0;
import androidx.compose.ui.autofill.r;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.platform.i0;
import androidx.compose.ui.platform.j2;
import androidx.compose.ui.platform.u;
import androidx.compose.ui.semantics.k;
import androidx.compose.ui.semantics.p;
import androidx.compose.ui.semantics.q;
import androidx.compose.ui.semantics.s;
import androidx.compose.ui.semantics.t;
import androidx.compose.ui.semantics.w;
import androidx.compose.ui.text.j0;
import androidx.compose.ui.text.m0;
import androidx.lifecycle.v;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements androidx.lifecycle.f, View.OnAttachStateChangeListener {
    public final ArrayList A = new ArrayList();
    public final long B = 100;
    public a C = a.e;
    public boolean D = true;
    public final Channel E = ChannelKt.Channel$default(1, null, null, 6, null);
    public final Handler F = new Handler(Looper.getMainLooper());
    public z G;
    public long H;
    public final z I;
    public j2 J;
    public boolean K;
    public final l L;
    public final u e;
    public final r0 y;
    public i z;

    public f(u uVar, r0 r0Var) {
        this.e = uVar;
        this.y = r0Var;
        z zVar = o.a;
        zVar.getClass();
        this.G = zVar;
        this.I = new z();
        this.J = new j2(uVar.getSemanticsOwner().a(), zVar);
        this.L = new l(this, 4);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r8.B, r0) == r4) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007c -> B:13:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.contentcapture.c
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.ui.contentcapture.c r0 = (androidx.compose.ui.contentcapture.c) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            androidx.compose.ui.contentcapture.c r0 = new androidx.compose.ui.contentcapture.c
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.y
            int r1 = r0.A
            r2 = 2
            r3 = 1
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            kotlinx.coroutines.channels.ChannelIterator r1 = r0.e
            kotlin.a.e(r9)
        L2b:
            r9 = r1
            goto L43
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r9)
            r9 = 0
            return r9
        L34:
            kotlinx.coroutines.channels.ChannelIterator r1 = r0.e
            kotlin.a.e(r9)
            goto L51
        L3a:
            kotlin.a.e(r9)
            kotlinx.coroutines.channels.Channel r9 = r8.E
            kotlinx.coroutines.channels.ChannelIterator r9 = r9.iterator()
        L43:
            r0.e = r9
            r0.A = r3
            java.lang.Object r1 = r9.hasNext(r0)
            if (r1 != r4) goto L4e
            goto L7e
        L4e:
            r7 = r1
            r1 = r9
            r9 = r7
        L51:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L7f
            r1.next()
            boolean r9 = r8.e()
            if (r9 == 0) goto L65
            r8.f()
        L65:
            boolean r9 = r8.K
            if (r9 != 0) goto L72
            r8.K = r3
            android.os.Handler r9 = r8.F
            androidx.activity.l r5 = r8.L
            r9.post(r5)
        L72:
            r0.e = r1
            r0.A = r2
            long r5 = r8.B
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r5, r0)
            if (r9 != r4) goto L2b
        L7e:
            return r4
        L7f:
            kotlin.y r9 = kotlin.y.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.f.b(kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0173 A[EDGE_INSN: B:105:0x0173->B:80:0x0173 BREAK  A[LOOP:4: B:48:0x00e9->B:79:0x016c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb A[LOOP:2: B:21:0x006f->B:42:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x016c A[LOOP:4: B:48:0x00e9->B:79:0x016c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x00d4 A[EDGE_INSN: B:99:0x00d4->B:44:0x00d4 BREAK  A[LOOP:2: B:21:0x006f->B:42:0x00cb], SYNTHETIC] */
    public final void c(n nVar) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        n nVar2 = nVar;
        int[] iArr3 = nVar2.b;
        long[] jArr = nVar2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        j2 j2Var = (j2) this.I.b(i7);
                        q qVar = (q) nVar2.b(i7);
                        p pVar = qVar != null ? qVar.a : null;
                        if (pVar == null) {
                            throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = pVar.g;
                        o0 o0Var = pVar.d.e;
                        if (j2Var == null) {
                            Object[] objArr = o0Var.b;
                            long[] jArr2 = o0Var.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                w wVar = (w) objArr[(i10 << 3) + i12];
                                                w wVar2 = t.B;
                                                if (kotlin.jvm.internal.l.a(wVar, wVar2)) {
                                                    Object objG = o0Var.g(wVar2);
                                                    if (objG == null) {
                                                        objG = null;
                                                    }
                                                    List list = (List) objG;
                                                    i(i8, String.valueOf(list != null ? (androidx.compose.ui.text.g) kotlin.collections.o.M(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                        if (i10 != length2) {
                                            break;
                                        }
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    } else if (i10 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = o0Var.b;
                            long[] jArr3 = o0Var.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                w wVar3 = (w) objArr2[(i13 << 3) + i15];
                                                w wVar4 = t.B;
                                                if (kotlin.jvm.internal.l.a(wVar3, wVar4)) {
                                                    Object objG2 = j2Var.a.e.g(wVar4);
                                                    if (objG2 == null) {
                                                        objG2 = null;
                                                    }
                                                    List list2 = (List) objG2;
                                                    androidx.compose.ui.text.g gVar = list2 != null ? (androidx.compose.ui.text.g) kotlin.collections.o.M(list2) : null;
                                                    Object objG3 = o0Var.g(wVar4);
                                                    if (objG3 == null) {
                                                        objG3 = null;
                                                    }
                                                    List list3 = (List) objG3;
                                                    androidx.compose.ui.text.g gVar2 = list3 != null ? (androidx.compose.ui.text.g) kotlin.collections.o.M(list3) : null;
                                                    if (!kotlin.jvm.internal.l.a(gVar, gVar2)) {
                                                        i(i8, String.valueOf(gVar2));
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 != length3) {
                                            break;
                                        }
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    } else if (i13 != length3) {
                                        break;
                                        break;
                                    } else {
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i2 = 8;
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    nVar2 = nVar;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            nVar2 = nVar;
            iArr3 = iArr;
        }
    }

    public final n d() {
        if (this.D) {
            this.D = false;
            this.G = s.b(this.e.getSemanticsOwner(), d.y);
            this.H = System.currentTimeMillis();
        }
        return this.G;
    }

    public final boolean e() {
        return this.z != null;
    }

    public final void f() {
        i iVar = this.z;
        if (iVar != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.A;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                g gVar = (g) arrayList.get(i);
                int iOrdinal = gVar.c.ordinal();
                if (iOrdinal == 0) {
                    com.google.firebase.platforminfo.c cVar = gVar.d;
                    if (cVar != null) {
                        ((androidx.compose.ui.platform.coreshims.a) iVar).d((ViewStructure) cVar.e);
                    }
                } else {
                    if (iOrdinal != 1) {
                        coil3.g.a();
                        return;
                    }
                    androidx.compose.ui.platform.coreshims.a aVar = (androidx.compose.ui.platform.coreshims.a) iVar;
                    AutofillId autofillIdB = aVar.b(gVar.a);
                    if (autofillIdB != null) {
                        aVar.e(autofillIdB);
                    }
                }
            }
            ((androidx.compose.ui.platform.coreshims.a) iVar).a();
            arrayList.clear();
        }
    }

    public final void h(p pVar, j2 j2Var) {
        e eVar = new e(0, j2Var, this);
        pVar.getClass();
        List listJ = p.j(4, pVar);
        int size = listJ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listJ.get(i2);
            if (d().a(((p) obj).g)) {
                eVar.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
        List listJ2 = p.j(4, pVar);
        int size2 = listJ2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            p pVar2 = (p) listJ2.get(i3);
            n nVarD = d();
            int i4 = pVar2.g;
            if (nVarD.a(i4)) {
                z zVar = this.I;
                if (zVar.a(i4)) {
                    Object objB = zVar.b(i4);
                    if (objB == null) {
                        throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("node not present in pruned tree before this change");
                    }
                    h(pVar2, (j2) objB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void i(int i, String str) {
        i iVar;
        if (Build.VERSION.SDK_INT >= 29 && (iVar = this.z) != null) {
            androidx.compose.ui.platform.coreshims.a aVar = (androidx.compose.ui.platform.coreshims.a) iVar;
            AutofillId autofillIdB = aVar.b(i);
            if (autofillIdB == null) {
                throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("Invalid content capture ID");
            }
            aVar.f(autofillIdB, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0188  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    public final void j(int i, p pVar) {
        kotlin.jvm.functions.l lVar;
        r rVarO;
        AutofillId autofillIdJ;
        androidx.compose.ui.geometry.c cVarA;
        com.google.firebase.platforminfo.c cVar;
        String strR;
        kotlin.jvm.functions.l lVar2;
        if (e()) {
            o0 o0Var = pVar.d.e;
            Object objG = o0Var.g(t.D);
            if (objG == null) {
                objG = null;
            }
            Boolean bool = (Boolean) objG;
            if (this.C == a.e && kotlin.jvm.internal.l.a(bool, Boolean.TRUE)) {
                Object objG2 = o0Var.g(k.m);
                if (objG2 == null) {
                    objG2 = null;
                }
                androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) objG2;
                if (aVar != null && (lVar2 = (kotlin.jvm.functions.l) aVar.b) != null) {
                }
            } else if (this.C == a.y && kotlin.jvm.internal.l.a(bool, Boolean.FALSE)) {
                Object objG3 = o0Var.g(k.m);
                if (objG3 == null) {
                    objG3 = null;
                }
                androidx.compose.ui.semantics.a aVar2 = (androidx.compose.ui.semantics.a) objG3;
                if (aVar2 != null && (lVar = (kotlin.jvm.functions.l) aVar2.b) != null) {
                }
            }
            int i2 = pVar.g;
            i iVar = this.z;
            if (iVar == null || Build.VERSION.SDK_INT < 29 || (rVarO = _COROUTINE.b.o(this.e)) == null) {
                cVar = null;
            } else {
                p pVarL = pVar.l();
                int i3 = pVar.g;
                if (pVarL != null) {
                    autofillIdJ = ((androidx.compose.ui.platform.coreshims.a) iVar).b(pVarL.g);
                    if (autofillIdJ == null) {
                        cVar = null;
                    }
                } else {
                    autofillIdJ = rVarO.j();
                }
                com.google.firebase.platforminfo.c cVarC = ((androidx.compose.ui.platform.coreshims.a) iVar).c(autofillIdJ, i3);
                if (cVarC == null) {
                    cVar = null;
                } else {
                    ViewStructure viewStructure = (ViewStructure) cVarC.e;
                    androidx.compose.ui.semantics.l lVar3 = pVar.d;
                    w wVar = t.K;
                    o0 o0Var2 = lVar3.e;
                    if (o0Var2.c(wVar)) {
                        cVar = null;
                    } else {
                        Bundle extras = viewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.H);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                        }
                        Object objG4 = o0Var2.g(t.z);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        String str = (String) objG4;
                        if (str != null) {
                            viewStructure.setId(i3, null, null, str);
                        }
                        Object objG5 = o0Var2.g(t.m);
                        if (objG5 == null) {
                            objG5 = null;
                        }
                        if (((Boolean) objG5) != null) {
                            viewStructure.setClassName("android.widget.ViewGroup");
                        }
                        Object objG6 = o0Var2.g(t.B);
                        if (objG6 == null) {
                            objG6 = null;
                        }
                        List list = (List) objG6;
                        if (list != null) {
                            viewStructure.setClassName("android.widget.TextView");
                            viewStructure.setText(androidx.compose.ui.util.a.a(list, "\n", null, 62));
                        }
                        Object objG7 = o0Var2.g(t.F);
                        if (objG7 == null) {
                            objG7 = null;
                        }
                        androidx.compose.ui.text.g gVar = (androidx.compose.ui.text.g) objG7;
                        if (gVar != null) {
                            viewStructure.setClassName("android.widget.EditText");
                            viewStructure.setText(gVar);
                        }
                        Object objG8 = o0Var2.g(t.a);
                        if (objG8 == null) {
                            objG8 = null;
                        }
                        List list2 = (List) objG8;
                        if (list2 != null) {
                            viewStructure.setContentDescription(androidx.compose.ui.util.a.a(list2, "\n", null, 62));
                        }
                        Object objG9 = o0Var2.g(t.y);
                        if (objG9 == null) {
                            objG9 = null;
                        }
                        androidx.compose.ui.semantics.h hVar = (androidx.compose.ui.semantics.h) objG9;
                        if (hVar != null && (strR = i0.r(hVar.a)) != null) {
                            viewStructure.setClassName(strR);
                        }
                        j0 j0VarK = i0.k(lVar3);
                        if (j0VarK != null) {
                            androidx.compose.ui.text.i0 i0Var = j0VarK.a;
                            m0 m0Var = i0Var.b;
                            androidx.compose.ui.unit.c cVar2 = i0Var.g;
                            viewStructure.setTextStyle(cVar2.T() * cVar2.a() * androidx.compose.ui.unit.o.c(m0Var.a.b), 0, 0, 0);
                        }
                        d1 d1VarD = pVar.d();
                        if (d1VarD == null) {
                            cVarA = androidx.compose.ui.geometry.c.e;
                        } else {
                            d1 d1Var = d1VarD.T0().K ? d1VarD : null;
                            if (d1Var != null) {
                                cVarA = pVar.a(d1Var);
                            } else {
                                cVarA = androidx.compose.ui.geometry.c.e;
                            }
                        }
                        float f = cVarA.a;
                        float f2 = cVarA.b;
                        viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (cVarA.c - f), (int) (cVarA.d - f2));
                        cVar = cVarC;
                    }
                }
            }
            if (cVar != null) {
                this.A.add(new g(i2, this.H, h.e, cVar));
            }
            List listJ = p.j(4, pVar);
            int size = listJ.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = listJ.get(i5);
                if (d().a(((p) obj).g)) {
                    j(i4, (p) obj);
                    i4++;
                }
            }
        }
    }

    public final void k(p pVar) {
        if (e()) {
            this.A.add(new g(pVar.g, this.H, h.y, null));
            List listJ = p.j(4, pVar);
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                k((p) listJ.get(i));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    public final void l() {
        z zVar = this.I;
        zVar.c();
        n nVarD = d();
        int[] iArr = nVarD.b;
        Object[] objArr = nVarD.c;
        long[] jArr = nVarD.a;
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
                            int i4 = (i << 3) + i3;
                            zVar.h(iArr[i4], new j2(((q) objArr[i4]).a, d()));
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
        this.J = new j2(this.e.getSemanticsOwner().a(), d());
    }

    @Override // androidx.lifecycle.f
    public final void m(v vVar) {
        k(this.e.getSemanticsOwner().a());
        f();
        this.z = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.F.removeCallbacks(this.L);
        this.z = null;
    }

    @Override // androidx.lifecycle.f
    public final void z(v vVar) {
        this.z = (i) this.y.invoke();
        j(-1, this.e.getSemanticsOwner().a());
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
