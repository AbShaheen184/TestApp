package androidx.compose.ui.unit;

import androidx.datastore.preferences.protobuf.h1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    default long G(float f) {
        return n(O(f));
    }

    default float L(int i) {
        return i / a();
    }

    default float O(float f) {
        return f / a();
    }

    float T();

    default float V(float f) {
        return a() * f;
    }

    float a();

    default int g0(float f) {
        float fV = V(f);
        if (Float.isInfinite(fV)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fV);
    }

    default long k0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fV = V(h.b(j));
        return (((long) Float.floatToRawIntBits(V(h.a(j)))) & 4294967295L) | (Float.floatToRawIntBits(fV) << 32);
    }

    default long n(float f) {
        float[] fArr = androidx.compose.ui.unit.fontscaling.b.a;
        if (T() < 1.03f) {
            return h1.u(f / T(), 4294967296L);
        }
        androidx.compose.ui.unit.fontscaling.a aVarA = androidx.compose.ui.unit.fontscaling.b.a(T());
        return h1.u(aVarA != null ? aVarA.a(f) : f / T(), 4294967296L);
    }

    default long o(long j) {
        if (j != 9205357640488583168L) {
            return _COROUTINE.b.b(O(Float.intBitsToFloat((int) (j >> 32))), O(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float s0(long j) {
        if (!p.a(o.b(j), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        return V(t(j));
    }

    default float t(long j) {
        float fC;
        float fT;
        if (!p.a(o.b(j), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        float[] fArr = androidx.compose.ui.unit.fontscaling.b.a;
        if (T() >= 1.03f) {
            androidx.compose.ui.unit.fontscaling.a aVarA = androidx.compose.ui.unit.fontscaling.b.a(T());
            fC = o.c(j);
            if (aVarA != null) {
                return aVarA.b(fC);
            }
            fT = T();
        } else {
            fC = o.c(j);
            fT = T();
        }
        return fT * fC;
    }
}
