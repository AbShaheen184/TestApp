package okio;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends k {
    public static final x C;
    public final k A;
    public final LinkedHashMap B;
    public final x z;

    static {
        String str = x.y;
        C = com.google.android.gms.measurement.internal.f0.i("/");
    }

    public k0(x xVar, k kVar, LinkedHashMap linkedHashMap) {
        kVar.getClass();
        this.z = xVar;
        this.A = kVar;
        this.B = linkedHashMap;
    }

    @Override // okio.k
    public final List X(x xVar) throws IOException {
        x xVar2 = C;
        xVar2.getClass();
        okio.internal.i iVar = (okio.internal.i) this.B.get(okio.internal.c.b(xVar2, xVar, true));
        if (iVar != null) {
            return kotlin.collections.o.k0(iVar.q);
        }
        net.luminis.tls.engine.impl.c.u(xVar, "not a directory: ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0119  */
    /* JADX WARN: Code duplicated, block: B:66:0x0127  */
    /* JADX WARN: Code duplicated, block: B:68:0x012b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0136  */
    @Override // okio.k
    public final androidx.constraintlayout.core.widgets.analyzer.e Z(x xVar) throws Throwable {
        Long lValueOf;
        long j;
        Long l;
        Long lValueOf2;
        Long l2;
        Integer num;
        Long l3;
        Long lValueOf3;
        Throwable th;
        Throwable th2;
        okio.internal.i iVarH;
        xVar.getClass();
        x xVar2 = C;
        xVar2.getClass();
        okio.internal.i iVar = (okio.internal.i) this.B.get(okio.internal.c.b(xVar2, xVar, true));
        if (iVar == null) {
            return null;
        }
        long j2 = iVar.h;
        if (j2 != -1) {
            s sVarA0 = this.A.a0(this.z);
            try {
                b0 b0Var = new b0(sVarA0.a(j2));
                try {
                    iVarH = okio.internal.b.h(b0Var, iVar);
                    iVarH.getClass();
                    try {
                        b0Var.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        b0Var.close();
                    } catch (Throwable th5) {
                        kotlin.a.a(th4, th5);
                    }
                    th2 = th4;
                    iVarH = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                try {
                    sVarA0.close();
                    th = null;
                } catch (Throwable th6) {
                    th = th6;
                }
                okio.internal.i iVar2 = iVarH;
                th = th;
                iVar = iVar2;
            } catch (Throwable th7) {
                th = th7;
                if (sVarA0 != null) {
                    try {
                        sVarA0.close();
                    } catch (Throwable th8) {
                        kotlin.a.a(th, th8);
                    }
                }
                iVar = null;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z = iVar.b;
        boolean z2 = !z;
        Long lValueOf4 = z ? null : Long.valueOf(iVar.f);
        Long l4 = iVar.m;
        if (l4 != null) {
            lValueOf = Long.valueOf((l4.longValue() / ((long) 10000)) - 11644473600000L);
        } else {
            Integer num2 = iVar.p;
            lValueOf = num2 != null ? Long.valueOf(((long) num2.intValue()) * 1000) : null;
        }
        Long l5 = iVar.k;
        if (l5 != null) {
            j = 11644473600000L;
            lValueOf2 = Long.valueOf((l5.longValue() / ((long) 10000)) - 11644473600000L);
        } else {
            j = 11644473600000L;
            Integer num3 = iVar.n;
            if (num3 == null) {
                int i = iVar.j;
                if (i != -1) {
                    int i2 = iVar.i;
                    if (i != -1) {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                    l2 = iVar.l;
                    if (l2 == null) {
                        num = iVar.o;
                        if (num != null) {
                            lValueOf3 = Long.valueOf(((long) num.intValue()) * 1000);
                        } else {
                            l3 = null;
                        }
                        return new androidx.constraintlayout.core.widgets.analyzer.e(z2, z, null, lValueOf4, lValueOf, l, l3);
                    }
                    lValueOf3 = Long.valueOf((l2.longValue() / ((long) 10000)) - j);
                    l3 = lValueOf3;
                    return new androidx.constraintlayout.core.widgets.analyzer.e(z2, z, null, lValueOf4, lValueOf, l, l3);
                }
                l = null;
                l2 = iVar.l;
                if (l2 == null) {
                    num = iVar.o;
                    if (num != null) {
                        lValueOf3 = Long.valueOf(((long) num.intValue()) * 1000);
                    } else {
                        l3 = null;
                    }
                    return new androidx.constraintlayout.core.widgets.analyzer.e(z2, z, null, lValueOf4, lValueOf, l, l3);
                }
                lValueOf3 = Long.valueOf((l2.longValue() / ((long) 10000)) - j);
                l3 = lValueOf3;
                return new androidx.constraintlayout.core.widgets.analyzer.e(z2, z, null, lValueOf4, lValueOf, l, l3);
            }
            lValueOf2 = Long.valueOf(((long) num3.intValue()) * 1000);
        }
        l = lValueOf2;
        l2 = iVar.l;
        if (l2 == null) {
            num = iVar.o;
            if (num != null) {
                lValueOf3 = Long.valueOf(((long) num.intValue()) * 1000);
            } else {
                l3 = null;
            }
            return new androidx.constraintlayout.core.widgets.analyzer.e(z2, z, null, lValueOf4, lValueOf, l, l3);
        }
        lValueOf3 = Long.valueOf((l2.longValue() / ((long) 10000)) - j);
        l3 = lValueOf3;
        return new androidx.constraintlayout.core.widgets.analyzer.e(z2, z, null, lValueOf4, lValueOf, l, l3);
    }

    @Override // okio.k
    public final f0 a(x xVar) throws IOException {
        xVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.k
    public final s a0(x xVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.k
    public final f0 b0(x xVar, boolean z) throws IOException {
        xVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.k
    public final h0 c0(x xVar) throws Throwable {
        b0 b0Var;
        Throwable th;
        xVar.getClass();
        x xVar2 = C;
        xVar2.getClass();
        okio.internal.i iVar = (okio.internal.i) this.B.get(okio.internal.c.b(xVar2, xVar, true));
        if (iVar == null) {
            net.luminis.tls.engine.impl.c.s(xVar, "no such file: ");
            return null;
        }
        long j = iVar.f;
        s sVarA0 = this.A.a0(this.z);
        try {
            b0Var = new b0(sVarA0.a(iVar.h));
            try {
                sVarA0.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (sVarA0 != null) {
                try {
                    sVarA0.close();
                } catch (Throwable th4) {
                    kotlin.a.a(th3, th4);
                }
            }
            b0Var = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        b0Var.getClass();
        okio.internal.b.h(b0Var, null);
        if (iVar.g == 0) {
            return new okio.internal.f(b0Var, j, true);
        }
        return new okio.internal.f(new q(new b0(new okio.internal.f(b0Var, iVar.e, true)), new Inflater(true)), j, false);
    }

    @Override // okio.k
    public final void g(x xVar, x xVar2) throws IOException {
        xVar.getClass();
        xVar2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.k
    public final void w(x xVar) throws IOException {
        xVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.k
    public final void z(x xVar) throws IOException {
        xVar.getClass();
        throw new IOException("zip file systems are read-only");
    }
}
