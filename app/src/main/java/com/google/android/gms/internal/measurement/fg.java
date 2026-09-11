package com.google.android.gms.internal.measurement;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class fg extends gg {
    public int b;

    @Override // com.google.android.gms.internal.measurement.gg
    public final String a() {
        return "com/google/android/libraries/phenotype/client/Phlogger".replace('/', '.');
    }

    @Override // com.google.android.gms.internal.measurement.gg
    public final String b() {
        return "logInternal";
    }

    @Override // com.google.android.gms.internal.measurement.gg
    public final int c() {
        return 44;
    }

    @Override // com.google.android.gms.internal.measurement.gg
    public final String d() {
        return "Phlogger.java".substring("Phlogger.java".lastIndexOf(File.separatorChar) + 1);
    }

    @Override // com.google.android.gms.internal.measurement.gg
    public final String e() {
        return "Phlogger.java";
    }

    public final boolean equals(Object obj) {
        return obj instanceof fg;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        this.b = -1391114360;
        return -1391114360;
    }
}
