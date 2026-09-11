package androidx.media3.exoplayer.source;

import android.os.Bundle;
import androidx.media3.exoplayer.l1;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.r4;
import com.google.android.gms.measurement.internal.s1;
import com.google.android.gms.measurement.internal.v2;
import com.google.android.gms.measurement.internal.v3;
import com.google.android.gms.measurement.internal.w3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements androidx.media3.extractor.ogg.g {
    public Object A;
    public long e;
    public long y;
    public Object z;

    public r0(long j, int i) {
        com.google.android.material.motion.a.q(((androidx.media3.exoplayer.upstream.a) this.z) == null);
        this.e = j;
        this.y = j + ((long) i);
    }

    public void a(Object obj, Object obj2, coil3.memory.e eVar) {
        coil3.memory.e eVar2 = (coil3.memory.e) obj2;
        ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) ((androidx.compose.ui.input.pointer.util.b) this.A).b).o((coil3.memory.a) obj, eVar2.a, eVar2.b, eVar2.c);
    }

    public long b() {
        if (this.y == -1) {
            long jC = 0;
            for (Map.Entry entry : ((LinkedHashMap) this.z).entrySet()) {
                jC += c(entry.getKey(), entry.getValue());
            }
            this.y = jC;
        }
        return this.y;
    }

    public long c(Object obj, Object obj2) throws Exception {
        try {
            long j = ((coil3.memory.e) obj2).c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.y = -1L;
            throw e;
        }
    }

    public void d(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.z;
        while (b() > j) {
            if (linkedHashMap.isEmpty()) {
                if (b() == 0) {
                    return;
                }
                net.luminis.tls.engine.impl.c.r("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) kotlin.collections.o.J(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.y = b() - c(key, value);
                a(key, value, null);
            }
        }
    }

    public boolean e(long j, boolean z, boolean z2) {
        w3 w3Var = (w3) this.A;
        w3Var.v();
        w3Var.w();
        s1 s1Var = (s1) w3Var.e;
        boolean zD = s1Var.d();
        com.google.android.gms.measurement.internal.x0 x0Var = s1Var.C;
        if (zD) {
            com.google.android.gms.measurement.internal.g1 g1Var = s1Var.B;
            s1.k(g1Var);
            l1 l1Var = g1Var.M;
            s1Var.H.getClass();
            l1Var.h(System.currentTimeMillis());
        }
        long j2 = j - this.e;
        if (!z && j2 < 1000) {
            s1.m(x0Var);
            x0Var.K.b(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.y;
            this.y = j;
        }
        s1.m(x0Var);
        x0Var.K.b(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !s1Var.A.K();
        f3 f3Var = s1Var.I;
        s1.l(f3Var);
        r4.s0(f3Var.z(z3), bundle, true);
        if (!z2) {
            v2 v2Var = s1Var.J;
            s1.l(v2Var);
            v2Var.C(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_e", bundle);
        }
        this.e = j;
        v3 v3Var = (v3) this.z;
        v3Var.c();
        v3Var.b(((Long) com.google.android.gms.measurement.internal.h0.p0.a(null)).longValue());
        return true;
    }

    @Override // androidx.media3.extractor.ogg.g
    public long f(androidx.media3.extractor.o oVar) {
        long j = this.y;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.y = -1L;
        return j2;
    }

    @Override // androidx.media3.extractor.ogg.g
    public androidx.media3.extractor.a0 l() {
        com.google.android.material.motion.a.q(this.e != -1);
        return new androidx.media3.extractor.s((androidx.media3.extractor.t) this.z, this.e, 0);
    }

    @Override // androidx.media3.extractor.ogg.g
    public void q(long j) {
        long[] jArr = (long[]) ((androidx.media3.common.util.b) this.A).y;
        this.y = jArr[androidx.media3.common.util.j0.f(jArr, j, true)];
    }

    public r0(String str, byte[] bArr, long j, long j2) {
        this.z = str;
        this.A = bArr;
        this.e = j;
        this.y = j2;
    }
}
