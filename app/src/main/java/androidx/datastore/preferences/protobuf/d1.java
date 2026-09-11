package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends f1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                return g1.g ? g1.b(j, obj) : g1.c(j, obj);
            default:
                return g1.g ? g1.b(j, obj) : g1.c(j, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public final double d(long j, Object obj) {
        switch (this.b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public final float e(long j, Object obj) {
        switch (this.b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public final void j(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!g1.g) {
                    g1.l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    g1.k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!g1.g) {
                    g1.l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    g1.k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public final void k(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!g1.g) {
                    g1.l(obj, j, b);
                } else {
                    g1.k(obj, j, b);
                }
                break;
            default:
                if (!g1.g) {
                    g1.l(obj, j, b);
                } else {
                    g1.k(obj, j, b);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public final void l(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public final void m(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                n(j, obj, Float.floatToIntBits(f));
                break;
            default:
                n(j, obj, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public final boolean r() {
        switch (this.b) {
        }
        return false;
    }
}
