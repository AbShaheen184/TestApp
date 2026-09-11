package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassifier;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ t A;
    public final /* synthetic */ kotlin.coroutines.jvm.internal.i B;
    public Mutex e;
    public t y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(t tVar, kotlin.jvm.functions.p pVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = tVar;
        this.B = (kotlin.coroutines.jvm.internal.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new r(this.A, this.B, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0087 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        t tVar;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        TextClassifier textClassifierC;
        Object objWithTimeoutOrNull;
        int i = this.z;
        kotlin.coroutines.d dVar = null;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            if (i == 0) {
                kotlin.a.e(obj);
                tVar = this.A;
                mutex = tVar.e;
                this.e = mutex;
                this.y = tVar;
                this.z = 1;
                if (mutex.lock(null, this) != aVar) {
                }
                return aVar;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutex2 = this.e;
                try {
                    kotlin.a.e(obj);
                    textClassifierC = androidx.collection.g.c(obj);
                    mutex = mutex2;
                    mutex.unlock(null);
                    androidx.activity.compose.p pVar = new androidx.activity.compose.p(textClassifierC, (kotlin.jvm.functions.p) this.B, (kotlin.coroutines.d) null);
                    this.e = null;
                    this.y = null;
                    this.z = 3;
                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(200L, pVar, this);
                    if (objWithTimeoutOrNull == aVar) {
                        return aVar;
                    }
                    return objWithTimeoutOrNull;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            tVar = this.y;
            Mutex mutex3 = this.e;
            kotlin.a.e(obj);
            mutex = mutex3;
            textClassifierC = tVar.f;
            if (textClassifierC == null || textClassifierC.isDestroyed()) {
                q qVar = new q(tVar, dVar, 0);
                this.e = mutex;
                this.y = null;
                this.z = 2;
                Object objWithTimeoutOrNull2 = TimeoutKt.withTimeoutOrNull(300L, qVar, this);
                if (objWithTimeoutOrNull2 != aVar) {
                    mutex2 = mutex;
                    obj = objWithTimeoutOrNull2;
                    textClassifierC = androidx.collection.g.c(obj);
                    mutex = mutex2;
                    mutex.unlock(null);
                    androidx.activity.compose.p pVar2 = new androidx.activity.compose.p(textClassifierC, (kotlin.jvm.functions.p) this.B, (kotlin.coroutines.d) null);
                    this.e = null;
                    this.y = null;
                    this.z = 3;
                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(200L, pVar2, this);
                    if (objWithTimeoutOrNull == aVar) {
                        return objWithTimeoutOrNull;
                    }
                }
            } else {
                mutex.unlock(null);
                androidx.activity.compose.p pVar3 = new androidx.activity.compose.p(textClassifierC, (kotlin.jvm.functions.p) this.B, (kotlin.coroutines.d) null);
                this.e = null;
                this.y = null;
                this.z = 3;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(200L, pVar3, this);
                if (objWithTimeoutOrNull == aVar) {
                    return objWithTimeoutOrNull;
                }
            }
            return aVar;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
    }
}
