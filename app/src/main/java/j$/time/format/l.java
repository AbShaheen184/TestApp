package j$.time.format;

import j$.time.DateTimeException;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements e {
    public final e a;
    public final int b;
    public final char c;

    @Override // j$.time.format.e
    public final int I(w wVar, CharSequence charSequence, int i) {
        boolean z = wVar.c;
        if (i > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == charSequence.length()) {
            return ~i;
        }
        int length = this.b + i;
        if (length > charSequence.length()) {
            if (z) {
                return ~i;
            }
            length = charSequence.length();
        }
        int i2 = i;
        while (i2 < length && wVar.a(charSequence.charAt(i2), this.c)) {
            i2++;
        }
        int I = this.a.I(wVar, charSequence.subSequence(0, length), i2);
        return (I == length || !z) ? I : ~(i + i2);
    }

    public l(e eVar, int i, char c) {
        this.a = eVar;
        this.b = i;
        this.c = c;
    }

    @Override // j$.time.format.e
    public final boolean u(y yVar, StringBuilder sb) {
        int length = sb.length();
        if (!this.a.u(yVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.c);
            }
            return true;
        }
        throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    public final String toString() {
        String str;
        char c = this.c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + this.a + "," + this.b + str;
    }
}
