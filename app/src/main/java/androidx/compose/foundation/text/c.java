package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.z2;
import java.util.Arrays;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ long y;

    public /* synthetic */ c(long j, int i) {
        this.e = i;
        this.y = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) throws Exception {
        CancellableContinuationImpl cancellableContinuationImpl;
        Object lVar;
        switch (this.e) {
            case 0:
                androidx.compose.ui.draw.d dVar = (androidx.compose.ui.draw.d) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.e.d() >> 32)) / 2.0f;
                return dVar.b(new z2(fIntBitsToFloat, _COROUTINE.b.k(dVar, fIntBitsToFloat), new androidx.compose.ui.graphics.m(this.y, 5)));
            case 1:
                ((androidx.compose.ui.semantics.x) obj).b(androidx.compose.foundation.text.selection.j0.c, new androidx.compose.foundation.text.selection.i0(f0.e, this.y, androidx.compose.foundation.text.selection.h0.y, true));
                return kotlin.y.a;
            case 2:
                long j = this.y;
                androidx.compose.runtime.d dVar2 = (androidx.compose.runtime.d) obj;
                kotlin.jvm.functions.l lVar2 = dVar2.b;
                if (lVar2 != null && (cancellableContinuationImpl = dVar2.a) != null) {
                    try {
                        lVar = lVar2.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        lVar = new kotlin.l(th);
                    }
                    cancellableContinuationImpl.resumeWith(lVar);
                    break;
                }
                return kotlin.y.a;
            case 3:
                long j2 = this.y;
                androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
                aVar.getClass();
                androidx.sqlite.c cVarU = aVar.U("UPDATE downloads SET status = 'cancelled' WHERE id = ?");
                try {
                    cVarU.f(1, j2);
                    cVarU.Q();
                    return kotlin.y.a;
                } finally {
                    cVarU.close();
                }
            case 4:
                long j3 = this.y;
                androidx.sqlite.a aVar2 = (androidx.sqlite.a) obj;
                aVar2.getClass();
                androidx.sqlite.c cVarU2 = aVar2.U("SELECT * FROM downloads WHERE id = ?");
                try {
                    cVarU2.f(1, j3);
                    int iV = kotlin.math.a.v(cVarU2, "id");
                    int iV2 = kotlin.math.a.v(cVarU2, "url");
                    int iV3 = kotlin.math.a.v(cVarU2, "fileName");
                    int iV4 = kotlin.math.a.v(cVarU2, "title");
                    int iV5 = kotlin.math.a.v(cVarU2, "contentType");
                    int iV6 = kotlin.math.a.v(cVarU2, "contentId");
                    int iV7 = kotlin.math.a.v(cVarU2, "posterPath");
                    int iV8 = kotlin.math.a.v(cVarU2, "quality");
                    int iV9 = kotlin.math.a.v(cVarU2, "size");
                    int iV10 = kotlin.math.a.v(cVarU2, "status");
                    int iV11 = kotlin.math.a.v(cVarU2, "progress");
                    int iV12 = kotlin.math.a.v(cVarU2, "downloadedBytes");
                    int iV13 = kotlin.math.a.v(cVarU2, "totalBytes");
                    int iV14 = kotlin.math.a.v(cVarU2, "filePath");
                    int iV15 = kotlin.math.a.v(cVarU2, "headers");
                    int iV16 = kotlin.math.a.v(cVarU2, "addedAt");
                    int iV17 = kotlin.math.a.v(cVarU2, "completedAt");
                    int iV18 = kotlin.math.a.v(cVarU2, "tmdbId");
                    int iV19 = kotlin.math.a.v(cVarU2, "season");
                    int iV20 = kotlin.math.a.v(cVarU2, "episode");
                    int iV21 = kotlin.math.a.v(cVarU2, "failureReason");
                    return cVarU2.Q() ? new com.app.mlounge.data.local.entity.a(cVarU2.getLong(iV), cVarU2.F(iV2), cVarU2.F(iV3), cVarU2.F(iV4), cVarU2.F(iV5), cVarU2.isNull(iV6) ? null : cVarU2.F(iV6), cVarU2.isNull(iV7) ? null : cVarU2.F(iV7), cVarU2.isNull(iV8) ? null : cVarU2.F(iV8), cVarU2.isNull(iV9) ? null : cVarU2.F(iV9), cVarU2.F(iV10), (int) cVarU2.getLong(iV11), cVarU2.getLong(iV12), cVarU2.getLong(iV13), cVarU2.isNull(iV14) ? null : cVarU2.F(iV14), cVarU2.isNull(iV15) ? null : cVarU2.F(iV15), cVarU2.getLong(iV16), cVarU2.isNull(iV17) ? null : Long.valueOf(cVarU2.getLong(iV17)), (int) cVarU2.getLong(iV18), (int) cVarU2.getLong(iV19), (int) cVarU2.getLong(iV20), cVarU2.isNull(iV21) ? null : cVarU2.F(iV21)) : null;
                } finally {
                    cVarU2.close();
                }
            case 5:
                long j4 = this.y;
                androidx.sqlite.a aVar3 = (androidx.sqlite.a) obj;
                aVar3.getClass();
                androidx.sqlite.c cVarU3 = aVar3.U("DELETE FROM downloads WHERE id = ?");
                try {
                    cVarU3.f(1, j4);
                    cVarU3.Q();
                    return kotlin.y.a;
                } finally {
                    cVarU3.close();
                }
            case 6:
                long j5 = this.y;
                androidx.sqlite.a aVar4 = (androidx.sqlite.a) obj;
                aVar4.getClass();
                androidx.sqlite.c cVarU4 = aVar4.U("UPDATE downloads SET status = 'pending' WHERE id = ?");
                try {
                    cVarU4.f(1, j5);
                    cVarU4.Q();
                    return kotlin.y.a;
                } finally {
                    cVarU4.close();
                }
            case 7:
                long j6 = this.y;
                androidx.sqlite.a aVar5 = (androidx.sqlite.a) obj;
                aVar5.getClass();
                androidx.sqlite.c cVarU5 = aVar5.U("UPDATE downloads SET status = 'paused' WHERE id = ?");
                try {
                    cVarU5.f(1, j6);
                    cVarU5.Q();
                    return kotlin.y.a;
                } finally {
                    cVarU5.close();
                }
            case 8:
                kotlin.text.g gVar = (kotlin.text.g) obj;
                gVar.getClass();
                int i = Integer.parseInt((String) ((kotlin.collections.b0) gVar.a()).get(1));
                int i2 = Integer.parseInt((String) ((kotlin.collections.b0) gVar.a()).get(2));
                int i3 = Integer.parseInt((String) ((kotlin.collections.b0) gVar.a()).get(3));
                String str = (String) ((kotlin.collections.b0) gVar.a()).get(4);
                long j7 = (((long) i3) * 1000) + (((long) i2) * 60000) + (((long) i) * 3600000) + ((long) Integer.parseInt((String) ((kotlin.collections.b0) gVar.a()).get(5))) + this.y;
                if (j7 < 0) {
                    j7 = 0;
                }
                long j8 = 3600000;
                Long lValueOf = Long.valueOf(j7 / j8);
                long j9 = 60000;
                Long lValueOf2 = Long.valueOf((j7 % j8) / j9);
                long j10 = j7 % j9;
                long j11 = 1000;
                return String.format("%02d:%02d:%02d%s%03d", Arrays.copyOf(new Object[]{lValueOf, lValueOf2, Long.valueOf(j10 / j11), str, Long.valueOf(j7 % j11)}, 5));
            default:
                ((androidx.datastore.preferences.core.a) obj).e(com.google.firebase.heartbeatinfo.h.b, Long.valueOf(this.y));
                return null;
        }
    }
}
