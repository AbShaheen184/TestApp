package androidx.transition;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m {
    public ArrayList X;
    public boolean Y;
    public int Z;
    public boolean a0;
    public int b0;
    public m[] c0;

    @Override // androidx.transition.m
    public final void A() {
        ArrayList arrayList;
        if (this.X.isEmpty()) {
            H();
            l();
            return;
        }
        r rVar = new r();
        rVar.b = this;
        Iterator it = this.X.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(rVar);
        }
        this.Z = this.X.size();
        if (this.Y) {
            Iterator it2 = this.X.iterator();
            while (it2.hasNext()) {
                ((m) it2.next()).A();
            }
            return;
        }
        int i = 1;
        while (true) {
            int size = this.X.size();
            arrayList = this.X;
            if (i >= size) {
                break;
            }
            ((m) arrayList.get(i - 1)).a(new r((m) this.X.get(i)));
            i++;
        }
        m mVar = (m) arrayList.get(0);
        if (mVar != null) {
            mVar.A();
        }
    }

    @Override // androidx.transition.m
    public final void B(long j) {
        ArrayList arrayList;
        this.z = j;
        if (j < 0 || (arrayList = this.X) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((m) this.X.get(i)).B(j);
        }
    }

    @Override // androidx.transition.m
    public final void C(com.google.firebase.b bVar) {
        this.b0 |= 8;
        int size = this.X.size();
        for (int i = 0; i < size; i++) {
            ((m) this.X.get(i)).C(bVar);
        }
    }

    @Override // androidx.transition.m
    public final void D(TimeInterpolator timeInterpolator) {
        this.b0 |= 1;
        ArrayList arrayList = this.X;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((m) this.X.get(i)).D(timeInterpolator);
            }
        }
        this.A = timeInterpolator;
    }

    @Override // androidx.transition.m
    public final void E(com.google.android.gms.common.internal.k kVar) {
        super.E(kVar);
        this.b0 |= 4;
        if (this.X != null) {
            for (int i = 0; i < this.X.size(); i++) {
                ((m) this.X.get(i)).E(kVar);
            }
        }
    }

    @Override // androidx.transition.m
    public final void F() {
        this.b0 |= 2;
        int size = this.X.size();
        for (int i = 0; i < size; i++) {
            ((m) this.X.get(i)).F();
        }
    }

    @Override // androidx.transition.m
    public final void G(long j) {
        this.y = j;
    }

    @Override // androidx.transition.m
    public final String I(String str) {
        String strI = super.I(str);
        for (int i = 0; i < this.X.size(); i++) {
            StringBuilder sbD = androidx.constraintlayout.core.g.d(strI, "\n");
            sbD.append(((m) this.X.get(i)).I(str.concat("  ")));
            strI = sbD.toString();
        }
        return strI;
    }

    public final void J(m mVar) {
        this.X.add(mVar);
        mVar.F = this;
        long j = this.z;
        if (j >= 0) {
            mVar.B(j);
        }
        if ((this.b0 & 1) != 0) {
            mVar.D(this.A);
        }
        if ((this.b0 & 2) != 0) {
            mVar.F();
        }
        if ((this.b0 & 4) != 0) {
            mVar.E(this.S);
        }
        if ((this.b0 & 8) != 0) {
            mVar.C(null);
        }
    }

    @Override // androidx.transition.m
    public final void c(t tVar) {
        View view = tVar.b;
        if (s(view)) {
            for (m mVar : this.X) {
                if (mVar.s(view)) {
                    mVar.c(tVar);
                    tVar.c.add(mVar);
                }
            }
        }
    }

    @Override // androidx.transition.m
    public final void cancel() {
        super.cancel();
        m[] mVarArr = this.c0;
        this.c0 = null;
        if (mVarArr == null) {
            mVarArr = new m[this.X.size()];
        }
        m[] mVarArr2 = (m[]) this.X.toArray(mVarArr);
        int size = this.X.size();
        for (int i = 0; i < size; i++) {
            mVarArr2[i].cancel();
        }
        Arrays.fill(mVarArr2, (Object) null);
        this.c0 = mVarArr2;
    }

    @Override // androidx.transition.m
    public final void e(t tVar) {
        int size = this.X.size();
        for (int i = 0; i < size; i++) {
            ((m) this.X.get(i)).e(tVar);
        }
    }

    @Override // androidx.transition.m
    public final void f(t tVar) {
        View view = tVar.b;
        if (s(view)) {
            for (m mVar : this.X) {
                if (mVar.s(view)) {
                    mVar.f(tVar);
                    tVar.c.add(mVar);
                }
            }
        }
    }

    @Override // androidx.transition.m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        a aVar = (a) super.clone();
        aVar.X = new ArrayList();
        int size = this.X.size();
        for (int i = 0; i < size; i++) {
            m mVarClone = ((m) this.X.get(i)).clone();
            aVar.X.add(mVarClone);
            mVarClone.F = aVar;
        }
        return aVar;
    }

    @Override // androidx.transition.m
    public final void k(ViewGroup viewGroup, com.google.firebase.messaging.o oVar, com.google.firebase.messaging.o oVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.y;
        int size = this.X.size();
        for (int i = 0; i < size; i++) {
            m mVar = (m) this.X.get(i);
            if (j > 0 && (this.Y || i == 0)) {
                long j2 = mVar.y;
                if (j2 > 0) {
                    mVar.G(j2 + j);
                } else {
                    mVar.G(j);
                }
            }
            mVar.k(viewGroup, oVar, oVar2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.m
    public final void v(View view) {
        super.v(view);
        int size = this.X.size();
        for (int i = 0; i < size; i++) {
            ((m) this.X.get(i)).v(view);
        }
    }

    @Override // androidx.transition.m
    public final m x(j jVar) {
        super.x(jVar);
        return this;
    }

    @Override // androidx.transition.m
    public final void y(View view) {
        super.y(view);
        m[] mVarArr = this.c0;
        this.c0 = null;
        if (mVarArr == null) {
            mVarArr = new m[this.X.size()];
        }
        m[] mVarArr2 = (m[]) this.X.toArray(mVarArr);
        int size = this.X.size();
        for (int i = 0; i < size; i++) {
            mVarArr2[i].y(view);
        }
        Arrays.fill(mVarArr2, (Object) null);
        this.c0 = mVarArr2;
    }
}
