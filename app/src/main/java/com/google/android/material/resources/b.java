package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import com.google.android.material.textfield.p;
import com.google.common.util.concurrent.q;
import com.google.protobuf.o2;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.text.k;
import kotlinx.serialization.internal.k0;
import okhttp3.r;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final String a(Object[] objArr, int i, int i2, kotlin.collections.f fVar) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == fVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final String b(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static int i(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes.length - i > i2) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i, bytes.length);
        return i + bytes.length;
    }

    public static final kotlinx.serialization.a l(kotlinx.serialization.a aVar) {
        aVar.getClass();
        return aVar.d().c() ? aVar : new k0(aVar);
    }

    public static boolean n(ByteBuffer byteBuffer, int i, int i2) {
        b bVar = o2.a;
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & (-9187201950435737472L)) == 0) {
            i4 += 8;
        }
        int i5 = (i4 - i) + i;
        while (i5 < i2) {
            int i6 = i5 + 1;
            byte b = byteBuffer.get(i5);
            if (b >= 0) {
                i5 = i6;
            } else if (b < -32) {
                if (i6 >= i2 || b < -62 || byteBuffer.get(i6) > -65) {
                    return false;
                }
                i5 += 2;
            } else if (b < -16) {
                if (i6 >= i2 - 1) {
                    return false;
                }
                int i7 = i5 + 2;
                byte b2 = byteBuffer.get(i6);
                if (b2 > -65) {
                    return false;
                }
                if (b == -32 && b2 < -96) {
                    return false;
                }
                if ((b == -19 && b2 >= -96) || byteBuffer.get(i7) > -65) {
                    return false;
                }
                i5 += 3;
            } else {
                if (i6 >= i2 - 2) {
                    return false;
                }
                int i8 = i5 + 2;
                byte b3 = byteBuffer.get(i6);
                if (b3 > -65) {
                    return false;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return false;
                }
                int i9 = i5 + 3;
                if (byteBuffer.get(i8) > -65) {
                    return false;
                }
                i5 += 4;
                if (byteBuffer.get(i9) > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String p(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("<", str2, " threw ");
                    sbX.append(e.getClass().getName());
                    sbX.append(">");
                    string = sbX.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) strValueOf, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static r q(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 != 0) {
            net.luminis.tls.engine.impl.c.o("Expected alternating header names and values");
            return null;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr3[i2] == null) {
                net.luminis.tls.engine.impl.c.o("Headers cannot be null");
                return null;
            }
            strArr3[i2] = k.A0(strArr2[i2]).toString();
        }
        int iQ = com.google.android.material.sidesheet.b.q(0, strArr3.length - 1, 2);
        if (iQ >= 0) {
            while (true) {
                String str = strArr3[i];
                String str2 = strArr3[i + 1];
                p.n(str);
                p.o(str2, str);
                if (i == iQ) {
                    break;
                }
                i += 2;
            }
        }
        return new r(strArr3);
    }

    public static final void t(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static TypedValue u(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue v(int i, Context context, String str) {
        TypedValue typedValueU = u(context, i);
        if (typedValueU != null) {
            return typedValueU;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public abstract boolean c(com.google.common.util.concurrent.r rVar, com.google.common.util.concurrent.f fVar, com.google.common.util.concurrent.f fVar2);

    public abstract boolean d(com.google.common.util.concurrent.r rVar, Object obj, Object obj2);

    public abstract boolean e(com.google.common.util.concurrent.r rVar, q qVar, q qVar2);

    public abstract List f(String str, List list);

    public abstract String g(byte[] bArr, int i, int i2);

    public abstract int h(String str, byte[] bArr, int i, int i2);

    public abstract com.google.common.util.concurrent.f j(com.google.common.util.concurrent.r rVar);

    public abstract q k(com.google.common.util.concurrent.r rVar);

    public abstract boolean m(byte[] bArr, int i, int i2);

    public boolean o(ByteBuffer byteBuffer, int i, int i2) {
        return n(byteBuffer, i, i2);
    }

    public abstract void r(q qVar, q qVar2);

    public abstract void s(q qVar, Thread thread);
}
