package androidx.datastore.core;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.q {
    public final /* synthetic */ int e = 1;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(z zVar, kotlin.coroutines.d dVar) {
        super(3, dVar);
        this.z = zVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.e) {
            case 0:
                return new l((z) this.z, (kotlin.coroutines.d) obj3).invokeSuspend(kotlin.y.a);
            default:
                ((Boolean) obj2).getClass();
                l lVar = new l(3, (kotlin.coroutines.d) obj3);
                lVar.z = (c0) obj;
                return lVar.invokeSuspend(kotlin.y.a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws IOException {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    z zVar = (z) this.z;
                    this.y = 1;
                    Object objC = z.c(zVar, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objC == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
            default:
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    c0 c0Var = (c0) this.z;
                    this.y = 1;
                    if (!c0Var.c.get()) {
                        Object objG = _COROUTINE.a.g(c0Var.a, new androidx.compose.foundation.text.contextmenu.internal.h(c0Var, null, 3), this);
                        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                        return objG == aVar2 ? aVar2 : objG;
                    }
                    net.luminis.tls.engine.impl.c.r("This scope has already been closed.");
                } else {
                    if (i2 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    public /* synthetic */ l(int i, kotlin.coroutines.d dVar) {
        super(i, dVar);
    }
}
