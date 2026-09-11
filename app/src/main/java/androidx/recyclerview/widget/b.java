package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList y;
    public final /* synthetic */ h z;

    public /* synthetic */ b(h hVar, ArrayList arrayList, int i) {
        this.e = i;
        this.z = hVar;
        this.y = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                ArrayList arrayList = this.y;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    h hVar = this.z;
                    if (!zHasNext) {
                        arrayList.clear();
                        hVar.m.remove(arrayList);
                    } else {
                        g gVar = (g) it.next();
                        p0 p0Var = gVar.a;
                        int i = gVar.b;
                        int i2 = gVar.c;
                        int i3 = gVar.d;
                        int i4 = gVar.e;
                        hVar.getClass();
                        View view = p0Var.a;
                        int i5 = i3 - i;
                        int i6 = i4 - i2;
                        if (i5 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i6 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        hVar.p.add(p0Var);
                        viewPropertyAnimatorAnimate.setDuration(hVar.e).setListener(new d(hVar, p0Var, i5, view, i6, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.y;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    h hVar2 = this.z;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        hVar2.n.remove(arrayList2);
                        break;
                    } else {
                        f fVar = (f) it2.next();
                        ArrayList arrayList3 = hVar2.r;
                        long j = hVar2.f;
                        p0 p0Var2 = fVar.a;
                        View view2 = p0Var2 == null ? null : p0Var2.a;
                        p0 p0Var3 = fVar.b;
                        View view3 = p0Var3 != null ? p0Var3.a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(fVar.a);
                            duration.translationX(fVar.e - fVar.c);
                            duration.translationY(fVar.f - fVar.d);
                            duration.alpha(0.0f).setListener(new e(hVar2, fVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(fVar.b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new e(hVar2, fVar, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.y;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    h hVar3 = this.z;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        hVar3.l.remove(arrayList4);
                    } else {
                        p0 p0Var4 = (p0) it3.next();
                        hVar3.getClass();
                        View view4 = p0Var4.a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        hVar3.o.add(p0Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(hVar3.c).setListener(new c(hVar3, p0Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
