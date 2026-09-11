package androidx.compose.foundation.gestures;

import com.appsalt.internal.f4;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b2 extends kotlin.jvm.internal.a implements kotlin.jvm.functions.p {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.E = i3;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                long j = ((androidx.compose.ui.unit.q) obj).a;
                f2 f2Var = (f2) this.e;
                BuildersKt__Builders_commonKt.launch$default(f2Var.h0.c(), null, null, new d2(f2Var, j, null, 1), 3, null);
                return kotlin.y.a;
            case 1:
                ((androidx.compose.runtime.internal.f) this.e).d(((Number) obj2).intValue(), (androidx.compose.runtime.r) obj);
                return kotlin.y.a;
            default:
                ((com.appsalt.internal.f) this.e).i.remove(new f4(((f4) obj).e));
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                kotlin.y yVar = kotlin.y.a;
                return yVar == aVar ? yVar : new kotlin.m(yVar);
        }
    }
}
