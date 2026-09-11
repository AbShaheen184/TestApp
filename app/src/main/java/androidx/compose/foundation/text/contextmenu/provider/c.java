package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.foundation.l1;
import androidx.compose.foundation.n1;
import androidx.compose.foundation.text.contextmenu.internal.h;
import androidx.compose.runtime.h1;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f {
    public final androidx.compose.runtime.internal.f a;
    public final n1 b = new n1();
    public final h1 c = s.r(null);

    public c(androidx.compose.runtime.internal.f fVar) {
        this.a = fVar;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.f
    public final Object a(e eVar, i iVar) {
        h hVar = new h(this, new b(eVar), null, 1);
        n1 n1Var = this.b;
        n1Var.getClass();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new l1(n1Var, hVar, null), iVar);
        return objCoroutineScope == kotlin.coroutines.intrinsics.a.e ? objCoroutineScope : y.a;
    }

    public final void b(final kotlin.jvm.functions.a aVar, r rVar, final int i) {
        final kotlin.jvm.functions.a aVar2;
        r rVar2;
        rVar.c0(723898654);
        int i2 = (rVar.f(this) ? 32 : 16) | i;
        if (rVar.T(i2 & 1, (i2 & 19) != 18)) {
            b bVar = (b) this.c.getValue();
            if (bVar == null) {
                q1 q1VarT = rVar.t();
                if (q1VarT != null) {
                    final int i3 = 0;
                    q1VarT.d = new p(this, aVar, i, i3) { // from class: androidx.compose.foundation.text.contextmenu.provider.a
                        public final /* synthetic */ int e;
                        public final /* synthetic */ c y;
                        public final /* synthetic */ kotlin.jvm.functions.a z;

                        {
                            this.e = i3;
                            this.y = this;
                        }

                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.e;
                            r rVar3 = (r) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    this.y.b(this.z, rVar3, s.A(7));
                                    break;
                                default:
                                    this.y.b(this.z, rVar3, s.A(7));
                                    break;
                            }
                            return y.a;
                        }
                    };
                    return;
                }
                return;
            }
            aVar2 = aVar;
            rVar2 = rVar;
            this.a.c(bVar, bVar.a, aVar2, rVar2, 384);
        } else {
            aVar2 = aVar;
            rVar2 = rVar;
            rVar2.W();
        }
        q1 q1VarT2 = rVar2.t();
        if (q1VarT2 != null) {
            final int i4 = 1;
            q1VarT2.d = new p(this, aVar2, i, i4) { // from class: androidx.compose.foundation.text.contextmenu.provider.a
                public final /* synthetic */ int e;
                public final /* synthetic */ c y;
                public final /* synthetic */ kotlin.jvm.functions.a z;

                {
                    this.e = i4;
                    this.y = this;
                }

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.e;
                    r rVar3 = (r) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            this.y.b(this.z, rVar3, s.A(7));
                            break;
                        default:
                            this.y.b(this.z, rVar3, s.A(7));
                            break;
                    }
                    return y.a;
                }
            };
        }
    }
}
