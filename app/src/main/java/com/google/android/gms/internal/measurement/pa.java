package com.google.android.gms.internal.measurement;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pa implements ThreadFactory {
    public static final /* synthetic */ pa a = new pa();

    @Override // java.util.concurrent.ThreadFactory
    public final /* synthetic */ Thread newThread(Runnable runnable) {
        Object obj = na.j;
        return new Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}
