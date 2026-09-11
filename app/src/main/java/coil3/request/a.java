package coil3.request;

import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements o {
    public final Job e;

    public /* synthetic */ a(Job job) {
        this.e = job;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return kotlin.jvm.internal.l.a(this.e, ((a) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.e + ")";
    }
}
