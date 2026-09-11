package com.google.firebase.crashlytics.internal.metadata;

import com.google.android.gms.measurement.internal.c0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements k {
    public static final c0 z = new c0(10);
    public final Object e;
    public Object y;

    public f(com.google.firebase.crashlytics.internal.persistence.c cVar) {
        this.e = cVar;
        this.y = z;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.k
    public void a(j jVar, int i) throws IOException {
        int[] iArr = (int[]) this.y;
        try {
            jVar.read((byte[]) this.e, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            jVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.e = bArr;
        this.y = iArr;
    }
}
