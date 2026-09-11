package androidx.media3.exoplayer.analytics;

import androidx.media3.common.r;
import androidx.media3.common.util.m;
import androidx.media3.common.util.w;
import androidx.media3.exoplayer.source.v;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements m, androidx.media3.common.util.i {
    public final /* synthetic */ long e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ f(a aVar, int i, long j, long j2) {
        this.z = aVar;
        this.y = i;
        this.e = j;
    }

    @Override // androidx.media3.common.util.i
    public void accept(Object obj) {
        androidx.media3.extractor.text.m mVar = (androidx.media3.extractor.text.m) this.z;
        androidx.media3.extractor.text.a aVar = (androidx.media3.extractor.text.a) obj;
        mVar.h.getClass();
        byte[] bArrL = com.google.firebase.heartbeatinfo.e.l(aVar.a, aVar.c);
        w wVar = mVar.c;
        wVar.getClass();
        wVar.K(bArrL, bArrL.length);
        mVar.a.f(bArrL.length, wVar);
        long j = aVar.b;
        r rVar = mVar.h;
        long j2 = this.e;
        if (j == -9223372036854775807L) {
            com.google.android.material.motion.a.q(rVar.t == Long.MAX_VALUE);
        } else {
            long j3 = rVar.t;
            j2 = j3 == Long.MAX_VALUE ? j2 + j : j + j3;
        }
        mVar.a.g(j2, this.y | 1, bArrL.length, 0, null);
    }

    @Override // androidx.media3.common.util.m
    public void invoke(Object obj) {
        a aVar = (a) this.z;
        j jVar = (j) ((b) obj);
        HashMap map = jVar.h;
        HashMap map2 = jVar.i;
        v vVar = aVar.d;
        if (vVar != null) {
            String strC = jVar.c.c(aVar.b, vVar);
            Long l = (Long) map2.get(strC);
            Long l2 = (Long) map.get(strC);
            map2.put(strC, Long.valueOf((l == null ? 0L : l.longValue()) + this.e));
            map.put(strC, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) this.y)));
        }
    }

    public /* synthetic */ f(androidx.media3.extractor.text.m mVar, long j, int i) {
        this.z = mVar;
        this.e = j;
        this.y = i;
    }
}
