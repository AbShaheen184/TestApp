package androidx.media3.common.util;

import android.content.Context;
import android.telephony.TelephonyManager;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static void a(Context context, u uVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            q qVar = new q(uVar);
            telephonyManager.registerTelephonyCallback(uVar.a, qVar);
            telephonyManager.unregisterTelephonyCallback(qVar);
        } catch (RuntimeException unused) {
            uVar.c(5);
        }
    }
}
