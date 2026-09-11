package com.google.firebase.components;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements com.google.firebase.events.c, com.google.firebase.events.b {
    public final HashMap a;
    public ArrayDeque b;
    public final com.google.firebase.concurrent.j c;

    public l() {
        com.google.firebase.concurrent.j jVar = com.google.firebase.concurrent.j.e;
        this.a = new HashMap();
        this.b = new ArrayDeque();
        this.c = jVar;
    }

    public final synchronized void a(Executor executor, com.google.firebase.events.a aVar) {
        try {
            executor.getClass();
            if (!this.a.containsKey(com.google.firebase.b.class)) {
                this.a.put(com.google.firebase.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(com.google.firebase.b.class)).put(aVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
