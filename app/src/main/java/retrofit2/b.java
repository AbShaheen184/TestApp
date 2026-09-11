package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends l {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // retrofit2.l
    public m a(Type type) {
        switch (this.a) {
            case 0:
                if (okhttp3.e0.class.isAssignableFrom(z0.h(type))) {
                    return a.A;
                }
                return null;
            default:
                return super.a(type);
        }
    }

    @Override // retrofit2.l
    public final m b(Type type, Annotation[] annotationArr, t0 t0Var) {
        switch (this.a) {
            case 0:
                if (type == okhttp3.j0.class) {
                    return z0.k(annotationArr, retrofit2.http.w.class) ? a.B : a.z;
                }
                if (type == Void.class) {
                    return a.D;
                }
                if (z0.b && type == kotlin.y.class) {
                    return a.C;
                }
                return null;
            default:
                if (z0.h(type) != Optional.class) {
                    return null;
                }
                return new com.google.android.material.internal.b(t0Var.d(z0.g(0, (ParameterizedType) type), annotationArr));
        }
    }
}
