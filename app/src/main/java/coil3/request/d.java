package coil3.request;

import android.content.Context;
import java.util.Map;
import kotlin.collections.v;
import kotlin.jvm.internal.c0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final Context a;
    public e b;
    public Object c;
    public coil3.target.a d;
    public final Map e;
    public kotlin.coroutines.i f;
    public kotlin.coroutines.i g;
    public kotlin.coroutines.i h;
    public final kotlin.jvm.functions.l i;
    public final kotlin.jvm.functions.l j;
    public final kotlin.jvm.functions.l k;
    public coil3.size.i l;
    public coil3.size.g m;
    public coil3.size.d n;
    public final coil3.j o;

    public d(g gVar, Context context) {
        this.a = context;
        this.b = gVar.t;
        this.c = gVar.b;
        this.d = gVar.c;
        this.e = gVar.d;
        f fVar = gVar.s;
        this.f = fVar.a;
        this.g = fVar.b;
        this.h = fVar.c;
        this.i = fVar.d;
        this.j = fVar.e;
        this.k = fVar.f;
        this.l = fVar.g;
        this.m = fVar.h;
        this.n = fVar.i;
        this.o = gVar.r;
    }

    public final g a() {
        Object obj = this.c;
        if (obj == null) {
            obj = l.a;
        }
        Object obj2 = obj;
        coil3.target.a aVar = this.d;
        Boolean bool = Boolean.FALSE;
        Map mapD = this.e;
        if (kotlin.jvm.internal.l.a(mapD, bool)) {
            mapD.getClass();
            mapD = com.google.android.gms.dynamite.g.D(c0.b(mapD));
        } else if (mapD == null) {
            throw new AssertionError();
        }
        Map map = mapD;
        map.getClass();
        e eVar = this.b;
        okio.k kVar = eVar.a;
        b bVar = eVar.e;
        b bVar2 = eVar.f;
        b bVar3 = eVar.g;
        kotlin.coroutines.i iVar = this.f;
        if (iVar == null) {
            iVar = eVar.b;
        }
        kotlin.coroutines.i iVar2 = iVar;
        kotlin.coroutines.i iVar3 = this.g;
        if (iVar3 == null) {
            iVar3 = eVar.c;
        }
        kotlin.coroutines.i iVar4 = iVar3;
        kotlin.coroutines.i iVar5 = this.h;
        if (iVar5 == null) {
            iVar5 = eVar.d;
        }
        kotlin.coroutines.i iVar6 = iVar5;
        kotlin.jvm.functions.l lVar = this.i;
        if (lVar == null) {
            lVar = eVar.h;
        }
        kotlin.jvm.functions.l lVar2 = lVar;
        kotlin.jvm.functions.l lVar3 = this.j;
        if (lVar3 == null) {
            lVar3 = eVar.i;
        }
        kotlin.jvm.functions.l lVar4 = lVar3;
        kotlin.jvm.functions.l lVar5 = this.k;
        if (lVar5 == null) {
            lVar5 = eVar.j;
        }
        kotlin.jvm.functions.l lVar6 = lVar5;
        coil3.size.i iVar7 = this.l;
        if (iVar7 == null) {
            iVar7 = eVar.k;
        }
        coil3.size.i iVar8 = iVar7;
        coil3.size.g gVar = this.m;
        if (gVar == null) {
            gVar = eVar.l;
        }
        coil3.size.g gVar2 = gVar;
        coil3.size.d dVar = this.n;
        if (dVar == null) {
            dVar = eVar.m;
        }
        coil3.size.d dVar2 = dVar;
        coil3.j jVar = this.o;
        if (jVar == null) {
            throw new AssertionError();
        }
        return new g(this.a, obj2, aVar, map, kVar, iVar2, iVar4, iVar6, bVar, bVar2, bVar3, lVar2, lVar4, lVar6, iVar8, gVar2, dVar2, jVar, new f(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n), this.b);
    }

    public d(Context context) {
        this.a = context;
        this.b = e.o;
        this.c = null;
        this.d = null;
        this.e = v.e;
        this.f = null;
        this.g = null;
        this.h = null;
        coil3.util.k kVar = coil3.util.k.e;
        this.i = kVar;
        this.j = kVar;
        this.k = kVar;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = coil3.j.b;
    }
}
