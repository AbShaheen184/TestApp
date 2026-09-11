package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kc implements com.google.common.util.concurrent.z {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.util.concurrent.z
    public final ListenableFuture apply(Object obj) throws IOException {
        switch (this.a) {
            case 0:
                pc pcVar = (pc) this.b;
                int i = ((cb) obj).e;
                if ((i == 29501 || i == 29537 || i == 29538 || i == 29539 || i == 29540 || i == 29541 || i == 29542 || i == 29543 || i == 29544) && !pcVar.h.b()) {
                    pcVar.b();
                }
                return com.google.common.util.concurrent.q0.y;
            case 1:
                final gd gdVar = (gd) this.b;
                final id idVar = (id) obj;
                gdVar.getClass();
                Callable callable = new Callable() { // from class: com.google.android.gms.internal.measurement.fd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        id idVar2 = idVar;
                        gd gdVar2 = gdVar;
                        na naVar = gdVar2.a;
                        j5 j5Var = new j5(7);
                        try {
                            td tdVar = (td) naVar.f.get();
                            Uri uri = gdVar2.b;
                            j5 j5Var2 = new j5(idVar2);
                            j5Var2.z = new j5[]{j5Var};
                            return null;
                        } catch (IOException | RuntimeException e) {
                            h.h(Level.WARNING, naVar.a(), e, "Failed to update snapshot for %s flags may be stale.", gdVar2.c);
                            return null;
                        }
                    }
                };
                com.google.common.util.concurrent.w0 w0VarA = gdVar.a.a();
                com.google.common.util.concurrent.a1 a1Var = new com.google.common.util.concurrent.a1(callable);
                w0VarA.execute(a1Var);
                return a1Var;
            case 2:
                return com.google.common.util.concurrent.n0.e((ListenableFuture) ((ld) this.b).e.get());
            case 3:
                return com.google.common.util.concurrent.n0.d(((nc) this.b).apply(obj));
            case 4:
                return ((le) this.b).e.x0();
            default:
                IOException iOException = (IOException) this.b;
                iOException.addSuppressed((IOException) obj);
                throw iOException;
        }
    }
}
