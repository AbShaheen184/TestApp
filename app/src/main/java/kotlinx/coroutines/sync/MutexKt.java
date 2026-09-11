package kotlinx.coroutines.sync;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlinx.coroutines.internal.Symbol;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class MutexKt {
    private static final int HOLDS_LOCK_ANOTHER_OWNER = 2;
    private static final int HOLDS_LOCK_UNLOCKED = 0;
    private static final int HOLDS_LOCK_YES = 1;
    private static final Symbol NO_OWNER = new Symbol("NO_OWNER");
    private static final Symbol ON_LOCK_ALREADY_LOCKED_BY_OWNER = new Symbol("ALREADY_LOCKED_BY_OWNER");
    private static final int TRY_LOCK_ALREADY_LOCKED_BY_OWNER = 2;
    private static final int TRY_LOCK_FAILED = 1;
    private static final int TRY_LOCK_SUCCESS = 0;

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.MutexKt$withLock$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", l = {Token.DOT}, m = "withLock")
    public static final class AnonymousClass1<T> extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MutexKt.withLock(null, null, null, this);
        }
    }

    public static final Mutex Mutex(boolean z) {
        return new MutexImpl(z);
    }

    public static /* synthetic */ Mutex Mutex$default(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return Mutex(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object withLock(Mutex mutex, Object obj, kotlin.jvm.functions.a aVar, d<? super T> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object obj2 = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            kotlin.a.e(obj2);
            anonymousClass1.L$0 = mutex;
            anonymousClass1.L$1 = obj;
            anonymousClass1.L$2 = aVar;
            anonymousClass1.label = 1;
            Object objLock = mutex.lock(obj, anonymousClass1);
            kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
            if (objLock == aVar2) {
                return aVar2;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (kotlin.jvm.functions.a) anonymousClass1.L$2;
            obj = anonymousClass1.L$1;
            mutex = (Mutex) anonymousClass1.L$0;
            kotlin.a.e(obj2);
        }
        try {
            return aVar.invoke();
        } finally {
            mutex.unlock(obj);
        }
    }

    private static final <T> Object withLock$$forInline(Mutex mutex, Object obj, kotlin.jvm.functions.a aVar, d<? super T> dVar) {
        mutex.lock(obj, dVar);
        try {
            return aVar.invoke();
        } finally {
            mutex.unlock(obj);
        }
    }

    public static /* synthetic */ Object withLock$default(Mutex mutex, Object obj, kotlin.jvm.functions.a aVar, d dVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        mutex.lock(obj, dVar);
        try {
            return aVar.invoke();
        } finally {
            mutex.unlock(obj);
        }
    }
}
