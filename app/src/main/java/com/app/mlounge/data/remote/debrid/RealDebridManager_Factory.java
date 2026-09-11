package com.app.mlounge.data.remote.debrid;

import com.app.mlounge.data.local.prefs.y1;
import dagger.internal.d;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class RealDebridManager_Factory implements d {
    private final d apiProvider;
    private final d prefsProvider;

    @Override // javax.inject.a
    public final Object get() {
        return new RealDebridManager((RealDebridApi) this.apiProvider.get(), (y1) this.prefsProvider.get());
    }
}
