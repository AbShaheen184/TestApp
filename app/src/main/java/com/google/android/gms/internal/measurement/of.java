package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class of {
    public int a;
    public final int b;
    public of c;
    public final HashMap d = new HashMap(0);

    public of(int i, int i2) {
        if (i > i2) {
            net.luminis.tls.engine.impl.c.a();
            throw null;
        }
        this.a = i;
        this.b = i2;
        this.c = null;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.e(iIdentityHashCode, "Node", new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4));
    }
}
