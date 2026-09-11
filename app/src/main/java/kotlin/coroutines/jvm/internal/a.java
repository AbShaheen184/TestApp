package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.l;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements kotlin.coroutines.d, d, Serializable {
    private final kotlin.coroutines.d<Object> completion;

    public a(kotlin.coroutines.d dVar) {
        this.completion = dVar;
    }

    public kotlin.coroutines.d<y> create(kotlin.coroutines.d<?> dVar) {
        dVar.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public d getCallerFrame() {
        kotlin.coroutines.d<Object> dVar = this.completion;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final kotlin.coroutines.d<Object> getCompletion() {
        return this.completion;
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null || eVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = f.b;
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar2 = f.a;
        if (cVar == null) {
            try {
                com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar3 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(19, Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.b = cVar3;
                cVar = cVar3;
            } catch (Exception unused2) {
                f.b = cVar2;
                cVar = cVar2;
            }
        }
        if (cVar != cVar2 && (method = (Method) cVar.y) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) cVar.z) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) cVar.A;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // kotlin.coroutines.d
    public final void resumeWith(Object obj) {
        kotlin.coroutines.d<Object> dVar = this;
        while (true) {
            a aVar = (a) dVar;
            kotlin.coroutines.d<Object> dVar2 = aVar.completion;
            dVar2.getClass();
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == kotlin.coroutines.intrinsics.a.e) {
                    return;
                }
            } catch (Throwable th) {
                obj = new l(th);
            }
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
        dVar.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
