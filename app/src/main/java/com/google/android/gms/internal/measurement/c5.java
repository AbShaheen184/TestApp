package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c5 extends c4 {
    public final ArrayList A;
    public final b7 B;
    public final ArrayList z;

    public c5(String str, ArrayList arrayList, List list, b7 b7Var) {
        super(str);
        this.z = new ArrayList();
        this.B = b7Var;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.z.add(((d5) it.next()).d());
            }
        }
        this.A = new ArrayList(list);
    }

    @Override // com.google.android.gms.internal.measurement.c4
    public final d5 a(b7 b7Var, List list) {
        h5 h5Var;
        b7 b7VarD = this.B.d();
        j5 j5Var = (j5) b7VarD.z;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.z;
            int size = arrayList.size();
            h5Var = d5.m;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                b7VarD.g((String) arrayList.get(i), ((j5) b7Var.z).f(b7Var, (d5) list.get(i)));
            } else {
                b7VarD.g((String) arrayList.get(i), h5Var);
            }
            i++;
        }
        for (d5 d5Var : this.A) {
            d5 d5VarF = j5Var.f(b7VarD, d5Var);
            if (d5VarF instanceof e5) {
                d5VarF = j5Var.f(b7VarD, d5Var);
            }
            if (d5VarF instanceof r2) {
                return ((r2) d5VarF).e;
            }
        }
        return h5Var;
    }

    @Override // com.google.android.gms.internal.measurement.c4, com.google.android.gms.internal.measurement.d5
    public final d5 l() {
        return new c5(this);
    }

    public c5(c5 c5Var) {
        super(c5Var.e);
        ArrayList arrayList = new ArrayList(c5Var.z.size());
        this.z = arrayList;
        arrayList.addAll(c5Var.z);
        ArrayList arrayList2 = new ArrayList(c5Var.A.size());
        this.A = arrayList2;
        arrayList2.addAll(c5Var.A);
        this.B = c5Var.B;
    }
}
