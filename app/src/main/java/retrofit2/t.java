package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public final q0 a;
    public final okhttp3.y b;
    public final m c;

    public t(q0 q0Var, okhttp3.y yVar, m mVar) {
        this.a = q0Var;
        this.b = yVar;
        this.c = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:386:0x08f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:387:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:589:0x0912 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x08fd A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static t b(t0 t0Var, Class cls, Method method) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        boolean z3;
        z0 z0Var;
        int i;
        int i2;
        z0[] z0VarArr;
        int i3;
        int i4;
        z0 j0Var;
        z0 f0Var;
        a0 a0Var;
        a0 a0Var2;
        p0 p0Var = new p0(t0Var, cls, method);
        Annotation[] annotationArr = p0Var.d;
        int length = annotationArr.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String str = "HEAD";
            boolean z4 = true;
            z0 z0Var2 = null;
            if (i6 >= length) {
                if (p0Var.o == null) {
                    throw z0.l(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!p0Var.p) {
                    if (p0Var.r) {
                        throw z0.l(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (p0Var.q) {
                        throw z0.l(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = p0Var.e;
                int length2 = annotationArr2.length;
                p0Var.w = new z0[length2];
                int i7 = length2 - 1;
                int i8 = 0;
                while (i8 < length2) {
                    z0[] z0VarArr2 = p0Var.w;
                    Type type = p0Var.f[i8];
                    Annotation[] annotationArr3 = annotationArr2[i8];
                    int i9 = i8 == i7 ? 1 : i5;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        z0Var = z0Var2;
                        int i10 = i5;
                        while (i10 < length3) {
                            Annotation annotation = annotationArr3[i10];
                            Annotation[][] annotationArr4 = annotationArr2;
                            int i11 = length2;
                            if (annotation instanceof retrofit2.http.y) {
                                p0Var.c(i8, type);
                                if (p0Var.n) {
                                    throw z0.m(method, i8, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (p0Var.j) {
                                    throw z0.m(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (p0Var.k) {
                                    throw z0.m(method, i8, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (p0Var.l) {
                                    throw z0.m(method, i8, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (p0Var.m) {
                                    throw z0.m(method, i8, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (p0Var.s != null) {
                                    throw z0.m(method, i8, "@Url cannot be used with @%s URL", p0Var.o);
                                }
                                p0Var.n = true;
                                if (type != okhttp3.s.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw z0.m(method, i8, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                j0Var = new e0(method, i8, 1);
                                i = i7;
                            } else {
                                i = i7;
                                boolean z5 = annotation instanceof retrofit2.http.s;
                                t0 t0Var2 = p0Var.a;
                                if (z5) {
                                    p0Var.c(i8, type);
                                    if (p0Var.k) {
                                        throw z0.m(method, i8, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (p0Var.l) {
                                        throw z0.m(method, i8, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (p0Var.m) {
                                        throw z0.m(method, i8, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (p0Var.n) {
                                        throw z0.m(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (p0Var.s == null) {
                                        throw z0.m(method, i8, "@Path can only be used with relative url on @%s", p0Var.o);
                                    }
                                    p0Var.j = true;
                                    retrofit2.http.s sVar = (retrofit2.http.s) annotation;
                                    String strValue = sVar.value();
                                    if (!p0.z.matcher(strValue).matches()) {
                                        throw z0.m(method, i8, "@Path parameter name must match %s. Found: %s", p0.y.pattern(), strValue);
                                    }
                                    if (!p0Var.v.contains(strValue)) {
                                        throw z0.m(method, i8, "URL \"%s\" does not contain \"{%s}\".", p0Var.s, strValue);
                                    }
                                    t0Var2.e(type, annotationArr3);
                                    j0Var = new g0(p0Var.c, i8, strValue, sVar.encoded());
                                } else {
                                    i2 = i10;
                                    z0VarArr = z0VarArr2;
                                    if (annotation instanceof retrofit2.http.t) {
                                        p0Var.c(i8, type);
                                        retrofit2.http.t tVar = (retrofit2.http.t) annotation;
                                        String strValue2 = tVar.value();
                                        boolean zEncoded = tVar.encoded();
                                        i3 = i9;
                                        Class clsH = z0.h(type);
                                        i4 = length3;
                                        p0Var.k = true;
                                        if (!Iterable.class.isAssignableFrom(clsH)) {
                                            if (clsH.isArray()) {
                                                t0Var2.e(p0.a(clsH.getComponentType()), annotationArr3);
                                                a0Var2 = new a0(new c0(2, strValue2, zEncoded), 1);
                                            } else {
                                                t0Var2.e(type, annotationArr3);
                                                j0Var = new c0(2, strValue2, zEncoded);
                                            }
                                            str = str;
                                        } else {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw z0.m(method, i8, clsH.getSimpleName() + " must include generic type (e.g., " + clsH.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            t0Var2.e(z0.g(0, (ParameterizedType) type), annotationArr3);
                                            a0Var2 = new a0(new c0(2, strValue2, zEncoded), 0);
                                        }
                                        j0Var = a0Var2;
                                        str = str;
                                    } else {
                                        i3 = i9;
                                        i4 = length3;
                                        if (annotation instanceof retrofit2.http.v) {
                                            p0Var.c(i8, type);
                                            boolean zEncoded2 = ((retrofit2.http.v) annotation).encoded();
                                            Class clsH2 = z0.h(type);
                                            p0Var.l = true;
                                            if (Iterable.class.isAssignableFrom(clsH2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw z0.m(method, i8, clsH2.getSimpleName() + " must include generic type (e.g., " + clsH2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                t0Var2.e(z0.g(0, (ParameterizedType) type), annotationArr3);
                                                a0Var2 = new a0(new h0(zEncoded2), 0);
                                            } else if (clsH2.isArray()) {
                                                t0Var2.e(p0.a(clsH2.getComponentType()), annotationArr3);
                                                a0Var2 = new a0(new h0(zEncoded2), 1);
                                            } else {
                                                t0Var2.e(type, annotationArr3);
                                                j0Var = new h0(zEncoded2);
                                            }
                                            j0Var = a0Var2;
                                        } else if (annotation instanceof retrofit2.http.u) {
                                            p0Var.c(i8, type);
                                            Class clsH3 = z0.h(type);
                                            p0Var.m = true;
                                            if (!Map.class.isAssignableFrom(clsH3)) {
                                                throw z0.m(method, i8, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeI = z0.i(type, clsH3);
                                            if (!(typeI instanceof ParameterizedType)) {
                                                throw z0.m(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) typeI;
                                            Type typeG = z0.g(0, parameterizedType);
                                            if (String.class != typeG) {
                                                throw z0.m(method, i8, "@QueryMap keys must be of type String: " + typeG, new Object[0]);
                                            }
                                            t0Var2.e(z0.g(1, parameterizedType), annotationArr3);
                                            j0Var = new d0(method, i8, ((retrofit2.http.u) annotation).encoded(), 2);
                                        } else {
                                            str = str;
                                            if (annotation instanceof retrofit2.http.i) {
                                                p0Var.c(i8, type);
                                                retrofit2.http.i iVar = (retrofit2.http.i) annotation;
                                                String strValue3 = iVar.value();
                                                Class clsH4 = z0.h(type);
                                                if (Iterable.class.isAssignableFrom(clsH4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw z0.m(method, i8, clsH4.getSimpleName() + " must include generic type (e.g., " + clsH4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    t0Var2.e(z0.g(0, (ParameterizedType) type), annotationArr3);
                                                    f0Var = new a0(new c0(1, strValue3, iVar.allowUnsafeNonAsciiValues()), 0);
                                                } else if (clsH4.isArray()) {
                                                    t0Var2.e(p0.a(clsH4.getComponentType()), annotationArr3);
                                                    f0Var = new a0(new c0(1, strValue3, iVar.allowUnsafeNonAsciiValues()), 1);
                                                } else {
                                                    t0Var2.e(type, annotationArr3);
                                                    j0Var = new c0(1, strValue3, iVar.allowUnsafeNonAsciiValues());
                                                }
                                                j0Var = f0Var;
                                            } else if (annotation instanceof retrofit2.http.j) {
                                                if (type == okhttp3.r.class) {
                                                    j0Var = new e0(method, i8, 0);
                                                } else {
                                                    p0Var.c(i8, type);
                                                    Class clsH5 = z0.h(type);
                                                    if (!Map.class.isAssignableFrom(clsH5)) {
                                                        throw z0.m(method, i8, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type typeI2 = z0.i(type, clsH5);
                                                    if (!(typeI2 instanceof ParameterizedType)) {
                                                        throw z0.m(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeI2;
                                                    Type typeG2 = z0.g(0, parameterizedType2);
                                                    if (String.class != typeG2) {
                                                        throw z0.m(method, i8, "@HeaderMap keys must be of type String: " + typeG2, new Object[0]);
                                                    }
                                                    t0Var2.e(z0.g(1, parameterizedType2), annotationArr3);
                                                    j0Var = new d0(method, i8, ((retrofit2.http.j) annotation).allowUnsafeNonAsciiValues(), 1);
                                                }
                                            } else if (annotation instanceof retrofit2.http.c) {
                                                p0Var.c(i8, type);
                                                if (!p0Var.q) {
                                                    throw z0.m(method, i8, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                retrofit2.http.c cVar = (retrofit2.http.c) annotation;
                                                String strValue4 = cVar.value();
                                                boolean zEncoded3 = cVar.encoded();
                                                p0Var.g = true;
                                                Class clsH6 = z0.h(type);
                                                if (Iterable.class.isAssignableFrom(clsH6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw z0.m(method, i8, clsH6.getSimpleName() + " must include generic type (e.g., " + clsH6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    t0Var2.e(z0.g(0, (ParameterizedType) type), annotationArr3);
                                                    f0Var = new a0(new c0(0, strValue4, zEncoded3), 0);
                                                } else if (clsH6.isArray()) {
                                                    t0Var2.e(p0.a(clsH6.getComponentType()), annotationArr3);
                                                    f0Var = new a0(new c0(0, strValue4, zEncoded3), 1);
                                                } else {
                                                    t0Var2.e(type, annotationArr3);
                                                    j0Var = new c0(0, strValue4, zEncoded3);
                                                }
                                                j0Var = f0Var;
                                            } else if (annotation instanceof retrofit2.http.d) {
                                                p0Var.c(i8, type);
                                                if (!p0Var.q) {
                                                    throw z0.m(method, i8, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class clsH7 = z0.h(type);
                                                if (!Map.class.isAssignableFrom(clsH7)) {
                                                    throw z0.m(method, i8, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeI3 = z0.i(type, clsH7);
                                                if (!(typeI3 instanceof ParameterizedType)) {
                                                    throw z0.m(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeI3;
                                                Type typeG3 = z0.g(0, parameterizedType3);
                                                if (String.class != typeG3) {
                                                    throw z0.m(method, i8, "@FieldMap keys must be of type String: " + typeG3, new Object[0]);
                                                }
                                                t0Var2.e(z0.g(1, parameterizedType3), annotationArr3);
                                                p0Var.g = true;
                                                j0Var = new d0(method, i8, ((retrofit2.http.d) annotation).encoded(), 0);
                                            } else if (annotation instanceof retrofit2.http.q) {
                                                p0Var.c(i8, type);
                                                if (!p0Var.r) {
                                                    throw z0.m(method, i8, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                retrofit2.http.q qVar = (retrofit2.http.q) annotation;
                                                p0Var.h = true;
                                                String strValue5 = qVar.value();
                                                Class clsH8 = z0.h(type);
                                                if (strValue5.isEmpty()) {
                                                    boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsH8);
                                                    i0 i0Var = i0.c;
                                                    if (zIsAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw z0.m(method, i8, clsH8.getSimpleName() + " must include generic type (e.g., " + clsH8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!okhttp3.v.class.isAssignableFrom(z0.h(z0.g(0, (ParameterizedType) type)))) {
                                                            throw z0.m(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        j0Var = new a0(i0Var, 0);
                                                    } else if (clsH8.isArray()) {
                                                        if (!okhttp3.v.class.isAssignableFrom(clsH8.getComponentType())) {
                                                            throw z0.m(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        j0Var = new a0(i0Var, 1);
                                                    } else {
                                                        if (!okhttp3.v.class.isAssignableFrom(clsH8)) {
                                                            throw z0.m(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        j0Var = i0Var;
                                                    }
                                                } else {
                                                    String[] strArr = {"Content-Disposition", androidx.privacysandbox.ads.adservices.java.internal.a.q("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", qVar.encoding()};
                                                    okhttp3.r rVar = okhttp3.r.y;
                                                    okhttp3.r rVarQ = com.google.android.material.resources.b.q(strArr);
                                                    if (Iterable.class.isAssignableFrom(clsH8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw z0.m(method, i8, clsH8.getSimpleName() + " must include generic type (e.g., " + clsH8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type typeG4 = z0.g(0, (ParameterizedType) type);
                                                        if (okhttp3.v.class.isAssignableFrom(z0.h(typeG4))) {
                                                            throw z0.m(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        a0Var = new a0(new f0(method, i8, rVarQ, t0Var2.c(typeG4, annotationArr3, annotationArr)), 0);
                                                    } else if (clsH8.isArray()) {
                                                        Class clsA = p0.a(clsH8.getComponentType());
                                                        if (okhttp3.v.class.isAssignableFrom(clsA)) {
                                                            throw z0.m(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        a0Var = new a0(new f0(method, i8, rVarQ, t0Var2.c(clsA, annotationArr3, annotationArr)), 1);
                                                    } else {
                                                        if (okhttp3.v.class.isAssignableFrom(clsH8)) {
                                                            throw z0.m(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        f0Var = new f0(method, i8, rVarQ, t0Var2.c(type, annotationArr3, annotationArr));
                                                        j0Var = f0Var;
                                                    }
                                                    j0Var = a0Var;
                                                }
                                            } else if (annotation instanceof retrofit2.http.r) {
                                                p0Var.c(i8, type);
                                                if (!p0Var.r) {
                                                    throw z0.m(method, i8, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                p0Var.h = true;
                                                Class clsH9 = z0.h(type);
                                                if (!Map.class.isAssignableFrom(clsH9)) {
                                                    throw z0.m(method, i8, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeI4 = z0.i(type, clsH9);
                                                if (!(typeI4 instanceof ParameterizedType)) {
                                                    throw z0.m(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeI4;
                                                Type typeG5 = z0.g(0, parameterizedType4);
                                                if (String.class != typeG5) {
                                                    throw z0.m(method, i8, "@PartMap keys must be of type String: " + typeG5, new Object[0]);
                                                }
                                                Type typeG6 = z0.g(1, parameterizedType4);
                                                if (okhttp3.v.class.isAssignableFrom(z0.h(typeG6))) {
                                                    throw z0.m(method, i8, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                j0Var = new f0(method, i8, t0Var2.c(typeG6, annotationArr3, annotationArr), ((retrofit2.http.r) annotation).encoding());
                                            } else if (annotation instanceof retrofit2.http.a) {
                                                p0Var.c(i8, type);
                                                if (p0Var.q || p0Var.r) {
                                                    throw z0.m(method, i8, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (p0Var.i) {
                                                    throw z0.m(method, i8, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    m mVarC = t0Var2.c(type, annotationArr3, annotationArr);
                                                    p0Var.i = true;
                                                    j0Var = new b0(method, i8, mVarC);
                                                } catch (RuntimeException e) {
                                                    throw z0.n(method, e, i8, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof retrofit2.http.x) {
                                                p0Var.c(i8, type);
                                                Class clsA2 = p0.a(z0.h(type));
                                                for (int i12 = i8 - 1; i12 >= 0; i12--) {
                                                    z0 z0Var3 = p0Var.w[i12];
                                                    if ((z0Var3 instanceof j0) && ((j0) z0Var3).c.equals(clsA2)) {
                                                        throw z0.m(method, i8, "@Tag type " + clsA2.getName() + " is duplicate of " + k0.b.c(i12, method) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                j0Var = new j0(clsA2);
                                            } else {
                                                j0Var = null;
                                            }
                                        }
                                        str = str;
                                    }
                                }
                                if (j0Var != null) {
                                    if (z0Var == null) {
                                        throw z0.m(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    z0Var = j0Var;
                                }
                                i10 = i2 + 1;
                                annotationArr2 = annotationArr4;
                                i7 = i;
                                length2 = i11;
                                i9 = i3;
                                str = str;
                                z0VarArr2 = z0VarArr;
                                length3 = i4;
                            }
                            i2 = i10;
                            z0VarArr = z0VarArr2;
                            i3 = i9;
                            i4 = length3;
                            if (j0Var != null) {
                                if (z0Var == null) {
                                    throw z0.m(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                z0Var = j0Var;
                            }
                            i10 = i2 + 1;
                            annotationArr2 = annotationArr4;
                            i7 = i;
                            length2 = i11;
                            i9 = i3;
                            str = str;
                            z0VarArr2 = z0VarArr;
                            length3 = i4;
                        }
                    } else {
                        z0Var = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i13 = length2;
                    String str2 = str;
                    int i14 = i7;
                    z0[] z0VarArr3 = z0VarArr2;
                    int i15 = i9;
                    if (z0Var == null) {
                        if (i15 != 0) {
                            try {
                                if (z0.h(type) == kotlin.coroutines.d.class) {
                                    p0Var.x = true;
                                    z0Var = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw z0.m(method, i8, "No Retrofit annotation found.", new Object[0]);
                    }
                    z0VarArr3[i8] = z0Var;
                    i8++;
                    annotationArr2 = annotationArr5;
                    i7 = i14;
                    length2 = i13;
                    str = str2;
                    i5 = 0;
                    z0Var2 = null;
                }
                String str3 = str;
                if (p0Var.s == null && !p0Var.n) {
                    throw z0.l(method, null, "Missing either @%s URL or @Url parameter.", p0Var.o);
                }
                boolean z6 = p0Var.q;
                if (!z6 && !p0Var.r && !p0Var.p && p0Var.i) {
                    throw z0.l(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z6 && !p0Var.g) {
                    throw z0.l(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (p0Var.r && !p0Var.h) {
                    throw z0.l(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                q0 q0Var = new q0(p0Var);
                Type genericReturnType2 = method.getGenericReturnType();
                if (z0.j(genericReturnType2)) {
                    throw z0.l(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw z0.l(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z7 = q0Var.l;
                if (z7) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeG7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeG7 instanceof WildcardType) {
                        typeG7 = ((WildcardType) typeG7).getLowerBounds()[0];
                    }
                    if (z0.h(typeG7) == r0.class && (typeG7 instanceof ParameterizedType)) {
                        typeG7 = z0.g(0, (ParameterizedType) typeG7);
                        z2 = true;
                        z3 = false;
                    } else {
                        if (z0.h(typeG7) == d.class) {
                            throw z0.l(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", z0.g(0, (ParameterizedType) typeG7));
                        }
                        z3 = z0.b && typeG7 == kotlin.y.class;
                        z2 = false;
                    }
                    genericReturnType = new x0(null, d.class, typeG7);
                    if (!z0.k(annotations, u0.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = v0.b;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                    z = z3;
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                    z2 = false;
                }
                try {
                    f fVarA = t0Var.a(genericReturnType, annotations);
                    Type typeA = fVarA.a();
                    if (typeA == okhttp3.g0.class) {
                        throw z0.l(method, null, "'" + z0.h(typeA).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeA == r0.class) {
                        throw z0.l(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (q0Var.d.equals(str3) && !Void.class.equals(typeA) && (!z0.b || typeA != kotlin.y.class)) {
                        throw z0.l(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        m mVarD = t0Var.d(typeA, method.getAnnotations());
                        okhttp3.y yVar = t0Var.b;
                        if (z7) {
                            return z2 ? new r(q0Var, yVar, mVarD, fVarA, 1) : new s(q0Var, yVar, mVarD, fVarA, z);
                        }
                        return new r(q0Var, yVar, mVarD, fVarA, 0);
                    } catch (RuntimeException e2) {
                        throw z0.l(method, e2, "Unable to create converter for %s", typeA);
                    }
                } catch (RuntimeException e3) {
                    throw z0.l(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i6];
            if (annotation2 instanceof retrofit2.http.b) {
                p0Var.b("DELETE", ((retrofit2.http.b) annotation2).value(), false);
            } else if (annotation2 instanceof retrofit2.http.f) {
                p0Var.b("GET", ((retrofit2.http.f) annotation2).value(), false);
            } else if (annotation2 instanceof retrofit2.http.g) {
                p0Var.b("HEAD", ((retrofit2.http.g) annotation2).value(), false);
            } else if (annotation2 instanceof retrofit2.http.n) {
                p0Var.b("PATCH", ((retrofit2.http.n) annotation2).value(), true);
            } else if (annotation2 instanceof retrofit2.http.o) {
                p0Var.b("POST", ((retrofit2.http.o) annotation2).value(), true);
            } else if (annotation2 instanceof retrofit2.http.p) {
                p0Var.b("PUT", ((retrofit2.http.p) annotation2).value(), true);
            } else if (annotation2 instanceof retrofit2.http.m) {
                p0Var.b("OPTIONS", ((retrofit2.http.m) annotation2).value(), false);
            } else if (annotation2 instanceof retrofit2.http.h) {
                retrofit2.http.h hVar = (retrofit2.http.h) annotation2;
                p0Var.b(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation2 instanceof retrofit2.http.k) {
                retrofit2.http.k kVar = (retrofit2.http.k) annotation2;
                String[] strArrValue = kVar.value();
                if (strArrValue.length == 0) {
                    throw z0.l(method, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean zAllowUnsafeNonAsciiValues = kVar.allowUnsafeNonAsciiValues();
                com.caverock.androidsvg.m mVar = new com.caverock.androidsvg.m(1);
                int length4 = strArrValue.length;
                int i16 = 0;
                while (i16 < length4) {
                    String str4 = strArrValue[i16];
                    int iIndexOf = str4.indexOf(58);
                    boolean z8 = z4;
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str4.length() - 1) {
                        throw z0.l(method, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str4);
                    }
                    String strSubstring = str4.substring(0, iIndexOf);
                    String strTrim = str4.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            kotlin.text.i iVar2 = okhttp3.u.e;
                            p0Var.u = com.google.android.material.resources.c.h(strTrim);
                        } catch (IllegalArgumentException e4) {
                            throw z0.l(method, e4, "Malformed content type: %s", strTrim);
                        }
                    } else if (zAllowUnsafeNonAsciiValues) {
                        mVar.e(strSubstring, strTrim);
                    } else {
                        mVar.b(strSubstring, strTrim);
                    }
                    i16++;
                    z4 = z8;
                }
                p0Var.t = mVar.f();
            } else if (annotation2 instanceof retrofit2.http.l) {
                if (p0Var.q) {
                    throw z0.l(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                p0Var.r = true;
            } else if (!(annotation2 instanceof retrofit2.http.e)) {
                continue;
            } else {
                if (p0Var.r) {
                    throw z0.l(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                p0Var.q = true;
            }
            i6++;
        }
    }

    public abstract Object a(z zVar, Object[] objArr);
}
