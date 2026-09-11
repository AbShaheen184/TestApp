package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import androidx.media3.common.r0;
import androidx.media3.common.util.j0;
import androidx.media3.common.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements androidx.media3.exoplayer.offline.a {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final u i;
    public final w j;
    public final Uri k;
    public final i l;
    public final List m;

    public c(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, i iVar, u uVar, w wVar, Uri uri, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = iVar;
        this.i = uVar;
        this.k = uri;
        this.j = wVar;
        this.m = arrayList;
    }

    @Override // androidx.media3.exoplayer.offline.a
    public final Object a(List list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new r0());
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            if (i >= this.m.size()) {
                break;
            }
            if (((r0) linkedList.peek()).e != i) {
                long jC = c(i);
                if (jC != -9223372036854775807L) {
                    j2 += jC;
                }
            } else {
                h hVarB = b(i);
                List list2 = hVarB.c;
                r0 r0Var = (r0) linkedList.poll();
                int i2 = r0Var.e;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = r0Var.y;
                    a aVar = (a) list2.get(i3);
                    List list3 = aVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(r0Var.z));
                        r0Var = (r0) linkedList.poll();
                        if (r0Var.e != i2) {
                            break;
                        }
                    } while (r0Var.y == i3);
                    j = j2;
                    arrayList2.add(new a(aVar.a, aVar.b, arrayList3, aVar.d, aVar.e, aVar.f));
                    if (r0Var.e != i2) {
                        break;
                    }
                    j2 = j;
                }
                linkedList.addFirst(r0Var);
                arrayList.add(new h(hVarB.a, hVarB.b - j, arrayList2, hVarB.d));
                j2 = j;
            }
            i++;
        }
        long j3 = j2;
        long j4 = this.b;
        return new c(this.a, j4 != -9223372036854775807L ? j4 - j3 : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }

    public final h b(int i) {
        return (h) this.m.get(i);
    }

    public final long c(int i) {
        long j;
        long j2;
        List list = this.m;
        if (i == list.size() - 1) {
            j = this.b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = ((h) list.get(i)).b;
        } else {
            j = ((h) list.get(i + 1)).b;
            j2 = ((h) list.get(i)).b;
        }
        return j - j2;
    }

    public final long d(int i) {
        return j0.Q(c(i));
    }
}
