package kotlinx.serialization.internal;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements kotlinx.serialization.a {
    @Override // kotlinx.serialization.a
    public Object a(kotlinx.serialization.encoding.b bVar) {
        return i(bVar);
    }

    public abstract Object e();

    public abstract int f(Object obj);

    public abstract Iterator g(Object obj);

    public abstract int h(Object obj);

    public final Object i(kotlinx.serialization.encoding.b bVar) {
        Object objE = e();
        int iF = f(objE);
        kotlinx.serialization.encoding.a aVarN = bVar.n(d());
        while (true) {
            int iS = aVarN.s(d());
            if (iS == -1) {
                aVarN.h(d());
                return l(objE);
            }
            j(aVarN, iS + iF, objE);
        }
    }

    public abstract void j(kotlinx.serialization.encoding.a aVar, int i, Object obj);

    public abstract Object k(Object obj);

    public abstract Object l(Object obj);
}
