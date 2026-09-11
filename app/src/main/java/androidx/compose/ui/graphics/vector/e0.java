package androidx.compose.ui.graphics.vector;

import androidx.appcompat.widget.c2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int y;
    public final /* synthetic */ f0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(f0 f0Var, int i) {
        super(1);
        this.y = i;
        this.z = f0Var;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.functions.a, kotlin.jvm.internal.m] */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                f0 f0Var = this.z;
                f0Var.d = true;
                f0Var.f.invoke();
                return kotlin.y.a;
            default:
                androidx.compose.ui.graphics.drawscope.d dVar = (androidx.compose.ui.graphics.drawscope.d) obj;
                f0 f0Var2 = this.z;
                c cVar = f0Var2.b;
                float f = f0Var2.k;
                float f2 = f0Var2.l;
                c2 c2VarB0 = dVar.b0();
                long jH = c2VarB0.H();
                c2VarB0.w().f();
                try {
                    ((com.google.firebase.platforminfo.c) c2VarB0.y).n(f, f2, 0L);
                    cVar.a(dVar);
                    return kotlin.y.a;
                } finally {
                    androidx.privacysandbox.ads.adservices.java.internal.a.B(c2VarB0, jH);
                }
        }
    }
}
