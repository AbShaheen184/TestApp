package com.app.mlounge.data.local.dao;

import java.util.ArrayList;
import kotlin.y;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public /* synthetic */ h(String str, String str2, int i) {
        this.e = i;
        this.y = str;
        this.z = str2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) throws Exception {
        switch (this.e) {
            case 0:
                String str = this.y;
                String str2 = this.z;
                androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
                aVar.getClass();
                androidx.sqlite.c cVarU = aVar.U("DELETE FROM favourite_games WHERE slug = ? AND platform = ?");
                try {
                    cVarU.r(1, str);
                    cVarU.r(2, str2);
                    cVarU.Q();
                    return y.a;
                } finally {
                    cVarU.close();
                }
            case 1:
                String str3 = this.y;
                String str4 = this.z;
                androidx.sqlite.a aVar2 = (androidx.sqlite.a) obj;
                aVar2.getClass();
                androidx.sqlite.c cVarU2 = aVar2.U("SELECT EXISTS(SELECT 1 FROM favourite_games WHERE slug = ? AND platform = ?)");
                try {
                    cVarU2.r(1, str3);
                    cVarU2.r(2, str4);
                    boolean z = false;
                    if (cVarU2.Q()) {
                        z = ((int) cVarU2.getLong(0)) != 0;
                    }
                    return Boolean.valueOf(z);
                } finally {
                    cVarU2.close();
                }
            case 2:
                String str5 = this.y;
                String str6 = this.z;
                androidx.sqlite.a aVar3 = (androidx.sqlite.a) obj;
                aVar3.getClass();
                androidx.sqlite.c cVarU3 = aVar3.U("SELECT * FROM iptv_channels WHERE provider = ? AND name LIKE '%' || ? || '%' LIMIT ?");
                try {
                    cVarU3.r(1, str5);
                    cVarU3.r(2, str6);
                    cVarU3.f(3, Context.VERSION_ES6);
                    int iV = kotlin.math.a.v(cVarU3, "id");
                    int iV2 = kotlin.math.a.v(cVarU3, "name");
                    int iV3 = kotlin.math.a.v(cVarU3, "url");
                    int iV4 = kotlin.math.a.v(cVarU3, "logo");
                    int iV5 = kotlin.math.a.v(cVarU3, "groupName");
                    int iV6 = kotlin.math.a.v(cVarU3, "provider");
                    int iV7 = kotlin.math.a.v(cVarU3, "tvgId");
                    ArrayList arrayList = new ArrayList();
                    while (cVarU3.Q()) {
                        arrayList.add(new com.app.mlounge.data.local.entity.d(cVarU3.getLong(iV), cVarU3.F(iV2), cVarU3.F(iV3), cVarU3.isNull(iV4) ? null : cVarU3.F(iV4), cVarU3.isNull(iV5) ? null : cVarU3.F(iV5), cVarU3.F(iV6), cVarU3.isNull(iV7) ? null : cVarU3.F(iV7)));
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarU3.close();
                }
            default:
                String str7 = this.y;
                androidx.sqlite.a aVar4 = (androidx.sqlite.a) obj;
                aVar4.getClass();
                androidx.sqlite.c cVarU4 = aVar4.U("SELECT * FROM iptv_channels WHERE provider = ? AND (? IS NULL OR groupName = ?) ORDER BY name ASC");
                try {
                    cVarU4.r(1, str7);
                    String str8 = this.z;
                    if (str8 == null) {
                        cVarU4.i(2);
                    } else {
                        cVarU4.r(2, str8);
                    }
                    if (str8 == null) {
                        cVarU4.i(3);
                    } else {
                        cVarU4.r(3, str8);
                    }
                    int iV8 = kotlin.math.a.v(cVarU4, "id");
                    int iV9 = kotlin.math.a.v(cVarU4, "name");
                    int iV10 = kotlin.math.a.v(cVarU4, "url");
                    int iV11 = kotlin.math.a.v(cVarU4, "logo");
                    int iV12 = kotlin.math.a.v(cVarU4, "groupName");
                    int iV13 = kotlin.math.a.v(cVarU4, "provider");
                    int iV14 = kotlin.math.a.v(cVarU4, "tvgId");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarU4.Q()) {
                        arrayList2.add(new com.app.mlounge.data.local.entity.d(cVarU4.getLong(iV8), cVarU4.F(iV9), cVarU4.F(iV10), cVarU4.isNull(iV11) ? null : cVarU4.F(iV11), cVarU4.isNull(iV12) ? null : cVarU4.F(iV12), cVarU4.F(iV13), cVarU4.isNull(iV14) ? null : cVarU4.F(iV14)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarU4.close();
                }
        }
    }
}
