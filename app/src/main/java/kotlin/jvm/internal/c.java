package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements kotlin.reflect.b, Serializable {
    public static final Object NO_RECEIVER = b.e;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient kotlin.reflect.b reflected;
    private final String signature;

    public c(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // kotlin.reflect.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kotlin.reflect.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public kotlin.reflect.b compute() {
        kotlin.reflect.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        kotlin.reflect.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    public abstract kotlin.reflect.b computeReflected();

    public GenericDeclaration findJavaDeclaration() {
        kotlin.reflect.d owner = getOwner();
        String signature = getSignature();
        signature.getClass();
        if (!(owner instanceof d)) {
            return null;
        }
        String strU0 = kotlin.text.k.u0(signature, '(');
        if (strU0.equals("<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + owner + '/' + signature);
        }
        Method[] declaredMethods = ((d) owner).a().getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (l.a(method.getName(), strU0)) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append("(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                for (Class<?> cls : parameterTypes) {
                    cls.getClass();
                    k.a(sb, cls);
                }
                sb.append(")");
                Class<?> returnType = method.getReturnType();
                returnType.getClass();
                k.a(sb, returnType);
                if (sb.toString().equals(signature)) {
                    return method;
                }
            }
        }
        return null;
    }

    @Override // kotlin.reflect.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public kotlin.reflect.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return a0.a(cls);
        }
        a0.a.getClass();
        return new p(cls);
    }

    @Override // kotlin.reflect.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract kotlin.reflect.b getReflected();

    @Override // kotlin.reflect.b
    public kotlin.reflect.k getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // kotlin.reflect.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kotlin.reflect.b
    public kotlin.reflect.l getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kotlin.reflect.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kotlin.reflect.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kotlin.reflect.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kotlin.reflect.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
