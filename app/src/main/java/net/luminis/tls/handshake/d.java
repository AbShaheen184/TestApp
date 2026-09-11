package net.luminis.tls.handshake;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.l;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import net.luminis.tls.extension.i;
import net.luminis.tls.extension.j;
import net.luminis.tls.extension.k;
import net.luminis.tls.extension.m;
import net.luminis.tls.extension.n;
import net.luminis.tls.h;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e {
    public static final SecureRandom e;
    public final byte[] a;
    public final byte[] b;
    public final List c;
    public final ArrayList d;

    static {
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(net.luminis.tls.c.TLS_AES_128_GCM_SHA256);
        arrayList2.add(h.rsa_pss_rsae_sha256);
        new Random();
        e = new SecureRandom();
    }

    public d(String str, PublicKey publicKey, ArrayList arrayList, ArrayList arrayList2, net.luminis.tls.f fVar, ArrayList arrayList3, net.luminis.tls.a aVar) throws Throwable {
        net.luminis.tls.extension.a aVar2;
        Throwable th;
        new ArrayList();
        this.c = arrayList;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(3000);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put(new byte[3]);
        byteBufferAllocate.put((byte) 3);
        byteBufferAllocate.put((byte) 3);
        byte[] bArr = new byte[32];
        this.b = bArr;
        e.nextBytes(bArr);
        byteBufferAllocate.put(bArr);
        byte[] bArr2 = new byte[0];
        byteBufferAllocate.put((byte) bArr2.length);
        if (bArr2.length > 0) {
            byteBufferAllocate.put(bArr2);
        }
        byteBufferAllocate.putShort((short) (arrayList.size() * 2));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.putShort(((net.luminis.tls.c) it.next()).e);
        }
        byteBufferAllocate.put(new byte[]{1, 0});
        net.luminis.tls.extension.a aVar3 = new net.luminis.tls.extension.a();
        aVar3.b = str;
        net.luminis.tls.e eVar = net.luminis.tls.e.client_hello;
        n nVar = new n(eVar);
        net.luminis.tls.extension.a aVar4 = new net.luminis.tls.extension.a(fVar);
        m mVar = new m();
        new ArrayList();
        mVar.a = arrayList2;
        j jVar = new j();
        ArrayList arrayList4 = new ArrayList();
        jVar.b = arrayList4;
        jVar.a = eVar;
        if (!j.d.contains(fVar)) {
            net.luminis.tls.engine.impl.c.d(fVar, "not supported", "Named group ");
            throw null;
        }
        arrayList4.add(new i(fVar, publicKey));
        net.luminis.tls.extension.g[] gVarArr = {aVar3, nVar, aVar4, mVar, jVar};
        ArrayList arrayList5 = new ArrayList();
        this.d = arrayList5;
        arrayList5.addAll(Arrays.asList(gVarArr));
        int iE = androidx.constraintlayout.core.g.e(3);
        if (iE == 1) {
            aVar2 = new net.luminis.tls.extension.a(net.luminis.tls.g.psk_ke);
        } else if (iE == 2) {
            aVar2 = new net.luminis.tls.extension.a(net.luminis.tls.g.psk_dhe_ke);
        } else {
            if (iE != 3) {
                net.luminis.tls.engine.impl.c.a();
                throw null;
            }
            aVar2 = new net.luminis.tls.extension.a(new net.luminis.tls.g[]{net.luminis.tls.g.psk_ke, net.luminis.tls.g.psk_dhe_ke});
        }
        arrayList5.add(aVar2);
        arrayList5.addAll(arrayList3);
        Iterator it2 = arrayList5.iterator();
        int length = 0;
        while (it2.hasNext()) {
            length += ((net.luminis.tls.extension.g) it2.next()).a().length;
        }
        byteBufferAllocate.putShort((short) length);
        int iPosition = -1;
        net.luminis.tls.extension.e eVar2 = null;
        for (net.luminis.tls.extension.g gVar : this.d) {
            if (gVar instanceof net.luminis.tls.extension.e) {
                eVar2 = (net.luminis.tls.extension.e) gVar;
                iPosition = byteBufferAllocate.position();
            }
            byteBufferAllocate.put(gVar.a());
        }
        int iPosition2 = byteBufferAllocate.position();
        byteBufferAllocate.putShort(2, (short) (iPosition2 - 4));
        byte[] bArr3 = new byte[iPosition2];
        this.a = bArr3;
        byteBufferAllocate.get(bArr3);
        if (eVar2 == null) {
            return;
        }
        if (aVar == null) {
            net.luminis.tls.engine.impl.c.o("BinderCalculator cannot be null when ClientHelloPreSharedKeyExtension is present");
            throw null;
        }
        byte[] bArr4 = new byte[eVar2.c + iPosition];
        ByteBuffer.wrap(bArr3).get(bArr4);
        ArrayList arrayList6 = eVar2.b;
        net.luminis.tls.engine.impl.d dVar = (net.luminis.tls.engine.impl.d) aVar;
        MessageDigest messageDigest = dVar.a;
        StringBuilder sb = new StringBuilder("HmacSHA");
        short s = dVar.e;
        sb.append(s * 8);
        String string = sb.toString();
        try {
            messageDigest.reset();
            messageDigest.update(bArr4);
            byte[] bArrDigest = messageDigest.digest();
            th = null;
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(dVar.c(dVar.k, "finished", "".getBytes(net.luminis.tls.engine.impl.d.u), s), string);
                Mac mac = Mac.getInstance(string);
                mac.init(secretKeySpec);
                mac.update(bArrDigest);
                arrayList6.set(0, new net.luminis.tls.extension.c(mac.doFinal()));
                byteBufferAllocate.put(eVar2.a());
                byteBufferAllocate.get(bArr3);
            } catch (InvalidKeyException unused) {
                com.google.gson.b.l();
                throw th;
            } catch (NoSuchAlgorithmException unused2) {
                org.mozilla.javascript.c.b(androidx.privacysandbox.ads.adservices.java.internal.a.q("Missing ", string, " support"));
                throw th;
            }
        } catch (InvalidKeyException unused3) {
            th = null;
        } catch (NoSuchAlgorithmException unused4) {
            th = null;
        }
    }

    @Override // net.luminis.tls.handshake.e
    public final byte[] a() {
        return this.a;
    }

    @Override // net.luminis.tls.handshake.e
    public final net.luminis.tls.e b() {
        return net.luminis.tls.e.client_hello;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            sb.append(((net.luminis.tls.c) it.next()).toString());
            sb.append(", ");
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            sb2.append(((net.luminis.tls.extension.g) it2.next()).toString());
            sb2.append(", ");
        }
        return "ClientHello[" + ((Object) sb) + "|" + ((Object) sb2) + "]";
    }

    public d(ByteBuffer byteBuffer, l lVar) throws net.luminis.tls.alert.a {
        this.c = new ArrayList();
        int iPosition = byteBuffer.position();
        if (byteBuffer.remaining() >= 4) {
            if (byteBuffer.remaining() >= 47) {
                if (byteBuffer.get() == net.luminis.tls.e.client_hello.e) {
                    if (byteBuffer.remaining() >= (((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255))) {
                        if (byteBuffer.getShort() == 771) {
                            byte[] bArr = new byte[32];
                            this.b = bArr;
                            byteBuffer.get(bArr);
                            int i = byteBuffer.get();
                            if (i > 0) {
                                byteBuffer.get(new byte[i]);
                            }
                            short s = byteBuffer.getShort();
                            for (int i2 = 0; i2 < s; i2 += 2) {
                                short s2 = byteBuffer.getShort();
                                for (net.luminis.tls.c cVar : net.luminis.tls.c.values()) {
                                    if (cVar.e == s2) {
                                        this.c.add(cVar);
                                        break;
                                    }
                                }
                            }
                            byte b = byteBuffer.get();
                            byte b2 = byteBuffer.get();
                            if (b == 1 && b2 == 0) {
                                int iPosition2 = byteBuffer.position();
                                ArrayList arrayListC = e.c(byteBuffer, net.luminis.tls.e.client_hello, lVar);
                                this.d = arrayListC;
                                Iterator it = arrayListC.iterator();
                                while (it.hasNext()) {
                                    if (((net.luminis.tls.extension.g) it.next()) instanceof k) {
                                        int i3 = byteBuffer.getShort() & 65535;
                                        while (i3 > 4) {
                                            byteBuffer.position();
                                            byteBuffer.getShort();
                                            int i4 = byteBuffer.getShort() & 65535;
                                            byteBuffer.get(new byte[i4]);
                                            i3 -= i4 + 4;
                                        }
                                        if (!(androidx.privacysandbox.ads.adservices.java.internal.a.j(1, this.d) instanceof k)) {
                                            throw new net.luminis.tls.alert.a("pre_shared_key extension MUST be the last extension in the ClientHello", 5);
                                        }
                                        break;
                                    }
                                }
                                byte[] bArr2 = new byte[byteBuffer.position() - iPosition];
                                this.a = bArr2;
                                byteBuffer.get(bArr2);
                                return;
                            }
                            throw new net.luminis.tls.alert.a("Invalid legacy compression method", 5);
                        }
                        net.luminis.tls.engine.impl.c.g("legacy version must be 0303");
                        throw null;
                    }
                    net.luminis.tls.engine.impl.c.g("message underflow");
                    throw null;
                }
                com.google.gson.b.l();
                throw null;
            }
            net.luminis.tls.engine.impl.c.g("message underflow");
            throw null;
        }
        net.luminis.tls.engine.impl.c.g("message underflow");
        throw null;
    }
}
