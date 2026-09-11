package org.mozilla.classfile;

import com.app.mlounge.emulator.LibretroCore;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class ClassFileWriter {
    public static final int E;
    public static final int F;
    public static final boolean G;
    public ArrayList A;
    public ArrayList B;
    public final String d;
    public i[] e;
    public int f;
    public int[] g;
    public int h;
    public int j;
    public final h k;
    public b l;
    public int m;
    public int n;
    public int o;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public int[] w;
    public int x;
    public long[] y;
    public int z;
    public int[] a = null;
    public int b = 0;
    public HashMap c = null;
    public byte[] i = new byte[LibretroCore.SCREEN_WIDTH];
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();
    public int C = 0;
    public char[] D = new char[64];

    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    static {
        int i;
        int i2 = 48;
        try {
            try {
                InputStream resourceAsStream = ClassFileWriter.class.getResourceAsStream("ClassFileWriter.class");
                if (resourceAsStream == null) {
                    resourceAsStream = ClassLoader.getSystemResourceAsStream("org/mozilla/classfile/ClassFileWriter.class");
                }
                try {
                    try {
                        if (resourceAsStream != null) {
                            byte[] bArr = new byte[8];
                            int i3 = 0;
                            while (i3 < 8) {
                                int i4 = resourceAsStream.read(bArr, i3, 8 - i3);
                                if (i4 < 0) {
                                    throw new IOException();
                                }
                                i3 += i4;
                            }
                            i = (bArr[4] << 8) | (bArr[5] & 255);
                            try {
                                i2 = (bArr[7] & 255) | (bArr[6] << 8);
                            } catch (Throwable th) {
                                th = th;
                                if (resourceAsStream != null) {
                                    try {
                                        resourceAsStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } else {
                            System.err.println("Warning: Unable to read ClassFileWriter.class, using default bytecode version");
                            i = 0;
                        }
                        if (resourceAsStream != null) {
                            resourceAsStream.close();
                        }
                        F = i;
                        E = i2;
                        G = i2 >= 50;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException unused) {
                    throw new AssertionError("Can't read ClassFileWriter.class to get bytecode version");
                }
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                th = th4;
                F = 0;
                E = 48;
                G = 48 >= 50;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            F = 0;
            E = 48;
            G = 48 >= 50;
            throw th;
        }
    }

    public ClassFileWriter(String str, String str2, String str3) {
        this.d = str;
        h hVar = new h(this);
        this.k = hVar;
        this.t = hVar.a(str);
        this.u = hVar.a(str2);
        if (str3 != null) {
            this.v = hVar.i(str3);
        }
        this.s = 33;
    }

    public static void A(int i) {
        throw new IllegalStateException(i < 0 ? androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Stack underflow: ") : androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Too big stack: "));
    }

    public static String B(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            return str;
        }
        if (cCharAt == 'L') {
            return str.substring(1, str.length() - 1);
        }
        if (cCharAt == 'S' || cCharAt == 'V' || cCharAt == 'I' || cCharAt == 'J' || cCharAt == 'Z' || cCharAt == '[') {
            return str;
        }
        switch (cCharAt) {
            case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
            case Token.ENUM_NEXT /* 67 */:
            case Token.ENUM_ID /* 68 */:
                return str;
            default:
                net.luminis.tls.engine.impl.c.o("bad descriptor:".concat(str));
                return null;
        }
    }

    public static int I(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
        return i2 + 2;
    }

    public static int J(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
        return i2 + 4;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1 A[PHI: r6
  0x00b1: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v6 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:47:0x0098, B:48:0x009a, B:49:0x009c, B:52:0x00a2, B:58:0x00af, B:54:0x00a6, B:55:0x00a8, B:56:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0044. Please report as an issue. */
    public static int L(String str) {
        int i;
        int length = str.length();
        int iLastIndexOf = str.lastIndexOf(41);
        if (3 <= length) {
            boolean z = false;
            if (str.charAt(0) == '(' && 1 <= iLastIndexOf && (i = iLastIndexOf + 1) < length) {
                int i2 = 0;
                int i3 = 0;
                int i4 = 1;
                while (true) {
                    if (i4 != iLastIndexOf) {
                        char cCharAt = str.charAt(i4);
                        if (cCharAt != 'F') {
                            if (cCharAt != 'L') {
                                if (cCharAt != 'S' && cCharAt != 'I') {
                                    if (cCharAt != 'J') {
                                        if (cCharAt != 'Z') {
                                            if (cCharAt != '[') {
                                                switch (cCharAt) {
                                                }
                                            } else {
                                                i4++;
                                                char cCharAt2 = str.charAt(i4);
                                                while (cCharAt2 == '[') {
                                                    i4++;
                                                    cCharAt2 = str.charAt(i4);
                                                }
                                                if (cCharAt2 != 'F') {
                                                    if (cCharAt2 != 'L') {
                                                        if (cCharAt2 != 'S' && cCharAt2 != 'Z' && cCharAt2 != 'I' && cCharAt2 != 'J') {
                                                            switch (cCharAt2) {
                                                                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                                                                case Token.ENUM_NEXT /* 67 */:
                                                                case Token.ENUM_ID /* 68 */:
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                }
                                                i2--;
                                                i3++;
                                                i4++;
                                            }
                                        }
                                    }
                                    i2--;
                                }
                            }
                            i2--;
                            i3++;
                            int iIndexOf = str.indexOf(59, i4 + 1);
                            if (i4 + 2 > iIndexOf || iIndexOf >= iLastIndexOf) {
                                z = false;
                            } else {
                                i4 = iIndexOf + 1;
                                z = false;
                            }
                        }
                        i2--;
                        i3++;
                        i4++;
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    char cCharAt3 = str.charAt(i);
                    if (cCharAt3 != 'F' && cCharAt3 != 'L' && cCharAt3 != 'S') {
                        if (cCharAt3 != 'V') {
                            if (cCharAt3 != 'I') {
                                if (cCharAt3 != 'J') {
                                    if (cCharAt3 != 'Z' && cCharAt3 != '[') {
                                        switch (cCharAt3) {
                                            case Token.ENUM_ID /* 68 */:
                                                i2++;
                                            case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                                            case Token.ENUM_NEXT /* 67 */:
                                                i2++;
                                                break;
                                            default:
                                                z = false;
                                                break;
                                        }
                                    } else {
                                        i2++;
                                    }
                                } else {
                                    i2++;
                                    i2++;
                                }
                            } else {
                                i2++;
                            }
                        }
                    } else {
                        i2++;
                    }
                    if (z) {
                        return (i3 << 16) | (65535 & i2);
                    }
                }
            }
        }
        net.luminis.tls.engine.impl.c.o("Bad parameter signature: ".concat(str));
        return 0;
    }

    public static int M(int i) {
        if (i == 254 || i == 255) {
            return 0;
        }
        switch (i) {
            case 0:
            case Token.NULL /* 47 */:
            case Token.FALSE /* 49 */:
            case Token.RC /* 95 */:
            case Token.COLON /* 116 */:
            case Token.OR /* 117 */:
            case Token.AND /* 118 */:
            case Token.INC /* 119 */:
            case Token.FOR /* 132 */:
            case Token.CONTINUE /* 134 */:
            case Token.FINALLY /* 138 */:
            case Token.VOID /* 139 */:
            case Token.BLOCK /* 143 */:
            case Token.TARGET /* 145 */:
            case Token.LOOP /* 146 */:
            case Token.EXPR_VOID /* 147 */:
            case Token.LET /* 167 */:
            case Token.SETCONST /* 169 */:
            case Token.METHOD /* 177 */:
            case Token.ARROW /* 178 */:
            case Token.YIELD_STAR /* 179 */:
            case Token.DOTDOTDOT /* 184 */:
            case Token.QUESTION_DOT /* 186 */:
            case 188:
            case 189:
            case 190:
            case 192:
            case 193:
            case 196:
            case Context.VERSION_ES6 /* 200 */:
            case 202:
                return 0;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 12:
            case 13:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case Token.GETPROPNOWARN /* 34 */:
            case 35:
            case Token.GETPROPNOWARN_SUPER /* 36 */:
            case Token.SETPROP /* 37 */:
            case Token.SETELEM_SUPER /* 42 */:
            case Token.CALL /* 43 */:
            case Token.NAME /* 44 */:
            case Token.NUMBER /* 45 */:
            case 89:
            case Token.TRY /* 90 */:
            case Token.SEMI /* 91 */:
            case Token.BREAK /* 133 */:
            case Token.VAR /* 135 */:
            case 140:
            case Token.EMPTY /* 141 */:
            case Token.CONST /* 168 */:
            case Token.LAST_TOKEN /* 187 */:
            case 197:
            case 201:
                return 1;
            case 9:
            case 10:
            case 14:
            case 15:
            case 20:
            case 22:
            case 24:
            case 30:
            case 31:
            case 32:
            case Token.GETPROP /* 33 */:
            case Token.SETPROP_SUPER /* 38 */:
            case Token.GETELEM /* 39 */:
            case Token.GETELEM_SUPER /* 40 */:
            case Token.SETELEM /* 41 */:
            case Token.LB /* 92 */:
            case Token.RB /* 93 */:
            case Token.LC /* 94 */:
                return 2;
            case Token.STRING /* 46 */:
            case Token.THIS /* 48 */:
            case Token.TRUE /* 50 */:
            case Token.SHEQ /* 51 */:
            case Token.SHNE /* 52 */:
            case Token.REGEXP /* 53 */:
            case Token.BINDNAME /* 54 */:
            case Token.RETHROW /* 56 */:
            case Token.INSTANCEOF /* 58 */:
            case Token.LOCAL_LOAD /* 59 */:
            case 60:
            case 61:
            case Token.CATCH_SCOPE /* 62 */:
            case Token.ENUM_NEXT /* 67 */:
            case Token.ENUM_ID /* 68 */:
            case Token.THISFN /* 69 */:
            case Token.RETURN_RESULT /* 70 */:
            case Token.DEL_REF /* 75 */:
            case Token.REF_CALL /* 76 */:
            case Token.REF_SPECIAL /* 77 */:
            case Token.YIELD /* 78 */:
            case Token.REF_NAME /* 87 */:
            case Token.LP /* 96 */:
            case Token.COMMA /* 98 */:
            case 100:
            case Token.ASSIGN_BITXOR /* 102 */:
            case Token.ASSIGN_LOGICAL_AND /* 104 */:
            case Token.ASSIGN_RSH /* 106 */:
            case Token.ASSIGN_ADD /* 108 */:
            case 110:
            case Token.ASSIGN_MOD /* 112 */:
            case 114:
            case 120:
            case Token.DOT /* 121 */:
            case Token.FUNCTION /* 122 */:
            case Token.EXPORT /* 123 */:
            case Token.IMPORT /* 124 */:
            case Token.IF /* 125 */:
            case Token.ELSE /* 126 */:
            case 128:
            case 130:
            case Token.WITH /* 136 */:
            case Token.CATCH /* 137 */:
            case Token.COMPUTED_PROPERTY /* 142 */:
            case Token.LABEL /* 144 */:
            case Token.JSR /* 149 */:
            case 150:
            case Token.SETPROP_OP /* 153 */:
            case Token.SETELEM_OP /* 154 */:
            case Token.LOCAL_BLOCK /* 155 */:
            case Token.SET_REF_OP /* 156 */:
            case Token.DOTDOT /* 157 */:
            case Token.COLONCOLON /* 158 */:
            case 170:
            case Token.ARRAYCOMP /* 171 */:
            case Token.LETEXPR /* 172 */:
            case Token.DEBUGGER /* 174 */:
            case Token.GENEXPR /* 176 */:
            case 180:
            case Token.TEMPLATE_CHARS /* 181 */:
            case Token.TEMPLATE_LITERAL_SUBST /* 182 */:
            case Token.TAGGED_TEMPLATE_LITERAL /* 183 */:
            case 185:
            case 191:
            case 194:
            case 195:
            case 198:
            case 199:
                return -1;
            case Token.THROW /* 55 */:
            case Token.IN /* 57 */:
            case Token.ENUM_INIT_KEYS /* 63 */:
            case Token.ENUM_INIT_VALUES /* 64 */:
            case Token.ENUM_INIT_ARRAY /* 65 */:
            case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
            case Token.ARRAYLIT /* 71 */:
            case Token.OBJECTLIT /* 72 */:
            case Token.GET_REF /* 73 */:
            case Token.SET_REF /* 74 */:
            case Token.REF_NS_NAME /* 88 */:
            case Token.RP /* 97 */:
            case 99:
            case Token.ASSIGN_LOGICAL_OR /* 101 */:
            case Token.ASSIGN_BITAND /* 103 */:
            case Token.ASSIGN_LSH /* 105 */:
            case Token.ASSIGN_URSH /* 107 */:
            case Token.ASSIGN_SUB /* 109 */:
            case Token.ASSIGN_DIV /* 111 */:
            case Token.ASSIGN_EXP /* 113 */:
            case Token.HOOK /* 115 */:
            case 127:
            case Token.DEFAULT /* 129 */:
            case Token.DO /* 131 */:
            case Token.XML /* 159 */:
            case 160:
            case Token.XMLATTR /* 161 */:
            case Token.XMLEND /* 162 */:
            case Token.TO_OBJECT /* 163 */:
            case Token.TO_DOUBLE /* 164 */:
            case Token.GET /* 165 */:
            case Token.SET /* 166 */:
            case Token.WITHEXPR /* 173 */:
            case Token.COMMENT /* 175 */:
                return -2;
            case Token.SUPER /* 79 */:
            case Token.EXP /* 81 */:
            case Token.ESCXMLATTR /* 83 */:
            case Token.ESCXMLTEXT /* 84 */:
            case Token.REF_MEMBER /* 85 */:
            case Token.REF_NS_MEMBER /* 86 */:
            case Token.EXPR_RESULT /* 148 */:
            case Token.TYPEOFNAME /* 151 */:
            case Token.USE_STACK /* 152 */:
                return -3;
            case Token.STRICT_SETNAME /* 80 */:
            case Token.DEFAULTNAMESPACE /* 82 */:
                return -4;
            default:
                net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Bad opcode: "));
                return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    public static int[] a(ClassFileWriter classFileWriter) {
        int i;
        int iH;
        int i2;
        int[] iArr = new int[classFileWriter.o];
        b bVar = classFileWriter.l;
        if ((bVar.e & 8) == 0) {
            if ("<init>".equals(bVar.a)) {
                iArr[0] = 6;
            } else {
                iArr[0] = com.google.android.material.sidesheet.b.a(classFileWriter.t);
            }
            i = 1;
        } else {
            i = 0;
        }
        String str = classFileWriter.l.b;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(41);
        if (iIndexOf != 0 || iIndexOf2 < 0) {
            net.luminis.tls.engine.impl.c.o("bad method type");
            return null;
        }
        int i3 = iIndexOf + 1;
        StringBuilder sb = new StringBuilder();
        while (i3 < iIndexOf2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != 'F') {
                if (cCharAt == 'L') {
                    int iIndexOf3 = str.indexOf(59, i3) + 1;
                    sb.append(str.substring(i3, iIndexOf3));
                    i3 = iIndexOf3;
                } else if (cCharAt != 'S' && cCharAt != 'I' && cCharAt != 'J' && cCharAt != 'Z') {
                    if (cCharAt != '[') {
                        switch (cCharAt) {
                        }
                    } else {
                        sb.append('[');
                        i3++;
                    }
                }
                iH = com.google.android.material.sidesheet.b.h(B(sb.toString()), classFileWriter.k);
                i2 = i + 1;
                iArr[i] = iH;
                if (com.google.android.material.sidesheet.b.x(iH)) {
                    i += 2;
                } else {
                    i = i2;
                }
                sb.setLength(0);
            }
            sb.append(str.charAt(i3));
            i3++;
            iH = com.google.android.material.sidesheet.b.h(B(sb.toString()), classFileWriter.k);
            i2 = i + 1;
            iArr[i] = iH;
            if (com.google.android.material.sidesheet.b.x(iH)) {
                i += 2;
            } else {
                i = i2;
            }
            sb.setLength(0);
        }
        return iArr;
    }

    public final int C(int i) {
        if (i >= 0) {
            net.luminis.tls.engine.impl.c.o("Bad label, no biscuit");
            return 0;
        }
        int i2 = i & Integer.MAX_VALUE;
        if (i2 < this.x) {
            return this.w[i2];
        }
        net.luminis.tls.engine.impl.c.o("Bad label");
        return 0;
    }

    public final void D(int i) {
        if (i >= 0) {
            net.luminis.tls.engine.impl.c.o("Bad label, no biscuit");
            return;
        }
        int i2 = i & Integer.MAX_VALUE;
        if (i2 > this.x) {
            net.luminis.tls.engine.impl.c.o("Bad label");
            return;
        }
        int[] iArr = this.w;
        if (iArr[i2] == -1) {
            iArr[i2] = this.j;
        } else {
            net.luminis.tls.engine.impl.c.r("Can only mark label once");
        }
    }

    public final void E(int i, int i2) {
        D(i);
        this.m = i2;
    }

    public final void F(int i, int i2) {
        v(this.j);
        this.c.put(Integer.valueOf(this.j), Integer.valueOf(i));
        K(i, i2, this.j);
    }

    public final void G(int i, int i2, int i3) {
        if (i3 < 0 || i3 > this.n) {
            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i3, "Bad stack index: "));
            return;
        }
        this.m = (short) i3;
        v(this.j);
        this.c.put(Integer.valueOf(this.j), Integer.valueOf(i));
        K(i, i2, this.j);
    }

    public final void H(int i) {
        v(this.j);
        this.c.put(Integer.valueOf(this.j), Integer.valueOf(i));
        K(i, -1, this.j);
    }

    public final void K(int i, int i2, int i3) {
        int i4;
        if (i3 < 0 || (i4 = this.j) < i3) {
            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i3, "Bad jump target: "));
            return;
        }
        if (i2 < -1) {
            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i2, "Bad case index: "));
            return;
        }
        int i5 = (~i) & 3;
        int i6 = i2 < 0 ? i + 1 + i5 : i + 1 + i5 + ((i2 + 3) * 4);
        if (i < 0 || ((i4 - 16) - i5) - 1 < i) {
            net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.d(i, " is outside a possible range of tableswitch in already generated code"));
            return;
        }
        byte[] bArr = this.i;
        if ((bArr[i] & 255) != 170) {
            net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.d(i, " is not offset of tableswitch statement"));
        } else {
            if (i6 < 0 || i4 < i6 + 4) {
                throw new d(androidx.privacysandbox.ads.adservices.java.internal.a.l(i2, "Too big case index: "));
            }
            J(bArr, i3 - i, i6);
        }
    }

    public final void N(String str, String str2, short s) {
        h hVar = this.k;
        short sI = hVar.i(str);
        short sI2 = hVar.i(str2);
        b bVar = new b();
        bVar.a = str;
        bVar.c = sI;
        bVar.b = str2;
        bVar.d = sI2;
        bVar.e = s;
        this.l = bVar;
        this.c = new HashMap();
        this.p.add(this.l);
        v(0);
    }

    /* JADX WARN: Code duplicated, block: B:146:0x031d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0352  */
    /* JADX WARN: Code duplicated, block: B:151:0x035b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0376 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x0378 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x037a A[LOOP:11: B:149:0x0357->B:155:0x037a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:162:0x039f  */
    /* JADX WARN: Code duplicated, block: B:165:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:166:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:169:0x03af  */
    /* JADX WARN: Code duplicated, block: B:171:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:174:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:177:0x03db A[LOOP:12: B:175:0x03d7->B:177:0x03db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:182:0x0408 A[LOOP:13: B:181:0x0406->B:182:0x0408, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x043a  */
    /* JADX WARN: Code duplicated, block: B:185:0x045f  */
    /* JADX WARN: Code duplicated, block: B:188:0x0480  */
    /* JADX WARN: Code duplicated, block: B:228:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0393 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x038d A[SYNTHETIC] */
    public final void O(int i) {
        int i2;
        f fVar;
        int i3;
        int i4;
        int i5;
        byte[] bArr;
        int i6;
        int i7;
        int I;
        int i8;
        int I2;
        int i9;
        int size;
        int i10;
        int i11;
        int i12;
        int iC;
        int iC2;
        int iC3;
        short s;
        int i13;
        int i14;
        int i15;
        if (this.l == null) {
            net.luminis.tls.engine.impl.c.r("No method to stop");
            return;
        }
        byte[] bArr2 = this.i;
        int i16 = 0;
        for (int i17 = 0; i17 < this.z; i17++) {
            long j = this.y[i17];
            int i18 = (int) (j >> 32);
            int i19 = (int) j;
            int i20 = this.w[i18];
            if (i20 == -1) {
                org.mozilla.javascript.c.b("unlocated label");
                return;
            }
            v(i20);
            int i21 = i19 - 1;
            this.c.put(Integer.valueOf(i20), Integer.valueOf(i21));
            int i22 = i20 - i21;
            if (((short) i22) != i22) {
                throw new d("Program too complex: too big jump offset");
            }
            bArr2[i19] = (byte) (i22 >> 8);
            bArr2[i19 + 1] = (byte) i22;
        }
        this.z = 0;
        this.o = i;
        h hVar = this.k;
        int i23 = 1;
        boolean z = G;
        if (z) {
            if (z) {
                for (int i24 = 0; i24 < this.f; i24++) {
                    v(C(this.e[i24].c));
                }
                Arrays.sort(this.a, 0, this.b);
                int i25 = this.a[0];
                int i26 = 1;
                for (int i27 = 1; i27 < this.b; i27++) {
                    int[] iArr = this.a;
                    int i28 = iArr[i27];
                    if (i25 != i28) {
                        if (i26 != i27) {
                            iArr[i26] = i28;
                        }
                        i26++;
                        i25 = i28;
                    }
                }
                this.b = i26;
                int i29 = i26 - 1;
                if (this.a[i29] == this.j) {
                    this.b = i29;
                }
            }
            fVar = new f(this);
            fVar.g = new k[this.b];
            int[] iArrA = a(this);
            int i30 = 0;
            while (true) {
                int i31 = this.b;
                if (i30 >= i31) {
                    break;
                }
                int[] iArr2 = this.a;
                int i32 = iArr2[i30];
                int i33 = i30 == i31 + (-1) ? this.j : iArr2[i30 + 1];
                k[] kVarArr = fVar.g;
                k kVar = new k();
                kVar.a = i30;
                kVar.b = i32;
                kVar.c = i33;
                int[] iArr3 = new int[iArrA.length];
                kVar.d = iArr3;
                System.arraycopy(iArrA, 0, iArr3, 0, iArrA.length);
                kVar.e = new int[0];
                kVar.f = false;
                kVar.g = false;
                kVarArr[i30] = kVar;
                i30++;
            }
            int[] iArrA2 = a(this);
            fVar.g[0].b(iArrA2, iArrA2.length, new int[0], 0, this.k);
            fVar.e = new k[]{fVar.g[0]};
            fVar.f = 1;
            fVar.d();
            k[] kVarArr2 = fVar.g;
            int length = kVarArr2.length;
            int i34 = 0;
            while (i34 < length) {
                k kVar2 = kVarArr2[i34];
                if (kVar2.f) {
                    i14 = i23;
                } else {
                    int[] iArr4 = new int[0];
                    int[] iArr5 = {com.google.android.material.sidesheet.b.a(hVar.a("java/lang/Throwable"))};
                    int i35 = kVar2.b;
                    int i36 = kVar2.c;
                    int i37 = 0;
                    while (true) {
                        if (i37 >= this.f) {
                            i14 = i23;
                            break;
                        }
                        i iVar = this.e[i37];
                        int i38 = iVar.a;
                        i14 = i23;
                        int i39 = iVar.c;
                        int iC4 = C(i38);
                        if (i35 <= iC4 || i35 >= C(iVar.b)) {
                            if (iC4 > i35 && iC4 < i36) {
                                k kVarG = fVar.g(C(i39));
                                if (kVarG.f) {
                                    int[] iArr6 = kVarG.d;
                                    iArr4 = new int[iArr6.length];
                                    System.arraycopy(iArr6, 0, iArr4, 0, iArr6.length);
                                    break;
                                }
                            }
                            i37++;
                            i23 = i14;
                        } else {
                            k kVarG2 = fVar.g(C(i39));
                            int[] iArr7 = kVarG2.d;
                            iArr4 = new int[iArr7.length];
                            System.arraycopy(iArr7, 0, iArr4, 0, iArr7.length);
                            if (kVarG2.f) {
                                break;
                            }
                            i37++;
                            i23 = i14;
                        }
                    }
                    int i40 = 0;
                    while (i40 < this.f) {
                        i iVar2 = this.e[i40];
                        if (C(iVar2.a) == i35 || C(iVar2.c) == i35) {
                            int i41 = i40 + 1;
                            while (true) {
                                i15 = this.f;
                                if (i41 >= i15) {
                                    break;
                                }
                                i[] iVarArr = this.e;
                                iVarArr[i41 - 1] = iVarArr[i41];
                                i41++;
                            }
                            this.f = i15 - 1;
                            i40--;
                        }
                        i40++;
                    }
                    kVar2.b(iArr4, iArr4.length, iArr5, 1, this.k);
                    int i42 = i36 - 1;
                    this.i[i42] = -65;
                    for (int i43 = i35; i43 < i42; i43++) {
                        this.i[i43] = 0;
                    }
                }
                i34++;
                i23 = i14;
            }
            i2 = i23;
            fVar.d();
        } else {
            i2 = 1;
            fVar = null;
        }
        int i44 = this.g != null ? (this.h * 4) + 8 : 0;
        ArrayList arrayList = this.A;
        int size2 = arrayList != null ? (arrayList.size() * 10) + 8 : 0;
        if (fVar != null) {
            k[] kVarArr3 = fVar.g;
            int length2 = kVarArr3.length - 1;
            ClassFileWriter classFileWriter = fVar.k;
            fVar.h = new byte[((classFileWriter.n * 3) + (classFileWriter.o * 3) + 7) * length2];
            int[] iArrA3 = kVarArr3[0].a();
            int i45 = i2;
            int i46 = -1;
            while (true) {
                k[] kVarArr4 = fVar.g;
                if (i45 >= kVarArr4.length) {
                    break;
                }
                k kVar3 = kVarArr4[i45];
                int[] iArrA4 = kVar3.a();
                int i47 = kVar3.b;
                int[] iArr8 = kVar3.e;
                int length3 = iArr8.length;
                int[] iArr9 = new int[length3];
                System.arraycopy(iArr8, i16, iArr9, i16, iArr8.length);
                int i48 = i47 - i46;
                int i49 = i48 - 1;
                if (length3 == 0) {
                    int length4 = iArrA3.length > iArrA4.length ? iArrA4.length : iArrA3.length;
                    i13 = i16;
                    int iAbs = Math.abs(iArrA3.length - iArrA4.length);
                    int i50 = i13;
                    while (i50 < length4 && iArrA3[i50] == iArrA4[i50]) {
                        i50++;
                    }
                    if (i50 == iArrA4.length && iAbs == 0) {
                        byte[] bArr3 = fVar.h;
                        int i51 = fVar.i;
                        if (i49 <= 63) {
                            fVar.i = i51 + 1;
                            bArr3[i51] = (byte) i49;
                        } else {
                            int i52 = i51 + 1;
                            fVar.i = i52;
                            bArr3[i51] = -5;
                            fVar.i = I(bArr3, i49, i52);
                        }
                    } else if (i50 == iArrA4.length && iAbs <= 3) {
                        byte[] bArr4 = fVar.h;
                        int i53 = fVar.i;
                        int i54 = i53 + 1;
                        fVar.i = i54;
                        bArr4[i53] = (byte) (251 - iAbs);
                        fVar.i = I(bArr4, i49, i54);
                    } else if (i50 != iArrA3.length || iAbs > 3) {
                        fVar.l(iArrA4, iArr9, i49);
                    } else {
                        int length5 = iArrA4.length - iAbs;
                        byte[] bArr5 = fVar.h;
                        int i55 = fVar.i;
                        int i56 = i55 + 1;
                        fVar.i = i56;
                        bArr5[i55] = (byte) (iAbs + 251);
                        fVar.i = I(bArr5, i49, i56);
                        fVar.i = fVar.n(length5, iArrA4);
                    }
                } else {
                    i13 = i16;
                    if (length3 != i2) {
                        fVar.l(iArrA4, iArr9, i49);
                    } else if (Arrays.equals(iArrA3, iArrA4)) {
                        byte[] bArr6 = fVar.h;
                        int i57 = fVar.i;
                        if (i49 <= 63) {
                            fVar.i = i57 + 1;
                            bArr6[i57] = (byte) (i48 + 63);
                        } else {
                            int i58 = i57 + 1;
                            fVar.i = i58;
                            bArr6[i57] = -9;
                            fVar.i = I(bArr6, i49, i58);
                        }
                        fVar.m(iArr9[i13]);
                    } else {
                        fVar.l(iArrA4, iArr9, i49);
                    }
                }
                i45++;
                iArrA3 = iArrA4;
                i46 = i47;
                i16 = i13;
                i2 = 1;
            }
            i3 = i16;
            int i59 = fVar.i;
            if (i59 + 2 > 0) {
                i4 = i59 + 8;
            }
            i5 = (this.f * 8) + this.j + 16 + 2 + i44 + size2 + i4;
            if (i5 <= 65536) {
                throw new d("generated bytecode for method exceeds 64K limit.");
            }
            bArr = new byte[i5];
            int iJ = J(bArr, this.j, I(bArr, this.o, I(bArr, this.n, J(bArr, i5 - 6, I(bArr, hVar.i("Code"), i3)))));
            System.arraycopy(this.i, 0, bArr, iJ, this.j);
            i6 = iJ + this.j;
            i7 = this.f;
            if (i7 > 0) {
                I = I(bArr, i7, i6);
                for (i12 = 0; i12 < this.f; i12++) {
                    i iVar3 = this.e[i12];
                    iC = C(iVar3.a);
                    iC2 = C(iVar3.b);
                    iC3 = C(iVar3.c);
                    s = iVar3.d;
                    if (iC != -1) {
                        net.luminis.tls.engine.impl.c.r("start label not defined");
                        return;
                    }
                    if (iC2 != -1) {
                        net.luminis.tls.engine.impl.c.r("end label not defined");
                        return;
                    } else {
                        if (iC3 != -1) {
                            net.luminis.tls.engine.impl.c.r("handler label not defined");
                            return;
                        }
                        I = I(bArr, s, I(bArr, iC3, I(bArr, iC2, I(bArr, iC, I))));
                    }
                }
            } else {
                I = I(bArr, 0, i6);
            }
            if (this.g != null) {
                i8 = 1;
            } else {
                i8 = 0;
            }
            if (this.A != null) {
                i8++;
            }
            if (i4 > 0) {
                i8++;
            }
            I2 = I(bArr, i8, I);
            if (this.g != null) {
                I2 = I(bArr, this.h, J(bArr, (this.h * 4) + 2, I(bArr, hVar.i("LineNumberTable"), I2)));
                for (i11 = 0; i11 < this.h; i11++) {
                    I2 = J(bArr, this.g[i11], I2);
                }
            }
            if (this.A != null) {
                int I3 = I(bArr, hVar.i("LocalVariableTable"), I2);
                size = this.A.size();
                I2 = I(bArr, size, J(bArr, (size * 10) + 2, I3));
                for (i10 = 0; i10 < size; i10++) {
                    int[] iArr10 = (int[]) this.A.get(i10);
                    int i60 = iArr10[0];
                    int i61 = iArr10[1];
                    int i62 = iArr10[2];
                    I2 = I(bArr, iArr10[3], I(bArr, i61, I(bArr, i60, I(bArr, this.j - i62, I(bArr, i62, I2)))));
                }
            }
            if (i4 > 0) {
                i9 = 0;
                System.arraycopy(fVar.h, 0, bArr, I(bArr, fVar.g.length - 1, J(bArr, fVar.i + 2, I(bArr, hVar.i("StackMapTable"), I2))), fVar.i);
            } else {
                i9 = 0;
            }
            this.l.f = bArr;
            this.e = null;
            this.f = i9;
            this.h = i9;
            this.j = i9;
            this.l = null;
            this.n = i9;
            this.m = i9;
            this.x = i9;
            this.z = i9;
            this.A = null;
            this.a = null;
            this.b = i9;
            this.c = null;
        }
        i3 = 0;
        i4 = i3;
        i5 = (this.f * 8) + this.j + 16 + 2 + i44 + size2 + i4;
        if (i5 <= 65536) {
            throw new d("generated bytecode for method exceeds 64K limit.");
        }
        bArr = new byte[i5];
        int iJ2 = J(bArr, this.j, I(bArr, this.o, I(bArr, this.n, J(bArr, i5 - 6, I(bArr, hVar.i("Code"), i3)))));
        System.arraycopy(this.i, 0, bArr, iJ2, this.j);
        i6 = iJ2 + this.j;
        i7 = this.f;
        if (i7 > 0) {
            I = I(bArr, i7, i6);
            while (i12 < this.f) {
                i iVar4 = this.e[i12];
                iC = C(iVar4.a);
                iC2 = C(iVar4.b);
                iC3 = C(iVar4.c);
                s = iVar4.d;
                if (iC != -1) {
                    net.luminis.tls.engine.impl.c.r("start label not defined");
                    return;
                }
                if (iC2 != -1) {
                    net.luminis.tls.engine.impl.c.r("end label not defined");
                    return;
                } else {
                    if (iC3 != -1) {
                        net.luminis.tls.engine.impl.c.r("handler label not defined");
                        return;
                    }
                    I = I(bArr, s, I(bArr, iC3, I(bArr, iC2, I(bArr, iC, I))));
                }
            }
        } else {
            I = I(bArr, 0, i6);
        }
        if (this.g != null) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        if (this.A != null) {
            i8++;
        }
        if (i4 > 0) {
            i8++;
        }
        I2 = I(bArr, i8, I);
        if (this.g != null) {
            I2 = I(bArr, this.h, J(bArr, (this.h * 4) + 2, I(bArr, hVar.i("LineNumberTable"), I2)));
            while (i11 < this.h) {
                I2 = J(bArr, this.g[i11], I2);
            }
        }
        if (this.A != null) {
            int I4 = I(bArr, hVar.i("LocalVariableTable"), I2);
            size = this.A.size();
            I2 = I(bArr, size, J(bArr, (size * 10) + 2, I4));
            while (i10 < size) {
                int[] iArr11 = (int[]) this.A.get(i10);
                int i63 = iArr11[0];
                int i64 = iArr11[1];
                int i65 = iArr11[2];
                I2 = I(bArr, iArr11[3], I(bArr, i64, I(bArr, i63, I(bArr, this.j - i65, I(bArr, i65, I2)))));
            }
        }
        if (i4 > 0) {
            i9 = 0;
            System.arraycopy(fVar.h, 0, bArr, I(bArr, fVar.g.length - 1, J(bArr, fVar.i + 2, I(bArr, hVar.i("StackMapTable"), I2))), fVar.i);
        } else {
            i9 = 0;
        }
        this.l.f = bArr;
        this.e = null;
        this.f = i9;
        this.h = i9;
        this.j = i9;
        this.l = null;
        this.n = i9;
        this.m = i9;
        this.x = i9;
        this.z = i9;
        this.A = null;
        this.a = null;
        this.b = i9;
        this.c = null;
    }

    public final byte[] P() {
        short sI;
        int i;
        short sI2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.B;
        h hVar = this.k;
        if (arrayList3 != null) {
            sI = hVar.i("BootstrapMethods");
            i = 1;
        } else {
            sI = 0;
            i = 0;
        }
        int i2 = this.v;
        if (i2 != 0) {
            i++;
            sI2 = hVar.i("SourceFile");
        } else {
            sI2 = 0;
        }
        if (i2 != 0) {
            hVar.i("SourceFile");
        }
        int i3 = hVar.h + 18;
        ArrayList arrayList4 = this.r;
        int size = (arrayList4.size() * 2) + i3 + 2;
        int i4 = 0;
        while (true) {
            arrayList = this.q;
            if (i4 >= arrayList.size()) {
                break;
            }
            ((a) arrayList.get(i4)).getClass();
            size += 8;
            i4++;
        }
        int length = size + 2;
        int i5 = 0;
        while (true) {
            arrayList2 = this.p;
            if (i5 >= arrayList2.size()) {
                break;
            }
            length += ((b) arrayList2.get(i5)).f.length + 8;
            i5++;
        }
        int i6 = length + 2;
        if (i2 != 0) {
            i6 = length + 10;
        }
        if (this.B != null) {
            i6 = i6 + 8 + this.C;
        }
        byte[] bArr = new byte[i6];
        int I = I(bArr, (short) hVar.i, I(bArr, E, I(bArr, F, J(bArr, -889275714, 0))));
        System.arraycopy(hVar.l, 0, bArr, I, hVar.h);
        int I2 = I(bArr, arrayList4.size(), I(bArr, this.u, I(bArr, this.t, I(bArr, this.s, I + hVar.h))));
        for (int i7 = 0; i7 < arrayList4.size(); i7++) {
            I2 = I(bArr, ((Short) arrayList4.get(i7)).shortValue(), I2);
        }
        int I3 = I(bArr, arrayList.size(), I2);
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            a aVar = (a) arrayList.get(i8);
            I3 = I(bArr, 0, I(bArr, aVar.b, I(bArr, aVar.a, I(bArr, aVar.c, I3))));
        }
        int I4 = I(bArr, arrayList2.size(), I3);
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            b bVar = (b) arrayList2.get(i9);
            int I5 = I(bArr, 1, I(bArr, bVar.d, I(bArr, bVar.c, I(bArr, bVar.e, I4))));
            byte[] bArr2 = bVar.f;
            System.arraycopy(bArr2, 0, bArr, I5, bArr2.length);
            I4 = I5 + bVar.f.length;
        }
        int I6 = I(bArr, i, I4);
        if (this.B != null) {
            I6 = I(bArr, this.B.size(), J(bArr, this.C + 2, I(bArr, sI, I6)));
            for (int i10 = 0; i10 < this.B.size(); i10++) {
                c cVar = (c) this.B.get(i10);
                byte[] bArr3 = cVar.a;
                System.arraycopy(bArr3, 0, bArr, I6, bArr3.length);
                I6 += cVar.a.length;
            }
        }
        if (i2 != 0) {
            I6 = I(bArr, i2, J(bArr, 2, I(bArr, sI2, I6)));
        }
        if (I6 == i6) {
            return bArr;
        }
        com.google.gson.b.l();
        return null;
    }

    public final void Q(int i, int i2, int i3) {
        if (i3 == 0) {
            c(i);
            return;
        }
        if (i3 == 1) {
            c(i + 1);
            return;
        }
        if (i3 == 2) {
            c(i + 2);
        } else if (i3 != 3) {
            d(i2, i3);
        } else {
            c(i + 3);
        }
    }

    public final int b() {
        int i = this.x;
        int[] iArr = this.w;
        if (iArr == null || i == iArr.length) {
            if (iArr == null) {
                this.w = new int[32];
            } else {
                int[] iArr2 = new int[iArr.length * 2];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                this.w = iArr2;
            }
        }
        this.x = i + 1;
        this.w[i] = -1;
        return i | Integer.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    public final void c(int i) {
        if (i != 254 && i != 255) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case Token.GETPROP /* 33 */:
                case Token.GETPROPNOWARN /* 34 */:
                case 35:
                case Token.GETPROPNOWARN_SUPER /* 36 */:
                case Token.SETPROP /* 37 */:
                case Token.SETPROP_SUPER /* 38 */:
                case Token.GETELEM /* 39 */:
                case Token.GETELEM_SUPER /* 40 */:
                case Token.SETELEM /* 41 */:
                case Token.SETELEM_SUPER /* 42 */:
                case Token.CALL /* 43 */:
                case Token.NAME /* 44 */:
                case Token.NUMBER /* 45 */:
                case Token.STRING /* 46 */:
                case Token.NULL /* 47 */:
                case Token.THIS /* 48 */:
                case Token.FALSE /* 49 */:
                case Token.TRUE /* 50 */:
                case Token.SHEQ /* 51 */:
                case Token.SHNE /* 52 */:
                case Token.REGEXP /* 53 */:
                case Token.LOCAL_LOAD /* 59 */:
                case 60:
                case 61:
                case Token.CATCH_SCOPE /* 62 */:
                case Token.ENUM_INIT_KEYS /* 63 */:
                case Token.ENUM_INIT_VALUES /* 64 */:
                case Token.ENUM_INIT_ARRAY /* 65 */:
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                case Token.ENUM_NEXT /* 67 */:
                case Token.ENUM_ID /* 68 */:
                case Token.THISFN /* 69 */:
                case Token.RETURN_RESULT /* 70 */:
                case Token.ARRAYLIT /* 71 */:
                case Token.OBJECTLIT /* 72 */:
                case Token.GET_REF /* 73 */:
                case Token.SET_REF /* 74 */:
                case Token.DEL_REF /* 75 */:
                case Token.REF_CALL /* 76 */:
                case Token.REF_SPECIAL /* 77 */:
                case Token.YIELD /* 78 */:
                case Token.SUPER /* 79 */:
                case Token.STRICT_SETNAME /* 80 */:
                case Token.EXP /* 81 */:
                case Token.DEFAULTNAMESPACE /* 82 */:
                case Token.ESCXMLATTR /* 83 */:
                case Token.ESCXMLTEXT /* 84 */:
                case Token.REF_MEMBER /* 85 */:
                case Token.REF_NS_MEMBER /* 86 */:
                case Token.REF_NAME /* 87 */:
                case Token.REF_NS_NAME /* 88 */:
                case 89:
                case Token.TRY /* 90 */:
                case Token.SEMI /* 91 */:
                case Token.LB /* 92 */:
                case Token.RB /* 93 */:
                case Token.LC /* 94 */:
                case Token.RC /* 95 */:
                case Token.LP /* 96 */:
                case Token.RP /* 97 */:
                case Token.COMMA /* 98 */:
                case 99:
                case 100:
                case Token.ASSIGN_LOGICAL_OR /* 101 */:
                case Token.ASSIGN_BITXOR /* 102 */:
                case Token.ASSIGN_BITAND /* 103 */:
                case Token.ASSIGN_LOGICAL_AND /* 104 */:
                case Token.ASSIGN_LSH /* 105 */:
                case Token.ASSIGN_RSH /* 106 */:
                case Token.ASSIGN_URSH /* 107 */:
                case Token.ASSIGN_ADD /* 108 */:
                case Token.ASSIGN_SUB /* 109 */:
                case 110:
                case Token.ASSIGN_DIV /* 111 */:
                case Token.ASSIGN_MOD /* 112 */:
                case Token.ASSIGN_EXP /* 113 */:
                case 114:
                case Token.HOOK /* 115 */:
                case Token.COLON /* 116 */:
                case Token.OR /* 117 */:
                case Token.AND /* 118 */:
                case Token.INC /* 119 */:
                case 120:
                case Token.DOT /* 121 */:
                case Token.FUNCTION /* 122 */:
                case Token.EXPORT /* 123 */:
                case Token.IMPORT /* 124 */:
                case Token.IF /* 125 */:
                case Token.ELSE /* 126 */:
                case 127:
                case 128:
                case Token.DEFAULT /* 129 */:
                case 130:
                case Token.DO /* 131 */:
                case Token.BREAK /* 133 */:
                case Token.CONTINUE /* 134 */:
                case Token.VAR /* 135 */:
                case Token.WITH /* 136 */:
                case Token.CATCH /* 137 */:
                case Token.FINALLY /* 138 */:
                case Token.VOID /* 139 */:
                case 140:
                case Token.EMPTY /* 141 */:
                case Token.COMPUTED_PROPERTY /* 142 */:
                case Token.BLOCK /* 143 */:
                case Token.LABEL /* 144 */:
                case Token.TARGET /* 145 */:
                case Token.LOOP /* 146 */:
                case Token.EXPR_VOID /* 147 */:
                case Token.EXPR_RESULT /* 148 */:
                case Token.JSR /* 149 */:
                case 150:
                case Token.TYPEOFNAME /* 151 */:
                case Token.USE_STACK /* 152 */:
                case Token.LETEXPR /* 172 */:
                case Token.WITHEXPR /* 173 */:
                case Token.DEBUGGER /* 174 */:
                case Token.COMMENT /* 175 */:
                case Token.GENEXPR /* 176 */:
                case Token.METHOD /* 177 */:
                    break;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case Token.BINDNAME /* 54 */:
                case Token.THROW /* 55 */:
                case Token.RETHROW /* 56 */:
                case Token.IN /* 57 */:
                case Token.INSTANCEOF /* 58 */:
                case Token.FOR /* 132 */:
                case Token.SETPROP_OP /* 153 */:
                case Token.SETELEM_OP /* 154 */:
                case Token.LOCAL_BLOCK /* 155 */:
                case Token.SET_REF_OP /* 156 */:
                case Token.DOTDOT /* 157 */:
                case Token.COLONCOLON /* 158 */:
                case Token.XML /* 159 */:
                case 160:
                case Token.XMLATTR /* 161 */:
                case Token.XMLEND /* 162 */:
                case Token.TO_OBJECT /* 163 */:
                case Token.TO_DOUBLE /* 164 */:
                case Token.GET /* 165 */:
                case Token.SET /* 166 */:
                case Token.LET /* 167 */:
                case Token.CONST /* 168 */:
                case Token.SETCONST /* 169 */:
                case 170:
                case Token.ARRAYCOMP /* 171 */:
                case Token.ARROW /* 178 */:
                case Token.YIELD_STAR /* 179 */:
                case 180:
                case Token.TEMPLATE_CHARS /* 181 */:
                case Token.TEMPLATE_LITERAL_SUBST /* 182 */:
                case Token.TAGGED_TEMPLATE_LITERAL /* 183 */:
                case Token.DOTDOTDOT /* 184 */:
                case 185:
                    net.luminis.tls.engine.impl.c.o("Unexpected operands");
                    return;
                default:
                    switch (i) {
                        case Token.LAST_TOKEN /* 187 */:
                        case 188:
                        case 189:
                        case 192:
                        case 193:
                        case 197:
                        case 198:
                        case 199:
                        case Context.VERSION_ES6 /* 200 */:
                        case 201:
                            net.luminis.tls.engine.impl.c.o("Unexpected operands");
                            return;
                        case 190:
                        case 191:
                        case 194:
                        case 195:
                        case 196:
                        case 202:
                            break;
                        default:
                            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Bad opcode: "));
                            return;
                    }
                    break;
            }
        }
        int iM = M(i) + this.m;
        if (iM < 0 || 32767 < iM) {
            A(iM);
            throw null;
        }
        x(i);
        short s = (short) iM;
        this.m = s;
        if (iM > this.n) {
            this.n = s;
        }
        if (i == 191) {
            v(this.j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003f A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:55:0x00b1 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:71:0x0103  */
    /* JADX WARN: Code duplicated, block: B:73:0x010b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0117  */
    /* JADX WARN: Code duplicated, block: B:79:0x011e  */
    /* JADX WARN: Code duplicated, block: B:81:0x013b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0141  */
    public final void d(int i, int i2) {
        int i3;
        int i4;
        int iC;
        int i5;
        int i6;
        int i7;
        long[] jArr;
        int iM = M(i) + this.m;
        if (iM < 0 || 32767 < iM) {
            A(iM);
            throw null;
        }
        if (i == 180 || i == 181) {
            if (i2 < 0 || i2 >= 65536) {
                net.luminis.tls.engine.impl.c.o("out of range field");
                return;
            } else {
                x(i);
                y(i2);
            }
        } else if (i != 188) {
            if (i == 198 || i == 199) {
                i3 = i2 & Integer.MIN_VALUE;
                if (i3 == Integer.MIN_VALUE && (i2 < 0 || i2 > 65535)) {
                    net.luminis.tls.engine.impl.c.o("Bad label for branch");
                    return;
                }
                i4 = this.j;
                x(i);
                if (i3 != Integer.MIN_VALUE) {
                    y(i2);
                    int i8 = i2 + i4;
                    v(i8);
                    this.c.put(Integer.valueOf(i8), Integer.valueOf(i4));
                } else {
                    iC = C(i2);
                    if (iC != -1) {
                        y(iC - i4);
                        v(iC);
                        this.c.put(Integer.valueOf(iC), Integer.valueOf(i4));
                    } else {
                        i5 = i4 + 1;
                        if (i2 < 0) {
                            net.luminis.tls.engine.impl.c.o("Bad label, no biscuit");
                            return;
                        }
                        i6 = Integer.MAX_VALUE & i2;
                        if (i6 < this.x) {
                            net.luminis.tls.engine.impl.c.o("Bad label");
                            return;
                        }
                        i7 = this.z;
                        jArr = this.y;
                        if (jArr != null || i7 == jArr.length) {
                            if (jArr == null) {
                                this.y = new long[40];
                            } else {
                                long[] jArr2 = new long[jArr.length * 2];
                                System.arraycopy(jArr, 0, jArr2, 0, i7);
                                this.y = jArr2;
                            }
                        }
                        this.z = i7 + 1;
                        this.y[i7] = (((long) i6) << 32) | ((long) i5);
                        y(0);
                    }
                }
            } else {
                switch (i) {
                    case 16:
                        byte b = (byte) i2;
                        if (b != i2) {
                            net.luminis.tls.engine.impl.c.o("out of range byte");
                            return;
                        } else {
                            x(i);
                            x(b);
                        }
                        break;
                    case 17:
                        if (((short) i2) != i2) {
                            net.luminis.tls.engine.impl.c.o("out of range short");
                            return;
                        } else {
                            x(i);
                            y(i2);
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                        if (i2 < 0 || i2 >= 65536) {
                            throw new d("out of range index");
                        }
                        if (i2 >= 256 || i == 19 || i == 20) {
                            if (i == 18) {
                                x(19);
                            } else {
                                x(i);
                            }
                            y(i2);
                        } else {
                            x(i);
                            x(i2);
                        }
                        break;
                    default:
                        switch (i) {
                            default:
                                switch (i) {
                                    case Token.LET /* 167 */:
                                        v(this.j + 3);
                                    case Token.SETPROP_OP /* 153 */:
                                    case Token.SETELEM_OP /* 154 */:
                                    case Token.LOCAL_BLOCK /* 155 */:
                                    case Token.SET_REF_OP /* 156 */:
                                    case Token.DOTDOT /* 157 */:
                                    case Token.COLONCOLON /* 158 */:
                                    case Token.XML /* 159 */:
                                    case 160:
                                    case Token.XMLATTR /* 161 */:
                                    case Token.XMLEND /* 162 */:
                                    case Token.TO_OBJECT /* 163 */:
                                    case Token.TO_DOUBLE /* 164 */:
                                    case Token.GET /* 165 */:
                                    case Token.SET /* 166 */:
                                    case Token.CONST /* 168 */:
                                        i3 = i2 & Integer.MIN_VALUE;
                                        if (i3 == Integer.MIN_VALUE) {
                                        }
                                        i4 = this.j;
                                        x(i);
                                        if (i3 != Integer.MIN_VALUE) {
                                            y(i2);
                                            int i9 = i2 + i4;
                                            v(i9);
                                            this.c.put(Integer.valueOf(i9), Integer.valueOf(i4));
                                        } else {
                                            iC = C(i2);
                                            if (iC != -1) {
                                                y(iC - i4);
                                                v(iC);
                                                this.c.put(Integer.valueOf(iC), Integer.valueOf(i4));
                                            } else {
                                                i5 = i4 + 1;
                                                if (i2 < 0) {
                                                    net.luminis.tls.engine.impl.c.o("Bad label, no biscuit");
                                                    return;
                                                }
                                                i6 = Integer.MAX_VALUE & i2;
                                                if (i6 < this.x) {
                                                    net.luminis.tls.engine.impl.c.o("Bad label");
                                                    return;
                                                }
                                                i7 = this.z;
                                                jArr = this.y;
                                                if (jArr != null) {
                                                    if (jArr == null) {
                                                        this.y = new long[40];
                                                    } else {
                                                        long[] jArr3 = new long[jArr.length * 2];
                                                        System.arraycopy(jArr, 0, jArr3, 0, i7);
                                                        this.y = jArr3;
                                                    }
                                                } else if (jArr == null) {
                                                    this.y = new long[40];
                                                } else {
                                                    long[] jArr4 = new long[jArr.length * 2];
                                                    System.arraycopy(jArr, 0, jArr4, 0, i7);
                                                    this.y = jArr4;
                                                }
                                                this.z = i7 + 1;
                                                this.y[i7] = (((long) i6) << 32) | ((long) i5);
                                                y(0);
                                            }
                                        }
                                        break;
                                    case Token.SETCONST /* 169 */:
                                        break;
                                    default:
                                        net.luminis.tls.engine.impl.c.o("Unexpected opcode for 1 operand");
                                        return;
                                }
                            case Token.BINDNAME /* 54 */:
                            case Token.THROW /* 55 */:
                            case Token.RETHROW /* 56 */:
                            case Token.IN /* 57 */:
                            case Token.INSTANCEOF /* 58 */:
                                if (i2 >= 0 || 65536 <= i2) {
                                    throw new d("out of range variable");
                                }
                                if (i2 < 256) {
                                    x(i);
                                    x(i2);
                                } else {
                                    x(196);
                                    x(i);
                                    y(i2);
                                }
                                break;
                        }
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                        if (i2 >= 0) {
                        }
                        throw new d("out of range variable");
                }
            }
        } else if (i2 < 0 || i2 >= 256) {
            net.luminis.tls.engine.impl.c.o("out of range index");
            return;
        } else {
            x(i);
            x(i2);
        }
        short s = (short) iM;
        this.m = s;
        if (iM > this.n) {
            this.n = s;
        }
    }

    public final void e(int i, String str) {
        int iM = M(i) + this.m;
        if (iM < 0 || 32767 < iM) {
            A(iM);
            throw null;
        }
        if (i != 187 && i != 189 && i != 192 && i != 193) {
            net.luminis.tls.engine.impl.c.o("bad opcode for class reference");
            return;
        }
        short sA = this.k.a(str);
        x(i);
        y(sA);
        short s = (short) iM;
        this.m = s;
        if (iM > this.n) {
            this.n = s;
        }
    }

    public final void f(String str, int i, String str2, String str3) {
        int i2;
        int iM = M(i) + this.m;
        char cCharAt = str3.charAt(0);
        int i3 = (cCharAt == 'J' || cCharAt == 'D') ? 2 : 1;
        switch (i) {
            case Token.ARROW /* 178 */:
            case 180:
                i2 = iM + i3;
                break;
            case Token.YIELD_STAR /* 179 */:
            case Token.TEMPLATE_CHARS /* 181 */:
                i2 = iM - i3;
                break;
            default:
                net.luminis.tls.engine.impl.c.o("bad opcode for field reference");
                return;
        }
        if (i2 < 0 || 32767 < i2) {
            A(i2);
            throw null;
        }
        h hVar = this.k;
        hVar.getClass();
        j jVar = new j(str, str2, str3);
        HashMap map = hVar.d;
        int iIntValue = ((Integer) map.getOrDefault(jVar, -1)).intValue();
        if (iIntValue == -1) {
            short sH = hVar.h(str2, str3);
            short sA = hVar.a(str);
            hVar.j(5);
            byte[] bArr = hVar.l;
            int i4 = hVar.h;
            int i5 = i4 + 1;
            hVar.h = i5;
            bArr[i4] = 9;
            int I = I(bArr, sA, i5);
            hVar.h = I;
            hVar.h = I(hVar.l, sH, I);
            iIntValue = hVar.i;
            hVar.i = iIntValue + 1;
            map.put(jVar, Integer.valueOf(iIntValue));
        }
        hVar.m(iIntValue, jVar);
        hVar.k.put(Integer.valueOf(iIntValue), (byte) 9);
        x(i);
        y((short) iIntValue);
        short s = (short) i2;
        this.m = s;
        if (i2 > this.n) {
            this.n = s;
        }
    }

    public final void g(int i) {
        Q(42, 25, i);
    }

    public final void h(int i) {
        Q(75, 58, i);
    }

    public final void i(int i) {
        Q(38, 24, i);
    }

    public final void j(int i, String str, int i2, int i3) {
        if ((i & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
            net.luminis.tls.engine.impl.c.o("Bad startLabel");
            return;
        }
        if ((i2 & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
            net.luminis.tls.engine.impl.c.o("Bad endLabel");
            return;
        }
        if ((i3 & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
            net.luminis.tls.engine.impl.c.o("Bad handlerLabel");
            return;
        }
        short sA = str == null ? (short) 0 : this.k.a(str);
        i iVar = new i();
        iVar.a = i;
        iVar.b = i2;
        iVar.c = i3;
        iVar.d = sA;
        int i4 = this.f;
        if (i4 == 0) {
            this.e = new i[4];
        } else {
            i[] iVarArr = this.e;
            if (i4 == iVarArr.length) {
                i[] iVarArr2 = new i[i4 * 2];
                System.arraycopy(iVarArr, 0, iVarArr2, 0, i4);
                this.e = iVarArr2;
            }
        }
        this.e[i4] = iVar;
        this.f = i4 + 1;
    }

    public final void k(String str, String str2, short s) {
        h hVar = this.k;
        short sI = hVar.i(str);
        short sI2 = hVar.i(str2);
        a aVar = new a();
        aVar.a = sI;
        aVar.b = sI2;
        aVar.c = s;
        this.q.add(aVar);
    }

    public final void l(int i) {
        Q(26, 21, i);
    }

    public final void m(String str, int i, String str2, String str3) {
        int iL = L(str3);
        int i2 = iL >>> 16;
        int iM = M(i) + this.m + ((short) iL);
        if (iM < 0 || 32767 < iM) {
            A(iM);
            throw null;
        }
        switch (i) {
            case Token.TEMPLATE_LITERAL_SUBST /* 182 */:
            case Token.TAGGED_TEMPLATE_LITERAL /* 183 */:
            case Token.DOTDOTDOT /* 184 */:
            case 185:
                x(i);
                h hVar = this.k;
                if (i == 185) {
                    short sH = hVar.h(str2, str3);
                    short sA = hVar.a(str);
                    hVar.j(5);
                    byte[] bArr = hVar.l;
                    int i3 = hVar.h;
                    int i4 = i3 + 1;
                    hVar.h = i4;
                    bArr[i3] = 11;
                    int I = I(bArr, sA, i4);
                    hVar.h = I;
                    hVar.h = I(hVar.l, sH, I);
                    hVar.m(hVar.i, new j(str, str2, str3));
                    hVar.k.put(Integer.valueOf(hVar.i), (byte) 11);
                    int i5 = hVar.i;
                    hVar.i = i5 + 1;
                    y((short) i5);
                    x(i2 + 1);
                    x(0);
                } else {
                    y(hVar.g(str, str2, str3));
                }
                short s = (short) iM;
                this.m = s;
                if (iM > this.n) {
                    this.n = s;
                    return;
                }
                return;
            default:
                net.luminis.tls.engine.impl.c.o("bad opcode for method reference");
                return;
        }
    }

    public final void n(short s) {
        if (this.l == null) {
            net.luminis.tls.engine.impl.c.o("No method to stop");
            return;
        }
        int i = this.h;
        if (i == 0) {
            this.g = new int[16];
        } else {
            int[] iArr = this.g;
            if (i == iArr.length) {
                int[] iArr2 = new int[i * 2];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                this.g = iArr2;
            }
        }
        this.g[i] = (this.j << 16) + s;
        this.h = i + 1;
    }

    public final void o(int i) {
        if (i == 0) {
            c(3);
            return;
        }
        if (i == 1) {
            c(4);
            return;
        }
        if (i == 2) {
            c(5);
            return;
        }
        if (i == 3) {
            c(6);
            return;
        }
        if (i == 4) {
            c(7);
        } else if (i != 5) {
            d(18, this.k.c(i));
        } else {
            c(8);
        }
    }

    public final void p() {
        c(42);
    }

    public final void q(double d) {
        if (d == 0.0d) {
            c(14);
            if (1.0d / d < 0.0d) {
                c(Token.INC);
                return;
            }
            return;
        }
        if (d != 1.0d && d != -1.0d) {
            d(20, this.k.b(d));
            return;
        }
        c(15);
        if (d < 0.0d) {
            c(Token.INC);
        }
    }

    public final void r(int i) {
        byte b = (byte) i;
        if (b != i) {
            short s = (short) i;
            if (s == i) {
                d(17, s);
                return;
            } else {
                o(i);
                return;
            }
        }
        if (i == -1) {
            c(2);
        } else if (i < 0 || i > 5) {
            d(16, b);
        } else {
            c((byte) (i + 3));
        }
    }

    public final void s(String str) {
        int length = str.length();
        h hVar = this.k;
        hVar.getClass();
        int i = 0;
        int iL = h.l(0, length, str);
        if (iL == length) {
            d(18, hVar.e(str));
            return;
        }
        e(Token.LAST_TOKEN, "java/lang/StringBuilder");
        c(89);
        r(length);
        m("java/lang/StringBuilder", Token.TAGGED_TEMPLATE_LITERAL, "<init>", "(I)V");
        while (true) {
            c(89);
            d(18, hVar.e(str.substring(i, iL)));
            m("java/lang/StringBuilder", Token.TEMPLATE_LITERAL_SUBST, "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;");
            c(87);
            if (iL == length) {
                m("java/lang/StringBuilder", Token.TEMPLATE_LITERAL_SUBST, "toString", "()Ljava/lang/String;");
                return;
            } else {
                int i2 = iL;
                iL = h.l(iL, length, str);
                i = i2;
            }
        }
    }

    public final void t(boolean z) {
        c(z ? 4 : 3);
    }

    public final int u(int i) {
        if (this.l == null) {
            net.luminis.tls.engine.impl.c.o("No method to add to");
            return 0;
        }
        int i2 = this.j;
        int i3 = i + i2;
        byte[] bArr = this.i;
        if (i3 > bArr.length) {
            int length = bArr.length * 2;
            if (i3 > length) {
                length = i3;
            }
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            this.i = bArr2;
        }
        this.j = i3;
        return i2;
    }

    public final void v(int i) {
        if (G) {
            int[] iArr = this.a;
            if (iArr == null) {
                this.a = new int[4];
            } else {
                int length = iArr.length;
                int i2 = this.b;
                if (length == i2) {
                    int[] iArr2 = new int[i2 * 2];
                    System.arraycopy(iArr, 0, iArr2, 0, i2);
                    this.a = iArr2;
                }
            }
            int[] iArr3 = this.a;
            int i3 = this.b;
            this.b = i3 + 1;
            iArr3[i3] = i;
        }
    }

    public final int w(int i, int i2) {
        byte[] bArr;
        if (i > i2) {
            throw new d(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("Bad bounds: ", i, " ", i2));
        }
        int iM = M(170) + this.m;
        if (iM < 0 || 32767 < iM) {
            A(iM);
            throw null;
        }
        int i3 = (~this.j) & 3;
        int iU = u((((i2 - i) + 4) * 4) + i3 + 1);
        int i4 = iU + 1;
        this.i[iU] = -86;
        while (true) {
            bArr = this.i;
            if (i3 == 0) {
                break;
            }
            bArr[i4] = 0;
            i3--;
            i4++;
        }
        J(this.i, i2, J(bArr, i, i4 + 4));
        short s = (short) iM;
        this.m = s;
        if (iM > this.n) {
            this.n = s;
        }
        return iU;
    }

    public final void x(int i) {
        this.i[u(1)] = (byte) i;
    }

    public final void y(int i) {
        I(this.i, i, u(2));
    }

    public final void z() {
        int i = this.m - 1;
        if (i < 0 || 32767 < i) {
            A(i);
            throw null;
        }
        short s = (short) i;
        this.m = s;
        if (i > this.n) {
            this.n = s;
        }
    }
}
