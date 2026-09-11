package androidx.collection.internal;

import android.util.Log;
import androidx.lifecycle.viewmodel.d;
import androidx.lifecycle.viewmodel.f;
import androidx.media3.extractor.j;
import coil3.network.o;
import com.google.common.base.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.e;
import net.luminis.tls.engine.impl.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final LinkedHashMap a;

    public b(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            case 2:
                this.a = new LinkedHashMap();
                break;
            case 3:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public void a(j jVar) {
        long[] jArr = jVar.e;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.a;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
        }
    }

    public void b(e eVar, l lVar) {
        lVar.getClass();
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(eVar)) {
            c.f(eVar.b(), "A `initializer` with the same `clazz` has already been added: ", 46);
        } else {
            linkedHashMap.put(eVar, new f(eVar, lVar));
        }
    }

    public void c(com.app.mlounge.data.local.a aVar) {
        aVar.getClass();
        LinkedHashMap linkedHashMap = this.a;
        Object treeMap = linkedHashMap.get(7);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(7, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(8)) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(8) + " with " + aVar);
        }
        treeMap2.put(8, aVar);
    }

    public d d() {
        Collection collectionValues = this.a.values();
        collectionValues.getClass();
        f[] fVarArr = (f[]) collectionValues.toArray(new f[0]);
        return new d((f[]) Arrays.copyOf(fVarArr, fVarArr.length), 0);
    }

    public j e() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (j jVar : this.a.values()) {
            arrayList.add(jVar.b);
            arrayList2.add(jVar.c);
            arrayList3.add(jVar.d);
            arrayList4.add(jVar.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i = (int) length;
        com.google.android.material.motion.a.d("the total number of elements (%s) in the arrays must fit in an int", length, length == ((long) i));
        int[] iArr3 = new int[i];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return new j(iArr3, i.d((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), i.d((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), i.d((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public void f(String str) {
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.a.put(lowerCase, com.google.common.base.c.s(str));
    }

    public b(o oVar) {
        Map map = oVar.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), kotlin.collections.o.l0((Collection) entry.getValue()));
        }
        this.a = linkedHashMap;
    }
}
