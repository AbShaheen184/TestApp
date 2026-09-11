package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    public static final /* synthetic */ int c = 0;
    public final o2 a = new o2();
    public boolean b;

    static {
        new c1(0);
    }

    public c1(int i) {
        a();
        a();
    }

    public static void b(z0 z0Var, a3 a3Var, int i, Object obj) {
        if (a3Var == a3.A) {
            z0Var.d(i, 3);
            ((i1) ((m0) obj)).f(z0Var);
            z0Var.d(i, 4);
            return;
        }
        z0Var.d(i, a3Var.y);
        b3 b3Var = b3.e;
        switch (a3Var.ordinal()) {
            case 0:
                z0Var.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                z0Var.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                z0Var.t(((Long) obj).longValue());
                break;
            case 3:
                z0Var.t(((Long) obj).longValue());
                break;
            case 4:
                z0Var.q(((Integer) obj).intValue());
                break;
            case 5:
                z0Var.u(((Long) obj).longValue());
                break;
            case 6:
                z0Var.s(((Integer) obj).intValue());
                break;
            case 7:
                z0Var.p(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof t0)) {
                    z0Var.v((String) obj);
                } else {
                    z0Var.m((t0) obj);
                }
                break;
            case 9:
                ((i1) ((m0) obj)).f(z0Var);
                break;
            case 10:
                z0Var.o((m0) obj);
                break;
            case 11:
                if (!(obj instanceof t0)) {
                    byte[] bArr = (byte[]) obj;
                    z0Var.n(bArr, bArr.length);
                } else {
                    z0Var.m((t0) obj);
                }
                break;
            case 12:
                z0Var.r(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof k1)) {
                    z0Var.q(((Integer) obj).intValue());
                } else {
                    z0Var.q(((k1) obj).a());
                }
                break;
            case 14:
                z0Var.s(((Integer) obj).intValue());
                break;
            case 15:
                z0Var.u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                z0Var.r((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                z0Var.t((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        o2 o2Var = this.a;
        int i = o2Var.y;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = o2Var.a(i2).y;
            if (obj instanceof i1) {
                ((i1) obj).j();
            }
        }
        Iterator it = o2Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof i1) {
                ((i1) value).j();
            }
        }
        if (!o2Var.A) {
            if (o2Var.y > 0) {
                o2Var.a(0).e.getClass();
                androidx.transition.k.i();
                return;
            } else {
                Iterator it2 = o2Var.b().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    androidx.transition.k.i();
                    return;
                }
            }
        }
        if (!o2Var.A) {
            o2Var.z = o2Var.z.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(o2Var.z);
            o2Var.C = o2Var.C.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(o2Var.C);
            o2Var.A = true;
        }
        this.b = true;
    }

    public final Object clone() {
        c1 c1Var = new c1();
        o2 o2Var = this.a;
        if (o2Var.y > 0) {
            o2Var.a(0).e.getClass();
            androidx.transition.k.i();
            return null;
        }
        Iterator it = o2Var.b().iterator();
        if (!it.hasNext()) {
            return c1Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            androidx.transition.k.i();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c1) {
            return this.a.equals(((c1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public c1() {
    }
}
