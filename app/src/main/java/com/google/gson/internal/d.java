package com.google.gson.internal;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.google.gson.o, Cloneable {
    public static final d z = new d();
    public final List e;
    public final List y;

    public d() {
        List list = Collections.EMPTY_LIST;
        this.e = list;
        this.y = list;
    }

    @Override // com.google.gson.o
    public final com.google.gson.n a(com.google.gson.f fVar, com.google.gson.reflect.a aVar) {
        Class clsA = aVar.a();
        boolean zB = b(clsA, true);
        boolean zB2 = b(clsA, false);
        if (zB || zB2) {
            return new c(this, zB2, zB, fVar, aVar);
        }
        return null;
    }

    public final boolean b(Class cls, boolean z2) {
        if (!z2 && !Enum.class.isAssignableFrom(cls)) {
            com.google.common.base.c cVar = com.google.gson.internal.reflect.c.a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z2 ? this.e : this.y).iterator();
        if (it.hasNext()) {
            throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
        }
        return false;
    }

    public final Object clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e) {
            net.luminis.tls.engine.impl.c.m(e);
            return null;
        }
    }
}
