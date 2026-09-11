package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.compose.ui.autofill.r;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b b;
    public r a;

    static {
        b bVar = new b();
        bVar.a = null;
        b = bVar;
    }

    public static r a(Context context) {
        r rVar;
        b bVar = b;
        synchronized (bVar) {
            try {
                if (bVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.a = new r(context);
                }
                rVar = bVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }
}
