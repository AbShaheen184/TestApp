package org.schabi.newpipe.extractor.services.youtube;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final Pattern[] a = {Pattern.compile("\\b(?:[a-zA-Z0-9_$]+)&&\\((?:[a-zA-Z0-9_$]+)=([a-zA-Z0-9_$]{2,})\\((\\d+,)decodeURIComponent\\((?:[a-zA-Z0-9_$]+)\\)\\)"), Pattern.compile("\\b(?:[a-zA-Z0-9_$]+)&&\\((?:[a-zA-Z0-9_$]+)=([a-zA-Z0-9_$]{2,})\\(decodeURIComponent\\((?:[a-zA-Z0-9_$]+)\\)\\)"), Pattern.compile("\\bm=([a-zA-Z0-9$]{2,})\\(decodeURIComponent\\(h\\.s\\)\\)"), Pattern.compile("\\bc&&\\(c=([a-zA-Z0-9$]{2,})\\(decodeURIComponent\\(c\\)\\)"), Pattern.compile("(?:\\b|[^a-zA-Z0-9$])([a-zA-Z0-9$]{2,})\\s*=\\s*function\\(\\s*a\\s*\\)\\s*\\{\\s*a\\s*=\\s*a\\.split\\(\\s*\"\"\\s*\\)"), Pattern.compile("([\\w$]+)\\s*=\\s*function\\((\\w+)\\)\\{\\s*\\2=\\s*\\2\\.split\\(\"\"\\)\\s*;")};
    public static final Pattern b = Pattern.compile("(var [A-z]=['\"].*['\"].split\\(\"[;{]\"\\))");
    public static final Pattern c = Pattern.compile("[;,]([A-Za-z0-9_$]{2,})\\[..");

    public static String a(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        String string;
        try {
            try {
                Matcher matcherK = org.schabi.newpipe.extractor.utils.a.k(a, str);
                String strGroup = matcherK.group(1);
                String strGroup2 = matcherK.groupCount() > 1 ? matcherK.group(2) : "";
                try {
                    String str2 = strGroup + "=function";
                    string = str2.concat(com.google.android.material.motion.a.z(str, str2));
                } catch (Exception unused) {
                    String strI = org.schabi.newpipe.extractor.utils.a.i("(" + Pattern.quote(strGroup) + "=function\\([a-zA-Z0-9_]+\\)\\{.+?\\})", 1, str);
                    StringBuilder sb = new StringBuilder("var ");
                    sb.append(strI);
                    string = sb.toString();
                }
                org.schabi.newpipe.extractor.utils.a.a(string);
                return org.schabi.newpipe.extractor.utils.a.j(b, str, 1) + ";" + org.schabi.newpipe.extractor.utils.a.i("(var " + Pattern.quote(org.schabi.newpipe.extractor.utils.a.j(c, string, 1)) + "=\\{(?>.|\\n)+?\\}\\};)", 1, str).replace("\n", "") + string + ";" + ("function deobfuscate(a){return " + strGroup + "(" + strGroup2 + "a);}");
            } catch (org.schabi.newpipe.extractor.utils.d e) {
                throw new org.schabi.newpipe.extractor.exceptions.f("Could not find deobfuscation function with any of the known patterns", e);
            }
        } catch (Exception e2) {
            org.mozilla.javascript.typedarrays.c.d("Could not parse deobfuscation function", e2);
            return null;
        }
    }
}
