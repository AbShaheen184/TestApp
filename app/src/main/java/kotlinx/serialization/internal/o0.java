package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class o0 implements kotlinx.serialization.descriptors.e, j {
    public final String a;
    public final w b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public o0(String str, w wVar, int i) {
        this.a = str;
        this.b = wVar;
        this.c = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = kotlin.collections.v.e;
        final int i4 = 0;
        kotlin.jvm.functions.a aVar = new kotlin.jvm.functions.a(this) { // from class: kotlinx.serialization.internal.n0
            public final /* synthetic */ o0 y;

            {
                this.y = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.h] */
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        w wVar2 = this.y.b;
                        return wVar2 != null ? wVar2.c() : m0.b;
                    case 1:
                        return m0.c(this.y.b != null ? new ArrayList(0) : null);
                    default:
                        o0 o0Var = this.y;
                        return Integer.valueOf(m0.d(o0Var, (kotlinx.serialization.descriptors.e[]) o0Var.j.getValue()));
                }
            }
        };
        kotlin.i iVar = kotlin.i.e;
        this.i = kotlin.a.c(iVar, aVar);
        final int i5 = 1;
        this.j = kotlin.a.c(iVar, new kotlin.jvm.functions.a(this) { // from class: kotlinx.serialization.internal.n0
            public final /* synthetic */ o0 y;

            {
                this.y = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.h] */
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        w wVar2 = this.y.b;
                        return wVar2 != null ? wVar2.c() : m0.b;
                    case 1:
                        return m0.c(this.y.b != null ? new ArrayList(0) : null);
                    default:
                        o0 o0Var = this.y;
                        return Integer.valueOf(m0.d(o0Var, (kotlinx.serialization.descriptors.e[]) o0Var.j.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.k = kotlin.a.c(iVar, new kotlin.jvm.functions.a(this) { // from class: kotlinx.serialization.internal.n0
            public final /* synthetic */ o0 y;

            {
                this.y = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.h] */
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        w wVar2 = this.y.b;
                        return wVar2 != null ? wVar2.c() : m0.b;
                    case 1:
                        return m0.c(this.y.b != null ? new ArrayList(0) : null);
                    default:
                        o0 o0Var = this.y;
                        return Integer.valueOf(m0.d(o0Var, (kotlinx.serialization.descriptors.e[]) o0Var.j.getValue()));
                }
            }
        });
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String a() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.internal.j
    public final Set b() {
        return this.h.keySet();
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.descriptors.e
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.e
    public com.google.android.material.shape.e e() {
        return kotlinx.serialization.descriptors.h.y;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.h] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.h] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0) {
            kotlinx.serialization.descriptors.e eVar = (kotlinx.serialization.descriptors.e) obj;
            if (this.a.equals(eVar.a()) && Arrays.equals((kotlinx.serialization.descriptors.e[]) this.j.getValue(), (kotlinx.serialization.descriptors.e[]) ((o0) obj).j.getValue())) {
                int iF = eVar.f();
                int i = this.c;
                if (i == iF) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (kotlin.jvm.internal.l.a(i(i2).a(), eVar.i(i2).a()) && kotlin.jvm.internal.l.a(i(i2).e(), eVar.i(i2).e())) {
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
        return kotlin.collections.u.e;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List h(int i) {
        List list = this.f[i];
        return list == null ? kotlin.collections.u.e : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.h] */
    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.h] */
    @Override // kotlinx.serialization.descriptors.e
    public kotlinx.serialization.descriptors.e i(int i) {
        return ((kotlinx.serialization.a[]) this.i.getValue())[i].d();
    }

    @Override // kotlinx.serialization.descriptors.e
    public boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean j(int i) {
        return this.g[i];
    }

    public final void k(String str, boolean z) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    public String toString() {
        return kotlin.collections.o.R(com.google.android.material.resources.c.r(0, this.c), ", ", this.a.concat("("), ")", new androidx.compose.ui.text.font.e(this, 27), 24);
    }
}
