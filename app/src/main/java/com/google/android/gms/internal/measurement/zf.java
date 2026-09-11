package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class zf implements yf, jg {
    public static final String i = new String();
    public final Level a;
    public final long b;
    public dg c;
    public gg d;
    public og e;
    public g f;
    public Object[] g;
    public final /* synthetic */ s5 h;

    public zf(s5 s5Var, Level level) {
        Objects.requireNonNull(s5Var);
        this.h = s5Var;
        d.a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        e1.c(level, "level");
        this.a = level;
        this.b = nanos;
    }

    @Override // com.google.android.gms.internal.measurement.jg
    public final jg a() {
        fg fgVar = new fg();
        fgVar.b = 0;
        if (this.d == null) {
            this.d = fgVar;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [com.google.android.gms.internal.measurement.og] */
    /* JADX WARN: Type inference failed for: r10v22, types: [com.google.android.gms.internal.measurement.pg] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.google.android.gms.internal.measurement.zf] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.google.android.gms.internal.measurement.og] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [com.google.android.gms.internal.measurement.og] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // com.google.android.gms.internal.measurement.jg
    public final void b(String str, Object[] objArr) {
        boolean z;
        dg dgVar;
        StackTraceElement[] stackTraceElementArr;
        int iM;
        int i2;
        vf vfVar;
        ?? mgVar;
        ?? r10;
        lg lgVar;
        gg ggVar = this.d;
        eg egVar = gg.a;
        if (ggVar == null) {
            ((i) d.a).getClass();
            i.b.getClass();
            this.d = egVar;
        }
        hg qgVar = this.d;
        if (qgVar != egVar) {
            dg dgVar2 = this.c;
            if (dgVar2 != null && dgVar2.f > 0) {
                e1.c(qgVar, "logSiteKey");
                int i3 = dgVar2.f;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (cg.f.equals(dgVar2.i(i4))) {
                        qgVar = new qg(qgVar, dgVar2.j(i4));
                    }
                }
            }
        } else {
            qgVar = null;
        }
        ka kaVarD = d();
        int iA = kaVarD.a();
        for (int i5 = 0; i5 < iA; i5++) {
            if (kaVarD.i(i5).a == "eye3tag") {
                if (kaVarD.k(cg.a) != null) {
                    break;
                }
                kg kgVar = cg.i;
                if (kaVarD.k(kgVar) != null) {
                    break;
                }
                e(kgVar, rg.SMALL);
                break;
            }
        }
        dg dgVar3 = this.c;
        int i6 = -1;
        lg lgVar2 = og.a;
        if (dgVar3 != null) {
            if (qgVar != null) {
                int i7 = xf.d;
                if (dgVar3.k(cg.d) != null) {
                    androidx.transition.k.i();
                    return;
                }
                dg dgVar4 = this.c;
                uf ufVar = vf.d;
                Integer num = (Integer) dgVar4.k(cg.b);
                if (num == null) {
                    mgVar = 0;
                } else {
                    vfVar = (vf) vf.d.c(qgVar, dgVar4);
                    if (vfVar.c.incrementAndGet() < num.intValue()) {
                        mgVar = vfVar;
                        mgVar = lgVar2;
                    }
                }
                mgVar = vfVar;
                dg dgVar5 = this.c;
                uf ufVar2 = pg.d;
                Integer num2 = (Integer) dgVar5.k(cg.c);
                if (num2 == null || num2.intValue() <= 0) {
                    r10 = 0;
                } else {
                    r10 = (pg) pg.d.c(qgVar, dgVar5);
                    int iNextInt = ((Random) pg.e.get()).nextInt(num2.intValue());
                    AtomicInteger atomicInteger = r10.c;
                    if ((iNextInt == 0 ? atomicInteger.incrementAndGet() : atomicInteger.get()) <= 0) {
                        r10 = lgVar2;
                    }
                }
                if (mgVar == 0) {
                    mgVar = r10;
                } else if (r10 != 0 && mgVar != lgVar2 && r10 != (lgVar = og.b)) {
                    if (r10 == lgVar2 || mgVar == lgVar) {
                        mgVar = r10;
                    } else {
                        mgVar = new mg(mgVar, r10);
                    }
                }
                this.e = mgVar;
                z = mgVar != lgVar2;
            }
            dg dgVar6 = this.c;
            kg kgVar2 = cg.i;
            rg rgVar = (rg) dgVar6.k(kgVar2);
            if (rgVar != null) {
                dg dgVar7 = this.c;
                if (dgVar7 != null && (iM = dgVar7.m(kgVar2)) >= 0) {
                    int i8 = iM + iM;
                    int i9 = i8 + 2;
                    while (true) {
                        i2 = dgVar7.f;
                        if (i9 >= i2 + i2) {
                            break;
                        }
                        Object obj = dgVar7.e[i9];
                        if (!obj.equals(kgVar2)) {
                            Object[] objArr2 = dgVar7.e;
                            objArr2[i8] = obj;
                            objArr2[i8 + 1] = objArr2[i9 + 1];
                            i8 += 2;
                        }
                        i9 += 2;
                    }
                    dgVar7.f = i2 - ((i9 - i8) >> 1);
                    while (i8 < i9) {
                        dgVar7.e[i8] = null;
                        i8++;
                    }
                }
                ka kaVarD2 = d();
                kg kgVar3 = cg.a;
                Throwable th = (Throwable) kaVarD2.k(kgVar3);
                int i10 = rgVar.e;
                String[] strArr = e0.a;
                if (i10 <= 0 && i10 != -1) {
                    net.luminis.tls.engine.impl.c.o("invalid maximum depth: 0");
                    return;
                }
                e0.b.getClass();
                if (!(i10 == -1 || i10 > 0)) {
                    net.luminis.tls.engine.impl.c.o("maxDepth must be > 0 or -1");
                    return;
                }
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                String name = zf.class.getName();
                int i11 = 3;
                boolean z2 = false;
                while (true) {
                    if (i11 >= stackTrace.length) {
                        i11 = -1;
                        break;
                    }
                    if (!stackTrace[i11].getClassName().equals(name)) {
                        if (z2) {
                            break;
                        }
                    } else {
                        z2 = true;
                    }
                    i11++;
                }
                if (i11 == -1) {
                    stackTraceElementArr = new StackTraceElement[0];
                } else {
                    int length = stackTrace.length - i11;
                    if (i10 <= 0 || i10 >= length) {
                        i10 = length;
                    }
                    stackTraceElementArr = new StackTraceElement[i10];
                    System.arraycopy(stackTrace, i11, stackTraceElementArr, 0, i10);
                }
                ig igVar = new ig(rgVar.toString(), th);
                igVar.setStackTrace(stackTraceElementArr);
                e(kgVar3, igVar);
            }
        }
        og ogVar = this.e;
        if (ogVar != null) {
            ng ngVar = (ng) ng.c.c(qgVar, this.c);
            AtomicInteger atomicInteger2 = ngVar.b;
            AtomicBoolean atomicBoolean = ngVar.a;
            int iIncrementAndGet = atomicInteger2.incrementAndGet();
            if (ogVar != lgVar2 && atomicBoolean.compareAndSet(false, true)) {
                try {
                    ogVar.a();
                    atomicBoolean.set(false);
                    atomicInteger2.addAndGet(-iIncrementAndGet);
                    i6 = (-1) + iIncrementAndGet;
                } catch (Throwable th2) {
                    atomicBoolean.set(false);
                    throw th2;
                }
            }
            if (z && i6 > 0 && (dgVar = this.c) != null) {
                dgVar.l(cg.e, Integer.valueOf(i6));
            }
            z &= i6 >= 0;
        }
        if (z) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            this.g = objArrCopyOf;
            for (Object obj2 : objArrCopyOf) {
            }
            if (str != i) {
                c0 c0Var = c0.b;
                this.f = new g(str);
            }
            ((i) d.a).getClass();
            x xVarB = n.b.b();
            if (!xVarB.a.isEmpty()) {
                ka kaVarD3 = d();
                bg bgVar = cg.h;
                x xVar = (x) kaVarD3.k(bgVar);
                if (xVar != null) {
                    w wVar = xVar.a;
                    if (!wVar.isEmpty()) {
                        w wVar2 = xVarB.a;
                        if (!wVar2.isEmpty()) {
                            xVar = new x(new w(wVar2, wVar));
                        }
                        xVarB = xVar;
                    }
                }
                e(bgVar, xVarB);
            }
            w2 w2Var = (w2) this.h.y;
            try {
                f0 f0Var = (f0) f0.y.get();
                int i12 = f0Var.e + 1;
                f0Var.e = i12;
                if (i12 == 0) {
                    throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
                }
                try {
                    if (i12 <= 100) {
                        w2Var.f(this);
                    } else {
                        s5.d("unbounded recursion in log statement", this);
                    }
                    f0Var.close();
                } catch (Throwable th3) {
                    try {
                        f0Var.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (RuntimeException e) {
                try {
                    w2Var.i(e, this);
                } catch (RuntimeException e2) {
                    String name2 = e2.getClass().getName();
                    String message = e2.getMessage();
                    StringBuilder sb = new StringBuilder(name2.length() + 2 + String.valueOf(message).length());
                    sb.append(name2);
                    sb.append(": ");
                    sb.append(message);
                    s5.d(sb.toString(), this);
                    try {
                        e2.printStackTrace(System.err);
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.jg
    public final jg c(Throwable th) {
        kg kgVar = cg.a;
        e1.c(kgVar, "metadata key");
        if (th != null) {
            e(kgVar, th);
        }
        return this;
    }

    public final ka d() {
        dg dgVar = this.c;
        return dgVar != null ? dgVar : yg.e;
    }

    public final void e(kg kgVar, Object obj) {
        if (this.c == null) {
            dg dgVar = new dg();
            dgVar.e = new Object[8];
            dgVar.f = 0;
            this.c = dgVar;
        }
        this.c.l(kgVar, obj);
    }
}
