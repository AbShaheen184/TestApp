package androidx.compose.foundation.text;

import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.data.remote.model.MusicArtist;
import com.app.mlounge.data.remote.model.MusicSearchResponse;
import com.app.mlounge.data.remote.model.MusicTrack;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.app.mlounge.data.music.c cVar, Object obj, String str, String str2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 1;
        this.z = cVar;
        this.y = obj;
        this.A = str;
        this.B = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                a0 a0Var = new a0((androidx.compose.ui.input.pointer.y) this.z, (x0) this.A, (androidx.compose.foundation.text.selection.c1) this.B, dVar, 0);
                a0Var.y = obj;
                return a0Var;
            case 1:
                return new a0((com.app.mlounge.data.music.c) this.z, this.y, (String) this.A, (String) this.B, dVar);
            case 2:
                return new a0((com.app.mlounge.data.repository.r) this.y, (String) this.z, (String) this.A, (String) this.B, dVar, 2);
            case 3:
                return new a0((com.app.mlounge.data.repository.r) this.y, (okhttp3.y) this.z, (String) this.A, (ChqStream) this.B, dVar, 3);
            default:
                a0 a0Var2 = new a0((Float) this.z, (Integer) this.A, (Integer) this.B, dVar, 4);
                a0Var2.y = obj;
                return a0Var2;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) throws UnsupportedEncodingException {
        switch (this.e) {
            case 0:
                a0 a0Var = (a0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar = kotlin.y.a;
                a0Var.invokeSuspend(yVar);
                return yVar;
            case 1:
                return ((a0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 2:
                return ((a0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 3:
                return ((a0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                a0 a0Var2 = (a0) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar2 = kotlin.y.a;
                a0Var2.invokeSuspend(yVar2);
                return yVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws UnsupportedEncodingException {
        MusicArtist musicArtist;
        int i = this.e;
        int i2 = 0;
        kotlin.y yVar = kotlin.y.a;
        ?? r3 = 0;
        Object obj2 = this.B;
        Object obj3 = this.A;
        Object obj4 = this.z;
        switch (i) {
            case 0:
                kotlin.a.e(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.y;
                CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                androidx.compose.ui.input.pointer.y yVar2 = (androidx.compose.ui.input.pointer.y) obj4;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new z(yVar2, (x0) obj3, r3, i2), 1, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new androidx.activity.compose.p(yVar2, (androidx.compose.foundation.text.selection.c1) obj2, r3, 8), 1, null);
                return yVar;
            case 1:
                String str = (String) obj2;
                kotlin.a.e(obj);
                com.app.mlounge.data.music.c cVar = (com.app.mlounge.data.music.c) obj4;
                com.app.mlounge.data.music.c.j(cVar, "https://musicmp3.ru/");
                Object obj5 = this.y;
                Integer num = obj5 instanceof Integer ? (Integer) obj5 : null;
                int iIntValue = num != null ? num.intValue() : 1;
                org.jsoup.nodes.g gVarJ = com.app.mlounge.data.music.c.j(cVar, "https://musicmp3.ru/search.html?text=" + URLEncoder.encode((String) obj3, "UTF-8") + "&all=" + str);
                if (gVarJ == null) {
                    return new MusicSearchResponse(null, null, null, null, 15);
                }
                int iHashCode = str.hashCode();
                if (iHashCode != -1415163932) {
                    if (iHashCode != -732362228) {
                        if (iHashCode == 109620734 && str.equals("songs")) {
                            org.jsoup.select.e<org.jsoup.nodes.j> eVarB0 = gVarJ.b0("tr.song");
                            eVarB0.getClass();
                            ArrayList arrayList = new ArrayList();
                            for (org.jsoup.nodes.j jVar : eVarB0) {
                                jVar.getClass();
                                MusicTrack musicTrackI = com.app.mlounge.data.music.c.i(cVar, jVar, "Unknown Artist", "Unknown Album", null);
                                if (musicTrackI != null) {
                                    arrayList.add(musicTrackI);
                                }
                            }
                            return new MusicSearchResponse(null, null, arrayList, arrayList.isEmpty() ? null : new Integer(iIntValue + 1), 3);
                        }
                    } else if (str.equals("artists")) {
                        org.jsoup.select.e eVarB1 = gVarJ.b0("div.artist_preview");
                        eVarB1.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = eVarB1.iterator();
                        while (it.hasNext()) {
                            org.jsoup.nodes.j jVarC0 = ((org.jsoup.nodes.j) it.next()).c0("a");
                            if (jVarC0 == null) {
                                musicArtist = null;
                            } else {
                                String strD0 = jVarC0.d0();
                                strD0.getClass();
                                String string = kotlin.text.k.A0(strD0).toString();
                                String strB = jVarC0.b("href");
                                strB.getClass();
                                musicArtist = new MusicArtist(string, strB);
                            }
                            if (musicArtist != null) {
                                arrayList2.add(musicArtist);
                            }
                        }
                        return new MusicSearchResponse(arrayList2, null, null, arrayList2.isEmpty() ? null : new Integer(iIntValue + 1), 6);
                    }
                } else if (str.equals("albums")) {
                    ArrayList arrayListH = com.app.mlounge.data.music.c.h(cVar, gVarJ);
                    return new MusicSearchResponse(null, arrayListH, null, arrayListH.isEmpty() ? 0 : new Integer(iIntValue + 1), 5);
                }
                return new MusicSearchResponse(null, null, null, null, 15);
            case 2:
                kotlin.a.e(obj);
                return ((com.app.mlounge.data.repository.r) this.y).k.getAnimeEpisodeSources((String) obj4, (String) obj3, (String) obj2);
            case 3:
                kotlin.a.e(obj);
                com.app.mlounge.data.repository.r rVar = (com.app.mlounge.data.repository.r) this.y;
                okhttp3.y yVar3 = (okhttp3.y) obj4;
                String str2 = (String) obj3;
                Map mapE = ((ChqStream) obj2).e();
                List list = com.app.mlounge.data.repository.r.M;
                rVar.getClass();
                String str3 = "ok";
                if (kotlin.text.r.O(str2, "http", false) && !kotlin.text.k.T(str2, "googleusercontent.com", false) && !kotlin.text.k.T(str2, ".m3u8", false) && !kotlin.text.k.T(str2, ".workers.dev", false)) {
                    try {
                        okhttp3.a0 a0Var = new okhttp3.a0();
                        a0Var.d(str2);
                        a0Var.c("HEAD", null);
                        if (mapE != null) {
                            for (Map.Entry entry : mapE.entrySet()) {
                                a0Var.a((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                        yVar3.getClass();
                        okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar3, b0Var, false).e();
                        try {
                            int i3 = g0VarE.A;
                            if ((200 > i3 || i3 >= 400) && i3 != 405) {
                                str3 = "offline";
                            }
                            g0VarE.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                com.google.common.base.b.d(g0VarE, th);
                                throw th2;
                            }
                        }
                    } catch (Exception unused) {
                        return "offline";
                    }
                }
                return str3;
            default:
                androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                Float f = (Float) obj4;
                if (f != null) {
                    float fFloatValue = f.floatValue();
                    androidx.datastore.preferences.core.d dVar = y1.j0;
                    aVar.e(y1.H0, new Float(fFloatValue));
                }
                Integer num2 = (Integer) obj3;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    androidx.datastore.preferences.core.d dVar2 = y1.j0;
                    aVar.e(y1.I0, new Integer(iIntValue2));
                }
                Integer num3 = (Integer) obj2;
                if (num3 != null) {
                    int iIntValue3 = num3.intValue();
                    androidx.datastore.preferences.core.d dVar3 = y1.j0;
                    aVar.e(y1.J0, new Integer(iIntValue3));
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(com.app.mlounge.data.repository.r rVar, Object obj, String str, Object obj2, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.y = rVar;
        this.z = obj;
        this.A = str;
        this.B = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
    }
}
