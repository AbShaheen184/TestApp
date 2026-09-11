package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.x;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = com.google.android.gms.common.util.d.a;
        x.i("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static i a(Context context) {
        coil3.memory.c cVar = new coil3.memory.c(context, 21);
        String strM = cVar.m("google_app_id");
        if (TextUtils.isEmpty(strM)) {
            return null;
        }
        return new i(strM, cVar.m("google_api_key"), cVar.m("firebase_database_url"), cVar.m("ga_trackingId"), cVar.m("gcm_defaultSenderId"), cVar.m("google_storage_bucket"), cVar.m("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return x.j(this.b, iVar.b) && x.j(this.a, iVar.a) && x.j(this.c, iVar.c) && x.j(this.d, iVar.d) && x.j(this.e, iVar.e) && x.j(this.f, iVar.f) && x.j(this.g, iVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        coil3.memory.c cVar = new coil3.memory.c(this);
        cVar.f(this.b, "applicationId");
        cVar.f(this.a, "apiKey");
        cVar.f(this.c, "databaseUrl");
        cVar.f(this.e, "gcmSenderId");
        cVar.f(this.f, "storageBucket");
        cVar.f(this.g, "projectId");
        return cVar.toString();
    }
}
