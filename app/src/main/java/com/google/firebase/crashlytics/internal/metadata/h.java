package com.google.firebase.crashlytics.internal.metadata;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final Charset b = Charset.forName("UTF-8");
    public final com.google.firebase.crashlytics.internal.persistence.c a;

    public h(com.google.firebase.crashlytics.internal.persistence.c cVar) {
        this.a = cVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(n.a(string));
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(n.a.c(list.get(i))));
            } catch (JSONException e) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", coil3.compose.internal.f.e("Deleted corrupt file: ", file.getAbsolutePath(), "\nReason: ", str), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    public final Map c(String str, boolean z) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e;
        com.google.firebase.crashlytics.internal.persistence.c cVar = this.a;
        File fileF = z ? cVar.f(str, "internal-keys") : cVar.f(str, "keys");
        if (!fileF.exists() || fileF.length() == 0) {
            g(fileF, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(fileF);
                try {
                    HashMap mapA = a(com.google.firebase.crashlytics.internal.common.g.i(fileInputStream));
                    com.google.firebase.crashlytics.internal.common.g.b(fileInputStream, "Failed to close user metadata file.");
                    return mapA;
                } catch (Exception e2) {
                    e = e2;
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                    f(fileF);
                    com.google.firebase.crashlytics.internal.common.g.b(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Exception e3) {
                fileInputStream = null;
                e = e3;
            } catch (Throwable th2) {
                ?? r1 = 0;
                th = th2;
                com.google.firebase.crashlytics.internal.common.g.b(r1, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            com.google.firebase.crashlytics.internal.common.g.b(r1, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    public final String d(String str) {
        FileInputStream fileInputStream;
        File fileF = this.a.f(str, "user-data");
        ?? r6 = 0;
        if (fileF.exists()) {
            ?? r3 = (fileF.length() > 0L ? 1 : (fileF.length() == 0L ? 0 : -1));
            try {
                if (r3 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileF);
                        try {
                            JSONObject jSONObject = new JSONObject(com.google.firebase.crashlytics.internal.common.g.i(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + strOptString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            com.google.firebase.crashlytics.internal.common.g.b(fileInputStream, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e) {
                            e = e;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(fileF);
                            com.google.firebase.crashlytics.internal.common.g.b(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        com.google.firebase.crashlytics.internal.common.g.b(r6, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r6 = r3;
            }
        }
        String strH = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strH, null);
        }
        f(fileF);
        return null;
    }

    public final void h(String str, Map map, boolean z) {
        com.google.firebase.crashlytics.internal.persistence.c cVar = this.a;
        File fileF = z ? cVar.f(str, "internal-keys") : cVar.f(str, "keys");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new JSONObject(map).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileF), b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    com.google.firebase.crashlytics.internal.common.g.b(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                    f(fileF);
                    com.google.firebase.crashlytics.internal.common.g.b(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    com.google.firebase.crashlytics.internal.common.g.b(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
