package kotlinx.coroutines.debug.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class AgentInstallationType {
    public static final AgentInstallationType INSTANCE = new AgentInstallationType();
    private static boolean isInstalledStatically;

    private AgentInstallationType() {
    }

    public final boolean isInstalledStatically$kotlinx_coroutines_core() {
        return isInstalledStatically;
    }

    public final void setInstalledStatically$kotlinx_coroutines_core(boolean z) {
        isInstalledStatically = z;
    }
}
