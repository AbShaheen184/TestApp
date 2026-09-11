package org.schabi.newpipe.extractor.services.youtube;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final Pattern a = Pattern.compile("[&?]n=([^&]+)");
    public static final Pattern[] b = {Pattern.compile("([A-Za-z0-9_\\$]{2,})=function.*return [A-Z]\\[\\d+\\]"), Pattern.compile("[a-zA-Z0-9$_]=\"nn\"\\[\\+[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+],[a-zA-Z0-9$_]+\\([a-zA-Z0-9$_]+\\),[a-zA-Z0-9$_]+=[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+\\[[a-zA-Z0-9$_]+]\\|\\|null\\)&&\\([a-zA-Z0-9$_]+=([a-zA-Z0-9$_]+)\\[(\\d+)]"), Pattern.compile("[a-zA-Z0-9$_]=\"nn\"\\[\\+[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+],[a-zA-Z0-9$_]+\\([a-zA-Z0-9$_]+\\),[a-zA-Z0-9$_]+=[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+\\[[a-zA-Z0-9$_]+]\\|\\|null\\).+\\|\\|([a-zA-Z0-9$_]+)\\(\"\"\\)"), Pattern.compile(",[a-zA-Z0-9$_]+\\([a-zA-Z0-9$_]+\\),[a-zA-Z0-9$_]+=[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+\\[[a-zA-Z0-9$_]+]\\|\\|null\\)&&\\(\\b[a-zA-Z0-9$_]+=([a-zA-Z0-9$_]+)\\[(\\d+)]\\([a-zA-Z0-9$_]\\),[a-zA-Z0-9$_]+\\.set\\((?:\"n+\"|[a-zA-Z0-9$_]+),[a-zA-Z0-9$_]+\\)"), Pattern.compile("[a-zA-Z0-9$_]=\"nn\"\\[\\+[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+],[a-zA-Z0-9$_]+=[a-zA-Z0-9$_]+\\.get\\([a-zA-Z0-9$_]+\\)\\).+\\|\\|([a-zA-Z0-9$_]+)\\(\"\"\\)"), Pattern.compile("[a-zA-Z0-9$_]=\"nn\"\\[\\+[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+],[a-zA-Z0-9$_]+=[a-zA-Z0-9$_]+\\.get\\([a-zA-Z0-9$_]+\\)\\)&&\\([a-zA-Z0-9$_]+=([a-zA-Z0-9$_]+)\\[(\\d+)]"), Pattern.compile("\\([a-zA-Z0-9$_]=String\\.fromCharCode\\(110\\),[a-zA-Z0-9$_]=[a-zA-Z0-9$_]\\.get\\([a-zA-Z0-9$_]\\)\\)&&\\([a-zA-Z0-9$_]=([a-zA-Z0-9$_]+)(?:\\[(\\d+)])?\\([a-zA-Z0-9$_]\\)"), Pattern.compile("\\.get\\(\"n\"\\)\\)&&\\([a-zA-Z0-9$_]=([a-zA-Z0-9$_]+)(?:\\[(\\d+)])?\\([a-zA-Z0-9$_]\\)")};

    public static String a(String str, String str2) throws org.schabi.newpipe.extractor.utils.d {
        String str3;
        try {
            String str4 = str2 + "=function";
            str3 = str4 + com.google.android.material.motion.a.z(str, str4) + ";";
        } catch (Exception unused) {
            str3 = "function " + str2 + org.schabi.newpipe.extractor.utils.a.j(Pattern.compile(Pattern.quote(str2) + "=\\s*function([\\S\\s]*?\\}\\s*return [\\w$]+?\\.join\\(\"\"\\)\\s*\\};)", 32), str, 1);
            org.schabi.newpipe.extractor.utils.a.a(str3);
        }
        return Pattern.compile(";\\s*if\\s*\\(\\s*typeof\\s+[a-zA-Z0-9$_]++\\s*===?\\s*([\"'])undefined\\1\\s*\\)\\s*return\\s+" + org.schabi.newpipe.extractor.utils.a.i("=\\s*function\\s*\\(\\s*([^)]*)\\s*\\)", 1, str3).split(",")[0].trim() + ";", 32).matcher(str3).replaceFirst(";");
    }

    public static String b(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        try {
            Matcher matcherK = org.schabi.newpipe.extractor.utils.a.k(b, str);
            String strGroup = matcherK.group(1);
            if (matcherK.groupCount() == 1) {
                return strGroup;
            }
            return org.schabi.newpipe.extractor.utils.a.j(Pattern.compile("var " + Pattern.quote(strGroup) + "\\s*=\\s*\\[(.+?)][;,]"), str, 1).split(",")[Integer.parseInt(matcherK.group(2))];
        } catch (org.schabi.newpipe.extractor.utils.d e) {
            org.mozilla.javascript.typedarrays.c.d("Could not find deobfuscation function with any of the known patterns in the base JavaScript player code", e);
            return null;
        }
    }
}
