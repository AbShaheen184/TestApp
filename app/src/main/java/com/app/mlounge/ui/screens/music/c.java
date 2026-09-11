package com.app.mlounge.ui.screens.music;

import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import com.app.mlounge.ui.viewmodel.h0;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p {
    public final /* synthetic */ l A;
    public final /* synthetic */ h0 B;
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ c(String str, kotlin.jvm.functions.a aVar, l lVar, h0 h0Var, int i, int i2) {
        this.e = i2;
        this.y = str;
        this.z = aVar;
        this.A = lVar;
        this.B = h0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = s.A(1);
                a.a(this.y, this.z, this.A, this.B, (r) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = s.A(1);
                a.a(this.y, this.z, this.A, this.B, (r) obj, iA2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA3 = s.A(1);
                a.b(this.y, this.z, this.A, this.B, (r) obj, iA3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA4 = s.A(1);
                a.b(this.y, this.z, this.A, this.B, (r) obj, iA4);
                break;
        }
        return y.a;
    }
}
