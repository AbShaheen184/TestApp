package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Comparator, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new k(0);
    public final int A;
    public final l[] e;
    public int y;
    public final String z;

    public m(Parcel parcel) {
        this.z = parcel.readString();
        l[] lVarArr = (l[]) parcel.createTypedArray(l.CREATOR);
        String str = androidx.media3.common.util.j0.a;
        this.e = lVarArr;
        this.A = lVarArr.length;
    }

    public final m a(String str) {
        return Objects.equals(this.z, str) ? this : new m(str, false, this.e);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        l lVar = (l) obj;
        l lVar2 = (l) obj2;
        UUID uuid = g.a;
        if (uuid.equals(lVar.y)) {
            return uuid.equals(lVar2.y) ? 0 : 1;
        }
        return lVar.y.compareTo(lVar2.y);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.z, mVar.z) && Arrays.equals(this.e, mVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.y == 0) {
            String str = this.z;
            this.y = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.e);
        }
        return this.y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.z);
        parcel.writeTypedArray(this.e, 0);
    }

    public m(String str, boolean z, l... lVarArr) {
        this.z = str;
        lVarArr = z ? (l[]) lVarArr.clone() : lVarArr;
        this.e = lVarArr;
        this.A = lVarArr.length;
        Arrays.sort(lVarArr, this);
    }

    public m(String str, ArrayList arrayList) {
        this(str, false, (l[]) arrayList.toArray(new l[0]));
    }
}
