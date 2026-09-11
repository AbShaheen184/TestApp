package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ta {
    public static final androidx.collection.f a = new androidx.collection.f(0);

    public static synchronized void a() {
        androidx.collection.f fVar = a;
        Iterator it = ((androidx.collection.e) fVar.values()).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        fVar.clear();
    }
}
