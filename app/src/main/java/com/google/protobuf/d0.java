package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public final c2 a = c2.f();
    public boolean b;

    static {
        new d0(0);
    }

    public d0(int i) {
        b();
        b();
    }

    public static int a(t2 t2Var, int i, Object obj) {
        int iA;
        int iF;
        int iE = w.e(i);
        if (t2Var == t2.A) {
            iE *= 2;
        }
        int iG = 4;
        switch (t2Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                boolean z = w.b;
                iG = 8;
                return iG + iE;
            case 1:
                ((Float) obj).getClass();
                boolean z2 = w.b;
                return iG + iE;
            case 2:
                iG = w.g(((Long) obj).longValue());
                return iG + iE;
            case 3:
                iG = w.g(((Long) obj).longValue());
                return iG + iE;
            case 4:
                iG = w.g(((Integer) obj).intValue());
                return iG + iE;
            case 5:
                ((Long) obj).getClass();
                boolean z3 = w.b;
                iG = 8;
                return iG + iE;
            case 6:
                ((Integer) obj).getClass();
                boolean z4 = w.b;
                return iG + iE;
            case 7:
                ((Boolean) obj).getClass();
                boolean z5 = w.b;
                iG = 1;
                return iG + iE;
            case 8:
                if (obj instanceof ByteString) {
                    boolean z6 = w.b;
                    iA = ((ByteString) obj).size();
                    iF = w.f(iA);
                } else {
                    boolean z7 = w.b;
                    iA = o2.a((String) obj);
                    iF = w.f(iA);
                }
                iG = iF + iA;
                return iG + iE;
            case 9:
                iG = ((l1) obj).getSerializedSize();
                return iG + iE;
            case 10:
                if (obj instanceof v0) {
                    Object obj2 = null;
                    obj2.getClass();
                    throw null;
                }
                boolean z8 = w.b;
                iA = ((l1) obj).getSerializedSize();
                iF = w.f(iA);
                iG = iF + iA;
                return iG + iE;
            case 11:
                if (obj instanceof ByteString) {
                    boolean z9 = w.b;
                    iA = ((ByteString) obj).size();
                    iF = w.f(iA);
                } else {
                    boolean z10 = w.b;
                    iA = ((byte[]) obj).length;
                    iF = w.f(iA);
                }
                iG = iF + iA;
                return iG + iE;
            case 12:
                iG = w.f(((Integer) obj).intValue());
                return iG + iE;
            case 13:
                iG = obj instanceof Internal$EnumLite ? w.g(((Internal$EnumLite) obj).getNumber()) : w.g(((Integer) obj).intValue());
                return iG + iE;
            case 14:
                ((Integer) obj).getClass();
                boolean z11 = w.b;
                return iG + iE;
            case 15:
                ((Long) obj).getClass();
                boolean z12 = w.b;
                iG = 8;
                return iG + iE;
            case 16:
                iG = w.c(((Integer) obj).intValue());
                return iG + iE;
            case 17:
                iG = w.d(((Long) obj).longValue());
                return iG + iE;
            default:
                org.mozilla.javascript.c.b("There is no way to get here, but the compiler thinks otherwise.");
                iG = 0;
                return iG + iE;
        }
    }

    public static void d(j0 j0Var, Object obj) {
        t2 t2Var = j0Var.y;
        byte[] bArr = u0.a;
        obj.getClass();
        boolean z = true;
        switch (t2Var.e) {
            case INT:
                z = obj instanceof Integer;
                break;
            case LONG:
                z = obj instanceof Long;
                break;
            case FLOAT:
                z = obj instanceof Float;
                break;
            case DOUBLE:
                z = obj instanceof Double;
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                break;
            case STRING:
                z = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof ByteString) && !(obj instanceof byte[])) {
                    z = false;
                }
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof Internal$EnumLite)) {
                    z = false;
                }
                break;
            case MESSAGE:
                if (!(obj instanceof l1) && !(obj instanceof v0)) {
                    z = false;
                }
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(j0Var.e), j0Var.y.e, obj.getClass().getName()));
        }
    }

    public static void e(w wVar, t2 t2Var, int i, Object obj) {
        if (t2Var == t2.A) {
            wVar.v(i, 3);
            ((l1) obj).writeTo(wVar);
            wVar.v(i, 4);
        }
        wVar.v(i, t2Var.y);
        switch (t2Var.ordinal()) {
            case 0:
                wVar.p(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                wVar.n(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                wVar.z(((Long) obj).longValue());
                break;
            case 3:
                wVar.z(((Long) obj).longValue());
                break;
            case 4:
                wVar.r(((Integer) obj).intValue());
                break;
            case 5:
                wVar.p(((Long) obj).longValue());
                break;
            case 6:
                wVar.n(((Integer) obj).intValue());
                break;
            case 7:
                wVar.h(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof ByteString)) {
                    wVar.u((String) obj);
                } else {
                    wVar.l((ByteString) obj);
                }
                break;
            case 9:
                ((l1) obj).writeTo(wVar);
                break;
            case 10:
                wVar.s((l1) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    wVar.j(bArr, bArr.length);
                } else {
                    wVar.l((ByteString) obj);
                }
                break;
            case 12:
                wVar.x(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof Internal$EnumLite)) {
                    wVar.r(((Integer) obj).intValue());
                } else {
                    wVar.r(((Internal$EnumLite) obj).getNumber());
                }
                break;
            case 14:
                wVar.n(((Integer) obj).intValue());
                break;
            case 15:
                wVar.p(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                wVar.x((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                wVar.z((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void b() {
        if (this.b) {
            return;
        }
        c2 c2Var = this.a;
        int i = c2Var.y;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = c2Var.c(i2).y;
            if (obj instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) obj).makeImmutable();
            }
        }
        Iterator it = c2Var.d().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) value).makeImmutable();
            }
        }
        if (!c2Var.A) {
            for (int i3 = 0; i3 < c2Var.y; i3++) {
                d2 d2VarC = c2Var.c(i3);
                if (((j0) d2VarC.e).z) {
                    d2VarC.setValue(Collections.unmodifiableList((List) d2VarC.y));
                }
            }
            for (Map.Entry entry : c2Var.d()) {
                if (((j0) entry.getKey()).z) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!c2Var.A) {
            c2Var.z = c2Var.z.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c2Var.z);
            c2Var.C = c2Var.C.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c2Var.C);
            c2Var.A = true;
        }
        this.b = true;
    }

    public final void c(j0 j0Var, Object obj) {
        if (!j0Var.z) {
            d(j0Var, obj);
        } else {
            if (!(obj instanceof List)) {
                net.luminis.tls.engine.impl.c.o("Wrong object type used with protocol message reflection.");
                return;
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                d(j0Var, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        this.a.put(j0Var, obj);
    }

    public final Object clone() {
        d0 d0Var = new d0();
        c2 c2Var = this.a;
        int i = c2Var.y;
        for (int i2 = 0; i2 < i; i2++) {
            d2 d2VarC = c2Var.c(i2);
            d0Var.c((j0) d2VarC.e, d2VarC.y);
        }
        for (Map.Entry entry : c2Var.d()) {
            d0Var.c((j0) entry.getKey(), entry.getValue());
        }
        return d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return this.a.equals(((d0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public d0() {
    }
}
