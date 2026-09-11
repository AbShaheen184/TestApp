package kotlinx.coroutines.flow.internal;

import com.google.gson.b;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@InternalCoroutinesApi
public interface FusibleFlow<T> extends Flow<T> {

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        public static /* synthetic */ Flow fuse$default(FusibleFlow fusibleFlow, i iVar, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
            if (obj != null) {
                b.r("Super calls with default arguments not supported in this target, function: fuse");
                return null;
            }
            if ((i2 & 1) != 0) {
                iVar = j.e;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            if ((i2 & 4) != 0) {
                bufferOverflow = BufferOverflow.SUSPEND;
            }
            return fusibleFlow.fuse(iVar, i, bufferOverflow);
        }
    }

    Flow<T> fuse(i iVar, int i, BufferOverflow bufferOverflow);
}
