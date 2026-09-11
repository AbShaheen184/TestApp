package okio.internal;

import com.google.android.gms.measurement.internal.c0;
import com.google.android.gms.measurement.internal.f0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.p;
import kotlin.o;
import okio.h0;
import okio.s;
import okio.t;
import okio.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends okio.k {
    public static final x C;
    public final okio.k A;
    public final o B;
    public final ClassLoader z;

    static {
        String str = x.y;
        C = f0.i("/");
    }

    public g(ClassLoader classLoader) {
        t tVar = okio.k.e;
        tVar.getClass();
        this.z = classLoader;
        this.A = tVar;
        this.B = new o(new androidx.room.coroutines.d(this, 28));
    }

    @Override // okio.k
    public final List X(x xVar) throws FileNotFoundException {
        x xVar2 = C;
        xVar2.getClass();
        String strU = c.b(xVar2, xVar, true).f(xVar2).e.u();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (kotlin.k kVar : (List) this.B.getValue()) {
            okio.k kVar2 = (okio.k) kVar.e;
            x xVar3 = (x) kVar.y;
            try {
                List listX = kVar2.X(xVar3.g(strU));
                ArrayList<x> arrayList = new ArrayList();
                for (Object obj : listX) {
                    if (c0.n((x) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(p.y(arrayList, 10));
                for (x xVar4 : arrayList) {
                    xVar4.getClass();
                    String strReplace = kotlin.text.k.j0(xVar4.e.u(), xVar3.e.u()).replace('\\', '/');
                    strReplace.getClass();
                    arrayList2.add(xVar2.g(strReplace));
                }
                kotlin.collections.o.C(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return kotlin.collections.o.k0(linkedHashSet);
        }
        net.luminis.tls.engine.impl.c.s(xVar, "file not found: ");
        return null;
    }

    @Override // okio.k
    public final androidx.constraintlayout.core.widgets.analyzer.e Z(x xVar) {
        xVar.getClass();
        if (!c0.n(xVar)) {
            return null;
        }
        x xVar2 = C;
        xVar2.getClass();
        String strU = c.b(xVar2, xVar, true).f(xVar2).e.u();
        for (kotlin.k kVar : (List) this.B.getValue()) {
            androidx.constraintlayout.core.widgets.analyzer.e eVarZ = ((okio.k) kVar.e).Z(((x) kVar.y).g(strU));
            if (eVarZ != null) {
                return eVarZ;
            }
        }
        return null;
    }

    @Override // okio.k
    public final okio.f0 a(x xVar) throws IOException {
        xVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // okio.k
    public final s a0(x xVar) throws FileNotFoundException {
        if (!c0.n(xVar)) {
            net.luminis.tls.engine.impl.c.s(xVar, "file not found: ");
            return null;
        }
        x xVar2 = C;
        xVar2.getClass();
        String strU = c.b(xVar2, xVar, true).f(xVar2).e.u();
        for (kotlin.k kVar : (List) this.B.getValue()) {
            try {
                return ((okio.k) kVar.e).a0(((x) kVar.y).g(strU));
            } catch (FileNotFoundException unused) {
            }
        }
        net.luminis.tls.engine.impl.c.s(xVar, "file not found: ");
        return null;
    }

    @Override // okio.k
    public final okio.f0 b0(x xVar, boolean z) throws IOException {
        xVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // okio.k
    public final h0 c0(x xVar) throws IOException {
        xVar.getClass();
        if (!c0.n(xVar)) {
            net.luminis.tls.engine.impl.c.s(xVar, "file not found: ");
            return null;
        }
        x xVar2 = C;
        xVar2.getClass();
        URL resource = this.z.getResource(c.b(xVar2, xVar, false).f(xVar2).e.u());
        if (resource == null) {
            net.luminis.tls.engine.impl.c.s(xVar, "file not found: ");
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        inputStream.getClass();
        return okio.b.e(inputStream);
    }

    @Override // okio.k
    public final void g(x xVar, x xVar2) throws IOException {
        xVar.getClass();
        xVar2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // okio.k
    public final void w(x xVar) throws IOException {
        xVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // okio.k
    public final void z(x xVar) throws IOException {
        xVar.getClass();
        throw new IOException(this + " is read-only");
    }
}
