package com.app.mlounge.ui.screens.search;

import androidx.compose.runtime.s;
import androidx.compose.ui.r;
import androidx.datastore.preferences.protobuf.h1;
import androidx.navigation.y;
import com.app.mlounge.ui.viewmodel.y0;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements p {
    public final /* synthetic */ l A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ l D;
    public final /* synthetic */ l E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int e;
    public final /* synthetic */ l y;
    public final /* synthetic */ l z;

    public /* synthetic */ e(y yVar, String str, r rVar, androidx.compose.ui.e eVar, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, int i) {
        this.e = 3;
        this.F = yVar;
        this.B = str;
        this.C = rVar;
        this.G = eVar;
        this.y = lVar;
        this.z = lVar2;
        this.A = lVar3;
        this.D = lVar4;
        this.E = lVar5;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = s.A(1);
                b.a(this.y, this.z, this.A, (p) this.B, (q) this.C, this.D, this.E, (l) this.F, (y0) this.G, (androidx.compose.runtime.r) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = s.A(1);
                b.a(this.y, this.z, this.A, (p) this.B, (q) this.C, this.D, this.E, (l) this.F, (y0) this.G, (androidx.compose.runtime.r) obj, iA2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA3 = s.A(1);
                b.a(this.y, this.z, this.A, (p) this.B, (q) this.C, this.D, this.E, (l) this.F, (y0) this.G, (androidx.compose.runtime.r) obj, iA3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA4 = s.A(1);
                h1.d((y) this.F, (String) this.B, (r) this.C, (androidx.compose.ui.e) this.G, this.y, this.z, this.A, this.D, this.E, (androidx.compose.runtime.r) obj, iA4);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ e(l lVar, l lVar2, l lVar3, p pVar, q qVar, l lVar4, l lVar5, l lVar6, y0 y0Var, int i, int i2) {
        this.e = i2;
        this.y = lVar;
        this.z = lVar2;
        this.A = lVar3;
        this.B = pVar;
        this.C = qVar;
        this.D = lVar4;
        this.E = lVar5;
        this.F = lVar6;
        this.G = y0Var;
    }
}
