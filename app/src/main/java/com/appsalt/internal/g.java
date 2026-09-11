package com.appsalt.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.appsalt.lib.ConsentActivity;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements z1 {
    public final Context a;
    public final g4 b;
    public final d2 c;
    public final boolean d;
    public Job e;
    public String f;
    public final String g;
    public final r0 h;
    public final g5 i;
    public r0 j;
    public final z k;
    public final boolean l;
    public boolean m;
    public kotlin.jvm.functions.l n;
    public Exception o;

    public g(Context context, g4 g4Var) {
        Object lVar;
        d2 d2Var = new d2();
        this.a = context;
        this.b = g4Var;
        this.c = d2Var;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i >= 28;
        this.d = z2;
        b0.d = new x2(context.getApplicationContext());
        d2Var.h = z2;
        this.e = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.f = "";
        this.g = b0.d.b.c;
        r0 s0Var = new s0(new c(this, null, 1), g4Var);
        this.h = s0Var;
        g5 g5Var = new g5(new c(this, null, 0), g4Var);
        this.i = g5Var;
        this.j = z2 ? s0Var : g5Var;
        this.k = new z(context, 0);
        try {
            lVar = i >= 30 ? context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName() : context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            lVar = new kotlin.l(th);
        }
        String str = (String) (lVar instanceof kotlin.l ? null : lVar);
        if (str != null && kotlin.text.k.T(str, "com.android.vending", true)) {
            z = true;
        }
        this.l = !z;
        this.n = new com.app.mlounge.ui.screens.player.j0(13);
    }

    @Override // com.appsalt.internal.z1
    public final boolean a() {
        return this.k.a.getBoolean("didConsent", false);
    }

    @Override // com.appsalt.internal.z1
    public final void b(boolean z) {
        this.k.a.edit().putBoolean("didConsent", z).apply();
        if (z) {
            return;
        }
        stop();
    }

    public final void c(Bundle bundle) {
        Context context = this.a;
        if (this.l && this.o == null && !a()) {
            try {
                Intent intentAddFlags = new Intent(context, (Class<?>) ConsentActivity.class).addFlags(268435456);
                if (bundle != null) {
                    intentAddFlags.putExtras(bundle);
                }
                context.startActivity(intentAddFlags);
            } catch (Exception e) {
                this.o = e;
                this.n.invoke(e);
            }
        }
    }

    @Override // com.appsalt.internal.z1
    public final String getId() {
        return this.g;
    }

    @Override // com.appsalt.internal.u
    public final boolean isRunning() {
        return this.m;
    }

    @Override // com.appsalt.internal.u
    public final void optOut() {
        b(false);
        stop();
    }

    @Override // com.appsalt.internal.v2
    public final void requestConsent(int i, int i2, int i3, int i4, int i5) {
        Bundle bundle = new Bundle();
        bundle.putInt("backgroundColor", i);
        bundle.putInt("textColor", i2);
        bundle.putInt("linksColor", i3);
        bundle.putInt("buttonTextColor", i4);
        bundle.putInt("buttonBackgroundRes", i5);
        c(bundle);
    }

    @Override // com.appsalt.internal.u
    public final void setOnError(kotlin.jvm.functions.l lVar) {
        this.n = lVar;
    }

    @Override // com.appsalt.internal.u
    public final void start(String str) {
        boolean z = this.l;
        g4 g4Var = this.b;
        if (!z) {
            g4Var.getClass();
            if (g4.b) {
                g4Var.a(1, "Unable to start");
                return;
            }
            return;
        }
        g4Var.getClass();
        if (g4.b) {
            g4Var.a(3, "checkAndStart(isConsentGiven = " + a() + ", isRunning = " + this.m + ')');
        }
        if (!a()) {
            if (g4.b) {
                g4Var.a(1, "Missing consent");
            }
        } else {
            if (this.m) {
                return;
            }
            this.f = str;
            this.e = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new androidx.compose.animation.core.c1(this, null, 26), 3, null);
            r0 r0Var = this.d ? this.h : this.i;
            this.j = r0Var;
            r0Var.c(str, false);
            this.m = true;
        }
    }

    @Override // com.appsalt.internal.u
    public final void stop() {
        this.b.getClass();
        if (this.m) {
            try {
                Job.DefaultImpls.cancel$default(this.e, (CancellationException) null, 1, (Object) null);
            } catch (Throwable unused) {
            }
            this.j.b(false);
            this.m = false;
        }
    }

    @Override // com.appsalt.internal.v2
    public final void requestConsent() {
        c(null);
    }
}
