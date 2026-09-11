package com.google.common.io;

import com.google.android.material.textfield.p;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean h;

    public a(String str, char[] cArr, byte[] bArr, boolean z) {
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int iQ = p.q(length);
            this.d = iQ;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iQ);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.e = i;
            this.f = iQ >> iNumberOfTrailingZeros;
            this.c = cArr.length - 1;
            this.g = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f; i2++) {
                int i3 = this.d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[p.j(i2 * 8, i3)] = true;
            }
            this.h = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.h == aVar.h && Arrays.equals(this.b, aVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    net.luminis.tls.engine.impl.c.o(com.google.android.material.resources.b.p("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                net.luminis.tls.engine.impl.c.o(com.google.android.material.resources.b.p("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
        }
        this(str, cArr, bArr, false);
    }
}
