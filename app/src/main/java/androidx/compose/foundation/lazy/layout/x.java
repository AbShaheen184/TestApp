package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    public final androidx.compose.runtime.saveable.d a;
    public final androidx.compose.foundation.lazy.n b;
    public final androidx.collection.o0 c;

    public x(androidx.compose.runtime.saveable.d dVar, androidx.compose.foundation.lazy.n nVar) {
        this.a = dVar;
        this.b = nVar;
        long[] jArr = androidx.collection.w0.a;
        this.c = new androidx.collection.o0();
    }

    public final kotlin.jvm.functions.p a(int i, Object obj, Object obj2) {
        androidx.collection.o0 o0Var = this.c;
        w wVar = (w) o0Var.g(obj);
        if (wVar != null && wVar.c == i && kotlin.jvm.internal.l.a(wVar.b, obj2)) {
            androidx.compose.runtime.internal.f fVar = wVar.d;
            if (fVar != null) {
                return fVar;
            }
            androidx.compose.runtime.internal.f fVar2 = new androidx.compose.runtime.internal.f(818252804, true, new androidx.compose.foundation.contextmenu.f(2, wVar.e, wVar));
            wVar.d = fVar2;
            return fVar2;
        }
        w wVar2 = new w(this, i, obj, obj2);
        o0Var.m(obj, wVar2);
        androidx.compose.runtime.internal.f fVar3 = wVar2.d;
        if (fVar3 != null) {
            return fVar3;
        }
        androidx.compose.runtime.internal.f fVar4 = new androidx.compose.runtime.internal.f(818252804, true, new androidx.compose.foundation.contextmenu.f(2, this, wVar2));
        wVar2.d = fVar4;
        return fVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        w wVar = (w) this.c.g(obj);
        if (wVar != null) {
            return wVar.b;
        }
        y yVar = (y) this.b.invoke();
        int iE = yVar.e(obj);
        if (iE != -1) {
            return yVar.c(iE);
        }
        return null;
    }
}
