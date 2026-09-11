package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.c2;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.k;
import com.google.common.base.t;
import com.google.common.base.v;
import com.google.common.util.concurrent.c0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.b0;
import kotlinx.serialization.internal.u0;
import okhttp3.u;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static double a(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float b(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int c(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long d(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        StringBuilder sbM = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        sbM.append(j2);
        sbM.append('.');
        throw new IllegalArgumentException(sbM.toString());
    }

    public static int f(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static u h(String str) {
        str.getClass();
        kotlin.text.g gVarC = u.e.c(0, str);
        if (gVarC == null) {
            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.k('\"', "No subtype found for: \"", str));
            return null;
        }
        String str2 = (String) ((b0) gVarC.a()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((b0) gVarC.a()).get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i = gVarC.b().y;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new u(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            kotlin.text.g gVarC2 = u.f.c(i2, str);
            if (gVarC2 == null) {
                net.luminis.tls.engine.impl.c.i("Parameter is not formatted correctly: \"", str.substring(i2), "\" for: \"", str, 34);
                return null;
            }
            k kVar = gVarC2.c;
            kotlin.text.f fVarC = kVar.c(1);
            String str3 = fVarC != null ? fVarC.a : null;
            if (str3 == null) {
                i = gVarC2.b().y;
            } else {
                kotlin.text.f fVarC2 = kVar.c(2);
                String strSubstring = fVarC2 != null ? fVarC2.a : null;
                if (strSubstring == null) {
                    kotlin.text.f fVarC3 = kVar.c(3);
                    fVarC3.getClass();
                    strSubstring = fVarC3.a;
                } else if (strSubstring.length() > 0 && com.google.android.material.shape.e.d(strSubstring.charAt(0), '\'', false) && kotlin.text.k.X(strSubstring, '\'') && strSubstring.length() > 2) {
                    strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                }
                arrayList.add(str3);
                arrayList.add(strSubstring);
                i = gVarC2.b().y;
            }
        }
    }

    public static final kotlin.reflect.c i(kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
        if (eVar instanceof kotlinx.serialization.descriptors.b) {
            return null;
        }
        if (eVar instanceof u0) {
            return i(((u0) eVar).a);
        }
        return null;
    }

    public static ColorStateList j(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListT;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListT = n.t(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListT;
    }

    public static ColorStateList k(Context context, c2 c2Var, int i) {
        int resourceId;
        ColorStateList colorStateListT;
        TypedArray typedArray = (TypedArray) c2Var.z;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListT = n.t(context, resourceId)) == null) ? c2Var.z(i) : colorStateListT;
    }

    public static Drawable l(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableP;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableP = coil3.network.g.p(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableP;
    }

    public static boolean m(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static t n(t tVar) {
        if ((tVar instanceof v) || (tVar instanceof com.google.common.base.u)) {
            return tVar;
        }
        return tVar instanceof Serializable ? new com.google.common.base.u(tVar) : new v(tVar);
    }

    public static kotlin.ranges.b o(kotlin.ranges.d dVar, int i) {
        dVar.getClass();
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i2 = dVar.e;
        int i3 = dVar.y;
        if (dVar.z <= 0) {
            i = -i;
        }
        return new kotlin.ranges.b(i2, i3, i);
    }

    public static String p(Object obj) {
        com.grack.nanojson.e eVar = new com.grack.nanojson.e();
        eVar.o(obj);
        return eVar.b();
    }

    public static void q(okio.e eVar, byte[] bArr) {
        long j;
        eVar.getClass();
        bArr.getClass();
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = eVar.B;
            int i2 = eVar.C;
            int i3 = eVar.D;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = eVar.A;
            okio.f fVar = eVar.e;
            fVar.getClass();
            if (j2 == fVar.y) {
                net.luminis.tls.engine.impl.c.r("no more bytes");
                return;
            }
            j = eVar.A;
        } while (eVar.g(j == -1 ? 0L : j + ((long) (eVar.D - eVar.C))) != -1);
    }

    public static kotlin.ranges.d r(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new kotlin.ranges.d(i, i2 - 1, 1);
        }
        kotlin.ranges.d dVar = kotlin.ranges.d.A;
        return kotlin.ranges.d.A;
    }

    public abstract void e(c0 c0Var, Set set);

    public abstract int g(c0 c0Var);
}
