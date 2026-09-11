package com.app.mlounge;

import android.app.Application;
import android.content.Context;
import androidx.appcompat.widget.q2;
import androidx.media3.exoplayer.dash.manifest.t;
import coil3.s;
import coil3.w;
import com.app.mlounge.data.iptv.c0;
import java.util.ArrayList;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.x;
import okhttp3.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class CinemaHQApp extends Application implements s, dagger.hilt.internal.b {
    public static final /* synthetic */ int D = 0;
    public y A;
    public y B;
    public c0 z;
    public boolean e = false;
    public final dagger.hilt.android.internal.managers.g y = new dagger.hilt.android.internal.managers.g(new t(this, 15));
    public final CoroutineScope C = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));

    @Override // dagger.hilt.internal.b
    public final Object a() {
        return this.y.a();
    }

    @Override // coil3.s
    public final coil3.q b(Context context) {
        context.getClass();
        q2 q2Var = new q2(context, 1);
        t tVar = new t(14);
        tVar.y = coil3.util.h.y;
        q2Var.f = tVar;
        q2Var.c = new kotlin.o(new androidx.navigation.compose.p(context, 1));
        q2Var.d = new kotlin.o(new androidx.navigation.compose.p(context, 2));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new coil3.c(new coil3.svg.e(), 0));
        arrayList4.add(new androidx.activity.compose.f(20, new coil3.network.j(new androidx.room.coroutines.d(new androidx.room.coroutines.d(this, 10), 8)), a0.a(w.class)));
        q2Var.e = new coil3.d(com.google.android.gms.dynamite.g.C(arrayList), com.google.android.gms.dynamite.g.C(arrayList2), com.google.android.gms.dynamite.g.C(arrayList3), com.google.android.gms.dynamite.g.C(arrayList4), com.google.android.gms.dynamite.g.C(arrayList5));
        coil3.i iVar = coil3.request.h.a;
        coil3.i iVar2 = coil3.request.i.a;
        coil3.transition.b bVar = new coil3.transition.b(org.mozilla.javascript.Context.VERSION_ES6);
        coil3.h hVar = (coil3.h) q2Var.g;
        hVar.a.put(coil3.request.i.a, bVar);
        return q2Var.a();
    }

    public final void c() {
        if (!this.e) {
            this.e = true;
            h hVar = (h) ((c) this.y.a());
            this.z = (c0) hVar.m.get();
            this.A = (y) hVar.c.get();
            this.B = (y) hVar.n.get();
        }
        super.onCreate();
    }

    @Override // android.app.Application
    public final void onCreate() {
        c();
        int i = 0;
        kotlin.coroutines.d dVar = null;
        try {
            y yVar = this.A;
            if (yVar == null) {
                kotlin.jvm.internal.l.f("okHttpClient");
                throw null;
            }
            com.google.android.material.textfield.p.p(new com.app.mlounge.data.music.e(yVar, i));
            com.app.mlounge.util.c.d(this);
            com.i4studio.subslib.b bVar = com.i4studio.subslib.b.a;
            com.i4studio.subslib.subdl.a aVar = new com.i4studio.subslib.subdl.a();
            x xVar = new x();
            xVar.i = true;
            new y(xVar);
            com.i4studio.subslib.b.b.add(aVar);
            registerActivityLifecycleCallbacks(new a());
            BuildersKt__Builders_commonKt.launch$default(this.C, null, null, new b(this, dVar, i), 3, null);
        } catch (Exception e) {
            com.app.mlounge.util.a.b("CinemaHQApp", "NewPipe init failed", e);
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (i >= 60) {
            BuildersKt__Builders_commonKt.launch$default(this.C, null, null, new b(this, null, 1), 3, null);
        }
    }
}
