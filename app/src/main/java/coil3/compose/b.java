package coil3.compose;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b a = new b();

    public final boolean a(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof coil3.request.g) || !(obj2 instanceof coil3.request.g)) {
            return kotlin.jvm.internal.l.a(obj, obj2);
        }
        coil3.request.g gVar = (coil3.request.g) obj;
        coil3.request.g gVar2 = (coil3.request.g) obj2;
        return kotlin.jvm.internal.l.a(gVar.a, gVar2.a) && gVar.b.equals(gVar2.b) && gVar.d.equals(gVar2.d) && kotlin.jvm.internal.l.a(gVar.o, gVar2.o) && gVar.p == gVar2.p && gVar.q == gVar2.q;
    }

    public final int b(Object obj) {
        if (!(obj instanceof coil3.request.g)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        coil3.request.g gVar = (coil3.request.g) obj;
        return gVar.q.hashCode() + ((gVar.p.hashCode() + ((gVar.o.hashCode() + ((gVar.d.hashCode() + ((gVar.b.hashCode() + (gVar.a.hashCode() * 31)) * 961)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}
