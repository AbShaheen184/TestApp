package androidx.compose.foundation.lazy.grid;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final int a;
    public final o[] b;
    public final androidx.compose.foundation.text.input.internal.o c;
    public final List d;
    public final int e;
    public final int f;
    public final int g;

    public p(int i, o[] oVarArr, androidx.compose.foundation.text.input.internal.o oVar, List list, int i2) {
        this.a = i;
        this.b = oVarArr;
        this.c = oVar;
        this.d = list;
        this.e = i2;
        int iMax = 0;
        for (o oVar2 : oVarArr) {
            iMax = Math.max(iMax, oVar2.k);
        }
        this.f = iMax;
        int i3 = iMax + this.e;
        this.g = i3 >= 0 ? i3 : 0;
    }

    public final o[] a(int i, int i2, int i3) {
        o[] oVarArr = this.b;
        int length = oVarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            o oVar = oVarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((b) this.d.get(i5)).a;
            oVar.k(i, ((int[]) this.c.z)[i6], i2, i3, this.a, i6);
            i6 += i8;
            i4++;
            i5 = i7;
        }
        return oVarArr;
    }
}
