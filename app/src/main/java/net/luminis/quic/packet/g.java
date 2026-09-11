package net.luminis.quic.packet;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.luminis.quic.frame.k;
import net.luminis.quic.frame.l;
import net.luminis.quic.frame.m;
import net.luminis.quic.frame.p;
import net.luminis.quic.frame.q;
import net.luminis.quic.frame.r;
import net.luminis.quic.frame.s;
import net.luminis.quic.impl.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public n a;
    public ArrayList c;
    public byte[] e;
    public boolean f;
    public long b = -1;
    public int d = -1;

    public g() {
        this.c = new ArrayList();
        this.c = new ArrayList();
    }

    public static int d(long j) {
        if (j <= 255) {
            return 1;
        }
        if (j <= 65535) {
            return 2;
        }
        return j <= 16777215 ? 3 : 4;
    }

    public static byte[] e(long j) {
        if (j <= 255) {
            return new byte[]{(byte) j};
        }
        if (j <= 65535) {
            return new byte[]{(byte) (j >> 8), (byte) (j & 255)};
        }
        if (j <= 16777215) {
            return new byte[]{(byte) (j >> 16), (byte) (j >> 8), (byte) (j & 255)};
        }
        if (j <= 4294967295L) {
            return new byte[]{(byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) (j & 255)};
        }
        throw new androidx.compose.ui.res.e("cannot encode pn > 4 bytes", 14);
    }

    public static byte f(byte b, long j) {
        int i;
        if (j <= 255) {
            return b;
        }
        if (j <= 65535) {
            i = b | 1;
        } else if (j <= 16777215) {
            i = b | 2;
        } else {
            if (j > 4294967295L) {
                throw new androidx.compose.ui.res.e("cannot encode pn > 4 bytes", 14);
            }
            i = b | 3;
        }
        return (byte) i;
    }

    public abstract int a(net.luminis.quic.impl.i iVar, Long l);

    public final void b(net.luminis.quic.frame.n nVar) {
        this.c.add(nVar);
    }

    public boolean c() {
        return !(this instanceof h);
    }

    public abstract int g(int i);

    public abstract byte[] h(net.luminis.quic.crypto.a aVar);

    public final ByteBuffer i(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1500);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((net.luminis.quic.frame.n) it.next()).f(byteBufferAllocate);
        }
        if (byteBufferAllocate.position() + i < 4) {
            net.luminis.quic.frame.j jVar = new net.luminis.quic.frame.j((4 - i) - byteBufferAllocate.position());
            this.c.add(jVar);
            jVar.f(byteBufferAllocate);
        }
        return byteBufferAllocate;
    }

    public byte[] j() {
        return this.e;
    }

    public abstract int k();

    public Long l() {
        long j = this.b;
        if (j >= 0) {
            return Long.valueOf(j);
        }
        net.luminis.tls.engine.impl.c.r("PN is not yet known");
        return null;
    }

    public abstract int m();

    public final int n() {
        int i = this.d;
        if (i > 0) {
            return i;
        }
        net.luminis.tls.engine.impl.c.r("no size for ".concat(getClass().getSimpleName()));
        return 0;
    }

    public boolean o() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (((net.luminis.quic.frame.n) it.next()).e()) {
                return true;
            }
        }
        return false;
    }

    public boolean p() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (!(((net.luminis.quic.frame.n) it.next()) instanceof net.luminis.quic.frame.a)) {
                return false;
            }
        }
        return true;
    }

    public boolean q() {
        for (net.luminis.quic.frame.n nVar : this.c) {
            if (nVar.e() || (nVar instanceof net.luminis.quic.frame.j)) {
                return true;
            }
        }
        return false;
    }

    public abstract void r(ByteBuffer byteBuffer, net.luminis.quic.crypto.a aVar, long j, net.luminis.quic.log.a aVar2, int i);

    /* JADX WARN: Code duplicated, block: B:130:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x02f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x033d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x023a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x026c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x02b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0114  */
    /* JADX WARN: Code duplicated, block: B:65:0x019c A[Catch: BufferUnderflowException -> 0x034f, IllegalArgumentException -> 0x0369, a -> 0x0383, TryCatch #4 {IllegalArgumentException -> 0x0369, BufferUnderflowException -> 0x034f, a -> 0x0383, blocks: (B:63:0x0196, B:65:0x019c, B:66:0x01ac, B:67:0x01af, B:71:0x01b8, B:72:0x01c6, B:73:0x01cf, B:74:0x01d0, B:76:0x01e1, B:77:0x01e5, B:78:0x01ea, B:79:0x01eb, B:80:0x01fb, B:81:0x0212, B:82:0x0223, B:83:0x023a, B:84:0x024b, B:88:0x025f, B:89:0x026c, B:90:0x027e, B:91:0x0296, B:92:0x02a7, B:93:0x02b9, B:94:0x02d1, B:95:0x02e2, B:96:0x02f3, B:97:0x0305, B:98:0x0316, B:99:0x032c, B:100:0x033d), top: B:125:0x0196 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e1 A[Catch: BufferUnderflowException -> 0x034f, IllegalArgumentException -> 0x0369, a -> 0x0383, TryCatch #4 {IllegalArgumentException -> 0x0369, BufferUnderflowException -> 0x034f, a -> 0x0383, blocks: (B:63:0x0196, B:65:0x019c, B:66:0x01ac, B:67:0x01af, B:71:0x01b8, B:72:0x01c6, B:73:0x01cf, B:74:0x01d0, B:76:0x01e1, B:77:0x01e5, B:78:0x01ea, B:79:0x01eb, B:80:0x01fb, B:81:0x0212, B:82:0x0223, B:83:0x023a, B:84:0x024b, B:88:0x025f, B:89:0x026c, B:90:0x027e, B:91:0x0296, B:92:0x02a7, B:93:0x02b9, B:94:0x02d1, B:95:0x02e2, B:96:0x02f3, B:97:0x0305, B:98:0x0316, B:99:0x032c, B:100:0x033d), top: B:125:0x0196 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x025c  */
    /* JADX WARN: Code duplicated, block: B:87:0x025e  */
    public final void s(ByteBuffer byteBuffer, byte b, int i, net.luminis.quic.crypto.a aVar, long j, net.luminis.quic.log.a aVar2) throws net.luminis.quic.impl.e, net.luminis.quic.impl.b {
        boolean z;
        byte[] bArrDoFinal;
        ByteBuffer byteBufferWrap;
        byte b2;
        boolean z2;
        ArrayList arrayList;
        net.luminis.quic.frame.e eVar;
        if (byteBuffer.remaining() < i) {
            com.google.gson.b.p();
            return;
        }
        int iPosition = byteBuffer.position();
        if (byteBuffer.remaining() < 4) {
            com.google.gson.b.p();
            return;
        }
        if (byteBuffer.remaining() < 16) {
            com.google.gson.b.p();
            return;
        }
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        byte[] bArrE = aVar.e(bArr2);
        byte b3 = (byte) (b ^ ((b & 128) == 128 ? bArrE[0] & 15 : bArrE[0] & 31));
        u(b3);
        int i2 = (b3 & 3) + 1;
        byte[] bArr3 = new byte[i2];
        byteBuffer.get(bArr3);
        byte[] bArr4 = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            bArr4[i3] = (byte) (bArr3[i3] ^ bArrE[i4]);
            i3 = i4;
        }
        long j2 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j2 = (j2 << 8) | ((long) (bArr4[i5] & 255));
        }
        long j3 = j + 1;
        long j4 = 1 << (i2 * 8);
        long j5 = j4 / 2;
        long j6 = (j3 & (~(j4 - 1))) | j2;
        if (j6 <= j3 - j5 && j6 < 4611686018427387904L - j4) {
            j6 += j4;
        } else if (j6 > j3 + j5 && j6 >= j4) {
            j6 -= j4;
        }
        this.b = j6;
        aVar2.getClass();
        int iPosition2 = byteBuffer.position();
        int iPosition3 = byteBuffer.position();
        byte[] bArr5 = new byte[iPosition3];
        byteBuffer.get(bArr5);
        bArr5[0] = b3;
        System.arraycopy(bArr4, 0, bArr5, iPosition3 - i2, i2);
        int i6 = i - i2;
        if (i6 < 1) {
            com.google.gson.b.p();
            return;
        }
        byte[] bArr6 = new byte[i6];
        byteBuffer.get(bArr6, 0, i6);
        long j7 = this.b;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putLong(j7);
        if (this instanceof i) {
            short s = ((i) this).g;
            net.luminis.quic.log.a aVar3 = aVar.a;
            if (aVar.n % 2 != s) {
                if (aVar.f == null) {
                    aVar.a(false);
                    aVar3.getClass();
                }
                aVar3.getClass();
                z = true;
                aVar.o = true;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        byte[] bArr7 = aVar.o ? aVar.h : aVar.g;
        byte[] bArr8 = new byte[12];
        byte[] bArrArray = byteBufferAllocate.array();
        int length = bArrArray.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            bArr8[i8] = (byte) (bArrArray[i7] ^ bArr7[i8]);
            i7++;
            i8++;
        }
        switch (aVar.q) {
            case 0:
                if (bArr6.length <= 16) {
                    throw new net.luminis.quic.impl.b("ciphertext must be longer than 16 bytes");
                }
                SecretKeySpec secretKeySpecJ = aVar.j();
                Cipher cipherI = aVar.i();
                try {
                    cipherI.init(2, secretKeySpecJ, new GCMParameterSpec(128, bArr8));
                    cipherI.updateAAD(bArr5);
                    bArrDoFinal = cipherI.doFinal(bArr6);
                    break;
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused) {
                    com.google.gson.b.l();
                    bArrDoFinal = null;
                } catch (AEADBadTagException unused2) {
                    throw new net.luminis.quic.impl.b();
                }
                this.c = new ArrayList();
                byteBufferWrap = ByteBuffer.wrap(bArrDoFinal);
                b2 = -1;
                while (byteBufferWrap.remaining() > 0) {
                    try {
                        b2 = byteBufferWrap.get();
                        switch (b2) {
                            case 0:
                                ArrayList arrayList2 = this.c;
                                net.luminis.quic.frame.j jVar = new net.luminis.quic.frame.j();
                                jVar.g(byteBufferWrap);
                                arrayList2.add(jVar);
                                break;
                            case 1:
                                ArrayList arrayList3 = this.c;
                                m mVar = new m();
                                byteBufferWrap.get();
                                arrayList3.add(mVar);
                                break;
                            case 2:
                            case 3:
                                ArrayList arrayList4 = this.c;
                                net.luminis.quic.frame.a aVar4 = new net.luminis.quic.frame.a();
                                aVar4.B = 8;
                                aVar4.C = null;
                                aVar4.h(byteBufferWrap, aVar2);
                                arrayList4.add(aVar4);
                                break;
                            case 4:
                                ArrayList arrayList5 = this.c;
                                p pVar = new p();
                                pVar.g(byteBufferWrap);
                                arrayList5.add(pVar);
                                break;
                            case 5:
                                ArrayList arrayList6 = this.c;
                                net.luminis.quic.frame.f fVar = new net.luminis.quic.frame.f(1);
                                fVar.h(byteBufferWrap);
                                arrayList6.add(fVar);
                                break;
                            case 6:
                                ArrayList arrayList7 = this.c;
                                net.luminis.quic.frame.c cVar = new net.luminis.quic.frame.c();
                                cVar.g(byteBufferWrap, aVar2);
                                arrayList7.add(cVar);
                                break;
                            case 7:
                                ArrayList arrayList8 = this.c;
                                net.luminis.quic.frame.i iVar = new net.luminis.quic.frame.i();
                                iVar.g(byteBufferWrap, aVar2);
                                arrayList8.add(iVar);
                                break;
                            default:
                                switch (b2) {
                                    case 16:
                                        ArrayList arrayList9 = this.c;
                                        net.luminis.quic.frame.d dVar = new net.luminis.quic.frame.d(1);
                                        byteBufferWrap.get();
                                        dVar.y = com.google.android.material.textfield.p.s(byteBufferWrap);
                                        arrayList9.add(dVar);
                                        break;
                                    case 17:
                                        ArrayList arrayList10 = this.c;
                                        net.luminis.quic.frame.f fVar2 = new net.luminis.quic.frame.f(0);
                                        fVar2.g(byteBufferWrap);
                                        arrayList10.add(fVar2);
                                        break;
                                    case 18:
                                    case 19:
                                        ArrayList arrayList11 = this.c;
                                        net.luminis.quic.frame.g gVar = new net.luminis.quic.frame.g();
                                        gVar.g(byteBufferWrap);
                                        arrayList11.add(gVar);
                                        break;
                                    case 20:
                                        ArrayList arrayList12 = this.c;
                                        net.luminis.quic.frame.d dVar2 = new net.luminis.quic.frame.d(0);
                                        byteBufferWrap.get();
                                        dVar2.y = com.google.android.material.textfield.p.s(byteBufferWrap);
                                        arrayList12.add(dVar2);
                                        break;
                                    case 21:
                                        ArrayList arrayList13 = this.c;
                                        net.luminis.quic.frame.f fVar3 = new net.luminis.quic.frame.f(2);
                                        fVar3.i(byteBufferWrap);
                                        arrayList13.add(fVar3);
                                        break;
                                    case 22:
                                    case 23:
                                        ArrayList arrayList14 = this.c;
                                        s sVar = new s();
                                        if (byteBufferWrap.get() == 22) {
                                            z2 = z;
                                        } else {
                                            z2 = false;
                                        }
                                        sVar.e = z2;
                                        sVar.y = com.google.android.material.textfield.p.s(byteBufferWrap);
                                        arrayList14.add(sVar);
                                        break;
                                    case 24:
                                        ArrayList arrayList15 = this.c;
                                        net.luminis.quic.frame.h hVar = new net.luminis.quic.frame.h();
                                        hVar.g(byteBufferWrap);
                                        arrayList15.add(hVar);
                                        break;
                                    case 25:
                                        ArrayList arrayList16 = this.c;
                                        q qVar = new q();
                                        byteBufferWrap.get();
                                        qVar.e = com.google.android.material.textfield.p.r(byteBufferWrap);
                                        arrayList16.add(qVar);
                                        break;
                                    case 26:
                                        ArrayList arrayList17 = this.c;
                                        k kVar = new k();
                                        kVar.g(byteBufferWrap);
                                        arrayList17.add(kVar);
                                        break;
                                    case 27:
                                        ArrayList arrayList18 = this.c;
                                        l lVar = new l();
                                        byteBufferWrap.get();
                                        byte[] bArr9 = new byte[8];
                                        lVar.e = bArr9;
                                        byteBufferWrap.get(bArr9);
                                        arrayList18.add(lVar);
                                        break;
                                    case 28:
                                    case 29:
                                        ArrayList arrayList19 = this.c;
                                        net.luminis.quic.frame.b bVar = new net.luminis.quic.frame.b();
                                        bVar.g(byteBufferWrap);
                                        arrayList19.add(bVar);
                                        break;
                                    case 30:
                                        arrayList = this.c;
                                        eVar = new net.luminis.quic.frame.e();
                                        if (byteBufferWrap.get() == 30) {
                                            throw new RuntimeException();
                                        }
                                        arrayList.add(eVar);
                                        break;
                                        break;
                                    default:
                                        if (b2 >= 8 || b2 > 15) {
                                            throw new androidx.compose.ui.res.e("connection error FRAME_ENCODING_ERROR", 15);
                                        }
                                        ArrayList arrayList20 = this.c;
                                        r rVar = new r();
                                        rVar.g(byteBufferWrap, aVar2);
                                        arrayList20.add(rVar);
                                        break;
                                        break;
                                }
                                break;
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar2.d("Parse error while parsing frame of type " + ((int) b2) + ", packet will be marked invalid (and dropped)");
                        throw new net.luminis.quic.impl.e("unexpected large int value");
                    } catch (BufferUnderflowException unused4) {
                        aVar2.d("Parse error while parsing frame of type " + ((int) b2) + ", packet will be marked invalid (and dropped)");
                        throw new net.luminis.quic.impl.e("invalid frame encoding");
                    } catch (net.luminis.quic.generic.a unused5) {
                        aVar2.d("Parse error while parsing frame of type " + ((int) b2) + ", packet will be marked invalid (and dropped)");
                        throw new net.luminis.quic.impl.e("invalid integer encoding");
                    }
                }
                return;
            default:
                try {
                    Cipher cipherI2 = aVar.i();
                    cipherI2.init(2, aVar.j(), new IvParameterSpec(bArr8));
                    cipherI2.updateAAD(bArr5);
                    bArrDoFinal = cipherI2.doFinal(bArr6);
                    break;
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused6) {
                    com.google.gson.b.l();
                    bArrDoFinal = null;
                } catch (AEADBadTagException unused7) {
                    throw new net.luminis.quic.impl.b();
                }
                this.c = new ArrayList();
                byteBufferWrap = ByteBuffer.wrap(bArrDoFinal);
                b2 = -1;
                while (byteBufferWrap.remaining() > 0) {
                    b2 = byteBufferWrap.get();
                    switch (b2) {
                        case 0:
                            ArrayList arrayList21 = this.c;
                            net.luminis.quic.frame.j jVar2 = new net.luminis.quic.frame.j();
                            jVar2.g(byteBufferWrap);
                            arrayList21.add(jVar2);
                            break;
                        case 1:
                            ArrayList arrayList22 = this.c;
                            m mVar2 = new m();
                            byteBufferWrap.get();
                            arrayList22.add(mVar2);
                            break;
                        case 2:
                        case 3:
                            ArrayList arrayList23 = this.c;
                            net.luminis.quic.frame.a aVar5 = new net.luminis.quic.frame.a();
                            aVar5.B = 8;
                            aVar5.C = null;
                            aVar5.h(byteBufferWrap, aVar2);
                            arrayList23.add(aVar5);
                            break;
                        case 4:
                            ArrayList arrayList24 = this.c;
                            p pVar2 = new p();
                            pVar2.g(byteBufferWrap);
                            arrayList24.add(pVar2);
                            break;
                        case 5:
                            ArrayList arrayList25 = this.c;
                            net.luminis.quic.frame.f fVar4 = new net.luminis.quic.frame.f(1);
                            fVar4.h(byteBufferWrap);
                            arrayList25.add(fVar4);
                            break;
                        case 6:
                            ArrayList arrayList26 = this.c;
                            net.luminis.quic.frame.c cVar2 = new net.luminis.quic.frame.c();
                            cVar2.g(byteBufferWrap, aVar2);
                            arrayList26.add(cVar2);
                            break;
                        case 7:
                            ArrayList arrayList27 = this.c;
                            net.luminis.quic.frame.i iVar2 = new net.luminis.quic.frame.i();
                            iVar2.g(byteBufferWrap, aVar2);
                            arrayList27.add(iVar2);
                            break;
                        default:
                            switch (b2) {
                                case 16:
                                    ArrayList arrayList28 = this.c;
                                    net.luminis.quic.frame.d dVar3 = new net.luminis.quic.frame.d(1);
                                    byteBufferWrap.get();
                                    dVar3.y = com.google.android.material.textfield.p.s(byteBufferWrap);
                                    arrayList28.add(dVar3);
                                    break;
                                case 17:
                                    ArrayList arrayList110 = this.c;
                                    net.luminis.quic.frame.f fVar5 = new net.luminis.quic.frame.f(0);
                                    fVar5.g(byteBufferWrap);
                                    arrayList110.add(fVar5);
                                    break;
                                case 18:
                                case 19:
                                    ArrayList arrayList111 = this.c;
                                    net.luminis.quic.frame.g gVar2 = new net.luminis.quic.frame.g();
                                    gVar2.g(byteBufferWrap);
                                    arrayList111.add(gVar2);
                                    break;
                                case 20:
                                    ArrayList arrayList112 = this.c;
                                    net.luminis.quic.frame.d dVar4 = new net.luminis.quic.frame.d(0);
                                    byteBufferWrap.get();
                                    dVar4.y = com.google.android.material.textfield.p.s(byteBufferWrap);
                                    arrayList112.add(dVar4);
                                    break;
                                case 21:
                                    ArrayList arrayList113 = this.c;
                                    net.luminis.quic.frame.f fVar6 = new net.luminis.quic.frame.f(2);
                                    fVar6.i(byteBufferWrap);
                                    arrayList113.add(fVar6);
                                    break;
                                case 22:
                                case 23:
                                    ArrayList arrayList114 = this.c;
                                    s sVar2 = new s();
                                    if (byteBufferWrap.get() == 22) {
                                        z2 = z;
                                    } else {
                                        z2 = false;
                                    }
                                    sVar2.e = z2;
                                    sVar2.y = com.google.android.material.textfield.p.s(byteBufferWrap);
                                    arrayList114.add(sVar2);
                                    break;
                                case 24:
                                    ArrayList arrayList115 = this.c;
                                    net.luminis.quic.frame.h hVar2 = new net.luminis.quic.frame.h();
                                    hVar2.g(byteBufferWrap);
                                    arrayList115.add(hVar2);
                                    break;
                                case 25:
                                    ArrayList arrayList116 = this.c;
                                    q qVar2 = new q();
                                    byteBufferWrap.get();
                                    qVar2.e = com.google.android.material.textfield.p.r(byteBufferWrap);
                                    arrayList116.add(qVar2);
                                    break;
                                case 26:
                                    ArrayList arrayList117 = this.c;
                                    k kVar2 = new k();
                                    kVar2.g(byteBufferWrap);
                                    arrayList117.add(kVar2);
                                    break;
                                case 27:
                                    ArrayList arrayList118 = this.c;
                                    l lVar2 = new l();
                                    byteBufferWrap.get();
                                    byte[] bArr10 = new byte[8];
                                    lVar2.e = bArr10;
                                    byteBufferWrap.get(bArr10);
                                    arrayList118.add(lVar2);
                                    break;
                                case 28:
                                case 29:
                                    ArrayList arrayList119 = this.c;
                                    net.luminis.quic.frame.b bVar2 = new net.luminis.quic.frame.b();
                                    bVar2.g(byteBufferWrap);
                                    arrayList119.add(bVar2);
                                    break;
                                case 30:
                                    arrayList = this.c;
                                    eVar = new net.luminis.quic.frame.e();
                                    if (byteBufferWrap.get() == 30) {
                                        throw new RuntimeException();
                                    }
                                    arrayList.add(eVar);
                                    break;
                                    break;
                                default:
                                    if (b2 >= 8) {
                                    }
                                    throw new androidx.compose.ui.res.e("connection error FRAME_ENCODING_ERROR", 15);
                            }
                            break;
                    }
                }
                return;
        }
    }

    public final void t(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, net.luminis.quic.crypto.a aVar) {
        byte[] bArrDoFinal;
        int iPosition = byteBuffer.position() - i;
        byte[] bArr = new byte[byteBuffer.position()];
        byteBuffer.get(bArr);
        byte[] bArr2 = new byte[byteBuffer2.limit()];
        byteBuffer2.get(bArr2, 0, byteBuffer2.limit());
        long j = this.b;
        byte[] bArr3 = aVar.o ? aVar.h : aVar.g;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr3.length);
        for (int i2 = 0; i2 < byteBufferAllocate.capacity() - 8; i2++) {
            byteBufferAllocate.put((byte) 0);
        }
        byteBufferAllocate.putLong(j);
        byte[] bArr4 = new byte[12];
        byte[] bArrArray = byteBufferAllocate.array();
        int length = bArrArray.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            bArr4[i4] = (byte) (bArrArray[i3] ^ bArr3[i4]);
            i3++;
            i4++;
        }
        switch (aVar.q) {
            case 0:
                Cipher cipherI = aVar.i();
                try {
                    cipherI.init(1, aVar.j(), new GCMParameterSpec(128, bArr4));
                    cipherI.updateAAD(bArr);
                    bArrDoFinal = cipherI.doFinal(bArr2);
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused) {
                    com.google.gson.b.l();
                    bArrDoFinal = null;
                }
                break;
            default:
                try {
                    Cipher cipherI2 = aVar.i();
                    cipherI2.init(1, aVar.j(), new IvParameterSpec(bArr4));
                    cipherI2.updateAAD(bArr);
                    bArrDoFinal = cipherI2.doFinal(bArr2);
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused2) {
                    com.google.gson.b.l();
                    bArrDoFinal = null;
                }
                break;
        }
        byteBuffer.put(bArrDoFinal);
        byte[] bArrE = e(this.b);
        byte[] bArr5 = new byte[16];
        System.arraycopy(bArrDoFinal, 4 - bArrE.length, bArr5, 0, 16);
        byte[] bArrE2 = aVar.e(bArr5);
        byte[] bArr6 = new byte[bArrE.length];
        int i5 = 0;
        while (i5 < bArrE.length) {
            int i6 = i5 + 1;
            bArr6[i5] = (byte) (bArrE[i5] ^ bArrE2[i6]);
            i5 = i6;
        }
        byte b = byteBuffer.get(0);
        byteBuffer.put(0, (byte) (((byte) ((b & 128) == 128 ? bArrE2[0] & 15 : bArrE2[0] & 31)) ^ b));
        int iPosition2 = byteBuffer.position();
        byteBuffer.put(bArr6);
    }

    public void u(byte b) {
    }
}
