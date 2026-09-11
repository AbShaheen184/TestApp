package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.media3.common.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends r {
    public static final q l;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final androidx.media3.common.r h;
    public final List i;
    public final Map j;
    public final List k;

    static {
        List list = Collections.EMPTY_LIST;
        l = new q("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public q(String str, List list, List list2, List list3, List list4, List list5, List list6, androidx.media3.common.r rVar, List list7, boolean z, Map map, List list8) {
        super(list, str, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((p) list2.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(list2);
        this.e = Collections.unmodifiableList(list3);
        this.f = Collections.unmodifiableList(list4);
        this.g = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.h = rVar;
        this.i = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.j = Collections.unmodifiableMap(map);
        this.k = Collections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((o) list.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                r0 r0Var = (r0) list2.get(i3);
                if (r0Var.y == i && r0Var.z == i2) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.offline.a
    public final Object a(List list) {
        ArrayList arrayListC = c(this.d, 0, list);
        List list2 = Collections.EMPTY_LIST;
        return new q(this.a, this.b, arrayListC, list2, c(this.f, 1, list), c(this.g, 2, list), list2, this.h, this.i, this.c, this.j, this.k);
    }
}
