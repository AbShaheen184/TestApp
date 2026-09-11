package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends com.google.android.gms.common.internal.safeparcel.a implements Iterable {
    public static final Parcelable.Creator<t> CREATOR = new android.support.v4.media.a(29);
    public final Bundle e;

    public t(Bundle bundle) {
        this.e = bundle;
    }

    public final Object d(String str) {
        return this.e.get(str);
    }

    public final Double e() {
        return Double.valueOf(this.e.getDouble(ES6Iterator.VALUE_PROPERTY));
    }

    public final String f() {
        return this.e.getString("currency");
    }

    public final Bundle h() {
        return new Bundle(this.e);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new s(this);
    }

    public final String toString() {
        return this.e.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.x(parcel, 2, h());
        androidx.room.r.I(parcel, iH);
    }
}
