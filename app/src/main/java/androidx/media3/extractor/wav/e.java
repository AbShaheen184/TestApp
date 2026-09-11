package androidx.media3.extractor.wav;

import androidx.media3.common.j0;
import androidx.media3.common.util.w;
import androidx.media3.exoplayer.upstream.h;
import androidx.media3.extractor.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final byte[] a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(o oVar) {
        w wVar = new w(8);
        int i = h.c(oVar, wVar).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        oVar.x(wVar.a, 0, 4);
        wVar.M(0);
        int iM = wVar.m();
        if (iM == 1463899717) {
            return true;
        }
        androidx.media3.common.util.c.f("WavHeaderReader", "Unsupported form type: " + iM);
        return false;
    }

    public static h b(int i, o oVar, w wVar) throws j0 {
        h hVarC = h.c(oVar, wVar);
        while (true) {
            int i2 = hVarC.a;
            if (i2 == i) {
                return hVarC;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Ignoring unknown WAV chunk: ", i2, "WavHeaderReader");
            long j = hVarC.b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw j0.c("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            oVar.r((int) j2);
            hVarC = h.c(oVar, wVar);
        }
    }
}
