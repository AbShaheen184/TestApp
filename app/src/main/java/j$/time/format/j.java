package j$.time.format;

import j$.time.DateTimeException;

/* JADX INFO: loaded from: classes2.dex */
public class j implements e {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final j$.time.temporal.p a;
    public final int b;
    public final int c;
    public final f0 d;
    public final int e;

    public long a(y yVar, long j) {
        return j;
    }

    public j(j$.time.temporal.p pVar, int i, int i2, f0 f0Var) {
        this.a = pVar;
        this.b = i;
        this.c = i2;
        this.d = f0Var;
        this.e = 0;
    }

    public j(j$.time.temporal.p pVar, int i, int i2, f0 f0Var, int i3) {
        this.a = pVar;
        this.b = i;
        this.c = i2;
        this.d = f0Var;
        this.e = i3;
    }

    public j d() {
        if (this.e == -1) {
            return this;
        }
        return new j(this.a, this.b, this.c, this.d, -1);
    }

    public j e(int i) {
        return new j(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.e
    public boolean u(y yVar, StringBuilder sb) {
        j$.time.temporal.p pVar = this.a;
        Long lA = yVar.a(pVar);
        if (lA == null) {
            return false;
        }
        long jA = a(yVar, lA.longValue());
        c0 c0Var = yVar.b.c;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new DateTimeException("Field " + pVar + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i);
        }
        c0Var.getClass();
        int i2 = this.b;
        f0 f0Var = this.d;
        if (jA >= 0) {
            int i3 = b.a[f0Var.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jA >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = b.a[f0Var.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new DateTimeException("Field " + pVar + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - string.length(); i5++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    public boolean b(w wVar) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == f0.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x017d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0185  */
    /* JADX WARN: Code duplicated, block: B:124:0x0198  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0174, code lost:
    
        if (r6 <= r10) goto L98;
     */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int I(j$.time.format.w r27, java.lang.CharSequence r28, int r29) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.j.I(j$.time.format.w, java.lang.CharSequence, int):int");
    }

    public int c(w wVar, long j, int i, int i2) {
        return wVar.g(this.a, j, i, i2);
    }

    public String toString() {
        int i = this.c;
        j$.time.temporal.p pVar = this.a;
        f0 f0Var = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && f0Var == f0.NORMAL) {
            return "Value(" + pVar + ")";
        }
        if (i2 == i && f0Var == f0.NOT_NEGATIVE) {
            return "Value(" + pVar + "," + i2 + ")";
        }
        return "Value(" + pVar + "," + i2 + "," + i + "," + f0Var + ")";
    }
}
