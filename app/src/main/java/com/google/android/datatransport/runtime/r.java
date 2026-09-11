package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.appcompat.widget.c2;
import com.appsalt.internal.j0;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static volatile j e;
    public final com.google.android.datatransport.runtime.time.a a;
    public final com.google.android.datatransport.runtime.time.a b;
    public final com.google.android.datatransport.runtime.scheduling.a c;
    public final j0 d;

    public r(com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, com.google.android.datatransport.runtime.scheduling.a aVar3, j0 j0Var, com.google.firebase.messaging.o oVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = j0Var;
        ((Executor) oVar.y).execute(new com.google.android.datatransport.runtime.scheduling.jobscheduling.k(oVar, 0));
    }

    public static r a() {
        j jVar = e;
        if (jVar != null) {
            return (r) jVar.C.get();
        }
        net.luminis.tls.engine.impl.c.r("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (r.class) {
                try {
                    if (e == null) {
                        androidx.emoji2.text.m mVar = new androidx.emoji2.text.m();
                        context.getClass();
                        mVar.a = context;
                        e = mVar.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final q c(com.google.android.datatransport.cct.a aVar) {
        byte[] bytes;
        Set setUnmodifiableSet = aVar instanceof com.google.android.datatransport.cct.a ? Collections.unmodifiableSet(com.google.android.datatransport.cct.a.d) : Collections.singleton(new com.google.android.datatransport.c("proto"));
        c2 c2VarA = i.a();
        aVar.getClass();
        c2VarA.y = "cct";
        String str = aVar.a;
        String str2 = aVar.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = coil3.compose.internal.f.e("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        c2VarA.z = bytes;
        return new q(setUnmodifiableSet, c2VarA.q(), this);
    }
}
