package org.schabi.newpipe.extractor.utils;

import androidx.appcompat.widget.x;
import androidx.constraintlayout.core.g;
import com.google.android.gms.measurement.internal.e0;
import com.google.android.material.shape.k;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.jsoup.helper.n;
import org.jsoup.select.h;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final e0 a;
    public static volatile e0 b;

    static {
        e0 e0Var = new e0(19);
        a = e0Var;
        b = e0Var;
    }

    public static void a(String str) {
        Context contextEnter = Context.enter();
        try {
            contextEnter.setInterpretedMode(true);
            contextEnter.compileString(str, null, 1, null);
            contextEnter.close();
        } catch (Throwable th) {
            if (contextEnter != null) {
                try {
                    contextEnter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void b(String str, Object... objArr) {
        int i;
        int i2;
        e0 e0Var = b;
        e0 e0Var2 = a;
        if (e0Var == e0Var2) {
            return;
        }
        if (objArr.length != 0) {
            StringBuilder sb = new StringBuilder(Math.min(32, objArr.length * 16) + str.length());
            int length = str.length();
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                char cCharAt = str.charAt(i3);
                if ((cCharAt == '{' && (i2 = i3 + 1) < length && str.charAt(i2) == '{') || (cCharAt == '}' && (i = i3 + 1) < length && str.charAt(i) == '}')) {
                    i3 += 2;
                } else if (cCharAt == '{') {
                    int iIndexOf = str.indexOf(Token.IF, i3 + 1);
                    if (iIndexOf < 0) {
                        sb.append((CharSequence) str, i3, length);
                        break;
                    }
                    if (i4 < objArr.length) {
                        Objects.toString(objArr[i4]);
                        i4++;
                    } else {
                        sb.append((CharSequence) str, i3, iIndexOf + 1);
                    }
                    i3 = iIndexOf + 1;
                } else {
                    i3++;
                }
            }
        }
        if (e0Var == e0Var2) {
            return;
        }
        g.e(1);
    }

    public static Optional c(String str) {
        if (str.contains("-")) {
            String[] strArrSplit = str.split("-", -1);
            if (strArrSplit.length > 2) {
                return Optional.of(new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]));
            }
            if (strArrSplit.length > 1) {
                return Optional.of(new Locale(strArrSplit[0], strArrSplit[1]));
            }
            if (strArrSplit.length == 1) {
                return Optional.of(new Locale(strArrSplit[0]));
            }
        } else {
            if (!str.contains("_")) {
                return Optional.of(new Locale(str));
            }
            String[] strArrSplit2 = str.split("_", -1);
            if (strArrSplit2.length > 2) {
                return Optional.of(new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]));
            }
            if (strArrSplit2.length > 1) {
                return Optional.of(new Locale(strArrSplit2[0], strArrSplit2[1]));
            }
            if (strArrSplit2.length == 1) {
                return Optional.of(new Locale(strArrSplit2[0]));
            }
        }
        return Optional.empty();
    }

    public static String d(int i, Random random) {
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(random.nextInt(64)));
        }
        return sb.toString();
    }

    public static Object e(com.grack.nanojson.c cVar, String str, Class cls) throws org.schabi.newpipe.extractor.exceptions.f {
        Object objH = h(cVar, str);
        if (cls.isInstance(objH)) {
            return cls.cast(objH);
        }
        throw new org.schabi.newpipe.extractor.exceptions.f("Wrong data type at path ".concat(str));
    }

    public static com.grack.nanojson.c f(String str, String str2) {
        org.jsoup.nodes.g gVarA = org.jsoup.parser.e0.a(str, "");
        gVarA.getClass();
        n.E(str2);
        return (com.grack.nanojson.c) x.p().k(k.E(new h(0, str2.trim(), false), gVarA).b(str2));
    }

    public static List g(com.grack.nanojson.b bVar) {
        return (List) bVar.stream().filter(new com.grack.nanojson.a(14)).map(new org.schabi.newpipe.extractor.services.youtube.b(16)).collect(Collectors.toList());
    }

    public static Object h(com.grack.nanojson.c cVar, String str) throws org.schabi.newpipe.extractor.exceptions.f {
        List listAsList = Arrays.asList(str.split("\\."));
        Iterator it = listAsList.subList(0, listAsList.size() - 1).iterator();
        while (it.hasNext()) {
            cVar = cVar.e((String) it.next());
        }
        if (cVar == null) {
            throw new org.schabi.newpipe.extractor.exceptions.f("Unable to get ".concat(str));
        }
        V v = cVar.get(listAsList.get(listAsList.size() - 1));
        if (v != 0) {
            return v;
        }
        throw new org.schabi.newpipe.extractor.exceptions.f("Unable to get ".concat(str));
    }

    public static String i(String str, int i, String str2) {
        return j(Pattern.compile(str), str2, i);
    }

    public static String j(Pattern pattern, String str, int i) throws d {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(i);
        }
        String strQ = androidx.privacysandbox.ads.adservices.java.internal.a.q("Failed to find pattern \"", pattern.pattern(), "\"");
        if (str.length() <= 1024) {
            strQ = strQ + " inside of \"" + str + "\"";
        }
        throw new d(strQ);
    }

    public static Matcher k(Pattern[] patternArr, String str) throws d {
        d dVar = null;
        for (Pattern pattern : patternArr) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher;
            }
            if (dVar == null) {
                dVar = new d(coil3.compose.internal.f.e("Failed to find pattern \"", pattern.pattern(), "\"", str.length() <= 1000 ? androidx.privacysandbox.ads.adservices.java.internal.a.q("inside of \"", str, "\"") : ""));
            }
        }
        if (dVar != null) {
            throw dVar;
        }
        throw new d("Empty patterns array passed to matchMultiplePatterns");
    }

    public static String l(String str, String str2, String... strArr) {
        Context contextEnter = Context.enter();
        try {
            contextEnter.setInterpretedMode(true);
            ScriptableObject scriptableObjectInitSafeStandardObjects = contextEnter.initSafeStandardObjects();
            contextEnter.evaluateString(scriptableObjectInitSafeStandardObjects, str, str2, 1, null);
            String string = ((Function) scriptableObjectInitSafeStandardObjects.get(str2, scriptableObjectInitSafeStandardObjects)).call(contextEnter, scriptableObjectInitSafeStandardObjects, scriptableObjectInitSafeStandardObjects, strArr).toString();
            contextEnter.close();
            return string;
        } catch (Throwable th) {
            if (contextEnter == null) {
                throw th;
            }
            try {
                contextEnter.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static com.grack.nanojson.c m(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            return (com.grack.nanojson.c) x.p().k(str);
        } catch (com.grack.nanojson.d e) {
            org.mozilla.javascript.typedarrays.c.d("Could not parse JSON", e);
            return null;
        }
    }
}
