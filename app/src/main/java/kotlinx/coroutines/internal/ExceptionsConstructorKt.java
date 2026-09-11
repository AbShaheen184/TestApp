package kotlinx.coroutines.internal;

import androidx.compose.animation.core.r1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;
import kotlin.k;
import kotlinx.coroutines.CopyableThrowable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ExceptionsConstructorKt {
    private static final CtorCache ctorCache;
    private static final int throwableFields = fieldsCountOrDefault(Throwable.class, -1);

    static {
        CtorCache ctorCache2;
        try {
            ctorCache2 = FastServiceLoaderKt.getANDROID_DETECTED() ? WeakMapCtorCache.INSTANCE : ClassValueCtorCache.INSTANCE;
        } catch (Throwable unused) {
            ctorCache2 = WeakMapCtorCache.INSTANCE;
        }
        ctorCache = ctorCache2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> l createConstructor(Class<E> cls) {
        Object next;
        l lVar;
        k kVar;
        k kVar2;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = new l() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
            @Override // kotlin.jvm.functions.l
            public final Void invoke(Throwable th) {
                return null;
            }
        };
        if (throwableFields == fieldsCountOrDefault(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i = 0;
            while (true) {
                next = null;
                if (i >= length) {
                    break;
                }
                final Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 != 0) {
                    if (length2 == 1) {
                        Class<?> cls2 = parameterTypes[0];
                        if (kotlin.jvm.internal.l.a(cls2, String.class)) {
                            final int i2 = 1;
                            kVar = new k(safeCtor(new l() { // from class: kotlinx.coroutines.internal.a
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj) {
                                    switch (i2) {
                                        case 0:
                                            return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor, (Throwable) obj);
                                        case 1:
                                            return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor, (Throwable) obj);
                                        case 2:
                                            return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor, (Throwable) obj);
                                        default:
                                            return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor, (Throwable) obj);
                                    }
                                }
                            }), 2);
                        } else if (kotlin.jvm.internal.l.a(cls2, Throwable.class)) {
                            final int i3 = 2;
                            kVar = new k(safeCtor(new l() { // from class: kotlinx.coroutines.internal.a
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj) {
                                    switch (i3) {
                                        case 0:
                                            return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor, (Throwable) obj);
                                        case 1:
                                            return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor, (Throwable) obj);
                                        case 2:
                                            return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor, (Throwable) obj);
                                        default:
                                            return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor, (Throwable) obj);
                                    }
                                }
                            }), 1);
                        } else {
                            kVar2 = new k(null, -1);
                        }
                    } else if (length2 != 2) {
                        kVar2 = new k(null, -1);
                    } else if (kotlin.jvm.internal.l.a(parameterTypes[0], String.class) && kotlin.jvm.internal.l.a(parameterTypes[1], Throwable.class)) {
                        final int i4 = 0;
                        kVar = new k(safeCtor(new l() { // from class: kotlinx.coroutines.internal.a
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj) {
                                switch (i4) {
                                    case 0:
                                        return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor, (Throwable) obj);
                                    case 1:
                                        return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor, (Throwable) obj);
                                    case 2:
                                        return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor, (Throwable) obj);
                                    default:
                                        return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor, (Throwable) obj);
                                }
                            }
                        }), 3);
                    } else {
                        kVar2 = new k(null, -1);
                    }
                    arrayList.add(kVar2);
                    i++;
                } else {
                    final int i5 = 3;
                    kVar = new k(safeCtor(new l() { // from class: kotlinx.coroutines.internal.a
                        @Override // kotlin.jvm.functions.l
                        public final Object invoke(Object obj) {
                            switch (i5) {
                                case 0:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor, (Throwable) obj);
                                case 1:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor, (Throwable) obj);
                                case 2:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor, (Throwable) obj);
                                default:
                                    return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor, (Throwable) obj);
                            }
                        }
                    }), 0);
                }
                kVar2 = kVar;
                arrayList.add(kVar2);
                i++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((k) next).y).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((k) next2).y).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            }
            k kVar3 = (k) next;
            if (kVar3 != null && (lVar = (l) kVar3.e) != null) {
                return lVar;
            }
        }
        return exceptionsConstructorKt$createConstructor$nullResult$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$1(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th.getMessage(), th);
        objNewInstance.getClass();
        return (Throwable) objNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$3(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th.getMessage());
        objNewInstance.getClass();
        Throwable th2 = (Throwable) objNewInstance;
        th2.initCause(th);
        return th2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$4(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th);
        objNewInstance.getClass();
        return (Throwable) objNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$6(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(null);
        objNewInstance.getClass();
        Throwable th2 = (Throwable) objNewInstance;
        th2.initCause(th);
        return th2;
    }

    private static final int fieldsCount(Class<?> cls, int i) {
        do {
            int i2 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }

    public static /* synthetic */ int fieldsCount$default(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return fieldsCount(cls, i);
    }

    private static final int fieldsCountOrDefault(Class<?> cls, int i) {
        Object lVar;
        cls.getClass();
        a0.a(cls);
        try {
            lVar = Integer.valueOf(fieldsCount$default(cls, 0, 1, null));
        } catch (Throwable th) {
            lVar = new kotlin.l(th);
        }
        Object objValueOf = Integer.valueOf(i);
        if (lVar instanceof kotlin.l) {
            lVar = objValueOf;
        }
        return ((Number) lVar).intValue();
    }

    private static final l safeCtor(l lVar) {
        return new r1(9, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable safeCtor$lambda$9(l lVar, Throwable th) {
        Object lVar2;
        Throwable th2;
        try {
            th2 = (Throwable) lVar.invoke(th);
            boolean zA = kotlin.jvm.internal.l.a(th.getMessage(), th2.getMessage());
            lVar2 = th2;
            if (!zA && !kotlin.jvm.internal.l.a(th2.getMessage(), th.toString())) {
                lVar2 = th2;
                lVar2 = null;
            }
        } catch (Throwable th3) {
            lVar2 = new kotlin.l(th3);
        }
        lVar2 = th2;
        return (Throwable) (lVar2 instanceof kotlin.l ? null : lVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E tryCopyException(E e) {
        Object lVar;
        if (!(e instanceof CopyableThrowable)) {
            return (E) ctorCache.get(e.getClass()).invoke(e);
        }
        try {
            lVar = ((CopyableThrowable) e).createCopy();
        } catch (Throwable th) {
            lVar = new kotlin.l(th);
        }
        if (lVar instanceof kotlin.l) {
            lVar = null;
        }
        return (E) lVar;
    }
}
