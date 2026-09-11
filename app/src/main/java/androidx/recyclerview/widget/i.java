package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends f0 {
    public final /* synthetic */ l a;

    public i(l lVar) {
        this.a = lVar;
    }

    @Override // androidx.recyclerview.widget.f0
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        l lVar = this.a;
        int i3 = lVar.a;
        int iComputeVerticalScrollRange = lVar.s.computeVerticalScrollRange();
        int i4 = lVar.r;
        lVar.t = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int iComputeHorizontalScrollRange = lVar.s.computeHorizontalScrollRange();
        int i5 = lVar.q;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        lVar.u = z;
        boolean z2 = lVar.t;
        if (!z2 && !z) {
            if (lVar.v != 0) {
                lVar.f(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            lVar.l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            lVar.k = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (lVar.u) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i5;
            lVar.o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            lVar.n = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = lVar.v;
        if (i6 == 0 || i6 == 1) {
            lVar.f(1);
        }
    }
}
