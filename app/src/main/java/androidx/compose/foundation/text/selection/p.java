package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ CharSequence A;
    public final /* synthetic */ long B;
    public int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ t z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j, t tVar, CharSequence charSequence, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = tVar;
        this.A = charSequence;
        this.B = j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        p pVar = new p(this.B, this.z, this.A, dVar);
        pVar.y = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create(androidx.collection.g.c(obj), (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.e;
        if (i == 0) {
            kotlin.a.e(obj);
            TextClassifier textClassifierC = androidx.collection.g.c(this.y);
            this.e = 1;
            Object objA = t.a(this.z, this.A, this.B, textClassifierC, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objA == aVar) {
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
    }
}
