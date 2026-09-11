package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends y {
    public static y f(int i) {
        if (i < 0) {
            return y.b;
        }
        return i > 0 ? y.c : y.a;
    }

    @Override // com.google.common.collect.y
    public final y a(int i, int i2) {
        return f(Integer.compare(i, i2));
    }

    @Override // com.google.common.collect.y
    public final y b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // com.google.common.collect.y
    public final y c(boolean z, boolean z2) {
        return f(Boolean.compare(z, z2));
    }

    @Override // com.google.common.collect.y
    public final y d(boolean z, boolean z2) {
        return f(Boolean.compare(z2, z));
    }

    @Override // com.google.common.collect.y
    public final int e() {
        return 0;
    }
}
