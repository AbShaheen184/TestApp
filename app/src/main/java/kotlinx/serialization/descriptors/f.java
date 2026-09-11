package kotlinx.serialization.descriptors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a0;
import kotlin.collections.m;
import kotlin.collections.p;
import kotlin.collections.u;
import kotlin.collections.x;
import kotlin.collections.y;
import kotlin.jvm.internal.l;
import kotlin.k;
import kotlin.o;
import kotlinx.serialization.internal.j;
import kotlinx.serialization.internal.m0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e, j {
    public final String a;
    public final com.google.android.material.shape.e b;
    public final int c;
    public final HashSet d;
    public final String[] e;
    public final e[] f;
    public final List[] g;
    public final boolean[] h;
    public final Map i;
    public final e[] j;
    public final o k;

    public f(String str, com.google.android.material.shape.e eVar, int i, List list, a aVar) {
        this.a = str;
        this.b = eVar;
        this.c = i;
        ArrayList arrayList = aVar.b;
        arrayList.getClass();
        HashSet hashSet = new HashSet(a0.u(p.y(arrayList, 12)));
        kotlin.collections.o.i0(arrayList, hashSet);
        this.d = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.e = strArr;
        this.f = m0.c(aVar.d);
        this.g = (List[]) aVar.e.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f;
        arrayList2.getClass();
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.h = zArr;
        strArr.getClass();
        m mVar = new m(new androidx.room.coroutines.d(strArr, 20), 1);
        ArrayList arrayList3 = new ArrayList(p.y(mVar, 10));
        Iterator it2 = mVar.iterator();
        while (true) {
            y yVar = (y) it2;
            if (!yVar.y.hasNext()) {
                this.i = a0.G(arrayList3);
                this.j = m0.c(list);
                this.k = new o(new androidx.room.coroutines.d(this, 22));
                return;
            }
            x xVar = (x) yVar.next();
            arrayList3.add(new k(xVar.b, Integer.valueOf(xVar.a)));
        }
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String a() {
        return this.a;
    }

    @Override // kotlinx.serialization.internal.j
    public final Set b() {
        return this.d;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final com.google.android.material.shape.e e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            e eVar = (e) obj;
            if (this.a.equals(eVar.a()) && Arrays.equals(this.j, ((f) obj).j)) {
                int iF = eVar.f();
                int i = this.c;
                if (i == iF) {
                    for (int i2 = 0; i2 < i; i2++) {
                        e[] eVarArr = this.f;
                        if (l.a(eVarArr[i2].a(), eVar.i(i2).a()) && l.a(eVarArr[i2].e(), eVar.i(i2).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int f() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String g(int i) {
        return this.e[i];
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List getAnnotations() {
        return u.e;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List h(int i) {
        return this.g[i];
    }

    public final int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.e
    public final e i(int i) {
        return this.f[i];
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean j(int i) {
        return this.h[i];
    }

    public final String toString() {
        return kotlin.collections.o.R(com.google.android.material.resources.c.r(0, this.c), ", ", this.a.concat("("), ")", new androidx.compose.ui.text.font.e(this, 26), 24);
    }
}
