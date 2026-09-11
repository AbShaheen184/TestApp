package androidx.media3.exoplayer.source;

import androidx.appcompat.widget.c2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends h {
    public static final androidx.media3.common.c0 s;
    public final a[] k;
    public final ArrayList l;
    public final androidx.media3.common.v0[] m;
    public final ArrayList n;
    public final com.google.android.material.shape.g o;
    public int p;
    public long[][] q;
    public androidx.datastore.preferences.protobuf.i r;

    static {
        androidx.media3.common.d1 d1Var = new androidx.media3.common.d1();
        com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
        com.google.common.collect.a1 a1Var = com.google.common.collect.a1.B;
        List list = Collections.EMPTY_LIST;
        androidx.media3.common.w wVar = new androidx.media3.common.w();
        s = new androidx.media3.common.c0("MergingMediaSource", new androidx.media3.common.v(d1Var), null, new androidx.media3.common.x(wVar), androidx.media3.common.f0.B, androidx.media3.common.z.a);
    }

    public g0(a... aVarArr) {
        com.google.android.material.shape.g gVar = new com.google.android.material.shape.g();
        this.k = aVarArr;
        this.o = gVar;
        this.n = new ArrayList(Arrays.asList(aVarArr));
        this.p = -1;
        this.l = new ArrayList(aVarArr.length);
        for (int i = 0; i < aVarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new androidx.media3.common.v0[aVarArr.length];
        this.q = new long[0][];
        new HashMap();
        com.google.common.collect.q.f(8, "expectedKeys");
        com.google.common.collect.q.f(2, "expectedValuesPerKey");
        new com.google.common.collect.x0(com.google.common.collect.u.a(8)).C = new com.google.common.collect.w0();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final u b(v vVar, c2 c2Var, long j) {
        a[] aVarArr = this.k;
        int length = aVarArr.length;
        u[] uVarArr = new u[length];
        androidx.media3.common.v0[] v0VarArr = this.m;
        int iB = v0VarArr[0].b(vVar.a);
        for (int i = 0; i < length; i++) {
            v vVarA = vVar.a(v0VarArr[i].l(iB));
            uVarArr[i] = aVarArr[i].b(vVarA, c2Var, j - this.q[iB][i]);
            ((List) this.l.get(i)).add(new f0(vVarA, uVarArr[i]));
        }
        return new e0(this.o, this.q[iB], uVarArr);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final androidx.media3.common.c0 h() {
        a[] aVarArr = this.k;
        return aVarArr.length > 0 ? aVarArr[0].h() : s;
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.a
    public final void j() throws androidx.datastore.preferences.protobuf.i {
        androidx.datastore.preferences.protobuf.i iVar = this.r;
        if (iVar != null) {
            throw iVar;
        }
        super.j();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void l(androidx.media3.exoplayer.upstream.f fVar) {
        this.j = fVar;
        this.i = androidx.media3.common.util.j0.q(null);
        int i = 0;
        while (true) {
            a[] aVarArr = this.k;
            if (i >= aVarArr.length) {
                return;
            }
            x(Integer.valueOf(i), aVarArr[i]);
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void n(u uVar) {
        e0 e0Var = (e0) uVar;
        int i = 0;
        while (true) {
            a[] aVarArr = this.k;
            if (i >= aVarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            boolean[] zArr = e0Var.y;
            u[] uVarArr = e0Var.e;
            u uVar2 = zArr[i] ? ((g1) uVarArr[i]).e : uVarArr[i];
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((f0) list.get(i2)).b.equals(uVar2)) {
                    list.remove(i2);
                    break;
                }
            }
            aVarArr[i].n(e0Var.y[i] ? ((g1) uVarArr[i]).e : uVarArr[i]);
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.a
    public final void p() {
        super.p();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void s(androidx.media3.common.c0 c0Var) {
        this.k[0].s(c0Var);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final v t(Object obj, v vVar) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((f0) list.get(i)).a.equals(vVar)) {
                return ((f0) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void w(Object obj, a aVar, androidx.media3.common.v0 v0Var) {
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            this.p = v0Var.h();
        } else if (v0Var.h() != this.p) {
            this.r = new androidx.datastore.preferences.protobuf.i();
            return;
        }
        int length = this.q.length;
        androidx.media3.common.v0[] v0VarArr = this.m;
        if (length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.p, v0VarArr.length);
        }
        ArrayList arrayList = this.n;
        arrayList.remove(aVar);
        v0VarArr[num.intValue()] = v0Var;
        if (arrayList.isEmpty()) {
            m(v0VarArr[0]);
        }
    }
}
