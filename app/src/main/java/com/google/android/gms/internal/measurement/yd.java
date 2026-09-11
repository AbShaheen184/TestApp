package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class yd implements ie {
    @Override // com.google.android.gms.internal.measurement.ie
    public final be a(Uri uri) throws androidx.datastore.preferences.protobuf.i {
        File fileB = ea.b(uri);
        return new be(new FileInputStream(fileB), fileB);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final boolean b(Uri uri) {
        return ea.b(uri).exists();
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final File c(Uri uri) {
        return ea.b(uri);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final String d() {
        return "file";
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final OutputStream e(Uri uri) throws IOException {
        File fileB = ea.b(uri);
        com.google.android.material.shape.k.G(fileB);
        return new ce(new FileOutputStream(fileB), fileB);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void f(Uri uri) throws IOException {
        File fileB = ea.b(uri);
        if (fileB.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileB.delete()) {
            return;
        }
        if (!fileB.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void g(Uri uri, Uri uri2) throws IOException {
        File fileB = ea.b(uri);
        File fileB2 = ea.b(uri2);
        com.google.android.material.shape.k.G(fileB2);
        if (!fileB.renameTo(fileB2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }
}
