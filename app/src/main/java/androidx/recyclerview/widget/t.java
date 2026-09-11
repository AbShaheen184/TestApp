package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ t(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(a aVar) {
        int i = aVar.a;
        RecyclerView recyclerView = this.a;
        if (i == 1) {
            recyclerView.J.X(aVar.b, aVar.c);
            return;
        }
        if (i == 2) {
            recyclerView.J.a0(aVar.b, aVar.c);
        } else if (i == 4) {
            recyclerView.J.b0(aVar.b, aVar.c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.J.Z(aVar.b, aVar.c);
        }
    }

    public p0 b(int i) {
        RecyclerView recyclerView = this.a;
        int iJ = recyclerView.C.J();
        p0 p0Var = null;
        for (int i2 = 0; i2 < iJ; i2++) {
            p0 p0VarG = RecyclerView.G(recyclerView.C.I(i2));
            if (p0VarG != null && !p0VarG.h() && p0VarG.c == i) {
                if (!((ArrayList) recyclerView.C.A).contains(p0VarG.a)) {
                    p0Var = p0VarG;
                    break;
                }
                p0Var = p0VarG;
            }
        }
        if (p0Var != null) {
            if (!((ArrayList) recyclerView.C.A).contains(p0Var.a)) {
                return p0Var;
            }
        }
        return null;
    }

    public void c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int iJ = recyclerView.C.J();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iJ; i6++) {
            View viewI = recyclerView.C.I(i6);
            p0 p0VarG = RecyclerView.G(viewI);
            if (p0VarG != null && !p0VarG.o() && (i4 = p0VarG.c) >= i && i4 < i5) {
                p0VarG.a(2);
                p0VarG.a(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                ((d0) viewI.getLayoutParams()).c = true;
            }
        }
        i0 i0Var = recyclerView.z;
        ArrayList arrayList = i0Var.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p0 p0Var = (p0) arrayList.get(size);
            if (p0Var != null && (i3 = p0Var.c) >= i && i3 < i5) {
                p0Var.a(2);
                i0Var.h(size);
            }
        }
        recyclerView.E0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int iJ = recyclerView.C.J();
        for (int i3 = 0; i3 < iJ; i3++) {
            p0 p0VarG = RecyclerView.G(recyclerView.C.I(i3));
            if (p0VarG != null && !p0VarG.o() && p0VarG.c >= i) {
                p0VarG.l(i2, false);
                recyclerView.A0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.z.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            p0 p0Var = (p0) arrayList.get(i4);
            if (p0Var != null && p0Var.c >= i) {
                p0Var.l(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.D0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.a;
        int iJ = recyclerView.C.J();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iJ; i11++) {
            p0 p0VarG = RecyclerView.G(recyclerView.C.I(i11));
            if (p0VarG != null && (i9 = p0VarG.c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    p0VarG.l(i2 - i, false);
                } else {
                    p0VarG.l(i5, false);
                }
                recyclerView.A0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.z.c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            p0 p0Var = (p0) arrayList.get(i12);
            if (p0Var != null && (i8 = p0Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    p0Var.l(i2 - i, false);
                } else {
                    p0Var.l(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.D0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public void f(p0 p0Var, androidx.core.view.r rVar, androidx.core.view.r rVar2) {
        boolean zG;
        p0Var.n(false);
        RecyclerView recyclerView = this.a;
        h hVar = (h) recyclerView.j0;
        if (rVar != null) {
            hVar.getClass();
            int i = rVar.a;
            int i2 = rVar2.a;
            if (i == i2 && rVar.b == rVar2.b) {
                hVar.l(p0Var);
                p0Var.a.setAlpha(0.0f);
                hVar.i.add(p0Var);
                zG = true;
            } else {
                zG = hVar.g(p0Var, i, rVar.b, i2, rVar2.b);
            }
        } else {
            hVar.l(p0Var);
            p0Var.a.setAlpha(0.0f);
            hVar.i.add(p0Var);
            zG = true;
        }
        if (zG) {
            recyclerView.P();
        }
    }

    public void g(p0 p0Var, androidx.core.view.r rVar, androidx.core.view.r rVar2) {
        boolean zG;
        RecyclerView recyclerView = this.a;
        recyclerView.z.m(p0Var);
        recyclerView.e(p0Var);
        p0Var.n(false);
        h hVar = (h) recyclerView.j0;
        hVar.getClass();
        int i = rVar.a;
        int i2 = rVar.b;
        View view = p0Var.a;
        int left = rVar2 == null ? view.getLeft() : rVar2.a;
        int top = rVar2 == null ? view.getTop() : rVar2.b;
        if (p0Var.h() || (i == left && i2 == top)) {
            hVar.l(p0Var);
            hVar.h.add(p0Var);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = hVar.g(p0Var, i, i2, left, top);
        }
        if (zG) {
            recyclerView.P();
        }
    }
}
