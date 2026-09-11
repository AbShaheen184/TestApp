package com.google.gson.internal.bind;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final String a;
    public final Field b;
    public final String c;
    public final /* synthetic */ Method d;
    public final /* synthetic */ com.google.gson.n e;
    public final /* synthetic */ com.google.gson.n f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    public v(String str, Field field, Method method, com.google.gson.n nVar, com.google.gson.n nVar2, boolean z, boolean z2) {
        this.d = method;
        this.e = nVar;
        this.f = nVar2;
        this.g = z;
        this.h = z2;
        this.a = str;
        this.b = field;
        this.c = field.getName();
    }

    public final void a(com.google.gson.stream.b bVar, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Method method = this.d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new com.google.gson.i(8, androidx.privacysandbox.ads.adservices.java.internal.a.q("Accessor ", com.google.gson.internal.reflect.c.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = this.b.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        bVar.N(this.a);
        this.e.c(bVar, objInvoke);
    }
}
