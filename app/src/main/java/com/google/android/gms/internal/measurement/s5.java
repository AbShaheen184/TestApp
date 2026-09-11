package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s5 implements c2, com.google.android.gms.common.api.internal.h, com.google.common.util.concurrent.y, com.google.android.gms.tasks.d, com.google.common.base.t {
    public static final f1 A = new f1(7);
    public static final ag B = new ag();
    public static volatile s5 z;
    public final /* synthetic */ int e;
    public final Object y;

    public s5(int i) {
        this.e = i;
        switch (i) {
            case 1:
                int i2 = o0.a;
                this.y = new s5(new c2[]{f1.y, A}, 4);
                break;
            case 5:
                this.y = new HashMap();
                break;
            case 14:
                this.y = new ConcurrentHashMap();
                break;
            case 15:
                this.y = new AtomicInteger();
                break;
            default:
                this.y = new CopyOnWriteArrayList();
                break;
        }
    }

    public static void d(String str, zf zfVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(zfVar.b / 1000000)));
        sb.append(": logging error [");
        gg ggVar = zfVar.d;
        if (ggVar == null) {
            net.luminis.tls.engine.impl.c.r("cannot request log site information prior to postProcess()");
            return;
        }
        ea.d(1, ggVar, sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    @Override // com.google.android.gms.internal.measurement.c2
    public boolean a(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((c2[]) this.y)[i].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.h
    public void accept(Object obj, Object obj2) {
        int i = this.e;
        Object obj3 = this.y;
        com.google.android.gms.tasks.j jVar = (com.google.android.gms.tasks.j) obj2;
        ba baVar = (ba) obj;
        switch (i) {
            case 7:
                int i2 = z9.j;
                x9 x9Var = new x9(jVar);
                aa aaVar = (aa) baVar.t();
                byte[] bArrA = ((xa) obj3).a();
                Parcel parcelH = aaVar.h();
                o5.c(parcelH, x9Var);
                parcelH.writeByteArray(bArrA);
                aaVar.G(parcelH, 31);
                break;
            default:
                aa aaVar2 = (aa) baVar.t();
                x9 x9Var2 = new x9((z9) obj3, jVar);
                Parcel parcelH2 = aaVar2.h();
                o5.c(parcelH2, x9Var2);
                aaVar2.G(parcelH2, 27);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.c2
    public l2 b(Class cls) {
        for (int i = 0; i < 2; i++) {
            c2 c2Var = ((c2[]) this.y)[i];
            if (c2Var.a(cls)) {
                return c2Var.b(cls);
            }
        }
        com.google.gson.b.r("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    public ac c(String str, boolean z2) {
        return new ac(str, (com.appsalt.internal.q0) this.y, z2);
    }

    @Override // com.google.common.util.concurrent.y
    public ListenableFuture call() {
        switch (this.e) {
            case 9:
                com.google.common.util.concurrent.a1 a1Var = new com.google.common.util.concurrent.a1((Callable) this.y);
                com.google.common.util.concurrent.d0.e.execute(a1Var);
                return a1Var;
            default:
                return (com.google.common.util.concurrent.r) this.y;
        }
    }

    public void e(int i, Object obj, m2 m2Var) {
        z0 z0Var = (z0) this.y;
        m0 m0Var = (m0) obj;
        z0Var.d(i, 2);
        z0Var.r(m0Var.c(m2Var));
        m2Var.i(m0Var, this);
    }

    @Override // com.google.common.base.t
    public Object get() {
        int i = this.e;
        Object obj = this.y;
        switch (i) {
            case 11:
                Object obj2 = na.j;
                return new td((ArrayList) obj);
            default:
                ld ldVar = (ld) obj;
                com.google.common.util.concurrent.w0 w0Var = (com.google.common.util.concurrent.w0) ldVar.c.get();
                w0Var.getClass();
                eb ebVar = (eb) ldVar.b.get();
                ebVar.getClass();
                z9 z9Var = ebVar.a;
                androidx.compose.foundation.text.selection.q0 q0VarC = androidx.compose.foundation.text.selection.q0.c();
                q0VarC.z = new s5(z9Var, 8);
                q0VarC.A = new com.google.android.gms.common.d[]{h.c};
                q0VarC.y = false;
                com.google.common.util.concurrent.a aVarB = eb.b(z9Var.b(0, q0VarC.b()));
                c3 c3Var = c3.B;
                int i2 = com.google.common.util.concurrent.c.I;
                com.google.common.util.concurrent.b bVar = new com.google.common.util.concurrent.b(aVarB, cb.class, c3Var);
                aVarB.a(bVar, com.google.android.material.resources.g.m(w0Var, bVar));
                com.google.common.util.concurrent.t tVarF = com.google.common.util.concurrent.n0.f(bVar, new nc(ldVar, 2), w0Var);
                tVarF.a(new vc(tVarF, 4), w0Var);
                return tVarF;
        }
    }

    @Override // com.google.android.gms.tasks.d
    public void onComplete(com.google.android.gms.tasks.i iVar) {
        fa faVar = (fa) this.y;
        if (((com.google.android.gms.tasks.q) iVar).d) {
            faVar.cancel(false);
            return;
        }
        if (iVar.h()) {
            faVar.l(iVar.f());
            return;
        }
        Exception excE = iVar.e();
        if (excE != null) {
            faVar.m(excE);
        } else {
            org.mozilla.javascript.c.a();
        }
    }

    public /* synthetic */ s5(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    public s5(z0 z0Var) {
        this.e = 3;
        this.y = z0Var;
        z0Var.a = this;
    }

    public s5(x9 x9Var, byte[] bArr) {
        this.e = 6;
        this.y = bArr;
    }
}
