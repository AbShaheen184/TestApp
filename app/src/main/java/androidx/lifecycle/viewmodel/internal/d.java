package androidx.lifecycle.viewmodel.internal;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final c a = new c();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();
    public volatile boolean d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.v(autoCloseable);
            } catch (Exception e) {
                net.luminis.tls.engine.impl.c.k(e);
            }
        }
    }
}
