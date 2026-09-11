package net.luminis.tls.engine.impl;

import com.google.android.gms.measurement.internal.c0;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import net.luminis.tls.h;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements net.luminis.tls.engine.b {
    public PublicKey a;
    public PrivateKey b;
    public d c;
    public c0 d;

    public static int c(net.luminis.tls.c cVar) {
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            return 32;
        }
        if (iOrdinal == 1) {
            return 48;
        }
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            return 32;
        }
        com.google.gson.b.l();
        return 0;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        d dVar = this.c;
        short s = dVar.e;
        dVar.getClass();
        byte[] bArrC = dVar.c(bArr2, "finished", "".getBytes(d.u), s);
        String str = "HmacSHA" + (s * 8);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrC, str);
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(secretKeySpec);
            mac.update(bArr);
            return mac.doFinal();
        } catch (InvalidKeyException unused) {
            com.google.gson.b.l();
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            org.mozilla.javascript.c.b(androidx.privacysandbox.ads.adservices.java.internal.a.q("Missing ", str, " support"));
            return null;
        }
    }

    public final Signature b(h hVar) {
        c0 c0Var = this.d;
        if (hVar.equals(h.rsa_pss_rsae_sha256)) {
            try {
                c0Var.getClass();
                Signature signature = Signature.getInstance("RSASSA-PSS");
                signature.setParameter(new PSSParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), 32, 1));
                return signature;
            } catch (InvalidAlgorithmParameterException e) {
                c.k(e);
                return null;
            } catch (NoSuchAlgorithmException unused) {
                org.mozilla.javascript.c.b("Missing RSASSA-PSS support");
                return null;
            }
        }
        if (hVar.equals(h.rsa_pss_rsae_sha384)) {
            try {
                c0Var.getClass();
                Signature signature2 = Signature.getInstance("RSASSA-PSS");
                signature2.setParameter(new PSSParameterSpec("SHA-384", "MGF1", new MGF1ParameterSpec("SHA-384"), 48, 1));
                return signature2;
            } catch (InvalidAlgorithmParameterException e2) {
                c.k(e2);
                return null;
            } catch (NoSuchAlgorithmException unused2) {
                org.mozilla.javascript.c.b("Missing RSASSA-PSS support");
                return null;
            }
        }
        if (hVar.equals(h.rsa_pss_rsae_sha512)) {
            try {
                c0Var.getClass();
                Signature signature3 = Signature.getInstance("RSASSA-PSS");
                signature3.setParameter(new PSSParameterSpec("SHA-512", "MGF1", new MGF1ParameterSpec("SHA-512"), 64, 1));
                return signature3;
            } catch (InvalidAlgorithmParameterException e3) {
                c.k(e3);
                return null;
            } catch (NoSuchAlgorithmException unused3) {
                org.mozilla.javascript.c.b("Missing RSASSA-PSS support");
                return null;
            }
        }
        if (hVar.equals(h.ecdsa_secp256r1_sha256)) {
            try {
                return Signature.getInstance("SHA256withECDSA");
            } catch (NoSuchAlgorithmException unused4) {
                org.mozilla.javascript.c.b("Missing SHA256withECDSA support");
                return null;
            }
        }
        if (hVar.equals(h.ecdsa_secp384r1_sha384)) {
            try {
                return Signature.getInstance("SHA384withECDSA");
            } catch (NoSuchAlgorithmException unused5) {
                org.mozilla.javascript.c.b("Missing SHA384withECDSA support");
                return null;
            }
        }
        if (hVar.equals(h.ecdsa_secp521r1_sha512)) {
            try {
                return Signature.getInstance("SHA512withECDSA");
            } catch (NoSuchAlgorithmException unused6) {
                org.mozilla.javascript.c.b("Missing SHA512withECDSA support");
                return null;
            }
        }
        throw new net.luminis.tls.alert.a("Signature algorithm not supported " + hVar, 4);
    }
}
