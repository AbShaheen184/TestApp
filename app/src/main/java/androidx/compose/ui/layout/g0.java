package androidx.compose.ui.layout;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ kotlin.jvm.functions.l d;
    public final /* synthetic */ h0 e;
    public final /* synthetic */ m0 f;
    public final /* synthetic */ kotlin.jvm.functions.l g;

    public g0(int i, int i2, Map map, kotlin.jvm.functions.l lVar, h0 h0Var, m0 m0Var, kotlin.jvm.functions.l lVar2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = lVar;
        this.e = h0Var;
        this.f = m0Var;
        this.g = lVar2;
    }

    @Override // androidx.compose.ui.layout.r0
    public final int a() {
        return this.b;
    }

    @Override // androidx.compose.ui.layout.r0
    public final int b() {
        return this.a;
    }

    @Override // androidx.compose.ui.layout.r0
    public final Map c() {
        return this.c;
    }

    @Override // androidx.compose.ui.layout.r0
    public final void d() {
        androidx.compose.ui.node.q qVar;
        androidx.compose.ui.node.f0 f0Var = this.f.e;
        boolean zU = this.e.U();
        kotlin.jvm.functions.l lVar = this.g;
        if (!zU || (qVar = ((androidx.compose.ui.node.r) f0Var.d0.d).p0) == null) {
            lVar.invoke(((androidx.compose.ui.node.r) f0Var.d0.d).I);
        } else {
            lVar.invoke(qVar.I);
        }
    }

    @Override // androidx.compose.ui.layout.r0
    public final kotlin.jvm.functions.l e() {
        return this.d;
    }
}
