package com.google.firebase.crashlytics.internal.common;

import android.util.Log;
import com.appsalt.internal.j0;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ j0 d;
    public final /* synthetic */ m e;

    public k(m mVar, long j, Throwable th, Thread thread, j0 j0Var) {
        this.e = mVar;
        this.a = j;
        this.b = th;
        this.c = thread;
        this.d = j0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        long j = this.a;
        long j2 = j / 1000;
        m mVar = this.e;
        String strE = mVar.e();
        if (strE == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return kotlin.math.a.t(null);
        }
        mVar.c.o();
        com.google.firebase.crashlytics.internal.persistence.c cVar = mVar.m;
        cVar.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strE);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        cVar.h(this.b, this.c, "crash", new com.google.firebase.crashlytics.internal.metadata.c(strE, j2, kotlin.collections.v.e), true);
        try {
            com.google.firebase.crashlytics.internal.persistence.c cVar2 = mVar.g;
            String str = ".ae" + j;
            cVar2.getClass();
            if (!new File((File) cVar2.c, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
        j0 j0Var = this.d;
        mVar.b(false, j0Var, false);
        mVar.c(new e().a, Boolean.FALSE);
        return !mVar.b.a() ? kotlin.math.a.t(null) : ((com.google.android.gms.tasks.j) ((AtomicReference) j0Var.i).get()).a.i(mVar.e.a, new com.google.android.material.internal.b(this, strE));
    }
}
