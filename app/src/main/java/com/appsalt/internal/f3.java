package com.appsalt.internal;

import android.content.Context;
import java.util.Map;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 implements u, v2 {
    public final g4 a;
    public final androidx.compose.runtime.internal.c b;
    public final j0 c;
    public final androidx.media3.exoplayer.dash.manifest.t d;
    public kotlin.jvm.functions.l e;
    public boolean f;

    public f3(Context context) {
        g4 g4Var = new g4(1);
        this.a = g4Var;
        androidx.compose.runtime.internal.c cVar = new androidx.compose.runtime.internal.c(g4Var);
        this.b = cVar;
        z zVar = new z(context, 0);
        j0 j0Var = new j0();
        j0Var.a = zVar;
        g gVar = new g(context, g4Var);
        g0 g0Var = g0.e;
        kotlin.k kVar = new kotlin.k(g0Var, gVar);
        h hVar = new h(context, g4Var);
        g0 g0Var2 = g0.y;
        Map mapV = kotlin.collections.a0.v(kVar, new kotlin.k(g0Var2, hVar));
        j0Var.b = mapV;
        j0Var.c = g0Var;
        j0Var.d = new androidx.media3.exoplayer.dash.manifest.t(context);
        androidx.media3.exoplayer.mediacodec.g gVar2 = new androidx.media3.exoplayer.mediacodec.g(context, false);
        j0Var.e = gVar2;
        j0Var.f = new com.app.mlounge.ui.screens.player.j0(13);
        if (zVar.a.getBoolean("isBackground", false) && gVar2.a()) {
            g0Var = g0Var2;
        }
        j0Var.c = g0Var;
        ((z1) mapV.get(g0Var)).setOnError(new androidx.compose.ui.text.font.e(j0Var, 16));
        j0Var.h = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        this.c = j0Var;
        this.d = new androidx.media3.exoplayer.dash.manifest.t(context);
        this.e = new com.app.mlounge.ui.screens.player.j0(13);
        j0Var.f = new androidx.compose.ui.text.font.e(this, 17);
        if (cVar.h()) {
            return;
        }
        this.e.invoke(new androidx.compose.runtime.snapshots.g("Project missing dependencies", 3));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.appsalt.internal.u
    public final boolean isRunning() {
        j0 j0Var = this.c;
        return ((z1) j0Var.b.get((g0) j0Var.c)).isRunning();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.appsalt.internal.u
    public final void optOut() {
        if (g4.b) {
            this.a.a(3, "optOut");
        }
        j0 j0Var = this.c;
        ((z1) j0Var.b.get((g0) j0Var.c)).optOut();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.appsalt.internal.v2
    public final void requestConsent(int i, int i2, int i3, int i4, int i5) {
        if (g4.b) {
            this.a.a(3, "requestConsent custom theme");
        }
        j0 j0Var = this.c;
        ((z1) j0Var.b.get((g0) j0Var.c)).requestConsent(i, i2, i3, i4, i5);
    }

    @Override // com.appsalt.internal.u
    public final void setOnError(kotlin.jvm.functions.l lVar) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    @Override // com.appsalt.internal.u
    public final void start(String str) {
        boolean z = g4.b;
        g4 g4Var = this.a;
        if (z) {
            g4Var.a(3, "start: " + str);
        }
        if (!this.b.h()) {
            this.e.invoke(new androidx.compose.runtime.snapshots.g("Project missing dependencies", 3));
            return;
        }
        if (kotlin.text.k.d0(str) || str.equals("null")) {
            if (g4.b) {
                g4Var.a(1, "invalid API key: ".concat(str));
            }
        } else {
            this.d.E(str);
            j0 j0Var = this.c;
            ((z1) j0Var.b.get((g0) j0Var.c)).start(str);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.appsalt.internal.u
    public final void stop() {
        if (g4.b) {
            this.a.a(3, "stop");
        }
        j0 j0Var = this.c;
        ((z1) j0Var.b.get((g0) j0Var.c)).stop();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.appsalt.internal.v2
    public final void requestConsent() {
        if (g4.b) {
            this.a.a(3, "requestConsent");
        }
        j0 j0Var = this.c;
        ((z1) j0Var.b.get((g0) j0Var.c)).requestConsent();
    }
}
