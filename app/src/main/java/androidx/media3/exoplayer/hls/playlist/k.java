package androidx.media3.exoplayer.hls.playlist;

import com.google.common.collect.a1;
import com.google.common.collect.e0;
import com.google.common.collect.h0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends l {
    public final String I;
    public final h0 J;

    public k(String str, k kVar, String str2, long j, int i, long j2, androidx.media3.common.m mVar, String str3, String str4, long j3, long j4, boolean z, List list) {
        super(str, kVar, j, i, j2, mVar, str3, str4, j3, j4, z);
        this.I = str2;
        this.J = h0.o(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(String str, long j, long j2, String str2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, a1.B);
        e0 e0Var = h0.y;
    }
}
