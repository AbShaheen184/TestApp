package org.mozilla.javascript;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class NativeSymbol extends ScriptableObject implements Symbol {
    public static final String CLASS_NAME = "Symbol";
    private static final Object GLOBAL_TABLE_KEY = new Object();
    public static final String TYPE_NAME = "symbol";
    private static final long serialVersionUID = -589539749749830003L;
    private final SymbolKey key;
    private final NativeSymbol symbolData;

    public NativeSymbol(NativeSymbol nativeSymbol) {
        this.key = nativeSymbol.key;
        this.symbolData = nativeSymbol.symbolData;
    }

    private static NativeSymbol constructSymbol(Context context, Scriptable scriptable, LambdaConstructor lambdaConstructor, SymbolKey symbolKey) {
        return (NativeSymbol) lambdaConstructor.call(context, scriptable, null, new Object[]{Undefined.instance, symbolKey});
    }

    private static void createStandardSymbol(Context context, Scriptable scriptable, LambdaConstructor lambdaConstructor, String str, SymbolKey symbolKey) {
        lambdaConstructor.defineProperty(str, constructSymbol(context, scriptable, lambdaConstructor, symbolKey), 7);
    }

    private static Map<String, NativeSymbol> getGlobalMap(Scriptable scriptable) {
        ScriptableObject scriptableObject = (ScriptableObject) ScriptableObject.getTopLevelScope(scriptable);
        Object obj = GLOBAL_TABLE_KEY;
        Map<String, NativeSymbol> map = (Map) scriptableObject.getAssociatedValue(obj);
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        scriptableObject.associateValue(obj, map2);
        return map2;
    }

    private static NativeSymbol getSelf(Scriptable scriptable) {
        return (NativeSymbol) LambdaConstructor.convertThisObject(scriptable, NativeSymbol.class);
    }

    public static void init(Context context, Scriptable scriptable, boolean z) {
        LambdaConstructor lambdaConstructor = new LambdaConstructor(scriptable, CLASS_NAME, 0, 1, new g0(2));
        lambdaConstructor.setPrototypePropertyAttributes(7);
        lambdaConstructor.defineConstructorMethod(scriptable, "for", 1, new y(lambdaConstructor, 2), 2, 3);
        lambdaConstructor.defineConstructorMethod(scriptable, "keyFor", 1, new h0(0), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "toString", 0, new h0(1), 2, 3);
        int i = 2;
        lambdaConstructor.definePrototypeMethod(scriptable, "valueOf", 0, new h0(i), 2, 3);
        SymbolKey symbolKey = SymbolKey.TO_PRIMITIVE;
        lambdaConstructor.definePrototypeMethod(scriptable, symbolKey, 1, new h0(i), 3, 3);
        SymbolKey symbolKey2 = SymbolKey.TO_STRING_TAG;
        lambdaConstructor.definePrototypeProperty(symbolKey2, CLASS_NAME, 3);
        lambdaConstructor.definePrototypeProperty(context, "description", new a(2), 3);
        ScriptableObject.defineProperty(scriptable, CLASS_NAME, lambdaConstructor, 2);
        createStandardSymbol(context, scriptable, lambdaConstructor, "iterator", SymbolKey.ITERATOR);
        createStandardSymbol(context, scriptable, lambdaConstructor, "species", SymbolKey.SPECIES);
        createStandardSymbol(context, scriptable, lambdaConstructor, "toStringTag", symbolKey2);
        createStandardSymbol(context, scriptable, lambdaConstructor, "hasInstance", SymbolKey.HAS_INSTANCE);
        createStandardSymbol(context, scriptable, lambdaConstructor, "isConcatSpreadable", SymbolKey.IS_CONCAT_SPREADABLE);
        createStandardSymbol(context, scriptable, lambdaConstructor, "isRegExp", SymbolKey.IS_REGEXP);
        createStandardSymbol(context, scriptable, lambdaConstructor, "toPrimitive", symbolKey);
        createStandardSymbol(context, scriptable, lambdaConstructor, "match", SymbolKey.MATCH);
        createStandardSymbol(context, scriptable, lambdaConstructor, "matchAll", SymbolKey.MATCH_ALL);
        createStandardSymbol(context, scriptable, lambdaConstructor, "replace", SymbolKey.REPLACE);
        createStandardSymbol(context, scriptable, lambdaConstructor, "search", SymbolKey.SEARCH);
        createStandardSymbol(context, scriptable, lambdaConstructor, "split", SymbolKey.SPLIT);
        createStandardSymbol(context, scriptable, lambdaConstructor, "unscopables", SymbolKey.UNSCOPABLES);
        if (z) {
            lambdaConstructor.sealObject();
        }
    }

    private static boolean isStrictMode() {
        Context currentContext = Context.getCurrentContext();
        return currentContext != null && currentContext.isStrictMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static NativeSymbol js_constructor(Context context, Scriptable scriptable, Object[] objArr) {
        return objArr.length > 1 ? new NativeSymbol((SymbolKey) objArr[1]) : new NativeSymbol(new SymbolKey((objArr.length <= 0 || Undefined.isUndefined(objArr[0])) ? null : ScriptRuntime.toString(objArr[0])));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object js_description(Scriptable scriptable) {
        return getSelf(scriptable).getKey().getDescription();
    }

    private static Object js_for(final Context context, final Scriptable scriptable, Object[] objArr, final LambdaConstructor lambdaConstructor) {
        final String string = objArr.length > 0 ? ScriptRuntime.toString(objArr[0]) : ScriptRuntime.toString(Undefined.instance);
        return getGlobalMap(scriptable).computeIfAbsent(string, new java.util.function.Function() { // from class: org.mozilla.javascript.i0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return NativeSymbol.lambda$js_for$1(context, scriptable, lambdaConstructor, string, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object js_keyFor(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj = objArr.length > 0 ? objArr[0] : Undefined.instance;
        if (!(obj instanceof NativeSymbol)) {
            throw ScriptRuntime.throwCustomError(context, scriptable, "TypeError", "Not a Symbol");
        }
        NativeSymbol nativeSymbol = (NativeSymbol) obj;
        for (Map.Entry<String, NativeSymbol> entry : getGlobalMap(scriptable).entrySet()) {
            if (entry.getValue().key == nativeSymbol.key) {
                return entry.getKey();
            }
        }
        return Undefined.instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String js_toString(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return getSelf(scriptable2).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object js_valueOf(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return getSelf(scriptable2).symbolData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$0(LambdaConstructor lambdaConstructor, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_for(context, scriptable, objArr, lambdaConstructor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ NativeSymbol lambda$js_for$1(Context context, Scriptable scriptable, LambdaConstructor lambdaConstructor, String str, String str2) {
        return constructSymbol(context, scriptable, lambdaConstructor, str);
    }

    public boolean equals(Object obj) {
        return this.key.equals(obj);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return CLASS_NAME;
    }

    public SymbolKey getKey() {
        return this.key;
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public String getTypeOf() {
        return isSymbol() ? TYPE_NAME : super.getTypeOf();
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public boolean isSymbol() {
        return this.symbolData == this;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(String str, Scriptable scriptable, Object obj) {
        if (!isSymbol()) {
            super.put(str, scriptable, obj);
        } else if (isStrictMode()) {
            throw ScriptRuntime.typeErrorById("msg.no.assign.symbol.strict", new Object[0]);
        }
    }

    public String toString() {
        return this.key.toString();
    }

    public NativeSymbol(SymbolKey symbolKey) {
        this.key = symbolKey;
        this.symbolData = this;
    }

    private static NativeSymbol constructSymbol(Context context, Scriptable scriptable, LambdaConstructor lambdaConstructor, String str) {
        return (NativeSymbol) lambdaConstructor.call(context, scriptable, null, new Object[]{str});
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(int i, Scriptable scriptable, Object obj) {
        if (!isSymbol()) {
            super.put(i, scriptable, obj);
        } else if (isStrictMode()) {
            throw ScriptRuntime.typeErrorById("msg.no.assign.symbol.strict", new Object[0]);
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.SymbolScriptable
    public void put(Symbol symbol, Scriptable scriptable, Object obj) {
        if (!isSymbol()) {
            super.put(symbol, scriptable, obj);
        } else if (isStrictMode()) {
            throw ScriptRuntime.typeErrorById("msg.no.assign.symbol.strict", new Object[0]);
        }
    }
}
