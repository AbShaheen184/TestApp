package androidx.compose.foundation;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ j y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.y = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new i(this.y, dVar, 0);
            default:
                return new i(this.y, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                i iVar = (i) create(coroutineScope, dVar);
                kotlin.y yVar = kotlin.y.a;
                iVar.invokeSuspend(yVar);
                return yVar;
            default:
                i iVar2 = (i) create(coroutineScope, dVar);
                kotlin.y yVar2 = kotlin.y.a;
                iVar2.invokeSuspend(yVar2);
                return yVar2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                j jVar = this.y;
                if (jVar.Z == null) {
                    androidx.compose.foundation.interaction.h hVar = new androidx.compose.foundation.interaction.h();
                    androidx.compose.foundation.interaction.k kVar = jVar.N;
                    if (kVar != null) {
                        BuildersKt__Builders_commonKt.launch$default(jVar.z0(), null, null, new androidx.activity.compose.p(kVar, hVar, null, 1), 3, null);
                    }
                    jVar.Z = hVar;
                }
                break;
            default:
                kotlin.a.e(obj);
                j jVar2 = this.y;
                androidx.compose.foundation.interaction.h hVar2 = jVar2.Z;
                if (hVar2 != null) {
                    androidx.compose.foundation.interaction.i iVar = new androidx.compose.foundation.interaction.i(hVar2);
                    androidx.compose.foundation.interaction.k kVar2 = jVar2.N;
                    kotlin.coroutines.d dVar = null;
                    if (kVar2 != null) {
                        BuildersKt__Builders_commonKt.launch$default(jVar2.z0(), null, null, new androidx.activity.compose.p(kVar2, iVar, dVar, 2), 3, null);
                    }
                    jVar2.Z = null;
                }
                break;
        }
        return kotlin.y.a;
    }
}
