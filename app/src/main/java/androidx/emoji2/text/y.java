package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final com.google.firebase.messaging.o b;
    public volatile int c = 0;

    public y(com.google.firebase.messaging.o oVar, int i) {
        this.b = oVar;
        this.a = i;
    }

    public final int a(int i) {
        androidx.emoji2.text.flatbuffer.a aVarB = b();
        int iB = aVarB.b(16);
        if (iB == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.A;
        int i2 = iB + aVarB.e;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final androidx.emoji2.text.flatbuffer.a b() {
        ThreadLocal threadLocal = d;
        androidx.emoji2.text.flatbuffer.a aVar = (androidx.emoji2.text.flatbuffer.a) threadLocal.get();
        if (aVar == null) {
            aVar = new androidx.emoji2.text.flatbuffer.a();
            threadLocal.set(aVar);
        }
        androidx.emoji2.text.flatbuffer.b bVar = (androidx.emoji2.text.flatbuffer.b) this.b.y;
        int iB = bVar.b(6);
        if (iB != 0) {
            int i = iB + bVar.e;
            int i2 = (this.a * 4) + ((ByteBuffer) bVar.A).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) bVar.A).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.A;
            aVar.A = byteBuffer;
            if (byteBuffer != null) {
                aVar.e = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                aVar.y = i4;
                aVar.z = ((ByteBuffer) aVar.A).getShort(i4);
                return aVar;
            }
            aVar.e = 0;
            aVar.y = 0;
            aVar.z = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        androidx.emoji2.text.flatbuffer.a aVarB = b();
        int iB = aVarB.b(4);
        sb.append(Integer.toHexString(iB != 0 ? ((ByteBuffer) aVarB.A).getInt(iB + aVarB.e) : 0));
        sb.append(", codepoints:");
        androidx.emoji2.text.flatbuffer.a aVarB2 = b();
        int iB2 = aVarB2.b(16);
        if (iB2 != 0) {
            int i2 = iB2 + aVarB2.e;
            i = ((ByteBuffer) aVarB2.A).getInt(((ByteBuffer) aVarB2.A).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
