package retrofit2;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends z0 {
    public final /* synthetic */ int c;
    public final Method d;
    public final int e;

    public /* synthetic */ e0(Method method, int i, int i2) {
        this.c = i2;
        this.d = method;
        this.e = i;
    }

    @Override // retrofit2.z0
    public final void a(o0 o0Var, Object obj) {
        switch (this.c) {
            case 0:
                okhttp3.r rVar = (okhttp3.r) obj;
                if (rVar == null) {
                    throw z0.m(this.d, this.e, "Headers parameter must not be null.", new Object[0]);
                }
                com.caverock.androidsvg.m mVar = o0Var.f;
                mVar.getClass();
                int size = rVar.size();
                for (int i = 0; i < size; i++) {
                    com.google.android.material.textfield.p.f(mVar, rVar.c(i), rVar.f(i));
                }
                return;
            default:
                if (obj == null) {
                    throw z0.m(this.d, this.e, "@Url parameter is null.", new Object[0]);
                }
                o0Var.c = obj.toString();
                return;
        }
    }
}
