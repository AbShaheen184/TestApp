package com.google.gson;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends h {
    public final Serializable e;

    public l(Boolean bool) {
        Objects.requireNonNull(bool);
        this.e = bool;
    }

    public static boolean l(l lVar) {
        Serializable serializable = lVar.e;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.h
    public final boolean b() {
        Serializable serializable = this.e;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(h());
    }

    @Override // com.google.gson.h
    public final int c() {
        return this.e instanceof Number ? k().intValue() : Integer.parseInt(h());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        Serializable serializable = lVar.e;
        Serializable serializable2 = this.e;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (l(this) && l(lVar)) {
            if ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) {
                return i().equals(lVar.i());
            }
            return k().longValue() == lVar.k().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : com.google.gson.internal.h.i(h())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : com.google.gson.internal.h.i(lVar.h())) == 0;
        }
        double dJ = j();
        double dJ2 = lVar.j();
        if (dJ != dJ2) {
            return Double.isNaN(dJ) && Double.isNaN(dJ2);
        }
        return true;
    }

    @Override // com.google.gson.h
    public final long f() {
        return this.e instanceof Number ? k().longValue() : Long.parseLong(h());
    }

    @Override // com.google.gson.h
    public final String h() {
        Serializable serializable = this.e;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return k().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.e;
        if (serializable == null) {
            return 31;
        }
        if (l(this)) {
            jDoubleToLongBits = k().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(k().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final BigInteger i() {
        Serializable serializable = this.e;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (l(this)) {
            return BigInteger.valueOf(k().longValue());
        }
        String strH = h();
        com.google.gson.internal.h.c(strH);
        return new BigInteger(strH);
    }

    public final double j() {
        return this.e instanceof Number ? k().doubleValue() : Double.parseDouble(h());
    }

    public final Number k() {
        Serializable serializable = this.e;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new com.google.gson.internal.j((String) serializable);
        }
        b.r("Primitive is neither a number nor a string");
        return null;
    }

    public l(Number number) {
        Objects.requireNonNull(number);
        this.e = number;
    }

    public l(String str) {
        Objects.requireNonNull(str);
        this.e = str;
    }
}
