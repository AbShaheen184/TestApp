package org.mozilla.javascript.typedarrays;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.LambdaConstructor;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class NativeDataView extends NativeArrayBufferView {
    public static final String CLASS_NAME = "DataView";
    private static final long serialVersionUID = 1427967607557438968L;

    public NativeDataView() {
    }

    private static int determinePos(Object[] objArr) {
        if (!NativeArrayBufferView.isArg(objArr, 0)) {
            return 0;
        }
        double number = ScriptRuntime.toNumber(objArr[0]);
        if (Double.isInfinite(number)) {
            throw ScriptRuntime.rangeError("offset out of range");
        }
        return ScriptRuntime.toInt32(number);
    }

    public static void init(Context context, Scriptable scriptable, boolean z) {
        LambdaConstructor lambdaConstructor = new LambdaConstructor(scriptable, CLASS_NAME, 1, 2, new a(1));
        lambdaConstructor.setPrototypePropertyAttributes(7);
        lambdaConstructor.definePrototypeProperty(context, "buffer", new androidx.media3.exoplayer.audio.f(13), 3);
        lambdaConstructor.definePrototypeProperty(context, "byteLength", new androidx.media3.exoplayer.audio.f(14), 3);
        lambdaConstructor.definePrototypeProperty(context, "byteOffset", new androidx.media3.exoplayer.audio.f(15), 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "getFloat32", 1, new b(2), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "getFloat64", 1, new b(3), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "getInt8", 1, new b(4), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "getInt16", 1, new b(5), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "getInt32", 1, new b(6), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "getUint8", 1, new b(7), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "getUint16", 1, new b(8), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "getUint32", 1, new b(9), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "setFloat32", 2, new b(10), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "setFloat64", 2, new b(11), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "setInt8", 2, new b(12), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "setInt16", 2, new b(13), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "setInt32", 2, new b(14), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "setUint8", 2, new b(15), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "setUint16", 2, new b(16), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "setUint32", 2, new b(1), 2, 3);
        ScriptableObject.defineProperty(scriptable, CLASS_NAME, lambdaConstructor, 2);
        if (z) {
            lambdaConstructor.sealObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static NativeDataView js_constructor(Context context, Scriptable scriptable, Object[] objArr) {
        int length;
        int int32 = 0;
        if (NativeArrayBufferView.isArg(objArr, 0)) {
            Object obj = objArr[0];
            if (obj instanceof NativeArrayBuffer) {
                NativeArrayBuffer nativeArrayBuffer = (NativeArrayBuffer) obj;
                if (NativeArrayBufferView.isArg(objArr, 1)) {
                    double number = ScriptRuntime.toNumber(objArr[1]);
                    if (Double.isInfinite(number)) {
                        throw ScriptRuntime.rangeError("offset out of range");
                    }
                    int32 = ScriptRuntime.toInt32(number);
                }
                if (NativeArrayBufferView.isArg(objArr, 2)) {
                    double number2 = ScriptRuntime.toNumber(objArr[2]);
                    if (Double.isInfinite(number2)) {
                        throw ScriptRuntime.rangeError("offset out of range");
                    }
                    length = ScriptRuntime.toInt32(number2);
                } else {
                    length = nativeArrayBuffer.getLength() - int32;
                }
                if (length < 0) {
                    throw ScriptRuntime.rangeError("length out of range");
                }
                if (int32 < 0 || int32 + length > nativeArrayBuffer.getLength()) {
                    throw ScriptRuntime.rangeError("offset out of range");
                }
                return new NativeDataView(nativeArrayBuffer, int32, length);
            }
        }
        throw ScriptRuntime.constructError("TypeError", "Missing parameters");
    }

    private Object js_getFloat(int i, Object[] objArr) {
        int iDeterminePos = determinePos(objArr);
        rangeCheck(iDeterminePos, i);
        boolean z = NativeArrayBufferView.isArg(objArr, 1) && i > 1 && ScriptRuntime.toBoolean(objArr[1]);
        if (i == 4) {
            return ByteIo.readFloat32(this.arrayBuffer.buffer, this.offset + iDeterminePos, z);
        }
        if (i == 8) {
            return ByteIo.readFloat64(this.arrayBuffer.buffer, this.offset + iDeterminePos, z);
        }
        throw new AssertionError();
    }

    private Object js_getInt(int i, boolean z, Object[] objArr) {
        int iDeterminePos = determinePos(objArr);
        rangeCheck(iDeterminePos, i);
        boolean z2 = NativeArrayBufferView.isArg(objArr, 1) && i > 1 && ScriptRuntime.toBoolean(objArr[1]);
        if (i == 1) {
            NativeArrayBuffer nativeArrayBuffer = this.arrayBuffer;
            return z ? ByteIo.readInt8(nativeArrayBuffer.buffer, this.offset + iDeterminePos) : ByteIo.readUint8(nativeArrayBuffer.buffer, this.offset + iDeterminePos);
        }
        if (i == 2) {
            NativeArrayBuffer nativeArrayBuffer2 = this.arrayBuffer;
            return z ? ByteIo.readInt16(nativeArrayBuffer2.buffer, this.offset + iDeterminePos, z2) : ByteIo.readUint16(nativeArrayBuffer2.buffer, this.offset + iDeterminePos, z2);
        }
        if (i != 4) {
            throw new AssertionError();
        }
        NativeArrayBuffer nativeArrayBuffer3 = this.arrayBuffer;
        return z ? ByteIo.readInt32(nativeArrayBuffer3.buffer, this.offset + iDeterminePos, z2) : ByteIo.readUint32(nativeArrayBuffer3.buffer, this.offset + iDeterminePos, z2);
    }

    private void js_setFloat(int i, Object[] objArr) {
        int iDeterminePos = determinePos(objArr);
        if (iDeterminePos < 0) {
            throw ScriptRuntime.rangeError("offset out of range");
        }
        boolean z = NativeArrayBufferView.isArg(objArr, 2) && i > 1 && ScriptRuntime.toBoolean(objArr[2]);
        double number = objArr.length > 1 ? ScriptRuntime.toNumber(objArr[1]) : Double.NaN;
        if (iDeterminePos + i > this.byteLength) {
            throw ScriptRuntime.rangeError("offset out of range");
        }
        if (i == 4) {
            ByteIo.writeFloat32(this.arrayBuffer.buffer, this.offset + iDeterminePos, number, z);
        } else {
            if (i != 8) {
                throw new AssertionError();
            }
            ByteIo.writeFloat64(this.arrayBuffer.buffer, this.offset + iDeterminePos, number, z);
        }
    }

    private void js_setInt(int i, boolean z, Object[] objArr) {
        int iDeterminePos = determinePos(objArr);
        if (iDeterminePos < 0) {
            throw ScriptRuntime.rangeError("offset out of range");
        }
        boolean z2 = NativeArrayBufferView.isArg(objArr, 2) && i > 1 && ScriptRuntime.toBoolean(objArr[2]);
        Object obj = ScriptRuntime.zeroObj;
        if (objArr.length > 1) {
            obj = objArr[1];
        }
        if (i == 1) {
            if (z) {
                int int8 = Conversions.toInt8(obj);
                if (i + iDeterminePos > this.byteLength) {
                    throw ScriptRuntime.rangeError("offset out of range");
                }
                ByteIo.writeInt8(this.arrayBuffer.buffer, this.offset + iDeterminePos, int8);
                return;
            }
            int uint8 = Conversions.toUint8(obj);
            if (i + iDeterminePos > this.byteLength) {
                throw ScriptRuntime.rangeError("offset out of range");
            }
            ByteIo.writeUint8(this.arrayBuffer.buffer, this.offset + iDeterminePos, uint8);
            return;
        }
        if (i == 2) {
            if (z) {
                int int16 = Conversions.toInt16(obj);
                if (i + iDeterminePos > this.byteLength) {
                    throw ScriptRuntime.rangeError("offset out of range");
                }
                ByteIo.writeInt16(this.arrayBuffer.buffer, this.offset + iDeterminePos, int16, z2);
                return;
            }
            int uint16 = Conversions.toUint16(obj);
            if (i + iDeterminePos > this.byteLength) {
                throw ScriptRuntime.rangeError("offset out of range");
            }
            ByteIo.writeUint16(this.arrayBuffer.buffer, this.offset + iDeterminePos, uint16, z2);
            return;
        }
        if (i != 4) {
            throw new AssertionError();
        }
        if (z) {
            int int32 = Conversions.toInt32(obj);
            if (i + iDeterminePos > this.byteLength) {
                throw ScriptRuntime.rangeError("offset out of range");
            }
            ByteIo.writeInt32(this.arrayBuffer.buffer, this.offset + iDeterminePos, int32, z2);
            return;
        }
        long uint32 = Conversions.toUint32(obj);
        if (i + iDeterminePos > this.byteLength) {
            throw ScriptRuntime.rangeError("offset out of range");
        }
        ByteIo.writeUint32(this.arrayBuffer.buffer, this.offset + iDeterminePos, uint32, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$0(Scriptable scriptable) {
        return realThis(scriptable).arrayBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$1(Scriptable scriptable) {
        return Integer.valueOf(realThis(scriptable).byteLength);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$10(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return realThis(scriptable2).js_getInt(4, false, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$11(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        realThis(scriptable2).js_setFloat(4, objArr);
        return Undefined.instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$12(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        realThis(scriptable2).js_setFloat(8, objArr);
        return Undefined.instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$13(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        realThis(scriptable2).js_setInt(1, true, objArr);
        return Undefined.instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$14(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        realThis(scriptable2).js_setInt(2, true, objArr);
        return Undefined.instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$15(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        realThis(scriptable2).js_setInt(4, true, objArr);
        return Undefined.instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$16(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        realThis(scriptable2).js_setInt(1, false, objArr);
        return Undefined.instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$17(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        realThis(scriptable2).js_setInt(2, false, objArr);
        return Undefined.instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$18(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        realThis(scriptable2).js_setInt(4, false, objArr);
        return Undefined.instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$2(Scriptable scriptable) {
        return Integer.valueOf(realThis(scriptable).offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$3(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return realThis(scriptable2).js_getFloat(4, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$4(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return realThis(scriptable2).js_getFloat(8, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$5(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return realThis(scriptable2).js_getInt(1, true, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$6(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return realThis(scriptable2).js_getInt(2, true, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$7(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return realThis(scriptable2).js_getInt(4, true, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$8(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return realThis(scriptable2).js_getInt(1, false, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$9(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return realThis(scriptable2).js_getInt(2, false, objArr);
    }

    private void rangeCheck(int i, int i2) {
        if (i < 0 || i + i2 > this.byteLength) {
            throw ScriptRuntime.rangeError("offset out of range");
        }
    }

    private static NativeDataView realThis(Scriptable scriptable) {
        return (NativeDataView) LambdaConstructor.convertThisObject(scriptable, NativeDataView.class);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return CLASS_NAME;
    }

    public NativeDataView(NativeArrayBuffer nativeArrayBuffer, int i, int i2) {
        super(nativeArrayBuffer, i, i2);
    }
}
