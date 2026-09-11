package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.measurement.internal.c0;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j c;
    public final c0 a;

    public j(c0 c0Var) {
        this.a = c0Var;
    }

    public final boolean a(com.google.firebase.installations.local.b bVar) {
        if (TextUtils.isEmpty(bVar.c)) {
            return true;
        }
        long j = bVar.f + bVar.e;
        this.a.getClass();
        return j < (System.currentTimeMillis() / 1000) + 3600;
    }
}
