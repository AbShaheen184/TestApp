package okio;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements Closeable {
    public static final t e;
    public static final x y;

    static {
        t tVar;
        try {
            Class.forName("j$.nio.file.Files");
            tVar = new u();
        } catch (ClassNotFoundException unused) {
            tVar = new t();
        }
        e = tVar;
        String str = x.y;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        y = com.google.android.gms.measurement.internal.f0.i(property);
        ClassLoader classLoader = okio.internal.g.class.getClassLoader();
        classLoader.getClass();
        new okio.internal.g(classLoader);
    }

    public final void L(x xVar) {
        xVar.getClass();
        z(xVar);
    }

    public final boolean N(x xVar) {
        xVar.getClass();
        return Z(xVar) != null;
    }

    public abstract List X(x xVar);

    public final androidx.constraintlayout.core.widgets.analyzer.e Y(x xVar) throws FileNotFoundException {
        xVar.getClass();
        androidx.constraintlayout.core.widgets.analyzer.e eVarZ = Z(xVar);
        if (eVarZ != null) {
            return eVarZ;
        }
        net.luminis.tls.engine.impl.c.s(xVar, "no such file: ");
        return null;
    }

    public abstract androidx.constraintlayout.core.widgets.analyzer.e Z(x xVar);

    public abstract f0 a(x xVar);

    public abstract s a0(x xVar);

    public abstract f0 b0(x xVar, boolean z);

    public abstract h0 c0(x xVar);

    public abstract void g(x xVar, x xVar2);

    public final void m(x xVar) {
        kotlin.collections.k kVar = new kotlin.collections.k();
        while (xVar != null && !N(xVar)) {
            kVar.addFirst(xVar);
            xVar = xVar.e();
        }
        Iterator<E> it = kVar.iterator();
        while (it.hasNext()) {
            w((x) it.next());
        }
    }

    public abstract void w(x xVar);

    public abstract void z(x xVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
