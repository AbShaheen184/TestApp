package retrofit2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements InvocationHandler {
    public final Object[] a = new Object[0];
    public final /* synthetic */ Class b;
    public final /* synthetic */ t0 c;

    public s0(t0 t0Var, Class cls) {
        this.c = t0Var;
        this.b = cls;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        t tVarB;
        t tVar;
        Class cls = this.b;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.a;
        }
        Object[] objArr2 = objArr;
        a aVar = k0.b;
        if (aVar.f(method)) {
            return aVar.e(method, cls, obj, objArr2);
        }
        t0 t0Var = this.c;
        while (true) {
            Object objPutIfAbsent = t0Var.a.get(method);
            if (!(objPutIfAbsent instanceof t)) {
                if (objPutIfAbsent == null) {
                    Object obj2 = new Object();
                    synchronized (obj2) {
                        try {
                            objPutIfAbsent = t0Var.a.putIfAbsent(method, obj2);
                            if (objPutIfAbsent == null) {
                                try {
                                    tVarB = t.b(t0Var, cls, method);
                                    t0Var.a.put(method, tVarB);
                                } catch (Throwable th) {
                                    t0Var.a.remove(method);
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                synchronized (objPutIfAbsent) {
                    try {
                        Object obj3 = t0Var.a.get(method);
                        if (obj3 != null) {
                            tVar = (t) obj3;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                break;
            }
            tVarB = (t) objPutIfAbsent;
            tVar = tVarB;
        }
        return tVar.a(new z(tVar.a, obj, objArr2, tVar.b, tVar.c), objArr2);
    }
}
