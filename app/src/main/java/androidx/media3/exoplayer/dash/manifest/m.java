package androidx.media3.exoplayer.dash.manifest;

import androidx.media3.common.util.j0;
import com.google.common.collect.h0;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public final List A;
    public final j B;
    public final androidx.media3.common.r e;
    public final h0 y;
    public final long z;

    public m(androidx.media3.common.r rVar, List list, s sVar, List list2) {
        com.google.android.material.motion.a.f(!list.isEmpty());
        this.e = rVar;
        this.y = h0.o(list);
        this.A = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.B = sVar.a(this);
        long j = sVar.c;
        long j2 = sVar.b;
        String str = j0.a;
        this.z = j0.Y(j, 1000000L, j2, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract androidx.media3.exoplayer.dash.j c();

    public abstract j d();
}
