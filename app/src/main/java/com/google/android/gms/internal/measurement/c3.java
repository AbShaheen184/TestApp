package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c3 implements com.google.common.base.f {
    public final /* synthetic */ int e;
    public static final /* synthetic */ c3 y = new c3(0);
    public static final /* synthetic */ c3 z = new c3(1);
    public static final /* synthetic */ c3 A = new c3(2);
    public static final /* synthetic */ c3 B = new c3(3);

    public /* synthetic */ c3(int i) {
        this.e = i;
    }

    @Override // com.google.common.base.f
    public final Object apply(Object obj) {
        switch (this.e) {
            case 0:
                Context context = (Context) obj;
                String str = d3.b;
                if (str == null) {
                    synchronized (d3.class) {
                        try {
                            str = d3.b;
                            if (str == null) {
                                String strB = la.b(context, "com.google.android.gms.measurement");
                                d3.b = strB;
                                str = strB;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return str;
            case 1:
                s5 s5Var = pc.i;
                return "";
            case 2:
                za zaVar = (za) obj;
                hd hdVarA = id.A();
                if (zaVar == null) {
                    return (id) hdVarA.d();
                }
                for (bb bbVar : zaVar.y()) {
                    jd jdVarA = kd.A();
                    String strU = bbVar.u();
                    jdVarA.b();
                    ((kd) jdVarA.y).B(strU);
                    int I = bbVar.I();
                    int i = I - 1;
                    if (I == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        long jV = bbVar.v();
                        jdVarA.b();
                        ((kd) jdVarA.y).C(jV);
                    } else if (i == 1) {
                        boolean zW = bbVar.w();
                        jdVarA.b();
                        ((kd) jdVarA.y).D(zW);
                    } else if (i == 2) {
                        double dX = bbVar.x();
                        jdVarA.b();
                        ((kd) jdVarA.y).E(dX);
                    } else if (i == 3) {
                        String strY = bbVar.y();
                        jdVarA.b();
                        ((kd) jdVarA.y).F(strY);
                    } else {
                        if (i != 4) {
                            net.luminis.tls.engine.impl.c.r("No known flag type");
                            return null;
                        }
                        t0 t0VarZ = bbVar.z();
                        jdVarA.b();
                        ((kd) jdVarA.y).G(t0VarZ);
                    }
                    kd kdVar = (kd) jdVarA.d();
                    hdVarA.b();
                    ((id) hdVarA.y).G(kdVar);
                }
                String strX = zaVar.x();
                hdVarA.b();
                ((id) hdVarA.y).E(strX);
                String strU2 = zaVar.u();
                hdVarA.b();
                ((id) hdVarA.y).C(strU2);
                long jZ = zaVar.z();
                hdVarA.b();
                ((id) hdVarA.y).F(jZ);
                if (zaVar.v()) {
                    t0 t0VarW = zaVar.w();
                    hdVarA.b();
                    ((id) hdVarA.y).D(t0VarW);
                }
                return (id) hdVarA.d();
            default:
                cb cbVar = (cb) obj;
                if (cbVar.e != 29514) {
                    throw cbVar;
                }
                sb sbVarX = tb.x();
                ob obVarH = pb.H();
                long jCurrentTimeMillis = System.currentTimeMillis();
                obVarH.b();
                ((pb) obVarH.y).J(jCurrentTimeMillis);
                sbVarX.b();
                ((tb) sbVarX.y).y((pb) obVarH.d());
                return (tb) sbVarX.d();
        }
    }
}
