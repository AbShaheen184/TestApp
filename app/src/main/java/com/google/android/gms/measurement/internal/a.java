package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ b0 A;
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ long z;

    public /* synthetic */ a(b0 b0Var, String str, long j, int i) {
        this.e = i;
        this.y = str;
        this.z = j;
        this.A = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                b0 b0Var = this.A;
                b0Var.v();
                String str = this.y;
                com.google.android.gms.common.internal.x.d(str);
                androidx.collection.f fVar = b0Var.z;
                boolean zIsEmpty = fVar.isEmpty();
                long j = this.z;
                if (zIsEmpty) {
                    b0Var.A = j;
                }
                Integer num = (Integer) fVar.get(str);
                if (num != null) {
                    fVar.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (fVar.z < 100) {
                    fVar.put(str, 1);
                    b0Var.y.put(str, Long.valueOf(j));
                } else {
                    x0 x0Var = ((s1) b0Var.e).C;
                    s1.m(x0Var);
                    x0Var.F.a("Too many ads visible");
                }
                break;
            default:
                b0 b0Var2 = this.A;
                b0Var2.v();
                String str2 = this.y;
                com.google.android.gms.common.internal.x.d(str2);
                androidx.collection.f fVar2 = b0Var2.z;
                Integer num2 = (Integer) fVar2.get(str2);
                s1 s1Var = (s1) b0Var2.e;
                if (num2 == null) {
                    x0 x0Var2 = s1Var.C;
                    s1.m(x0Var2);
                    x0Var2.C.b(str2, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    f3 f3Var = s1Var.I;
                    x0 x0Var3 = s1Var.C;
                    s1.l(f3Var);
                    c3 c3VarZ = f3Var.z(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        fVar2.put(str2, Integer.valueOf(iIntValue));
                    } else {
                        fVar2.remove(str2);
                        androidx.collection.f fVar3 = b0Var2.y;
                        Long l = (Long) fVar3.get(str2);
                        long j2 = this.z;
                        if (l == null) {
                            s1.m(x0Var3);
                            x0Var3.C.a("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j2 - l.longValue();
                            fVar3.remove(str2);
                            b0Var2.A(str2, jLongValue, c3VarZ);
                        }
                        if (fVar2.isEmpty()) {
                            long j3 = b0Var2.A;
                            if (j3 != 0) {
                                b0Var2.z(j2 - j3, c3VarZ);
                                b0Var2.A = 0L;
                            } else {
                                s1.m(x0Var3);
                                x0Var3.C.a("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
        }
    }
}
