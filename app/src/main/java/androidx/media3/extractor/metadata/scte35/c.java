package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.g0;
import androidx.media3.common.util.h0;
import androidx.media3.common.util.v;
import androidx.media3.common.util.w;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.dynamite.g;
import com.google.firebase.heartbeatinfo.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g {
    public final w p = new w();
    public final v q = new v();
    public h0 r;

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // com.google.android.gms.dynamite.g
    public final androidx.media3.common.h0 j(androidx.media3.extractor.metadata.a aVar, ByteBuffer byteBuffer) {
        g0 dVar;
        long j;
        long j2;
        w wVar = this.p;
        v vVar = this.q;
        h0 h0Var = this.r;
        if (h0Var != null) {
            long j3 = aVar.G;
            synchronized (h0Var) {
                j2 = h0Var.b;
            }
            if (j3 != j2) {
                h0 h0Var2 = new h0(aVar.D);
                this.r = h0Var2;
                h0Var2.a(aVar.D - aVar.G);
            }
        } else {
            h0 h0Var3 = new h0(aVar.D);
            this.r = h0Var3;
            h0Var3.a(aVar.D - aVar.G);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        wVar.K(bArrArray, iLimit);
        vVar.l(bArrArray, iLimit);
        vVar.o(39);
        long jG = (((long) vVar.g(1)) << 32) | ((long) vVar.g(32));
        vVar.o(20);
        int iG = vVar.g(12);
        int iG2 = vVar.g(8);
        wVar.N(14);
        if (iG2 == 0) {
            dVar = new d();
        } else if (iG2 == 255) {
            long jB = wVar.B();
            int i = iG - 4;
            wVar.k(new byte[i], 0, i);
            dVar = new a(jB, jG, 0);
        } else if (iG2 == 4) {
            int iZ = wVar.z();
            ArrayList arrayList = new ArrayList(iZ);
            for (int i2 = 0; i2 < iZ; i2++) {
                wVar.B();
                boolean z = (wVar.z() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z) {
                    int iZ2 = wVar.z();
                    boolean z2 = (iZ2 & 64) != 0;
                    boolean z3 = (iZ2 & 32) != 0;
                    if (z2) {
                        wVar.B();
                    }
                    if (!z2) {
                        int iZ3 = wVar.z();
                        ArrayList arrayList3 = new ArrayList(iZ3);
                        for (int i3 = 0; i3 < iZ3; i3++) {
                            wVar.z();
                            wVar.B();
                            arrayList3.add(new com.google.android.material.shape.g());
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        wVar.z();
                        wVar.B();
                    }
                    wVar.G();
                    wVar.z();
                    wVar.z();
                }
                e eVar = new e();
                Collections.unmodifiableList(arrayList2);
                arrayList.add(eVar);
            }
            dVar = new d();
            Collections.unmodifiableList(arrayList);
        } else if (iG2 == 5) {
            h0 h0Var4 = this.r;
            wVar.B();
            boolean z4 = (wVar.z() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = -9223372036854775807L;
            } else {
                int iZ4 = wVar.z();
                boolean z5 = (iZ4 & 64) != 0;
                boolean z6 = (iZ4 & 32) != 0;
                boolean z7 = (iZ4 & 16) != 0;
                long jD = (!z5 || z7) ? -9223372036854775807L : a.d(jG, wVar);
                if (!z5) {
                    int iZ5 = wVar.z();
                    ArrayList arrayList4 = new ArrayList(iZ5);
                    for (int i4 = 0; i4 < iZ5; i4++) {
                        wVar.z();
                        h0Var4.b(!z7 ? a.d(jG, wVar) : -9223372036854775807L);
                        arrayList4.add(new k(18));
                    }
                    list = arrayList4;
                }
                if (z6) {
                    wVar.z();
                    wVar.B();
                }
                wVar.G();
                wVar.z();
                wVar.z();
                j = jD;
            }
            dVar = new a(j, h0Var4.b(j), list);
        } else if (iG2 != 6) {
            dVar = null;
        } else {
            h0 h0Var5 = this.r;
            long jD2 = a.d(jG, wVar);
            dVar = new a(jD2, h0Var5.b(jD2), 2);
        }
        return dVar == null ? new androidx.media3.common.h0(new g0[0]) : new androidx.media3.common.h0(dVar);
    }
}
