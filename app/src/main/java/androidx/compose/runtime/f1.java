package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends androidx.compose.runtime.snapshots.x implements Parcelable, androidx.compose.runtime.snapshots.o, t2, y0 {
    public static final Parcelable.Creator<f1> CREATOR = new c1(2);
    public l2 y;

    public f1(long j) {
        androidx.compose.runtime.snapshots.f fVarJ = androidx.compose.runtime.snapshots.n.j();
        l2 l2Var = new l2(fVarJ.g(), j);
        if (!(fVarJ instanceof androidx.compose.runtime.snapshots.a)) {
            l2Var.b = new l2(1, j);
        }
        this.y = l2Var;
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final f a() {
        return f.D;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final void b(androidx.compose.runtime.snapshots.y yVar) {
        yVar.getClass();
        this.y = (l2) yVar;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final androidx.compose.runtime.snapshots.y c() {
        return this.y;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final androidx.compose.runtime.snapshots.y d(androidx.compose.runtime.snapshots.y yVar, androidx.compose.runtime.snapshots.y yVar2, androidx.compose.runtime.snapshots.y yVar3) {
        if (((l2) yVar2).c == ((l2) yVar3).c) {
            return yVar2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long g() {
        return ((l2) androidx.compose.runtime.snapshots.n.t(this.y, this)).c;
    }

    @Override // androidx.compose.runtime.t2
    public final Object getValue() {
        return Long.valueOf(g());
    }

    public final void h(long j) {
        androidx.compose.runtime.snapshots.f fVarJ;
        l2 l2Var = (l2) androidx.compose.runtime.snapshots.n.h(this.y);
        if (l2Var.c != j) {
            l2 l2Var2 = this.y;
            synchronized (androidx.compose.runtime.snapshots.n.c) {
                fVarJ = androidx.compose.runtime.snapshots.n.j();
                ((l2) androidx.compose.runtime.snapshots.n.o(l2Var2, this, fVarJ, l2Var)).c = j;
            }
            androidx.compose.runtime.snapshots.n.n(fVarJ, this);
        }
    }

    @Override // androidx.compose.runtime.y0
    public final void setValue(Object obj) {
        h(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((l2) androidx.compose.runtime.snapshots.n.h(this.y)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(g());
    }
}
