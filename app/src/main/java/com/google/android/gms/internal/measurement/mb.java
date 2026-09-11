package com.google.android.gms.internal.measurement;

import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class mb {
    public static final mb c = new mb(kb.b, gb.B());
    public final kb a;
    public final gb b;

    public mb(kb kbVar, gb gbVar) {
        kbVar.getClass();
        this.a = kbVar;
        this.b = gbVar;
    }

    public static mb a(w0 w0Var, boolean z) throws t1 {
        kb kbVarA;
        int iC = w0Var.C();
        if (iC > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(iC).length() + 44);
            sb.append("Unsupported version: ");
            sb.append(iC);
            sb.append(". Current version is: 1");
            throw new t1(sb.toString());
        }
        w0Var.C();
        int iA = w0Var.a(w0Var.A());
        a1 a1Var = a1.a;
        int i = o0.a;
        gb gbVarA = gb.A(w0Var, a1.b);
        w0Var.b(iA);
        ib ibVar = new ib();
        Inflater inflater = ibVar.e;
        try {
            if (z) {
                int iA2 = w0Var.a(w0Var.A());
                int iC2 = w0Var.c();
                try {
                    kbVarA = kb.a(w0.h(new InflaterInputStream(new hb(ibVar, w0Var), inflater, iC2 < 0 ? 4096 : Math.min(iC2, 4096)), 4096));
                    inflater.reset();
                    if (w0Var.c() != 0) {
                        throw new t1("Unexpected bytes remaining after FlagsBlob parsing.");
                    }
                    w0Var.b(iA2);
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
            } else {
                inflater.setInput(w0Var.z());
                try {
                    kbVarA = kb.a(w0.h(new hb(ibVar, 0), 4096));
                    inflater.reset();
                } catch (Throwable th2) {
                    inflater.reset();
                    throw th2;
                }
            }
            ibVar.close();
            return new mb(kbVarA, gbVarA);
        } catch (Throwable th3) {
            try {
                ibVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
