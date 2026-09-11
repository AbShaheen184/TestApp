package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends androidx.compose.runtime.snapshots.x implements Parcelable, androidx.compose.runtime.snapshots.o, t2, y0 {
    public static final Parcelable.Creator<e1> CREATOR = new c1(1);
    public k2 y;

    public e1(int i) {
        androidx.compose.runtime.snapshots.f fVarJ = androidx.compose.runtime.snapshots.n.j();
        k2 k2Var = new k2(fVarJ.g(), i);
        if (!(fVarJ instanceof androidx.compose.runtime.snapshots.a)) {
            k2Var.b = new k2(1, i);
        }
        this.y = k2Var;
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final f a() {
        return f.D;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final void b(androidx.compose.runtime.snapshots.y yVar) {
        yVar.getClass();
        this.y = (k2) yVar;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final androidx.compose.runtime.snapshots.y c() {
        return this.y;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final androidx.compose.runtime.snapshots.y d(androidx.compose.runtime.snapshots.y yVar, androidx.compose.runtime.snapshots.y yVar2, androidx.compose.runtime.snapshots.y yVar3) {
        if (((k2) yVar2).c == ((k2) yVar3).c) {
            return yVar2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((k2) androidx.compose.runtime.snapshots.n.t(this.y, this)).c;
    }

    @Override // androidx.compose.runtime.t2
    public final Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i) {
        androidx.compose.runtime.snapshots.f fVarJ;
        k2 k2Var = (k2) androidx.compose.runtime.snapshots.n.h(this.y);
        if (k2Var.c != i) {
            k2 k2Var2 = this.y;
            synchronized (androidx.compose.runtime.snapshots.n.c) {
                fVarJ = androidx.compose.runtime.snapshots.n.j();
                ((k2) androidx.compose.runtime.snapshots.n.o(k2Var2, this, fVarJ, k2Var)).c = i;
            }
            androidx.compose.runtime.snapshots.n.n(fVarJ, this);
        }
    }

    @Override // androidx.compose.runtime.y0
    public final void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((k2) androidx.compose.runtime.snapshots.n.h(this.y)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(g());
    }
}
