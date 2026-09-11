package net.luminis.tls.extension;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.XECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.NamedParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends g {
    public static final HashMap c;
    public static final ArrayList d;
    public net.luminis.tls.e a;
    public ArrayList b;

    static {
        HashMap map = new HashMap(3);
        c = map;
        ArrayList arrayList = new ArrayList(2);
        d = arrayList;
        net.luminis.tls.f fVar = net.luminis.tls.f.secp256r1;
        map.put(fVar, 65);
        net.luminis.tls.f fVar2 = net.luminis.tls.f.x25519;
        map.put(fVar2, 32);
        map.put(net.luminis.tls.f.x448, 56);
        arrayList.add(fVar);
        arrayList.add(fVar2);
    }

    public static ECParameterSpec c(String str) {
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
            algorithmParameters.init(new ECGenParameterSpec(str));
            return (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class);
        } catch (NoSuchAlgorithmException unused) {
            org.mozilla.javascript.c.b("Missing support for EC algorithm");
            return null;
        } catch (InvalidParameterSpecException unused2) {
            org.mozilla.javascript.c.b("Inappropriate parameter specification");
            return null;
        }
    }

    public static void e(byte[] bArr) {
        int length = bArr.length - 1;
        for (int i = 0; length > i; i++) {
            byte b = bArr[length];
            bArr[length] = bArr[i];
            bArr[i] = b;
            length--;
        }
    }

    public static void f(ByteBuffer byteBuffer, byte[] bArr) {
        if (bArr.length == 32) {
            byteBuffer.put(bArr);
            return;
        }
        if (bArr.length < 32) {
            for (int i = 0; i < 32 - bArr.length; i++) {
                byteBuffer.put((byte) 0);
            }
            byteBuffer.put(bArr, 0, bArr.length);
            return;
        }
        if (bArr.length > 32) {
            for (int i2 = 0; i2 < bArr.length - 32; i2++) {
                if (bArr[i2] != 0) {
                    throw new RuntimeException("W Affine more then 32 bytes, leading bytes not 0 " + net.luminis.tls.util.a.a(bArr));
                }
            }
            byteBuffer.put(bArr, bArr.length - 32, 32);
        }
    }

    @Override // net.luminis.tls.extension.g
    public final byte[] a() {
        HashMap map;
        net.luminis.tls.e eVar = this.a;
        ArrayList<i> arrayList = this.b;
        Iterator it = arrayList.iterator();
        short sIntValue = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            map = c;
            if (!zHasNext) {
                break;
            }
            sIntValue = (short) (((Integer) map.get(((i) it.next()).a)).intValue() + 4 + sIntValue);
        }
        net.luminis.tls.e eVar2 = net.luminis.tls.e.client_hello;
        short s = eVar == eVar2 ? (short) (sIntValue + 2) : sIntValue;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(s + 4);
        byteBufferAllocate.putShort(net.luminis.tls.d.key_share.e);
        byteBufferAllocate.putShort(s);
        if (eVar == eVar2) {
            byteBufferAllocate.putShort(sIntValue);
        }
        for (i iVar : arrayList) {
            byteBufferAllocate.putShort(iVar.a.e);
            byteBufferAllocate.putShort(((Integer) map.get(iVar.a)).shortValue());
            net.luminis.tls.f fVar = iVar.a;
            if (fVar == net.luminis.tls.f.secp256r1) {
                byteBufferAllocate.put((byte) 4);
                f(byteBufferAllocate, ((ECPublicKey) iVar.a()).getW().getAffineX().toByteArray());
                f(byteBufferAllocate, ((ECPublicKey) iVar.a()).getW().getAffineY().toByteArray());
            } else {
                if (fVar != net.luminis.tls.f.x25519 && fVar != net.luminis.tls.f.x448) {
                    com.google.gson.b.l();
                    return null;
                }
                byte[] byteArray = ((XECPublicKey) iVar.a()).getU().toByteArray();
                int length = byteArray.length;
                int iIntValue = ((Integer) map.get(iVar.a)).intValue();
                net.luminis.tls.f fVar2 = iVar.a;
                if (length > iIntValue) {
                    StringBuilder sb = new StringBuilder("Invalid ");
                    sb.append(fVar2);
                    int length2 = byteArray.length;
                    sb.append(" key length: ");
                    sb.append(length2);
                    throw new RuntimeException(sb.toString());
                }
                if (byteArray.length < ((Integer) map.get(fVar2)).intValue()) {
                    e(byteArray);
                    byteArray = Arrays.copyOf(byteArray, ((Integer) map.get(iVar.a)).intValue());
                } else {
                    e(byteArray);
                }
                byteBufferAllocate.put(byteArray);
            }
        }
        return byteBufferAllocate.array();
    }

    public final int d(ByteBuffer byteBuffer) throws net.luminis.tls.alert.a {
        net.luminis.tls.f fVar;
        ArrayList arrayList = this.b;
        int iPosition = byteBuffer.position();
        if (byteBuffer.remaining() < 4) {
            net.luminis.tls.engine.impl.c.g("extension underflow");
            return 0;
        }
        short s = byteBuffer.getShort();
        net.luminis.tls.f[] fVarArrValues = net.luminis.tls.f.values();
        int length = fVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                fVar = null;
                break;
            }
            fVar = fVarArrValues[i];
            if (fVar.e == s) {
                break;
            }
            i++;
        }
        int i2 = byteBuffer.getShort();
        if (byteBuffer.remaining() < i2) {
            net.luminis.tls.engine.impl.c.g("extension underflow");
            return 0;
        }
        if (fVar == null || !d.contains(fVar)) {
            byteBuffer.get(new byte[i2]);
        } else {
            if (i2 != ((Integer) c.get(fVar)).intValue()) {
                throw new net.luminis.tls.alert.a("Invalid " + fVar.name() + " key length: " + i2, 2);
            }
            if (fVar == net.luminis.tls.f.secp256r1) {
                if (byteBuffer.get() != 4) {
                    net.luminis.tls.engine.impl.c.g("EC keys must be in legacy form");
                    return 0;
                }
                int i3 = i2 - 1;
                byte[] bArr = new byte[i3];
                byteBuffer.get(bArr);
                try {
                    arrayList.add(new h(fVar, (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, i3 / 2)), new BigInteger(1, Arrays.copyOfRange(bArr, i3 / 2, i3))), c(fVar.name())))));
                } catch (NoSuchAlgorithmException unused) {
                    org.mozilla.javascript.c.b("Missing support for EC algorithm");
                    return 0;
                } catch (InvalidKeySpecException unused2) {
                    org.mozilla.javascript.c.b("Inappropriate parameter specification");
                    return 0;
                }
            } else if (fVar == net.luminis.tls.f.x25519 || fVar == net.luminis.tls.f.x448) {
                byte[] bArr2 = new byte[i2];
                byteBuffer.get(bArr2);
                try {
                    e(bArr2);
                    BigInteger bigInteger = new BigInteger(bArr2);
                    KeyFactory keyFactory = KeyFactory.getInstance("XDH");
                    androidx.compose.ui.text.android.c.d();
                    NamedParameterSpec namedParameterSpecB = androidx.compose.ui.text.android.c.b(fVar.name().toUpperCase());
                    androidx.compose.ui.text.android.c.e();
                    arrayList.add(new i(fVar, keyFactory.generatePublic(androidx.compose.ui.text.android.c.c(namedParameterSpecB, bigInteger))));
                } catch (NoSuchAlgorithmException unused3) {
                    org.mozilla.javascript.c.b("Missing support for EC algorithm");
                    return 0;
                } catch (InvalidKeySpecException unused4) {
                    org.mozilla.javascript.c.b("Inappropriate parameter specification");
                    return 0;
                }
            }
        }
        return byteBuffer.position() - iPosition;
    }
}
