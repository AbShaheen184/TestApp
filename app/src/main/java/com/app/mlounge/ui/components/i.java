package com.app.mlounge.ui.components;

import android.content.Context;
import android.util.Log;
import androidx.appcompat.widget.q2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        BufferedWriter bufferedWriter;
        switch (this.e) {
            case 0:
                Context context = (Context) this.y;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.z;
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) this.A;
                kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) this.B;
                try {
                    URLConnection uRLConnectionOpenConnection = new URL("https://chq-api.ddns.me/chqdl/release.apk").openConnection();
                    uRLConnectionOpenConnection.getClass();
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setConnectTimeout(15000);
                    httpURLConnection.setReadTimeout(30000);
                    httpURLConnection.connect();
                    long contentLength = httpURLConnection.getContentLength();
                    File file = new File(context.getExternalFilesDir(null), "update.apk");
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[8192];
                            long j = 0;
                            while (true) {
                                int i = inputStream.read(bArr);
                                if (i == -1) {
                                    fileOutputStream.close();
                                    inputStream.close();
                                    httpURLConnection.disconnect();
                                    lVar.invoke(Float.valueOf(1.0f));
                                    lVar2.invoke(file);
                                    return;
                                }
                                fileOutputStream.write(bArr, 0, i);
                                j += (long) i;
                                if (contentLength > 0) {
                                    lVar.invoke(Float.valueOf(j / contentLength));
                                }
                                try {
                                    throw th;
                                } catch (Throwable th) {
                                    com.google.common.base.b.d(inputStream, th);
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                com.google.common.base.b.d(fileOutputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                } catch (Exception e) {
                    lVar3.invoke("Download failed: " + e.getMessage());
                    return;
                }
            case 1:
                com.google.android.datatransport.runtime.scheduling.a aVar = (com.google.android.datatransport.runtime.scheduling.a) this.y;
                com.google.android.datatransport.runtime.i iVar = (com.google.android.datatransport.runtime.i) this.z;
                String str = iVar.a;
                com.google.android.datatransport.f fVar = (com.google.android.datatransport.f) this.A;
                com.google.android.datatransport.runtime.h hVar = (com.google.android.datatransport.runtime.h) this.B;
                aVar.getClass();
                Logger logger = com.google.android.datatransport.runtime.scheduling.a.f;
                try {
                    com.google.android.datatransport.runtime.backends.h hVarA = aVar.c.a(str);
                    if (hVarA == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        fVar.g(new IllegalArgumentException(str2));
                    } else {
                        aVar.e.L(new androidx.media3.exoplayer.source.a0(2, aVar, iVar, ((com.google.android.datatransport.cct.b) hVarA).a(hVar)));
                        fVar.g(null);
                    }
                    return;
                } catch (Exception e2) {
                    logger.warning("Error scheduling event " + e2.getMessage());
                    fVar.g(e2);
                    return;
                }
            default:
                q2 q2Var = (q2) this.y;
                String str3 = (String) this.z;
                Map map = (Map) this.A;
                List list = (List) this.B;
                com.google.firebase.crashlytics.internal.metadata.h hVar2 = (com.google.firebase.crashlytics.internal.metadata.h) q2Var.a;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) q2Var.g;
                BufferedWriter bufferedWriter2 = null;
                ?? r8 = 0;
                bufferedWriter2 = null;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    String str4 = (String) atomicMarkableReference.getReference();
                    ?? r10 = "user-data";
                    File fileF = hVar2.a.f(str3, "user-data");
                    try {
                        try {
                            com.google.firebase.crashlytics.internal.metadata.g gVar = new com.google.firebase.crashlytics.internal.metadata.g();
                            gVar.put("userId", str4);
                            String string = gVar.toString();
                            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileF), com.google.firebase.crashlytics.internal.metadata.h.b));
                            try {
                                bufferedWriter.write(string);
                                bufferedWriter.flush();
                                r10 = bufferedWriter;
                            } catch (Exception e3) {
                                e = e3;
                                Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                                r10 = bufferedWriter;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            bufferedWriter = null;
                        } catch (Throwable th5) {
                            th = th5;
                            com.google.firebase.crashlytics.internal.common.g.b(r8, "Failed to close user metadata file.");
                            throw th;
                        }
                        com.google.firebase.crashlytics.internal.common.g.b(r10, "Failed to close user metadata file.");
                    } catch (Throwable th6) {
                        th = th6;
                        r8 = r10;
                        com.google.firebase.crashlytics.internal.common.g.b(r8, "Failed to close user metadata file.");
                        throw th;
                    }
                }
                if (!map.isEmpty()) {
                    hVar2.h(str3, map, false);
                }
                if (list.isEmpty()) {
                    return;
                }
                File fileF2 = hVar2.a.f(str3, "rollouts-state");
                if (list.isEmpty()) {
                    com.google.firebase.crashlytics.internal.metadata.h.g(fileF2, "Rollout state is empty for session: " + str3);
                    return;
                }
                try {
                    try {
                        String strE = com.google.firebase.crashlytics.internal.metadata.h.e(list);
                        BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileF2), com.google.firebase.crashlytics.internal.metadata.h.b));
                        try {
                            bufferedWriter3.write(strE);
                            bufferedWriter3.flush();
                            com.google.firebase.crashlytics.internal.common.g.b(bufferedWriter3, "Failed to close rollouts state file.");
                            return;
                        } catch (Exception e5) {
                            e = e5;
                            bufferedWriter2 = bufferedWriter3;
                            Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                            com.google.firebase.crashlytics.internal.metadata.h.f(fileF2);
                            com.google.firebase.crashlytics.internal.common.g.b(bufferedWriter2, "Failed to close rollouts state file.");
                            return;
                        } catch (Throwable th7) {
                            th = th7;
                            bufferedWriter2 = bufferedWriter3;
                            com.google.firebase.crashlytics.internal.common.g.b(bufferedWriter2, "Failed to close rollouts state file.");
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } catch (Exception e6) {
                    e = e6;
                }
                break;
        }
    }
}
