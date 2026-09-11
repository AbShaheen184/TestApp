package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends androidx.compose.runtime.snapshots.x implements Parcelable, androidx.compose.runtime.snapshots.o, t2, y0 {
    public static final Parcelable.Creator<d1> CREATOR = new c1(0);
    public j2 y;

    public d1(float f) {
        androidx.compose.runtime.snapshots.f fVarJ = androidx.compose.runtime.snapshots.n.j();
        j2 j2Var = new j2(f, fVarJ.g());
        if (!(fVarJ instanceof androidx.compose.runtime.snapshots.a)) {
            j2Var.b = new j2(f, 1);
        }
        this.y = j2Var;
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final f a() {
        return f.D;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final void b(androidx.compose.runtime.snapshots.y yVar) {
        yVar.getClass();
        this.y = (j2) yVar;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final androidx.compose.runtime.snapshots.y c() {
        return this.y;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final androidx.compose.runtime.snapshots.y d(androidx.compose.runtime.snapshots.y yVar, androidx.compose.runtime.snapshots.y yVar2, androidx.compose.runtime.snapshots.y yVar3) {
        if (((j2) yVar2).c == ((j2) yVar3).c) {
            return yVar2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float g() {
        return ((j2) androidx.compose.runtime.snapshots.n.t(this.y, this)).c;
    }

    @Override // androidx.compose.runtime.t2
    public final Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f) {
        androidx.compose.runtime.snapshots.f fVarJ;
        j2 j2Var = (j2) androidx.compose.runtime.snapshots.n.h(this.y);
        if (j2Var.c == f) {
            return;
        }
        j2 j2Var2 = this.y;
        synchronized (androidx.compose.runtime.snapshots.n.c) {
            fVarJ = androidx.compose.runtime.snapshots.n.j();
            ((j2) androidx.compose.runtime.snapshots.n.o(j2Var2, this, fVarJ, j2Var)).c = f;
        }
        androidx.compose.runtime.snapshots.n.n(fVarJ, this);
    }

    @Override // androidx.compose.runtime.y0
    public final void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((j2) androidx.compose.runtime.snapshots.n.h(this.y)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(g());
    }
}
