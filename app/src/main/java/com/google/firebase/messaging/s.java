package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import com.caverock.androidsvg.y1;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final Context a;
    public final androidx.compose.runtime.snapshots.j b;
    public final y1 c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final q h;
    public final androidx.collection.f e = new androidx.collection.f(0);
    public boolean g = false;

    public s(FirebaseMessaging firebaseMessaging, androidx.compose.runtime.snapshots.j jVar, q qVar, y1 y1Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = jVar;
        this.h = qVar;
        this.c = y1Var;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(com.google.android.gms.tasks.q qVar) throws IOException {
        try {
            kotlin.math.a.g(qVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        y1 y1Var = this.c;
        a(y1Var.B(y1Var.m0(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        y1 y1Var = this.c;
        a(y1Var.B(y1Var.m0(strA, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0106 */
    /* JADX WARN: Code duplicated, block: B:32:0x008b A[Catch: IOException -> 0x0062, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:88:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[Catch: IOException -> 0x0062, TRY_LEAVE, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:88:0x002b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0093, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.s.e():boolean");
    }

    public final void f(long j) {
        this.f.schedule(new u(this, this.a, this.b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        d(true);
    }
}
