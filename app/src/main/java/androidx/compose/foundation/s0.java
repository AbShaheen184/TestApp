package androidx.compose.foundation;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 extends kotlin.jvm.internal.j implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.e = i3;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        boolean zA;
        boolean zA2;
        switch (this.e) {
            case 0:
                androidx.compose.ui.focus.c0 c0Var = (androidx.compose.ui.focus.c0) obj;
                androidx.compose.ui.focus.c0 c0Var2 = (androidx.compose.ui.focus.c0) obj2;
                t0 t0Var = (t0) this.receiver;
                if (t0Var.K && (zA = c0Var2.a()) != c0Var.a()) {
                    kotlin.jvm.functions.l lVar = t0Var.O;
                    if (lVar != null) {
                        lVar.invoke(Boolean.valueOf(zA));
                    }
                    kotlin.coroutines.d dVar = null;
                    if (zA) {
                        BuildersKt__Builders_commonKt.launch$default(t0Var.z0(), null, null, new androidx.compose.animation.core.c1(t0Var, dVar, 3), 3, null);
                        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
                        androidx.compose.ui.node.k.p(t0Var, new androidx.activity.compose.f(4, zVar, t0Var));
                        androidx.compose.foundation.lazy.layout.h0 h0Var = (androidx.compose.foundation.lazy.layout.h0) zVar.e;
                        if (h0Var != null) {
                            h0Var.a();
                        } else {
                            h0Var = null;
                        }
                        t0Var.Q = h0Var;
                        androidx.compose.ui.node.d1 d1Var = t0Var.R;
                        if (d1Var != null && d1Var.T0().K) {
                            t0Var.P0();
                        }
                    } else {
                        androidx.compose.foundation.lazy.layout.h0 h0Var2 = t0Var.Q;
                        if (h0Var2 != null) {
                            h0Var2.b();
                        }
                        t0Var.Q = null;
                        t0Var.P0();
                    }
                    androidx.compose.ui.node.k.l(t0Var);
                    androidx.compose.foundation.interaction.k kVar = t0Var.N;
                    if (kVar != null) {
                        androidx.compose.foundation.interaction.d dVar2 = t0Var.P;
                        if (zA) {
                            if (dVar2 != null) {
                                t0Var.O0(kVar, new androidx.compose.foundation.interaction.e(dVar2));
                                t0Var.P = null;
                            }
                            androidx.compose.foundation.interaction.d dVar3 = new androidx.compose.foundation.interaction.d();
                            t0Var.O0(kVar, dVar3);
                            t0Var.P = dVar3;
                        } else if (dVar2 != null) {
                            t0Var.O0(kVar, new androidx.compose.foundation.interaction.e(dVar2));
                            t0Var.P = null;
                        }
                    }
                }
                return kotlin.y.a;
            case 1:
                androidx.compose.ui.focus.c0 c0Var3 = (androidx.compose.ui.focus.c0) obj;
                androidx.compose.ui.focus.c0 c0Var4 = (androidx.compose.ui.focus.c0) obj2;
                androidx.compose.ui.viewinterop.s sVar = (androidx.compose.ui.viewinterop.s) this.receiver;
                if (sVar.K && (zA2 = c0Var4.a()) != c0Var3.a()) {
                    androidx.compose.foundation.lazy.layout.h0 h0Var3 = null;
                    if (zA2) {
                        kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
                        androidx.compose.ui.node.k.p(sVar, new androidx.compose.ui.draw.b(8, zVar2, sVar));
                        androidx.compose.foundation.lazy.layout.h0 h0Var4 = (androidx.compose.foundation.lazy.layout.h0) zVar2.e;
                        if (h0Var4 != null) {
                            h0Var4.a();
                            h0Var3 = h0Var4;
                        }
                        sVar.O = h0Var3;
                    } else {
                        androidx.compose.foundation.lazy.layout.h0 h0Var5 = sVar.O;
                        if (h0Var5 != null) {
                            h0Var5.b();
                        }
                        sVar.O = null;
                    }
                }
                return kotlin.y.a;
            case 2:
                return android.support.v4.media.session.b.h((androidx.room.q) this.receiver, (kotlin.jvm.functions.l) obj, (kotlin.coroutines.d) obj2);
            case 3:
                return android.support.v4.media.session.b.h((androidx.room.q) this.receiver, (kotlin.jvm.functions.l) obj, (kotlin.coroutines.d) obj2);
            default:
                kotlinx.serialization.descriptors.e eVar = (kotlinx.serialization.descriptors.e) obj;
                int iIntValue = ((Number) obj2).intValue();
                eVar.getClass();
                kotlinx.serialization.json.internal.h hVar = (kotlinx.serialization.json.internal.h) this.receiver;
                hVar.getClass();
                boolean z = !eVar.j(iIntValue) && eVar.i(iIntValue).c();
                hVar.b = z;
                return Boolean.valueOf(z);
        }
    }
}
