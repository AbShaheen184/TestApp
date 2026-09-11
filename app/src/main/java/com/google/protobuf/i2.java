package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends k2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // com.google.protobuf.k2
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (l2.h) {
                    if (l2.h(j, obj) == 0) {
                        return false;
                    }
                } else if (l2.i(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (l2.h) {
                    if (l2.h(j, obj) == 0) {
                        return false;
                    }
                } else if (l2.i(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.protobuf.k2
    public final byte d(long j) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.k2
    public final byte e(long j, Object obj) {
        switch (this.b) {
            case 0:
                return l2.h ? l2.h(j, obj) : l2.i(j, obj);
            default:
                return l2.h ? l2.h(j, obj) : l2.i(j, obj);
        }
    }

    @Override // com.google.protobuf.k2
    public final double f(long j, Object obj) {
        switch (this.b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(j(j, obj));
    }

    @Override // com.google.protobuf.k2
    public final float g(long j, Object obj) {
        switch (this.b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(h(j, obj));
    }

    @Override // com.google.protobuf.k2
    public final long i(long j) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.k2
    public final void m(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!l2.h) {
                    l2.m(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    l2.l(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!l2.h) {
                    l2.m(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    l2.l(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.protobuf.k2
    public final void n(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!l2.h) {
                    l2.m(obj, j, b);
                } else {
                    l2.l(obj, j, b);
                }
                break;
            default:
                if (!l2.h) {
                    l2.m(obj, j, b);
                } else {
                    l2.l(obj, j, b);
                }
                break;
        }
    }

    @Override // com.google.protobuf.k2
    public final void o(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                r(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                r(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // com.google.protobuf.k2
    public final void p(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                q(j, obj, Float.floatToIntBits(f));
                break;
            default:
                q(j, obj, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // com.google.protobuf.k2
    public final boolean u() {
        switch (this.b) {
        }
        return false;
    }
}
