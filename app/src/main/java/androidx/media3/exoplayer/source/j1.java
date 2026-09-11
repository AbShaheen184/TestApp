package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends androidx.media3.common.j0 {
    public final com.google.common.collect.h0 z;

    public j1(String str, com.google.common.collect.a1 a1Var) {
        super(str, null, false, 1);
        this.z = com.google.common.collect.h0.o(a1Var);
    }

    @Override // androidx.media3.common.j0, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        com.google.common.collect.h0 h0Var = this.z;
        if (h0Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + h0Var;
    }
}
