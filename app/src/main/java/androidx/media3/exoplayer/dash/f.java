package androidx.media3.exoplayer.dash;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements androidx.media3.exoplayer.upstream.o {
    public final /* synthetic */ i a;

    @Override // androidx.media3.exoplayer.upstream.o
    public void b() throws IOException {
        i iVar = this.a;
        iVar.A.b();
        IOException iOException = iVar.C;
        if (iOException != null) {
            throw iOException;
        }
    }
}
