package okhttp3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends e0 {
    public final /* synthetic */ u b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte[] d;

    public d0(u uVar, int i, byte[] bArr) {
        this.b = uVar;
        this.c = i;
        this.d = bArr;
    }

    @Override // okhttp3.e0
    public final long a() {
        return this.c;
    }

    @Override // okhttp3.e0
    public final u b() {
        return this.b;
    }

    @Override // okhttp3.e0
    public final void d(okio.g gVar) {
        gVar.v(this.d, this.c);
    }
}
