package androidx.media3.extractor.mp4;

import androidx.media3.extractor.h0;
import androidx.media3.extractor.i0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final r a;
    public final u b;
    public final h0 c;
    public final i0 d;
    public int e;
    public androidx.media3.common.r f;

    public l(r rVar, u uVar, h0 h0Var) {
        this.a = rVar;
        this.b = uVar;
        this.c = h0Var;
        this.d = "audio/true-hd".equals(rVar.g.o) ? new i0() : null;
    }
}
