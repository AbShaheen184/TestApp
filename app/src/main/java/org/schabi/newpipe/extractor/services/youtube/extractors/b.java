package org.schabi.newpipe.extractor.services.youtube.extractors;

import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Consumer {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ c b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(c cVar, ArrayList arrayList, String str) {
        this.b = cVar;
        this.c = arrayList;
        this.d = str;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        ArrayList arrayList = this.c;
        c cVar = this.b;
        switch (i) {
            case 0:
                org.schabi.newpipe.extractor.services.soundcloud.extractors.a aVar = (org.schabi.newpipe.extractor.services.soundcloud.extractors.a) obj2;
                String strF = ((com.grack.nanojson.c) obj).e("endpoint").e("commandMetadata").e("webCommandMetadata").f("url", null);
                if (strF != null) {
                    String[] strArrSplit = strF.split("/");
                    if (strArrSplit.length != 0) {
                        byte b = 1;
                        String str = strArrSplit[strArrSplit.length - 1];
                        str.getClass();
                        switch (str.hashCode()) {
                            case -1881890573:
                                b = !str.equals("streams") ? (byte) -1 : (byte) 0;
                                break;
                            case -1865828127:
                                if (!str.equals("playlists")) {
                                    b = -1;
                                }
                                break;
                            case -903148681:
                                b = !str.equals("shorts") ? (byte) -1 : (byte) 2;
                                break;
                            case -816678056:
                                b = !str.equals("videos") ? (byte) -1 : (byte) 3;
                                break;
                            case -551298740:
                                b = !str.equals("releases") ? (byte) -1 : (byte) 4;
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            case 0:
                                aVar.accept("livestreams");
                                break;
                            case 1:
                                aVar.accept("playlists");
                                break;
                            case 2:
                                aVar.accept("shorts");
                                break;
                            case 3:
                                arrayList.add(0, new org.schabi.newpipe.extractor.linkhandler.d(strF, cVar.g, "videos"));
                                break;
                            case 4:
                                aVar.accept("albums");
                                break;
                        }
                    }
                }
                break;
            default:
                String str2 = (String) obj;
                arrayList.add(new org.schabi.newpipe.extractor.linkhandler.d(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i((String) obj2, "/", str2), cVar.g, str2));
                break;
        }
    }

    public /* synthetic */ b(c cVar, ArrayList arrayList, String str, String str2, String str3, org.schabi.newpipe.extractor.services.soundcloud.extractors.a aVar) {
        this.b = cVar;
        this.c = arrayList;
        this.d = aVar;
    }
}
