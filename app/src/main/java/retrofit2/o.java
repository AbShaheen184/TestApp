package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends e {
    public final Executor a;

    public o(Executor executor) {
        this.a = executor;
    }

    @Override // retrofit2.e
    public final f a(Type type, Annotation[] annotationArr) {
        if (z0.h(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new com.google.common.util.concurrent.g0(24, z0.g(0, (ParameterizedType) type), z0.k(annotationArr, u0.class) ? null : this.a, false);
        }
        net.luminis.tls.engine.impl.c.o("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
