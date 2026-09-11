package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import androidx.core.provider.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final HashSet a;
    public final PriorityBlockingQueue b;
    public final PriorityBlockingQueue c;
    public final androidx.compose.ui.input.pointer.util.b d;
    public final com.google.firebase.heartbeatinfo.e e;
    public final com.google.android.material.shape.g f;
    public final c[] g;
    public a h;

    public f(androidx.compose.ui.input.pointer.util.b bVar, com.google.firebase.heartbeatinfo.e eVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        com.google.android.material.shape.g gVar = new com.google.android.material.shape.g();
        new l(handler, 1);
        new AtomicInteger();
        this.a = new HashSet();
        this.b = new PriorityBlockingQueue();
        this.c = new PriorityBlockingQueue();
        new ArrayList();
        new ArrayList();
        this.d = bVar;
        this.e = eVar;
        this.g = new c[4];
        this.f = gVar;
    }

    public final void a() {
        b();
        PriorityBlockingQueue priorityBlockingQueue = this.b;
        PriorityBlockingQueue priorityBlockingQueue2 = this.c;
        androidx.compose.ui.input.pointer.util.b bVar = this.d;
        com.google.android.material.shape.g gVar = this.f;
        a aVar = new a(priorityBlockingQueue, priorityBlockingQueue2, bVar, gVar);
        this.h = aVar;
        aVar.start();
        int i = 0;
        while (true) {
            c[] cVarArr = this.g;
            if (i >= cVarArr.length) {
                return;
            }
            c cVar = new c(priorityBlockingQueue2, this.e, bVar, gVar);
            cVarArr[i] = cVar;
            cVar.start();
            i++;
        }
    }

    public final void b() {
        a aVar = this.h;
        if (aVar != null) {
            aVar.z = true;
            aVar.interrupt();
        }
        for (c cVar : this.g) {
            if (cVar != null) {
                cVar.y = true;
                cVar.interrupt();
            }
        }
    }
}
