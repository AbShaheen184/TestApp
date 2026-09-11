package androidx.datastore.preferences.core;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements p {
    public final /* synthetic */ i A;
    public final /* synthetic */ int e;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(p pVar, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        switch (i) {
            case 1:
                this.A = (i) pVar;
                super(2, dVar);
                break;
            default:
                this.A = (i) pVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                b bVar = new b(this.A, dVar, 0);
                bVar.z = obj;
                return bVar;
            default:
                b bVar2 = new b(this.A, dVar, 1);
                bVar2.z = obj;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((b) create(aVar, dVar)).invokeSuspend(y.a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    /* JADX WARN: Type inference failed for: r4v13, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    a aVar = (a) this.z;
                    this.y = 1;
                    obj = this.A.invoke(aVar, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                a aVar3 = (a) obj;
                aVar3.getClass();
                ((AtomicBoolean) aVar3.b.y).set(true);
                return aVar3;
            default:
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a aVar4 = (a) this.z;
                    kotlin.a.e(obj);
                    return aVar4;
                }
                kotlin.a.e(obj);
                a aVar5 = new a(new LinkedHashMap(((a) this.z).a()), false);
                this.z = aVar5;
                this.y = 1;
                Object objInvoke = this.A.invoke(aVar5, this);
                kotlin.coroutines.intrinsics.a aVar6 = kotlin.coroutines.intrinsics.a.e;
                return objInvoke == aVar6 ? aVar6 : aVar5;
        }
    }
}
