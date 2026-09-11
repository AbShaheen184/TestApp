package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Task implements Runnable {
    public long submissionTime;
    public boolean taskContext;

    public Task(long j, boolean z) {
        this.submissionTime = j;
        this.taskContext = z;
    }

    public Task() {
        this(0L, false);
    }
}
