package com.app.mlounge.data.remote.trakt;

import com.app.mlounge.data.repository.j0;
import com.app.mlounge.data.repository.x;
import dagger.internal.d;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktSyncManager_Factory implements d {
    private final d localRepoProvider;
    private final d tmdbRepoProvider;
    private final d traktManagerProvider;

    @Override // javax.inject.a
    public final Object get() {
        return new TraktSyncManager((TraktManager) this.traktManagerProvider.get(), (x) this.localRepoProvider.get(), (j0) this.tmdbRepoProvider.get());
    }
}
