package net.luminis.quic.packet;

import com.google.android.gms.measurement.internal.c0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.BiFunction;
import net.luminis.quic.impl.k;
import net.luminis.quic.impl.n;
import net.luminis.quic.impl.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final net.luminis.quic.crypto.d a;
    public final o b;
    public final int c;
    public final k d;
    public final net.luminis.quic.log.a e;
    public final long[] f = new long[androidx.constraintlayout.core.g.f(3).length];
    public final BiFunction g;
    public volatile byte[] h;

    public a(net.luminis.quic.crypto.d dVar, o oVar, int i, byte[] bArr, k kVar, kotlinx.coroutines.future.a aVar, net.luminis.quic.log.a aVar2) {
        this.a = dVar;
        this.b = oVar;
        this.c = i;
        this.d = kVar;
        this.g = aVar;
        this.e = aVar2;
        this.h = bArr;
    }

    public final g a(ByteBuffer byteBuffer) {
        g bVar;
        net.luminis.quic.crypto.a aVarE;
        if (byteBuffer.remaining() < 2) {
            throw new net.luminis.quic.impl.e("packet too short to be valid QUIC packet");
        }
        byte b = byteBuffer.get();
        if ((b & 64) != 64) {
            com.google.gson.b.p();
            return null;
        }
        if ((b & 128) != 128) {
            n nVar = this.b.a;
            i iVar = new i();
            iVar.a = nVar;
            bVar = iVar;
        } else {
            if (byteBuffer.remaining() + 1 < 7) {
                throw new net.luminis.quic.impl.e("packet too short to be valid QUIC long header packet");
            }
            int i = (b & 48) >> 4;
            int i2 = byteBuffer.getInt();
            n nVar2 = new n(i2);
            n nVar3 = this.b.a;
            if (i2 == 0) {
                j jVar = new j();
                jVar.i = new ArrayList();
                jVar.a = nVar3;
                bVar = jVar;
            } else if (!nVar2.b() ? i != 0 : i != 1) {
                c cVar = new c(nVar2);
                cVar.h = null;
                bVar = cVar;
            } else if (!nVar2.b() ? i != 3 : i != 0) {
                h hVar = new h();
                hVar.a = nVar3;
                bVar = hVar;
            } else {
                if (!nVar2.b() ? i == 2 : i == 3) {
                    if (!nVar2.b() ? i == 1 : i == 2) {
                        com.google.gson.b.l();
                        return null;
                    }
                    com.google.gson.b.p();
                    return null;
                }
                bVar = new b(nVar3);
            }
        }
        g gVar = bVar;
        if (gVar.k() != 0) {
            if (gVar.a.equals(this.b.a)) {
                aVarE = this.a.e(gVar.k());
            } else {
                if (gVar.k() == 4 || gVar.k() == 3) {
                    this.e.getClass();
                    throw new net.luminis.quic.impl.e("invalid version");
                }
                int iK = gVar.k();
                net.luminis.quic.log.a aVar = this.e;
                if (iK != 1) {
                    aVar.getClass();
                    throw new net.luminis.quic.impl.e("invalid version");
                }
                n nVar4 = gVar.a;
                o oVar = this.b;
                Objects.toString(nVar4);
                Objects.toString(oVar);
                aVar.getClass();
                net.luminis.quic.crypto.d dVar = new net.luminis.quic.crypto.d(new o(gVar.a), new c0(15));
                dVar.b(this.h);
                aVarE = dVar.e(gVar.k());
            }
            gVar.r(byteBuffer, aVarE, gVar.m() != 0 ? this.f[androidx.constraintlayout.core.g.e(gVar.m())] : 0L, this.e, this.c);
        } else {
            gVar.r(byteBuffer, null, 0L, this.e, 0);
        }
        if (gVar.l() != null && gVar.l().longValue() > this.f[androidx.constraintlayout.core.g.e(gVar.m())]) {
            this.f[androidx.constraintlayout.core.g.e(gVar.m())] = gVar.l().longValue();
        }
        return gVar;
    }
}
