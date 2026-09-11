package coil3.request;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final kotlin.coroutines.i a;
    public final kotlin.coroutines.i b;
    public final kotlin.coroutines.i c;
    public final kotlin.jvm.functions.l d;
    public final kotlin.jvm.functions.l e;
    public final kotlin.jvm.functions.l f;
    public final coil3.size.i g;
    public final coil3.size.g h;
    public final coil3.size.d i;

    public f(kotlin.coroutines.i iVar, kotlin.coroutines.i iVar2, kotlin.coroutines.i iVar3, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.l lVar3, coil3.size.i iVar4, coil3.size.g gVar, coil3.size.d dVar) {
        this.a = iVar;
        this.b = iVar2;
        this.c = iVar3;
        this.d = lVar;
        this.e = lVar2;
        this.f = lVar3;
        this.g = iVar4;
        this.h = gVar;
        this.i = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.l.a(this.a, fVar.a) && kotlin.jvm.internal.l.a(this.b, fVar.b) && kotlin.jvm.internal.l.a(this.c, fVar.c) && kotlin.jvm.internal.l.a(this.d, fVar.d) && kotlin.jvm.internal.l.a(this.e, fVar.e) && kotlin.jvm.internal.l.a(this.f, fVar.f) && kotlin.jvm.internal.l.a(this.g, fVar.g) && this.h == fVar.h && this.i == fVar.i;
    }

    public final int hashCode() {
        kotlin.coroutines.i iVar = this.a;
        int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        kotlin.coroutines.i iVar2 = this.b;
        int iHashCode2 = (iHashCode + (iVar2 == null ? 0 : iVar2.hashCode())) * 31;
        kotlin.coroutines.i iVar3 = this.c;
        int iHashCode3 = (iHashCode2 + (iVar3 == null ? 0 : iVar3.hashCode())) * 923521;
        kotlin.jvm.functions.l lVar = this.d;
        int iHashCode4 = (iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        kotlin.jvm.functions.l lVar2 = this.e;
        int iHashCode5 = (iHashCode4 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        kotlin.jvm.functions.l lVar3 = this.f;
        int iHashCode6 = (iHashCode5 + (lVar3 == null ? 0 : lVar3.hashCode())) * 31;
        coil3.size.i iVar4 = this.g;
        int iHashCode7 = (iHashCode6 + (iVar4 == null ? 0 : iVar4.hashCode())) * 31;
        coil3.size.g gVar = this.h;
        int iHashCode8 = (iHashCode7 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        coil3.size.d dVar = this.i;
        return iHashCode8 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.a + ", fetcherCoroutineContext=" + this.b + ", decoderCoroutineContext=" + this.c + ", memoryCachePolicy=null, diskCachePolicy=null, networkCachePolicy=null, placeholderFactory=" + this.d + ", errorFactory=" + this.e + ", fallbackFactory=" + this.f + ", sizeResolver=" + this.g + ", scale=" + this.h + ", precision=" + this.i + ")";
    }
}
