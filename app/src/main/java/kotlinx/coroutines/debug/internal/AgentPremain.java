package kotlinx.coroutines.debug.internal;

import android.annotation.SuppressLint;
import com.google.android.material.textfield.p;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.jvm.internal.l;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import sun.misc.Signal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"all"})
@IgnoreJRERequirement
public final class AgentPremain {
    public static final AgentPremain INSTANCE = new AgentPremain();
    private static final boolean enableCreationStackTraces;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DebugProbesTransformer implements ClassFileTransformer {
        public static final DebugProbesTransformer INSTANCE = new DebugProbesTransformer();

        private DebugProbesTransformer() {
        }

        public byte[] transform(ClassLoader classLoader, String str, Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) {
            if (classLoader == null || !l.a(str, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                return null;
            }
            AgentInstallationType.INSTANCE.setInstalledStatically$kotlinx_coroutines_core(true);
            return p.t(classLoader.getResourceAsStream("DebugProbesKt.bin"));
        }
    }

    static {
        Object lVar;
        try {
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            lVar = property != null ? Boolean.valueOf(Boolean.parseBoolean(property)) : null;
        } catch (Throwable th) {
            lVar = new kotlin.l(th);
        }
        Boolean bool = (Boolean) (lVar instanceof kotlin.l ? null : lVar);
        enableCreationStackTraces = bool != null ? bool.booleanValue() : DebugProbesImpl.INSTANCE.getEnableCreationStackTraces$kotlinx_coroutines_core();
    }

    private AgentPremain() {
    }

    private final void installSignalHandler() {
        try {
            Signal.handle(new Signal("TRAP"), new a());
        } catch (Throwable unused) {
        }
    }

    private static final void installSignalHandler$lambda$1(Signal signal) {
        DebugProbesImpl debugProbesImpl = DebugProbesImpl.INSTANCE;
        if (debugProbesImpl.isInstalled$kotlinx_coroutines_debug()) {
            debugProbesImpl.dumpCoroutines(System.out);
        } else {
            System.out.println((Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }

    public static final void premain(String str, Instrumentation instrumentation) {
        AgentInstallationType.INSTANCE.setInstalledStatically$kotlinx_coroutines_core(true);
        instrumentation.addTransformer(DebugProbesTransformer.INSTANCE);
        DebugProbesImpl debugProbesImpl = DebugProbesImpl.INSTANCE;
        debugProbesImpl.setEnableCreationStackTraces$kotlinx_coroutines_core(enableCreationStackTraces);
        debugProbesImpl.install$kotlinx_coroutines_core();
        INSTANCE.installSignalHandler();
    }
}
