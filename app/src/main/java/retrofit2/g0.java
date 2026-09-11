package retrofit2;

import java.io.EOFException;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends z0 {
    public final Method c;
    public final int d;
    public final String e;
    public final a f;
    public final boolean g;

    public g0(Method method, int i, String str, boolean z) {
        a aVar = a.y;
        this.c = method;
        this.d = i;
        Objects.requireNonNull(str, "name == null");
        this.e = str;
        this.f = aVar;
        this.g = z;
    }

    @Override // retrofit2.z0
    public final void a(o0 o0Var, Object obj) throws EOFException {
        String strI0;
        char c;
        String str = this.e;
        if (obj == null) {
            throw z0.m(this.c, this.d, androidx.privacysandbox.ads.adservices.java.internal.a.q("Path parameter \"", str, "\" value must not be null."), new Object[0]);
        }
        this.f.getClass();
        String string = obj.toString();
        if (o0Var.c == null) {
            throw new AssertionError();
        }
        int length = string.length();
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strI0 = string;
                break;
            }
            int iCodePointAt = string.codePointAt(iCharCount);
            boolean z = this.g;
            int i = 47;
            int i2 = -1;
            int i3 = 127;
            int i4 = 32;
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                okio.f fVar = new okio.f();
                fVar.t0(0, iCharCount, string);
                okio.f fVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = string.codePointAt(iCharCount);
                    if (z && (iCodePointAt2 == 9 || iCodePointAt2 == 10 || iCodePointAt2 == 12 || iCodePointAt2 == 13)) {
                        c = '%';
                    } else if (iCodePointAt2 < i4 || iCodePointAt2 >= i3 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i2 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                        if (fVar2 == null) {
                            fVar2 = new okio.f();
                        }
                        fVar2.v0(iCodePointAt2);
                        long j = fVar2.y;
                        for (long j2 = 0; j2 < j; j2++) {
                            byte bY = fVar2.Y(j2);
                            fVar.o0(37);
                            char[] cArr = o0.l;
                            fVar.o0(cArr[((bY & 255) >> 4) & 15]);
                            fVar.o0(cArr[bY & 15]);
                        }
                        c = '%';
                        fVar2.a();
                    } else {
                        fVar.v0(iCodePointAt2);
                        c = '%';
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i = 47;
                    i2 = -1;
                    i3 = 127;
                    i4 = 32;
                }
                strI0 = fVar.i0();
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strReplace = o0Var.c.replace("{" + str + "}", strI0);
        if (o0.m.matcher(strReplace).matches()) {
            net.luminis.tls.engine.impl.c.o("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string));
        } else {
            o0Var.c = strReplace;
        }
    }
}
