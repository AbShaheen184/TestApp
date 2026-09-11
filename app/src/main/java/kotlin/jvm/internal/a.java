package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class a implements h, Serializable {
    public final String A;
    public final boolean B = false;
    public final int C;
    public final int D;
    public final Object e;
    public final Class y;
    public final String z;

    public a(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.e = obj;
        this.y = cls;
        this.z = str;
        this.A = str2;
        this.C = i;
        this.D = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.B == aVar.B && this.C == aVar.C && this.D == aVar.D && l.a(this.e, aVar.e) && this.y.equals(aVar.y) && this.z.equals(aVar.z) && this.A.equals(aVar.A);
    }

    @Override // kotlin.jvm.internal.h
    public final int getArity() {
        return this.C;
    }

    public final int hashCode() {
        Object obj = this.e;
        return ((((androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e((this.y.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, 31, this.z), 31, this.A) + (this.B ? 1231 : 1237)) * 31) + this.C) * 31) + this.D;
    }

    public final String toString() {
        a0.a.getClass();
        return b0.a(this);
    }
}
