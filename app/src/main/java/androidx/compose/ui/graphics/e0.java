package androidx.compose.ui.graphics;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends l0 {
    public final List c;
    public final List d;
    public final long e;
    public final long f;

    public e0(List list, ArrayList arrayList, long j, long j2) {
        this.c = list;
        this.d = arrayList;
        this.e = j;
        this.f = j2;
    }

    @Override // androidx.compose.ui.graphics.l0
    public final Shader b(long j) {
        int i;
        int[] iArr;
        int i2;
        float[] fArr;
        long j2 = this.e;
        char c = ' ';
        int i3 = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i3);
        long j3 = 4294967295L;
        int i4 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i4);
        long j4 = this.f;
        int i5 = (int) (j4 >> 32);
        if (Float.intBitsToFloat(i5) == Float.POSITIVE_INFINITY) {
            i5 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i5);
        int i6 = (int) (j4 & 4294967295L);
        if (Float.intBitsToFloat(i6) == Float.POSITIVE_INFINITY) {
            i6 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i6);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.c;
        List list2 = this.d;
        if (list2 == null) {
            if (list.size() < 2) {
                net.luminis.tls.engine.impl.c.o("colors must have length of at least 2 if colorStops is omitted.");
                return null;
            }
        } else if (list.size() != list2.size()) {
            net.luminis.tls.engine.impl.c.o("colors and colorStops arguments must have equal length.");
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            i = 0;
        } else {
            int size = list.size() - 1;
            int i7 = 1;
            i = 0;
            while (i7 < size) {
                char c2 = c;
                long j5 = j3;
                if (t.d(((t) list.get(i7)).a) == 0.0f) {
                    i++;
                }
                i7++;
                c = c2;
                j3 = j5;
            }
        }
        char c3 = c;
        long j6 = j3;
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c3));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & j6));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> c3));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j6));
        if (Build.VERSION.SDK_INT >= 26) {
            int size2 = list.size();
            iArr = new int[size2];
            for (int i8 = 0; i8 < size2; i8++) {
                iArr[i8] = a0.y(((t) list.get(i8)).a);
            }
        } else {
            iArr = new int[list.size() + i];
            int size3 = list.size() - 1;
            int size4 = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size4; i10++) {
                long j7 = ((t) list.get(i10)).a;
                if (t.d(j7) == 0.0f) {
                    if (i10 == 0) {
                        i2 = i9 + 1;
                        iArr[i9] = a0.y(t.b(0.0f, ((t) list.get(1)).a));
                    } else if (i10 == size3) {
                        i2 = i9 + 1;
                        iArr[i9] = a0.y(t.b(0.0f, ((t) list.get(i10 - 1)).a));
                    } else {
                        int i11 = i9 + 1;
                        iArr[i9] = a0.y(t.b(0.0f, ((t) list.get(i10 - 1)).a));
                        i9 += 2;
                        iArr[i11] = a0.y(t.b(0.0f, ((t) list.get(i10 + 1)).a));
                    }
                    i9 = i2;
                } else {
                    iArr[i9] = a0.y(j7);
                    i9++;
                }
            }
        }
        int[] iArr2 = iArr;
        if (i != 0) {
            fArr = new float[list.size() + i];
            fArr[0] = list2 != null ? ((Number) list2.get(0)).floatValue() : 0.0f;
            int size5 = list.size() - 1;
            int i12 = 1;
            for (int i13 = 1; i13 < size5; i13++) {
                long j8 = ((t) list.get(i13)).a;
                float fFloatValue = list2 != null ? ((Number) list2.get(i13)).floatValue() : i13 / (list.size() - 1);
                int i14 = i12 + 1;
                fArr[i12] = fFloatValue;
                if (t.d(j8) == 0.0f) {
                    i12 += 2;
                    fArr[i14] = fFloatValue;
                } else {
                    i12 = i14;
                }
            }
            fArr[i12] = list2 != null ? ((Number) list2.get(list.size() - 1)).floatValue() : 1.0f;
        } else if (list2 != null) {
            list2.getClass();
            fArr = new float[list2.size()];
            Iterator it = list2.iterator();
            int i15 = 0;
            while (it.hasNext()) {
                fArr[i15] = ((Number) it.next()).floatValue();
                i15++;
            }
        } else {
            fArr = null;
        }
        return new LinearGradient(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, iArr2, fArr, Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.c.equals(e0Var.c) && kotlin.jvm.internal.l.a(this.d, e0Var.d) && androidx.compose.ui.geometry.b.b(this.e, e0Var.e) && androidx.compose.ui.geometry.b.b(this.f, e0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        List list = this.d;
        return Integer.hashCode(0) + androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.c((iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        String str;
        long j = this.e;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) androidx.compose.ui.geometry.b.g(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.f;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) androidx.compose.ui.geometry.b.g(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.c + ", stops=" + this.d + ", " + str + str2 + "tileMode=" + ((Object) "Clamp") + ')';
    }
}
