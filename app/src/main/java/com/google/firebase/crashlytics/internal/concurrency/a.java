package com.google.firebase.crashlytics.internal.concurrency;

import androidx.media3.exoplayer.source.a0;
import com.google.android.gms.tasks.i;
import com.google.android.gms.tasks.j;
import com.google.android.gms.tasks.q;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final androidx.arch.core.executor.a a = new androidx.arch.core.executor.a(2);

    public static q a(i iVar, i iVar2) {
        com.google.android.gms.tasks.a aVar = new com.google.android.gms.tasks.a();
        j jVar = new j(aVar.a);
        a0 a0Var = new a0(6, jVar, new AtomicBoolean(false), aVar);
        androidx.arch.core.executor.a aVar2 = a;
        iVar.d(aVar2, a0Var);
        iVar2.d(aVar2, a0Var);
        return jVar.a;
    }
}
