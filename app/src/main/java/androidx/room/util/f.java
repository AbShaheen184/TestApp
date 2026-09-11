package androidx.room.util;

import java.util.Locale;
import kotlin.jvm.internal.l;
import kotlin.text.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public f(int i, int i2, String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.g = k.T(upperCase, "INT", false) ? 3 : (k.T(upperCase, "CHAR", false) || k.T(upperCase, "CLOB", false) || k.T(upperCase, "TEXT", false)) ? 2 : k.T(upperCase, "BLOB", false) ? 5 : (k.T(upperCase, "REAL", false) || k.T(upperCase, "FLOA", false) || k.T(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                boolean z = this.d > 0;
                f fVar = (f) obj;
                int i = fVar.f;
                if (z == (fVar.d > 0) && l.a(this.a, fVar.a) && this.c == fVar.c) {
                    String str = fVar.e;
                    int i2 = this.f;
                    String str2 = this.e;
                    if ((i2 != 1 || i != 2 || str2 == null || _COROUTINE.a.q(str2, str)) && ((i2 != 2 || i != 1 || str == null || _COROUTINE.a.q(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : _COROUTINE.a.q(str2, str))) && this.g == fVar.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return kotlin.text.l.C(kotlin.text.l.E(sb.toString()));
    }
}
