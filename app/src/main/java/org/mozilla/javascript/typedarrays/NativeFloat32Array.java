package org.mozilla.javascript.typedarrays;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.LambdaConstructor;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ScriptRuntimeES6;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class NativeFloat32Array extends NativeTypedArrayView<Float> {
    private static final int BYTES_PER_ELEMENT = 4;
    private static final String CLASS_NAME = "Float32Array";
    private static final long serialVersionUID = -8963461831950499340L;

    public NativeFloat32Array(int i) {
        this(new NativeArrayBuffer(((double) i) * 4.0d), 0, i);
    }

    public static void init(Context context, Scriptable scriptable, boolean z) {
        LambdaConstructor lambdaConstructor = new LambdaConstructor(scriptable, CLASS_NAME, 3, 2, new a(2));
        lambdaConstructor.setPrototypePropertyAttributes(7);
        NativeTypedArrayView.init(context, scriptable, lambdaConstructor, new net.luminis.tls.engine.impl.c(28));
        lambdaConstructor.defineProperty("BYTES_PER_ELEMENT", (Object) 4, 7);
        lambdaConstructor.definePrototypeProperty("BYTES_PER_ELEMENT", (Object) 4, 7);
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, lambdaConstructor);
        ScriptableObject.defineProperty(scriptable, CLASS_NAME, lambdaConstructor, 2);
        if (z) {
            lambdaConstructor.sealObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Scriptable lambda$init$0(Context context, Scriptable scriptable, Object[] objArr) {
        return NativeTypedArrayView.js_constructor(context, scriptable, objArr, new net.luminis.tls.engine.impl.c(27), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static NativeFloat32Array realThis(Scriptable scriptable) {
        return (NativeFloat32Array) LambdaConstructor.convertThisObject(scriptable, NativeFloat32Array.class);
    }

    @Override // java.util.List
    public Float get(int i) {
        if (checkIndex(i)) {
            throw new IndexOutOfBoundsException();
        }
        return (Float) js_get(i);
    }

    @Override // org.mozilla.javascript.typedarrays.NativeTypedArrayView
    public int getBytesPerElement() {
        return 4;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return CLASS_NAME;
    }

    @Override // org.mozilla.javascript.typedarrays.NativeTypedArrayView
    public Object js_get(int i) {
        return checkIndex(i) ? Undefined.instance : ByteIo.readFloat32(this.arrayBuffer.buffer, (i * 4) + this.offset, NativeArrayBufferView.useLittleEndian());
    }

    @Override // org.mozilla.javascript.typedarrays.NativeTypedArrayView
    public Object js_set(int i, Object obj) {
        if (checkIndex(i)) {
            return Undefined.instance;
        }
        ByteIo.writeFloat32(this.arrayBuffer.buffer, (i * 4) + this.offset, ScriptRuntime.toNumber(obj), NativeArrayBufferView.useLittleEndian());
        return null;
    }

    @Override // java.util.List
    public Float set(int i, Float f) {
        if (checkIndex(i)) {
            throw new IndexOutOfBoundsException();
        }
        return (Float) js_set(i, f);
    }

    public NativeFloat32Array(NativeArrayBuffer nativeArrayBuffer, int i, int i2) {
        super(nativeArrayBuffer, i, i2, i2 * 4);
    }

    public NativeFloat32Array() {
    }
}
