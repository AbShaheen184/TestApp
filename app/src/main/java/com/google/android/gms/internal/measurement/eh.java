package com.google.android.gms.internal.measurement;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class eh extends c {
    public final ka b;
    public final ka c;
    public final int[] d;
    public final int e;

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    public eh(ka kaVar, ka kaVar2) {
        this.b = kaVar;
        this.c = kaVar2;
        int iA = kaVar2.a();
        if (!(iA <= 28)) {
            net.luminis.tls.engine.impl.c.o("metadata size too large");
            throw null;
        }
        int[] iArr = new int[iA];
        this.d = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < iA) {
            kg kgVarD = d(i);
            long j2 = kgVarD.e | j;
            if (j2 == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (kgVarD.equals(d(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = kgVarD.c ? iArr[i3] | (1 << (i + 4)) : i;
                } else {
                    iArr[i2] = i;
                    i2++;
                }
            } else {
                iArr[i2] = i;
                i2++;
            }
            i++;
            j = j2;
        }
        this.e = i2;
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final void a(bh bhVar, wg wgVar) {
        for (int i = 0; i < this.e; i++) {
            int i2 = this.d[i];
            kg kgVarD = d(i2 & 31);
            if (kgVarD.c) {
                bhVar.b(kgVarD, new dh(this, kgVarD, i2), wgVar);
            } else {
                ka kaVar = this.b;
                int iA = kaVar.a();
                if (i2 >= iA) {
                    kaVar = this.c;
                    i2 -= iA;
                }
                bhVar.a(kgVarD, kgVarD.b.cast(kaVar.j(i2)), wgVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final int b() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final Set c() {
        return new androidx.collection.a(this, 3);
    }

    public final kg d(int i) {
        ka kaVar = this.b;
        int iA = kaVar.a();
        return i >= iA ? this.c.i(i - iA) : kaVar.i(i);
    }
}
