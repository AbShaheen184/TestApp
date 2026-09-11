package com.appsalt.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.appsalt.lib.longevity.RewardService;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements z1 {
    public final Context a;
    public final g4 b;
    public final g c;
    public kotlin.jvm.functions.l d;
    public Throwable e;
    public boolean f;

    public h(Context context, g4 g4Var) {
        this.a = context;
        this.b = g4Var;
        g gVar = new g(context, g4Var);
        this.c = gVar;
        this.d = new com.app.mlounge.ui.screens.player.j0(13);
        this.f = RewardService.C;
        final int i = 0;
        gVar.n = new kotlin.jvm.functions.l(this) { // from class: com.appsalt.internal.d
            public final /* synthetic */ h y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.l
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        Throwable th = (Throwable) obj;
                        h hVar = this.y;
                        hVar.stop();
                        hVar.e = th;
                        hVar.d.invoke(th);
                        break;
                    case 1:
                        Throwable th2 = (Throwable) obj;
                        h hVar2 = this.y;
                        hVar2.stop();
                        hVar2.e = th2;
                        hVar2.d.invoke(th2);
                        break;
                    default:
                        this.y.f = ((Boolean) obj).booleanValue();
                        break;
                }
                return kotlin.y.a;
            }
        };
        final int i2 = 1;
        RewardService.G = new kotlin.jvm.functions.l(this) { // from class: com.appsalt.internal.d
            public final /* synthetic */ h y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.l
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        Throwable th = (Throwable) obj;
                        h hVar = this.y;
                        hVar.stop();
                        hVar.e = th;
                        hVar.d.invoke(th);
                        break;
                    case 1:
                        Throwable th2 = (Throwable) obj;
                        h hVar2 = this.y;
                        hVar2.stop();
                        hVar2.e = th2;
                        hVar2.d.invoke(th2);
                        break;
                    default:
                        this.y.f = ((Boolean) obj).booleanValue();
                        break;
                }
                return kotlin.y.a;
            }
        };
        final int i3 = 2;
        RewardService.D = new kotlin.jvm.functions.l(this) { // from class: com.appsalt.internal.d
            public final /* synthetic */ h y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.l
            public final Object invoke(Object obj) {
                switch (i3) {
                    case 0:
                        Throwable th = (Throwable) obj;
                        h hVar = this.y;
                        hVar.stop();
                        hVar.e = th;
                        hVar.d.invoke(th);
                        break;
                    case 1:
                        Throwable th2 = (Throwable) obj;
                        h hVar2 = this.y;
                        hVar2.stop();
                        hVar2.e = th2;
                        hVar2.d.invoke(th2);
                        break;
                    default:
                        this.y.f = ((Boolean) obj).booleanValue();
                        break;
                }
                return kotlin.y.a;
            }
        };
    }

    @Override // com.appsalt.internal.z1
    public final boolean a() {
        return this.c.a();
    }

    @Override // com.appsalt.internal.z1
    public final void b(boolean z) {
        this.c.b(true);
    }

    public final void c(String str) {
        Context context = this.a;
        try {
            Intent intent = new Intent(str, null, context, RewardService.class);
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
        } catch (Exception e) {
            this.e = e;
            this.d.invoke(e);
        }
    }

    @Override // com.appsalt.internal.z1
    public final String getId() {
        return this.c.g;
    }

    @Override // com.appsalt.internal.u
    public final boolean isRunning() {
        return this.f;
    }

    @Override // com.appsalt.internal.u
    public final void optOut() {
        g gVar = this.c;
        gVar.b(false);
        gVar.stop();
        c("69e1d6f650d8eccb");
    }

    @Override // com.appsalt.internal.v2
    public final void requestConsent(int i, int i2, int i3, int i4, int i5) {
        this.c.requestConsent(i, i2, i3, i4, i5);
    }

    @Override // com.appsalt.internal.u
    public final void setOnError(kotlin.jvm.functions.l lVar) {
        this.d = lVar;
    }

    @Override // com.appsalt.internal.u
    public final void start(String str) {
        if (g4.b) {
            this.b.a(3, "startF: " + str);
        }
        if (!kotlin.text.k.d0(str)) {
            this.a.getSharedPreferences("fg-storage", 0).edit().putString("apiKey", str).apply();
        }
        if (this.f || this.e != null) {
            return;
        }
        this.f = true;
        c("03b4a0836ab48e6c");
    }

    @Override // com.appsalt.internal.u
    public final void stop() {
        this.f = false;
        if (RewardService.C) {
            c("69e1d6f650d8eccb");
        }
    }

    @Override // com.appsalt.internal.v2
    public final void requestConsent() {
        this.c.c(null);
    }
}
