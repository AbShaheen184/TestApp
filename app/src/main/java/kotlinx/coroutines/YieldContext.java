package kotlinx.coroutines;

import kotlin.coroutines.h;
import kotlin.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class YieldContext extends kotlin.coroutines.a {
    public static final Key Key = new Key(null);
    public boolean dispatcherWasUnconfined;

    public YieldContext() {
        super(Key);
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Key implements h {
        public /* synthetic */ Key(f fVar) {
            this();
        }

        private Key() {
        }
    }
}
