package com.app.mlounge.data.local.dao;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends _COROUTINE.a {
    public final /* synthetic */ int l;

    public /* synthetic */ f(int i) {
        this.l = i;
    }

    @Override // _COROUTINE.a
    public final void h(androidx.sqlite.c cVar, Object obj) {
        switch (this.l) {
            case 0:
                com.app.mlounge.data.local.entity.a aVar = (com.app.mlounge.data.local.entity.a) obj;
                cVar.getClass();
                long j = aVar.a;
                cVar.f(1, j);
                cVar.r(2, aVar.b);
                cVar.r(3, aVar.c);
                cVar.r(4, aVar.d);
                cVar.r(5, aVar.e);
                String str = aVar.f;
                if (str == null) {
                    cVar.i(6);
                } else {
                    cVar.r(6, str);
                }
                String str2 = aVar.g;
                if (str2 == null) {
                    cVar.i(7);
                } else {
                    cVar.r(7, str2);
                }
                String str3 = aVar.h;
                if (str3 == null) {
                    cVar.i(8);
                } else {
                    cVar.r(8, str3);
                }
                String str4 = aVar.i;
                if (str4 == null) {
                    cVar.i(9);
                } else {
                    cVar.r(9, str4);
                }
                cVar.r(10, aVar.j);
                cVar.f(11, aVar.k);
                cVar.f(12, aVar.l);
                cVar.f(13, aVar.m);
                String str5 = aVar.n;
                if (str5 == null) {
                    cVar.i(14);
                } else {
                    cVar.r(14, str5);
                }
                String str6 = aVar.o;
                if (str6 == null) {
                    cVar.i(15);
                } else {
                    cVar.r(15, str6);
                }
                cVar.f(16, aVar.p);
                Long l = aVar.q;
                if (l == null) {
                    cVar.i(17);
                } else {
                    cVar.f(17, l.longValue());
                }
                cVar.f(18, aVar.r);
                cVar.f(19, aVar.s);
                cVar.f(20, aVar.t);
                String str7 = aVar.u;
                if (str7 == null) {
                    cVar.i(21);
                } else {
                    cVar.r(21, str7);
                }
                cVar.f(22, j);
                break;
            default:
                com.app.mlounge.data.local.entity.e eVar = (com.app.mlounge.data.local.entity.e) obj;
                cVar.getClass();
                String str8 = eVar.a;
                cVar.r(1, str8);
                cVar.f(2, eVar.b);
                cVar.f(3, eVar.c);
                cVar.f(4, eVar.d);
                cVar.r(5, str8);
                break;
        }
    }

    @Override // _COROUTINE.a
    public final String p() {
        switch (this.l) {
            case 0:
                return "UPDATE OR ABORT `downloads` SET `id` = ?,`url` = ?,`fileName` = ?,`title` = ?,`contentType` = ?,`contentId` = ?,`posterPath` = ?,`quality` = ?,`size` = ?,`status` = ?,`progress` = ?,`downloadedBytes` = ?,`totalBytes` = ?,`filePath` = ?,`headers` = ?,`addedAt` = ?,`completedAt` = ?,`tmdbId` = ?,`season` = ?,`episode` = ?,`failureReason` = ? WHERE `id` = ?";
            default:
                return "UPDATE `watch_progress` SET `contentKey` = ?,`positionMs` = ?,`durationMs` = ?,`updatedAt` = ? WHERE `contentKey` = ?";
        }
    }
}
