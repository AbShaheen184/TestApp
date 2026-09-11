package com.google.firebase.crashlytics.internal.metadata;

import com.app.mlounge.emulator.LibretroCore;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final com.google.android.material.internal.b a;

    static {
        com.google.firebase.encoders.json.d dVar = new com.google.firebase.encoders.json.d();
        a aVar = a.a;
        dVar.a(n.class, aVar);
        dVar.a(b.class, aVar);
        a = new com.google.android.material.internal.b(dVar);
    }

    public static b a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, LibretroCore.SCREEN_WIDTH);
        }
        return new b(string, string2, string3, string4, j);
    }
}
