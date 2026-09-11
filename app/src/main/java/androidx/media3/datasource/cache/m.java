package androidx.media3.datasource.cache;

import android.os.ConditionVariable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Thread {
    public final /* synthetic */ ConditionVariable e;
    public final /* synthetic */ n y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.y = nVar;
        this.e = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.y) {
            this.e.open();
            n.a(this.y);
            this.y.b.getClass();
        }
    }
}
