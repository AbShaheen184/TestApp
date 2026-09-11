package androidx.room.concurrent;

import androidx.media3.common.util.b;
import com.google.android.gms.common.internal.k;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final k c = new k(23);
    public static final LinkedHashMap d = new LinkedHashMap();
    public final ReentrantLock a;
    public final b b;

    public a(String str, boolean z) {
        ReentrantLock reentrantLock;
        synchronized (c) {
            try {
                LinkedHashMap linkedHashMap = d;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = reentrantLock;
        this.b = z ? new b(str) : null;
    }
}
