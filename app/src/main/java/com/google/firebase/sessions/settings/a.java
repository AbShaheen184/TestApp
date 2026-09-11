package com.google.firebase.sessions.settings;

import android.content.Context;
import android.os.Bundle;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements o {
    public final Bundle a;

    public a(Context context) {
        context.getClass();
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // com.google.firebase.sessions.settings.o
    public final Boolean a() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.o
    public final kotlin.time.a b() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new kotlin.time.a(com.google.common.base.b.u(bundle.getInt("firebase_sessions_sessions_restart_timeout"), kotlin.time.c.SECONDS));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.o
    public final Double c() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.o
    public final Object d(kotlin.coroutines.d dVar) {
        return y.a;
    }
}
