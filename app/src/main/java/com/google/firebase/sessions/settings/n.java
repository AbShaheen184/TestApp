package com.google.firebase.sessions.settings;

import android.util.Log;
import androidx.compose.foundation.text.selection.q;
import com.google.firebase.sessions.j1;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final kotlin.coroutines.i a;
    public final j1 b;
    public final androidx.datastore.core.e c;
    public final AtomicReference d;

    public n(kotlin.coroutines.i iVar, j1 j1Var, androidx.datastore.core.e eVar) {
        iVar.getClass();
        j1Var.getClass();
        eVar.getClass();
        this.a = iVar;
        this.b = j1Var;
        this.c = eVar;
        this.d = new AtomicReference();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(iVar), null, null, new l(this, null, 0), 3, null);
    }

    public final g a() {
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == null) {
            Object objRunBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new l(this, null, 1), 1, null);
            while (!atomicReference.compareAndSet(null, objRunBlocking$default) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        obj.getClass();
        return (g) obj;
    }

    public final boolean b() {
        Long l = a().e;
        Integer num = a().d;
        if (l == null || num == null) {
            return true;
        }
        this.b.getClass();
        return j1.a().c - l.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(g gVar, kotlin.coroutines.jvm.internal.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i = mVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                mVar.z = i - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object obj = mVar.e;
        int i2 = mVar.z;
        try {
            if (i2 == 0) {
                kotlin.a.e(obj);
                androidx.datastore.core.e eVar = this.c;
                q qVar = new q(gVar, null, 8);
                mVar.z = 1;
                Object objA = eVar.a(qVar, mVar);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
            }
        } catch (IOException e) {
            Log.w("FirebaseSessions", "Failed to update config values: " + e);
        }
        return y.a;
    }
}
