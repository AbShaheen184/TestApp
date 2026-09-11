package androidx.media3.exoplayer.upstream;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final androidx.compose.foundation.lazy.layout.a g = new androidx.compose.foundation.lazy.layout.a(17);
    public static final androidx.compose.foundation.lazy.layout.a h = new androidx.compose.foundation.lazy.layout.a(18);
    public int d;
    public int e;
    public int f;
    public final r[] b = new r[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    public final void a(int i, float f) {
        r rVar;
        int i2 = this.c;
        ArrayList arrayList = this.a;
        if (i2 != 1) {
            Collections.sort(arrayList, g);
            this.c = 1;
        }
        int i3 = this.f;
        r[] rVarArr = this.b;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f = i4;
            rVar = rVarArr[i4];
        } else {
            rVar = new r();
        }
        int i5 = this.d;
        this.d = i5 + 1;
        rVar.a = i5;
        rVar.b = i;
        rVar.c = f;
        arrayList.add(rVar);
        this.e += i;
        while (true) {
            int i6 = this.e;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 - 2000;
            r rVar2 = (r) arrayList.get(0);
            int i8 = rVar2.b;
            if (i8 <= i7) {
                this.e -= i8;
                arrayList.remove(0);
                int i9 = this.f;
                if (i9 < 5) {
                    this.f = i9 + 1;
                    rVarArr[i9] = rVar2;
                }
            } else {
                rVar2.b = i8 - i7;
                this.e -= i7;
            }
        }
    }

    public final float b() {
        int i = this.c;
        ArrayList arrayList = this.a;
        if (i != 0) {
            Collections.sort(arrayList, h);
            this.c = 0;
        }
        float f = 0.5f * this.e;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            r rVar = (r) arrayList.get(i3);
            i2 += rVar.b;
            if (i2 >= f) {
                return rVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((r) androidx.privacysandbox.ads.adservices.java.internal.a.j(1, arrayList)).c;
    }
}
