package androidx.compose.foundation.gestures;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends androidx.compose.ui.q implements androidx.compose.ui.node.h, androidx.compose.ui.node.u {
    public k1 L;
    public final m2 M;
    public boolean N;
    public final a2 O;
    public boolean Q;
    public boolean S;
    public final com.app.mlounge.data.music.e P = new com.app.mlounge.data.music.e(9);
    public long R = 0;

    public j(k1 k1Var, m2 m2Var, boolean z, a2 a2Var) {
        this.L = k1Var;
        this.M = m2Var;
        this.N = z;
        this.O = a2Var;
    }

    public static final float L0(j jVar, c cVar, long j) {
        androidx.compose.ui.geometry.c cVar2;
        int iCompare;
        if (androidx.compose.ui.unit.l.a(jVar.R, 0L)) {
            return 0.0f;
        }
        androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) jVar.P.y;
        int i = bVar.z - 1;
        Object[] objArr = bVar.e;
        if (i < objArr.length) {
            cVar2 = null;
            while (i >= 0) {
                androidx.compose.ui.geometry.c cVar3 = (androidx.compose.ui.geometry.c) ((f) objArr[i]).a.invoke();
                if (cVar3 != null) {
                    long jC = cVar3.c();
                    long jX = coil3.network.g.x(jVar.R);
                    int iOrdinal = jVar.L.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jX & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            coil3.g.a();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jX >> 32)));
                    }
                    if (iCompare > 0) {
                        if (cVar2 != null) {
                            break;
                        }
                        cVar2 = cVar3;
                        break;
                    }
                    cVar2 = cVar3;
                }
                i--;
            }
        } else {
            cVar2 = null;
        }
        if (cVar2 == null) {
            androidx.compose.ui.geometry.c cVar4 = jVar.Q ? (androidx.compose.ui.geometry.c) jVar.O.invoke() : null;
            if (cVar4 == null) {
                return 0.0f;
            }
            cVar2 = cVar4;
        }
        long jX2 = coil3.network.g.x(jVar.R);
        int iOrdinal2 = jVar.L.ordinal();
        if (iOrdinal2 == 0) {
            float f = cVar2.b;
            return cVar.a(f - ((int) (j & 4294967295L)), cVar2.d - f, Float.intBitsToFloat((int) (jX2 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f2 = cVar2.a;
            return cVar.a(f2 - ((int) (j >> 32)), cVar2.c - f2, Float.intBitsToFloat((int) (jX2 >> 32)));
        }
        coil3.g.a();
        return 0.0f;
    }

    public static boolean M0(j jVar, androidx.compose.ui.geometry.c cVar, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = jVar.R;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jO0 = jVar.O0(cVar, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jO0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jO0 & 4294967295L))) <= 0.5f;
    }

    @Override // androidx.compose.ui.q
    public final boolean A0() {
        return false;
    }

    public final void N0(long j) {
        androidx.compose.runtime.b0 b0Var = e.a;
        c cVar = (c) androidx.compose.ui.node.k.h(this, b0Var);
        if (this.S) {
            androidx.compose.foundation.internal.b.c("launchAnimation called when previous animation was running");
        }
        ((c) androidx.compose.ui.node.k.h(this, b0Var)).getClass();
        c.a.getClass();
        BuildersKt__Builders_commonKt.launch$default(z0(), null, CoroutineStart.UNDISPATCHED, new i(this, new b3(b.b), cVar, j, null), 1, null);
    }

    public final long O0(androidx.compose.ui.geometry.c cVar, long j, long j2) {
        long jX = coil3.network.g.x(j);
        int iOrdinal = this.L.ordinal();
        if (iOrdinal == 0) {
            c cVar2 = (c) androidx.compose.ui.node.k.h(this, e.a);
            float f = cVar.b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(cVar2.a(f - ((int) (j2 & 4294967295L)), cVar.d - f, Float.intBitsToFloat((int) (jX & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            coil3.g.a();
            return 0L;
        }
        c cVar3 = (c) androidx.compose.ui.node.k.h(this, e.a);
        float f2 = cVar.a;
        return (((long) Float.floatToRawIntBits(cVar3.a(f2 - ((int) (j2 >> 32)), cVar.c - f2, Float.intBitsToFloat((int) (jX >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }

    @Override // androidx.compose.ui.node.u
    public final void l(long j) {
        int iB;
        long j2;
        long j3;
        long j4;
        long j5 = this.R;
        this.R = j;
        int iOrdinal = this.L.ordinal();
        if (iOrdinal == 0) {
            iB = kotlin.jvm.internal.l.b((int) (j & 4294967295L), (int) (j5 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                coil3.g.a();
                return;
            }
            iB = kotlin.jvm.internal.l.b((int) (j >> 32), (int) (j5 >> 32));
        }
        if (iB >= 0) {
            return;
        }
        if (this.N) {
            j2 = 0;
        } else {
            if (this.L == k1.e) {
                j3 = ((long) 0) << 32;
                j4 = ((int) (j5 & 4294967295L)) - ((int) (j & 4294967295L));
            } else {
                j3 = ((long) (((int) (j5 >> 32)) - ((int) (j >> 32)))) << 32;
                j4 = 0;
            }
            j2 = j3 | (j4 & 4294967295L);
        }
        long j6 = j2;
        androidx.compose.ui.geometry.c cVar = (androidx.compose.ui.geometry.c) this.O.invoke();
        if (cVar == null || this.S || this.Q || !M0(this, cVar, j5, 0L, 2) || M0(this, cVar, 0L, j6, 1)) {
            return;
        }
        this.Q = true;
        N0(j6);
    }
}
