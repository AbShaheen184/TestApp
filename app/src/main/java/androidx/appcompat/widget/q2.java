package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.app.mlounge.R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 {
    public final Object a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public final Object g;

    public q2(Context context, int i) {
        switch (i) {
            case 1:
                this.a = context.getApplicationContext();
                this.b = coil3.request.e.o;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = new coil3.h();
                break;
            default:
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                this.d = layoutParams;
                this.e = new Rect();
                this.f = new int[2];
                this.g = new int[2];
                this.a = context;
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
                this.b = viewInflate;
                this.c = (TextView) viewInflate.findViewById(R.id.message);
                layoutParams.setTitle(q2.class.getSimpleName());
                layoutParams.packageName = context.getPackageName();
                layoutParams.type = 1002;
                layoutParams.width = -2;
                layoutParams.height = -2;
                layoutParams.format = -3;
                layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
                layoutParams.flags = 24;
                break;
        }
    }

    public coil3.q a() {
        coil3.d dVar;
        Context context = (Context) this.a;
        coil3.request.e eVar = (coil3.request.e) this.b;
        coil3.h hVar = (coil3.h) this.g;
        hVar.getClass();
        coil3.request.e eVar2 = new coil3.request.e(eVar.a, eVar.b, eVar.c, eVar.d, eVar.e, eVar.f, eVar.g, eVar.h, eVar.i, eVar.j, eVar.k, eVar.l, eVar.m, new coil3.j(com.google.android.gms.dynamite.g.D(hVar.a)));
        kotlin.o oVar = new kotlin.o(new coil3.l(0));
        kotlin.o oVar2 = (kotlin.o) this.c;
        kotlin.o oVar3 = oVar2 == null ? new kotlin.o(new androidx.room.coroutines.d(this, 5)) : oVar2;
        kotlin.o oVar4 = (kotlin.o) this.d;
        kotlin.o oVar5 = oVar4 == null ? new kotlin.o(new coil3.l(1)) : oVar4;
        coil3.d dVar2 = (coil3.d) this.e;
        if (dVar2 == null) {
            kotlin.collections.u uVar = kotlin.collections.u.e;
            dVar = new coil3.d(uVar, uVar, uVar, uVar, uVar);
        } else {
            dVar = dVar2;
        }
        return new coil3.q(new coil3.o(context, eVar2, oVar, oVar3, oVar5, dVar, (androidx.media3.exoplayer.dash.manifest.t) this.f));
    }

    public q2(String str, com.google.firebase.crashlytics.internal.persistence.c cVar, com.google.firebase.crashlytics.internal.concurrency.d dVar) {
        this.d = new androidx.compose.foundation.lazy.layout.b1(this, false);
        this.e = new androidx.compose.foundation.lazy.layout.b1(this, true);
        androidx.compose.foundation.gestures.w0 w0Var = new androidx.compose.foundation.gestures.w0();
        w0Var.b = new ArrayList();
        w0Var.a = 128;
        this.f = w0Var;
        this.g = new AtomicMarkableReference(null, false);
        this.c = str;
        this.a = new com.google.firebase.crashlytics.internal.metadata.h(cVar);
        this.b = dVar;
    }
}
