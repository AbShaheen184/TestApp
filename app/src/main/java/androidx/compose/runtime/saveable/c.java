package androidx.compose.runtime.saveable;

import androidx.activity.w;
import androidx.appcompat.widget.c2;
import androidx.compose.runtime.snapshots.o;
import androidx.compose.runtime.z1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements z1 {
    public Object A;
    public Object[] B;
    public g C;
    public final w D = new w(this, 19);
    public l e;
    public h y;
    public String z;

    public c(l lVar, h hVar, String str, Object obj, Object[] objArr) {
        this.e = lVar;
        this.y = hVar;
        this.z = str;
        this.A = obj;
        this.B = objArr;
    }

    @Override // androidx.compose.runtime.z1
    public final void a() {
        g gVar = this.C;
        if (gVar != null) {
            ((c2) gVar).f0();
        }
    }

    @Override // androidx.compose.runtime.z1
    public final void b() {
        g gVar = this.C;
        if (gVar != null) {
            ((c2) gVar).f0();
        }
    }

    @Override // androidx.compose.runtime.z1
    public final void c() {
        d();
    }

    public final void d() {
        String strA;
        h hVar = this.y;
        if (this.C != null) {
            androidx.media3.exoplayer.hls.playlist.a.g(this.C, ") is not null", "entry(");
            return;
        }
        if (hVar != null) {
            w wVar = this.D;
            Object objInvoke = wVar.invoke();
            if (objInvoke == null || hVar.a(objInvoke)) {
                this.C = hVar.d(this.z, wVar);
                return;
            }
            if (objInvoke instanceof o) {
                o oVar = (o) objInvoke;
                if (oVar.a() == androidx.compose.runtime.f.A || oVar.a() == androidx.compose.runtime.f.D || oVar.a() == androidx.compose.runtime.f.B) {
                    strA = "MutableState containing " + oVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strA = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strA = n.a(objInvoke);
            }
            throw new IllegalArgumentException(strA);
        }
    }
}
