package androidx.room.util;

import androidx.room.q;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.coroutines.jvm.internal.i implements p {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ l B;
    public int e;
    public final /* synthetic */ q y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(q qVar, kotlin.coroutines.d dVar, l lVar, boolean z, boolean z2) {
        super(2, dVar);
        this.y = qVar;
        this.z = z;
        this.A = z2;
        this.B = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        boolean z = this.A;
        return new a(this.y, dVar, this.B, this.z, z);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                kotlin.a.e(obj);
                return obj;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        l lVar = this.B;
        q qVar = this.y;
        boolean z = this.A;
        boolean z2 = this.z;
        d dVar = new d(qVar, null, lVar, z, z2);
        this.e = 1;
        Object objJ = qVar.j(z2, dVar, this);
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        return objJ == aVar ? aVar : objJ;
    }
}
