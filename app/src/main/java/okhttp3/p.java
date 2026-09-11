package okhttp3;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends e0 {
    public static final u d;
    public final List b;
    public final List c;

    static {
        kotlin.text.i iVar = u.e;
        d = com.google.android.material.resources.c.h("application/x-www-form-urlencoded");
    }

    public p(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.b = okhttp3.internal.g.j(arrayList);
        this.c = okhttp3.internal.g.j(arrayList2);
    }

    @Override // okhttp3.e0
    public final long a() {
        return e(null, true);
    }

    @Override // okhttp3.e0
    public final u b() {
        return d;
    }

    @Override // okhttp3.e0
    public final void d(okio.g gVar) throws EOFException {
        e(gVar, false);
    }

    public final long e(okio.g gVar, boolean z) throws EOFException {
        okio.f fVarD;
        if (z) {
            fVarD = new okio.f();
        } else {
            gVar.getClass();
            fVarD = gVar.d();
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                fVarD.o0(38);
            }
            fVarD.u0((String) list.get(i));
            fVarD.o0(61);
            fVarD.u0((String) this.c.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = fVarD.y;
        fVarD.a();
        return j;
    }
}
