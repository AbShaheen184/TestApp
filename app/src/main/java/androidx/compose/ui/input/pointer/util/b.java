package androidx.compose.ui.input.pointer.util;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l;
import androidx.media3.exoplayer.source.r0;
import coil3.k;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.n4;
import com.google.android.gms.measurement.internal.s1;
import com.google.android.gms.measurement.internal.x0;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public long a;
    public final Object b;
    public final Object c;

    public b(long j, l lVar) {
        this.a = j;
        this.b = lVar;
        r0 r0Var = new r0();
        r0Var.A = this;
        r0Var.z = new LinkedHashMap(0, 0.75f, true);
        r0Var.e = j;
        if (j > 0) {
            this.c = r0Var;
        } else {
            net.luminis.tls.engine.impl.c.o("maxSize <= 0");
            throw null;
        }
    }

    public static String b(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static b c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new b(0L, str, (String) null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new b(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }

    public static int d(com.android.volley.toolbox.b bVar) throws IOException {
        int i = bVar.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    public static int e(com.android.volley.toolbox.b bVar) {
        return (d(bVar) << 24) | d(bVar) | (d(bVar) << 8) | (d(bVar) << 16);
    }

    public static long f(com.android.volley.toolbox.b bVar) {
        return (((long) d(bVar)) & 255) | ((((long) d(bVar)) & 255) << 8) | ((((long) d(bVar)) & 255) << 16) | ((((long) d(bVar)) & 255) << 24) | ((((long) d(bVar)) & 255) << 32) | ((((long) d(bVar)) & 255) << 40) | ((((long) d(bVar)) & 255) << 48) | ((255 & ((long) d(bVar))) << 56);
    }

    public static String g(com.android.volley.toolbox.b bVar) throws IOException {
        long jF = f(bVar);
        long j = bVar.y - bVar.z;
        if (jF >= 0 && jF <= j) {
            int i = (int) jF;
            if (i == jF) {
                byte[] bArr = new byte[i];
                new DataInputStream(bVar).readFully(bArr);
                return new String(bArr, "UTF-8");
            }
        }
        StringBuilder sbM = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(jF, "streamToBytes length=", ", maxLength=");
        sbM.append(j);
        throw new IOException(sbM.toString());
    }

    public void a(long j, long j2) {
        ((e) this.b).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((e) this.c).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    public void h(coil3.memory.a aVar, k kVar, Map map, long j) {
        r0 r0Var = (r0) this.c;
        long j2 = r0Var.e;
        LinkedHashMap linkedHashMap = (LinkedHashMap) r0Var.z;
        if (j > j2) {
            Object objRemove = linkedHashMap.remove(aVar);
            if (objRemove != null) {
                r0Var.y = r0Var.b() - r0Var.c(aVar, objRemove);
                r0Var.a(aVar, objRemove, null);
            }
            ((l) this.b).o(aVar, kVar, map, j);
            return;
        }
        coil3.memory.e eVar = new coil3.memory.e(kVar, map, j);
        Object objPut = linkedHashMap.put(aVar, eVar);
        r0Var.y = r0Var.c(aVar, eVar) + r0Var.b();
        if (objPut != null) {
            r0Var.y = r0Var.b() - r0Var.c(aVar, objPut);
            r0Var.a(aVar, objPut, eVar);
        }
        r0Var.d(r0Var.e);
    }

    public List i() {
        List list;
        List list2;
        m mVar = (m) this.c;
        ArrayList arrayList = new ArrayList();
        String str = (String) this.b;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = mVar.m0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.a)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(3);
                        boolean z = cursorQuery.getLong(5) == 1;
                        long j3 = cursorQuery.getLong(6);
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.a) {
                            this.a = j;
                        }
                        try {
                            s8 s8Var = (s8) n4.g0(t8.K(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            s8Var.n(string);
                            long j4 = cursorQuery.getLong(2);
                            s8Var.b();
                            ((t8) s8Var.y).R(j4);
                            s8Var.b();
                            ((t8) s8Var.y).u(j3);
                            arrayList.add(new com.google.android.gms.measurement.internal.k(j, j2, z, (t8) s8Var.d()));
                        } catch (IOException e) {
                            x0 x0Var = ((s1) mVar.e).C;
                            s1.m(x0Var);
                            x0Var.C.c(x0.D(str), e, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursorQuery.moveToNext());
                    list = arrayList;
                } else {
                    list2 = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                x0 x0Var2 = ((s1) mVar.e).C;
                s1.m(x0Var2);
                x0Var2.C.c(x0.D(str), e2, "Data loss. Error querying raw events batch. appId");
                list = arrayList;
            }
            list = list2;
            return list;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public b(m mVar, String str, long j) {
        this.c = mVar;
        x.d(str);
        this.b = str;
        this.a = mVar.S("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    public b(m mVar, String str) {
        this.c = mVar;
        x.d(str);
        this.b = str;
        this.a = -1L;
    }

    public b() {
        this.b = new e();
        this.c = new e();
    }

    public b(coil3.memory.c cVar) {
        this.b = new LinkedHashMap(16, 0.75f, true);
        this.a = 0L;
        this.c = cVar;
    }

    public b(long j, String str, String str2) {
        this.b = str;
        this.c = str2;
        this.a = j;
    }
}
