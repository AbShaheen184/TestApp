package androidx.media3.exoplayer;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.util.Log;
import com.google.firebase.crashlytics.internal.model.j2;
import io.hopmonsdk.seed.SeedDiscovery;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ u(Context context, boolean z, c0 c0Var, androidx.media3.exoplayer.analytics.k kVar) {
        this.z = context;
        this.y = z;
        this.A = c0Var;
        this.B = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                Context context = (Context) this.z;
                boolean z = this.y;
                c0 c0Var = (c0) this.A;
                androidx.media3.exoplayer.analytics.k kVar = (androidx.media3.exoplayer.analytics.k) this.B;
                androidx.media3.exoplayer.analytics.j jVarG = androidx.media3.exoplayer.analytics.j.g(context);
                if (jVarG == null) {
                    androidx.media3.common.util.c.t("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z) {
                    androidx.media3.exoplayer.analytics.g gVar = c0Var.r;
                    gVar.getClass();
                    gVar.C.a(jVarG);
                }
                LogSessionId logSessionIdI = jVarG.i();
                synchronized (kVar) {
                    androidx.compose.ui.scrollcapture.i iVar = kVar.b;
                    iVar.getClass();
                    iVar.h(logSessionIdI);
                }
                return;
            case 1:
                com.google.firebase.crashlytics.internal.persistence.c cVar = (com.google.firebase.crashlytics.internal.persistence.c) this.z;
                j2 j2Var = (j2) this.A;
                com.google.firebase.crashlytics.internal.metadata.c cVar2 = (com.google.firebase.crashlytics.internal.metadata.c) this.B;
                boolean z2 = this.y;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                ((com.google.firebase.crashlytics.internal.persistence.a) cVar.b).d(j2Var, cVar2.a, z2);
                return;
            default:
                ((SeedDiscovery) this.z).lambda$execute$0((String) this.A, this.y, (SeedDiscovery.StringCallback) this.B);
                return;
        }
    }

    public /* synthetic */ u(com.google.firebase.crashlytics.internal.persistence.c cVar, j2 j2Var, com.google.firebase.crashlytics.internal.metadata.c cVar2, boolean z) {
        this.z = cVar;
        this.A = j2Var;
        this.B = cVar2;
        this.y = z;
    }

    public /* synthetic */ u(SeedDiscovery seedDiscovery, String str, boolean z, SeedDiscovery.StringCallback stringCallback) {
        this.z = seedDiscovery;
        this.A = str;
        this.y = z;
        this.B = stringCallback;
    }
}
