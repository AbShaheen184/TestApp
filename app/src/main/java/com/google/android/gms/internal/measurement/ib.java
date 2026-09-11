package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ib implements Closeable {
    public final Inflater e = new Inflater(true);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.end();
    }
}
