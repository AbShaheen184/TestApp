package androidx.media3.container;

import androidx.media3.common.g0;
import androidx.media3.common.util.j0;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.a0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g0 {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public b(String str, byte[] bArr, int i, int i2) {
        byte b;
        str.getClass();
        boolean z = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                com.google.android.material.motion.a.f(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                com.google.android.material.motion.a.f(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                com.google.android.material.motion.a.f(z);
                break;
            case "auxiliary.tracks.map":
                com.google.android.material.motion.a.f(i2 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    public final ArrayList d() {
        com.google.android.material.motion.a.p("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && Arrays.equals(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + androidx.privacysandbox.ads.adservices.java.internal.a.e(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:54:0x0111  */
    /* JADX WARN: Code duplicated, block: B:57:0x0118  */
    /* JADX WARN: Code duplicated, block: B:60:0x0123  */
    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Code duplicated, block: B:63:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0131  */
    /* JADX WARN: Code duplicated, block: B:65:0x0133  */
    /* JADX WARN: Code duplicated, block: B:68:0x0138  */
    /* JADX WARN: Code duplicated, block: B:73:0x0169 A[EDGE_INSN: B:73:0x0169->B:75:0x016f BREAK  A[LOOP:0: B:33:0x00c0->B:74:0x016b]] */
    /* JADX WARN: Code duplicated, block: B:74:0x016b A[LOOP:0: B:33:0x00c0->B:74:0x016b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0173  */
    /* JADX WARN: Code duplicated, block: B:78:0x0175  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x013d A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00ba, please report this as an issue */
    public final String toString() {
        String string;
        com.google.common.io.b bVar;
        com.google.common.io.d bVar2;
        com.google.common.io.a aVar;
        char[] cArr;
        int i;
        int length;
        int i2;
        boolean z;
        char[] cArr2;
        int i3;
        com.google.common.io.a aVar2;
        byte[] bArr;
        byte[] bArrCopyOf;
        int i4;
        int i5;
        byte b;
        byte b2;
        boolean z2;
        char c;
        char c2;
        char c3;
        char c4;
        int i6 = this.d;
        if (i6 != 0) {
            if (i6 == 1) {
                string = j0.r(this.b);
            } else if (i6 == 23) {
                byte[] bArr2 = this.b;
                com.google.android.material.motion.a.b(bArr2.length, 4, "array too small: %s < %s", bArr2.length >= 4);
                string = String.valueOf(Float.intBitsToFloat(a0.p(bArr2[0], bArr2[1], bArr2[2], bArr2[3])));
            } else if (i6 == 67) {
                byte[] bArr3 = this.b;
                com.google.android.material.motion.a.b(bArr3.length, 4, "array too small: %s < %s", bArr3.length >= 4);
                string = String.valueOf(a0.p(bArr3[0], bArr3[1], bArr3[2], bArr3[3]));
            } else if (i6 == 75) {
                string = String.valueOf(this.b[0] & 255);
            } else if (i6 != 78) {
                byte[] bArr4 = this.b;
                String str = j0.a;
                bVar = com.google.common.io.d.e;
                bVar2 = bVar.c;
                if (bVar2 == null) {
                    aVar = bVar.a;
                    cArr = aVar.b;
                    for (char c5 : cArr) {
                        if (com.google.common.base.b.p(c5)) {
                            length = cArr.length;
                            i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    z = false;
                                    break;
                                }
                                c4 = cArr[i2];
                                if (c4 < 'a' && c4 <= 'z') {
                                    z = true;
                                    break;
                                }
                                i2++;
                            }
                            com.google.android.material.motion.a.p("Cannot call lowerCase() on a mixed-case alphabet", !z);
                            cArr2 = new char[cArr.length];
                            for (i3 = 0; i3 < cArr.length; i3++) {
                                c3 = cArr[i3];
                                if (com.google.common.base.b.p(c3)) {
                                    c3 = (char) (c3 ^ ' ');
                                }
                                cArr2[i3] = c3;
                            }
                            aVar2 = new com.google.common.io.a(androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder(), aVar.a, ".lowerCase()"), cArr2);
                            if (aVar.h) {
                                aVar = aVar2;
                                break;
                            }
                            bArr = aVar2.g;
                            if (aVar2.h) {
                                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                                for (i4 = 65; i4 <= 90; i4++) {
                                    i5 = i4 | 32;
                                    b = bArr[i4];
                                    b2 = bArr[i5];
                                    if (b == -1) {
                                        bArrCopyOf[i4] = b2;
                                    } else {
                                        if (b2 == -1) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        c = (char) i4;
                                        c2 = (char) i5;
                                        if (z2) {
                                            net.luminis.tls.engine.impl.c.r(com.google.android.material.resources.b.p("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                                            return null;
                                        }
                                        bArrCopyOf[i5] = b;
                                    }
                                }
                                aVar = new com.google.common.io.a(androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder(), aVar2.a, ".ignoreCase()"), aVar2.b, bArrCopyOf, true);
                                break;
                            }
                            aVar = aVar2;
                            break;
                        }
                    }
                    if (aVar == bVar.a) {
                        bVar2 = bVar;
                    } else {
                        bVar2 = new com.google.common.io.b(aVar);
                    }
                    bVar.c = bVar2;
                }
                string = bVar2.a(bArr4);
            } else {
                string = String.valueOf(new androidx.media3.common.util.w(this.b).F());
            }
        } else if (this.a.equals("auxiliary.tracks.map")) {
            ArrayList arrayListD = d();
            StringBuilder sbN = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.n("track types = ");
            new a(String.valueOf(',')).b(sbN, arrayListD.iterator());
            string = sbN.toString();
        } else {
            byte[] bArr5 = this.b;
            String str2 = j0.a;
            bVar = com.google.common.io.d.e;
            bVar2 = bVar.c;
            if (bVar2 == null) {
                aVar = bVar.a;
                cArr = aVar.b;
                while (i < r6) {
                    if (com.google.common.base.b.p(c5)) {
                        length = cArr.length;
                        i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                z = false;
                                break;
                            }
                            c4 = cArr[i2];
                            if (c4 < 'a') {
                            }
                            i2++;
                        }
                        com.google.android.material.motion.a.p("Cannot call lowerCase() on a mixed-case alphabet", !z);
                        cArr2 = new char[cArr.length];
                        while (i3 < cArr.length) {
                            c3 = cArr[i3];
                            if (com.google.common.base.b.p(c3)) {
                                c3 = (char) (c3 ^ ' ');
                            }
                            cArr2[i3] = c3;
                        }
                        aVar2 = new com.google.common.io.a(androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder(), aVar.a, ".lowerCase()"), cArr2);
                        if (aVar.h) {
                            aVar = aVar2;
                            break;
                        }
                        bArr = aVar2.g;
                        if (aVar2.h) {
                            bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            while (i4 <= 90) {
                                i5 = i4 | 32;
                                b = bArr[i4];
                                b2 = bArr[i5];
                                if (b == -1) {
                                    bArrCopyOf[i4] = b2;
                                } else {
                                    if (b2 == -1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    c = (char) i4;
                                    c2 = (char) i5;
                                    if (z2) {
                                        net.luminis.tls.engine.impl.c.r(com.google.android.material.resources.b.p("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                                        return null;
                                    }
                                    bArrCopyOf[i5] = b;
                                }
                            }
                            aVar = new com.google.common.io.a(androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder(), aVar2.a, ".ignoreCase()"), aVar2.b, bArrCopyOf, true);
                            break;
                        }
                        aVar = aVar2;
                        break;
                    }
                }
                if (aVar == bVar.a) {
                    bVar2 = bVar;
                } else {
                    bVar2 = new com.google.common.io.b(aVar);
                }
                bVar.c = bVar2;
            }
            string = bVar2.a(bArr5);
        }
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(new StringBuilder("mdta: key="), this.a, ", value=", string);
    }
}
