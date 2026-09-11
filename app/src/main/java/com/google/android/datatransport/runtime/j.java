package com.google.android.datatransport.runtime;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Closeable {
    public com.google.android.datatransport.runtime.scheduling.persistence.c A;
    public javax.inject.a B;
    public javax.inject.a C;
    public javax.inject.a e;
    public com.google.android.datatransport.runtime.backends.e y;
    public javax.inject.a z;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((com.google.android.datatransport.runtime.scheduling.persistence.g) this.B.get()).close();
    }
}
