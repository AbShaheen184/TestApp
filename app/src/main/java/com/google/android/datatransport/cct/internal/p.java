package com.google.android.datatransport.cct.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends b0 {
    public final byte[] a;
    public final byte[] b;

    public p(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            boolean z = b0Var instanceof p;
            p pVar = (p) b0Var;
            if (Arrays.equals(this.a, z ? pVar.a : pVar.a)) {
                p pVar2 = (p) b0Var;
                if (Arrays.equals(this.b, z ? pVar2.b : pVar2.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
