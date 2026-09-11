package org.mozilla.javascript;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class UnhandledRejectionTracker {
    private static final IdentityHashMap<NativePromise, NativePromise> unhandled = new IdentityHashMap<>(0);
    private boolean enabled = false;

    public void enable(boolean z) {
        this.enabled = z;
    }

    public List<Object> enumerate() {
        ArrayList arrayList = new ArrayList();
        Iterator<NativePromise> it = unhandled.values().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getResult());
        }
        return arrayList;
    }

    public void process(Consumer<Object> consumer) {
        Iterator<NativePromise> it = unhandled.values().iterator();
        while (it.hasNext()) {
            try {
                consumer.accept(it.next().getResult());
                it.remove();
            } catch (Throwable th) {
                it.remove();
                throw th;
            }
        }
    }

    public void promiseHandled(NativePromise nativePromise) {
        if (this.enabled) {
            unhandled.remove(nativePromise);
        }
    }

    public void promiseRejected(NativePromise nativePromise) {
        if (this.enabled) {
            unhandled.put(nativePromise, nativePromise);
        }
    }
}
