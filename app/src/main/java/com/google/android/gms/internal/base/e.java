package com.google.android.gms.internal.base;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.api.internal.o;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends n {
    public static void O(Context context, o oVar, IntentFilter intentFilter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            context.registerReceiver(oVar, intentFilter, i >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(oVar, intentFilter);
        }
    }
}
