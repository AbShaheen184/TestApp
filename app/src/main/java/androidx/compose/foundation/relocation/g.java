package androidx.compose.foundation.relocation;

import androidx.compose.animation.b0;
import androidx.compose.animation.core.z0;
import androidx.compose.ui.node.d1;
import com.app.mlounge.data.repository.r;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i implements p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Serializable B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, Serializable serializable, Object obj3, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
        this.A = obj2;
        this.B = serializable;
        this.C = obj3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                g gVar = new g((h) this.z, (d1) this.A, (androidx.compose.ui.draw.b) this.B, (androidx.compose.foundation.gestures.g) this.C, dVar, 0);
                gVar.y = obj;
                return gVar;
            default:
                g gVar2 = new g((r) this.z, (String) this.A, (String) this.B, (Integer) this.C, dVar, 1);
                gVar2.y = obj;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((g) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            default:
                g gVar = (g) create((ProducerScope) obj, (kotlin.coroutines.d) obj2);
                y yVar = y.a;
                gVar.invokeSuspend(yVar);
                return yVar;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.y;
                h hVar = (h) this.z;
                kotlin.coroutines.d dVar = null;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b0(hVar, (d1) this.A, (androidx.compose.ui.draw.b) this.B, dVar, 10), 3, null);
                return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.activity.compose.p(hVar, (androidx.compose.foundation.gestures.g) this.C, dVar, 7), 3, null);
            default:
                ProducerScope producerScope = (ProducerScope) this.y;
                kotlin.a.e(obj);
                r rVar = (r) this.z;
                androidx.compose.animation.core.f fVar = new androidx.compose.animation.core.f(rVar, (String) this.A, producerScope, (kotlin.coroutines.d) null, 11);
                ProducerScope producerScope2 = producerScope;
                BuildersKt__Builders_commonKt.launch$default(producerScope2, null, null, fVar, 3, null);
                List list = rVar.I;
                String str = (String) this.B;
                Integer num = (Integer) this.C;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ProducerScope producerScope3 = producerScope2;
                    producerScope2 = producerScope3;
                    BuildersKt__Builders_commonKt.launch$default(producerScope2, null, null, new z0(rVar, str, num, producerScope3, (String) it.next(), null, 8), 3, null);
                    str = str;
                    num = num;
                }
                return y.a;
        }
    }
}
