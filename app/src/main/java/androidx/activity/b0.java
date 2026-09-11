package androidx.activity;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements androidx.lifecycle.t {
    public final /* synthetic */ int e = 0;
    public final Object y;
    public final Object z;

    public b0(androidx.lifecycle.u uVar) {
        this.y = uVar;
        androidx.lifecycle.d dVar = androidx.lifecycle.d.c;
        Class<?> cls = uVar.getClass();
        androidx.lifecycle.b bVar = (androidx.lifecycle.b) dVar.a.get(cls);
        this.z = bVar == null ? dVar.a(cls, null) : bVar;
    }

    @Override // androidx.lifecycle.t
    public final void g(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
        switch (this.e) {
            case 0:
                t tVar = (t) this.y;
                int i = a0.a[nVar.ordinal()];
                if (i == 1) {
                    tVar.g(true);
                    break;
                } else if (i == 2) {
                    tVar.g(false);
                    break;
                } else if (i == 3) {
                    tVar.e();
                    ((androidx.lifecycle.p) this.z).b(this);
                    break;
                }
                break;
            case 1:
                androidx.lifecycle.f fVar = (androidx.lifecycle.f) this.y;
                switch (androidx.lifecycle.g.a[nVar.ordinal()]) {
                    case 1:
                        fVar.getClass();
                        break;
                    case 2:
                        fVar.z(vVar);
                        break;
                    case 3:
                        fVar.a(vVar);
                        break;
                    case 4:
                        fVar.getClass();
                        break;
                    case 5:
                        fVar.m(vVar);
                        break;
                    case 6:
                        fVar.w(vVar);
                        break;
                    case 7:
                        net.luminis.tls.engine.impl.c.o("ON_ANY must not been send by anybody");
                        break;
                    default:
                        coil3.g.a();
                        break;
                }
                androidx.lifecycle.t tVar2 = (androidx.lifecycle.t) this.z;
                if (tVar2 != null) {
                    tVar2.g(vVar, nVar);
                }
                break;
            case 2:
                if (nVar == androidx.lifecycle.n.ON_START) {
                    ((androidx.lifecycle.p) this.z).b(this);
                    ((androidx.savedstate.e) this.y).d();
                }
                break;
            default:
                HashMap map = ((androidx.lifecycle.b) this.z).a;
                List list = (List) map.get(nVar);
                Object obj = this.y;
                androidx.lifecycle.b.a(list, vVar, nVar, obj);
                androidx.lifecycle.b.a((List) map.get(androidx.lifecycle.n.ON_ANY), vVar, nVar, obj);
                break;
        }
    }

    public b0(androidx.lifecycle.f fVar, androidx.lifecycle.t tVar) {
        fVar.getClass();
        this.y = fVar;
        this.z = tVar;
    }

    public b0(androidx.lifecycle.p pVar, androidx.savedstate.e eVar) {
        this.z = pVar;
        this.y = eVar;
    }

    public b0(t tVar, c0 c0Var, androidx.lifecycle.p pVar) {
        this.y = tVar;
        this.z = pVar;
    }
}
