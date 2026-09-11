package com.app.mlounge.ui.screens.livetv;

import com.app.mlounge.data.remote.model.IptvChannel;
import kotlin.jvm.functions.l;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ l y;
    public final /* synthetic */ IptvChannel z;

    public /* synthetic */ e(l lVar, IptvChannel iptvChannel, int i) {
        this.e = i;
        this.y = lVar;
        this.z = iptvChannel;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                this.y.invoke(this.z);
                break;
            default:
                this.y.invoke(this.z);
                break;
        }
        return y.a;
    }
}
