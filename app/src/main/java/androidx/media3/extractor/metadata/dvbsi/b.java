package androidx.media3.extractor.metadata.dvbsi;

import androidx.media3.common.h0;
import androidx.media3.common.util.v;
import androidx.media3.common.util.w;
import com.google.android.gms.dynamite.g;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {
    public final /* synthetic */ int p;

    public static androidx.media3.extractor.metadata.emsg.a G(w wVar) {
        String strU = wVar.u();
        strU.getClass();
        String strU2 = wVar.u();
        strU2.getClass();
        return new androidx.media3.extractor.metadata.emsg.a(strU, strU2, wVar.t(), wVar.t(), Arrays.copyOfRange(wVar.a, wVar.b, wVar.c));
    }

    @Override // com.google.android.gms.dynamite.g
    public final h0 j(androidx.media3.extractor.metadata.a aVar, ByteBuffer byteBuffer) {
        switch (this.p) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                v vVar = new v(byteBuffer.array(), byteBuffer.limit());
                int i = 12;
                vVar.o(12);
                int iD = (vVar.d() + vVar.g(12)) - 4;
                vVar.o(44);
                vVar.p(vVar.g(12));
                vVar.o(16);
                ArrayList arrayList = new ArrayList();
                while (vVar.d() < iD) {
                    vVar.o(48);
                    int iG = vVar.g(8);
                    vVar.o(4);
                    int iD2 = vVar.d() + vVar.g(i);
                    String str = null;
                    String str2 = null;
                    while (vVar.d() < iD2) {
                        int iG2 = vVar.g(8);
                        int iG3 = vVar.g(8);
                        int iD3 = vVar.d() + iG3;
                        if (iG2 == 2) {
                            int iG4 = vVar.g(16);
                            vVar.o(8);
                            if (iG4 == 3) {
                                while (vVar.d() < iD3) {
                                    int iG5 = vVar.g(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[iG5];
                                    vVar.j(bArr, iG5);
                                    String str3 = new String(bArr, charset);
                                    int iG6 = vVar.g(8);
                                    for (int i2 = 0; i2 < iG6; i2++) {
                                        vVar.p(vVar.g(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (iG2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[iG3];
                            vVar.j(bArr2, iG3);
                            str2 = new String(bArr2, charset2);
                        }
                        vVar.m(iD3 * 8);
                    }
                    vVar.m(iD2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(iG, str.concat(str2)));
                    }
                    i = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new h0(arrayList);
            default:
                return new h0(G(new w(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
