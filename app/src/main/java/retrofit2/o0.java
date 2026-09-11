package retrofit2;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final okhttp3.s b;
    public String c;
    public com.google.android.material.shape.a0 d;
    public final okhttp3.a0 e = new okhttp3.a0();
    public final com.caverock.androidsvg.m f;
    public okhttp3.u g;
    public final boolean h;
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.c i;
    public final com.google.common.util.concurrent.g0 j;
    public okhttp3.e0 k;

    public o0(String str, okhttp3.s sVar, String str2, okhttp3.r rVar, okhttp3.u uVar, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = sVar;
        this.c = str2;
        this.g = uVar;
        this.h = z;
        if (rVar != null) {
            this.f = rVar.d();
        } else {
            this.f = new com.caverock.androidsvg.m(1);
        }
        if (z2) {
            this.j = new com.google.common.util.concurrent.g0(16);
        } else if (z3) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(20);
            this.i = cVar;
            cVar.u(okhttp3.w.g);
        }
    }

    public final void a(String str, String str2, boolean z) {
        com.google.common.util.concurrent.g0 g0Var = this.j;
        if (z) {
            g0Var.getClass();
            str.getClass();
            ((ArrayList) g0Var.y).add(okhttp3.internal.url.a.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            ((ArrayList) g0Var.z).add(okhttp3.internal.url.a.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        g0Var.getClass();
        str.getClass();
        ((ArrayList) g0Var.y).add(okhttp3.internal.url.a.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) g0Var.z).add(okhttp3.internal.url.a.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public final void b(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                kotlin.text.i iVar = okhttp3.u.e;
                this.g = com.google.android.material.resources.c.h(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Malformed content type: ", str2), e);
            }
        }
        com.caverock.androidsvg.m mVar = this.f;
        if (z) {
            mVar.e(str, str2);
        } else {
            mVar.b(str, str2);
        }
    }

    public final void c(okhttp3.r rVar, okhttp3.e0 e0Var) {
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = this.i;
        cVar.getClass();
        e0Var.getClass();
        if (rVar.b("Content-Type") != null) {
            net.luminis.tls.engine.impl.c.o("Unexpected header: Content-Type");
        } else if (rVar.b("Content-Length") != null) {
            net.luminis.tls.engine.impl.c.o("Unexpected header: Content-Length");
        } else {
            ((ArrayList) cVar.A).add(new okhttp3.v(rVar, e0Var));
        }
    }

    public final void d(String str, String str2, boolean z) {
        com.google.android.material.shape.a0 a0Var;
        String str3 = this.c;
        if (str3 != null) {
            okhttp3.s sVar = this.b;
            sVar.getClass();
            try {
                a0Var = new com.google.android.material.shape.a0(1);
                a0Var.f(sVar, str3);
            } catch (IllegalArgumentException unused) {
                a0Var = null;
            }
            this.d = a0Var;
            if (a0Var == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(sVar);
                org.mozilla.javascript.typedarrays.c.e(sb, ", Relative: ", this.c);
                return;
            }
            this.c = null;
        }
        com.google.android.material.shape.a0 a0Var2 = this.d;
        if (!z) {
            a0Var2.a(str, str2);
            return;
        }
        a0Var2.getClass();
        str.getClass();
        if (((ArrayList) a0Var2.h) == null) {
            a0Var2.h = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) a0Var2.h;
        arrayList.getClass();
        arrayList.add(okhttp3.internal.url.a.a(str, 0, 0, " \"'<>#&=", 83));
        ArrayList arrayList2 = (ArrayList) a0Var2.h;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? okhttp3.internal.url.a.a(str2, 0, 0, " \"'<>#&=", 83) : null);
    }
}
