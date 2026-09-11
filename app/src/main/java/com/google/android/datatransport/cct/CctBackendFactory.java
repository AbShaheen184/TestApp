package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.d;
import com.google.android.datatransport.runtime.backends.h;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class CctBackendFactory {
    public h create(d dVar) {
        com.google.android.datatransport.runtime.backends.b bVar = (com.google.android.datatransport.runtime.backends.b) dVar;
        return new b(bVar.a, bVar.b, bVar.c);
    }
}
