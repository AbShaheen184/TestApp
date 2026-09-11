package org.mozilla.javascript.regexp;

import coil3.compose.internal.f;
import net.luminis.tls.engine.impl.c;
import org.mozilla.javascript.AbstractEcmaObjectOperations;
import org.mozilla.javascript.Constructable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ScriptRuntimeES6;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.Undefined;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class NativeRegExp extends IdScriptableObject {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int ANCHOR_BOL = -2;
    private static final int INDEX_LEN = 2;
    private static final int Id_compile = 1;
    private static final int Id_dotAll = 7;
    private static final int Id_exec = 4;
    private static final int Id_flags = 3;
    private static final int Id_global = 4;
    private static final int Id_ignoreCase = 5;
    private static final int Id_lastIndex = 1;
    private static final int Id_multiline = 6;
    private static final int Id_prefix = 6;
    private static final int Id_source = 2;
    private static final int Id_sticky = 8;
    private static final int Id_test = 5;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    public static final int JSREG_DOTALL = 8;
    public static final int JSREG_FOLD = 2;
    public static final int JSREG_GLOB = 1;
    public static final int JSREG_MULTILINE = 4;
    public static final int JSREG_STICKY = 16;
    public static final int MATCH = 1;
    private static final int MAX_INSTANCE_ID = 8;
    private static final int MAX_PROTOTYPE_ID = 9;
    public static final int PREFIX = 2;
    private static final Object REGEXP_TAG = new Object();
    private static final byte REOP_ALNUM = 9;
    private static final byte REOP_ALT = 31;
    private static final byte REOP_ALTPREREQ = 53;
    private static final byte REOP_ALTPREREQ2 = 55;
    private static final byte REOP_ALTPREREQi = 54;
    private static final byte REOP_ASSERT = 41;
    private static final byte REOP_ASSERTNOTTEST = 44;
    private static final byte REOP_ASSERTTEST = 43;
    private static final byte REOP_ASSERT_NOT = 42;
    private static final byte REOP_BACKREF = 13;
    private static final byte REOP_BOL = 2;
    private static final byte REOP_CLASS = 22;
    private static final byte REOP_DIGIT = 7;
    private static final byte REOP_DOT = 6;
    private static final byte REOP_EMPTY = 1;
    private static final byte REOP_END = 57;
    private static final byte REOP_ENDCHILD = 49;
    private static final byte REOP_EOL = 3;
    private static final byte REOP_FLAT = 14;
    private static final byte REOP_FLAT1 = 15;
    private static final byte REOP_FLAT1i = 17;
    private static final byte REOP_FLATi = 16;
    private static final byte REOP_JUMP = 32;
    private static final byte REOP_LPAREN = 29;
    private static final byte REOP_MINIMALOPT = 47;
    private static final byte REOP_MINIMALPLUS = 46;
    private static final byte REOP_MINIMALQUANT = 48;
    private static final byte REOP_MINIMALREPEAT = 52;
    private static final byte REOP_MINIMALSTAR = 45;
    private static final byte REOP_NCLASS = 23;
    private static final byte REOP_NONALNUM = 10;
    private static final byte REOP_NONDIGIT = 8;
    private static final byte REOP_NONSPACE = 12;
    private static final byte REOP_OPT = 28;
    private static final byte REOP_PLUS = 27;
    private static final byte REOP_QUANT = 25;
    private static final byte REOP_REPEAT = 51;
    private static final byte REOP_RPAREN = 30;
    private static final byte REOP_SIMPLE_END = 23;
    private static final byte REOP_SIMPLE_START = 1;
    private static final byte REOP_SPACE = 11;
    private static final byte REOP_STAR = 26;
    private static final byte REOP_UCFLAT1 = 18;
    private static final byte REOP_UCFLAT1i = 19;
    private static final byte REOP_WBDRY = 4;
    private static final byte REOP_WNONBDRY = 5;
    private static final int SymbolId_match = 7;
    private static final int SymbolId_matchAll = 8;
    private static final int SymbolId_search = 9;
    public static final int TEST = 0;
    private static final boolean debug = false;
    private static final long serialVersionUID = 4965263491464903264L;
    Object lastIndex;
    private int lastIndexAttr;
    private RECompiled re;

    public NativeRegExp(Scriptable scriptable, RECompiled rECompiled) {
        Integer num = ScriptRuntime.zeroObj;
        this.lastIndex = num;
        this.lastIndexAttr = 6;
        this.re = rECompiled;
        setLastIndex(num);
        ScriptRuntime.setBuiltinProtoAndParent(this, scriptable, TopLevel.Builtins.RegExp);
    }

    private static void addCharacterRangeToCharSet(RECharSet rECharSet, char c, char c2) {
        int i = c / '\b';
        int i2 = c2 / '\b';
        if (c2 >= rECharSet.length || c > c2) {
            throw ScriptRuntime.constructError("SyntaxError", "invalid range in character class");
        }
        char c3 = (char) (c & 7);
        char c4 = (char) (c2 & 7);
        byte[] bArr = rECharSet.bits;
        if (i == i2) {
            bArr[i] = (byte) (bArr[i] | ((byte) ((255 >> (7 - (c4 - c3))) << c3)));
            return;
        }
        bArr[i] = (byte) (((byte) (255 << c3)) | bArr[i]);
        while (true) {
            i++;
            byte[] bArr2 = rECharSet.bits;
            if (i >= i2) {
                bArr2[i2] = (byte) (bArr2[i2] | ((byte) (255 >> (7 - c4))));
                return;
            }
            bArr2[i] = -1;
        }
    }

    private static void addCharacterToCharSet(RECharSet rECharSet, char c) {
        int i = c / '\b';
        if (c >= rECharSet.length) {
            throw ScriptRuntime.constructError("SyntaxError", "invalid range in character class");
        }
        byte[] bArr = rECharSet.bits;
        bArr[i] = (byte) (((byte) (1 << (c & 7))) | bArr[i]);
    }

    private static int addIndex(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw Kit.codeBug();
        }
        if (i2 > 65535) {
            throw Context.reportRuntimeError("Too complex regexp");
        }
        bArr[i] = (byte) (i2 >> 8);
        bArr[i + 1] = (byte) i2;
        return i + 2;
    }

    private void appendFlags(StringBuilder sb) {
        if ((this.re.flags & 1) != 0) {
            sb.append('g');
        }
        if ((this.re.flags & 2) != 0) {
            sb.append('i');
        }
        if ((this.re.flags & 4) != 0) {
            sb.append('m');
        }
        if ((this.re.flags & 8) != 0) {
            sb.append('s');
        }
        if ((this.re.flags & 16) != 0) {
            sb.append('y');
        }
    }

    private static boolean backrefMatcher(REGlobalData rEGlobalData, int i, String str, int i2) {
        long[] jArr = rEGlobalData.parens;
        if (jArr == null || i >= jArr.length) {
            return false;
        }
        int iParensIndex = rEGlobalData.parensIndex(i);
        if (iParensIndex == -1) {
            return true;
        }
        int iParensLength = rEGlobalData.parensLength(i);
        int i3 = rEGlobalData.cp;
        if (i3 + iParensLength > i2) {
            return false;
        }
        if ((rEGlobalData.regexp.flags & 2) != 0) {
            for (int i4 = 0; i4 < iParensLength; i4++) {
                char cCharAt = str.charAt(iParensIndex + i4);
                char cCharAt2 = str.charAt(rEGlobalData.cp + i4);
                if (cCharAt != cCharAt2 && upcase(cCharAt) != upcase(cCharAt2)) {
                    return false;
                }
            }
        } else if (!str.regionMatches(iParensIndex, str, i3, iParensLength)) {
            return false;
        }
        rEGlobalData.cp += iParensLength;
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:30:0x004f
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private static boolean calculateBitmapSize(org.mozilla.javascript.regexp.CompilerState r11, org.mozilla.javascript.regexp.RENode r12, char[] r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.regexp.NativeRegExp.calculateBitmapSize(org.mozilla.javascript.regexp.CompilerState, org.mozilla.javascript.regexp.RENode, char[], int, int):boolean");
    }

    private static boolean classMatcher(REGlobalData rEGlobalData, RECharSet rECharSet, char c) {
        if (!rECharSet.converted) {
            processCharSet(rEGlobalData, rECharSet);
        }
        int i = c >> 3;
        int i2 = rECharSet.length;
        boolean z = true;
        if (i2 != 0 && c < i2 && (rECharSet.bits[i] & (1 << (c & 7))) != 0) {
            z = false;
        }
        return rECharSet.sense ^ z;
    }

    public static RECompiled compileRE(Context context, String str, String str2, boolean z) {
        int i;
        int i2;
        RECompiled rECompiled = new RECompiled(str);
        int length = str.length();
        if (str2 != null) {
            i = 0;
            for (int i3 = 0; i3 < str2.length(); i3++) {
                char cCharAt = str2.charAt(i3);
                if (cCharAt == 'g') {
                    i2 = 1;
                } else if (cCharAt == 'i') {
                    i2 = 2;
                } else if (cCharAt == 'm') {
                    i2 = 4;
                } else if (cCharAt == 's') {
                    i2 = 8;
                } else if (cCharAt == 'y') {
                    i2 = 16;
                } else {
                    reportError("msg.invalid.re.flag", String.valueOf(cCharAt));
                    i2 = 0;
                }
                if ((i & i2) != 0) {
                    reportError("msg.invalid.re.flag", String.valueOf(cCharAt));
                }
                i |= i2;
            }
        } else {
            i = 0;
        }
        rECompiled.flags = i;
        CompilerState compilerState = new CompilerState(context, rECompiled.source, length, i);
        if (z && length > 0) {
            RENode rENode = new RENode(REOP_FLAT);
            compilerState.result = rENode;
            rENode.chr = compilerState.cpbegin[0];
            rENode.length = length;
            rENode.flatIndex = 0;
            compilerState.progLength += 5;
        } else {
            if (!parseDisjunction(compilerState)) {
                return null;
            }
            if (compilerState.maxBackReference > compilerState.parenCount) {
                compilerState = new CompilerState(context, rECompiled.source, length, i);
                compilerState.backReferenceLimit = compilerState.parenCount;
                if (!parseDisjunction(compilerState)) {
                    return null;
                }
            }
        }
        rECompiled.program = new byte[compilerState.progLength + 1];
        int i4 = compilerState.classCount;
        if (i4 != 0) {
            rECompiled.classList = new RECharSet[i4];
            rECompiled.classCount = i4;
        }
        int iEmitREBytecode = emitREBytecode(compilerState, rECompiled, 0, compilerState.result);
        byte[] bArr = rECompiled.program;
        bArr[iEmitREBytecode] = REOP_END;
        rECompiled.parenCount = compilerState.parenCount;
        byte b = bArr[0];
        if (b == 2) {
            rECompiled.anchorCh = -2;
            return rECompiled;
        }
        if (b != 31) {
            switch (b) {
                case 14:
                case 16:
                    rECompiled.anchorCh = rECompiled.source[getIndex(bArr, 1)];
                    return rECompiled;
                case 15:
                case 17:
                    rECompiled.anchorCh = (char) (bArr[1] & 255);
                    return rECompiled;
                case 18:
                case 19:
                    rECompiled.anchorCh = (char) getIndex(bArr, 1);
                    return rECompiled;
            }
        }
        RENode rENode2 = compilerState.result;
        if (rENode2.kid.op == 2 && rENode2.kid2.op == 2) {
            rECompiled.anchorCh = -2;
        }
        return rECompiled;
    }

    private static void doFlat(CompilerState compilerState, char c) {
        RENode rENode = new RENode(REOP_FLAT);
        compilerState.result = rENode;
        rENode.chr = c;
        rENode.length = 1;
        rENode.flatIndex = -1;
        compilerState.progLength += 3;
    }

    private static char downcase(char c) {
        if (c >= 128) {
            char lowerCase = Character.toLowerCase(c);
            if (lowerCase >= 128) {
                return lowerCase;
            }
        } else if ('A' <= c && c <= 'Z') {
            return (char) (c + ' ');
        }
        return c;
    }

    /* JADX WARN: Switch 'out' block B:69:0x00f6 for B:22:0x002e already processed. Defaulting to fallback option. */
    private static int emitREBytecode(CompilerState compilerState, RECompiled rECompiled, int i, RENode rENode) {
        int i2;
        byte[] bArr = rECompiled.program;
        while (rENode != null) {
            int iAddIndex = i + 1;
            byte b = rENode.op;
            bArr[i] = b;
            if (b != 1) {
                if (b != 22) {
                    if (b == 25) {
                        int i3 = rENode.min;
                        if (i3 == 0 && rENode.max == -1) {
                            bArr[i] = rENode.greedy ? REOP_STAR : REOP_MINIMALSTAR;
                        } else if (i3 == 0 && rENode.max == 1) {
                            bArr[i] = rENode.greedy ? REOP_OPT : REOP_MINIMALOPT;
                        } else if (i3 == 1 && rENode.max == -1) {
                            bArr[i] = rENode.greedy ? REOP_PLUS : REOP_MINIMALPLUS;
                        } else {
                            if (!rENode.greedy) {
                                bArr[i] = REOP_MINIMALQUANT;
                            }
                            iAddIndex = addIndex(bArr, addIndex(bArr, iAddIndex, i3), rENode.max + 1);
                        }
                        int iAddIndex2 = addIndex(bArr, addIndex(bArr, iAddIndex, rENode.parenCount), rENode.parenIndex);
                        int iEmitREBytecode = emitREBytecode(compilerState, rECompiled, iAddIndex2 + 2, rENode.kid);
                        i2 = iEmitREBytecode + 1;
                        bArr[iEmitREBytecode] = REOP_ENDCHILD;
                        resolveForwardJump(bArr, iAddIndex2, i2);
                    } else if (b == 29) {
                        int iEmitREBytecode2 = emitREBytecode(compilerState, rECompiled, addIndex(bArr, iAddIndex, rENode.parenIndex), rENode.kid);
                        bArr[iEmitREBytecode2] = REOP_RPAREN;
                        i = addIndex(bArr, iEmitREBytecode2 + 1, rENode.parenIndex);
                    } else if (b == 31) {
                        RENode rENode2 = rENode.kid2;
                        int iEmitREBytecode3 = emitREBytecode(compilerState, rECompiled, iAddIndex + 2, rENode.kid);
                        int i4 = iEmitREBytecode3 + 1;
                        bArr[iEmitREBytecode3] = REOP_JUMP;
                        int i5 = iEmitREBytecode3 + 3;
                        resolveForwardJump(bArr, iAddIndex, i5);
                        int iEmitREBytecode4 = emitREBytecode(compilerState, rECompiled, i5, rENode2);
                        int i6 = iEmitREBytecode4 + 1;
                        bArr[iEmitREBytecode4] = REOP_JUMP;
                        i = iEmitREBytecode4 + 3;
                        resolveForwardJump(bArr, i4, i);
                        resolveForwardJump(bArr, i6, i);
                    } else if (b == 13) {
                        i = addIndex(bArr, iAddIndex, rENode.parenIndex);
                    } else if (b == 14) {
                        if (rENode.flatIndex != -1) {
                            while (true) {
                                RENode rENode3 = rENode.next;
                                if (rENode3 != null && rENode3.op == 14) {
                                    int i7 = rENode.flatIndex;
                                    int i8 = rENode.length;
                                    if (i7 + i8 == rENode3.flatIndex) {
                                        rENode.length = i8 + rENode3.length;
                                        rENode.next = rENode3.next;
                                    }
                                }
                            }
                        }
                        int i9 = rENode.flatIndex;
                        if (i9 == -1 || rENode.length <= 1) {
                            char c = rENode.chr;
                            if (c < 256) {
                                if ((compilerState.flags & 2) != 0) {
                                    bArr[i] = REOP_FLAT1i;
                                } else {
                                    bArr[i] = REOP_FLAT1;
                                }
                                i += 2;
                                bArr[iAddIndex] = (byte) c;
                            } else {
                                if ((compilerState.flags & 2) != 0) {
                                    bArr[i] = REOP_UCFLAT1i;
                                } else {
                                    bArr[i] = REOP_UCFLAT1;
                                }
                                i = addIndex(bArr, iAddIndex, c);
                            }
                        } else {
                            if ((compilerState.flags & 2) != 0) {
                                bArr[i] = REOP_FLATi;
                            } else {
                                bArr[i] = REOP_FLAT;
                            }
                            i = addIndex(bArr, addIndex(bArr, iAddIndex, i9), rENode.length);
                        }
                    } else if (b == 41) {
                        int iEmitREBytecode5 = emitREBytecode(compilerState, rECompiled, i + 3, rENode.kid);
                        i2 = iEmitREBytecode5 + 1;
                        bArr[iEmitREBytecode5] = REOP_ASSERTTEST;
                        resolveForwardJump(bArr, iAddIndex, i2);
                    } else if (b != 42) {
                        switch (b) {
                            case Token.REGEXP /* 53 */:
                            case Token.BINDNAME /* 54 */:
                            case Token.THROW /* 55 */:
                                boolean z = b == 54;
                                char cUpcase = rENode.chr;
                                if (z) {
                                    cUpcase = upcase(cUpcase);
                                }
                                addIndex(bArr, iAddIndex, cUpcase);
                                int i10 = i + 3;
                                int iUpcase = rENode.index;
                                if (z) {
                                    iUpcase = upcase((char) iUpcase);
                                }
                                addIndex(bArr, i10, iUpcase);
                                iAddIndex = i + 5;
                                RENode rENode4 = rENode.kid2;
                                int iEmitREBytecode6 = emitREBytecode(compilerState, rECompiled, iAddIndex + 2, rENode.kid);
                                int i11 = iEmitREBytecode6 + 1;
                                bArr[iEmitREBytecode6] = REOP_JUMP;
                                int i12 = iEmitREBytecode6 + 3;
                                resolveForwardJump(bArr, iAddIndex, i12);
                                int iEmitREBytecode7 = emitREBytecode(compilerState, rECompiled, i12, rENode4);
                                int i13 = iEmitREBytecode7 + 1;
                                bArr[iEmitREBytecode7] = REOP_JUMP;
                                i = iEmitREBytecode7 + 3;
                                resolveForwardJump(bArr, i11, i);
                                resolveForwardJump(bArr, i13, i);
                                break;
                            default:
                                i = iAddIndex;
                                continue;
                        }
                    } else {
                        int iEmitREBytecode8 = emitREBytecode(compilerState, rECompiled, i + 3, rENode.kid);
                        i2 = iEmitREBytecode8 + 1;
                        bArr[iEmitREBytecode8] = REOP_ASSERTNOTTEST;
                        resolveForwardJump(bArr, iAddIndex, i2);
                    }
                    i = i2;
                } else {
                    if (!rENode.sense) {
                        bArr[i] = 23;
                    }
                    i = addIndex(bArr, iAddIndex, rENode.index);
                    rECompiled.classList[rENode.index] = new RECharSet(rENode.bmsize, rENode.startIndex, rENode.kidlen, rENode.sense);
                }
            }
            rENode = rENode.next;
        }
        return i;
    }

    private static String escapeRegExp(Object obj) {
        String string = ScriptRuntime.toString(obj);
        StringBuilder sb = null;
        int i = 0;
        for (int iIndexOf = string.indexOf(47); iIndexOf > -1; iIndexOf = string.indexOf(47, iIndexOf + 1)) {
            if (iIndexOf == i || string.charAt(iIndexOf - 1) != '\\') {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append((CharSequence) string, i, iIndexOf);
                sb.append("\\/");
                i = iIndexOf + 1;
            }
        }
        if (sb == null) {
            return string;
        }
        sb.append((CharSequence) string, i, string.length());
        return sb.toString();
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11761. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    private static boolean executeREBytecode(org.mozilla.javascript.Context r19, org.mozilla.javascript.regexp.REGlobalData r20, java.lang.String r21, int r22) {
        /*
            Method dump skipped, instruction units count: 1176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.regexp.NativeRegExp.executeREBytecode(org.mozilla.javascript.Context, org.mozilla.javascript.regexp.REGlobalData, java.lang.String, int):boolean");
    }

    private static boolean flatNIMatcher(REGlobalData rEGlobalData, int i, int i2, String str, int i3) {
        if (rEGlobalData.cp + i2 > i3) {
            return false;
        }
        char[] cArr = rEGlobalData.regexp.source;
        for (int i4 = 0; i4 < i2; i4++) {
            char c = cArr[i + i4];
            char cCharAt = str.charAt(rEGlobalData.cp + i4);
            if (c != cCharAt && upcase(c) != upcase(cCharAt)) {
                return false;
            }
        }
        rEGlobalData.cp += i2;
        return true;
    }

    private static boolean flatNMatcher(REGlobalData rEGlobalData, int i, int i2, String str, int i3) {
        if (rEGlobalData.cp + i2 > i3) {
            return false;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            if (rEGlobalData.regexp.source[i + i4] != str.charAt(rEGlobalData.cp + i4)) {
                return false;
            }
        }
        rEGlobalData.cp += i2;
        return true;
    }

    private static int getDecimalValue(char c, CompilerState compilerState, String str) {
        int i = compilerState.cp;
        char[] cArr = compilerState.cpbegin;
        int i2 = c - '0';
        boolean z = false;
        while (true) {
            int i3 = compilerState.cp;
            if (i3 == compilerState.cpend) {
                break;
            }
            char c2 = cArr[i3];
            if (!isDigit(c2)) {
                break;
            }
            if (!z) {
                int i4 = (c2 - '0') + (i2 * 10);
                i2 = 65535;
                if (i4 < 65535) {
                    i2 = i4;
                } else {
                    z = true;
                }
            }
            compilerState.cp++;
        }
        if (z) {
            reportError(str, String.valueOf(cArr, i, compilerState.cp - i));
        }
        return i2;
    }

    private static RegExpImpl getImpl(Context context) {
        return (RegExpImpl) ScriptRuntime.getRegExpProxy(context);
    }

    private static int getIndex(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    private static int getOffset(byte[] bArr, int i) {
        return getIndex(bArr, i);
    }

    public static void init(Context context, Scriptable scriptable, boolean z) {
        NativeRegExp nativeRegExpWithLanguageVersion = NativeRegExpInstantiator.withLanguageVersion(context.getLanguageVersion());
        nativeRegExpWithLanguageVersion.re = compileRE(context, "", null, false);
        nativeRegExpWithLanguageVersion.activatePrototypeMap(9);
        nativeRegExpWithLanguageVersion.setParentScope(scriptable);
        nativeRegExpWithLanguageVersion.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        NativeRegExpCtor nativeRegExpCtor = new NativeRegExpCtor();
        nativeRegExpWithLanguageVersion.defineProperty("constructor", nativeRegExpCtor, 2);
        ScriptRuntime.setFunctionProtoAndParent(nativeRegExpCtor, context, scriptable);
        nativeRegExpCtor.setImmunePrototypeProperty(nativeRegExpWithLanguageVersion);
        if (z) {
            nativeRegExpWithLanguageVersion.sealObject();
            nativeRegExpCtor.sealObject();
        }
        ScriptableObject.defineProperty(scriptable, "RegExp", nativeRegExpCtor, 2);
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, nativeRegExpCtor);
    }

    private static boolean isControlLetter(char c) {
        if ('a' > c || c > 'z') {
            return 'A' <= c && c <= 'Z';
        }
        return true;
    }

    public static boolean isDigit(char c) {
        return '0' <= c && c <= '9';
    }

    private static boolean isLineTerm(char c) {
        return ScriptRuntime.isJSLineTerminator(c);
    }

    private static boolean isREWhiteSpace(int i) {
        return ScriptRuntime.isJSWhitespaceOrLineTerminator(i);
    }

    private static boolean isWord(char c) {
        if ('a' > c || c > 'z') {
            return ('A' <= c && c <= 'Z') || isDigit(c) || c == '_';
        }
        return true;
    }

    private Object js_SymbolMatchAll(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!ScriptRuntime.isObject(scriptable2)) {
            throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(scriptable2));
        }
        String string = ScriptRuntime.toString(objArr.length > 0 ? objArr[0] : Undefined.instance);
        Constructable constructableSpeciesConstructor = AbstractEcmaObjectOperations.speciesConstructor(context, scriptable2, ScriptRuntime.getExistingCtor(context, ScriptableObject.getTopLevelScope(scriptable), getClassName()));
        String string2 = ScriptRuntime.toString(ScriptRuntime.getObjectProp(scriptable2, "flags", context));
        Scriptable scriptableConstruct = constructableSpeciesConstructor.construct(context, scriptable, new Object[]{scriptable2, string2});
        ScriptRuntime.setObjectProp(scriptableConstruct, "lastIndex", (Object) Long.valueOf(ScriptRuntime.toLength(ScriptRuntime.getObjectProp(scriptable2, "lastIndex", context))), context);
        return new NativeRegExpStringIterator(scriptable, scriptableConstruct, string, string2.indexOf(Token.ASSIGN_BITAND) != -1, (string2.indexOf(Token.OR) == -1 && string2.indexOf(Token.AND) == -1) ? false : true);
    }

    public static Object js_exec(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return realThis(scriptable2, "exec").execSub(context, scriptable, objArr, 1);
    }

    private static boolean matchRegExp(Context context, REGlobalData rEGlobalData, RECompiled rECompiled, String str, int i, int i2, boolean z) {
        int i3 = rECompiled.parenCount;
        if (i3 != 0) {
            rEGlobalData.parens = new long[i3];
        } else {
            rEGlobalData.parens = null;
        }
        rEGlobalData.backTrackStackTop = null;
        rEGlobalData.stateStackTop = null;
        rEGlobalData.multiline = z || (rECompiled.flags & 4) != 0;
        rEGlobalData.regexp = rECompiled;
        int i4 = rECompiled.anchorCh;
        int i5 = i;
        while (i5 <= i2) {
            if (i4 >= 0) {
                while (i5 != i2) {
                    char cCharAt = str.charAt(i5);
                    if (cCharAt != i4 && ((rEGlobalData.regexp.flags & 2) == 0 || upcase(cCharAt) != upcase((char) i4))) {
                        if ((rEGlobalData.regexp.flags & 16) != 0) {
                            return false;
                        }
                        i5++;
                    }
                }
                return false;
            }
            rEGlobalData.cp = i5;
            rEGlobalData.skipped = i5 - i;
            for (int i6 = 0; i6 < rECompiled.parenCount; i6++) {
                rEGlobalData.parens[i6] = -1;
            }
            boolean zExecuteREBytecode = executeREBytecode(context, rEGlobalData, str, i2);
            rEGlobalData.backTrackStackTop = null;
            rEGlobalData.stateStackTop = null;
            if (zExecuteREBytecode) {
                return true;
            }
            if (i4 == -2 && !rEGlobalData.multiline) {
                rEGlobalData.skipped = i2;
                return false;
            }
            if ((rEGlobalData.regexp.flags & 16) != 0) {
                return false;
            }
            i5 = rEGlobalData.skipped + i + 1;
        }
        return false;
    }

    private static boolean parseAlternative(CompilerState compilerState) {
        char c;
        char[] cArr = compilerState.cpbegin;
        RENode rENode = null;
        RENode rENode2 = null;
        while (true) {
            int i = compilerState.cp;
            if (i == compilerState.cpend || (c = cArr[i]) == '|' || (compilerState.parenNesting != 0 && c == ')')) {
                break;
            }
            if (!parseTerm(compilerState)) {
                return false;
            }
            RENode rENode3 = compilerState.result;
            if (rENode == null) {
                rENode = rENode3;
                rENode2 = rENode;
            } else {
                rENode2.next = rENode3;
            }
            while (true) {
                RENode rENode4 = rENode2.next;
                if (rENode4 != null) {
                    rENode2 = rENode4;
                }
            }
        }
        if (rENode == null) {
            compilerState.result = new RENode((byte) 1);
        } else {
            compilerState.result = rENode;
        }
        return true;
    }

    private static boolean parseDisjunction(CompilerState compilerState) {
        int i;
        int i2;
        if (!parseAlternative(compilerState)) {
            return false;
        }
        char[] cArr = compilerState.cpbegin;
        int i3 = compilerState.cp;
        if (i3 != cArr.length && cArr[i3] == '|') {
            compilerState.cp = i3 + 1;
            RENode rENode = new RENode(REOP_ALT);
            rENode.kid = compilerState.result;
            if (!parseDisjunction(compilerState)) {
                return false;
            }
            RENode rENode2 = compilerState.result;
            rENode.kid2 = rENode2;
            compilerState.result = rENode;
            RENode rENode3 = rENode.kid;
            byte b = rENode3.op;
            if (b == 14 && rENode2.op == 14) {
                rENode.op = (compilerState.flags & 2) == 0 ? REOP_ALTPREREQ : REOP_ALTPREREQi;
                rENode.chr = rENode3.chr;
                rENode.index = rENode2.chr;
                compilerState.progLength += 13;
            } else if (b == 22 && (i2 = rENode3.index) < 256 && rENode2.op == 14 && (compilerState.flags & 2) == 0) {
                rENode.op = REOP_ALTPREREQ2;
                rENode.chr = rENode2.chr;
                rENode.index = i2;
                compilerState.progLength += 13;
            } else if (b == 14 && rENode2.op == 22 && (i = rENode2.index) < 256 && (compilerState.flags & 2) == 0) {
                rENode.op = REOP_ALTPREREQ2;
                rENode.chr = rENode3.chr;
                rENode.index = i;
                compilerState.progLength += 13;
            } else {
                compilerState.progLength += 9;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:184:0x039b  */
    /* JADX WARN: Code duplicated, block: B:188:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:196:0x03fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:197:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:202:0x0424  */
    /* JADX WARN: Code duplicated, block: B:207:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0147  */
    /* JADX WARN: Code duplicated, block: B:75:0x014d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0165 A[LOOP:0: B:72:0x0145->B:78:0x0165, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32, types: [int] */
    /* JADX WARN: Type inference failed for: r3v33, types: [int] */
    /* JADX WARN: Type inference failed for: r3v37, types: [char] */
    /* JADX WARN: Type inference failed for: r3v63 */
    private static boolean parseTerm(CompilerState compilerState) {
        boolean z;
        boolean z2;
        int i;
        RENode rENode;
        char c;
        char c2;
        int i2;
        char c3;
        int i3;
        int iXDigitToInt;
        RENode rENode2;
        char c4;
        char[] cArr = compilerState.cpbegin;
        int i4 = compilerState.cp;
        int i5 = i4 + 1;
        compilerState.cp = i5;
        char c5 = cArr[i4];
        int i6 = compilerState.parenCount;
        if (c5 == '$') {
            compilerState.result = new RENode(REOP_EOL);
            compilerState.progLength++;
            return true;
        }
        if (c5 != '.') {
            if (c5 == '?') {
                z = false;
            } else {
                if (c5 == '^') {
                    compilerState.result = new RENode(REOP_BOL);
                    compilerState.progLength++;
                    return true;
                }
                char c6 = '\\';
                if (c5 != '[') {
                    z = false;
                    int i7 = 4;
                    if (c5 != '\\') {
                        switch (c5) {
                            case Token.GETELEM_SUPER /* 40 */:
                                if (i4 + 2 < compilerState.cpend && cArr[i5] == '?' && ((c4 = cArr[i4 + 2]) == '=' || c4 == '!' || c4 == ':')) {
                                    compilerState.cp = i4 + 3;
                                    if (c4 == '=') {
                                        rENode2 = new RENode(REOP_ASSERT);
                                        compilerState.progLength += 4;
                                    } else if (c4 == '!') {
                                        rENode2 = new RENode(REOP_ASSERT_NOT);
                                        compilerState.progLength += 4;
                                    } else {
                                        rENode2 = null;
                                    }
                                } else {
                                    rENode2 = new RENode(REOP_LPAREN);
                                    compilerState.progLength += 6;
                                    int i8 = compilerState.parenCount;
                                    compilerState.parenCount = i8 + 1;
                                    rENode2.parenIndex = i8;
                                }
                                compilerState.parenNesting++;
                                if (!parseDisjunction(compilerState)) {
                                    return false;
                                }
                                int i9 = compilerState.cp;
                                if (i9 == compilerState.cpend || cArr[i9] != ')') {
                                    reportError("msg.unterm.paren", "");
                                    return false;
                                }
                                compilerState.cp = i9 + 1;
                                compilerState.parenNesting--;
                                if (rENode2 != null) {
                                    rENode2.kid = compilerState.result;
                                    compilerState.result = rENode2;
                                }
                                break;
                                break;
                            case Token.SETELEM /* 41 */:
                                reportError("msg.re.unmatched.right.paren", "");
                                return false;
                            case Token.SETELEM_SUPER /* 42 */:
                            case Token.CALL /* 43 */:
                                break;
                            default:
                                RENode rENode3 = new RENode(REOP_FLAT);
                                compilerState.result = rENode3;
                                rENode3.chr = c5;
                                rENode3.length = 1;
                                rENode3.flatIndex = compilerState.cp - 1;
                                compilerState.progLength += 3;
                                break;
                        }
                    } else {
                        int i10 = compilerState.cpend;
                        if (i5 >= i10) {
                            reportError("msg.trail.backslash", "");
                            return false;
                        }
                        int i11 = i4 + 2;
                        compilerState.cp = i11;
                        char c7 = cArr[i5];
                        if (c7 == 'B') {
                            compilerState.result = new RENode(REOP_WNONBDRY);
                            compilerState.progLength++;
                            return true;
                        }
                        if (c7 == 'D') {
                            compilerState.result = new RENode(REOP_NONDIGIT);
                            compilerState.progLength++;
                        } else if (c7 == 'S') {
                            compilerState.result = new RENode(REOP_NONSPACE);
                            compilerState.progLength++;
                        } else if (c7 == 'W') {
                            compilerState.result = new RENode(REOP_NONALNUM);
                            compilerState.progLength++;
                        } else if (c7 == 'f') {
                            doFlat(compilerState, '\f');
                        } else if (c7 != 'n') {
                            switch (c7) {
                                case Token.THIS /* 48 */:
                                    reportWarning(compilerState.cx, "msg.bad.backref", "");
                                    int i12 = 0;
                                    while (i12 < 32) {
                                        int i13 = compilerState.cp;
                                        if (i13 >= compilerState.cpend || (c = cArr[i13]) < '0' || c > '7') {
                                            doFlat(compilerState, (char) i12);
                                        } else {
                                            compilerState.cp = i13 + 1;
                                            i12 = (i12 * 8) + (c - '0');
                                        }
                                        break;
                                    }
                                    doFlat(compilerState, (char) i12);
                                    break;
                                case Token.FALSE /* 49 */:
                                case Token.TRUE /* 50 */:
                                case Token.SHEQ /* 51 */:
                                case Token.SHNE /* 52 */:
                                case Token.REGEXP /* 53 */:
                                case Token.BINDNAME /* 54 */:
                                case Token.THROW /* 55 */:
                                case Token.RETHROW /* 56 */:
                                case Token.IN /* 57 */:
                                    int i14 = i4 + 1;
                                    int decimalValue = getDecimalValue(c7, compilerState, "msg.overlarge.backref");
                                    if (decimalValue > compilerState.backReferenceLimit) {
                                        reportWarning(compilerState.cx, "msg.bad.backref", "");
                                    }
                                    if (decimalValue <= compilerState.backReferenceLimit) {
                                        RENode rENode4 = new RENode(REOP_BACKREF);
                                        compilerState.result = rENode4;
                                        rENode4.parenIndex = decimalValue - 1;
                                        compilerState.progLength += 3;
                                        if (compilerState.maxBackReference < decimalValue) {
                                            compilerState.maxBackReference = decimalValue;
                                        }
                                    } else {
                                        compilerState.cp = i14;
                                        if (c7 < '8') {
                                            compilerState.cp = i4 + 2;
                                            int i15 = c7 - '0';
                                            while (i15 < 32) {
                                                int i16 = compilerState.cp;
                                                if (i16 >= compilerState.cpend || (c2 = cArr[i16]) < '0' || c2 > '7') {
                                                    doFlat(compilerState, (char) i15);
                                                } else {
                                                    compilerState.cp = i16 + 1;
                                                    i15 = (i15 * 8) + (c2 - '0');
                                                }
                                                break;
                                            }
                                            doFlat(compilerState, (char) i15);
                                        } else {
                                            doFlat(compilerState, '\\');
                                        }
                                    }
                                    break;
                                default:
                                    switch (c7) {
                                        case Token.COMMA /* 98 */:
                                            compilerState.result = new RENode(REOP_WBDRY);
                                            compilerState.progLength++;
                                            return true;
                                        case 'c':
                                            if (i11 >= i10 || !isControlLetter(cArr[i11])) {
                                                compilerState.cp--;
                                            } else {
                                                int i17 = compilerState.cp;
                                                compilerState.cp = i17 + 1;
                                                c6 = (char) (cArr[i17] & 31);
                                            }
                                            doFlat(compilerState, c6);
                                            break;
                                        case 'd':
                                            compilerState.result = new RENode(REOP_DIGIT);
                                            compilerState.progLength++;
                                            break;
                                        default:
                                            switch (c7) {
                                                case 'r':
                                                    doFlat(compilerState, '\r');
                                                    break;
                                                case Token.HOOK /* 115 */:
                                                    compilerState.result = new RENode(REOP_SPACE);
                                                    compilerState.progLength++;
                                                    break;
                                                case Token.COLON /* 116 */:
                                                    doFlat(compilerState, '\t');
                                                    break;
                                                case Token.OR /* 117 */:
                                                    i2 = 0;
                                                    c3 = 0;
                                                    while (i2 < i7) {
                                                        i3 = compilerState.cp;
                                                        if (i3 < compilerState.cpend) {
                                                            compilerState.cp = i3 + 1;
                                                            iXDigitToInt = Kit.xDigitToInt(cArr[i3], c3);
                                                            if (iXDigitToInt < 0) {
                                                                int i18 = compilerState.cp - (i2 + 2);
                                                                compilerState.cp = i18 + 1;
                                                                c3 = cArr[i18];
                                                            } else {
                                                                i2++;
                                                                c3 = iXDigitToInt;
                                                            }
                                                        }
                                                        doFlat(compilerState, (char) c3);
                                                        break;
                                                    }
                                                    doFlat(compilerState, (char) c3);
                                                    break;
                                                case Token.AND /* 118 */:
                                                    doFlat(compilerState, (char) 11);
                                                    break;
                                                case Token.INC /* 119 */:
                                                    compilerState.result = new RENode(REOP_ALNUM);
                                                    compilerState.progLength++;
                                                    break;
                                                case 'x':
                                                    i7 = 2;
                                                    i2 = 0;
                                                    c3 = 0;
                                                    while (i2 < i7) {
                                                        i3 = compilerState.cp;
                                                        if (i3 < compilerState.cpend) {
                                                            compilerState.cp = i3 + 1;
                                                            iXDigitToInt = Kit.xDigitToInt(cArr[i3], c3);
                                                            if (iXDigitToInt < 0) {
                                                                int i19 = compilerState.cp - (i2 + 2);
                                                                compilerState.cp = i19 + 1;
                                                                c3 = cArr[i19];
                                                            } else {
                                                                i2++;
                                                                c3 = iXDigitToInt;
                                                            }
                                                        }
                                                        doFlat(compilerState, (char) c3);
                                                        break;
                                                    }
                                                    doFlat(compilerState, (char) c3);
                                                    break;
                                                default:
                                                    RENode rENode5 = new RENode(REOP_FLAT);
                                                    compilerState.result = rENode5;
                                                    rENode5.chr = c7;
                                                    rENode5.length = 1;
                                                    rENode5.flatIndex = compilerState.cp - 1;
                                                    compilerState.progLength += 3;
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            doFlat(compilerState, '\n');
                        }
                    }
                } else {
                    z = false;
                    RENode rENode6 = new RENode(REOP_CLASS);
                    compilerState.result = rENode6;
                    int i20 = compilerState.cp;
                    rENode6.startIndex = i20;
                    while (true) {
                        int i21 = compilerState.cp;
                        if (i21 == compilerState.cpend) {
                            reportError("msg.unterm.class", "");
                            return false;
                        }
                        char c8 = cArr[i21];
                        if (c8 != '\\') {
                            if (c8 == ']') {
                                RENode rENode7 = compilerState.result;
                                rENode7.kidlen = i21 - i20;
                                int i22 = compilerState.classCount;
                                compilerState.classCount = i22 + 1;
                                rENode7.index = i22;
                                compilerState.cp = i21 + 1;
                                if (!calculateBitmapSize(compilerState, rENode7, cArr, i20, i21)) {
                                    return false;
                                }
                                compilerState.progLength += 3;
                                break;
                            }
                        } else {
                            compilerState.cp = i21 + 1;
                        }
                        compilerState.cp++;
                    }
                }
            }
            reportError("msg.bad.quant", String.valueOf(cArr[i4]));
            return z;
        }
        z = false;
        compilerState.result = new RENode(REOP_DOT);
        compilerState.progLength++;
        RENode rENode8 = compilerState.result;
        int i23 = compilerState.cp;
        if (i23 == compilerState.cpend) {
            return true;
        }
        char c9 = cArr[i23];
        int decimalValue2 = -1;
        if (c9 == '*') {
            RENode rENode9 = new RENode(REOP_QUANT);
            compilerState.result = rENode9;
            rENode9.min = 0;
            rENode9.max = -1;
            compilerState.progLength += 8;
        } else {
            if (c9 != '+') {
                if (c9 == '?') {
                    RENode rENode10 = new RENode(REOP_QUANT);
                    compilerState.result = rENode10;
                    rENode10.min = z ? 1 : 0;
                    rENode10.max = 1;
                    compilerState.progLength += 8;
                } else if (c9 != '{') {
                    z2 = z;
                } else {
                    int i24 = i23 + 1;
                    compilerState.cp = i24;
                    if (i24 < cArr.length) {
                        char c10 = cArr[i24];
                        if (isDigit(c10)) {
                            compilerState.cp++;
                            int decimalValue3 = getDecimalValue(c10, compilerState, "msg.overlarge.min");
                            int i25 = compilerState.cp;
                            if (i25 >= cArr.length) {
                                z2 = z;
                            } else {
                                char c11 = cArr[i25];
                                if (c11 == ',') {
                                    int i26 = i25 + 1;
                                    compilerState.cp = i26;
                                    if (i26 < cArr.length) {
                                        c11 = cArr[i26];
                                        if (isDigit(c11)) {
                                            int i27 = compilerState.cp + 1;
                                            compilerState.cp = i27;
                                            if (i27 < cArr.length) {
                                                decimalValue2 = getDecimalValue(c11, compilerState, "msg.overlarge.max");
                                                c11 = cArr[compilerState.cp];
                                                if (decimalValue3 > decimalValue2) {
                                                    throw ScriptRuntime.constructError("SyntaxError", ScriptRuntime.getMessageById("msg.max.lt.min", Integer.valueOf(decimalValue2), Integer.valueOf(decimalValue3)));
                                                }
                                            }
                                        }
                                    } else {
                                        decimalValue2 = decimalValue3;
                                    }
                                } else {
                                    decimalValue2 = decimalValue3;
                                }
                                if (c11 == '}') {
                                    RENode rENode11 = new RENode(REOP_QUANT);
                                    compilerState.result = rENode11;
                                    rENode11.min = decimalValue3;
                                    rENode11.max = decimalValue2;
                                    compilerState.progLength += 12;
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                            }
                        } else {
                            z2 = z;
                        }
                    } else {
                        z2 = z;
                    }
                    if (!z2) {
                        compilerState.cp = i23;
                    }
                }
                if (!z2) {
                    return true;
                }
                int i28 = compilerState.cp;
                i = i28 + 1;
                compilerState.cp = i;
                rENode = compilerState.result;
                rENode.kid = rENode8;
                rENode.parenIndex = i6;
                rENode.parenCount = compilerState.parenCount - i6;
                if (i < compilerState.cpend || cArr[i] != '?') {
                    rENode.greedy = true;
                } else {
                    compilerState.cp = i28 + 2;
                    rENode.greedy = false;
                }
                return true;
            }
            RENode rENode12 = new RENode(REOP_QUANT);
            compilerState.result = rENode12;
            rENode12.min = 1;
            rENode12.max = -1;
            compilerState.progLength += 8;
        }
        z2 = true;
        if (!z2) {
            return true;
        }
        int i29 = compilerState.cp;
        i = i29 + 1;
        compilerState.cp = i;
        rENode = compilerState.result;
        rENode.kid = rENode8;
        rENode.parenIndex = i6;
        rENode.parenCount = compilerState.parenCount - i6;
        if (i < compilerState.cpend) {
            rENode.greedy = true;
        } else {
            rENode.greedy = true;
        }
        return true;
    }

    private static REProgState popProgState(REGlobalData rEGlobalData) {
        REProgState rEProgState = rEGlobalData.stateStackTop;
        rEGlobalData.stateStackTop = rEProgState.previous;
        return rEProgState;
    }

    private static void processCharSet(REGlobalData rEGlobalData, RECharSet rECharSet) {
        synchronized (rECharSet) {
            try {
                if (!rECharSet.converted) {
                    processCharSetImpl(rEGlobalData, rECharSet);
                    rECharSet.converted = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0056. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0059. Please report as an issue. */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:40:0x0081
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private static void processCharSetImpl(org.mozilla.javascript.regexp.REGlobalData r17, org.mozilla.javascript.regexp.RECharSet r18) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.regexp.NativeRegExp.processCharSetImpl(org.mozilla.javascript.regexp.REGlobalData, org.mozilla.javascript.regexp.RECharSet):void");
    }

    private static void pushBackTrackState(REGlobalData rEGlobalData, byte b, int i) {
        REProgState rEProgState = rEGlobalData.stateStackTop;
        rEGlobalData.backTrackStackTop = new REBackTrackData(rEGlobalData, b, i, rEGlobalData.cp, rEProgState.continuationOp, rEProgState.continuationPc);
    }

    private static void pushProgState(REGlobalData rEGlobalData, int i, int i2, int i3, REBackTrackData rEBackTrackData, int i4, int i5) {
        rEGlobalData.stateStackTop = new REProgState(rEGlobalData.stateStackTop, i, i2, i3, rEBackTrackData, i4, i5);
    }

    private static NativeRegExp realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        return realThis(scriptable, idFunctionObject.getFunctionName());
    }

    private static boolean reopIsSimple(int i) {
        return i >= 1 && i <= 23;
    }

    private static void reportError(String str, String str2) {
        throw ScriptRuntime.constructError("SyntaxError", ScriptRuntime.getMessageById(str, str2));
    }

    private static void reportWarning(Context context, String str, String str2) {
        if (context.hasFeature(11)) {
            Context.reportWarning(ScriptRuntime.getMessageById(str, str2));
        }
    }

    private static void resolveForwardJump(byte[] bArr, int i, int i2) {
        if (i > i2) {
            throw Kit.codeBug();
        }
        addIndex(bArr, i, i2 - i);
    }

    private void setLastIndex(Object obj) {
        if ((this.lastIndexAttr & 1) != 0) {
            throw ScriptRuntime.typeErrorById("msg.modify.readonly", "lastIndex");
        }
        this.lastIndex = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x01ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:11:0x002d A[PHI: r7
  0x002d: PHI (r7v9 int) = 
  (r7v0 int)
  (r7v0 int)
  (r7v0 int)
  (r7v0 int)
  (r7v0 int)
  (r7v0 int)
  (r7v0 int)
  (r7v0 int)
  (r7v0 int)
  (r7v0 int)
  (r7v0 int)
  (r7v0 int)
  (r7v0 int)
  (r7v0 int)
  (r7v0 int)
  (r7v0 int)
  (r7v0 int)
  (r7v0 int)
  (r7v5 int)
  (r7v7 int)
  (r7v7 int)
  (r7v8 int)
  (r7v8 int)
  (r7v10 int)
  (r7v10 int)
 binds: [B:105:0x01bc, B:107:0x01c8, B:99:0x01ab, B:101:0x01b5, B:67:0x0147, B:71:0x0159, B:63:0x0134, B:65:0x013e, B:59:0x0121, B:61:0x012b, B:55:0x010e, B:57:0x0118, B:51:0x00fb, B:53:0x0105, B:47:0x00e8, B:49:0x00f2, B:43:0x00d5, B:45:0x00df, B:34:0x008e, B:20:0x005b, B:22:0x0061, B:13:0x0039, B:17:0x0049, B:7:0x0014, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0183 A[PHI: r5
  0x0183: PHI (r5v10 boolean) = (r5v5 boolean), (r5v13 boolean), (r5v13 boolean) binds: [B:95:0x01a4, B:80:0x0176, B:82:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    private static int simpleMatch(REGlobalData rEGlobalData, String str, int i, byte[] bArr, int i2, int i3, boolean z) {
        boolean z2;
        int i4;
        char cCharAt;
        int i5 = rEGlobalData.cp;
        boolean zBackrefMatcher = true;
        switch (i) {
            case 1:
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
            case 2:
                if (i5 != 0 && (!rEGlobalData.multiline || !isLineTerm(str.charAt(i5 - 1)))) {
                    zBackrefMatcher = false;
                }
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
            case 3:
                if (i5 != i3 && (!rEGlobalData.multiline || !isLineTerm(str.charAt(i5)))) {
                    zBackrefMatcher = false;
                }
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
            case 4:
                z2 = i5 == 0 || !isWord(str.charAt(i5 + (-1)));
                int i6 = rEGlobalData.cp;
                if (i6 < i3 && isWord(str.charAt(i6))) {
                    zBackrefMatcher = false;
                }
                zBackrefMatcher ^= z2;
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
            case 5:
                z2 = i5 == 0 || !isWord(str.charAt(i5 + (-1)));
                int i7 = rEGlobalData.cp;
                if (i7 >= i3 || !isWord(str.charAt(i7))) {
                    zBackrefMatcher = false;
                }
                zBackrefMatcher ^= z2;
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
            case 6:
                if (i5 == i3 || ((rEGlobalData.regexp.flags & 8) == 0 && isLineTerm(str.charAt(i5)))) {
                    zBackrefMatcher = false;
                } else {
                    rEGlobalData.cp++;
                }
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
            case 7:
                if (i5 == i3 || !isDigit(str.charAt(i5))) {
                    zBackrefMatcher = false;
                } else {
                    rEGlobalData.cp++;
                }
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
            case 8:
                if (i5 == i3 || isDigit(str.charAt(i5))) {
                    zBackrefMatcher = false;
                } else {
                    rEGlobalData.cp++;
                }
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
            case 9:
                if (i5 == i3 || !isWord(str.charAt(i5))) {
                    zBackrefMatcher = false;
                } else {
                    rEGlobalData.cp++;
                }
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
            case 10:
                if (i5 == i3 || isWord(str.charAt(i5))) {
                    zBackrefMatcher = false;
                } else {
                    rEGlobalData.cp++;
                }
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
            case 11:
                if (i5 == i3 || !isREWhiteSpace(str.charAt(i5))) {
                    zBackrefMatcher = false;
                } else {
                    rEGlobalData.cp++;
                }
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
            case 12:
                if (i5 == i3 || isREWhiteSpace(str.charAt(i5))) {
                    zBackrefMatcher = false;
                } else {
                    rEGlobalData.cp++;
                }
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
            case 13:
                int index = getIndex(bArr, i2);
                i2 += 2;
                zBackrefMatcher = backrefMatcher(rEGlobalData, index, str, i3);
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
            case 14:
                int index2 = getIndex(bArr, i2);
                int index3 = getIndex(bArr, i2 + 2);
                i2 += 4;
                zBackrefMatcher = flatNMatcher(rEGlobalData, index2, index3, str, i3);
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
            case 15:
                i4 = i2 + 1;
                char c = (char) (bArr[i2] & 255);
                if (i5 != i3 && str.charAt(i5) == c) {
                    rEGlobalData.cp++;
                    i2 = i4;
                    if (zBackrefMatcher) {
                        rEGlobalData.cp = i5;
                        return -1;
                    }
                    if (!z) {
                        rEGlobalData.cp = i5;
                    }
                    return i2;
                }
                i2 = i4;
                zBackrefMatcher = false;
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
            case 16:
                int index4 = getIndex(bArr, i2);
                int index5 = getIndex(bArr, i2 + 2);
                i2 += 4;
                zBackrefMatcher = flatNIMatcher(rEGlobalData, index4, index5, str, i3);
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
            case 17:
                i4 = i2 + 1;
                char c2 = (char) (bArr[i2] & 255);
                if (i5 != i3) {
                    char cCharAt2 = str.charAt(i5);
                    if (c2 == cCharAt2 || upcase(c2) == upcase(cCharAt2)) {
                        rEGlobalData.cp++;
                    } else {
                        zBackrefMatcher = false;
                    }
                    i2 = i4;
                    if (zBackrefMatcher) {
                        rEGlobalData.cp = i5;
                        return -1;
                    }
                    if (!z) {
                        rEGlobalData.cp = i5;
                    }
                    return i2;
                }
                i2 = i4;
                zBackrefMatcher = false;
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
            case 18:
                char index6 = (char) getIndex(bArr, i2);
                i2 += 2;
                int i8 = rEGlobalData.cp;
                if (i8 == i3 || str.charAt(i8) != index6) {
                    zBackrefMatcher = false;
                } else {
                    rEGlobalData.cp++;
                }
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
            case 19:
                char index7 = (char) getIndex(bArr, i2);
                i2 += 2;
                int i9 = rEGlobalData.cp;
                if (i9 == i3 || !(index7 == (cCharAt = str.charAt(i9)) || upcase(index7) == upcase(cCharAt))) {
                    zBackrefMatcher = false;
                } else {
                    rEGlobalData.cp++;
                }
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
            case 20:
            case 21:
            default:
                throw Kit.codeBug();
            case 22:
            case 23:
                int index8 = getIndex(bArr, i2);
                i2 += 2;
                int i10 = rEGlobalData.cp;
                if (i10 == i3 || !classMatcher(rEGlobalData, rEGlobalData.regexp.classList[index8], str.charAt(i10))) {
                    zBackrefMatcher = false;
                } else {
                    rEGlobalData.cp++;
                }
                if (zBackrefMatcher) {
                    rEGlobalData.cp = i5;
                    return -1;
                }
                if (!z) {
                    rEGlobalData.cp = i5;
                }
                return i2;
        }
    }

    private static int toASCIIHexDigit(int i) {
        if (i < 48) {
            return -1;
        }
        if (i <= 57) {
            return i - 48;
        }
        int i2 = i | 32;
        if (97 > i2 || i2 > 102) {
            return -1;
        }
        return i2 - 87;
    }

    private static char upcase(char c) {
        if (c >= 128) {
            char upperCase = Character.toUpperCase(c);
            if (upperCase >= 128) {
                return upperCase;
            }
        } else if ('a' <= c && c <= 'z') {
            return (char) (c - ' ');
        }
        return c;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    public Scriptable compile(Context context, Scriptable scriptable, Object[] objArr) {
        String str;
        String string;
        Object obj;
        Object obj2;
        if (objArr.length >= 1) {
            Object obj3 = objArr[0];
            if ((obj3 instanceof NativeRegExp) && (objArr.length == 1 || objArr[1] == Undefined.instance)) {
                this.re = ((NativeRegExp) obj3).re;
            } else {
                if (objArr.length != 0 || (obj2 = objArr[0]) == Undefined.instance) {
                    str = "";
                } else {
                    str = obj2 instanceof NativeRegExp ? new String(((NativeRegExp) obj2).re.source) : escapeRegExp(obj2);
                }
                if (objArr.length > 1 || (obj = objArr[1]) == Undefined.instance) {
                    string = null;
                } else {
                    string = ScriptRuntime.toString(obj);
                }
                if (objArr.length <= 0 && (objArr[0] instanceof NativeRegExp) && string != null && context.getLanguageVersion() < 200) {
                    throw ScriptRuntime.typeErrorById("msg.bad.regexp.compile", new Object[0]);
                }
                this.re = compileRE(context, str, string, false);
            }
        } else {
            if (objArr.length != 0) {
                str = "";
            } else {
                str = "";
            }
            if (objArr.length > 1) {
                string = null;
            } else {
                string = null;
            }
            if (objArr.length <= 0) {
            }
            this.re = compileRE(context, str, string, false);
        }
        setLastIndex(ScriptRuntime.zeroObj);
        return this;
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(REGEXP_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int iMethodId = idFunctionObject.methodId();
        switch (iMethodId) {
            case 1:
                return realThis(scriptable2, idFunctionObject).compile(context, scriptable, objArr);
            case 2:
                if (scriptable2 == scriptable || !(scriptable2 instanceof NativeObject)) {
                    return realThis(scriptable2, idFunctionObject).toString();
                }
                Object obj = scriptable2.get("source", scriptable2);
                Object obj2 = Scriptable.NOT_FOUND;
                String strEscapeRegExp = obj.equals(obj2) ? "undefined" : escapeRegExp(obj);
                Object obj3 = scriptable2.get("flags", scriptable2);
                return f.e("/", strEscapeRegExp, "/", obj3.equals(obj2) ? "undefined" : obj3.toString());
            case 3:
                return realThis(scriptable2, idFunctionObject).toString();
            case 4:
                return js_exec(context, scriptable, scriptable2, objArr);
            case 5:
                Object objExecSub = realThis(scriptable2, idFunctionObject).execSub(context, scriptable, objArr, 0);
                Boolean bool = Boolean.TRUE;
                return bool.equals(objExecSub) ? bool : Boolean.FALSE;
            case 6:
                return realThis(scriptable2, idFunctionObject).execSub(context, scriptable, objArr, 2);
            case 7:
                return realThis(scriptable2, idFunctionObject).execSub(context, scriptable, objArr, 1);
            case 8:
                return js_SymbolMatchAll(context, scriptable, scriptable2, objArr);
            case 9:
                Scriptable scriptable3 = (Scriptable) realThis(scriptable2, idFunctionObject).execSub(context, scriptable, objArr, 1);
                if (scriptable3 == null) {
                    return -1;
                }
                return scriptable3.get("index", scriptable3);
            default:
                c.o(String.valueOf(iMethodId));
                return null;
        }
    }

    public Object execSub(Context context, Scriptable scriptable, Object[] objArr, int i) {
        String string;
        RegExpImpl impl = getImpl(context);
        if (objArr.length == 0) {
            string = impl.input;
            if (string == null) {
                string = ScriptRuntime.toString(Undefined.instance);
            }
        } else {
            string = ScriptRuntime.toString(objArr[0]);
        }
        String str = string;
        int i2 = this.re.flags;
        boolean z = ((i2 & 1) == 0 && (i2 & 16) == 0) ? false : true;
        double d = 0.0d;
        if (z) {
            double integer = ScriptRuntime.toInteger(this.lastIndex);
            if (integer < 0.0d || str.length() < integer) {
                setLastIndex(ScriptRuntime.zeroObj);
                return null;
            }
            d = integer;
        }
        int[] iArr = {(int) d};
        Object objExecuteRegExp = executeRegExp(context, scriptable, impl, str, iArr, i);
        if (z) {
            if (objExecuteRegExp != null && objExecuteRegExp != Undefined.instance) {
                setLastIndex(Double.valueOf(iArr[0]));
                return objExecuteRegExp;
            }
            setLastIndex(ScriptRuntime.zeroObj);
        }
        return objExecuteRegExp;
    }

    public Object executeRegExp(Context context, Scriptable scriptable, RegExpImpl regExpImpl, String str, int[] iArr, int i) {
        Context context2;
        Scriptable scriptable2;
        Object obj;
        NativeRegExp nativeRegExp = this;
        REGlobalData rEGlobalData = new REGlobalData();
        int i2 = iArr[0];
        int length = str.length();
        int i3 = i2 > length ? length : i2;
        SubString subString = null;
        if (!matchRegExp(context, rEGlobalData, nativeRegExp.re, str, i3, length, regExpImpl.multiline)) {
            if (i != 2) {
                return null;
            }
            return Undefined.instance;
        }
        int i4 = rEGlobalData.cp;
        iArr[0] = i4;
        int i5 = i4 - (rEGlobalData.skipped + i3);
        int i6 = i4 - i5;
        if (i == 0) {
            scriptable2 = null;
            obj = Boolean.TRUE;
            context2 = context;
        } else {
            context2 = context;
            Scriptable scriptableNewArray = context2.newArray(scriptable, 0);
            scriptableNewArray.put(0, scriptableNewArray, str.substring(i6, i6 + i5));
            scriptable2 = scriptableNewArray;
            obj = scriptableNewArray;
        }
        int i7 = nativeRegExp.re.parenCount;
        if (i7 == 0) {
            regExpImpl.parens = null;
            regExpImpl.lastParen = new SubString();
        } else {
            regExpImpl.parens = new SubString[i7];
            int i8 = 0;
            while (i8 < nativeRegExp.re.parenCount) {
                int iParensIndex = rEGlobalData.parensIndex(i8);
                if (iParensIndex != -1) {
                    subString = new SubString(str, iParensIndex, rEGlobalData.parensLength(i8));
                    regExpImpl.parens[i8] = subString;
                    if (i != 0) {
                        scriptable2.put(i8 + 1, scriptable2, subString.toString());
                    }
                } else if (i != 0) {
                    scriptable2.put(i8 + 1, scriptable2, Undefined.instance);
                }
                i8++;
                nativeRegExp = this;
            }
            regExpImpl.lastParen = subString;
        }
        if (i != 0) {
            scriptable2.put("index", scriptable2, Integer.valueOf(rEGlobalData.skipped + i3));
            scriptable2.put("input", scriptable2, str);
        }
        if (regExpImpl.lastMatch == null) {
            regExpImpl.lastMatch = new SubString();
            regExpImpl.leftContext = new SubString();
            regExpImpl.rightContext = new SubString();
        }
        SubString subString2 = regExpImpl.lastMatch;
        subString2.str = str;
        subString2.index = i6;
        subString2.length = i5;
        regExpImpl.leftContext.str = str;
        int languageVersion = context2.getLanguageVersion();
        SubString subString3 = regExpImpl.leftContext;
        if (languageVersion == 120) {
            subString3.index = i3;
            subString3.length = rEGlobalData.skipped;
        } else {
            subString3.index = 0;
            subString3.length = i3 + rEGlobalData.skipped;
        }
        SubString subString4 = regExpImpl.rightContext;
        subString4.str = str;
        subString4.index = i4;
        subString4.length = length - i4;
        return obj;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findInstanceIdInfo(String str) {
        str.getClass();
        int i = 6;
        int i2 = 7;
        switch (str) {
            case "dotAll":
                i = 7;
                break;
            case "global":
                i = 4;
                break;
            case "multiline":
                break;
            case "source":
                i = 2;
                break;
            case "sticky":
                i = 8;
                break;
            case "flags":
                i = 3;
                break;
            case "ignoreCase":
                i = 5;
                break;
            case "lastIndex":
                i = 1;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return super.findInstanceIdInfo(str);
        }
        switch (i) {
            case 1:
                i2 = this.lastIndexAttr;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                org.mozilla.javascript.c.a();
                return 0;
        }
        return IdScriptableObject.instanceIdInfo(i2, i);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        str.getClass();
        switch (str) {
            case "toSource":
                return 3;
            case "toString":
                return 2;
            case "prefix":
                return 6;
            case "exec":
                return 4;
            case "test":
                return 5;
            case "compile":
                return 1;
            default:
                return 0;
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "RegExp";
    }

    public int getFlags() {
        return this.re.flags;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public String getInstanceIdName(int i) {
        switch (i) {
            case 1:
                return "lastIndex";
            case 2:
                return "source";
            case 3:
                return "flags";
            case 4:
                return "global";
            case 5:
                return "ignoreCase";
            case 6:
                return "multiline";
            case 7:
                return "dotAll";
            case 8:
                return "sticky";
            default:
                return super.getInstanceIdName(i);
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public Object getInstanceIdValue(int i) {
        switch (i) {
            case 1:
                return this.lastIndex;
            case 2:
                return new String(this.re.source);
            case 3:
                StringBuilder sb = new StringBuilder();
                appendFlags(sb);
                return sb.toString();
            case 4:
                return ScriptRuntime.wrapBoolean((this.re.flags & 1) != 0);
            case 5:
                return ScriptRuntime.wrapBoolean((this.re.flags & 2) != 0);
            case 6:
                return ScriptRuntime.wrapBoolean((this.re.flags & 4) != 0);
            case 7:
                return ScriptRuntime.wrapBoolean((this.re.flags & 8) != 0);
            case 8:
                return ScriptRuntime.wrapBoolean((this.re.flags & 16) != 0);
            default:
                return super.getInstanceIdValue(i);
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int getMaxInstanceId() {
        return 8;
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public String getTypeOf() {
        return "object";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        String str;
        String str2;
        if (i == 7) {
            initPrototypeMethod(REGEXP_TAG, i, SymbolKey.MATCH, "[Symbol.match]", 1);
        }
        if (i == 8) {
            initPrototypeMethod(REGEXP_TAG, i, SymbolKey.MATCH_ALL, "[Symbol.matchAll]", 1);
            return;
        }
        if (i == 9) {
            initPrototypeMethod(REGEXP_TAG, i, SymbolKey.SEARCH, "[Symbol.search]", 1);
            return;
        }
        int i2 = 0;
        int i3 = 1;
        switch (i) {
            case 1:
                i2 = 2;
                str = "compile";
                String str3 = str;
                i3 = i2;
                str2 = str3;
                initPrototypeMethod(REGEXP_TAG, i, str2, i3);
                break;
            case 2:
                str = "toString";
                String str4 = str;
                i3 = i2;
                str2 = str4;
                initPrototypeMethod(REGEXP_TAG, i, str2, i3);
                break;
            case 3:
                str = "toSource";
                String str5 = str;
                i3 = i2;
                str2 = str5;
                initPrototypeMethod(REGEXP_TAG, i, str2, i3);
                break;
            case 4:
                str2 = "exec";
                initPrototypeMethod(REGEXP_TAG, i, str2, i3);
                break;
            case 5:
                str2 = "test";
                initPrototypeMethod(REGEXP_TAG, i, str2, i3);
                break;
            case 6:
                str2 = "prefix";
                initPrototypeMethod(REGEXP_TAG, i, str2, i3);
                break;
            default:
                c.o(String.valueOf(i));
                break;
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void setInstanceIdAttributes(int i, int i2) {
        if (i == 1) {
            this.lastIndexAttr = i2;
        } else {
            super.setInstanceIdAttributes(i, i2);
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void setInstanceIdValue(int i, Object obj) {
        switch (i) {
            case 1:
                setLastIndex(obj);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                super.setInstanceIdValue(i, obj);
                break;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('/');
        char[] cArr = this.re.source;
        if (cArr.length != 0) {
            sb.append(cArr);
        } else {
            sb.append("(?:)");
        }
        sb.append('/');
        appendFlags(sb);
        return sb.toString();
    }

    private static NativeRegExp realThis(Scriptable scriptable, String str) {
        return (NativeRegExp) IdScriptableObject.ensureType(scriptable, NativeRegExp.class, str);
    }

    private static void pushBackTrackState(REGlobalData rEGlobalData, byte b, int i, int i2, int i3, int i4) {
        rEGlobalData.backTrackStackTop = new REBackTrackData(rEGlobalData, b, i, i2, i3, i4);
    }

    public NativeRegExp() {
        this.lastIndex = ScriptRuntime.zeroObj;
        this.lastIndexAttr = 6;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(Symbol symbol) {
        if (SymbolKey.MATCH.equals(symbol)) {
            return 7;
        }
        if (SymbolKey.MATCH_ALL.equals(symbol)) {
            return 8;
        }
        return SymbolKey.SEARCH.equals(symbol) ? 9 : 0;
    }
}
