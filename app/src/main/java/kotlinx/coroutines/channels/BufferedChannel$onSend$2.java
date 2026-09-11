package kotlinx.coroutines.channels;

import kotlin.jvm.functions.q;
import kotlin.jvm.internal.j;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class BufferedChannel$onSend$2 extends j implements q {
    public static final BufferedChannel$onSend$2 INSTANCE = new BufferedChannel$onSend$2();

    public BufferedChannel$onSend$2() {
        super(3, BufferedChannel.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(BufferedChannel<?> bufferedChannel, Object obj, Object obj2) {
        return bufferedChannel.processResultSelectSend(obj, obj2);
    }
}
