package androidx.media3.extractor.text;

import androidx.media3.common.util.j0;
import com.google.common.collect.a1;
import com.google.common.collect.e0;
import com.google.common.collect.h0;
import com.google.common.collect.p;
import com.google.common.collect.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {
    public static final p z = new p(new androidx.media3.common.p(14), y0.y);
    public final h0 e;
    public final long[] y;

    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    public b(a1 a1Var) {
        int i = a1Var.A;
        long j = -9223372036854775807L;
        int i2 = 0;
        if (i == 1) {
            e0 e0VarListIterator = a1Var.listIterator(0);
            Object next = e0VarListIterator.next();
            if (e0VarListIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i2 < 4 && e0VarListIterator.hasNext()) {
                    sb.append(", ");
                    sb.append(e0VarListIterator.next());
                    i2++;
                }
                if (e0VarListIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            a aVar = (a) next;
            long j2 = aVar.b;
            long j3 = aVar.c;
            long j4 = j2 == -9223372036854775807L ? 0L : j2;
            h0 h0Var = aVar.a;
            if (j3 == -9223372036854775807L) {
                this.e = h0.s(h0Var);
                this.y = new long[]{j4};
                return;
            } else {
                e0 e0Var = h0.y;
                this.e = h0.t(h0Var, a1.B);
                this.y = new long[]{j4, j3 + j4};
                return;
            }
        }
        long[] jArr = new long[i * 2];
        this.y = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        a1 a1VarW = h0.w(z, a1Var);
        int i3 = 0;
        while (i2 < a1VarW.A) {
            a aVar2 = (a) a1VarW.get(i2);
            long j5 = aVar2.b;
            long j6 = aVar2.c;
            h0 h0Var2 = aVar2.a;
            j5 = j5 == j ? 0L : j5;
            long j7 = j5 + j6;
            if (i3 != 0) {
                int i4 = i3 - 1;
                long j8 = this.y[i4];
                if (j8 < j5) {
                    this.y[i3] = j5;
                    arrayList.add(h0Var2);
                    i3++;
                } else if (j8 == j5 && ((h0) arrayList.get(i4)).isEmpty()) {
                    arrayList.set(i4, h0Var2);
                } else {
                    androidx.media3.common.util.c.t("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.y[i4] = j5;
                    arrayList.set(i4, h0Var2);
                }
            } else {
                this.y[i3] = j5;
                arrayList.add(h0Var2);
                i3++;
            }
            if (j6 != j) {
                this.y[i3] = j7;
                arrayList.add(a1.B);
                i3++;
            }
            i2++;
            j = j;
        }
        this.e = h0.o(arrayList);
    }

    @Override // androidx.media3.extractor.text.d
    public final int e(long j) {
        int iB = j0.b(this.y, j, false);
        if (iB < this.e.size()) {
            return iB;
        }
        return -1;
    }

    @Override // androidx.media3.extractor.text.d
    public final long f(int i) {
        com.google.android.material.motion.a.f(i < this.e.size());
        return this.y[i];
    }

    @Override // androidx.media3.extractor.text.d
    public final List j(long j) {
        int iF = j0.f(this.y, j, false);
        if (iF != -1) {
            return (h0) this.e.get(iF);
        }
        e0 e0Var = h0.y;
        return a1.B;
    }

    @Override // androidx.media3.extractor.text.d
    public final int k() {
        return this.e.size();
    }
}
