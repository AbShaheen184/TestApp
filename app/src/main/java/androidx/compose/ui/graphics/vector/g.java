package androidx.compose.ui.graphics.vector;

import com.google.common.collect.a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements androidx.media3.exoplayer.text.a {
    public final ArrayList a;

    public g(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                new HashMap();
                new HashMap();
                break;
            case 2:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList(32);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.text.a
    public long a(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((androidx.media3.extractor.text.a) arrayList.get(0)).b) {
            return ((androidx.media3.extractor.text.a) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            androidx.media3.extractor.text.a aVar = (androidx.media3.extractor.text.a) arrayList.get(i);
            long j2 = aVar.b;
            long j3 = aVar.b;
            if (j < j2) {
                long j4 = ((androidx.media3.extractor.text.a) arrayList.get(i - 1)).d;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((androidx.media3.extractor.text.a) com.google.common.collect.q.k(arrayList)).d;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    @Override // androidx.media3.exoplayer.text.a
    public com.google.common.collect.h0 b(long j) {
        int iJ = j(j);
        if (iJ == 0) {
            com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
            return a1.B;
        }
        androidx.media3.extractor.text.a aVar = (androidx.media3.extractor.text.a) this.a.get(iJ - 1);
        long j2 = aVar.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return aVar.a;
        }
        com.google.common.collect.e0 e0Var2 = com.google.common.collect.h0.y;
        return a1.B;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    @Override // androidx.media3.exoplayer.text.a
    public boolean c(androidx.media3.extractor.text.a aVar, long j) {
        boolean z;
        long j2 = aVar.b;
        com.google.android.material.motion.a.f(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = aVar.d;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((androidx.media3.extractor.text.a) arrayList.get(size)).b) {
                arrayList.add(size + 1, aVar);
                return z;
            }
            if (((androidx.media3.extractor.text.a) arrayList.get(size)).b <= j) {
                z = false;
            }
        }
        arrayList.add(0, aVar);
        return z;
    }

    @Override // androidx.media3.exoplayer.text.a
    public void clear() {
        this.a.clear();
    }

    @Override // androidx.media3.exoplayer.text.a
    public long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j < ((androidx.media3.extractor.text.a) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((androidx.media3.extractor.text.a) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                androidx.media3.extractor.text.a aVar = (androidx.media3.extractor.text.a) arrayList.get(i - 1);
                long j3 = aVar.d;
                return (j3 == -9223372036854775807L || j3 > j) ? aVar.b : j3;
            }
        }
        androidx.media3.extractor.text.a aVar2 = (androidx.media3.extractor.text.a) com.google.common.collect.q.k(arrayList);
        long j4 = aVar2.d;
        return (j4 == -9223372036854775807L || j < j4) ? aVar2.b : j4;
    }

    @Override // androidx.media3.exoplayer.text.a
    public void e(long j) {
        int iJ = j(j);
        if (iJ == 0) {
            return;
        }
        ArrayList arrayList = this.a;
        long j2 = ((androidx.media3.extractor.text.a) arrayList.get(iJ - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iJ--;
        }
        arrayList.subList(0, iJ).clear();
    }

    public void f() {
        this.a.add(k.c);
    }

    public void g(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new l(f, f2, f3, f4, f5, f6));
    }

    public void h(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new t(f, f2, f3, f4, f5, f6));
    }

    public List i() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public int j(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((androidx.media3.extractor.text.a) arrayList.get(i)).b) {
                return i;
            }
            i++;
        }
    }

    public void k(float f) {
        this.a.add(new m(f));
    }

    public void l(float f) {
        this.a.add(new u(f));
    }

    public void m(float f, float f2) {
        this.a.add(new n(f, f2));
    }

    public void n(float f, float f2) {
        this.a.add(new v(f, f2));
    }

    public void o(float f, float f2) {
        this.a.add(new o(f, f2));
    }

    public void p(float f, float f2, float f3, float f4) {
        this.a.add(new q(f, f2, f3, f4));
    }

    public void q(float f, float f2, float f3, float f4) {
        this.a.add(new y(f, f2, f3, f4));
    }

    public void r(float f) {
        this.a.add(new b0(f));
    }

    public void s(float f) {
        this.a.add(new a0(f));
    }
}
