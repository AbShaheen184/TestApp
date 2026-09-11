package com.google.android.gms.internal.measurement;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ef implements Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ ef(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        switch (this.a) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                androidx.compose.runtime.snapshots.g gVar = ff.D;
                throw null;
            default:
                throw androidx.privacysandbox.ads.adservices.java.internal.a.i(obj);
        }
    }
}
