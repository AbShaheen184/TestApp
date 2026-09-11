package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.core.view.s0;
import androidx.core.view.y0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements Cloneable {
    public static final Animator[] T = new Animator[0];
    public static final int[] U = {2, 1, 3, 4};
    public static final com.google.android.gms.common.internal.k V = new com.google.android.gms.common.internal.k(25);
    public static final ThreadLocal W = new ThreadLocal();
    public ArrayList H;
    public ArrayList I;
    public j[] J;
    public final String e = getClass().getName();
    public long y = -1;
    public long z = -1;
    public TimeInterpolator A = null;
    public final ArrayList B = new ArrayList();
    public final ArrayList C = new ArrayList();
    public com.google.firebase.messaging.o D = new com.google.firebase.messaging.o(15);
    public com.google.firebase.messaging.o E = new com.google.firebase.messaging.o(15);
    public a F = null;
    public final int[] G = U;
    public final ArrayList K = new ArrayList();
    public Animator[] L = T;
    public int M = 0;
    public boolean N = false;
    public boolean O = false;
    public m P = null;
    public ArrayList Q = null;
    public ArrayList R = new ArrayList();
    public com.google.android.gms.common.internal.k S = V;

    public static void b(com.google.firebase.messaging.o oVar, View view, t tVar) {
        androidx.collection.f fVar = (androidx.collection.f) oVar.y;
        androidx.collection.f fVar2 = (androidx.collection.f) oVar.B;
        SparseArray sparseArray = (SparseArray) oVar.z;
        androidx.collection.s sVar = (androidx.collection.s) oVar.A;
        fVar.put(view, tVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        Field field = s0.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (fVar2.containsKey(transitionName)) {
                fVar2.put(transitionName, null);
            } else {
                fVar2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (sVar.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    sVar.e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) sVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    sVar.e(itemIdAtPosition, null);
                }
            }
        }
    }

    public static androidx.collection.f o() {
        ThreadLocal threadLocal = W;
        androidx.collection.f fVar = (androidx.collection.f) threadLocal.get();
        if (fVar != null) {
            return fVar;
        }
        androidx.collection.f fVar2 = new androidx.collection.f(0);
        threadLocal.set(fVar2);
        return fVar2;
    }

    public static boolean t(t tVar, t tVar2, String str) {
        Object obj = tVar.a.get(str);
        Object obj2 = tVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A() {
        H();
        androidx.collection.f fVarO = o();
        for (Animator animator : this.R) {
            if (fVarO.containsKey(animator)) {
                H();
                if (animator != null) {
                    animator.addListener(new y0(this, fVarO));
                    long j = this.z;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.y;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.A;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new androidx.appcompat.widget.b(this, 1));
                    animator.start();
                }
            }
        }
        this.R.clear();
        l();
    }

    public void B(long j) {
        this.z = j;
    }

    public void D(TimeInterpolator timeInterpolator) {
        this.A = timeInterpolator;
    }

    public void E(com.google.android.gms.common.internal.k kVar) {
        if (kVar == null) {
            this.S = V;
        } else {
            this.S = kVar;
        }
    }

    public void G(long j) {
        this.y = j;
    }

    public final void H() {
        if (this.M == 0) {
            u(this, l.h);
            this.O = false;
        }
        this.M++;
    }

    public String I(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.z != -1) {
            sb.append("dur(");
            sb.append(this.z);
            sb.append(") ");
        }
        if (this.y != -1) {
            sb.append("dly(");
            sb.append(this.y);
            sb.append(") ");
        }
        if (this.A != null) {
            sb.append("interp(");
            sb.append(this.A);
            sb.append(") ");
        }
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        ArrayList arrayList2 = this.C;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(j jVar) {
        if (this.Q == null) {
            this.Q = new ArrayList();
        }
        this.Q.add(jVar);
    }

    public abstract void c(t tVar);

    public void cancel() {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.L);
        this.L = T;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.L = animatorArr;
        u(this, l.j);
    }

    public final void d(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            t tVar = new t(view);
            if (z) {
                f(tVar);
            } else {
                c(tVar);
            }
            tVar.c.add(this);
            e(tVar);
            if (z) {
                b(this.D, view, tVar);
            } else {
                b(this.E, view, tVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                d(viewGroup.getChildAt(i), z);
            }
        }
    }

    public abstract void f(t tVar);

    public final void g(ViewGroup viewGroup, boolean z) {
        h(z);
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        ArrayList arrayList2 = this.C;
        if (size <= 0 && arrayList2.size() <= 0) {
            d(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                t tVar = new t(viewFindViewById);
                if (z) {
                    f(tVar);
                } else {
                    c(tVar);
                }
                tVar.c.add(this);
                e(tVar);
                if (z) {
                    b(this.D, viewFindViewById, tVar);
                } else {
                    b(this.E, viewFindViewById, tVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            t tVar2 = new t(view);
            if (z) {
                f(tVar2);
            } else {
                c(tVar2);
            }
            tVar2.c.add(this);
            e(tVar2);
            if (z) {
                b(this.D, view, tVar2);
            } else {
                b(this.E, view, tVar2);
            }
        }
    }

    public final void h(boolean z) {
        if (z) {
            ((androidx.collection.f) this.D.y).clear();
            ((SparseArray) this.D.z).clear();
            ((androidx.collection.s) this.D.A).a();
        } else {
            ((androidx.collection.f) this.E.y).clear();
            ((SparseArray) this.E.z).clear();
            ((androidx.collection.s) this.E.A).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: i */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.R = new ArrayList();
            mVar.D = new com.google.firebase.messaging.o(15);
            mVar.E = new com.google.firebase.messaging.o(15);
            mVar.H = null;
            mVar.I = null;
            mVar.P = this;
            mVar.Q = null;
            return mVar;
        } catch (CloneNotSupportedException e) {
            net.luminis.tls.engine.impl.c.k(e);
            return null;
        }
    }

    public Animator j(ViewGroup viewGroup, t tVar, t tVar2) {
        return null;
    }

    public void k(ViewGroup viewGroup, com.google.firebase.messaging.o oVar, com.google.firebase.messaging.o oVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        t tVar;
        Animator animator;
        t tVar2;
        androidx.collection.f fVarO = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        n().getClass();
        int i3 = 0;
        while (i3 < size) {
            t tVar3 = (t) arrayList.get(i3);
            t tVar4 = (t) arrayList2.get(i3);
            if (tVar3 != null && !tVar3.c.contains(this)) {
                tVar3 = null;
            }
            if (tVar4 != null && !tVar4.c.contains(this)) {
                tVar4 = null;
            }
            if ((tVar3 != null || tVar4 != null) && (tVar3 == null || tVar4 == null || r(tVar3, tVar4))) {
                Animator animatorJ = j(viewGroup, tVar3, tVar4);
                if (animatorJ != null) {
                    String str = this.e;
                    if (tVar4 != null) {
                        view = tVar4.b;
                        String[] strArrP = p();
                        if (strArrP != null && strArrP.length > 0) {
                            tVar2 = new t(view);
                            t tVar5 = (t) ((androidx.collection.f) oVar2.y).get(view);
                            i = size;
                            if (tVar5 != null) {
                                int i4 = 0;
                                while (i4 < strArrP.length) {
                                    String str2 = strArrP[i4];
                                    int i5 = i3;
                                    tVar2.a.put(str2, tVar5.a.get(str2));
                                    i4++;
                                    i3 = i5;
                                    tVar5 = tVar5;
                                }
                            }
                            i2 = i3;
                            int i6 = fVarO.z;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    animator = animatorJ;
                                    break;
                                }
                                i iVar = (i) fVarO.get((Animator) fVarO.f(i7));
                                if (iVar.c != null && iVar.a == view && iVar.b.equals(str) && iVar.c.equals(tVar2)) {
                                    animator = null;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = animatorJ;
                            tVar2 = null;
                        }
                        animatorJ = animator;
                        tVar = tVar2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = tVar3.b;
                        tVar = null;
                    }
                    if (animatorJ != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        i iVar2 = new i();
                        iVar2.a = view;
                        iVar2.b = str;
                        iVar2.c = tVar;
                        iVar2.d = windowId;
                        iVar2.e = this;
                        iVar2.f = animatorJ;
                        fVarO.put(animatorJ, iVar2);
                        this.R.add(animatorJ);
                    }
                }
                i3 = i2 + 1;
                size = i;
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                i iVar3 = (i) fVarO.get((Animator) this.R.get(sparseIntArray.keyAt(i8)));
                iVar3.f.setStartDelay(iVar3.f.getStartDelay() + (((long) sparseIntArray.valueAt(i8)) - Long.MAX_VALUE));
            }
        }
    }

    public final void l() {
        int i = this.M - 1;
        this.M = i;
        if (i == 0) {
            u(this, l.i);
            for (int i2 = 0; i2 < ((androidx.collection.s) this.D.A).g(); i2++) {
                View view = (View) ((androidx.collection.s) this.D.A).h(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((androidx.collection.s) this.E.A).g(); i3++) {
                View view2 = (View) ((androidx.collection.s) this.E.A).h(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.O = true;
        }
    }

    public final t m(View view, boolean z) {
        a aVar = this.F;
        if (aVar != null) {
            return aVar.m(view, z);
        }
        ArrayList arrayList = z ? this.H : this.I;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            t tVar = (t) arrayList.get(i);
            if (tVar == null) {
                return null;
            }
            if (tVar.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (t) (z ? this.I : this.H).get(i);
        }
        return null;
    }

    public final m n() {
        a aVar = this.F;
        return aVar != null ? aVar.n() : this;
    }

    public String[] p() {
        return null;
    }

    public final t q(View view, boolean z) {
        a aVar = this.F;
        if (aVar != null) {
            return aVar.q(view, z);
        }
        return (t) ((androidx.collection.f) (z ? this.D : this.E).y).get(view);
    }

    public boolean r(t tVar, t tVar2) {
        if (tVar != null && tVar2 != null) {
            String[] strArrP = p();
            if (strArrP != null) {
                for (String str : strArrP) {
                    if (t(tVar, tVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = tVar.a.keySet().iterator();
                while (it.hasNext()) {
                    if (t(tVar, tVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean s(View view) {
        int id = view.getId();
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        ArrayList arrayList2 = this.C;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return I("");
    }

    public final void u(m mVar, l lVar) {
        m mVar2 = this.P;
        if (mVar2 != null) {
            mVar2.u(mVar, lVar);
        }
        ArrayList arrayList = this.Q;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.Q.size();
        j[] jVarArr = this.J;
        if (jVarArr == null) {
            jVarArr = new j[size];
        }
        this.J = null;
        j[] jVarArr2 = (j[]) this.Q.toArray(jVarArr);
        for (int i = 0; i < size; i++) {
            lVar.f(jVarArr2[i], mVar);
            jVarArr2[i] = null;
        }
        this.J = jVarArr2;
    }

    public void v(View view) {
        if (this.O) {
            return;
        }
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.L);
        this.L = T;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.L = animatorArr;
        u(this, l.k);
        this.N = true;
    }

    public m x(j jVar) {
        m mVar;
        ArrayList arrayList = this.Q;
        if (arrayList != null) {
            if (!arrayList.remove(jVar) && (mVar = this.P) != null) {
                mVar.x(jVar);
            }
            if (this.Q.size() == 0) {
                this.Q = null;
            }
        }
        return this;
    }

    public void y(View view) {
        if (this.N) {
            if (!this.O) {
                ArrayList arrayList = this.K;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.L);
                this.L = T;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.L = animatorArr;
                u(this, l.l);
            }
            this.N = false;
        }
    }

    public void F() {
    }

    public void C(com.google.firebase.b bVar) {
    }

    public void e(t tVar) {
    }
}
