package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.os.UserManager;
import com.google.android.gms.tasks.q;
import com.google.firebase.components.n;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f, g {
    public final n a;
    public final Context b;
    public final com.google.firebase.inject.b c;
    public final Set d;
    public final Executor e;

    public d(Context context, String str, Set set, com.google.firebase.inject.b bVar, Executor executor) {
        this.a = new n(new com.google.firebase.c(context, str));
        this.d = set;
        this.e = executor;
        this.c = bVar;
        this.b = context;
    }

    public final q a() {
        if (!((UserManager) this.b.getSystemService(UserManager.class)).isUserUnlocked()) {
            return kotlin.math.a.t("");
        }
        return kotlin.math.a.l(this.e, new c(this, 0));
    }

    public final void b() {
        if (this.d.size() <= 0) {
            kotlin.math.a.t(null);
        } else if (!((UserManager) this.b.getSystemService(UserManager.class)).isUserUnlocked()) {
            kotlin.math.a.t(null);
        } else {
            kotlin.math.a.l(this.e, new c(this, 1));
        }
    }
}
