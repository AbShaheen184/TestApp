package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class BoundFunction extends BaseFunction {
    private static final long serialVersionUID = 2118137342826470729L;
    private final Object[] boundArgs;
    private final Scriptable boundThis;
    private final int length;
    private final Callable targetFunction;

    public BoundFunction(Context context, Scriptable scriptable, Callable callable, Scriptable scriptable2, Object[] objArr) {
        this.targetFunction = callable;
        this.boundThis = scriptable2;
        this.boundArgs = objArr;
        if (callable instanceof BaseFunction) {
            this.length = Math.max(0, ((BaseFunction) callable).getLength() - objArr.length);
        } else {
            this.length = 0;
        }
        ScriptRuntime.setFunctionProtoAndParent(this, context, scriptable, false);
        Object objTypeErrorThrower = ScriptRuntime.typeErrorThrower(context);
        NativeObject nativeObject = new NativeObject();
        ScriptRuntime.setBuiltinProtoAndParent(nativeObject, scriptable, TopLevel.Builtins.Object);
        nativeObject.put("get", nativeObject, objTypeErrorThrower);
        nativeObject.put("set", nativeObject, objTypeErrorThrower);
        Object obj = Boolean.FALSE;
        nativeObject.put("enumerable", nativeObject, obj);
        nativeObject.put("configurable", nativeObject, obj);
        nativeObject.preventExtensions();
        defineOwnProperty(context, "caller", nativeObject, false);
        defineOwnProperty(context, "arguments", nativeObject, false);
    }

    private static Object[] concat(Object[] objArr, Object[] objArr2) {
        Object[] objArr3 = new Object[objArr.length + objArr2.length];
        System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
        System.arraycopy(objArr2, 0, objArr3, objArr.length, objArr2.length);
        return objArr3;
    }

    public static boolean equalObjectGraphs(BoundFunction boundFunction, BoundFunction boundFunction2, EqualObjectGraphs equalObjectGraphs) {
        return equalObjectGraphs.equalGraphs(boundFunction.boundThis, boundFunction2.boundThis) && equalObjectGraphs.equalGraphs(boundFunction.targetFunction, boundFunction2.targetFunction) && equalObjectGraphs.equalGraphs(boundFunction.boundArgs, boundFunction2.boundArgs);
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return this.targetFunction.call(context, scriptable, getCallThis(context, scriptable), concat(this.boundArgs, objArr));
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Constructable
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objArr) {
        Callable callable = this.targetFunction;
        if (callable instanceof Constructable) {
            return ((Constructable) callable).construct(context, scriptable, concat(this.boundArgs, objArr));
        }
        throw ScriptRuntime.typeErrorById("msg.not.ctor", new Object[0]);
    }

    public Object[] getBoundArgs() {
        return this.boundArgs;
    }

    public Scriptable getCallThis(Context context, Scriptable scriptable) {
        Scriptable topCallScope = this.boundThis;
        if (topCallScope == null && ScriptRuntime.hasTopCall(context)) {
            topCallScope = ScriptRuntime.getTopCallScope(context);
        }
        return topCallScope == null ? ScriptableObject.getTopLevelScope(scriptable) : topCallScope;
    }

    @Override // org.mozilla.javascript.BaseFunction
    public String getFunctionName() {
        Callable callable = this.targetFunction;
        return callable instanceof BaseFunction ? androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("bound ", ((BaseFunction) callable).getFunctionName()) : "";
    }

    @Override // org.mozilla.javascript.BaseFunction
    public int getLength() {
        return this.length;
    }

    public Callable getTargetFunction() {
        return this.targetFunction;
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean hasInstance(Scriptable scriptable) {
        Callable callable = this.targetFunction;
        if (callable instanceof Function) {
            return ((Function) callable).hasInstance(scriptable);
        }
        throw ScriptRuntime.typeErrorById("msg.not.ctor", new Object[0]);
    }
}
