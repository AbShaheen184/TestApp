package androidx.media3.exoplayer.text;

import com.google.common.collect.a1;
import com.google.common.collect.d0;
import com.google.common.collect.e0;
import com.google.common.collect.h0;
import com.google.common.collect.p;
import com.google.common.collect.y0;
import com.google.common.collect.z;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {
    public static final z b = new z(new p(new androidx.media3.common.p(8), y0.y), new p(new androidx.media3.common.p(9), y0.z));
    public final ArrayList a = new ArrayList();

    @Override // androidx.media3.exoplayer.text.a
    public final long a(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((androidx.media3.extractor.text.a) arrayList.get(i)).b;
            long j3 = ((androidx.media3.extractor.text.a) arrayList.get(i)).d;
            if (j < j2) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j2);
                    break;
                }
                jMin = j2;
                break;
            }
            if (j < j3) {
                jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
            }
            i++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.text.a
    public final h0 b(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((androidx.media3.extractor.text.a) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    androidx.media3.extractor.text.a aVar = (androidx.media3.extractor.text.a) arrayList.get(i);
                    if (j >= aVar.b && j < aVar.d) {
                        arrayList2.add(aVar);
                    }
                    if (j < aVar.b) {
                        break;
                    }
                }
                a1 a1VarW = h0.w(b, arrayList2);
                d0 d0VarK = h0.k();
                for (int i2 = 0; i2 < a1VarW.A; i2++) {
                    d0VarK.c(((androidx.media3.extractor.text.a) a1VarW.get(i2)).a);
                }
                return d0VarK.g();
            }
        }
        e0 e0Var = h0.y;
        return a1.B;
    }

    @Override // androidx.media3.exoplayer.text.a
    public final boolean c(androidx.media3.extractor.text.a aVar, long j) {
        long j2 = aVar.b;
        com.google.android.material.motion.a.f(j2 != -9223372036854775807L);
        com.google.android.material.motion.a.f(aVar.c != -9223372036854775807L);
        boolean z = j2 <= j && j < aVar.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((androidx.media3.extractor.text.a) arrayList.get(size)).b) {
                arrayList.add(size + 1, aVar);
                return z;
            }
        }
        arrayList.add(0, aVar);
        return z;
    }

    @Override // androidx.media3.exoplayer.text.a
    public final void clear() {
        this.a.clear();
    }

    @Override // androidx.media3.exoplayer.text.a
    public final long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((androidx.media3.extractor.text.a) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long jMax = ((androidx.media3.extractor.text.a) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((androidx.media3.extractor.text.a) arrayList.get(i)).b;
            long j3 = ((androidx.media3.extractor.text.a) arrayList.get(i)).d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // androidx.media3.exoplayer.text.a
    public final void e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((androidx.media3.extractor.text.a) arrayList.get(i)).b;
            if (j > j2 && j > ((androidx.media3.extractor.text.a) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
