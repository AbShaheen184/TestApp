package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends e {
    @Override // retrofit2.e
    public final f a(Type type, Annotation[] annotationArr) {
        if (z0.h(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            net.luminis.tls.engine.impl.c.r("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        Type typeG = z0.g(0, (ParameterizedType) type);
        if (z0.h(typeG) != r0.class) {
            return new i(0, typeG);
        }
        if (typeG instanceof ParameterizedType) {
            return new i(1, z0.g(0, (ParameterizedType) typeG));
        }
        net.luminis.tls.engine.impl.c.r("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
