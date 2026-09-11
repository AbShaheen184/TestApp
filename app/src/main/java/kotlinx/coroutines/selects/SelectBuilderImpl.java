package kotlinx.coroutines.selects;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import net.luminis.tls.engine.impl.c;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class SelectBuilderImpl<R> extends SelectImplementation<R> {
    private final CancellableContinuationImpl<R> cont;

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1", f = "SelectOld.kt", l = {Token.GETELEM}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p {
        int label;
        final /* synthetic */ SelectBuilderImpl<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SelectBuilderImpl<R> selectBuilderImpl, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = selectBuilderImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            y yVar = y.a;
            try {
                if (i == 0) {
                    kotlin.a.e(obj);
                    SelectBuilderImpl<R> selectBuilderImpl = this.this$0;
                    this.label = 1;
                    obj = selectBuilderImpl.doSelect(this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                SelectOldKt.resumeUndispatched(((SelectBuilderImpl) this.this$0).cont, obj);
                return yVar;
            } catch (Throwable th) {
                SelectOldKt.resumeUndispatchedWithException(((SelectBuilderImpl) this.this$0).cont, th);
                return yVar;
            }
        }
    }

    public SelectBuilderImpl(d<? super R> dVar) {
        super(dVar.getContext());
        this.cont = new CancellableContinuationImpl<>(com.google.android.material.shape.e.g(dVar), 1);
    }

    public final Object getResult() {
        if (this.cont.isCompleted()) {
            return this.cont.getResult();
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getContext()), null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this, null), 1, null);
        return this.cont.getResult();
    }

    public final void handleBuilderException(Throwable th) {
        this.cont.resumeWith(kotlin.a.b(th));
    }
}
