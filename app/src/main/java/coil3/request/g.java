package coil3.request;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final Context a;
    public final Object b;
    public final coil3.target.a c;
    public final Map d;
    public final okio.k e;
    public final kotlin.coroutines.i f;
    public final kotlin.coroutines.i g;
    public final kotlin.coroutines.i h;
    public final b i;
    public final b j;
    public final b k;
    public final kotlin.jvm.functions.l l;
    public final kotlin.jvm.functions.l m;
    public final kotlin.jvm.functions.l n;
    public final coil3.size.i o;
    public final coil3.size.g p;
    public final coil3.size.d q;
    public final coil3.j r;
    public final f s;
    public final e t;

    public g(Context context, Object obj, coil3.target.a aVar, Map map, okio.k kVar, kotlin.coroutines.i iVar, kotlin.coroutines.i iVar2, kotlin.coroutines.i iVar3, b bVar, b bVar2, b bVar3, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.l lVar3, coil3.size.i iVar4, coil3.size.g gVar, coil3.size.d dVar, coil3.j jVar, f fVar, e eVar) {
        this.a = context;
        this.b = obj;
        this.c = aVar;
        this.d = map;
        this.e = kVar;
        this.f = iVar;
        this.g = iVar2;
        this.h = iVar3;
        this.i = bVar;
        this.j = bVar2;
        this.k = bVar3;
        this.l = lVar;
        this.m = lVar2;
        this.n = lVar3;
        this.o = iVar4;
        this.p = gVar;
        this.q = dVar;
        this.r = jVar;
        this.s = fVar;
        this.t = eVar;
    }

    public static d a(g gVar) {
        Context context = gVar.a;
        gVar.getClass();
        return new d(gVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.l.a(this.a, gVar.a) && this.b.equals(gVar.b) && kotlin.jvm.internal.l.a(this.c, gVar.c) && this.d.equals(gVar.d) && kotlin.jvm.internal.l.a(this.e, gVar.e) && kotlin.jvm.internal.l.a(this.f, gVar.f) && kotlin.jvm.internal.l.a(this.g, gVar.g) && kotlin.jvm.internal.l.a(this.h, gVar.h) && this.i == gVar.i && this.j == gVar.j && this.k == gVar.k && kotlin.jvm.internal.l.a(this.l, gVar.l) && kotlin.jvm.internal.l.a(this.m, gVar.m) && kotlin.jvm.internal.l.a(this.n, gVar.n) && kotlin.jvm.internal.l.a(this.o, gVar.o) && this.p == gVar.p && this.q == gVar.q && this.r.equals(gVar.r) && this.s.equals(gVar.s) && kotlin.jvm.internal.l.a(this.t, gVar.t);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        coil3.target.a aVar = this.c;
        return this.t.hashCode() + ((this.s.hashCode() + ((this.r.a.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 29791)) * 961)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.a + ", data=" + this.b + ", target=" + this.c + ", listener=null, memoryCacheKey=null, memoryCacheKeyExtras=" + this.d + ", diskCacheKey=null, fileSystem=" + this.e + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.f + ", fetcherCoroutineContext=" + this.g + ", decoderCoroutineContext=" + this.h + ", memoryCachePolicy=" + this.i + ", diskCachePolicy=" + this.j + ", networkCachePolicy=" + this.k + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.l + ", errorFactory=" + this.m + ", fallbackFactory=" + this.n + ", sizeResolver=" + this.o + ", scale=" + this.p + ", precision=" + this.q + ", extras=" + this.r + ", defined=" + this.s + ", defaults=" + this.t + ")";
    }
}
