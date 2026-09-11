package retrofit2.converter.gson;

import com.google.android.material.shape.c0;
import com.google.gson.f;
import com.google.gson.n;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.l;
import retrofit2.m;
import retrofit2.t0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends l {
    public final f a;

    public a(f fVar) {
        this.a = fVar;
    }

    public static a c() {
        return new a(new f());
    }

    @Override // retrofit2.l
    public final m a(Type type) {
        com.google.gson.reflect.a aVar = new com.google.gson.reflect.a(type);
        f fVar = this.a;
        return new b(fVar, fVar.e(aVar));
    }

    @Override // retrofit2.l
    public final m b(Type type, Annotation[] annotationArr, t0 t0Var) {
        n nVarE = this.a.e(new com.google.gson.reflect.a(type));
        c0 c0Var = new c0();
        c0Var.e = nVarE;
        return c0Var;
    }
}
