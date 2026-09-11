package net.luminis.quic.packet;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.luminis.quic.impl.n;
import net.luminis.quic.send.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends g {
    public static final byte[] k = {-52, -50, 24, 126, -48, -102, 9, -48, 87, 40, 21, 90, 108, -71, 107, -31};
    public static final byte[] l = {-66, 12, 105, 11, -97, 102, 87, 90, 29, 118, 107, 84, -29, 104, -56, 78};
    public static final byte[] m = {-113, -76, -80, 27, 86, -84, 72, -30, 96, -5, -53, -50, -83, 124, -52, -110};
    public static final byte[] n = {-27, 73, 48, -7, 127, 33, 54, -16, 83, 10, -116, 28};
    public static final byte[] o = {70, 21, -103, -45, 93, 99, 43, -14, 35, -104, 37, -69};
    public static final byte[] p = {-40, 105, 105, -68, 45, 124, 109, -103, -112, -17, -80, 74};
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public byte[] j;

    @Override // net.luminis.quic.packet.g
    public final int a(net.luminis.quic.impl.i iVar, Long l2) {
        if (!Arrays.equals(v(iVar.Y.h), this.j)) {
            iVar.z.d("Discarding Retry packet, because integrity tag is invalid.");
        } else if (iVar.o0) {
            iVar.z.d("Ignoring RetryPacket, because already processed one.");
        } else {
            iVar.o0 = true;
            iVar.c0 = this.h;
            k kVar = iVar.T;
            byte[] bArr = iVar.c0;
            if (bArr != null) {
                ((net.luminis.quic.send.d) ((net.luminis.quic.send.g[]) kVar.j.b)[0]).i = bArr;
            } else {
                kVar.getClass();
            }
            net.luminis.quic.crypto.f fVarD = iVar.d(1);
            fVarD.m = 0;
            fVarD.n = 0;
            fVarD.k.clear();
            byte[] bArr2 = this.g;
            net.luminis.quic.cid.d dVar = iVar.Y.f;
            dVar.a.put(0, new net.luminis.quic.cid.a(bArr2, 0, 2));
            dVar.b = bArr2;
            iVar.Y.j = bArr2;
            net.luminis.quic.log.a aVar = iVar.z;
            "Changing destination connection id into: ".concat(com.google.common.base.b.b(bArr2));
            aVar.getClass();
            net.luminis.quic.crypto.d dVar2 = iVar.B;
            net.luminis.quic.cid.d dVar3 = iVar.Y.f;
            dVar2.b(dVar3 != null ? dVar3.b : new byte[0]);
            iVar.V.h = bArr2;
            net.luminis.quic.cc.a aVar2 = iVar.T.e;
            aVar2.a.getClass();
            aVar2.b = 0L;
            aVar2.d.j();
            iVar.d(1).c(iVar.n0);
        }
        return 1;
    }

    @Override // net.luminis.quic.packet.g
    public final int g(int i) {
        throw new androidx.compose.ui.res.e(14);
    }

    @Override // net.luminis.quic.packet.g
    public final byte[] h(net.luminis.quic.crypto.a aVar) {
        int length = this.e.length + 7 + this.g.length + this.h.length + 16;
        this.d = length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.put((byte) ((((byte) (this.a.b() ? 0 : 3)) << 4) | 192));
        byteBufferAllocate.put(this.a.a());
        byteBufferAllocate.put((byte) this.e.length);
        byteBufferAllocate.put(this.e);
        byteBufferAllocate.put((byte) this.g.length);
        byteBufferAllocate.put(this.g);
        byteBufferAllocate.put(this.h);
        this.i = byteBufferAllocate.array();
        v(null);
        throw null;
    }

    @Override // net.luminis.quic.packet.g
    public final int k() {
        return 1;
    }

    @Override // net.luminis.quic.packet.g
    public final Long l() {
        return null;
    }

    @Override // net.luminis.quic.packet.g
    public final int m() {
        return 0;
    }

    @Override // net.luminis.quic.packet.g
    public final boolean o() {
        return false;
    }

    @Override // net.luminis.quic.packet.g
    public final boolean p() {
        return false;
    }

    @Override // net.luminis.quic.packet.g
    public final boolean q() {
        return false;
    }

    @Override // net.luminis.quic.packet.g
    public final void r(ByteBuffer byteBuffer, net.luminis.quic.crypto.a aVar, long j, net.luminis.quic.log.a aVar2, int i) throws net.luminis.quic.impl.e {
        "Parsing ".concat(h.class.getSimpleName());
        aVar2.getClass();
        if (byteBuffer.remaining() < 23) {
            com.google.gson.b.p();
            return;
        }
        int iRemaining = byteBuffer.remaining();
        this.d = iRemaining;
        this.i = new byte[iRemaining];
        byteBuffer.get(this.i);
        byteBuffer.get();
        if (!new n(byteBuffer.getInt()).equals(this.a)) {
            com.google.gson.b.p();
            return;
        }
        int i2 = byteBuffer.get();
        if (byteBuffer.remaining() < i2 + 17) {
            com.google.gson.b.p();
            return;
        }
        byte[] bArr = new byte[i2];
        this.e = bArr;
        byteBuffer.get(bArr);
        int i3 = byteBuffer.get();
        if (byteBuffer.remaining() < i3) {
            com.google.gson.b.p();
            return;
        }
        byte[] bArr2 = new byte[i3];
        this.g = bArr2;
        byteBuffer.get(bArr2);
        if (byteBuffer.remaining() < 16) {
            com.google.gson.b.p();
            return;
        }
        byte[] bArr3 = new byte[byteBuffer.remaining() - 16];
        this.h = bArr3;
        byteBuffer.get(bArr3);
        byte[] bArr4 = new byte[16];
        this.j = bArr4;
        byteBuffer.get(bArr4);
    }

    public final String toString() {
        return "Packet " + "Initial".charAt(0) + "|-|R|" + this.d + "| Retry Token (" + this.h.length + "): " + com.google.common.base.b.b(this.h);
    }

    public final byte[] v(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 7 + this.e.length + 1 + this.g.length + this.h.length);
        byteBufferAllocate.put((byte) bArr.length);
        byteBufferAllocate.put(bArr);
        byte[] bArr4 = this.i;
        byteBufferAllocate.put(bArr4, 0, bArr4.length - 16);
        try {
            n nVar = this.a;
            if (nVar.a == 1) {
                bArr2 = l;
            } else {
                bArr2 = nVar.b() ? m : k;
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            n nVar2 = this.a;
            if (nVar2.a == 1) {
                bArr3 = o;
            } else {
                bArr3 = nVar2.b() ? p : n;
            }
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr3);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeySpec, gCMParameterSpec);
            cipher.updateAAD(byteBufferAllocate.array());
            return cipher.doFinal(new byte[0]);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused) {
            com.google.gson.b.l();
            return null;
        } catch (NoSuchAlgorithmException e) {
            e = e;
            throw new androidx.compose.ui.res.e(e, 16);
        } catch (NoSuchPaddingException e2) {
            e = e2;
            throw new androidx.compose.ui.res.e(e, 16);
        }
    }
}
