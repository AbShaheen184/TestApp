package org.schabi.newpipe.extractor.utils;

import j$.net.URLDecoder;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;
import org.schabi.newpipe.extractor.services.youtube.extractors.x;
import org.schabi.newpipe.extractor.services.youtube.extractors.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final Pattern a = Pattern.compile("(https?)?://m\\.");
    public static final Pattern b = Pattern.compile("(https?)?://www\\.");

    public static void a(Pattern pattern, String str) throws org.schabi.newpipe.extractor.exceptions.f {
        if (h(str)) {
            net.luminis.tls.engine.impl.c.o("Url can't be null or empty");
        } else {
            if (pattern.matcher(str.toLowerCase()).find()) {
                return;
            }
            org.mozilla.javascript.typedarrays.c.b("Url doesn't match the pattern");
        }
    }

    public static String b(String str) {
        try {
            URL urlM = m(str);
            return (urlM.getHost().contains("google") && urlM.getPath().equals("/url")) ? URLDecoder.decode(a.i("&url=([^&]+)(?:&|$)", 1, str), StandardCharsets.UTF_8) : str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static String c(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            URL urlM = m(str);
            return urlM.getProtocol() + "://" + urlM.getAuthority();
        } catch (MalformedURLException e) {
            String message = e.getMessage();
            if (message.startsWith("unknown protocol: ")) {
                return message.substring(18);
            }
            throw new org.schabi.newpipe.extractor.exceptions.f(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Malformed url: ", str), e);
        }
    }

    public static String d(URL url, String str) {
        String query = url.getQuery();
        if (query == null) {
            return null;
        }
        for (String str2 : query.split("&")) {
            String[] strArrSplit = str2.split("=", 2);
            String str3 = strArrSplit[0];
            Charset charset = StandardCharsets.UTF_8;
            if (URLDecoder.decode(str3, charset).equals(str)) {
                return URLDecoder.decode(strArrSplit[1], charset);
            }
        }
        return null;
    }

    public static String e(String str, String[] strArr) throws d {
        for (Pattern pattern : (Pattern[]) Arrays.stream(strArr).filter(new x(11)).map(new z(17)).toArray(new e())) {
            try {
                String strJ = a.j(pattern, str, 1);
                if (strJ != null) {
                    return strJ;
                }
            } catch (d unused) {
            }
        }
        throw new d("No regex matched the input on group 1");
    }

    public static boolean f(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return true;
    }

    public static boolean g(URL url) {
        String protocol = url.getProtocol();
        if (protocol.equals("http") || protocol.equals("https")) {
            boolean z = url.getPort() == url.getDefaultPort();
            if (url.getPort() == -1 || z) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean i(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean j(Map map) {
        return map == null || map.isEmpty();
    }

    public static long k(String str) {
        String strI;
        double d;
        try {
            strI = a.i("[\\d]+([\\.,][\\d]+)?([KMBkmb])+", 2, str);
        } catch (org.schabi.newpipe.extractor.exceptions.f unused) {
            strI = "";
        }
        double d2 = Double.parseDouble(a.i("([\\d]+([\\.,][\\d]+)?)", 1, str).replace(",", "."));
        String upperCase = strI.toUpperCase();
        upperCase.getClass();
        switch (upperCase) {
            case "B":
                d = 1.0E9d;
                break;
            case "K":
                d = 1000.0d;
                break;
            case "M":
                d = 1000000.0d;
                break;
            default:
                return (long) d2;
        }
        return (long) (d2 * d);
    }

    public static String l(String str) {
        if (str == null) {
            return null;
        }
        return str.startsWith("http://") ? "https://".concat(str.substring(7)) : str;
    }

    public static URL m(String str) throws MalformedURLException {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            if (e.getMessage().equals("no protocol: " + str)) {
                return new URL(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://", str));
            }
            throw e;
        }
    }
}
