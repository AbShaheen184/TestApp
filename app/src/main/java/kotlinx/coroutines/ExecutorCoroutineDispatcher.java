package kotlinx.coroutines;

import com.app.mlounge.ui.screens.player.j0;
import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.b;
import kotlin.coroutines.g;
import kotlin.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable, AutoCloseable {
    public static final Key Key = new Key(null);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract Executor getExecutor();

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Key extends b {
        private Key() {
            super(CoroutineDispatcher.Key, new j0(23));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ExecutorCoroutineDispatcher _init_$lambda$0(g gVar) {
            if (gVar instanceof ExecutorCoroutineDispatcher) {
                return (ExecutorCoroutineDispatcher) gVar;
            }
            return null;
        }

        public /* synthetic */ Key(f fVar) {
            this();
        }
    }
}
