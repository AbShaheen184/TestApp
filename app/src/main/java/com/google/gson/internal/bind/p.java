package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends com.google.gson.stream.b {
    public static final o O = new o();
    public static final com.google.gson.l P = new com.google.gson.l("closed");
    public final ArrayList L;
    public String M;
    public com.google.gson.h N;

    public p() {
        super(O);
        this.L = new ArrayList();
        this.N = com.google.gson.j.e;
    }

    @Override // com.google.gson.stream.b
    public final void L() {
        ArrayList arrayList = this.L;
        if (arrayList.isEmpty() || this.M != null) {
            org.mozilla.javascript.c.a();
        } else if (k0() instanceof com.google.gson.k) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            org.mozilla.javascript.c.a();
        }
    }

    @Override // com.google.gson.stream.b
    public final void N(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.L.isEmpty() || this.M != null) {
            net.luminis.tls.engine.impl.c.r("Did not expect a name");
        } else if (k0() instanceof com.google.gson.k) {
            this.M = str;
        } else {
            net.luminis.tls.engine.impl.c.r("Please begin an object before writing a name.");
        }
    }

    @Override // com.google.gson.stream.b
    public final com.google.gson.stream.b Y() {
        l0(com.google.gson.j.e);
        return this;
    }

    @Override // com.google.gson.stream.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.L;
        if (arrayList.isEmpty()) {
            arrayList.add(P);
        } else {
            net.luminis.tls.engine.impl.c.t("Incomplete document");
        }
    }

    @Override // com.google.gson.stream.b
    public final void d0(double d) {
        if (this.E == 1 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            l0(new com.google.gson.l(Double.valueOf(d)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
    }

    @Override // com.google.gson.stream.b
    public final void e0(long j) {
        l0(new com.google.gson.l(Long.valueOf(j)));
    }

    @Override // com.google.gson.stream.b
    public final void f0(Boolean bool) {
        if (bool == null) {
            l0(com.google.gson.j.e);
        } else {
            l0(new com.google.gson.l(bool));
        }
    }

    @Override // com.google.gson.stream.b
    public final void g() {
        com.google.gson.g gVar = new com.google.gson.g();
        l0(gVar);
        this.L.add(gVar);
    }

    @Override // com.google.gson.stream.b
    public final void g0(Number number) {
        if (number == null) {
            l0(com.google.gson.j.e);
            return;
        }
        if (this.E != 1) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                com.google.gson.b.g(number, "JSON forbids NaN and infinities: ");
                return;
            }
        }
        l0(new com.google.gson.l(number));
    }

    @Override // com.google.gson.stream.b
    public final void h0(String str) {
        if (str == null) {
            l0(com.google.gson.j.e);
        } else {
            l0(new com.google.gson.l(str));
        }
    }

    @Override // com.google.gson.stream.b
    public final void i0(boolean z) {
        l0(new com.google.gson.l(Boolean.valueOf(z)));
    }

    public final com.google.gson.h k0() {
        return (com.google.gson.h) androidx.privacysandbox.ads.adservices.java.internal.a.j(1, this.L);
    }

    public final void l0(com.google.gson.h hVar) {
        if (this.M != null) {
            if (!(hVar instanceof com.google.gson.j) || this.H) {
                ((com.google.gson.k) k0()).i(this.M, hVar);
            }
            this.M = null;
            return;
        }
        if (this.L.isEmpty()) {
            this.N = hVar;
            return;
        }
        com.google.gson.h hVarK0 = k0();
        if (hVarK0 instanceof com.google.gson.g) {
            ((com.google.gson.g) hVarK0).e.add(hVar);
        } else {
            org.mozilla.javascript.c.a();
        }
    }

    @Override // com.google.gson.stream.b
    public final void m() {
        com.google.gson.k kVar = new com.google.gson.k();
        l0(kVar);
        this.L.add(kVar);
    }

    @Override // com.google.gson.stream.b
    public final void z() {
        ArrayList arrayList = this.L;
        if (arrayList.isEmpty() || this.M != null) {
            org.mozilla.javascript.c.a();
        } else if (k0() instanceof com.google.gson.g) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            org.mozilla.javascript.c.a();
        }
    }

    @Override // com.google.gson.stream.b, java.io.Flushable
    public final void flush() {
    }
}
