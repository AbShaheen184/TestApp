package com.google.common.collect;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 extends k0 implements NavigableSet, Iterable {
    public static final /* synthetic */ int C = 0;
    public final transient Comparator A;
    public transient m0 B;

    public m0(Comparator comparator) {
        this.A = comparator;
    }

    public static i1 p(Comparator comparator) {
        return y0.y.equals(comparator) ? i1.E : new i1(a1.B, comparator);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.A;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        m0 m0VarP = this.B;
        if (m0VarP == null) {
            i1 i1Var = (i1) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(i1Var.A);
            m0VarP = i1Var.isEmpty() ? p(comparatorReverseOrder) : new i1(i1Var.D.v(), comparatorReverseOrder);
            this.B = m0VarP;
            m0VarP.B = this;
        }
        return m0VarP;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        i1 i1Var = (i1) this;
        return i1Var.r(0, i1Var.s(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final i1 subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        com.google.android.material.motion.a.f(this.A.compare(obj, obj2) <= 0);
        i1 i1Var = (i1) this;
        i1 i1VarR = i1Var.r(i1Var.t(obj, z), i1Var.D.size());
        return i1VarR.r(0, i1VarR.s(obj2, z2));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        i1 i1Var = (i1) this;
        return i1Var.r(i1Var.t(obj, true), i1Var.D.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        i1 i1Var = (i1) this;
        return i1Var.r(0, i1Var.s(obj, false));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        i1 i1Var = (i1) this;
        return i1Var.r(i1Var.t(obj, z), i1Var.D.size());
    }
}
