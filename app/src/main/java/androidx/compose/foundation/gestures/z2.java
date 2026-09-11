package androidx.compose.foundation.gestures;

import androidx.compose.material3.s3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z2 implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ float y;
    public final /* synthetic */ Object z;

    public /* synthetic */ z2(float f, androidx.compose.ui.graphics.g gVar, androidx.compose.ui.graphics.m mVar) {
        this.y = f;
        this.z = gVar;
        this.A = mVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                b3 b3Var = (b3) this.z;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.A;
                long jLongValue = ((Long) obj).longValue();
                if (b3Var.b == Long.MIN_VALUE) {
                    b3Var.b = jLongValue;
                }
                float f = b3Var.e;
                androidx.compose.animation.core.o oVar = new androidx.compose.animation.core.o(f);
                float f2 = this.y;
                androidx.compose.animation.core.o oVar2 = b3.f;
                long jB = f2 == 0.0f ? b3Var.a.b(new androidx.compose.animation.core.o(f), oVar2, b3Var.c) : kotlin.math.a.G((jLongValue - b3Var.b) / f2);
                float f3 = ((androidx.compose.animation.core.o) b3Var.a.t(jB, oVar, oVar2, b3Var.c)).a;
                b3Var.c = (androidx.compose.animation.core.o) b3Var.a.i(jB, oVar, oVar2, b3Var.c);
                b3Var.b = jLongValue;
                float f4 = b3Var.e - f3;
                b3Var.e = f3;
                lVar.invoke(Float.valueOf(f4));
                break;
            case 1:
                float f5 = this.y;
                androidx.compose.ui.graphics.g gVar = (androidx.compose.ui.graphics.g) this.z;
                androidx.compose.ui.graphics.m mVar = (androidx.compose.ui.graphics.m) this.A;
                androidx.compose.ui.node.h0 h0Var = (androidx.compose.ui.node.h0) obj;
                h0Var.b();
                androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
                androidx.appcompat.widget.c2 c2Var = bVar.y;
                long jH = c2Var.H();
                c2Var.w().f();
                try {
                    com.google.firebase.platforminfo.c cVar = (com.google.firebase.platforminfo.c) c2Var.y;
                    cVar.r(f5, 0.0f);
                    cVar.m(45.0f, 0L);
                    bVar.f(gVar, mVar);
                } finally {
                    androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var, jH);
                }
                break;
            default:
                androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) this.z;
                androidx.compose.ui.layout.b1 b1Var = (androidx.compose.ui.layout.b1) obj;
                androidx.compose.animation.core.d dVar = ((s3) this.A).P;
                androidx.compose.ui.layout.b1.l(b1Var, c1Var, (int) (dVar != null ? ((Number) dVar.d()).floatValue() : this.y), 0);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ z2(b3 b3Var, float f, kotlin.jvm.functions.l lVar) {
        this.z = b3Var;
        this.y = f;
        this.A = lVar;
    }

    public /* synthetic */ z2(androidx.compose.ui.layout.c1 c1Var, s3 s3Var, float f) {
        this.z = c1Var;
        this.A = s3Var;
        this.y = f;
    }
}
