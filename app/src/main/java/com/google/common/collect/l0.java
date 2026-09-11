package com.google.common.collect;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends j0 {
    public final y0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0() {
        super(4);
        y0 y0Var = y0.y;
        this.d = y0Var;
    }

    @Override // com.google.common.collect.j0, com.google.common.collect.a0
    public final a0 a(Object obj) {
        super.a(obj);
        return this;
    }

    @Override // com.google.common.collect.j0
    /* JADX INFO: renamed from: f */
    public final j0 a(Object obj) {
        super.a(obj);
        return this;
    }

    @Override // com.google.common.collect.j0
    public final /* bridge */ /* synthetic */ k0 g() {
        throw null;
    }

    public final i1 h() {
        i1 i1Var;
        Object[] objArrCopyOf = this.a;
        int i = this.b;
        y0 y0Var = this.d;
        if (i == 0) {
            i1Var = m0.p(y0Var);
        } else {
            q.e(i, objArrCopyOf);
            Arrays.sort(objArrCopyOf, 0, i, y0Var);
            int i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                Object obj = objArrCopyOf[i3];
                if (y0Var.compare(obj, objArrCopyOf[i2 - 1]) != 0) {
                    objArrCopyOf[i2] = obj;
                    i2++;
                }
            }
            Arrays.fill(objArrCopyOf, i2, i, (Object) null);
            if (i2 < objArrCopyOf.length / 2) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            i1Var = new i1(h0.j(i2, objArrCopyOf), y0Var);
        }
        this.b = i1Var.D.size();
        this.c = true;
        return i1Var;
    }
}
