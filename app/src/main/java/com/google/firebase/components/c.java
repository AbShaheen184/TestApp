package com.google.firebase.components;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    default Object a(Class cls) {
        return f(r.a(cls));
    }

    com.google.firebase.inject.b b(r rVar);

    default com.google.firebase.inject.b c(Class cls) {
        return b(r.a(cls));
    }

    default Set d(r rVar) {
        return (Set) e(rVar).get();
    }

    com.google.firebase.inject.b e(r rVar);

    default Object f(r rVar) {
        com.google.firebase.inject.b bVarB = b(rVar);
        if (bVarB == null) {
            return null;
        }
        return bVarB.get();
    }

    p g(r rVar);
}
