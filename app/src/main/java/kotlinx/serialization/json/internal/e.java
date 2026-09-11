package kotlinx.serialization.json.internal;

import androidx.compose.foundation.gestures.z1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends z1 {
    public final boolean z;

    public e(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar, boolean z) {
        super(lVar);
        this.z = z;
    }

    @Override // androidx.compose.foundation.gestures.z1
    public final void g(byte b) {
        if (this.z) {
            l(String.valueOf(b & 255));
            return;
        }
        String strValueOf = String.valueOf(b & 255);
        strValueOf.getClass();
        ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) this.y).p(strValueOf);
    }

    @Override // androidx.compose.foundation.gestures.z1
    public final void i(int i) {
        if (this.z) {
            l(Long.toString(((long) i) & 4294967295L, 10));
            return;
        }
        String string = Long.toString(((long) i) & 4294967295L, 10);
        string.getClass();
        ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) this.y).p(string);
    }

    @Override // androidx.compose.foundation.gestures.z1
    public final void j(long j) {
        int i = 63;
        String str = "0";
        if (this.z) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / ((long) 5);
                    long j3 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % j3), 10);
                        j2 /= j3;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            l(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j4 = (j >>> 1) / ((long) 5);
                long j5 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j4 * j5)), 10);
                while (j4 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j4 % j5), 10);
                    j4 /= j5;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        str.getClass();
        ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) this.y).p(str);
    }

    @Override // androidx.compose.foundation.gestures.z1
    public final void k(short s) {
        if (this.z) {
            l(String.valueOf(s & 65535));
            return;
        }
        String strValueOf = String.valueOf(s & 65535);
        strValueOf.getClass();
        ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) this.y).p(strValueOf);
    }
}
