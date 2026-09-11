package androidx.media3.exoplayer.source;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements c0, androidx.media3.exoplayer.drm.e {
    public final /* synthetic */ h A;
    public final Object e;
    public androidx.media3.exoplayer.drm.d y;
    public androidx.media3.exoplayer.drm.d z;

    public f(h hVar, Object obj) {
        this.A = hVar;
        this.y = hVar.a(null);
        this.z = new androidx.media3.exoplayer.drm.d(hVar.d.c, 0, null);
        this.e = obj;
    }

    @Override // androidx.media3.exoplayer.source.c0
    public final void C(int i, v vVar, n nVar, s sVar, IOException iOException, boolean z) {
        if (a(i, vVar)) {
            androidx.media3.exoplayer.drm.d dVar = this.y;
            s sVarB = b(sVar, vVar);
            dVar.getClass();
            dVar.a(new z(dVar, nVar, sVarB, iOException, z));
        }
    }

    @Override // androidx.media3.exoplayer.source.c0
    public final void F(int i, v vVar, n nVar, s sVar) {
        if (a(i, vVar)) {
            androidx.media3.exoplayer.drm.d dVar = this.y;
            s sVarB = b(sVar, vVar);
            dVar.getClass();
            dVar.a(new y(dVar, nVar, sVarB, 1));
        }
    }

    public final boolean a(int i, v vVar) {
        v vVarT;
        Object obj = this.e;
        h hVar = this.A;
        if (vVar != null) {
            vVarT = hVar.t(obj, vVar);
            if (vVarT == null) {
                return false;
            }
        } else {
            vVarT = null;
        }
        int iV = hVar.v(i, obj);
        androidx.media3.exoplayer.drm.d dVar = this.y;
        if (dVar.a != iV || !Objects.equals(dVar.b, vVarT)) {
            this.y = new androidx.media3.exoplayer.drm.d(hVar.c.c, iV, vVarT);
        }
        androidx.media3.exoplayer.drm.d dVar2 = this.z;
        if (dVar2.a == iV && Objects.equals(dVar2.b, vVarT)) {
            return true;
        }
        this.z = new androidx.media3.exoplayer.drm.d(hVar.d.c, iV, vVarT);
        return true;
    }

    public final s b(s sVar, v vVar) {
        long j = sVar.f;
        h hVar = this.A;
        Object obj = this.e;
        long jU = hVar.u(j, obj);
        long j2 = sVar.g;
        long jU2 = hVar.u(j2, obj);
        return (jU == j && jU2 == j2) ? sVar : new s(sVar.a, sVar.b, sVar.c, sVar.d, sVar.e, jU, jU2);
    }

    @Override // androidx.media3.exoplayer.source.c0
    public final void f(int i, v vVar, s sVar) {
        if (a(i, vVar)) {
            androidx.media3.exoplayer.drm.d dVar = this.y;
            s sVarB = b(sVar, vVar);
            v vVar2 = dVar.b;
            vVar2.getClass();
            dVar.a(new a0(0, dVar, vVar2, sVarB));
        }
    }

    @Override // androidx.media3.exoplayer.source.c0
    public final void j(int i, v vVar, n nVar, s sVar) {
        if (a(i, vVar)) {
            androidx.media3.exoplayer.drm.d dVar = this.y;
            s sVarB = b(sVar, vVar);
            dVar.getClass();
            dVar.a(new y(dVar, nVar, sVarB, 0));
        }
    }

    @Override // androidx.media3.exoplayer.source.c0
    public final void k(int i, v vVar, s sVar) {
        if (a(i, vVar)) {
            androidx.media3.exoplayer.drm.d dVar = this.y;
            s sVarB = b(sVar, vVar);
            dVar.getClass();
            dVar.a(new androidx.media3.exoplayer.analytics.c(3, dVar, sVarB));
        }
    }

    @Override // androidx.media3.exoplayer.source.c0
    public final void z(int i, v vVar, n nVar, s sVar, int i2) {
        if (a(i, vVar)) {
            androidx.media3.exoplayer.drm.d dVar = this.y;
            s sVarB = b(sVar, vVar);
            dVar.getClass();
            dVar.a(new x(dVar, nVar, sVarB, i2));
        }
    }
}
