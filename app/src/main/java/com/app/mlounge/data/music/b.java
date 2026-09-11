package com.app.mlounge.data.music;

import com.app.mlounge.data.remote.model.MusicArtist;
import com.app.mlounge.data.remote.model.MusicPageResponse;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.l;
import kotlin.text.k;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import org.jsoup.nodes.j;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements p {
    public final /* synthetic */ c A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, String str, c cVar, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.y = obj;
        this.z = str;
        this.A = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new b(this.y, this.z, this.A, dVar, 0);
            case 1:
                return new b(this.y, this.z, this.A, dVar, 1);
            default:
                return new b(this.y, this.z, this.A, dVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                Object obj2 = this.y;
                Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                int iIntValue = num != null ? num.intValue() : 1;
                String str = this.z;
                if (l.a(str, "all")) {
                    str = "0";
                }
                org.jsoup.nodes.g gVarJ = c.j(this.A, androidx.privacysandbox.ads.adservices.java.internal.a.p("https://musicmp3.ru/main_artists.html?type=artist&page=", iIntValue, !l.a(str, "0") ? androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("&gnr_id=", str) : ""));
                if (gVarJ == null) {
                    return new MusicPageResponse();
                }
                org.jsoup.select.e<j> eVarB0 = gVarJ.b0("a[href^=/artist_]");
                eVarB0.getClass();
                ArrayList arrayList = new ArrayList(kotlin.collections.p.y(eVarB0, 10));
                for (j jVar : eVarB0) {
                    String strD0 = jVar.d0();
                    strD0.getClass();
                    String string = k.A0(strD0).toString();
                    String strB = jVar.b("href");
                    strB.getClass();
                    arrayList.add(new MusicArtist(string, strB));
                }
                return new MusicPageResponse(arrayList, arrayList.size() >= 80 ? new Integer(iIntValue + 1) : null);
            case 1:
                kotlin.a.e(obj);
                Object obj3 = this.y;
                Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
                int iIntValue2 = num2 != null ? num2.intValue() : 1;
                String str2 = this.z;
                if (l.a(str2, "all")) {
                    str2 = "0";
                }
                String str3 = "https://musicmp3.ru/main_albums.html?sort=new&type=album&page=" + iIntValue2 + (!l.a(str2, "0") ? androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("&gnr_id=", str2) : "");
                c cVar = this.A;
                org.jsoup.nodes.g gVarJ2 = c.j(cVar, str3);
                if (gVarJ2 == null) {
                    return new MusicPageResponse();
                }
                ArrayList arrayListH = c.h(cVar, gVarJ2);
                return new MusicPageResponse(arrayListH, arrayListH.size() >= 40 ? new Integer(iIntValue2 + 1) : null);
            default:
                kotlin.a.e(obj);
                Object obj4 = this.y;
                Integer num3 = obj4 instanceof Integer ? (Integer) obj4 : null;
                int iIntValue3 = num3 != null ? num3.intValue() : 1;
                String str4 = this.z;
                if (l.a(str4, "all")) {
                    str4 = "0";
                }
                String str5 = "https://musicmp3.ru/main_albums.html?sort=top&type=album&page=" + iIntValue3 + (!l.a(str4, "0") ? androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("&gnr_id=", str4) : "");
                c cVar2 = this.A;
                org.jsoup.nodes.g gVarJ3 = c.j(cVar2, str5);
                if (gVarJ3 == null) {
                    return new MusicPageResponse();
                }
                ArrayList arrayListH2 = c.h(cVar2, gVarJ3);
                return new MusicPageResponse(arrayListH2, arrayListH2.size() >= 40 ? new Integer(iIntValue3 + 1) : null);
        }
    }
}
