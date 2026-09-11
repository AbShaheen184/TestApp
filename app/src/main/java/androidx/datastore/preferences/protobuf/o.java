package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final /* synthetic */ int c = 0;
    public final w0 a = w0.f();
    public boolean b;

    static {
        new o(0);
    }

    public o(int i) {
        a();
        a();
    }

    public static void b(j jVar, o1 o1Var, int i, Object obj) {
        if (o1Var == o1.A) {
            jVar.B(i, 3);
            ((a) obj).b(jVar);
            jVar.B(i, 4);
        }
        jVar.B(i, o1Var.y);
        switch (o1Var.ordinal()) {
            case 0:
                jVar.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                jVar.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                jVar.F(((Long) obj).longValue());
                break;
            case 3:
                jVar.F(((Long) obj).longValue());
                break;
            case 4:
                jVar.w(((Integer) obj).intValue());
                break;
            case 5:
                jVar.u(((Long) obj).longValue());
                break;
            case 6:
                jVar.s(((Integer) obj).intValue());
                break;
            case 7:
                jVar.m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof f)) {
                    jVar.A((String) obj);
                } else {
                    jVar.q((f) obj);
                }
                break;
            case 9:
                ((a) obj).b(jVar);
                break;
            case 10:
                a aVar = (a) obj;
                jVar.getClass();
                jVar.D(((t) aVar).a(null));
                aVar.b(jVar);
                break;
            case 11:
                if (!(obj instanceof f)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    jVar.D(length);
                    jVar.n(bArr, 0, length);
                } else {
                    jVar.q((f) obj);
                }
                break;
            case 12:
                jVar.D(((Integer) obj).intValue());
                break;
            case 13:
                jVar.w(((Integer) obj).intValue());
                break;
            case 14:
                jVar.s(((Integer) obj).intValue());
                break;
            case 15:
                jVar.u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                jVar.D((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                jVar.F((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        w0 w0Var = this.a;
        int size = w0Var.e.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryC = w0Var.c(i);
            if (entryC.getValue() instanceof t) {
                t tVar = (t) entryC.getValue();
                tVar.getClass();
                r0 r0Var = r0.c;
                r0Var.getClass();
                r0Var.a(tVar.getClass()).b(tVar);
                tVar.h();
            }
        }
        if (!w0Var.z) {
            if (w0Var.e.size() > 0) {
                w0Var.c(0).getKey().getClass();
                androidx.transition.k.i();
                return;
            } else {
                Iterator it = w0Var.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    androidx.transition.k.i();
                    return;
                }
            }
        }
        if (!w0Var.z) {
            w0Var.y = w0Var.y.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(w0Var.y);
            w0Var.B = w0Var.B.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(w0Var.B);
            w0Var.z = true;
        }
        this.b = true;
    }

    public final Object clone() {
        o oVar = new o();
        w0 w0Var = this.a;
        if (w0Var.e.size() > 0) {
            Map.Entry entryC = w0Var.c(0);
            if (entryC.getKey() != null) {
                androidx.transition.k.i();
                return null;
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = w0Var.d().iterator();
        if (!it.hasNext()) {
            return oVar;
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
        if (obj instanceof o) {
            return this.a.equals(((o) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public o() {
    }
}
