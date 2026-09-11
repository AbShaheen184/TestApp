package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ce extends ee implements zd {
    public final FileOutputStream e;
    public final File y;

    public ce(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.e = fileOutputStream;
        this.y = file;
    }

    @Override // com.google.android.gms.internal.measurement.zd
    public final File a() {
        return this.y;
    }
}
