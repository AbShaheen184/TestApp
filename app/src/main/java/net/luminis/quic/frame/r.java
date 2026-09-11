package net.luminis.quic.frame;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends n implements net.luminis.quic.stream.h {
    public int A;
    public byte[] B;
    public boolean C;
    public int D;
    public int e;
    public int y;
    public long z;

    public r(byte[] bArr, int i, long j, boolean z) {
        int length = bArr.length;
        for (int i2 : androidx.constraintlayout.core.g.f(4)) {
            if (androidx.constraintlayout.core.g.e(i2) == (i & 3)) {
                this.e = i2;
                this.y = i;
                this.z = j;
                byte[] bArr2 = new byte[length];
                this.B = bArr2;
                ByteBuffer.wrap(bArr2).put(bArr, 0, length);
                this.A = length;
                this.C = z;
                this.D = com.google.android.material.textfield.p.b(this.A) + com.google.android.material.textfield.p.b(this.z) + com.google.android.material.textfield.p.b(i) + 1 + this.A;
            }
        }
        i2 = 0;
        this.e = i2;
        this.y = i;
        this.z = j;
        byte[] bArr3 = new byte[length];
        this.B = bArr3;
        ByteBuffer.wrap(bArr3).put(bArr, 0, length);
        this.A = length;
        this.C = z;
        this.D = com.google.android.material.textfield.p.b(this.A) + com.google.android.material.textfield.p.b(this.z) + com.google.android.material.textfield.p.b(i) + 1 + this.A;
    }

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
        try {
            iVar.W.h(this);
        } catch (net.luminis.quic.impl.l e) {
            iVar.e(4, e.e.e, null);
        }
    }

    @Override // net.luminis.quic.stream.h
    public final long b() {
        return this.z + ((long) this.A);
    }

    @Override // net.luminis.quic.stream.h
    public final byte[] c() {
        return this.B;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        net.luminis.quic.stream.h hVar = (net.luminis.quic.stream.h) obj;
        return this.z != hVar.getOffset() ? Long.compare(this.z, hVar.getOffset()) : Long.compare(this.A, hVar.getLength());
    }

    @Override // net.luminis.quic.frame.n
    public final int d() {
        return this.D;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.y == rVar.y && this.z == rVar.z && this.A == rVar.A && this.C == rVar.C && Arrays.equals(this.B, rVar.B);
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        if (this.D > byteBuffer.remaining()) {
            net.luminis.tls.engine.impl.c.a();
            return;
        }
        byte b = (byte) 14;
        if (this.C) {
            b = (byte) (b | 1);
        }
        byteBuffer.put(b);
        com.google.android.material.textfield.p.l(byteBuffer, this.y);
        com.google.android.material.textfield.p.k(this.z, byteBuffer);
        com.google.android.material.textfield.p.l(byteBuffer, this.A);
        byteBuffer.put(this.B);
    }

    public final void g(ByteBuffer byteBuffer, net.luminis.quic.log.a aVar) {
        int iPosition = byteBuffer.position();
        byte b = byteBuffer.get();
        int i = 0;
        boolean z = (b & 4) == 4;
        boolean z2 = (b & 2) == 2;
        this.C = (b & 1) == 1;
        this.y = com.google.android.material.textfield.p.r(byteBuffer);
        for (int i2 : androidx.constraintlayout.core.g.f(4)) {
            if (androidx.constraintlayout.core.g.e(i2) == (this.y & 3)) {
                i = i2;
                break;
            }
        }
        this.e = i;
        if (z) {
            this.z = com.google.android.material.textfield.p.s(byteBuffer);
        }
        if (z2) {
            this.A = com.google.android.material.textfield.p.r(byteBuffer);
        } else {
            this.A = byteBuffer.limit() - byteBuffer.position();
        }
        byte[] bArr = new byte[this.A];
        this.B = bArr;
        byteBuffer.get(bArr);
        this.D = byteBuffer.position() - iPosition;
        aVar.getClass();
    }

    @Override // net.luminis.quic.stream.h
    public final int getLength() {
        return this.A;
    }

    @Override // net.luminis.quic.stream.h
    public final long getOffset() {
        return this.z;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.y), Long.valueOf(this.z), Integer.valueOf(this.A));
    }

    @Override // net.luminis.quic.stream.h
    public final boolean isFinal() {
        return this.C;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("StreamFrame[");
        sb.append(this.y);
        sb.append("(");
        int i = this.e;
        if (i == 1) {
            str = "CIB";
        } else if (i == 2) {
            str = "SIB";
        } else if (i == 3) {
            str = "CIU";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "SIU";
        }
        sb.append(str);
        sb.append("),");
        sb.append(this.z);
        sb.append(",");
        sb.append(this.A);
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, this.C ? ",fin" : "", "]");
    }
}
