package org.mozilla.javascript;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class JavaToJSONConverters {
    public static final UnaryOperator<Object> BEAN;
    public static final UnaryOperator<Object> EMPTY_OBJECT;
    public static final UnaryOperator<Object> STRING;
    public static final UnaryOperator<Object> THROW_TYPE_ERROR;
    public static final UnaryOperator<Object> UNDEFINED;

    static {
        final int i = 0;
        STRING = new UnaryOperator() { // from class: org.mozilla.javascript.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i) {
                    case 0:
                        return obj.toString();
                    case 1:
                        return JavaToJSONConverters.lambda$static$1(obj);
                    case 2:
                        return JavaToJSONConverters.lambda$static$2(obj);
                    case 3:
                        return JavaToJSONConverters.lambda$static$3(obj);
                    default:
                        return JavaToJSONConverters.lambda$static$4(obj);
                }
            }
        };
        final int i2 = 1;
        UNDEFINED = new UnaryOperator() { // from class: org.mozilla.javascript.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i2) {
                    case 0:
                        return obj.toString();
                    case 1:
                        return JavaToJSONConverters.lambda$static$1(obj);
                    case 2:
                        return JavaToJSONConverters.lambda$static$2(obj);
                    case 3:
                        return JavaToJSONConverters.lambda$static$3(obj);
                    default:
                        return JavaToJSONConverters.lambda$static$4(obj);
                }
            }
        };
        final int i3 = 2;
        EMPTY_OBJECT = new UnaryOperator() { // from class: org.mozilla.javascript.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i3) {
                    case 0:
                        return obj.toString();
                    case 1:
                        return JavaToJSONConverters.lambda$static$1(obj);
                    case 2:
                        return JavaToJSONConverters.lambda$static$2(obj);
                    case 3:
                        return JavaToJSONConverters.lambda$static$3(obj);
                    default:
                        return JavaToJSONConverters.lambda$static$4(obj);
                }
            }
        };
        final int i4 = 3;
        THROW_TYPE_ERROR = new UnaryOperator() { // from class: org.mozilla.javascript.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i4) {
                    case 0:
                        return obj.toString();
                    case 1:
                        return JavaToJSONConverters.lambda$static$1(obj);
                    case 2:
                        return JavaToJSONConverters.lambda$static$2(obj);
                    case 3:
                        return JavaToJSONConverters.lambda$static$3(obj);
                    default:
                        return JavaToJSONConverters.lambda$static$4(obj);
                }
            }
        };
        final int i5 = 4;
        BEAN = new UnaryOperator() { // from class: org.mozilla.javascript.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i5) {
                    case 0:
                        return obj.toString();
                    case 1:
                        return JavaToJSONConverters.lambda$static$1(obj);
                    case 2:
                        return JavaToJSONConverters.lambda$static$2(obj);
                    case 3:
                        return JavaToJSONConverters.lambda$static$3(obj);
                    default:
                        return JavaToJSONConverters.lambda$static$4(obj);
                }
            }
        };
    }

    private JavaToJSONConverters() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$1(Object obj) {
        return Undefined.instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$2(Object obj) {
        return Collections.EMPTY_MAP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$3(Object obj) {
        throw ScriptRuntime.typeErrorById("msg.json.cant.serialize", obj.getClass().getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$4(Object obj) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass(), Object.class);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PropertyDescriptor propertyDescriptor : beanInfo.getPropertyDescriptors()) {
                if (propertyDescriptor.getReadMethod() != null) {
                    try {
                        linkedHashMap.put(propertyDescriptor.getName(), propertyDescriptor.getReadMethod().invoke(obj, null));
                    } catch (Exception unused) {
                    }
                }
            }
            if (linkedHashMap.size() == 0) {
                return null;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("beanClass", beanInfo.getBeanDescriptor().getBeanClass().getName());
            linkedHashMap2.put("properties", linkedHashMap);
            return linkedHashMap2;
        } catch (IntrospectionException unused2) {
            return null;
        }
    }
}
