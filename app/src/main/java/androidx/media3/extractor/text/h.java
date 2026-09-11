package androidx.media3.extractor.text;

import androidx.activity.y;
import androidx.media3.common.i0;
import androidx.media3.common.q;
import androidx.media3.common.r;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.w;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.n;
import androidx.media3.extractor.o;
import androidx.media3.extractor.p;
import androidx.media3.extractor.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.collections.a0;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements n {
    public final l a;
    public final r b;
    public final ArrayList c;
    public h0 f;
    public int g;
    public int h;
    public long[] i;
    public long j;
    public byte[] e = j0.b;
    public final w d = new w();

    public h(l lVar, r rVar) {
        r rVar2;
        this.a = lVar;
        if (rVar != null) {
            q qVarA = rVar.a();
            qVarA.n = i0.p("application/x-media3-cues");
            qVarA.j = rVar.o;
            qVarA.L = lVar.z();
            rVar2 = new r(qVarA);
        } else {
            rVar2 = null;
        }
        this.b = rVar2;
        this.c = new ArrayList();
        this.h = 0;
        this.i = j0.c;
        this.j = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.n
    public final boolean a(o oVar) {
        return true;
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        int i = this.h;
        com.google.android.material.motion.a.q((i == 0 || i == 5) ? false : true);
        this.j = j2;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[Catch: RuntimeException -> 0x00c7, TryCatch #0 {RuntimeException -> 0x00c7, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b2, B:41:0x00b8, B:44:0x00c9, B:37:0x008c), top: B:68:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008c A[Catch: RuntimeException -> 0x00c7, TryCatch #0 {RuntimeException -> 0x00c7, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b2, B:41:0x00b8, B:44:0x00c9, B:37:0x008c), top: B:68:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8 A[Catch: RuntimeException -> 0x00c7, LOOP:1: B:39:0x00b2->B:41:0x00b8, LOOP_END, TryCatch #0 {RuntimeException -> 0x00c7, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b2, B:41:0x00b8, B:44:0x00c9, B:37:0x008c), top: B:68:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:68:0x007e A[EXC_TOP_SPLITTER, PHI: r22
  0x007e: PHI (r22v4 int) = (r22v5 int), (r22v6 int) binds: [B:32:0x007c, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // androidx.media3.extractor.n
    public final int c(o oVar, androidx.media3.extractor.r rVar) throws androidx.media3.common.j0 {
        int i;
        long j;
        k kVar;
        int i2;
        int i3 = this.h;
        com.google.android.material.motion.a.q((i3 == 0 || i3 == 5) ? false : true);
        int i4 = this.h;
        int iC = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i4 == 1) {
            int iC2 = oVar.getLength() != -1 ? a0.c(oVar.getLength()) : 1024;
            if (iC2 > this.e.length) {
                this.e = new byte[iC2];
            }
            this.g = 0;
            this.h = 2;
        }
        int i5 = this.h;
        ArrayList arrayList = this.c;
        if (i5 == 2) {
            byte[] bArr = this.e;
            if (bArr.length == this.g) {
                this.e = Arrays.copyOf(bArr, bArr.length + LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            }
            byte[] bArr2 = this.e;
            int i6 = this.g;
            int i7 = oVar.read(bArr2, i6, bArr2.length - i6);
            if (i7 != -1) {
                this.g += i7;
            }
            long length = oVar.getLength();
            if (length != -1) {
                i = 0;
                if (this.g == length) {
                    try {
                        j = this.j;
                        if (j != -9223372036854775807L) {
                            kVar = new k(j, true);
                        } else {
                            kVar = k.c;
                        }
                        this.a.k(this.e, 0, this.g, kVar, new y(this, 21));
                        Collections.sort(arrayList);
                        this.i = new long[arrayList.size()];
                        for (i2 = i; i2 < arrayList.size(); i2++) {
                            this.i[i2] = ((g) arrayList.get(i2)).e;
                        }
                        this.e = j0.b;
                        this.h = 4;
                    } catch (RuntimeException e) {
                        throw androidx.media3.common.j0.a(e, "SubtitleParser failed.");
                    }
                }
            } else {
                i = 0;
            }
            if (i7 == -1) {
                j = this.j;
                if (j != -9223372036854775807L) {
                    kVar = new k(j, true);
                } else {
                    kVar = k.c;
                }
                this.a.k(this.e, 0, this.g, kVar, new y(this, 21));
                Collections.sort(arrayList);
                this.i = new long[arrayList.size()];
                while (i2 < arrayList.size()) {
                    this.i[i2] = ((g) arrayList.get(i2)).e;
                }
                this.e = j0.b;
                this.h = 4;
            }
        } else {
            i = 0;
        }
        if (this.h == 3) {
            if (oVar.getLength() != -1) {
                iC = a0.c(oVar.getLength());
            }
            if (oVar.i(iC) == -1) {
                long j2 = this.j;
                for (int iF = j2 == -9223372036854775807L ? i : j0.f(this.i, j2, true); iF < arrayList.size(); iF++) {
                    f((g) arrayList.get(iF));
                }
                this.h = 4;
            }
        }
        if (this.h == 4) {
            return -1;
        }
        return i;
    }

    @Override // androidx.media3.extractor.n
    public final void d(p pVar) {
        com.google.android.material.motion.a.q(this.h == 0);
        h0 h0VarU = pVar.u(0, 3);
        this.f = h0VarU;
        r rVar = this.b;
        if (rVar != null) {
            h0VarU.e(rVar);
            pVar.o();
            pVar.g(new x(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.h = 1;
    }

    public final void f(g gVar) {
        this.f.getClass();
        byte[] bArr = gVar.y;
        int length = bArr.length;
        w wVar = this.d;
        wVar.getClass();
        wVar.K(bArr, bArr.length);
        this.f.f(length, wVar);
        this.f.g(gVar.e, 1, length, 0, null);
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.a.reset();
        this.h = 5;
    }
}
