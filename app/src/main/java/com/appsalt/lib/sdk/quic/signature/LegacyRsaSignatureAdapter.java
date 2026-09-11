package com.appsalt.lib.sdk.quic.signature;

import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.a0;
import kotlin.k;
import kotlin.text.r;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class LegacyRsaSignatureAdapter extends Signature {
    public final Object a;
    public Signature b;

    public LegacyRsaSignatureAdapter() {
        super("RSASSA-PSS");
        Map mapV = a0.v(new k("SHA256", Signature.getInstance("SHA256withRSA/PSS")), new k("SHA384", Signature.getInstance("SHA384withRSA/PSS")), new k("SHA512", Signature.getInstance("SHA512withRSA/PSS")));
        this.a = mapV;
        this.b = (Signature) mapV.get("SHA256");
    }

    @Override // java.security.SignatureSpi
    public final Object engineGetParameter(String str) {
        return this.b.getParameter(str);
    }

    @Override // java.security.SignatureSpi
    public final AlgorithmParameters engineGetParameters() {
        return this.b.getParameters();
    }

    @Override // java.security.SignatureSpi
    public final void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        this.b.initSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    public final void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        this.b.initVerify(publicKey);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    @Override // java.security.SignatureSpi
    public final void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null) {
            return;
        }
        if (algorithmParameterSpec instanceof PSSParameterSpec) {
            String digestAlgorithm = ((PSSParameterSpec) algorithmParameterSpec).getDigestAlgorithm();
            Locale locale = Locale.ROOT;
            this.b = (Signature) this.a.get(r.M(digestAlgorithm.toUpperCase(locale), "-", "", false).toUpperCase(locale));
        }
        this.b.setParameter(algorithmParameterSpec);
    }

    @Override // java.security.SignatureSpi
    public final int engineSign(byte[] bArr, int i, int i2) {
        return this.b.sign(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte b) throws SignatureException {
        this.b.update(b);
    }

    @Override // java.security.SignatureSpi
    public final boolean engineVerify(byte[] bArr) {
        return this.b.verify(bArr);
    }

    @Override // java.security.SignatureSpi
    public final void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.b.initSign(privateKey, secureRandom);
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(ByteBuffer byteBuffer) throws SignatureException {
        this.b.update(byteBuffer);
    }

    @Override // java.security.SignatureSpi
    public final byte[] engineSign() {
        return this.b.sign();
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.b.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public final boolean engineVerify(byte[] bArr, int i, int i2) {
        return this.b.verify(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public final void engineSetParameter(String str, Object obj) {
        this.b.setParameter(str, obj);
    }
}
