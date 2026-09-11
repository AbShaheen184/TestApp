package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class dg extends ka {
    public Object[] e;
    public int f;

    @Override // com.google.android.gms.internal.measurement.ka
    public final int a() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.measurement.ka
    public final kg i(int i) {
        if (i < this.f) {
            return (kg) this.e[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.ka
    public final Object j(int i) {
        if (i < this.f) {
            return this.e[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.ka
    public final Object k(kg kgVar) {
        int iM = m(kgVar);
        if (iM == -1) {
            return null;
        }
        return kgVar.b.cast(this.e[iM + iM + 1]);
    }

    public final void l(kg kgVar, Object obj) {
        int iM;
        if (!kgVar.c && (iM = m(kgVar)) != -1) {
            e1.c(obj, "metadata value");
            this.e[iM + iM + 1] = obj;
            return;
        }
        int i = this.f + 1;
        Object[] objArr = this.e;
        int length = objArr.length;
        if (i + i > length) {
            this.e = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.e;
        int i2 = this.f;
        int i3 = i2 + i2;
        objArr2[i3] = kgVar;
        e1.c(obj, "metadata value");
        objArr2[i3 + 1] = obj;
        this.f++;
    }

    public final int m(kg kgVar) {
        for (int i = 0; i < this.f; i++) {
            if (this.e[i + i].equals(kgVar)) {
                return i;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.f; i++) {
            sb.append(" '");
            sb.append(i(i));
            sb.append("': ");
            sb.append(j(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
