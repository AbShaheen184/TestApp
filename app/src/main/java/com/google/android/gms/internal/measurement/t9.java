package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t9 extends com.google.android.gms.common.internal.safeparcel.a implements Comparable {
    public static final Parcelable.Creator<t9> CREATOR = new k6(6);
    public final double A;
    public final String B;
    public final byte[] C;
    public final int D;
    public final int E;
    public final int F;
    public final String e;
    public final long y;
    public final boolean z;

    public t9(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.e = str;
        this.y = j;
        this.z = z;
        this.A = d;
        this.B = str2;
        this.C = bArr;
        this.D = i;
        this.E = i2;
        this.F = i3;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00a4 A[RETURN] */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i;
        t9 t9Var = (t9) obj;
        int iCompareTo = this.e.compareTo(t9Var.e);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i2 = t9Var.D;
        int i3 = this.D;
        if (i3 < i2) {
            i = -1;
        } else {
            i = i3 != i2 ? 1 : 0;
        }
        if (i != 0) {
            return i;
        }
        if (i3 == 1) {
            long j = this.y;
            long j2 = t9Var.y;
            if (j >= j2) {
                if (j == j2) {
                    return 0;
                }
                return 1;
            }
            return -1;
        }
        if (i3 == 2) {
            boolean z = t9Var.z;
            boolean z2 = this.z;
            if (z2 != z) {
                if (z2) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i3 == 3) {
            return Double.compare(this.A, t9Var.A);
        }
        if (i3 == 4) {
            String str = t9Var.B;
            String str2 = this.B;
            if (str2 != str) {
                if (str2 != null) {
                    if (str != null) {
                        return str2.compareTo(str);
                    }
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i3 != 5) {
            net.luminis.tls.engine.impl.c.m(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.e(i3, "Invalid enum value: ", new StringBuilder(String.valueOf(i3).length() + 20)));
            return 0;
        }
        byte[] bArr = t9Var.C;
        byte[] bArr2 = this.C;
        if (bArr2 != bArr) {
            if (bArr2 != null) {
                if (bArr != null) {
                    int i4 = 0;
                    while (true) {
                        int length = bArr.length;
                        int length2 = bArr2.length;
                        if (i4 >= Math.min(length2, length)) {
                            if (length2 < length) {
                                return -1;
                            }
                            return length2 != length ? 1 : 0;
                        }
                        int i5 = bArr2[i4] - bArr[i4];
                        if (i5 != 0) {
                            return i5;
                        }
                        i4++;
                    }
                }
                return 1;
            }
            return -1;
        }
        return 0;
    }

    public final void d(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.e;
        sb.append(str);
        sb.append(", ");
        int i = this.D;
        if (i == 1) {
            sb.append(this.y);
        } else if (i == 2) {
            sb.append(this.z);
        } else if (i == 3) {
            sb.append(this.A);
        } else if (i == 4) {
            sb.append("'");
            String str2 = this.B;
            com.google.android.gms.common.internal.x.g(str2);
            sb.append(str2);
            sb.append("'");
        } else {
            if (i != 5) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i).length());
                sb2.append("Invalid type: ");
                sb2.append(str);
                sb2.append(", ");
                sb2.append(i);
                throw new AssertionError(sb2.toString());
            }
            sb.append("'");
            byte[] bArr = this.C;
            com.google.android.gms.common.internal.x.g(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.E);
        sb.append(", ");
        sb.append(this.F);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t9) {
            t9 t9Var = (t9) obj;
            if (wf.c(this.e, t9Var.e)) {
                int i = t9Var.D;
                int i2 = this.D;
                if (i2 == i && this.E == t9Var.E && this.F == t9Var.F) {
                    if (i2 == 1) {
                        return this.y == t9Var.y;
                    }
                    if (i2 == 2) {
                        return this.z == t9Var.z;
                    }
                    if (i2 == 3) {
                        return this.A == t9Var.A;
                    }
                    if (i2 == 4) {
                        return wf.c(this.B, t9Var.B);
                    }
                    if (i2 == 5) {
                        return Arrays.equals(this.C, t9Var.C);
                    }
                    net.luminis.tls.engine.impl.c.m(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.e(i2, "Invalid enum value: ", new StringBuilder(String.valueOf(i2).length() + 20)));
                    return false;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        d(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.e;
        boolean z = str == null;
        int iH = androidx.room.r.H(parcel, 20293);
        if (!z) {
            androidx.room.r.D(parcel, 2, str);
        }
        long j = this.y;
        if (j != 0) {
            androidx.room.r.G(parcel, 3, 8);
            parcel.writeLong(j);
        }
        if (this.z) {
            androidx.room.r.G(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d = this.A;
        if (d != 0.0d) {
            androidx.room.r.G(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        String str2 = this.B;
        if (str2 != null) {
            androidx.room.r.D(parcel, 6, str2);
        }
        byte[] bArr = this.C;
        if (bArr != null) {
            androidx.room.r.y(parcel, 7, bArr);
        }
        int i2 = this.D;
        if (i2 != 0) {
            androidx.room.r.G(parcel, 8, 4);
            parcel.writeInt(i2);
        }
        int i3 = this.E;
        if (i3 != 0) {
            androidx.room.r.G(parcel, 9, 4);
            parcel.writeInt(i3);
        }
        int i4 = this.F;
        if (i4 != 0) {
            androidx.room.r.G(parcel, 10, 4);
            parcel.writeInt(i4);
        }
        androidx.room.r.I(parcel, iH);
    }
}
