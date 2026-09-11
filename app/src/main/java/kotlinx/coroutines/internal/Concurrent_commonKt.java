package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class Concurrent_commonKt {
    public static final <T> T getValue(AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    public static final <T> void loop(AtomicReference<T> atomicReference, p pVar) {
        while (true) {
            pVar.invoke(atomicReference, getValue(atomicReference));
        }
    }

    public static final <T> void setValue(AtomicReference<T> atomicReference, T t) {
        atomicReference.set(t);
    }

    public static /* synthetic */ void getValue$annotations(AtomicReference atomicReference) {
    }
}
