package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.android.gms.common.internal.safeparcel.a {
    public static final b C = new b(0, null, null);
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(23);
    public final String A;
    public final Integer B;
    public final int e;
    public final int y;
    public final PendingIntent z;

    public b(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.e = i;
        this.y = i2;
        this.z = pendingIntent;
        this.A = str;
        this.B = num;
    }

    public static String d(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.y == bVar.y && x.j(this.z, bVar.z) && x.j(this.A, bVar.A) && x.j(this.B, bVar.B);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.y), this.z, this.A, this.B});
    }

    public final String toString() {
        coil3.memory.c cVar = new coil3.memory.c(this);
        cVar.f(d(this.y), "statusCode");
        cVar.f(this.z, "resolution");
        cVar.f(this.A, "message");
        cVar.f(this.B, "clientMethodKey");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.G(parcel, 1, 4);
        parcel.writeInt(this.e);
        androidx.room.r.G(parcel, 2, 4);
        parcel.writeInt(this.y);
        androidx.room.r.C(parcel, 3, this.z, i);
        androidx.room.r.D(parcel, 4, this.A);
        Integer num = this.B;
        if (num != null) {
            androidx.room.r.G(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        androidx.room.r.I(parcel, iH);
    }

    public b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
