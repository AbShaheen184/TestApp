package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 implements Closeable {
    public static final i0 y;
    public h0 e;

    static {
        okio.i iVar = okio.i.A;
        iVar.getClass();
        okio.f fVar = new okio.f();
        fVar.m0(iVar);
        y = new i0(null, iVar.e.length, fVar);
    }

    public abstract okio.h P();

    public final InputStream a() {
        return P().V();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        okhttp3.internal.e.b(P());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final byte[] g() throws IOException {
        long jM = m();
        if (jM > 2147483647L) {
            net.luminis.tls.engine.impl.c.t(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("Cannot buffer entire body for content length: ", jM));
            return null;
        }
        okio.h hVarP = P();
        byte[] th = null;
        try {
            byte[] bArrN = hVarP.n();
            try {
                hVarP.close();
            } catch (Throwable th2) {
                th = th2;
            }
            th = th;
            th = bArrN;
        } catch (Throwable th3) {
            th = th3;
            if (hVarP != null) {
                try {
                    hVarP.close();
                } catch (Throwable th4) {
                    kotlin.a.a(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (jM == -1 || jM == length) {
            return th;
        }
        throw new IOException("Content-Length (" + jM + ") and stream length (" + length + ") disagree");
    }

    public abstract long m();

    public abstract u w();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final String z() {
        Charset charsetA;
        okio.h hVarP = P();
        String th = null;
        try {
            u uVarW = w();
            if (uVarW == null || (charsetA = u.a(uVarW)) == null) {
                charsetA = kotlin.text.a.a;
            }
            String strB = hVarP.B(okhttp3.internal.g.f(hVarP, charsetA));
            try {
                hVarP.close();
            } catch (Throwable th2) {
                th = th2;
            }
            th = th;
            th = strB;
        } catch (Throwable th3) {
            th = th3;
            if (hVarP != null) {
                try {
                    hVarP.close();
                } catch (Throwable th4) {
                    kotlin.a.a(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }
}
