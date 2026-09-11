package kotlinx.serialization.json.internal;

import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.coroutines.jvm.internal.h implements kotlin.jvm.functions.q {
    public int e;
    public /* synthetic */ kotlin.b y;
    public final /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar, kotlin.coroutines.d dVar) {
        super(3, dVar);
        this.z = lVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        k kVar = new k(this.z, (kotlin.coroutines.d) obj3);
        kVar.y = (kotlin.b) obj;
        return kVar.invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar = this.z;
        androidx.fragment.app.h hVar = (androidx.fragment.app.h) lVar.z;
        int i = this.e;
        if (i == 0) {
            kotlin.a.e(obj);
            kotlin.b bVar = this.y;
            byte bI = hVar.I();
            if (bI == 1) {
                return lVar.l(true);
            }
            if (bI == 0) {
                return lVar.l(false);
            }
            if (bI != 6) {
                if (bI == 8) {
                    return lVar.i();
                }
                androidx.fragment.app.h.x(hVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.e = 1;
            obj = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l.a(lVar, bVar, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        return (kotlinx.serialization.json.i) obj;
    }
}
