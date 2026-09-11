package com.google.firebase.crashlytics.internal.breadcrumbs;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a {
    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.a
    public final void b(p pVar) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
        }
    }
}
