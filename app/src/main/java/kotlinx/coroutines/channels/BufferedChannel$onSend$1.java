package kotlinx.coroutines.channels;

import kotlin.jvm.functions.q;
import kotlin.jvm.internal.j;
import kotlin.y;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class BufferedChannel$onSend$1 extends j implements q {
    public static final BufferedChannel$onSend$1 INSTANCE = new BufferedChannel$onSend$1();

    public BufferedChannel$onSend$1() {
        super(3, BufferedChannel.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BufferedChannel<?>) obj, (SelectInstance<?>) obj2, obj3);
        return y.a;
    }

    public final void invoke(BufferedChannel<?> bufferedChannel, SelectInstance<?> selectInstance, Object obj) {
        bufferedChannel.registerSelectForSend(selectInstance, obj);
    }
}
