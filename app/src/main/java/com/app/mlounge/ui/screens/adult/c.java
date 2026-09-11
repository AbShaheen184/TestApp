package com.app.mlounge.ui.screens.adult;

import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import com.app.mlounge.ui.screens.services.n;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ c(String str, boolean z, kotlin.jvm.functions.a aVar, int i, int i2) {
        this.e = i2;
        this.y = str;
        this.z = z;
        this.A = aVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        r rVar = (r) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                i.c(this.y, this.z, this.A, rVar, s.A(1));
                break;
            default:
                n.k(this.y, this.z, this.A, rVar, s.A(7));
                break;
        }
        return y.a;
    }
}
