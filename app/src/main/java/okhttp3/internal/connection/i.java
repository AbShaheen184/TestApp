package okhttp3.internal.connection;

import com.google.android.gms.measurement.internal.f1;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends okhttp3.internal.concurrent.a {
    public final /* synthetic */ r e;
    public final /* synthetic */ f1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, r rVar, f1 f1Var) {
        super(str, true);
        this.e = rVar;
        this.f = f1Var;
    }

    @Override // okhttp3.internal.concurrent.a
    public final long a() throws InterruptedException {
        q qVar;
        r rVar = this.e;
        try {
            qVar = rVar.e();
        } catch (Throwable th) {
            qVar = new q(rVar, th, 2);
        }
        f1 f1Var = this.f;
        if (!((CopyOnWriteArrayList) f1Var.A).contains(rVar)) {
            return -1L;
        }
        ((LinkedBlockingDeque) f1Var.B).put(qVar);
        return -1L;
    }
}
