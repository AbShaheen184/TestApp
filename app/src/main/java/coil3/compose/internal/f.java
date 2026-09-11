package coil3.compose.internal;

import com.caverock.androidsvg.f2;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import okhttp3.g0;
import org.xml.sax.Attributes;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static final int a(int i) {
        if (i == 4) {
            net.luminis.tls.engine.impl.c.o("Can't get the number of an unknown enum value.");
            return 0;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return -1;
        }
        throw null;
    }

    public static final int b(int i) {
        if (i == 4) {
            net.luminis.tls.engine.impl.c.o("Can't get the number of an unknown enum value.");
            return 0;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return -1;
        }
        throw null;
    }

    public static int c(Attributes attributes, int i) {
        return f2.a(attributes.getLocalName(i)).ordinal();
    }

    public static dagger.internal.d d(com.app.mlounge.h hVar, int i) {
        return dagger.internal.b.a(new com.app.mlounge.g(hVar, i));
    }

    public static String e(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String f(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static HashMap g(Class cls, com.google.firebase.encoders.proto.a aVar) {
        HashMap map = new HashMap();
        map.put(cls, aVar);
        return map;
    }

    public static Map h(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static void i(String str, String str2, String str3) {
        com.app.mlounge.util.a.a(str3, str + str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(g0 g0Var) throws Exception {
        boolean zIsTerminated;
        if (g0Var instanceof AutoCloseable) {
            g0Var.close();
            return;
        }
        if (!(g0Var instanceof ExecutorService)) {
            net.luminis.tls.engine.impl.c.a();
            return;
        }
        ExecutorService executorService = (ExecutorService) g0Var;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ String k(int i) {
        if (i == 1) {
            return "DOH";
        }
        if (i == 2) {
            return "SYSTEM";
        }
        if (i != 3) {
            return i != 4 ? "null" : "UNKNOWN";
        }
        return "CACHE";
    }

    public static /* synthetic */ String l(int i) {
        if (i == 1) {
            return "BOOL_UNSPECIFIED";
        }
        if (i != 2) {
            return i != 3 ? "null" : "BOOL_FALSE";
        }
        return "BOOL_TRUE";
    }

    public static /* synthetic */ int m(String str) {
        if (str == null) {
            com.google.gson.b.h("Name is null");
            return 0;
        }
        if (str.equals("px")) {
            return 1;
        }
        if (str.equals("em")) {
            return 2;
        }
        if (str.equals("ex")) {
            return 3;
        }
        if (str.equals("in")) {
            return 4;
        }
        if (str.equals("cm")) {
            return 5;
        }
        if (str.equals("mm")) {
            return 6;
        }
        if (str.equals("pt")) {
            return 7;
        }
        if (str.equals("pc")) {
            return 8;
        }
        if (str.equals("percent")) {
            return 9;
        }
        net.luminis.tls.engine.impl.c.o("No enum constant com.caverock.androidsvg.SVG.Unit.".concat(str));
        return 0;
    }
}
