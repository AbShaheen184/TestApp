package com.google.firebase.heartbeatinfo;

import android.util.Base64OutputStream;
import androidx.compose.animation.core.i0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ c(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        int i = this.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                synchronized (dVar) {
                    try {
                        h hVar = (h) dVar.a.get();
                        ArrayList arrayListA = hVar.a();
                        synchronized (hVar) {
                            hVar.a.a(new androidx.compose.ui.text.font.e(hVar, 18));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i2 = 0; i2 < arrayListA.size(); i2++) {
                            a aVar = (a) arrayListA.get(i2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                base64OutputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return string;
            default:
                synchronized (dVar) {
                    h hVar2 = (h) dVar.a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strA = ((com.google.firebase.platforminfo.b) dVar.c.get()).a();
                    synchronized (hVar2) {
                        String strB = hVar2.b(jCurrentTimeMillis);
                        strA.getClass();
                        hVar2.a.a(new i0(hVar2, strB, strA, new androidx.datastore.preferences.core.d(strA), 13));
                    }
                }
                return null;
        }
    }
}
