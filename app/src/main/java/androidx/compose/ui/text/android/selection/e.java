package androidx.compose.ui.text.android.selection;

import android.content.res.TypedArray;
import android.util.SparseArray;
import androidx.appcompat.widget.c2;
import androidx.compose.foundation.text.selection.w;
import androidx.emoji2.text.j;
import androidx.media3.extractor.mp4.s;
import coil3.compose.internal.f;
import com.caverock.androidsvg.d0;
import com.caverock.androidsvg.k0;
import com.caverock.androidsvg.p;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.l;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class e implements k0 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public e(CharSequence charSequence, int i, Locale locale) {
        this.a = 0;
        this.d = charSequence;
        if (charSequence.length() < 0) {
            androidx.compose.ui.text.internal.a.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            androidx.compose.ui.text.internal.a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new androidx.compose.ui.text.android.e(charSequence, i));
    }

    public static boolean z(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public int A(int i) {
        i(i);
        int iFollowing = ((BreakIterator) this.e).following(i);
        return (x(iFollowing + (-1)) && x(iFollowing) && !w(iFollowing)) ? A(iFollowing) : iFollowing;
    }

    public Integer B() {
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        String str = (String) this.d;
        this.b = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    public float C() {
        p pVar = (p) this.e;
        float fA = pVar.a(this.b, this.c, (String) this.d);
        if (!Float.isNaN(fA)) {
            this.b = pVar.a;
        }
        return fA;
    }

    public d0 D() {
        float fC = C();
        if (Float.isNaN(fC)) {
            return null;
        }
        int iH = H();
        return iH == 0 ? new d0(1, fC) : new d0(iH, fC);
    }

    public String E() {
        String str = (String) this.d;
        if (q()) {
            return null;
        }
        int i = this.b;
        char cCharAt = str.charAt(i);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        int iH = h();
        while (iH != -1 && iH != cCharAt) {
            iH = h();
        }
        if (iH == -1) {
            this.b = i;
            return null;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        return str.substring(i + 1, i2);
    }

    public String F() {
        return G(' ', false);
    }

    public String G(char c, boolean z) {
        String str = (String) this.d;
        if (q()) {
            return null;
        }
        char cCharAt = str.charAt(this.b);
        if ((!z && z(cCharAt)) || cCharAt == c) {
            return null;
        }
        int i = this.b;
        int iH = h();
        while (iH != -1 && iH != c && (z || !z(iH))) {
            iH = h();
        }
        return str.substring(i, this.b);
    }

    public int H() {
        String str = (String) this.d;
        if (q()) {
            return 0;
        }
        char cCharAt = str.charAt(this.b);
        int i = this.b;
        if (cCharAt == '%') {
            this.b = i + 1;
            return 9;
        }
        if (i > this.c - 2) {
            return 0;
        }
        try {
            int iM = f.m(str.substring(i, i + 2).toLowerCase(Locale.US));
            this.b += 2;
            return iM;
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public Object I(long j, boolean z) {
        Object objL = null;
        long j2 = Long.MAX_VALUE;
        while (this.c > 0) {
            long j3 = j - ((long[]) this.d)[this.b];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objL = L();
            j2 = j3;
        }
        return objL;
    }

    public synchronized Object J() {
        return this.c == 0 ? null : L();
    }

    public synchronized Object K(long j) {
        return I(j, true);
    }

    public Object L() {
        com.google.android.material.motion.a.q(this.c > 0);
        Object[] objArr = (Object[]) this.e;
        int i = this.b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.b = (i + 1) % objArr.length;
        this.c--;
        return obj;
    }

    public float M() {
        Q();
        p pVar = (p) this.e;
        float fA = pVar.a(this.b, this.c, (String) this.d);
        if (!Float.isNaN(fA)) {
            this.b = pVar.a;
        }
        return fA;
    }

    public int N(int i) {
        i(i);
        int iPreceding = ((BreakIterator) this.e).preceding(i);
        return (x(iPreceding) && t(iPreceding) && !w(iPreceding)) ? N(iPreceding) : iPreceding;
    }

    public void O(int i, int i2, String str) {
        if (i > i2) {
            androidx.compose.ui.text.internal.a.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            androidx.compose.ui.text.internal.a.a("start must be non-negative, but was " + i);
        }
        w wVar = (w) this.e;
        if (wVar == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            w wVar2 = new w();
            wVar2.b = iMax;
            wVar2.e = cArr;
            wVar2.c = length;
            wVar2.d = i4;
            this.e = wVar2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > wVar.b - wVar.b()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            O(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > wVar.b()) {
            int iB = length2 - wVar.b();
            int i9 = wVar.b;
            do {
                i9 *= 2;
            } while (i9 - wVar.b < iB);
            char[] cArr2 = new char[i9];
            System.arraycopy((char[]) wVar.e, 0, cArr2, 0, wVar.c);
            int i10 = wVar.b;
            int i11 = wVar.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy((char[]) wVar.e, i11, cArr2, i13, (i12 + i11) - i11);
            wVar.e = cArr2;
            wVar.b = i9;
            wVar.d = i13;
        }
        int i14 = wVar.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) wVar.e;
            System.arraycopy(cArr3, i8, cArr3, wVar.d - i15, i15);
            wVar.c = i7;
            wVar.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iB2 = wVar.b() + i7;
            int iB3 = wVar.b() + i8;
            int i16 = wVar.d;
            int i17 = iB2 - i16;
            char[] cArr4 = (char[]) wVar.e;
            System.arraycopy(cArr4, i16, cArr4, wVar.c, i17);
            wVar.c += i17;
            wVar.d = iB3;
        } else {
            wVar.d = wVar.b() + i8;
            wVar.c = i7;
        }
        str.getChars(0, str.length(), (char[]) wVar.e, wVar.c);
        wVar.c = str.length() + wVar.c;
    }

    public synchronized int P() {
        return this.c;
    }

    public boolean Q() {
        R();
        int i = this.b;
        if (i == this.c || ((String) this.d).charAt(i) != ',') {
            return false;
        }
        this.b++;
        R();
        return true;
    }

    public void R() {
        while (true) {
            int i = this.b;
            if (i >= this.c || !z(((String) this.d).charAt(i))) {
                return;
            } else {
                this.b++;
            }
        }
    }

    @Override // com.caverock.androidsvg.k0
    public void a(float f, float f2, float f3, float f4) {
        g((byte) 3);
        o(4);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        this.c = i + 4;
        fArr[i4] = f4;
    }

    @Override // com.caverock.androidsvg.k0
    public void b(float f, float f2) {
        g((byte) 0);
        o(2);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        this.c = i + 2;
        fArr[i2] = f2;
    }

    @Override // com.caverock.androidsvg.k0
    public void c(float f, float f2, float f3, float f4, float f5, float f6) {
        g((byte) 2);
        o(6);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.c = i5;
        fArr[i4] = f4;
        int i6 = i + 5;
        this.c = i6;
        fArr[i5] = f5;
        this.c = i + 6;
        fArr[i6] = f6;
    }

    @Override // com.caverock.androidsvg.k0
    public void close() {
        g((byte) 8);
    }

    @Override // com.caverock.androidsvg.k0
    public void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        g((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
        o(5);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.c = i5;
        fArr[i4] = f4;
        this.c = i + 5;
        fArr[i5] = f5;
    }

    @Override // com.caverock.androidsvg.k0
    public void e(float f, float f2) {
        g((byte) 1);
        o(2);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        this.c = i + 2;
        fArr[i2] = f2;
    }

    public synchronized void f(long j, Object obj) {
        int i = this.c;
        if (i > 0) {
            if (j <= ((long[]) this.d)[((this.b + i) - 1) % ((Object[]) this.e).length]) {
                l();
            }
        }
        p();
        int i2 = this.b;
        int i3 = this.c;
        Object[] objArr = (Object[]) this.e;
        int length = (i2 + i3) % objArr.length;
        ((long[]) this.d)[length] = j;
        objArr[length] = obj;
        this.c = i3 + 1;
    }

    public void g(byte b) {
        int i = this.b;
        byte[] bArr = (byte[]) this.d;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.d = bArr2;
        }
        byte[] bArr3 = (byte[]) this.d;
        int i2 = this.b;
        this.b = i2 + 1;
        bArr3[i2] = b;
    }

    public int h() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.b = i3;
        if (i3 < i2) {
            return ((String) this.d).charAt(i3);
        }
        return -1;
    }

    public void i(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("Invalid offset: ", ". Valid range is [", i, " , ", i2);
        sbW.append(i3);
        sbW.append(']');
        androidx.compose.ui.text.internal.a.a(sbW.toString());
    }

    public Boolean j(Object obj) {
        if (obj == null) {
            return null;
        }
        Q();
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        char cCharAt = ((String) this.d).charAt(i);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.b++;
        return Boolean.valueOf(cCharAt == '1');
    }

    public float k(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        Q();
        return C();
    }

    public synchronized void l() {
        this.b = 0;
        this.c = 0;
        Arrays.fill((Object[]) this.e, (Object) null);
    }

    public boolean m(char c) {
        int i = this.b;
        boolean z = i < this.c && ((String) this.d).charAt(i) == c;
        if (z) {
            this.b++;
        }
        return z;
    }

    public boolean n(String str) {
        int length = str.length();
        int i = this.b;
        boolean z = i <= this.c - length && ((String) this.d).substring(i, i + length).equals(str);
        if (z) {
            this.b += length;
        }
        return z;
    }

    public void o(int i) {
        float[] fArr = (float[]) this.e;
        if (fArr.length < this.c + i) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.e = fArr2;
        }
    }

    public void p() {
        int length = ((Object[]) this.e).length;
        if (this.c < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.b;
        int i3 = length - i2;
        System.arraycopy((long[]) this.d, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.e, this.b, objArr, 0, i3);
        int i4 = this.b;
        if (i4 > 0) {
            System.arraycopy((long[]) this.d, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.e, 0, objArr, i3, this.b);
        }
        this.d = jArr;
        this.e = objArr;
        this.b = 0;
    }

    public boolean q() {
        return this.b == this.c;
    }

    public void r(k0 k0Var) {
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            byte b = ((byte[]) this.d)[i2];
            if (b == 0) {
                float[] fArr = (float[]) this.e;
                int i3 = i + 1;
                float f = fArr[i];
                i += 2;
                k0Var.b(f, fArr[i3]);
            } else if (b == 1) {
                float[] fArr2 = (float[]) this.e;
                int i4 = i + 1;
                float f2 = fArr2[i];
                i += 2;
                k0Var.e(f2, fArr2[i4]);
            } else if (b == 2) {
                float[] fArr3 = (float[]) this.e;
                k0Var.c(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                i += 6;
            } else if (b == 3) {
                float[] fArr4 = (float[]) this.e;
                float f3 = fArr4[i];
                float f4 = fArr4[i + 1];
                int i5 = i + 3;
                float f5 = fArr4[i + 2];
                i += 4;
                k0Var.a(f3, f4, f5, fArr4[i5]);
            } else if (b != 8) {
                boolean z = (b & 2) != 0;
                boolean z2 = (b & 1) != 0;
                float[] fArr5 = (float[]) this.e;
                k0Var.d(fArr5[i], fArr5[i + 1], fArr5[i + 2], z, z2, fArr5[i + 3], fArr5[i + 4]);
                i += 5;
            } else {
                k0Var.close();
            }
        }
    }

    public int s() {
        w wVar = (w) this.e;
        String str = (String) this.d;
        if (wVar == null) {
            return str.length();
        }
        return (wVar.b - wVar.b()) + (str.length() - (this.c - this.b));
    }

    public boolean t(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!j.d()) {
                    return false;
                }
                j jVarA = j.a();
                if (jVarA.c() != 1 || jVarA.b(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                w wVar = (w) this.e;
                String str = (String) this.d;
                if (wVar == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.b);
                sb.append((char[]) wVar.e, 0, wVar.c);
                char[] cArr = (char[]) wVar.e;
                int i = wVar.d;
                sb.append(cArr, i, wVar.b - i);
                String str2 = (String) this.d;
                sb.append((CharSequence) str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public boolean u(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return n.A(Character.codePointBefore((CharSequence) this.d, i));
    }

    public boolean v(int i) {
        i(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (x(i) && x(i - 1) && x(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.d).length() - 1 || !(w(i) || w(i + 1));
    }

    public boolean w(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (l.a(unicodeBlockOf, unicodeBlock) && l.a(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return l.a(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && l.a(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean x(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!j.d()) {
                return false;
            }
            j jVarA = j.a();
            if (jVarA.c() != 1 || jVarA.b(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean y(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return n.A(Character.codePointAt((CharSequence) this.d, i));
    }

    public e() {
        this.a = 2;
        this.d = new long[10];
        this.e = new Object[10];
    }

    public e(int i, int i2, float[] fArr, float[] fArr2) {
        this.a = 3;
        this.b = i;
        com.google.android.material.motion.a.f(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.d = fArr;
        this.e = fArr2;
        this.c = i2;
    }

    public e(e eVar) {
        this.a = 4;
        float[] fArr = (float[]) eVar.d;
        this.b = fArr.length / 3;
        this.d = androidx.media3.common.util.c.d(fArr);
        this.e = androidx.media3.common.util.c.d((float[]) eVar.e);
        int i = eVar.c;
        if (i == 1) {
            this.c = 5;
        } else if (i != 2) {
            this.c = 4;
        } else {
            this.c = 6;
        }
    }

    public e(com.google.android.material.textfield.n nVar, c2 c2Var) {
        this.a = 8;
        this.d = new SparseArray();
        this.e = nVar;
        TypedArray typedArray = (TypedArray) c2Var.z;
        this.b = typedArray.getResourceId(28, 0);
        this.c = typedArray.getResourceId(53, 0);
    }

    public e(String str) {
        this.a = 7;
        this.b = 0;
        this.c = 0;
        this.e = new p();
        String strTrim = str.trim();
        this.d = strTrim;
        this.c = strTrim.length();
    }

    public e(int i) {
        this.a = 5;
        this.d = new s[i];
        this.c = 0;
    }
}
