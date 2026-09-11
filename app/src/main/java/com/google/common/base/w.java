package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;
import kotlin.collections.a0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements t, Serializable {
    public final Object e;

    public w(Object obj) {
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return a0.n(this.e, ((w) obj).e);
        }
        return false;
    }

    @Override // com.google.common.base.t
    public final Object get() {
        return this.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.e + ")";
    }
}
