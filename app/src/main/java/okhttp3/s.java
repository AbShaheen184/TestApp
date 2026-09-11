package okhttp3;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List g;
    public final String h;
    public final String i;

    public s(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(kotlin.text.k.a0(str, ':', length, 4) + 1, kotlin.text.k.a0(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iA0 = kotlin.text.k.a0(str, '/', length, 4);
        return str.substring(iA0, okhttp3.internal.e.f(str, iA0, "?#", str.length()));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iA0 = kotlin.text.k.a0(str, '/', length, 4);
        int iF = okhttp3.internal.e.f(str, iA0, "?#", str.length());
        ArrayList arrayList = new ArrayList();
        while (iA0 < iF) {
            int i = iA0 + 1;
            int iE = okhttp3.internal.e.e(str, '/', i, iF);
            arrayList.add(str.substring(i, iE));
            iA0 = iE;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iA0 = kotlin.text.k.a0(str, '?', 0, 6) + 1;
        return str.substring(iA0, okhttp3.internal.e.e(str, '#', iA0, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(length, okhttp3.internal.e.f(str, length, ":@", str.length()));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s) && ((s) obj).i.equals(this.i);
    }

    public final boolean f() {
        return kotlin.jvm.internal.l.a(this.a, "https");
    }

    public final com.google.android.material.shape.a0 g() {
        int i;
        com.google.android.material.shape.a0 a0Var = new com.google.android.material.shape.a0(1);
        ArrayList arrayList = (ArrayList) a0Var.g;
        String str = this.a;
        a0Var.c = str;
        a0Var.d = e();
        a0Var.e = a();
        a0Var.f = this.d;
        str.getClass();
        if (str.equals("http")) {
            i = 80;
        } else {
            i = str.equals("https") ? 443 : -1;
        }
        int i2 = this.e;
        a0Var.b = i2 != i ? i2 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        a0Var.h = strD != null ? com.google.android.material.shape.a0.g(okhttp3.internal.url.a.a(strD, 0, 0, " \"'<>#", 83)) : null;
        if (this.h != null) {
            String str2 = this.i;
            strSubstring = str2.substring(kotlin.text.k.a0(str2, '#', 0, 6) + 1);
        }
        a0Var.i = strSubstring;
        return a0Var;
    }

    public final String h() {
        com.google.android.material.shape.a0 a0Var;
        try {
            a0Var = new com.google.android.material.shape.a0(1);
            a0Var.f(this, "/...");
        } catch (IllegalArgumentException unused) {
            a0Var = null;
        }
        a0Var.getClass();
        a0Var.d = okhttp3.internal.url.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", Token.EXPORT);
        a0Var.e = okhttp3.internal.url.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", Token.EXPORT);
        return a0Var.c().i;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final URI i() {
        String strReplaceAll;
        com.google.android.material.shape.a0 a0VarG = g();
        ArrayList arrayList = (ArrayList) a0VarG.g;
        String str = (String) a0VarG.f;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            patternCompile.getClass();
            strReplaceAll = patternCompile.matcher(str).replaceAll("");
            strReplaceAll.getClass();
        } else {
            strReplaceAll = null;
        }
        a0VarG.f = strReplaceAll;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, okhttp3.internal.url.a.a((String) arrayList.get(i), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = (ArrayList) a0VarG.h;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? okhttp3.internal.url.a.a(str2, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str3 = (String) a0VarG.i;
        a0VarG.i = str3 != null ? okhttp3.internal.url.a.a(str3, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String string = a0VarG.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                patternCompile2.getClass();
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                strReplaceAll2.getClass();
                URI uriCreate = URI.create(strReplaceAll2);
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                net.luminis.tls.engine.impl.c.k(e);
                return null;
            }
        }
    }

    public final String toString() {
        return this.i;
    }
}
