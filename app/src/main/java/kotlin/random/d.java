package kotlin.random;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final a e;

    static {
        Integer num = kotlin.internal.jdk8.a.a;
        e = (num == null || num.intValue() >= 34) ? new kotlin.random.jdk8.a() : new b();
    }

    public abstract int a(int i);

    public abstract int b();

    public int c(int i, int i2) {
        int iB;
        int i3;
        int iA;
        if (i2 <= i) {
            net.luminis.tls.engine.impl.c.p(com.google.android.material.resources.b.b(Integer.valueOf(i), Integer.valueOf(i2)));
            return 0;
        }
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iA = a(31 - Integer.numberOfLeadingZeros(i4));
            } else {
                do {
                    iB = b() >>> 1;
                    i3 = iB % i4;
                } while ((i4 - 1) + (iB - i3) < 0);
                iA = i3;
            }
            return i + iA;
        }
        while (true) {
            int iB2 = b();
            if (i <= iB2 && iB2 < i2) {
                return iB2;
            }
        }
    }

    public abstract long d();

    public long e(long j, long j2) {
        long jD;
        long j3;
        long jA;
        int iB;
        if (j2 <= j) {
            net.luminis.tls.engine.impl.c.p(com.google.android.material.resources.b.b(Long.valueOf(j), Long.valueOf(j2)));
            return 0L;
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iB = a(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iB = b();
                } else {
                    jA = (((long) a(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) b()) & 4294967295L);
                }
                jA = ((long) iB) & 4294967295L;
            } else {
                do {
                    jD = d() >>> 1;
                    j3 = jD % j4;
                } while ((j4 - 1) + (jD - j3) < 0);
                jA = j3;
            }
            return j + jA;
        }
        while (true) {
            long jD2 = d();
            if (j <= jD2 && jD2 < j2) {
                return jD2;
            }
        }
    }
}
