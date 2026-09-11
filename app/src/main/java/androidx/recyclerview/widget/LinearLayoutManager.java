package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends c0 {
    public final androidx.media3.exoplayer.audio.l A;
    public final int B;
    public final int[] C;
    public int o;
    public q p;
    public androidx.emoji2.text.g q;
    public boolean r;
    public final boolean s;
    public boolean t;
    public boolean u;
    public final boolean v;
    public int w;
    public int x;
    public r y;
    public final androidx.media3.exoplayer.h0 z;

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.o = 1;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = true;
        this.w = -1;
        this.x = Integer.MIN_VALUE;
        this.y = null;
        this.z = new androidx.media3.exoplayer.h0();
        this.A = new androidx.media3.exoplayer.audio.l();
        this.B = 2;
        this.C = new int[2];
        b0 b0VarH = c0.H(context, attributeSet, i, i2);
        W0(b0VarH.a);
        boolean z = b0VarH.c;
        b(null);
        if (z != this.s) {
            this.s = z;
            m0();
        }
        X0(b0VarH.d);
    }

    public final int A0(l0 l0Var) {
        if (u() == 0) {
            return 0;
        }
        E0();
        androidx.emoji2.text.g gVar = this.q;
        boolean z = !this.v;
        return org.jsoup.helper.n.g(l0Var, gVar, H0(z), G0(z), this, this.v);
    }

    public final int B0(l0 l0Var) {
        if (u() == 0) {
            return 0;
        }
        E0();
        androidx.emoji2.text.g gVar = this.q;
        boolean z = !this.v;
        return org.jsoup.helper.n.h(l0Var, gVar, H0(z), G0(z), this, this.v, this.t);
    }

    public final int C0(l0 l0Var) {
        if (u() == 0) {
            return 0;
        }
        E0();
        androidx.emoji2.text.g gVar = this.q;
        boolean z = !this.v;
        return org.jsoup.helper.n.i(l0Var, gVar, H0(z), G0(z), this, this.v);
    }

    public final int D0(int i) {
        if (i == 1) {
            return (this.o != 1 && P0()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.o != 1 && P0()) ? -1 : 1;
        }
        if (i == 17) {
            return this.o == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.o == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.o == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.o == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void E0() {
        if (this.p == null) {
            q qVar = new q();
            qVar.a = true;
            qVar.h = 0;
            qVar.i = 0;
            qVar.k = null;
            this.p = qVar;
        }
    }

    public final int F0(i0 i0Var, q qVar, l0 l0Var, boolean z) {
        int i;
        int i2 = qVar.c;
        int i3 = qVar.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                qVar.g = i3 + i2;
            }
            S0(i0Var, qVar);
        }
        int i4 = qVar.c + qVar.h;
        while (true) {
            if ((!qVar.l && i4 <= 0) || (i = qVar.d) < 0 || i >= l0Var.b()) {
                break;
            }
            androidx.media3.exoplayer.audio.l lVar = this.A;
            lVar.a = 0;
            lVar.b = false;
            lVar.c = false;
            lVar.d = false;
            Q0(i0Var, l0Var, qVar, lVar);
            if (!lVar.b) {
                int i5 = qVar.b;
                int i6 = lVar.a;
                qVar.b = (qVar.f * i6) + i5;
                if (!lVar.c || qVar.k != null || !l0Var.g) {
                    qVar.c -= i6;
                    i4 -= i6;
                }
                int i7 = qVar.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    qVar.g = i8;
                    int i9 = qVar.c;
                    if (i9 < 0) {
                        qVar.g = i8 + i9;
                    }
                    S0(i0Var, qVar);
                }
                if (z && lVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - qVar.c;
    }

    public final View G0(boolean z) {
        return this.t ? J0(0, u(), z) : J0(u() - 1, -1, z);
    }

    public final View H0(boolean z) {
        return this.t ? J0(u() - 1, -1, z) : J0(0, u(), z);
    }

    public final View I0(int i, int i2) {
        int i3;
        int i4;
        E0();
        if (i2 <= i && i2 >= i) {
            return t(i);
        }
        if (this.q.j(t(i)) < this.q.q()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.o == 0 ? this.c.u(i, i2, i3, i4) : this.d.u(i, i2, i3, i4);
    }

    public final View J0(int i, int i2, boolean z) {
        E0();
        int i3 = z ? 24579 : 320;
        return this.o == 0 ? this.c.u(i, i2, i3, 320) : this.d.u(i, i2, i3, 320);
    }

    @Override // androidx.recyclerview.widget.c0
    public final boolean K() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View K0(i0 i0Var, l0 l0Var, boolean z, boolean z2) {
        int i;
        int iU;
        int i2;
        E0();
        int iU2 = u();
        if (z2) {
            iU = u() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iU2;
            iU = 0;
            i2 = 1;
        }
        int iB = l0Var.b();
        int iQ = this.q.q();
        int iL = this.q.l();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iU != i) {
            View viewT = t(iU);
            int iG = c0.G(viewT);
            int iJ = this.q.j(viewT);
            int iG2 = this.q.g(viewT);
            if (iG >= 0 && iG < iB) {
                if (!((d0) viewT.getLayoutParams()).a.h()) {
                    boolean z3 = iG2 <= iQ && iJ < iQ;
                    boolean z4 = iJ >= iL && iG2 > iL;
                    if (!z3 && !z4) {
                        return viewT;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewT;
                        } else if (view == null) {
                            view = viewT;
                        }
                    } else if (z3) {
                        view2 = viewT;
                    } else if (view == null) {
                        view = viewT;
                    }
                } else if (view3 == null) {
                    view3 = viewT;
                }
            }
            iU += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    public final int L0(int i, i0 i0Var, l0 l0Var, boolean z) {
        int iL;
        int iL2 = this.q.l() - i;
        if (iL2 <= 0) {
            return 0;
        }
        int i2 = -V0(-iL2, i0Var, l0Var);
        int i3 = i + i2;
        if (!z || (iL = this.q.l() - i3) <= 0) {
            return i2;
        }
        this.q.u(iL);
        return iL + i2;
    }

    public final int M0(int i, i0 i0Var, l0 l0Var, boolean z) {
        int iQ;
        int iQ2 = i - this.q.q();
        if (iQ2 <= 0) {
            return 0;
        }
        int i2 = -V0(iQ2, i0Var, l0Var);
        int i3 = i + i2;
        if (!z || (iQ = i3 - this.q.q()) <= 0) {
            return i2;
        }
        this.q.u(-iQ);
        return i2 - iQ;
    }

    public final View N0() {
        return t(this.t ? 0 : u() - 1);
    }

    public final View O0() {
        return t(this.t ? u() - 1 : 0);
    }

    public final boolean P0() {
        return B() == 1;
    }

    public void Q0(i0 i0Var, l0 l0Var, q qVar, androidx.media3.exoplayer.audio.l lVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int iD;
        View viewB = qVar.b(i0Var);
        if (viewB == null) {
            lVar.b = true;
            return;
        }
        d0 d0Var = (d0) viewB.getLayoutParams();
        List list = qVar.k;
        boolean z = this.t;
        int i5 = qVar.f;
        if (list == null) {
            if (z == (i5 == -1)) {
                a(viewB, -1, false);
            } else {
                a(viewB, 0, false);
            }
        } else {
            if (z == (i5 == -1)) {
                a(viewB, -1, true);
            } else {
                a(viewB, 0, true);
            }
        }
        d0 d0Var2 = (d0) viewB.getLayoutParams();
        Rect rectH = this.b.H(viewB);
        int i6 = rectH.left + rectH.right;
        int i7 = rectH.top + rectH.bottom;
        int iV = c0.v(c(), this.m, this.k, E() + D() + ((ViewGroup.MarginLayoutParams) d0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) d0Var2).rightMargin + i6, ((ViewGroup.MarginLayoutParams) d0Var2).width);
        int iV2 = c0.v(d(), this.n, this.l, C() + F() + ((ViewGroup.MarginLayoutParams) d0Var2).topMargin + ((ViewGroup.MarginLayoutParams) d0Var2).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) d0Var2).height);
        if (u0(viewB, iV, iV2, d0Var2)) {
            viewB.measure(iV, iV2);
        }
        lVar.a = this.q.h(viewB);
        if (this.o == 1) {
            if (P0()) {
                i4 = this.m - E();
                iD = i4 - this.q.i(viewB);
            } else {
                iD = D();
                i4 = this.q.i(viewB) + iD;
            }
            int i8 = qVar.f;
            i3 = qVar.b;
            int i9 = lVar.a;
            if (i8 == -1) {
                int i10 = iD;
                i = i3;
                i3 -= i9;
                i2 = i10;
            } else {
                i2 = iD;
                i = i9 + i3;
            }
        } else {
            int iF = F();
            i = this.q.i(viewB) + iF;
            int i11 = qVar.f;
            int i12 = qVar.b;
            int i13 = lVar.a;
            if (i11 == -1) {
                i2 = i12 - i13;
                i4 = i12;
                i3 = iF;
            } else {
                int i14 = i12 + i13;
                i2 = i12;
                i3 = iF;
                i4 = i14;
            }
        }
        c0.M(viewB, i2, i3, i4, i);
        if (d0Var.a.h() || d0Var.a.k()) {
            lVar.c = true;
        }
        lVar.d = viewB.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.c0
    public View S(View view, int i, i0 i0Var, l0 l0Var) {
        int iD0;
        View viewI0;
        U0();
        if (u() != 0 && (iD0 = D0(i)) != Integer.MIN_VALUE) {
            E0();
            Y0(iD0, (int) (this.q.r() * 0.33333334f), false, l0Var);
            q qVar = this.p;
            qVar.g = Integer.MIN_VALUE;
            qVar.a = false;
            F0(i0Var, qVar, l0Var, true);
            boolean z = this.t;
            if (iD0 == -1) {
                viewI0 = z ? I0(u() - 1, -1) : I0(0, u());
            } else {
                viewI0 = z ? I0(0, u()) : I0(u() - 1, -1);
            }
            View viewO0 = iD0 == -1 ? O0() : N0();
            if (!viewO0.hasFocusable()) {
                return viewI0;
            }
            if (viewI0 != null) {
                return viewO0;
            }
        }
        return null;
    }

    public final void S0(i0 i0Var, q qVar) {
        if (!qVar.a || qVar.l) {
            return;
        }
        int i = qVar.g;
        int i2 = qVar.i;
        if (qVar.f == -1) {
            int iU = u();
            if (i < 0) {
                return;
            }
            int iK = (this.q.k() - i) + i2;
            if (this.t) {
                for (int i3 = 0; i3 < iU; i3++) {
                    View viewT = t(i3);
                    if (this.q.j(viewT) < iK || this.q.t(viewT) < iK) {
                        T0(i0Var, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iU - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewT2 = t(i5);
                if (this.q.j(viewT2) < iK || this.q.t(viewT2) < iK) {
                    T0(i0Var, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iU2 = u();
        if (!this.t) {
            for (int i7 = 0; i7 < iU2; i7++) {
                View viewT3 = t(i7);
                if (this.q.g(viewT3) > i6 || this.q.s(viewT3) > i6) {
                    T0(i0Var, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iU2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewT4 = t(i9);
            if (this.q.g(viewT4) > i6 || this.q.s(viewT4) > i6) {
                T0(i0Var, i8, i9);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (u() > 0) {
            View viewJ0 = J0(0, u(), false);
            accessibilityEvent.setFromIndex(viewJ0 == null ? -1 : c0.G(viewJ0));
            View viewJ1 = J0(u() - 1, -1, false);
            accessibilityEvent.setToIndex(viewJ1 != null ? c0.G(viewJ1) : -1);
        }
    }

    public final void T0(i0 i0Var, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewT = t(i);
                k0(i);
                i0Var.i(viewT);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewT2 = t(i3);
            k0(i3);
            i0Var.i(viewT2);
        }
    }

    public final void U0() {
        if (this.o == 1 || !P0()) {
            this.t = this.s;
        } else {
            this.t = !this.s;
        }
    }

    public final int V0(int i, i0 i0Var, l0 l0Var) {
        if (u() != 0 && i != 0) {
            E0();
            this.p.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            Y0(i2, iAbs, true, l0Var);
            q qVar = this.p;
            int iF0 = F0(i0Var, qVar, l0Var, false) + qVar.g;
            if (iF0 >= 0) {
                if (iAbs > iF0) {
                    i = i2 * iF0;
                }
                this.q.u(-i);
                this.p.j = i;
                return i;
            }
        }
        return 0;
    }

    public final void W0(int i) {
        if (i != 0 && i != 1) {
            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "invalid orientation:"));
            return;
        }
        b(null);
        if (i != this.o || this.q == null) {
            androidx.emoji2.text.g gVarD = androidx.emoji2.text.g.d(this, i);
            this.q = gVarD;
            this.z.f = gVarD;
            this.o = i;
            m0();
        }
    }

    public void X0(boolean z) {
        b(null);
        if (this.u == z) {
            return;
        }
        this.u = z;
        m0();
    }

    public final void Y0(int i, int i2, boolean z, l0 l0Var) {
        int iQ;
        this.p.l = this.q.o() == 0 && this.q.k() == 0;
        this.p.f = i;
        int[] iArr = this.C;
        iArr[0] = 0;
        iArr[1] = 0;
        y0(l0Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        q qVar = this.p;
        int i3 = z2 ? iMax2 : iMax;
        qVar.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        qVar.i = iMax;
        if (z2) {
            qVar.h = this.q.m() + i3;
            View viewN0 = N0();
            q qVar2 = this.p;
            qVar2.e = this.t ? -1 : 1;
            int iG = c0.G(viewN0);
            q qVar3 = this.p;
            qVar2.d = iG + qVar3.e;
            qVar3.b = this.q.g(viewN0);
            iQ = this.q.g(viewN0) - this.q.l();
        } else {
            View viewO0 = O0();
            q qVar4 = this.p;
            qVar4.h = this.q.q() + qVar4.h;
            q qVar5 = this.p;
            qVar5.e = this.t ? 1 : -1;
            int iG2 = c0.G(viewO0);
            q qVar6 = this.p;
            qVar5.d = iG2 + qVar6.e;
            qVar6.b = this.q.j(viewO0);
            iQ = (-this.q.j(viewO0)) + this.q.q();
        }
        q qVar7 = this.p;
        qVar7.c = i2;
        if (z) {
            qVar7.c = i2 - iQ;
        }
        qVar7.g = iQ;
    }

    public final void Z0(int i, int i2) {
        this.p.c = this.q.l() - i2;
        q qVar = this.p;
        qVar.e = this.t ? -1 : 1;
        qVar.d = i;
        qVar.f = 1;
        qVar.b = i2;
        qVar.g = Integer.MIN_VALUE;
    }

    public final void a1(int i, int i2) {
        this.p.c = i2 - this.q.q();
        q qVar = this.p;
        qVar.d = i;
        qVar.e = this.t ? 1 : -1;
        qVar.f = -1;
        qVar.b = i2;
        qVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.c0
    public final void b(String str) {
        if (this.y == null) {
            super.b(str);
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final boolean c() {
        return this.o == 0;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:123:0x0206  */
    /* JADX WARN: Code duplicated, block: B:126:0x0212  */
    /* JADX WARN: Code duplicated, block: B:130:0x0232 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0236  */
    /* JADX WARN: Code duplicated, block: B:134:0x0239 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x023d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0240 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x0242  */
    /* JADX WARN: Code duplicated, block: B:141:0x0246  */
    /* JADX WARN: Code duplicated, block: B:143:0x024a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0251  */
    /* JADX WARN: Code duplicated, block: B:146:0x0257  */
    /* JADX WARN: Code duplicated, block: B:95:0x018c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // androidx.recyclerview.widget.c0
    public void c0(i0 i0Var, l0 l0Var) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewK0;
        boolean z3;
        androidx.emoji2.text.g gVar;
        int iJ;
        int iG;
        int iQ;
        int iL;
        boolean z4;
        boolean z5;
        androidx.emoji2.text.g gVar2;
        int iR;
        d0 d0Var;
        int i;
        int iJ2;
        int i2;
        int i3;
        ?? r4;
        List list;
        int i4;
        int i5;
        int iL0;
        int i6;
        View viewP;
        int iJ3;
        int iL2;
        int i7;
        int i8 = -1;
        if (!(this.y == null && this.w == -1) && l0Var.b() == 0) {
            h0(i0Var);
            return;
        }
        r rVar = this.y;
        if (rVar != null && (i7 = rVar.e) >= 0) {
            this.w = i7;
        }
        E0();
        boolean z6 = false;
        this.p.a = false;
        U0();
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.a.A).contains(focusedChild)) {
            focusedChild = null;
        }
        androidx.media3.exoplayer.h0 h0Var = this.z;
        if (!h0Var.d || this.w != -1 || this.y != null) {
            h0Var.f();
            h0Var.c = this.t ^ this.u;
            if (l0Var.g || (i = this.w) == -1) {
                if (u() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || ((ArrayList) this.a.A).contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        d0Var = (d0) focusedChild2.getLayoutParams();
                        if (!d0Var.a.h() || d0Var.a.b() < 0 || d0Var.a.b() >= l0Var.b()) {
                            z = this.r;
                            z2 = this.u;
                            if (z == z2 || (viewK0 = K0(i0Var, l0Var, h0Var.c, z2)) == null) {
                                h0Var.b();
                                if (this.u) {
                                    iB = l0Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                h0Var.b = iB;
                            } else {
                                int iG2 = c0.G(viewK0);
                                z3 = h0Var.c;
                                gVar = (androidx.emoji2.text.g) h0Var.f;
                                if (z3) {
                                    int iG3 = gVar.g(viewK0);
                                    gVar2 = (androidx.emoji2.text.g) h0Var.f;
                                    if (Integer.MIN_VALUE == gVar2.a) {
                                        iR = 0;
                                    } else {
                                        iR = gVar2.r() - gVar2.a;
                                    }
                                    h0Var.e = iR + iG3;
                                } else {
                                    h0Var.e = gVar.j(viewK0);
                                }
                                h0Var.b = iG2;
                                if (!l0Var.g && x0()) {
                                    iJ = this.q.j(viewK0);
                                    iG = this.q.g(viewK0);
                                    iQ = this.q.q();
                                    iL = this.q.l();
                                    if (iG <= iQ || iJ >= iQ) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (iJ >= iL || iG <= iL) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z4 || z5) {
                                        if (h0Var.c) {
                                            iQ = iL;
                                        }
                                        h0Var.e = iQ;
                                    }
                                }
                            }
                        } else {
                            h0Var.c(focusedChild2, c0.G(focusedChild2));
                        }
                    } else {
                        z = this.r;
                        z2 = this.u;
                        if (z == z2) {
                            h0Var.b();
                            if (this.u) {
                                iB = l0Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            h0Var.b = iB;
                        } else {
                            int iG4 = c0.G(viewK0);
                            z3 = h0Var.c;
                            gVar = (androidx.emoji2.text.g) h0Var.f;
                            if (z3) {
                                int iG5 = gVar.g(viewK0);
                                gVar2 = (androidx.emoji2.text.g) h0Var.f;
                                if (Integer.MIN_VALUE == gVar2.a) {
                                    iR = 0;
                                } else {
                                    iR = gVar2.r() - gVar2.a;
                                }
                                h0Var.e = iR + iG5;
                            } else {
                                h0Var.e = gVar.j(viewK0);
                            }
                            h0Var.b = iG4;
                            if (!l0Var.g) {
                                iJ = this.q.j(viewK0);
                                iG = this.q.g(viewK0);
                                iQ = this.q.q();
                                iL = this.q.l();
                                if (iG <= iQ) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iJ >= iL) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (h0Var.c) {
                                        iQ = iL;
                                    }
                                    h0Var.e = iQ;
                                } else {
                                    if (h0Var.c) {
                                        iQ = iL;
                                    }
                                    h0Var.e = iQ;
                                }
                            }
                        }
                    }
                } else {
                    h0Var.b();
                    if (this.u) {
                        iB = l0Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    h0Var.b = iB;
                }
            } else if (i < 0 || i >= l0Var.b()) {
                this.w = -1;
                this.x = Integer.MIN_VALUE;
                if (u() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        d0Var = (d0) focusedChild2.getLayoutParams();
                        if (d0Var.a.h()) {
                            z = this.r;
                            z2 = this.u;
                            if (z == z2) {
                                h0Var.b();
                                if (this.u) {
                                    iB = l0Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                h0Var.b = iB;
                            } else {
                                int iG6 = c0.G(viewK0);
                                z3 = h0Var.c;
                                gVar = (androidx.emoji2.text.g) h0Var.f;
                                if (z3) {
                                    int iG7 = gVar.g(viewK0);
                                    gVar2 = (androidx.emoji2.text.g) h0Var.f;
                                    if (Integer.MIN_VALUE == gVar2.a) {
                                        iR = 0;
                                    } else {
                                        iR = gVar2.r() - gVar2.a;
                                    }
                                    h0Var.e = iR + iG7;
                                } else {
                                    h0Var.e = gVar.j(viewK0);
                                }
                                h0Var.b = iG6;
                                if (!l0Var.g) {
                                    iJ = this.q.j(viewK0);
                                    iG = this.q.g(viewK0);
                                    iQ = this.q.q();
                                    iL = this.q.l();
                                    if (iG <= iQ) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iJ >= iL) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (h0Var.c) {
                                            iQ = iL;
                                        }
                                        h0Var.e = iQ;
                                    } else {
                                        if (h0Var.c) {
                                            iQ = iL;
                                        }
                                        h0Var.e = iQ;
                                    }
                                }
                            }
                        } else {
                            z = this.r;
                            z2 = this.u;
                            if (z == z2) {
                                h0Var.b();
                                if (this.u) {
                                    iB = l0Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                h0Var.b = iB;
                            } else {
                                int iG8 = c0.G(viewK0);
                                z3 = h0Var.c;
                                gVar = (androidx.emoji2.text.g) h0Var.f;
                                if (z3) {
                                    int iG9 = gVar.g(viewK0);
                                    gVar2 = (androidx.emoji2.text.g) h0Var.f;
                                    if (Integer.MIN_VALUE == gVar2.a) {
                                        iR = 0;
                                    } else {
                                        iR = gVar2.r() - gVar2.a;
                                    }
                                    h0Var.e = iR + iG9;
                                } else {
                                    h0Var.e = gVar.j(viewK0);
                                }
                                h0Var.b = iG8;
                                if (!l0Var.g) {
                                    iJ = this.q.j(viewK0);
                                    iG = this.q.g(viewK0);
                                    iQ = this.q.q();
                                    iL = this.q.l();
                                    if (iG <= iQ) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iJ >= iL) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z4) {
                                        if (h0Var.c) {
                                            iQ = iL;
                                        }
                                        h0Var.e = iQ;
                                    } else {
                                        if (h0Var.c) {
                                            iQ = iL;
                                        }
                                        h0Var.e = iQ;
                                    }
                                }
                            }
                        }
                    } else {
                        z = this.r;
                        z2 = this.u;
                        if (z == z2) {
                            h0Var.b();
                            if (this.u) {
                                iB = l0Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            h0Var.b = iB;
                        } else {
                            int iG10 = c0.G(viewK0);
                            z3 = h0Var.c;
                            gVar = (androidx.emoji2.text.g) h0Var.f;
                            if (z3) {
                                int iG11 = gVar.g(viewK0);
                                gVar2 = (androidx.emoji2.text.g) h0Var.f;
                                if (Integer.MIN_VALUE == gVar2.a) {
                                    iR = 0;
                                } else {
                                    iR = gVar2.r() - gVar2.a;
                                }
                                h0Var.e = iR + iG11;
                            } else {
                                h0Var.e = gVar.j(viewK0);
                            }
                            h0Var.b = iG10;
                            if (!l0Var.g) {
                                iJ = this.q.j(viewK0);
                                iG = this.q.g(viewK0);
                                iQ = this.q.q();
                                iL = this.q.l();
                                if (iG <= iQ) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (iJ >= iL) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (h0Var.c) {
                                        iQ = iL;
                                    }
                                    h0Var.e = iQ;
                                } else {
                                    if (h0Var.c) {
                                        iQ = iL;
                                    }
                                    h0Var.e = iQ;
                                }
                            }
                        }
                    }
                } else {
                    h0Var.b();
                    if (this.u) {
                        iB = l0Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    h0Var.b = iB;
                }
            } else {
                int i9 = this.w;
                h0Var.b = i9;
                r rVar2 = this.y;
                if (rVar2 != null && rVar2.e >= 0) {
                    boolean z7 = rVar2.z;
                    h0Var.c = z7;
                    androidx.emoji2.text.g gVar3 = this.q;
                    if (z7) {
                        h0Var.e = gVar3.l() - this.y.y;
                    } else {
                        h0Var.e = gVar3.q() + this.y.y;
                    }
                } else if (this.x == Integer.MIN_VALUE) {
                    View viewP2 = p(i9);
                    if (viewP2 == null) {
                        if (u() > 0) {
                            h0Var.c = (this.w < c0.G(t(0))) == this.t;
                        }
                        h0Var.b();
                    } else if (this.q.h(viewP2) > this.q.r()) {
                        h0Var.b();
                    } else {
                        int iJ4 = this.q.j(viewP2) - this.q.q();
                        androidx.emoji2.text.g gVar4 = this.q;
                        if (iJ4 < 0) {
                            h0Var.e = gVar4.q();
                            h0Var.c = false;
                        } else if (gVar4.l() - this.q.g(viewP2) < 0) {
                            h0Var.e = this.q.l();
                            h0Var.c = true;
                        } else {
                            boolean z8 = h0Var.c;
                            androidx.emoji2.text.g gVar5 = this.q;
                            if (z8) {
                                int iG12 = gVar5.g(viewP2);
                                androidx.emoji2.text.g gVar6 = this.q;
                                iJ2 = (Integer.MIN_VALUE == gVar6.a ? 0 : gVar6.r() - gVar6.a) + iG12;
                            } else {
                                iJ2 = gVar5.j(viewP2);
                            }
                            h0Var.e = iJ2;
                        }
                    }
                } else {
                    boolean z9 = this.t;
                    h0Var.c = z9;
                    androidx.emoji2.text.g gVar7 = this.q;
                    if (z9) {
                        h0Var.e = gVar7.l() - this.x;
                    } else {
                        h0Var.e = gVar7.q() + this.x;
                    }
                }
            }
            h0Var.d = true;
        } else if (focusedChild != null && (this.q.j(focusedChild) >= this.q.l() || this.q.g(focusedChild) <= this.q.q())) {
            h0Var.c(focusedChild, c0.G(focusedChild));
        }
        q qVar = this.p;
        qVar.f = qVar.j >= 0 ? 1 : -1;
        int[] iArr = this.C;
        iArr[0] = 0;
        iArr[1] = 0;
        y0(l0Var, iArr);
        int iQ2 = this.q.q() + Math.max(0, iArr[0]);
        int iM = this.q.m() + Math.max(0, iArr[1]);
        if (l0Var.g && (i6 = this.w) != -1 && this.x != Integer.MIN_VALUE && (viewP = p(i6)) != null) {
            boolean z10 = this.t;
            androidx.emoji2.text.g gVar8 = this.q;
            if (z10) {
                iL2 = gVar8.l() - this.q.g(viewP);
                iJ3 = this.x;
            } else {
                iJ3 = gVar8.j(viewP) - this.q.q();
                iL2 = this.x;
            }
            int i10 = iL2 - iJ3;
            if (i10 > 0) {
                iQ2 += i10;
            } else {
                iM -= i10;
            }
        }
        boolean z11 = h0Var.c;
        boolean z12 = this.t;
        if (!z11 ? !z12 : z12) {
            i8 = 1;
        }
        R0(i0Var, l0Var, h0Var, i8);
        o(i0Var);
        this.p.l = this.q.o() == 0 && this.q.k() == 0;
        this.p.getClass();
        this.p.i = 0;
        boolean z13 = h0Var.c;
        int i11 = h0Var.b;
        if (z13) {
            a1(i11, h0Var.e);
            q qVar2 = this.p;
            qVar2.h = iQ2;
            F0(i0Var, qVar2, l0Var, false);
            q qVar3 = this.p;
            i3 = qVar3.b;
            int i12 = qVar3.d;
            int i13 = qVar3.c;
            if (i13 > 0) {
                iM += i13;
            }
            Z0(h0Var.b, h0Var.e);
            q qVar4 = this.p;
            qVar4.h = iM;
            qVar4.d += qVar4.e;
            F0(i0Var, qVar4, l0Var, false);
            q qVar5 = this.p;
            i2 = qVar5.b;
            int i14 = qVar5.c;
            if (i14 > 0) {
                a1(i12, i3);
                q qVar6 = this.p;
                qVar6.h = i14;
                F0(i0Var, qVar6, l0Var, false);
                i3 = this.p.b;
            }
        } else {
            Z0(i11, h0Var.e);
            q qVar7 = this.p;
            qVar7.h = iM;
            F0(i0Var, qVar7, l0Var, false);
            q qVar8 = this.p;
            i2 = qVar8.b;
            int i15 = qVar8.d;
            int i16 = qVar8.c;
            if (i16 > 0) {
                iQ2 += i16;
            }
            a1(h0Var.b, h0Var.e);
            q qVar9 = this.p;
            qVar9.h = iQ2;
            qVar9.d += qVar9.e;
            F0(i0Var, qVar9, l0Var, false);
            q qVar10 = this.p;
            int i17 = qVar10.b;
            int i18 = qVar10.c;
            if (i18 > 0) {
                Z0(i15, i2);
                q qVar11 = this.p;
                qVar11.h = i18;
                F0(i0Var, qVar11, l0Var, false);
                i2 = this.p.b;
            }
            i3 = i17;
        }
        if (u() > 0) {
            if (this.t ^ this.u) {
                int iL1 = L0(i2, i0Var, l0Var, true);
                i4 = i3 + iL1;
                i5 = i2 + iL1;
                iL0 = M0(i4, i0Var, l0Var, false);
            } else {
                int iM0 = M0(i3, i0Var, l0Var, true);
                i4 = i3 + iM0;
                i5 = i2 + iM0;
                iL0 = L0(i5, i0Var, l0Var, false);
            }
            i3 = i4 + iL0;
            i2 = i5 + iL0;
        }
        if (l0Var.k && u() != 0 && !l0Var.g && x0()) {
            List list2 = i0Var.d;
            int size = list2.size();
            int iG13 = c0.G(t(0));
            int i19 = 0;
            int iH = 0;
            int iH2 = 0;
            while (i19 < size) {
                p0 p0Var = (p0) list2.get(i19);
                boolean zH = p0Var.h();
                View view = p0Var.a;
                if (!zH) {
                    boolean z14 = p0Var.b() < iG13 ? true : z6;
                    boolean z15 = this.t;
                    androidx.emoji2.text.g gVar9 = this.q;
                    if (z14 != z15) {
                        iH += gVar9.h(view);
                    } else {
                        iH2 += gVar9.h(view);
                    }
                }
                i19++;
                z6 = false;
            }
            this.p.k = list2;
            if (iH > 0) {
                a1(c0.G(O0()), i3);
                q qVar12 = this.p;
                qVar12.h = iH;
                r4 = 0;
                qVar12.c = 0;
                qVar12.a(null);
                F0(i0Var, this.p, l0Var, false);
            } else {
                r4 = 0;
            }
            if (iH2 > 0) {
                Z0(c0.G(N0()), i2);
                q qVar13 = this.p;
                qVar13.h = iH2;
                qVar13.c = r4;
                list = null;
                qVar13.a(null);
                F0(i0Var, this.p, l0Var, r4);
            } else {
                list = null;
            }
            this.p.k = list;
        }
        if (l0Var.g) {
            h0Var.f();
        } else {
            androidx.emoji2.text.g gVar10 = this.q;
            gVar10.a = gVar10.r();
        }
        this.r = this.u;
    }

    @Override // androidx.recyclerview.widget.c0
    public final boolean d() {
        return this.o == 1;
    }

    @Override // androidx.recyclerview.widget.c0
    public void d0(l0 l0Var) {
        this.y = null;
        this.w = -1;
        this.x = Integer.MIN_VALUE;
        this.z.f();
    }

    @Override // androidx.recyclerview.widget.c0
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof r) {
            r rVar = (r) parcelable;
            this.y = rVar;
            if (this.w != -1) {
                rVar.e = -1;
            }
            m0();
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final Parcelable f0() {
        r rVar = this.y;
        if (rVar != null) {
            r rVar2 = new r();
            rVar2.e = rVar.e;
            rVar2.y = rVar.y;
            rVar2.z = rVar.z;
            return rVar2;
        }
        r rVar3 = new r();
        if (u() <= 0) {
            rVar3.e = -1;
            return rVar3;
        }
        E0();
        boolean z = this.r ^ this.t;
        rVar3.z = z;
        if (z) {
            View viewN0 = N0();
            rVar3.y = this.q.l() - this.q.g(viewN0);
            rVar3.e = c0.G(viewN0);
            return rVar3;
        }
        View viewO0 = O0();
        rVar3.e = c0.G(viewO0);
        rVar3.y = this.q.j(viewO0) - this.q.q();
        return rVar3;
    }

    @Override // androidx.recyclerview.widget.c0
    public final void g(int i, int i2, l0 l0Var, androidx.media3.common.util.e eVar) {
        if (this.o != 0) {
            i = i2;
        }
        if (u() == 0 || i == 0) {
            return;
        }
        E0();
        Y0(i > 0 ? 1 : -1, Math.abs(i), true, l0Var);
        z0(l0Var, this.p, eVar);
    }

    @Override // androidx.recyclerview.widget.c0
    public final void h(int i, androidx.media3.common.util.e eVar) {
        boolean z;
        int i2;
        r rVar = this.y;
        if (rVar == null || (i2 = rVar.e) < 0) {
            U0();
            z = this.t;
            i2 = this.w;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = rVar.z;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.B && i2 >= 0 && i2 < i; i4++) {
            eVar.b(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.c0
    public final int i(l0 l0Var) {
        return A0(l0Var);
    }

    @Override // androidx.recyclerview.widget.c0
    public int j(l0 l0Var) {
        return B0(l0Var);
    }

    @Override // androidx.recyclerview.widget.c0
    public int k(l0 l0Var) {
        return C0(l0Var);
    }

    @Override // androidx.recyclerview.widget.c0
    public final int l(l0 l0Var) {
        return A0(l0Var);
    }

    @Override // androidx.recyclerview.widget.c0
    public int m(l0 l0Var) {
        return B0(l0Var);
    }

    @Override // androidx.recyclerview.widget.c0
    public int n(l0 l0Var) {
        return C0(l0Var);
    }

    @Override // androidx.recyclerview.widget.c0
    public int n0(int i, i0 i0Var, l0 l0Var) {
        if (this.o == 1) {
            return 0;
        }
        return V0(i, i0Var, l0Var);
    }

    @Override // androidx.recyclerview.widget.c0
    public int o0(int i, i0 i0Var, l0 l0Var) {
        if (this.o == 0) {
            return 0;
        }
        return V0(i, i0Var, l0Var);
    }

    @Override // androidx.recyclerview.widget.c0
    public final View p(int i) {
        int iU = u();
        if (iU == 0) {
            return null;
        }
        int iG = i - c0.G(t(0));
        if (iG >= 0 && iG < iU) {
            View viewT = t(iG);
            if (c0.G(viewT) == i) {
                return viewT;
            }
        }
        return super.p(i);
    }

    @Override // androidx.recyclerview.widget.c0
    public d0 q() {
        return new d0(-2, -2);
    }

    @Override // androidx.recyclerview.widget.c0
    public final boolean v0() {
        if (this.l != 1073741824 && this.k != 1073741824) {
            int iU = u();
            for (int i = 0; i < iU; i++) {
                ViewGroup.LayoutParams layoutParams = t(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.c0
    public boolean x0() {
        return this.y == null && this.r == this.u;
    }

    public void y0(l0 l0Var, int[] iArr) {
        int i;
        int iR = l0Var.a != -1 ? this.q.r() : 0;
        if (this.p.f == -1) {
            i = 0;
        } else {
            i = iR;
            iR = 0;
        }
        iArr[0] = iR;
        iArr[1] = i;
    }

    public void z0(l0 l0Var, q qVar, androidx.media3.common.util.e eVar) {
        int i = qVar.d;
        if (i < 0 || i >= l0Var.b()) {
            return;
        }
        eVar.b(i, Math.max(0, qVar.g));
    }

    @Override // androidx.recyclerview.widget.c0
    public final void R(RecyclerView recyclerView) {
    }

    public LinearLayoutManager() {
        this.o = 1;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = true;
        this.w = -1;
        this.x = Integer.MIN_VALUE;
        this.y = null;
        this.z = new androidx.media3.exoplayer.h0();
        this.A = new androidx.media3.exoplayer.audio.l();
        this.B = 2;
        this.C = new int[2];
        W0(1);
        b(null);
        if (this.s) {
            this.s = false;
            m0();
        }
    }

    public void R0(i0 i0Var, l0 l0Var, androidx.media3.exoplayer.h0 h0Var, int i) {
    }
}
