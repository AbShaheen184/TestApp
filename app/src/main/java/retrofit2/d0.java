package retrofit2;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends z0 {
    public final /* synthetic */ int c;
    public final Method d;
    public final int e;
    public final boolean f;

    public /* synthetic */ d0(Method method, int i, boolean z, int i2) {
        this.c = i2;
        this.d = method;
        this.e = i;
        this.f = z;
    }

    @Override // retrofit2.z0
    public final void a(o0 o0Var, Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                int i = this.e;
                Method method = this.d;
                if (map == null) {
                    throw z0.m(method, i, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw z0.m(method, i, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw z0.m(method, i, androidx.privacysandbox.ads.adservices.java.internal.a.q("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw z0.m(method, i, "Field map value '" + value + "' converted to null by " + a.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    o0Var.a(str, string, this.f);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                int i2 = this.e;
                Method method2 = this.d;
                if (map2 == null) {
                    throw z0.m(method2, i2, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw z0.m(method2, i2, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw z0.m(method2, i2, androidx.privacysandbox.ads.adservices.java.internal.a.q("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    o0Var.b(str2, value2.toString(), this.f);
                }
                return;
            default:
                Map map3 = (Map) obj;
                int i3 = this.e;
                Method method3 = this.d;
                if (map3 == null) {
                    throw z0.m(method3, i3, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw z0.m(method3, i3, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw z0.m(method3, i3, androidx.privacysandbox.ads.adservices.java.internal.a.q("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw z0.m(method3, i3, "Query map value '" + value3 + "' converted to null by " + a.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    o0Var.d(str3, string2, this.f);
                }
                return;
        }
    }
}
