package org.mozilla.javascript;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class NativePromise extends ScriptableObject {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private State state = State.PENDING;
    private Object result = null;
    private boolean handled = false;
    private ArrayList<Reaction> fulfillReactions = new ArrayList<>();
    private ArrayList<Reaction> rejectReactions = new ArrayList<>();

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static class Capability {
        Object promise;
        private Object rawReject;
        private Object rawResolve;
        Callable reject;
        Callable resolve;

        public Capability(Context context, Scriptable scriptable, Object obj) {
            Object obj2 = Undefined.instance;
            this.rawResolve = obj2;
            this.rawReject = obj2;
            if (!(obj instanceof Constructable)) {
                throw ScriptRuntime.typeErrorById("msg.constructor.expected", new Object[0]);
            }
            this.promise = ((Constructable) obj).construct(context, scriptable, new Object[]{new LambdaFunction(scriptable, 2, new c0(this, 0))});
            Object obj3 = this.rawResolve;
            if (!(obj3 instanceof Callable)) {
                throw ScriptRuntime.typeErrorById("msg.function.expected", new Object[0]);
            }
            this.resolve = (Callable) obj3;
            Object obj4 = this.rawReject;
            if (!(obj4 instanceof Callable)) {
                throw ScriptRuntime.typeErrorById("msg.function.expected", new Object[0]);
            }
            this.reject = (Callable) obj4;
        }

        private Object executor(Object[] objArr) {
            if (!Undefined.isUndefined(this.rawResolve) || !Undefined.isUndefined(this.rawReject)) {
                throw ScriptRuntime.typeErrorById("msg.promise.capability.state", new Object[0]);
            }
            if (objArr.length > 0) {
                this.rawResolve = objArr[0];
            }
            if (objArr.length > 1) {
                this.rawReject = objArr[1];
            }
            return Undefined.instance;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$new$0(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
            return executor(objArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static class PromiseAllResolver {
        private static final int MAX_PROMISES = 2097152;
        Capability capability;
        boolean failFast;
        IteratorLikeIterable.Itr iterator;
        Scriptable thisObj;
        final ArrayList<Object> values = new ArrayList<>();
        int remainingElements = 1;

        public PromiseAllResolver(IteratorLikeIterable.Itr itr, Scriptable scriptable, Capability capability, boolean z) {
            this.iterator = itr;
            this.thisObj = scriptable;
            this.capability = capability;
            this.failFast = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$resolve$0(PromiseElementResolver promiseElementResolver, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
            Object obj = objArr.length > 0 ? objArr[0] : Undefined.instance;
            if (!this.failFast) {
                Scriptable scriptableNewObject = context.newObject(scriptable);
                scriptableNewObject.put("status", scriptableNewObject, "fulfilled");
                scriptableNewObject.put(ES6Iterator.VALUE_PROPERTY, scriptableNewObject, obj);
                obj = scriptableNewObject;
            }
            return promiseElementResolver.resolve(context, scriptable, obj, this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$resolve$1(PromiseElementResolver promiseElementResolver, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
            Scriptable scriptableNewObject = context.newObject(scriptable);
            scriptableNewObject.put("status", scriptableNewObject, " rejected");
            scriptableNewObject.put("reason", scriptableNewObject, objArr.length > 0 ? objArr[0] : Undefined.instance);
            return promiseElementResolver.resolve(context, scriptable, scriptableNewObject, this);
        }

        public void finalResolution(Context context, Scriptable scriptable) {
            this.capability.resolve.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{context.newArray(scriptable, this.values.toArray())});
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v2, types: [org.mozilla.javascript.Callable] */
        /* JADX WARN: Type inference failed for: r8v4, types: [org.mozilla.javascript.BaseFunction, org.mozilla.javascript.LambdaFunction] */
        public Object resolve(Context context, Scriptable scriptable) {
            Callable propFunctionAndThis = ScriptRuntime.getPropFunctionAndThis(this.thisObj, "resolve", context, scriptable);
            Scriptable scriptableLastStoredScriptable = ScriptRuntime.lastStoredScriptable(context);
            for (int i = 0; i != MAX_PROMISES; i++) {
                Object obj = Undefined.instance;
                try {
                    boolean zHasNext = this.iterator.hasNext();
                    Object next = zHasNext ? this.iterator.next() : obj;
                    if (!zHasNext) {
                        int i2 = this.remainingElements - 1;
                        this.remainingElements = i2;
                        if (i2 == 0) {
                            finalResolution(context, scriptable);
                        }
                        return this.capability.promise;
                    }
                    this.values.add(obj);
                    Object objCall = propFunctionAndThis.call(context, scriptable, scriptableLastStoredScriptable, new Object[]{next});
                    final PromiseElementResolver promiseElementResolver = new PromiseElementResolver(i);
                    final int i3 = 0;
                    LambdaFunction lambdaFunction = new LambdaFunction(scriptable, 1, new Callable(this) { // from class: org.mozilla.javascript.d0
                        public final /* synthetic */ NativePromise.PromiseAllResolver y;

                        {
                            this.y = this;
                        }

                        @Override // org.mozilla.javascript.Callable
                        public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                            switch (i3) {
                                case 0:
                                    return this.y.lambda$resolve$0(promiseElementResolver, context2, scriptable2, scriptable3, objArr);
                                default:
                                    return this.y.lambda$resolve$1(promiseElementResolver, context2, scriptable2, scriptable3, objArr);
                            }
                        }
                    });
                    Object lambdaFunction2 = this.capability.reject;
                    if (!this.failFast) {
                        final int i4 = 1;
                        lambdaFunction2 = new LambdaFunction(scriptable, 1, new Callable(this) { // from class: org.mozilla.javascript.d0
                            public final /* synthetic */ NativePromise.PromiseAllResolver y;

                            {
                                this.y = this;
                            }

                            @Override // org.mozilla.javascript.Callable
                            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                                switch (i4) {
                                    case 0:
                                        return this.y.lambda$resolve$0(promiseElementResolver, context2, scriptable2, scriptable3, objArr);
                                    default:
                                        return this.y.lambda$resolve$1(promiseElementResolver, context2, scriptable2, scriptable3, objArr);
                                }
                            }
                        });
                        lambdaFunction2.setStandardPropertyAttributes(3);
                    }
                    this.remainingElements++;
                    ScriptRuntime.getPropFunctionAndThis(objCall, "then", context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), new Object[]{lambdaFunction, lambdaFunction2});
                } catch (Throwable th) {
                    this.iterator.setDone(true);
                    throw th;
                }
            }
            throw ScriptRuntime.rangeErrorById("msg.promise.all.toobig", new Object[0]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static class PromiseAnyRejector {
        private static final int MAX_PROMISES = 2097152;
        Capability capability;
        IteratorLikeIterable.Itr iterator;
        Scriptable thisObj;
        final ArrayList<Object> errors = new ArrayList<>();
        int remainingElements = 1;

        public PromiseAnyRejector(IteratorLikeIterable.Itr itr, Scriptable scriptable, Capability capability) {
            this.iterator = itr;
            this.thisObj = scriptable;
            this.capability = capability;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$reject$0(PromiseElementResolver promiseElementResolver, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
            return promiseElementResolver.reject(context, scriptable, objArr.length > 0 ? objArr[0] : Undefined.instance, this);
        }

        public void finalRejection(Context context, Scriptable scriptable) {
            this.capability.reject.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{(NativeError) context.newObject(scriptable, "AggregateError", new Object[]{context.newArray(scriptable, this.errors.toArray())})});
        }

        public Object reject(Context context, Scriptable scriptable) {
            Callable propFunctionAndThis = ScriptRuntime.getPropFunctionAndThis(this.thisObj, "resolve", context, scriptable);
            Scriptable scriptableLastStoredScriptable = ScriptRuntime.lastStoredScriptable(context);
            for (int i = 0; i != MAX_PROMISES; i++) {
                Object obj = Undefined.instance;
                try {
                    boolean zHasNext = this.iterator.hasNext();
                    Object next = zHasNext ? this.iterator.next() : obj;
                    if (!zHasNext) {
                        int i2 = this.remainingElements - 1;
                        this.remainingElements = i2;
                        if (i2 != 0) {
                            return this.capability.promise;
                        }
                        throw new JavaScriptException((NativeError) context.newObject(scriptable, "AggregateError", new Object[]{context.newArray(scriptable, this.errors.toArray())}), null, 0);
                    }
                    this.errors.add(obj);
                    Object objCall = propFunctionAndThis.call(context, scriptable, scriptableLastStoredScriptable, new Object[]{next});
                    LambdaFunction lambdaFunction = new LambdaFunction(scriptable, 1, new m(1, this, new PromiseElementResolver(i)));
                    this.remainingElements++;
                    ScriptRuntime.getPropFunctionAndThis(objCall, "then", context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), new Object[]{this.capability.resolve, lambdaFunction});
                } catch (Throwable th) {
                    this.iterator.setDone(true);
                    throw th;
                }
            }
            throw ScriptRuntime.rangeErrorById("msg.promise.any.toobig", new Object[0]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static class PromiseElementResolver {
        private boolean alreadyCalled = false;
        private final int index;

        public PromiseElementResolver(int i) {
            this.index = i;
        }

        public Object reject(Context context, Scriptable scriptable, Object obj, PromiseAnyRejector promiseAnyRejector) {
            if (this.alreadyCalled) {
                return Undefined.instance;
            }
            this.alreadyCalled = true;
            promiseAnyRejector.errors.set(this.index, obj);
            int i = promiseAnyRejector.remainingElements - 1;
            promiseAnyRejector.remainingElements = i;
            if (i == 0) {
                promiseAnyRejector.finalRejection(context, scriptable);
            }
            return Undefined.instance;
        }

        public Object resolve(Context context, Scriptable scriptable, Object obj, PromiseAllResolver promiseAllResolver) {
            if (this.alreadyCalled) {
                return Undefined.instance;
            }
            this.alreadyCalled = true;
            promiseAllResolver.values.set(this.index, obj);
            int i = promiseAllResolver.remainingElements - 1;
            promiseAllResolver.remainingElements = i;
            if (i == 0) {
                promiseAllResolver.finalResolution(context, scriptable);
            }
            return Undefined.instance;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static class Reaction {
        Capability capability;
        Callable handler;
        ReactionType reaction;

        public Reaction(Capability capability, ReactionType reactionType, Callable callable) {
            ReactionType reactionType2 = ReactionType.FULFILL;
            this.capability = capability;
            this.reaction = reactionType;
            this.handler = callable;
        }

        public void invoke(Context context, Scriptable scriptable, Object obj) {
            try {
                Callable callable = this.handler;
                if (callable == null) {
                    int iOrdinal = this.reaction.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            this.capability.reject.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{obj});
                            return;
                        }
                        obj = null;
                    }
                } else {
                    obj = callable.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{obj});
                }
                this.capability.resolve.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{obj});
            } catch (RhinoException e) {
                this.capability.reject.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{NativePromise.getErrorObject(context, scriptable, e)});
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public enum ReactionType {
        FULFILL,
        REJECT
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static class ResolvingFunctions {
        private boolean alreadyResolved = false;
        LambdaFunction reject;
        LambdaFunction resolve;

        public ResolvingFunctions(Scriptable scriptable, final NativePromise nativePromise) {
            final int i = 0;
            this.resolve = new LambdaFunction(scriptable, 1, new Callable(this) { // from class: org.mozilla.javascript.e0
                public final /* synthetic */ NativePromise.ResolvingFunctions y;

                {
                    this.y = this;
                }

                @Override // org.mozilla.javascript.Callable
                public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                    switch (i) {
                        case 0:
                            return this.y.lambda$new$0(nativePromise, context, scriptable2, scriptable3, objArr);
                        default:
                            return this.y.lambda$new$1(nativePromise, context, scriptable2, scriptable3, objArr);
                    }
                }
            });
            final int i2 = 1;
            this.reject = new LambdaFunction(scriptable, 1, new Callable(this) { // from class: org.mozilla.javascript.e0
                public final /* synthetic */ NativePromise.ResolvingFunctions y;

                {
                    this.y = this;
                }

                @Override // org.mozilla.javascript.Callable
                public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                    switch (i2) {
                        case 0:
                            return this.y.lambda$new$0(nativePromise, context, scriptable2, scriptable3, objArr);
                        default:
                            return this.y.lambda$new$1(nativePromise, context, scriptable2, scriptable3, objArr);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$new$0(NativePromise nativePromise, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
            return resolve(context, scriptable, nativePromise, objArr.length > 0 ? objArr[0] : Undefined.instance);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$new$1(NativePromise nativePromise, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
            return reject(context, scriptable, nativePromise, objArr.length > 0 ? objArr[0] : Undefined.instance);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$resolve$2(NativePromise nativePromise, Context context, Scriptable scriptable, Object obj, Object obj2) {
            nativePromise.callThenable(context, scriptable, obj, (Callable) obj2);
        }

        private Object reject(Context context, Scriptable scriptable, NativePromise nativePromise, Object obj) {
            if (this.alreadyResolved) {
                return Undefined.instance;
            }
            this.alreadyResolved = true;
            return NativePromise.D(context, scriptable, nativePromise, obj);
        }

        private Object resolve(final Context context, final Scriptable scriptable, final NativePromise nativePromise, final Object obj) {
            if (this.alreadyResolved) {
                return Undefined.instance;
            }
            this.alreadyResolved = true;
            if (obj == nativePromise) {
                return NativePromise.D(context, scriptable, nativePromise, ScriptRuntime.newNativeError(context, scriptable, TopLevel.NativeErrors.TypeError, new Object[]{"No promise self-resolution"}));
            }
            if (!ScriptRuntime.isObject(obj)) {
                return NativePromise.C(context, scriptable, nativePromise, obj);
            }
            Object property = ScriptableObject.getProperty(ScriptableObject.ensureScriptable(obj), "then");
            if (!(property instanceof Callable)) {
                return NativePromise.C(context, scriptable, nativePromise, obj);
            }
            final Callable callable = (Callable) property;
            context.enqueueMicrotask(new Runnable() { // from class: org.mozilla.javascript.f0
                @Override // java.lang.Runnable
                public final void run() {
                    NativePromise.ResolvingFunctions.lambda$resolve$2(nativePromise, context, scriptable, obj, callable);
                }
            });
            return Undefined.instance;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public enum State {
        PENDING,
        FULFILLED,
        REJECTED
    }

    public static /* bridge */ /* synthetic */ Object C(Context context, Scriptable scriptable, NativePromise nativePromise, Object obj) {
        return nativePromise.fulfillPromise(context, scriptable, obj);
    }

    public static /* bridge */ /* synthetic */ Object D(Context context, Scriptable scriptable, NativePromise nativePromise, Object obj) {
        return nativePromise.rejectPromise(context, scriptable, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object all(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return doAll(context, scriptable, scriptable2, objArr, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object allSettled(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return doAll(context, scriptable, scriptable2, objArr, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r6v5, types: [org.mozilla.javascript.IteratorLikeIterable$Itr] */
    public static Object any(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Capability capability = new Capability(context, scriptable, scriptable2);
        try {
            IteratorLikeIterable iteratorLikeIterable = new IteratorLikeIterable(context, scriptable, ScriptRuntime.callIterator(objArr.length > 0 ? objArr[0] : Undefined.instance, context, scriptable));
            ?? it = iteratorLikeIterable.iterator();
            try {
                try {
                    Object objReject = new PromiseAnyRejector(it, scriptable2, capability).reject(context, scriptable);
                } finally {
                    if (!it.isDone()) {
                        iteratorLikeIterable.close();
                    }
                }
            } catch (RhinoException e) {
                capability.reject.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{getErrorObject(context, scriptable, e)});
                return capability.promise;
            }
        } catch (RhinoException e2) {
            capability.reject.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{getErrorObject(context, scriptable, e2)});
            return capability.promise;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callThenable(Context context, Scriptable scriptable, Object obj, Callable callable) {
        ResolvingFunctions resolvingFunctions = new ResolvingFunctions(scriptable, this);
        try {
            callable.call(context, scriptable, obj instanceof Scriptable ? (Scriptable) obj : Undefined.SCRIPTABLE_UNDEFINED, new Object[]{resolvingFunctions.resolve, resolvingFunctions.reject});
        } catch (RhinoException e) {
            resolvingFunctions.reject.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{getErrorObject(context, scriptable, e)});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Scriptable constructor(Context context, Scriptable scriptable, Object[] objArr) {
        Scriptable scriptable2;
        if (objArr.length >= 1) {
            Object obj = objArr[0];
            if (obj instanceof Callable) {
                Callable callable = (Callable) obj;
                NativePromise nativePromise = new NativePromise();
                ResolvingFunctions resolvingFunctions = new ResolvingFunctions(scriptable, nativePromise);
                Scriptable scriptable3 = Undefined.SCRIPTABLE_UNDEFINED;
                if (!context.isStrictMode() && (scriptable2 = context.topCallScope) != null) {
                    scriptable3 = scriptable2;
                }
                try {
                    callable.call(context, scriptable, scriptable3, new Object[]{resolvingFunctions.resolve, resolvingFunctions.reject});
                    return nativePromise;
                } catch (RhinoException e) {
                    resolvingFunctions.reject.call(context, scriptable, scriptable3, new Object[]{getErrorObject(context, scriptable, e)});
                    return nativePromise;
                }
            }
        }
        throw ScriptRuntime.typeErrorById("msg.function.expected", new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [org.mozilla.javascript.IteratorLikeIterable$Itr] */
    private static Object doAll(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, boolean z) {
        Capability capability = new Capability(context, scriptable, scriptable2);
        try {
            IteratorLikeIterable iteratorLikeIterable = new IteratorLikeIterable(context, scriptable, ScriptRuntime.callIterator(objArr.length > 0 ? objArr[0] : Undefined.instance, context, scriptable));
            ?? it = iteratorLikeIterable.iterator();
            try {
                try {
                    Object objResolve = new PromiseAllResolver(it, scriptable2, capability, z).resolve(context, scriptable);
                } finally {
                    if (!it.isDone()) {
                        iteratorLikeIterable.close();
                    }
                }
            } catch (RhinoException e) {
                capability.reject.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{getErrorObject(context, scriptable, e)});
                return capability.promise;
            }
        } catch (RhinoException e2) {
            capability.reject.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{getErrorObject(context, scriptable, e2)});
            return capability.promise;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object doCatch(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.toObject(context, scriptable, scriptable2), "then", context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), new Object[]{Undefined.instance, objArr.length > 0 ? objArr[0] : Undefined.instance});
    }

    private static Object doFinally(Context context, Scriptable scriptable, Scriptable scriptable2, LambdaConstructor lambdaConstructor, Object[] objArr) {
        Object objMakeCatchFinally;
        if (!ScriptRuntime.isObject(scriptable2)) {
            throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(scriptable2));
        }
        Object obj = objArr.length > 0 ? objArr[0] : Undefined.SCRIPTABLE_UNDEFINED;
        Constructable constructableSpeciesConstructor = AbstractEcmaObjectOperations.speciesConstructor(context, scriptable2, lambdaConstructor);
        if (obj instanceof Callable) {
            Callable callable = (Callable) obj;
            Callable callableMakeThenFinally = makeThenFinally(scriptable, constructableSpeciesConstructor, callable);
            objMakeCatchFinally = makeCatchFinally(scriptable, constructableSpeciesConstructor, callable);
            obj = callableMakeThenFinally;
        } else {
            objMakeCatchFinally = obj;
        }
        return ScriptRuntime.getPropFunctionAndThis(scriptable2, "then", context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), new Object[]{obj, objMakeCatchFinally});
    }

    private Object fulfillPromise(Context context, Scriptable scriptable, Object obj) {
        this.result = obj;
        ArrayList<Reaction> arrayList = this.fulfillReactions;
        this.fulfillReactions = new ArrayList<>();
        if (!this.rejectReactions.isEmpty()) {
            this.rejectReactions = new ArrayList<>();
        }
        this.state = State.FULFILLED;
        Iterator<Reaction> it = arrayList.iterator();
        while (it.hasNext()) {
            context.enqueueMicrotask(new x(it.next(), context, scriptable, obj, 1));
        }
        return Undefined.instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getErrorObject(Context context, Scriptable scriptable, RhinoException rhinoException) {
        if (rhinoException instanceof JavaScriptException) {
            return ((JavaScriptException) rhinoException).getValue();
        }
        TopLevel.NativeErrors nativeErrors = TopLevel.NativeErrors.Error;
        if (rhinoException instanceof EcmaError) {
            String name = ((EcmaError) rhinoException).getName();
            name.getClass();
            switch (name) {
                case "TypeError":
                    nativeErrors = TopLevel.NativeErrors.TypeError;
                    break;
                case "InternalError":
                    nativeErrors = TopLevel.NativeErrors.InternalError;
                    break;
                case "EvalError":
                    nativeErrors = TopLevel.NativeErrors.EvalError;
                    break;
                case "JavaException":
                    nativeErrors = TopLevel.NativeErrors.JavaException;
                    break;
                case "URIError":
                    nativeErrors = TopLevel.NativeErrors.URIError;
                    break;
                case "RangeError":
                    nativeErrors = TopLevel.NativeErrors.RangeError;
                    break;
                case "ReferenceError":
                    nativeErrors = TopLevel.NativeErrors.ReferenceError;
                    break;
                case "SyntaxError":
                    nativeErrors = TopLevel.NativeErrors.SyntaxError;
                    break;
            }
        }
        return ScriptRuntime.newNativeError(context, scriptable, nativeErrors, new Object[]{rhinoException.getMessage()});
    }

    public static void init(Context context, Scriptable scriptable, boolean z) {
        LambdaConstructor lambdaConstructor = new LambdaConstructor(scriptable, "Promise", 1, 2, new g0(1));
        lambdaConstructor.setPrototypePropertyAttributes(7);
        lambdaConstructor.defineConstructorMethod(scriptable, "resolve", 1, new v(24), 2, 3);
        lambdaConstructor.defineConstructorMethod(scriptable, "reject", 1, new v(25), 2, 3);
        lambdaConstructor.defineConstructorMethod(scriptable, "all", 1, new v(26), 2, 3);
        lambdaConstructor.defineConstructorMethod(scriptable, "allSettled", 1, new v(27), 2, 3);
        lambdaConstructor.defineConstructorMethod(scriptable, "race", 1, new v(28), 2, 3);
        lambdaConstructor.defineConstructorMethod(scriptable, "any", 1, new v(29), 2, 3);
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, lambdaConstructor);
        lambdaConstructor.definePrototypeMethod(scriptable, "then", 2, new y(lambdaConstructor, 0), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "catch", 1, new v(23), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "finally", 1, new y(lambdaConstructor, 1), 2, 3);
        lambdaConstructor.definePrototypeProperty(SymbolKey.TO_STRING_TAG, "Promise", 3);
        ScriptableObject.defineProperty(scriptable, "Promise", lambdaConstructor, 2);
        if (z) {
            lambdaConstructor.sealObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$0(LambdaConstructor lambdaConstructor, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ((NativePromise) LambdaConstructor.convertThisObject(scriptable2, NativePromise.class)).then(context, scriptable, lambdaConstructor, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$1(LambdaConstructor lambdaConstructor, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return doFinally(context, scriptable, scriptable2, lambdaConstructor, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$makeCatchFinally$6(Object obj, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        throw new JavaScriptException(obj, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$makeCatchFinally$7(Scriptable scriptable, Callable callable, Object obj, Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
        return ScriptRuntime.getPropFunctionAndThis(resolveInternal(context, scriptable, obj, callable.call(context, scriptable2, Undefined.SCRIPTABLE_UNDEFINED, ScriptRuntime.emptyArgs)), "then", context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), new Object[]{new LambdaFunction(scriptable, 0, new z(objArr.length > 0 ? objArr[0] : Undefined.instance, 1))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$makeThenFinally$5(Scriptable scriptable, Callable callable, Object obj, Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
        return ScriptRuntime.getPropFunctionAndThis(resolveInternal(context, scriptable, obj, callable.call(context, scriptable2, Undefined.SCRIPTABLE_UNDEFINED, ScriptRuntime.emptyArgs)), "then", context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), new Object[]{new LambdaFunction(scriptable, 0, new z(objArr.length > 0 ? objArr[0] : Undefined.instance, 0))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$then$2(Reaction reaction, Context context, Scriptable scriptable) {
        reaction.invoke(context, scriptable, this.result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$then$3(Reaction reaction, Context context, Scriptable scriptable) {
        reaction.invoke(context, scriptable, this.result);
    }

    private static Callable makeCatchFinally(Scriptable scriptable, Object obj, Callable callable) {
        return new LambdaFunction(scriptable, 1, new a0(scriptable, callable, obj, 1));
    }

    private static Callable makeThenFinally(Scriptable scriptable, Object obj, Callable callable) {
        return new LambdaFunction(scriptable, 1, new a0(scriptable, callable, obj, 0));
    }

    private void markHandled(Context context) {
        if (this.handled) {
            return;
        }
        context.getUnhandledPromiseTracker().promiseHandled(this);
        this.handled = true;
    }

    private static Object performRace(Context context, Scriptable scriptable, IteratorLikeIterable.Itr itr, Scriptable scriptable2, Capability capability) {
        Callable propFunctionAndThis = ScriptRuntime.getPropFunctionAndThis(scriptable2, "resolve", context, scriptable);
        Scriptable scriptableLastStoredScriptable = ScriptRuntime.lastStoredScriptable(context);
        while (true) {
            Object next = Undefined.instance;
            try {
                boolean zHasNext = itr.hasNext();
                if (zHasNext) {
                    next = itr.next();
                }
                if (!zHasNext) {
                    return capability.promise;
                }
                ScriptRuntime.getPropFunctionAndThis(propFunctionAndThis.call(context, scriptable, scriptableLastStoredScriptable, new Object[]{next}), "then", context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), new Object[]{capability.resolve, capability.reject});
            } catch (Throwable th) {
                itr.setDone(true);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.mozilla.javascript.IteratorLikeIterable$Itr] */
    public static Object race(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Capability capability = new Capability(context, scriptable, scriptable2);
        try {
            IteratorLikeIterable iteratorLikeIterable = new IteratorLikeIterable(context, scriptable, ScriptRuntime.callIterator(objArr.length > 0 ? objArr[0] : Undefined.instance, context, scriptable));
            ?? it = iteratorLikeIterable.iterator();
            try {
                try {
                    Object objPerformRace = performRace(context, scriptable, it, scriptable2, capability);
                } finally {
                    if (!it.isDone()) {
                        iteratorLikeIterable.close();
                    }
                }
            } catch (RhinoException e) {
                capability.reject.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{getErrorObject(context, scriptable, e)});
                return capability.promise;
            }
        } catch (RhinoException e2) {
            capability.reject.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{getErrorObject(context, scriptable, e2)});
            return capability.promise;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object reject(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!ScriptRuntime.isObject(scriptable2)) {
            throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(scriptable2));
        }
        Object obj = objArr.length > 0 ? objArr[0] : Undefined.instance;
        Capability capability = new Capability(context, scriptable, scriptable2);
        capability.reject.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{obj});
        return capability.promise;
    }

    private Object rejectPromise(Context context, Scriptable scriptable, Object obj) {
        this.result = obj;
        ArrayList<Reaction> arrayList = this.rejectReactions;
        this.rejectReactions = new ArrayList<>();
        if (!this.fulfillReactions.isEmpty()) {
            this.fulfillReactions = new ArrayList<>();
        }
        this.state = State.REJECTED;
        context.getUnhandledPromiseTracker().promiseRejected(this);
        Iterator<Reaction> it = arrayList.iterator();
        while (it.hasNext()) {
            context.enqueueMicrotask(new x(it.next(), context, scriptable, obj, 0));
        }
        if (!arrayList.isEmpty()) {
            markHandled(context);
        }
        return Undefined.instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object resolve(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (ScriptRuntime.isObject(scriptable2)) {
            return resolveInternal(context, scriptable, scriptable2, objArr.length > 0 ? objArr[0] : Undefined.instance);
        }
        throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(scriptable2));
    }

    private static Object resolveInternal(Context context, Scriptable scriptable, Object obj, Object obj2) {
        if ((obj2 instanceof NativePromise) && ScriptRuntime.getObjectProp(obj2, "constructor", context, scriptable) == obj) {
            return obj2;
        }
        Capability capability = new Capability(context, scriptable, obj);
        capability.resolve.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{obj2});
        return capability.promise;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    private Object then(final Context context, final Scriptable scriptable, LambdaConstructor lambdaConstructor, Object[] objArr) {
        Callable callable;
        Capability capability = new Capability(context, scriptable, AbstractEcmaObjectOperations.speciesConstructor(context, this, lambdaConstructor));
        Callable callable2 = null;
        if (objArr.length >= 1) {
            Object obj = objArr[0];
            if (obj instanceof Callable) {
                callable = (Callable) obj;
            } else {
                callable = null;
            }
        } else {
            callable = null;
        }
        if (objArr.length >= 2) {
            Object obj2 = objArr[1];
            if (obj2 instanceof Callable) {
                callable2 = (Callable) obj2;
            }
        }
        final Reaction reaction = new Reaction(capability, ReactionType.FULFILL, callable);
        final Reaction reaction2 = new Reaction(capability, ReactionType.REJECT, callable2);
        State state = this.state;
        if (state == State.PENDING) {
            this.fulfillReactions.add(reaction);
            this.rejectReactions.add(reaction2);
        } else if (state == State.FULFILLED) {
            final int i = 0;
            context.enqueueMicrotask(new Runnable(this) { // from class: org.mozilla.javascript.b0
                public final /* synthetic */ NativePromise y;

                {
                    this.y = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            this.y.lambda$then$2(reaction, context, scriptable);
                            break;
                        default:
                            this.y.lambda$then$3(reaction, context, scriptable);
                            break;
                    }
                }
            });
        } else {
            markHandled(context);
            final int i2 = 1;
            context.enqueueMicrotask(new Runnable(this) { // from class: org.mozilla.javascript.b0
                public final /* synthetic */ NativePromise y;

                {
                    this.y = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.y.lambda$then$2(reaction2, context, scriptable);
                            break;
                        default:
                            this.y.lambda$then$3(reaction2, context, scriptable);
                            break;
                    }
                }
            });
        }
        return capability.promise;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Promise";
    }

    public Object getResult() {
        return this.result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$makeThenFinally$4(Object obj, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return obj;
    }
}
