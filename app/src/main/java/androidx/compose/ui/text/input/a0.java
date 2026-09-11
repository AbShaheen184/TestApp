package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.c2;
import androidx.compose.foundation.text.z0;
import androidx.compose.ui.text.j0;
import androidx.compose.ui.text.l0;
import androidx.datastore.preferences.protobuf.h1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements s {
    public final View a;
    public final c2 b;
    public final b0 c;
    public boolean d;
    public kotlin.jvm.functions.l e;
    public kotlin.jvm.functions.l f;
    public x g;
    public k h;
    public final ArrayList i;
    public final Object j;
    public Rect k;
    public final c l;
    public final androidx.compose.runtime.collection.b m;
    public androidx.activity.l n;

    public a0(View view, androidx.compose.ui.platform.u uVar) {
        c2 c2Var = new c2(view);
        b0 b0Var = new b0(Choreographer.getInstance(), 0);
        this.a = view;
        this.b = c2Var;
        this.c = b0Var;
        this.e = b.B;
        this.f = b.C;
        this.g = new x(4, l0.b, "");
        this.h = k.g;
        this.i = new ArrayList();
        this.j = kotlin.a.c(kotlin.i.y, new androidx.compose.animation.z(this, 13));
        this.l = new c(uVar, c2Var);
        this.m = new androidx.compose.runtime.collection.b(new z[16]);
    }

    @Override // androidx.compose.ui.text.input.s
    public final void a(x xVar, k kVar, androidx.compose.animation.core.a aVar, androidx.compose.foundation.text.s sVar) {
        this.d = true;
        this.g = xVar;
        this.h = kVar;
        this.e = aVar;
        this.f = sVar;
        i(z.e);
    }

    @Override // androidx.compose.ui.text.input.s
    public final void b() {
        i(z.e);
    }

    @Override // androidx.compose.ui.text.input.s
    public final void c() {
        i(z.z);
    }

    @Override // androidx.compose.ui.text.input.s
    public final void d() {
        this.d = false;
        this.e = b.D;
        this.f = b.E;
        this.k = null;
        i(z.y);
    }

    @Override // androidx.compose.ui.text.input.s
    public final void e() {
        i(z.A);
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, kotlin.h] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, kotlin.h] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, kotlin.h] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.h] */
    @Override // androidx.compose.ui.text.input.s
    public final void f(x xVar, x xVar2) {
        boolean z = (l0.b(this.g.b, xVar2.b) && kotlin.jvm.internal.l.a(this.g.c, xVar2.c)) ? false : true;
        this.g = xVar2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            t tVar = (t) ((WeakReference) this.i.get(i)).get();
            if (tVar != null) {
                tVar.d = xVar2;
            }
        }
        c cVar = this.l;
        synchronized (cVar.c) {
            cVar.j = null;
            cVar.l = null;
            cVar.k = null;
            cVar.m = b.z;
            cVar.n = null;
            cVar.o = null;
        }
        if (kotlin.jvm.internal.l.a(xVar, xVar2)) {
            if (z) {
                c2 c2Var = this.b;
                int iF = l0.f(xVar2.b);
                int iE = l0.e(xVar2.b);
                l0 l0Var = this.g.c;
                int iF2 = l0Var != null ? l0.f(l0Var.a) : -1;
                l0 l0Var2 = this.g.c;
                ((InputMethodManager) c2Var.z.getValue()).updateSelection((View) c2Var.y, iF, iE, iF2, l0Var2 != null ? l0.e(l0Var2.a) : -1);
                return;
            }
            return;
        }
        if (xVar != null && (!kotlin.jvm.internal.l.a(xVar.a.y, xVar2.a.y) || (l0.b(xVar.b, xVar2.b) && !kotlin.jvm.internal.l.a(xVar.c, xVar2.c)))) {
            c2 c2Var2 = this.b;
            ((InputMethodManager) c2Var2.z.getValue()).restartInput((View) c2Var2.y);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            t tVar2 = (t) ((WeakReference) this.i.get(i2)).get();
            if (tVar2 != null) {
                x xVar3 = this.g;
                c2 c2Var3 = this.b;
                if (tVar2.h) {
                    tVar2.d = xVar3;
                    if (tVar2.f) {
                        ((InputMethodManager) c2Var3.z.getValue()).updateExtractedText((View) c2Var3.y, tVar2.e, h1.z(xVar3));
                    }
                    l0 l0Var3 = xVar3.c;
                    long j = xVar3.b;
                    int iF3 = l0Var3 != null ? l0.f(l0Var3.a) : -1;
                    l0 l0Var4 = xVar3.c;
                    ((InputMethodManager) c2Var3.z.getValue()).updateSelection((View) c2Var3.y, l0.f(j), l0.e(j), iF3, l0Var4 != null ? l0.e(l0Var4.a) : -1);
                }
            }
        }
    }

    @Override // androidx.compose.ui.text.input.s
    public final void g(x xVar, q qVar, j0 j0Var, z0 z0Var, androidx.compose.ui.geometry.c cVar, androidx.compose.ui.geometry.c cVar2) {
        c cVar3 = this.l;
        synchronized (cVar3.c) {
            try {
                cVar3.j = xVar;
                cVar3.l = qVar;
                cVar3.k = j0Var;
                cVar3.m = z0Var;
                cVar3.n = cVar;
                cVar3.o = cVar2;
                if (cVar3.e || cVar3.d) {
                    cVar3.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.ui.text.input.s
    public final void h(androidx.compose.ui.geometry.c cVar) {
        Rect rect;
        this.k = new Rect(kotlin.math.a.F(cVar.a), kotlin.math.a.F(cVar.b), kotlin.math.a.F(cVar.c), kotlin.math.a.F(cVar.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    public final void i(z zVar) {
        this.m.b(zVar);
        if (this.n == null) {
            androidx.activity.l lVar = new androidx.activity.l(this, 6);
            this.c.execute(lVar);
            this.n = lVar;
        }
    }
}
