package androidx.concurrent.futures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.math.a {
    @Override // kotlin.math.a
    public final void B(g gVar, g gVar2) {
        gVar.b = gVar2;
    }

    @Override // kotlin.math.a
    public final void C(g gVar, Thread thread) {
        gVar.a = thread;
    }

    @Override // kotlin.math.a
    public final boolean m(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.y != dVar) {
                    return false;
                }
                hVar.y = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlin.math.a
    public final boolean n(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.e != obj) {
                    return false;
                }
                hVar.e = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlin.math.a
    public final boolean o(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.z != gVar) {
                    return false;
                }
                hVar.z = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
