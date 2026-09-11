package androidx.compose.ui.input.pointer.util;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final /* synthetic */ int a;
    public int b;
    public long[] c;

    public c(int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 2:
                this.b = i;
                long[] jArr = new long[i];
                this.c = jArr;
                Arrays.fill(jArr, -1L);
                break;
            default:
                this.c = new long[i];
                break;
        }
    }

    public void a(long j) {
        switch (this.a) {
            case 0:
                if (!c(j)) {
                    int i = this.b;
                    long[] jArrCopyOf = this.c;
                    if (i >= jArrCopyOf.length) {
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
                        this.c = jArrCopyOf;
                    }
                    jArrCopyOf[i] = j;
                    if (i >= this.b) {
                        this.b = i + 1;
                    }
                }
                break;
            default:
                int i2 = this.b;
                long[] jArr = this.c;
                if (i2 == jArr.length) {
                    this.c = Arrays.copyOf(jArr, i2 * 2);
                }
                long[] jArr2 = this.c;
                int i3 = this.b;
                this.b = i3 + 1;
                jArr2[i3] = j;
                break;
        }
    }

    public void b(long[] jArr) {
        int length = this.b + jArr.length;
        long[] jArr2 = this.c;
        if (length > jArr2.length) {
            this.c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.c, this.b, jArr.length);
        this.b = length;
    }

    public boolean c(long j) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public long d(int i) {
        if (i >= 0 && i < this.b) {
            return this.c[i];
        }
        com.google.gson.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.v("Invalid index ", i, ", size is "), this.b);
        return 0L;
    }

    public void e(long j) {
        int i = this.b;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.c[i2]) {
                int i3 = this.b - 1;
                while (i2 < i3) {
                    long[] jArr = this.c;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.b--;
                return;
            }
            i2++;
        }
    }
}
