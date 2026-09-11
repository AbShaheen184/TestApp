package androidx.emoji2.text;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements p {
    public String e;

    public /* synthetic */ r(String str) {
        this.e = str;
    }

    public static void a(com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar, com.google.firebase.crashlytics.internal.settings.c cVar2) {
        String str = cVar2.a;
        if (str != null) {
            cVar.r("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        cVar.r("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        cVar.r("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.5");
        cVar.r("Accept", "application/json");
        cVar.r("X-CRASHLYTICS-DEVICE-MODEL", cVar2.b);
        String str2 = cVar2.c;
        if (str2 != null) {
            cVar.r("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = cVar2.d;
        if (str3 != null) {
            cVar.r("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = cVar2.e.c().a;
        if (str4 != null) {
            cVar.r("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static HashMap b(com.google.firebase.crashlytics.internal.settings.c cVar) {
        HashMap map = new HashMap();
        map.put("build_version", cVar.h);
        map.put("display_version", cVar.g);
        map.put("source", Integer.toString(cVar.i));
        String str = cVar.f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public JSONObject c(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar) {
        String str = this.e;
        int i = lVar.y;
        com.google.firebase.crashlytics.internal.b bVar = com.google.firebase.crashlytics.internal.b.a;
        bVar.c("Settings response code was: " + i);
        if (i == 200 || i == 201 || i == 202 || i == 203) {
            String str2 = (String) lVar.z;
            try {
                return new JSONObject(str2);
            } catch (Exception e) {
                bVar.d(e, "Failed to parse settings JSON from ".concat(str));
                bVar.d(null, "Settings response " + str2);
                return null;
            }
        }
        String str3 = "Settings request failed; (status: " + i + ") from " + str;
        if (bVar.a(6)) {
            Log.e("FirebaseCrashlytics", str3, null);
        }
        return null;
    }

    @Override // androidx.emoji2.text.p
    public boolean f(CharSequence charSequence, int i, int i2, y yVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.e)) {
            return true;
        }
        yVar.c = (yVar.c & 3) | 4;
        return false;
    }

    @Override // androidx.emoji2.text.p
    public Object e() {
        return this;
    }
}
