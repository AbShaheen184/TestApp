package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final i1 a;

    public s0(i1 i1Var) {
        this.a = i1Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        com.google.android.gms.common.internal.x.g(atomicReference);
        com.google.android.gms.common.internal.x.b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.a() ? str : g(str, g2.f, g2.a, b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.a() ? str : g(str, g2.i, g2.h, c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (this.a.a()) {
            return str.startsWith("_exp_") ? androidx.privacysandbox.ads.adservices.java.internal.a.q("experiment_id(", str, ")") : g(str, g2.m, g2.l, d);
        }
        return str;
    }

    public final String d(u uVar) {
        String string;
        i1 i1Var = this.a;
        if (!i1Var.a()) {
            return uVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(uVar.z);
        sb.append(",name=");
        sb.append(a(uVar.e));
        sb.append(",params=");
        t tVar = uVar.y;
        if (tVar == null) {
            string = null;
        } else {
            string = !i1Var.a() ? tVar.e.toString() : e(tVar.h());
        }
        sb.append(string);
        return sb.toString();
    }

    public final String e(Bundle bundle) {
        String strF;
        if (bundle == null) {
            return null;
        }
        if (!this.a.a()) {
            return bundle.toString();
        }
        StringBuilder sbN = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.n("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbN.length() != 8) {
                sbN.append(", ");
            }
            sbN.append(b(str));
            sbN.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strF = f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strF = f((Object[]) obj);
            } else {
                strF = obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbN.append(strF);
        }
        sbN.append("}]");
        return sbN.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbN = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.n("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sbN.length() != 1) {
                    sbN.append(", ");
                }
                sbN.append(strE);
            }
        }
        sbN.append("]");
        return sbN.toString();
    }
}
