package androidx.media3.exoplayer.source;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends a {
    public final HashMap h = new HashMap();
    public Handler i;
    public androidx.media3.exoplayer.upstream.f j;

    @Override // androidx.media3.exoplayer.source.a
    public final void d() {
        for (g gVar : this.h.values()) {
            gVar.a.c(gVar.b);
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void f() {
        for (g gVar : this.h.values()) {
            gVar.a.e(gVar.b);
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    public void j() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((g) it.next()).a.j();
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    public void p() {
        HashMap map = this.h;
        for (g gVar : map.values()) {
            a aVar = gVar.a;
            f fVar = gVar.c;
            aVar.o(gVar.b);
            aVar.r(fVar);
            aVar.q(fVar);
        }
        map.clear();
    }

    public abstract v t(Object obj, v vVar);

    public abstract void w(Object obj, a aVar, androidx.media3.common.v0 v0Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.media3.exoplayer.source.e, androidx.media3.exoplayer.source.w] */
    public final void x(final Integer num, a aVar) {
        HashMap map = this.h;
        com.google.android.material.motion.a.f(!map.containsKey(num));
        ?? r1 = new w() { // from class: androidx.media3.exoplayer.source.e
            @Override // androidx.media3.exoplayer.source.w
            public final void a(a aVar2, androidx.media3.common.v0 v0Var) {
                this.a.w(num, aVar2, v0Var);
            }
        };
        f fVar = new f(this, num);
        map.put(num, new g(aVar, r1, fVar));
        Handler handler = this.i;
        handler.getClass();
        aVar.getClass();
        androidx.media3.exoplayer.drm.d dVar = aVar.c;
        dVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = dVar.c;
        b0 b0Var = new b0();
        b0Var.a = handler;
        b0Var.b = fVar;
        copyOnWriteArrayList.add(b0Var);
        this.i.getClass();
        androidx.media3.exoplayer.drm.d dVar2 = aVar.d;
        dVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = dVar2.c;
        androidx.media3.exoplayer.drm.c cVar = new androidx.media3.exoplayer.drm.c();
        cVar.a = fVar;
        copyOnWriteArrayList2.add(cVar);
        androidx.media3.exoplayer.upstream.f fVar2 = this.j;
        androidx.media3.exoplayer.analytics.k kVar = this.g;
        kVar.getClass();
        aVar.k(r1, fVar2, kVar);
        if (this.b.isEmpty()) {
            aVar.c(r1);
        }
    }

    public long u(long j, Object obj) {
        return j;
    }

    public int v(int i, Object obj) {
        return i;
    }
}
