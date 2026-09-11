package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.caverock.androidsvg.y1;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.measurement.ba;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends _COROUTINE.a {
    public final /* synthetic */ int l;

    public /* synthetic */ b(int i) {
        this.l = i;
    }

    @Override // _COROUTINE.a
    public com.google.android.gms.common.api.c i(Context context, Looper looper, y1 y1Var, Object obj, g gVar, h hVar) {
        switch (this.l) {
            case 1:
                return new ba(context, looper, 51, y1Var, gVar, hVar);
            case 2:
                y1Var.getClass();
                Integer num = (Integer) y1Var.f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new com.google.android.gms.signin.internal.a(context, looper, y1Var, bundle, gVar, hVar);
            case 3:
                throw androidx.privacysandbox.ads.adservices.java.internal.a.i(obj);
            default:
                return super.i(context, looper, y1Var, obj, gVar, hVar);
        }
    }

    @Override // _COROUTINE.a
    public /* synthetic */ com.google.android.gms.common.api.c j(Context context, Looper looper, y1 y1Var, Object obj, k kVar, k kVar2) {
        switch (this.l) {
            case 0:
                return new d(context, looper, y1Var, (n) obj, kVar, kVar2);
            default:
                return super.j(context, looper, y1Var, obj, kVar, kVar2);
        }
    }
}
