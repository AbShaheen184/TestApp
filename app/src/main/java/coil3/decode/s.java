package coil3.decode;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements q {
    public boolean A;
    public final okio.h B;
    public final okio.k e;
    public final org.jsoup.helper.n y;
    public final Object z = new Object();

    public s(okio.h hVar, okio.k kVar, org.jsoup.helper.n nVar) {
        this.e = kVar;
        this.y = nVar;
        this.B = hVar;
    }

    @Override // coil3.decode.q
    public final okio.x I() {
        synchronized (this.z) {
            if (this.A) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // coil3.decode.q
    public final okio.h P() {
        okio.h hVar;
        synchronized (this.z) {
            try {
                if (this.A) {
                    throw new IllegalStateException("closed");
                }
                hVar = this.B;
                if (hVar == null) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.z) {
            this.A = true;
            okio.h hVar = this.B;
            if (hVar != null) {
                try {
                    hVar.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // coil3.decode.q
    public final okio.k getFileSystem() {
        return this.e;
    }

    @Override // coil3.decode.q
    public final org.jsoup.helper.n q() {
        return this.y;
    }
}
