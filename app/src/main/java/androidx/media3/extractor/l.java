package androidx.media3.extractor;

import android.net.Uri;
import com.google.common.collect.a1;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements q {
    public a1 e;
    public final com.google.android.gms.common.internal.k y = new com.google.android.gms.common.internal.k(20);
    public static final int[] z = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final androidx.media3.common.util.b A = new androidx.media3.common.util.b(new androidx.media3.exoplayer.hls.playlist.a(4));
    public static final androidx.media3.common.util.b B = new androidx.media3.common.util.b(new androidx.media3.exoplayer.hls.playlist.a(5));

    @Override // androidx.media3.extractor.q
    public final synchronized n[] a() {
        return b(Uri.EMPTY, new HashMap());
    }

    @Override // androidx.media3.extractor.q
    public final synchronized n[] b(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = z;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            int iV = t1.v((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iV != -1) {
                c(iV, arrayList);
            }
            int iW = t1.w(uri);
            if (iW != -1 && iW != iV) {
                c(iW, arrayList);
            }
            for (int i = 0; i < 21; i++) {
                int i2 = iArr[i];
                if (i2 != iV && i2 != iW) {
                    c(i2, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (n[]) arrayList.toArray(new n[0]);
    }

    public final void c(int i, ArrayList arrayList) {
        com.google.android.gms.common.internal.k kVar = this.y;
        int i2 = 0;
        switch (i) {
            case 0:
                arrayList.add(new androidx.media3.extractor.ts.a());
                break;
            case 1:
                arrayList.add(new androidx.media3.extractor.ts.c());
                break;
            case 2:
                arrayList.add(new androidx.media3.extractor.ts.d(0));
                break;
            case 3:
                arrayList.add(new androidx.media3.extractor.amr.a());
                break;
            case 4:
                n nVarV = A.v(0);
                if (nVarV == null) {
                    arrayList.add(new androidx.media3.extractor.flac.c());
                } else {
                    arrayList.add(nVarV);
                }
                break;
            case 5:
                arrayList.add(new androidx.media3.extractor.flv.b());
                break;
            case 6:
                arrayList.add(new androidx.media3.extractor.mkv.e(kVar, 0));
                break;
            case 7:
                arrayList.add(new androidx.media3.extractor.mp3.d(0));
                break;
            case 8:
                int iF = androidx.media3.extractor.mp4.i.f(3);
                com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
                arrayList.add(new androidx.media3.extractor.mp4.i(kVar, iF, null, a1.B, null));
                arrayList.add(new androidx.media3.extractor.mp4.m(kVar, 160));
                break;
            case 9:
                arrayList.add(new androidx.media3.extractor.ogg.d());
                break;
            case 10:
                arrayList.add(new androidx.media3.extractor.ts.y());
                break;
            case 11:
                if (this.e == null) {
                    com.google.common.collect.e0 e0Var2 = com.google.common.collect.h0.y;
                    this.e = a1.B;
                }
                arrayList.add(new androidx.media3.extractor.ts.c0(1, 0, kVar, new androidx.media3.common.util.h0(0L), new androidx.compose.foundation.lazy.grid.t(i2, this.e)));
                break;
            case 12:
                arrayList.add(new androidx.media3.extractor.wav.d());
                break;
            case 14:
                arrayList.add(new androidx.media3.extractor.bmp.a(0));
                break;
            case 15:
                n nVarV2 = B.v(new Object[0]);
                if (nVarV2 != null) {
                    arrayList.add(nVarV2);
                }
                break;
            case 16:
                arrayList.add(new androidx.media3.extractor.avi.b(kVar));
                break;
            case 17:
                arrayList.add(new androidx.media3.extractor.bmp.a(1, (byte) 0));
                break;
            case 18:
                arrayList.add(new androidx.media3.extractor.avif.a(1));
                break;
            case 19:
                arrayList.add(new androidx.media3.extractor.bmp.a(0, (byte) 0));
                break;
            case 20:
                arrayList.add(new androidx.media3.extractor.heif.b());
                break;
            case 21:
                arrayList.add(new androidx.media3.extractor.avif.a(0));
                break;
        }
    }
}
