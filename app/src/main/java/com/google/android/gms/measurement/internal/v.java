package com.google.android.gms.measurement.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ v(int i) {
        this.a = i;
    }

    public static void a(u uVar, Parcel parcel, int i) {
        String str = uVar.e;
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.D(parcel, 2, str);
        androidx.room.r.C(parcel, 3, uVar.y, i);
        androidx.room.r.D(parcel, 4, uVar.z);
        long j = uVar.A;
        androidx.room.r.G(parcel, 5, 8);
        parcel.writeLong(j);
        long j2 = uVar.B;
        androidx.room.r.G(parcel, 6, 8);
        parcel.writeLong(j2);
        androidx.room.r.I(parcel, iH);
    }

    public static void b(o4 o4Var, Parcel parcel) {
        int i = o4Var.e;
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.G(parcel, 1, 4);
        parcel.writeInt(i);
        androidx.room.r.D(parcel, 2, o4Var.y);
        long j = o4Var.z;
        androidx.room.r.G(parcel, 3, 8);
        parcel.writeLong(j);
        Long l = o4Var.A;
        if (l != null) {
            androidx.room.r.G(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        androidx.room.r.D(parcel, 6, o4Var.B);
        androidx.room.r.D(parcel, 7, o4Var.C);
        Double d = o4Var.D;
        if (d != null) {
            androidx.room.r.G(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        androidx.room.r.I(parcel, iH);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int iM = android.support.v4.media.session.b.M(parcel);
                long jG = 0;
                long jG2 = 0;
                String strP = null;
                t tVar = null;
                String strP2 = null;
                while (parcel.dataPosition() < iM) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        strP = android.support.v4.media.session.b.p(parcel, i);
                    } else if (c == 3) {
                        tVar = (t) android.support.v4.media.session.b.o(parcel, i, t.CREATOR);
                    } else if (c == 4) {
                        strP2 = android.support.v4.media.session.b.p(parcel, i);
                    } else if (c == 5) {
                        jG = android.support.v4.media.session.b.G(parcel, i);
                    } else if (c != 6) {
                        android.support.v4.media.session.b.J(parcel, i);
                    } else {
                        jG2 = android.support.v4.media.session.b.G(parcel, i);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM);
                return new u(strP, tVar, strP2, jG, jG2);
            case 1:
                int iM2 = android.support.v4.media.session.b.M(parcel);
                int iF = 0;
                long jG3 = 0;
                String strP3 = null;
                while (parcel.dataPosition() < iM2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        strP3 = android.support.v4.media.session.b.p(parcel, i2);
                    } else if (c2 == 2) {
                        jG3 = android.support.v4.media.session.b.G(parcel, i2);
                    } else if (c2 != 3) {
                        android.support.v4.media.session.b.J(parcel, i2);
                    } else {
                        iF = android.support.v4.media.session.b.F(parcel, i2);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM2);
                return new a4(iF, jG3, strP3);
            case 2:
                int iM3 = android.support.v4.media.session.b.M(parcel);
                byte[] bArrK = null;
                String strP4 = null;
                Bundle bundleJ = null;
                String strP5 = null;
                long jG4 = 0;
                long jG5 = 0;
                int iF2 = 0;
                while (parcel.dataPosition() < iM3) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            jG4 = android.support.v4.media.session.b.G(parcel, i3);
                            break;
                        case 2:
                            bArrK = android.support.v4.media.session.b.k(parcel, i3);
                            break;
                        case 3:
                            strP4 = android.support.v4.media.session.b.p(parcel, i3);
                            break;
                        case 4:
                            bundleJ = android.support.v4.media.session.b.j(parcel, i3);
                            break;
                        case 5:
                            iF2 = android.support.v4.media.session.b.F(parcel, i3);
                            break;
                        case 6:
                            jG5 = android.support.v4.media.session.b.G(parcel, i3);
                            break;
                        case 7:
                            strP5 = android.support.v4.media.session.b.p(parcel, i3);
                            break;
                        default:
                            android.support.v4.media.session.b.J(parcel, i3);
                            break;
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM3);
                return new d4(jG4, bArrK, strP4, bundleJ, iF2, jG5, strP5);
            case 3:
                int iM4 = android.support.v4.media.session.b.M(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (true) {
                        if (parcel.dataPosition() >= iM4) {
                            android.support.v4.media.session.b.t(parcel, iM4);
                            return new e4(arrayList);
                        }
                        int i4 = parcel.readInt();
                        if (((char) i4) != 1) {
                            android.support.v4.media.session.b.J(parcel, i4);
                        } else {
                            int iH = android.support.v4.media.session.b.H(parcel, i4);
                            int iDataPosition = parcel.dataPosition();
                            if (iH == 0) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int i5 = parcel.readInt();
                            for (int i6 = 0; i6 < i5; i6++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition + iH);
                            arrayList = arrayList2;
                        }
                        break;
                    }
                }
                break;
            case 4:
                int iM5 = android.support.v4.media.session.b.M(parcel);
                ArrayList arrayListR = null;
                while (parcel.dataPosition() < iM5) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 1) {
                        android.support.v4.media.session.b.J(parcel, i7);
                    } else {
                        arrayListR = android.support.v4.media.session.b.r(parcel, i7, d4.CREATOR);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM5);
                return new f4(arrayListR);
            case 5:
                int iM6 = android.support.v4.media.session.b.M(parcel);
                String strP6 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strP7 = null;
                String strP8 = null;
                Double dValueOf = null;
                long jG6 = 0;
                int iF3 = 0;
                while (parcel.dataPosition() < iM6) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            iF3 = android.support.v4.media.session.b.F(parcel, i8);
                            break;
                        case 2:
                            strP6 = android.support.v4.media.session.b.p(parcel, i8);
                            break;
                        case 3:
                            jG6 = android.support.v4.media.session.b.G(parcel, i8);
                            break;
                        case 4:
                            int iH2 = android.support.v4.media.session.b.H(parcel, i8);
                            if (iH2 == 0) {
                                lValueOf = null;
                            } else {
                                android.support.v4.media.session.b.P(parcel, iH2, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            }
                            break;
                        case 5:
                            int iH3 = android.support.v4.media.session.b.H(parcel, i8);
                            if (iH3 == 0) {
                                fValueOf = null;
                            } else {
                                android.support.v4.media.session.b.P(parcel, iH3, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            }
                            break;
                        case 6:
                            strP7 = android.support.v4.media.session.b.p(parcel, i8);
                            break;
                        case 7:
                            strP8 = android.support.v4.media.session.b.p(parcel, i8);
                            break;
                        case '\b':
                            int iH4 = android.support.v4.media.session.b.H(parcel, i8);
                            if (iH4 == 0) {
                                dValueOf = null;
                            } else {
                                android.support.v4.media.session.b.P(parcel, iH4, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            }
                            break;
                        default:
                            android.support.v4.media.session.b.J(parcel, i8);
                            break;
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM6);
                return new o4(iF3, strP6, jG6, lValueOf, fValueOf, strP7, strP8, dValueOf);
            case 6:
                int iM7 = android.support.v4.media.session.b.M(parcel);
                long jG7 = 0;
                long jG8 = 0;
                long jG9 = 0;
                long jG10 = 0;
                long jG11 = 0;
                long jG12 = 0;
                long jG13 = 0;
                long jG14 = 0;
                boolean zC = false;
                int iF4 = 0;
                boolean zC2 = false;
                boolean zC3 = false;
                int iF5 = 0;
                int iF6 = 0;
                String strP9 = "";
                String strP10 = strP9;
                String strP11 = strP10;
                String strP12 = strP11;
                String strP13 = null;
                String strP14 = null;
                String strP15 = null;
                String strP16 = null;
                String strP17 = null;
                String strP18 = null;
                Boolean boolValueOf = null;
                ArrayList<String> arrayList3 = null;
                String strP19 = null;
                String strP20 = null;
                int iF7 = 100;
                boolean zC4 = true;
                boolean zC5 = true;
                long jG15 = -2147483648L;
                while (parcel.dataPosition() < iM7) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 2:
                            strP13 = android.support.v4.media.session.b.p(parcel, i9);
                            break;
                        case 3:
                            strP14 = android.support.v4.media.session.b.p(parcel, i9);
                            break;
                        case 4:
                            strP15 = android.support.v4.media.session.b.p(parcel, i9);
                            break;
                        case 5:
                            strP16 = android.support.v4.media.session.b.p(parcel, i9);
                            break;
                        case 6:
                            jG7 = android.support.v4.media.session.b.G(parcel, i9);
                            break;
                        case 7:
                            jG8 = android.support.v4.media.session.b.G(parcel, i9);
                            break;
                        case '\b':
                            strP17 = android.support.v4.media.session.b.p(parcel, i9);
                            break;
                        case '\t':
                            zC4 = android.support.v4.media.session.b.C(parcel, i9);
                            break;
                        case '\n':
                            zC = android.support.v4.media.session.b.C(parcel, i9);
                            break;
                        case 11:
                            jG15 = android.support.v4.media.session.b.G(parcel, i9);
                            break;
                        case '\f':
                            strP18 = android.support.v4.media.session.b.p(parcel, i9);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case Token.GETPROP /* 33 */:
                        default:
                            android.support.v4.media.session.b.J(parcel, i9);
                            break;
                        case 14:
                            jG9 = android.support.v4.media.session.b.G(parcel, i9);
                            break;
                        case 15:
                            iF4 = android.support.v4.media.session.b.F(parcel, i9);
                            break;
                        case 16:
                            zC5 = android.support.v4.media.session.b.C(parcel, i9);
                            break;
                        case 18:
                            zC2 = android.support.v4.media.session.b.C(parcel, i9);
                            break;
                        case 21:
                            int iH5 = android.support.v4.media.session.b.H(parcel, i9);
                            if (iH5 == 0) {
                                boolValueOf = null;
                            } else {
                                android.support.v4.media.session.b.P(parcel, iH5, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            }
                            break;
                        case 22:
                            jG10 = android.support.v4.media.session.b.G(parcel, i9);
                            break;
                        case 23:
                            int iH6 = android.support.v4.media.session.b.H(parcel, i9);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iH6 == 0) {
                                arrayList3 = null;
                            } else {
                                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                                parcel.setDataPosition(iDataPosition2 + iH6);
                                arrayList3 = arrayListCreateStringArrayList;
                            }
                            break;
                        case 25:
                            strP9 = android.support.v4.media.session.b.p(parcel, i9);
                            break;
                        case 26:
                            strP10 = android.support.v4.media.session.b.p(parcel, i9);
                            break;
                        case 27:
                            strP19 = android.support.v4.media.session.b.p(parcel, i9);
                            break;
                        case 28:
                            zC3 = android.support.v4.media.session.b.C(parcel, i9);
                            break;
                        case 29:
                            jG11 = android.support.v4.media.session.b.G(parcel, i9);
                            break;
                        case 30:
                            iF7 = android.support.v4.media.session.b.F(parcel, i9);
                            break;
                        case 31:
                            strP11 = android.support.v4.media.session.b.p(parcel, i9);
                            break;
                        case ' ':
                            iF5 = android.support.v4.media.session.b.F(parcel, i9);
                            break;
                        case Token.GETPROPNOWARN /* 34 */:
                            jG12 = android.support.v4.media.session.b.G(parcel, i9);
                            break;
                        case '#':
                            strP20 = android.support.v4.media.session.b.p(parcel, i9);
                            break;
                        case Token.GETPROPNOWARN_SUPER /* 36 */:
                            strP12 = android.support.v4.media.session.b.p(parcel, i9);
                            break;
                        case Token.SETPROP /* 37 */:
                            jG13 = android.support.v4.media.session.b.G(parcel, i9);
                            break;
                        case Token.SETPROP_SUPER /* 38 */:
                            iF6 = android.support.v4.media.session.b.F(parcel, i9);
                            break;
                        case Token.GETELEM /* 39 */:
                            jG14 = android.support.v4.media.session.b.G(parcel, i9);
                            break;
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM7);
                return new t4(strP13, strP14, strP15, strP16, jG7, jG8, strP17, zC4, zC, jG15, strP18, jG9, iF4, zC5, zC2, boolValueOf, jG10, arrayList3, strP9, strP10, strP19, zC3, jG11, iF7, strP11, iF5, jG12, strP20, strP12, jG13, iF6, jG14);
            case 7:
                int iM8 = android.support.v4.media.session.b.M(parcel);
                Intent intent = null;
                int iF8 = 0;
                int iF9 = 0;
                while (parcel.dataPosition() < iM8) {
                    int i10 = parcel.readInt();
                    char c3 = (char) i10;
                    if (c3 == 1) {
                        iF8 = android.support.v4.media.session.b.F(parcel, i10);
                    } else if (c3 == 2) {
                        iF9 = android.support.v4.media.session.b.F(parcel, i10);
                    } else if (c3 != 3) {
                        android.support.v4.media.session.b.J(parcel, i10);
                    } else {
                        intent = (Intent) android.support.v4.media.session.b.o(parcel, i10, Intent.CREATOR);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM8);
                return new com.google.android.gms.signin.internal.b(iF8, iF9, intent);
            case 8:
                int iM9 = android.support.v4.media.session.b.M(parcel);
                ArrayList<String> arrayList4 = null;
                String strP21 = null;
                while (parcel.dataPosition() < iM9) {
                    int i11 = parcel.readInt();
                    char c4 = (char) i11;
                    if (c4 == 1) {
                        int iH7 = android.support.v4.media.session.b.H(parcel, i11);
                        int iDataPosition3 = parcel.dataPosition();
                        if (iH7 == 0) {
                            arrayList4 = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition3 + iH7);
                            arrayList4 = arrayListCreateStringArrayList2;
                        }
                    } else if (c4 != 2) {
                        android.support.v4.media.session.b.J(parcel, i11);
                    } else {
                        strP21 = android.support.v4.media.session.b.p(parcel, i11);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM9);
                return new com.google.android.gms.signin.internal.d(strP21, arrayList4);
            case 9:
                int iM10 = android.support.v4.media.session.b.M(parcel);
                com.google.android.gms.common.b bVar = null;
                int iF10 = 0;
                com.google.android.gms.common.internal.r rVar = null;
                while (parcel.dataPosition() < iM10) {
                    int i12 = parcel.readInt();
                    char c5 = (char) i12;
                    if (c5 == 1) {
                        iF10 = android.support.v4.media.session.b.F(parcel, i12);
                    } else if (c5 == 2) {
                        bVar = (com.google.android.gms.common.b) android.support.v4.media.session.b.o(parcel, i12, com.google.android.gms.common.b.CREATOR);
                    } else if (c5 != 3) {
                        android.support.v4.media.session.b.J(parcel, i12);
                    } else {
                        rVar = (com.google.android.gms.common.internal.r) android.support.v4.media.session.b.o(parcel, i12, com.google.android.gms.common.internal.r.CREATOR);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM10);
                return new com.google.android.gms.signin.internal.e(iF10, bVar, rVar);
            default:
                int iM11 = android.support.v4.media.session.b.M(parcel);
                Bundle bundleJ2 = null;
                while (parcel.dataPosition() < iM11) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 2) {
                        android.support.v4.media.session.b.J(parcel, i13);
                    } else {
                        bundleJ2 = android.support.v4.media.session.b.j(parcel, i13);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM11);
                return new com.google.firebase.messaging.n(bundleJ2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new u[i];
            case 1:
                return new a4[i];
            case 2:
                return new d4[i];
            case 3:
                return new e4[i];
            case 4:
                return new f4[i];
            case 5:
                return new o4[i];
            case 6:
                return new t4[i];
            case 7:
                return new com.google.android.gms.signin.internal.b[i];
            case 8:
                return new com.google.android.gms.signin.internal.d[i];
            case 9:
                return new com.google.android.gms.signin.internal.e[i];
            default:
                return new com.google.firebase.messaging.n[i];
        }
    }
}
