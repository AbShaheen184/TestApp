package androidx.media3.extractor.metadata.mp4;

import androidx.media3.common.g0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g0 {
    public final ArrayList a;

    public b(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((a) arrayList.get(0)).b;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((a) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                }
                j = ((a) arrayList.get(i)).b;
            }
        }
        com.google.android.material.motion.a.f(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
