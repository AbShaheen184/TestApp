package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends androidx.compose.runtime.snapshots.x implements Parcelable, androidx.compose.runtime.snapshots.o {
    public static final Parcelable.Creator<h1> CREATOR = new g1();
    public final f y;
    public m2 z;

    public h1(Object obj, f fVar) {
        this.y = fVar;
        androidx.compose.runtime.snapshots.f fVarJ = androidx.compose.runtime.snapshots.n.j();
        m2 m2Var = new m2(fVarJ.g(), obj);
        if (!(fVarJ instanceof androidx.compose.runtime.snapshots.a)) {
            m2Var.b = new m2(1, obj);
        }
        this.z = m2Var;
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final f a() {
        return this.y;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final void b(androidx.compose.runtime.snapshots.y yVar) {
        yVar.getClass();
        this.z = (m2) yVar;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final androidx.compose.runtime.snapshots.y c() {
        return this.z;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final androidx.compose.runtime.snapshots.y d(androidx.compose.runtime.snapshots.y yVar, androidx.compose.runtime.snapshots.y yVar2, androidx.compose.runtime.snapshots.y yVar3) {
        if (this.y.b(((m2) yVar2).c, ((m2) yVar3).c)) {
            return yVar2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // androidx.compose.runtime.t2
    public final Object getValue() {
        return ((m2) androidx.compose.runtime.snapshots.n.t(this.z, this)).c;
    }

    @Override // androidx.compose.runtime.y0
    public final void setValue(Object obj) {
        androidx.compose.runtime.snapshots.f fVarJ;
        m2 m2Var = (m2) androidx.compose.runtime.snapshots.n.h(this.z);
        if (this.y.b(m2Var.c, obj)) {
            return;
        }
        m2 m2Var2 = this.z;
        synchronized (androidx.compose.runtime.snapshots.n.c) {
            fVarJ = androidx.compose.runtime.snapshots.n.j();
            ((m2) androidx.compose.runtime.snapshots.n.o(m2Var2, this, fVarJ, m2Var)).c = obj;
        }
        androidx.compose.runtime.snapshots.n.n(fVarJ, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((m2) androidx.compose.runtime.snapshots.n.h(this.z)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        f fVar = f.A;
        f fVar2 = this.y;
        if (kotlin.jvm.internal.l.a(fVar2, fVar)) {
            i2 = 0;
        } else if (kotlin.jvm.internal.l.a(fVar2, f.D)) {
            i2 = 1;
        } else {
            if (!kotlin.jvm.internal.l.a(fVar2, f.B)) {
                net.luminis.tls.engine.impl.c.r("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
