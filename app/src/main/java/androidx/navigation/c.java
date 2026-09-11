package androidx.navigation;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i0 {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, boolean z) {
        super(z);
        this.k = i;
    }

    public static int[] g(String str) {
        return new int[]{((Number) i0.a.d(str)).intValue()};
    }

    public static long[] h(String str) {
        return new long[]{((Number) i0.c.d(str)).longValue()};
    }

    public static boolean[] i(String str) {
        return new boolean[]{((Boolean) i0.g.d(str)).booleanValue()};
    }

    @Override // androidx.navigation.i0
    public final Object a(String str, Bundle bundle) {
        switch (this.k) {
            case 0:
                bundle.getClass();
                if (!bundle.containsKey(str) || _COROUTINE.b.y(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                android.support.v4.media.session.b.z(str);
                throw null;
            case 1:
                bundle.getClass();
                if (!bundle.containsKey(str) || _COROUTINE.b.y(str, bundle)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                android.support.v4.media.session.b.z(str);
                throw null;
            case 2:
                bundle.getClass();
                if (!bundle.containsKey(str) || _COROUTINE.b.y(str, bundle)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                android.support.v4.media.session.b.z(str);
                throw null;
            case 3:
                bundle.getClass();
                if (!bundle.containsKey(str) || _COROUTINE.b.y(str, bundle)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                android.support.v4.media.session.b.z(str);
                throw null;
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || _COROUTINE.b.y(str, bundle)) {
                    return null;
                }
                String[] stringArray = bundle.getStringArray(str);
                if (stringArray != null) {
                    return stringArray;
                }
                android.support.v4.media.session.b.z(str);
                throw null;
        }
    }

    @Override // androidx.navigation.i0
    public final String b() {
        switch (this.k) {
            case 0:
                return "boolean[]";
            case 1:
                return "float[]";
            case 2:
                return "integer[]";
            case 3:
                return "long[]";
            default:
                return "string[]";
        }
    }

    @Override // androidx.navigation.i0
    public final Object c(Object obj, String str) {
        switch (this.k) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return i(str);
                }
                boolean[] zArrI = i(str);
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArrI, 0, zArrCopyOf, length, 1);
                return zArrCopyOf;
            case 1:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return new float[]{Float.parseFloat(str)};
                }
                float[] fArr2 = {Float.parseFloat(str)};
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArr2, 0, fArrCopyOf, length2, 1);
                return fArrCopyOf;
            case 2:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return g(str);
                }
                int[] iArrG = g(str);
                int length3 = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(iArrG, 0, iArrCopyOf, length3, 1);
                return iArrCopyOf;
            case 3:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return h(str);
                }
                long[] jArrH = h(str);
                int length4 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(jArrH, 0, jArrCopyOf, length4, 1);
                return jArrCopyOf;
            default:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                int length5 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(new String[]{str}, 0, objArrCopyOf, length5, 1);
                return (String[]) objArrCopyOf;
        }
    }

    @Override // androidx.navigation.i0
    public final Object d(String str) {
        switch (this.k) {
            case 0:
                return i(str);
            case 1:
                return new float[]{Float.parseFloat(str)};
            case 2:
                return g(str);
            case 3:
                return h(str);
            default:
                return new String[]{str};
        }
    }

    @Override // androidx.navigation.i0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.k) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                str.getClass();
                if (zArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putBooleanArray(str, zArr);
                }
                break;
            case 1:
                float[] fArr = (float[]) obj;
                str.getClass();
                if (fArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putFloatArray(str, fArr);
                }
                break;
            case 2:
                int[] iArr = (int[]) obj;
                str.getClass();
                if (iArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putIntArray(str, iArr);
                }
                break;
            case 3:
                long[] jArr = (long[]) obj;
                str.getClass();
                if (jArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putLongArray(str, jArr);
                }
                break;
            default:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putStringArray(str, strArr);
                }
                break;
        }
    }

    @Override // androidx.navigation.i0
    public final boolean f(Object obj, Object obj2) {
        Boolean[] boolArr;
        Float[] fArr;
        Integer[] numArr;
        Long[] lArr;
        switch (this.k) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                Boolean[] boolArr2 = null;
                if (zArr != null) {
                    boolArr = new Boolean[zArr.length];
                    int length = zArr.length;
                    for (int i = 0; i < length; i++) {
                        boolArr[i] = Boolean.valueOf(zArr[i]);
                    }
                } else {
                    boolArr = null;
                }
                if (zArr2 != null) {
                    boolArr2 = new Boolean[zArr2.length];
                    int length2 = zArr2.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        boolArr2[i2] = Boolean.valueOf(zArr2[i2]);
                    }
                }
                return kotlin.collections.n.B(boolArr, boolArr2);
            case 1:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                Float[] fArr4 = null;
                if (fArr2 != null) {
                    fArr = new Float[fArr2.length];
                    int length3 = fArr2.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        fArr[i3] = Float.valueOf(fArr2[i3]);
                    }
                } else {
                    fArr = null;
                }
                if (fArr3 != null) {
                    fArr4 = new Float[fArr3.length];
                    int length4 = fArr3.length;
                    for (int i4 = 0; i4 < length4; i4++) {
                        fArr4[i4] = Float.valueOf(fArr3[i4]);
                    }
                }
                return kotlin.collections.n.B(fArr, fArr4);
            case 2:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                Integer[] numArr2 = null;
                if (iArr != null) {
                    numArr = new Integer[iArr.length];
                    int length5 = iArr.length;
                    for (int i5 = 0; i5 < length5; i5++) {
                        numArr[i5] = Integer.valueOf(iArr[i5]);
                    }
                } else {
                    numArr = null;
                }
                if (iArr2 != null) {
                    numArr2 = new Integer[iArr2.length];
                    int length6 = iArr2.length;
                    for (int i6 = 0; i6 < length6; i6++) {
                        numArr2[i6] = Integer.valueOf(iArr2[i6]);
                    }
                }
                return kotlin.collections.n.B(numArr, numArr2);
            case 3:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                Long[] lArr2 = null;
                if (jArr != null) {
                    lArr = new Long[jArr.length];
                    int length7 = jArr.length;
                    for (int i7 = 0; i7 < length7; i7++) {
                        lArr[i7] = Long.valueOf(jArr[i7]);
                    }
                } else {
                    lArr = null;
                }
                if (jArr2 != null) {
                    lArr2 = new Long[jArr2.length];
                    int length8 = jArr2.length;
                    for (int i8 = 0; i8 < length8; i8++) {
                        lArr2[i8] = Long.valueOf(jArr2[i8]);
                    }
                }
                return kotlin.collections.n.B(lArr, lArr2);
            default:
                return kotlin.collections.n.B((String[]) obj, (String[]) obj2);
        }
    }
}
