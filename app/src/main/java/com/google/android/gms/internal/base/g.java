package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class g extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Looper looper, int i) {
        super(looper);
        switch (i) {
            case 2:
                super(looper);
                Looper.getMainLooper();
                break;
            case 3:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
