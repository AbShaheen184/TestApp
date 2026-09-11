package androidx.room;

import android.content.Context;
import com.app.mlounge.ChqMessagingService;
import com.app.mlounge.data.anime.AnikotoScraper;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;

    public /* synthetic */ z(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.e;
        androidx.navigation.d dVar = androidx.navigation.i0.i;
        kotlin.y yVar = kotlin.y.a;
        switch (i) {
            case 0:
                androidx.sqlite.c cVar = (androidx.sqlite.c) obj;
                cVar.getClass();
                kotlin.collections.builders.g gVar = new kotlin.collections.builders.g();
                while (cVar.Q()) {
                    gVar.add(Integer.valueOf((int) cVar.getLong(0)));
                }
                return com.google.common.base.i.b(gVar);
            case 1:
                return (coil3.compose.h) obj;
            case 2:
                return Float.valueOf(1.0f);
            case 3:
                return Float.valueOf(((Context) obj).getResources().getDisplayMetrics().density);
            case 4:
                int i2 = ChqMessagingService.E;
                kotlin.o oVar = com.app.mlounge.util.a.a;
                return yVar;
            case 5:
                return AnikotoScraper.getAnimeDetail$lambda$14((com.google.gson.h) obj);
            case 6:
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() + "=" + entry.getValue();
            case 7:
                androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
                aVar.getClass();
                androidx.sqlite.c cVarU = aVar.U("SELECT * FROM downloads ORDER BY addedAt DESC");
                try {
                    int iV = kotlin.math.a.v(cVarU, "id");
                    int iV2 = kotlin.math.a.v(cVarU, "url");
                    int iV3 = kotlin.math.a.v(cVarU, "fileName");
                    int iV4 = kotlin.math.a.v(cVarU, "title");
                    int iV5 = kotlin.math.a.v(cVarU, "contentType");
                    int iV6 = kotlin.math.a.v(cVarU, "contentId");
                    int iV7 = kotlin.math.a.v(cVarU, "posterPath");
                    int iV8 = kotlin.math.a.v(cVarU, "quality");
                    int iV9 = kotlin.math.a.v(cVarU, "size");
                    int iV10 = kotlin.math.a.v(cVarU, "status");
                    int iV11 = kotlin.math.a.v(cVarU, "progress");
                    int iV12 = kotlin.math.a.v(cVarU, "downloadedBytes");
                    int iV13 = kotlin.math.a.v(cVarU, "totalBytes");
                    int iV14 = kotlin.math.a.v(cVarU, "filePath");
                    int iV15 = kotlin.math.a.v(cVarU, "headers");
                    int iV16 = kotlin.math.a.v(cVarU, "addedAt");
                    int iV17 = kotlin.math.a.v(cVarU, "completedAt");
                    int iV18 = kotlin.math.a.v(cVarU, "tmdbId");
                    int iV19 = kotlin.math.a.v(cVarU, "season");
                    int iV20 = kotlin.math.a.v(cVarU, "episode");
                    int iV21 = kotlin.math.a.v(cVarU, "failureReason");
                    ArrayList arrayList = new ArrayList();
                    while (cVarU.Q()) {
                        long j = cVarU.getLong(iV);
                        String strF = cVarU.F(iV2);
                        String strF2 = cVarU.F(iV3);
                        String strF3 = cVarU.F(iV4);
                        String strF4 = cVarU.F(iV5);
                        String strF5 = cVarU.isNull(iV6) ? null : cVarU.F(iV6);
                        String strF6 = cVarU.isNull(iV7) ? null : cVarU.F(iV7);
                        String strF7 = cVarU.isNull(iV8) ? null : cVarU.F(iV8);
                        String strF8 = cVarU.isNull(iV9) ? null : cVarU.F(iV9);
                        String strF9 = cVarU.F(iV10);
                        int i3 = iV4;
                        int i4 = iV5;
                        int i5 = (int) cVarU.getLong(iV11);
                        iV12 = iV12;
                        long j2 = cVarU.getLong(iV12);
                        int i6 = iV13;
                        long j3 = cVarU.getLong(i6);
                        iV13 = i6;
                        int i7 = iV14;
                        String strF10 = cVarU.isNull(i7) ? null : cVarU.F(i7);
                        String strF11 = cVarU.isNull(iV15) ? null : cVarU.F(iV15);
                        iV14 = i7;
                        int i8 = iV16;
                        long j4 = cVarU.getLong(i8);
                        iV16 = i8;
                        iV17 = iV17;
                        int i9 = iV19;
                        int i10 = iV20;
                        int i11 = iV7;
                        int i12 = iV21;
                        arrayList.add(new com.app.mlounge.data.local.entity.a(j, strF, strF2, strF3, strF4, strF5, strF6, strF7, strF8, strF9, i5, j2, j3, strF10, strF11, j4, cVarU.isNull(iV17) ? null : Long.valueOf(cVarU.getLong(iV17)), (int) cVarU.getLong(iV18), (int) cVarU.getLong(iV19), (int) cVarU.getLong(i10), cVarU.isNull(i12) ? null : cVarU.F(i12)));
                        iV21 = i12;
                        iV7 = i11;
                        iV4 = i3;
                        iV19 = i9;
                        iV20 = i10;
                        iV5 = i4;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarU.close();
                }
            case 8:
                androidx.sqlite.a aVar2 = (androidx.sqlite.a) obj;
                aVar2.getClass();
                androidx.sqlite.c cVarU2 = aVar2.U("SELECT * FROM favourite_games ORDER BY addedAt DESC");
                try {
                    int iV22 = kotlin.math.a.v(cVarU2, "slug");
                    int iV23 = kotlin.math.a.v(cVarU2, "platform");
                    int iV24 = kotlin.math.a.v(cVarU2, "name");
                    int iV25 = kotlin.math.a.v(cVarU2, "posterUrl");
                    int iV26 = kotlin.math.a.v(cVarU2, "year");
                    int iV27 = kotlin.math.a.v(cVarU2, "addedAt");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarU2.Q()) {
                        arrayList2.add(new com.app.mlounge.data.local.entity.b(cVarU2.F(iV22), cVarU2.F(iV23), cVarU2.isNull(iV24) ? null : cVarU2.F(iV24), cVarU2.isNull(iV25) ? null : cVarU2.F(iV25), cVarU2.isNull(iV26) ? null : cVarU2.F(iV26), cVarU2.getLong(iV27)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarU2.close();
                }
            case 9:
                androidx.sqlite.a aVar3 = (androidx.sqlite.a) obj;
                aVar3.getClass();
                androidx.sqlite.c cVarU3 = aVar3.U("SELECT * FROM history ORDER BY watchedAt DESC");
                try {
                    int iV28 = kotlin.math.a.v(cVarU3, "contentId");
                    int iV29 = kotlin.math.a.v(cVarU3, "contentType");
                    int iV30 = kotlin.math.a.v(cVarU3, "title");
                    int iV31 = kotlin.math.a.v(cVarU3, "posterPath");
                    int iV32 = kotlin.math.a.v(cVarU3, "backdropPath");
                    int iV33 = kotlin.math.a.v(cVarU3, "rating");
                    int iV34 = kotlin.math.a.v(cVarU3, "releaseDate");
                    int iV35 = kotlin.math.a.v(cVarU3, "overview");
                    int iV36 = kotlin.math.a.v(cVarU3, "watchedAt");
                    int iV37 = kotlin.math.a.v(cVarU3, "progress");
                    int iV38 = kotlin.math.a.v(cVarU3, "duration");
                    int iV39 = kotlin.math.a.v(cVarU3, "externalId");
                    int iV40 = kotlin.math.a.v(cVarU3, "season");
                    int iV41 = kotlin.math.a.v(cVarU3, "episode");
                    int iV42 = kotlin.math.a.v(cVarU3, "episodeTitle");
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarU3.Q()) {
                        String strF12 = cVarU3.F(iV28);
                        String strF13 = cVarU3.F(iV29);
                        String strF14 = cVarU3.F(iV30);
                        int i13 = iV42;
                        arrayList3.add(new com.app.mlounge.data.local.entity.c(strF12, strF13, strF14, cVarU3.isNull(iV31) ? null : cVarU3.F(iV31), cVarU3.isNull(iV32) ? null : cVarU3.F(iV32), cVarU3.isNull(iV33) ? null : Double.valueOf(cVarU3.getDouble(iV33)), cVarU3.isNull(iV34) ? null : cVarU3.F(iV34), cVarU3.isNull(iV35) ? null : cVarU3.F(iV35), cVarU3.getLong(iV36), cVarU3.isNull(iV37) ? null : Long.valueOf(cVarU3.getLong(iV37)), cVarU3.isNull(iV38) ? null : Long.valueOf(cVarU3.getLong(iV38)), cVarU3.isNull(iV39) ? null : cVarU3.F(iV39), cVarU3.isNull(iV40) ? null : Integer.valueOf((int) cVarU3.getLong(iV40)), cVarU3.isNull(iV41) ? null : Integer.valueOf((int) cVarU3.getLong(iV41)), cVarU3.isNull(i13) ? null : cVarU3.F(i13)));
                        iV42 = i13;
                        iV29 = iV29;
                        iV30 = iV30;
                        break;
                    }
                    return arrayList3;
                } finally {
                    cVarU3.close();
                }
            case 10:
                androidx.sqlite.a aVar4 = (androidx.sqlite.a) obj;
                aVar4.getClass();
                androidx.sqlite.c cVarU4 = aVar4.U("SELECT * FROM history ORDER BY watchedAt DESC");
                try {
                    int iV43 = kotlin.math.a.v(cVarU4, "contentId");
                    int iV44 = kotlin.math.a.v(cVarU4, "contentType");
                    int iV45 = kotlin.math.a.v(cVarU4, "title");
                    int iV46 = kotlin.math.a.v(cVarU4, "posterPath");
                    int iV47 = kotlin.math.a.v(cVarU4, "backdropPath");
                    int iV48 = kotlin.math.a.v(cVarU4, "rating");
                    int iV49 = kotlin.math.a.v(cVarU4, "releaseDate");
                    int iV50 = kotlin.math.a.v(cVarU4, "overview");
                    int iV51 = kotlin.math.a.v(cVarU4, "watchedAt");
                    int iV52 = kotlin.math.a.v(cVarU4, "progress");
                    int iV53 = kotlin.math.a.v(cVarU4, "duration");
                    int iV54 = kotlin.math.a.v(cVarU4, "externalId");
                    int iV55 = kotlin.math.a.v(cVarU4, "season");
                    int iV56 = kotlin.math.a.v(cVarU4, "episode");
                    int iV57 = kotlin.math.a.v(cVarU4, "episodeTitle");
                    ArrayList arrayList4 = new ArrayList();
                    while (cVarU4.Q()) {
                        String strF15 = cVarU4.F(iV43);
                        String strF16 = cVarU4.F(iV44);
                        String strF17 = cVarU4.F(iV45);
                        int i14 = iV57;
                        arrayList4.add(new com.app.mlounge.data.local.entity.c(strF15, strF16, strF17, cVarU4.isNull(iV46) ? null : cVarU4.F(iV46), cVarU4.isNull(iV47) ? null : cVarU4.F(iV47), cVarU4.isNull(iV48) ? null : Double.valueOf(cVarU4.getDouble(iV48)), cVarU4.isNull(iV49) ? null : cVarU4.F(iV49), cVarU4.isNull(iV50) ? null : cVarU4.F(iV50), cVarU4.getLong(iV51), cVarU4.isNull(iV52) ? null : Long.valueOf(cVarU4.getLong(iV52)), cVarU4.isNull(iV53) ? null : Long.valueOf(cVarU4.getLong(iV53)), cVarU4.isNull(iV54) ? null : cVarU4.F(iV54), cVarU4.isNull(iV55) ? null : Integer.valueOf((int) cVarU4.getLong(iV55)), cVarU4.isNull(iV56) ? null : Integer.valueOf((int) cVarU4.getLong(iV56)), cVarU4.isNull(i14) ? null : cVarU4.F(i14)));
                        iV57 = i14;
                        iV44 = iV44;
                        iV45 = iV45;
                        break;
                    }
                    return arrayList4;
                } finally {
                    cVarU4.close();
                }
            case 11:
                androidx.sqlite.a aVar5 = (androidx.sqlite.a) obj;
                aVar5.getClass();
                androidx.sqlite.c cVarU5 = aVar5.U("DELETE FROM history");
                try {
                    cVarU5.Q();
                    return yVar;
                } finally {
                    cVarU5.close();
                }
            case 12:
                androidx.sqlite.a aVar6 = (androidx.sqlite.a) obj;
                aVar6.getClass();
                androidx.sqlite.c cVarU6 = aVar6.U("SELECT * FROM watch_progress");
                try {
                    int iV58 = kotlin.math.a.v(cVarU6, "contentKey");
                    int iV59 = kotlin.math.a.v(cVarU6, "positionMs");
                    int iV60 = kotlin.math.a.v(cVarU6, "durationMs");
                    int iV61 = kotlin.math.a.v(cVarU6, "updatedAt");
                    ArrayList arrayList5 = new ArrayList();
                    while (cVarU6.Q()) {
                        arrayList5.add(new com.app.mlounge.data.local.entity.e(cVarU6.F(iV58), cVarU6.getLong(iV59), cVarU6.getLong(iV60), cVarU6.getLong(iV61)));
                    }
                    cVarU6.close();
                    return arrayList5;
                } catch (Throwable th) {
                    cVarU6.close();
                    throw th;
                }
            case 13:
                androidx.sqlite.a aVar7 = (androidx.sqlite.a) obj;
                aVar7.getClass();
                androidx.sqlite.c cVarU7 = aVar7.U("SELECT * FROM watchlist ORDER BY addedAt DESC");
                try {
                    int iV62 = kotlin.math.a.v(cVarU7, "contentId");
                    int iV63 = kotlin.math.a.v(cVarU7, "contentType");
                    int iV64 = kotlin.math.a.v(cVarU7, "title");
                    int iV65 = kotlin.math.a.v(cVarU7, "posterPath");
                    int iV66 = kotlin.math.a.v(cVarU7, "backdropPath");
                    int iV67 = kotlin.math.a.v(cVarU7, "rating");
                    int iV68 = kotlin.math.a.v(cVarU7, "releaseDate");
                    int iV69 = kotlin.math.a.v(cVarU7, "overview");
                    int iV70 = kotlin.math.a.v(cVarU7, "addedAt");
                    int iV71 = kotlin.math.a.v(cVarU7, "externalId");
                    int iV72 = kotlin.math.a.v(cVarU7, "providerData");
                    ArrayList arrayList6 = new ArrayList();
                    while (cVarU7.Q()) {
                        arrayList6.add(new com.app.mlounge.data.local.entity.f(cVarU7.F(iV62), cVarU7.F(iV63), cVarU7.F(iV64), cVarU7.isNull(iV65) ? null : cVarU7.F(iV65), cVarU7.isNull(iV66) ? null : cVarU7.F(iV66), cVarU7.isNull(iV67) ? null : Double.valueOf(cVarU7.getDouble(iV67)), cVarU7.isNull(iV68) ? null : cVarU7.F(iV68), cVarU7.isNull(iV69) ? null : cVarU7.F(iV69), cVarU7.getLong(iV70), cVarU7.isNull(iV71) ? null : cVarU7.F(iV71), cVarU7.isNull(iV72) ? null : cVarU7.F(iV72)));
                        break;
                    }
                    return arrayList6;
                } finally {
                    cVarU7.close();
                }
            case 14:
                androidx.sqlite.a aVar8 = (androidx.sqlite.a) obj;
                aVar8.getClass();
                androidx.sqlite.c cVarU8 = aVar8.U("SELECT * FROM watchlist ORDER BY addedAt DESC");
                try {
                    int iV73 = kotlin.math.a.v(cVarU8, "contentId");
                    int iV74 = kotlin.math.a.v(cVarU8, "contentType");
                    int iV75 = kotlin.math.a.v(cVarU8, "title");
                    int iV76 = kotlin.math.a.v(cVarU8, "posterPath");
                    int iV77 = kotlin.math.a.v(cVarU8, "backdropPath");
                    int iV78 = kotlin.math.a.v(cVarU8, "rating");
                    int iV79 = kotlin.math.a.v(cVarU8, "releaseDate");
                    int iV80 = kotlin.math.a.v(cVarU8, "overview");
                    int iV81 = kotlin.math.a.v(cVarU8, "addedAt");
                    int iV82 = kotlin.math.a.v(cVarU8, "externalId");
                    int iV83 = kotlin.math.a.v(cVarU8, "providerData");
                    ArrayList arrayList7 = new ArrayList();
                    while (cVarU8.Q()) {
                        arrayList7.add(new com.app.mlounge.data.local.entity.f(cVarU8.F(iV73), cVarU8.F(iV74), cVarU8.F(iV75), cVarU8.isNull(iV76) ? null : cVarU8.F(iV76), cVarU8.isNull(iV77) ? null : cVarU8.F(iV77), cVarU8.isNull(iV78) ? null : Double.valueOf(cVarU8.getDouble(iV78)), cVarU8.isNull(iV79) ? null : cVarU8.F(iV79), cVarU8.isNull(iV80) ? null : cVarU8.F(iV80), cVarU8.getLong(iV81), cVarU8.isNull(iV82) ? null : cVarU8.F(iV82), cVarU8.isNull(iV83) ? null : cVarU8.F(iV83)));
                        break;
                    }
                    return arrayList7;
                } finally {
                    cVarU8.close();
                }
            case 15:
                androidx.datastore.core.b bVar = (androidx.datastore.core.b) obj;
                bVar.getClass();
                kotlin.o oVar2 = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.b("DataStore", "Preferences file corrupt! User settings may be reset. Error: " + bVar.getMessage(), bVar);
                return new androidx.datastore.preferences.core.a(true);
            case 16:
                String strD0 = ((org.jsoup.nodes.j) obj).d0();
                strD0.getClass();
                return kotlin.text.k.A0(strD0).toString();
            case 17:
                kotlin.text.g gVar2 = (kotlin.text.g) obj;
                gVar2.getClass();
                return kotlin.text.r.Q((String) ((kotlin.collections.b0) gVar2.a()).get(1));
            case 18:
                kotlin.text.g gVar3 = (kotlin.text.g) obj;
                gVar3.getClass();
                return kotlin.text.r.Q((String) ((kotlin.collections.b0) gVar3.a()).get(1));
            case 19:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(kotlin.text.k.T(str, ".m3u8", false));
            case 20:
                androidx.navigation.h hVar = (androidx.navigation.h) obj;
                hVar.getClass();
                hVar.a.z = dVar;
                return yVar;
            case 21:
                androidx.navigation.h hVar2 = (androidx.navigation.h) obj;
                hVar2.getClass();
                hVar2.a.z = dVar;
                return yVar;
            case 22:
                androidx.navigation.h hVar3 = (androidx.navigation.h) obj;
                hVar3.getClass();
                hVar3.a.z = dVar;
                return yVar;
            case 23:
                androidx.navigation.h hVar4 = (androidx.navigation.h) obj;
                hVar4.getClass();
                hVar4.a.z = dVar;
                return yVar;
            case 24:
                androidx.navigation.h hVar5 = (androidx.navigation.h) obj;
                hVar5.getClass();
                hVar5.a.z = dVar;
                return yVar;
            case 25:
                androidx.navigation.h hVar6 = (androidx.navigation.h) obj;
                hVar6.getClass();
                hVar6.a.z = dVar;
                hVar6.a("");
                return yVar;
            case 26:
                androidx.navigation.h hVar7 = (androidx.navigation.h) obj;
                hVar7.getClass();
                hVar7.a.z = dVar;
                hVar7.a("");
                return yVar;
            case 27:
                androidx.navigation.h hVar8 = (androidx.navigation.h) obj;
                hVar8.getClass();
                hVar8.a.z = dVar;
                hVar8.a("tv");
                return yVar;
            case 28:
                androidx.navigation.h hVar9 = (androidx.navigation.h) obj;
                hVar9.getClass();
                hVar9.a.z = androidx.navigation.i0.a;
                return yVar;
            default:
                androidx.navigation.h hVar10 = (androidx.navigation.h) obj;
                hVar10.getClass();
                hVar10.a.z = dVar;
                hVar10.a("");
                return yVar;
        }
    }
}
