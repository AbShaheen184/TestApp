package androidx.compose.material3.internal;

import androidx.compose.material3.q1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements androidx.compose.ui.window.c0 {
    public final androidx.compose.material3.m A;
    public final c B;
    public final c C;
    public final b0 D;
    public final b0 E;
    public final d F;
    public final d G;
    public final d H;
    public final c0 I;
    public final c0 J;
    public final long e;
    public final androidx.compose.ui.unit.c y;
    public final int z;

    public h(long j, androidx.compose.ui.unit.c cVar, androidx.compose.material3.m mVar) {
        int iG0 = cVar.g0(q1.a);
        this.e = j;
        this.y = cVar;
        this.z = iG0;
        this.A = mVar;
        int iG1 = cVar.g0(Float.intBitsToFloat((int) (j >> 32)));
        androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
        this.B = new c(hVar, hVar, iG1);
        androidx.compose.ui.h hVar2 = androidx.compose.ui.c.L;
        this.C = new c(hVar2, hVar2, iG1);
        this.D = new b0(androidx.compose.ui.a.c);
        this.E = new b0(androidx.compose.ui.a.d);
        int iG2 = cVar.g0(Float.intBitsToFloat((int) (j & 4294967295L)));
        androidx.compose.ui.i iVar = androidx.compose.ui.c.G;
        androidx.compose.ui.i iVar2 = androidx.compose.ui.c.I;
        this.F = new d(iVar, iVar2, iG2);
        this.G = new d(iVar2, iVar, iG2);
        this.H = new d(androidx.compose.ui.c.H, iVar, iG2);
        this.I = new c0(iVar, iG0);
        this.J = new c0(iVar2, iG0);
    }

    @Override // androidx.compose.ui.window.c0
    public final long a(androidx.compose.ui.unit.k kVar, long j, androidx.compose.ui.unit.m mVar, long j2) {
        androidx.compose.ui.unit.k kVar2;
        long j3;
        char c;
        int iA;
        int i;
        int i2;
        char c2 = ' ';
        int i3 = (int) (j >> 32);
        boolean z = true;
        List listQ = com.google.common.base.c.q(this.B, this.C, ((int) (kVar.a() >> 32)) < i3 / 2 ? this.D : this.E);
        int size = listQ.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                kVar2 = kVar;
                j3 = j;
                c = c2;
                iA = 0;
                break;
            }
            k kVar3 = (k) listQ.get(i4);
            int i5 = (int) (j2 >> c2);
            int i6 = size;
            c = c2;
            j3 = j;
            int i7 = i4;
            kVar2 = kVar;
            iA = kVar3.a(kVar2, j3, i5, mVar);
            if (i7 == listQ.size() - 1 || (iA >= 0 && i5 + iA <= i3)) {
                break;
            }
            i4 = i7 + 1;
            size = i6;
            c2 = c;
        }
        int i8 = (int) (j3 & 4294967295L);
        List listQ2 = com.google.common.base.c.q(this.F, this.G, this.H, ((int) (kVar2.a() & 4294967295L)) < i8 / 2 ? this.I : this.J);
        int size2 = listQ2.size();
        int i9 = 0;
        while (i9 < size2) {
            boolean z2 = z;
            int i10 = (int) (j2 & 4294967295L);
            int iA2 = ((l) listQ2.get(i9)).a(kVar2, j3, i10);
            if (i9 == listQ2.size() - 1 || (iA2 >= (i2 = this.z) && i10 + iA2 <= i8 - i2)) {
                i = iA2;
                long j4 = (((long) iA) << c) | (((long) i) & 4294967295L);
                this.A.invoke(kVar2, androidx.room.r.a(j4, j2));
                return j4;
            }
            i9++;
            z = z2;
        }
        i = 0;
        long j5 = (((long) iA) << c) | (((long) i) & 4294967295L);
        this.A.invoke(kVar2, androidx.room.r.a(j5, j2));
        return j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.e == hVar.e && kotlin.jvm.internal.l.a(this.y, hVar.y) && this.z == hVar.z && kotlin.jvm.internal.l.a(this.A, hVar.A);
    }

    public final int hashCode() {
        return this.A.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.b(this.z, (this.y.hashCode() + (Long.hashCode(this.e) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) androidx.compose.ui.unit.g.a(this.e)) + ", density=" + this.y + ", verticalMargin=" + this.z + ", onPositionCalculated=" + this.A + ')';
    }
}
