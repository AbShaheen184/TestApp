package com.google.android.gms.internal.measurement;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class pd extends de {
    public static final /* synthetic */ int y = 0;
    public final ArrayList e;

    public pd(InputStream inputStream, ArrayList arrayList) {
        super(inputStream);
        this.e = arrayList;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                androidx.transition.k.i();
                return;
            }
            try {
                throw null;
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            Iterator it = this.e.iterator();
            if (it.hasNext()) {
                throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
            }
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.de, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = ((FilterInputStream) this).in.read(bArr);
        if (i != -1) {
            Iterator it = this.e.iterator();
            if (it.hasNext()) {
                throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
            }
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 != -1) {
            Iterator it = this.e.iterator();
            if (it.hasNext()) {
                throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
            }
        }
        return i3;
    }
}
