package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements com.google.common.base.t, Serializable {
    public final int e;

    public w0() {
        q.f(2, "expectedValuesPerKey");
        this.e = 2;
    }

    @Override // com.google.common.base.t
    public final Object get() {
        return new ArrayList(this.e);
    }
}
