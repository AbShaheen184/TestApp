package android.support.v4.media;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.d;
import androidx.activity.result.j;
import androidx.core.widget.f;
import androidx.recyclerview.widget.u0;
import androidx.recyclerview.widget.v0;
import androidx.room.r;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.f0;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.measurement.internal.e;
import com.google.android.gms.measurement.internal.i;
import com.google.android.gms.measurement.internal.o4;
import com.google.android.gms.measurement.internal.t;
import com.google.android.gms.measurement.internal.u;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    public static void a(g gVar, Parcel parcel, int i) {
        int iH = r.H(parcel, 20293);
        int i2 = gVar.e;
        r.G(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = gVar.y;
        r.G(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = gVar.z;
        r.G(parcel, 3, 4);
        parcel.writeInt(i4);
        r.D(parcel, 4, gVar.A);
        r.A(parcel, 5, gVar.B);
        r.E(parcel, 6, gVar.C, i);
        r.x(parcel, 7, gVar.D);
        r.C(parcel, 8, gVar.E, i);
        r.E(parcel, 10, gVar.F, i);
        r.E(parcel, 11, gVar.G, i);
        boolean z = gVar.H;
        r.G(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = gVar.I;
        r.G(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = gVar.J;
        r.G(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        r.D(parcel, 15, gVar.K);
        r.I(parcel, iH);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Bundle bundle;
        int iF = 0;
        android.support.v4.os.b bVar = null;
        Bundle bundleJ = null;
        Bundle bundleJ2 = null;
        Bundle bundleJ3 = null;
        Account account = null;
        ArrayList arrayListR = null;
        String strP = null;
        String strP2 = null;
        switch (this.a) {
            case 0:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a(0);
                    public final int e;
                    public final MediaDescriptionCompat y;

                    {
                        this.e = parcel.readInt();
                        this.y = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.e + ", mDescription=" + this.y + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.e);
                        this.y.writeToParcel(parcel2, i);
                    }
                };
            case 1:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strG = b.g(mediaDescription);
                CharSequence charSequenceI = b.i(mediaDescription);
                CharSequence charSequenceH = b.h(mediaDescription);
                CharSequence charSequenceC = b.c(mediaDescription);
                Bitmap bitmapE = b.e(mediaDescription);
                Uri uriF = b.f(mediaDescription);
                Bundle bundleD = b.d(mediaDescription);
                if (bundleD != null) {
                    bundleD = android.support.v4.media.session.b.L(bundleD);
                }
                Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriA == null) {
                    bundle = bundleD;
                } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
                    bundle = null;
                } else {
                    bundleD.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleD;
                }
                if (uriA == null) {
                    uriA = c.a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
                mediaDescriptionCompat.F = mediaDescription;
                return mediaDescriptionCompat;
            case 2:
                return new MediaMetadataCompat(parcel);
            case 3:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 4:
                d dVar = new d();
                IBinder strongBinder = parcel.readStrongBinder();
                int i = android.support.v4.os.c.e;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(android.support.v4.os.b.a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof android.support.v4.os.b)) {
                        android.support.v4.os.a aVar = new android.support.v4.os.a();
                        aVar.d = strongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (android.support.v4.os.b) iInterfaceQueryLocalInterface;
                    }
                }
                dVar.e = bVar;
                return dVar;
            case 5:
                parcel.getClass();
                return new androidx.activity.result.a(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 6:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new j((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 7:
                f fVar = new f(parcel);
                fVar.e = parcel.readInt();
                return fVar;
            case 8:
                androidx.recyclerview.widget.r rVar = new androidx.recyclerview.widget.r();
                rVar.e = parcel.readInt();
                rVar.y = parcel.readInt();
                rVar.z = parcel.readInt() == 1;
                return rVar;
            case 9:
                u0 u0Var = new u0();
                u0Var.e = parcel.readInt();
                u0Var.y = parcel.readInt();
                u0Var.A = parcel.readInt() == 1;
                int i2 = parcel.readInt();
                if (i2 > 0) {
                    int[] iArr = new int[i2];
                    u0Var.z = iArr;
                    parcel.readIntArray(iArr);
                }
                return u0Var;
            case 10:
                v0 v0Var = new v0();
                v0Var.e = parcel.readInt();
                v0Var.y = parcel.readInt();
                int i3 = parcel.readInt();
                v0Var.z = i3;
                if (i3 > 0) {
                    int[] iArr2 = new int[i3];
                    v0Var.A = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i4 = parcel.readInt();
                v0Var.B = i4;
                if (i4 > 0) {
                    int[] iArr3 = new int[i4];
                    v0Var.C = iArr3;
                    parcel.readIntArray(iArr3);
                }
                v0Var.E = parcel.readInt() == 1;
                v0Var.F = parcel.readInt() == 1;
                v0Var.G = parcel.readInt() == 1;
                v0Var.D = parcel.readArrayList(u0.class.getClassLoader());
                return v0Var;
            case 11:
                return new ParcelImpl(parcel);
            case 12:
                int iM = android.support.v4.media.session.b.M(parcel);
                long jG = 0;
                int iF2 = 0;
                String strP3 = null;
                String strP4 = null;
                String strP5 = null;
                String strP6 = null;
                Uri uri = null;
                String strP7 = null;
                String strP8 = null;
                ArrayList arrayListR2 = null;
                String strP9 = null;
                String strP10 = null;
                while (parcel.dataPosition() < iM) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 1:
                            iF2 = android.support.v4.media.session.b.F(parcel, i5);
                            break;
                        case 2:
                            strP3 = android.support.v4.media.session.b.p(parcel, i5);
                            break;
                        case 3:
                            strP4 = android.support.v4.media.session.b.p(parcel, i5);
                            break;
                        case 4:
                            strP5 = android.support.v4.media.session.b.p(parcel, i5);
                            break;
                        case 5:
                            strP6 = android.support.v4.media.session.b.p(parcel, i5);
                            break;
                        case 6:
                            uri = (Uri) android.support.v4.media.session.b.o(parcel, i5, Uri.CREATOR);
                            break;
                        case 7:
                            strP7 = android.support.v4.media.session.b.p(parcel, i5);
                            break;
                        case '\b':
                            jG = android.support.v4.media.session.b.G(parcel, i5);
                            break;
                        case '\t':
                            strP8 = android.support.v4.media.session.b.p(parcel, i5);
                            break;
                        case '\n':
                            arrayListR2 = android.support.v4.media.session.b.r(parcel, i5, Scope.CREATOR);
                            break;
                        case 11:
                            strP9 = android.support.v4.media.session.b.p(parcel, i5);
                            break;
                        case '\f':
                            strP10 = android.support.v4.media.session.b.p(parcel, i5);
                            break;
                        default:
                            android.support.v4.media.session.b.J(parcel, i5);
                            break;
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM);
                return new GoogleSignInAccount(iF2, strP3, strP4, strP5, strP6, uri, strP7, jG, strP8, arrayListR2, strP9, strP10);
            case 13:
                int iM2 = android.support.v4.media.session.b.M(parcel);
                while (parcel.dataPosition() < iM2) {
                    int i6 = parcel.readInt();
                    char c = (char) i6;
                    if (c == 1) {
                        iF = android.support.v4.media.session.b.F(parcel, i6);
                    } else if (c != 2) {
                        android.support.v4.media.session.b.J(parcel, i6);
                    } else {
                        strP2 = android.support.v4.media.session.b.p(parcel, i6);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM2);
                return new Scope(iF, strP2);
            case 14:
                int iM3 = android.support.v4.media.session.b.M(parcel);
                PendingIntent pendingIntent = null;
                com.google.android.gms.common.b bVar2 = null;
                while (parcel.dataPosition() < iM3) {
                    int i7 = parcel.readInt();
                    char c2 = (char) i7;
                    if (c2 == 1) {
                        iF = android.support.v4.media.session.b.F(parcel, i7);
                    } else if (c2 == 2) {
                        strP = android.support.v4.media.session.b.p(parcel, i7);
                    } else if (c2 == 3) {
                        pendingIntent = (PendingIntent) android.support.v4.media.session.b.o(parcel, i7, PendingIntent.CREATOR);
                    } else if (c2 != 4) {
                        android.support.v4.media.session.b.J(parcel, i7);
                    } else {
                        bVar2 = (com.google.android.gms.common.b) android.support.v4.media.session.b.o(parcel, i7, com.google.android.gms.common.b.CREATOR);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM3);
                return new Status(iF, strP, pendingIntent, bVar2);
            case 15:
                int iM4 = android.support.v4.media.session.b.M(parcel);
                while (parcel.dataPosition() < iM4) {
                    int i8 = parcel.readInt();
                    char c3 = (char) i8;
                    if (c3 == 1) {
                        iF = android.support.v4.media.session.b.F(parcel, i8);
                    } else if (c3 != 2) {
                        android.support.v4.media.session.b.J(parcel, i8);
                    } else {
                        arrayListR = android.support.v4.media.session.b.r(parcel, i8, com.google.android.gms.common.internal.j.CREATOR);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM4);
                return new m(iF, arrayListR);
            case 16:
                int iM5 = android.support.v4.media.session.b.M(parcel);
                int iF3 = -1;
                long jG2 = 0;
                long jG3 = 0;
                int iF4 = 0;
                int iF5 = 0;
                int iF6 = 0;
                int iF7 = 0;
                String strP11 = null;
                String strP12 = null;
                while (parcel.dataPosition() < iM5) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            iF4 = android.support.v4.media.session.b.F(parcel, i9);
                            break;
                        case 2:
                            iF5 = android.support.v4.media.session.b.F(parcel, i9);
                            break;
                        case 3:
                            iF6 = android.support.v4.media.session.b.F(parcel, i9);
                            break;
                        case 4:
                            jG2 = android.support.v4.media.session.b.G(parcel, i9);
                            break;
                        case 5:
                            jG3 = android.support.v4.media.session.b.G(parcel, i9);
                            break;
                        case 6:
                            strP11 = android.support.v4.media.session.b.p(parcel, i9);
                            break;
                        case 7:
                            strP12 = android.support.v4.media.session.b.p(parcel, i9);
                            break;
                        case '\b':
                            iF7 = android.support.v4.media.session.b.F(parcel, i9);
                            break;
                        case '\t':
                            iF3 = android.support.v4.media.session.b.F(parcel, i9);
                            break;
                        default:
                            android.support.v4.media.session.b.J(parcel, i9);
                            break;
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM5);
                return new com.google.android.gms.common.internal.j(iF4, iF5, iF6, jG2, jG3, strP11, strP12, iF7, iF3);
            case 17:
                int iM6 = android.support.v4.media.session.b.M(parcel);
                int iF8 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iM6) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 1) {
                        iF = android.support.v4.media.session.b.F(parcel, i10);
                    } else if (c4 == 2) {
                        account = (Account) android.support.v4.media.session.b.o(parcel, i10, Account.CREATOR);
                    } else if (c4 == 3) {
                        iF8 = android.support.v4.media.session.b.F(parcel, i10);
                    } else if (c4 != 4) {
                        android.support.v4.media.session.b.J(parcel, i10);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) android.support.v4.media.session.b.o(parcel, i10, GoogleSignInAccount.CREATOR);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM6);
                return new q(iF, account, iF8, googleSignInAccount);
            case 18:
                int iM7 = android.support.v4.media.session.b.M(parcel);
                int iF9 = 0;
                boolean zC = false;
                boolean zC2 = false;
                IBinder iBinderE = null;
                com.google.android.gms.common.b bVar3 = null;
                while (parcel.dataPosition() < iM7) {
                    int i11 = parcel.readInt();
                    char c5 = (char) i11;
                    if (c5 == 1) {
                        iF9 = android.support.v4.media.session.b.F(parcel, i11);
                    } else if (c5 == 2) {
                        iBinderE = android.support.v4.media.session.b.E(parcel, i11);
                    } else if (c5 == 3) {
                        bVar3 = (com.google.android.gms.common.b) android.support.v4.media.session.b.o(parcel, i11, com.google.android.gms.common.b.CREATOR);
                    } else if (c5 == 4) {
                        zC = android.support.v4.media.session.b.C(parcel, i11);
                    } else if (c5 != 5) {
                        android.support.v4.media.session.b.J(parcel, i11);
                    } else {
                        zC2 = android.support.v4.media.session.b.C(parcel, i11);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM7);
                return new com.google.android.gms.common.internal.r(iF9, iBinderE, bVar3, zC, zC2);
            case 19:
                int iM8 = android.support.v4.media.session.b.M(parcel);
                int iF10 = 0;
                boolean zC3 = false;
                boolean zC4 = false;
                int iF11 = 0;
                int iF12 = 0;
                while (parcel.dataPosition() < iM8) {
                    int i12 = parcel.readInt();
                    char c6 = (char) i12;
                    if (c6 == 1) {
                        iF10 = android.support.v4.media.session.b.F(parcel, i12);
                    } else if (c6 == 2) {
                        zC3 = android.support.v4.media.session.b.C(parcel, i12);
                    } else if (c6 == 3) {
                        zC4 = android.support.v4.media.session.b.C(parcel, i12);
                    } else if (c6 == 4) {
                        iF11 = android.support.v4.media.session.b.F(parcel, i12);
                    } else if (c6 != 5) {
                        android.support.v4.media.session.b.J(parcel, i12);
                    } else {
                        iF12 = android.support.v4.media.session.b.F(parcel, i12);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM8);
                return new l(iF10, zC3, zC4, iF11, iF12);
            case 20:
                int iM9 = android.support.v4.media.session.b.M(parcel);
                com.google.android.gms.common.d[] dVarArr = null;
                com.google.android.gms.common.internal.f fVar2 = null;
                while (parcel.dataPosition() < iM9) {
                    int i13 = parcel.readInt();
                    char c7 = (char) i13;
                    if (c7 == 1) {
                        bundleJ3 = android.support.v4.media.session.b.j(parcel, i13);
                    } else if (c7 == 2) {
                        dVarArr = (com.google.android.gms.common.d[]) android.support.v4.media.session.b.q(parcel, i13, com.google.android.gms.common.d.CREATOR);
                    } else if (c7 == 3) {
                        iF = android.support.v4.media.session.b.F(parcel, i13);
                    } else if (c7 != 4) {
                        android.support.v4.media.session.b.J(parcel, i13);
                    } else {
                        fVar2 = (com.google.android.gms.common.internal.f) android.support.v4.media.session.b.o(parcel, i13, com.google.android.gms.common.internal.f.CREATOR);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM9);
                f0 f0Var = new f0();
                f0Var.e = bundleJ3;
                f0Var.y = dVarArr;
                f0Var.z = iF;
                f0Var.A = fVar2;
                return f0Var;
            case 21:
                int iM10 = android.support.v4.media.session.b.M(parcel);
                boolean zC5 = false;
                boolean zC6 = false;
                int iF13 = 0;
                l lVar = null;
                int[] iArrN = null;
                int[] iArrN2 = null;
                while (parcel.dataPosition() < iM10) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            lVar = (l) android.support.v4.media.session.b.o(parcel, i14, l.CREATOR);
                            break;
                        case 2:
                            zC5 = android.support.v4.media.session.b.C(parcel, i14);
                            break;
                        case 3:
                            zC6 = android.support.v4.media.session.b.C(parcel, i14);
                            break;
                        case 4:
                            iArrN = android.support.v4.media.session.b.n(parcel, i14);
                            break;
                        case 5:
                            iF13 = android.support.v4.media.session.b.F(parcel, i14);
                            break;
                        case 6:
                            iArrN2 = android.support.v4.media.session.b.n(parcel, i14);
                            break;
                        default:
                            android.support.v4.media.session.b.J(parcel, i14);
                            break;
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM10);
                return new com.google.android.gms.common.internal.f(lVar, zC5, zC6, iArrN, iF13, iArrN2);
            case 22:
                int iM11 = android.support.v4.media.session.b.M(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = g.L;
                com.google.android.gms.common.d[] dVarArr2 = g.M;
                com.google.android.gms.common.d[] dVarArr3 = dVarArr2;
                int iF14 = 0;
                int iF15 = 0;
                int iF16 = 0;
                boolean zC7 = false;
                int iF17 = 0;
                boolean zC8 = false;
                String strP13 = null;
                IBinder iBinderE2 = null;
                Account account2 = null;
                String strP14 = null;
                while (parcel.dataPosition() < iM11) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            iF14 = android.support.v4.media.session.b.F(parcel, i15);
                            break;
                        case 2:
                            iF15 = android.support.v4.media.session.b.F(parcel, i15);
                            break;
                        case 3:
                            iF16 = android.support.v4.media.session.b.F(parcel, i15);
                            break;
                        case 4:
                            strP13 = android.support.v4.media.session.b.p(parcel, i15);
                            break;
                        case 5:
                            iBinderE2 = android.support.v4.media.session.b.E(parcel, i15);
                            break;
                        case 6:
                            scopeArr = (Scope[]) android.support.v4.media.session.b.q(parcel, i15, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = android.support.v4.media.session.b.j(parcel, i15);
                            break;
                        case '\b':
                            account2 = (Account) android.support.v4.media.session.b.o(parcel, i15, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            android.support.v4.media.session.b.J(parcel, i15);
                            break;
                        case '\n':
                            dVarArr2 = (com.google.android.gms.common.d[]) android.support.v4.media.session.b.q(parcel, i15, com.google.android.gms.common.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (com.google.android.gms.common.d[]) android.support.v4.media.session.b.q(parcel, i15, com.google.android.gms.common.d.CREATOR);
                            break;
                        case '\f':
                            zC7 = android.support.v4.media.session.b.C(parcel, i15);
                            break;
                        case '\r':
                            iF17 = android.support.v4.media.session.b.F(parcel, i15);
                            break;
                        case 14:
                            zC8 = android.support.v4.media.session.b.C(parcel, i15);
                            break;
                        case 15:
                            strP14 = android.support.v4.media.session.b.p(parcel, i15);
                            break;
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM11);
                return new g(iF14, iF15, iF16, strP13, iBinderE2, scopeArr, bundle2, account2, dVarArr2, dVarArr3, zC7, iF17, zC8, strP14);
            case 23:
                int iM12 = android.support.v4.media.session.b.M(parcel);
                int iF18 = 0;
                int iF19 = 0;
                PendingIntent pendingIntent2 = null;
                String strP15 = null;
                Integer numValueOf = null;
                while (parcel.dataPosition() < iM12) {
                    int i16 = parcel.readInt();
                    char c8 = (char) i16;
                    if (c8 == 1) {
                        iF18 = android.support.v4.media.session.b.F(parcel, i16);
                    } else if (c8 == 2) {
                        iF19 = android.support.v4.media.session.b.F(parcel, i16);
                    } else if (c8 == 3) {
                        pendingIntent2 = (PendingIntent) android.support.v4.media.session.b.o(parcel, i16, PendingIntent.CREATOR);
                    } else if (c8 == 4) {
                        strP15 = android.support.v4.media.session.b.p(parcel, i16);
                    } else if (c8 != 5) {
                        android.support.v4.media.session.b.J(parcel, i16);
                    } else {
                        int iH = android.support.v4.media.session.b.H(parcel, i16);
                        if (iH == 0) {
                            numValueOf = null;
                        } else {
                            android.support.v4.media.session.b.P(parcel, iH, 4);
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM12);
                return new com.google.android.gms.common.b(iF18, iF19, pendingIntent2, strP15, numValueOf);
            case 24:
                int iM13 = android.support.v4.media.session.b.M(parcel);
                long jG4 = -1;
                int iF20 = 0;
                boolean zC9 = false;
                String strP16 = null;
                while (parcel.dataPosition() < iM13) {
                    int i17 = parcel.readInt();
                    char c9 = (char) i17;
                    if (c9 == 1) {
                        strP16 = android.support.v4.media.session.b.p(parcel, i17);
                    } else if (c9 == 2) {
                        iF20 = android.support.v4.media.session.b.F(parcel, i17);
                    } else if (c9 == 3) {
                        jG4 = android.support.v4.media.session.b.G(parcel, i17);
                    } else if (c9 != 4) {
                        android.support.v4.media.session.b.J(parcel, i17);
                    } else {
                        zC9 = android.support.v4.media.session.b.C(parcel, i17);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM13);
                return new com.google.android.gms.common.d(strP16, iF20, jG4, zC9);
            case 25:
                int iM14 = android.support.v4.media.session.b.M(parcel);
                long jG5 = -1;
                boolean zC10 = false;
                int iF21 = 0;
                int iF22 = 0;
                String strP17 = null;
                while (parcel.dataPosition() < iM14) {
                    int i18 = parcel.readInt();
                    char c10 = (char) i18;
                    if (c10 == 1) {
                        zC10 = android.support.v4.media.session.b.C(parcel, i18);
                    } else if (c10 == 2) {
                        strP17 = android.support.v4.media.session.b.p(parcel, i18);
                    } else if (c10 == 3) {
                        iF21 = android.support.v4.media.session.b.F(parcel, i18);
                    } else if (c10 == 4) {
                        iF22 = android.support.v4.media.session.b.F(parcel, i18);
                    } else if (c10 != 5) {
                        android.support.v4.media.session.b.J(parcel, i18);
                    } else {
                        jG5 = android.support.v4.media.session.b.G(parcel, i18);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM14);
                return new com.google.android.gms.common.q(zC10, strP17, iF21, iF22, jG5);
            case 26:
                int iM15 = android.support.v4.media.session.b.M(parcel);
                long jG6 = 0;
                long jG7 = 0;
                int iF23 = 0;
                while (parcel.dataPosition() < iM15) {
                    int i19 = parcel.readInt();
                    char c11 = (char) i19;
                    if (c11 == 1) {
                        jG6 = android.support.v4.media.session.b.G(parcel, i19);
                    } else if (c11 == 2) {
                        iF23 = android.support.v4.media.session.b.F(parcel, i19);
                    } else if (c11 != 3) {
                        android.support.v4.media.session.b.J(parcel, i19);
                    } else {
                        jG7 = android.support.v4.media.session.b.G(parcel, i19);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM15);
                return new com.google.android.gms.measurement.internal.d(jG6, jG7, iF23);
            case 27:
                int iM16 = android.support.v4.media.session.b.M(parcel);
                long jG8 = 0;
                long jG9 = 0;
                long jG10 = 0;
                boolean zC11 = false;
                String strP18 = null;
                String strP19 = null;
                o4 o4Var = null;
                String strP20 = null;
                u uVar = null;
                u uVar2 = null;
                u uVar3 = null;
                while (parcel.dataPosition() < iM16) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 2:
                            strP18 = android.support.v4.media.session.b.p(parcel, i20);
                            break;
                        case 3:
                            strP19 = android.support.v4.media.session.b.p(parcel, i20);
                            break;
                        case 4:
                            o4Var = (o4) android.support.v4.media.session.b.o(parcel, i20, o4.CREATOR);
                            break;
                        case 5:
                            jG8 = android.support.v4.media.session.b.G(parcel, i20);
                            break;
                        case 6:
                            zC11 = android.support.v4.media.session.b.C(parcel, i20);
                            break;
                        case 7:
                            strP20 = android.support.v4.media.session.b.p(parcel, i20);
                            break;
                        case '\b':
                            uVar = (u) android.support.v4.media.session.b.o(parcel, i20, u.CREATOR);
                            break;
                        case '\t':
                            jG9 = android.support.v4.media.session.b.G(parcel, i20);
                            break;
                        case '\n':
                            uVar2 = (u) android.support.v4.media.session.b.o(parcel, i20, u.CREATOR);
                            break;
                        case 11:
                            jG10 = android.support.v4.media.session.b.G(parcel, i20);
                            break;
                        case '\f':
                            uVar3 = (u) android.support.v4.media.session.b.o(parcel, i20, u.CREATOR);
                            break;
                        default:
                            android.support.v4.media.session.b.J(parcel, i20);
                            break;
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM16);
                return new e(strP18, strP19, o4Var, jG8, zC11, strP20, uVar, jG9, uVar2, jG10, uVar3);
            case 28:
                int iM17 = android.support.v4.media.session.b.M(parcel);
                while (parcel.dataPosition() < iM17) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        android.support.v4.media.session.b.J(parcel, i21);
                    } else {
                        bundleJ2 = android.support.v4.media.session.b.j(parcel, i21);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM17);
                return new i(bundleJ2);
            default:
                int iM18 = android.support.v4.media.session.b.M(parcel);
                while (parcel.dataPosition() < iM18) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 2) {
                        android.support.v4.media.session.b.J(parcel, i22);
                    } else {
                        bundleJ = android.support.v4.media.session.b.j(parcel, i22);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM18);
                return new t(bundleJ);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i];
            case 1:
                return new MediaDescriptionCompat[i];
            case 2:
                return new MediaMetadataCompat[i];
            case 3:
                return new RatingCompat[i];
            case 4:
                return new d[i];
            case 5:
                return new androidx.activity.result.a[i];
            case 6:
                return new j[i];
            case 7:
                return new f[i];
            case 8:
                return new androidx.recyclerview.widget.r[i];
            case 9:
                return new u0[i];
            case 10:
                return new v0[i];
            case 11:
                return new ParcelImpl[i];
            case 12:
                return new GoogleSignInAccount[i];
            case 13:
                return new Scope[i];
            case 14:
                return new Status[i];
            case 15:
                return new m[i];
            case 16:
                return new com.google.android.gms.common.internal.j[i];
            case 17:
                return new q[i];
            case 18:
                return new com.google.android.gms.common.internal.r[i];
            case 19:
                return new l[i];
            case 20:
                return new f0[i];
            case 21:
                return new com.google.android.gms.common.internal.f[i];
            case 22:
                return new g[i];
            case 23:
                return new com.google.android.gms.common.b[i];
            case 24:
                return new com.google.android.gms.common.d[i];
            case 25:
                return new com.google.android.gms.common.q[i];
            case 26:
                return new com.google.android.gms.measurement.internal.d[i];
            case 27:
                return new e[i];
            case 28:
                return new i[i];
            default:
                return new t[i];
        }
    }
}
