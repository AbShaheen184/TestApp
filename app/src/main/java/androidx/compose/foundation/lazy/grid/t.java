package androidx.compose.foundation.lazy.grid;

import androidx.appcompat.widget.c2;
import androidx.media3.common.i0;
import androidx.media3.extractor.ts.b0;
import androidx.media3.extractor.ts.f0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public final int a;
    public final List b;

    public t() {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x005f  */
    public f0 a(int i, com.google.android.gms.cloudmessaging.n nVar) {
        String str = (String) nVar.y;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new androidx.media3.extractor.ts.v(new androidx.media3.extractor.ts.t(str, nVar.a(), "video/mp2t"));
            }
            if (i == 21) {
                return new androidx.media3.extractor.ts.v(new androidx.media3.extractor.ts.g());
            }
            if (i == 27) {
                if (c(4)) {
                    return null;
                }
                return new androidx.media3.extractor.ts.v(new androidx.media3.extractor.ts.p(new b0(0, b(nVar)), c(1), c(8)));
            }
            if (i == 36) {
                return new androidx.media3.extractor.ts.v(new androidx.media3.extractor.ts.r(new b0(0, b(nVar))));
            }
            if (i == 45) {
                return new androidx.media3.extractor.ts.v(new androidx.media3.extractor.ts.u());
            }
            if (i == 89) {
                return new androidx.media3.extractor.ts.v(new androidx.media3.extractor.ts.g((List) nVar.z));
            }
            if (i == 172) {
                return new androidx.media3.extractor.ts.v(new androidx.media3.extractor.ts.b(str, nVar.a(), "video/mp2t", 1));
            }
            if (i == 257) {
                return new androidx.media3.extractor.ts.a0(new c2("application/vnd.dvb.ait"));
            }
            if (i != 138) {
                if (i == 139) {
                    return new androidx.media3.extractor.ts.v(new androidx.media3.extractor.ts.f(str, nVar.a(), 5408));
                }
                switch (i) {
                    case 15:
                        if (c(2)) {
                            return null;
                        }
                        return new androidx.media3.extractor.ts.v(new androidx.media3.extractor.ts.e(nVar.a(), str, "video/mp2t", false));
                    case 16:
                        return new androidx.media3.extractor.ts.v(new androidx.media3.extractor.ts.m(new b0(1, b(nVar))));
                    case 17:
                        if (c(2)) {
                            return null;
                        }
                        return new androidx.media3.extractor.ts.v(new androidx.media3.extractor.ts.s(str, nVar.a()));
                    default:
                        switch (i) {
                            case 128:
                                break;
                            case Token.DEFAULT /* 129 */:
                                return new androidx.media3.extractor.ts.v(new androidx.media3.extractor.ts.b(str, nVar.a(), "video/mp2t", 0));
                            case 130:
                                if (!c(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i) {
                                    case Token.CONTINUE /* 134 */:
                                        if (c(16)) {
                                            return null;
                                        }
                                        return new androidx.media3.extractor.ts.a0(new c2("application/x-scte35"));
                                    case Token.VAR /* 135 */:
                                        return new androidx.media3.extractor.ts.v(new androidx.media3.extractor.ts.b(str, nVar.a(), "video/mp2t", 0));
                                    case Token.WITH /* 136 */:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new androidx.media3.extractor.ts.v(new androidx.media3.extractor.ts.f(str, nVar.a(), 4096));
        }
        return new androidx.media3.extractor.ts.v(new androidx.media3.extractor.ts.j(new b0(1, b(nVar)), "video/mp2t"));
    }

    public List b(com.google.android.gms.cloudmessaging.n nVar) {
        String str;
        int i;
        List listSingletonList;
        boolean zC = c(32);
        List list = this.b;
        if (zC) {
            return list;
        }
        androidx.media3.common.util.w wVar = new androidx.media3.common.util.w((byte[]) nVar.A);
        while (wVar.a() > 0) {
            int iZ = wVar.z();
            int iZ2 = wVar.b + wVar.z();
            if (iZ == 134) {
                ArrayList arrayList = new ArrayList();
                int iZ3 = wVar.z() & 31;
                for (int i2 = 0; i2 < iZ3; i2++) {
                    String strX = wVar.x(3, StandardCharsets.UTF_8);
                    int iZ4 = wVar.z();
                    boolean z = (iZ4 & 128) != 0;
                    if (z) {
                        i = iZ4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bZ = (byte) wVar.z();
                    wVar.N(1);
                    if (z) {
                        boolean z2 = (bZ & 64) != 0;
                        byte[] bArr = androidx.media3.common.util.f.a;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    androidx.media3.common.q qVar = new androidx.media3.common.q();
                    qVar.n = i0.p(str);
                    qVar.d = strX;
                    qVar.K = i;
                    qVar.q = listSingletonList;
                    arrayList.add(new androidx.media3.common.r(qVar));
                }
                list = arrayList;
            }
            wVar.M(iZ2);
        }
        return list;
    }

    public boolean c(int i) {
        return (i & this.a) != 0;
    }

    public /* synthetic */ t(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public t(ArrayList arrayList) {
        this.a = 0;
        this.b = arrayList;
    }
}
