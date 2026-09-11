package org.mozilla.javascript.dtoa;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class Decimal {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int MASK_28 = 268435455;
    public static final int MAX_CHARS = 32;
    private final char[] buf = new char[32];
    private final long digits;
    private final int exponent;
    private int length;
    private final boolean negative;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public enum Mode {
        DEFAULT,
        TO_EXPONENTIAL
    }

    public Decimal(long j, int i, boolean z) {
        this.digits = j;
        this.exponent = i;
        this.negative = z;
    }

    private void append(char c) {
        char[] cArr = this.buf;
        int i = this.length;
        this.length = i + 1;
        cArr[i] = c;
    }

    private void append8Digits(int i) {
        int iY = y(i);
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = iY * 10;
            appendDigit(i3 >>> 28);
            iY = i3 & MASK_28;
        }
    }

    private void appendDigit(int i) {
        char[] cArr = this.buf;
        int i2 = this.length;
        this.length = i2 + 1;
        cArr[i2] = (char) (i + 48);
    }

    private void exponent(int i) {
        append('e');
        if (i < 0) {
            append('-');
            i = -i;
        } else {
            append('+');
        }
        if (i < 10) {
            appendDigit(i);
            return;
        }
        if (i >= 100) {
            int i2 = (i * 1311) >>> 17;
            appendDigit(i2);
            i -= i2 * 100;
        }
        int i3 = (i * Token.ASSIGN_BITAND) >>> 10;
        appendDigit(i3);
        appendDigit(i - (i3 * 10));
    }

    private void lowDigits(int i) {
        if (i != 0) {
            append8Digits(i);
        }
        trimZeroes();
    }

    private String makeString() {
        return new String(this.buf, 0, this.length);
    }

    private String toExponential(int i, int i2, int i3, int i4) {
        appendDigit(i);
        append('.');
        append8Digits(i2);
        lowDigits(i3);
        exponent(i4 - 1);
        return makeString();
    }

    private String toFixed(int i, int i2, int i3, int i4) {
        appendDigit(i);
        int iY = y(i2);
        int i5 = 1;
        while (i5 < i4) {
            int i6 = iY * 10;
            appendDigit(i6 >>> 28);
            iY = i6 & MASK_28;
            i5++;
        }
        append('.');
        while (i5 <= 8) {
            int i7 = iY * 10;
            appendDigit(i7 >>> 28);
            iY = i7 & MASK_28;
            i5++;
        }
        lowDigits(i3);
        return makeString();
    }

    private String toFixedBigger(int i, int i2, int i3, int i4) {
        appendDigit(i);
        append8Digits(i2);
        int iY = y(i3);
        int i5 = 9;
        while (i5 < i4) {
            int i6 = iY * 10;
            appendDigit(i6 >>> 28);
            iY = i6 & MASK_28;
            i5++;
        }
        append('.');
        while (i5 <= 16) {
            int i7 = iY * 10;
            appendDigit(i7 >>> 28);
            iY = i7 & MASK_28;
            i5++;
        }
        trimZeroes();
        return makeString();
    }

    private String toFixedBiggest(int i, int i2, int i3, int i4) {
        appendDigit(i);
        append8Digits(i2);
        append8Digits(i3);
        for (int i5 = 17; i5 < i4; i5++) {
            append('0');
        }
        return makeString();
    }

    private String toFixedSmall(int i, int i2, int i3, int i4) {
        appendDigit(0);
        append('.');
        while (i4 < 0) {
            appendDigit(0);
            i4++;
        }
        appendDigit(i);
        append8Digits(i2);
        lowDigits(i3);
        return makeString();
    }

    private void trimZeroes() {
        int i;
        while (true) {
            i = this.length;
            if (i <= 0 || this.buf[i - 1] != '0') {
                break;
            } else {
                this.length = i - 1;
            }
        }
        if (i <= 0 || this.buf[i - 1] != '.') {
            return;
        }
        this.length = i - 1;
    }

    private int y(int i) {
        long j = ((long) (i + 1)) << 28;
        long j2 = j & 4294967295L;
        long j3 = j >> 32;
        long j4 = (1175553852 * j3) + ((j2 * 1175553852) >>> 32);
        return ((int) ((((j3 * 45035996) + (j4 >> 32)) + (((j2 * 45035996) + (4294967295L & j4)) >> 32)) >>> 20)) - 1;
    }

    public String toString(Mode mode) {
        this.length = 0;
        int iFlog10pow2 = MathUtils.flog10pow2(64 - Long.numberOfLeadingZeros(this.digits));
        if (this.digits >= MathUtils.pow10(iFlog10pow2)) {
            iFlog10pow2++;
        }
        long jPow10 = this.digits * MathUtils.pow10(17 - iFlog10pow2);
        int i = this.exponent + iFlog10pow2;
        long j = jPow10 & 4294967295L;
        long j2 = jPow10 >> 32;
        long j3 = (1175553852 * j2) + ((j * 1175553852) >>> 32);
        long j4 = (j2 * 45035996) + (j3 >> 32);
        long j5 = (j4 + (((j * 45035996) + (4294967295L & j3)) >> 32)) >>> 20;
        int i2 = (int) (jPow10 - (j5 * 100000000));
        int i3 = (int) ((1441151881 * j5) >>> 57);
        int i4 = (int) (j5 - (((long) i3) * 100000000));
        if (this.negative) {
            append('-');
        }
        if (mode == Mode.DEFAULT) {
            if (i > 0 && i <= 8) {
                return toFixed(i3, i4, i2, i);
            }
            if (8 < i && i <= 16) {
                return toFixedBigger(i3, i4, i2, i);
            }
            if (16 < i && i <= 21) {
                return toFixedBiggest(i3, i4, i2, i);
            }
            if (-6 < i && i <= 0) {
                return toFixedSmall(i3, i4, i2, i);
            }
        }
        return toExponential(i3, i4, i2, i);
    }

    public String toString() {
        return toString(Mode.DEFAULT);
    }
}
