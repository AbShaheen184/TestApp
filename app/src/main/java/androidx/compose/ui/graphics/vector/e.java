package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.p0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final d j;
    public boolean k;

    public e(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? androidx.compose.ui.graphics.t.i : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        d dVar = new d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = dVar;
        arrayList.add(dVar);
    }

    public static void a(e eVar, ArrayList arrayList, int i, p0 p0Var) {
        if (eVar.k) {
            androidx.compose.ui.internal.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((d) androidx.privacysandbox.ads.adservices.java.internal.a.j(1, eVar.i)).j.add(new k0("", arrayList, i, p0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final f b() {
        if (this.k) {
            androidx.compose.ui.internal.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() <= 1) {
                d dVar = this.j;
                f fVar = new f(this.a, this.b, this.c, this.d, this.e, new g0(dVar.a, dVar.b, dVar.c, dVar.d, dVar.e, dVar.f, dVar.g, dVar.h, dVar.i, dVar.j), this.f, this.g, this.h);
                this.k = true;
                return fVar;
            }
            if (this.k) {
                androidx.compose.ui.internal.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            d dVar2 = (d) arrayList.remove(arrayList.size() - 1);
            ((d) androidx.privacysandbox.ads.adservices.java.internal.a.j(1, arrayList)).j.add(new g0(dVar2.a, dVar2.b, dVar2.c, dVar2.d, dVar2.e, dVar2.f, dVar2.g, dVar2.h, dVar2.i, dVar2.j));
        }
    }
}
