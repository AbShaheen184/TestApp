package com.google.firebase.messaging;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static WeakReference b;
    public androidx.compose.runtime.internal.c a;

    public final synchronized p a() {
        String str;
        p pVar;
        androidx.compose.runtime.internal.c cVar = this.a;
        synchronized (((ArrayDeque) cVar.A)) {
            str = (String) ((ArrayDeque) cVar.A).peek();
        }
        Pattern pattern = p.d;
        pVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                pVar = new p(strArrSplit[0], strArrSplit[1]);
            }
        }
        return pVar;
    }
}
