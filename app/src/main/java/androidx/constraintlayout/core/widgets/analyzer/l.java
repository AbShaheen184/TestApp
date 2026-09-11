package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public o a;
    public ArrayList b;

    public static long a(f fVar, long j) {
        o oVar = fVar.d;
        ArrayList arrayList = fVar.k;
        if (oVar instanceof j) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != oVar) {
                    jMin = Math.min(jMin, a(fVar2, ((long) fVar2.f) + j));
                }
            }
        }
        f fVar3 = oVar.i;
        f fVar4 = oVar.h;
        if (fVar != fVar3) {
            return jMin;
        }
        long j2 = j - oVar.j();
        return Math.min(Math.min(jMin, a(fVar4, j2)), j2 - ((long) fVar4.f));
    }

    public static long b(f fVar, long j) {
        o oVar = fVar.d;
        ArrayList arrayList = fVar.k;
        if (oVar instanceof j) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != oVar) {
                    jMax = Math.max(jMax, b(fVar2, ((long) fVar2.f) + j));
                }
            }
        }
        f fVar3 = oVar.h;
        f fVar4 = oVar.i;
        if (fVar != fVar3) {
            return jMax;
        }
        long j2 = oVar.j() + j;
        return Math.max(Math.max(jMax, b(fVar4, j2)), j2 - ((long) fVar4.f));
    }
}
