package kotlinx.coroutines;

import kotlin.jvm.functions.q;
import kotlin.jvm.internal.j;
import kotlin.y;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class JobSupport$onJoin$1 extends j implements q {
    public static final JobSupport$onJoin$1 INSTANCE = new JobSupport$onJoin$1();

    public JobSupport$onJoin$1() {
        super(3, JobSupport.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((JobSupport) obj, (SelectInstance<?>) obj2, obj3);
        return y.a;
    }

    public final void invoke(JobSupport jobSupport, SelectInstance<?> selectInstance, Object obj) {
        jobSupport.registerSelectForOnJoin(selectInstance, obj);
    }
}
