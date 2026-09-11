package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.core.d;
import java.io.Serializable;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;
import kotlinx.serialization.json.internal.m;
import kotlinx.serialization.json.internal.n;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.j0;
import org.mozilla.classfile.h;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static String A(int i, h hVar) {
        int i2 = i & 255;
        switch (i2) {
            case 0:
                return "top";
            case 1:
                return "int";
            case 2:
                return "float";
            case 3:
                return "double";
            case 4:
                return "long";
            case 5:
                return "null";
            case 6:
                return "uninitialized_this";
            default:
                if (i2 == 7) {
                    return p(i, hVar);
                }
                if (i2 == 8) {
                    return "uninitialized";
                }
                net.luminis.tls.engine.impl.c.o("bad type");
                return null;
        }
    }

    public static final int a(int i) {
        return ((i & 65535) << 8) | 7;
    }

    public static final void b(n nVar) {
        nVar.getClass();
        if ((nVar instanceof n ? nVar : null) != null) {
            return;
        }
        com.google.gson.b.s(a0.a(nVar.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    public static void c(StringBuilder sb, Object obj, l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final m d(kotlinx.serialization.encoding.b bVar) {
        bVar.getClass();
        m mVar = bVar instanceof m ? (m) bVar : null;
        if (mVar != null) {
            return mVar;
        }
        com.google.gson.b.s(a0.a(bVar.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static void g(Object obj) {
        if (obj != null) {
            return;
        }
        com.google.gson.b.h("Cannot return null from a non-@Nullable @Provides method");
    }

    public static final int h(String str, h hVar) {
        if (str.length() != 1) {
            return a(hVar.a(str));
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            return 2;
        }
        if (cCharAt != 'S' && cCharAt != 'Z' && cCharAt != 'I') {
            if (cCharAt == 'J') {
                return 4;
            }
            switch (cCharAt) {
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                case Token.ENUM_NEXT /* 67 */:
                    break;
                case Token.ENUM_ID /* 68 */:
                    return 3;
                default:
                    net.luminis.tls.engine.impl.c.o("bad type");
                    return 0;
            }
        }
        return 1;
    }

    public static final Object m(androidx.datastore.preferences.core.a aVar, d dVar, Serializable serializable) {
        aVar.getClass();
        dVar.getClass();
        Object objC = aVar.c(dVar);
        return objC == null ? serializable : objC;
    }

    public static final String p(int i, h hVar) {
        if ((i & 255) == 7) {
            return (String) hVar.k(i >>> 8);
        }
        net.luminis.tls.engine.impl.c.o("expecting object type");
        return null;
    }

    public static final int q(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                net.luminis.tls.engine.impl.c.o("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static long s(double d) {
        com.google.android.material.motion.a.e("not a normal value", u(d));
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean u(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static boolean x(int i) {
        return i == 3 || i == 4;
    }

    public static final g0 z(g0 g0Var) {
        g0Var.getClass();
        f0 f0VarM = g0Var.m();
        j0 j0Var = g0Var.D;
        f0VarM.g = new okhttp3.internal.c(j0Var.w(), j0Var.m());
        return f0VarM.a();
    }

    public abstract void B(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract int e(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float f(int i);

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int n(View view);

    public abstract int o(CoordinatorLayout coordinatorLayout);

    public abstract int r();

    public abstract boolean t(float f);

    public abstract boolean v(View view);

    public abstract boolean w(float f, float f2);

    public abstract boolean y(View view, float f);
}
