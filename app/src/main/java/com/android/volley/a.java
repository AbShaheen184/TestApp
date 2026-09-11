package com.android.volley;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {
    public static final boolean A = g.a;
    public final BlockingQueue e;
    public final androidx.compose.ui.input.pointer.util.b y;
    public volatile boolean z = false;

    public a(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, androidx.compose.ui.input.pointer.util.b bVar, com.google.android.material.shape.g gVar) {
        this.e = priorityBlockingQueue;
        this.y = bVar;
        new HashMap();
    }

    private void a() {
        this.e.take().getClass();
        throw new ClassCastException();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        androidx.compose.ui.input.pointer.util.b bVar;
        androidx.compose.ui.input.pointer.util.b bVar2 = null;
        if (A) {
            g.b("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        androidx.compose.ui.input.pointer.util.b bVar3 = this.y;
        synchronized (bVar3) {
            try {
                try {
                    coil3.memory.c cVar = (coil3.memory.c) bVar3.c;
                    if (((File) cVar.y) == null) {
                        cVar.y = new File(((Context) cVar.z).getCacheDir(), "volley");
                    }
                    File file = (File) cVar.y;
                    if (file.exists()) {
                        File[] fileArrListFiles = file.listFiles();
                        if (fileArrListFiles != null) {
                            int length = fileArrListFiles.length;
                            int i = 0;
                            while (i < length) {
                                File file2 = fileArrListFiles[i];
                                try {
                                    long length2 = file2.length();
                                    com.android.volley.toolbox.b bVar4 = new com.android.volley.toolbox.b(new BufferedInputStream(new FileInputStream(file2)), length2);
                                    try {
                                        com.android.volley.toolbox.a aVarA = com.android.volley.toolbox.a.a(bVar4);
                                        aVarA.a = length2;
                                        String str = aVarA.b;
                                        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar3.b;
                                        if (linkedHashMap.containsKey(str)) {
                                            androidx.compose.ui.input.pointer.util.b bVar5 = bVar3;
                                            try {
                                                bVar = bVar5;
                                                bVar.a = (aVarA.a - ((com.android.volley.toolbox.a) linkedHashMap.get(str)).a) + bVar3.a;
                                            } catch (Throwable th) {
                                                th = th;
                                                bVar = bVar5;
                                                bVar4.close();
                                                throw th;
                                            }
                                        } else {
                                            bVar3.a += aVarA.a;
                                            bVar = bVar3;
                                        }
                                        try {
                                            linkedHashMap.put(str, aVarA);
                                            try {
                                                bVar4.close();
                                            } catch (IOException unused) {
                                                file2.delete();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bVar4.close();
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bVar = bVar3;
                                    }
                                } catch (IOException unused2) {
                                    bVar = bVar3;
                                }
                                i++;
                                bVar3 = bVar;
                            }
                        }
                    } else if (!file.mkdirs()) {
                        Log.e("Volley", g.a("Unable to create cache dir %s", file.getAbsolutePath()));
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bVar2 = bVar3;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
        }
        while (true) {
            try {
                a();
            } catch (InterruptedException unused3) {
                if (this.z) {
                    Thread.currentThread().interrupt();
                    return;
                }
                Log.e("Volley", g.a("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]));
            }
        }
    }
}
