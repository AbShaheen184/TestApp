package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.media3.common.j0;
import com.google.common.collect.h0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    public final w a;
    public final HashMap b;
    public final ArrayList c;
    public String d;

    public x(w wVar, String str, Uri uri, int i) {
        this.a = wVar;
        HashMap map = new HashMap();
        this.b = map;
        map.put(str, uri);
        this.d = str;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public static h0 a(List list) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            o oVar = (o) list.get(i);
            Uri uri = oVar.a;
            try {
                d(oVar.a, null, i, arrayList, new w(oVar.b, oVar.d, oVar.c), map, map2);
            } catch (j0 unused) {
            }
        }
        return h0.o(arrayList);
    }

    public static h0 b(List list) throws j0 {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            p pVar = (p) list.get(i);
            d(pVar.a, pVar.g, i, arrayList, new w(pVar.b, pVar.h, null), map, map2);
        }
        return h0.o(arrayList);
    }

    public static void d(Uri uri, String str, int i, ArrayList arrayList, w wVar, HashMap map, HashMap map2) throws j0 {
        int i2;
        String str2;
        Integer num = (Integer) map.get(wVar);
        int i3 = 1;
        if (num == null) {
            map2.put(wVar, 0);
            if (str == null) {
                map2.put(wVar, 1);
                str = ".";
            }
            x xVar = new x(wVar, str, uri, i);
            map.put(wVar, Integer.valueOf(arrayList.size()));
            arrayList.add(xVar);
            return;
        }
        if (str == null) {
            Integer num2 = (Integer) map2.get(wVar);
            num2.getClass();
            int iIntValue = num2.intValue() + 1;
            if (iIntValue <= 1) {
                com.google.android.material.motion.a.c(iIntValue, "invalid count: %s", iIntValue >= 0);
                str2 = iIntValue == 0 ? "" : ".";
            } else {
                long j = ((long) 1) * ((long) iIntValue);
                int i4 = (int) j;
                if (i4 != j) {
                    throw new ArrayIndexOutOfBoundsException(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("Required array size too large: ", j));
                }
                char[] cArr = new char[i4];
                ".".getChars(0, 1, cArr, 0);
                while (true) {
                    i2 = i4 - i3;
                    if (i3 >= i2) {
                        break;
                    }
                    System.arraycopy(cArr, 0, cArr, i3, i3);
                    i3 <<= 1;
                }
                System.arraycopy(cArr, 0, cArr, i3, i2);
                str2 = new String(cArr);
            }
            map2.put(wVar, Integer.valueOf(iIntValue));
            str = str2;
        }
        x xVar2 = (x) arrayList.get(num.intValue());
        Uri uri2 = (Uri) xVar2.b.get(str);
        if (uri2 != null && !uri.equals(uri2)) {
            throw j0.b(null, "Different playlist URLs are found for pathway ID " + str + " within the HlsRedundantGroup");
        }
        xVar2.b.put(str, uri);
        if (i != -1) {
            xVar2.c.add(Integer.valueOf(i));
        }
    }

    public final Uri c() {
        Uri uri = (Uri) this.b.get(this.d);
        uri.getClass();
        return uri;
    }
}
