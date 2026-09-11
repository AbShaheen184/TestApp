package coil3;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final Context a;
    public final coil3.request.e b;
    public final kotlin.o c;
    public final kotlin.o d;
    public final kotlin.o e;
    public final d f;
    public final androidx.media3.exoplayer.dash.manifest.t g;

    public o(Context context, coil3.request.e eVar, kotlin.o oVar, kotlin.o oVar2, kotlin.o oVar3, d dVar, androidx.media3.exoplayer.dash.manifest.t tVar) {
        this.a = context;
        this.b = eVar;
        this.c = oVar;
        this.d = oVar2;
        this.e = oVar3;
        this.f = dVar;
        this.g = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!kotlin.jvm.internal.l.a(this.a, oVar.a) || !this.b.equals(oVar.b) || !this.c.equals(oVar.c) || !this.d.equals(oVar.d) || !this.e.equals(oVar.e)) {
            return false;
        }
        Object obj2 = g.a;
        return obj2.equals(obj2) && this.f.equals(oVar.f) && kotlin.jvm.internal.l.a(this.g, oVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((g.a.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        androidx.media3.exoplayer.dash.manifest.t tVar = this.g;
        return iHashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    public final String toString() {
        return "Options(application=" + this.a + ", defaults=" + this.b + ", mainCoroutineContextLazy=" + this.c + ", memoryCacheLazy=" + this.d + ", diskCacheLazy=" + this.e + ", eventListenerFactory=" + g.a + ", componentRegistry=" + this.f + ", logger=" + this.g + ")";
    }
}
