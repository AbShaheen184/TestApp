package net.luminis.quic.crypto;

import com.appsalt.internal.x0;
import com.google.android.material.textfield.p;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.function.Function;
import net.luminis.quic.impl.n;
import org.jsoup.nodes.o;
import org.schabi.newpipe.extractor.services.youtube.extractors.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                int iIntValue = ((Integer) obj).intValue();
                int i = fVar.n - fVar.m;
                int iMin = Integer.min(i, iIntValue - 10);
                if (iMin == 0) {
                    return null;
                }
                if (iMin < i) {
                    fVar.f.e(new e(fVar, 0), 10, fVar.b, new x0(fVar, 2));
                }
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int iMin2 = Integer.min(iMin - i2, ((ByteBuffer) fVar.k.get(0)).remaining());
                    ((ByteBuffer) fVar.k.get(0)).get(bArr, i2, iMin2);
                    if (((ByteBuffer) fVar.k.get(0)).remaining() == 0) {
                        fVar.k.remove(0);
                    }
                    i2 += iMin2;
                }
                n nVar = fVar.a.a;
                long j = fVar.m;
                net.luminis.quic.frame.c cVar = new net.luminis.quic.frame.c();
                cVar.e = j;
                cVar.z = bArr;
                cVar.y = iMin;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iMin + 12);
                p.l(byteBufferAllocate, 6);
                p.k(j, byteBufferAllocate);
                p.l(byteBufferAllocate, iMin);
                byteBufferAllocate.put(bArr);
                byte[] bArr2 = new byte[byteBufferAllocate.position()];
                byteBufferAllocate.get(bArr2);
                fVar.m += iMin;
                return cVar;
            case 1:
                return ((Class) this.b).cast((o) obj);
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                return new org.schabi.newpipe.extractor.services.media_ccc.extractors.a((com.grack.nanojson.c) this.b, (String) entry.getKey(), (com.grack.nanojson.c) entry.getValue());
            default:
                y yVar = (y) this.b;
                org.schabi.newpipe.extractor.services.youtube.extractors.a aVar = (org.schabi.newpipe.extractor.services.youtube.extractors.a) obj;
                org.schabi.newpipe.extractor.services.youtube.a aVar2 = aVar.y;
                org.schabi.newpipe.extractor.stream.a aVar3 = new org.schabi.newpipe.extractor.stream.a();
                aVar3.a = String.valueOf(aVar2.y);
                String str = aVar.e;
                boolean z = aVar.z;
                aVar3.b = str;
                aVar3.c = z;
                aVar3.e = aVar2.e;
                aVar3.f = aVar2.z;
                aVar3.g = aVar2.C;
                aVar3.h = aVar2.E;
                aVar3.i = aVar2.H;
                aVar3.j = aVar2;
                int i3 = yVar.q;
                if (i3 == 4 || i3 == 6 || !z) {
                    aVar3.d = 2;
                }
                return aVar3.a();
        }
    }
}
