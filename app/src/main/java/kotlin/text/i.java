package kotlin.text;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Serializable {
    public final Pattern e;

    public i(String str, int i) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str, 66);
        patternCompile.getClass();
        this.e = patternCompile;
    }

    public static kotlin.io.h b(i iVar, String str) {
        iVar.getClass();
        str.getClass();
        if (str.length() >= 0) {
            return new kotlin.io.h(2, new com.app.mlounge.ui.screens.movies.g(14, iVar, str), h.e);
        }
        com.google.gson.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.v("Start index out of bounds: ", 0, ", input length: "), str.length());
        return null;
    }

    public final g a(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.e.matcher(charSequence);
        matcher.getClass();
        return com.google.android.material.shape.k.C(matcher, 0, charSequence);
    }

    public final g c(int i, String str) {
        str.getClass();
        Matcher matcherRegion = this.e.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new g(matcherRegion, str);
        }
        return null;
    }

    public final g d(String str) {
        str.getClass();
        Matcher matcher = this.e.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new g(matcher, str);
        }
        return null;
    }

    public final boolean e(CharSequence charSequence) {
        charSequence.getClass();
        return this.e.matcher(charSequence).matches();
    }

    public final String f(CharSequence charSequence, kotlin.jvm.functions.l lVar) {
        charSequence.getClass();
        g gVarA = a(charSequence);
        if (gVarA == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        do {
            sb.append(charSequence, i, gVarA.b().e);
            sb.append((CharSequence) lVar.invoke(gVarA));
            i = gVarA.b().y + 1;
            gVarA = gVarA.c();
            if (i >= length) {
                break;
            }
        } while (gVarA != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        return sb.toString();
    }

    public final String g(String str) {
        String strReplaceAll = this.e.matcher(str).replaceAll("");
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.e.toString();
        string.getClass();
        return string;
    }

    public i(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.e = patternCompile;
    }
}
