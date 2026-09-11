package androidx.compose.ui.text.platform;

import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.p;
import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.internal.http2.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    public /* synthetic */ e(Object obj, long j, int i) {
        this.e = i;
        this.z = obj;
        this.y = j;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        boolean z;
        okhttp3.internal.ws.h hVar;
        switch (this.e) {
            case 0:
                return ((l0) ((p) this.z)).b(this.y);
            case 1:
                o oVar = (o) this.z;
                long j = this.y;
                synchronized (oVar) {
                    long j2 = oVar.J;
                    long j3 = oVar.I;
                    if (j2 < j3) {
                        z = true;
                    } else {
                        oVar.I = j3 + 1;
                        z = false;
                    }
                }
                if (!z) {
                    try {
                        oVar.U.L(1, 0, false);
                    } catch (IOException e) {
                        okhttp3.internal.http2.b bVar = okhttp3.internal.http2.b.PROTOCOL_ERROR;
                        oVar.a(bVar, bVar, e);
                    }
                    break;
                } else {
                    okhttp3.internal.http2.b bVar2 = okhttp3.internal.http2.b.PROTOCOL_ERROR;
                    oVar.a(bVar2, bVar2, null);
                    j = -1;
                }
                return Long.valueOf(j);
            default:
                okhttp3.internal.ws.e eVar = (okhttp3.internal.ws.e) this.z;
                long j4 = this.y;
                synchronized (eVar) {
                    try {
                        if (!eVar.u && (hVar = eVar.k) != null) {
                            int i = eVar.w ? eVar.v : -1;
                            eVar.v++;
                            eVar.w = true;
                            if (i != -1) {
                                StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                                sb.append(eVar.c);
                                sb.append("ms (after ");
                                okhttp3.internal.ws.e.c(eVar, new SocketTimeoutException(androidx.privacysandbox.ads.adservices.java.internal.a.m(i - 1, " successful ping/pongs)", sb)), 2);
                            } else {
                                try {
                                    okio.i iVar = okio.i.A;
                                    iVar.getClass();
                                    hVar.a(9, iVar);
                                } catch (IOException e2) {
                                    okhttp3.internal.ws.e.c(eVar, e2, 2);
                                }
                            }
                            break;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Long.valueOf(j4);
        }
    }
}
