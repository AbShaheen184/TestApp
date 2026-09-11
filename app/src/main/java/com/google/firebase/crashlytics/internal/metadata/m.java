package com.google.firebase.crashlytics.internal.metadata;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements d {
    public static final Charset z = Charset.forName("UTF-8");
    public final File e;
    public l y;

    public m(File file) {
        this.e = file;
    }

    public final void a() {
        File file = this.e;
        if (this.y == null) {
            try {
                this.y = new l(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.d
    public final void c() {
        com.google.firebase.crashlytics.internal.common.g.b(this.y, "There was a problem closing the Crashlytics log file.");
        this.y = null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // com.google.firebase.crashlytics.internal.metadata.d
    public final String e() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar;
        byte[] bArr;
        if (this.e.exists()) {
            a();
            l lVar2 = this.y;
            if (lVar2 == null) {
                lVar = null;
            } else {
                int[] iArr = {0};
                byte[] bArr2 = new byte[lVar2.Z()];
                try {
                    this.y.m(new f(bArr2, iArr));
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e);
                }
                lVar = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(bArr2, iArr[0], 10);
            }
        } else {
            lVar = null;
        }
        if (lVar == null) {
            bArr = null;
        } else {
            int i = lVar.y;
            bArr = new byte[i];
            System.arraycopy((byte[]) lVar.z, 0, bArr, 0, i);
        }
        if (bArr != null) {
            return new String(bArr, z);
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.d
    public final void g(String str, long j) {
        a();
        if (this.y == null) {
            return;
        }
        try {
            if (str.length() > 16384) {
                str = "...".concat(str.substring(str.length() - 16384));
            }
            this.y.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(z));
            while (!this.y.w() && this.y.Z() > 65536) {
                this.y.N();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }
}
