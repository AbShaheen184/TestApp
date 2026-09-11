package androidx.media3.common.audio;

import android.content.Context;
import com.google.common.collect.a1;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements com.google.common.base.t {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context y;

    public /* synthetic */ c(Context context, int i) {
        this.e = i;
        this.y = context;
    }

    @Override // com.google.common.base.t
    public final Object get() {
        androidx.media3.exoplayer.upstream.f fVar;
        switch (this.e) {
            case 0:
                return h.l(this.y);
            case 1:
                Context context = this.y;
                new androidx.media3.extractor.l();
                new androidx.media3.common.util.b(3);
                context.getApplicationContext();
                com.google.firebase.heartbeatinfo.e eVar = new com.google.firebase.heartbeatinfo.e();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                map.clear();
                map2.clear();
                return eVar;
            case 2:
                return new androidx.media3.exoplayer.trackselection.o(this.y);
            default:
                Context context2 = this.y;
                a1 a1Var = androidx.media3.exoplayer.upstream.f.p;
                synchronized (androidx.media3.exoplayer.upstream.f.class) {
                    try {
                        if (androidx.media3.exoplayer.upstream.f.v == null) {
                            Context applicationContext = context2 == null ? null : context2.getApplicationContext();
                            HashMap map3 = new HashMap(8);
                            map3.put(0, 1000000L);
                            map3.put(2, -9223372036854775807L);
                            map3.put(3, -9223372036854775807L);
                            map3.put(4, -9223372036854775807L);
                            map3.put(5, -9223372036854775807L);
                            map3.put(10, -9223372036854775807L);
                            map3.put(9, -9223372036854775807L);
                            map3.put(7, -9223372036854775807L);
                            androidx.media3.exoplayer.upstream.f.v = new androidx.media3.exoplayer.upstream.f(applicationContext, map3);
                        }
                        fVar = androidx.media3.exoplayer.upstream.f.v;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return fVar;
        }
    }
}
