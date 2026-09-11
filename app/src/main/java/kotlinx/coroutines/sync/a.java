package kotlinx.coroutines.sync;

import kotlin.coroutines.i;
import kotlin.jvm.functions.q;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements q {
    public final /* synthetic */ int e;
    public final /* synthetic */ MutexImpl y;
    public final /* synthetic */ Object z;

    public /* synthetic */ a(MutexImpl mutexImpl, Object obj, int i) {
        this.e = i;
        this.y = mutexImpl;
        this.z = obj;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.e) {
            case 0:
                return MutexImpl.CancellableContinuationWithOwner.tryResume$lambda$3(this.y, (MutexImpl.CancellableContinuationWithOwner) this.z, (Throwable) obj, (y) obj2, (i) obj3);
            default:
                return MutexImpl.onSelectCancellationUnlockConstructor$lambda$1$lambda$0(this.y, this.z, (Throwable) obj, obj2, (i) obj3);
        }
    }
}
