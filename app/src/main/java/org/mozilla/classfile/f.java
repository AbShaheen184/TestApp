package org.mozilla.classfile;

import java.util.Arrays;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final /* synthetic */ ClassFileWriter k;
    public k[] g = null;
    public int[] c = null;
    public int[] a = null;
    public k[] e = null;
    public byte[] h = null;
    public int b = 0;
    public int d = 0;
    public int f = 0;
    public int i = 0;
    public boolean j = false;

    public f(ClassFileWriter classFileWriter) {
        this.k = classFileWriter;
    }

    public final void a(k kVar) {
        if (kVar.g) {
            return;
        }
        kVar.g = true;
        kVar.f = true;
        int i = this.f;
        k[] kVarArr = this.e;
        if (i == kVarArr.length) {
            k[] kVarArr2 = new k[i * 2];
            System.arraycopy(kVarArr, 0, kVarArr2, 0, i);
            this.e = kVarArr2;
        }
        k[] kVarArr3 = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        kVarArr3[i2] = kVar;
    }

    public final void b(int i) {
        int i2 = i < this.b ? this.a[i] : 0;
        int i3 = i2 & 255;
        if (i3 == 7 || i3 == 6 || i3 == 8 || i3 == 5) {
            j(i2);
        } else {
            net.luminis.tls.engine.impl.c.r(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("bad local variable type: ", i2, " at index: ", i));
        }
    }

    public final void c(int i, int i2) {
        h();
        int i3 = this.b;
        if (i >= i3) {
            int i4 = i + 1;
            int[] iArr = new int[i4];
            System.arraycopy(this.a, 0, iArr, 0, i3);
            this.a = iArr;
            this.b = i4;
        }
        this.a[i] = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:186:0x049d  */
    /* JADX WARN: Code duplicated, block: B:188:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:198:0x04be  */
    /* JADX WARN: Code duplicated, block: B:199:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:200:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:204:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:207:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:209:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:210:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:212:0x04db  */
    /* JADX WARN: Code duplicated, block: B:214:0x0506 A[LOOP:3: B:213:0x0504->B:214:0x0506, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x0519 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:217:0x0524  */
    /* JADX WARN: Code duplicated, block: B:218:0x052d  */
    /* JADX WARN: Code duplicated, block: B:222:0x0540  */
    /* JADX WARN: Code duplicated, block: B:224:0x0552 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:279:0x058c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [org.mozilla.classfile.f] */
    /* JADX WARN: Type inference failed for: r8v126 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    public final void d() {
        int iMax;
        int iMin;
        int i;
        int i2;
        int i3;
        int iF;
        int iH;
        int iH2;
        char c;
        int i4;
        int iF2;
        int i5;
        int iC;
        int i6;
        int iF3;
        int i7;
        int i8;
        while (true) {
            int i9 = this.f;
            if (i9 <= 0) {
                return;
            }
            k[] kVarArr = this.e;
            int i10 = i9 - 1;
            this.f = i10;
            k kVar = kVarArr[i10];
            int i11 = 0;
            kVar.g = false;
            int i12 = kVar.b;
            int i13 = kVar.c;
            int[] iArr = kVar.d;
            int[] iArr2 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.a = iArr2;
            int[] iArr3 = kVar.e;
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            this.c = iArr4;
            this.b = this.a.length;
            this.d = length;
            ClassFileWriter classFileWriter = this.k;
            int i14 = classFileWriter.f;
            h hVar = classFileWriter.k;
            boolean z = true;
            if (i14 > 1) {
                iMin = Integer.MAX_VALUE;
                iMax = 0;
                for (int i15 = 0; i15 < classFileWriter.f; i15++) {
                    i iVar = classFileWriter.e[i15];
                    if (i13 >= classFileWriter.C(iVar.a) && i12 < classFileWriter.C(iVar.b)) {
                        iMin = Math.min(iMin, i15);
                        iMax = Math.max(iMax, i15 + 1);
                    }
                }
            } else {
                iMax = i14;
                iMin = 0;
            }
            int i16 = 0;
            while (i12 < i13) {
                i16 = classFileWriter.i[i12] & 255;
                ?? r8 = z;
                switch (i16) {
                    case 0:
                    case Token.FOR /* 132 */:
                    case Token.LET /* 167 */:
                    case Context.VERSION_ES6 /* 200 */:
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z2 = this.j;
                            if (i16 == 254 && i16 != 255) {
                                switch (i16) {
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
                                        i = 1;
                                        break;
                                    case 16:
                                    case 18:
                                        i = 2;
                                        break;
                                    case 17:
                                    case 19:
                                    case 20:
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
                                        i = 3;
                                        break;
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
                                    case Token.SETCONST /* 169 */:
                                        if (z2) {
                                            i = 3;
                                        } else {
                                            i = 2;
                                        }
                                        break;
                                    case Token.FOR /* 132 */:
                                        if (!z2) {
                                            i = 3;
                                        }
                                        break;
                                    default:
                                        switch (i16) {
                                            case Token.LETEXPR /* 172 */:
                                            case Token.WITHEXPR /* 173 */:
                                            case Token.DEBUGGER /* 174 */:
                                            case Token.COMMENT /* 175 */:
                                            case Token.GENEXPR /* 176 */:
                                            case Token.METHOD /* 177 */:
                                            case 190:
                                            case 191:
                                            case 194:
                                            case 195:
                                            case 196:
                                            case 202:
                                                i = 1;
                                                break;
                                            case Token.ARROW /* 178 */:
                                            case Token.YIELD_STAR /* 179 */:
                                            case 180:
                                            case Token.TEMPLATE_CHARS /* 181 */:
                                            case Token.TEMPLATE_LITERAL_SUBST /* 182 */:
                                            case Token.TAGGED_TEMPLATE_LITERAL /* 183 */:
                                            case Token.DOTDOTDOT /* 184 */:
                                            case Token.LAST_TOKEN /* 187 */:
                                            case 189:
                                            case 192:
                                            case 193:
                                            case 198:
                                            case 199:
                                                i = 3;
                                                break;
                                            case 185:
                                            case Token.QUESTION_DOT /* 186 */:
                                            case Context.VERSION_ES6 /* 200 */:
                                            case 201:
                                                break;
                                            case 188:
                                                i = 2;
                                                break;
                                            case 197:
                                                i = 4;
                                                break;
                                            default:
                                                net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i16, "Bad opcode: "));
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j || i16 == 196) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                            this.j = false;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i17 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i17, 4) + i12));
                                            iF3 = (f(i17 + 8, 4) - f(i17 + 4, 4)) + 1;
                                            i7 = i17 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        for (i5 = iMin; i5 < iMax; i5++) {
                            i iVar2 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar2.a);
                            int iC2 = classFileWriter.C(iVar2.b);
                            if (i12 < iC && i12 < iC2) {
                                k kVarG = g(classFileWriter.C(iVar2.c));
                                short s = iVar2.d;
                                kVarG.b(this.a, this.b, new int[]{s == 0 ? com.google.android.material.sidesheet.b.a(hVar.a("java/lang/Throwable")) : com.google.android.material.sidesheet.b.a(s)}, 1, classFileWriter.k);
                                a(kVarG);
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case 1:
                        i = 5;
                        j(5);
                        iF = 0;
                        if (iF == 0) {
                            boolean z3 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i18 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i18, 4) + i12));
                                            iF3 = (f(i18 + 8, 4) - f(i18 + 4, 4)) + 1;
                                            i7 = i18 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar3 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar3.a);
                            int iC3 = classFileWriter.C(iVar3.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 16:
                    case 17:
                    case 21:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        j(r8);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z4 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i19 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i19, 4) + i12));
                                            iF3 = (f(i19 + 8, 4) - f(i19 + 4, 4)) + 1;
                                            i7 = i19 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar4 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar4.a);
                            int iC4 = classFileWriter.C(iVar4.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case 9:
                    case 10:
                    case 22:
                    case 30:
                    case 31:
                    case 32:
                    case Token.GETPROP /* 33 */:
                        j(4);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z5 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i110 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i110, 4) + i12));
                                            iF3 = (f(i110 + 8, 4) - f(i110 + 4, 4)) + 1;
                                            i7 = i110 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar5 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar5.a);
                            int iC5 = classFileWriter.C(iVar5.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case 11:
                    case 12:
                    case 13:
                    case 23:
                    case Token.GETPROPNOWARN /* 34 */:
                    case 35:
                    case Token.GETPROPNOWARN_SUPER /* 36 */:
                    case Token.SETPROP /* 37 */:
                        i2 = 2;
                        j(i2);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z6 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i111 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i111, 4) + i12));
                                            iF3 = (f(i111 + 8, 4) - f(i111 + 4, 4)) + 1;
                                            i7 = i111 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar6 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar6.a);
                            int iC6 = classFileWriter.C(iVar6.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case 14:
                    case 15:
                    case 24:
                    case Token.SETPROP_SUPER /* 38 */:
                    case Token.GETELEM /* 39 */:
                    case Token.GETELEM_SUPER /* 40 */:
                    case Token.SETELEM /* 41 */:
                        i3 = 3;
                        j(i3);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z7 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i112 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i112, 4) + i12));
                                            iF3 = (f(i112 + 8, 4) - f(i112 + 4, 4)) + 1;
                                            i7 = i112 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar7 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar7.a);
                            int iC7 = classFileWriter.C(iVar7.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case 18:
                    case 19:
                    case 20:
                        byte bByteValue = ((Byte) hVar.k.getOrDefault(Integer.valueOf(i16 == 18 ? f(i12 + 1, 1) : f(i12 + 1, 2)), (byte) 0)).byteValue();
                        if (bByteValue == 3) {
                            j(1);
                        } else if (bByteValue == 4) {
                            j(2);
                        } else if (bByteValue == 5) {
                            j(4);
                        } else if (bByteValue == 6) {
                            j(3);
                        } else if (bByteValue != 8) {
                            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(bByteValue, "bad const type "));
                        } else {
                            j(com.google.android.material.sidesheet.b.a(hVar.a("java/lang/String")));
                        }
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z8 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i113 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i113, 4) + i12));
                                            iF3 = (f(i113 + 8, 4) - f(i113 + 4, 4)) + 1;
                                            i7 = i113 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar8 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar8.a);
                            int iC8 = classFileWriter.C(iVar8.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case 25:
                        b(f(i12 + 1, this.j ? 2 : 1));
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z9 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i114 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i114, 4) + i12));
                                            iF3 = (f(i114 + 8, 4) - f(i114 + 4, 4)) + 1;
                                            i7 = i114 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar9 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar9.a);
                            int iC9 = classFileWriter.C(iVar9.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.SETELEM_SUPER /* 42 */:
                    case Token.CALL /* 43 */:
                    case Token.NAME /* 44 */:
                    case Token.NUMBER /* 45 */:
                        b(i16 - 42);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z10 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i115 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i115, 4) + i12));
                                            iF3 = (f(i115 + 8, 4) - f(i115 + 4, 4)) + 1;
                                            i7 = i115 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar10 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar10.a);
                            int iC10 = classFileWriter.C(iVar10.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.STRING /* 46 */:
                    case Token.SHEQ /* 51 */:
                    case Token.SHNE /* 52 */:
                    case Token.REGEXP /* 53 */:
                    case Token.LP /* 96 */:
                    case 100:
                    case Token.ASSIGN_LOGICAL_AND /* 104 */:
                    case Token.ASSIGN_ADD /* 108 */:
                    case Token.ASSIGN_MOD /* 112 */:
                    case 120:
                    case Token.FUNCTION /* 122 */:
                    case Token.IMPORT /* 124 */:
                    case Token.ELSE /* 126 */:
                    case 128:
                    case 130:
                    case Token.EXPR_RESULT /* 148 */:
                    case Token.JSR /* 149 */:
                    case 150:
                    case Token.TYPEOFNAME /* 151 */:
                    case Token.USE_STACK /* 152 */:
                        h();
                        h();
                        r8 = 1;
                        j(r8);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z11 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i116 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i116, 4) + i12));
                                            iF3 = (f(i116 + 8, 4) - f(i116 + 4, 4)) + 1;
                                            i7 = i116 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar11 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar11.a);
                            int iC11 = classFileWriter.C(iVar11.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.NULL /* 47 */:
                    case Token.RP /* 97 */:
                    case Token.ASSIGN_LOGICAL_OR /* 101 */:
                    case Token.ASSIGN_LSH /* 105 */:
                    case Token.ASSIGN_SUB /* 109 */:
                    case Token.ASSIGN_EXP /* 113 */:
                    case Token.DOT /* 121 */:
                    case Token.EXPORT /* 123 */:
                    case Token.IF /* 125 */:
                    case 127:
                    case Token.DEFAULT /* 129 */:
                    case Token.DO /* 131 */:
                        h();
                        h();
                        j(4);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z12 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i117 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i117, 4) + i12));
                                            iF3 = (f(i117 + 8, 4) - f(i117 + 4, 4)) + 1;
                                            i7 = i117 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar12 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar12.a);
                            int iC12 = classFileWriter.C(iVar12.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.THIS /* 48 */:
                    case Token.COMMA /* 98 */:
                    case Token.ASSIGN_BITXOR /* 102 */:
                    case Token.ASSIGN_RSH /* 106 */:
                    case 110:
                    case 114:
                        h();
                        h();
                        i2 = 2;
                        j(i2);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z13 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i118 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i118, 4) + i12));
                                            iF3 = (f(i118 + 8, 4) - f(i118 + 4, 4)) + 1;
                                            i7 = i118 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar13 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar13.a);
                            int iC13 = classFileWriter.C(iVar13.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.FALSE /* 49 */:
                    case 99:
                    case Token.ASSIGN_BITAND /* 103 */:
                    case Token.ASSIGN_URSH /* 107 */:
                    case Token.ASSIGN_DIV /* 111 */:
                    case Token.HOOK /* 115 */:
                        h();
                        h();
                        i3 = 3;
                        j(i3);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z14 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i119 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i119, 4) + i12));
                                            iF3 = (f(i119 + 8, 4) - f(i119 + 4, 4)) + 1;
                                            i7 = i119 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar14 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar14.a);
                            int iC14 = classFileWriter.C(iVar14.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.TRUE /* 50 */:
                        h();
                        String str = (String) hVar.k(h() >>> 8);
                        if (str.charAt(0) == '[') {
                            j(com.google.android.material.sidesheet.b.a(hVar.a(ClassFileWriter.B(str.substring(z ? 1 : 0)))));
                            i = 5;
                            iF = 0;
                            if (iF == 0) {
                                boolean z15 = this.j;
                                if (i16 == 254) {
                                    i = 1;
                                } else {
                                    i = 1;
                                }
                                iF = i;
                            }
                            if (this.j) {
                                i4 = 0;
                            } else {
                                i4 = 0;
                            }
                            switch (i16) {
                                default:
                                    switch (i16) {
                                        case 198:
                                        case 199:
                                        case Context.VERSION_ES6 /* 200 */:
                                            break;
                                        default:
                                            if (i16 == 170) {
                                                int i1110 = i12 + 1 + ((~i12) & 3);
                                                i6 = 4;
                                                e(g(f(i1110, 4) + i12));
                                                iF3 = (f(i1110 + 8, 4) - f(i1110 + 4, 4)) + 1;
                                                i7 = i1110 + 12;
                                                i8 = i4;
                                                while (i8 < iF3) {
                                                    e(g(f((i8 * 4) + i7, i6) + i12));
                                                    i8++;
                                                    i6 = 4;
                                                }
                                            }
                                            break;
                                    }
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
                                    if ((classFileWriter.i[i12] & 255) == 200) {
                                        iF2 = f(i12 + 1, 4) + i12;
                                    } else {
                                        iF2 = ((short) f(i12 + 1, 2)) + i12;
                                    }
                                    e(g(iF2));
                                    break;
                            }
                            while (i5 < iMax) {
                                i iVar15 = classFileWriter.e[i5];
                                iC = classFileWriter.C(iVar15.a);
                                int iC15 = classFileWriter.C(iVar15.b);
                                if (i12 < iC) {
                                }
                            }
                            i12 += iF;
                            i11 = i4;
                            z = true;
                        } else {
                            net.luminis.tls.engine.impl.c.r("bad array type");
                        }
                        break;
                    case Token.BINDNAME /* 54 */:
                        c(f(i12 + 1, this.j ? 2 : 1), 1);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z16 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i1111 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i1111, 4) + i12));
                                            iF3 = (f(i1111 + 8, 4) - f(i1111 + 4, 4)) + 1;
                                            i7 = i1111 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar16 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar16.a);
                            int iC16 = classFileWriter.C(iVar16.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.THROW /* 55 */:
                        c(f(i12 + 1, this.j ? 2 : 1), 4);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z17 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i1112 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i1112, 4) + i12));
                                            iF3 = (f(i1112 + 8, 4) - f(i1112 + 4, 4)) + 1;
                                            i7 = i1112 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar17 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar17.a);
                            int iC17 = classFileWriter.C(iVar17.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.RETHROW /* 56 */:
                        c(f(i12 + 1, this.j ? 2 : 1), 2);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z18 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i1113 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i1113, 4) + i12));
                                            iF3 = (f(i1113 + 8, 4) - f(i1113 + 4, 4)) + 1;
                                            i7 = i1113 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar18 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar18.a);
                            int iC18 = classFileWriter.C(iVar18.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.IN /* 57 */:
                        c(f(i12 + 1, this.j ? 2 : 1), 3);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z19 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i1114 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i1114, 4) + i12));
                                            iF3 = (f(i1114 + 8, 4) - f(i1114 + 4, 4)) + 1;
                                            i7 = i1114 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar19 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar19.a);
                            int iC19 = classFileWriter.C(iVar19.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.INSTANCEOF /* 58 */:
                        int iF4 = f(i12 + 1, this.j ? 2 : 1);
                        int iH3 = h();
                        int i20 = this.b;
                        if (iF4 >= i20) {
                            int i21 = iF4 + 1;
                            int[] iArr5 = new int[i21];
                            System.arraycopy(this.a, 0, iArr5, 0, i20);
                            this.a = iArr5;
                            this.b = i21;
                        }
                        this.a[iF4] = iH3;
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z110 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i1115 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i1115, 4) + i12));
                                            iF3 = (f(i1115 + 8, 4) - f(i1115 + 4, 4)) + 1;
                                            i7 = i1115 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar110 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar110.a);
                            int iC110 = classFileWriter.C(iVar110.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.LOCAL_LOAD /* 59 */:
                    case 60:
                    case 61:
                    case Token.CATCH_SCOPE /* 62 */:
                        boolean z20 = z ? 1 : 0;
                        c(i16 - 59, z ? 1 : 0);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z111 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i1116 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i1116, 4) + i12));
                                            iF3 = (f(i1116 + 8, 4) - f(i1116 + 4, 4)) + 1;
                                            i7 = i1116 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar111 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar111.a);
                            int iC111 = classFileWriter.C(iVar111.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.ENUM_INIT_KEYS /* 63 */:
                    case Token.ENUM_INIT_VALUES /* 64 */:
                    case Token.ENUM_INIT_ARRAY /* 65 */:
                    case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                        boolean z21 = z ? 1 : 0;
                        c(i16 - 63, 4);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z112 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i1117 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i1117, 4) + i12));
                                            iF3 = (f(i1117 + 8, 4) - f(i1117 + 4, 4)) + 1;
                                            i7 = i1117 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar112 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar112.a);
                            int iC112 = classFileWriter.C(iVar112.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.ENUM_NEXT /* 67 */:
                    case Token.ENUM_ID /* 68 */:
                    case Token.THISFN /* 69 */:
                    case Token.RETURN_RESULT /* 70 */:
                        boolean z22 = z ? 1 : 0;
                        c(i16 - 67, 2);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z113 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i1118 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i1118, 4) + i12));
                                            iF3 = (f(i1118 + 8, 4) - f(i1118 + 4, 4)) + 1;
                                            i7 = i1118 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar113 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar113.a);
                            int iC113 = classFileWriter.C(iVar113.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.ARRAYLIT /* 71 */:
                    case Token.OBJECTLIT /* 72 */:
                    case Token.GET_REF /* 73 */:
                    case Token.SET_REF /* 74 */:
                        boolean z23 = z ? 1 : 0;
                        c(i16 - 71, 3);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z114 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i1119 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i1119, 4) + i12));
                                            iF3 = (f(i1119 + 8, 4) - f(i1119 + 4, 4)) + 1;
                                            i7 = i1119 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar114 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar114.a);
                            int iC114 = classFileWriter.C(iVar114.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.DEL_REF /* 75 */:
                    case Token.REF_CALL /* 76 */:
                    case Token.REF_SPECIAL /* 77 */:
                    case Token.YIELD /* 78 */:
                        boolean z24 = z ? 1 : 0;
                        int i22 = i16 - 75;
                        int iH4 = h();
                        int i23 = this.b;
                        if (i22 >= i23) {
                            int i24 = i16 - 74;
                            int[] iArr6 = new int[i24];
                            System.arraycopy(this.a, 0, iArr6, 0, i23);
                            this.a = iArr6;
                            this.b = i24;
                        }
                        this.a[i22] = iH4;
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z115 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i11110 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i11110, 4) + i12));
                                            iF3 = (f(i11110 + 8, 4) - f(i11110 + 4, 4)) + 1;
                                            i7 = i11110 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar115 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar115.a);
                            int iC115 = classFileWriter.C(iVar115.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.SUPER /* 79 */:
                    case Token.STRICT_SETNAME /* 80 */:
                    case Token.EXP /* 81 */:
                    case Token.DEFAULTNAMESPACE /* 82 */:
                    case Token.ESCXMLATTR /* 83 */:
                    case Token.ESCXMLTEXT /* 84 */:
                    case Token.REF_MEMBER /* 85 */:
                    case Token.REF_NS_MEMBER /* 86 */:
                        boolean z25 = z ? 1 : 0;
                        h();
                        h();
                        h();
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z116 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i11111 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i11111, 4) + i12));
                                            iF3 = (f(i11111 + 8, 4) - f(i11111 + 4, 4)) + 1;
                                            i7 = i11111 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar116 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar116.a);
                            int iC116 = classFileWriter.C(iVar116.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.REF_NAME /* 87 */:
                    case Token.SETPROP_OP /* 153 */:
                    case Token.SETELEM_OP /* 154 */:
                    case Token.LOCAL_BLOCK /* 155 */:
                    case Token.SET_REF_OP /* 156 */:
                    case Token.DOTDOT /* 157 */:
                    case Token.COLONCOLON /* 158 */:
                    case Token.YIELD_STAR /* 179 */:
                    case 194:
                    case 195:
                    case 198:
                    case 199:
                        boolean z26 = z ? 1 : 0;
                        h();
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z117 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i11112 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i11112, 4) + i12));
                                            iF3 = (f(i11112 + 8, 4) - f(i11112 + 4, 4)) + 1;
                                            i7 = i11112 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar117 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar117.a);
                            int iC117 = classFileWriter.C(iVar117.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.REF_NS_NAME /* 88 */:
                        boolean z27 = z ? 1 : 0;
                        i();
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z118 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i11113 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i11113, 4) + i12));
                                            iF3 = (f(i11113 + 8, 4) - f(i11113 + 4, 4)) + 1;
                                            i7 = i11113 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar118 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar118.a);
                            int iC118 = classFileWriter.C(iVar118.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case 89:
                        boolean z28 = z ? 1 : 0;
                        int iH5 = h();
                        j(iH5);
                        j(iH5);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z119 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i11114 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i11114, 4) + i12));
                                            iF3 = (f(i11114 + 8, 4) - f(i11114 + 4, 4)) + 1;
                                            i7 = i11114 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar119 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar119.a);
                            int iC119 = classFileWriter.C(iVar119.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.TRY /* 90 */:
                        boolean z29 = z ? 1 : 0;
                        int iH6 = h();
                        int iH7 = h();
                        j(iH6);
                        j(iH7);
                        j(iH6);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z1110 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i11115 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i11115, 4) + i12));
                                            iF3 = (f(i11115 + 8, 4) - f(i11115 + 4, 4)) + 1;
                                            i7 = i11115 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar1110 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar1110.a);
                            int iC1110 = classFileWriter.C(iVar1110.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.SEMI /* 91 */:
                        boolean z30 = z ? 1 : 0;
                        int iH8 = h();
                        long jI = i();
                        j(iH8);
                        k(jI);
                        j(iH8);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z1111 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i11116 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i11116, 4) + i12));
                                            iF3 = (f(i11116 + 8, 4) - f(i11116 + 4, 4)) + 1;
                                            i7 = i11116 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar1111 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar1111.a);
                            int iC1111 = classFileWriter.C(iVar1111.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.LB /* 92 */:
                        boolean z31 = z ? 1 : 0;
                        long jI2 = i();
                        k(jI2);
                        k(jI2);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z1112 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i11117 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i11117, 4) + i12));
                                            iF3 = (f(i11117 + 8, 4) - f(i11117 + 4, 4)) + 1;
                                            i7 = i11117 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar1112 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar1112.a);
                            int iC1112 = classFileWriter.C(iVar1112.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.RB /* 93 */:
                        boolean z32 = z ? 1 : 0;
                        long jI3 = i();
                        int iH9 = h();
                        k(jI3);
                        j(iH9);
                        k(jI3);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z1113 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i11118 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i11118, 4) + i12));
                                            iF3 = (f(i11118 + 8, 4) - f(i11118 + 4, 4)) + 1;
                                            i7 = i11118 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar1113 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar1113.a);
                            int iC1113 = classFileWriter.C(iVar1113.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.LC /* 94 */:
                        boolean z33 = z ? 1 : 0;
                        long jI4 = i();
                        long jI5 = i();
                        k(jI4);
                        k(jI5);
                        k(jI4);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z1114 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i11119 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i11119, 4) + i12));
                                            iF3 = (f(i11119 + 8, 4) - f(i11119 + 4, 4)) + 1;
                                            i7 = i11119 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar1114 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar1114.a);
                            int iC1114 = classFileWriter.C(iVar1114.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.RC /* 95 */:
                        boolean z34 = z ? 1 : 0;
                        int iH10 = h();
                        int iH11 = h();
                        j(iH10);
                        j(iH11);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z1115 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i111110 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i111110, 4) + i12));
                                            iF3 = (f(i111110 + 8, 4) - f(i111110 + 4, 4)) + 1;
                                            i7 = i111110 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar1115 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar1115.a);
                            int iC1115 = classFileWriter.C(iVar1115.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.COLON /* 116 */:
                    case Token.WITH /* 136 */:
                    case Token.VOID /* 139 */:
                    case Token.COMPUTED_PROPERTY /* 142 */:
                    case Token.TARGET /* 145 */:
                    case Token.LOOP /* 146 */:
                    case Token.EXPR_VOID /* 147 */:
                    case 190:
                    case 193:
                        h();
                        r8 = 1;
                        j(r8);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z1116 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i111111 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i111111, 4) + i12));
                                            iF3 = (f(i111111 + 8, 4) - f(i111111 + 4, 4)) + 1;
                                            i7 = i111111 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar1116 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar1116.a);
                            int iC1116 = classFileWriter.C(iVar1116.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.OR /* 117 */:
                    case Token.BREAK /* 133 */:
                    case 140:
                    case Token.BLOCK /* 143 */:
                        h();
                        j(4);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z1117 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i111112 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i111112, 4) + i12));
                                            iF3 = (f(i111112 + 8, 4) - f(i111112 + 4, 4)) + 1;
                                            i7 = i111112 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar1117 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar1117.a);
                            int iC1117 = classFileWriter.C(iVar1117.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.AND /* 118 */:
                    case Token.CONTINUE /* 134 */:
                    case Token.CATCH /* 137 */:
                    case Token.LABEL /* 144 */:
                        h();
                        i2 = 2;
                        j(i2);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z1118 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i111113 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i111113, 4) + i12));
                                            iF3 = (f(i111113 + 8, 4) - f(i111113 + 4, 4)) + 1;
                                            i7 = i111113 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar1118 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar1118.a);
                            int iC1118 = classFileWriter.C(iVar1118.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.INC /* 119 */:
                    case Token.VAR /* 135 */:
                    case Token.FINALLY /* 138 */:
                    case Token.EMPTY /* 141 */:
                        h();
                        i3 = 3;
                        j(i3);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z1119 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i111114 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i111114, 4) + i12));
                                            iF3 = (f(i111114 + 8, 4) - f(i111114 + 4, 4)) + 1;
                                            i7 = i111114 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar1119 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar1119.a);
                            int iC1119 = classFileWriter.C(iVar1119.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.XML /* 159 */:
                    case 160:
                    case Token.XMLATTR /* 161 */:
                    case Token.XMLEND /* 162 */:
                    case Token.TO_OBJECT /* 163 */:
                    case Token.TO_DOUBLE /* 164 */:
                    case Token.GET /* 165 */:
                    case Token.SET /* 166 */:
                    case Token.TEMPLATE_CHARS /* 181 */:
                        boolean z35 = z ? 1 : 0;
                        h();
                        h();
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z11110 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i111115 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i111115, 4) + i12));
                                            iF3 = (f(i111115 + 8, 4) - f(i111115 + 4, 4)) + 1;
                                            i7 = i111115 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar11110 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar11110.a);
                            int iC11110 = classFileWriter.C(iVar11110.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.CONST /* 168 */:
                    case Token.SETCONST /* 169 */:
                    case Token.ARRAYCOMP /* 171 */:
                    case 197:
                    default:
                        net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i16, "bad opcode: "));
                        break;
                    case 170:
                        boolean z36 = z ? 1 : 0;
                        int i25 = i12 + 1 + ((~i12) & 3);
                        iF = ((((f(i25 + 8, 4) - f(i25 + 4, 4)) + 4) * 4) + i25) - i12;
                        h();
                        i = 5;
                        if (iF == 0) {
                            boolean z11111 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i111116 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i111116, 4) + i12));
                                            iF3 = (f(i111116 + 8, 4) - f(i111116 + 4, 4)) + 1;
                                            i7 = i111116 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar11111 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar11111.a);
                            int iC11111 = classFileWriter.C(iVar11111.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.LETEXPR /* 172 */:
                    case Token.WITHEXPR /* 173 */:
                    case Token.DEBUGGER /* 174 */:
                    case Token.COMMENT /* 175 */:
                    case Token.GENEXPR /* 176 */:
                    case Token.METHOD /* 177 */:
                        boolean z37 = z ? 1 : 0;
                        this.d = i11;
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z11112 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i111117 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i111117, 4) + i12));
                                            iF3 = (f(i111117 + 8, 4) - f(i111117 + 4, 4)) + 1;
                                            i7 = i111117 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar11112 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar11112.a);
                            int iC11112 = classFileWriter.C(iVar11112.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.ARROW /* 178 */:
                        boolean z38 = z ? 1 : 0;
                        j(com.google.android.material.sidesheet.b.h(ClassFileWriter.B(((j) hVar.k(f(i12 + 1, 2))).c), hVar));
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z11113 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i111118 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i111118, 4) + i12));
                                            iF3 = (f(i111118 + 8, 4) - f(i111118 + 4, 4)) + 1;
                                            i7 = i111118 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar11113 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar11113.a);
                            int iC11113 = classFileWriter.C(iVar11113.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case 180:
                        boolean z39 = z ? 1 : 0;
                        h();
                        j(com.google.android.material.sidesheet.b.h(ClassFileWriter.B(((j) hVar.k(f(i12 + 1, 2))).c), hVar));
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z11114 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i111119 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i111119, 4) + i12));
                                            iF3 = (f(i111119 + 8, 4) - f(i111119 + 4, 4)) + 1;
                                            i7 = i111119 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar11114 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar11114.a);
                            int iC11114 = classFileWriter.C(iVar11114.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.TEMPLATE_LITERAL_SUBST /* 182 */:
                    case Token.TAGGED_TEMPLATE_LITERAL /* 183 */:
                    case Token.DOTDOTDOT /* 184 */:
                    case 185:
                        boolean z40 = z ? 1 : 0;
                        j jVar = (j) hVar.k(f(i12 + 1, 2));
                        String str2 = jVar.c;
                        String str3 = jVar.b;
                        int iL = ClassFileWriter.L(str2) >>> 16;
                        for (int i26 = 0; i26 < iL; i26++) {
                            h();
                        }
                        if (i16 != 184 && ((iH2 = (iH = h()) & 255) == 8 || iH2 == 6)) {
                            if (!"<init>".equals(str3)) {
                                net.luminis.tls.engine.impl.c.r("bad instance");
                            } else {
                                int iA = iH2 == 8 ? com.google.android.material.sidesheet.b.a(hVar.a(jVar.a)) : com.google.android.material.sidesheet.b.a(classFileWriter.t);
                                int[] iArr7 = this.a;
                                int i27 = this.b;
                                int i28 = 0;
                                while (i28 < i27) {
                                    int i29 = iA;
                                    if (iArr7[i28] == iH) {
                                        iArr7[i28] = i29;
                                    }
                                    i28++;
                                    iA = i29;
                                }
                                int i30 = iA;
                                int[] iArr8 = this.c;
                                int i31 = this.d;
                                for (int i32 = 0; i32 < i31; i32++) {
                                    if (iArr8[i32] == iH) {
                                        iArr8[i32] = i30;
                                    }
                                }
                            }
                        }
                        String strB = ClassFileWriter.B(str2.substring(str2.indexOf(41) + 1));
                        if (!strB.equals("V")) {
                            j(com.google.android.material.sidesheet.b.h(strB, hVar));
                        }
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z11115 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i1111110 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i1111110, 4) + i12));
                                            iF3 = (f(i1111110 + 8, 4) - f(i1111110 + 4, 4)) + 1;
                                            i7 = i1111110 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar11115 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar11115.a);
                            int iC11115 = classFileWriter.C(iVar11115.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.QUESTION_DOT /* 186 */:
                        String str4 = (String) hVar.k(f(i12 + 1, 2));
                        int iL2 = ClassFileWriter.L(str4) >>> 16;
                        boolean z41 = z ? 1 : 0;
                        for (int i33 = i11; i33 < iL2; i33++) {
                            h();
                        }
                        String strB2 = ClassFileWriter.B(str4.substring(str4.indexOf(41) + 1));
                        if (!strB2.equals("V")) {
                            j(com.google.android.material.sidesheet.b.h(strB2, hVar));
                        }
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z11116 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i1111111 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i1111111, 4) + i12));
                                            iF3 = (f(i1111111 + 8, 4) - f(i1111111 + 4, 4)) + 1;
                                            i7 = i1111111 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar11116 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar11116.a);
                            int iC11116 = classFileWriter.C(iVar11116.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case Token.LAST_TOKEN /* 187 */:
                        j(((65535 & i12) << 8) | 8);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z11117 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i1111112 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i1111112, 4) + i12));
                                            iF3 = (f(i1111112 + 8, 4) - f(i1111112 + 4, 4)) + 1;
                                            i7 = i1111112 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar11117 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar11117.a);
                            int iC11117 = classFileWriter.C(iVar11117.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case 188:
                        h();
                        switch (classFileWriter.i[i12 + 1]) {
                            case 4:
                                c = 'Z';
                                break;
                            case 5:
                                c = 'C';
                                break;
                            case 6:
                                c = 'F';
                                break;
                            case 7:
                                c = 'D';
                                break;
                            case 8:
                                c = 'B';
                                break;
                            case 9:
                                c = 'S';
                                break;
                            case 10:
                                c = 'I';
                                break;
                            case 11:
                                c = 'J';
                                break;
                            default:
                                net.luminis.tls.engine.impl.c.o("bad operand");
                                break;
                        }
                        j(com.google.android.material.sidesheet.b.a(hVar.a("[" + c)));
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z11118 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i1111113 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i1111113, 4) + i12));
                                            iF3 = (f(i1111113 + 8, 4) - f(i1111113 + 4, 4)) + 1;
                                            i7 = i1111113 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar11118 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar11118.a);
                            int iC11118 = classFileWriter.C(iVar11118.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case 189:
                        String str5 = (String) hVar.k(f(i12 + 1, 2));
                        h();
                        j(com.google.android.material.sidesheet.b.a(hVar.a("[L" + str5 + ";")));
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z11119 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i1111114 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i1111114, 4) + i12));
                                            iF3 = (f(i1111114 + 8, 4) - f(i1111114 + 4, 4)) + 1;
                                            i7 = i1111114 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar11119 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar11119.a);
                            int iC11119 = classFileWriter.C(iVar11119.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case 191:
                        int iH12 = h();
                        this.d = i11;
                        j(iH12);
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z111110 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i1111115 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i1111115, 4) + i12));
                                            iF3 = (f(i1111115 + 8, 4) - f(i1111115 + 4, 4)) + 1;
                                            i7 = i1111115 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar111110 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar111110.a);
                            int iC111110 = classFileWriter.C(iVar111110.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case 192:
                        h();
                        j(com.google.android.material.sidesheet.b.a(f(i12 + 1, 2)));
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z111111 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i1111116 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i1111116, 4) + i12));
                                            iF3 = (f(i1111116 + 8, 4) - f(i1111116 + 4, 4)) + 1;
                                            i7 = i1111116 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar111111 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar111111.a);
                            int iC111111 = classFileWriter.C(iVar111111.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                    case 196:
                        this.j = z;
                        i = 5;
                        iF = 0;
                        if (iF == 0) {
                            boolean z111112 = this.j;
                            if (i16 == 254) {
                                i = 1;
                            } else {
                                i = 1;
                            }
                            iF = i;
                        }
                        if (this.j) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                        }
                        switch (i16) {
                            default:
                                switch (i16) {
                                    case 198:
                                    case 199:
                                    case Context.VERSION_ES6 /* 200 */:
                                        break;
                                    default:
                                        if (i16 == 170) {
                                            int i1111117 = i12 + 1 + ((~i12) & 3);
                                            i6 = 4;
                                            e(g(f(i1111117, 4) + i12));
                                            iF3 = (f(i1111117 + 8, 4) - f(i1111117 + 4, 4)) + 1;
                                            i7 = i1111117 + 12;
                                            i8 = i4;
                                            while (i8 < iF3) {
                                                e(g(f((i8 * 4) + i7, i6) + i12));
                                                i8++;
                                                i6 = 4;
                                            }
                                        }
                                        break;
                                }
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
                                if ((classFileWriter.i[i12] & 255) == 200) {
                                    iF2 = f(i12 + 1, 4) + i12;
                                } else {
                                    iF2 = ((short) f(i12 + 1, 2)) + i12;
                                }
                                e(g(iF2));
                                break;
                        }
                        while (i5 < iMax) {
                            i iVar111112 = classFileWriter.e[i5];
                            iC = classFileWriter.C(iVar111112.a);
                            int iC111112 = classFileWriter.C(iVar111112.b);
                            if (i12 < iC) {
                            }
                        }
                        i12 += iF;
                        i11 = i4;
                        z = true;
                        break;
                }
                return;
            }
            if (i16 != 167 && i16 != 191 && i16 != 200 && i16 != 176 && i16 != 177) {
                switch (i16) {
                    case 170:
                    case Token.ARRAYCOMP /* 171 */:
                    case Token.LETEXPR /* 172 */:
                    case Token.WITHEXPR /* 173 */:
                    case Token.DEBUGGER /* 174 */:
                        break;
                    default:
                        int i34 = kVar.a + 1;
                        k[] kVarArr2 = this.g;
                        if (i34 < kVarArr2.length) {
                            e(kVarArr2[i34]);
                        }
                        break;
                }
            }
        }
    }

    public final void e(k kVar) {
        if (kVar.b(this.a, this.b, this.c, this.d, this.k.k)) {
            a(kVar);
        }
    }

    public final int f(int i, int i2) {
        if (i2 > 4) {
            net.luminis.tls.engine.impl.c.o("bad operand size");
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 << 8) | (this.k.i[i + i4] & 255);
        }
        return i3;
    }

    public final k g(int i) {
        ClassFileWriter classFileWriter = this.k;
        int iBinarySearch = Arrays.binarySearch(classFileWriter.a, 0, classFileWriter.b, i);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        if (iBinarySearch >= classFileWriter.b) {
            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "bad offset: "));
            return null;
        }
        k kVar = this.g[iBinarySearch];
        if (i >= kVar.b && i < kVar.c) {
            return kVar;
        }
        Kit.codeBug();
        return kVar;
    }

    public final int h() {
        int[] iArr = this.c;
        int i = this.d - 1;
        this.d = i;
        return iArr[i];
    }

    public final long i() {
        long jH = h();
        return com.google.android.material.sidesheet.b.x((int) jH) ? jH : (jH << 32) | ((long) (h() & 16777215));
    }

    public final void j(int i) {
        int i2 = this.d;
        if (i2 == this.c.length) {
            int[] iArr = new int[Math.max(i2 * 2, 4)];
            System.arraycopy(this.c, 0, iArr, 0, this.d);
            this.c = iArr;
        }
        int[] iArr2 = this.c;
        int i3 = this.d;
        this.d = i3 + 1;
        iArr2[i3] = i;
    }

    public final void k(long j) {
        j((int) (j & 16777215));
        long j2 = j >>> 32;
        if (j2 != 0) {
            j((int) (j2 & 16777215));
        }
    }

    public final void l(int[] iArr, int[] iArr2, int i) {
        byte[] bArr = this.h;
        int i2 = this.i;
        int i3 = i2 + 1;
        this.i = i3;
        bArr[i2] = -1;
        int I = ClassFileWriter.I(bArr, i, i3);
        this.i = I;
        this.i = ClassFileWriter.I(this.h, iArr.length, I);
        n(0, iArr);
        this.i = ClassFileWriter.I(this.h, iArr2.length, this.i);
        n(0, iArr2);
    }

    public final int m(int i) {
        int i2 = i & 255;
        byte[] bArr = this.h;
        int i3 = this.i;
        int i4 = i3 + 1;
        this.i = i4;
        bArr[i3] = (byte) i2;
        if (i2 == 7 || i2 == 8) {
            this.i = ClassFileWriter.I(bArr, i >>> 8, i4);
        }
        return this.i;
    }

    public final int n(int i, int[] iArr) {
        while (i < iArr.length) {
            this.i = m(iArr[i]);
            i++;
        }
        return this.i;
    }
}
