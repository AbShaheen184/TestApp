package kotlinx.coroutines.flow;

import kotlin.coroutines.i;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class SharingConfig<T> {
    public final i context;
    public final int extraBufferCapacity;
    public final BufferOverflow onBufferOverflow;
    public final Flow<T> upstream;

    /* JADX WARN: Multi-variable type inference failed */
    public SharingConfig(Flow<? extends T> flow, int i, BufferOverflow bufferOverflow, i iVar) {
        this.upstream = flow;
        this.extraBufferCapacity = i;
        this.onBufferOverflow = bufferOverflow;
        this.context = iVar;
    }
}
