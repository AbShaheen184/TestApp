package net.luminis.quic.tls;

import androidx.compose.ui.res.e;
import com.google.android.material.textfield.p;
import com.google.common.base.b;
import com.google.common.util.concurrent.g0;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.luminis.quic.impl.m;
import net.luminis.quic.impl.n;
import net.luminis.tls.engine.impl.c;
import net.luminis.tls.extension.g;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g {
    public final n a;
    public final int b;
    public byte[] c;
    public final m d;

    public a(n nVar) {
        this.a = nVar;
        this.d = new m();
    }

    public static void c(int i, long j, ByteBuffer byteBuffer) {
        p.l(byteBuffer, androidx.constraintlayout.core.g.e(i));
        int iK = p.k(j, byteBuffer);
        p.l(byteBuffer, iK);
        p.k(j, byteBuffer);
    }

    public static void d(ByteBuffer byteBuffer, int i, byte[] bArr) {
        p.l(byteBuffer, i);
        p.l(byteBuffer, bArr.length);
        byteBuffer.put(bArr);
    }

    @Override // net.luminis.tls.extension.g
    public final byte[] a() {
        byte[] bArr;
        byte[] bArr2;
        if (this.c == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0 + LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            n nVar = n.b;
            n nVar2 = this.a;
            byteBufferAllocate.putShort((short) ((nVar2.equals(nVar) || nVar2.b()) ? 57 : 65445));
            byteBufferAllocate.putShort((short) 0);
            int i = this.b;
            m mVar = this.d;
            if (i == 2) {
                d(byteBufferAllocate, 0, mVar.a);
            }
            c(2, mVar.b, byteBufferAllocate);
            if (i == 2 && (bArr2 = mVar.p) != null) {
                d(byteBufferAllocate, 2, bArr2);
            }
            c(4, mVar.o, byteBufferAllocate);
            c(5, mVar.c, byteBufferAllocate);
            c(6, mVar.d, byteBufferAllocate);
            c(7, mVar.e, byteBufferAllocate);
            c(8, mVar.f, byteBufferAllocate);
            c(9, mVar.g, byteBufferAllocate);
            c(10, mVar.h, byteBufferAllocate);
            c(11, mVar.i, byteBufferAllocate);
            c(12, mVar.k, byteBufferAllocate);
            if (mVar.j) {
                p.l(byteBufferAllocate, 12);
                p.l(byteBufferAllocate, 0);
            }
            c(15, mVar.l, byteBufferAllocate);
            d(byteBufferAllocate, 15, mVar.m);
            if (i == 2 && (bArr = mVar.n) != null) {
                d(byteBufferAllocate, 16, bArr);
            }
            g0 g0Var = mVar.q;
            if (g0Var != null) {
                ArrayList arrayList = (ArrayList) g0Var.z;
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate((arrayList.size() * 4) + 4);
                byteBufferAllocate2.put(((n) g0Var.y).a());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    byteBufferAllocate2.put(((n) it.next()).a());
                }
                d(byteBufferAllocate, 17, byteBufferAllocate2.array());
            }
            int iPosition = byteBufferAllocate.position();
            byteBufferAllocate.putShort(2, (short) (iPosition - 4));
            this.c = new byte[iPosition];
            byteBufferAllocate.get(this.c);
        }
        return this.c;
    }

    public final void e(ByteBuffer byteBuffer, net.luminis.quic.log.a aVar) throws net.luminis.tls.alert.a {
        boolean z;
        long jS = p.s(byteBuffer);
        int iR = p.r(byteBuffer);
        if (byteBuffer.remaining() < iR) {
            c.g("Invalid transport parameter extension");
            return;
        }
        int iPosition = byteBuffer.position();
        int iCharCount = 0;
        long j = 0;
        m mVar = this.d;
        if (jS == j) {
            byte[] bArr = new byte[iR];
            byteBuffer.get(bArr);
            aVar.getClass();
            mVar.a = bArr;
        } else if (jS == 1) {
            long jS2 = p.s(byteBuffer);
            aVar.getClass();
            mVar.b = jS2;
        } else if (jS == 2) {
            byte[] bArr2 = new byte[16];
            byteBuffer.get(bArr2);
            "- stateless reset token: ".concat(b.b(bArr2));
            aVar.getClass();
            mVar.p = bArr2;
        } else if (jS == 3) {
            int iR2 = p.r(byteBuffer);
            aVar.getClass();
            mVar.o = iR2;
        } else if (jS == 4) {
            long jS3 = p.s(byteBuffer);
            aVar.getClass();
            mVar.c = jS3;
        } else if (jS == 5) {
            long jS4 = p.s(byteBuffer);
            aVar.getClass();
            mVar.d = jS4;
        } else if (jS == 6) {
            long jS5 = p.s(byteBuffer);
            aVar.getClass();
            mVar.e = jS5;
        } else if (jS == 7) {
            long jS6 = p.s(byteBuffer);
            aVar.getClass();
            mVar.f = jS6;
        } else if (jS == 8) {
            long jS7 = p.s(byteBuffer);
            aVar.getClass();
            mVar.g = jS7;
        } else if (jS == 9) {
            long jS8 = p.s(byteBuffer);
            aVar.getClass();
            mVar.h = jS8;
        } else if (jS == 10) {
            int iR3 = p.r(byteBuffer);
            aVar.getClass();
            mVar.i = iR3;
        } else if (jS == 11) {
            int iR4 = p.r(byteBuffer);
            aVar.getClass();
            mVar.k = iR4;
        } else if (jS == 12) {
            aVar.getClass();
            mVar.j = true;
        } else if (jS == 13) {
            try {
                byte[] bArr3 = new byte[4];
                byteBuffer.get(bArr3);
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        z = true;
                        break;
                    } else {
                        if (bArr3[i] != 0) {
                            z = false;
                            break;
                        }
                        i++;
                    }
                }
                InetAddress byAddress = !z ? InetAddress.getByAddress(bArr3) : null;
                byteBuffer.get();
                byteBuffer.get();
                byte[] bArr4 = new byte[16];
                byteBuffer.get(bArr4);
                int i2 = 0;
                while (true) {
                    if (i2 >= 16) {
                        iCharCount = 1;
                        break;
                    } else if (bArr4[i2] != 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
                InetAddress byAddress2 = iCharCount == 0 ? InetAddress.getByAddress(bArr4) : null;
                byteBuffer.get();
                byteBuffer.get();
                if (byAddress == null && byAddress2 == null) {
                    throw new e("Preferred address: no valid IP address", 15);
                }
                byteBuffer.get(new byte[byteBuffer.get()]);
                byteBuffer.get(new byte[16]);
                mVar.getClass();
            } catch (UnknownHostException unused) {
                com.google.gson.b.l();
                return;
            }
        } else if (jS == 14) {
            long jS9 = p.s(byteBuffer);
            aVar.getClass();
            mVar.l = (int) jS9;
        } else if (jS == 15) {
            byte[] bArr5 = new byte[iR];
            byteBuffer.get(bArr5);
            "- initial source connection id: ".concat(b.b(bArr5));
            aVar.getClass();
            mVar.m = bArr5;
        } else if (jS == 16) {
            byte[] bArr6 = new byte[iR];
            byteBuffer.get(bArr6);
            "- retry source connection id: ".concat(b.b(bArr6));
            aVar.getClass();
            mVar.n = bArr6;
        } else if (jS != 17) {
            String str = jS == 32 ? "datagram" : "";
            if (jS == 64) {
                str = "multi-path";
            }
            if (jS == 4183) {
                str = "loss-bits";
            }
            if (jS == 5950) {
                str = "discard";
            }
            if (jS == 10930) {
                str = "grease-quic-bit";
            }
            if (jS == 29015) {
                str = "timestamp";
            }
            String str2 = jS != 29016 ? str : "timestamp";
            if (jS == 29659) {
                str2 = "version-negotiation";
            }
            if (jS == 56858) {
                str2 = "delayed-ack";
            }
            if (jS == 16741339) {
                str2 = "version-information-4-13";
            }
            String str3 = jS != 4278378010L ? str2 : "delayed-ack";
            int length = str3.length();
            while (true) {
                if (iCharCount >= length) {
                    String.format("- unknown transport parameter 0x%04x, size %d", Long.valueOf(jS), Integer.valueOf(iR));
                    break;
                }
                int iCodePointAt = str3.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    String.format("- unsupported transport parameter 0x%04x, size %d (%s)", Long.valueOf(jS), Integer.valueOf(iR), str3);
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            aVar.getClass();
            byteBuffer.get(new byte[iR]);
        } else {
            if (iR % 4 != 0 || iR < 4) {
                c.g("invalid parameters size");
                return;
            }
            int i3 = byteBuffer.getInt();
            ArrayList arrayList = new ArrayList();
            while (iCharCount < (iR / 4) - 1) {
                arrayList.add(new n(byteBuffer.getInt()));
                iCharCount++;
            }
            mVar.q = new g0(15, new n(i3), arrayList, false);
        }
        if (byteBuffer.position() - iPosition == iR) {
            return;
        }
        c.g("inconsistent size in transport parameter");
    }

    public a(n nVar, m mVar) {
        this.a = nVar;
        this.d = mVar;
        this.b = 1;
    }
}
