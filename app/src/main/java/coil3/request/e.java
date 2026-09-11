package coil3.request;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okio.t;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final e o;
    public final okio.k a;
    public final kotlin.coroutines.i b;
    public final kotlin.coroutines.i c;
    public final kotlin.coroutines.i d;
    public final b e;
    public final b f;
    public final b g;
    public final kotlin.jvm.functions.l h;
    public final kotlin.jvm.functions.l i;
    public final kotlin.jvm.functions.l j;
    public final coil3.size.i k;
    public final coil3.size.g l;
    public final coil3.size.d m;
    public final coil3.j n;

    static {
        t tVar = okio.k.e;
        CoroutineDispatcher io2 = Dispatchers.getIO();
        CoroutineDispatcher io3 = Dispatchers.getIO();
        coil3.size.e eVar = coil3.size.i.a;
        coil3.size.d dVar = coil3.size.d.e;
        coil3.j jVar = coil3.j.b;
        kotlin.coroutines.j jVar2 = kotlin.coroutines.j.e;
        b bVar = b.ENABLED;
        coil3.util.k kVar = coil3.util.k.e;
        o = new e(tVar, jVar2, io2, io3, bVar, bVar, bVar, kVar, kVar, kVar, eVar, coil3.size.g.y, dVar, jVar);
    }

    public e(okio.k kVar, kotlin.coroutines.i iVar, kotlin.coroutines.i iVar2, kotlin.coroutines.i iVar3, b bVar, b bVar2, b bVar3, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.l lVar3, coil3.size.i iVar4, coil3.size.g gVar, coil3.size.d dVar, coil3.j jVar) {
        this.a = kVar;
        this.b = iVar;
        this.c = iVar2;
        this.d = iVar3;
        this.e = bVar;
        this.f = bVar2;
        this.g = bVar3;
        this.h = lVar;
        this.i = lVar2;
        this.j = lVar3;
        this.k = iVar4;
        this.l = gVar;
        this.m = dVar;
        this.n = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.l.a(this.a, eVar.a) && kotlin.jvm.internal.l.a(this.b, eVar.b) && kotlin.jvm.internal.l.a(this.c, eVar.c) && kotlin.jvm.internal.l.a(this.d, eVar.d) && this.e == eVar.e && this.f == eVar.f && this.g == eVar.g && kotlin.jvm.internal.l.a(this.h, eVar.h) && kotlin.jvm.internal.l.a(this.i, eVar.i) && kotlin.jvm.internal.l.a(this.j, eVar.j) && kotlin.jvm.internal.l.a(this.k, eVar.k) && this.l == eVar.l && this.m == eVar.m && kotlin.jvm.internal.l.a(this.n, eVar.n);
    }

    public final int hashCode() {
        return this.n.a.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ", extras=" + this.n + ")";
    }
}
