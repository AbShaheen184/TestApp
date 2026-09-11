package com.google.gson.internal;

import com.google.android.gms.measurement.internal.f0;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends u {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public q(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // com.google.gson.internal.u
    public final Object a(Class cls) {
        String strE = f0.e(cls);
        if (strE == null) {
            return this.b.invoke(this.c, cls);
        }
        net.luminis.tls.engine.impl.c.m("UnsafeAllocator is used for non-instantiable type: ".concat(strE));
        return null;
    }
}
