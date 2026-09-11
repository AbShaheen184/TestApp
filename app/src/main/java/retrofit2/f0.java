package retrofit2;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends z0 {
    public final /* synthetic */ int c = 0;
    public final Method d;
    public final int e;
    public final m f;
    public final Object g;

    public f0(Method method, int i, okhttp3.r rVar, m mVar) {
        this.d = method;
        this.e = i;
        this.g = rVar;
        this.f = mVar;
    }

    @Override // retrofit2.z0
    public final void a(o0 o0Var, Object obj) {
        int i = this.c;
        m mVar = this.f;
        Object obj2 = this.g;
        Method method = this.d;
        int i2 = this.e;
        switch (i) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    o0Var.c((okhttp3.r) obj2, (okhttp3.e0) mVar.d(obj));
                    return;
                } catch (IOException e) {
                    throw z0.m(method, i2, "Unable to convert " + obj + " to RequestBody", e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw z0.m(method, i2, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw z0.m(method, i2, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw z0.m(method, i2, androidx.privacysandbox.ads.adservices.java.internal.a.q("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", androidx.privacysandbox.ads.adservices.java.internal.a.q("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    okhttp3.r rVar = okhttp3.r.y;
                    o0Var.c(com.google.android.material.resources.b.q(strArr), (okhttp3.e0) mVar.d(value));
                }
                return;
        }
    }

    public f0(Method method, int i, m mVar, String str) {
        this.d = method;
        this.e = i;
        this.f = mVar;
        this.g = str;
    }
}
