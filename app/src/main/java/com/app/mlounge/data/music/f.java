package com.app.mlounge.data.music;

import com.app.mlounge.data.remote.model.MusicAlbumDetail;
import com.app.mlounge.data.remote.model.MusicArtistDetail;
import com.app.mlounge.data.remote.model.MusicStreamResult;
import com.app.mlounge.data.remote.model.MusicTrack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.o;
import kotlin.text.k;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import org.schabi.newpipe.extractor.l;
import org.schabi.newpipe.extractor.services.youtube.j;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i implements p {
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = i;
        this.y = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new f(0, this.y, dVar);
            case 1:
                return new f(1, this.y, dVar);
            default:
                return new f(2, this.y, dVar);
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
        return ((f) create(coroutineScope, dVar)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        MusicStreamResult musicStreamResult;
        int i = this.e;
        String str2 = this.y;
        switch (i) {
            case 0:
                kotlin.a.e(obj);
                o oVar = com.app.mlounge.util.a.a;
                String str3 = this.y;
                try {
                    org.schabi.newpipe.extractor.playlist.b bVarB = org.schabi.newpipe.extractor.playlist.b.b(l.a, str3);
                    String str4 = bVarB.B;
                    List list = bVarB.D;
                    list.size();
                    ArrayList<org.schabi.newpipe.extractor.stream.g> arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof org.schabi.newpipe.extractor.stream.g) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.p.y(arrayList, 10));
                    for (org.schabi.newpipe.extractor.stream.g gVar : arrayList) {
                        String str5 = str4;
                        String str6 = gVar.z;
                        str6.getClass();
                        String str7 = gVar.z;
                        str7.getClass();
                        String str8 = gVar.A;
                        str8.getClass();
                        String str9 = gVar.D;
                        if (str9 == null) {
                            str9 = "Unknown";
                        }
                        str5.getClass();
                        long j = gVar.G;
                        if (j > 0) {
                            long j2 = 60;
                            str = (j / j2) + ":" + String.format("%02d", Arrays.copyOf(new Object[]{new Long(j % j2)}, 1));
                            gVar = gVar;
                        } else {
                            str = null;
                        }
                        List list2 = gVar.B;
                        list2.getClass();
                        org.schabi.newpipe.extractor.a aVar = (org.schabi.newpipe.extractor.a) kotlin.collections.o.M(list2);
                        arrayList2.add(new MusicTrack(str6, str7, str8, str9, str5, str, aVar != null ? aVar.e : null, str3));
                        str4 = str5;
                    }
                    String str10 = str4;
                    str10.getClass();
                    String str11 = bVarB.F;
                    if (str11 == null) {
                        str11 = "Unknown Artist";
                    }
                    String str12 = str11;
                    List list3 = bVarB.G;
                    list3.getClass();
                    org.schabi.newpipe.extractor.a aVar2 = (org.schabi.newpipe.extractor.a) kotlin.collections.o.M(list3);
                    return new MusicAlbumDetail(str10, str12, aVar2 != null ? aVar2.e : null, null, null, null, arrayList2);
                } catch (Exception e) {
                    o oVar2 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.b("YouTubeMusic", "getAlbumDetail failed for ".concat(str3), e);
                    return null;
                }
            case 1:
                kotlin.a.e(obj);
                j jVar = l.a;
                jVar.getClass();
                org.schabi.newpipe.extractor.services.youtube.extractors.c cVar = new org.schabi.newpipe.extractor.services.youtube.extractors.c(jVar, org.schabi.newpipe.extractor.services.youtube.linkHandler.a.b.i(str2));
                cVar.b();
                org.schabi.newpipe.extractor.channel.a aVar3 = new org.schabi.newpipe.extractor.channel.a(cVar.a.y, cVar.o(), cVar.S(), cVar.b.e, cVar.v());
                aVar3.E = Collections.EMPTY_LIST;
                try {
                    aVar3.E = cVar.Y();
                } catch (Exception e2) {
                    aVar3.a(e2);
                }
                try {
                    cVar.a();
                    if (cVar.h != null) {
                        List list4 = Collections.EMPTY_LIST;
                    }
                } catch (Exception e3) {
                    aVar3.a(e3);
                }
                try {
                    org.schabi.newpipe.extractor.services.youtube.i.j(cVar.o());
                    try {
                        cVar.a0();
                        break;
                    } catch (Exception e4) {
                        aVar3.a(e4);
                    }
                    try {
                        aVar3.D = cVar.Z();
                        break;
                    } catch (Exception e5) {
                        aVar3.a(e5);
                    }
                    try {
                        List list5 = Collections.EMPTY_LIST;
                        break;
                    } catch (Exception e6) {
                        aVar3.a(e6);
                    }
                    try {
                        cVar.c0();
                        break;
                    } catch (Exception e7) {
                        aVar3.a(e7);
                    }
                    try {
                        cVar.b0();
                        break;
                    } catch (Exception e8) {
                        aVar3.a(e8);
                    }
                    try {
                        cVar.H();
                        break;
                    } catch (Exception e9) {
                        aVar3.a(e9);
                    }
                    String str13 = aVar3.B;
                    str13.getClass();
                    List list6 = aVar3.E;
                    list6.getClass();
                    org.schabi.newpipe.extractor.a aVar4 = (org.schabi.newpipe.extractor.a) kotlin.collections.o.M(list6);
                    return new MusicArtistDetail(str13, aVar4 != null ? aVar4.e : null, aVar3.D, u.e);
                } catch (Exception e10) {
                    try {
                        throw new org.schabi.newpipe.extractor.exceptions.f("Could not get feed URL", e10);
                    } catch (Exception e11) {
                        aVar3.a(e11);
                    }
                }
                break;
            default:
                kotlin.a.e(obj);
                try {
                    org.schabi.newpipe.extractor.stream.f fVarE = org.schabi.newpipe.extractor.stream.f.e(l.a, str2);
                    String str14 = fVarE.G;
                    if (str14 == null || k.d0(str14)) {
                        List list7 = fVarE.E;
                        list7.getClass();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : list7) {
                            if (!((org.schabi.newpipe.extractor.stream.j) obj3).C) {
                                arrayList3.add(obj3);
                            }
                        }
                        org.schabi.newpipe.extractor.stream.j jVar2 = (org.schabi.newpipe.extractor.stream.j) kotlin.collections.o.M(kotlin.collections.o.f0(arrayList3, new androidx.constraintlayout.core.e(10)));
                        if (jVar2 != null) {
                            String str15 = jVar2.y;
                            str15.getClass();
                            if (!k.d0(str15)) {
                                musicStreamResult = new MusicStreamResult(str15, "mp4");
                            }
                        }
                        String str16 = fVarE.H;
                        if (str16 != null && !k.d0(str16)) {
                            musicStreamResult = new MusicStreamResult(str16, "hls");
                        }
                        List list8 = fVarE.F;
                        list8.getClass();
                        org.schabi.newpipe.extractor.stream.b bVar = (org.schabi.newpipe.extractor.stream.b) kotlin.collections.o.M(kotlin.collections.o.f0(list8, new androidx.constraintlayout.core.e(11)));
                        if (bVar != null) {
                            String str17 = bVar.y;
                            str17.getClass();
                            if (!k.d0(str17)) {
                                return new MusicStreamResult(str17, "mp3");
                            }
                        }
                        return null;
                    }
                    musicStreamResult = new MusicStreamResult(str14, "dash");
                    return musicStreamResult;
                } catch (Exception e12) {
                    o oVar3 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.b("YouTubeMusic", "resolveTrack failed for " + str2, e12);
                }
                break;
        }
    }
}
