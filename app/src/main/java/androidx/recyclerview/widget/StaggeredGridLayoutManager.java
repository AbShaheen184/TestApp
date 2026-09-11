package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.widget.z0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends c0 {
    public final androidx.media3.common.util.b A;
    public final int B;
    public boolean C;
    public boolean D;
    public v0 E;
    public final Rect F;
    public final s0 G;
    public final boolean H;
    public int[] I;
    public final z0 J;
    public final int o;
    public final androidx.collection.u[] p;
    public final androidx.emoji2.text.g q;
    public final androidx.emoji2.text.g r;
    public final int s;
    public int t;
    public final p u;
    public boolean v;
    public final BitSet x;
    public boolean w = false;
    public int y = -1;
    public int z = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.o = -1;
        this.v = false;
        androidx.media3.common.util.b bVar = new androidx.media3.common.util.b(22, false);
        this.A = bVar;
        this.B = 2;
        this.F = new Rect();
        this.G = new s0(this);
        this.H = true;
        this.J = new z0(this, 11);
        b0 b0VarH = c0.H(context, attributeSet, i, i2);
        int i3 = b0VarH.a;
        if (i3 != 0 && i3 != 1) {
            net.luminis.tls.engine.impl.c.o("invalid orientation.");
            throw null;
        }
        b(null);
        if (i3 != this.s) {
            this.s = i3;
            androidx.emoji2.text.g gVar = this.q;
            this.q = this.r;
            this.r = gVar;
            m0();
        }
        int i4 = b0VarH.b;
        b(null);
        if (i4 != this.o) {
            bVar.o();
            m0();
            this.o = i4;
            this.x = new BitSet(this.o);
            this.p = new androidx.collection.u[this.o];
            for (int i5 = 0; i5 < this.o; i5++) {
                this.p[i5] = new androidx.collection.u(this, i5);
            }
            m0();
        }
        boolean z = b0VarH.c;
        b(null);
        v0 v0Var = this.E;
        if (v0Var != null && v0Var.E != z) {
            v0Var.E = z;
        }
        this.v = z;
        m0();
        p pVar = new p();
        pVar.a = true;
        pVar.f = 0;
        pVar.g = 0;
        this.u = pVar;
        this.q = androidx.emoji2.text.g.d(this, this.s);
        this.r = androidx.emoji2.text.g.d(this, 1 - this.s);
    }

    public static int Y0(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v32 */
    public final int A0(i0 i0Var, p pVar, l0 l0Var) {
        androidx.collection.u uVar;
        ?? r8;
        int iK;
        int iH;
        int iQ;
        int iH2;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 1;
        this.x.set(0, this.o, true);
        p pVar2 = this.u;
        int i6 = pVar2.i ? pVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : pVar.e == 1 ? pVar.g + pVar.b : pVar.f - pVar.b;
        int i7 = pVar.e;
        for (int i8 = 0; i8 < this.o; i8++) {
            if (!((ArrayList) this.p[i8].f).isEmpty()) {
                X0(this.p[i8], i7, i6);
            }
        }
        boolean z = this.w;
        androidx.emoji2.text.g gVar = this.q;
        int iL = z ? gVar.l() : gVar.q();
        boolean z2 = false;
        while (true) {
            int i9 = pVar.c;
            if (i9 < 0 || i9 >= l0Var.b() || (!pVar2.i && this.x.isEmpty())) {
                break;
            }
            View viewD = i0Var.d(pVar.c);
            pVar.c += pVar.d;
            t0 t0Var = (t0) viewD.getLayoutParams();
            int iB = t0Var.a.b();
            androidx.media3.common.util.b bVar = this.A;
            int[] iArr = (int[]) bVar.y;
            int i10 = (iArr == null || iB >= iArr.length) ? -1 : iArr[iB];
            if (i10 == -1) {
                boolean zO0 = O0(pVar.e);
                int i11 = this.o;
                if (zO0) {
                    i3 = i11 - 1;
                    i2 = -1;
                    i = -1;
                } else {
                    i = i5;
                    i2 = i11;
                    i3 = i4;
                }
                int i12 = pVar.e;
                androidx.collection.u uVar2 = null;
                androidx.emoji2.text.g gVar2 = this.q;
                if (i12 == i5) {
                    int iQ2 = gVar2.q();
                    int i13 = Integer.MAX_VALUE;
                    while (i3 != i2) {
                        androidx.collection.u uVar3 = this.p[i3];
                        int i14 = uVar3.i(iQ2);
                        if (i14 < i13) {
                            i13 = i14;
                            uVar2 = uVar3;
                        }
                        i3 += i;
                    }
                } else {
                    int iL2 = gVar2.l();
                    int i15 = Integer.MIN_VALUE;
                    while (i3 != i2) {
                        androidx.collection.u uVar4 = this.p[i3];
                        int iK2 = uVar4.k(iL2);
                        if (iK2 > i15) {
                            uVar2 = uVar4;
                            i15 = iK2;
                        }
                        i3 += i;
                    }
                }
                uVar = uVar2;
                bVar.s(iB);
                ((int[]) bVar.y)[iB] = uVar.e;
            } else {
                uVar = this.p[i10];
            }
            t0Var.e = uVar;
            if (pVar.e == 1) {
                r8 = 0;
                a(viewD, -1, false);
            } else {
                r8 = 0;
                a(viewD, 0, false);
            }
            if (this.s == 1) {
                M0(viewD, c0.v(r8, this.t, this.k, r8, ((ViewGroup.MarginLayoutParams) t0Var).width), c0.v(true, this.n, this.l, C() + F(), ((ViewGroup.MarginLayoutParams) t0Var).height));
            } else {
                M0(viewD, c0.v(true, this.m, this.k, E() + D(), ((ViewGroup.MarginLayoutParams) t0Var).width), c0.v(false, this.t, this.l, 0, ((ViewGroup.MarginLayoutParams) t0Var).height));
            }
            if (pVar.e == 1) {
                iH = uVar.i(iL);
                iK = this.q.h(viewD) + iH;
            } else {
                iK = uVar.k(iL);
                iH = iK - this.q.h(viewD);
            }
            int i16 = pVar.e;
            androidx.collection.u uVar5 = t0Var.e;
            if (i16 == 1) {
                uVar5.getClass();
                t0 t0Var2 = (t0) viewD.getLayoutParams();
                t0Var2.e = uVar5;
                ArrayList arrayList = (ArrayList) uVar5.f;
                arrayList.add(viewD);
                uVar5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    uVar5.b = Integer.MIN_VALUE;
                }
                if (t0Var2.a.h() || t0Var2.a.k()) {
                    uVar5.d = ((StaggeredGridLayoutManager) uVar5.g).q.h(viewD) + uVar5.d;
                }
            } else {
                uVar5.getClass();
                t0 t0Var3 = (t0) viewD.getLayoutParams();
                t0Var3.e = uVar5;
                ArrayList arrayList2 = (ArrayList) uVar5.f;
                arrayList2.add(0, viewD);
                uVar5.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    uVar5.c = Integer.MIN_VALUE;
                }
                if (t0Var3.a.h() || t0Var3.a.k()) {
                    uVar5.d = ((StaggeredGridLayoutManager) uVar5.g).q.h(viewD) + uVar5.d;
                }
            }
            if (L0() && this.s == 1) {
                iH2 = this.r.l() - (((this.o - 1) - uVar.e) * this.t);
                iQ = iH2 - this.r.h(viewD);
            } else {
                iQ = this.r.q() + (uVar.e * this.t);
                iH2 = this.r.h(viewD) + iQ;
            }
            if (this.s == 1) {
                c0.M(viewD, iQ, iH, iH2, iK);
            } else {
                c0.M(viewD, iH, iQ, iK, iH2);
            }
            X0(uVar, pVar2.e, i6);
            Q0(i0Var, pVar2);
            if (pVar2.h && viewD.hasFocusable()) {
                this.x.set(uVar.e, false);
            }
            i5 = 1;
            z2 = true;
            i4 = 0;
        }
        if (!z2) {
            Q0(i0Var, pVar2);
        }
        int i17 = pVar2.e;
        androidx.emoji2.text.g gVar3 = this.q;
        int iQ3 = i17 == -1 ? this.q.q() - I0(gVar3.q()) : H0(gVar3.l()) - this.q.l();
        if (iQ3 > 0) {
            return Math.min(pVar.b, iQ3);
        }
        return 0;
    }

    public final View B0(boolean z) {
        int iQ = this.q.q();
        int iL = this.q.l();
        View view = null;
        for (int iU = u() - 1; iU >= 0; iU--) {
            View viewT = t(iU);
            int iJ = this.q.j(viewT);
            int iG = this.q.g(viewT);
            if (iG > iQ && iJ < iL) {
                if (iG <= iL || !z) {
                    return viewT;
                }
                if (view == null) {
                    view = viewT;
                }
            }
        }
        return view;
    }

    public final View C0(boolean z) {
        int iQ = this.q.q();
        int iL = this.q.l();
        int iU = u();
        View view = null;
        for (int i = 0; i < iU; i++) {
            View viewT = t(i);
            int iJ = this.q.j(viewT);
            if (this.q.g(viewT) > iQ && iJ < iL) {
                if (iJ >= iQ || !z) {
                    return viewT;
                }
                if (view == null) {
                    view = viewT;
                }
            }
        }
        return view;
    }

    public final void D0(i0 i0Var, l0 l0Var, boolean z) {
        int iL;
        int iH0 = H0(Integer.MIN_VALUE);
        if (iH0 != Integer.MIN_VALUE && (iL = this.q.l() - iH0) > 0) {
            int i = iL - (-U0(-iL, i0Var, l0Var));
            if (!z || i <= 0) {
                return;
            }
            this.q.u(i);
        }
    }

    public final void E0(i0 i0Var, l0 l0Var, boolean z) {
        int iQ;
        int iI0 = I0(Integer.MAX_VALUE);
        if (iI0 != Integer.MAX_VALUE && (iQ = iI0 - this.q.q()) > 0) {
            int iU0 = iQ - U0(iQ, i0Var, l0Var);
            if (!z || iU0 <= 0) {
                return;
            }
            this.q.u(-iU0);
        }
    }

    public final int F0() {
        if (u() == 0) {
            return 0;
        }
        return c0.G(t(0));
    }

    public final int G0() {
        int iU = u();
        if (iU == 0) {
            return 0;
        }
        return c0.G(t(iU - 1));
    }

    public final int H0(int i) {
        int i2 = this.p[0].i(i);
        for (int i3 = 1; i3 < this.o; i3++) {
            int i4 = this.p[i3].i(i);
            if (i4 > i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    public final int I0(int i) {
        int iK = this.p[0].k(i);
        for (int i2 = 1; i2 < this.o; i2++) {
            int iK2 = this.p[i2].k(i);
            if (iK2 < iK) {
                iK = iK2;
            }
        }
        return iK;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0039  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050 A[LOOP:0: B:25:0x003f->B:29:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[EDGE_INSN: B:30:0x0053->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077 A[LOOP:1: B:34:0x0066->B:38:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0096  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00be  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0054 A[EDGE_INSN: B:65:0x0054->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x007b A[EDGE_INSN: B:67:0x007b->B:40:0x007b BREAK  A[LOOP:1: B:34:0x0066->B:38:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public final void J0(int i, int i2, int i3) {
        int i4;
        int i5;
        androidx.media3.common.util.b bVar;
        int[] iArr;
        int iG0;
        ArrayList arrayList;
        u0 u0Var;
        int size;
        int i6;
        int i7;
        int size2;
        int[] iArr2;
        int iG1 = this.w ? G0() : F0();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            bVar = this.A;
            iArr = (int[]) bVar.y;
            if (iArr != null && i5 < iArr.length) {
                arrayList = (ArrayList) bVar.z;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                u0Var = null;
                                break;
                            }
                            u0Var = (u0) ((ArrayList) bVar.z).get(size2);
                            if (u0Var.e == i5) {
                                break;
                            } else {
                                size2--;
                            }
                        }
                    } else {
                        u0Var = null;
                        break;
                    }
                    if (u0Var != null) {
                        ((ArrayList) bVar.z).remove(u0Var);
                    }
                    size = ((ArrayList) bVar.z).size();
                    i6 = 0;
                    while (true) {
                        if (i6 < size) {
                            i6 = -1;
                            break;
                        } else if (((u0) ((ArrayList) bVar.z).get(i6)).e >= i5) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 != -1) {
                        u0 u0Var2 = (u0) ((ArrayList) bVar.z).get(i6);
                        ((ArrayList) bVar.z).remove(i6);
                        i7 = u0Var2.e;
                    } else {
                        i7 = -1;
                    }
                } else {
                    i7 = -1;
                }
                iArr2 = (int[]) bVar.y;
                if (i7 == -1) {
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = ((int[]) bVar.y).length;
                } else {
                    Arrays.fill((int[]) bVar.y, i5, Math.min(i7 + 1, iArr2.length), -1);
                }
            }
            if (i3 != 1) {
                bVar.B(i, i2);
            } else if (i3 != 2) {
                bVar.D(i, i2);
            } else if (i3 == 8) {
                bVar.D(i, 1);
                bVar.B(i2, 1);
            }
            if (i4 <= iG1) {
                return;
            }
            if (this.w) {
                iG0 = F0();
            } else {
                iG0 = G0();
            }
            if (i5 <= iG0) {
                m0();
            }
        }
        i4 = i + i2;
        i5 = i;
        bVar = this.A;
        iArr = (int[]) bVar.y;
        if (iArr != null) {
            arrayList = (ArrayList) bVar.z;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            u0Var = null;
                            break;
                        }
                        u0Var = (u0) ((ArrayList) bVar.z).get(size2);
                        if (u0Var.e == i5) {
                            break;
                            break;
                        }
                        size2--;
                    }
                } else {
                    u0Var = null;
                    break;
                }
                if (u0Var != null) {
                    ((ArrayList) bVar.z).remove(u0Var);
                }
                size = ((ArrayList) bVar.z).size();
                i6 = 0;
                while (true) {
                    if (i6 < size) {
                        i6 = -1;
                        break;
                    } else {
                        if (((u0) ((ArrayList) bVar.z).get(i6)).e >= i5) {
                            break;
                            break;
                        }
                        i6++;
                    }
                }
                if (i6 != -1) {
                    u0 u0Var3 = (u0) ((ArrayList) bVar.z).get(i6);
                    ((ArrayList) bVar.z).remove(i6);
                    i7 = u0Var3.e;
                } else {
                    i7 = -1;
                }
            } else {
                i7 = -1;
            }
            iArr2 = (int[]) bVar.y;
            if (i7 == -1) {
                Arrays.fill(iArr2, i5, iArr2.length, -1);
                int length2 = ((int[]) bVar.y).length;
            } else {
                Arrays.fill((int[]) bVar.y, i5, Math.min(i7 + 1, iArr2.length), -1);
            }
        }
        if (i3 != 1) {
            bVar.B(i, i2);
        } else if (i3 != 2) {
            bVar.D(i, i2);
        } else if (i3 == 8) {
            bVar.D(i, 1);
            bVar.B(i2, 1);
        }
        if (i4 <= iG1) {
            return;
        }
        if (this.w) {
            iG0 = F0();
        } else {
            iG0 = G0();
        }
        if (i5 <= iG0) {
            m0();
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final boolean K() {
        return this.B != 0;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002c A[SYNTHETIC] */
    public final View K0() {
        boolean z;
        boolean z2;
        int iU = u();
        int i = iU - 1;
        BitSet bitSet = new BitSet(this.o);
        bitSet.set(0, this.o, true);
        byte b = (this.s == 1 && L0()) ? (byte) 1 : (byte) -1;
        if (this.w) {
            iU = -1;
        } else {
            i = 0;
        }
        int i2 = i < iU ? 1 : -1;
        while (i != iU) {
            View viewT = t(i);
            t0 t0Var = (t0) viewT.getLayoutParams();
            if (bitSet.get(t0Var.e.e)) {
                androidx.collection.u uVar = t0Var.e;
                if (this.w) {
                    int i3 = uVar.c;
                    if (i3 == Integer.MIN_VALUE) {
                        uVar.a();
                        i3 = uVar.c;
                    }
                    if (i3 < this.q.l()) {
                        ((t0) ((View) androidx.privacysandbox.ads.adservices.java.internal.a.j(1, (ArrayList) uVar.f)).getLayoutParams()).getClass();
                        return viewT;
                    }
                } else {
                    int i4 = uVar.b;
                    ArrayList arrayList = (ArrayList) uVar.f;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        t0 t0Var2 = (t0) view.getLayoutParams();
                        uVar.b = ((StaggeredGridLayoutManager) uVar.g).q.j(view);
                        t0Var2.getClass();
                        i4 = uVar.b;
                    }
                    if (i4 > this.q.q()) {
                        ((t0) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return viewT;
                    }
                }
                bitSet.clear(t0Var.e.e);
            }
            i += i2;
            if (i != iU) {
                View viewT2 = t(i);
                boolean z3 = this.w;
                androidx.emoji2.text.g gVar = this.q;
                if (z3) {
                    int iG = gVar.g(viewT);
                    int iG2 = this.q.g(viewT2);
                    if (iG >= iG2) {
                        if (iG == iG2) {
                            if (t0Var.e.e - ((t0) viewT2.getLayoutParams()).e.e < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z != z2) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewT;
                }
                int iJ = gVar.j(viewT);
                int iJ2 = this.q.j(viewT2);
                if (iJ <= iJ2) {
                    if (iJ == iJ2) {
                        if (t0Var.e.e - ((t0) viewT2.getLayoutParams()).e.e < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewT;
            }
        }
        return null;
    }

    public final boolean L0() {
        return B() == 1;
    }

    public final void M0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.F;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.H(view));
        }
        t0 t0Var = (t0) view.getLayoutParams();
        int iY0 = Y0(i, ((ViewGroup.MarginLayoutParams) t0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) t0Var).rightMargin + rect.right);
        int iY1 = Y0(i2, ((ViewGroup.MarginLayoutParams) t0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) t0Var).bottomMargin + rect.bottom);
        if (u0(view, iY0, iY1, t0Var)) {
            view.measure(iY0, iY1);
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final void N(int i) {
        super.N(i);
        for (int i2 = 0; i2 < this.o; i2++) {
            androidx.collection.u uVar = this.p[i2];
            int i3 = uVar.b;
            if (i3 != Integer.MIN_VALUE) {
                uVar.b = i3 + i;
            }
            int i4 = uVar.c;
            if (i4 != Integer.MIN_VALUE) {
                uVar.c = i4 + i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:254:0x040d  */
    /* JADX WARN: Code duplicated, block: B:265:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01f2 A[SYNTHETIC] */
    public final void N0(i0 i0Var, l0 l0Var, boolean z) {
        boolean z2;
        v0 v0Var;
        androidx.collection.u[] uVarArr;
        int iU;
        int i;
        int iG;
        int iG2;
        int iU2;
        int i2;
        boolean z3;
        v0 v0Var2 = this.E;
        s0 s0Var = this.G;
        if (!(v0Var2 == null && this.y == -1) && l0Var.b() == 0) {
            h0(i0Var);
            s0Var.a();
            return;
        }
        boolean z4 = s0Var.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = s0Var.g;
        boolean z5 = (z4 && this.y == -1 && this.E == null) ? false : true;
        androidx.media3.common.util.b bVar = this.A;
        if (z5) {
            s0Var.a();
            v0 v0Var3 = this.E;
            if (v0Var3 != null) {
                int i3 = v0Var3.z;
                if (i3 > 0) {
                    if (i3 == this.o) {
                        for (int i4 = 0; i4 < this.o; i4++) {
                            this.p[i4].b();
                            v0 v0Var4 = this.E;
                            int iL = v0Var4.A[i4];
                            if (iL != Integer.MIN_VALUE) {
                                boolean z6 = v0Var4.F;
                                androidx.emoji2.text.g gVar = this.q;
                                iL += z6 ? gVar.l() : gVar.q();
                            }
                            androidx.collection.u uVar = this.p[i4];
                            uVar.b = iL;
                            uVar.c = iL;
                        }
                    } else {
                        v0Var3.A = null;
                        v0Var3.z = 0;
                        v0Var3.B = 0;
                        v0Var3.C = null;
                        v0Var3.D = null;
                        v0Var3.e = v0Var3.y;
                    }
                }
                v0 v0Var5 = this.E;
                this.D = v0Var5.G;
                boolean z7 = v0Var5.E;
                b(null);
                v0 v0Var6 = this.E;
                if (v0Var6 != null && v0Var6.E != z7) {
                    v0Var6.E = z7;
                }
                this.v = z7;
                m0();
                T0();
                v0 v0Var7 = this.E;
                int i5 = v0Var7.e;
                if (i5 != -1) {
                    this.y = i5;
                    s0Var.c = v0Var7.F;
                } else {
                    s0Var.c = this.w;
                }
                if (v0Var7.B > 1) {
                    bVar.y = v0Var7.C;
                    bVar.z = v0Var7.D;
                }
            } else {
                T0();
                s0Var.c = this.w;
            }
            if (l0Var.g || (i2 = this.y) == -1) {
                if (this.C) {
                    int iB = l0Var.b();
                    iU2 = u() - 1;
                    while (true) {
                        if (iU2 < 0) {
                            iG2 = 0;
                            break;
                        }
                        iG2 = c0.G(t(iU2));
                        if (iG2 < 0 && iG2 < iB) {
                            break;
                        } else {
                            iU2--;
                        }
                    }
                } else {
                    int iB2 = l0Var.b();
                    iU = u();
                    i = 0;
                    while (true) {
                        if (i >= iU) {
                            iG2 = 0;
                            break;
                        }
                        iG = c0.G(t(i));
                        if (iG < 0 && iG < iB2) {
                            iG2 = iG;
                            break;
                        }
                        i++;
                    }
                }
                s0Var.a = iG2;
                s0Var.b = Integer.MIN_VALUE;
            } else if (i2 < 0 || i2 >= l0Var.b()) {
                this.y = -1;
                this.z = Integer.MIN_VALUE;
                if (this.C) {
                    int iB3 = l0Var.b();
                    iU2 = u() - 1;
                    while (true) {
                        if (iU2 < 0) {
                            iG2 = 0;
                            break;
                        } else {
                            iG2 = c0.G(t(iU2));
                            if (iG2 < 0) {
                            }
                            iU2--;
                        }
                    }
                } else {
                    int iB4 = l0Var.b();
                    iU = u();
                    i = 0;
                    while (true) {
                        if (i >= iU) {
                            iG2 = 0;
                            break;
                        } else {
                            iG = c0.G(t(i));
                            if (iG < 0) {
                            }
                            i++;
                        }
                    }
                }
                s0Var.a = iG2;
                s0Var.b = Integer.MIN_VALUE;
            } else {
                v0 v0Var8 = this.E;
                if (v0Var8 == null || v0Var8.e == -1 || v0Var8.z < 1) {
                    View viewP = p(this.y);
                    if (viewP != null) {
                        s0Var.a = this.w ? G0() : F0();
                        if (this.z != Integer.MIN_VALUE) {
                            boolean z8 = s0Var.c;
                            androidx.emoji2.text.g gVar2 = this.q;
                            if (z8) {
                                s0Var.b = (gVar2.l() - this.z) - this.q.g(viewP);
                            } else {
                                s0Var.b = (gVar2.q() + this.z) - this.q.j(viewP);
                            }
                        } else if (this.q.h(viewP) > this.q.r()) {
                            boolean z9 = s0Var.c;
                            androidx.emoji2.text.g gVar3 = this.q;
                            s0Var.b = z9 ? gVar3.l() : gVar3.q();
                        } else {
                            int iJ = this.q.j(viewP) - this.q.q();
                            if (iJ < 0) {
                                s0Var.b = -iJ;
                            } else {
                                int iL2 = this.q.l() - this.q.g(viewP);
                                if (iL2 < 0) {
                                    s0Var.b = iL2;
                                } else {
                                    s0Var.b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i6 = this.y;
                        s0Var.a = i6;
                        int i7 = this.z;
                        if (i7 == Integer.MIN_VALUE) {
                            if (u() != 0) {
                                if ((i6 < F0()) != this.w) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                            } else if (this.w) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            s0Var.c = z3;
                            androidx.emoji2.text.g gVar4 = staggeredGridLayoutManager.q;
                            s0Var.b = z3 ? gVar4.l() : gVar4.q();
                        } else {
                            boolean z10 = s0Var.c;
                            androidx.emoji2.text.g gVar5 = staggeredGridLayoutManager.q;
                            if (z10) {
                                s0Var.b = gVar5.l() - i7;
                            } else {
                                s0Var.b = gVar5.q() + i7;
                            }
                        }
                        s0Var.d = true;
                    }
                } else {
                    s0Var.b = Integer.MIN_VALUE;
                    s0Var.a = this.y;
                }
            }
            s0Var.e = true;
        }
        if (this.E == null && this.y == -1 && (s0Var.c != this.C || L0() != this.D)) {
            bVar.o();
            s0Var.d = true;
        }
        if (u() > 0 && ((v0Var = this.E) == null || v0Var.z < 1)) {
            if (s0Var.d) {
                for (int i8 = 0; i8 < this.o; i8++) {
                    this.p[i8].b();
                    int i9 = s0Var.b;
                    if (i9 != Integer.MIN_VALUE) {
                        androidx.collection.u uVar2 = this.p[i8];
                        uVar2.b = i9;
                        uVar2.c = i9;
                    }
                }
            } else if (z5 || s0Var.f == null) {
                int i10 = 0;
                while (true) {
                    int i11 = this.o;
                    uVarArr = this.p;
                    if (i10 >= i11) {
                        break;
                    }
                    androidx.collection.u uVar3 = uVarArr[i10];
                    boolean z11 = this.w;
                    int i12 = s0Var.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) uVar3.g;
                    int i13 = z11 ? uVar3.i(Integer.MIN_VALUE) : uVar3.k(Integer.MIN_VALUE);
                    uVar3.b();
                    if (i13 != Integer.MIN_VALUE && ((!z11 || i13 >= staggeredGridLayoutManager2.q.l()) && (z11 || i13 <= staggeredGridLayoutManager2.q.q()))) {
                        if (i12 != Integer.MIN_VALUE) {
                            i13 += i12;
                        }
                        uVar3.c = i13;
                        uVar3.b = i13;
                    }
                    i10++;
                }
                int length = uVarArr.length;
                int[] iArr = s0Var.f;
                if (iArr == null || iArr.length < length) {
                    s0Var.f = new int[staggeredGridLayoutManager.p.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    s0Var.f[i14] = uVarArr[i14].k(Integer.MIN_VALUE);
                }
            } else {
                for (int i15 = 0; i15 < this.o; i15++) {
                    androidx.collection.u uVar4 = this.p[i15];
                    uVar4.b();
                    int i16 = s0Var.f[i15];
                    uVar4.b = i16;
                    uVar4.c = i16;
                }
            }
        }
        o(i0Var);
        p pVar = this.u;
        pVar.a = false;
        int iR = this.r.r();
        this.t = iR / this.o;
        View.MeasureSpec.makeMeasureSpec(iR, this.r.o());
        W0(s0Var.a, l0Var);
        if (s0Var.c) {
            V0(-1);
            A0(i0Var, pVar, l0Var);
            V0(1);
            pVar.c = s0Var.a + pVar.d;
            A0(i0Var, pVar, l0Var);
        } else {
            V0(1);
            A0(i0Var, pVar, l0Var);
            V0(-1);
            pVar.c = s0Var.a + pVar.d;
            A0(i0Var, pVar, l0Var);
        }
        if (this.r.o() != 1073741824) {
            int iU3 = u();
            float fMax = 0.0f;
            for (int i17 = 0; i17 < iU3; i17++) {
                View viewT = t(i17);
                float fH = this.r.h(viewT);
                if (fH >= fMax) {
                    ((t0) viewT.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fH);
                }
            }
            int i18 = this.t;
            int iRound = Math.round(fMax * this.o);
            if (this.r.o() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.r.r());
            }
            this.t = iRound / this.o;
            View.MeasureSpec.makeMeasureSpec(iRound, this.r.o());
            if (this.t != i18) {
                for (int i19 = 0; i19 < iU3; i19++) {
                    View viewT2 = t(i19);
                    t0 t0Var = (t0) viewT2.getLayoutParams();
                    t0Var.getClass();
                    if (L0() && this.s == 1) {
                        int i20 = -((this.o - 1) - t0Var.e.e);
                        viewT2.offsetLeftAndRight((this.t * i20) - (i20 * i18));
                    } else {
                        int i21 = t0Var.e.e;
                        int i22 = this.t * i21;
                        int i23 = i21 * i18;
                        if (this.s == 1) {
                            viewT2.offsetLeftAndRight(i22 - i23);
                        } else {
                            viewT2.offsetTopAndBottom(i22 - i23);
                        }
                    }
                }
            }
        }
        if (u() > 0) {
            if (this.w) {
                D0(i0Var, l0Var, true);
                E0(i0Var, l0Var, false);
            } else {
                E0(i0Var, l0Var, true);
                D0(i0Var, l0Var, false);
            }
        }
        if (z && !l0Var.g && this.B != 0 && u() > 0 && K0() != null) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.J);
            }
            z2 = y0();
        }
        if (l0Var.g) {
            s0Var.a();
        }
        this.C = s0Var.c;
        this.D = L0();
        if (z2) {
            s0Var.a();
            N0(i0Var, l0Var, false);
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.o; i2++) {
            androidx.collection.u uVar = this.p[i2];
            int i3 = uVar.b;
            if (i3 != Integer.MIN_VALUE) {
                uVar.b = i3 + i;
            }
            int i4 = uVar.c;
            if (i4 != Integer.MIN_VALUE) {
                uVar.c = i4 + i;
            }
        }
    }

    public final boolean O0(int i) {
        if (this.s == 0) {
            return (i == -1) != this.w;
        }
        return ((i == -1) == this.w) == L0();
    }

    @Override // androidx.recyclerview.widget.c0
    public final void P() {
        this.A.o();
        for (int i = 0; i < this.o; i++) {
            this.p[i].b();
        }
    }

    public final void P0(int i, l0 l0Var) {
        int iF0;
        int i2;
        if (i > 0) {
            iF0 = G0();
            i2 = 1;
        } else {
            iF0 = F0();
            i2 = -1;
        }
        p pVar = this.u;
        pVar.a = true;
        W0(iF0, l0Var);
        V0(i2);
        pVar.c = iF0 + pVar.d;
        pVar.b = Math.abs(i);
    }

    public final void Q0(i0 i0Var, p pVar) {
        if (!pVar.a || pVar.i) {
            return;
        }
        int i = pVar.b;
        int i2 = pVar.e;
        if (i == 0) {
            if (i2 == -1) {
                R0(i0Var, pVar.g);
                return;
            } else {
                S0(i0Var, pVar.f);
                return;
            }
        }
        int i3 = 1;
        if (i2 == -1) {
            int i4 = pVar.f;
            int iK = this.p[0].k(i4);
            while (i3 < this.o) {
                int iK2 = this.p[i3].k(i4);
                if (iK2 > iK) {
                    iK = iK2;
                }
                i3++;
            }
            int i5 = i4 - iK;
            int iMin = pVar.g;
            if (i5 >= 0) {
                iMin -= Math.min(i5, pVar.b);
            }
            R0(i0Var, iMin);
            return;
        }
        int i6 = pVar.g;
        int i7 = this.p[0].i(i6);
        while (i3 < this.o) {
            int i8 = this.p[i3].i(i6);
            if (i8 < i7) {
                i7 = i8;
            }
            i3++;
        }
        int i9 = i7 - pVar.g;
        int iMin2 = pVar.f;
        if (i9 >= 0) {
            iMin2 += Math.min(i9, pVar.b);
        }
        S0(i0Var, iMin2);
    }

    @Override // androidx.recyclerview.widget.c0
    public final void R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.J);
        }
        for (int i = 0; i < this.o; i++) {
            this.p[i].b();
        }
        recyclerView.requestLayout();
    }

    public final void R0(i0 i0Var, int i) {
        for (int iU = u() - 1; iU >= 0; iU--) {
            View viewT = t(iU);
            if (this.q.j(viewT) < i || this.q.t(viewT) < i) {
                return;
            }
            t0 t0Var = (t0) viewT.getLayoutParams();
            t0Var.getClass();
            if (((ArrayList) t0Var.e.f).size() == 1) {
                return;
            }
            androidx.collection.u uVar = t0Var.e;
            ArrayList arrayList = (ArrayList) uVar.f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            t0 t0Var2 = (t0) view.getLayoutParams();
            t0Var2.e = null;
            if (t0Var2.a.h() || t0Var2.a.k()) {
                uVar.d -= ((StaggeredGridLayoutManager) uVar.g).q.h(view);
            }
            if (size == 1) {
                uVar.b = Integer.MIN_VALUE;
            }
            uVar.c = Integer.MIN_VALUE;
            j0(viewT, i0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0048  */
    /* JADX WARN: Code duplicated, block: B:37:0x0053  */
    @Override // androidx.recyclerview.widget.c0
    public final View S(View view, int i, i0 i0Var, l0 l0Var) {
        View viewY;
        int i2;
        if (u() != 0) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (viewY = recyclerView.y(view)) == null || ((ArrayList) this.a.A).contains(viewY)) {
                viewY = null;
            }
            if (viewY != null) {
                T0();
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? this.s == 0 : !(i != 130 || this.s != 1)) {
                                    i2 = 1;
                                }
                            } else if (this.s == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (this.s == 0) {
                            i2 = -1;
                        } else {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (this.s != 1 && L0()) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                } else if (this.s != 1 && L0()) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                if (i2 != Integer.MIN_VALUE) {
                    t0 t0Var = (t0) viewY.getLayoutParams();
                    t0Var.getClass();
                    androidx.collection.u uVar = t0Var.e;
                    int iG0 = i2 == 1 ? G0() : F0();
                    W0(iG0, l0Var);
                    V0(i2);
                    p pVar = this.u;
                    pVar.c = pVar.d + iG0;
                    pVar.b = (int) (this.q.r() * 0.33333334f);
                    pVar.h = true;
                    pVar.a = false;
                    A0(i0Var, pVar, l0Var);
                    this.C = this.w;
                    View viewJ = uVar.j(iG0, i2);
                    if (viewJ != null && viewJ != viewY) {
                        return viewJ;
                    }
                    if (O0(i2)) {
                        for (int i3 = this.o - 1; i3 >= 0; i3--) {
                            View viewJ2 = this.p[i3].j(iG0, i2);
                            if (viewJ2 != null && viewJ2 != viewY) {
                                return viewJ2;
                            }
                        }
                    } else {
                        for (int i4 = 0; i4 < this.o; i4++) {
                            View viewJ3 = this.p[i4].j(iG0, i2);
                            if (viewJ3 != null && viewJ3 != viewY) {
                                return viewJ3;
                            }
                        }
                    }
                    boolean z = (this.v ^ true) == (i2 == -1);
                    View viewP = p(z ? uVar.e() : uVar.f());
                    if (viewP != null && viewP != viewY) {
                        return viewP;
                    }
                    if (O0(i2)) {
                        for (int i5 = this.o - 1; i5 >= 0; i5--) {
                            if (i5 != uVar.e) {
                                androidx.collection.u[] uVarArr = this.p;
                                View viewP2 = p(z ? uVarArr[i5].e() : uVarArr[i5].f());
                                if (viewP2 != null && viewP2 != viewY) {
                                    return viewP2;
                                }
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < this.o; i6++) {
                            androidx.collection.u[] uVarArr2 = this.p;
                            View viewP3 = p(z ? uVarArr2[i6].e() : uVarArr2[i6].f());
                            if (viewP3 != null && viewP3 != viewY) {
                                return viewP3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void S0(i0 i0Var, int i) {
        while (u() > 0) {
            View viewT = t(0);
            if (this.q.g(viewT) > i || this.q.s(viewT) > i) {
                return;
            }
            t0 t0Var = (t0) viewT.getLayoutParams();
            t0Var.getClass();
            if (((ArrayList) t0Var.e.f).size() == 1) {
                return;
            }
            androidx.collection.u uVar = t0Var.e;
            ArrayList arrayList = (ArrayList) uVar.f;
            View view = (View) arrayList.remove(0);
            t0 t0Var2 = (t0) view.getLayoutParams();
            t0Var2.e = null;
            if (arrayList.size() == 0) {
                uVar.c = Integer.MIN_VALUE;
            }
            if (t0Var2.a.h() || t0Var2.a.k()) {
                uVar.d -= ((StaggeredGridLayoutManager) uVar.g).q.h(view);
            }
            uVar.b = Integer.MIN_VALUE;
            j0(viewT, i0Var);
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (u() > 0) {
            View viewC0 = C0(false);
            View viewB0 = B0(false);
            if (viewC0 == null || viewB0 == null) {
                return;
            }
            int iG = c0.G(viewC0);
            int iG2 = c0.G(viewB0);
            if (iG < iG2) {
                accessibilityEvent.setFromIndex(iG);
                accessibilityEvent.setToIndex(iG2);
            } else {
                accessibilityEvent.setFromIndex(iG2);
                accessibilityEvent.setToIndex(iG);
            }
        }
    }

    public final void T0() {
        if (this.s == 1 || !L0()) {
            this.w = this.v;
        } else {
            this.w = !this.v;
        }
    }

    public final int U0(int i, i0 i0Var, l0 l0Var) {
        if (u() == 0 || i == 0) {
            return 0;
        }
        P0(i, l0Var);
        p pVar = this.u;
        int iA0 = A0(i0Var, pVar, l0Var);
        if (pVar.b >= iA0) {
            i = i < 0 ? -iA0 : iA0;
        }
        this.q.u(-i);
        this.C = this.w;
        pVar.b = 0;
        Q0(i0Var, pVar);
        return i;
    }

    public final void V0(int i) {
        p pVar = this.u;
        pVar.e = i;
        pVar.d = this.w != (i == -1) ? -1 : 1;
    }

    public final void W0(int i, l0 l0Var) {
        p pVar = this.u;
        boolean z = false;
        pVar.b = 0;
        pVar.c = i;
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.E) {
            pVar.g = this.q.k() + 0;
            pVar.f = -0;
        } else {
            pVar.f = this.q.q() - 0;
            pVar.g = this.q.l() + 0;
        }
        pVar.h = false;
        pVar.a = true;
        if (this.q.o() == 0 && this.q.k() == 0) {
            z = true;
        }
        pVar.i = z;
    }

    @Override // androidx.recyclerview.widget.c0
    public final void X(int i, int i2) {
        J0(i, i2, 1);
    }

    public final void X0(androidx.collection.u uVar, int i, int i2) {
        int i3 = uVar.d;
        int i4 = uVar.e;
        if (i != -1) {
            int i5 = uVar.c;
            if (i5 == Integer.MIN_VALUE) {
                uVar.a();
                i5 = uVar.c;
            }
            if (i5 - i3 >= i2) {
                this.x.set(i4, false);
                return;
            }
            return;
        }
        int i6 = uVar.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) uVar.f).get(0);
            t0 t0Var = (t0) view.getLayoutParams();
            uVar.b = ((StaggeredGridLayoutManager) uVar.g).q.j(view);
            t0Var.getClass();
            i6 = uVar.b;
        }
        if (i6 + i3 <= i2) {
            this.x.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final void Y() {
        this.A.o();
        m0();
    }

    @Override // androidx.recyclerview.widget.c0
    public final void Z(int i, int i2) {
        J0(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.c0
    public final void a0(int i, int i2) {
        J0(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.c0
    public final void b(String str) {
        if (this.E == null) {
            super.b(str);
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final void b0(int i, int i2) {
        J0(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.c0
    public final boolean c() {
        return this.s == 0;
    }

    @Override // androidx.recyclerview.widget.c0
    public final void c0(i0 i0Var, l0 l0Var) {
        N0(i0Var, l0Var, true);
    }

    @Override // androidx.recyclerview.widget.c0
    public final boolean d() {
        return this.s == 1;
    }

    @Override // androidx.recyclerview.widget.c0
    public final void d0(l0 l0Var) {
        this.y = -1;
        this.z = Integer.MIN_VALUE;
        this.E = null;
        this.G.a();
    }

    @Override // androidx.recyclerview.widget.c0
    public final boolean e(d0 d0Var) {
        return d0Var instanceof t0;
    }

    @Override // androidx.recyclerview.widget.c0
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof v0) {
            v0 v0Var = (v0) parcelable;
            this.E = v0Var;
            if (this.y != -1) {
                v0Var.e = -1;
                v0Var.y = -1;
                v0Var.A = null;
                v0Var.z = 0;
                v0Var.B = 0;
                v0Var.C = null;
                v0Var.D = null;
            }
            m0();
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final Parcelable f0() {
        int iK;
        int iQ;
        int[] iArr;
        v0 v0Var = this.E;
        if (v0Var != null) {
            v0 v0Var2 = new v0();
            v0Var2.z = v0Var.z;
            v0Var2.e = v0Var.e;
            v0Var2.y = v0Var.y;
            v0Var2.A = v0Var.A;
            v0Var2.B = v0Var.B;
            v0Var2.C = v0Var.C;
            v0Var2.E = v0Var.E;
            v0Var2.F = v0Var.F;
            v0Var2.G = v0Var.G;
            v0Var2.D = v0Var.D;
            return v0Var2;
        }
        v0 v0Var3 = new v0();
        v0Var3.E = this.v;
        v0Var3.F = this.C;
        v0Var3.G = this.D;
        androidx.media3.common.util.b bVar = this.A;
        if (bVar == null || (iArr = (int[]) bVar.y) == null) {
            v0Var3.B = 0;
        } else {
            v0Var3.C = iArr;
            v0Var3.B = iArr.length;
            v0Var3.D = (ArrayList) bVar.z;
        }
        if (u() <= 0) {
            v0Var3.e = -1;
            v0Var3.y = -1;
            v0Var3.z = 0;
            return v0Var3;
        }
        v0Var3.e = this.C ? G0() : F0();
        View viewB0 = this.w ? B0(true) : C0(true);
        v0Var3.y = viewB0 != null ? c0.G(viewB0) : -1;
        int i = this.o;
        v0Var3.z = i;
        v0Var3.A = new int[i];
        for (int i2 = 0; i2 < this.o; i2++) {
            boolean z = this.C;
            androidx.collection.u[] uVarArr = this.p;
            if (z) {
                iK = uVarArr[i2].i(Integer.MIN_VALUE);
                if (iK != Integer.MIN_VALUE) {
                    iQ = this.q.l();
                    iK -= iQ;
                }
            } else {
                iK = uVarArr[i2].k(Integer.MIN_VALUE);
                if (iK != Integer.MIN_VALUE) {
                    iQ = this.q.q();
                    iK -= iQ;
                }
            }
            v0Var3.A[i2] = iK;
        }
        return v0Var3;
    }

    @Override // androidx.recyclerview.widget.c0
    public final void g(int i, int i2, l0 l0Var, androidx.media3.common.util.e eVar) {
        p pVar;
        int i3;
        int iK;
        if (this.s != 0) {
            i = i2;
        }
        if (u() == 0 || i == 0) {
            return;
        }
        P0(i, l0Var);
        int[] iArr = this.I;
        if (iArr == null || iArr.length < this.o) {
            this.I = new int[this.o];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.o;
            pVar = this.u;
            if (i4 >= i6) {
                break;
            }
            if (pVar.d == -1) {
                i3 = pVar.f;
                iK = this.p[i4].k(i3);
            } else {
                i3 = this.p[i4].i(pVar.g);
                iK = pVar.g;
            }
            int i7 = i3 - iK;
            if (i7 >= 0) {
                this.I[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.I, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = pVar.c;
            if (i9 < 0 || i9 >= l0Var.b()) {
                return;
            }
            eVar.b(pVar.c, this.I[i8]);
            pVar.c += pVar.d;
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final void g0(int i) {
        if (i == 0) {
            y0();
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final int i(l0 l0Var) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return org.jsoup.helper.n.g(l0Var, this.q, C0(z), B0(z), this, this.H);
    }

    @Override // androidx.recyclerview.widget.c0
    public final int j(l0 l0Var) {
        return z0(l0Var);
    }

    @Override // androidx.recyclerview.widget.c0
    public final int k(l0 l0Var) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return org.jsoup.helper.n.i(l0Var, this.q, C0(z), B0(z), this, this.H);
    }

    @Override // androidx.recyclerview.widget.c0
    public final int l(l0 l0Var) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return org.jsoup.helper.n.g(l0Var, this.q, C0(z), B0(z), this, this.H);
    }

    @Override // androidx.recyclerview.widget.c0
    public final int m(l0 l0Var) {
        return z0(l0Var);
    }

    @Override // androidx.recyclerview.widget.c0
    public final int n(l0 l0Var) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return org.jsoup.helper.n.i(l0Var, this.q, C0(z), B0(z), this, this.H);
    }

    @Override // androidx.recyclerview.widget.c0
    public final int n0(int i, i0 i0Var, l0 l0Var) {
        return U0(i, i0Var, l0Var);
    }

    @Override // androidx.recyclerview.widget.c0
    public final int o0(int i, i0 i0Var, l0 l0Var) {
        return U0(i, i0Var, l0Var);
    }

    @Override // androidx.recyclerview.widget.c0
    public final d0 q() {
        return this.s == 0 ? new t0(-2, -1) : new t0(-1, -2);
    }

    @Override // androidx.recyclerview.widget.c0
    public final d0 r(Context context, AttributeSet attributeSet) {
        return new t0(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.c0
    public final void r0(Rect rect, int i, int i2) {
        int iF;
        int iF2;
        int iE = E() + D();
        int iC = C() + F();
        int i3 = this.s;
        int i4 = this.o;
        if (i3 == 1) {
            int iHeight = rect.height() + iC;
            RecyclerView recyclerView = this.b;
            Field field = androidx.core.view.s0.a;
            iF2 = c0.f(i2, iHeight, recyclerView.getMinimumHeight());
            iF = c0.f(i, (this.t * i4) + iE, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iE;
            RecyclerView recyclerView2 = this.b;
            Field field2 = androidx.core.view.s0.a;
            iF = c0.f(i, iWidth, recyclerView2.getMinimumWidth());
            iF2 = c0.f(i2, (this.t * i4) + iC, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iF, iF2);
    }

    @Override // androidx.recyclerview.widget.c0
    public final d0 s(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new t0((ViewGroup.MarginLayoutParams) layoutParams) : new t0(layoutParams);
    }

    @Override // androidx.recyclerview.widget.c0
    public final boolean x0() {
        return this.E == null;
    }

    public final boolean y0() {
        int iF0;
        if (u() != 0 && this.B != 0 && this.f) {
            if (this.w) {
                iF0 = G0();
                F0();
            } else {
                iF0 = F0();
                G0();
            }
            if (iF0 == 0 && K0() != null) {
                this.A.o();
                this.e = true;
                m0();
                return true;
            }
        }
        return false;
    }

    public final int z0(l0 l0Var) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return org.jsoup.helper.n.h(l0Var, this.q, C0(z), B0(z), this, this.H, this.w);
    }
}
