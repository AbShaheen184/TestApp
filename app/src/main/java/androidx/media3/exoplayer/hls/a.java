package androidx.media3.exoplayer.hls;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements androidx.media3.datasource.h {
    public CipherInputStream A;
    public final androidx.media3.datasource.h e;
    public final byte[] y;
    public final byte[] z;

    public a(androidx.media3.datasource.h hVar, byte[] bArr, byte[] bArr2) {
        this.e = hVar;
        this.y = bArr;
        this.z = bArr2;
    }

    @Override // androidx.media3.datasource.h
    public final void c(androidx.media3.exoplayer.upstream.f fVar) {
        fVar.getClass();
        this.e.c(fVar);
    }

    @Override // androidx.media3.datasource.h
    public final void close() {
        if (this.A != null) {
            this.A = null;
            this.e.close();
        }
    }

    @Override // androidx.media3.datasource.h
    public final Map k() {
        return this.e.k();
    }

    @Override // androidx.media3.common.i
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.A.getClass();
        int i3 = this.A.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }

    @Override // androidx.media3.datasource.h
    public final long t(androidx.media3.datasource.l lVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.y, "AES"), new IvParameterSpec(this.z));
                androidx.media3.datasource.j jVar = new androidx.media3.datasource.j(this.e, lVar);
                this.A = new CipherInputStream(jVar, cipher);
                jVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                net.luminis.tls.engine.impl.c.k(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            net.luminis.tls.engine.impl.c.k(e2);
            return 0L;
        }
    }

    @Override // androidx.media3.datasource.h
    public final Uri v() {
        return this.e.v();
    }
}
