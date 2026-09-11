package com.appsalt.internal;

import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                BuildersKt__BuildersKt.runBlocking$default(null, new l0((y0) this.b, (net.luminis.quic.stream.e) obj, null, 1), 1, null);
                break;
            case 1:
                net.luminis.quic.cid.b bVar = (net.luminis.quic.cid.b) this.b;
                bVar.c.f((net.luminis.quic.frame.n) obj, 4, new x0(bVar, 1));
                break;
            case 2:
                net.luminis.quic.crypto.f fVar = (net.luminis.quic.crypto.f) this.b;
                net.luminis.quic.frame.n nVar = (net.luminis.quic.frame.n) obj;
                net.luminis.quic.log.a aVar = fVar.e;
                Objects.toString(nVar);
                int i = fVar.b;
                aVar.getClass();
                fVar.f.f(nVar, i, new x0(fVar, 2));
                break;
            case 3:
                ((net.luminis.quic.impl.i) this.b).a((Throwable) obj);
                break;
            case 4:
                net.luminis.quic.stream.n nVar2 = (net.luminis.quic.stream.n) this.b;
                nVar2.getClass();
                boolean z = ((net.luminis.quic.frame.g) ((net.luminis.quic.frame.n) obj)).y;
                net.luminis.quic.impl.i iVar = nVar2.b;
                if (!z) {
                    iVar.j(nVar2.d(Integer.MAX_VALUE), new x0(nVar2, 4), false);
                } else {
                    iVar.j(nVar2.c(Integer.MAX_VALUE), new x0(nVar2, 4), false);
                }
                break;
            case 5:
                ((org.schabi.newpipe.extractor.channel.d) this.b).b((org.schabi.newpipe.extractor.services.bandcamp.extractors.e) obj);
                break;
            case 6:
                ((List) this.b).add((org.schabi.newpipe.extractor.stream.j) obj);
                break;
            case 7:
                ((org.schabi.newpipe.extractor.channel.d) this.b).A((org.schabi.newpipe.extractor.services.youtube.extractors.a0) obj);
                break;
            case 8:
                ((org.schabi.newpipe.extractor.j) this.b).b((org.schabi.newpipe.extractor.d) obj);
                break;
            default:
                ((org.schabi.newpipe.extractor.services.youtube.a) this.b).E = (Locale) obj;
                break;
        }
    }
}
