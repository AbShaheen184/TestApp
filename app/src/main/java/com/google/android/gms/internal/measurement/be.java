package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class be extends de implements zd {
    public final File e;

    public be(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.e = file;
    }

    @Override // com.google.android.gms.internal.measurement.zd
    public final File a() {
        return this.e;
    }
}
