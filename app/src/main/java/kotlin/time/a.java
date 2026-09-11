package kotlin.time;

import kotlin.jvm.internal.l;
import kotlin.text.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable {
    public final long e;
    public static final g y = new g(1);
    public static final long z = com.google.common.base.b.g(4611686018427387903L);
    public static final long A = com.google.common.base.b.g(-4611686018427387903L);
    public static final long B = 9223372036854759646L;

    public static final long a(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long jA = com.google.common.base.b.a(j, j4);
        if (-4611686018426L > jA || jA >= 4611686018427L) {
            return com.google.common.base.b.g(jA);
        }
        long j5 = ((jA * j3) + (j2 - (j4 * j3))) << 1;
        int i = b.a;
        return j5;
    }

    public static final void d(StringBuilder sb, int i, int i2, int i3, String str, boolean z2) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strH0 = k.h0(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strH0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strH0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z2 || i6 >= 3) {
                sb.append((CharSequence) strH0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strH0, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int e(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return l.c(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final long f(long j) {
        return ((((int) j) & 1) != 1 || h(j)) ? j(j, c.MILLISECONDS) : j >> 1;
    }

    public static final int g(long j) {
        if (h(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % ((long) 1000)) * ((long) 1000000) : (j >> 1) % ((long) 1000000000));
    }

    public static final boolean h(long j) {
        return j == z || j == A;
    }

    public static final long i(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return com.google.common.base.b.g(j3 / ((long) 1000000));
            }
            long j4 = j3 << 1;
            int i2 = b.a;
            return j4;
        }
        long jA = com.google.common.base.b.a(j >> 1, j2 >> 1);
        if (jA == 9223372036854759646L) {
            net.luminis.tls.engine.impl.c.o("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jA == 4611686018427387903L || jA == -4611686018427387903L) {
            return com.google.common.base.b.g(jA);
        }
        if (-4611686018426L > jA || jA >= 4611686018427L) {
            return com.google.common.base.b.g(com.google.android.material.resources.c.d(jA, -4611686018427387903L, 4611686018427387903L));
        }
        long j5 = (jA * ((long) 1000000)) << 1;
        int i3 = b.a;
        return j5;
    }

    public static final long j(long j, c cVar) {
        if (j == z) {
            return Long.MAX_VALUE;
        }
        if (j == A) {
            return Long.MIN_VALUE;
        }
        return cVar.e.convert(j >> 1, ((((int) j) & 1) == 0 ? c.NANOSECONDS : c.MILLISECONDS).e);
    }

    public static String k(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == z) {
            return "Infinity";
        }
        if (j == A) {
            return "-Infinity";
        }
        int i = 0;
        boolean z2 = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append('-');
        }
        long jL = j < 0 ? l(j) : j;
        long j2 = j(jL, c.DAYS);
        int iJ = h(jL) ? 0 : (int) (j(jL, c.HOURS) % ((long) 24));
        int iJ2 = h(jL) ? 0 : (int) (j(jL, c.MINUTES) % ((long) 60));
        int iJ3 = h(jL) ? 0 : (int) (j(jL, c.SECONDS) % ((long) 60));
        int iG = g(jL);
        boolean z3 = j2 != 0;
        boolean z4 = iJ != 0;
        boolean z5 = iJ2 != 0;
        boolean z6 = (iJ3 == 0 && iG == 0) ? false : true;
        if (z3) {
            sb.append(j2);
            sb.append('d');
            i = 1;
        }
        if (z4 || (z3 && (z5 || z6))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iJ);
            sb.append('h');
            i = i2;
        }
        if (z5 || (z6 && (z4 || z3))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iJ2);
            sb.append('m');
            i = i3;
        }
        if (z6) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iJ3 != 0 || z3 || z4 || z5) {
                d(sb, iJ3, iG, 9, "s", false);
            } else if (iG >= 1000000) {
                d(sb, iG / 1000000, iG % 1000000, 6, "ms", false);
            } else if (iG >= 1000) {
                d(sb, iG / 1000, iG % 1000, 3, "us", false);
            } else {
                sb.append(iG);
                sb.append("ns");
            }
            i = i4;
        }
        if (z2 && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long l(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = b.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return e(this.e, ((a) obj).e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.e == ((a) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e);
    }

    public final String toString() {
        return k(this.e);
    }
}
