package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w5 extends n5 implements b6 {
    public final AtomicReference d;
    public boolean e;

    public w5() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.d = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(android.os.Bundle r3, java.lang.Class r4) {
        /*
            if (r3 == 0) goto L2a
            java.lang.String r0 = "r"
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> Lf
            return r3
        Lf:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received: "
            java.lang.String r2 = ", "
            java.lang.String r3 = coil3.compose.internal.f.e(r1, r4, r2, r3)
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L2a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.w5.h(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) o5.a(parcel, Bundle.CREATOR);
        o5.d(parcel);
        w(bundle);
        parcel2.writeNoException();
        return true;
    }

    public final Bundle g(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.d;
        synchronized (atomicReference) {
            if (!this.e) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.d.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void w(Bundle bundle) {
        AtomicReference atomicReference = this.d;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.e = true;
                    this.d.notify();
                } catch (Throwable th) {
                    this.d.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
