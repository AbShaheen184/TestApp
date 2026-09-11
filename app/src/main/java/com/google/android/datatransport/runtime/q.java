package com.google.android.datatransport.runtime;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements com.google.android.datatransport.e {
    public final Set a;
    public final i b;
    public final r c;

    public q(Set set, i iVar, r rVar) {
        this.a = set;
        this.b = iVar;
        this.c = rVar;
    }

    public final androidx.compose.runtime.internal.c a(String str, com.google.android.datatransport.c cVar, com.google.firebase.components.s sVar) {
        Set set = this.a;
        if (set.contains(cVar)) {
            return new androidx.compose.runtime.internal.c(this.b, str, cVar, sVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
