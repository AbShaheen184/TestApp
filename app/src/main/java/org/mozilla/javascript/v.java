package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Callable {
    public final /* synthetic */ int e;

    public /* synthetic */ v(int i) {
        this.e = i;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        switch (this.e) {
            case 0:
                return NativeMath.expm1(context, scriptable, scriptable2, objArr);
            case 1:
                return NativeMath.floor(context, scriptable, scriptable2, objArr);
            case 2:
                return NativeMath.fround(context, scriptable, scriptable2, objArr);
            case 3:
                return NativeMath.hypot(context, scriptable, scriptable2, objArr);
            case 4:
                return NativeMath.imul(context, scriptable, scriptable2, objArr);
            case 5:
                return NativeProxy.revocable(context, scriptable, scriptable2, objArr);
            case 6:
                return NativeReflect.apply(context, scriptable, scriptable2, objArr);
            case 7:
                return NativeReflect.has(context, scriptable, scriptable2, objArr);
            case 8:
                return NativeReflect.isExtensible(context, scriptable, scriptable2, objArr);
            case 9:
                return NativeReflect.ownKeys(context, scriptable, scriptable2, objArr);
            case 10:
                return NativeReflect.preventExtensions(context, scriptable, scriptable2, objArr);
            case 11:
                return NativeReflect.set(context, scriptable, scriptable2, objArr);
            case 12:
                return NativeReflect.setPrototypeOf(context, scriptable, scriptable2, objArr);
            case 13:
                return NativeReflect.construct(context, scriptable, scriptable2, objArr);
            case 14:
                return NativeReflect.defineProperty(context, scriptable, scriptable2, objArr);
            case 15:
                return NativeReflect.deleteProperty(context, scriptable, scriptable2, objArr);
            case 16:
                return NativeReflect.get(context, scriptable, scriptable2, objArr);
            case 17:
                return NativeReflect.getOwnPropertyDescriptor(context, scriptable, scriptable2, objArr);
            case 18:
                return NativeReflect.getPrototypeOf(context, scriptable, scriptable2, objArr);
            case 19:
                return NativeJSON.parse(context, scriptable, scriptable2, objArr);
            case 20:
                return NativeJSON.stringify(context, scriptable, scriptable2, objArr);
            case 21:
                return NativeJavaMap.lambda$static$0(context, scriptable, scriptable2, objArr);
            case 22:
                return NativeJavaObject.lambda$static$0(context, scriptable, scriptable2, objArr);
            case 23:
                return NativePromise.doCatch(context, scriptable, scriptable2, objArr);
            case 24:
                return NativePromise.resolve(context, scriptable, scriptable2, objArr);
            case 25:
                return NativePromise.reject(context, scriptable, scriptable2, objArr);
            case 26:
                return NativePromise.all(context, scriptable, scriptable2, objArr);
            case 27:
                return NativePromise.allSettled(context, scriptable, scriptable2, objArr);
            case 28:
                return NativePromise.race(context, scriptable, scriptable2, objArr);
            default:
                return NativePromise.any(context, scriptable, scriptable2, objArr);
        }
    }
}
