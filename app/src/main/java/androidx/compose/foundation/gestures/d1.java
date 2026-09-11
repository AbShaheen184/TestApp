package androidx.compose.foundation.gestures;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.selects.SelectImplementation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public /* synthetic */ Object y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(int i, kotlin.coroutines.d dVar, int i2, boolean z) {
        super(2, dVar);
        this.e = i2;
        this.z = i;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                d1 d1Var = new d1(2, 0, dVar);
                d1Var.y = obj;
                return d1Var;
            case 1:
                d1 d1Var2 = new d1(this.z, dVar, 1, false);
                d1Var2.y = obj;
                return d1Var2;
            case 2:
                d1 d1Var3 = new d1(this.z, dVar, 2, false);
                d1Var3.y = obj;
                return d1Var3;
            default:
                d1 d1Var4 = new d1(2, 3, dVar);
                d1Var4.y = obj;
                return d1Var4;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((d1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                d1 d1Var = (d1) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar = kotlin.y.a;
                d1Var.invokeSuspend(yVar);
                return yVar;
            case 2:
                d1 d1Var2 = (d1) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar2 = kotlin.y.a;
                d1Var2.invokeSuspend(yVar2);
                return yVar2;
            default:
                d1 d1Var3 = new d1(2, 3, (kotlin.coroutines.d) obj2);
                d1Var3.y = (CoroutineScope) obj;
                return d1Var3.invokeSuspend(kotlin.y.a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        int i = this.e;
        kotlin.coroutines.d dVar = null;
        kotlin.y yVar = kotlin.y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        switch (i) {
            case 0:
                int i2 = this.z;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    coroutineScope = (CoroutineScope) this.y;
                } else {
                    if (i2 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    coroutineScope = (CoroutineScope) this.y;
                    kotlin.a.e(obj);
                }
                while (JobKt.isActive(coroutineScope.getCoroutineContext())) {
                    androidx.compose.animation.core.n1 n1Var = new androidx.compose.animation.core.n1(24);
                    this.y = coroutineScope;
                    this.z = 1;
                    if (androidx.compose.runtime.s.o(getContext()).a(this, n1Var) == aVar) {
                        return aVar;
                    }
                }
                return yVar;
            case 1:
                androidx.datastore.preferences.core.a aVar2 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar2 = com.app.mlounge.data.local.prefs.y1.j0;
                aVar2.e(com.app.mlounge.data.local.prefs.y1.k1, new Integer(this.z));
                return yVar;
            case 2:
                androidx.datastore.preferences.core.a aVar3 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar3 = com.app.mlounge.data.local.prefs.y1.j0;
                aVar3.e(com.app.mlounge.data.local.prefs.y1.U0, new Integer(this.z));
                return yVar;
            default:
                int i3 = this.z;
                if (i3 == 0) {
                    kotlin.a.e(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.y;
                    SelectImplementation selectImplementation = new SelectImplementation(getContext());
                    BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new androidx.activity.compose.n(2, 11, dVar), 3, null).getOnAwait();
                    this.z = 1;
                    if (selectImplementation.doSelect(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(int i, int i2, kotlin.coroutines.d dVar) {
        super(i, dVar);
        this.e = i2;
    }
}
