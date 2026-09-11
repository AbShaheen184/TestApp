package androidx.navigation;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i0 {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, boolean z) {
        super(z);
        this.k = i;
    }

    @Override // androidx.navigation.i0
    public final Object a(String str, Bundle bundle) {
        switch (this.k) {
            case 0:
                bundle.getClass();
                if (!bundle.containsKey(str) || _COROUTINE.b.y(str, bundle)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (z || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z);
                }
                android.support.v4.media.session.b.z(str);
                throw null;
            case 1:
                bundle.getClass();
                float f = bundle.getFloat(str, Float.MIN_VALUE);
                if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f);
                }
                android.support.v4.media.session.b.z(str);
                throw null;
            case 2:
                bundle.getClass();
                return Integer.valueOf(_COROUTINE.b.r(str, bundle));
            case 3:
                bundle.getClass();
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j);
                }
                android.support.v4.media.session.b.z(str);
                throw null;
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || _COROUTINE.b.y(str, bundle)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string != null) {
                    return string;
                }
                android.support.v4.media.session.b.z(str);
                throw null;
        }
    }

    @Override // androidx.navigation.i0
    public final String b() {
        switch (this.k) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            default:
                return "string";
        }
    }

    @Override // androidx.navigation.i0
    public final Object d(String str) {
        boolean z;
        int i;
        long j;
        switch (this.k) {
            case 0:
                if (str.equals("true")) {
                    z = true;
                } else {
                    if (!str.equals("false")) {
                        net.luminis.tls.engine.impl.c.o("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                if (kotlin.text.r.O(str, "0x", false)) {
                    String strSubstring = str.substring(2);
                    com.google.android.material.shape.e.a(16);
                    i = Integer.parseInt(strSubstring, 16);
                } else {
                    i = Integer.parseInt(str);
                }
                return Integer.valueOf(i);
            case 3:
                String strSubstring2 = kotlin.text.r.H(str, "L", false) ? str.substring(0, str.length() - 1) : str;
                if (kotlin.text.r.O(str, "0x", false)) {
                    String strSubstring3 = strSubstring2.substring(2);
                    com.google.android.material.shape.e.a(16);
                    j = Long.parseLong(strSubstring3, 16);
                } else {
                    j = Long.parseLong(strSubstring2);
                }
                return Long.valueOf(j);
            default:
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // androidx.navigation.i0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.k) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                str.getClass();
                bundle.putBoolean(str, zBooleanValue);
                break;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                str.getClass();
                bundle.putFloat(str, fFloatValue);
                break;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, iIntValue);
                break;
            case 3:
                long jLongValue = ((Number) obj).longValue();
                str.getClass();
                bundle.putLong(str, jLongValue);
                break;
            default:
                String str2 = (String) obj;
                str.getClass();
                if (str2 == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putString(str, str2);
                }
                break;
        }
    }
}
