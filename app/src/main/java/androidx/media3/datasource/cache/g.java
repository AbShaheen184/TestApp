package androidx.media3.datasource.cache;

import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public i e;

    public g(int i, String str, i iVar) {
        this.a = i;
        this.b = str;
        this.e = iVar;
    }

    public final boolean a(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            f fVar = (f) arrayList.get(i);
            long j3 = fVar.a;
            long j4 = fVar.b;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.a == gVar.a && this.b.equals(gVar.b) && this.c.equals(gVar.c) && this.e.equals(gVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e(this.a * 31, 31, this.b);
    }
}
