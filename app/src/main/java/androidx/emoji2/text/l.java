package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends okhttp3.internal.platform.android.g {
    public final /* synthetic */ okhttp3.internal.platform.android.g H;
    public final /* synthetic */ ThreadPoolExecutor I;

    public l(okhttp3.internal.platform.android.g gVar, ThreadPoolExecutor threadPoolExecutor) {
        this.H = gVar;
        this.I = threadPoolExecutor;
    }

    @Override // okhttp3.internal.platform.android.g
    public final void B(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.I;
        try {
            this.H.B(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // okhttp3.internal.platform.android.g
    public final void C(com.google.firebase.messaging.o oVar) {
        ThreadPoolExecutor threadPoolExecutor = this.I;
        try {
            this.H.C(oVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
