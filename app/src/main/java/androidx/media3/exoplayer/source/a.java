package androidx.media3.exoplayer.source;

import android.os.Looper;
import androidx.appcompat.widget.c2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final androidx.media3.exoplayer.drm.d c;
    public final androidx.media3.exoplayer.drm.d d;
    public Looper e;
    public androidx.media3.common.v0 f;
    public androidx.media3.exoplayer.analytics.k g;

    public a() {
        int i = 0;
        v vVar = null;
        this.c = new androidx.media3.exoplayer.drm.d(new CopyOnWriteArrayList(), i, vVar);
        this.d = new androidx.media3.exoplayer.drm.d(new CopyOnWriteArrayList(), i, vVar);
    }

    public final androidx.media3.exoplayer.drm.d a(v vVar) {
        return new androidx.media3.exoplayer.drm.d(this.c.c, 0, vVar);
    }

    public abstract u b(v vVar, c2 c2Var, long j);

    public final void c(w wVar) {
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(wVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        d();
    }

    public final void e(w wVar) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(wVar);
        if (zIsEmpty) {
            f();
        }
    }

    public androidx.media3.common.v0 g() {
        return null;
    }

    public abstract androidx.media3.common.c0 h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(w wVar, androidx.media3.exoplayer.upstream.f fVar, androidx.media3.exoplayer.analytics.k kVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        com.google.android.material.motion.a.f(looper == null || looper == looperMyLooper);
        this.g = kVar;
        androidx.media3.common.v0 v0Var = this.f;
        this.a.add(wVar);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(wVar);
            l(fVar);
        } else if (v0Var != null) {
            e(wVar);
            wVar.a(this, v0Var);
        }
    }

    public abstract void l(androidx.media3.exoplayer.upstream.f fVar);

    public final void m(androidx.media3.common.v0 v0Var) {
        this.f = v0Var;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((w) it.next()).a(this, v0Var);
        }
    }

    public abstract void n(u uVar);

    public final void o(w wVar) {
        ArrayList arrayList = this.a;
        arrayList.remove(wVar);
        if (!arrayList.isEmpty()) {
            c(wVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        p();
    }

    public abstract void p();

    public final void q(androidx.media3.exoplayer.drm.e eVar) {
        CopyOnWriteArrayList<androidx.media3.exoplayer.drm.c> copyOnWriteArrayList = this.d.c;
        for (androidx.media3.exoplayer.drm.c cVar : copyOnWriteArrayList) {
            if (cVar.a == eVar) {
                copyOnWriteArrayList.remove(cVar);
            }
        }
    }

    public final void r(c0 c0Var) {
        CopyOnWriteArrayList<b0> copyOnWriteArrayList = this.c.c;
        for (b0 b0Var : copyOnWriteArrayList) {
            if (b0Var.b == c0Var) {
                copyOnWriteArrayList.remove(b0Var);
            }
        }
    }

    public void d() {
    }

    public void f() {
    }

    public void s(androidx.media3.common.c0 c0Var) {
    }
}
