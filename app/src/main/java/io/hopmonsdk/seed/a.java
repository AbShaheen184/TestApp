package io.hopmonsdk.seed;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ SeedDiscovery.StringCallback y;
    public final /* synthetic */ String z;

    public /* synthetic */ a(SeedDiscovery.StringCallback stringCallback, String str, int i) {
        this.e = i;
        this.y = stringCallback;
        this.z = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.onFailure(this.z);
                break;
            default:
                this.y.onSuccess(this.z);
                break;
        }
    }
}
