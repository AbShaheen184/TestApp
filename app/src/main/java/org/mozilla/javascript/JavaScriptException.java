package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class JavaScriptException extends RhinoException {
    private static final long serialVersionUID = -7666130513694669293L;
    private String details;
    private Object value;

    public JavaScriptException(Object obj, String str, int i) {
        recordErrorOrigin(str, i, null, 0);
        this.value = obj;
        if (obj instanceof NativeError) {
            NativeError nativeError = (NativeError) obj;
            Object obj2 = nativeError.get("javaException", nativeError);
            if (Context.getContext().hasFeature(10)) {
                if (!nativeError.has("fileName", nativeError)) {
                    nativeError.put("fileName", nativeError, str);
                }
                if (!nativeError.has("lineNumber", nativeError)) {
                    nativeError.put("lineNumber", nativeError, Integer.valueOf(i));
                }
                nativeError.setStackProvider(this);
            }
            obj = obj2;
        }
        obj = obj instanceof Wrapper ? ((Wrapper) obj).unwrap() : obj;
        if (obj instanceof Throwable) {
            initCause((Throwable) obj);
        }
        this.details = getDetails();
    }

    @Override // org.mozilla.javascript.RhinoException
    public String details() {
        return this.details;
    }

    public String getDetails() {
        Object obj = this.value;
        if (obj == null) {
            return "null";
        }
        if (obj instanceof NativeError) {
            return obj.toString();
        }
        try {
            return ScriptRuntime.toString(obj);
        } catch (RuntimeException unused) {
            Object obj2 = this.value;
            return obj2 instanceof Scriptable ? ScriptRuntime.defaultObjectToString((Scriptable) obj2) : obj2.toString();
        }
    }

    @Deprecated
    public int getLineNumber() {
        return lineNumber();
    }

    @Deprecated
    public String getSourceName() {
        return sourceName();
    }

    public Object getValue() {
        return this.value;
    }

    @Deprecated
    public JavaScriptException(Object obj) {
        this(obj, "", 0);
    }
}
