package androidx.navigation;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public final Context a;
    public final androidx.navigation.internal.f b;
    public final androidx.media3.exoplayer.mediacodec.g c;
    public final Activity d;
    public boolean e;
    public final androidx.activity.d0 f;
    public final boolean g;

    public y(Context context) {
        context.getClass();
        this.a = context;
        this.b = new androidx.navigation.internal.f(this, new k(this, 0));
        this.c = new androidx.media3.exoplayer.mediacodec.g(context, false);
        for (Object obj : kotlin.sequences.k.o(context, new androidx.compose.ui.text.y(15))) {
            if (((Context) obj) instanceof Activity) {
                this.d = (Activity) obj;
                this.f = new androidx.activity.d0(this, 3);
                this.g = true;
                l0 l0Var = this.b.t;
                l0Var.a(new x(l0Var));
                this.b.t.a(new b(this.a));
                new kotlin.o(new k(this, 1));
            }
        }
        obj = null;
        this.d = (Activity) obj;
        this.f = new androidx.activity.d0(this, 3);
        this.g = true;
        l0 l0Var2 = this.b.t;
        l0Var2.a(new x(l0Var2));
        this.b.t.a(new b(this.a));
        new kotlin.o(new k(this, 1));
    }

    public static void b(y yVar, String str) {
        yVar.getClass();
        yVar.b.m(str, null);
    }

    public final void a(String str, kotlin.jvm.functions.l lVar) {
        str.getClass();
        androidx.navigation.internal.f fVar = this.b;
        fVar.getClass();
        fVar.m(str, f.g(lVar));
    }

    public final void c() {
        androidx.navigation.internal.f fVar = this.b;
        if (fVar.f.isEmpty()) {
            return;
        }
        t tVarG = fVar.g();
        tVarG.getClass();
        if (fVar.n(tVarG.y.a, true, false)) {
            fVar.b();
        }
    }
}
