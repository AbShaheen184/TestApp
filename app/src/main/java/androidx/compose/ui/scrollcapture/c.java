package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.semantics.k;
import androidx.compose.ui.semantics.l;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.ui.viewmodel.k1;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.coroutines.jvm.internal.i implements p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e = 0;
    public int y;
    public /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k1 k1Var, float f, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = k1Var;
        this.z = f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                c cVar = new c((d) this.A, dVar);
                cVar.z = ((Number) obj).floatValue();
                return cVar;
            default:
                return new c((k1) this.A, this.z, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((c) create(Float.valueOf(((Number) obj).floatValue()), (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            default:
                return ((c) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object f;
        switch (this.e) {
            case 0:
                d dVar = (d) this.A;
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    float f2 = this.z;
                    l lVar = dVar.a.d;
                    Object objG = lVar.e.g(k.e);
                    if (objG == null) {
                        objG = null;
                    }
                    p pVar = (p) objG;
                    if (pVar == null) {
                        throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("Required value was null.");
                    }
                    androidx.compose.ui.geometry.b bVar = new androidx.compose.ui.geometry.b((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
                    this.y = 1;
                    obj = pVar.invoke(bVar, this);
                    f = kotlin.coroutines.intrinsics.a.e;
                    if (obj != f) {
                    }
                    return f;
                }
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                f = new Float(Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.b) obj).a & 4294967295L)));
                return f;
            default:
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    y1 y1Var = ((k1) this.A).b;
                    float f3 = this.z;
                    this.y = 1;
                    Object objL = y1Var.l(f3, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objL == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, kotlin.coroutines.d dVar2) {
        super(2, dVar2);
        this.A = dVar;
    }
}
