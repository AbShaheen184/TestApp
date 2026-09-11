package androidx.media3.exoplayer.video;

import androidx.media3.common.util.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.media3.exoplayer.audio.t y;

    public /* synthetic */ d0(androidx.media3.exoplayer.audio.t tVar, int i, long j) {
        this.e = 0;
        this.y = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        androidx.media3.exoplayer.audio.t tVar = this.y;
        switch (i) {
            case 0:
                androidx.media3.exoplayer.x xVar = tVar.b;
                String str = j0.a;
                androidx.media3.exoplayer.analytics.g gVar = xVar.e.r;
                gVar.M(gVar.J((androidx.media3.exoplayer.source.v) gVar.A.e), 1018, new androidx.media3.exoplayer.o(26));
                break;
            case 1:
                androidx.media3.exoplayer.x xVar2 = tVar.b;
                String str2 = j0.a;
                androidx.media3.exoplayer.analytics.g gVar2 = xVar2.e.r;
                gVar2.M(gVar2.L(), 1019, new androidx.media3.exoplayer.o(9));
                break;
            case 2:
                androidx.media3.exoplayer.x xVar3 = tVar.b;
                String str3 = j0.a;
                androidx.media3.exoplayer.analytics.g gVar3 = xVar3.e.r;
                gVar3.M(gVar3.J((androidx.media3.exoplayer.source.v) gVar3.A.e), 1021, new androidx.media3.exoplayer.o(27));
                break;
            case 3:
                androidx.media3.exoplayer.x xVar4 = tVar.b;
                String str4 = j0.a;
                androidx.media3.exoplayer.analytics.g gVar4 = xVar4.e.r;
                gVar4.M(gVar4.L(), 1015, new androidx.media3.exoplayer.analytics.d(6));
                break;
            case 4:
                androidx.media3.exoplayer.x xVar5 = tVar.b;
                String str5 = j0.a;
                androidx.media3.exoplayer.analytics.g gVar5 = xVar5.e.r;
                gVar5.M(gVar5.L(), 1017, new androidx.media3.exoplayer.analytics.d(2));
                break;
            case 5:
                androidx.media3.exoplayer.x xVar6 = tVar.b;
                String str6 = j0.a;
                androidx.media3.exoplayer.analytics.g gVar6 = xVar6.e.r;
                gVar6.M(gVar6.L(), 1016, new androidx.media3.exoplayer.o(21));
                break;
            default:
                androidx.media3.exoplayer.x xVar7 = tVar.b;
                String str7 = j0.a;
                androidx.media3.exoplayer.analytics.g gVar7 = xVar7.e.r;
                gVar7.M(gVar7.L(), 1030, new androidx.media3.exoplayer.o(3));
                break;
        }
    }

    public /* synthetic */ d0(androidx.media3.exoplayer.audio.t tVar, long j, int i) {
        this.e = 2;
        this.y = tVar;
    }

    public /* synthetic */ d0(androidx.media3.exoplayer.audio.t tVar, androidx.media3.common.r rVar, androidx.media3.exoplayer.d dVar) {
        this.e = 4;
        this.y = tVar;
    }

    public /* synthetic */ d0(androidx.media3.exoplayer.audio.t tVar, Object obj, int i) {
        this.e = i;
        this.y = tVar;
    }

    public /* synthetic */ d0(androidx.media3.exoplayer.audio.t tVar, String str, long j, long j2) {
        this.e = 5;
        this.y = tVar;
    }
}
