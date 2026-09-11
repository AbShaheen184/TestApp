package org.jsoup.helper;

import java.io.StringReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.nodes.w;
import org.jsoup.parser.e0;
import org.jsoup.parser.m3;
import org.jsoup.parser.n3;
import org.jsoup.select.p;
import org.jsoup.select.v;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final Pattern a = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
    public static final Charset b;
    public static final String c;
    public static final char[] d;
    public static final p e;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        b = charsetForName;
        c = charsetForName.name();
        d = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        e = v.Z("meta[http-equiv=content-type], meta[charset]");
    }

    /* JADX WARN: Code duplicated, block: B:79:0x016a  */
    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.c a(org.jsoup.internal.a aVar, String str, String str2, e0 e0Var) {
        String str3;
        w wVar;
        byte[] bArr = new byte[4];
        aVar.mark(4);
        org.jsoup.internal.d dVar = aVar.e;
        aVar.read(bArr, 0, 4);
        aVar.reset();
        byte b2 = bArr[0];
        org.jsoup.nodes.g gVar = null;
        if ((b2 == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) || (b2 == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0)) {
            str3 = "UTF-32";
        } else if ((b2 == -2 && bArr[1] == -1) || (b2 == -1 && bArr[1] == -2)) {
            str3 = "UTF-16";
        } else if (b2 == -17 && bArr[1] == -69 && bArr[2] == -65) {
            aVar.read(bArr, 0, 3);
            str3 = "UTF-8";
        } else {
            str3 = null;
        }
        if (str3 != null) {
            str = str3;
        }
        Charset charsetForName = b;
        String str4 = c;
        if (str == null) {
            int i = aVar.y;
            aVar.a(5120);
            dVar.g();
            aVar.mark(5120);
            aVar.E = false;
            try {
                try {
                    org.jsoup.internal.e eVar = new org.jsoup.internal.e(aVar, charsetForName);
                    try {
                        ReentrantLock reentrantLock = e0Var.B;
                        try {
                            reentrantLock.lock();
                            m3 m3Var = e0Var.e;
                            m3Var.i(eVar, str2, e0Var);
                            m3Var.p();
                            org.jsoup.nodes.g gVar2 = m3Var.d;
                            reentrantLock.unlock();
                            aVar.reset();
                            aVar.a(i);
                            eVar.close();
                            aVar.E = true;
                            gVar2.getClass();
                            p pVar = e;
                            n.H(pVar);
                            String strD = null;
                            for (org.jsoup.nodes.j jVar : com.google.android.material.shape.k.E(pVar, gVar2)) {
                                if (jVar.q("http-equiv")) {
                                    strD = b(jVar.d("content"));
                                }
                                if (strD == null && jVar.q("charset")) {
                                    strD = jVar.d("charset");
                                }
                                if (strD != null) {
                                    break;
                                }
                            }
                            if (strD == null && gVar2.B.size() > 0) {
                                org.jsoup.nodes.o oVarI = gVar2.i(0);
                                if (oVarI instanceof w) {
                                    wVar = (w) oVarI;
                                } else if (oVarI instanceof org.jsoup.nodes.d) {
                                    org.jsoup.nodes.d dVar2 = (org.jsoup.nodes.d) oVarI;
                                    String strJ = dVar2.J();
                                    if (strJ.length() <= 1 || !(strJ.startsWith("!") || strJ.startsWith("?"))) {
                                        wVar = null;
                                    } else {
                                        String str5 = "<" + dVar2.J() + ">";
                                        e0 e0Var2 = new e0(new n3());
                                        e0Var2.C = Integer.MAX_VALUE;
                                        StringReader stringReader = new StringReader(str5);
                                        ReentrantLock reentrantLock2 = e0Var2.B;
                                        try {
                                            reentrantLock2.lock();
                                            m3 m3Var2 = e0Var2.e;
                                            m3Var2.i(stringReader, "", e0Var2);
                                            m3Var2.j();
                                            m3Var2.p();
                                            List listA = m3Var2.a();
                                            reentrantLock2.unlock();
                                            if (listA.isEmpty() || !(listA.get(0) instanceof w)) {
                                                wVar = null;
                                            } else {
                                                wVar = (w) listA.get(0);
                                            }
                                        } catch (Throwable th) {
                                            reentrantLock2.unlock();
                                            throw th;
                                        }
                                    }
                                } else {
                                    wVar = null;
                                }
                                if (wVar != null && wVar.J().equalsIgnoreCase("xml")) {
                                    strD = wVar.d("encoding");
                                }
                            }
                            String strD2 = d(strD);
                            if (strD2 != null && !strD2.equalsIgnoreCase(str4)) {
                                str = strD2.trim().replaceAll("[\"']", "");
                            } else if (dVar.C) {
                                aVar.close();
                                gVar = gVar2;
                            }
                        } catch (Throwable th2) {
                            reentrantLock.unlock();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        try {
                            eVar.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (UncheckedIOException e2) {
                    throw e2.getCause();
                }
            } catch (Throwable th5) {
                aVar.E = true;
                throw th5;
            }
        } else {
            n.F(str, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
        }
        if (str == null) {
            str = str4;
        }
        if (!str.equals(str4)) {
            charsetForName = Charset.forName(str);
        }
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(23, false);
        cVar.y = charsetForName;
        cVar.z = aVar;
        cVar.A = gVar;
        return cVar;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = a.matcher(str);
        if (matcher.find()) {
            return d(matcher.group(1).trim().replace("charset=", ""));
        }
        return null;
    }

    public static org.jsoup.nodes.g c(com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar, String str, e0 e0Var) {
        org.jsoup.nodes.g gVar = (org.jsoup.nodes.g) cVar.A;
        if (gVar != null) {
            return gVar;
        }
        org.jsoup.internal.a aVar = (org.jsoup.internal.a) cVar.z;
        Charset charset = (Charset) cVar.y;
        org.jsoup.internal.e eVar = new org.jsoup.internal.e(aVar, charset);
        try {
            try {
                ReentrantLock reentrantLock = e0Var.B;
                try {
                    reentrantLock.lock();
                    m3 m3Var = e0Var.e;
                    m3Var.i(eVar, str, e0Var);
                    m3Var.p();
                    org.jsoup.nodes.g gVar2 = m3Var.d;
                    reentrantLock.unlock();
                    gVar2.G.y = charset;
                    if (!charset.canEncode()) {
                        gVar2.e0(b);
                    }
                    eVar.close();
                    return gVar2;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (UncheckedIOException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th2) {
            try {
                eVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static String d(String str) {
        if (str != null && str.length() != 0) {
            String strReplaceAll = str.trim().replaceAll("[\"']", "");
            try {
                if (Charset.isSupported(strReplaceAll)) {
                    return strReplaceAll;
                }
                String upperCase = strReplaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return null;
    }
}
