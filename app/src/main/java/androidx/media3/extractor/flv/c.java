package androidx.media3.extractor.flv;

import androidx.compose.animation.core.j2;
import androidx.media3.common.util.w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends j2 {
    public long[] A;
    public long y;
    public long[] z;

    public static Serializable w(int i, w wVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(wVar.t()));
        }
        if (i == 1) {
            return Boolean.valueOf(wVar.z() == 1);
        }
        if (i == 2) {
            return y(wVar);
        }
        if (i != 3) {
            if (i == 8) {
                return x(wVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(wVar.t()));
                wVar.N(2);
                return date;
            }
            int iD = wVar.D();
            ArrayList arrayList = new ArrayList(iD);
            for (int i2 = 0; i2 < iD; i2++) {
                Serializable serializableW = w(wVar.z(), wVar);
                if (serializableW != null) {
                    arrayList.add(serializableW);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strY = y(wVar);
            int iZ = wVar.z();
            if (iZ == 9) {
                return map;
            }
            Serializable serializableW2 = w(iZ, wVar);
            if (serializableW2 != null) {
                map.put(strY, serializableW2);
            }
        }
    }

    public static HashMap x(w wVar) {
        int iD = wVar.D();
        HashMap map = new HashMap(iD);
        for (int i = 0; i < iD; i++) {
            String strY = y(wVar);
            Serializable serializableW = w(wVar.z(), wVar);
            if (serializableW != null) {
                map.put(strY, serializableW);
            }
        }
        return map;
    }

    public static String y(w wVar) {
        int iG = wVar.G();
        int i = wVar.b;
        wVar.N(iG);
        return new String(wVar.a, i, iG);
    }
}
