package net.luminis.tls.engine.impl;

import androidx.media3.exoplayer.dash.manifest.t;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.XECPublicKey;
import javax.crypto.KeyAgreement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements net.luminis.tls.a {
    public static final Charset u = Charset.forName("ISO-8859-1");
    public static final String v = "tls13 ";
    public final MessageDigest a;
    public final t b;
    public final byte[] c;
    public final short d;
    public final short e;
    public boolean f;
    public PublicKey g;
    public PrivateKey h;
    public final byte[] i;
    public byte[] j;
    public byte[] k;
    public byte[] l;
    public byte[] m;
    public byte[] n;
    public byte[] o;
    public byte[] p;
    public byte[] q;
    public final f r;
    public byte[] s;
    public byte[] t;

    /* JADX WARN: Multi-variable type inference failed */
    public d(f fVar, byte[] bArr, int i, int i2) {
        this.i = bArr;
        this.r = fVar;
        this.d = (short) i;
        int i3 = (short) i2;
        this.e = i3;
        StringBuilder sb = new StringBuilder("SHA-");
        int i4 = i3 * 8;
        sb.append(i4);
        String string = sb.toString();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(string);
            this.a = messageDigest;
            this.b = new t(new androidx.media3.container.a(androidx.privacysandbox.ads.adservices.java.internal.a.l(i4, "HmacSHA"), false), 13);
            byte[] bArrDigest = messageDigest.digest(new byte[0]);
            this.c = bArrDigest;
            net.luminis.tls.util.a.a(bArrDigest);
            a(bArr == null ? new byte[i3] : bArr);
        } catch (NoSuchAlgorithmException unused) {
            org.mozilla.javascript.c.b(androidx.privacysandbox.ads.adservices.java.internal.a.q("Missing ", string, " support"));
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(byte[] bArr) {
        int i = this.e;
        byte[] bArrH = this.b.H(new byte[i], bArr);
        this.j = bArrH;
        net.luminis.tls.util.a.a(bArrH);
        byte[] bArrC = c(this.j, "res binder", this.c, i);
        this.k = bArrC;
        net.luminis.tls.util.a.a(bArrC);
    }

    public final void b() {
        KeyAgreement keyAgreement;
        try {
            PublicKey publicKey = this.g;
            if (publicKey instanceof ECPublicKey) {
                keyAgreement = KeyAgreement.getInstance("ECDH");
            } else {
                if (!(publicKey instanceof XECPublicKey)) {
                    throw new RuntimeException("Unsupported key type");
                }
                keyAgreement = KeyAgreement.getInstance("XDH");
            }
            keyAgreement.init(this.h);
            keyAgreement.doPhase(this.g, true);
            byte[] bArrGenerateSecret = keyAgreement.generateSecret();
            this.s = bArrGenerateSecret;
            net.luminis.tls.util.a.a(bArrGenerateSecret);
        } catch (InvalidKeyException e) {
            e = e;
            com.google.gson.b.t(e, "Unsupported crypto: ");
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            com.google.gson.b.t(e, "Unsupported crypto: ");
        }
    }

    public final byte[] c(byte[] bArr, String str, byte[] bArr2, short s) {
        String str2 = v;
        int length = str2.length() + 3;
        Charset charset = u;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + str.getBytes(charset).length + 1 + bArr2.length);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.put((byte) (str2.length() + str.getBytes().length));
        byteBufferAllocate.put(str2.getBytes(charset));
        byteBufferAllocate.put(str.getBytes(charset));
        byteBufferAllocate.put((byte) bArr2.length);
        byteBufferAllocate.put(bArr2);
        return this.b.G(bArr, byteBufferAllocate.array(), s);
    }
}
