package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class NativeMath extends ScriptableObject {
    private static final Double Double32 = Double.valueOf(32.0d);
    private static final double LOG2E = 1.4426950408889634d;
    private static final String MATH_TAG = "Math";
    private static final long serialVersionUID = -8838847185801131569L;

    private NativeMath() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object abs(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (number == 0.0d) {
            number = 0.0d;
        } else if (number < 0.0d) {
            number = -number;
        }
        return ScriptRuntime.wrapNumber(number);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object acos(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        return ScriptRuntime.wrapNumber((Double.isNaN(number) || -1.0d > number || number > 1.0d) ? Double.NaN : Math.acos(number));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object acosh(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        return !Double.isNaN(number) ? Double.valueOf(Math.log(Math.sqrt((number * number) - 1.0d) + number)) : ScriptRuntime.NaNobj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object asin(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        return ScriptRuntime.wrapNumber((Double.isNaN(number) || -1.0d > number || number > 1.0d) ? Double.NaN : Math.asin(number));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object asinh(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (Double.isInfinite(number)) {
            return Double.valueOf(number);
        }
        if (Double.isNaN(number)) {
            return ScriptRuntime.NaNobj;
        }
        if (number == 0.0d) {
            return 1.0d / number > 0.0d ? ScriptRuntime.zeroObj : ScriptRuntime.negativeZeroObj;
        }
        return Double.valueOf(Math.log(Math.sqrt((number * number) + 1.0d) + number));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object atan(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.atan(ScriptRuntime.toNumber(objArr, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object atan2(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.atan2(ScriptRuntime.toNumber(objArr, 0), ScriptRuntime.toNumber(objArr, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object atanh(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (Double.isNaN(number) || -1.0d > number || number > 1.0d) {
            return ScriptRuntime.NaNobj;
        }
        if (number == 0.0d) {
            return 1.0d / number > 0.0d ? ScriptRuntime.zeroObj : ScriptRuntime.negativeZeroObj;
        }
        return Double.valueOf(Math.log((number + 1.0d) / (1.0d - number)) * 0.5d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object cbrt(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.cbrt(ScriptRuntime.toNumber(objArr, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object ceil(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.ceil(ScriptRuntime.toNumber(objArr, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object clz32(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        int i = 0;
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (number == 0.0d || Double.isNaN(number) || Double.isInfinite(number)) {
            return Double32;
        }
        long uint32 = ScriptRuntime.toUint32(number);
        if (uint32 == 0) {
            return Double32;
        }
        if (((-65536) & uint32) != 0) {
            i = 16;
            uint32 >>>= 16;
        }
        if ((65280 & uint32) != 0) {
            i += 8;
            uint32 >>>= 8;
        }
        if ((240 & uint32) != 0) {
            i += 4;
            uint32 >>>= 4;
        }
        if ((12 & uint32) != 0) {
            i += 2;
            uint32 >>>= 2;
        }
        if ((2 & uint32) != 0) {
            i++;
            uint32 >>>= 1;
        }
        if ((uint32 & 1) != 0) {
            i++;
        }
        return Double.valueOf(32 - i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object cos(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        return ScriptRuntime.wrapNumber(Double.isInfinite(number) ? Double.NaN : Math.cos(number));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object cosh(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.cosh(ScriptRuntime.toNumber(objArr, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object exp(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (number != Double.POSITIVE_INFINITY) {
            number = number == Double.NEGATIVE_INFINITY ? 0.0d : Math.exp(number);
        }
        return ScriptRuntime.wrapNumber(number);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object expm1(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.expm1(ScriptRuntime.toNumber(objArr, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object floor(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.floor(ScriptRuntime.toNumber(objArr, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object fround(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber((float) ScriptRuntime.toNumber(objArr, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object hypot(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double d = 0.0d;
        if (objArr == null) {
            return Double.valueOf(0.0d);
        }
        boolean z = false;
        boolean z2 = false;
        for (Object obj : objArr) {
            double number = ScriptRuntime.toNumber(obj);
            if (Double.isNaN(number)) {
                z2 = true;
            } else if (Double.isInfinite(number)) {
                z = true;
            } else {
                d = (number * number) + d;
            }
        }
        if (z) {
            return Double.valueOf(Double.POSITIVE_INFINITY);
        }
        return z2 ? Double.valueOf(Double.NaN) : Double.valueOf(Math.sqrt(d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object imul(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        return ScriptRuntime.wrapNumber(ScriptRuntime.toInt32(objArr, 1) * ScriptRuntime.toInt32(objArr, 0));
    }

    public static void init(Scriptable scriptable, boolean z) {
        NativeMath nativeMath = new NativeMath();
        nativeMath.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        nativeMath.setParentScope(scriptable);
        nativeMath.defineProperty("toSource", MATH_TAG, 7);
        final int i = 0;
        nativeMath.defineProperty(scriptable, "abs", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i2 = 2;
        nativeMath.defineProperty(scriptable, "acos", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i2) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i3 = 14;
        nativeMath.defineProperty(scriptable, "acosh", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i3) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i4 = 20;
        nativeMath.defineProperty(scriptable, "asin", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i4) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i5 = 21;
        nativeMath.defineProperty(scriptable, "asinh", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i5) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i6 = 23;
        nativeMath.defineProperty(scriptable, "atan", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i6) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i7 = 24;
        nativeMath.defineProperty(scriptable, "atanh", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i7) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i8 = 25;
        nativeMath.defineProperty(scriptable, "atan2", 2, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i8) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i9 = 26;
        nativeMath.defineProperty(scriptable, "cbrt", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i9) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i10 = 27;
        nativeMath.defineProperty(scriptable, "ceil", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i10) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i11 = 11;
        nativeMath.defineProperty(scriptable, "clz32", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i11) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i12 = 22;
        nativeMath.defineProperty(scriptable, "cos", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i12) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i13 = 28;
        nativeMath.defineProperty(scriptable, "cosh", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i13) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i14 = 29;
        nativeMath.defineProperty(scriptable, "exp", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i14) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        nativeMath.defineProperty(scriptable, "expm1", 1, new v(0), 2, 3);
        nativeMath.defineProperty(scriptable, "floor", 1, new v(1), 2, 3);
        nativeMath.defineProperty(scriptable, "fround", 1, new v(2), 2, 3);
        nativeMath.defineProperty(scriptable, "hypot", 2, new v(3), 2, 3);
        nativeMath.defineProperty(scriptable, "imul", 2, new v(4), 2, 3);
        final int i15 = 1;
        nativeMath.defineProperty(scriptable, "log", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i15) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i16 = 3;
        nativeMath.defineProperty(scriptable, "log1p", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i16) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i17 = 4;
        nativeMath.defineProperty(scriptable, "log10", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i17) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i18 = 5;
        nativeMath.defineProperty(scriptable, "log2", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i18) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i19 = 6;
        nativeMath.defineProperty(scriptable, "max", 2, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i19) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i20 = 7;
        nativeMath.defineProperty(scriptable, "min", 2, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i20) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i21 = 8;
        nativeMath.defineProperty(scriptable, "pow", 2, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i21) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i22 = 9;
        nativeMath.defineProperty(scriptable, "random", 0, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i22) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i23 = 10;
        nativeMath.defineProperty(scriptable, "round", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i23) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i24 = 12;
        nativeMath.defineProperty(scriptable, "sign", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i24) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i25 = 13;
        nativeMath.defineProperty(scriptable, "sin", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i25) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i26 = 15;
        nativeMath.defineProperty(scriptable, "sinh", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i26) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i27 = 16;
        nativeMath.defineProperty(scriptable, "sqrt", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i27) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i28 = 17;
        nativeMath.defineProperty(scriptable, "tan", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i28) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i29 = 18;
        nativeMath.defineProperty(scriptable, "tanh", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i29) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i30 = 19;
        nativeMath.defineProperty(scriptable, "trunc", 1, new Callable() { // from class: org.mozilla.javascript.u
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                switch (i30) {
                    case 0:
                        return NativeMath.abs(context, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeMath.log(context, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeMath.acos(context, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeMath.log1p(context, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeMath.log10(context, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeMath.log2(context, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeMath.max(context, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeMath.min(context, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeMath.pow(context, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeMath.random(context, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeMath.round(context, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeMath.clz32(context, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeMath.sign(context, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeMath.sin(context, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeMath.acosh(context, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeMath.sinh(context, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeMath.sqrt(context, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeMath.tan(context, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeMath.tanh(context, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeMath.trunc(context, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeMath.asin(context, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeMath.asinh(context, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeMath.cos(context, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeMath.atan(context, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeMath.atanh(context, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeMath.atan2(context, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeMath.cbrt(context, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeMath.ceil(context, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeMath.cosh(context, scriptable2, scriptable3, objArr);
                    default:
                        return NativeMath.exp(context, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        nativeMath.defineProperty("E", Double.valueOf(2.718281828459045d), 7);
        nativeMath.defineProperty("PI", Double.valueOf(3.141592653589793d), 7);
        nativeMath.defineProperty("LN10", Double.valueOf(2.302585092994046d), 7);
        nativeMath.defineProperty("LN2", Double.valueOf(0.6931471805599453d), 7);
        nativeMath.defineProperty("LOG2E", Double.valueOf(LOG2E), 7);
        nativeMath.defineProperty("LOG10E", Double.valueOf(0.4342944819032518d), 7);
        nativeMath.defineProperty("SQRT1_2", Double.valueOf(0.7071067811865476d), 7);
        nativeMath.defineProperty("SQRT2", Double.valueOf(1.4142135623730951d), 7);
        nativeMath.defineProperty(SymbolKey.TO_STRING_TAG, MATH_TAG, 3);
        ScriptableObject.defineProperty(scriptable, MATH_TAG, nativeMath, 2);
        if (z) {
            nativeMath.sealObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object log(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        return ScriptRuntime.wrapNumber(number < 0.0d ? Double.NaN : Math.log(number));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object log10(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.log10(ScriptRuntime.toNumber(objArr, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object log1p(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.log1p(ScriptRuntime.toNumber(objArr, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object log2(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        return ScriptRuntime.wrapNumber(number < 0.0d ? Double.NaN : Math.log(number) * LOG2E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object max(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double dMax = Double.NEGATIVE_INFINITY;
        for (int i = 0; i != objArr.length; i++) {
            dMax = Math.max(dMax, ScriptRuntime.toNumber(objArr[i]));
        }
        return ScriptRuntime.wrapNumber(dMax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object min(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double dMin = Double.POSITIVE_INFINITY;
        for (int i = 0; i != objArr.length; i++) {
            dMin = Math.min(dMin, ScriptRuntime.toNumber(objArr[i]));
        }
        return ScriptRuntime.wrapNumber(dMin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[PHI: r5
  0x006f: PHI (r5v1 double) = (r5v0 double), (r5v0 double), (r5v0 double), (r5v0 double), (r5v0 double), (r5v0 double), (r5v2 double), (r5v0 double) binds: [B:64:0x00a5, B:54:0x008e, B:43:0x007a, B:45:0x007e, B:37:0x006d, B:22:0x0048, B:24:0x004b, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a8  */
    public static Object pow(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        double number2 = ScriptRuntime.toNumber(objArr, 1);
        if (!Double.isNaN(number2)) {
            double d = 0.0d;
            if (number2 == 0.0d) {
                number2 = 1.0d;
            } else {
                double d2 = -0.0d;
                if (number == 0.0d) {
                    if (1.0d / number <= 0.0d) {
                        long j = (long) number2;
                        if (j == number2 && (j & 1) != 0) {
                            if (number2 <= 0.0d) {
                                d2 = Double.NEGATIVE_INFINITY;
                            }
                        } else if (number2 <= 0.0d) {
                            d = Double.POSITIVE_INFINITY;
                        }
                    } else if (number2 <= 0.0d) {
                        number2 = Double.POSITIVE_INFINITY;
                    }
                    number2 = d;
                } else {
                    double dPow = Math.pow(number, number2);
                    if (!Double.isNaN(dPow)) {
                        number2 = dPow;
                    } else if (number2 == Double.POSITIVE_INFINITY) {
                        if (number < -1.0d || 1.0d < number) {
                            number2 = Double.POSITIVE_INFINITY;
                        } else if (-1.0d >= number || number >= 1.0d) {
                            number2 = dPow;
                        } else {
                            number2 = d;
                        }
                    } else if (number2 == Double.NEGATIVE_INFINITY) {
                        if (number < -1.0d || 1.0d < number) {
                            number2 = d;
                        } else if (-1.0d >= number || number >= 1.0d) {
                            number2 = dPow;
                        } else {
                            number2 = Double.POSITIVE_INFINITY;
                        }
                    } else if (number == Double.POSITIVE_INFINITY) {
                        if (number2 > 0.0d) {
                            number2 = Double.POSITIVE_INFINITY;
                        } else {
                            number2 = d;
                        }
                    } else if (number == Double.NEGATIVE_INFINITY) {
                        long j2 = (long) number2;
                        if (j2 == number2 && (j2 & 1) != 0) {
                            number2 = number2 > 0.0d ? Double.NEGATIVE_INFINITY : d2;
                        } else if (number2 > 0.0d) {
                            number2 = Double.POSITIVE_INFINITY;
                        } else {
                            number2 = d;
                        }
                    } else {
                        number2 = dPow;
                    }
                }
            }
        }
        return ScriptRuntime.wrapNumber(number2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object random(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.random());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object round(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (!Double.isNaN(number) && !Double.isInfinite(number)) {
            long jRound = Math.round(number);
            if (jRound != 0) {
                number = jRound;
            } else if (number < 0.0d) {
                number = ScriptRuntime.negativeZero;
            } else if (number != 0.0d) {
                number = 0.0d;
            }
        }
        return ScriptRuntime.wrapNumber(number);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object sign(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        if (Double.isNaN(number)) {
            return ScriptRuntime.NaNobj;
        }
        if (number == 0.0d) {
            return 1.0d / number > 0.0d ? ScriptRuntime.zeroObj : ScriptRuntime.negativeZeroObj;
        }
        return Double.valueOf(Math.signum(number));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object sin(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        return ScriptRuntime.wrapNumber(Double.isInfinite(number) ? Double.NaN : Math.sin(number));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object sinh(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.sinh(ScriptRuntime.toNumber(objArr, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object sqrt(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.sqrt(ScriptRuntime.toNumber(objArr, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object tan(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.tan(ScriptRuntime.toNumber(objArr, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object tanh(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ScriptRuntime.wrapNumber(Math.tanh(ScriptRuntime.toNumber(objArr, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object trunc(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        double number = ScriptRuntime.toNumber(objArr, 0);
        return ScriptRuntime.wrapNumber(number < 0.0d ? Math.ceil(number) : Math.floor(number));
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return MATH_TAG;
    }
}
