package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.room.r;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new android.support.v4.media.a(12);
    public final String A;
    public final String B;
    public final Uri C;
    public String D;
    public final long E;
    public final String F;
    public final List G;
    public final String H;
    public final String I;
    public final HashSet J = new HashSet();
    public final int e;
    public final String y;
    public final String z;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.e = i;
        this.y = str;
        this.z = str2;
        this.A = str3;
        this.B = str4;
        this.C = uri;
        this.D = str5;
        this.E = j;
        this.F = str6;
        this.G = arrayList;
        this.H = str7;
        this.I = str8;
    }

    public static GoogleSignInAccount d(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        x.d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.D = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.F.equals(this.F)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.G);
        hashSet.addAll(googleSignInAccount.J);
        HashSet hashSet2 = new HashSet(this.G);
        hashSet2.addAll(this.J);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.F.hashCode() + 527;
        HashSet hashSet = new HashSet(this.G);
        hashSet.addAll(this.J);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = r.H(parcel, 20293);
        r.G(parcel, 1, 4);
        parcel.writeInt(this.e);
        r.D(parcel, 2, this.y);
        r.D(parcel, 3, this.z);
        r.D(parcel, 4, this.A);
        r.D(parcel, 5, this.B);
        r.C(parcel, 6, this.C, i);
        r.D(parcel, 7, this.D);
        r.G(parcel, 8, 8);
        parcel.writeLong(this.E);
        r.D(parcel, 9, this.F);
        r.F(parcel, 10, this.G);
        r.D(parcel, 11, this.H);
        r.D(parcel, 12, this.I);
        r.I(parcel, iH);
    }
}
