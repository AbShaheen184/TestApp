package j$.desugar.sun.nio.fs;

import j$.nio.file.Path;
import j$.nio.file.attribute.a0;
import j$.nio.file.e0;
import j$.nio.file.w;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends j$.nio.file.h {
    public final String a;
    public final String b;
    public final m c;

    @Override // j$.nio.file.h
    public final boolean g() {
        return false;
    }

    @Override // j$.nio.file.h
    public final boolean isOpen() {
        return true;
    }

    @Override // j$.nio.file.h
    public final j$.nio.file.spi.c i() {
        return this.c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.h
    public final String e() {
        return "/";
    }

    @Override // j$.nio.file.h
    public final Iterable d() {
        return g.o(new Object[]{new o(this, "/", this.a, this.b)});
    }

    @Override // j$.nio.file.h
    public final Iterable a() {
        throw new UnsupportedOperationException("");
    }

    @Override // j$.nio.file.h
    public final Set j() {
        return g.p(new Object[]{"basic"});
    }

    public i(m mVar, String str, String str2) {
        this.c = mVar;
        this.a = str;
        this.b = str2;
    }

    @Override // j$.nio.file.h
    public final Path b(String str, String[] strArr) {
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            for (String str2 : strArr) {
                if (!str2.isEmpty()) {
                    if (sb.length() > 0) {
                        sb.append('/');
                    }
                    sb.append(str2);
                }
            }
            str = sb.toString();
        }
        return new o(this, str, this.a, this.b);
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0102  */
    @Override // j$.nio.file.h
    public final w c(String str) {
        char c;
        int i;
        int iIndexOf = str.indexOf(58);
        if (iIndexOf <= 0 || iIndexOf == str.length()) {
            throw new IllegalArgumentException(String.format("Requested <syntax>:<pattern> spliterator(':') position(%d) is out of bound in %s", Integer.valueOf(iIndexOf), str));
        }
        char c2 = 0;
        String strSubstring = str.substring(0, iIndexOf);
        char c3 = 1;
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring.equalsIgnoreCase("glob")) {
            StringBuilder sb = new StringBuilder("^");
            int i2 = 0;
            char c4 = 0;
            while (i2 < strSubstring2.length()) {
                int i3 = i2 + 1;
                char cCharAt = strSubstring2.charAt(i2);
                if (cCharAt != '*') {
                    if (cCharAt == ',') {
                        c = c3;
                        if (c4 != 0) {
                            sb.append(")|(?:");
                        } else {
                            sb.append(',');
                        }
                    } else if (cCharAt == '/') {
                        c = c3;
                        sb.append(cCharAt);
                    } else if (cCharAt == '?') {
                        c = c3;
                        sb.append("[^/]");
                    } else if (cCharAt == '{') {
                        c = c3;
                        if (c4 != 0) {
                            throw new PatternSyntaxException("Cannot nest groups", strSubstring2, i2);
                        }
                        sb.append("(?:(?:");
                        i2 = i3;
                        c4 = c;
                    } else if (cCharAt == '}') {
                        c = c3;
                        if (c4 != 0) {
                            sb.append("))");
                            i2 = i3;
                            c4 = 0;
                        } else {
                            sb.append('}');
                        }
                    } else if (cCharAt == '[') {
                        sb.append("[[^/]&&[");
                        if (g.x(strSubstring2, i3) == '^') {
                            sb.append("\\^");
                            i2 += 2;
                        } else {
                            if (g.x(strSubstring2, i3) == '!') {
                                sb.append('^');
                                i3 = i2 + 2;
                            }
                            if (g.x(strSubstring2, i3) == '-') {
                                sb.append('-');
                                i2 = i3 + 1;
                            } else {
                                i2 = i3;
                            }
                        }
                        char c5 = c2;
                        char c6 = c5;
                        while (true) {
                            if (i2 >= strSubstring2.length()) {
                                c = c3;
                                break;
                            }
                            int i4 = i2 + 1;
                            char cCharAt2 = strSubstring2.charAt(i2);
                            if (cCharAt2 == ']') {
                                c = c3;
                                i2 = i4;
                                cCharAt = cCharAt2;
                                break;
                            }
                            if (cCharAt2 == '/') {
                                throw new PatternSyntaxException("Explicit 'name separator' in class", strSubstring2, i2);
                            }
                            if (cCharAt2 == '\\' || cCharAt2 == '[') {
                                c = c3;
                            } else {
                                c = c3;
                                if (cCharAt2 == '&' && g.x(strSubstring2, i4) == '&') {
                                }
                                sb.append(cCharAt2);
                                if (cCharAt2 != '-') {
                                    i2 = i4;
                                    cCharAt = cCharAt2;
                                    c6 = cCharAt;
                                    c3 = c;
                                    c5 = c3;
                                } else {
                                    if (c5 != 0) {
                                        throw new PatternSyntaxException("Invalid range", strSubstring2, i2);
                                    }
                                    i = i2 + 2;
                                    cCharAt = g.x(strSubstring2, i4);
                                    if (cCharAt != 0 || cCharAt == ']') {
                                        i2 = i;
                                        break;
                                    }
                                    if (cCharAt < c6) {
                                        throw new PatternSyntaxException("Invalid range", strSubstring2, i2 - 1);
                                    }
                                    sb.append(cCharAt);
                                    i2 = i;
                                    c3 = c;
                                    c5 = 0;
                                }
                            }
                            sb.append('\\');
                            sb.append(cCharAt2);
                            if (cCharAt2 != '-') {
                                if (c5 != 0) {
                                    throw new PatternSyntaxException("Invalid range", strSubstring2, i2);
                                }
                                i = i2 + 2;
                                cCharAt = g.x(strSubstring2, i4);
                                if (cCharAt != 0) {
                                }
                                i2 = i;
                                break;
                            }
                            i2 = i4;
                            cCharAt = cCharAt2;
                            c6 = cCharAt;
                            c3 = c;
                            c5 = c3;
                        }
                        if (cCharAt != ']') {
                            throw new PatternSyntaxException("Missing ']", strSubstring2, i2 - 1);
                        }
                        sb.append("]]");
                    } else if (cCharAt != '\\') {
                        if (".^$+{[]|()".indexOf(cCharAt) != -1) {
                            sb.append('\\');
                        }
                        sb.append(cCharAt);
                        c = c3;
                    } else {
                        if (i3 == strSubstring2.length()) {
                            throw new PatternSyntaxException("No character to escape", strSubstring2, i2);
                        }
                        i2 += 2;
                        char cCharAt3 = strSubstring2.charAt(i3);
                        if ("\\*?[{".indexOf(cCharAt3) != -1 || ".^$+{[]|()".indexOf(cCharAt3) != -1) {
                            sb.append('\\');
                        }
                        sb.append(cCharAt3);
                        c = c3;
                    }
                    i2 = i3;
                } else {
                    c = c3;
                    if (g.x(strSubstring2, i3) == '*') {
                        sb.append(".*");
                        i2 += 2;
                    } else {
                        sb.append("[^/]*");
                        i2 = i3;
                    }
                }
                c3 = c;
                c2 = 0;
            }
            if (c4 != 0) {
                throw new PatternSyntaxException("Missing '}", strSubstring2, i2 - 1);
            }
            sb.append('$');
            strSubstring2 = sb.toString();
        } else if (!strSubstring.equalsIgnoreCase("regex")) {
            j$.nio.file.k.e("Syntax '", strSubstring, "' not recognized");
            return null;
        }
        return new h(Pattern.compile(strSubstring2));
    }

    @Override // j$.nio.file.h
    public final a0 f() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.h
    public final e0 h() {
        throw new UnsupportedOperationException();
    }
}
