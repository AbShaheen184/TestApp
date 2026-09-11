package org.jsoup.nodes;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final char[] a = {',', ';'};
    public static final HashMap b = new HashMap();
    public static final ArrayList c = new ArrayList(Token.ASSIGN_RSH);
    public static final org.jsoup.internal.f d = new org.jsoup.internal.f(new org.jsoup.internal.c(3), 1);
    public static final ThreadLocal e = new ThreadLocal();

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public static void a(org.jsoup.internal.b bVar, k kVar, int i) {
        String str;
        int iBinarySearch = Arrays.binarySearch(kVar.z, i);
        if (iBinarySearch >= 0) {
            String[] strArr = kVar.A;
            if (iBinarySearch < strArr.length - 1) {
                int i2 = iBinarySearch + 1;
                if (kVar.z[i2] == i) {
                    str = strArr[i2];
                } else {
                    str = strArr[iBinarySearch];
                }
            } else {
                str = strArr[iBinarySearch];
            }
        } else {
            str = "";
        }
        if ("".equals(str)) {
            bVar.b("&#x").b(Integer.toHexString(i)).a(';');
        } else {
            bVar.a('&').b(str).a(';');
        }
    }

    public static boolean b(int i, char c2, CharsetEncoder charsetEncoder) {
        int iE = androidx.constraintlayout.core.g.e(i);
        if (iE != 0) {
            if (iE != 1) {
                return charsetEncoder.canEncode(c2);
            }
            if (c2 >= 55296 && c2 < 57344) {
                return false;
            }
        } else if (c2 >= 128) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0163  */
    /* JADX WARN: Code duplicated, block: B:108:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r8 r9 r10
  0x007a: PHI (r8v2 boolean) = (r8v1 boolean), (r8v4 boolean) binds: [B:19:0x0051, B:34:0x0078] A[DONT_GENERATE, DONT_INLINE]
  0x007a: PHI (r9v2 boolean) = (r9v1 boolean), (r9v4 boolean) binds: [B:19:0x0051, B:34:0x0078] A[DONT_GENERATE, DONT_INLINE]
  0x007a: PHI (r10v2 boolean) = (r10v1 boolean), (r10v4 boolean) binds: [B:19:0x0051, B:34:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0129  */
    /* JADX WARN: Code duplicated, block: B:95:0x012d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0133  */
    /* JADX WARN: Code duplicated, block: B:99:0x0145  */
    public static void c(String str, org.jsoup.internal.b bVar, k kVar, Charset charset, int i) {
        Charset charset2;
        int length;
        int iCharCount;
        boolean z;
        boolean z2;
        boolean z3;
        int iCodePointAt;
        k kVar2;
        char c2;
        char[] cArr;
        int chars;
        String strName = charset.name();
        int i2 = strName.equals("US-ASCII") ? 1 : strName.startsWith("UTF-") ? 2 : 3;
        ThreadLocal threadLocal = e;
        CharsetEncoder charsetEncoderNewEncoder = (CharsetEncoder) threadLocal.get();
        if (charsetEncoderNewEncoder != null) {
            charset2 = charset;
            if (!charsetEncoderNewEncoder.charset().equals(charset2)) {
            }
            length = str.length();
            iCharCount = 0;
            z = false;
            z2 = false;
            z3 = false;
            while (iCharCount < length) {
                iCodePointAt = str.codePointAt(iCharCount);
                if ((i & 4) == 0) {
                    kVar2 = k.xhtml;
                    if (kVar2 == kVar || iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 13 || ((iCodePointAt >= 32 && iCodePointAt <= 55295) || ((iCodePointAt >= 57344 && iCodePointAt <= 65533) || (iCodePointAt >= 65536 && iCodePointAt <= 1114111)))) {
                        c2 = (char) iCodePointAt;
                        if (iCodePointAt < 65536) {
                            if (c2 != '\t' || c2 == '\n' || c2 == '\r') {
                                bVar.a(c2);
                            } else if (c2 != '\"') {
                                if (c2 == '<') {
                                    bVar.b("&lt;");
                                } else if (c2 == '>') {
                                    bVar.b("&gt;");
                                } else if (c2 != 160) {
                                    if (c2 == '&') {
                                        bVar.b("&amp;");
                                    } else if (c2 != '\'') {
                                        if (c2 < ' ' || !b(i2, c2, charsetEncoderNewEncoder)) {
                                            a(bVar, kVar, iCodePointAt);
                                        } else {
                                            bVar.a(c2);
                                        }
                                    } else if ((i & 2) == 0 || (i & 1) == 0) {
                                        bVar.a('\'');
                                    } else if (kVar == kVar2) {
                                        bVar.b("&#x27;");
                                    } else {
                                        bVar.b("&apos;");
                                    }
                                } else if (kVar != kVar2) {
                                    bVar.b("&nbsp;");
                                } else {
                                    bVar.b("&#xa0;");
                                }
                            } else if ((i & 2) != 0) {
                                bVar.b("&quot;");
                            } else {
                                bVar.a(c2);
                            }
                        } else if (b(i2, c2, charsetEncoderNewEncoder)) {
                            cArr = (char[]) d.get();
                            chars = Character.toChars(iCodePointAt, cArr, 0);
                            switch (bVar.a) {
                                case 0:
                                    try {
                                        bVar.b.append(new String(cArr, 0, chars));
                                    } catch (IOException e2) {
                                        throw new androidx.compose.ui.res.e(e2, 18);
                                    }
                                    break;
                                default:
                                    ((StringBuilder) bVar.b).append(cArr, 0, chars);
                                    break;
                            }
                        } else {
                            a(bVar, kVar, iCodePointAt);
                        }
                    }
                } else if (org.jsoup.internal.k.i(iCodePointAt)) {
                    if (z) {
                        bVar.a(' ');
                        z = false;
                    }
                    z2 = true;
                    z3 = false;
                    kVar2 = k.xhtml;
                    if (kVar2 == kVar) {
                        c2 = (char) iCodePointAt;
                        if (iCodePointAt < 65536) {
                            if (c2 != '\t') {
                                bVar.a(c2);
                            } else {
                                bVar.a(c2);
                            }
                        } else if (b(i2, c2, charsetEncoderNewEncoder)) {
                            cArr = (char[]) d.get();
                            chars = Character.toChars(iCodePointAt, cArr, 0);
                            switch (bVar.a) {
                                case 0:
                                    bVar.b.append(new String(cArr, 0, chars));
                                    break;
                                default:
                                    ((StringBuilder) bVar.b).append(cArr, 0, chars);
                                    break;
                            }
                        } else {
                            a(bVar, kVar, iCodePointAt);
                        }
                    } else {
                        c2 = (char) iCodePointAt;
                        if (iCodePointAt < 65536) {
                            if (c2 != '\t') {
                                bVar.a(c2);
                            } else {
                                bVar.a(c2);
                            }
                        } else if (b(i2, c2, charsetEncoderNewEncoder)) {
                            cArr = (char[]) d.get();
                            chars = Character.toChars(iCodePointAt, cArr, 0);
                            switch (bVar.a) {
                                case 0:
                                    bVar.b.append(new String(cArr, 0, chars));
                                    break;
                                default:
                                    ((StringBuilder) bVar.b).append(cArr, 0, chars);
                                    break;
                            }
                        } else {
                            a(bVar, kVar, iCodePointAt);
                        }
                    }
                } else if (((i & 8) != 0 || z2) && !z3) {
                    if ((i & 16) != 0) {
                        z = true;
                    } else {
                        bVar.a(' ');
                        z3 = true;
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        charset2 = charset;
        charsetEncoderNewEncoder = charset2.newEncoder();
        threadLocal.set(charsetEncoderNewEncoder);
        length = str.length();
        iCharCount = 0;
        z = false;
        z2 = false;
        z3 = false;
        while (iCharCount < length) {
            iCodePointAt = str.codePointAt(iCharCount);
            if ((i & 4) == 0) {
                kVar2 = k.xhtml;
                if (kVar2 == kVar) {
                    c2 = (char) iCodePointAt;
                    if (iCodePointAt < 65536) {
                        if (c2 != '\t') {
                            bVar.a(c2);
                        } else {
                            bVar.a(c2);
                        }
                    } else if (b(i2, c2, charsetEncoderNewEncoder)) {
                        cArr = (char[]) d.get();
                        chars = Character.toChars(iCodePointAt, cArr, 0);
                        switch (bVar.a) {
                            case 0:
                                bVar.b.append(new String(cArr, 0, chars));
                                break;
                            default:
                                ((StringBuilder) bVar.b).append(cArr, 0, chars);
                                break;
                        }
                    } else {
                        a(bVar, kVar, iCodePointAt);
                    }
                } else {
                    c2 = (char) iCodePointAt;
                    if (iCodePointAt < 65536) {
                        if (c2 != '\t') {
                            bVar.a(c2);
                        } else {
                            bVar.a(c2);
                        }
                    } else if (b(i2, c2, charsetEncoderNewEncoder)) {
                        cArr = (char[]) d.get();
                        chars = Character.toChars(iCodePointAt, cArr, 0);
                        switch (bVar.a) {
                            case 0:
                                bVar.b.append(new String(cArr, 0, chars));
                                break;
                            default:
                                ((StringBuilder) bVar.b).append(cArr, 0, chars);
                                break;
                        }
                    } else {
                        a(bVar, kVar, iCodePointAt);
                    }
                }
            } else if (org.jsoup.internal.k.i(iCodePointAt)) {
                if (z) {
                    bVar.a(' ');
                    z = false;
                }
                z2 = true;
                z3 = false;
                kVar2 = k.xhtml;
                if (kVar2 == kVar) {
                    c2 = (char) iCodePointAt;
                    if (iCodePointAt < 65536) {
                        if (c2 != '\t') {
                            bVar.a(c2);
                        } else {
                            bVar.a(c2);
                        }
                    } else if (b(i2, c2, charsetEncoderNewEncoder)) {
                        cArr = (char[]) d.get();
                        chars = Character.toChars(iCodePointAt, cArr, 0);
                        switch (bVar.a) {
                            case 0:
                                bVar.b.append(new String(cArr, 0, chars));
                                break;
                            default:
                                ((StringBuilder) bVar.b).append(cArr, 0, chars);
                                break;
                        }
                    } else {
                        a(bVar, kVar, iCodePointAt);
                    }
                } else {
                    c2 = (char) iCodePointAt;
                    if (iCodePointAt < 65536) {
                        if (c2 != '\t') {
                            bVar.a(c2);
                        } else {
                            bVar.a(c2);
                        }
                    } else if (b(i2, c2, charsetEncoderNewEncoder)) {
                        cArr = (char[]) d.get();
                        chars = Character.toChars(iCodePointAt, cArr, 0);
                        switch (bVar.a) {
                            case 0:
                                bVar.b.append(new String(cArr, 0, chars));
                                break;
                            default:
                                ((StringBuilder) bVar.b).append(cArr, 0, chars);
                                break;
                        }
                    } else {
                        a(bVar, kVar, iCodePointAt);
                    }
                }
            } else if ((i & 8) != 0) {
                if ((i & 16) != 0) {
                    z = true;
                } else {
                    bVar.a(' ');
                    z3 = true;
                }
            } else if ((i & 16) != 0) {
                z = true;
            } else {
                bVar.a(' ');
                z3 = true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    public static String d(String str) {
        k kVar = k.base;
        Charset charset = org.jsoup.helper.b.b;
        if (str == null) {
            return "";
        }
        StringBuilder sbB = org.jsoup.internal.k.b();
        c(str, org.jsoup.internal.b.e(sbB), kVar, charset, 3);
        return org.jsoup.internal.k.l(sbB);
    }
}
