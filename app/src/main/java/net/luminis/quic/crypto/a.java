package net.luminis.quic.crypto;

import androidx.media3.exoplayer.dash.manifest.t;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import net.luminis.quic.impl.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static final Charset r = Charset.forName("ISO-8859-1");
    public final net.luminis.quic.log.a a;
    public final n b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public Cipher j;
    public SecretKeySpec k;
    public SecretKeySpec l;
    public Cipher m;
    public int n;
    public boolean o;
    public volatile a p;
    public final /* synthetic */ int q;

    public a(n nVar, byte[] bArr, int i, net.luminis.quic.log.a aVar) {
        this.q = 0;
        this.n = 0;
        this.o = false;
        this.a = aVar;
        this.b = nVar;
        byte[] bArrK = k(bArr, i == 1 ? "client in" : "server in", g());
        aVar.getClass();
        c(bArrK, true, true);
    }

    public final synchronized void a(boolean z) {
        try {
            this.d = k(this.c, (this.b.b() ? "quicv2 " : "quic ").concat("ku"), (short) 32);
            this.a.getClass();
            c(this.d, false, z);
            if (z) {
                this.c = this.d;
                this.n++;
                this.d = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(byte[] bArr) {
        this.c = bArr;
        c(bArr, true, true);
    }

    public final void c(byte[] bArr, boolean z, boolean z2) {
        String str = this.b.b() ? "quicv2 " : "quic ";
        byte[] bArrK = k(bArr, str.concat("key"), h());
        if (z2) {
            this.e = bArrK;
            this.k = null;
        } else {
            this.f = bArrK;
            this.l = null;
        }
        this.a.getClass();
        byte[] bArrK2 = k(bArr, str.concat("iv"), (short) 12);
        if (z2) {
            this.g = bArrK2;
        } else {
            this.h = bArrK2;
        }
        if (z) {
            this.i = k(bArr, str.concat("hp"), h());
        }
    }

    public final synchronized void d() {
        if (this.o) {
            this.a.getClass();
            this.c = this.d;
            this.e = this.f;
            this.k = null;
            this.g = this.h;
            this.n++;
            this.d = null;
            this.o = false;
            this.f = null;
            this.h = null;
            if (this.p.n < this.n) {
                this.a.getClass();
                this.p.a(true);
            }
        }
    }

    public final byte[] e(byte[] bArr) {
        switch (this.q) {
            case 0:
                if (this.j == null) {
                    try {
                        this.j = Cipher.getInstance("AES/ECB/NoPadding");
                        this.j.init(1, new SecretKeySpec(this.i, "AES"));
                    } catch (InvalidKeyException unused) {
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
                try {
                    return this.j.doFinal(bArr);
                } catch (BadPaddingException | IllegalBlockSizeException unused2) {
                    com.google.gson.b.l();
                    return null;
                }
            default:
                try {
                    Cipher cipher = Cipher.getInstance("ChaCha20");
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 4, 16);
                    int i = ByteBuffer.wrap(new byte[]{bArr[3], bArr[2], bArr[1], bArr[0]}).getInt();
                    c.b();
                    cipher.init(1, (Key) new SecretKeySpec(this.i, "ChaCha20"), (AlgorithmParameterSpec) c.a(bArrCopyOfRange, i));
                    return cipher.doFinal(new byte[]{0, 0, 0, 0, 0});
                } catch (InvalidAlgorithmParameterException unused3) {
                    com.google.gson.b.l();
                    return null;
                } catch (InvalidKeyException unused4) {
                    com.google.gson.b.l();
                    return null;
                } catch (NoSuchAlgorithmException e3) {
                    e = e3;
                    throw new androidx.compose.ui.res.e(e, 16);
                } catch (BadPaddingException unused5) {
                    com.google.gson.b.l();
                    return null;
                } catch (IllegalBlockSizeException unused6) {
                    com.google.gson.b.l();
                    return null;
                } catch (NoSuchPaddingException e4) {
                    e = e4;
                    throw new androidx.compose.ui.res.e(e, 16);
                }
        }
    }

    public t f() {
        switch (this.q) {
            case 0:
                break;
        }
        return t.I();
    }

    public short g() {
        switch (this.q) {
        }
        return (short) 32;
    }

    public short h() {
        switch (this.q) {
            case 0:
                return (short) 16;
            default:
                return (short) 32;
        }
    }

    public final Cipher i() {
        switch (this.q) {
            case 0:
                if (this.m == null) {
                    try {
                        this.m = Cipher.getInstance("AES/GCM/NoPadding");
                    } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                        throw new androidx.compose.ui.res.e(e, 16);
                    }
                    break;
                }
                return this.m;
            default:
                if (this.m == null) {
                    try {
                        this.m = Cipher.getInstance("ChaCha20-Poly1305");
                    } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
                        throw new androidx.compose.ui.res.e(e2, 16);
                    }
                    break;
                }
                return this.m;
        }
    }

    public final SecretKeySpec j() {
        switch (this.q) {
            case 0:
                if (this.o) {
                    if (this.l == null) {
                        this.l = new SecretKeySpec(this.f, "AES");
                    }
                    return this.l;
                }
                if (this.k == null) {
                    this.k = new SecretKeySpec(this.e, "AES");
                }
                return this.k;
            default:
                if (this.o) {
                    if (this.l == null) {
                        this.l = new SecretKeySpec(this.f, "ChaCha20-Poly1305");
                    }
                    return this.l;
                }
                if (this.k == null) {
                    this.k = new SecretKeySpec(this.e, "ChaCha20-Poly1305");
                }
                return this.k;
        }
    }

    public final byte[] k(byte[] bArr, String str, short s) {
        Charset charset = r;
        byte[] bytes = "tls13 ".getBytes(charset);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 3 + str.getBytes(charset).length + 1 + "".getBytes(charset).length);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.put((byte) (bytes.length + str.getBytes().length));
        byteBufferAllocate.put(bytes);
        byteBufferAllocate.put(str.getBytes(charset));
        byteBufferAllocate.put((byte) "".getBytes(charset).length);
        byteBufferAllocate.put("".getBytes(charset));
        return f().G(bArr, byteBufferAllocate.array(), s);
    }

    public a(n nVar, int i, net.luminis.quic.log.a aVar, int i2) {
        this.q = i2;
        this.n = 0;
        this.o = false;
        this.a = aVar;
        this.b = nVar;
    }
}
