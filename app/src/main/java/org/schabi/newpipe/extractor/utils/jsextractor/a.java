package org.schabi.newpipe.extractor.utils.jsextractor;

import org.mozilla.javascript.Kit;
import org.mozilla.javascript.ScriptRuntime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public boolean a;
    public int c;
    public int e;
    public final String h;
    public int k;
    public int l;
    public char[] b = new char[128];
    public final int[] d = new int[3];
    public int f = -1;
    public int i = 0;
    public int j = 0;
    public int g = 0;

    public a(String str) {
        this.h = str;
    }

    public static boolean d(int i) {
        return 48 <= i && i <= 57;
    }

    public static boolean e(int i, int i2) {
        if (i == 10 && d(i2)) {
            return true;
        }
        if (i == 16) {
            if (48 <= i2 && i2 <= 57) {
                return true;
            }
            if (97 <= i2 && i2 <= 102) {
                return true;
            }
            if (65 <= i2 && i2 <= 70) {
                return true;
            }
        }
        if (i == 8 && 48 <= i2 && i2 <= 55) {
            return true;
        }
        if (i == 2) {
            return 48 == i2 || i2 == 49;
        }
        return false;
    }

    public final void a(int i) {
        int i2 = this.c;
        char[] cArr = this.b;
        if (i2 == cArr.length) {
            char[] cArr2 = new char[cArr.length * 2];
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            this.b = cArr2;
        }
        this.b[i2] = (char) i;
        this.c = i2 + 1;
    }

    public final int b(boolean z, boolean z2) {
        int i;
        int i2 = this.e;
        if (i2 != 0) {
            this.j++;
            int i3 = i2 - 1;
            this.e = i3;
            return this.d[i3];
        }
        while (true) {
            int i4 = this.i;
            String str = this.h;
            if (i4 == str.length()) {
                return -1;
            }
            this.j++;
            int i5 = this.i;
            this.i = i5 + 1;
            char cCharAt = str.charAt(i5);
            if (!z2 && (i = this.f) >= 0) {
                if (i == 13 && cCharAt == '\n') {
                    this.f = 10;
                } else {
                    this.f = -1;
                    this.g++;
                }
            }
            if (cCharAt <= 127) {
                if (cCharAt == '\n' || cCharAt == '\r') {
                    this.f = cCharAt;
                    return 10;
                }
            } else if (cCharAt != 65279) {
                if (!z || cCharAt <= 127 || Character.getType(cCharAt) != 16) {
                    if (ScriptRuntime.isJSLineTerminator(cCharAt)) {
                        this.f = cCharAt;
                        return 10;
                    }
                }
            }
            return cCharAt;
        }
    }

    /* JADX WARN: Code duplicated, block: B:379:0x04d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:381:0x04d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:517:0x0611 A[PHI: r6 r9
  0x0611: PHI (r6v32 int) = (r6v31 int), (r6v31 int), (r6v36 int), (r6v36 int) binds: [B:509:0x05f4, B:510:0x05f6, B:512:0x0600, B:513:0x0602] A[DONT_GENERATE, DONT_INLINE]
  0x0611: PHI (r9v16 int) = (r9v15 int), (r9v15 int), (r9v18 int), (r9v18 int) binds: [B:509:0x05f4, B:510:0x05f6, B:512:0x0600, B:513:0x0602] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:675:0x04e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x04c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x04dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:0x04d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x04d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:0x04ca A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:379:0x04d0 -> B:375:0x04c7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final int c() {
        /*
            Method dump skipped, instruction units count: 2284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.schabi.newpipe.extractor.utils.jsextractor.a.c():int");
    }

    public final boolean f(int i) {
        int iB = b(true, true);
        if (iB == i) {
            this.l = this.j;
            return true;
        }
        j(iB);
        return false;
    }

    public final int g(int i, int i2) {
        if (!e(i, i2)) {
            return i2;
        }
        a(i2);
        int iB = b(true, false);
        if (iB == -1) {
            return -1;
        }
        while (true) {
            if (iB == 95) {
                iB = b(true, false);
                if (iB == 10 || iB == -1) {
                    return -2;
                }
                if (!e(i, iB)) {
                    i(iB);
                    return 95;
                }
                a(95);
            } else {
                if (!e(i, iB)) {
                    return iB;
                }
                a(iB);
                iB = b(true, false);
                if (iB == -1) {
                    return -1;
                }
            }
        }
    }

    public final void h() {
        int iB;
        do {
            iB = b(true, false);
            if (iB == -1) {
                break;
            }
        } while (iB != 10);
        i(iB);
        this.l = this.j;
    }

    public final void i(int i) {
        int i2 = this.e;
        int[] iArr = this.d;
        if (i2 != 0 && iArr[i2 - 1] == 10) {
            Kit.codeBug();
        }
        int i3 = this.e;
        this.e = i3 + 1;
        iArr[i3] = i;
        this.j--;
    }

    public final void j(int i) {
        int i2 = this.e;
        this.e = i2 + 1;
        this.d[i2] = i;
        this.j--;
    }
}
