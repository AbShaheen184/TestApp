package kotlinx.serialization.json.internal;

import com.google.android.gms.measurement.internal.c0;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final j a = new j();

    public static final g a(Number number, String str) {
        return new g("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) g(str, -1)));
    }

    public static final g b(int i, CharSequence charSequence, String str) {
        charSequence.getClass();
        String str2 = str + "\nJSON input: " + ((Object) g(charSequence, i));
        if (i >= 0) {
            str2 = "Unexpected JSON token at offset " + i + ": " + str2;
        }
        return new g(str2);
    }

    public static final kotlinx.serialization.descriptors.e c(kotlinx.serialization.descriptors.e eVar, c0 c0Var) {
        eVar.getClass();
        c0Var.getClass();
        if (!kotlin.jvm.internal.l.a(eVar.e(), kotlinx.serialization.descriptors.g.y)) {
            return eVar.isInline() ? c(eVar.i(0), c0Var) : eVar;
        }
        com.google.android.material.resources.c.i(eVar);
        return eVar;
    }

    public static final byte d(char c) {
        if (c < '~') {
            return c.b[c];
        }
        return (byte) 0;
    }

    public static final String e(kotlinx.serialization.descriptors.e eVar, kotlinx.serialization.json.b bVar) {
        eVar.getClass();
        bVar.getClass();
        for (Annotation annotation : eVar.getAnnotations()) {
            if (annotation instanceof kotlinx.serialization.json.g) {
                return ((kotlinx.serialization.json.g) annotation).discriminator();
            }
        }
        return (String) bVar.a.e;
    }

    public static final void f(androidx.fragment.app.h hVar, String str) {
        hVar.w("Trailing comma before the end of JSON ".concat(str), hVar.y - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence g(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sbN = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.n(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sbN.append(charSequence.subSequence(i2, i3).toString());
                sbN.append(str2);
                return sbN.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void h(kotlinx.serialization.descriptors.e eVar, kotlinx.serialization.json.b bVar) {
        eVar.getClass();
        bVar.getClass();
        if (kotlin.jvm.internal.l.a(eVar.e(), kotlinx.serialization.descriptors.h.y)) {
            bVar.a.getClass();
        }
    }

    public static final q i(kotlinx.serialization.descriptors.e eVar, kotlinx.serialization.json.b bVar) {
        eVar.getClass();
        com.google.android.material.shape.e eVarE = eVar.e();
        if (eVarE instanceof kotlinx.serialization.descriptors.c) {
            return q.POLY_OBJ;
        }
        if (kotlin.jvm.internal.l.a(eVarE, kotlinx.serialization.descriptors.h.z)) {
            return q.LIST;
        }
        if (!kotlin.jvm.internal.l.a(eVarE, kotlinx.serialization.descriptors.h.A)) {
            return q.OBJ;
        }
        kotlinx.serialization.descriptors.e eVarC = c(eVar.i(0), bVar.b);
        com.google.android.material.shape.e eVarE2 = eVarC.e();
        if ((eVarE2 instanceof kotlinx.serialization.descriptors.d) || kotlin.jvm.internal.l.a(eVarE2, kotlinx.serialization.descriptors.g.z)) {
            return q.MAP;
        }
        bVar.a.getClass();
        throw new g("Value of type '" + eVarC.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + eVarC.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final void j(androidx.fragment.app.h hVar, Number number) {
        androidx.fragment.app.h.x(hVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String k(byte b) {
        if (b == 1) {
            return "quotation mark '\"'";
        }
        if (b == 2) {
            return "string escape sequence '\\'";
        }
        if (b == 4) {
            return "comma ','";
        }
        if (b == 5) {
            return "colon ':'";
        }
        if (b == 6) {
            return "start of the object '{'";
        }
        if (b == 7) {
            return "end of the object '}'";
        }
        if (b == 8) {
            return "start of the array '['";
        }
        if (b == 9) {
            return "end of the array ']'";
        }
        if (b == 10) {
            return "end of the input";
        }
        return b == 127 ? "invalid token" : "valid token";
    }
}
