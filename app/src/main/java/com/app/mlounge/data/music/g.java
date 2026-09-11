package com.app.mlounge.data.music;

import com.app.mlounge.data.remote.model.MusicAlbum;
import com.app.mlounge.data.remote.model.MusicArtist;
import com.app.mlounge.data.remote.model.MusicPageResponse;
import com.app.mlounge.data.remote.model.MusicSearchResponse;
import com.app.mlounge.data.remote.model.MusicTrack;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.l;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i implements p {
    public final /* synthetic */ h A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, String str, String str2, Object obj, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 3;
        this.A = hVar;
        this.y = str;
        this.z = str2;
        this.B = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new g(this.y, this.z, this.A, this.B, dVar, 0);
            case 1:
                return new g(this.y, this.z, this.A, this.B, dVar, 1);
            case 2:
                return new g(this.y, this.z, this.A, this.B, dVar, 2);
            default:
                return new g(this.A, this.y, this.z, this.B, dVar);
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
            case 2:
                break;
        }
        return ((g) create(coroutineScope, dVar)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                MusicPageResponse musicPageResponseH = h.h(this.A, l.a(this.y, "all") ? "Top Music Artists" : androidx.constraintlayout.core.g.c(this.z, " Music Artists"), "artists", this.B);
                List listA = musicPageResponseH.a();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listA) {
                    if (obj2 instanceof MusicArtist) {
                        arrayList.add(obj2);
                    }
                }
                return new MusicPageResponse(arrayList, musicPageResponseH.b());
            case 1:
                kotlin.a.e(obj);
                MusicPageResponse musicPageResponseH2 = h.h(this.A, l.a(this.y, "all") ? "New Releases" : androidx.constraintlayout.core.g.c(this.z, " New Releases"), "albums", this.B);
                List listA2 = musicPageResponseH2.a();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : listA2) {
                    if (obj3 instanceof MusicAlbum) {
                        arrayList2.add(obj3);
                    }
                }
                return new MusicPageResponse(arrayList2, musicPageResponseH2.b());
            case 2:
                kotlin.a.e(obj);
                MusicPageResponse musicPageResponseH3 = h.h(this.A, l.a(this.y, "all") ? "Top Albums" : androidx.constraintlayout.core.g.c(this.z, " Top Albums"), "albums", this.B);
                List listA3 = musicPageResponseH3.a();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : listA3) {
                    if (obj4 instanceof MusicAlbum) {
                        arrayList3.add(obj4);
                    }
                }
                return new MusicPageResponse(arrayList3, musicPageResponseH3.b());
            default:
                kotlin.a.e(obj);
                Object obj5 = this.B;
                h hVar = this.A;
                String str = this.y;
                String str2 = this.z;
                MusicPageResponse musicPageResponseH4 = h.h(hVar, str, str2, obj5);
                int iHashCode = str2.hashCode();
                if (iHashCode != -1415163932) {
                    if (iHashCode != -732362228) {
                        if (iHashCode == 109620734 && str2.equals("songs")) {
                            List listA4 = musicPageResponseH4.a();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj6 : listA4) {
                                if (obj6 instanceof MusicTrack) {
                                    arrayList4.add(obj6);
                                }
                            }
                            return new MusicSearchResponse(null, null, arrayList4, musicPageResponseH4.b(), 3);
                        }
                    } else if (str2.equals("artists")) {
                        List listA5 = musicPageResponseH4.a();
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj7 : listA5) {
                            if (obj7 instanceof MusicArtist) {
                                arrayList5.add(obj7);
                            }
                        }
                        return new MusicSearchResponse(arrayList5, null, null, musicPageResponseH4.b(), 6);
                    }
                } else if (str2.equals("albums")) {
                    List listA6 = musicPageResponseH4.a();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj8 : listA6) {
                        if (obj8 instanceof MusicAlbum) {
                            arrayList6.add(obj8);
                        }
                    }
                    return new MusicSearchResponse(null, arrayList6, null, musicPageResponseH4.b(), 5);
                }
                return new MusicSearchResponse(null, null, null, musicPageResponseH4.b(), 7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, String str2, h hVar, Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.y = str;
        this.z = str2;
        this.A = hVar;
        this.B = obj;
    }
}
