package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h implements Iterable {
    public final ArrayList e = new ArrayList();

    @Override // com.google.gson.h
    public final boolean b() {
        return j().b();
    }

    @Override // com.google.gson.h
    public final int c() {
        return j().c();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof g) && ((g) obj).e.equals(this.e);
        }
        return true;
    }

    @Override // com.google.gson.h
    public final long f() {
        return j().f();
    }

    @Override // com.google.gson.h
    public final String h() {
        return j().h();
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final h i() {
        return (h) this.e.get(0);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.e.iterator();
    }

    public final h j() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        if (size == 1) {
            return (h) arrayList.get(0);
        }
        net.luminis.tls.engine.impl.c.r(androidx.privacysandbox.ads.adservices.java.internal.a.l(size, "Array must have size 1, but has size "));
        return null;
    }
}
