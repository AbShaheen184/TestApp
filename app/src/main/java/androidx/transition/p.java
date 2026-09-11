package androidx.transition;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public m e;
    public ViewGroup y;

    /* JADX WARN: Code duplicated, block: B:101:0x0220  */
    /* JADX WARN: Code duplicated, block: B:103:0x022e  */
    /* JADX WARN: Code duplicated, block: B:104:0x023a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0251  */
    /* JADX WARN: Code duplicated, block: B:135:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:142:0x01f8 A[EDGE_INSN: B:142:0x01f8->B:91:0x01f8 BREAK  A[LOOP:1: B:19:0x0085->B:90:0x01ee], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[LOOP:0: B:15:0x0050->B:17:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:48:0x0105  */
    /* JADX WARN: Code duplicated, block: B:50:0x011a  */
    /* JADX WARN: Code duplicated, block: B:63:0x015f  */
    /* JADX WARN: Code duplicated, block: B:65:0x016f  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:96:0x020d  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        com.google.firebase.messaging.o oVar;
        com.google.firebase.messaging.o oVar2;
        androidx.collection.f fVar;
        androidx.collection.f fVar2;
        int i2;
        int[] iArr;
        boolean z;
        int i3;
        int i4;
        androidx.collection.f fVarO;
        ArrayList arrayList2;
        int i5;
        int i6;
        m mVar;
        Animator animator;
        i iVar;
        t tVar;
        t tVar2;
        int i7;
        com.google.firebase.messaging.o oVar3;
        boolean z2;
        int i8;
        View view;
        t tVar3;
        androidx.collection.f fVar3;
        int i9;
        int i10;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i11;
        View view4;
        View view5;
        androidx.collection.s sVar;
        int iG;
        int i12;
        View view6;
        com.google.firebase.messaging.o oVar4;
        Iterator it;
        m mVar2 = this.e;
        ViewGroup viewGroup = this.y;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z3 = true;
        if (!q.c.remove(viewGroup)) {
            return true;
        }
        androidx.collection.f fVarB = q.b();
        ArrayList arrayList3 = (ArrayList) fVarB.get(viewGroup);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            arrayList3.add(mVar2);
            mVar2.a(new o(this, fVarB));
            i = 0;
            mVar2.g(viewGroup, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).y(viewGroup);
                }
            }
            mVar2.H = new ArrayList();
            mVar2.I = new ArrayList();
            oVar = mVar2.D;
            oVar2 = mVar2.E;
            fVar = new androidx.collection.f((androidx.collection.f) oVar.y);
            fVar2 = new androidx.collection.f((androidx.collection.f) oVar2.y);
            i2 = 0;
            while (true) {
                iArr = mVar2.G;
                if (i2 < iArr.length) {
                    break;
                }
                i7 = iArr[i2];
                if (i7 != z3) {
                    oVar3 = oVar2;
                    z2 = z3;
                    for (i8 = fVar.z - 1; i8 >= 0; i8--) {
                        view = (View) fVar.f(i8);
                        if (view == null && mVar2.s(view) && (tVar3 = (t) fVar2.remove(view)) != null && mVar2.s(tVar3.b)) {
                            mVar2.H.add((t) fVar.g(i8));
                            mVar2.I.add(tVar3);
                        }
                    }
                } else if (i7 != 2) {
                    oVar3 = oVar2;
                    z2 = z3;
                    fVar3 = (androidx.collection.f) oVar.B;
                    androidx.collection.f fVar4 = (androidx.collection.f) oVar3.B;
                    i9 = fVar3.z;
                    for (i10 = 0; i10 < i9; i10++) {
                        view2 = (View) fVar3.i(i10);
                        if (view2 == null && mVar2.s(view2) && (view3 = (View) fVar4.get((String) fVar3.f(i10))) != null && mVar2.s(view3)) {
                            t tVar4 = (t) fVar.get(view2);
                            t tVar5 = (t) fVar2.get(view3);
                            if (tVar4 != null && tVar5 != null) {
                                mVar2.H.add(tVar4);
                                mVar2.I.add(tVar5);
                                fVar.remove(view2);
                                fVar2.remove(view3);
                            }
                        }
                    }
                } else if (i7 != 3) {
                    z2 = z3;
                    sparseArray = (SparseArray) oVar.z;
                    oVar3 = oVar2;
                    SparseArray sparseArray2 = (SparseArray) oVar3.z;
                    size = sparseArray.size();
                    for (i11 = 0; i11 < size; i11++) {
                        view4 = (View) sparseArray.valueAt(i11);
                        if (view4 == null && mVar2.s(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i11))) != null && mVar2.s(view5)) {
                            t tVar6 = (t) fVar.get(view4);
                            t tVar7 = (t) fVar2.get(view5);
                            if (tVar6 != null && tVar7 != null) {
                                mVar2.H.add(tVar6);
                                mVar2.I.add(tVar7);
                                fVar.remove(view4);
                                fVar2.remove(view5);
                            }
                        }
                    }
                } else if (i7 != 4) {
                    oVar3 = oVar2;
                    z2 = z3;
                } else {
                    sVar = (androidx.collection.s) oVar.A;
                    androidx.collection.s sVar2 = (androidx.collection.s) oVar2.A;
                    iG = sVar.g();
                    i12 = i;
                    while (i12 < iG) {
                        view6 = (View) sVar.h(i12);
                        if (view6 == null && mVar2.s(view6)) {
                            oVar4 = oVar2;
                            View view7 = (View) sVar2.b(sVar.d(i12));
                            if (view7 != null && mVar2.s(view7)) {
                                t tVar8 = (t) fVar.get(view6);
                                t tVar9 = (t) fVar2.get(view7);
                                if (tVar8 != null && tVar9 != null) {
                                    mVar2.H.add(tVar8);
                                    mVar2.I.add(tVar9);
                                    fVar.remove(view6);
                                    fVar2.remove(view7);
                                }
                            }
                            i12++;
                            oVar2 = oVar4;
                            z3 = z3;
                        } else {
                            oVar4 = oVar2;
                        }
                        i12++;
                        oVar2 = oVar4;
                        z3 = z3;
                    }
                    z2 = z3;
                    oVar3 = oVar2;
                }
                i2++;
                oVar2 = oVar3;
                z3 = z2;
                i = 0;
            }
            z = z3;
            for (i3 = 0; i3 < fVar.z; i3++) {
                tVar2 = (t) fVar.i(i3);
                if (mVar2.s(tVar2.b)) {
                    mVar2.H.add(tVar2);
                    mVar2.I.add(null);
                }
            }
            for (i4 = 0; i4 < fVar2.z; i4++) {
                tVar = (t) fVar2.i(i4);
                if (mVar2.s(tVar.b)) {
                    mVar2.I.add(tVar);
                    mVar2.H.add(null);
                }
            }
            fVarO = m.o();
            int i13 = fVarO.z;
            WindowId windowId = viewGroup.getWindowId();
            arrayList2 = new ArrayList();
            i5 = i13 - 1;
            while (i5 >= 0) {
                animator = (Animator) fVarO.f(i5);
                if (animator == null && (iVar = (i) fVarO.get(animator)) != null) {
                    m mVar3 = iVar.e;
                    View view8 = iVar.a;
                    if (view8 != null && windowId.equals(iVar.d)) {
                        t tVar10 = iVar.c;
                        boolean z4 = z;
                        t tVarQ = mVar2.q(view8, z4);
                        t tVarM = mVar2.m(view8, z4);
                        if (tVarQ == null && tVarM == null) {
                            tVarM = (t) ((androidx.collection.f) mVar2.E.y).get(view8);
                        }
                        if ((tVarQ != null || tVarM != null) && mVar3.r(tVar10, tVarM)) {
                            mVar3.n().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                fVarO.g(i5);
                            }
                        }
                    }
                }
                i5--;
                z = true;
            }
            for (i6 = 0; i6 < arrayList2.size(); i6++) {
                mVar = (m) arrayList2.get(i6);
                mVar.u(mVar, l.j);
                if (!mVar.O) {
                    mVar.O = true;
                    mVar.u(mVar, l.i);
                }
            }
            mVar2.k(viewGroup, mVar2.D, mVar2.E, mVar2.H, mVar2.I);
            mVar2.A();
            return true;
        }
        arrayList3 = new ArrayList();
        fVarB.put(viewGroup, arrayList3);
        arrayList3.add(mVar2);
        mVar2.a(new o(this, fVarB));
        i = 0;
        mVar2.g(viewGroup, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((m) it.next()).y(viewGroup);
            }
        }
        mVar2.H = new ArrayList();
        mVar2.I = new ArrayList();
        oVar = mVar2.D;
        oVar2 = mVar2.E;
        fVar = new androidx.collection.f((androidx.collection.f) oVar.y);
        fVar2 = new androidx.collection.f((androidx.collection.f) oVar2.y);
        i2 = 0;
        while (true) {
            iArr = mVar2.G;
            if (i2 < iArr.length) {
                break;
                break;
            }
            i7 = iArr[i2];
            if (i7 != z3) {
                oVar3 = oVar2;
                z2 = z3;
                while (i8 >= 0) {
                    view = (View) fVar.f(i8);
                    if (view == null) {
                    }
                }
            } else if (i7 != 2) {
                oVar3 = oVar2;
                z2 = z3;
                fVar3 = (androidx.collection.f) oVar.B;
                androidx.collection.f fVar5 = (androidx.collection.f) oVar3.B;
                i9 = fVar3.z;
                while (i10 < i9) {
                    view2 = (View) fVar3.i(i10);
                    if (view2 == null) {
                    }
                }
            } else if (i7 != 3) {
                z2 = z3;
                sparseArray = (SparseArray) oVar.z;
                oVar3 = oVar2;
                SparseArray sparseArray3 = (SparseArray) oVar3.z;
                size = sparseArray.size();
                while (i11 < size) {
                    view4 = (View) sparseArray.valueAt(i11);
                    if (view4 == null) {
                    }
                }
            } else if (i7 != 4) {
                oVar3 = oVar2;
                z2 = z3;
            } else {
                sVar = (androidx.collection.s) oVar.A;
                androidx.collection.s sVar3 = (androidx.collection.s) oVar2.A;
                iG = sVar.g();
                i12 = i;
                while (i12 < iG) {
                    view6 = (View) sVar.h(i12);
                    if (view6 == null) {
                        oVar4 = oVar2;
                    } else {
                        oVar4 = oVar2;
                    }
                    i12++;
                    oVar2 = oVar4;
                    z3 = z3;
                }
                z2 = z3;
                oVar3 = oVar2;
            }
            i2++;
            oVar2 = oVar3;
            z3 = z2;
            i = 0;
        }
        z = z3;
        while (i3 < fVar.z) {
            tVar2 = (t) fVar.i(i3);
            if (mVar2.s(tVar2.b)) {
                mVar2.H.add(tVar2);
                mVar2.I.add(null);
            }
        }
        while (i4 < fVar2.z) {
            tVar = (t) fVar2.i(i4);
            if (mVar2.s(tVar.b)) {
                mVar2.I.add(tVar);
                mVar2.H.add(null);
            }
        }
        fVarO = m.o();
        int i14 = fVarO.z;
        WindowId windowId2 = viewGroup.getWindowId();
        arrayList2 = new ArrayList();
        i5 = i14 - 1;
        while (i5 >= 0) {
            animator = (Animator) fVarO.f(i5);
            if (animator == null) {
            }
            i5--;
            z = true;
        }
        while (i6 < arrayList2.size()) {
            mVar = (m) arrayList2.get(i6);
            mVar.u(mVar, l.j);
            if (!mVar.O) {
                mVar.O = true;
                mVar.u(mVar, l.i);
            }
        }
        mVar2.k(viewGroup, mVar2.D, mVar2.E, mVar2.H, mVar2.I);
        mVar2.A();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.y;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        q.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) q.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((m) it.next()).y(viewGroup);
            }
        }
        this.e.h(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
