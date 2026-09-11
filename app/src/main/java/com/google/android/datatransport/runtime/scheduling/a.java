package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.c;
import com.google.android.datatransport.runtime.scheduling.persistence.g;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final Logger f = Logger.getLogger(r.class.getName());
    public final c a;
    public final Executor b;
    public final f c;
    public final g d;
    public final g e;

    public a(Executor executor, f fVar, c cVar, g gVar, g gVar2) {
        this.b = executor;
        this.c = fVar;
        this.a = cVar;
        this.d = gVar;
        this.e = gVar2;
    }
}
