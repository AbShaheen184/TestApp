package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 implements d5 {
    public final Double e;

    public j3(Double d) {
        if (d == null) {
            this.e = Double.valueOf(Double.NaN);
        } else {
            this.e = d;
        }
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Iterator b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Boolean c() {
        Double d = this.e;
        boolean z = false;
        if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final String d() {
        Double d = this.e;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i >= 0 || i <= -7) && (i < 0 || i >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j3) {
            return this.e.equals(((j3) obj).e);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Double h() {
        return this.e;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final d5 j(String str, b7 b7Var, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new g5(d());
        }
        throw new IllegalArgumentException(d() + "." + str + " is not a function.");
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final d5 l() {
        return new j3(this.e);
    }

    public final String toString() {
        return d();
    }
}
