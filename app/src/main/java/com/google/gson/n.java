package com.google.gson;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public final m a() {
        return !(this instanceof m) ? new m(this) : (m) this;
    }

    public abstract Object b(com.google.gson.stream.a aVar);

    public abstract void c(com.google.gson.stream.b bVar, Object obj);
}
