package org.mozilla.javascript;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class ArrayLikeAbstractOperations {
    private static final Comparator<Object> STRING_COMPARATOR = new StringLikeComparator();
    private static final Comparator<Object> DEFAULT_COMPARATOR = new ElementComparator();

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public enum IterativeOperation {
        EVERY,
        FILTER,
        FOR_EACH,
        MAP,
        SOME,
        FIND,
        FIND_INDEX,
        FIND_LAST,
        FIND_LAST_INDEX
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public enum ReduceOperation {
        REDUCE,
        REDUCE_RIGHT
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class StringLikeComparator implements Comparator<Object>, Serializable {
        private static final long serialVersionUID = 5299017659728190979L;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ScriptRuntime.toString(obj).compareTo(ScriptRuntime.toString(obj2));
        }
    }

    public static void defineElem(Context context, Scriptable scriptable, long j, Object obj) {
        if (j > 2147483647L) {
            scriptable.put(Long.toString(j), scriptable, obj);
        } else {
            scriptable.put((int) j, scriptable, obj);
        }
    }

    public static Function getCallbackArg(Context context, Object obj) {
        RegExpProxy regExpProxy;
        if (!(obj instanceof Function)) {
            throw ScriptRuntime.notFunctionError(obj);
        }
        Function function = (Function) obj;
        if (context.getLanguageVersion() < 200 || (regExpProxy = ScriptRuntime.getRegExpProxy(context)) == null || !regExpProxy.isRegExp(function)) {
            return function;
        }
        throw ScriptRuntime.notFunctionError(obj);
    }

    public static Object getRawElem(Scriptable scriptable, long j) {
        return j > 2147483647L ? ScriptableObject.getProperty(scriptable, Long.toString(j)) : ScriptableObject.getProperty(scriptable, (int) j);
    }

    public static Comparator<Object> getSortComparator(Context context, Scriptable scriptable, Object[] objArr) {
        return (objArr.length <= 0 || Undefined.instance == objArr[0]) ? DEFAULT_COMPARATOR : getSortComparatorFromArguments(context, scriptable, objArr);
    }

    public static ElementComparator getSortComparatorFromArguments(final Context context, final Scriptable scriptable, Object[] objArr) {
        final Callable valueFunctionAndThis = ScriptRuntime.getValueFunctionAndThis(objArr[0], context);
        final Scriptable scriptableLastStoredScriptable = ScriptRuntime.lastStoredScriptable(context);
        final Object[] objArr2 = new Object[2];
        return new ElementComparator(new Comparator<Object>() { // from class: org.mozilla.javascript.ArrayLikeAbstractOperations.1
            @Override // java.util.Comparator
            public int compare(Object obj, Object obj2) {
                Object[] objArr3 = objArr2;
                objArr3[0] = obj;
                objArr3[1] = obj2;
                int iCompare = Double.compare(ScriptRuntime.toNumber(valueFunctionAndThis.call(context, scriptable, scriptableLastStoredScriptable, objArr3)), 0.0d);
                if (iCompare < 0) {
                    return -1;
                }
                return iCompare > 0 ? 1 : 0;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:117:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x010e A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    private static Object iterativeMethod(Context context, IdFunctionObject idFunctionObject, IterativeOperation iterativeOperation, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, boolean z) {
        Object[] objArr2;
        Object objCall;
        Object obj;
        Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
        if (!z && (IterativeOperation.FIND == iterativeOperation || IterativeOperation.FIND_INDEX == iterativeOperation || IterativeOperation.FIND_LAST == iterativeOperation || IterativeOperation.FIND_LAST_INDEX == iterativeOperation)) {
            ScriptRuntimeES6.requireObjectCoercible(context, object, idFunctionObject);
        }
        long lengthProperty = NativeArray.getLengthProperty(context, object);
        IterativeOperation iterativeOperation2 = IterativeOperation.MAP;
        if (iterativeOperation == iterativeOperation2 && lengthProperty > 2147483647L) {
            throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.arraylength.bad", new Object[0]));
        }
        Function callbackArg = getCallbackArg(context, objArr.length > 0 ? objArr[0] : Undefined.instance);
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(callbackArg);
        Scriptable object2 = (objArr.length < 2 || (obj = objArr[1]) == null || obj == Undefined.instance) ? topLevelScope : ScriptRuntime.toObject(context, scriptable, obj);
        Scriptable scriptableNewArray = (iterativeOperation == IterativeOperation.FILTER || iterativeOperation == iterativeOperation2) ? context.newArray(scriptable, iterativeOperation == iterativeOperation2 ? (int) lengthProperty : 0) : null;
        IterativeOperation iterativeOperation3 = IterativeOperation.FIND_LAST;
        long j = 0;
        long j2 = 1;
        long j3 = (iterativeOperation == iterativeOperation3 || iterativeOperation == IterativeOperation.FIND_LAST_INDEX) ? lengthProperty - 1 : 0L;
        long j4 = -1;
        if (iterativeOperation == iterativeOperation3 || iterativeOperation == IterativeOperation.FIND_LAST_INDEX) {
            lengthProperty = -1;
        }
        if (iterativeOperation != iterativeOperation3 && iterativeOperation != IterativeOperation.FIND_LAST_INDEX) {
            j4 = 1;
        }
        long j5 = j3;
        while (j5 != lengthProperty) {
            long j6 = j2;
            Object rawElem = getRawElem(object, j5);
            if (rawElem != Scriptable.NOT_FOUND) {
                objArr2 = new Object[]{rawElem, Long.valueOf(j5), object};
                objCall = callbackArg.call(context, topLevelScope, object2, objArr2);
                switch (iterativeOperation) {
                    case null:
                        if (!ScriptRuntime.toBoolean(objCall)) {
                            return Boolean.FALSE;
                        }
                        break;
                        break;
                    case 1:
                        if (ScriptRuntime.toBoolean(objCall)) {
                            defineElem(context, scriptableNewArray, j, objArr2[0]);
                            j += j6;
                        }
                        break;
                    case 3:
                        defineElem(context, scriptableNewArray, j5, objCall);
                        break;
                    case 4:
                        if (ScriptRuntime.toBoolean(objCall)) {
                            return Boolean.TRUE;
                        }
                        break;
                    case 5:
                    case 7:
                        if (ScriptRuntime.toBoolean(objCall)) {
                            return rawElem;
                        }
                        break;
                    case 6:
                    case 8:
                        if (ScriptRuntime.toBoolean(objCall)) {
                            return ScriptRuntime.wrapNumber(j5);
                        }
                        break;
                }
            } else if (iterativeOperation == IterativeOperation.FIND || iterativeOperation == IterativeOperation.FIND_INDEX || iterativeOperation == IterativeOperation.FIND_LAST || iterativeOperation == IterativeOperation.FIND_LAST_INDEX) {
                rawElem = Undefined.instance;
                objArr2 = new Object[]{rawElem, Long.valueOf(j5), object};
                objCall = callbackArg.call(context, topLevelScope, object2, objArr2);
                switch (iterativeOperation) {
                    case EVERY:
                        if (!ScriptRuntime.toBoolean(objCall)) {
                            return Boolean.FALSE;
                        }
                        break;
                    case FILTER:
                        if (ScriptRuntime.toBoolean(objCall)) {
                            defineElem(context, scriptableNewArray, j, objArr2[0]);
                            j += j6;
                        }
                        break;
                    case MAP:
                        defineElem(context, scriptableNewArray, j5, objCall);
                        break;
                    case SOME:
                        if (ScriptRuntime.toBoolean(objCall)) {
                            return Boolean.TRUE;
                        }
                        break;
                    case FIND:
                    case FIND_LAST:
                        if (ScriptRuntime.toBoolean(objCall)) {
                            return rawElem;
                        }
                        break;
                    case FIND_INDEX:
                    case FIND_LAST_INDEX:
                        if (ScriptRuntime.toBoolean(objCall)) {
                            return ScriptRuntime.wrapNumber(j5);
                        }
                        break;
                }
            }
            j5 += j4;
            j2 = j6;
        }
        int iOrdinal = iterativeOperation.ordinal();
        if (iOrdinal == 0) {
            return Boolean.TRUE;
        }
        if (iOrdinal == 1 || iOrdinal == 3) {
            return scriptableNewArray;
        }
        if (iOrdinal != 4) {
            return (iOrdinal == 6 || iOrdinal == 8) ? ScriptRuntime.wrapNumber(-1.0d) : Undefined.instance;
        }
        return Boolean.FALSE;
    }

    public static Object reduceMethod(Context context, ReduceOperation reduceOperation, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
        long lengthProperty = NativeArray.getLengthProperty(context, object);
        Object obj = objArr.length > 0 ? objArr[0] : Undefined.instance;
        if (obj == null || !(obj instanceof Function)) {
            throw ScriptRuntime.notFunctionError(obj);
        }
        Function function = (Function) obj;
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(function);
        boolean z = reduceOperation == ReduceOperation.REDUCE;
        Object objCall = objArr.length > 1 ? objArr[1] : Scriptable.NOT_FOUND;
        for (long j = 0; j < lengthProperty; j++) {
            long j2 = z ? j : (lengthProperty - 1) - j;
            Object rawElem = getRawElem(object, j2);
            Object obj2 = Scriptable.NOT_FOUND;
            if (rawElem != obj2) {
                objCall = objCall == obj2 ? rawElem : function.call(context, topLevelScope, topLevelScope, new Object[]{objCall, rawElem, Long.valueOf(j2), object});
            }
        }
        if (objCall != Scriptable.NOT_FOUND) {
            return objCall;
        }
        throw ScriptRuntime.typeErrorById("msg.empty.array.reduce", new Object[0]);
    }

    public static long toSliceIndex(double d, long j) {
        if (d >= 0.0d) {
            return d > ((double) j) ? j : (long) d;
        }
        double d2 = d + j;
        if (d2 < 0.0d) {
            return 0L;
        }
        return (long) d2;
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class ElementComparator implements Comparator<Object>, Serializable {
        private static final long serialVersionUID = -1189948017688708858L;
        private final Comparator<Object> child;

        public ElementComparator() {
            this.child = ArrayLikeAbstractOperations.STRING_COMPARATOR;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            Object obj3 = Undefined.instance;
            if (obj == obj3) {
                if (obj2 == obj3) {
                    return 0;
                }
                return obj2 == Scriptable.NOT_FOUND ? -1 : 1;
            }
            Object obj4 = Scriptable.NOT_FOUND;
            if (obj == obj4) {
                return obj2 == obj4 ? 0 : 1;
            }
            if (obj2 == obj4 || obj2 == obj3) {
                return -1;
            }
            return this.child.compare(obj, obj2);
        }

        public ElementComparator(Comparator<Object> comparator) {
            this.child = comparator;
        }
    }

    public static Object iterativeMethod(Context context, IdFunctionObject idFunctionObject, IterativeOperation iterativeOperation, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return iterativeMethod(context, idFunctionObject, iterativeOperation, scriptable, scriptable2, objArr, false);
    }

    public static Object iterativeMethod(Context context, IterativeOperation iterativeOperation, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return iterativeMethod(context, null, iterativeOperation, scriptable, scriptable2, objArr, true);
    }
}
