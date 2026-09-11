package org.msgpack.core;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends c {
    public final BigInteger y;

    public d(BigInteger bigInteger) {
        super(4);
        this.y = bigInteger;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.y.toString();
    }
}
