package androidx.media3.exoplayer.hls;

import androidx.appcompat.widget.c2;
import androidx.media3.common.g0;
import androidx.media3.common.h0;
import androidx.media3.exoplayer.source.v0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends v0 {
    public final Map J;
    public androidx.media3.common.m K;

    public q(c2 c2Var, androidx.media3.exoplayer.drm.f fVar, androidx.media3.exoplayer.drm.d dVar, Map map) {
        super(c2Var, fVar, dVar);
        this.J = map;
    }

    @Override // androidx.media3.exoplayer.source.v0
    public final androidx.media3.common.r q(androidx.media3.common.r rVar) {
        androidx.media3.common.m mVar;
        androidx.media3.common.m mVar2 = this.K;
        if (mVar2 == null) {
            mVar2 = rVar.s;
        }
        if (mVar2 != null && (mVar = (androidx.media3.common.m) this.J.get(mVar2.z)) != null) {
            mVar2 = mVar;
        }
        h0 h0Var = rVar.l;
        h0 h0Var2 = null;
        if (h0Var == null) {
            h0Var = h0Var2;
        } else {
            g0[] g0VarArr = h0Var.a;
            int length = g0VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                g0 g0Var = g0VarArr[i2];
                if ((g0Var instanceof androidx.media3.extractor.metadata.id3.m) && "com.apple.streaming.transportStreamTimestamp".equals(((androidx.media3.extractor.metadata.id3.m) g0Var).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    g0[] g0VarArr2 = new g0[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            g0VarArr2[i < i2 ? i : i - 1] = g0VarArr[i];
                        }
                        i++;
                    }
                    h0Var2 = new h0(g0VarArr2);
                }
                h0Var = h0Var2;
            }
        }
        if (mVar2 != rVar.s || h0Var != rVar.l) {
            androidx.media3.common.q qVarA = rVar.a();
            qVarA.r = mVar2;
            qVarA.k = h0Var;
            rVar = new androidx.media3.common.r(qVarA);
        }
        return super.q(rVar);
    }
}
