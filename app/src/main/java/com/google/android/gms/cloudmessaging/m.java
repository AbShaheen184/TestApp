package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final int a;
    public final com.google.android.gms.tasks.j b = new com.google.android.gms.tasks.j();
    public final int c;
    public final Bundle d;
    public final /* synthetic */ int e;

    public m(int i, int i2, Bundle bundle, int i3) {
        this.e = i3;
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(androidx.compose.runtime.snapshots.g gVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + gVar.toString());
        }
        this.b.a(gVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.b.b(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.c + " id=" + this.a + " oneWay=" + a() + "}";
    }
}
