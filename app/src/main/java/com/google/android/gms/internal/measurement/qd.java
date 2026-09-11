package com.google.android.gms.internal.measurement;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class qd extends ee {
    public static final /* synthetic */ int y = 0;
    public final ArrayList e;

    public qd(OutputStream outputStream, ArrayList arrayList) {
        super(outputStream);
        this.e = arrayList;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
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

    @Override // com.google.android.gms.internal.measurement.ee, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        ((FilterOutputStream) this).out.write(bArr);
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                androidx.transition.k.i();
            } else {
                int length = bArr.length;
                throw null;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ee, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
        }
    }
}
