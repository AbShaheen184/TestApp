package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k5 implements Comparator {
    public final /* synthetic */ c4 e;
    public final /* synthetic */ b7 y;

    public k5(c4 c4Var, b7 b7Var) {
        this.e = c4Var;
        this.y = b7Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        d5 d5Var = (d5) obj;
        d5 d5Var2 = (d5) obj2;
        if (d5Var instanceof h5) {
            return !(d5Var2 instanceof h5) ? 1 : 0;
        }
        if (d5Var2 instanceof h5) {
            return -1;
        }
        c4 c4Var = this.e;
        return c4Var == null ? d5Var.d().compareTo(d5Var2.d()) : (int) ea.r(c4Var.a(this.y, Arrays.asList(d5Var, d5Var2)).h().doubleValue());
    }
}
