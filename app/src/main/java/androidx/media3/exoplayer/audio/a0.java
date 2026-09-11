package androidx.media3.exoplayer.audio;

import android.os.Handler;
import com.app.mlounge.ui.screens.player.a1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements androidx.media3.common.util.m, androidx.media3.extractor.q {
    public final /* synthetic */ int e;
    public final /* synthetic */ long y;

    public /* synthetic */ a0(long j, int i) {
        this.e = i;
        this.y = j;
    }

    @Override // androidx.media3.extractor.q
    public androidx.media3.extractor.n[] a() {
        switch (this.e) {
            case 1:
                return new a1[]{new a1(this.y)};
            default:
                return new a1[]{new a1(this.y)};
        }
    }

    @Override // androidx.media3.common.util.m
    public void invoke(Object obj) {
        com.app.mlounge.data.music.e eVar;
        k0 k0Var = (k0) obj;
        n0 n0Var = k0Var.b;
        if (k0Var.equals(n0Var.j) && (eVar = n0Var.n) != null) {
            q0 q0Var = (q0) eVar.y;
            q0Var.r1 = true;
            t tVar = q0Var.g1;
            Handler handler = tVar.a;
            if (handler != null) {
                handler.post(new r(tVar, this.y));
            }
        }
    }
}
