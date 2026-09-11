package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends z {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((p0) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.z
    public final boolean a(p0 p0Var, p0 p0Var2, androidx.core.view.r rVar, androidx.core.view.r rVar2) {
        int i;
        int i2;
        int i3 = rVar.a;
        int i4 = rVar.b;
        if (p0Var2.o()) {
            int i5 = rVar.a;
            i2 = rVar.b;
            i = i5;
        } else {
            i = rVar2.a;
            i2 = rVar2.b;
        }
        if (p0Var == p0Var2) {
            return g(p0Var, i3, i4, i, i2);
        }
        View view = p0Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(p0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = p0Var2.a;
        l(p0Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        f fVar = new f();
        fVar.a = p0Var;
        fVar.b = p0Var2;
        fVar.c = i3;
        fVar.d = i4;
        fVar.e = i;
        fVar.f = i2;
        arrayList.add(fVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.z
    public final void d(p0 p0Var) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = p0Var.a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((g) arrayList4.get(size)).a == p0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(p0Var);
                arrayList4.remove(size);
            }
        }
        j(this.k, p0Var);
        if (this.h.remove(p0Var)) {
            view.setAlpha(1.0f);
            c(p0Var);
        }
        if (this.i.remove(p0Var)) {
            view.setAlpha(1.0f);
            c(p0Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, p0Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            for (int size4 = arrayList6.size() - 1; size4 >= 0; size4--) {
                if (((g) arrayList6.get(size4)).a == p0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(p0Var);
                    arrayList6.remove(size4);
                    if (!arrayList6.isEmpty()) {
                        break;
                    }
                    arrayList2.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(p0Var)) {
                view.setAlpha(1.0f);
                c(p0Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(p0Var);
        this.o.remove(p0Var);
        this.r.remove(p0Var);
        this.p.remove(p0Var);
        i();
    }

    @Override // androidx.recyclerview.widget.z
    public final void e() {
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.n;
        ArrayList arrayList3 = this.l;
        ArrayList arrayList4 = this.m;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            g gVar = (g) arrayList7.get(size);
            View view = gVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(gVar.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((p0) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            p0 p0Var = (p0) arrayList5.get(size3);
            p0Var.a.setAlpha(1.0f);
            c(p0Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            f fVar = (f) arrayList.get(size4);
            p0 p0Var2 = fVar.a;
            if (p0Var2 != null) {
                k(fVar, p0Var2);
            }
            p0 p0Var3 = fVar.b;
            if (p0Var3 != null) {
                k(fVar, p0Var3);
            }
        }
        arrayList.clear();
        if (f()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    g gVar2 = (g) arrayList8.get(size6);
                    View view2 = gVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(gVar2.a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    p0 p0Var4 = (p0) arrayList9.get(size8);
                    p0Var4.a.setAlpha(1.0f);
                    c(p0Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    f fVar2 = (f) arrayList10.get(size10);
                    p0 p0Var5 = fVar2.a;
                    if (p0Var5 != null) {
                        k(fVar2, p0Var5);
                    }
                    p0 p0Var6 = fVar2.b;
                    if (p0Var6 != null) {
                        k(fVar2, p0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                androidx.transition.k.i();
            }
        }
    }

    @Override // androidx.recyclerview.widget.z
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(p0 p0Var, int i, int i2, int i3, int i4) {
        View view = p0Var.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) p0Var.a.getTranslationY());
        l(p0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(p0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        g gVar = new g();
        gVar.a = p0Var;
        gVar.b = translationX;
        gVar.c = translationY;
        gVar.d = i3;
        gVar.e = i4;
        arrayList.add(gVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            androidx.transition.k.i();
        }
    }

    public final void j(ArrayList arrayList, p0 p0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = (f) arrayList.get(size);
            if (k(fVar, p0Var) && fVar.a == null && fVar.b == null) {
                arrayList.remove(fVar);
            }
        }
    }

    public final boolean k(f fVar, p0 p0Var) {
        if (fVar.b == p0Var) {
            fVar.b = null;
        } else {
            if (fVar.a != p0Var) {
                return false;
            }
            fVar.a = null;
        }
        View view = p0Var.a;
        View view2 = p0Var.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(p0Var);
        return true;
    }

    public final void l(p0 p0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        p0Var.a.animate().setInterpolator(s);
        d(p0Var);
    }
}
