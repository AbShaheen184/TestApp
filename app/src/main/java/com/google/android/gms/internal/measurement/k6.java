package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k6 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ k6(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int iM = android.support.v4.media.session.b.M(parcel);
                Bundle bundleJ = null;
                String strP = null;
                boolean zC = false;
                long jG = 0;
                long jG2 = 0;
                while (parcel.dataPosition() < iM) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        jG = android.support.v4.media.session.b.G(parcel, i);
                    } else if (c == 2) {
                        jG2 = android.support.v4.media.session.b.G(parcel, i);
                    } else if (c == 3) {
                        zC = android.support.v4.media.session.b.C(parcel, i);
                    } else if (c == 7) {
                        bundleJ = android.support.v4.media.session.b.j(parcel, i);
                    } else if (c != '\b') {
                        android.support.v4.media.session.b.J(parcel, i);
                    } else {
                        strP = android.support.v4.media.session.b.p(parcel, i);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM);
                return new j6(jG, jG2, zC, bundleJ, strP);
            case 1:
                int iM2 = android.support.v4.media.session.b.M(parcel);
                String strP2 = null;
                int iF = 0;
                Intent intent = null;
                while (parcel.dataPosition() < iM2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        iF = android.support.v4.media.session.b.F(parcel, i2);
                    } else if (c2 == 2) {
                        strP2 = android.support.v4.media.session.b.p(parcel, i2);
                    } else if (c2 != 3) {
                        android.support.v4.media.session.b.J(parcel, i2);
                    } else {
                        intent = (Intent) android.support.v4.media.session.b.o(parcel, i2, Intent.CREATOR);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM2);
                return new l6(iF, strP2, intent);
            case 2:
                int iM3 = android.support.v4.media.session.b.M(parcel);
                int iF2 = 0;
                t9[] t9VarArr = null;
                String[] strArr = null;
                while (parcel.dataPosition() < iM3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 2) {
                        iF2 = android.support.v4.media.session.b.F(parcel, i3);
                    } else if (c3 == 3) {
                        t9VarArr = (t9[]) android.support.v4.media.session.b.q(parcel, i3, t9.CREATOR);
                    } else if (c3 != 4) {
                        android.support.v4.media.session.b.J(parcel, i3);
                    } else {
                        int iH = android.support.v4.media.session.b.H(parcel, i3);
                        int iDataPosition = parcel.dataPosition();
                        if (iH == 0) {
                            strArr = null;
                        } else {
                            String[] strArrCreateStringArray = parcel.createStringArray();
                            parcel.setDataPosition(iDataPosition + iH);
                            strArr = strArrCreateStringArray;
                        }
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM3);
                return new p9(iF2, t9VarArr, strArr);
            case 3:
                int iM4 = android.support.v4.media.session.b.M(parcel);
                long jG3 = 0;
                String strP3 = null;
                String strP4 = null;
                p9[] p9VarArr = null;
                byte[] bArrK = null;
                boolean zC2 = false;
                while (parcel.dataPosition() < iM4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 2:
                            strP3 = android.support.v4.media.session.b.p(parcel, i4);
                            break;
                        case 3:
                            strP4 = android.support.v4.media.session.b.p(parcel, i4);
                            break;
                        case 4:
                            p9VarArr = (p9[]) android.support.v4.media.session.b.q(parcel, i4, p9.CREATOR);
                            break;
                        case 5:
                            zC2 = android.support.v4.media.session.b.C(parcel, i4);
                            break;
                        case 6:
                            bArrK = android.support.v4.media.session.b.k(parcel, i4);
                            break;
                        case 7:
                            jG3 = android.support.v4.media.session.b.G(parcel, i4);
                            break;
                        default:
                            android.support.v4.media.session.b.J(parcel, i4);
                            break;
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM4);
                return new q9(strP3, strP4, p9VarArr, zC2, bArrK, jG3);
            case 4:
                int iM5 = android.support.v4.media.session.b.M(parcel);
                byte[] bArrK2 = null;
                while (parcel.dataPosition() < iM5) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 2) {
                        android.support.v4.media.session.b.J(parcel, i5);
                    } else {
                        bArrK2 = android.support.v4.media.session.b.k(parcel, i5);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM5);
                return new r9(bArrK2);
            case 5:
                int iM6 = android.support.v4.media.session.b.M(parcel);
                String strP5 = null;
                byte[] bArrK3 = null;
                byte[][] bArrL = null;
                byte[][] bArrL2 = null;
                byte[][] bArrL3 = null;
                byte[][] bArrL4 = null;
                int[] iArrN = null;
                byte[][] bArrL5 = null;
                int[] iArrN2 = null;
                byte[][] bArrL6 = null;
                while (parcel.dataPosition() < iM6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 2:
                            strP5 = android.support.v4.media.session.b.p(parcel, i6);
                            break;
                        case 3:
                            bArrK3 = android.support.v4.media.session.b.k(parcel, i6);
                            break;
                        case 4:
                            bArrL = android.support.v4.media.session.b.l(parcel, i6);
                            break;
                        case 5:
                            bArrL2 = android.support.v4.media.session.b.l(parcel, i6);
                            break;
                        case 6:
                            bArrL3 = android.support.v4.media.session.b.l(parcel, i6);
                            break;
                        case 7:
                            bArrL4 = android.support.v4.media.session.b.l(parcel, i6);
                            break;
                        case '\b':
                            iArrN = android.support.v4.media.session.b.n(parcel, i6);
                            break;
                        case '\t':
                            bArrL5 = android.support.v4.media.session.b.l(parcel, i6);
                            break;
                        case '\n':
                            iArrN2 = android.support.v4.media.session.b.n(parcel, i6);
                            break;
                        case 11:
                            bArrL6 = android.support.v4.media.session.b.l(parcel, i6);
                            break;
                        default:
                            android.support.v4.media.session.b.J(parcel, i6);
                            break;
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM6);
                return new s9(strP5, bArrK3, bArrL, bArrL2, bArrL3, bArrL4, iArrN, bArrL5, iArrN2, bArrL6);
            case 6:
                int iM7 = android.support.v4.media.session.b.M(parcel);
                boolean zC3 = false;
                int iF3 = 0;
                int iF4 = 0;
                int iF5 = 0;
                String strP6 = null;
                String strP7 = null;
                byte[] bArrK4 = null;
                double d = 0.0d;
                long jG4 = 0;
                while (parcel.dataPosition() < iM7) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 2:
                            strP6 = android.support.v4.media.session.b.p(parcel, i7);
                            break;
                        case 3:
                            jG4 = android.support.v4.media.session.b.G(parcel, i7);
                            break;
                        case 4:
                            zC3 = android.support.v4.media.session.b.C(parcel, i7);
                            break;
                        case 5:
                            android.support.v4.media.session.b.O(parcel, i7, 8);
                            d = parcel.readDouble();
                            break;
                        case 6:
                            strP7 = android.support.v4.media.session.b.p(parcel, i7);
                            break;
                        case 7:
                            bArrK4 = android.support.v4.media.session.b.k(parcel, i7);
                            break;
                        case '\b':
                            iF3 = android.support.v4.media.session.b.F(parcel, i7);
                            break;
                        case '\t':
                            iF4 = android.support.v4.media.session.b.F(parcel, i7);
                            break;
                        case '\n':
                            iF5 = android.support.v4.media.session.b.F(parcel, i7);
                            break;
                        default:
                            android.support.v4.media.session.b.J(parcel, i7);
                            break;
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM7);
                return new t9(strP6, jG4, zC3, d, strP7, bArrK4, iF3, iF4, iF5);
            case 7:
                int iM8 = android.support.v4.media.session.b.M(parcel);
                boolean zC4 = false;
                String strP8 = null;
                String strP9 = null;
                t9 t9Var = null;
                while (parcel.dataPosition() < iM8) {
                    int i8 = parcel.readInt();
                    char c4 = (char) i8;
                    if (c4 == 2) {
                        strP8 = android.support.v4.media.session.b.p(parcel, i8);
                    } else if (c4 == 3) {
                        strP9 = android.support.v4.media.session.b.p(parcel, i8);
                    } else if (c4 == 4) {
                        t9Var = (t9) android.support.v4.media.session.b.o(parcel, i8, t9.CREATOR);
                    } else if (c4 != 5) {
                        android.support.v4.media.session.b.J(parcel, i8);
                    } else {
                        zC4 = android.support.v4.media.session.b.C(parcel, i8);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM8);
                return new u9(strP8, strP9, t9Var, zC4);
            case 8:
                int iM9 = android.support.v4.media.session.b.M(parcel);
                ArrayList arrayListR = null;
                while (parcel.dataPosition() < iM9) {
                    int i9 = parcel.readInt();
                    if (((char) i9) != 2) {
                        android.support.v4.media.session.b.J(parcel, i9);
                    } else {
                        arrayListR = android.support.v4.media.session.b.r(parcel, i9, u9.CREATOR);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM9);
                return new v9(arrayListR);
            default:
                int iM10 = android.support.v4.media.session.b.M(parcel);
                int iF6 = 0;
                int iF7 = 0;
                while (parcel.dataPosition() < iM10) {
                    int i10 = parcel.readInt();
                    char c5 = (char) i10;
                    if (c5 == 1) {
                        iF6 = android.support.v4.media.session.b.F(parcel, i10);
                    } else if (c5 != 2) {
                        android.support.v4.media.session.b.J(parcel, i10);
                    } else {
                        iF7 = android.support.v4.media.session.b.F(parcel, i10);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM10);
                return new w9(iF6, iF7);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new j6[i];
            case 1:
                return new l6[i];
            case 2:
                return new p9[i];
            case 3:
                return new q9[i];
            case 4:
                return new r9[i];
            case 5:
                return new s9[i];
            case 6:
                return new t9[i];
            case 7:
                return new u9[i];
            case 8:
                return new v9[i];
            default:
                return new w9[i];
        }
    }
}
