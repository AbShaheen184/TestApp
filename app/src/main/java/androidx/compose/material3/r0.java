package androidx.compose.material3;

import com.app.mlounge.data.remote.model.NtvChannel;
import java.util.ArrayList;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;

    public /* synthetic */ r0(String str, int i) {
        this.e = i;
        this.y = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) throws Exception {
        int i = this.e;
        boolean z = false;
        Object fVar = null;
        kotlin.y yVar = kotlin.y.a;
        String str = this.y;
        switch (i) {
            case 0:
                kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.v.a;
                androidx.compose.ui.semantics.w wVar = androidx.compose.ui.semantics.t.d;
                kotlin.reflect.j jVar = androidx.compose.ui.semantics.v.a[2];
                ((androidx.compose.ui.semantics.x) obj).b(wVar, str);
                return yVar;
            case 1:
                androidx.compose.ui.semantics.x xVar = (androidx.compose.ui.semantics.x) obj;
                kotlin.reflect.j[] jVarArr2 = androidx.compose.ui.semantics.v.a;
                xVar.b(androidx.compose.ui.semantics.t.a, com.google.common.base.c.p(str));
                androidx.compose.ui.semantics.v.c(xVar, 5);
                return yVar;
            case 2:
                androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
                aVar.getClass();
                androidx.sqlite.c cVarU = aVar.U("DELETE FROM history WHERE contentId = ?");
                try {
                    cVarU.r(1, str);
                    cVarU.Q();
                    return yVar;
                } finally {
                    cVarU.close();
                }
            case 3:
                androidx.sqlite.a aVar2 = (androidx.sqlite.a) obj;
                aVar2.getClass();
                androidx.sqlite.c cVarU2 = aVar2.U("DELETE FROM iptv_channels WHERE provider = ?");
                try {
                    cVarU2.r(1, str);
                    cVarU2.Q();
                    return yVar;
                } finally {
                    cVarU2.close();
                }
            case 4:
                androidx.sqlite.a aVar3 = (androidx.sqlite.a) obj;
                aVar3.getClass();
                androidx.sqlite.c cVarU3 = aVar3.U("SELECT DISTINCT groupName FROM iptv_channels WHERE provider = ? ORDER BY groupName ASC");
                try {
                    cVarU3.r(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (cVarU3.Q()) {
                        arrayList.add(cVarU3.isNull(0) ? null : cVarU3.F(0));
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarU3.close();
                }
            case 5:
                androidx.sqlite.a aVar4 = (androidx.sqlite.a) obj;
                aVar4.getClass();
                androidx.sqlite.c cVarU4 = aVar4.U("SELECT * FROM iptv_channels WHERE name LIKE '%' || ? || '%' LIMIT ?");
                try {
                    cVarU4.r(1, str);
                    cVarU4.f(2, Context.VERSION_ES6);
                    int iV = kotlin.math.a.v(cVarU4, "id");
                    int iV2 = kotlin.math.a.v(cVarU4, "name");
                    int iV3 = kotlin.math.a.v(cVarU4, "url");
                    int iV4 = kotlin.math.a.v(cVarU4, "logo");
                    int iV5 = kotlin.math.a.v(cVarU4, "groupName");
                    int iV6 = kotlin.math.a.v(cVarU4, "provider");
                    int iV7 = kotlin.math.a.v(cVarU4, "tvgId");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarU4.Q()) {
                        arrayList2.add(new com.app.mlounge.data.local.entity.d(cVarU4.getLong(iV), cVarU4.F(iV2), cVarU4.F(iV3), cVarU4.isNull(iV4) ? null : cVarU4.F(iV4), cVarU4.isNull(iV5) ? null : cVarU4.F(iV5), cVarU4.F(iV6), cVarU4.isNull(iV7) ? null : cVarU4.F(iV7)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarU4.close();
                }
            case 6:
                androidx.sqlite.a aVar5 = (androidx.sqlite.a) obj;
                aVar5.getClass();
                androidx.sqlite.c cVarU5 = aVar5.U("DELETE FROM watch_progress WHERE contentKey = ?");
                try {
                    cVarU5.r(1, str);
                    cVarU5.Q();
                    return yVar;
                } finally {
                    cVarU5.close();
                }
            case 7:
                androidx.sqlite.a aVar6 = (androidx.sqlite.a) obj;
                aVar6.getClass();
                androidx.sqlite.c cVarU6 = aVar6.U("SELECT * FROM watch_progress WHERE contentKey = ? LIMIT 1");
                try {
                    cVarU6.r(1, str);
                    return cVarU6.Q() ? new com.app.mlounge.data.local.entity.e(cVarU6.F(kotlin.math.a.v(cVarU6, "contentKey")), cVarU6.getLong(kotlin.math.a.v(cVarU6, "positionMs")), cVarU6.getLong(kotlin.math.a.v(cVarU6, "durationMs")), cVarU6.getLong(kotlin.math.a.v(cVarU6, "updatedAt"))) : null;
                } finally {
                    cVarU6.close();
                }
            case 8:
                androidx.sqlite.a aVar7 = (androidx.sqlite.a) obj;
                aVar7.getClass();
                androidx.sqlite.c cVarU7 = aVar7.U("DELETE FROM watchlist WHERE contentId = ?");
                try {
                    cVarU7.r(1, str);
                    cVarU7.Q();
                    return yVar;
                } finally {
                    cVarU7.close();
                }
            case 9:
                androidx.sqlite.a aVar8 = (androidx.sqlite.a) obj;
                aVar8.getClass();
                androidx.sqlite.c cVarU8 = aVar8.U("SELECT EXISTS(SELECT 1 FROM watchlist WHERE contentId = ?)");
                try {
                    cVarU8.r(1, str);
                    if (cVarU8.Q() && ((int) cVarU8.getLong(0)) != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } finally {
                    cVarU8.close();
                }
            case 10:
                androidx.sqlite.a aVar9 = (androidx.sqlite.a) obj;
                aVar9.getClass();
                androidx.sqlite.c cVarU9 = aVar9.U("SELECT * FROM watchlist WHERE contentId = ? LIMIT 1");
                try {
                    cVarU9.r(1, str);
                    int iV8 = kotlin.math.a.v(cVarU9, "contentId");
                    int iV9 = kotlin.math.a.v(cVarU9, "contentType");
                    int iV10 = kotlin.math.a.v(cVarU9, "title");
                    int iV11 = kotlin.math.a.v(cVarU9, "posterPath");
                    int iV12 = kotlin.math.a.v(cVarU9, "backdropPath");
                    int iV13 = kotlin.math.a.v(cVarU9, "rating");
                    int iV14 = kotlin.math.a.v(cVarU9, "releaseDate");
                    int iV15 = kotlin.math.a.v(cVarU9, "overview");
                    int iV16 = kotlin.math.a.v(cVarU9, "addedAt");
                    int iV17 = kotlin.math.a.v(cVarU9, "externalId");
                    int iV18 = kotlin.math.a.v(cVarU9, "providerData");
                    if (cVarU9.Q()) {
                        fVar = new com.app.mlounge.data.local.entity.f(cVarU9.F(iV8), cVarU9.F(iV9), cVarU9.F(iV10), cVarU9.isNull(iV11) ? null : cVarU9.F(iV11), cVarU9.isNull(iV12) ? null : cVarU9.F(iV12), cVarU9.isNull(iV13) ? null : Double.valueOf(cVarU9.getDouble(iV13)), cVarU9.isNull(iV14) ? null : cVarU9.F(iV14), cVarU9.isNull(iV15) ? null : cVarU9.F(iV15), cVarU9.getLong(iV16), cVarU9.isNull(iV17) ? null : cVarU9.F(iV17), cVarU9.isNull(iV18) ? null : cVarU9.F(iV18));
                    }
                    return fVar;
                } finally {
                    cVarU9.close();
                }
            case 11:
                int iIntValue = ((Integer) obj).intValue() * 8;
                String strSubstring = str.substring(iIntValue, iIntValue + 8);
                com.google.android.material.shape.e.a(16);
                long j = Long.parseLong(strSubstring, 16);
                com.google.android.material.shape.e.a(36);
                String string = Long.toString(j, 36);
                string.getClass();
                return string;
            case 12:
                NtvChannel ntvChannel = (NtvChannel) obj;
                ntvChannel.getClass();
                String strD = ntvChannel.d();
                if (strD != null && kotlin.text.k.T(strD, str, true)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                String str2 = (String) obj;
                str2.getClass();
                if (kotlin.text.k.d0(str2)) {
                    return str2.length() < str.length() ? str : str2;
                }
                return str.concat(str2);
        }
    }
}
