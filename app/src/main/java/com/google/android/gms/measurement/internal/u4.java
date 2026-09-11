package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.d9;
import com.google.android.gms.internal.measurement.e9;
import com.google.android.gms.internal.measurement.f9;
import com.google.android.gms.internal.measurement.g9;
import com.google.android.gms.internal.measurement.h7;
import com.google.android.gms.internal.measurement.k8;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.r8;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u4 {
    public final String a;
    public final boolean b;
    public final e9 c;
    public final BitSet d;
    public final BitSet e;
    public final androidx.collection.f f;
    public final androidx.collection.f g;
    public final /* synthetic */ c h;

    public u4(c cVar, String str, e9 e9Var, BitSet bitSet, BitSet bitSet2, androidx.collection.f fVar, androidx.collection.f fVar2) {
        this.h = cVar;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = fVar;
        this.g = new androidx.collection.f(0);
        for (Integer num : (androidx.collection.c) fVar2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) fVar2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = e9Var;
    }

    public final void a(b bVar) {
        int iV;
        boolean z;
        boolean zA;
        switch (bVar.g) {
            case 0:
                iV = ((h7) bVar.i).v();
                break;
            default:
                iV = ((n7) bVar.i).v();
                break;
        }
        if (bVar.c != null) {
            this.e.set(iV, true);
        }
        Boolean bool = bVar.d;
        if (bool != null) {
            this.d.set(iV, bool.booleanValue());
        }
        if (bVar.e != null) {
            Integer numValueOf = Integer.valueOf(iV);
            androidx.collection.f fVar = this.f;
            Long l = (Long) fVar.get(numValueOf);
            long jLongValue = bVar.e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                fVar.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (bVar.f != null) {
            Integer numValueOf2 = Integer.valueOf(iV);
            androidx.collection.f fVar2 = this.g;
            List arrayList = (List) fVar2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                fVar2.put(numValueOf2, arrayList);
            }
            switch (bVar.g) {
                case 0:
                    z = false;
                    break;
                default:
                    z = true;
                    break;
            }
            if (z) {
                arrayList.clear();
            }
            com.google.android.gms.internal.measurement.t3.a();
            s1 s1Var = (s1) this.h.e;
            g gVar = s1Var.A;
            g0 g0Var = h0.F0;
            String str = this.a;
            if (gVar.G(str, g0Var)) {
                switch (bVar.g) {
                    case 0:
                        zA = ((h7) bVar.i).A();
                        break;
                    default:
                        zA = false;
                        break;
                }
                if (zA) {
                    arrayList.clear();
                }
            }
            com.google.android.gms.internal.measurement.t3.a();
            boolean zG = s1Var.A.G(str, g0Var);
            Long l2 = bVar.f;
            if (!zG) {
                arrayList.add(Long.valueOf(l2.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(l2.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public final l8 b(int i) {
        ArrayList arrayList;
        List list;
        k8 k8VarB = l8.B();
        k8VarB.b();
        ((l8) k8VarB.y).C(i);
        k8VarB.b();
        ((l8) k8VarB.y).F(this.b);
        e9 e9Var = this.c;
        if (e9Var != null) {
            k8VarB.b();
            ((l8) k8VarB.y).E(e9Var);
        }
        d9 d9VarC = e9.C();
        ArrayList arrayListB0 = n4.b0(this.d);
        d9VarC.b();
        ((e9) d9VarC.y).G(arrayListB0);
        ArrayList arrayListB1 = n4.b0(this.e);
        d9VarC.b();
        ((e9) d9VarC.y).E(arrayListB1);
        androidx.collection.f fVar = this.f;
        if (fVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(fVar.z);
            for (Integer num : (androidx.collection.c) fVar.keySet()) {
                int iIntValue = num.intValue();
                Long l = (Long) fVar.get(num);
                if (l != null) {
                    q8 q8VarY = r8.y();
                    q8VarY.b();
                    ((r8) q8VarY.y).z(iIntValue);
                    long jLongValue = l.longValue();
                    q8VarY.b();
                    ((r8) q8VarY.y).A(jLongValue);
                    arrayList2.add((r8) q8VarY.d());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            d9VarC.b();
            ((e9) d9VarC.y).I(arrayList);
        }
        androidx.collection.f fVar2 = this.g;
        if (fVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(fVar2.z);
            for (Integer num2 : (androidx.collection.c) fVar2.keySet()) {
                f9 f9VarZ = g9.z();
                int iIntValue2 = num2.intValue();
                f9VarZ.b();
                ((g9) f9VarZ.y).A(iIntValue2);
                List list2 = (List) fVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    f9VarZ.b();
                    ((g9) f9VarZ.y).B(list2);
                }
                arrayList3.add((g9) f9VarZ.d());
            }
            list = arrayList3;
        }
        d9VarC.b();
        ((e9) d9VarC.y).K(list);
        k8VarB.b();
        ((l8) k8VarB.y).D((e9) d9VarC.d());
        return (l8) k8VarB.d();
    }

    public u4(c cVar, String str) {
        this.h = cVar;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new androidx.collection.f(0);
        this.g = new androidx.collection.f(0);
    }
}
