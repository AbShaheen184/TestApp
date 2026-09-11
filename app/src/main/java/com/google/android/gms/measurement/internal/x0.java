package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends a2 {
    public long A;
    public String B;
    public final v0 C;
    public final v0 D;
    public final v0 E;
    public final v0 F;
    public final v0 G;
    public final v0 H;
    public final v0 I;
    public final v0 J;
    public final v0 K;
    public char z;

    public x0(s1 s1Var) {
        super(s1Var);
        this.z = (char) 0;
        this.A = -1L;
        this.C = new v0(this, 6, false, false);
        this.D = new v0(this, 6, true, false);
        this.E = new v0(this, 6, false, true);
        this.F = new v0(this, 5, false, false);
        this.G = new v0(this, 5, true, false);
        this.H = new v0(this, 5, false, true);
        this.I = new v0(this, 4, false, false);
        this.J = new v0(this, 3, false, false);
        this.K = new v0(this, 2, false, false);
    }

    public static w0 D(String str) {
        if (str == null) {
            return null;
        }
        return new w0(str);
    }

    public static String G(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String strH = H(obj, z);
        String strH2 = H(obj2, z);
        String strH3 = H(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strH)) {
            sb.append(str2);
            sb.append(strH);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strH2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strH2);
        }
        if (!TextUtils.isEmpty(strH3)) {
            sb.append(str3);
            sb.append(strH3);
        }
        return sb.toString();
    }

    public static String H(Object obj, boolean z) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof w0) {
                return ((w0) obj).a;
            }
            return z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = s1.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb2.toString();
    }

    public final v0 A() {
        return this.F;
    }

    public final v0 B() {
        return this.J;
    }

    public final v0 C() {
        return this.K;
    }

    public final void E(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(F(), i)) {
            Log.println(i, F(), G(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        com.google.android.gms.common.internal.x.g(str);
        p1 p1Var = ((s1) this.e).D;
        if (p1Var == null) {
            Log.println(6, F(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!p1Var.y) {
                Log.println(6, F(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            p1Var.E(new u0(this, i, str, obj, obj2, obj3));
        }
    }

    public final String F() {
        String str;
        synchronized (this) {
            try {
                if (this.B == null) {
                    ((s1) ((s1) this.e).A.e).getClass();
                    this.B = "FA";
                }
                com.google.android.gms.common.internal.x.g(this.B);
                str = this.B;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // com.google.android.gms.measurement.internal.a2
    public final boolean w() {
        return false;
    }

    public final v0 z() {
        return this.C;
    }
}
