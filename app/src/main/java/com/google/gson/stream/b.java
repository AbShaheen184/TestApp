package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class b implements Closeable, Flushable {
    public static final Pattern I = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] J = new String[128];
    public static final String[] K;
    public com.google.gson.a A;
    public String B;
    public String C;
    public boolean D;
    public int E;
    public boolean F;
    public String G;
    public boolean H;
    public final Writer e;
    public int[] y;
    public int z;

    static {
        for (int i = 0; i <= 31; i++) {
            J[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = J;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        K = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.y = iArr;
        this.z = 0;
        if (iArr.length == 0) {
            this.y = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.y;
        int i = this.z;
        this.z = i + 1;
        iArr2[i] = 6;
        this.E = 2;
        this.H = true;
        Objects.requireNonNull(writer, "out == null");
        this.e = writer;
        a0(com.google.gson.a.d);
    }

    public void L() throws IOException {
        w('}', 3, 5);
    }

    public void N(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.G != null) {
            net.luminis.tls.engine.impl.c.r("Already wrote a name, expecting a value.");
            return;
        }
        int iZ = Z();
        if (iZ == 3 || iZ == 5) {
            this.G = str;
        } else {
            net.luminis.tls.engine.impl.c.r("Please begin an object before writing a name.");
        }
    }

    public final void X() throws IOException {
        if (this.D) {
            return;
        }
        String str = this.A.a;
        Writer writer = this.e;
        writer.write(str);
        int i = this.z;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.A.b);
        }
    }

    public b Y() {
        if (this.G != null) {
            if (!this.H) {
                this.G = null;
                return this;
            }
            j0();
        }
        a();
        this.e.write("null");
        return this;
    }

    public final int Z() {
        int i = this.z;
        if (i != 0) {
            return this.y[i - 1];
        }
        net.luminis.tls.engine.impl.c.r("JsonWriter is closed.");
        return 0;
    }

    public final void a() throws IOException {
        int iZ = Z();
        if (iZ == 1) {
            this.y[this.z - 1] = 2;
            X();
            return;
        }
        Writer writer = this.e;
        if (iZ == 2) {
            writer.append((CharSequence) this.C);
            X();
            return;
        }
        if (iZ == 4) {
            writer.append((CharSequence) this.B);
            this.y[this.z - 1] = 5;
            return;
        }
        if (iZ != 6) {
            if (iZ != 7) {
                net.luminis.tls.engine.impl.c.r("Nesting problem.");
                return;
            } else if (this.E != 1) {
                net.luminis.tls.engine.impl.c.r("JSON must have only one top-level value.");
                return;
            }
        }
        this.y[this.z - 1] = 7;
    }

    public final void a0(com.google.gson.a aVar) {
        Objects.requireNonNull(aVar);
        this.A = aVar;
        this.C = ",";
        if (aVar.c) {
            this.B = ": ";
            if (aVar.a.isEmpty()) {
                this.C = ", ";
            }
        } else {
            this.B = ":";
        }
        this.D = this.A.a.isEmpty() && this.A.b.isEmpty();
    }

    public final void b0(int i) {
        if (i == 0) {
            throw null;
        }
        this.E = i;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void c0(String str) throws IOException {
        String str2;
        String[] strArr = this.F ? K : J;
        Writer writer = this.e;
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        writer.write(str, i, i2 - i);
                    }
                    writer.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.e.close();
        int i = this.z;
        if (i > 1 || (i == 1 && this.y[i - 1] != 7)) {
            net.luminis.tls.engine.impl.c.t("Incomplete document");
        } else {
            this.z = 0;
        }
    }

    public void d0(double d) throws IOException {
        j0();
        if (this.E == 1 || !(Double.isNaN(d) || Double.isInfinite(d))) {
            a();
            this.e.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }

    public void e0(long j) throws IOException {
        j0();
        a();
        this.e.write(Long.toString(j));
    }

    public void f0(Boolean bool) throws IOException {
        if (bool == null) {
            Y();
            return;
        }
        j0();
        a();
        this.e.write(bool.booleanValue() ? "true" : "false");
    }

    public void flush() throws IOException {
        if (this.z != 0) {
            this.e.flush();
        } else {
            net.luminis.tls.engine.impl.c.r("JsonWriter is closed.");
        }
    }

    public void g() throws IOException {
        j0();
        a();
        int i = this.z;
        int[] iArr = this.y;
        if (i == iArr.length) {
            this.y = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.y;
        int i2 = this.z;
        this.z = i2 + 1;
        iArr2[i2] = 1;
        this.e.write(91);
    }

    public void g0(Number number) throws IOException {
        if (number == null) {
            Y();
            return;
        }
        j0();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.E != 1) {
                    net.luminis.tls.engine.impl.c.o("Numeric values must be finite, but was ".concat(string));
                    return;
                }
            } else if (cls != Float.class && cls != Double.class && !I.matcher(string).matches()) {
                org.mozilla.javascript.typedarrays.c.c("String created by ", cls, " is not a valid JSON number: ", string);
                return;
            }
        }
        a();
        this.e.append((CharSequence) string);
    }

    public void h0(String str) throws IOException {
        if (str == null) {
            Y();
            return;
        }
        j0();
        a();
        c0(str);
    }

    public void i0(boolean z) throws IOException {
        j0();
        a();
        this.e.write(z ? "true" : "false");
    }

    public final void j0() throws IOException {
        if (this.G != null) {
            int iZ = Z();
            if (iZ == 5) {
                this.e.write(this.C);
            } else if (iZ != 3) {
                net.luminis.tls.engine.impl.c.r("Nesting problem.");
                return;
            }
            X();
            this.y[this.z - 1] = 4;
            c0(this.G);
            this.G = null;
        }
    }

    public void m() throws IOException {
        j0();
        a();
        int i = this.z;
        int[] iArr = this.y;
        if (i == iArr.length) {
            this.y = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.y;
        int i2 = this.z;
        this.z = i2 + 1;
        iArr2[i2] = 3;
        this.e.write(Token.EXPORT);
    }

    public final void w(char c, int i, int i2) throws IOException {
        int iZ = Z();
        if (iZ != i2 && iZ != i) {
            net.luminis.tls.engine.impl.c.r("Nesting problem.");
            return;
        }
        if (this.G != null) {
            com.google.gson.b.s(this.G, "Dangling name: ");
            return;
        }
        this.z--;
        if (iZ == i2) {
            X();
        }
        this.e.write(c);
    }

    public void z() throws IOException {
        w(']', 1, 2);
    }
}
