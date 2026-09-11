package kotlinx.coroutines;

import com.app.mlounge.ui.screens.player.j0;
import com.google.gson.b;
import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineDispatcher extends kotlin.coroutines.a implements f {
    public static final Key Key = new Key(null);

    public CoroutineDispatcher() {
        super(e.e);
    }

    public static /* synthetic */ CoroutineDispatcher limitedParallelism$default(CoroutineDispatcher coroutineDispatcher, int i, String str, int i2, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: limitedParallelism");
            return null;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return coroutineDispatcher.limitedParallelism(i, str);
    }

    /* JADX INFO: renamed from: dispatch */
    public abstract void mo86dispatch(i iVar, Runnable runnable);

    @InternalCoroutinesApi
    public void dispatchYield(i iVar, Runnable runnable) {
        DispatchedContinuationKt.safeDispatch(this, iVar, runnable);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.i
    public <E extends g> E get(h hVar) {
        E e;
        hVar.getClass();
        if (!(hVar instanceof kotlin.coroutines.b)) {
            if (e.e == hVar) {
                return this;
            }
            return null;
        }
        kotlin.coroutines.b bVar = (kotlin.coroutines.b) hVar;
        if (!bVar.isSubKey$kotlin_stdlib(getKey()) || (e = (E) bVar.tryCast$kotlin_stdlib(this)) == null) {
            return null;
        }
        return e;
    }

    @Override // kotlin.coroutines.f
    public final <T> d<T> interceptContinuation(d<? super T> dVar) {
        return new DispatchedContinuation(this, dVar);
    }

    public boolean isDispatchNeeded(i iVar) {
        return true;
    }

    public CoroutineDispatcher limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return new LimitedDispatcher(this, i, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (kotlin.coroutines.e.e == r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        return kotlin.coroutines.j.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r2.tryCast$kotlin_stdlib(r1) != null) goto L11;
     */
    @Override // kotlin.coroutines.a, kotlin.coroutines.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kotlin.coroutines.i minusKey(kotlin.coroutines.h r2) {
        /*
            r1 = this;
            r2.getClass()
            boolean r0 = r2 instanceof kotlin.coroutines.b
            if (r0 == 0) goto L1a
            kotlin.coroutines.b r2 = (kotlin.coroutines.b) r2
            kotlin.coroutines.h r0 = r1.getKey()
            boolean r0 = r2.isSubKey$kotlin_stdlib(r0)
            if (r0 == 0) goto L21
            kotlin.coroutines.g r2 = r2.tryCast$kotlin_stdlib(r1)
            if (r2 == 0) goto L21
            goto L1e
        L1a:
            kotlin.coroutines.e r0 = kotlin.coroutines.e.e
            if (r0 != r2) goto L21
        L1e:
            kotlin.coroutines.j r2 = kotlin.coroutines.j.e
            return r2
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.CoroutineDispatcher.minusKey(kotlin.coroutines.h):kotlin.coroutines.i");
    }

    @Override // kotlin.coroutines.f
    public final void releaseInterceptedContinuation(d<?> dVar) {
        dVar.getClass();
        ((DispatchedContinuation) dVar).release$kotlinx_coroutines_core();
    }

    public String toString() {
        return DebugStringsKt.getClassSimpleName(this) + '@' + DebugStringsKt.getHexAddress(this);
    }

    @c
    public /* synthetic */ CoroutineDispatcher limitedParallelism(int i) {
        return limitedParallelism(i, null);
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Key extends kotlin.coroutines.b {
        private Key() {
            super(e.e, new j0(22));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CoroutineDispatcher _init_$lambda$0(g gVar) {
            if (gVar instanceof CoroutineDispatcher) {
                return (CoroutineDispatcher) gVar;
            }
            return null;
        }

        public /* synthetic */ Key(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    @c
    public final CoroutineDispatcher plus(CoroutineDispatcher coroutineDispatcher) {
        return coroutineDispatcher;
    }
}
