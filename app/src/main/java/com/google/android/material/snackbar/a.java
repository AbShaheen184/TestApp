package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            throw androidx.privacysandbox.ads.adservices.java.internal.a.i(message.obj);
        }
        if (i != 1) {
            return false;
        }
        throw androidx.privacysandbox.ads.adservices.java.internal.a.i(message.obj);
    }
}
