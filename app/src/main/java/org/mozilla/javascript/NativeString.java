package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class NativeString extends IdScriptableObject {
    private static final int ConstructorId_charAt = -5;
    private static final int ConstructorId_charCodeAt = -6;
    private static final int ConstructorId_concat = -14;
    private static final int ConstructorId_equalsIgnoreCase = -30;
    private static final int ConstructorId_fromCharCode = -1;
    private static final int ConstructorId_fromCodePoint = -2;
    private static final int ConstructorId_indexOf = -7;
    private static final int ConstructorId_lastIndexOf = -8;
    private static final int ConstructorId_localeCompare = -35;
    private static final int ConstructorId_match = -31;
    private static final int ConstructorId_raw = -3;
    private static final int ConstructorId_replace = -33;
    private static final int ConstructorId_replaceAll = -34;
    private static final int ConstructorId_search = -32;
    private static final int ConstructorId_slice = -15;
    private static final int ConstructorId_split = -9;
    private static final int ConstructorId_substr = -13;
    private static final int ConstructorId_substring = -10;
    private static final int ConstructorId_toLocaleLowerCase = -36;
    private static final int ConstructorId_toLowerCase = -11;
    private static final int ConstructorId_toUpperCase = -12;
    private static final int Id_anchor = 28;
    private static final int Id_at = 52;
    private static final int Id_big = 21;
    private static final int Id_blink = 22;
    private static final int Id_bold = 16;
    private static final int Id_charAt = 5;
    private static final int Id_charCodeAt = 6;
    private static final int Id_codePointAt = 46;
    private static final int Id_concat = 14;
    private static final int Id_constructor = 1;
    private static final int Id_endsWith = 43;
    private static final int Id_equals = 29;
    private static final int Id_equalsIgnoreCase = 30;
    private static final int Id_fixed = 18;
    private static final int Id_fontcolor = 26;
    private static final int Id_fontsize = 25;
    private static final int Id_includes = 41;
    private static final int Id_indexOf = 7;
    private static final int Id_isWellFormed = 53;
    private static final int Id_italics = 17;
    private static final int Id_lastIndexOf = 8;
    private static final int Id_length = 1;
    private static final int Id_link = 27;
    private static final int Id_localeCompare = 35;
    private static final int Id_match = 31;
    private static final int Id_matchAll = 55;
    private static final int Id_normalize = 44;
    private static final int Id_padEnd = 48;
    private static final int Id_padStart = 47;
    private static final int Id_repeat = 45;
    private static final int Id_replace = 33;
    private static final int Id_replaceAll = 34;
    private static final int Id_search = 32;
    private static final int Id_slice = 15;
    private static final int Id_small = 20;
    private static final int Id_split = 9;
    private static final int Id_startsWith = 42;
    private static final int Id_strike = 19;
    private static final int Id_sub = 24;
    private static final int Id_substr = 13;
    private static final int Id_substring = 10;
    private static final int Id_sup = 23;
    private static final int Id_toLocaleLowerCase = 36;
    private static final int Id_toLocaleUpperCase = 37;
    private static final int Id_toLowerCase = 11;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    private static final int Id_toUpperCase = 12;
    private static final int Id_toWellFormed = 54;
    private static final int Id_trim = 38;
    private static final int Id_trimEnd = 51;
    private static final int Id_trimLeft = 39;
    private static final int Id_trimRight = 40;
    private static final int Id_trimStart = 50;
    private static final int Id_valueOf = 4;
    private static final int MAX_INSTANCE_ID = 1;
    private static final int MAX_PROTOTYPE_ID = 55;
    private static final Object STRING_TAG = "String";
    private static final int SymbolId_iterator = 49;
    private static final long serialVersionUID = 920268368584188687L;
    private CharSequence string;

    public NativeString(CharSequence charSequence) {
        this.string = charSequence;
    }

    private ScriptableObject defaultIndexPropertyDescriptor(Object obj) {
        Scriptable parentScope = getParentScope();
        if (parentScope == null) {
            parentScope = this;
        }
        NativeObject nativeObject = new NativeObject();
        ScriptRuntime.setBuiltinProtoAndParent(nativeObject, parentScope, TopLevel.Builtins.Object);
        nativeObject.defineProperty(ES6Iterator.VALUE_PROPERTY, obj, 0);
        Boolean bool = Boolean.FALSE;
        nativeObject.defineProperty("writable", bool, 0);
        nativeObject.defineProperty("enumerable", Boolean.TRUE, 0);
        nativeObject.defineProperty("configurable", bool, 0);
        return nativeObject;
    }

    public static void init(Scriptable scriptable, boolean z) {
        new NativeString("").exportAsJSClass(55, scriptable, z);
    }

    private static String js_concat(String str, Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return str;
        }
        if (length == 1) {
            return str.concat(ScriptRuntime.toString(objArr[0]));
        }
        int length2 = str.length();
        String[] strArr = new String[length];
        for (int i = 0; i != length; i++) {
            String string = ScriptRuntime.toString(objArr[i]);
            strArr[i] = string;
            length2 += string.length();
        }
        StringBuilder sb = new StringBuilder(length2);
        sb.append(str);
        for (int i2 = 0; i2 != length; i2++) {
            sb.append(strArr[i2]);
        }
        return sb.toString();
    }

    private static int js_indexOf(int i, String str, Object[] objArr) {
        int length;
        String string = ScriptRuntime.toString(objArr, 0);
        double integer = ScriptRuntime.toInteger(objArr, 1);
        if (i != 42 && i != 43 && string.length() == 0) {
            return integer > ((double) str.length()) ? str.length() : (int) integer;
        }
        if (i != 42 && i != 43 && integer > str.length()) {
            return -1;
        }
        if (integer < 0.0d) {
            integer = 0.0d;
        } else {
            if (integer > str.length()) {
                length = str.length();
            } else if (i == 43 && (Double.isNaN(integer) || integer > str.length())) {
                length = str.length();
            }
            integer = length;
        }
        if (43 != i) {
            if (i == 42) {
                return str.startsWith(string, (int) integer) ? 0 : -1;
            }
            return str.indexOf(string, (int) integer);
        }
        if (objArr.length == 0 || objArr.length == 1 || (objArr.length == 2 && objArr[1] == Undefined.instance)) {
            integer = str.length();
        }
        return str.substring(0, (int) integer).endsWith(string) ? 0 : -1;
    }

    private static int js_lastIndexOf(String str, Object[] objArr) {
        String string = ScriptRuntime.toString(objArr, 0);
        double number = ScriptRuntime.toNumber(objArr, 1);
        if (Double.isNaN(number) || number > str.length()) {
            number = str.length();
        } else if (number < 0.0d) {
            number = 0.0d;
        }
        return str.lastIndexOf(string, (int) number);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v4 java.lang.String, still in use, count: 2, list:
          (r7v4 java.lang.String) from 0x002a: INVOKE (r7v4 java.lang.String) VIRTUAL call: java.lang.String.length():int A[MD:():int (c), WRAPPED] (LINE:43)
          (r7v4 java.lang.String) from 0x0033: PHI (r7 I:??) = (r7v4 java.lang.String) binds: [B:10:0x002e] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:133)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private static java.lang.String js_pad(org.mozilla.javascript.Context r4, org.mozilla.javascript.Scriptable r5, org.mozilla.javascript.IdFunctionObject r6, java.lang.Object[] r7, boolean r8) {
        /*
            java.lang.Object r4 = org.mozilla.javascript.ScriptRuntimeES6.requireObjectCoercible(r4, r5, r6)
            java.lang.String r4 = org.mozilla.javascript.ScriptRuntime.toString(r4)
            r5 = 0
            long r0 = org.mozilla.javascript.ScriptRuntime.toLength(r7, r5)
            int r6 = r4.length()
            long r2 = (long) r6
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L17
            goto L30
        L17:
            int r6 = r7.length
            r2 = 2
            if (r6 < r2) goto L31
            r6 = 1
            r2 = r7[r6]
            boolean r2 = org.mozilla.javascript.Undefined.isUndefined(r2)
            if (r2 != 0) goto L31
            r7 = r7[r6]
            java.lang.String r7 = org.mozilla.javascript.ScriptRuntime.toString(r7)
            int r2 = r7.length()
            if (r2 >= r6) goto L33
        L30:
            return r4
        L31:
            java.lang.String r7 = " "
        L33:
            int r6 = r4.length()
            long r2 = (long) r6
            long r0 = r0 - r2
            int r6 = (int) r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L3f:
            r0.append(r7)
            int r1 = r0.length()
            if (r1 < r6) goto L3f
            r0.setLength(r6)
            if (r8 == 0) goto L55
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L55:
            java.lang.StringBuilder r4 = r0.insert(r5, r4)
            java.lang.String r4 = r4.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeString.js_pad(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.IdFunctionObject, java.lang.Object[], boolean):java.lang.String");
    }

    private static CharSequence js_raw(Context context, Scriptable scriptable, Object[] objArr) {
        int i = 0;
        Scriptable object = ScriptRuntime.toObject(context, scriptable, ScriptRuntime.getObjectProp(ScriptRuntime.toObject(context, scriptable, objArr.length > 0 ? objArr[0] : Undefined.instance), "raw", context));
        long lengthProperty = NativeArray.getLengthProperty(context, object);
        if (lengthProperty > 2147483647L) {
            throw ScriptRuntime.rangeError("raw.length > 2147483647");
        }
        int i2 = (int) lengthProperty;
        if (i2 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(ScriptRuntime.toString(ScriptRuntime.getObjectIndex(object, i, context)));
            i++;
            if (i == i2) {
                return sb;
            }
            if (objArr.length > i) {
                sb.append(ScriptRuntime.toString(objArr[i]));
            }
        }
    }

    private static String js_repeat(Context context, Scriptable scriptable, IdFunctionObject idFunctionObject, Object[] objArr) {
        String string = ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable, idFunctionObject));
        double integer = ScriptRuntime.toInteger(objArr, 0);
        if (integer < 0.0d || integer == Double.POSITIVE_INFINITY) {
            throw ScriptRuntime.rangeError("Invalid count value");
        }
        if (integer == 0.0d || string.length() == 0) {
            return "";
        }
        long length = ((long) string.length()) * ((long) integer);
        if (integer > 2.147483647E9d || length > 2147483647L) {
            throw ScriptRuntime.rangeError("Invalid size or count value");
        }
        StringBuilder sb = new StringBuilder((int) length);
        sb.append(string);
        int i = (int) integer;
        int i2 = 1;
        while (i2 <= i / 2) {
            sb.append((CharSequence) sb);
            i2 *= 2;
        }
        if (i2 < i) {
            sb.append(sb.substring(0, (i - i2) * string.length()));
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003f A[PHI: r6
  0x003f: PHI (r6v4 double) = (r6v3 double), (r6v5 double) binds: [B:26:0x0044, B:22:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    private static CharSequence js_slice(CharSequence charSequence, Object[] objArr) {
        Object obj;
        double d = 0.0d;
        double integer = objArr.length < 1 ? 0.0d : ScriptRuntime.toInteger(objArr[0]);
        int length = charSequence.length();
        if (integer < 0.0d) {
            integer += (double) length;
            if (integer < 0.0d) {
                integer = 0.0d;
            }
        } else {
            double d2 = length;
            if (integer > d2) {
                integer = d2;
            }
        }
        if (objArr.length < 2 || (obj = objArr[1]) == Undefined.instance) {
            d = length;
        } else {
            double integer2 = ScriptRuntime.toInteger(obj);
            if (integer2 < 0.0d) {
                integer2 += (double) length;
                if (integer2 >= 0.0d) {
                    d = integer2;
                }
            } else {
                d = length;
                if (integer2 <= d) {
                    d = integer2;
                }
            }
            if (d < integer) {
                d = integer;
            }
        }
        return charSequence.subSequence((int) integer, (int) d);
    }

    private static CharSequence js_substr(CharSequence charSequence, Object[] objArr) {
        if (objArr.length < 1) {
            return charSequence;
        }
        double integer = ScriptRuntime.toInteger(objArr[0]);
        int length = charSequence.length();
        if (integer < 0.0d) {
            integer += (double) length;
            if (integer < 0.0d) {
                integer = 0.0d;
            }
        } else {
            double d = length;
            if (integer > d) {
                integer = d;
            }
        }
        double d2 = length;
        if (objArr.length > 1) {
            Object obj = objArr[1];
            if (!Undefined.isUndefined(obj)) {
                double integer2 = ScriptRuntime.toInteger(obj);
                double d3 = (integer2 >= 0.0d ? integer2 : 0.0d) + integer;
                if (d3 <= d2) {
                    d2 = d3;
                }
            }
        }
        return charSequence.subSequence((int) integer, (int) d2);
    }

    private static CharSequence js_substring(Context context, CharSequence charSequence, Object[] objArr) {
        Object obj;
        int length = charSequence.length();
        double integer = ScriptRuntime.toInteger(objArr, 0);
        double d = 0.0d;
        if (integer < 0.0d) {
            integer = 0.0d;
        } else {
            double d2 = length;
            if (integer > d2) {
                integer = d2;
            }
        }
        if (objArr.length <= 1 || (obj = objArr[1]) == Undefined.instance) {
            d = length;
        } else {
            double integer2 = ScriptRuntime.toInteger(obj);
            if (integer2 >= 0.0d) {
                d = length;
                if (integer2 <= d) {
                    d = integer2;
                }
            }
            if (d < integer) {
                if (context.getLanguageVersion() != 120) {
                    double d3 = d;
                    d = integer;
                    integer = d3;
                } else {
                    d = integer;
                }
            }
        }
        return charSequence.subSequence((int) integer, (int) d);
    }

    private static NativeString realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        return (NativeString) IdScriptableObject.ensureType(scriptable, NativeString.class, idFunctionObject);
    }

    private static String tagify(Context context, Scriptable scriptable, IdFunctionObject idFunctionObject, String str, String str2, Object[] objArr) {
        String string = ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible(context, scriptable, idFunctionObject));
        StringBuilder sb = new StringBuilder("<");
        sb.append(str);
        if (str2 != null && str2.length() > 0) {
            String strReplace = ScriptRuntime.toString(objArr, 0).replace("\"", "&quot;");
            sb.append(' ');
            sb.append(str2);
            sb.append("=\"");
            sb.append(strReplace);
            sb.append('\"');
        }
        sb.append('>');
        sb.append(string);
        sb.append("</");
        sb.append(str);
        sb.append('>');
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:101:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:109:0x01be  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:122:0x01df  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:133:0x0210  */
    /* JADX WARN: Code duplicated, block: B:135:0x0215  */
    /* JADX WARN: Code duplicated, block: B:137:0x0218  */
    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:157:0x027b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0286  */
    /* JADX WARN: Code duplicated, block: B:163:0x0292  */
    /* JADX WARN: Code duplicated, block: B:165:0x029a  */
    /* JADX WARN: Code duplicated, block: B:172:0x02c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:177:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:179:0x02cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Code duplicated, block: B:181:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:184:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:186:0x02da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:188:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:194:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:197:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:199:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:204:0x030f  */
    /* JADX WARN: Code duplicated, block: B:207:0x031e  */
    /* JADX WARN: Code duplicated, block: B:212:0x032f  */
    /* JADX WARN: Code duplicated, block: B:215:0x033e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:220:0x034c  */
    /* JADX WARN: Code duplicated, block: B:225:0x035e  */
    /* JADX WARN: Code duplicated, block: B:227:0x036d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX WARN: Code duplicated, block: B:232:0x0384  */
    /* JADX WARN: Code duplicated, block: B:234:0x0393  */
    /* JADX WARN: Code duplicated, block: B:239:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:241:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:244:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:246:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:247:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:249:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:250:0x03df  */
    /* JADX WARN: Code duplicated, block: B:253:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:255:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:256:0x0403  */
    /* JADX WARN: Code duplicated, block: B:259:0x040c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:261:0x0415  */
    /* JADX WARN: Code duplicated, block: B:263:0x041e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0427  */
    /* JADX WARN: Code duplicated, block: B:267:0x0430  */
    /* JADX WARN: Code duplicated, block: B:269:0x0439  */
    /* JADX WARN: Code duplicated, block: B:271:0x0442  */
    /* JADX WARN: Code duplicated, block: B:273:0x044b  */
    /* JADX WARN: Code duplicated, block: B:275:0x0454  */
    /* JADX WARN: Code duplicated, block: B:277:0x045d  */
    /* JADX WARN: Code duplicated, block: B:279:0x0466  */
    /* JADX WARN: Code duplicated, block: B:281:0x046f  */
    /* JADX WARN: Code duplicated, block: B:283:0x0478  */
    /* JADX WARN: Code duplicated, block: B:285:0x0481  */
    /* JADX WARN: Code duplicated, block: B:287:0x048e  */
    /* JADX WARN: Code duplicated, block: B:289:0x049b  */
    /* JADX WARN: Code duplicated, block: B:291:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:293:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:295:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:297:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:299:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:301:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:303:0x0507  */
    /* JADX WARN: Code duplicated, block: B:305:0x0518  */
    /* JADX WARN: Code duplicated, block: B:315:0x0535 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:316:0x0536  */
    /* JADX WARN: Code duplicated, block: B:318:0x0539  */
    /* JADX WARN: Code duplicated, block: B:320:0x0550  */
    /* JADX WARN: Code duplicated, block: B:322:0x055a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:323:0x055b  */
    /* JADX WARN: Code duplicated, block: B:325:0x0560  */
    /* JADX WARN: Code duplicated, block: B:328:0x0564  */
    /* JADX WARN: Code duplicated, block: B:330:0x056c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:332:0x0575  */
    /* JADX WARN: Code duplicated, block: B:334:0x057d  */
    /* JADX WARN: Code duplicated, block: B:336:0x0583  */
    /* JADX WARN: Code duplicated, block: B:338:0x0587 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:339:0x0588  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:374:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x008b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0095  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:60:0x0102  */
    /* JADX WARN: Code duplicated, block: B:63:0x011b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0121  */
    /* JADX WARN: Code duplicated, block: B:67:0x0127  */
    /* JADX WARN: Code duplicated, block: B:69:0x0132  */
    /* JADX WARN: Code duplicated, block: B:73:0x013d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0142  */
    /* JADX WARN: Code duplicated, block: B:77:0x014d  */
    /* JADX WARN: Code duplicated, block: B:79:0x015d  */
    /* JADX WARN: Code duplicated, block: B:83:0x016b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0176  */
    /* JADX WARN: Code duplicated, block: B:89:0x0186  */
    /* JADX WARN: Code duplicated, block: B:91:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0195  */
    /* JADX WARN: Code duplicated, block: B:95:0x0197  */
    /* JADX WARN: Code duplicated, block: B:97:0x019d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public java.lang.Object execIdCall(org.mozilla.javascript.IdFunctionObject r10, org.mozilla.javascript.Context r11, org.mozilla.javascript.Scriptable r12, org.mozilla.javascript.Scriptable r13, java.lang.Object[] r14) {
        /*
            Method dump skipped, instruction units count: 1714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeString.execIdCall(org.mozilla.javascript.IdFunctionObject, org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[]):java.lang.Object");
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        Object obj = STRING_TAG;
        addIdFunctionProperty(idFunctionObject, obj, -1, "fromCharCode", 1);
        addIdFunctionProperty(idFunctionObject, obj, -2, "fromCodePoint", 1);
        addIdFunctionProperty(idFunctionObject, obj, -3, "raw", 1);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_charAt, "charAt", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_charCodeAt, "charCodeAt", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_indexOf, "indexOf", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_lastIndexOf, "lastIndexOf", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_split, "split", 3);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_substring, "substring", 3);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_toLowerCase, "toLowerCase", 1);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_toUpperCase, "toUpperCase", 1);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_substr, "substr", 3);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_concat, "concat", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_slice, "slice", 3);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_equalsIgnoreCase, "equalsIgnoreCase", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_match, "match", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_search, "search", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_replace, "replace", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_replaceAll, "replaceAll", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_localeCompare, "localeCompare", 2);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_toLocaleLowerCase, "toLocaleLowerCase", 1);
        super.fillConstructorProperties(idFunctionObject);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findInstanceIdInfo(String str) {
        return str.equals("length") ? IdScriptableObject.instanceIdInfo(7, 1) : super.findInstanceIdInfo(str);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        str.getClass();
        switch (str) {
            case "toSource":
                return 3;
            case "toString":
                return 2;
            case "constructor":
                return 1;
            case "startsWith":
                return 42;
            case "fontcolor":
                return 26;
            case "toLocaleLowerCase":
                return 36;
            case "anchor":
                return 28;
            case "charAt":
                return 5;
            case "concat":
                return 14;
            case "codePointAt":
                return 46;
            case "equals":
                return 29;
            case "replaceAll":
                return 34;
            case "toLowerCase":
                return 11;
            case "trimEnd":
                return 51;
            case "padEnd":
                return 48;
            case "repeat":
                return 45;
            case "search":
                return 32;
            case "strike":
                return 19;
            case "substr":
                return 13;
            case "toLocaleUpperCase":
                return 37;
            case "trimRight":
                return 40;
            case "trimStart":
                return 50;
            case "lastIndexOf":
                return 8;
            case "toUpperCase":
                return 12;
            case "at":
                return 52;
            case "big":
                return 21;
            case "sub":
                return 24;
            case "sup":
                return 23;
            case "bold":
                return 16;
            case "link":
                return 27;
            case "trim":
                return 38;
            case "includes":
                return 41;
            case "blink":
                return 22;
            case "fixed":
                return 18;
            case "match":
                return 31;
            case "slice":
                return 15;
            case "small":
                return 20;
            case "split":
                return 9;
            case "valueOf":
                return 4;
            case "normalize":
                return 44;
            case "equalsIgnoreCase":
                return 30;
            case "matchAll":
                return 55;
            case "fontsize":
                return 25;
            case "charCodeAt":
                return 6;
            case "substring":
                return 10;
            case "padStart":
                return 47;
            case "isWellFormed":
                return 53;
            case "toWellFormed":
                return 54;
            case "localeCompare":
                return 35;
            case "replace":
                return 33;
            case "trimLeft":
                return 39;
            case "endsWith":
                return 43;
            case "indexOf":
                return 7;
            case "italics":
                return 17;
            default:
                return 0;
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(int i, Scriptable scriptable) {
        return (i < 0 || i >= this.string.length()) ? super.get(i, scriptable) : String.valueOf(this.string.charAt(i));
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public int getAttributes(int i) {
        if (i < 0 || i >= this.string.length()) {
            return super.getAttributes(i);
        }
        return Context.getContext().getLanguageVersion() < 200 ? 7 : 5;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "String";
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject
    public Object[] getIds(boolean z, boolean z2) {
        Context currentContext = Context.getCurrentContext();
        if (currentContext == null || currentContext.getLanguageVersion() < 200) {
            return super.getIds(z, z2);
        }
        Object[] ids = super.getIds(z, z2);
        Object[] objArr = new Object[this.string.length() + ids.length];
        int i = 0;
        while (i < this.string.length()) {
            objArr[i] = Integer.valueOf(i);
            i++;
        }
        System.arraycopy(ids, 0, objArr, i, ids.length);
        return objArr;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public String getInstanceIdName(int i) {
        return i == 1 ? "length" : super.getInstanceIdName(i);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public Object getInstanceIdValue(int i) {
        return i == 1 ? ScriptRuntime.wrapInt(this.string.length()) : super.getInstanceIdValue(i);
    }

    public int getLength() {
        return this.string.length();
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int getMaxInstanceId() {
        return 1;
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject
    public ScriptableObject getOwnPropertyDescriptor(Context context, Object obj) {
        int i;
        if (!(obj instanceof Symbol) && context != null && context.getLanguageVersion() >= 200) {
            ScriptRuntime.StringIdOrIndex stringIdOrIndex = ScriptRuntime.toStringIdOrIndex(obj);
            if (stringIdOrIndex.stringId == null && (i = stringIdOrIndex.index) >= 0 && i < this.string.length()) {
                return defaultIndexPropertyDescriptor(String.valueOf(this.string.charAt(stringIdOrIndex.index)));
            }
        }
        return super.getOwnPropertyDescriptor(context, obj);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(int i, Scriptable scriptable) {
        if (i < 0 || i >= this.string.length()) {
            return super.has(i, scriptable);
        }
        return true;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        if (i == 49) {
            initPrototypeMethod(STRING_TAG, i, SymbolKey.ITERATOR, "[Symbol.iterator]", 0);
        }
        switch (i) {
            case 1:
                str = "constructor";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 2:
                str2 = "toString";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 3:
                str2 = "toSource";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 4:
                str2 = "valueOf";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 5:
                str = "charAt";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 6:
                str = "charCodeAt";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 7:
                str = "indexOf";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 8:
                str = "lastIndexOf";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 9:
                str3 = "split";
                i2 = 2;
                str4 = str3;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 10:
                str3 = "substring";
                i2 = 2;
                str4 = str3;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 11:
                str2 = "toLowerCase";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 12:
                str2 = "toUpperCase";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 13:
                str3 = "substr";
                i2 = 2;
                str4 = str3;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 14:
                str = "concat";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 15:
                str3 = "slice";
                i2 = 2;
                str4 = str3;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 16:
                str2 = "bold";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 17:
                str2 = "italics";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 18:
                str2 = "fixed";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 19:
                str2 = "strike";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 20:
                str2 = "small";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 21:
                str2 = "big";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 22:
                str2 = "blink";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 23:
                str2 = "sup";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 24:
                str2 = "sub";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 25:
                str2 = "fontsize";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 26:
                str2 = "fontcolor";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 27:
                str2 = "link";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 28:
                str2 = "anchor";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 29:
                str = "equals";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 30:
                str = "equalsIgnoreCase";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 31:
                str = "match";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 32:
                str = "search";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 33:
                str3 = "replace";
                i2 = 2;
                str4 = str3;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 34:
                str3 = "replaceAll";
                i2 = 2;
                str4 = str3;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 35:
                str = "localeCompare";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 36:
                str2 = "toLocaleLowerCase";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 37:
                str2 = "toLocaleUpperCase";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 38:
                str2 = "trim";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 39:
                str2 = "trimLeft";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 40:
                str2 = "trimRight";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 41:
                str = "includes";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 42:
                str = "startsWith";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 43:
                str = "endsWith";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 44:
                str2 = "normalize";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 45:
                str = "repeat";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 46:
                str = "codePointAt";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 47:
                str = "padStart";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 48:
                str = "padEnd";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 49:
            default:
                net.luminis.tls.engine.impl.c.o(String.valueOf(i));
                break;
            case 50:
                str2 = "trimStart";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 51:
                str2 = "trimEnd";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 52:
                str = "at";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 53:
                str2 = "isWellFormed";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case 54:
                str2 = "toWellFormed";
                str4 = str2;
                i2 = 0;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
            case Token.THROW /* 55 */:
                str = "matchAll";
                str4 = str;
                i2 = 1;
                initPrototypeMethod(STRING_TAG, i, str4, (String) null, i2);
                break;
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(int i, Scriptable scriptable, Object obj) {
        if (i < 0 || i >= this.string.length()) {
            super.put(i, scriptable, obj);
        }
    }

    public CharSequence toCharSequence() {
        return this.string;
    }

    public String toString() {
        CharSequence charSequence = this.string;
        return charSequence instanceof String ? (String) charSequence : charSequence.toString();
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(Symbol symbol) {
        return SymbolKey.ITERATOR.equals(symbol) ? 49 : 0;
    }
}
