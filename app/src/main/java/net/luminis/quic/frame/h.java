package net.luminis.quic.frame;

import com.appsalt.internal.x0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends n {
    public static final Random B = new Random();
    public byte[] A;
    public int e;
    public int y;
    public byte[] z;

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
        int iIntValue;
        net.luminis.quic.cid.a aVar;
        net.luminis.quic.cid.b bVar = iVar.Y;
        net.luminis.quic.cid.d dVar = bVar.f;
        if (dVar == null) {
            bVar.d.accept(Integer.valueOf(net.luminis.quic.a.PROTOCOL_VIOLATION.e), "new connection id frame not allowed when using zero-length connection ID");
            return;
        }
        int i = this.y;
        int i2 = this.e;
        if (i > i2) {
            bVar.d.accept(Integer.valueOf(net.luminis.quic.a.FRAME_ENCODING_ERROR.e), "exceeding active connection id limit");
            return;
        }
        boolean zContainsKey = dVar.a.containsKey(Integer.valueOf(i2));
        net.luminis.quic.cid.d dVar2 = bVar.f;
        if (!zContainsKey) {
            int i3 = this.e;
            byte[] bArr = this.z;
            byte[] bArr2 = this.A;
            int i4 = dVar2.f;
            ConcurrentHashMap concurrentHashMap = dVar2.a;
            if (i3 >= i4) {
                concurrentHashMap.put(Integer.valueOf(i3), new net.luminis.quic.cid.a(i3, 1, bArr, bArr2));
            } else {
                concurrentHashMap.put(Integer.valueOf(i3), new net.luminis.quic.cid.a(i3, 4, bArr, bArr2));
                int i5 = this.e;
                net.luminis.quic.send.k kVar = bVar.c;
                q qVar = new q();
                qVar.e = i5;
                kVar.f(qVar, 4, new x0(bVar, 1));
            }
        } else if (!Arrays.equals(((net.luminis.quic.cid.a) dVar2.a.get(Integer.valueOf(this.e))).b, this.z)) {
            bVar.d.accept(Integer.valueOf(net.luminis.quic.a.PROTOCOL_VIOLATION.e), "different cids or same sequence number");
            return;
        }
        int i6 = this.y;
        if (i6 > 0) {
            net.luminis.quic.cid.d dVar3 = bVar.f;
            dVar3.f = i6;
            Iterator it = dVar3.a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    iIntValue = -1;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (Arrays.equals(((net.luminis.quic.cid.a) entry.getValue()).b, dVar3.b)) {
                    iIntValue = ((Integer) entry.getKey()).intValue();
                    break;
                }
            }
            ArrayList<Integer> arrayList = new ArrayList();
            for (Map.Entry entry2 : dVar3.a.entrySet()) {
                if (((Integer) entry2.getKey()).intValue() < i6 && !androidx.constraintlayout.core.g.b(((net.luminis.quic.cid.a) entry2.getValue()).c, 4)) {
                    arrayList.add((Integer) entry2.getKey());
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                dVar3.c(((Integer) it2.next()).intValue());
            }
            if (androidx.constraintlayout.core.g.b(((net.luminis.quic.cid.a) dVar3.a.get(Integer.valueOf(iIntValue))).c, 4)) {
                Iterator it3 = dVar3.a.values().iterator();
                do {
                    if (!it3.hasNext()) {
                        aVar = null;
                        break;
                    }
                    aVar = (net.luminis.quic.cid.a) it3.next();
                } while (androidx.constraintlayout.core.g.b(aVar.c, 4));
                if (aVar == null) {
                    net.luminis.tls.engine.impl.c.r("Can't find connection id that is not retired");
                    return;
                } else {
                    aVar.c = 2;
                    dVar3.b = aVar.b;
                }
            }
            for (Integer num : arrayList) {
                net.luminis.quic.send.k kVar2 = bVar.c;
                int iIntValue2 = num.intValue();
                q qVar2 = new q();
                qVar2.e = iIntValue2;
                kVar2.f(qVar2, 4, new x0(bVar, 1));
            }
        }
        if (bVar.f.b().size() > 2) {
            bVar.d.accept(Integer.valueOf(net.luminis.quic.a.CONNECTION_ID_LIMIT_ERROR.e), "exceeding active connection id limit");
        }
    }

    @Override // net.luminis.quic.frame.n
    public final int d() {
        return com.google.android.material.textfield.p.b(this.y) + com.google.android.material.textfield.p.b(this.e) + 1 + 1 + this.z.length + 16;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 24);
        com.google.android.material.textfield.p.l(byteBuffer, this.e);
        com.google.android.material.textfield.p.l(byteBuffer, this.y);
        byteBuffer.put((byte) this.z.length);
        byteBuffer.put(this.z);
        byteBuffer.put(this.A);
    }

    public final void g(ByteBuffer byteBuffer) {
        byteBuffer.get();
        this.e = com.google.android.material.textfield.p.r(byteBuffer);
        this.y = com.google.android.material.textfield.p.r(byteBuffer);
        byte[] bArr = new byte[byteBuffer.get()];
        this.z = bArr;
        byteBuffer.get(bArr);
        byte[] bArr2 = new byte[16];
        this.A = bArr2;
        byteBuffer.get(bArr2);
    }

    public final String toString() {
        return "NewConnectionIdFrame[" + this.e + ",<" + this.y + "|" + com.google.common.base.b.b(this.z) + "|" + com.google.common.base.b.b(this.A) + "]";
    }
}
