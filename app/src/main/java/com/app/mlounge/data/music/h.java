package com.app.mlounge.data.music;

import com.app.mlounge.data.remote.model.MusicAlbum;
import com.app.mlounge.data.remote.model.MusicPageResponse;
import com.app.mlounge.data.remote.model.MusicTrack;
import com.app.mlounge.data.repository.y;
import com.app.mlounge.data.repository.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.o;
import kotlin.collections.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.schabi.newpipe.extractor.k;
import org.schabi.newpipe.extractor.l;
import org.schabi.newpipe.extractor.services.youtube.j;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d {
    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:97:0x01cb  */
    public static final MusicPageResponse h(h hVar, String str, String str2, Object obj) {
        List listP;
        org.schabi.newpipe.extractor.e eVarP;
        Object objX;
        List list;
        k kVar;
        String str3;
        int iHashCode = str2.hashCode();
        List list2 = u.e;
        if (iHashCode != -1415163932) {
            if (iHashCode != -732362228) {
                if (iHashCode == 109620734 && str2.equals("songs")) {
                    listP = com.google.common.base.c.p("music_songs");
                } else {
                    listP = list2;
                }
            } else if (str2.equals("artists")) {
                listP = com.google.common.base.c.p("music_artists");
            } else {
                listP = list2;
            }
        } else if (str2.equals("albums")) {
            listP = com.google.common.base.c.p("music_albums");
        } else {
            listP = list2;
        }
        j jVar = l.a;
        jVar.getClass();
        String strB = org.schabi.newpipe.extractor.services.youtube.linkHandler.b.d.B(str, listP);
        org.schabi.newpipe.extractor.linkhandler.e eVar = new org.schabi.newpipe.extractor.linkhandler.e(strB, strB, str, Collections.unmodifiableList(listP), "");
        if (obj instanceof k) {
            objX = jVar.P(eVar).x((k) obj);
        } else {
            org.schabi.newpipe.extractor.playlist.a aVarP = jVar.P(eVar);
            aVarP.b();
            int i = aVarP.a.y;
            org.schabi.newpipe.extractor.linkhandler.e eVarY = aVarP.Y();
            String str4 = aVarP.Y().z;
            org.schabi.newpipe.extractor.search.b bVar = new org.schabi.newpipe.extractor.search.b(i, eVarY, "Search");
            List list3 = Collections.EMPTY_LIST;
            try {
                bVar.A = aVarP.b.e;
            } catch (Exception e) {
                bVar.a(e);
            }
            try {
                aVarP.a0();
            } catch (Exception e2) {
                bVar.a(e2);
            }
            try {
                aVarP.c0();
            } catch (Exception e3) {
                bVar.a(e3);
            }
            try {
                aVarP.u();
            } catch (Exception e4) {
                bVar.a(e4);
            }
            try {
                eVarP = aVarP.p();
                bVar.C.addAll(eVarP.c);
            } catch (Exception e5) {
                bVar.a(e5);
                eVarP = org.schabi.newpipe.extractor.e.d;
            }
            bVar.D = eVarP.a;
            bVar.E = eVarP.b;
            objX = bVar;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = objX instanceof org.schabi.newpipe.extractor.search.b;
        if (z) {
            list2 = ((org.schabi.newpipe.extractor.search.b) objX).D;
        } else {
            org.schabi.newpipe.extractor.e eVar2 = objX instanceof org.schabi.newpipe.extractor.e ? (org.schabi.newpipe.extractor.e) objX : null;
            if (eVar2 != null && (list = eVar2.a) != null) {
                list2 = list;
            }
        }
        list2.getClass();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            org.schabi.newpipe.extractor.c cVar = (org.schabi.newpipe.extractor.c) it.next();
            if (cVar instanceof org.schabi.newpipe.extractor.playlist.c) {
                org.schabi.newpipe.extractor.playlist.c cVar2 = (org.schabi.newpipe.extractor.playlist.c) cVar;
                String str5 = cVar2.A;
                str5.getClass();
                String str6 = cVar2.C;
                String str7 = str6 == null ? "Unknown" : str6;
                String str8 = cVar2.z;
                str8.getClass();
                List list4 = cVar2.B;
                list4.getClass();
                org.schabi.newpipe.extractor.a aVar = (org.schabi.newpipe.extractor.a) o.M(list4);
                arrayList.add(new MusicAlbum(str5, str7, str8, aVar != null ? aVar.e : null, null));
            } else {
                if (cVar instanceof org.schabi.newpipe.extractor.stream.g) {
                    org.schabi.newpipe.extractor.stream.g gVar = (org.schabi.newpipe.extractor.stream.g) cVar;
                    String str9 = gVar.z;
                    str9.getClass();
                    String str10 = gVar.A;
                    str10.getClass();
                    String str11 = gVar.D;
                    String str12 = str11 == null ? "Unknown" : str11;
                    long j = gVar.G;
                    if (j > 0) {
                        long j2 = 60;
                        str3 = (j / j2) + ":" + String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j % j2)}, 1));
                    } else {
                        str3 = null;
                    }
                    List list5 = gVar.B;
                    list5.getClass();
                    org.schabi.newpipe.extractor.a aVar2 = (org.schabi.newpipe.extractor.a) o.M(list5);
                    arrayList.add(new MusicTrack(str9, str9, str10, str12, "YouTube Music", str3, aVar2 != null ? aVar2.e : null, null));
                }
                it = it;
            }
            it = it;
            it = it;
        }
        if (z) {
            org.schabi.newpipe.extractor.search.b bVar2 = (org.schabi.newpipe.extractor.search.b) objX;
            k kVar2 = bVar2.E;
            if (kVar2 == null || (org.schabi.newpipe.extractor.utils.f.h(kVar2.e) && org.schabi.newpipe.extractor.utils.f.i(kVar2.z))) {
                kVar = null;
            } else {
                kVar = bVar2.E;
            }
        } else {
            org.schabi.newpipe.extractor.e eVar3 = objX instanceof org.schabi.newpipe.extractor.e ? (org.schabi.newpipe.extractor.e) objX : null;
            if (eVar3 != null) {
                kVar = eVar3.b;
            } else {
                kVar = null;
            }
        }
        return new MusicPageResponse(arrayList, kVar);
    }

    @Override // com.app.mlounge.data.music.d
    public final Object a(String str, String str2, kotlin.coroutines.d dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new f(2, str, null), dVar);
    }

    @Override // com.app.mlounge.data.music.d
    public final Object b(String str, String str2, Object obj, z zVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new g(str, str2, this, obj, null, 0), zVar);
    }

    @Override // com.app.mlounge.data.music.d
    public final Object c(String str, String str2, Object obj, z zVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new g(str, str2, this, obj, null, 2), zVar);
    }

    @Override // com.app.mlounge.data.music.d
    public final Object d(String str, String str2, Object obj, z zVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new g(this, str, str2, obj, null), zVar);
    }

    @Override // com.app.mlounge.data.music.d
    public final Object e(String str, y yVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new f(0, str, null), yVar);
    }

    @Override // com.app.mlounge.data.music.d
    public final Object f(String str, y yVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new f(1, str, null), yVar);
    }

    @Override // com.app.mlounge.data.music.d
    public final Object g(String str, String str2, Object obj, z zVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new g(str, str2, this, obj, null, 1), zVar);
    }

    @Override // com.app.mlounge.data.music.d
    public final String getName() {
        return "YouTube Music";
    }
}
