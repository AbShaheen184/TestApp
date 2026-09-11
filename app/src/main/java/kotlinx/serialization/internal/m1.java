package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements kotlinx.serialization.a {
    public static final m1 a = new m1();
    public static final s0 b = new s0("kotlin.uuid.Uuid", kotlinx.serialization.descriptors.d.G);

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        String strM = bVar.m();
        strM.getClass();
        int length = strM.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char cCharAt = strM.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = kotlin.text.d.b[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                com.google.common.base.i.v(strM, i, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = strM.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = kotlin.text.d.b[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                com.google.common.base.i.v(strM, i2, "a hexadecimal digit");
                throw null;
            }
            if (j != 0 || j4 != 0) {
                return new kotlin.uuid.a(j, j4);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(strM.length() <= 64 ? strM : strM.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(strM.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j7 = 0;
            while (i < 8) {
                long j8 = j7 << 4;
                char cCharAt3 = strM.charAt(i);
                if ((cCharAt3 >>> '\b') == 0) {
                    long j9 = kotlin.text.d.b[cCharAt3];
                    if (j9 >= 0) {
                        j7 = j8 | j9;
                        i++;
                    }
                }
                com.google.common.base.i.v(strM, i, "a hexadecimal digit");
                throw null;
            }
            if (strM.charAt(8) != '-') {
                com.google.common.base.i.v(strM, 8, "'-' (hyphen)");
                throw null;
            }
            long j10 = 0;
            for (int i3 = 9; i3 < 13; i3++) {
                long j11 = j10 << 4;
                char cCharAt4 = strM.charAt(i3);
                if ((cCharAt4 >>> '\b') == 0) {
                    long j12 = kotlin.text.d.b[cCharAt4];
                    if (j12 >= 0) {
                        j10 = j11 | j12;
                    }
                }
                com.google.common.base.i.v(strM, i3, "a hexadecimal digit");
                throw null;
            }
            if (strM.charAt(13) != '-') {
                com.google.common.base.i.v(strM, 13, "'-' (hyphen)");
                throw null;
            }
            long j13 = 0;
            for (int i4 = 14; i4 < 18; i4++) {
                long j14 = j13 << 4;
                char cCharAt5 = strM.charAt(i4);
                if ((cCharAt5 >>> '\b') == 0) {
                    long j15 = kotlin.text.d.b[cCharAt5];
                    if (j15 >= 0) {
                        j13 = j14 | j15;
                    }
                }
                com.google.common.base.i.v(strM, i4, "a hexadecimal digit");
                throw null;
            }
            if (strM.charAt(18) != '-') {
                com.google.common.base.i.v(strM, 18, "'-' (hyphen)");
                throw null;
            }
            long j16 = 0;
            for (int i5 = 19; i5 < 23; i5++) {
                long j17 = j16 << 4;
                char cCharAt6 = strM.charAt(i5);
                if ((cCharAt6 >>> '\b') == 0) {
                    long j18 = kotlin.text.d.b[cCharAt6];
                    if (j18 >= 0) {
                        j16 = j17 | j18;
                    }
                }
                com.google.common.base.i.v(strM, i5, "a hexadecimal digit");
                throw null;
            }
            if (strM.charAt(23) != '-') {
                com.google.common.base.i.v(strM, 23, "'-' (hyphen)");
                throw null;
            }
            long j19 = 0;
            for (int i6 = 24; i6 < 36; i6++) {
                long j20 = j19 << 4;
                char cCharAt7 = strM.charAt(i6);
                if ((cCharAt7 >>> '\b') == 0) {
                    long j21 = kotlin.text.d.b[cCharAt7];
                    if (j21 >= 0) {
                        j19 = j20 | j21;
                    }
                }
                com.google.common.base.i.v(strM, i6, "a hexadecimal digit");
                throw null;
            }
            long j22 = (j7 << 32) | (j10 << 16) | j13;
            long j23 = (j16 << 48) | j19;
            if (j22 != 0 || j23 != 0) {
                return new kotlin.uuid.a(j22, j23);
            }
        }
        return kotlin.uuid.a.z;
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        kotlin.uuid.a aVar = (kotlin.uuid.a) obj;
        aVar.getClass();
        nVar.r(aVar.toString());
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return b;
    }
}
