package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h {
    public final AtomicReference a;

    public a(h hVar) {
        this.a = new AtomicReference(hVar);
    }

    @Override // kotlin.sequences.h
    public final Iterator iterator() {
        h hVar = (h) this.a.getAndSet(null);
        if (hVar != null) {
            return hVar.iterator();
        }
        net.luminis.tls.engine.impl.c.r("This sequence can be consumed only once.");
        return null;
    }
}
