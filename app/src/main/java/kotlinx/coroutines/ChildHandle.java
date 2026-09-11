package kotlinx.coroutines;

import kotlin.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@InternalCoroutinesApi
@c
public interface ChildHandle extends DisposableHandle {
    @InternalCoroutinesApi
    boolean childCancelled(Throwable th);

    Job getParent();

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        @InternalCoroutinesApi
        public static /* synthetic */ void getParent$annotations() {
        }
    }
}
