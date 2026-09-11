package com.google.firebase.crashlytics.internal.model;

import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.google.firebase.encoders.d {
    public static final c a = new c();
    public static final com.google.firebase.encoders.c b = com.google.firebase.encoders.c.a("key");
    public static final com.google.firebase.encoders.c c = com.google.firebase.encoders.c.a(ES6Iterator.VALUE_PROPERTY);

    @Override // com.google.firebase.encoders.a
    public final void a(Object obj, Object obj2) {
        com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
        f0 f0Var = (f0) ((q1) obj);
        eVar.g(b, f0Var.a);
        eVar.g(c, f0Var.b);
    }
}
